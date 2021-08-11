/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class ao
extends av {
    /* synthetic */ float M;
    final /* synthetic */ float N;

    protected ao(z z2, double d10, double d11, double d12, float f10, float f11, float f12) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.s = 0.0;
        this.n = 0.0;
        this.I = 0.0;
        this.B = f10;
        this.C = f11;
        this.p = f12;
        float f13 = 0.9f;
        this.E *= 0.75f;
        this.E *= 0.9f;
        this.M = this.E;
        this.e = (int)(32.0 / (Math.random() * 0.8 + 0.2));
        this.e = (int)((float)this.e * 0.9f);
        this.N = ((float)Math.random() - 0.5f) * 0.1f;
        this.c = (float)Math.random() * ((float)Math.PI * 2);
    }

    private static gP a(gP gP2) {
        return gP2;
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
        block6: {
            ao ao2;
            int n2;
            block5: {
                this.q = this.b;
                int[] arrn = av.e();
                this.t = this.D;
                this.f = this.z;
                int n3 = this.K;
                n2 = n3;
                this.K = n3 + 1;
                if (arrn == null) break block5;
                if (n2 >= this.e) {
                    this.c();
                }
                this.F = this.c;
                this.c += (float)Math.PI * this.N * 2.0f;
                ao2 = this;
                if (arrn == null) break block6;
                n2 = ao2.l ? 1 : 0;
            }
            if (n2 != 0) {
                this.c = 0.0f;
                this.F = 0.0f;
            }
            this.a(7 - this.K * 8 / this.e);
            this.a(this.s, this.n, this.I);
            this.n -= (double)0.003f;
            ao2 = this;
        }
        ao2.n = Math.max(this.n, (double)-0.14f);
    }
}

