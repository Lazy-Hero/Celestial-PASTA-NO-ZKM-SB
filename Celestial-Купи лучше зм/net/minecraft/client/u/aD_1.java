/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class aD
extends av {
    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = 0.25f;
        float f17 = 0.5f;
        float f18 = 0.125f;
        float f19 = 0.375f;
        float f20 = 7.1f * net.minecraft.k.h.g(((float)this.K + f10 - 1.0f) * 0.25f * (float)Math.PI);
        this.c(0.6f - ((float)this.K + f10 - 1.0f) * 0.25f * 0.5f);
        float f21 = (float)(this.q + (this.b - this.q) * (double)f10 - j);
        float f22 = (float)(this.t + (this.D - this.t) * (double)f10 - o);
        float f23 = (float)(this.f + (this.z - this.f) * (double)f10 - w);
        int n2 = this.a(f10);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        i2.c((double)(f21 - f11 * f20 - f14 * f20), (double)(f22 - f12 * f20), (double)(f23 - f13 * f20 - f15 * f20)).a(0.5, 0.375).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
        i2.c((double)(f21 - f11 * f20 + f14 * f20), (double)(f22 + f12 * f20), (double)(f23 - f13 * f20 + f15 * f20)).a(0.5, 0.125).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
        i2.c((double)(f21 + f11 * f20 + f14 * f20), (double)(f22 + f12 * f20), (double)(f23 + f13 * f20 + f15 * f20)).a(0.25, 0.125).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
        i2.c((double)(f21 + f11 * f20 - f14 * f20), (double)(f22 - f12 * f20), (double)(f23 + f13 * f20 - f15 * f20)).a(0.25, 0.375).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
    }

    protected aD(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.e = 4;
    }
}

