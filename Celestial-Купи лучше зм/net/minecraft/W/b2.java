/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.w.k;

public abstract class b2
extends K {
    protected /* synthetic */ boolean B;
    public static final /* synthetic */ c A;
    public static final /* synthetic */ c C;
    /* synthetic */ int[] z;

    public void a(boolean bl2) {
        this.B = bl2;
    }

    static {
        C = net.minecraft.ae.c.a("decayable");
        A = net.minecraft.ae.c.a("check_decay");
    }

    protected int a(i i2) {
        return 20;
    }

    public b2() {
        super(net.minecraft.ac.c.J);
        this.a(true);
        this.a(net.minecraft.ad.a.j);
        this.c(0.2f);
        this.d(1);
        this.a(d_.k);
    }

    public abstract D a(int var1);

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block10: {
            int n4;
            block14: {
                int n5;
                block15: {
                    boolean bl2;
                    block13: {
                        block11: {
                            block12: {
                                int n6;
                                block9: {
                                    bl2 = cL.e();
                                    n6 = z2.C;
                                    if (!bl2) break block9;
                                    if (n6 != 0) break block10;
                                    n6 = this.a(i2);
                                }
                                n4 = n6;
                                n5 = n3;
                                if (!bl2) break block11;
                                if (n5 <= 0) break block12;
                                n5 = n4 -= 2 << n3;
                                if (!bl2) break block11;
                                if (n5 < 10) {
                                    n4 = 10;
                                }
                            }
                            n5 = z2.J.nextInt(n4);
                        }
                        if (bl2) {
                            if (n5 == 0) {
                                k k2 = this.a(i2, z2.J, n3);
                                b2.a(z2, n2, new d(k2, 1, this.g(i2)));
                            }
                            n4 = 200;
                            n5 = n3;
                        }
                        if (!bl2) break block13;
                        if (n5 <= 0) break block14;
                        n5 = n4 -= 10 << n3;
                    }
                    if (!bl2) break block15;
                    if (n5 >= 40) break block14;
                    n5 = 40;
                }
                n4 = n5;
            }
            this.b(z2, n2, i2, n4);
        }
    }

    @Override
    public aC p() {
        return this.B ? aC.CUTOUT_MIPPED : aC.SOLID;
    }

    protected void b(z z2, n n2, i i2, int n3) {
    }

    @Override
    public boolean p(i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.B;
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.dj);
    }

    private void a(z z2, n n2) {
        this.a(z2, n2, z2.d(n2), 0);
        z2.v(n2);
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block11: {
            int n3;
            boolean bl2;
            block10: {
                boolean bl3 = true;
                int n4 = 2;
                bl2 = cL.e();
                int n5 = n2.e();
                int n6 = n2.b();
                int n7 = n2.a();
                n3 = z2.a(new n(n5 - 2, n6 - 2, n7 - 2), new n(n5 + 2, n6 + 2, n7 + 2));
                if (!bl2) break block10;
                if (n3 == 0) break block11;
                n3 = -1;
            }
            int n8 = n3;
            block0: while (true) {
                int n9 = n8;
                block1: while (n9 <= 1) {
                    int n10 = -1;
                    while (n10 <= 1) {
                        block9: {
                            n9 = -1;
                            if (!bl2) continue block1;
                            int n11 = n9;
                            while (n11 <= 1) {
                                n n12 = n2.a(n8, n10, n11);
                                i i3 = z2.d(n12);
                                if (bl2) {
                                    if (bl2) {
                                        if (i3.o() == net.minecraft.ac.c.J) {
                                            boolean bl4 = i3.b(A);
                                            if (bl2 && !bl4) {
                                                bl4 = z2.a(n12, i3.a(A, true), 4);
                                            }
                                        }
                                        ++n11;
                                    }
                                    if (bl2) continue;
                                }
                                break block9;
                            }
                            ++n10;
                        }
                        if (bl2) continue;
                    }
                    ++n8;
                    if (bl2) continue block0;
                }
                break;
            }
        }
    }

    @Override
    public int a(Random random) {
        boolean bl2 = cL.b();
        int n2 = random.nextInt(20);
        if (!bl2) {
            n2 = n2 == 0 ? 1 : 0;
        }
        return n2;
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block3: {
            int n3;
            block5: {
                boolean bl2;
                block4: {
                    block2: {
                        bl2 = cL.b();
                        n3 = z2.t(n2.a());
                        if (bl2) break block2;
                        if (n3 == 0) break block3;
                        n3 = z2.d(n2.k()).d();
                    }
                    if (bl2) break block4;
                    if (n3 != 0) break block3;
                    n3 = random.nextInt(15);
                }
                if (bl2) break block5;
                if (n3 != 1) break block3;
                n3 = n2.e();
            }
            double d10 = (float)n3 + random.nextFloat();
            double d11 = (double)n2.b() - 0.05;
            double d12 = (float)n2.a() + random.nextFloat();
            z2.a(aH.DRIP_WATER, d10, d11, d12, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block36: {
            block47: {
                boolean bl2;
                block46: {
                    int n3;
                    int n4;
                    block34: {
                        block41: {
                            int n5;
                            int n6;
                            int n7;
                            int n8;
                            block32: {
                                int n9;
                                int n10;
                                int n11;
                                block40: {
                                    block39: {
                                        int n12;
                                        block38: {
                                            block37: {
                                                block35: {
                                                    bl2 = cL.e();
                                                    n12 = z2.C;
                                                    if (!bl2) break block35;
                                                    if (n12 != 0) break block36;
                                                    n12 = i2.b(A).booleanValue();
                                                }
                                                if (!bl2) break block37;
                                                if (n12 == 0) break block36;
                                                n12 = i2.b(C).booleanValue() ? 1 : 0;
                                            }
                                            if (!bl2) break block38;
                                            if (n12 == 0) break block36;
                                            n12 = 4;
                                        }
                                        int n13 = n12;
                                        int n14 = 5;
                                        n11 = n2.e();
                                        n10 = n2.b();
                                        n9 = n2.a();
                                        int n15 = 32;
                                        int n16 = 1024;
                                        int n17 = 16;
                                        b2 b22 = this;
                                        if (!bl2) break block39;
                                        if (b22.z != null) break block40;
                                        b22 = this;
                                    }
                                    b22.z = new int[32768];
                                }
                                n4 = z2.a(new n(n11 - 5, n10 - 5, n9 - 5), new n(n11 + 5, n10 + 5, n9 + 5));
                                if (!bl2) break block34;
                                if (n4 == 0) break block41;
                                o o2 = new o();
                                n8 = -4;
                                block0: while (true) {
                                    int n13 = n8;
                                    block1: while (n13 <= 4) {
                                        n7 = -4;
                                        if (!bl2) break block32;
                                        n6 = n7;
                                        while (n6 <= 4) {
                                            block33: {
                                                n13 = -4;
                                                if (!bl2) continue block1;
                                                for (n5 = v1342461; n5 <= 4; ++n5) {
                                                    block43: {
                                                        K k2;
                                                        K k3;
                                                        i i3;
                                                        block42: {
                                                            i3 = z2.d(o2.a(n11 + n8, n10 + n6, n9 + n5));
                                                            K k4 = i3.b();
                                                            if (!bl2) break block33;
                                                            K k2 = k4;
                                                            k2 = g.bu;
                                                            if (!bl2) break block42;
                                                            if (k3 == k2) break block43;
                                                            K k2 = k4;
                                                            k2 = g.aB;
                                                        }
                                                        if (k3 != k2) {
                                                            if (i3.o() == net.minecraft.ac.c.J) {
                                                                this.z[(n8 + 16) * 1024 + (n6 + 16) * 32 + n5 + 16] = -2;
                                                                if (bl2) continue;
                                                            }
                                                            this.z[(n8 + 16) * 1024 + (n6 + 16) * 32 + n5 + 16] = -1;
                                                            if (bl2) continue;
                                                        }
                                                    }
                                                    this.z[(n8 + 16) * 1024 + (n6 + 16) * 32 + n5 + 16] = 0;
                                                    if (bl2) continue;
                                                }
                                                ++n6;
                                            }
                                            if (bl2) continue;
                                        }
                                        ++n8;
                                        if (bl2) continue block0;
                                    }
                                    break;
                                }
                                n7 = 1;
                            }
                            n8 = n7;
                            block4: while (true) {
                                int n14 = n8;
                                block5: while (n14 <= 4) {
                                    n4 = -4;
                                    if (!bl2) break block34;
                                    n6 = n4;
                                    block6: while (true) {
                                        int n15 = n6;
                                        block7: while (n15 <= 4) {
                                            n14 = -4;
                                            if (!bl2) continue block5;
                                            n5 = n14;
                                            block8: while (true) {
                                                int n17 = n5;
                                                n17 = 4;
                                                block9: while (n16 <= n17) {
                                                    n15 = -4;
                                                    if (!bl2) continue block7;
                                                    for (int i4 = v1342559; i4 <= 4; ++i4) {
                                                        block45: {
                                                            int n18;
                                                            int[] arrn;
                                                            int n19;
                                                            int n20;
                                                            block44: {
                                                                int n17 = this.z[(n6 + 16) * 1024 + (n5 + 16) * 32 + i4 + 16];
                                                                n17 = n8 - 1;
                                                                if (!bl2) continue block9;
                                                                if (bl2) {
                                                                    if (n16 != n17) continue;
                                                                    int n19 = this.z[(n6 + 16 - 1) * 1024 + (n5 + 16) * 32 + i4 + 16];
                                                                    n19 = -2;
                                                                }
                                                                if (bl2) {
                                                                    if (n20 == n19) {
                                                                        this.z[(n6 + 16 - 1) * 1024 + (n5 + 16) * 32 + i4 + 16] = n8;
                                                                    }
                                                                    int n19 = this.z[(n6 + 16 + 1) * 1024 + (n5 + 16) * 32 + i4 + 16];
                                                                    n19 = -2;
                                                                }
                                                                if (bl2) {
                                                                    if (n20 == n19) {
                                                                        this.z[(n6 + 16 + 1) * 1024 + (n5 + 16) * 32 + i4 + 16] = n8;
                                                                    }
                                                                    int n19 = this.z[(n6 + 16) * 1024 + (n5 + 16 - 1) * 32 + i4 + 16];
                                                                    n19 = -2;
                                                                }
                                                                if (bl2) {
                                                                    if (n20 == n19) {
                                                                        this.z[(n6 + 16) * 1024 + (n5 + 16 - 1) * 32 + i4 + 16] = n8;
                                                                    }
                                                                    int n19 = this.z[(n6 + 16) * 1024 + (n5 + 16 + 1) * 32 + i4 + 16];
                                                                    n19 = -2;
                                                                }
                                                                if (bl2) {
                                                                    if (n20 == n19) {
                                                                        this.z[(n6 + 16) * 1024 + (n5 + 16 + 1) * 32 + i4 + 16] = n8;
                                                                    }
                                                                    int n19 = this.z[(n6 + 16) * 1024 + (n5 + 16) * 32 + (i4 + 16 - 1)];
                                                                    n19 = -2;
                                                                }
                                                                if (!bl2) break block44;
                                                                if (n20 == n19) {
                                                                    this.z[(n6 + 16) * 1024 + (n5 + 16) * 32 + (i4 + 16 - 1)] = n8;
                                                                }
                                                                arrn = this.z;
                                                                n18 = (n6 + 16) * 1024 + (n5 + 16) * 32 + i4 + 16 + 1;
                                                                if (!bl2) break block45;
                                                                int n19 = arrn[n18];
                                                                n19 = -2;
                                                            }
                                                            if (n20 != n19) continue;
                                                            arrn = this.z;
                                                            n18 = (n6 + 16) * 1024 + (n5 + 16) * 32 + i4 + 16 + 1;
                                                        }
                                                        arrn[n18] = n8;
                                                        if (bl2) continue;
                                                    }
                                                    ++n5;
                                                    if (bl2) continue block8;
                                                }
                                                break;
                                            }
                                            ++n6;
                                            if (bl2) continue block6;
                                        }
                                        break;
                                    }
                                    ++n8;
                                    if (bl2) continue block4;
                                }
                                break;
                            }
                        }
                        n4 = this.z[16912];
                    }
                    int n21 = n3 = n4;
                    if (!bl2) break block46;
                    if (n21 < 0) break block47;
                    n21 = z2.a(n2, i2.a(A, false), 4) ? 1 : 0;
                }
                if (bl2) break block36;
            }
            this.a(z2, n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.B;
        if (!bl2) {
            if (!bl3) {
                if (t2.d(n2.a(aA2)).b() == this) return false;
            }
            bl3 = super.b(i2, t2, n2, aA2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean n(i i2) {
        return false;
    }
}

