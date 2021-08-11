/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class bj
extends K {
    private final /* synthetic */ boolean z;

    @Override
    public int a(z z2) {
        return 30;
    }

    @Override
    public int a(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block3: {
            bj bj2;
            block2: {
                boolean bl2 = cL.b();
                bj2 = this;
                if (bl2) break block2;
                if (!bj2.z) break block3;
                bj2 = this;
            }
            bj2.c(z2, n2);
        }
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block0: {
            if (this != g.cy) break block0;
            z2.a(n2, g.cu.d());
        }
    }

    public bj(boolean bl2) {
        boolean bl3 = cL.e();
        super(net.minecraft.ac.c.H);
        boolean bl4 = bl3;
        if (bl4) {
            if (bl2) {
                this.a(true);
            }
            this.z = bl2;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, x x2) {
        this.a(z2, n2);
        super.a(z2, n2, x2);
    }

    private void c(z z2, n n2) {
        Random random = z2.J;
        double d10 = 0.0625;
        boolean bl2 = cL.e();
        for (int i2 = 0; i2 < 6; ++i2) {
            double d11;
            double d12;
            double d13;
            block45: {
                int n3;
                block49: {
                    block48: {
                        block47: {
                            block46: {
                                block44: {
                                    block42: {
                                        double d14;
                                        block43: {
                                            int n4;
                                            block39: {
                                                block41: {
                                                    block40: {
                                                        block36: {
                                                            block38: {
                                                                block37: {
                                                                    block33: {
                                                                        block35: {
                                                                            block34: {
                                                                                block30: {
                                                                                    block32: {
                                                                                        block31: {
                                                                                            block28: {
                                                                                                block29: {
                                                                                                    d13 = (float)n2.e() + random.nextFloat();
                                                                                                    d12 = (float)n2.b() + random.nextFloat();
                                                                                                    d11 = (float)n2.a() + random.nextFloat();
                                                                                                    n3 = i2;
                                                                                                    if (!bl2) break block28;
                                                                                                    if (n3 != 0) break block29;
                                                                                                    n3 = z2.d(n2.a()).i() ? 1 : 0;
                                                                                                    if (!bl2) break block28;
                                                                                                    if (n3 == 0) {
                                                                                                        d12 = (double)n2.b() + 0.0625 + 1.0;
                                                                                                    }
                                                                                                }
                                                                                                n3 = i2;
                                                                                            }
                                                                                            n4 = 1;
                                                                                            if (!bl2) break block30;
                                                                                            if (n3 != n4) break block31;
                                                                                            n3 = z2.d(n2.k()).i() ? 1 : 0;
                                                                                            if (!bl2) break block32;
                                                                                            if (n3 == 0) {
                                                                                                d12 = (double)n2.b() - 0.0625;
                                                                                            }
                                                                                        }
                                                                                        n3 = i2;
                                                                                    }
                                                                                    n4 = 2;
                                                                                }
                                                                                if (!bl2) break block33;
                                                                                if (n3 != n4) break block34;
                                                                                n3 = z2.d(n2.j()).i() ? 1 : 0;
                                                                                if (!bl2) break block35;
                                                                                if (n3 == 0) {
                                                                                    d11 = (double)n2.a() + 0.0625 + 1.0;
                                                                                }
                                                                            }
                                                                            n3 = i2;
                                                                        }
                                                                        n4 = 3;
                                                                    }
                                                                    if (!bl2) break block36;
                                                                    if (n3 != n4) break block37;
                                                                    n3 = z2.d(n2.i()).i() ? 1 : 0;
                                                                    if (!bl2) break block38;
                                                                    if (n3 == 0) {
                                                                        d11 = (double)n2.a() - 0.0625;
                                                                    }
                                                                }
                                                                n3 = i2;
                                                            }
                                                            n4 = 4;
                                                        }
                                                        if (!bl2) break block39;
                                                        if (n3 != n4) break block40;
                                                        n3 = z2.d(n2.m()).i() ? 1 : 0;
                                                        if (!bl2) break block41;
                                                        if (n3 == 0) {
                                                            d13 = (double)n2.e() + 0.0625 + 1.0;
                                                        }
                                                    }
                                                    n3 = i2;
                                                }
                                                if (!bl2) break block42;
                                                n4 = 5;
                                            }
                                            if (n3 != n4) break block43;
                                            n3 = z2.d(n2.b()).i() ? 1 : 0;
                                            if (!bl2) break block42;
                                            if (n3 == 0) {
                                                d13 = (double)n2.e() - 0.0625;
                                            }
                                        }
                                        n3 = (d14 = d13 - (double)n2.e()) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                    }
                                    if (!bl2) break block44;
                                    if (n3 < 0) break block45;
                                    double d15 = d13 - (double)(n2.e() + 1);
                                    n3 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                }
                                if (!bl2) break block46;
                                if (n3 > 0) break block45;
                                double d16 = d12 - 0.0;
                                n3 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                            }
                            if (!bl2) break block47;
                            if (n3 < 0) break block45;
                            double d17 = d12 - (double)(n2.b() + 1);
                            n3 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                        }
                        if (!bl2) break block48;
                        if (n3 > 0) break block45;
                        double d18 = d11 - (double)n2.a();
                        n3 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                    }
                    if (!bl2) break block49;
                    if (n3 < 0) break block45;
                    double d19 = d11 - (double)(n2.a() + 1);
                    n3 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                }
                if (n3 <= 0) continue;
            }
            z2.a(aH.REDSTONE, d13, d12, d11, 0.0, 0.0, 0.0, new int[0]);
            if (bl2) continue;
        }
    }

    @Override
    public int a(int n2, Random random) {
        return this.a(random) + random.nextInt(n2 + 1);
    }

    @Override
    public void a(z z2, n n2, j j2) {
        this.a(z2, n2);
        super.a(z2, n2, j2);
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        this.a(z2, n2);
        return super.a(z2, n2, i2, j2, a32, aA2, f10, f11, f12);
    }

    @Override
    protected d q(i i2) {
        return new d(g.cu);
    }

    private void a(z z2, n n2) {
        block0: {
            this.c(z2, n2);
            if (this != g.cu) break block0;
            z2.a(n2, g.cy.d());
        }
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.a7;
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(net.minecraft.w.k.b(g.cu), 1, this.g(i2));
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        super.a(z2, n2, i2, f10, n3);
        if (this.a(i2, z2.J, n3) != net.minecraft.w.k.b(this)) {
            int n4 = 1 + z2.J.nextInt(5);
            this.a(z2, n2, n4);
        }
    }
}

