/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class aA
extends av {
    /* synthetic */ float M;

    protected aA(z z2, double d10, double d11, double d12, double d13, double d14, double d15, float f10) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        float f11;
        this.s *= (double)0.1f;
        this.n *= (double)0.1f;
        this.I *= (double)0.1f;
        this.s += d13 * 0.4;
        this.n += d14 * 0.4;
        this.I += d15 * 0.4;
        this.B = f11 = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.C = f11;
        this.p = f11;
        this.E *= 0.75f;
        this.E *= f10;
        this.M = this.E;
        this.e = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.e = (int)((float)this.e * f10);
        this.a(65);
        this.i();
    }

    protected aA(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this(z2, d10, d11, d12, d13, d14, d15, 1.0f);
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e * 32.0f;
        f16 = net.minecraft.k.h.c(f16, 0.0f, 1.0f);
        this.E = this.M * f16;
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        block6: {
            block5: {
                aA aA2;
                int n2;
                block4: {
                    this.q = this.b;
                    this.t = this.D;
                    int[] arrn = av.e();
                    this.f = this.z;
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn == null) break block4;
                    if (n2 >= this.e) {
                        this.c();
                    }
                    this.a(this.s, this.n, this.I);
                    this.C = (float)((double)this.C * 0.96);
                    this.p = (float)((double)this.p * 0.9);
                    this.s *= (double)0.7f;
                    this.n *= (double)0.7f;
                    this.I *= (double)0.7f;
                    this.n -= (double)0.02f;
                    aA2 = this;
                    if (arrn == null) break block5;
                    n2 = aA2.l ? 1 : 0;
                }
                if (n2 == 0) break block6;
                this.s *= (double)0.7f;
                aA2 = this;
            }
            aA2.I *= (double)0.7f;
        }
    }
}

