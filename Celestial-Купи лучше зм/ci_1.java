/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.zip.ZipFile;
import net.minecraft.ar.v;
import net.minecraft.client.D.D;
import net.minecraft.client.D.M;
import net.minecraft.client.D.a;
import net.minecraft.client.D.o;

public class ci {
    private static boolean a(String string) {
        return string.equals(string.toLowerCase(Locale.ROOT));
    }

    public static String[] a(String string, String string2) {
        return ci.a(new String[]{string}, new String[]{string2});
    }

    public static String[] a(a a10, String[] arrstring, String[] arrstring2, String[] arrstring3) {
        File file;
        a a11;
        a a12;
        String string;
        block16: {
            boolean bl2;
            block15: {
                string = K.d();
                bl2 = a10 instanceof o;
                if (string == null) {
                    if (bl2) {
                        return ci.a(a10, arrstring3);
                    }
                    bl2 = a10 instanceof D;
                }
                if (string != null) break block15;
                if (bl2) {
                    a a13 = a12 = (a)cq.a(a10, cq.aa);
                    if (string == null) {
                        if (a13 == null) {
                            fU.h("LegacyV2Adapter base resource pack not found: " + a10);
                            return new String[0];
                        }
                        a13 = a12;
                    }
                    a10 = a13;
                }
                a11 = a10;
                if (string != null) break block16;
                bl2 = a11 instanceof M;
            }
            if (!bl2) {
                fU.h("Unknown resource pack type: " + a10);
                return new String[0];
            }
            a11 = a10;
        }
        a12 = (M)a11;
        File file2 = file = a12.a;
        if (string == null) {
            if (file2 == null) {
                return new String[0];
            }
            file2 = file;
        }
        int n2 = file2.isDirectory();
        if (string == null) {
            if (n2 != 0) {
                return ci.a(file, "", arrstring, arrstring2);
            }
            n2 = file.isFile();
        }
        if (string == null) {
            if (n2 != 0) {
                return ci.a(file, arrstring, arrstring2);
            }
            fU.h("Unknown resource pack file: " + file);
            n2 = 0;
        }
        return new String[n2];
    }

