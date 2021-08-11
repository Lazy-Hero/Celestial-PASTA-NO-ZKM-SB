/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.k;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class aT
extends b<net.minecraft.J.m> {
    private static final /* synthetic */ v i;

    private void a(net.minecraft.J.m m2, float f10, float f11) {
        aA aA2;
        int n2 = net.minecraft.k.h.f(m2.a);
        int n3 = net.minecraft.k.h.f(m2.aF + (double)(f11 / 16.0f));
        m[] arrm = b.b();
        int n4 = net.minecraft.k.h.f(m2.ax);
        aA aA3 = aA2 = m2.aL;
        aA aA4 = aA.NORTH;
        if (arrm == null) {
            if (aA3 == aA4) {
                n2 = net.minecraft.k.h.f(m2.a + (double)(f10 / 16.0f));
            }
            aA3 = aA2;
            aA4 = aA.WEST;
        }
        if (arrm == null) {
            if (aA3 == aA4) {
                n4 = net.minecraft.k.h.f(m2.ax - (double)(f10 / 16.0f));
            }
            aA3 = aA2;
            aA4 = aA.SOUTH;
        }
        if (arrm == null) {
            if (aA3 == aA4) {
                n2 = net.minecraft.k.h.f(m2.a - (double)(f10 / 16.0f));
            }
            aA3 = aA2;
            aA4 = aA.EAST;
        }
        if (aA3 == aA4) {
            n4 = net.minecraft.k.h.f(m2.ax + (double)(f10 / 16.0f));
        }
        int n5 = this.h.h.a(new n(n2, n3, n4), 0);
        int n6 = n5 % 65536;
        int n7 = n5 / 65536;
        as.a(as.p, n6, (float)n7);
        net.minecraft.client.a.v.c(1.0f, 1.0f, 1.0f);
    }

    static {
        i = new v("textures/painting/paintings_kristoffer_zetterstrand.png");
    }

    public void a(net.minecraft.J.m m2, double d10, double d11, double d12, float f10, float f11) {
        aT aT2;
        block6: {
            boolean bl2;
            block5: {
                m[] arrm = b.b();
                net.minecraft.client.a.v.M();
                m[] arrm2 = arrm;
                net.minecraft.client.a.v.b(d10, d11, d12);
                net.minecraft.client.a.v.a(180.0f - f10, 0.0f, 1.0f, 0.0f);
                net.minecraft.client.a.v.q();
                this.c(m2);
                k k2 = m2.aO;
                float f12 = 0.0625f;
                net.minecraft.client.a.v.d(0.0625f, 0.0625f, 0.0625f);
                bl2 = this.g;
                if (arrm2 != null) break block5;
                if (bl2) {
                    net.minecraft.client.a.v.r();
                    net.minecraft.client.a.v.m(this.a(m2));
                }
                this.a(m2, k2.sizeX, k2.sizeY, k2.offsetX, k2.offsetY);
                aT2 = this;
                if (arrm2 != null) break block6;
                bl2 = aT2.g;
            }
            if (bl2) {
                net.minecraft.client.a.v.s();
                net.minecraft.client.a.v.h();
            }
            net.minecraft.client.a.v.u();
            net.minecraft.client.a.v.B();
            aT2 = this;
        }
        super.d(m2, d10, d11, d12, f10, f11);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected v a(net.minecraft.J.m m2) {
        return i;
    }

    private void a(net.minecraft.J.m m2, int n2, int n3, int n4, int n5) {
        float f10 = (float)(-n2) / 2.0f;
        float f11 = (float)(-n3) / 2.0f;
        float f12 = 0.5f;
        float f13 = 0.75f;
        float f14 = 0.8125f;
        float f15 = 0.0f;
        float f16 = 0.0625f;
        float f17 = 0.75f;
        float f18 = 0.8125f;
        float f19 = 0.001953125f;
        float f20 = 0.001953125f;
        float f21 = 0.7519531f;
        m[] arrm = b.b();
        float f22 = 0.7519531f;
        float f23 = 0.0f;
        float f24 = 0.0625f;
        int n6 = 0;
        while (n6 < n2 / 16) {
            block3: {
                for (int i2 = 0; i2 < n3 / 16; ++i2) {
                    float f25 = f10 + (float)((n6 + 1) * 16);
                    float f26 = f10 + (float)(n6 * 16);
                    float f27 = f11 + (float)((i2 + 1) * 16);
                    float f28 = f11 + (float)(i2 * 16);
                    this.a(m2, (f25 + f26) / 2.0f, (f27 + f28) / 2.0f);
                    float f29 = (float)(n4 + n2 - n6 * 16) / 256.0f;
                    float f30 = (float)(n4 + n2 - (n6 + 1) * 16) / 256.0f;
                    float f31 = (float)(n5 + n3 - i2 * 16) / 256.0f;
                    float f32 = (float)(n5 + n3 - (i2 + 1) * 16) / 256.0f;
                    W w2 = W.c();
                    I i3 = w2.b();
                    i3.a(7, net.minecraft.client.y.b.b);
                    i3.c((double)f25, (double)f28, -0.5).a(f30, f31).d(0.0f, 0.0f, -1.0f).d();
                    i3.c((double)f26, (double)f28, -0.5).a(f29, f31).d(0.0f, 0.0f, -1.0f).d();
                    i3.c((double)f26, (double)f27, -0.5).a(f29, f32).d(0.0f, 0.0f, -1.0f).d();
                    i3.c((double)f25, (double)f27, -0.5).a(f30, f32).d(0.0f, 0.0f, -1.0f).d();
                    i3.c((double)f25, (double)f27, 0.5).a(0.75, 0.0).d(0.0f, 0.0f, 1.0f).d();
                    i3.c((double)f26, (double)f27, 0.5).a(0.8125, 0.0).d(0.0f, 0.0f, 1.0f).d();
                    i3.c((double)f26, (double)f28, 0.5).a(0.8125, 0.0625).d(0.0f, 0.0f, 1.0f).d();
                    i3.c((double)f25, (double)f28, 0.5).a(0.75, 0.0625).d(0.0f, 0.0f, 1.0f).d();
                    i3.c((double)f25, (double)f27, -0.5).a(0.75, 0.001953125).d(0.0f, 1.0f, 0.0f).d();
                    i3.c((double)f26, (double)f27, -0.5).a(0.8125, 0.001953125).d(0.0f, 1.0f, 0.0f).d();
                    i3.c((double)f26, (double)f27, 0.5).a(0.8125, 0.001953125).d(0.0f, 1.0f, 0.0f).d();
                    i3.c((double)f25, (double)f27, 0.5).a(0.75, 0.001953125).d(0.0f, 1.0f, 0.0f).d();
                    i3.c((double)f25, (double)f28, 0.5).a(0.75, 0.001953125).d(0.0f, -1.0f, 0.0f).d();
                    i3.c((double)f26, (double)f28, 0.5).a(0.8125, 0.001953125).d(0.0f, -1.0f, 0.0f).d();
                    i3.c((double)f26, (double)f28, -0.5).a(0.8125, 0.001953125).d(0.0f, -1.0f, 0.0f).d();
                    i3.c((double)f25, (double)f28, -0.5).a(0.75, 0.001953125).d(0.0f, -1.0f, 0.0f).d();
                    i3.c((double)f25, (double)f27, 0.5).a(0.751953125, 0.0).d(-1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f25, (double)f28, 0.5).a(0.751953125, 0.0625).d(-1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f25, (double)f28, -0.5).a(0.751953125, 0.0625).d(-1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f25, (double)f27, -0.5).a(0.751953125, 0.0).d(-1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f26, (double)f27, -0.5).a(0.751953125, 0.0).d(1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f26, (double)f28, -0.5).a(0.751953125, 0.0625).d(1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f26, (double)f28, 0.5).a(0.751953125, 0.0625).d(1.0f, 0.0f, 0.0f).d();
                    i3.c((double)f26, (double)f27, 0.5).a(0.751953125, 0.0).d(1.0f, 0.0f, 0.0f).d();
                    w2.a();
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block3;
                }
                ++n6;
            }
            if (arrm == null) continue;
        }
    }

    public aT(a4 a42) {
        super(a42);
    }
}

