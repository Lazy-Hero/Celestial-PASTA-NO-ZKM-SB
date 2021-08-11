/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.av;

public class an
extends av {
    @Override
    public void i() {
        block6: {
            block5: {
                an an2;
                int n2;
                block4: {
                    this.q = this.b;
                    int[] arrn = av.e();
                    this.t = this.D;
                    this.f = this.z;
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn == null) break block4;
                    if (n2 >= this.e) {
                        this.c();
                    }
                    this.a(7 - this.K * 8 / this.e);
                    this.n += 0.004;
                    this.a(this.s, this.n, this.I);
                    this.s *= (double)0.9f;
                    this.n *= (double)0.9f;
                    this.I *= (double)0.9f;
                    an2 = this;
                    if (arrn == null) break block5;
                    n2 = an2.l ? 1 : 0;
                }
                if (n2 == 0) break block6;
                this.s *= (double)0.7f;
                an2 = this;
            }
            an2.I *= (double)0.7f;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected an(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        float f10;
        this.s = d13 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.n = d14 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.I = d15 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.B = f10 = this.y.nextFloat() * 0.3f + 0.7f;
        this.C = f10;
        this.p = f10;
        this.E = this.y.nextFloat() * this.y.nextFloat() * 6.0f + 1.0f;
        this.e = (int)(16.0 / ((double)this.y.nextFloat() * 0.8 + 0.2)) + 2;
    }
}

