/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;

public class aW
extends av {
    private final /* synthetic */ float M;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e;
        this.E = this.M * (1.0f - f16 * f16);
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }

    protected aW(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.s *= (double)0.8f;
        this.n *= (double)0.8f;
        this.I *= (double)0.8f;
        this.n = this.y.nextFloat() * 0.4f + 0.05f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.E *= this.y.nextFloat() * 2.0f + 0.2f;
        this.M = this.E;
        this.e = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.a(49);
    }

    @Override
    public int a(float f10) {
        int n2 = super.a(f10);
        int n3 = 240;
        int n4 = n2 >> 16 & 0xFF;
        return 0xF0 | n4 << 16;
    }

    @Override
    public void i() {
        block8: {
            block7: {
                aW aW2;
                float f10;
                block6: {
                    this.q = this.b;
                    int[] arrn = av.e();
                    this.t = this.D;
                    this.f = this.z;
                    int n2 = this.K;
                    int n3 = n2;
                    this.K = n2 + 1;
                    if (arrn != null) {
                        if (n3 >= this.e) {
                            this.c();
                        }
                        n3 = this.K;
                    }
                    float f11 = (float)n3 / (float)this.e;
                    float f12 = this.y.nextFloat() - f11;
                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (arrn == null) break block6;
                    if (f10 > 0) {
                        this.a.a(aH.SMOKE_NORMAL, this.b, this.D, this.z, this.s, this.n, this.I, new int[0]);
                    }
                    this.n -= 0.03;
                    this.a(this.s, this.n, this.I);
                    this.s *= (double)0.999f;
                    this.n *= (double)0.999f;
                    this.I *= (double)0.999f;
                    aW2 = this;
                    if (arrn == null) break block7;
                    f10 = (float)aW2.l;
                }
                if (f10 == false) break block8;
                this.s *= (double)0.7f;
                aW2 = this;
            }
            aW2.I *= (double)0.7f;
        }
    }
}

