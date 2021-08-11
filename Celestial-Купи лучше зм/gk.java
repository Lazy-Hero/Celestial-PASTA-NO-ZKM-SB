/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.B.X;
import net.minecraft.J.D;
import net.minecraft.J.t;
import net.minecraft.T.aR;
import net.minecraft.T.aW;
import net.minecraft.T.ad;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.F;
import net.minecraft.client.E.l;
import net.minecraft.client.a.aF;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.q.r;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class gk {
    private static final /* synthetic */ int a;
    private static /* synthetic */ long i;
    private static final /* synthetic */ int k;
    private static final /* synthetic */ int c;
    private static final /* synthetic */ int g;
    private static final /* synthetic */ r<d> h;
    private static final /* synthetic */ int j;
    private static final /* synthetic */ Map<Integer, e6> f;
    private static final /* synthetic */ double b = 7.5;
    private static final /* synthetic */ int e;
    private static final /* synthetic */ double l = 56.25;
    private static final /* synthetic */ int d;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static double a(n n2) {
        double d10 = 0.0;
        String string = K.d();
        Map<Integer, e6> map = f;
        synchronized (map) {
            block9: {
                for (e6 e62 : f.values()) {
                    block10: {
                        double d11;
                        double d12;
                        int n3;
                        block13: {
                            int n4;
                            double d13;
                            block11: {
                                block12: {
                                    n3 = e62.e();
                                    if (string != null) break block9;
                                    if (n3 <= 0) break block10;
                                    double d14 = e62.g();
                                    double d15 = e62.a();
                                    double d16 = e62.f();
                                    double d17 = (double)n2.e() - d14;
                                    double d18 = (double)n2.b() - d15;
                                    double d19 = (double)n2.a() - d16;
                                    d13 = d17 * d17 + d18 * d18 + d19 * d19;
                                    n4 = e62.d();
                                    if (string != null) break block11;
                                    if (n4 == 0) break block12;
                                    n4 = fU.aJ() ? 1 : 0;
                                    if (string != null) break block11;
                                    if (n4 == 0) {
                                        n3 = fU.a(n3 - 2, 0, 15);
                                        d13 *= 2.0;
                                    }
                                }
                                d12 = d13;
                                if (string != null) break block13;
                                double d20 = d12 - 56.25;
                                n4 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                            }
                            if (n4 > 0) break block10;
                            d12 = Math.sqrt(d13);
                        }
                        double d21 = d12;
                        double d22 = 1.0 - d21 / 7.5;
                        double d23 = d11 = d22 * (double)n3;
                        if (string == null && d23 > d10) {
                            d23 = d10 = d11;
                        }
                    }
                    if (string == null) continue;
                }
            }
            double d24 = fU.a(d10, 0.0, 15.0);
            return d24;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a() {
        Map<Integer, e6> map = f;
        synchronized (map) {
            return f.size();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int a(d var0) {
        var1_1 = K.d();
        v0 = var0;
        if (var1_1 == null) {
            if (v0 == null) {
                return 0;
            }
            v0 = var0;
        }
        v1 = var2_2 = v0.w();
        if (var1_1 == null) {
            if (v1 instanceof s) {
                var3_3 = (s)var2_2;
                v1 = var3_3;
                if (var1_1 == null) {
                    var4_4 = v1.a();
                    if (var4_4 != null) {
                        return var4_4.t(var4_4.d());
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var2_2;
            }
        }
        v2 = net.minecraft.u.h.cg;
        if (var1_1 == null) {
            if (v1 == v2) {
                return net.minecraft.u.g.bq.t(net.minecraft.u.g.bq.d());
            }
            v1 = var2_2;
            v2 = net.minecraft.u.h.bx;
        }
        if (var1_1 == null) {
            if (v1 == v2) return 10;
            v1 = var2_2;
            v2 = net.minecraft.u.h.cC;
        }
        if (var1_1 == null) {
            if (v1 == v2) return 10;
            v1 = var2_2;
            v2 = net.minecraft.u.h.cr;
        }
        if (var1_1 == null) {
            if (v1 == v2) {
                return 8;
            }
            v1 = var2_2;
            v2 = net.minecraft.u.h.M;
        }
        if (var1_1 == null) {
            if (v1 == v2) {
                return 8;
            }
            v1 = var2_2;
            v2 = net.minecraft.u.h.y;
        }
        if (var1_1 == null) {
            if (v1 == v2) {
                return 8;
            }
            v1 = var2_2;
            v2 = net.minecraft.u.h.aF;
        }
        if (v1 != v2) return 0;
        v3 = net.minecraft.u.g.bX.t(net.minecraft.u.g.bX.d()) / 2;
        return v3;
    }

    private static void b(aF aF2) {
        block6: {
            l l2;
            String string;
            block5: {
                l l3 = aF2.b();
                string = K.d();
                l2 = l3;
                if (string != null) break block5;
                if (l2 == null) break block6;
                l2 = l3;
            }
            for (x x2 : l2.a()) {
                block9: {
                    e6 e62;
                    block10: {
                        e6 e63;
                        Integer n2;
                        int n3;
                        block7: {
                            block8: {
                                int n4;
                                n3 = n4 = gk.a(x2);
                                if (string != null) break block7;
                                if (n3 <= 0) break block8;
                                n2 = F.a(x2.W());
                                e6 e64 = e63 = f.get(n2);
                                if (string == null && e64 == null) {
                                    e63 = new e6(x2);
                                    e64 = f.put(n2, e63);
                                }
                                if (string == null) break block9;
                            }
                            n3 = x2.W();
                        }
                        n2 = F.a(n3);
                        e62 = e63 = f.remove(n2);
                        if (string != null) break block10;
                        if (e62 == null) break block9;
                        e62 = e63;
                    }
                    e62.b(aF2);
                }
                if (string == null) continue;
            }
        }
    }

    public static int a(n n2, int n3) {
        double d10 = gk.a(n2);
        n3 = gk.a(d10, n3);
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(x x2, aF aF2) {
        Map<Integer, e6> map = f;
        synchronized (map) {
            String string = K.d();
            e6 e62 = f.remove(F.a(x2.W()));
            if (string == null) {
                if (e62 != null) {
                    e62.b(aF2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c(aF aF2) {
        Map<Integer, e6> map = f;
        synchronized (map) {
            String string = K.d();
            Collection<e6> collection = f.values();
            Iterator<e6> iterator = collection.iterator();
            while (iterator.hasNext()) {
                e6 e62 = iterator.next();
                iterator.remove();
                e62.b(aF2);
                if (string == null) {
                    if (string == null) continue;
                }
                break;
            }
            return;
        }
    }

    public static int a(double d10, int n2) {
        double d11;
        block4: {
            block5: {
                String string = K.d();
                double d12 = d10 - 0.0;
                d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                if (string != null) break block4;
                if (d11 <= 0) break block5;
                int n3 = (int)(d10 * 16.0);
                int n4 = n2 & 0xFF;
                d11 = n3;
                if (string != null) break block4;
                if (d11 > n4) {
                    n2 &= 0xFFFFFF00;
                    n2 |= n3;
                }
            }
            d11 = n2;
        }
        return (int)d11;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b() {
        Map<Integer, e6> map = f;
        synchronized (map) {
            f.clear();
        }
    }

    static {
        g = 15;
        c = 8;
        a = 8;
        e = 8;
        j = 10;
        d = 15;
        k = 13;
        f = new HashMap<Integer, e6>();
        i = 0L;
        h = new r<d>(6, net.minecraft.q.h.o);
    }

    public static void a(x x2, aF aF2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int a(x x2, int n2) {
        double d10 = gk.a(x2);
        n2 = gk.a(d10, n2);
        return n2;
    }

    public static d a(t t2) {
        d d10 = t2.E().b(h);
        return d10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(aF aF2) {
        long l2 = System.currentTimeMillis();
        String string = K.d();
        long l3 = l2;
        if (string == null) {
            if (l3 < i + 50L) return;
            l3 = l2;
        }
        i = l3;
        Map<Integer, e6> map = f;
        synchronized (map) {
            gk.b(aF2);
            Map<Integer, e6> map2 = f;
            if (string != null) return;
            if (map2.size() > 0) {
                for (e6 e62 : f.values()) {
                    e62.a(aF2);
                    if (string != null) return;
                    if (string == null) continue;
                }
            }
            map2 = map;
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int a(x var0) {
        var1_1 = K.d();
        v0 = var0;
        if (var1_1 != null) ** GOTO lbl11
        if (v0 == fU.aX().Z()) {
            v1 = fU.aB();
            if (var1_1 == null) {
                if (v1 == 0) {
                    return 0;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var0;
lbl11:
            // 2 sources

            v1 = v0 instanceof j;
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                var2_2 = (j)var0;
                v1 = var2_2.ae();
                if (var1_1 == null) {
                    if (v1 != 0) {
                        return 0;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var0.p();
            }
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                return 15;
            }
            v1 = var0 instanceof net.minecraft.z.j;
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                return 15;
            }
            v1 = var0 instanceof D;
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                return 15;
            }
            v1 = var0 instanceof aW;
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                var2_2 = (aW)var0;
                v2 = var2_2.f();
                if (var1_1 != null) return v2;
                if (v2 == 0) return 10;
                return 15;
            }
            v1 = var0 instanceof ad;
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                var2_2 = (ad)var0;
                cfr_temp_0 = (double)var2_2.ct - 0.6;
                v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var1_1 != null) return (int)v3;
                if (v3 > 0) {
                    v3 = 13;
                    return (int)v3;
                }
                v3 = 8;
                return (int)v3;
            }
            v1 = var0 instanceof aR;
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                var2_2 = (aR)var0;
                cfr_temp_1 = (double)var2_2.a(0.0f) - 0.001;
                v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                if (var1_1 == null) {
                    if (v1 > 0) {
                        return 15;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var0 instanceof B;
            }
        }
        if (var1_1 == null) {
            if (v1 != 0) {
                var2_2 = (B)var0;
                var3_3 = var2_2.av();
                var4_5 = gk.a(var3_3);
                var5_6 = var2_2.b();
                var6_7 = gk.a(var5_6);
                var7_8 = var2_2.b(X.HEAD);
                var8_9 = gk.a(var7_8);
                var9_10 = Math.max(var4_5, var6_7);
                return Math.max(var9_10, var8_9);
            }
            v1 = var0 instanceof t;
        }
        if (var1_1 != null) return v1;
        if (v1 == 0) return 0;
        var2_2 = (t)var0;
        var3_4 = gk.a((t)var2_2);
        return gk.a(var3_4);
    }
}

