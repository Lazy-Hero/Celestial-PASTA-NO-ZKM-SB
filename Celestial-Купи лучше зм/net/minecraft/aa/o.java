/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.aA;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.k;
import net.minecraft.W.bw;
import net.minecraft.Z.i;
import net.minecraft.aA.d;
import net.minecraft.aA.h;
import net.minecraft.aA.j;
import net.minecraft.aA.v;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.m;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.p.A;
import net.minecraft.p.D;
import net.minecraft.p.E;
import net.minecraft.p.F;
import net.minecraft.p.L;
import net.minecraft.p.a;
import net.minecraft.p.q;
import net.minecraft.u.g;

public class o
implements v {
    private final /* synthetic */ D b;
    public final /* synthetic */ d j;
    private final /* synthetic */ A J;
    protected static final /* synthetic */ i a;
    private final /* synthetic */ E r;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ a p;
    private final /* synthetic */ d q;
    private final /* synthetic */ d v;
    private final /* synthetic */ F D;
    private final /* synthetic */ m u;
    private final /* synthetic */ d i;
    /* synthetic */ double[] n;
    private final /* synthetic */ d f;
    private /* synthetic */ double[] x;
    protected static final /* synthetic */ i z;
    /* synthetic */ double[] G;
    private /* synthetic */ double[] w;
    protected static final /* synthetic */ i I;
    /* synthetic */ double[] m;
    /* synthetic */ double[] h;
    private final /* synthetic */ h B;
    private final /* synthetic */ z C;
    private final /* synthetic */ q s;
    private final /* synthetic */ q A;
    private final /* synthetic */ a H;
    public final /* synthetic */ d E;
    private /* synthetic */ double[] k;
    protected static final /* synthetic */ i t;
    /* synthetic */ double[] d;
    protected static final /* synthetic */ i o;
    protected static final /* synthetic */ i l;
    private /* synthetic */ double[] y;
    private final /* synthetic */ Random F;
    private final /* synthetic */ d e;
    private final /* synthetic */ F c;

    public void b(int n2, int n3, l l2) {
        int n4 = 4;
        int n5 = this.C.y() / 2 + 1;
        boolean bl2 = net.minecraft.aA.h.b();
        int n6 = 5;
        int n7 = 17;
        int n8 = 5;
        this.y = this.a(this.y, n2 * 4, 0, n3 * 4, 5, 17, 5);
        int n9 = 0;
        block0: while (true) {
            int n10 = n9;
            block1: while (n10 < 4) {
                int n11 = 0;
                block2: while (true) {
                    int n12 = n11;
                    block3: while (n12 < 4) {
                        n10 = 0;
                        if (!bl2) continue block1;
                        int n13 = n10;
                        block4: while (true) {
                            int n14 = n13;
                            block5: while (n14 < 16) {
                                double d10 = 0.125;
                                double d11 = this.y[((n9 + 0) * 5 + n11 + 0) * 17 + n13 + 0];
                                double d12 = this.y[((n9 + 0) * 5 + n11 + 1) * 17 + n13 + 0];
                                double d13 = this.y[((n9 + 1) * 5 + n11 + 0) * 17 + n13 + 0];
                                double d14 = this.y[((n9 + 1) * 5 + n11 + 1) * 17 + n13 + 0];
                                double d15 = (this.y[((n9 + 0) * 5 + n11 + 0) * 17 + n13 + 1] - d11) * 0.125;
                                double d16 = (this.y[((n9 + 0) * 5 + n11 + 1) * 17 + n13 + 1] - d12) * 0.125;
                                double d17 = (this.y[((n9 + 1) * 5 + n11 + 0) * 17 + n13 + 1] - d13) * 0.125;
                                double d18 = (this.y[((n9 + 1) * 5 + n11 + 1) * 17 + n13 + 1] - d14) * 0.125;
                                n12 = 0;
                                if (!bl2) continue block3;
                                int n15 = n12;
                                block6: while (true) {
                                    int n16 = n15;
                                    block7: while (n16 < 8) {
                                        double d19 = 0.25;
                                        double d20 = d11;
                                        double d21 = d12;
                                        double d22 = (d13 - d11) * 0.25;
                                        double d23 = (d14 - d12) * 0.25;
                                        n14 = 0;
                                        if (!bl2) continue block5;
                                        int n17 = n14;
                                        block8: while (true) {
                                            int n18 = n17;
                                            int n19 = 4;
                                            block9: while (n18 < n19) {
                                                double d24 = 0.25;
                                                double d25 = d20;
                                                double d26 = (d21 - d20) * 0.25;
                                                n16 = 0;
                                                if (!bl2) continue block7;
                                                for (int i2 = v1850771; i2 < 4; ++i2) {
                                                    double d27;
                                                    i i3 = null;
                                                    n18 = n13 * 8 + n15;
                                                    n19 = n5;
                                                    if (!bl2) continue block9;
                                                    if (n18 < n19) {
                                                        i3 = l;
                                                    }
                                                    double d28 = (d27 = d25 - 0.0) == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                                                    if (bl2) {
                                                        if (d28 > 0) {
                                                            i3 = a;
                                                        }
                                                        d28 = n17 + n9 * 4;
                                                    }
                                                    double d29 = d28;
                                                    int n20 = n15 + n13 * 8;
                                                    int n21 = i2 + n11 * 4;
                                                    l2.a((int)d29, n20, n21, i3);
                                                    d25 += d26;
                                                    if (bl2) continue;
                                                }
                                                d20 += d22;
                                                d21 += d23;
                                                ++n17;
                                                if (bl2) continue block8;
                                            }
                                            break;
                                        }
                                        d11 += d15;
                                        d12 += d16;
                                        d13 += d17;
                                        d14 += d18;
                                        ++n15;
                                        if (bl2) continue block6;
                                    }
                                    break;
                                }
                                ++n13;
                                if (bl2) continue block4;
                            }
                            break;
                        }
                        ++n11;
                        if (bl2) continue block2;
                    }
                    break;
                }
                ++n9;
                if (bl2) continue block0;
            }
            break;
        }
    }

    public void a(int n2, int n3, l l2) {
        int n4 = this.C.y() + 1;
        double d10 = 0.03125;
        boolean bl2 = net.minecraft.aA.h.a();
        this.x = this.v.a(this.x, n2 * 16, n3 * 16, 0, 16, 16, 1, 0.03125, 0.03125, 1.0);
        this.w = this.v.a(this.w, n2 * 16, 109, n3 * 16, 16, 1, 16, 0.03125, 1.0, 0.03125);
        this.k = this.e.a(this.k, n2 * 16, n3 * 16, 0, 16, 16, 1, 0.0625, 0.0625, 0.0625);
        int n5 = 0;
        block0: while (true) {
            int n6 = n5;
            block1: while (n6 < 16) {
                int n7 = 0;
                block2: while (true) {
                    int n8 = n7;
                    int n9 = 16;
                    block3: while (n8 < n9) {
                        int n10;
                        double d11 = this.x[n5 + n7 * 16] + this.F.nextDouble() * 0.2 - 0.0;
                        n6 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (bl2) continue block1;
                        if (!bl2) {
                            n10 = n6 > 0 ? 1 : 0;
                        }
                        int n11 = n10;
                        double d12 = this.w[n5 + n7 * 16] + this.F.nextDouble() * 0.2 - 0.0;
                        double d13 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                        if (!bl2) {
                            d13 = d13 > 0 ? 1.0 : 0.0;
                        }
                        double d14 = d13;
                        int n12 = (int)(this.k[n5 + n7 * 16] / 3.0 + 3.0 + this.F.nextDouble() * 0.25);
                        int n13 = -1;
                        i i2 = a;
                        i i3 = a;
                        for (int i4 = 127; i4 >= 0; --i4) {
                            block20: {
                                block24: {
                                    block22: {
                                        int n14;
                                        block25: {
                                            block26: {
                                                block36: {
                                                    block37: {
                                                        int n15;
                                                        int n16;
                                                        block32: {
                                                            block33: {
                                                                i i5;
                                                                block34: {
                                                                    block35: {
                                                                        block30: {
                                                                            block31: {
                                                                                block29: {
                                                                                    block27: {
                                                                                        block28: {
                                                                                            i i6;
                                                                                            block23: {
                                                                                                i i7;
                                                                                                block21: {
                                                                                                    int n17;
                                                                                                    int n18;
                                                                                                    block19: {
                                                                                                        n8 = i4;
                                                                                                        n9 = 127 - this.F.nextInt(5);
                                                                                                        if (bl2) continue block3;
                                                                                                        if (bl2) break block19;
                                                                                                        if (n8 >= n9) break block20;
                                                                                                        n18 = i4;
                                                                                                        n17 = this.F.nextInt(5);
                                                                                                    }
                                                                                                    if (n18 <= n17) break block20;
                                                                                                    i6 = i7 = l2.b(n7, i4, n5);
                                                                                                    if (bl2) break block21;
                                                                                                    if (i6.b() == null) break block22;
                                                                                                    i6 = i7;
                                                                                                }
                                                                                                if (bl2) break block23;
                                                                                                if (i6.o() == net.minecraft.ac.c.A) break block22;
                                                                                                i6 = i7;
                                                                                            }
                                                                                            if (i6.b() != net.minecraft.u.g.j) break block24;
                                                                                            n14 = n13;
                                                                                            if (bl2) break block25;
                                                                                            if (n14 != -1) break block26;
                                                                                            n16 = n12;
                                                                                            if (bl2) break block27;
                                                                                            if (n16 > 0) break block28;
                                                                                            i2 = o;
                                                                                            i3 = a;
                                                                                            if (!bl2) break block29;
                                                                                        }
                                                                                        n16 = i4;
                                                                                    }
                                                                                    n15 = n4 - 4;
                                                                                    if (bl2) break block30;
                                                                                    if (n16 < n15) break block29;
                                                                                    n16 = i4;
                                                                                    n15 = n4 + 1;
                                                                                    if (bl2) break block30;
                                                                                    if (n16 > n15) break block29;
                                                                                    i2 = a;
                                                                                    i3 = a;
                                                                                    n16 = (int)d14;
                                                                                    if (!bl2) {
                                                                                        if (n16 != 0) {
                                                                                            i2 = z;
                                                                                            i3 = a;
                                                                                        }
                                                                                        n16 = n11;
                                                                                    }
                                                                                    if (bl2) break block31;
                                                                                    if (n16 != 0) {
                                                                                        i2 = I;
                                                                                        i3 = I;
                                                                                    }
                                                                                }
                                                                                n16 = i4;
                                                                            }
                                                                            n15 = n4;
                                                                        }
                                                                        if (bl2) break block32;
                                                                        if (n16 >= n15) break block33;
                                                                        i5 = i2;
                                                                        if (bl2) break block34;
                                                                        if (i5 == null) break block35;
                                                                        i5 = i2;
                                                                        if (bl2) break block34;
                                                                        if (i5.o() != net.minecraft.ac.c.A) break block33;
                                                                    }
                                                                    i5 = l;
                                                                }
                                                                i2 = i5;
                                                            }
                                                            n13 = n12;
                                                            if (bl2) break block36;
                                                            n16 = i4;
                                                            n15 = n4 - 1;
                                                        }
                                                        if (n16 < n15) break block37;
                                                        l2.a(n7, i4, n5, i2);
                                                        if (!bl2) break block24;
                                                    }
                                                    l2.a(n7, i4, n5, i3);
                                                }
                                                if (!bl2) break block24;
                                            }
                                            n14 = n13;
                                        }
                                        if (n14 <= 0) break block24;
                                        --n13;
                                        l2.a(n7, i4, n5, i3);
                                        if (!bl2) break block24;
                                    }
                                    n13 = -1;
                                }
                                if (!bl2) continue;
                            }
                            l2.a(n7, i4, n5, t);
                            if (!bl2) continue;
                        }
                        ++n7;
                        if (!bl2) continue block2;
                    }
                    break;
                }
                ++n5;
                if (!bl2) continue block0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<net.minecraft.A.d> a(k var1_1, n var2_2) {
        block7: {
            var3_3 = net.minecraft.aA.h.a();
            if (var1_1 != net.minecraft.U.k.MONSTER) ** GOTO lbl-1000
            v0 = this.u.a(var2_2);
            if (var3_3) break block7;
            if (v0) {
                return this.u.a();
            }
            v1 = this;
            if (var3_3) ** GOTO lbl20
            v0 = v1.u.a(this.C, var2_2);
        }
        ** if (!v0) goto lbl-1000
lbl-1000:
        // 1 sources

        {
            v2 = this.C;
            v3 = var2_2.k();
            if (!var3_3) {
                if (v2.d((n)v3).b() == net.minecraft.u.g.dk) {
                    return this.u.a();
                } else {
                    ** GOTO lbl-1000
                }
            } else {
                ** GOTO lbl17
            }
lbl17:
            // 2 sources

            ** GOTO lbl22
        }
lbl-1000:
        // 4 sources

        {
            v1 = this;
lbl20:
            // 2 sources

            v2 = v1.C;
            v3 = var2_2;
        }
lbl22:
        // 2 sources

        var4_4 = v2.c(v3);
        return var4_4.a(var1_1);
    }

    @Override
    public void b(int n2, int n3) {
        block27: {
            int n4;
            boolean bl2;
            net.minecraft.A.h h2;
            n n5;
            int n6;
            int n7;
            block26: {
                int n8;
                block25: {
                    boolean bl3;
                    block28: {
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        bw.z = true;
                                        n7 = n2 * 16;
                                        n6 = n3 * 16;
                                        n5 = new n(n7, 0, n6);
                                        h2 = this.C.c(n5.a(16, 0, 16));
                                        bl2 = net.minecraft.aA.h.a();
                                        f f10 = new f(n2, n3);
                                        this.u.a(this.C, this.F, f10);
                                        for (n8 = 0; n8 < 8; ++n8) {
                                            this.D.a(this.C, this.F, n5.a(this.F.nextInt(16) + 8, this.F.nextInt(120) + 4, this.F.nextInt(16) + 8));
                                            if (!bl2) {
                                                if (!bl2) continue;
                                            }
                                            break block21;
                                        }
                                        n8 = 0;
                                    }
                                    while (n8 < this.F.nextInt(this.F.nextInt(10) + 1) + 1) {
                                        this.J.a(this.C, this.F, n5.a(this.F.nextInt(16) + 8, this.F.nextInt(120) + 4, this.F.nextInt(16) + 8));
                                        ++n8;
                                        if (!bl2) {
                                            if (!bl2) continue;
                                        }
                                        break block22;
                                    }
                                    n8 = 0;
                                }
                                while (n8 < this.F.nextInt(this.F.nextInt(10) + 1)) {
                                    this.b.a(this.C, this.F, n5.a(this.F.nextInt(16) + 8, this.F.nextInt(120) + 4, this.F.nextInt(16) + 8));
                                    ++n8;
                                    if (!bl2) {
                                        if (!bl2) continue;
                                    }
                                    break block23;
                                }
                                n8 = 0;
                            }
                            while (n8 < 10) {
                                this.r.a(this.C, this.F, n5.a(this.F.nextInt(16) + 8, this.F.nextInt(128), this.F.nextInt(16) + 8));
                                ++n8;
                                if (!bl2) {
                                    if (!bl2) continue;
                                }
                                break block24;
                            }
                            bl3 = this.F.nextBoolean();
                            if (bl2) break block28;
                            if (bl3) {
                                this.A.a(this.C, this.F, n5.a(this.F.nextInt(16) + 8, this.F.nextInt(128), this.F.nextInt(16) + 8));
                            }
                        }
                        bl3 = this.F.nextBoolean();
                    }
                    if (!bl2) {
                        if (bl3) {
                            this.s.a(this.C, this.F, n5.a(this.F.nextInt(16) + 8, this.F.nextInt(128), this.F.nextInt(16) + 8));
                        }
                        bl3 = false;
                    }
                    for (n8 = (int)((v1851740) ? 1 : 0); n8 < 16; ++n8) {
                        this.H.a(this.C, this.F, n5.a(this.F.nextInt(16), this.F.nextInt(108) + 10, this.F.nextInt(16)));
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block25;
                    }
                    n8 = this.C.y() / 2 + 1;
                }
                for (n4 = 0; n4 < 4; ++n4) {
                    this.p.a(this.C, this.F, n5.a(this.F.nextInt(16), n8 - 5 + this.F.nextInt(10), this.F.nextInt(16)));
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block26;
                }
                n4 = 0;
            }
            while (n4 < 16) {
                this.c.a(this.C, this.F, n5.a(this.F.nextInt(16), this.F.nextInt(108) + 10, this.F.nextInt(16)));
                ++n4;
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block27;
            }
            h2.a(this.C, this.F, new n(n7, 0, n6));
            bw.z = false;
        }
    }

    @Override
    public void a(net.minecraft.o.a a10, int n2, int n3) {
        this.u.a(this.C, n2, n3, null);
    }

    @Override
    public net.minecraft.o.a a(int n2, int n3) {
        net.minecraft.o.a a10;
        block6: {
            boolean bl2;
            l l2;
            block8: {
                o o2;
                block7: {
                    this.F.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
                    boolean bl3 = net.minecraft.aA.h.a();
                    l2 = new l();
                    this.b(n2, n3, l2);
                    this.a(n2, n3, l2);
                    bl2 = bl3;
                    this.B.a(this.C, n2, n3, l2);
                    o2 = this;
                    if (bl2) break block7;
                    if (!o2.g) break block8;
                    o2 = this;
                }
                o2.u.a(this.C, n2, n3, l2);
            }
            a10 = new net.minecraft.o.a(this.C, l2, n2, n3);
            net.minecraft.A.h[] arrh = this.C.B().b(null, n2 * 16, n3 * 16, 16, 16);
            byte[] arrby = a10.g();
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                arrby[i2] = (byte)net.minecraft.A.h.b(arrh[i2]);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block6;
            }
            a10.h();
        }
        return a10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private double[] a(double[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        block21: {
            block20: {
                var8_8 = net.minecraft.aA.h.a();
                v0 = var1_1;
                if (var8_8) break block20;
                if (v0 != null) break block21;
                v0 = new double[var5_5 * var6_6 * var7_7];
            }
            var1_1 = v0;
        }
        var9_9 = 684.412;
        var11_10 = 2053.236;
        this.m = this.j.a(this.m, var2_2, var3_3, var4_4, var5_5, 1, var7_7, 1.0, 0.0, 1.0);
        this.d = this.E.a(this.d, var2_2, var3_3, var4_4, var5_5, 1, var7_7, 100.0, 0.0, 100.0);
        this.n = this.i.a(this.n, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, 8.555150000000001, 34.2206, 8.555150000000001);
        this.G = this.f.a(this.G, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, 684.412, 2053.236, 684.412);
        this.h = this.q.a(this.h, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, 684.412, 2053.236, 684.412);
        var13_11 = 0;
        var14_12 = new double[var6_6];
        for (var15_13 = 0; var15_13 < var6_6; ++var15_13) {
            block23: {
                block22: {
                    var14_12[var15_13] = Math.cos((double)var15_13 * 3.141592653589793 * 6.0 / (double)var6_6) * 2.0;
                    var16_14 = var15_13;
                    v1 = var15_13;
                    if (var8_8) break block22;
                    v2 = var6_6 / 2;
                    if (var8_8) ** GOTO lbl46
                    if (v1 > v2) {
                        var16_14 = var6_6 - 1 - var15_13;
                    }
                    v3 = var16_14;
                    v4 = 4.0;
                    if (var8_8) break block23;
                    cfr_temp_0 = v3 - v4;
                    v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                }
                if (v1 >= 0) continue;
                v3 = 4.0;
                v4 = var16_14;
            }
            var16_14 = v3 - v4;
            v5 = var15_13;
            var14_12[v5] = var14_12[v5] - var16_14 * var16_14 * var16_14 * 10.0;
            if (!var8_8) continue;
        }
        var15_13 = 0;
        do {
            v6 = var15_13;
            block2: while (true) {
                v2 = var5_5;
lbl46:
                // 2 sources

                if (v6 >= v2) return var1_1;
                var16_16 = 0;
                block3: while (true) {
                    v7 = var16_16;
                    block4: while (v7 < var7_7) {
                        var17_17 = 0.0;
                        v6 = 0;
                        if (var8_8) continue block2;
                        for (var19_18 = v1854302; var19_18 < var6_6; ++var13_11, ++var19_18) {
                            block31: {
                                block30: {
                                    block29: {
                                        block26: {
                                            block27: {
                                                block28: {
                                                    block24: {
                                                        block25: {
                                                            var20_19 = var14_12[var19_18];
                                                            var22_20 = this.G[var13_11] / 512.0;
                                                            var24_21 = this.h[var13_11] / 512.0;
                                                            var26_22 = (this.n[var13_11] / 10.0 + 1.0) / 2.0;
                                                            cfr_temp_1 = var26_22 - 0.0;
                                                            v7 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            if (var8_8) continue block4;
                                                            if (var8_8) break block24;
                                                            if (v7 >= 0) break block25;
                                                            var28_23 = var22_20;
                                                            if (!var8_8) break block26;
                                                        }
                                                        v8 = var26_22;
                                                        v9 = 1.0;
                                                        if (var8_8) break block27;
                                                        cfr_temp_2 = v8 - v9;
                                                        v10 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                    }
                                                    if (v10 <= 0) break block28;
                                                    var28_23 = var24_21;
                                                    if (!var8_8) break block26;
                                                }
                                                v8 = var22_20;
                                                v9 = (var24_21 - var22_20) * var26_22;
                                            }
                                            var28_23 = v8 + v9;
                                        }
                                        var28_23 -= var20_19;
                                        v11 = var19_18;
                                        if (var8_8) break block29;
                                        if (v11 > var6_6 - 4) {
                                            var30_24 = (float)(var19_18 - (var6_6 - 4)) / 3.0f;
                                            var28_23 = var28_23 * (1.0 - var30_24) + -10.0 * var30_24;
                                        }
                                        v12 = var19_18;
                                        v13 = 0.0;
                                        if (var8_8) break block30;
                                        cfr_temp_3 = v12 - v13;
                                        v11 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                    }
                                    if (v11 >= 0) break block31;
                                    v12 = 0.0 - (double)var19_18;
                                    v13 = 4.0;
                                }
                                var30_24 = v12 / v13;
                                var30_24 = net.minecraft.k.h.b(var30_24, 0.0, 1.0);
                                var28_23 = var28_23 * (1.0 - var30_24) + -10.0 * var30_24;
                            }
                            var1_1[var13_11] = var28_23;
                            if (!var8_8) continue;
                        }
                        ++var16_16;
                        if (!var8_8) continue block3;
                    }
                    break block2;
                    break;
                }
                break;
            }
            ++var15_13;
        } while (!var8_8);
        return var1_1;
    }

    public o(z z2, boolean bl2, long l2) {
        this.x = new double[256];
        this.w = new double[256];
        this.k = new double[256];
        this.J = new A();
        this.b = new D();
        this.r = new E();
        this.H = new L(net.minecraft.u.g.u.d(), 14, net.minecraft.au.a.a(net.minecraft.u.g.j));
        this.p = new L(net.minecraft.u.g.bR.d(), 33, net.minecraft.au.a.a(net.minecraft.u.g.j));
        this.c = new F(net.minecraft.u.g.ag, true);
        this.D = new F(net.minecraft.u.g.ag, false);
        this.A = new q(net.minecraft.u.g.cg);
        this.s = new q(net.minecraft.u.g.z);
        this.u = new m();
        this.B = new j();
        this.C = z2;
        this.g = bl2;
        this.F = new Random(l2);
        this.f = new d(this.F, 16);
        this.q = new d(this.F, 16);
        this.i = new d(this.F, 8);
        this.v = new d(this.F, 4);
        this.e = new d(this.F, 4);
        this.j = new d(this.F, 10);
        this.E = new d(this.F, 16);
        z2.b(63);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public n a(z z2, String string, n n2, boolean bl2) {
        boolean bl3 = net.minecraft.aA.h.b();
        if (!"Fortress".equals(string)) return null;
        m m2 = this.u;
        if (bl3) {
            if (m2 == null) return null;
            m2 = this.u;
        }
        n n3 = m2.a(z2, n2, bl2);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, String string, n n2) {
        boolean bl2 = net.minecraft.aA.h.b();
        if (!"Fortress".equals(string)) return false;
        m m2 = this.u;
        if (bl2) {
            if (m2 == null) return false;
            m2 = this.u;
        }
        boolean bl3 = m2.a(n2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean b(net.minecraft.o.a a10, int n2, int n3) {
        return false;
    }

    static {
        o = net.minecraft.u.g.bf.d();
        a = net.minecraft.u.g.j.d();
        t = net.minecraft.u.g.g.d();
        l = net.minecraft.u.g.bq.d();
        z = net.minecraft.u.g.di.d();
        I = net.minecraft.u.g.br.d();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

