/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.l.c;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.w.d;

public class o
extends b<net.minecraft.z.o> {
    private static final /* synthetic */ v i;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(net.minecraft.z.o o2, double d10, double d11, double d12, float f10, float f11) {
        block15: {
            block14: {
                double d13;
                double d14;
                double d15;
                double d16;
                I i2;
                W w2;
                m[] arrm;
                block23: {
                    j j2;
                    double d17;
                    double d18;
                    double d19;
                    j j3;
                    block22: {
                        block21: {
                            float f12;
                            int n2;
                            block20: {
                                c c10;
                                block19: {
                                    block18: {
                                        boolean bl2;
                                        block17: {
                                            block16: {
                                                j3 = o2.g();
                                                arrm = b.b();
                                                if (j3 == null) break block15;
                                                boolean bl3 = this.g;
                                                if (arrm != null) break block16;
                                                if (bl3) break block15;
                                                net.minecraft.client.a.v.M();
                                                net.minecraft.client.a.v.b((float)d10, (float)d11, (float)d12);
                                                net.minecraft.client.a.v.q();
                                                net.minecraft.client.a.v.d(0.5f, 0.5f, 0.5f);
                                                bl3 = this.c(o2);
                                            }
                                            w2 = W.c();
                                            i2 = w2.b();
                                            boolean bl4 = true;
                                            int n3 = 2;
                                            float f13 = 0.0625f;
                                            float f14 = 0.125f;
                                            float f15 = 0.125f;
                                            float f16 = 0.1875f;
                                            float f17 = 1.0f;
                                            float f18 = 0.5f;
                                            float f19 = 0.5f;
                                            net.minecraft.client.a.v.a(180.0f - this.h.f, 0.0f, 1.0f, 0.0f);
                                            int n4 = this.h.q.L;
                                            if (arrm == null) {
                                                n4 = n4 == 2 ? -1 : 1;
                                            }
                                            net.minecraft.client.a.v.a((float)n4 * -this.h.a, 1.0f, 0.0f, 0.0f);
                                            bl2 = this.g;
                                            if (arrm != null) break block17;
                                            if (bl2) {
                                                net.minecraft.client.a.v.r();
                                                net.minecraft.client.a.v.m(this.a(o2));
                                            }
                                            i2.a(7, net.minecraft.client.y.b.b);
                                            i2.c(-0.5, -0.5, 0.0).a(0.0625, 0.1875).d(0.0f, 1.0f, 0.0f).d();
                                            i2.c(0.5, -0.5, 0.0).a(0.125, 0.1875).d(0.0f, 1.0f, 0.0f).d();
                                            i2.c(0.5, 0.5, 0.0).a(0.125, 0.125).d(0.0f, 1.0f, 0.0f).d();
                                            i2.c(-0.5, 0.5, 0.0).a(0.0625, 0.125).d(0.0f, 1.0f, 0.0f).d();
                                            w2.a();
                                            if (arrm != null) break block18;
                                            bl2 = this.g;
                                        }
                                        if (bl2) {
                                            net.minecraft.client.a.v.s();
                                            net.minecraft.client.a.v.h();
                                        }
                                        net.minecraft.client.a.v.u();
                                        net.minecraft.client.a.v.B();
                                    }
                                    n2 = j3.al() == net.minecraft.ar.b.RIGHT ? 1 : -1;
                                    d d20 = j3.av();
                                    if (d20.w() != net.minecraft.u.h.bQ) {
                                        n2 = -n2;
                                    }
                                    float f20 = j3.c(f11);
                                    f12 = net.minecraft.k.h.g(net.minecraft.k.h.a(f20) * (float)Math.PI);
                                    float f21 = (j3.aU + (j3.bf - j3.aU) * f11) * ((float)Math.PI / 180);
                                    d19 = net.minecraft.k.h.g(f21);
                                    d18 = net.minecraft.k.h.c(f21);
                                    d17 = (double)n2 * 0.35;
                                    double d21 = 0.8;
                                    c10 = this.h.q;
                                    if (arrm != null) break block19;
                                    if (c10 == null) break block20;
                                    c10 = this.h.q;
                                }
                                if (c10.L > 0) break block21;
                            }
                            j2 = j3;
                            if (arrm != null) break block22;
                            if (j2 != Q.P().s) break block21;
                            float f22 = this.h.q.bR;
                            l l2 = new l((double)n2 * -0.36 * (double)(f22 /= 100.0f), -0.045 * (double)f22, 0.4);
                            l2 = l2.a(-(j3.E + (j3.at - j3.E) * f11) * ((float)Math.PI / 180));
                            l2 = l2.b(-(j3.ak + (j3.e - j3.ak) * f11) * ((float)Math.PI / 180));
                            l2 = l2.b(f12 * 0.5f);
                            l2 = l2.a(-f12 * 0.7f);
                            d16 = j3.N + (j3.a - j3.N) * (double)f11 + l2.e;
                            d15 = j3.L + (j3.aF - j3.L) * (double)f11 + l2.d;
                            d14 = j3.k + (j3.ax - j3.k) * (double)f11 + l2.b;
                            d13 = j3.l();
                            if (arrm == null) break block23;
                        }
                        j2 = j3;
                    }
                    d16 = j2.N + (j3.a - j3.N) * (double)f11 - d18 * d17 - d19 * 0.8;
                    d15 = j3.L + (double)j3.l() + (j3.aF - j3.L) * (double)f11 - 0.45;
                    d14 = j3.k + (j3.ax - j3.k) * (double)f11 - d19 * d17 + d18 * 0.8;
                    d13 = j3.a4() ? -0.1875 : 0.0;
                }
                double d22 = o2.N + (o2.a - o2.N) * (double)f11;
                double d23 = o2.L + (o2.aF - o2.L) * (double)f11 + 0.25;
                double d24 = o2.k + (o2.ax - o2.k) * (double)f11;
                double d25 = (float)(d16 - d22);
                double d26 = (double)((float)(d15 - d23)) + d13;
                double d27 = (float)(d14 - d24);
                net.minecraft.client.a.v.L();
                net.minecraft.client.a.v.y();
                i2.a(3, net.minecraft.client.y.b.i);
                int n5 = 16;
                for (int i3 = 0; i3 <= 16; ++i3) {
                    float f23 = (float)i3 / 16.0f;
                    i2.c(d10 + d25 * (double)f23, d11 + d26 * (double)(f23 * f23 + f23) * 0.5 + 0.25, d12 + d27 * (double)f23).b(0, 0, 0, 255).d();
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block14;
                }
                w2.a();
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.x();
            }
            super.d(o2, d10, d11, d12, f10, f11);
        }
    }

    static {
        i = new v("textures/particle/particles.png");
    }

    public o(a4 a42) {
        super(a42);
    }

    protected v a(net.minecraft.z.o o2) {
        return i;
    }
}

