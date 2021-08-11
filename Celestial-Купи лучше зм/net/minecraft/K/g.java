/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 */
package net.minecraft.K;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.K.a;
import net.minecraft.K.h;
import net.minecraft.K.i;
import net.minecraft.K.j;
import net.minecraft.K.k;
import net.minecraft.az.r;
import net.minecraft.w.aY;
import net.minecraft.w.ao;
import net.minecraft.w.d;

public class g {
    private static final /* synthetic */ List<h<net.minecraft.w.k>> d;
    private static final /* synthetic */ List<h<i>> a;
    private static final /* synthetic */ Predicate<d> b;
    private static final /* synthetic */ List<r> c;

    private static void a(ao ao2) {
        c.add(r.a(new net.minecraft.w.k[]{ao2}));
    }

    protected static boolean c(d d10, d d11) {
        net.minecraft.w.k k2 = d10.w();
        int n2 = 0;
        int n3 = d.size();
        int[] arrn = j.b();
        while (n2 < n3) {
            block3: {
                block4: {
                    boolean bl2;
                    block5: {
                        h<net.minecraft.w.k> h2 = d.get(n2);
                        if (arrn != null) break block3;
                        if (h2.b != k2) break block4;
                        bl2 = h2.c.a(d11);
                        if (arrn != null) break block5;
                        if (!bl2) break block4;
                        bl2 = true;
                    }
                    return bl2;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return false;
    }

    protected static boolean b(d d10) {
        boolean bl2;
        block3: {
            int n2 = d.size();
            int[] arrn = j.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                bl2 = g.d.get((int)i2).c.a(d10);
                if (arrn == null) {
                    boolean bl3;
                    if (arrn == null) {
                        if (!bl2) continue;
                        bl3 = true;
                    }
                    return bl3;
                }
                break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static void a(ao ao2, net.minecraft.w.k k2, ao ao3) {
        d.add(new h<ao>(ao2, r.a(new net.minecraft.w.k[]{k2}), ao3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(d d10) {
        int[] arrn = j.b();
        boolean bl2 = g.b(d10);
        if (arrn != null) return bl2;
        if (bl2) return true;
        bl2 = g.a(d10);
        if (arrn != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void b() {
        g.a(net.minecraft.u.h.V);
        g.a(net.minecraft.u.h.b3);
        g.a(net.minecraft.u.h.W);
        g.a(net.minecraft.u.h.V, net.minecraft.u.h.bZ, net.minecraft.u.h.b3);
        g.a(net.minecraft.u.h.b3, net.minecraft.u.h.g, net.minecraft.u.h.W);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.bq, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.bK, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.m, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.cC, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.T, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.bm, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.y, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.cr, net.minecraft.u.a.r);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.a7, net.minecraft.u.a.f);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.cl, net.minecraft.u.a.t);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.aN, net.minecraft.u.a.k);
        g.a(net.minecraft.u.a.k, net.minecraft.u.h.a7, net.minecraft.u.a.G);
        g.a(net.minecraft.u.a.k, net.minecraft.u.h.ak, net.minecraft.u.a.q);
        g.a(net.minecraft.u.a.G, net.minecraft.u.h.ak, net.minecraft.u.a.n);
        g.a(net.minecraft.u.a.q, net.minecraft.u.h.a7, net.minecraft.u.a.n);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.y, net.minecraft.u.a.z);
        g.a(net.minecraft.u.a.z, net.minecraft.u.h.a7, net.minecraft.u.a.i);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.m, net.minecraft.u.a.g);
        g.a(net.minecraft.u.a.g, net.minecraft.u.h.a7, net.minecraft.u.a.K);
        g.a(net.minecraft.u.a.g, net.minecraft.u.h.cr, net.minecraft.u.a.o);
        g.a(net.minecraft.u.a.g, net.minecraft.u.h.ak, net.minecraft.u.a.j);
        g.a(net.minecraft.u.a.K, net.minecraft.u.h.ak, net.minecraft.u.a.H);
        g.a(net.minecraft.u.a.j, net.minecraft.u.h.a7, net.minecraft.u.a.H);
        g.a(net.minecraft.u.a.C, net.minecraft.u.h.ak, net.minecraft.u.a.j);
        g.a(net.minecraft.u.a.I, net.minecraft.u.h.ak, net.minecraft.u.a.H);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.bm, net.minecraft.u.a.C);
        g.a(net.minecraft.u.a.C, net.minecraft.u.h.a7, net.minecraft.u.a.I);
        g.a(net.minecraft.u.a.C, net.minecraft.u.h.cr, net.minecraft.u.a.A);
        g.a(net.minecraft.u.a.t, r.a(new d(net.minecraft.u.h.aw, 1, aY.PUFFERFISH.a())), net.minecraft.u.a.e);
        g.a(net.minecraft.u.a.e, net.minecraft.u.h.a7, net.minecraft.u.a.v);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.bq, net.minecraft.u.a.B);
        g.a(net.minecraft.u.a.B, net.minecraft.u.h.cr, net.minecraft.u.a.m);
        g.a(net.minecraft.u.a.B, net.minecraft.u.h.ak, net.minecraft.u.a.p);
        g.a(net.minecraft.u.a.m, net.minecraft.u.h.ak, net.minecraft.u.a.a);
        g.a(net.minecraft.u.a.p, net.minecraft.u.h.cr, net.minecraft.u.a.a);
        g.a(net.minecraft.u.a.c, net.minecraft.u.h.ak, net.minecraft.u.a.p);
        g.a(net.minecraft.u.a.h, net.minecraft.u.h.ak, net.minecraft.u.a.p);
        g.a(net.minecraft.u.a.d, net.minecraft.u.h.ak, net.minecraft.u.a.a);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.T, net.minecraft.u.a.c);
        g.a(net.minecraft.u.a.c, net.minecraft.u.h.a7, net.minecraft.u.a.h);
        g.a(net.minecraft.u.a.c, net.minecraft.u.h.cr, net.minecraft.u.a.d);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.bK, net.minecraft.u.a.D);
        g.a(net.minecraft.u.a.D, net.minecraft.u.h.a7, net.minecraft.u.a.s);
        g.a(net.minecraft.u.a.D, net.minecraft.u.h.cr, net.minecraft.u.a.J);
        g.a(net.minecraft.u.a.t, net.minecraft.u.h.cC, net.minecraft.u.a.F);
        g.a(net.minecraft.u.a.F, net.minecraft.u.h.a7, net.minecraft.u.a.b);
        g.a(net.minecraft.u.a.F, net.minecraft.u.h.cr, net.minecraft.u.a.x);
        g.a(net.minecraft.u.a.u, net.minecraft.u.h.ak, net.minecraft.u.a.y);
        g.a(net.minecraft.u.a.y, net.minecraft.u.h.a7, net.minecraft.u.a.w);
    }

