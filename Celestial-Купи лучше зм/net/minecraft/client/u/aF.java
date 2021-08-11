/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.av;

public class aF
extends av {
    private final /* synthetic */ double M;
    private final /* synthetic */ double O;
    private final /* synthetic */ double N;
    private final /* synthetic */ float P;

    @Override
    public int a(float f10) {
        int n2 = super.a(f10);
        float f11 = (float)this.K / (float)this.e;
        f11 *= f11;
        int[] arrn = av.e();
        f11 *= f11;
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n4 += (int)(f11 * 15.0f * 16.0f);
        int n6 = 240;
        if (arrn != null) {
            if (n5 > n6) {
                n4 = 240;
            }
            n5 = n3;
            n6 = n4 << 16;
        }
        return n5 | n6;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        block3: {
            aF aF2;
            block2: {
                this.q = this.b;
                this.t = this.D;
                int[] arrn = av.e();
                this.f = this.z;
                float f10 = (float)this.K / (float)this.e;
                f10 = 1.0f - f10;
                float f11 = 1.0f - f10;
                f11 *= f11;
                f11 *= f11;
                this.b = this.O + this.s * (double)f10;
                this.D = this.N + this.n * (double)f10 - (double)(f11 * 1.2f);
                this.z = this.M + this.I * (double)f10;
                aF2 = this;
                if (arrn == null) break block2;
                if (aF2.K++ < this.e) break block3;
                aF2 = this;
            }
            aF2.c();
        }
    }

    @Override
    public void a(double d10, double d11, double d12) {
        this.a(this.g().c(d10, d11, d12));
        this.j();
    }

    protected aF(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.s = d13;
        this.n = d14;
        this.I = d15;
        this.O = d10;
        this.N = d11;
        this.M = d12;
        this.q = d10 + d13;
        this.t = d11 + d14;
        this.f = d12 + d15;
        this.b = this.q;
        this.D = this.t;
        this.z = this.f;
        float f10 = this.y.nextFloat() * 0.6f + 0.4f;
        this.P = this.E = this.y.nextFloat() * 0.5f + 0.2f;
        this.B = 0.9f * f10;
        this.C = 0.9f * f10;
        this.p = f10;
        this.e = (int)(Math.random() * 10.0) + 30;
        this.a((int)(Math.random() * 26.0 + 1.0 + 224.0));
    }
}

