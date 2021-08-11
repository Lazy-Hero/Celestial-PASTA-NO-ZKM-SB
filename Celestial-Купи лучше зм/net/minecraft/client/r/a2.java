/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.D;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.d;
import net.minecraft.client.a.o;
import net.minecraft.client.j.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.u.g;

public class a2
extends b<D> {
    private static gP a(gP gP2) {
        return gP2;
    }

    public a2(a4 a42) {
        super(a42);
        this.a = 0.5f;
    }

    protected v a(D d10) {
        return j.x;
    }

    public void a(D d10, double d11, double d12, double d13, float f10, float f11) {
        block8: {
            int n2;
            float f12;
            d d14;
            block6: {
                block7: {
                    m[] arrm = b.b();
                    d14 = Q.P().W();
                    net.minecraft.client.a.v.M();
                    m[] arrm2 = arrm;
                    net.minecraft.client.a.v.b((float)d11, (float)d12 + 0.5f, (float)d13);
                    float f13 = (float)d10.a() - f11 + 1.0f;
                    float f14 = 10.0f;
                    if (arrm2 == null) {
                        if (f13 < f14) {
                            f12 = 1.0f - ((float)d10.a() - f11 + 1.0f) / 10.0f;
                            f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
                            f12 *= f12;
                            f12 *= f12;
                            float f15 = 1.0f + f12 * 0.3f;
                            net.minecraft.client.a.v.d(f15, f15, f15);
                        }
                        f13 = 1.0f - ((float)d10.a() - f11 + 1.0f) / 100.0f;
                        f14 = 0.8f;
                    }
                    f12 = f13 * f14;
                    this.c(d10);
                    net.minecraft.client.a.v.a(-90.0f, 0.0f, 1.0f, 0.0f);
                    net.minecraft.client.a.v.b(-0.5f, -0.5f, 0.5f);
                    d14.a(net.minecraft.u.g.cR.d(), d10.S());
                    net.minecraft.client.a.v.b(0.0f, 0.0f, 1.0f);
                    n2 = this.g;
                    if (arrm2 != null) break block6;
                    if (n2 == 0) break block7;
                    net.minecraft.client.a.v.r();
                    net.minecraft.client.a.v.m(this.a(d10));
                    d14.a(net.minecraft.u.g.cR.d(), 1.0f);
                    net.minecraft.client.a.v.s();
                    net.minecraft.client.a.v.h();
                    if (arrm2 == null) break block8;
                }
                n2 = d10.a() / 5 % 2;
            }
            if (n2 == 0) {
                net.minecraft.client.a.v.L();
                net.minecraft.client.a.v.y();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(o.SRC_ALPHA, G.DST_ALPHA);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, f12);
                net.minecraft.client.a.v.b(-3.0f, -3.0f);
                net.minecraft.client.a.v.G();
                d14.a(net.minecraft.u.g.cR.d(), 1.0f);
                net.minecraft.client.a.v.b(0.0f, 0.0f);
                net.minecraft.client.a.v.I();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.f();
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.x();
            }
        }
        net.minecraft.client.a.v.B();
        super.d(d10, d11, d12, d13, f10, f11);
    }
}

