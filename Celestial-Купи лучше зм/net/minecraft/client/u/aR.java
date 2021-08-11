/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.T.a_;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class aR
extends av {
    private /* synthetic */ B M;

    @Override
    public int d() {
        return 3;
    }

    protected aR(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.s = 0.0;
        this.n = 0.0;
        this.I = 0.0;
        this.u = 0.0f;
        this.e = 30;
    }

    @Override
    public void i() {
        super.i();
        if (this.M == null) {
            a_ a_2 = new a_(this.a);
            a_2.b();
            this.M = a_2;
        }
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.M != null) {
            a4 a42 = Q.P().aQ();
            a42.a(av.j, av.o, av.w);
            float f16 = 0.42553192f;
            float f17 = ((float)this.K + f10) / (float)this.e;
            v.a(true);
            v.a();
            v.t();
            v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA);
            float f18 = 240.0f;
            as.a(as.p, 240.0f, 240.0f);
            v.M();
            float f19 = 0.05f + 0.5f * net.minecraft.k.h.g(f17 * (float)Math.PI);
            v.b(1.0f, 1.0f, 1.0f, f19);
            v.b(0.0f, 1.8f, 0.0f);
            v.a(180.0f - x2.e, 0.0f, 1.0f, 0.0f);
            v.a(60.0f - 150.0f * f17 - x2.at, 1.0f, 0.0f, 0.0f);
            v.b(0.0f, -0.4f, -1.5f);
            v.d(0.42553192f, 0.42553192f, 0.42553192f);
            this.M.e = 0.0f;
            this.M.a1 = 0.0f;
            this.M.ak = 0.0f;
            this.M.bh = 0.0f;
            a42.a(this.M, 0.0, 0.0, 0.0, 0.0f, f10, false);
            v.B();
            v.t();
        }
    }
}

