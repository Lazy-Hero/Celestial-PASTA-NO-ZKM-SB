/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class aV
extends av {
    private final /* synthetic */ float M;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected aV(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.s = this.s * (double)0.01f + d13;
        this.n = this.n * (double)0.01f + d14;
        this.I = this.I * (double)0.01f + d15;
        this.b += (double)((this.y.nextFloat() - this.y.nextFloat()) * 0.05f);
        this.D += (double)((this.y.nextFloat() - this.y.nextFloat()) * 0.05f);
        this.z += (double)((this.y.nextFloat() - this.y.nextFloat()) * 0.05f);
        this.M = this.E;
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.e = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.a(48);
    }

    @Override
    public void i() {
        block6: {
            block5: {
                aV aV2;
                int n2;
                block4: {
                    this.q = this.b;
                    this.t = this.D;
                    this.f = this.z;
                    int[] arrn = av.e();
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn == null) break block4;
                    if (n2 >= this.e) {
                        this.c();
                    }
                    this.a(this.s, this.n, this.I);
                    this.s *= (double)0.96f;
                    this.n *= (double)0.96f;
                    this.I *= (double)0.96f;
                    aV2 = this;
                    if (arrn == null) break block5;
                    n2 = aV2.l ? 1 : 0;
                }
                if (n2 == 0) break block6;
                this.s *= (double)0.7f;
                aV2 = this;
            }
            aV2.I *= (double)0.7f;
        }
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e;
        this.E = this.M * (1.0f - f16 * f16 * 0.5f);
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }

    @Override
    public int a(float f10) {
        float f11 = ((float)this.K + f10) / (float)this.e;
        f11 = net.minecraft.k.h.c(f11, 0.0f, 1.0f);
        int[] arrn = av.e();
        int n2 = super.a(f10);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n3 += (int)(f11 * 15.0f * 16.0f);
        int n6 = 240;
        if (arrn != null) {
            if (n5 > n6) {
                n3 = 240;
            }
            n5 = n3;
            n6 = n4 << 16;
        }
        return n5 | n6;
    }

    @Override
    public void a(double d10, double d11, double d12) {
        this.a(this.g().c(d10, d11, d12));
        this.j();
    }
}

