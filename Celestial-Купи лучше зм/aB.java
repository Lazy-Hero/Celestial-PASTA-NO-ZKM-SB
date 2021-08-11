/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import net.minecraft.W.ax;
import net.minecraft.W.b7;
import net.minecraft.W.bH;
import net.minecraft.W.bm;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.x.Y;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class aB {
    private static /* synthetic */ c f;
    private static /* synthetic */ boolean x;
    private static /* synthetic */ Y w;
    private static /* synthetic */ Y j;
    private static /* synthetic */ c k;
    private static /* synthetic */ boolean a;
    private static /* synthetic */ Y t;
    private static /* synthetic */ c B;
    private static /* synthetic */ Y v;
    private static final /* synthetic */ String s;
    private static /* synthetic */ c A;
    private static /* synthetic */ Y q;
    private static /* synthetic */ Y b;
    private static /* synthetic */ boolean z;
    private static /* synthetic */ boolean m;
    private static final /* synthetic */ String e;
    private static /* synthetic */ c g;
    private static /* synthetic */ boolean c;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String i;
    private static /* synthetic */ boolean d;
    private static final /* synthetic */ String u;
    private static /* synthetic */ c r;
    private static /* synthetic */ boolean l;
    private static final /* synthetic */ String y;
    private static /* synthetic */ boolean h;
    private static /* synthetic */ boolean n;
    private static /* synthetic */ boolean o;

    private static List d(t t2, i i2, n n2, aA aA2, List list) {
        String string = K.d();
        boolean bl2 = o;
        if (string == null) {
            if (!bl2) {
                return list;
            }
            bl2 = fU.aU();
        }
        if (bl2) {
            return aB.a(n2.k(), aA2, t2) == net.minecraft.u.g.ci ? j.a(i2, aA2, 0L) : list;
        }
        return j.a(i2, aA2, 0L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static List a(t var0, i var1_1, n var2_2, aA var3_3, List var4_4) {
        block8: {
            var6_5 = var0.d(var2_2.a()).b();
            var5_6 = K.d();
            v0 = var6_5;
            v1 = net.minecraft.u.g.da;
            if (var5_6 != null) break block8;
            if (v0 == v1) ** GOTO lbl-1000
            v0 = var6_5;
            v1 = net.minecraft.u.g.o;
        }
        if (v0 == v1) lbl-1000:
        // 2 sources

        {
            v2 = true;
        } else {
            v2 = false;
        }
        var7_7 = v2;
        v3 = fU.aU();
        if (var5_6 == null) {
            if (v3) {
                v4 = var7_7;
                if (var5_6 == null) {
                    if (v4) {
                        if (aB.l == false) return var4_4;
                        if (aB.a(var2_2, var3_3, var0) != net.minecraft.u.g.o) return var4_4;
                        return aB.b.a(var1_1, var3_3, 0L);
                    }
                    v4 = aB.a;
                }
                if (v4 == false) return var4_4;
                if (aB.a(var2_2.k(), var3_3, var0) != net.minecraft.u.g.aU) return var4_4;
                return aB.q.a(var1_1, var3_3, 0L);
            }
            v3 = var7_7;
        }
        if (var5_6 == null) {
            if (v3) {
                if (aB.l == false) return var4_4;
                return aB.b.a(var1_1, var3_3, 0L);
            }
            v3 = aB.a;
        }
        if (v3 == false) return var4_4;
        return aB.q.a(var1_1, var3_3, 0L);
    }

    public static void b(j j2) {
        x = false;
        z = false;
        aB.a(j2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static List e(t var0, i var1_1, n var2_2, aA var3_3, List var4_4) {
        block8: {
            var6_5 = var0.d(var2_2.a()).b();
            var5_6 = K.d();
            v0 = var6_5;
            v1 = net.minecraft.u.g.da;
            if (var5_6 != null) break block8;
            if (v0 == v1) ** GOTO lbl-1000
            v0 = var6_5;
            v1 = net.minecraft.u.g.o;
        }
        if (v0 == v1) lbl-1000:
        // 2 sources

        {
            v2 = true;
        } else {
            v2 = false;
        }
        var7_7 = v2;
        v3 = fU.aU();
        if (var5_6 == null) {
            if (v3) {
                v4 = var7_7;
                if (var5_6 == null) {
                    if (v4) {
                        if (aB.m == false) return var4_4;
                        if (aB.a(var2_2, var3_3, var0) != net.minecraft.u.g.o) return var4_4;
                        return aB.b.a(var1_1, var3_3, 0L);
                    }
                    v4 = aB.h;
                }
                if (v4 == false) return var4_4;
                if (aB.a(var2_2.k(), var3_3, var0) != net.minecraft.u.g.a8) return var4_4;
                return aB.v.a(var1_1, var3_3, 0L);
            }
            v3 = var7_7;
        }
        if (var5_6 == null) {
            if (v3) {
                if (aB.m == false) return var4_4;
                return aB.b.a(var1_1, var3_3, 0L);
            }
            v3 = aB.h;
        }
        if (v3 == false) return var4_4;
        return aB.v.a(var1_1, var3_3, 0L);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static List c(t var0, i var1_1, n var2_2, aA var3_3, List var4_4) {
        block13: {
            block14: {
                block16: {
                    block15: {
                        block12: {
                            var6_5 = aB.a(var2_2, aA.UP, var0);
                            var5_6 = K.d();
                            if (var1_1.b(ax.A) != da.PODZOL) {
                                if (var6_5 != net.minecraft.u.g.ci) return var4_4;
                                if (aB.o && aB.a(var2_2, var3_3, var0) == net.minecraft.u.g.ci) {
                                    v0 = aB.w.a(var1_1, var3_3, 0L);
                                    return v0;
                                }
                                v0 = var4_4;
                                return v0;
                            }
                            v1 = var6_5;
                            v2 = net.minecraft.u.g.da;
                            if (var5_6 != null) break block12;
                            if (v1 == v2) ** GOTO lbl-1000
                            v1 = var6_5;
                            v2 = net.minecraft.u.g.o;
                        }
                        if (v1 == v2) lbl-1000:
                        // 2 sources

                        {
                            v3 = true;
                        } else {
                            v3 = false;
                        }
                        var7_7 = v3;
                        v4 = fU.aU();
                        if (var5_6 != null) break block13;
                        if (!v4) break block14;
                        v5 = var7_7;
                        if (var5_6 == null) {
                            if (v5) {
                                if (aB.d == false) return var4_4;
                                if (aB.a(var2_2, var3_3, var0) != net.minecraft.u.g.o) return var4_4;
                                return aB.b.a(var1_1, var3_3, 0L);
                            }
                            v5 = aB.c;
                        }
                        if (v5 == false) return var4_4;
                        var8_8 = var2_2.k().a(var3_3);
                        v6 = var9_9 = var0.d(var8_8);
                        if (var5_6 != null) break block15;
                        if (v6.b() != net.minecraft.u.g.bv) break block16;
                        v6 = var9_9;
                    }
                    if (v6.b(ax.A) == da.PODZOL) {
                        return aB.t.a(var1_1, var3_3, 0L);
                    }
                }
                if (var5_6 == null) return var4_4;
            }
            v4 = var7_7;
        }
        if (var5_6 == null) {
            if (v4) {
                if (aB.d == false) return var4_4;
                return aB.b.a(var1_1, var3_3, 0L);
            }
            v4 = aB.c;
        }
        if (v4 == false) return var4_4;
        return aB.t.a(var1_1, var3_3, 0L);
    }

    private static c a(Properties properties, String string, String string2, j j2) {
        v v2;
        String string3;
        String string4;
        block6: {
            String string5;
            block5: {
                string4 = properties.getProperty(string);
                string3 = K.d();
                string5 = string4;
                if (string3 != null) break block5;
                if (string5 != null) break block6;
                string5 = string2;
            }
            string4 = string5;
        }
        v v3 = v2 = new v("textures/" + string4 + ".png");
        if (string3 == null) {
            if (!fU.b(v3)) {
                fU.h("BetterGrass texture not found: " + v2);
                string4 = string2;
            }
            v3 = new v(string4);
        }
        v v4 = v3;
        c c10 = j2.c(v4);
        return c10;
    }

    static {
        p = "blocks/dirt_podzol_top";
        s = "blocks/snow";
        i = "blocks/grass_path_top";
        y = "blocks/grass_top";
        u = "blocks/grass_side";
        e = "blocks/mycelium_top";
        a = true;
        o = true;
        h = true;
        c = true;
        l = true;
        m = true;
        d = true;
        n = false;
        B = null;
        A = null;
        f = null;
        r = null;
        g = null;
        k = null;
        x = false;
        q = null;
        j = null;
        w = null;
        v = null;
        t = null;
        b = null;
        z = false;
    }

    private static net.minecraft.W.K a(n n2, aA aA2, t t2) {
        n n3 = n2.a(aA2);
        net.minecraft.W.K k2 = t2.d(n3).b();
        return k2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean a(Properties properties, String string, boolean bl2) {
        boolean bl3;
        String string2 = properties.getProperty(string);
        String string3 = K.d();
        String string4 = string2;
        if (string3 == null) {
            if (string4 == null) {
                bl3 = bl2;
                return bl3;
            }
            string4 = string2;
        }
        bl3 = Boolean.parseBoolean(string4);
        return bl3;
    }

    public static void a() {
        block5: {
            Object object;
            c c10;
            block6: {
                boolean bl2;
                block4: {
                    String string = K.d();
                    bl2 = x;
                    if (string != null) break block4;
                    if (!bl2) break block5;
                    c10 = B;
                    if (string != null) break block6;
                    q = fM.a(c10, 0);
                    bl2 = n;
                }
                if (bl2) {
                    object = fM.a(A, -1);
                    q = fM.a((Y)object, q);
                }
                c10 = fU.ax().c(new v("blocks/grass_path_side"));
            }
            object = c10;
            j = fM.a("grass_path", (c)object, f);
            w = fM.a(f, -1);
            v = fM.a(r, -1);
            t = fM.a(g, 0);
            b = fM.a(k, -1);
            z = true;
        }
    }

    private static void a(j j2) {
        a = true;
        o = true;
        h = true;
        c = true;
        l = true;
        m = true;
        d = true;
        B = j2.c(new v("blocks/grass_top"));
        A = j2.c(new v("blocks/grass_side"));
        f = j2.c(new v("blocks/grass_path_top"));
        r = j2.c(new v("blocks/mycelium_top"));
        String string = K.d();
        g = j2.c(new v("blocks/dirt_podzol_top"));
        k = j2.c(new v("blocks/snow"));
        x = true;
        String string2 = "optifine/bettergrass.properties";
        try {
            InputStream inputStream;
            block10: {
                block9: {
                    block8: {
                        v v2;
                        v v3 = v2 = new v(string2);
                        if (string == null) {
                            if (!fU.b(v3)) {
                                return;
                            }
                            v3 = v2;
                        }
                        if ((inputStream = fU.a(v3)) == null) {
                            return;
                        }
                        boolean bl2 = fU.e(v2);
                        if (string != null) break block8;
                        if (!bl2) break block9;
                        fU.b("BetterGrass: Parsing default configuration " + string2);
                    }
                    if (string == null) break block10;
                }
                fU.b("BetterGrass: Parsing configuration " + string2);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            a = aB.a(properties, "grass", true);
            o = aB.a(properties, "grass_path", true);
            h = aB.a(properties, "mycelium", true);
            c = aB.a(properties, "podzol", true);
            l = aB.a(properties, "grass.snow", true);
            m = aB.a(properties, "mycelium.snow", true);
            d = aB.a(properties, "podzol.snow", true);
            n = aB.a(properties, "grass.multilayer", false);
            B = aB.a(properties, "texture.grass", "blocks/grass_top", j2);
            A = aB.a(properties, "texture.grass_side", "blocks/grass_side", j2);
            f = aB.a(properties, "texture.grass_path", "blocks/grass_path_top", j2);
            r = aB.a(properties, "texture.mycelium", "blocks/mycelium_top", j2);
            g = aB.a(properties, "texture.podzol", "blocks/dirt_podzol_top", j2);
            k = aB.a(properties, "texture.snow", "blocks/snow", j2);
        }
        catch (IOException iOException) {
            fU.h("Error reading: " + string2 + ", " + iOException.getClass().getName() + ": " + iOException.getMessage());
        }
    }

    public static List b(t t2, i i2, n n2, aA aA2, List list) {
        block12: {
            aA aA3;
            aA aA4;
            String string;
            block11: {
                string = K.d();
                aA4 = aA2;
                aA3 = aA.UP;
                if (string != null) break block11;
                if (aA4 == aA3) break block12;
                aA4 = aA2;
                aA3 = aA.DOWN;
            }
            if (aA4 != aA3) {
                if (!z) {
                    return list;
                }
                net.minecraft.W.K k2 = i2.b();
                boolean bl2 = k2 instanceof bm;
                if (string == null) {
                    if (bl2) {
                        return aB.e(t2, i2, n2, aA2, list);
                    }
                    bl2 = k2 instanceof b7;
                }
                if (string == null) {
                    if (bl2) {
                        return aB.d(t2, i2, n2, aA2, list);
                    }
                    bl2 = k2 instanceof ax;
                }
                if (string == null) {
                    if (bl2) {
                        return aB.c(t2, i2, n2, aA2, list);
                    }
                    bl2 = k2 instanceof bH;
                }
                return bl2 ? aB.a(t2, i2, n2, aA2, list) : list;
            }
        }
        return list;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

