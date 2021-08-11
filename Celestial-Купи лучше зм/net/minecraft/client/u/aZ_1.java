/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.av;

public class aZ
extends av {
    @Override
    public void a(double d10, double d11, double d12) {
        this.a(this.g().c(d10, d11, d12));
        this.j();
    }

    protected aZ(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        float f10;
        this.B = f10 = this.y.nextFloat() * 0.1f + 0.2f;
        this.C = f10;
        this.p = f10;
        this.a(0);
        this.a(0.02f, 0.02f);
        this.E *= this.y.nextFloat() * 0.6f + 0.5f;
        this.s *= (double)0.02f;
        this.n *= (double)0.02f;
        this.I *= (double)0.02f;
        this.e = (int)(20.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void i() {
        block3: {
            aZ aZ2;
            block2: {
                this.q = this.b;
                this.t = this.D;
                this.f = this.z;
                this.a(this.s, this.n, this.I);
                this.s *= 0.99;
                this.n *= 0.99;
                int[] arrn = av.e();
                this.I *= 0.99;
                aZ2 = this;
                if (arrn == null) break block2;
                if (aZ2.e-- > 0) break block3;
                aZ2 = this;
            }
            aZ2.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

