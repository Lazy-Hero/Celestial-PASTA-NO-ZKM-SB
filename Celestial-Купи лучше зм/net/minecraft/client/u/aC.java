/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.u;

import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class aC
extends av {
    private final /* synthetic */ i M;
    private /* synthetic */ n N;

    public aC a(n n2) {
        this.N = n2;
        int[] arrn = av.e();
        aC aC2 = this;
        if (arrn != null) {
            if (aC2.M.b() == net.minecraft.u.g.aU) {
                return this;
            }
            this.b(n2);
            aC2 = this;
        }
        return aC2;
    }

    @Override
    public int a(float f10) {
        int n2 = super.a(f10);
        int n3 = 0;
        int[] arrn = av.e();
        int n4 = this.a.n(this.N);
        if (arrn != null) {
            if (n4 != 0) {
                n3 = this.a.a(this.N, 0);
            }
            n4 = n2;
        }
        if (arrn != null) {
            n4 = n4 == 0 ? n3 : n2;
        }
        return n4;
    }

    protected void b(@Nullable n n2) {
        int n3 = Q.P().U().a(this.M, this.a, n2, 0);
        this.B *= (float)(n3 >> 16 & 0xFF) / 255.0f;
        this.C *= (float)(n3 >> 8 & 0xFF) / 255.0f;
        this.p *= (float)(n3 & 0xFF) / 255.0f;
    }

    public aC a() {
        this.N = new n(this.b, this.D, this.z);
        int[] arrn = av.e();
        K k2 = this.M.b();
        if (arrn != null) {
            if (k2 == net.minecraft.u.g.aU) {
                return this;
            }
            this.b(this.N);
        }
        return this;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected aC(z z2, double d10, double d11, double d12, double d13, double d14, double d15, i i2) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.M = i2;
        this.a(Q.P().W().b().a(i2));
        this.u = i2.b().t;
        this.B = 0.6f;
        this.C = 0.6f;
        this.p = 0.6f;
        this.E /= 2.0f;
    }

    @Override
    public int d() {
        return 1;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((float)this.J + this.L / 4.0f) / 16.0f;
        int[] arrn = av.e();
        float f17 = f16 + 0.015609375f;
        float f18 = ((float)this.x + this.d / 4.0f) / 16.0f;
        float f19 = f18 + 0.015609375f;
        float f20 = 0.1f * this.E;
        aC aC2 = this;
        if (arrn != null) {
            if (aC2.G != null) {
                f16 = this.G.a((double)(this.L / 4.0f * 16.0f));
                f17 = this.G.a((double)((this.L + 1.0f) / 4.0f * 16.0f));
                f18 = this.G.b((double)(this.d / 4.0f * 16.0f));
                f19 = this.G.b((double)((this.d + 1.0f) / 4.0f * 16.0f));
            }
            aC2 = this;
        }
        float f21 = (float)(aC2.q + (this.b - this.q) * (double)f10 - j);
        float f22 = (float)(this.t + (this.D - this.t) * (double)f10 - o);
        float f23 = (float)(this.f + (this.z - this.f) * (double)f10 - w);
        int n2 = this.a(f10);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        i2.c((double)(f21 - f11 * f20 - f14 * f20), (double)(f22 - f12 * f20), (double)(f23 - f13 * f20 - f15 * f20)).a(f16, f19).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
        i2.c((double)(f21 - f11 * f20 + f14 * f20), (double)(f22 + f12 * f20), (double)(f23 - f13 * f20 + f15 * f20)).a(f16, f18).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
        i2.c((double)(f21 + f11 * f20 + f14 * f20), (double)(f22 + f12 * f20), (double)(f23 + f13 * f20 + f15 * f20)).a(f17, f18).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
        i2.c((double)(f21 + f11 * f20 - f14 * f20), (double)(f22 - f12 * f20), (double)(f23 + f13 * f20 - f15 * f20)).a(f17, f19).a(this.B, this.C, this.p, 1.0f).a(n3, n4).d();
    }
}

