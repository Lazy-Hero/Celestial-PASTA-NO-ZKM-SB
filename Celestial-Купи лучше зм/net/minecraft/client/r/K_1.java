/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.p;
import net.minecraft.ar.v;
import net.minecraft.client.C.B;
import net.minecraft.client.C.l;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.o;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.D;
import net.minecraft.h.d;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class K
extends u<d> {
    public static final /* synthetic */ v A;
    private static final /* synthetic */ v B;
    private static final /* synthetic */ v z;

    public K(a4 a42) {
        super(a42, new D(0.0f), 0.5f);
        this.a(new l(this));
        this.a(new B());
    }

    static {
        A = new v("textures/entity/endercrystal/endercrystal_beam.png");
        z = new v("textures/entity/enderdragon/dragon_exploding.png");
        B = new v("textures/entity/enderdragon/dragon.png");
    }

    public static void a(double d10, double d11, double d12, float f10, double d13, double d14, double d15, int n2, double d16, double d17, double d18) {
        block2: {
            float f11 = (float)(d16 - d13);
            m[] arrm = b.b();
            float f12 = (float)(d17 - 1.0 - d14);
            float f13 = (float)(d18 - d15);
            float f14 = net.minecraft.k.h.a(f11 * f11 + f13 * f13);
            float f15 = net.minecraft.k.h.a(f11 * f11 + f12 * f12 + f13 * f13);
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.b((float)d10, (float)d11 + 2.0f, (float)d12);
            net.minecraft.client.a.v.a((float)(-Math.atan2(f13, f11)) * 57.295776f - 90.0f, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.a((float)(-Math.atan2(f14, f12)) * 57.295776f - 90.0f, 1.0f, 0.0f, 0.0f);
            W w2 = W.c();
            I i2 = w2.b();
            a0.a();
            net.minecraft.client.a.v.E();
            net.minecraft.client.a.v.g(7425);
            float f16 = 0.0f - ((float)n2 + f10) * 0.01f;
            float f17 = net.minecraft.k.h.a(f11 * f11 + f12 * f12 + f13 * f13) / 32.0f - ((float)n2 + f10) * 0.01f;
            i2.a(5, net.minecraft.client.y.b.t);
            int n3 = 8;
            for (int i3 = 0; i3 <= 8; ++i3) {
                float f18 = net.minecraft.k.h.g((float)(i3 % 8) * ((float)Math.PI * 2) / 8.0f) * 0.75f;
                float f19 = net.minecraft.k.h.c((float)(i3 % 8) * ((float)Math.PI * 2) / 8.0f) * 0.75f;
                float f20 = (float)(i3 % 8) / 8.0f;
                i2.c((double)(f18 * 0.2f), (double)(f19 * 0.2f), 0.0).a(f20, f16).b(0, 0, 0, 255).d();
                i2.c((double)f18, (double)f19, (double)f15).a(f20, f17).b(255, 255, 255, 255).d();
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block2;
            }
            w2.a();
            net.minecraft.client.a.v.c();
            net.minecraft.client.a.v.g(7424);
            a0.c();
            net.minecraft.client.a.v.B();
        }
    }

    @Override
    public void a(d d10, double d11, double d12, double d13, float f10, float f11) {
        block3: {
            p p2;
            block2: {
                m[] arrm = b.b();
                super.b(d10, d11, d12, d13, f10, f11);
                m[] arrm2 = arrm;
                p2 = d10.cH;
                if (arrm2 != null) break block2;
                if (p2 == null) break block3;
                this.b(A);
                p2 = d10.cH;
            }
            float f12 = net.minecraft.k.h.g(((float)p2.H + f11) * 0.2f) / 2.0f + 0.5f;
            f12 = (f12 * f12 + f12) * 0.2f;
            K.a(d11, d12, d13, f11, d10.a + (d10.N - d10.a) * (double)(1.0f - f11), d10.aF + (d10.L - d10.aF) * (double)(1.0f - f11), d10.ax + (d10.k - d10.ax) * (double)(1.0f - f11), d10.H, d10.cH.a, (double)f12 + d10.cH.aF, d10.cH.ax);
        }
    }

    @Override
    protected void a(d d10, float f10, float f11, float f12, float f13, float f14, float f15) {
        block6: {
            int n2;
            block5: {
                m[] arrm = b.b();
                n2 = d10.cG;
                if (arrm == null) {
                    if (n2 > 0) {
                        float f16 = (float)d10.cG / 200.0f;
                        net.minecraft.client.a.v.o(515);
                        net.minecraft.client.a.v.e();
                        net.minecraft.client.a.v.a(516, f16);
                        this.b(z);
                        this.i.b(d10, f10, f11, f12, f13, f14, f15);
                        net.minecraft.client.a.v.a(516, 0.1f);
                        net.minecraft.client.a.v.o(514);
                    }
                    this.c(d10);
                    this.i.b(d10, f10, f11, f12, f13, f14, f15);
                    n2 = d10.bc;
                }
                if (arrm != null) break block5;
                if (n2 <= 0) break block6;
                net.minecraft.client.a.v.o(514);
                net.minecraft.client.a.v.L();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                net.minecraft.client.a.v.b(1.0f, 0.0f, 0.0f, 0.5f);
                this.i.b(d10, f10, f11, f12, f13, f14, f15);
                net.minecraft.client.a.v.x();
                net.minecraft.client.a.v.f();
                n2 = 515;
            }
            net.minecraft.client.a.v.o(n2);
        }
    }

    @Override
    protected void a(d d10, float f10, float f11, float f12) {
        block6: {
            int n2;
            m[] arrm;
            block5: {
                float f13 = (float)d10.a(7, f12)[0];
                arrm = b.b();
                float f14 = (float)(d10.a(5, f12)[1] - d10.a(10, f12)[1]);
                net.minecraft.client.a.v.a(-f13, 0.0f, 1.0f, 0.0f);
                net.minecraft.client.a.v.a(f14 * 10.0f, 1.0f, 0.0f, 0.0f);
                net.minecraft.client.a.v.b(0.0f, 0.0f, 1.0f);
                n2 = d10.a2;
                if (arrm != null) break block5;
                if (n2 <= 0) break block6;
                n2 = d10.a2;
            }
            float f15 = ((float)n2 + f12 - 1.0f) / 20.0f * 1.6f;
            float f16 = f15 = net.minecraft.k.h.a(f15);
            float f17 = 1.0f;
            if (arrm == null) {
                if (f16 > f17) {
                    f15 = 1.0f;
                }
                f16 = f15 * this.c(d10);
                f17 = 0.0f;
            }
            net.minecraft.client.a.v.a(f16, f17, 0.0f, 1.0f);
        }
    }

    protected v a(d d10) {
        return B;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

