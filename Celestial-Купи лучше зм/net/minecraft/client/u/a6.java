/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.client.u.av;
import net.minecraft.k.n;

public class a6
extends av {
    protected a6(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.a(32);
        this.a(0.02f, 0.02f);
        this.E *= this.y.nextFloat() * 0.6f + 0.2f;
        this.s = d13 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.n = d14 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.I = d15 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.e = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void i() {
        block6: {
            a6 a62;
            block5: {
                this.q = this.b;
                this.t = this.D;
                int[] arrn = av.e();
                this.f = this.z;
                this.n += 0.002;
                this.a(this.s, this.n, this.I);
                this.s *= (double)0.85f;
                this.n *= (double)0.85f;
                int[] arrn2 = arrn;
                this.I *= (double)0.85f;
                a62 = this;
                if (arrn2 != null) {
                    if (a62.a.d(new n(this.b, this.D, this.z)).o() != net.minecraft.ac.c.L) {
                        this.c();
                    }
                    a62 = this;
                }
                if (arrn2 == null) break block5;
                if (a62.e-- > 0) break block6;
                a62 = this;
            }
            a62.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

