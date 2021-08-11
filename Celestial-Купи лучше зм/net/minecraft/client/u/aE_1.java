/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.m;
import net.minecraft.u.g;
import net.minecraft.w.k;

public class aE
extends av {
    private static gP a(gP gP2) {
        return gP2;
    }

    protected aE(z z2, double d10, double d11, double d12, k k2) {
        this(z2, d10, d11, d12, k2, 0);
    }

    protected aE(z z2, double d10, double d11, double d12, double d13, double d14, double d15, k k2, int n2) {
        this(z2, d10, d11, d12, k2, n2);
        this.s *= (double)0.1f;
        this.n *= (double)0.1f;
        this.I *= (double)0.1f;
        this.s += d13;
        this.n += d14;
        this.I += d15;
    }

    @Override
    public int d() {
        return 1;
    }

    protected aE(z z2, double d10, double d11, double d12, k k2, int n2) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.a(Q.P().Y().b().b(k2, n2));
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.u = net.minecraft.u.g.da.t;
        this.E /= 2.0f;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block2: {
            float f16 = ((float)this.J + this.L / 4.0f) / 16.0f;
            float f17 = f16 + 0.015609375f;
            float f18 = ((float)this.x + this.d / 4.0f) / 16.0f;
            float f19 = f18 + 0.015609375f;
            float f20 = 0.1f * this.E;
            int[] arrn = av.e();
            aE aE2 = this;
            if (arrn != null) {
                if (aE2.G != null) {
                    f16 = this.G.a((double)(this.L / 4.0f * 16.0f));
                    f17 = this.G.a((double)((this.L + 1.0f) / 4.0f * 16.0f));
                    f18 = this.G.b((double)(this.d / 4.0f * 16.0f));
                    f19 = this.G.b((double)((this.d + 1.0f) / 4.0f * 16.0f));
                }
                aE2 = this;
            }
            float f21 = (float)(aE2.q + (this.b - this.q) * (double)f10 - j);
            float f22 = (float)(this.t + (this.D - this.t) * (double)f10 - o);
            float f23 = (float)(this.f + (this.z - this.f) * (double)f10 - w);
            int n2 = this.a(f10);
            int n3 = n2 >> 16 & 0xFFFF;
            int n4 = n2 & 0xFFFF;
            i2.c((double)(f21 - f11 * f20 - f14 * f20), (double)(f22 - f12 * f20), (double)(f23 - f13 * f20 - f15 * f20)).a(f16, f19).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
            i2.c((double)(f21 - f11 * f20 + f14 * f20), (double)(f22 + f12 * f20), (double)(f23 - f13 * f20 + f15 * f20)).a(f16, f18).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
            i2.c((double)(f21 + f11 * f20 + f14 * f20), (double)(f22 + f12 * f20), (double)(f23 + f13 * f20 + f15 * f20)).a(f17, f18).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
            i2.c((double)(f21 + f11 * f20 - f14 * f20), (double)(f22 - f12 * f20), (double)(f23 + f13 * f20 - f15 * f20)).a(f17, f19).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
            if (!net.minecraft.k.m.c()) break block2;
            av.b(new int[2]);
        }
    }
}

