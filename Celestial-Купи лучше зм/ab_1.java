/*
 * Decompiled with CFR 0.150.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.a.aF;

public class ab {
    public static final /* synthetic */ String g;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map c;
    private static /* synthetic */ boolean i;
    public static final /* synthetic */ String j;
    private static /* synthetic */ boolean a;
    private static /* synthetic */ aF h;
    public static final /* synthetic */ String e;
    private static final /* synthetic */ Random d;
    public static final /* synthetic */ String f;

    private static Exception a(Exception exception) {
        return exception;
    }

    public static v f(v v2) {
        String string = v2.a();
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (!string3.startsWith("textures/entity/")) {
                return null;
            }
            string3 = "mcpatcher/mob/" + string.substring("textures/entity/".length());
        }
        String string4 = string3;
        return new v(v2.c(), string4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static v a(v var0) {
        var1_1 = K.d();
        v0 = ab.a;
        if (var1_1 != null) ** GOTO lbl9
        if (v0) {
            return var0;
        }
        try {
            block21: {
                block20: {
                    ab.a = true;
                    v0 = ab.i;
lbl9:
                    // 2 sources

                    if (!v0) {
                        ab.b();
                    }
                    v1 = ab.h;
                    if (var1_1 != null) break block20;
                    if (v1 == null) break block21;
                    v1 = ab.h;
                }
                v2 = var3_2 = v1.x;
                if (var1_1 == null) {
                    if (!(v2 instanceof C)) {
                        var5_5 = var4_3 = var0;
                        return var5_5;
                    }
                    v2 = var3_2;
                }
                var4_4 = (C)v2;
                var5_6 = var0.a();
                if (!var5_6.startsWith("textures/entity/")) {
                    var7_9 = var6_7 = var0;
                    return var7_9;
                }
                v3 = var6_8 = ab.d(var0);
                if (var1_1 == null) {
                    if (v3 == null) {
                        var8_12 = var7_10 = var0;
                        return var8_12;
                    }
                    v3 = var6_8;
                }
                var8_13 = var7_11 = v3.a(var0, var4_4);
                return var8_13;
            }
            var2_14 = var0;
            return var2_14;
        }
        finally {
            ab.a = false;
        }
    }

    private static v b(v v2) {
        v v3;
        String string;
        String string2;
        String string3;
        block10: {
            v v4;
            block9: {
                v v5;
                String string4;
                v v6 = ab.f(v2);
                string3 = K.d();
                v v7 = v6;
                if (string3 == null) {
                    if (v7 == null) {
                        return null;
                    }
                    v7 = v6;
                }
                string2 = v7.c();
                string = string4 = v6.a();
                String string5 = string4;
                if (string3 == null) {
                    if (string5.endsWith(".png")) {
                        string = string4.substring(0, string4.length() - ".png".length());
                    }
                    string5 = string + ".properties";
                }
                String string6 = string5;
                v4 = v5 = new v(string2, string6);
                if (string3 != null) break block9;
                if (!fU.b(v4)) break block10;
                v4 = v5;
            }
            return v4;
        }
        String string7 = ab.a(string);
        if (string7 == null) {
            return null;
        }
        v v8 = v3 = new v(string2, string7 + ".properties");
        if (string3 == null) {
            v8 = fU.b(v8) ? v3 : null;
        }
        return v8;
    }

    private static String a(String string) {
        int n2 = 0;
        String string2 = K.d();
        while (n2 < b.length) {
            String string3 = b[n2];
            if (string2 == null) {
                if (string.endsWith(string3)) {
                    String string4 = string.substring(0, string.length() - string3.length());
                    return string4;
                }
                ++n2;
            }
            if (string2 == null) continue;
        }
        return null;
    }

    public static v a(v v2, int n2) {
        String string;
        int n3;
        String string2 = K.d();
        v v3 = v2;
        if (string2 == null) {
            if (v3 == null) {
                return null;
            }
            v3 = v2;
        }
        if ((n3 = (string = v3.a()).lastIndexOf(46)) < 0) {
            return null;
        }
        String string3 = string.substring(0, n3);
        String string4 = string.substring(n3);
        String string5 = string3 + n2 + string4;
        v v4 = new v(v2.c(), string5);
        return v4;
    }

    private static v[] e(v v2) {
        ArrayList<v> arrayList;
        ArrayList<v> arrayList2;
        block11: {
            int n2;
            block10: {
                String string = K.d();
                arrayList2 = new ArrayList<v>();
                arrayList2.add(v2);
                String string2 = string;
                v v3 = ab.f(v2);
                if (v3 == null) {
                    return null;
                }
                int n3 = 1;
                while (n3 < arrayList2.size() + 10) {
                    int n4 = n3 + 1;
                    v v4 = ab.a(v3, n4);
                    if (string2 == null) {
                        n2 = fU.b(v4) ? 1 : 0;
                        if (string2 != null) break block10;
                        if (n2 != 0) {
                            arrayList2.add(v4);
                        }
                        ++n3;
                    }
                    if (string2 == null) continue;
                }
                arrayList = arrayList2;
                if (string2 != null) break block11;
                n2 = arrayList.size();
            }
            if (n2 <= 1) {
                return null;
            }
            arrayList = arrayList2;
        }
        v[] arrv = arrayList.toArray(new v[arrayList2.size()]);
        fU.b("RandomMobs: " + v2.a() + ", variants: " + arrv.length);
        return arrv;
    }

    public static void a(x x2, z z2) {
        if (x2 instanceof C && z2 != null) {
            int n2;
            C c10 = (C)x2;
            c10.cd = c10.f();
            c10.cl = z2.c(c10.cd);
            UUID uUID = c10.u();
            long l2 = uUID.getLeastSignificantBits();
            c10.b0 = n2 = (int)(l2 & Integer.MAX_VALUE);
        }
    }

    private static void b() {
        block7: {
            String string;
            block6: {
                h = fU.ao();
                string = K.d();
                if (string != null) break block6;
                if (h == null) break block7;
                i = true;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("bat");
            arrayList.add("blaze");
            arrayList.add("cat/black");
            arrayList.add("cat/ocelot");
            arrayList.add("cat/red");
            arrayList.add("cat/siamese");
            arrayList.add("chicken");
            arrayList.add("cow/cow");
            arrayList.add("cow/mooshroom");
            arrayList.add("creeper/creeper");
            arrayList.add("enderman/enderman");
            arrayList.add("enderman/enderman_eyes");
            arrayList.add("ghast/ghast");
            arrayList.add("ghast/ghast_shooting");
            arrayList.add("iron_golem");
            arrayList.add("pig/pig");
            arrayList.add("sheep/sheep");
            arrayList.add("sheep/sheep_fur");
            arrayList.add("silverfish");
            arrayList.add("skeleton/skeleton");
            arrayList.add("skeleton/wither_skeleton");
            arrayList.add("slime/slime");
            arrayList.add("slime/magmacube");
            arrayList.add("snowman");
            arrayList.add("spider/cave_spider");
            arrayList.add("spider/spider");
            arrayList.add("spider_eyes");
            arrayList.add("squid");
            arrayList.add("villager/villager");
            arrayList.add("villager/butcher");
            arrayList.add("villager/farmer");
            arrayList.add("villager/librarian");
            arrayList.add("villager/priest");
            arrayList.add("villager/smith");
            arrayList.add("wither/wither");
            arrayList.add("wither/wither_armor");
            arrayList.add("wither/wither_invulnerable");
            arrayList.add("wolf/wolf");
            arrayList.add("wolf/wolf_angry");
            arrayList.add("wolf/wolf_collar");
            arrayList.add("wolf/wolf_tame");
            arrayList.add("zombie_pigman");
            arrayList.add("zombie/zombie");
            arrayList.add("zombie/zombie_villager");
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                v v2;
                String string2 = (String)arrayList.get(i2);
                String string3 = "textures/entity/" + string2 + ".png";
                v v3 = v2 = new v(string3);
                if (string == null) {
                    if (!fU.b(v3)) {
                        fU.h("Not found: " + v2);
                    }
                    v3 = v2;
                }
                ab.d(v3);
                if (string == null) continue;
            }
        }
    }

    private static gK d(v v2) {
        String string = v2.a();
        gK gK2 = (gK)c.get(string);
        String string2 = K.d();
        gK gK3 = gK2;
        if (string2 == null) {
            if (gK3 == null) {
                gK2 = ab.c(v2);
                c.put(string, gK2);
            }
            gK3 = gK2;
        }
        return gK3;
    }

    public static void a() {
        block0: {
            c.clear();
            if (!fU.aW()) break block0;
            ab.b();
        }
    }

    static {
        j = "mcpatcher/mob/";
        e = ".properties";
        f = ".png";
        g = "textures/entity/";
        c = new HashMap();
        h = null;
        i = false;
        d = new Random();
        a = false;
        b = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static gK a(v v2, v v3) {
        gK gK2;
        block7: {
            String string = K.d();
            String string2 = v2.a();
            fU.b("RandomMobs: " + v3.a() + ", variants: " + string2);
            InputStream inputStream = fU.a(v2);
            if (string != null) return null;
            if (inputStream == null) {
                fU.h("RandomMobs properties not found: " + string2);
                return null;
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            gK2 = new gK(properties, string2, v3);
            if (gK2.a(string2)) break block7;
            return null;
        }
        try {
            gK gK3 = gK2;
            return gK3;
        }
        catch (FileNotFoundException fileNotFoundException) {
            fU.h("RandomMobs file not found: " + v3.a());
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static void a(z z2, z z3) {
        block4: {
            z z4;
            String string;
            block3: {
                string = K.d();
                z4 = z3;
                if (string != null) break block3;
                if (z4 == null) break block4;
                z4 = z3;
            }
            List<x> list = z4.a();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                x x2 = list.get(i2);
                ab.a(x2, z3);
                if (string == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static gK c(v var0) {
        var2_1 = var0.a();
        var1_2 = K.d();
        v0 = var3_3 = ab.b(var0);
        if (var1_2 == null) {
            if (v0 != null) {
                v0 = var3_3;
                if (var1_2 == null) {
                    var4_4 = ab.a(v0, var0);
                    if (var4_4 != null) {
                        return var4_4;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        var4_5 = ab.e(v0);
        return new gK(var2_1, var4_5);
    }
}

