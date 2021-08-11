/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;

public class aq
extends av {
    private final /* synthetic */ float N;
    private final /* synthetic */ double O;
    private final /* synthetic */ double P;
    private final /* synthetic */ double M;

    @Override
    public int a(float f10) {
        int n2 = super.a(f10);
        float f11 = (float)this.K / (float)this.e;
        int[] arrn = av.e();
        f11 *= f11;
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

    @Override
    public void a(double d10, double d11, double d12) {
        this.a(this.g().c(d10, d11, d12));
        this.j();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        block3: {
            aq aq2;
            block2: {
                this.q = this.b;
                int[] arrn = av.e();
                this.t = this.D;
                this.f = this.z;
                float f10 = (float)this.K / (float)this.e;
                float f11 = -f10 + f10 * f10 * 2.0f;
                float f12 = 1.0f - f11;
                this.b = this.M + this.s * (double)f12;
                this.D = this.O + this.n * (double)f12 + (double)(1.0f - f10);
                this.z = this.P + this.I * (double)f12;
                aq2 = this;
                if (arrn == null) break block2;
                if (aq2.K++ < this.e) break block3;
                aq2 = this;
            }
            aq2.c();
        }
    }

    protected aq(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.s = d13;
        this.n = d14;
        this.I = d15;
        this.b = d10;
        this.D = d11;
        this.z = d12;
        this.M = this.b;
        this.O = this.D;
        this.P = this.z;
        float f10 = this.y.nextFloat() * 0.6f + 0.4f;
        this.N = this.E = this.y.nextFloat() * 0.2f + 0.5f;
        this.B = f10 * 0.9f;
        this.C = f10 * 0.3f;
        this.p = f10;
        this.e = (int)(Math.random() * 10.0) + 40;
        this.a((int)(Math.random() * 8.0));
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.K + f10) / (float)this.e;
        f16 = 1.0f - f16;
        f16 *= f16;
        f16 = 1.0f - f16;
        this.E = this.N * f16;
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }
}

