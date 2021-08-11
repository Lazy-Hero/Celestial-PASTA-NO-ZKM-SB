/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.client.u.av;
import net.minecraft.k.n;

public class ag
extends av {
    protected ag(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11 - 0.125, d12, d13, d14, d15);
        this.B = 0.4f;
        this.C = 0.4f;
        this.p = 0.7f;
        this.a(0);
        this.a(0.01f, 0.01f);
        this.E *= this.y.nextFloat() * 0.6f + 0.2f;
        this.s = d13 * 0.0;
        this.n = d14 * 0.0;
        this.I = d15 * 0.0;
        this.e = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void i() {
        block6: {
            ag ag2;
            block5: {
                this.q = this.b;
                this.t = this.D;
                this.f = this.z;
                int[] arrn = av.e();
                this.a(this.s, this.n, this.I);
                ag2 = this;
                if (arrn != null) {
                    if (ag2.a.d(new n(this.b, this.D, this.z)).o() != net.minecraft.ac.c.L) {
                        this.c();
                    }
                    ag2 = this;
                }
                if (arrn == null) break block5;
                if (ag2.e-- > 0) break block6;
                ag2 = this;
            }
            ag2.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

