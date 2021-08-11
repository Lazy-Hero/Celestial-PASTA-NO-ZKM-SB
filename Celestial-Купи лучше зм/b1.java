/*
 * Decompiled with CFR 0.150.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import net.minecraft.B.X;
import net.minecraft.K.b;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.Q;
import net.minecraft.client.a.p;
import net.minecraft.client.j.j;
import net.minecraft.client.x.J;
import net.minecraft.client.x.M;
import net.minecraft.client.x.Y;
import net.minecraft.u.h;
import net.minecraft.w.S;
import net.minecraft.w.ao;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.w.m;

public class b1 {
    public static final /* synthetic */ int g;
    private static /* synthetic */ h6[][] a;
    public static final /* synthetic */ String c;
    private static /* synthetic */ boolean m;
    public static final /* synthetic */ int t;
    public static final /* synthetic */ String i;
    public static final /* synthetic */ String h;
    public static final /* synthetic */ String q;
    private static /* synthetic */ Map l;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ M j;
    private static final /* synthetic */ Map<String, Integer> d;
    public static final /* synthetic */ String s;
    public static final /* synthetic */ String b;
    private static final /* synthetic */ int[][] n;
    private static /* synthetic */ h6[][] e;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String r;
    private static /* synthetic */ boolean k;
    public static final /* synthetic */ int o;

    public static void b() {
        block9: {
            h6[][] arrh6;
            block11: {
                int n2;
                block10: {
                    String string;
                    block7: {
                        block8: {
                            e = null;
                            string = K.d();
                            a = null;
                            k = true;
                            if (string != null) break block8;
                            if (!fU.aH()) break block9;
                            b1.b("mcpatcher/cit.properties");
                        }
                        a[] arra = fU.bf();
                        for (int i2 = arra.length - 1; i2 >= 0; --i2) {
                            a a10 = arra[i2];
                            b1.a(a10);
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block7;
                        }
                        b1.a(fU.l());
                    }
                    n2 = e.length;
                    if (string != null) break block10;
                    if (n2 <= 0) {
                        e = null;
                    }
                    arrh6 = a;
                    if (string != null) break block11;
                    n2 = arrh6.length;
                }
                if (n2 > 0) break block9;
                arrh6 = null;
            }
            a = arrh6;
        }
    }

    public static boolean a(B b10, d d10, net.minecraft.client.w.j j2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        int n2;
        block35: {
            int n3;
            block36: {
                String string;
                block25: {
                    int[][] arrn;
                    block31: {
                        boolean bl2;
                        block30: {
                            block28: {
                                boolean bl3;
                                block29: {
                                    block27: {
                                        string = K.d();
                                        if (a == null) {
                                            return false;
                                        }
                                        bl3 = fU.ag();
                                        if (string != null) break block27;
                                        if (!bl3) break block28;
                                        bl3 = cS.dn;
                                    }
                                    if (string != null) break block29;
                                    if (!bl3) break block28;
                                    bl3 = false;
                                }
                                return bl3;
                            }
                            d d11 = d10;
                            if (string == null) {
                                if (d11 == null) {
                                    return false;
                                }
                                d11 = d10;
                            }
                            arrn = b1.b(d11);
                            bl2 = arrn.length;
                            if (string != null) break block30;
                            if (bl2 > false) break block31;
                            bl2 = false;
                        }
                        return bl2;
                    }
                    HashSet<Integer> hashSet = null;
                    n3 = 0;
                    net.minecraft.client.j.u u2 = fU.o();
                    int n4 = 0;
                    while (n4 < arrn.length) {
                        block26: {
                            block32: {
                                int n5 = arrn[n4][0];
                                if (string != null) break block26;
                                n2 = n5;
                                if (string != null) break block25;
                                if (n2 < 0 || n5 >= a.length) break block32;
                                h6[] arrh6 = a[n5];
                                if (string != null) break block26;
                                if (arrh6 == null) break block32;
                                for (int i2 = 0; i2 < arrh6.length; ++i2) {
                                    h6 h62;
                                    h6 h63;
                                    block34: {
                                        boolean bl4;
                                        block33: {
                                            h63 = arrh6[i2];
                                            if (string != null) break block26;
                                            HashSet<Integer> hashSet2 = hashSet;
                                            if (string == null) {
                                                if (hashSet2 == null) {
                                                    hashSet = new HashSet<Integer>();
                                                }
                                                hashSet2 = hashSet;
                                            }
                                            bl4 = hashSet2.add(n5);
                                            if (string != null) break block33;
                                            if (!bl4) continue;
                                            h62 = h63;
                                            if (string != null) break block34;
                                            bl4 = b1.a(h62, d10, arrn);
                                        }
                                        if (!bl4) continue;
                                        h62 = h63;
                                    }
                                    if (string == null) {
                                        if (h62.f == null) continue;
                                        u2.b(h63.f);
                                        h62 = h63;
                                    }
                                    float f17 = h62.b(u2);
                                    int n6 = n3;
                                    if (string == null) {
                                        if (n6 == 0) {
                                            n3 = 1;
                                            boolean bl5 = fU.ag();
                                            if (string == null) {
                                                if (bl5) {
                                                    as.p();
                                                }
                                                net.minecraft.client.a.v.a();
                                                net.minecraft.client.a.v.o(514);
                                                bl5 = false;
                                            }
                                            net.minecraft.client.a.v.a(bl5);
                                        }
                                        bv.a(h63.K, 1.0f);
                                        net.minecraft.client.a.v.y();
                                        n6 = 5890;
                                    }
                                    net.minecraft.client.a.v.q(n6);
                                    net.minecraft.client.a.v.l();
                                    net.minecraft.client.a.v.a(h63.n, 0.0f, 0.0f, 1.0f);
                                    float f18 = f17 / 8.0f;
                                    net.minecraft.client.a.v.d(f18, f18 / 2.0f, f18);
                                    float f19 = h63.d * (float)(Q.aj() % 3000L) / 3000.0f / 8.0f;
                                    net.minecraft.client.a.v.b(0.0f, f19, 0.0f);
                                    net.minecraft.client.a.v.q(5888);
                                    j2.b(b10, f10, f11, f13, f14, f15, f16);
                                    if (string == null) continue;
                                }
                            }
                            ++n4;
                        }
                        if (string == null) continue;
                    }
                    n2 = n3;
                }
                if (string != null) break block35;
                if (n2 == 0) break block36;
                net.minecraft.client.a.v.e();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.f(770, 771);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.q(5890);
                net.minecraft.client.a.v.l();
                net.minecraft.client.a.v.q(5888);
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.a(true);
                net.minecraft.client.a.v.o(515);
                net.minecraft.client.a.v.f();
                n2 = fU.ag() ? 1 : 0;
                if (string != null) break block35;
                if (n2 != 0) {
                    as.j();
                }
            }
            n2 = n3;
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void a(a var0) {
        block21: {
            var2_1 = ci.a(var0, "mcpatcher/cit/", ".properties", null);
            var1_2 = K.d();
            var3_3 = b1.b(var0);
            if (var1_2 == null) {
                if (var3_3.size() > 0) {
                    var4_4 = var3_3.keySet();
                    var5_5 = var4_4.toArray(new String[var4_4.size()]);
                    var2_1 = (String[])fU.a(var2_1, var5_5);
                }
                Arrays.sort(var2_1);
            }
            var4_4 = b1.a(b1.e);
            var5_5 = b1.a(b1.a);
            for (var6_6 = 0; var6_6 < var2_1.length; ++var6_6) {
                var7_8 = var2_1[var6_6];
                fU.b("CustomItems: " + (String)var7_8);
                try {
                    block24: {
                        block25: {
                            block27: {
                                block26: {
                                    block23: {
                                        block22: {
                                            var8_10 = null;
                                            if (var1_2 != null) break block21;
                                            v0 = var3_3;
                                            v1 = var7_8;
                                            if (var1_2 != null) break block22;
                                            if (!v0.containsKey(v1)) break block23;
                                            v0 = var3_3;
                                            v1 = var7_8;
                                        }
                                        var8_10 = (h6)v0.get(v1);
                                    }
                                    v2 = var8_10;
                                    if (var1_2 != null) break block24;
                                    if (v2 != null) break block25;
                                    var9_13 = new v((String)var7_8);
                                    var10_14 = var0.a(var9_13);
                                    if (var1_2 != null) break block26;
                                    if (var10_14 != null) break block27;
                                    fU.h("CustomItems file not found: " + (String)var7_8);
                                }
                                if (var1_2 == null) continue;
                            }
                            var11_15 = new Properties();
                            var11_15.load(var10_14);
                            var8_10 = new h6(var11_15, (String)var7_8);
                        }
                        v2 = var8_10;
                    }
                    if (var1_2 == null) {
                        if (!v2.f((String)var7_8)) continue;
                        b1.b((h6)var8_10, var4_4);
                        v2 = var8_10;
                    }
                    b1.a((h6)v2, (List)var5_5);
                    continue;
                }
                catch (FileNotFoundException var8_11) {
                    fU.h("CustomItems file not found: " + (String)var7_8);
                    continue;
                }
                catch (Exception var8_12) {
                    var8_12.printStackTrace();
                }
                if (var1_2 == null) continue;
            }
            b1.e = b1.a(var4_4);
            b1.a = b1.a((List)var5_5);
        }
        var6_7 = b1.e();
        var7_9 = 0;
        while (var7_9 < b1.e.length) {
            block28: {
                var8_10 = b1.e[var7_9];
                if (var1_2 != null) break block28;
                v3 = var8_10;
                if (var1_2 != null) ** GOTO lbl78
                if (v3 != null) {
                    Arrays.sort(var8_10, var6_7);
                }
                ++var7_9;
            }
            if (var1_2 == null) continue;
        }
        var7_9 = 0;
        do {
            if (var7_9 >= b1.a.length) return;
            var8_10 = b1.a[var7_9];
            if (var1_2 != null) continue;
            v3 = var8_10;
lbl78:
            // 2 sources

            if (v3 != null) {
                Arrays.sort(var8_10, var6_7);
            }
            ++var7_9;
        } while (var1_2 == null);
    }

    private static int a(d d10) {
        k k2 = d10.w();
        String string = K.d();
        int n2 = k2 instanceof ao;
        if (string == null) {
            n2 = n2 != 0 ? b1.c(d10) : d10.u();
        }
        return n2;
    }

    private static void a(h6[][] arrh6, List<h6> list) {
        String string = K.d();
        if (arrh6 != null) {
            int n2 = 0;
            while (n2 < arrh6.length) {
                h6[] arrh62 = arrh6[n2];
                if (string == null) {
                    if (arrh62 != null) {
                        int n3 = 0;
                        while (n3 < arrh62.length) {
                            h6 h62 = arrh62[n3];
                            if (string == null) {
                                if (string == null) {
                                    if (h62 != null) {
                                        list.add(h62);
                                    }
                                    ++n3;
                                }
                                if (string == null) continue;
                            }
                            break;
                        }
                    } else {
                        ++n2;
                    }
                }
                if (string == null) continue;
            }
        }
    }

    private static h6 a(d d10, int n2) {
        block8: {
            h6[] arrh6;
            int n3;
            int n4;
            String string;
            block7: {
                string = K.d();
                if (e == null) {
                    return null;
                }
                d d11 = d10;
                if (string == null) {
                    if (d11 == null) {
                        return null;
                    }
                    d11 = d10;
                }
                k k2 = d11.w();
                n3 = n4 = net.minecraft.w.k.a(k2);
                if (string != null) break block7;
                if (n3 < 0) break block8;
                n3 = n4;
            }
            if (n3 >= e.length || (arrh6 = e[n4]) == null) break block8;
            int n5 = 0;
            while (n5 < arrh6.length) {
                block9: {
                    block10: {
                        h6 h62;
                        block11: {
                            h6 h63 = arrh6[n5];
                            if (string != null) break block9;
                            if (h63.z != n2) break block10;
                            h62 = h63;
                            if (string != null) break block11;
                            if (!b1.a(h62, d10, (int[][])null)) break block10;
                            h62 = h63;
                        }
                        return h62;
                    }
                    ++n5;
                }
                if (string == null) continue;
            }
        }
        return null;
    }

    private static Map<String, Integer> a() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        b1.a("water", 0, false, hashMap);
        b1.a("awkward", 16, false, hashMap);
        b1.a("thick", 32, false, hashMap);
        b1.a("mundane", 64, false, hashMap);
        b1.a("regeneration", 1, true, hashMap);
        b1.a("swiftness", 2, true, hashMap);
        b1.a("fire_resistance", 3, true, hashMap);
        b1.a("poison", 4, true, hashMap);
        b1.a("healing", 5, true, hashMap);
        b1.a("night_vision", 6, true, hashMap);
        b1.a("weakness", 8, true, hashMap);
        b1.a("strength", 9, true, hashMap);
        b1.a("slowness", 10, true, hashMap);
        b1.a("leaping", 11, true, hashMap);
        b1.a("harming", 12, true, hashMap);
        b1.a("water_breathing", 13, true, hashMap);
        b1.a("invisibility", 14, true, hashMap);
        return hashMap;
    }

    private static int[] a(int n2, int n3) {
        return new int[]{n2 + n3 * 16};
    }

    public static boolean a(d d10, X x2, String string) {
        String string2 = K.d();
        if (e == null) {
            return false;
        }
        v v2 = b1.b(d10, x2, string);
        if (string2 == null) {
            if (v2 == null) {
                return false;
            }
            fU.o().b(v2);
        }
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void b(String string) {
        String string2 = K.d();
        try {
            v v2 = new v(string);
            InputStream inputStream = fU.a(v2);
            if (string2 == null) {
                if (inputStream == null) {
                    return;
                }
                fU.b("CustomItems: Loading " + string);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            k = fU.a(properties.getProperty("useGlint"), true);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void a(h6 h62, List list) {
        block7: {
            h6 h63;
            String string;
            block6: {
                string = K.d();
                h63 = h62;
                if (string != null) break block6;
                if (h63.z != 2) break block7;
                h63 = h62;
            }
            if (h63.M != null) {
                for (int i2 = 0; i2 < 256; ++i2) {
                    h6 h64 = h62;
                    if (string == null) {
                        if (!h64.M.b(i2)) continue;
                        h64 = h62;
                    }
                    b1.a(h64, list, i2);
                    if (string == null) continue;
                }
            }
        }
    }

    public static void a(j j2) {
        Iterator<h6> iterator = b1.d().iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            h6 h62 = iterator.next();
            h62.a(j2);
            if (string == null) continue;
        }
    }

    private static int[][] b(d d10) {
        block12: {
            int[][] arrn;
            block7: {
                int n2;
                Object object;
                String string;
                block13: {
                    Object object2;
                    block11: {
                        u u2;
                        block10: {
                            block9: {
                                k k2;
                                block8: {
                                    k k3 = d10.w();
                                    string = K.d();
                                    k2 = k3;
                                    if (string != null) break block8;
                                    if (k2 != net.minecraft.u.h.a0) break block9;
                                    k2 = net.minecraft.u.h.a0;
                                }
                                object = (S)k2;
                                u2 = S.a(d10);
                                if (string == null) break block10;
                            }
                            u2 = d10.D();
                        }
                        object2 = object = u2;
                        if (string != null) break block11;
                        if (object2 == null) break block12;
                        object2 = object;
                    }
                    n2 = ((u)object2).b();
                    if (string != null) break block13;
                    if (n2 <= 0) break block12;
                    n2 = ((u)object).b();
                }
                int[][] arrn2 = new int[n2][2];
                for (int i2 = 0; i2 < ((u)object).b(); ++i2) {
                    r r2 = ((u)object).d(i2);
                    short s2 = r2.q("id");
                    short s3 = r2.q("lvl");
                    arrn2[i2][0] = s2;
                    arrn = arrn2;
                    if (string == null) {
                        arrn[i2][1] = s3;
                        if (string == null) continue;
                    }
                    break block7;
                }
                arrn = arrn2;
            }
            return arrn;
        }
        return n;
    }

    public static void c() {
        Iterator<h6> iterator = b1.d().iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            h6 h62 = iterator.next();
            if (h62.z == 1) {
                j j2 = Q.P().an();
                h62.a(j2, j);
                h62.c();
            }
            if (string == null) continue;
        }
    }

    private static int a(String string) {
        int n2;
        block3: {
            String string2 = "effect." + string;
            String string3 = K.d();
            for (v v2 : net.minecraft.K.b.e.a()) {
                block5: {
                    int n3;
                    block4: {
                        b b10 = net.minecraft.K.b.e.a(v2);
                        String string4 = b10.i();
                        n2 = string2.equals(string4) ? 1 : 0;
                        if (string3 != null) break block3;
                        if (string3 != null) break block4;
                        if (n2 == 0) break block5;
                        n3 = net.minecraft.K.b.a(b10);
                    }
                    return n3;
                }
                if (string3 == null) continue;
            }
            n2 = -1;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Properties a(String var0, String var1_1, int var2_2, String var3_3) {
        block24: {
            block22: {
                block23: {
                    block19: {
                        block21: {
                            block20: {
                                var4_4 = K.d();
                                v0 = dQ.a(var0, new String[]{"_n", "_s"});
                                if (var4_4 != null) break block20;
                                if (v0) {
                                    return null;
                                }
                                v1 = var0;
                                if (var4_4 != null) break block21;
                                v0 = v1.equals("empty");
                            }
                            if (v0) {
                                v1 = var1_1;
                                if (var4_4 == null) {
                                    if (v1.equals("normal")) {
                                        var2_2 = net.minecraft.w.k.a(net.minecraft.u.h.ch);
                                        var5_5 = new Properties();
                                        var5_5.put("type", "item");
                                        var5_5.put("items", "" + var2_2);
                                        return var5_5;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v1 = b1.g().get(var0);
                            }
                        }
                        var5_6 = (int[])v1;
                        if (var4_4 != null) return null;
                        if (var5_6 == null) {
                            fU.h("Potion not found for image: " + var3_3);
                            return null;
                        }
                        var6_7 = new StringBuffer();
                        for (var7_8 = 0; var7_8 < var5_6.length; ++var7_8) {
                            var8_9 = var5_6[var7_8];
                            v2 = var1_1.equals("splash");
                            if (var4_4 == null) {
                                if (var4_4 == null) {
                                    if (v2 != 0) {
                                        var8_9 |= 16384;
                                    }
                                    v3 = var7_8;
                                }
                                if (v3 > 0) {
                                    var6_7.append(" ");
                                }
                                var6_7.append(var8_9);
                                if (var4_4 == null) continue;
                            }
                            break block19;
                        }
                        var7_8 = 16447;
                        v2 = var0.equals("water");
                    }
                    if (var4_4 != null) break block22;
                    if (v2 != 0) break block23;
                    v2 = var0.equals("mundane") ? 1 : 0;
                    if (var4_4 != null) break block22;
                    if (v2 == 0) break block24;
                }
                v2 = var7_8 | 64;
            }
            var7_8 = v2 ? 1 : 0;
        }
        var8_10 = new Properties();
        var8_10.put("type", "item");
        var8_10.put("items", "" + var2_2);
        var8_10.put("damage", "" + var6_7);
        var8_10.put("damageMask", "" + var7_8);
        v4 = var1_1;
        if (var4_4 != null) return var8_10;
        if (v4.equals("splash")) {
            var8_10.put("texture.potion_bottle_splash", var0);
            if (var4_4 == null) return var8_10;
        }
        v4 = var8_10.put("texture.potion_bottle_drinkable", var0);
        return var8_10;
    }

    public static boolean a(p p2, d d10, Y y2) {
        int n2;
        net.minecraft.client.j.u u2;
        int n3;
        String string;
        block18: {
            int[][] arrn;
            block21: {
                boolean bl2;
                block20: {
                    string = K.d();
                    if (a == null) {
                        return false;
                    }
                    d d11 = d10;
                    if (string == null) {
                        if (d11 == null) {
                            return false;
                        }
                        d11 = d10;
                    }
                    arrn = b1.b(d11);
                    bl2 = arrn.length;
                    if (string != null) break block20;
                    if (bl2 > false) break block21;
                    bl2 = false;
                }
                return bl2;
            }
            HashSet<Integer> hashSet = null;
            n3 = 0;
            u2 = fU.o();
            int n4 = 0;
            while (n4 < arrn.length) {
                block19: {
                    block22: {
                        int n5 = arrn[n4][0];
                        if (string != null) break block19;
                        n2 = n5;
                        if (string != null) break block18;
                        if (n2 < 0 || n5 >= a.length) break block22;
                        h6[] arrh6 = a[n5];
                        if (string != null) break block19;
                        if (arrh6 == null) break block22;
                        for (int i2 = 0; i2 < arrh6.length; ++i2) {
                            h6 h62;
                            h6 h63;
                            block24: {
                                boolean bl3;
                                block23: {
                                    h63 = arrh6[i2];
                                    if (string != null) break block19;
                                    HashSet<Integer> hashSet2 = hashSet;
                                    if (string == null) {
                                        if (hashSet2 == null) {
                                            hashSet = new HashSet<Integer>();
                                        }
                                        hashSet2 = hashSet;
                                    }
                                    bl3 = hashSet2.add(n5);
                                    if (string != null) break block23;
                                    if (!bl3) continue;
                                    h62 = h63;
                                    if (string != null) break block24;
                                    bl3 = b1.a(h62, d10, arrn);
                                }
                                if (!bl3) continue;
                                h62 = h63;
                            }
                            if (string == null) {
                                if (h62.f == null) continue;
                                u2.b(h63.f);
                                h62 = h63;
                            }
                            float f10 = h62.b(u2);
                            int n6 = n3;
                            if (string == null) {
                                if (n6 == 0) {
                                    n3 = 1;
                                    net.minecraft.client.a.v.a(false);
                                    net.minecraft.client.a.v.o(514);
                                    net.minecraft.client.a.v.y();
                                    net.minecraft.client.a.v.q(5890);
                                }
                                n6 = h63.K;
                            }
                            bv.a(n6, 1.0f);
                            net.minecraft.client.a.v.M();
                            net.minecraft.client.a.v.d(f10 / 2.0f, f10 / 2.0f, f10 / 2.0f);
                            float f11 = h63.d * (float)(Q.aj() % 3000L) / 3000.0f / 8.0f;
                            net.minecraft.client.a.v.b(f11, 0.0f, 0.0f);
                            net.minecraft.client.a.v.a(h63.n, 0.0f, 0.0f, 1.0f);
                            p2.a(y2, -1);
                            net.minecraft.client.a.v.B();
                            if (string == null) continue;
                        }
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
            n2 = n3;
        }
        if (string == null) {
            if (n2 != 0) {
                net.minecraft.client.a.v.e();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.f(770, 771);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.q(5888);
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.o(515);
                net.minecraft.client.a.v.a(true);
                u2.b(net.minecraft.client.j.j.x);
            }
            n2 = n3;
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static boolean a(h6 var0, d var1_1, int[][] var2_2) {
        block52: {
            block62: {
                block63: {
                    block51: {
                        block65: {
                            block64: {
                                block58: {
                                    block59: {
                                        block50: {
                                            block61: {
                                                block60: {
                                                    block57: {
                                                        block56: {
                                                            block53: {
                                                                block54: {
                                                                    block55: {
                                                                        var4_3 = var1_1.w();
                                                                        var3_4 = K.d();
                                                                        v0 = var0.D;
                                                                        if (var3_4 != null) break block53;
                                                                        if (v0 == null) break block54;
                                                                        v1 = var5_5 = b1.a(var1_1);
                                                                        if (var3_4 == null) {
                                                                            if (v1 < 0) {
                                                                                return false;
                                                                            }
                                                                            v1 = var0.C;
                                                                        }
                                                                        if (var3_4 == null) {
                                                                            if (v1 != 0) {
                                                                                var5_5 &= var0.C;
                                                                            }
                                                                            v1 = var0.o ? 1 : 0;
                                                                        }
                                                                        if (var3_4 != null) break block55;
                                                                        if (v1 != 0) {
                                                                            var6_7 = var4_3.e();
                                                                            var5_5 = (int)((double)(var5_5 * 100) / (double)var6_7);
                                                                        }
                                                                        v0 = var0.D;
                                                                        if (var3_4 != null) break block53;
                                                                        v1 = v0.b(var5_5) ? 1 : 0;
                                                                    }
                                                                    if (v1 == 0) {
                                                                        return false;
                                                                    }
                                                                }
                                                                v0 = var0.e;
                                                            }
                                                            if (var3_4 != null) break block56;
                                                            if (v0 == null) break block57;
                                                            v0 = var0.e;
                                                        }
                                                        v2 = v0.b(var1_1.t());
                                                        if (var3_4 != null) return v2;
                                                        if (!v2) {
                                                            return false;
                                                        }
                                                    }
                                                    var5_6 = var2_2;
                                                    v3 = var0.M;
                                                    if (var3_4 != null) break block58;
                                                    if (v3 == null) break block59;
                                                    v4 = var2_2;
                                                    if (var3_4 != null) break block60;
                                                    if (v4 != null) break block61;
                                                    v4 = b1.b(var1_1);
                                                }
                                                var5_6 = v4;
                                            }
                                            var6_7 = false;
                                            var7_9 = 0;
                                            while (var7_9 < var5_6.length) {
                                                var8_10 = var5_6[var7_9][0];
                                                if (var3_4 == null) {
                                                    v5 = var0.M.b(var8_10);
                                                    if (var3_4 != null) break block50;
                                                    if (v5) {
                                                        var6_7 = true;
                                                        if (var3_4 == null) break;
                                                    }
                                                    ++var7_9;
                                                }
                                                if (var3_4 == null) continue;
                                            }
                                            v5 = var6_7;
                                        }
                                        if (var3_4 != null) return v5;
                                        if (!v5) {
                                            return false;
                                        }
                                    }
                                    v6 = var0;
                                    if (var3_4 != null) break block62;
                                    v3 = v6.b;
                                }
                                if (v3 == null) break block63;
                                v7 = var5_6;
                                if (var3_4 != null) break block64;
                                if (v7 != null) break block65;
                                v7 = b1.b(var1_1);
                            }
                            var5_6 = v7;
                        }
                        var6_7 = false;
                        var7_9 = 0;
                        while (var7_9 < var5_6.length) {
                            var8_10 = var5_6[var7_9][1];
                            if (var3_4 == null) {
                                v8 = var0.b.b(var8_10);
                                if (var3_4 != null) break block51;
                                if (v8) {
                                    var6_7 = true;
                                    if (var3_4 == null) break;
                                }
                                ++var7_9;
                            }
                            if (var3_4 == null) continue;
                        }
                        v8 = var6_7;
                    }
                    if (var3_4 != null) return v8;
                    if (!v8) {
                        return false;
                    }
                }
                v6 = var0;
            }
            if (var3_4 == null) {
                if (v6.g != null) {
                    var6_8 = var1_1.v();
                    var7_9 = 0;
                    while (var7_9 < var0.g.length) {
                        var8_11 = var0.g[var7_9];
                        if (var3_4 == null) {
                            v9 = var8_11.a(var6_8);
                            if (var3_4 != null) break block52;
                            if (!v9) {
                                return false;
                            }
                            ++var7_9;
                        }
                        if (var3_4 == null) continue;
                    }
                }
                v6 = var0;
            }
            v9 = v6.k;
        }
        if (var3_4 != null) return v9;
        if (!v9) {
            return true;
        }
        v10 = var0.k;
        v11 = 1;
        if (var3_4 == null) {
            if (v10 == v11) {
                v10 = b1.m ? 1 : 0;
                if (var3_4 == null) {
                    if (v10 != 0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v10 = var0.k;
            }
            if (var3_4 != null) return (boolean)v10;
            v11 = 2;
        }
        if (v10 != v11) return (boolean)1;
        v10 = b1.m ? 1 : 0;
        if (var3_4 != null) return (boolean)v10;
        if (v10 != 0) return (boolean)1;
        return (boolean)0;
    }

    private static int c(d d10) {
        Integer n2;
        r r2 = d10.v();
        String string = K.d();
        r r3 = r2;
        if (string == null) {
            if (r3 == null) {
                return 0;
            }
            r3 = r2;
        }
        String string2 = r3.j("Potion");
        Object object = string2;
        if (string == null) {
            if (object == null) {
                return 0;
            }
            object = d.get(string2);
        }
        Integer n3 = n2 = (Integer)object;
        if (string == null) {
            if (n3 == null) {
                return -1;
            }
            n3 = n2;
        }
        int n4 = n3;
        if (d10.w() == net.minecraft.u.h.b3) {
            n4 |= 0x4000;
        }
        return n4;
    }

    public static boolean f() {
        return k;
    }

    private static Map g() {
        String string = K.d();
        Map map = l;
        if (string == null) {
            if (map == null) {
                l = new LinkedHashMap();
                l.put("water", b1.a(0, 0));
                l.put("awkward", b1.a(0, 1));
                l.put("thick", b1.a(0, 2));
                l.put("potent", b1.a(0, 3));
                l.put("regeneration", b1.a(1));
                l.put("movespeed", b1.a(2));
                l.put("fireresistance", b1.a(3));
                l.put("poison", b1.a(4));
                l.put("heal", b1.a(5));
                l.put("nightvision", b1.a(6));
                l.put("clear", b1.a(7, 0));
                l.put("bungling", b1.a(7, 1));
                l.put("charming", b1.a(7, 2));
                l.put("rank", b1.a(7, 3));
                l.put("weakness", b1.a(8));
                l.put("damageboost", b1.a(9));
                l.put("moveslowdown", b1.a(10));
                l.put("leaping", b1.a(11));
                l.put("harm", b1.a(12));
                l.put("waterbreathing", b1.a(13));
                l.put("invisibility", b1.a(14));
                l.put("thin", b1.a(15, 0));
                l.put("debonair", b1.a(15, 1));
                l.put("sparkling", b1.a(15, 2));
                l.put("stinky", b1.a(15, 3));
                l.put("mundane", b1.a(0, 4));
                l.put("speed", l.get("movespeed"));
                l.put("fire_resistance", l.get("fireresistance"));
                l.put("instant_health", l.get("heal"));
                l.put("night_vision", l.get("nightvision"));
                l.put("strength", l.get("damageboost"));
                l.put("slowness", l.get("moveslowdown"));
                l.put("instant_damage", l.get("harm"));
                l.put("water_breathing", l.get("waterbreathing"));
            }
            map = l;
        }
        return map;
    }

    static {
        c = "items/potion_bottle_splash";
        p = "normal";
        s = "items/potion_overlay";
        g = 16384;
        t = 64;
        f = "splash";
        i = "texture.potion_bottle_splash";
        r = "linger";
        h = "texture.potion_bottle_drinkable";
        q = "texture.potion_overlay";
        o = 63;
        b = "items/potion_bottle_drinkable";
        e = null;
        a = null;
        l = null;
        j = new M();
        k = true;
        m = false;
        n = new int[0][];
        d = b1.a();
    }

    private static void b(h6 h62, List list) {
        block3: {
            String string = K.d();
            if (h62.F == null) break block3;
            for (int i2 = 0; i2 < h62.F.length; ++i2) {
                int n2;
                block5: {
                    block4: {
                        n2 = h62.F[i2];
                        if (string != null) break block4;
                        if (n2 > 0) break block5;
                        fU.h("Invalid item ID: " + n2);
                    }
                    if (string == null) continue;
                }
                b1.a(h62, list, n2);
                if (string == null) continue;
            }
        }
    }

    public static void a(J j2) {
        Iterator<h6> iterator = b1.d().iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            h6 h62 = iterator.next();
            h62.a(j2);
            if (string == null) continue;
        }
    }

    private static void a(String string, int n2, boolean bl2, Map<String, Integer> map) {
        if (bl2) {
            n2 |= 0x2000;
        }
        map.put("minecraft:" + string, n2);
        if (bl2) {
            int n3 = n2 | 0x20;
            map.put("minecraft:strong_" + string, n3);
            int n4 = n2 | 0x40;
            map.put("minecraft:long_" + string, n4);
        }
    }

    private static Map a(a a10, String string, int n2) {
        HashMap<String, h6> hashMap = new HashMap<String, h6>();
        String string2 = string + "/";
        String[] arrstring = new String[]{"mcpatcher/cit/potion/" + string2, "mcpatcher/cit/Potion/" + string2};
        String[] arrstring2 = new String[]{".png"};
        String[] arrstring3 = ci.a(a10, arrstring, arrstring2);
        String string3 = K.d();
        int n3 = 0;
        while (n3 < arrstring3.length) {
            String string4 = arrstring3[n3];
            String string5 = dQ.a(string4, arrstring, arrstring2);
            Properties properties = b1.a(string5, string, n2, string4);
            if (string3 == null) {
                if (properties != null) {
                    String string6 = dQ.c(string4, arrstring2) + ".properties";
                    h6 h62 = new h6(properties, string6);
                    hashMap.put(string6, h62);
                }
                ++n3;
            }
            if (string3 == null) continue;
        }
        return hashMap;
    }

    private static List<h6> d() {
        ArrayList<h6> arrayList = new ArrayList<h6>();
        b1.a(e, arrayList);
        b1.a(a, arrayList);
        return arrayList;
    }

    private static Comparator e() {
        g3 g32 = new g3();
        return g32;
    }

    private static v b(d d10, X x2, String string) {
        v v2;
        k k2;
        String string2;
        h6 h62;
        block11: {
            h6 h63;
            block10: {
                h62 = b1.a(d10, 3);
                string2 = K.d();
                h63 = h62;
                if (string2 == null) {
                    if (h63 == null) {
                        return null;
                    }
                    h63 = h62;
                }
                if (string2 != null) break block10;
                if (h63.v != null) break block11;
                h63 = h62;
            }
            return h63.f;
        }
        k k3 = k2 = d10.w();
        if (string2 == null) {
            if (!(k3 instanceof m)) {
                return null;
            }
            k3 = k2;
        }
        m m2 = (m)k3;
        String string3 = m2.c().b();
        int n2 = x2 == X.LEGS ? 2 : 1;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("texture.");
        stringBuffer.append(string3);
        stringBuffer.append("_layer_");
        stringBuffer.append(n2);
        String string4 = string;
        if (string2 == null) {
            if (string4 != null) {
                stringBuffer.append("_");
                stringBuffer.append(string);
            }
            string4 = stringBuffer.toString();
        }
        String string5 = string4;
        v v3 = v2 = (v)h62.v.get(string5);
        if (string2 == null) {
            v3 = v3 == null ? h62.f : v2;
        }
        return v3;
    }

    private static Map b(a a10) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(b1.a(a10, "normal", net.minecraft.w.k.a(net.minecraft.u.h.V)));
        hashMap.putAll(b1.a(a10, "splash", net.minecraft.w.k.a(net.minecraft.u.h.b3)));
        hashMap.putAll(b1.a(a10, "linger", net.minecraft.w.k.a(net.minecraft.u.h.W)));
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static v a(d d10, v v2) {
        v v3;
        h6 h62;
        String string = K.d();
        if (e == null) {
            return v2;
        }
        h6 h63 = h62 = b1.a(d10, 4);
        if (string == null) {
            if (h63 == null) {
                return v2;
            }
            h63 = h62;
        }
        if (string == null) {
            if (h63.f == null) {
                v3 = v2;
                return v3;
            }
            h63 = h62;
        }
        v3 = h63.f;
        return v3;
    }

    public static Y a(d d10, Y y2, v v2, boolean bl2) {
        Y y3;
        h6 h62;
        String string;
        block8: {
            Y y4;
            block9: {
                boolean bl3;
                block7: {
                    string = K.d();
                    bl3 = bl2;
                    if (string != null) break block7;
                    if (bl3) break block8;
                    y4 = y2;
                    if (string != null) break block9;
                    bl3 = y4.d();
                }
                if (!bl3) break block8;
                y4 = y2;
            }
            return y4;
        }
        if (e == null) {
            return y2;
        }
        h6 h63 = h62 = b1.a(d10, 1);
        if (string == null) {
            if (h63 == null) {
                return y2;
            }
            h63 = h62;
        }
        Y y5 = y3 = h63.a(v2, bl2);
        if (string == null) {
            y5 = y5 != null ? y3 : y2;
        }
        return y5;
    }

    public static void a(boolean bl2) {
        m = bl2;
    }

    private static List a(h6[][] arrh6) {
        ArrayList<ArrayList<h6>> arrayList = new ArrayList<ArrayList<h6>>();
        String string = K.d();
        if (arrh6 != null) {
            for (int i2 = 0; i2 < arrh6.length; ++i2) {
                h6[] arrh62 = arrh6[i2];
                ArrayList<h6> arrayList2 = null;
                if (arrh62 != null) {
                    arrayList2 = new ArrayList<h6>(Arrays.asList(arrh62));
                }
                arrayList.add(arrayList2);
                if (string == null) continue;
            }
        }
        return arrayList;
    }

    private static int[] a(int n2) {
        return new int[]{n2, n2 + 16, n2 + 32, n2 + 48};
    }

    private static h6[][] a(List list) {
        h6[][] arrh6 = new h6[list.size()][];
        int n2 = 0;
        String string = K.d();
        while (n2 < list.size()) {
            List list2 = (List)list.get(n2);
            if (string == null) {
                if (list2 != null) {
                    h6[] arrh62 = list2.toArray(new h6[list2.size()]);
                    Arrays.sort(arrh62, new dY());
                    arrh6[n2] = arrh62;
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return arrh6;
    }

    private static void a(h6 h62, List arrayList, int n2) {
        ArrayList<h6> arrayList2;
        ArrayList<h6> arrayList3;
        String string;
        block4: {
            string = K.d();
            while (n2 >= arrayList.size()) {
                arrayList3 = arrayList;
                if (string == null) {
                    arrayList3.add(null);
                    if (string == null) continue;
                }
                break block4;
            }
            arrayList3 = (List)arrayList.get(n2);
        }
        ArrayList<h6> arrayList4 = arrayList2 = arrayList3;
        if (string == null) {
            if (arrayList4 == null) {
                arrayList2 = new ArrayList<h6>();
                arrayList.set(n2, (h6)((Object)arrayList2));
            }
            arrayList4 = arrayList2;
        }
        arrayList4.add(h62);
    }
}

