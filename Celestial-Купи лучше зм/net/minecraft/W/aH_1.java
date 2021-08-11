/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.b2;
import net.minecraft.W.bR;
import net.minecraft.W.bc;
import net.minecraft.W.cL;
import net.minecraft.W.cQ;
import net.minecraft.W.cs;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.p.c;
import net.minecraft.p.e;
import net.minecraft.p.g;
import net.minecraft.p.h;
import net.minecraft.p.i;
import net.minecraft.p.l;
import net.minecraft.p.m;

public class aH
extends Y
implements cs {
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ d<D> C;
    public static final /* synthetic */ f A;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void d(z var1_1, n var2_2, net.minecraft.Z.i var3_3, Random var4_4) {
        block25: {
            block26: {
                block24: {
                    var5_5 = cL.b();
                    var6_6 /* !! */  = var4_4.nextInt(10) == 0 ? new c(true) : new m(true);
                    var7_22 = 0;
                    var8_23 = 0;
                    var9_24 = 0;
                    v0 = cQ.a[var3_3.b(aH.C).ordinal()];
                    if (var5_5) ** GOTO lbl11
                    switch (v0) {
                        case 1: {
                            v0 = 0;
lbl11:
                            // 2 sources

                            var7_22 = v0;
                            block7: while (true) {
                                v1 = var7_22;
                                block8: while (v1 >= -1) {
                                    v2 = 0;
                                    if (var5_5) ** GOTO lbl28
                                    for (var8_23 = v1357475; var8_23 >= -1; --var8_23) {
                                        v1 = (int)this.a(var1_1, var2_2, var7_22, var8_23, D.SPRUCE);
                                        if (var5_5) continue block8;
                                        if (v1 == 0) continue;
                                        var6_8 = new h(false, var4_4.nextBoolean());
                                        var9_24 = 1;
                                        if (!var5_5) break block7;
                                        if (!var5_5) continue;
                                    }
                                    --var7_22;
                                    if (!var5_5) continue block7;
                                }
                                break;
                            }
                            v2 = var9_24;
lbl28:
                            // 2 sources

                            if (!var5_5) {
                                if (v2 != 0) break;
                                var7_22 = 0;
                                v2 = 0;
                            }
                            var8_23 = v2;
                            var6_9 = new l(true);
                            if (!var5_5) break;
                        }
                        case 2: {
                            var6_11 = new net.minecraft.p.d(true, false);
                            if (!var5_5) break;
                        }
                        case 3: {
                            var10_25 = net.minecraft.u.g.bu.d().a(bc.B, D.JUNGLE);
                            var11_26 = net.minecraft.u.g.bU.d().a(bR.D, D.JUNGLE).a(b2.A, false);
                            var7_22 = 0;
                            block10: while (true) {
                                v3 = var7_22;
                                block11: while (v3 >= -1) {
                                    v4 = 0;
                                    if (var5_5) ** GOTO lbl58
                                    for (var8_23 = v1357627; var8_23 >= -1; --var8_23) {
                                        v3 = (int)this.a(var1_1, var2_2, var7_22, var8_23, D.JUNGLE);
                                        if (var5_5) continue block11;
                                        if (v3 == 0) continue;
                                        var6_14 = new g(true, 10, 20, var10_25, var11_26);
                                        var9_24 = 1;
                                        if (!var5_5) break block10;
                                        if (!var5_5) continue;
                                    }
                                    --var7_22;
                                    if (!var5_5) continue block10;
                                }
                                break;
                            }
                            v4 = var9_24;
lbl58:
                            // 2 sources

                            if (!var5_5) {
                                if (v4 != 0) break;
                                var7_22 = 0;
                                var8_23 = 0;
                                var6_15 = new m(true, 4 + var4_4.nextInt(7), var10_25, var11_26, false);
                                if (!var5_5) break;
                            }
                            break block24;
                        }
                        case 4: {
                            var6_17 = new i(true);
                            if (!var5_5) break;
                        }
                        case 5: {
                            var7_22 = 0;
                            block13: while (true) {
                                v5 = var7_22;
                                block14: while (v5 >= -1) {
                                    v6 = 0;
                                    if (var5_5) ** GOTO lbl86
                                    for (var8_23 = v1357573; var8_23 >= -1; --var8_23) {
                                        v5 = (int)this.a(var1_1, var2_2, var7_22, var8_23, D.DARK_OAK);
                                        if (var5_5) continue block14;
                                        if (v5 == 0) continue;
                                        var6_20 = new e(true);
                                        var9_24 = 1;
                                        if (!var5_5) break block13;
                                        if (!var5_5) continue;
                                    }
                                    --var7_22;
                                    if (!var5_5) continue block13;
                                }
                                break;
                            }
                            v6 = var9_24;
lbl86:
                            // 2 sources

                            if (v6 != 0) break;
                            return;
                        }
                    }
                    var10_25 = net.minecraft.u.g.bf.d();
                    v4 = var9_24;
                }
                if (var5_5) break block25;
                if (v4 == 0) break block26;
                var1_1.a(var2_2.a(var7_22, 0, var8_23), var10_25, 4);
                var1_1.a(var2_2.a(var7_22 + 1, 0, var8_23), var10_25, 4);
                var1_1.a(var2_2.a(var7_22, 0, var8_23 + 1), var10_25, 4);
                var1_1.a(var2_2.a(var7_22 + 1, 0, var8_23 + 1), var10_25, 4);
                if (!var5_5) break block25;
            }
            v4 = (int)var1_1.a(var2_2, var10_25, 4);
        }
        v7 = var6_21.a(var1_1, var4_4, var2_2.a(var7_22, 0, var8_23));
        if (!var5_5) {
            if (v7 != 0) return;
            v7 = var9_24;
        }
        if (var5_5 != false) return;
        if (v7 != 0) {
            var1_1.a(var2_2.a(var7_22, 0, var8_23), var3_3, 4);
            var1_1.a(var2_2.a(var7_22 + 1, 0, var8_23), var3_3, 4);
            var1_1.a(var2_2.a(var7_22, 0, var8_23 + 1), var3_3, 4);
            var1_1.a(var2_2.a(var7_22 + 1, 0, var8_23 + 1), var3_3, 4);
            if (var5_5 == false) return;
        }
        v7 = (int)var1_1.a(var2_2, var3_3, 4);
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a(this.k() + "." + D.OAK.c() + ".name");
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C, A);
    }

    protected aH() {
        this.h(this.e.a().a(C, D.OAK).a(A, 0));
        this.a(net.minecraft.ad.a.j);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(z z2, n n2, D d10) {
        net.minecraft.Z.i i2 = z2.d(n2);
        boolean bl2 = cL.e();
        net.minecraft.Z.i i3 = i2;
        if (bl2) {
            if (i3.b() != this) return false;
            i3 = i2;
        }
        if (i3.b(C) != d10) return false;
        return true;
    }

    @Override
    public int g(net.minecraft.Z.i i2) {
        return i2.b(C).b();
    }

    @Override
    public net.minecraft.Z.i c(int n2) {
        return this.d().a(C, D.a(n2 & 7)).a(A, (n2 & 8) >> 3);
    }

    public void c(z z2, n n2, net.minecraft.Z.i i2, Random random) {
        block2: {
            block1: {
                boolean bl2;
                block0: {
                    bl2 = cL.b();
                    int n3 = i2.b(A);
                    if (bl2) break block0;
                    if (n3 != 0) break block1;
                    n3 = (int)((z2.a(n2, i2.a(A), 4) ? true : false) ? true : false);
                }
                if (!bl2) break block2;
            }
            this.d(z2, n2, i2, random);
        }
    }

    static {
        C = d.a("type", D.class);
        A = f.a("stage", 0, 1);
        B = new k(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);
    }

    @Override
    public void a(z z2, n n2, net.minecraft.Z.i i2, Random random) {
        block2: {
            int n3;
            block3: {
                boolean bl2;
                block1: {
                    bl2 = cL.e();
                    n3 = z2.C;
                    if (!bl2) break block1;
                    if (n3 != 0) break block2;
                    super.a(z2, n2, i2, random);
                    n3 = z2.s(n2.a());
                }
                if (!bl2) break block3;
                if (n3 < 9) break block2;
                n3 = random.nextInt(7);
            }
            if (n3 == 0) {
                this.c(z2, n2, i2, random);
            }
        }
    }

    @Override
    public k a(net.minecraft.Z.i i2, t t2, n n2) {
        return B;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, n n2, net.minecraft.Z.i i2, boolean bl2) {
        return true;
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        D[] arrd = D.values();
        boolean bl2 = cL.e();
        for (D d10 : arrd) {
            a22.add(new net.minecraft.w.d(this, 1, d10.b()));
            if (bl2) continue;
        }
    }

    @Override
    public boolean a(z z2, Random random, n n2, net.minecraft.Z.i i2) {
        boolean bl2 = cL.b();
        double d10 = (double)z2.J.nextFloat() - 0.45;
        double d11 = d10 == 0.0 ? false : (d10 < 0.0 ? BADBOOL -1 : true);
        if (!bl2) {
            d11 = d11 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    @Override
    public void b(z z2, Random random, n n2, net.minecraft.Z.i i2) {
        this.c(z2, n2, i2, random);
    }

    @Override
    public int d(net.minecraft.Z.i i2) {
        int n2 = 0;
        n2 |= i2.b(C).b();
        return n2 |= i2.b(A) << 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(z z2, n n2, int n3, int n4, D d10) {
        boolean bl2 = cL.b();
        boolean bl3 = this.a(z2, n2.a(n3, 0, n4), d10);
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.a(z2, n2.a(n3 + 1, 0, n4), d10);
        }
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.a(z2, n2.a(n3, 0, n4 + 1), d10);
        }
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.a(z2, n2.a(n3 + 1, 0, n4 + 1), d10);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }
}

