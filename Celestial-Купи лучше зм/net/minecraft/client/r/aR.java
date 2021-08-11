/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.E;
import net.minecraft.ar.v;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.as;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class aR
extends b<E> {
    private static final /* synthetic */ v i;

    public aR(a4 a42) {
        super(a42);
        this.a = 0.15f;
        this.d = 0.75f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        i = new v("textures/entity/experience_orb.png");
    }

    protected v a(E e10) {
        return i;
    }

    public void a(E e10, double d10, double d11, double d12, float f10, float f11) {
        block8: {
            block9: {
                int n2;
                int n3;
                int n4;
                I i2;
                W w2;
                float f12;
                float f13;
                float f14;
                float f15;
                block10: {
                    int n5;
                    m[] arrm;
                    block7: {
                        arrm = b.b();
                        n5 = this.g;
                        if (arrm != null) break block7;
                        if (n5 != 0) break block8;
                        net.minecraft.client.a.v.M();
                        net.minecraft.client.a.v.b((float)d10, (float)d11, (float)d12);
                        this.c(e10);
                        a0.c();
                        n5 = e10.a();
                    }
                    int n6 = n5;
                    f15 = (float)(n6 % 4 * 16 + 0) / 64.0f;
                    f14 = (float)(n6 % 4 * 16 + 16) / 64.0f;
                    f13 = (float)(n6 / 4 * 16 + 0) / 64.0f;
                    f12 = (float)(n6 / 4 * 16 + 16) / 64.0f;
                    float f16 = 1.0f;
                    float f17 = 0.5f;
                    float f18 = 0.25f;
                    int n7 = e10.aS();
                    int n8 = n7 % 65536;
                    int n9 = n7 / 65536;
                    as.a(as.p, n8, (float)n9);
                    net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                    float f19 = 255.0f;
                    float f20 = ((float)e10.aO + f11) / 2.0f;
                    int n10 = fU.g();
                    if (arrm == null) {
                        if (n10 != 0) {
                            f20 = fa.a(f20);
                        }
                        n9 = (int)((net.minecraft.k.h.g(f20 + 0.0f) + 1.0f) * 0.5f * 255.0f);
                        n10 = 255;
                    }
                    int n11 = n10;
                    int n12 = (int)((net.minecraft.k.h.g(f20 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
                    net.minecraft.client.a.v.b(0.0f, 0.1f, 0.0f);
                    net.minecraft.client.a.v.a(180.0f - this.h.f, 0.0f, 1.0f, 0.0f);
                    int n13 = this.h.q.L;
                    if (arrm == null) {
                        n13 = n13 == 2 ? -1 : 1;
                    }
                    net.minecraft.client.a.v.a((float)n13 * -this.h.a, 1.0f, 0.0f, 0.0f);
                    float f21 = 0.3f;
                    net.minecraft.client.a.v.d(0.3f, 0.3f, 0.3f);
                    w2 = W.c();
                    i2 = w2.b();
                    i2.a(7, net.minecraft.client.y.b.e);
                    n4 = n9;
                    n3 = 255;
                    n2 = n12;
                    if (arrm != null) break block9;
                    if (!fU.g()) break block10;
                    int n14 = fa.b(f20);
                    if (arrm != null) break block9;
                    if (n14 >= 0) {
                        n4 = n14 >> 16 & 0xFF;
                        n3 = n14 >> 8 & 0xFF;
                        n2 = n14 >> 0 & 0xFF;
                    }
                }
                i2.c(-0.5, -0.25, 0.0).a(f15, f12).b(n4, n3, n2, 128).d(0.0f, 1.0f, 0.0f).d();
                i2.c(0.5, -0.25, 0.0).a(f14, f12).b(n4, n3, n2, 128).d(0.0f, 1.0f, 0.0f).d();
                i2.c(0.5, 0.75, 0.0).a(f14, f13).b(n4, n3, n2, 128).d(0.0f, 1.0f, 0.0f).d();
                i2.c(-0.5, 0.75, 0.0).a(f15, f13).b(n4, n3, n2, 128).d(0.0f, 1.0f, 0.0f).d();
                w2.a();
                net.minecraft.client.a.v.f();
                net.minecraft.client.a.v.u();
                net.minecraft.client.a.v.B();
            }
            super.d(e10, d10, d11, d12, f10, f11);
        }
    }
}

