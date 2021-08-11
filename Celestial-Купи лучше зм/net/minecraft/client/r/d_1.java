/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.z.f;

public abstract class d<T extends f>
extends b<T> {
    public d(a4 a42) {
        super(a42);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void a(T t2, double d10, double d11, double d12, float f10, float f11) {
        block8: {
            float f12;
            m[] arrm = b.b();
            this.c(t2);
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            v.M();
            m[] arrm2 = arrm;
            v.y();
            v.b((float)d10, (float)d11, (float)d12);
            v.a(((f)t2).ak + (((f)t2).e - ((f)t2).ak) * f11 - 90.0f, 0.0f, 1.0f, 0.0f);
            v.a(((f)t2).E + (((f)t2).at - ((f)t2).E) * f11, 0.0f, 0.0f, 1.0f);
            W w2 = W.c();
            I i2 = w2.b();
            boolean bl2 = false;
            float f13 = 0.0f;
            float f14 = 0.5f;
            float f15 = 0.0f;
            float f16 = 0.15625f;
            float f17 = 0.0f;
            float f18 = 0.15625f;
            float f19 = 0.15625f;
            float f20 = 0.3125f;
            float f21 = 0.05625f;
            v.q();
            float f22 = (float)((f)t2).aU - f11;
            float f23 = f22 - 0.0f;
            float f24 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
            if (arrm2 == null) {
                if (f24 > 0) {
                    float f25 = -net.minecraft.k.h.g(f22 * 3.0f) * f22;
                    v.a(f25, 0.0f, 0.0f, 1.0f);
                }
                v.a(45.0f, 1.0f, 0.0f, 0.0f);
                v.d(0.05625f, 0.05625f, 0.05625f);
                v.b(-4.0f, 0.0f, 0.0f);
                f24 = (float)this.g;
            }
            if (arrm2 == null) {
                if (f24 != false) {
                    v.r();
                    v.m(this.a(t2));
                }
                v.a(0.05625f, 0.0f, 0.0f);
                i2.a(7, net.minecraft.client.y.b.m);
                i2.c(-7.0, -2.0, -2.0).a(0.0, 0.15625).d();
                i2.c(-7.0, -2.0, 2.0).a(0.15625, 0.15625).d();
                i2.c(-7.0, 2.0, 2.0).a(0.15625, 0.3125).d();
                i2.c(-7.0, 2.0, -2.0).a(0.0, 0.3125).d();
                w2.a();
                v.a(-0.05625f, 0.0f, 0.0f);
                i2.a(7, net.minecraft.client.y.b.m);
                i2.c(-7.0, 2.0, -2.0).a(0.0, 0.15625).d();
                i2.c(-7.0, 2.0, 2.0).a(0.15625, 0.15625).d();
                i2.c(-7.0, -2.0, 2.0).a(0.15625, 0.3125).d();
                i2.c(-7.0, -2.0, -2.0).a(0.0, 0.3125).d();
                w2.a();
                f24 = f12 = 0.0f;
            }
            while (f12 < 4) {
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.a(0.0f, 0.0f, 0.05625f);
                i2.a(7, net.minecraft.client.y.b.m);
                i2.c(-8.0, -2.0, 0.0).a(0.0, 0.0).d();
                i2.c(8.0, -2.0, 0.0).a(0.5, 0.0).d();
                i2.c(8.0, 2.0, 0.0).a(0.5, 0.15625).d();
                i2.c(-8.0, 2.0, 0.0).a(0.0, 0.15625).d();
                w2.a();
                ++f12;
                if (arrm2 == null) {
                    if (arrm2 == null) continue;
                }
                break block8;
            }
            d d13 = this;
            if (arrm2 == null) {
                if (d13.g) {
                    v.s();
                    v.h();
                }
                v.u();
                v.j();
                v.B();
                d13 = this;
            }
            super.d(t2, d10, d11, d12, f10, f11);
        }
    }
}