    static List a() {
        return c;
    }

    private static void a(i i2, net.minecraft.w.k k2, i i3) {
        g.a(i2, r.a(new net.minecraft.w.k[]{k2}), i3);
    }

    protected static boolean b(d d10, d d11) {
        i i2 = k.d(d10);
        int[] arrn = j.b();
        int n2 = 0;
        int n3 = a.size();
        while (n2 < n3) {
            block3: {
                block4: {
                    boolean bl2;
                    block5: {
                        h<i> h2 = a.get(n2);
                        if (arrn != null) break block3;
                        if (h2.b != i2) break block4;
                        bl2 = h2.c.a(d11);
                        if (arrn != null) break block5;
                        if (!bl2) break block4;
                        bl2 = true;
                    }
                    return bl2;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return false;
    }

    protected static boolean a(d d10) {
        boolean bl2;
        block3: {
            int n2 = a.size();
            int[] arrn = j.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                bl2 = g.a.get((int)i2).c.a(d10);
                if (arrn == null) {
                    boolean bl3;
                    if (arrn == null) {
                        if (!bl2) continue;
                        bl3 = true;
                    }
                    return bl3;
                }
                break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = Lists.newArrayList();
        d = Lists.newArrayList();
        c = Lists.newArrayList();
        b = new a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(d d10, d d11) {
        int[] arrn = j.b();
        boolean bl2 = b.apply((Object)d10);
        if (arrn == null) {
            if (!bl2) {
                return false;
            }
            bl2 = g.c(d10, d11);
        }
        if (arrn != null) return bl2;
        if (bl2) return true;
        bl2 = g.b(d10, d11);
        if (arrn != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static void a(i i2, r r2, i i3) {
        a.add(new h<i>(i2, r2, i3));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static d a(d var0, d var1_1) {
        block10: {
            var2_2 = j.b();
            v0 = var1_1;
            if (var2_2 != null) return v0;
            if (v0.G()) break block10;
            var3_3 = k.d(var1_1);
            var4_4 = var1_1.w();
            var5_5 = 0;
            var6_6 = g.d.size();
            while (var5_5 < var6_6) {
                block11: {
                    var7_7 = g.d.get(var5_5);
                    if (var2_2 != null) break block11;
                    v1 = var7_7.b;
                    if (var2_2 != null) ** GOTO lbl26
                    if (v1 == var4_4 && var7_7.c.a(var0)) {
                        return k.a(new d((net.minecraft.w.k)var7_7.a), var3_3);
                    }
                    ++var5_5;
                }
                if (var2_2 == null) continue;
            }
            var5_5 = 0;
            var6_6 = g.a.size();
            while (var5_5 < var6_6) {
                block12: {
                    var7_9 = g.a.get(var5_5);
                    if (var2_2 != null) break block12;
                    v1 = var7_9.b;
lbl26:
                    // 2 sources

                    if (v1 == var3_3 && var7_8.c.a(var0)) {
                        return k.a(new d(var4_4), (i)var7_8.a);
                    }
                    ++var5_5;
                }
                if (var2_2 == null) continue;
            }
        }
        v0 = var1_1;
        return v0;
    }
}

