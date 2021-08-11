/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.u;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ar.aW;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.R;
import net.minecraft.client.w.j;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;

public class at<T extends u>
extends b<T> {
    protected /* synthetic */ j i;
    private static final /* synthetic */ v j;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        j = new v("textures/entity/minecart.png");
    }

    protected void a(T t2, float f10, i i2) {
        net.minecraft.client.a.v.M();
        Q.P().W().a(i2, ((x)t2).S());
        net.minecraft.client.a.v.B();
    }

    public at(a4 a42) {
        super(a42);
        this.i = new R();
        this.a = 0.5f;
    }

    protected v a(T t2) {
        return j;
    }

    public void a(T t2, double d10, double d11, double d12, float f10, float f11) {
        float f12;
        m[] arrm;
        block23: {
            int n2;
            block22: {
                int n3;
                block21: {
                    block19: {
                        float f13;
                        block20: {
                            net.minecraft.client.a.v.M();
                            this.c(t2);
                            long l2 = (long)((x)t2).W() * 493286711L;
                            l2 = l2 * l2 * 4392167121L + l2 * 98761L;
                            arrm = b.b();
                            float f14 = (((float)(l2 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
                            float f15 = (((float)(l2 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
                            float f16 = (((float)(l2 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
                            net.minecraft.client.a.v.b(f14, f15, f16);
                            double d13 = ((u)t2).am + (((u)t2).a - ((u)t2).am) * (double)f11;
                            double d14 = ((u)t2).af + (((u)t2).aF - ((u)t2).af) * (double)f11;
                            double d15 = ((u)t2).n + (((u)t2).ax - ((u)t2).n) * (double)f11;
                            double d16 = 0.3f;
                            l l3 = ((u)t2).a(d13, d14, d15);
                            f13 = ((u)t2).E + (((u)t2).at - ((u)t2).E) * f11;
                            if (arrm != null) break block19;
                            if (l3 == null) break block20;
                            l l4 = ((u)t2).a(d13, d14, d15, (double)0.3f);
                            l l5 = ((u)t2).a(d13, d14, d15, (double)-0.3f);
                            l l6 = l4;
                            if (arrm == null) {
                                if (l6 == null) {
                                    l4 = l3;
                                }
                                l6 = l5;
                            }
                            if (arrm == null) {
                                if (l6 == null) {
                                    l5 = l3;
                                }
                                d10 += l3.e - d13;
                                d11 += (l4.d + l5.d) / 2.0 - d14;
                                d12 += l3.b - d15;
                                l6 = l5.c(-l4.e, -l4.d, -l4.b);
                            }
                            l l7 = l6;
                            double d17 = l7.a() - 0.0;
                            n3 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                            if (arrm != null) break block21;
                            if (n3 != 0) {
                                l7 = l7.d();
                                f10 = (float)(Math.atan2(l7.b, l7.e) * 180.0 / Math.PI);
                                f13 = (float)(Math.atan(l7.d) * 73.0);
                            }
                        }
                        net.minecraft.client.a.v.b((float)d10, (float)d11 + 0.375f, (float)d12);
                        net.minecraft.client.a.v.a(180.0f - f10, 0.0f, 1.0f, 0.0f);
                        net.minecraft.client.a.v.a(-f13, 0.0f, 0.0f, 1.0f);
                    }
                    n3 = ((u)t2).f();
                }
                float f17 = (float)n3 - f11;
                float f18 = ((u)t2).m() - f11;
                float f14 = f18 - 0.0f;
                f14 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                if (arrm == null) {
                    float f15;
                    if (f14 < 0) {
                        f18 = 0.0f;
                    }
                    f14 = (f15 = f17 - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                }
                if (arrm == null) {
                    if (f14 > 0) {
                        net.minecraft.client.a.v.a(net.minecraft.k.h.g(f17) * f17 * f18 / 10.0f * (float)((u)t2).d(), 1.0f, 0.0f, 0.0f);
                    }
                    f14 = ((u)t2).b();
                }
                f12 = f14;
                n2 = this.g;
                if (arrm != null) break block22;
                if (n2 == 0) break block23;
                net.minecraft.client.a.v.r();
                n2 = this.a(t2);
            }
            net.minecraft.client.a.v.m(n2);
        }
        i i2 = ((u)t2).c();
        if (arrm == null) {
            if (i2.n() != aW.INVISIBLE) {
                net.minecraft.client.a.v.M();
                this.b(net.minecraft.client.j.j.x);
                float f22 = 0.75f;
                net.minecraft.client.a.v.d(0.75f, 0.75f, 0.75f);
                net.minecraft.client.a.v.b(-0.5f, (float)(f12 - 8) / 16.0f, 0.5f);
                this.a(t2, f11, i2);
                net.minecraft.client.a.v.B();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.c(t2);
            }
            net.minecraft.client.a.v.d(-1.0f, -1.0f, 1.0f);
            this.i.b((x)t2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
            net.minecraft.client.a.v.B();
        }
        at at2 = this;
        if (arrm == null) {
            if (at2.g) {
                net.minecraft.client.a.v.s();
                net.minecraft.client.a.v.h();
            }
            at2 = this;
        }
        super.d(t2, d10, d11, d12, f10, f11);
    }
}

