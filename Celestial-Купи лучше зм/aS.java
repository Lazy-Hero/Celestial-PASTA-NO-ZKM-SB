/*
 * Decompiled with CFR 0.150.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.j.d;
import net.minecraft.client.j.u;

public class aS {
    private static /* synthetic */ O[][] a;

    static {
        a = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(z z2) {
        O[] arro;
        int n2;
        String string = K.d();
        if (a == null) {
            return false;
        }
        int n3 = fU.a().bf;
        if (string == null) {
            if (n3 < 8) {
                return false;
            }
            n3 = z2.D.r().a();
        }
        int n4 = n2 = n3;
        if (string != null) return n4 != 0;
        if (n4 < 0) return 0 != 0;
        n4 = n2;
        if (string != null) return n4 != 0;
        if (n4 >= a.length) return 0 != 0;
        O[] arro2 = arro = a[n2];
        if (string == null) {
            if (arro2 == null) {
                return false;
            }
            arro2 = arro;
        }
        boolean bl2 = arro2.length;
        if (string != null) return bl2;
        if (bl2 <= false) return false;
        return true;
    }

    public static void a(z z2, u u2, float f10) {
        block10: {
            O[] arro;
            int n2;
            int n3;
            String string;
            block11: {
                string = K.d();
                if (a == null) break block10;
                n2 = n3 = z2.D.r().a();
                if (string != null) break block11;
                if (n2 < 0) break block10;
                n2 = n3;
            }
            if (n2 < a.length && (arro = a[n3]) != null) {
                float f11;
                long l2 = z2.s();
                int n4 = (int)(l2 % 24000L);
                float f12 = z2.h(f10);
                float f13 = z2.a(f10);
                float f14 = z2.g(f10);
                float f15 = f13 - 0.0f;
                float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (string == null) {
                    if (f16 > 0) {
                        f14 /= f13;
                    }
                    f16 = f11 = 0.0f;
                }
                while (f11 < arro.length) {
                    O o2 = arro[f11];
                    if (string == null) {
                        if (string == null) {
                            if (o2.a(z2, n4)) {
                                o2.a(n4, f12, f13, f14);
                            }
                            ++f11;
                        }
                        if (string == null) continue;
                    }
                    break block10;
                }
                float f17 = 1.0f - f13;
                bv.a(f17);
            }
        }
    }

    public static void b() {
        a = null;
    }

    public static void a() {
        block0: {
            aS.b();
            if (!fU.M()) break block0;
            a = aS.c();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static O[][] c() {
        O[][] arro;
        block18: {
            int n2;
            O[][] arro2;
            int n3;
            int n4;
            String string;
            O[][] arro3;
            block16: {
                arro3 = new O[10][0];
                string = K.d();
                String string2 = "mcpatcher/sky/world";
                n4 = -1;
                n3 = 0;
                while (n3 < arro3.length) {
                    block17: {
                        block20: {
                            ArrayList<O> arrayList;
                            ArrayList<O> arrayList2;
                            block19: {
                                arro2 = string2 + n3 + "/sky";
                                arrayList2 = new ArrayList<O>();
                                n2 = 1;
                                if (string != null) break block16;
                                for (int i2 = v840254; i2 < 1000; ++i2) {
                                    String string3 = (String)arro2 + i2 + ".properties";
                                    v v2 = new v(string3);
                                    InputStream inputStream = fU.a(v2);
                                    if (string != null) break block17;
                                    if (inputStream == null && string == null) break;
                                    try {
                                        Properties properties = new Properties();
                                        properties.load(inputStream);
                                        inputStream.close();
                                        fU.b("CustomSky properties: " + string3);
                                        String string4 = (String)arro2 + i2 + ".png";
                                        O o2 = new O(properties, string4);
                                        if (!o2.b(string3)) continue;
                                        v v3 = new v(o2.p);
                                        d d10 = fp.a(v3);
                                        if (string == null) {
                                            if (d10 == null) {
                                                fU.e("CustomSky: Texture not found: " + v3);
                                                if (string == null) continue;
                                            }
                                            o2.s = d10.c();
                                            arrayList2.add(o2);
                                        }
                                        inputStream.close();
                                        continue;
                                    }
                                    catch (FileNotFoundException fileNotFoundException) {
                                        break;
                                    }
                                    catch (IOException iOException) {
                                        iOException.printStackTrace();
                                    }
                                    if (string == null) continue;
                                }
                                arrayList = arrayList2;
                                if (string != null) break block19;
                                if (arrayList.size() <= 0) break block20;
                                arrayList = arrayList2;
                            }
                            O[] arro4 = arrayList.toArray(new O[arrayList2.size()]);
                            arro3[n3] = arro4;
                            n4 = n3;
                        }
                        ++n3;
                    }
                    if (string == null) continue;
                }
                n2 = n4;
            }
            if (string == null) {
                if (n2 < 0) {
                    return null;
                }
                n2 = n3 = n4 + 1;
            }
            arro2 = new O[n2][0];
            for (int i3 = 0; i3 < arro2.length; ++i3) {
                arro = arro2;
                if (string == null) {
                    arro[i3] = arro3[i3];
                    if (string == null) continue;
                }
                break block18;
            }
            arro = arro2;
        }
        return arro;
    }
}

