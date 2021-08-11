/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;

public class a9
extends av {
    /* synthetic */ float M;

    @Override
    public void i() {
        block10: {
            block9: {
                a9 a92;
                int n2;
                block8: {
                    int[] arrn;
                    block7: {
                        j j2;
                        j j3;
                        block6: {
                            this.q = this.b;
                            arrn = av.e();
                            this.t = this.D;
                            this.f = this.z;
                            a9 a93 = this;
                            a9 a94 = a93;
                            int n3 = a93.K;
                            if (arrn != null) {
                                a94.K = n3 + 1;
                                if (n3 >= this.e) {
                                    this.c();
                                }
                                a94 = this;
                                n3 = 7 - this.K * 8 / this.e;
                            }
                            a94.a(n3);
                            this.a(this.s, this.n, this.I);
                            this.s *= (double)0.96f;
                            this.n *= (double)0.96f;
                            this.I *= (double)0.96f;
                            j2 = j3 = this.a.a(this.b, this.D, this.z, 2.0, false);
                            if (arrn == null) break block6;
                            if (j2 == null) break block7;
                            j2 = j3;
                        }
                        k k2 = j2.m();
                        double d10 = this.D - k2.b;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                        if (arrn == null) break block8;
                        if (n2 > 0) {
                            this.D += (k2.b - this.D) * 0.2;
                            this.n += (j3.G - this.n) * 0.2;
                            this.b(this.b, this.D, this.z);
                        }
                    }
                    a92 = this;
                    if (arrn == null) break block9;
                    n2 = a92.l;
                }
                if (n2 == 0) break block10;
                this.s *= (double)0.7f;
                a92 = this;
            }
            a92.I *= (double)0.7f;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e * 32.0f;
        f16 = net.minecraft.k.h.c(f16, 0.0f, 1.0f);
        this.E = this.M * f16;
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }

    protected a9(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        float f10;
        float f11 = 2.5f;
        this.s *= (double)0.1f;
        this.n *= (double)0.1f;
        this.I *= (double)0.1f;
        this.s += d13;
        this.n += d14;
        this.I += d15;
        this.B = f10 = 1.0f - (float)(Math.random() * (double)0.3f);
        this.C = f10;
        this.p = f10;
        this.E *= 0.75f;
        this.E *= 2.5f;
        this.M = this.E;
        this.e = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.e = (int)((float)this.e * 2.5f);
    }
}

