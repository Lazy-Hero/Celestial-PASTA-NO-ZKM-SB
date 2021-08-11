/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.w.k;

public class al
extends av {
    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = this.G.i();
        float f17 = this.G.l();
        float f18 = this.G.u();
        float f19 = this.G.m();
        float f20 = 0.5f;
        float f21 = (float)(this.q + (this.b - this.q) * (double)f10 - j);
        float f22 = (float)(this.t + (this.D - this.t) * (double)f10 - o);
        float f23 = (float)(this.f + (this.z - this.f) * (double)f10 - w);
        int n2 = this.a(f10);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        i2.c((double)(f21 - f11 * 0.5f - f14 * 0.5f), (double)(f22 - f12 * 0.5f), (double)(f23 - f13 * 0.5f - f15 * 0.5f)).a(f17, f19).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
        i2.c((double)(f21 - f11 * 0.5f + f14 * 0.5f), (double)(f22 + f12 * 0.5f), (double)(f23 - f13 * 0.5f + f15 * 0.5f)).a(f17, f18).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
        i2.c((double)(f21 + f11 * 0.5f + f14 * 0.5f), (double)(f22 + f12 * 0.5f), (double)(f23 + f13 * 0.5f + f15 * 0.5f)).a(f16, f18).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
        i2.c((double)(f21 + f11 * 0.5f - f14 * 0.5f), (double)(f22 - f12 * 0.5f), (double)(f23 + f13 * 0.5f - f15 * 0.5f)).a(f16, f19).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
    }

    @Override
    public int d() {
        return 1;
    }

    protected al(z z2, double d10, double d11, double d12, k k2) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.a(Q.P().Y().b().a(k2));
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.s = 0.0;
        this.n = 0.0;
        this.I = 0.0;
        this.u = 0.0f;
        this.e = 80;
    }
}

