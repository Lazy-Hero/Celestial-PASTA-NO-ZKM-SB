/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.av;

public class ad
extends av {
    protected ad(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.s *= (double)0.3f;
        this.n = Math.random() * (double)0.2f + (double)0.1f;
        this.I *= (double)0.3f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.a(19);
        this.a(0.01f, 0.01f);
        this.e = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.u = 0.0f;
        this.s = d13;
        this.n = d14;
        this.I = d15;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        block3: {
            ad ad2;
            block2: {
                this.q = this.b;
                this.t = this.D;
                this.f = this.z;
                int[] arrn = av.e();
                this.n -= (double)this.u;
                this.a(this.s, this.n, this.I);
                this.s *= (double)0.98f;
                this.n *= (double)0.98f;
                this.I *= (double)0.98f;
                int n2 = 60 - this.e;
                float f10 = (float)n2 * 0.001f;
                this.a(f10, f10);
                this.a(19 + n2 % 4);
                ad2 = this;
                if (arrn == null) break block2;
                if (ad2.e-- > 0) break block3;
                ad2 = this;
            }
            ad2.c();
        }
    }
}