    public static String[] a(String[] arrstring, String[] arrstring2) {
        String[] arrstring3;
        LinkedHashSet<String> linkedHashSet;
        block2: {
            LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>();
            a[] arra = fU.bf();
            String string = K.d();
            for (int i2 = 0; i2 < arra.length; ++i2) {
                a a10 = arra[i2];
                String[] arrstring4 = ci.a(a10, arrstring, arrstring2, null);
                linkedHashSet = linkedHashSet2;
                arrstring3 = arrstring4;
                if (string == null) {
                    linkedHashSet.addAll(Arrays.asList(arrstring3));
                    if (string == null) continue;
                }
                break block2;
            }
            linkedHashSet = linkedHashSet2;
            arrstring3 = new String[linkedHashSet2.size()];
        }
        String[] arrstring5 = linkedHashSet.toArray(arrstring3);
        return arrstring5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String[] a(File var0, String[] var1_1, String[] var2_2) {
        var4_3 = new ArrayList<String>();
        var5_4 = "assets/minecraft/";
        var3_5 = K.d();
        try {
            var6_6 = new ZipFile(var0);
            var7_8 = var6_6.entries();
lbl7:
            // 2 sources

            while (var7_8.hasMoreElements()) {
                var8_9 = var7_8.nextElement();
                var9_10 = var8_9.getName();
                if (var3_5 != null) return var4_3.toArray(new String[var4_3.size()]);
                v0 = var9_10.startsWith(var5_4);
                if (var3_5 != null) ** GOTO lbl21
                ** GOTO lbl-1000
            }
            ** GOTO lbl33
        }
        catch (IOException var6_7) {
            var6_7.printStackTrace();
            return new String[0];
        }
lbl-1000:
        // 1 sources

        {
            if (!v0) ** GOTO lbl-1000
        }
        {
            var9_10 = var9_10.substring(var5_4.length());
            v0 = dQ.b(var9_10, var1_1);
lbl21:
            // 2 sources

            if (var3_5 != null) ** GOTO lbl-1000
            if (!v0) ** GOTO lbl-1000
        }
        {
            v0 = dQ.a(var9_10, var2_2);
        }
lbl-1000:
        // 2 sources

        {
            if (var3_5 != null) ** GOTO lbl-1000
            if (!v0) ** GOTO lbl-1000
        }
        {
            v0 = ci.a(var9_10);
        }
lbl-1000:
        // 2 sources

        {
            if (var3_5 != null) ** GOTO lbl-1000
            if (v0) ** GOTO lbl-1000
        }
        {
            fU.h("Skipping non-lowercase path: " + var9_10);
            if (var3_5 == null) ** GOTO lbl-1000
        }
lbl-1000:
        // 2 sources

        {
            v0 = var4_3.add(var9_10);
        }
lbl-1000:
        // 6 sources

        {
            if (var3_5 == null) ** GOTO lbl7
lbl33:
            // 2 sources

            var6_6.close();
            return var4_3.toArray(new String[var4_3.size()]);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String[] a(File var0, String var1_1, String[] var2_2, String[] var3_3) {
        var5_4 = new ArrayList<String>();
        var4_5 = K.d();
        var6_6 = "assets/minecraft/";
        var7_7 = var0.listFiles();
        if (var7_7 == null) {
            return new String[0];
        }
        var8_8 = 0;
        while (var8_8 < var7_7.length) {
            block10: {
                block11: {
                    block13: {
                        block16: {
                            block15: {
                                block14: {
                                    block12: {
                                        v0 = var7_7;
                                        if (var4_5 != null) return (String[])v0;
                                        var9_10 = v0[var8_8];
                                        v1 = var9_10.isFile();
                                        if (var4_5 != null) break block10;
                                        if (!v1) break block11;
                                        var10_11 = var1_1 + var9_10.getName();
                                        v2 = var10_11.startsWith(var6_6);
                                        if (var4_5 != null) break block12;
                                        if (!v2) break block13;
                                        var10_11 = var10_11.substring(var6_6.length());
                                        v2 = dQ.b(var10_11, var2_2);
                                    }
                                    if (var4_5 != null) break block14;
                                    if (!v2) break block13;
                                    v2 = dQ.a(var10_11, var3_3);
                                }
                                if (var4_5 != null) break block15;
                                if (!v2) break block13;
                                v2 = ci.a(var10_11);
                            }
                            if (var4_5 != null) break block13;
                            if (v2) break block16;
                            fU.h("Skipping non-lowercase path: " + var10_11);
                            if (var4_5 == null) break block13;
                        }
                        v2 = var5_4.add(var10_11);
                    }
                    if (var4_5 == null) ** GOTO lbl-1000
                }
                v1 = var9_10.isDirectory();
            }
            if (v1) {
                var10_11 = var1_1 + var9_10.getName() + "/";
                var11_12 = ci.a(var9_10, var10_11, var2_2, var3_3);
                for (var12_13 = 0; var12_13 < var11_12.length; ++var12_13) {
                    var13_14 = var11_12[var12_13];
                    var5_4.add(var13_14);
                    if (var4_5 == null) {
                        if (var4_5 == null) continue;
                    }
                    break;
                }
            } else lbl-1000:
            // 4 sources

            {
                ++var8_8;
            }
            if (var4_5 == null) continue;
        }
        v0 = var5_4.toArray(new String[var5_4.size()]);
        return (String[])v0;
    }

    public static String[] a(a a10, String string, String string2, String[] arrstring) {
        return ci.a(a10, new String[]{string}, new String[]{string2}, arrstring);
    }

    public static String[] a(a a10, String[] arrstring, String[] arrstring2) {
        return ci.a(a10, arrstring, arrstring2, null);
    }

    private static String[] a(a a10, String[] arrstring) {
        String[] arrstring2;
        block8: {
            String string;
            block10: {
                String[] arrstring3;
                block9: {
                    string = K.d();
                    arrstring3 = arrstring;
                    if (string != null) break block9;
                    if (arrstring3 != null) break block10;
                    arrstring3 = new String[]{};
                }
                return arrstring3;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = 0;
            while (n2 < arrstring.length) {
                block14: {
                    block13: {
                        String string2;
                        block12: {
                            String string3;
                            block11: {
                                arrstring2 = arrstring;
                                if (string != null) break block8;
                                string3 = string2 = arrstring2[n2];
                                if (string != null) break block11;
                                if (ci.a(string3)) break block12;
                                string3 = "Skipping non-lowercase path: " + string2;
                            }
                            fU.h(string3);
                            if (string == null) break block13;
                        }
                        v v2 = new v(string2);
                        if (string != null) break block14;
                        if (a10.b(v2)) {
                            arrayList.add(string2);
                        }
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        }
        String[] arrstring4 = arrstring2;
        return arrstring4;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

