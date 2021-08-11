/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.L;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class a5
extends av {
    /* synthetic */ float M;

    private a5(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this(z2, d10, d11, d12, d13, d14, d15, 1.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected a5(z z2, double d10, double d11, double d12, double d13, double d14, double d15, float f10) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        float f11;
        this.s *= (double)0.1f;
        this.n *= (double)0.1f;
        this.I *= (double)0.1f;
        this.s += d13;
        this.n += d14;
        this.I += d15;
        this.B = f11 = (float)(Math.random() * (double)0.3f);
        this.C = f11;
        this.p = f11;
        this.E *= 0.75f;
        this.E *= f10;
        this.M = this.E;
        this.e = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.e = (int)((float)this.e * f10);
    }

    a5(z z2, double d10, double d11, double d12, double d13, double d14, double d15, L l2) {
        this(z2, d10, d11, d12, d13, d14, d15);
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e * 32.0f;
        f16 = net.minecraft.k.h.c(f16, 0.0f, 1.0f);
        this.E = this.M * f16;
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }

    @Override
    public void i() {
        block8: {
            block7: {
                a5 a52;
                int n2;
                block6: {
                    this.q = this.b;
                    int[] arrn = av.e();
                    this.t = this.D;
                    this.f = this.z;
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn != null) {
                        if (n2 >= this.e) {
                            this.c();
                        }
                        this.a(7 - this.K * 8 / this.e);
                        this.n += 0.004;
                        this.a(this.s, this.n, this.I);
                        double d10 = this.D - this.t;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block6;
                    if (n2 == 0) {
                        this.s *= 1.1;
                        this.I *= 1.1;
                    }
                    this.s *= (double)0.96f;
                    this.n *= (double)0.96f;
                    this.I *= (double)0.96f;
                    a52 = this;
                    if (arrn == null) break block7;
                    n2 = a52.l ? 1 : 0;
                }
                if (n2 == 0) break block8;
                this.s *= (double)0.7f;
                a52 = this;
            }
            a52.I *= (double)0.7f;
        }
    }
}

