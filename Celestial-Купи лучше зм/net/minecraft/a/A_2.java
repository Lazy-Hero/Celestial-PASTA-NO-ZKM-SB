/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.g;
import net.minecraft.A.h;
import net.minecraft.W.ax;
import net.minecraft.W.d2;
import net.minecraft.W.da;
import net.minecraft.ag.P;
import net.minecraft.ag.V;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.p.Q;
import net.minecraft.p.a;
import net.minecraft.p.k;
import net.minecraft.p.p;

public class A
extends h {
    private final /* synthetic */ g I;
    private static final /* synthetic */ p L;
    private static final /* synthetic */ net.minecraft.p.h M;
    private static final /* synthetic */ k K;
    private static final /* synthetic */ net.minecraft.p.h J;
    private static final /* synthetic */ net.minecraft.p.l H;

    @Override
    public a a(Random random) {
        return random.nextInt(5) > 0 ? new Q(net.minecraft.W.e.FERN) : new Q(net.minecraft.W.e.GRASS);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.p.b b(Random random) {
        int n2;
        block6: {
            boolean bl2;
            block5: {
                g g10;
                g g11;
                block4: {
                    bl2 = net.minecraft.A.b.c();
                    g11 = this.I;
                    g10 = g.MEGA;
                    if (!bl2) break block4;
                    if (g11 == g10) break block5;
                    g11 = this.I;
                    g10 = g.MEGA_SPRUCE;
                }
                if (g11 != g10) break block6;
            }
            n2 = random.nextInt(3);
            if (!bl2) return n2 == 0 ? K : H;
            if (n2 == 0) {
                return this.I != g.MEGA_SPRUCE && random.nextInt(13) != 0 ? M : J;
            }
        }
        n2 = random.nextInt(3);
        return n2 == 0 ? K : H;
    }

    public A(g g10, e e10) {
        block4: {
            block2: {
                block3: {
                    boolean bl2 = net.minecraft.A.b.c();
                    super(e10);
                    boolean bl3 = bl2;
                    this.I = g10;
                    this.j.add(new d(V.class, 8, 4, 4));
                    this.j.add(new d(P.class, 4, 2, 3));
                    this.a.I = 10;
                    if (!bl3) break block2;
                    if (g10 == g.MEGA || g10 == g.MEGA_SPRUCE) break block3;
                    this.a.G = 1;
                    this.a.h = 1;
                    if (bl3) break block4;
                }
                this.a.G = 7;
                this.a.f = 1;
            }
            this.a.h = 3;
        }
    }

    @Override
    public void b(z z2, Random random, l l2, int n2, int n3, double d10) {
        A a10;
        block6: {
            block7: {
                double d11;
                block8: {
                    double d12;
                    block9: {
                        boolean bl2;
                        block4: {
                            A a11;
                            block5: {
                                bl2 = net.minecraft.A.b.c();
                                a11 = this;
                                if (!bl2) break block4;
                                if (a11.I == g.MEGA) break block5;
                                a10 = this;
                                if (!bl2) break block6;
                                if (a10.I != g.MEGA_SPRUCE) break block7;
                            }
                            this.B = net.minecraft.u.g.aU.d();
                            a11 = this;
                        }
                        a11.z = net.minecraft.u.g.bv.d();
                        double d13 = d10 - 1.75;
                        d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        if (!bl2) break block8;
                        if (d11 <= 0) break block9;
                        this.B = net.minecraft.u.g.bv.d().a(ax.A, da.COARSE_DIRT);
                        if (bl2) break block7;
                    }
                    d11 = (d12 = d10 - -0.95) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                }
                if (d11 > 0) {
                    this.B = net.minecraft.u.g.bv.d().a(ax.A, da.PODZOL);
                }
            }
            a10 = this;
        }
        a10.a(z2, random, l2, n2, n3, d10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, Random var2_2, n var3_3) {
        block5: {
            var4_4 = net.minecraft.A.b.f();
            v0 = this.I;
            v1 = g.MEGA;
            if (var4_4) break block5;
            if (v0 == v1) ** GOTO lbl-1000
            v0 = this.I;
            v1 = g.MEGA_SPRUCE;
        }
        if (v0 == v1) lbl-1000:
        // 2 sources

        {
            var5_5 = var2_2.nextInt(3);
            for (var6_6 = 0; var6_6 < var5_5; ++var6_6) {
                var7_7 = var2_2.nextInt(16) + 8;
                var8_8 = var2_2.nextInt(16) + 8;
                var9_9 = var1_1.C(var3_3.a(var7_7, 0, var8_8));
                net.minecraft.A.A.L.a(var1_1, var2_2, var9_9);
                if (!var4_4) {
                    if (!var4_4) continue;
                }
                break;
            }
        } else {
            net.minecraft.A.A.h.a(d2.FERN);
        }
        for (var5_5 = 0; var5_5 < 7; ++var5_5) {
            var6_6 = var2_2.nextInt(16) + 8;
            var7_7 = var2_2.nextInt(16) + 8;
            var8_8 = var2_2.nextInt(var1_1.C(var3_3.a(var6_6, 0, var7_7)).b() + 32);
            net.minecraft.A.A.h.a(var1_1, var2_2, var3_3.a(var6_6, var8_8, var7_7));
            if (var4_4 != false) return;
            if (!var4_4) continue;
        }
        super.a(var1_1, var2_2, var3_3);
    }

    static {
        K = new k();
        H = new net.minecraft.p.l(false);
        M = new net.minecraft.p.h(false, false);
        J = new net.minecraft.p.h(false, true);
        L = new p(net.minecraft.u.g.x, 0);
    }
}

