/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class ak
extends av {
    /* synthetic */ float M;

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e * 32.0f;
        f16 = net.minecraft.k.h.c(f16, 0.0f, 1.0f);
        this.E = this.M * f16;
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }

    protected ak(z z2, double d10, double d11, double d12, double d13, double d14, double d15, float f10) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.s *= (double)0.01f;
        this.n *= (double)0.01f;
        this.I *= (double)0.01f;
        this.n += 0.1;
        this.E *= 0.75f;
        this.E *= f10;
        this.M = this.E;
        this.e = 16;
        this.a(80);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        block8: {
            block7: {
                ak ak2;
                int n2;
                block6: {
                    this.q = this.b;
                    this.t = this.D;
                    this.f = this.z;
                    int[] arrn = av.e();
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn != null) {
                        if (n2 >= this.e) {
                            this.c();
                        }
                        this.a(this.s, this.n, this.I);
                        double d10 = this.D - this.t;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block6;
                    if (n2 == 0) {
                        this.s *= 1.1;
                        this.I *= 1.1;
                    }
                    this.s *= (double)0.86f;
                    this.n *= (double)0.86f;
                    this.I *= (double)0.86f;
                    ak2 = this;
                    if (arrn == null) break block7;
                    n2 = ak2.l ? 1 : 0;
                }
                if (n2 == 0) break block8;
                this.s *= (double)0.7f;
                ak2 = this;
            }
            ak2.I *= (double)0.7f;
        }
    }

    protected ak(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this(z2, d10, d11, d12, d13, d14, d15, 2.0f);
    }
}

