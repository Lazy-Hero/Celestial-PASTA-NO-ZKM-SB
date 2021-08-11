/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.u;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.u.C;
import net.minecraft.client.u.aD;
import net.minecraft.client.u.ab;
import net.minecraft.client.u.av;
import net.minecraft.k.h;
import net.minecraft.u.E;
import net.minecraft.w.P;

public class aT
extends av {
    private /* synthetic */ int P;
    private /* synthetic */ u N;
    /* synthetic */ boolean M;
    private final /* synthetic */ C O;

    @Override
    public int d() {
        return 0;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
    }

    public aT(z z2, double d10, double d11, double d12, double d13, double d14, double d15, C c10, @Nullable r r2) {
        block7: {
            int n2;
            int[] arrn;
            block8: {
                int n3;
                block9: {
                    block6: {
                        int[] arrn2 = av.e();
                        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
                        this.s = d13;
                        arrn = arrn2;
                        this.n = d14;
                        this.I = d15;
                        this.O = c10;
                        this.e = 8;
                        if (arrn == null) break block6;
                        if (r2 == null) break block7;
                        this.N = r2.c("Explosions", 10);
                    }
                    n3 = this.N.c();
                    if (arrn == null) break block8;
                    if (n3 == 0) break block9;
                    this.N = null;
                    if (arrn != null) break block7;
                }
                this.e = this.N.b() * 2 - 1;
                n3 = n2 = 0;
            }
            while (n2 < this.N.b()) {
                r r3 = this.N.d(n2);
                if (arrn != null) {
                    if (r3.f("Flicker")) {
                        this.M = true;
                        this.e += 15;
                        if (arrn != null) break;
                    }
                    ++n2;
                }
                if (arrn != null) continue;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b() {
        double d10;
        Q q2 = Q.P();
        int[] arrn = av.e();
        Q q3 = q2;
        if (arrn != null) {
            if (q3 == null) return 1 != 0;
            q3 = q2;
        }
        x x2 = q3.Z();
        if (arrn != null) {
            if (x2 == null) return 1 != 0;
            x2 = q2.Z();
        }
        int n2 = (d10 = x2.a(this.b, this.D, this.z) - 256.0) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (arrn == null) return n2 != 0;
        if (n2 < 0) return 0 != 0;
        return 1 != 0;
    }

    private void a(double d10, int n2, int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        double d11 = this.b;
        int[] arrn3 = av.e();
        double d12 = this.D;
        double d13 = this.z;
        int n3 = -n2;
        block0: while (true) {
            int n4 = n3;
            block1: while (n4 <= n2) {
                int n5 = -n2;
                block2: while (true) {
                    int n6 = n5;
                    int n7 = n2;
                    block3: while (n6 <= n7) {
                        n4 = -n2;
                        if (arrn3 == null) continue block1;
                        int n8 = n4;
                        while (n8 <= n2) {
                            block7: {
                                block8: {
                                    int n9;
                                    int n10;
                                    block11: {
                                        block10: {
                                            block9: {
                                                double d14 = (double)n5 + (this.y.nextDouble() - this.y.nextDouble()) * 0.5;
                                                double d15 = (double)n3 + (this.y.nextDouble() - this.y.nextDouble()) * 0.5;
                                                double d16 = (double)n8 + (this.y.nextDouble() - this.y.nextDouble()) * 0.5;
                                                double d17 = (double)net.minecraft.k.h.e(d14 * d14 + d15 * d15 + d16 * d16) / d10 + this.y.nextGaussian() * 0.05;
                                                this.a(d11, d12, d13, d14 / d17, d15 / d17, d16 / d17, arrn, arrn2, bl2, bl3);
                                                if (arrn3 == null) break block7;
                                                n6 = n3;
                                                n7 = -n2;
                                                if (arrn3 == null) continue block3;
                                                if (n6 == n7) break block8;
                                                n10 = n3;
                                                n9 = n2;
                                                if (arrn3 == null) break block9;
                                                if (n10 == n9) break block8;
                                                n10 = n5;
                                                n9 = -n2;
                                            }
                                            if (arrn3 == null) break block10;
                                            if (n10 == n9) break block8;
                                            n10 = n5;
                                            n9 = n2;
                                        }
                                        if (arrn3 == null) break block11;
                                        if (n10 == n9) break block8;
                                        n10 = n8;
                                        n9 = n2 * 2 - 1;
                                    }
                                    n8 = n10 + n9;
                                }
                                ++n8;
                            }
                            if (arrn3 != null) continue;
                        }
                        ++n5;
                        if (arrn3 != null) continue block2;
                    }
                    break;
                }
                ++n3;
                if (arrn3 != null) continue block0;
            }
            break;
        }
    }

    @Override
    public void i() {
        block44: {
            aT aT2;
            block45: {
                int n2;
                int n3;
                block43: {
                    int n4;
                    int[] arrn;
                    block34: {
                        block31: {
                            aT aT3;
                            block33: {
                                block32: {
                                    int[] arrn2;
                                    block37: {
                                        int[] arrn3;
                                        boolean bl2;
                                        boolean bl3;
                                        block42: {
                                            int n5;
                                            int n6;
                                            block40: {
                                                int n7;
                                                block41: {
                                                    block38: {
                                                        block39: {
                                                            block35: {
                                                                block36: {
                                                                    block22: {
                                                                        int n8;
                                                                        int n9;
                                                                        block21: {
                                                                            aT aT4;
                                                                            block24: {
                                                                                block23: {
                                                                                    d d10;
                                                                                    block30: {
                                                                                        int n10;
                                                                                        block28: {
                                                                                            block29: {
                                                                                                int n11;
                                                                                                block27: {
                                                                                                    block25: {
                                                                                                        int n12;
                                                                                                        block26: {
                                                                                                            arrn = av.e();
                                                                                                            n3 = this.P;
                                                                                                            if (arrn == null) break block22;
                                                                                                            if (n3 != 0) break block23;
                                                                                                            aT4 = this;
                                                                                                            if (arrn == null) break block24;
                                                                                                            if (aT4.N == null) break block23;
                                                                                                            n2 = this.b();
                                                                                                            n11 = 0;
                                                                                                            n12 = this.N.b();
                                                                                                            if (arrn == null) break block25;
                                                                                                            if (n12 < 3) break block26;
                                                                                                            n11 = 1;
                                                                                                            if (arrn != null) break block27;
                                                                                                        }
                                                                                                        n12 = n7 = 0;
                                                                                                    }
                                                                                                    while (n7 < this.N.b()) {
                                                                                                        r r2 = this.N.d(n7);
                                                                                                        if (arrn != null) {
                                                                                                            n9 = r2.r("Type");
                                                                                                            n8 = 1;
                                                                                                            if (arrn == null) break block21;
                                                                                                            if (n9 == n8) {
                                                                                                                n11 = 1;
                                                                                                                if (arrn != null) break;
                                                                                                            }
                                                                                                            ++n7;
                                                                                                        }
                                                                                                        if (arrn != null) continue;
                                                                                                    }
                                                                                                }
                                                                                                n10 = n11;
                                                                                                if (arrn == null) break block28;
                                                                                                if (n10 == 0) break block29;
                                                                                                d d11 = d10 = n2 != 0 ? net.minecraft.u.E.ej : net.minecraft.u.E.d2;
                                                                                                if (arrn != null) break block30;
                                                                                            }
                                                                                            n10 = n2;
                                                                                        }
                                                                                        d10 = n10 != 0 ? net.minecraft.u.E.hT : net.minecraft.u.E.aF;
                                                                                    }
                                                                                    this.a.a(this.b, this.D, this.z, d10, ay.AMBIENT, 20.0f, 0.95f + this.y.nextFloat() * 0.1f, true);
                                                                                }
                                                                                aT4 = this;
                                                                            }
                                                                            n9 = aT4.P;
                                                                            n8 = 2;
                                                                        }
                                                                        n3 = n9 % n8;
                                                                    }
                                                                    if (arrn == null) break block31;
                                                                    if (n3 != 0) break block32;
                                                                    aT3 = this;
                                                                    if (arrn == null) break block33;
                                                                    if (aT3.N == null) break block32;
                                                                    n3 = this.P / 2;
                                                                    n4 = this.N.b();
                                                                    if (arrn == null) break block34;
                                                                    if (n3 >= n4) break block32;
                                                                    n2 = this.P / 2;
                                                                    r r3 = this.N.d(n2);
                                                                    n7 = r3.r("Type");
                                                                    bl3 = r3.f("Trail");
                                                                    bl2 = r3.f("Flicker");
                                                                    arrn2 = r3.n("Colors");
                                                                    arrn3 = r3.n("FadeColors");
                                                                    n6 = arrn2.length;
                                                                    if (arrn != null) {
                                                                        if (n6 == 0) {
                                                                            arrn2 = new int[]{net.minecraft.w.P.s[0]};
                                                                        }
                                                                        n6 = n7;
                                                                    }
                                                                    n5 = 1;
                                                                    if (arrn == null) break block35;
                                                                    if (n6 != n5) break block36;
                                                                    this.a(0.5, 4, arrn2, arrn3, bl3, bl2);
                                                                    if (arrn != null) break block37;
                                                                }
                                                                n6 = n7;
                                                                n5 = 2;
                                                            }
                                                            if (arrn == null) break block38;
                                                            if (n6 != n5) break block39;
                                                            this.a(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, arrn2, arrn3, bl3, bl2, false);
                                                            if (arrn != null) break block37;
                                                        }
                                                        n6 = n7;
                                                        n5 = 3;
                                                    }
                                                    if (arrn == null) break block40;
                                                    if (n6 != n5) break block41;
                                                    this.a(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, arrn2, arrn3, bl3, bl2, true);
                                                    if (arrn != null) break block37;
                                                }
                                                n6 = n7;
                                                n5 = 4;
                                            }
                                            if (n6 != n5) break block42;
                                            this.a(arrn2, arrn3, bl3, bl2);
                                            if (arrn != null) break block37;
                                        }
                                        this.a(0.25, 2, arrn2, arrn3, bl3, bl2);
                                    }
                                    int n13 = arrn2[0];
                                    float f10 = (float)((n13 & 0xFF0000) >> 16) / 255.0f;
                                    float f11 = (float)((n13 & 0xFF00) >> 8) / 255.0f;
                                    float f12 = (float)((n13 & 0xFF) >> 0) / 255.0f;
                                    aD aD2 = new aD(this.a, this.b, this.D, this.z);
                                    aD2.a(f10, f11, f12);
                                    this.O.a(aD2);
                                }
                                ++this.P;
                                aT3 = this;
                            }
                            n3 = aT3.P;
                        }
                        if (arrn == null) break block43;
                        n4 = this.e;
                    }
                    if (n3 <= n4) break block44;
                    aT2 = this;
                    if (arrn == null) break block45;
                    n3 = aT2.M ? 1 : 0;
                }
                if (n3 != 0) {
                    n2 = this.b();
                    d d12 = n2 != 0 ? net.minecraft.u.E.gO : net.minecraft.u.E.aZ;
                    this.a.a(this.b, this.D, this.z, d12, ay.AMBIENT, 20.0f, 0.9f + this.y.nextFloat() * 0.15f, true);
                }
                aT2 = this;
            }
            aT2.c();
        }
    }

    private void a(int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        double d10 = this.y.nextGaussian() * 0.05;
        double d11 = this.y.nextGaussian() * 0.05;
        int[] arrn3 = av.e();
        for (int i2 = 0; i2 < 70; ++i2) {
            double d12 = this.s * 0.5 + this.y.nextGaussian() * 0.15 + d10;
            double d13 = this.I * 0.5 + this.y.nextGaussian() * 0.15 + d11;
            double d14 = this.n * 0.5 + this.y.nextDouble() * 0.5;
            this.a(this.b, this.D, this.z, d12, d14, d13, arrn, arrn2, bl2, bl3);
            if (arrn3 != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(double d10, double d11, double d12, double d13, double d14, double d15, int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        int[] arrn3 = av.e();
        ab ab2 = new ab(this.a, d10, d11, d12, d13, d14, d15, this.O);
        ab2.c(0.99f);
        ab2.b(bl2);
        ab2.a(bl3);
        int n2 = this.y.nextInt(arrn.length);
        ab2.d(arrn[n2]);
        int[] arrn4 = arrn3;
        if (arrn4 != null) {
            if (arrn2 != null && arrn2.length > 0) {
                ab2.c(arrn2[this.y.nextInt(arrn2.length)]);
            }
            this.O.a(ab2);
        }
    }

    private void a(double d10, double[][] arrd, int[] arrn, int[] arrn2, boolean bl2, boolean bl3, boolean bl4) {
        double d11 = arrd[0][0];
        int[] arrn3 = av.e();
        double d12 = arrd[0][1];
        this.a(this.b, this.D, this.z, d11 * d10, d12 * d10, 0.0, arrn, arrn2, bl2, bl3);
        float f10 = this.y.nextFloat() * (float)Math.PI;
        double d13 = bl4 ? 0.034 : 0.34;
        for (int i2 = 0; i2 < 3; ++i2) {
            double d14 = (double)f10 + (double)((float)i2 * (float)Math.PI) * d13;
            double d15 = d11;
            double d16 = d12;
            block1: while (true) {
                double d17 = d16;
                for (int i3 = 1; i3 < arrd.length; ++i3) {
                    double d18;
                    block6: {
                        double d19 = arrd[i3][0];
                        double d20 = arrd[i3][1];
                        d16 = 0.25;
                        if (arrn3 == null) continue block1;
                        double d21 = d16;
                        while (d21 <= 1.0) {
                            block7: {
                                double d22 = (d15 + (d19 - d15) * d21) * d10;
                                double d23 = (d17 + (d20 - d17) * d21) * d10;
                                double d24 = d22 * Math.sin(d14);
                                d22 *= Math.cos(d14);
                                d18 = -1.0;
                                if (arrn3 == null) break block6;
                                for (double d25 = v553536; d25 <= 1.0; d25 += 2.0) {
                                    this.a(this.b, this.D, this.z, d22 * d25, d23, d24 * d25, arrn, arrn2, bl2, bl3);
                                    if (arrn3 != null) {
                                        if (arrn3 != null) continue;
                                    }
                                    break block7;
                                }
                                d21 += 0.25;
                            }
                            if (arrn3 != null) continue;
                        }
                        d15 = d19;
                        d18 = d20;
                    }
                    d17 = d18;
                    if (arrn3 != null) continue;
                }
                break;
            }
            if (arrn3 != null) continue;
        }
    }
}

