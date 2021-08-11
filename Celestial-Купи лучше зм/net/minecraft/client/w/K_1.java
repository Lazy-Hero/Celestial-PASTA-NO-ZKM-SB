/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.a0;
import net.minecraft.U.x;
import net.minecraft.client.Q;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;
import net.minecraft.k.l;

public class K
extends j {
    private final /* synthetic */ c k;
    private final /* synthetic */ c[] i;
    private final /* synthetic */ c[] l;
    private final /* synthetic */ c j;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.j.b(f15);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        float f16;
        a0 a02;
        block10: {
            l l2;
            l l3;
            block13: {
                block12: {
                    int[] arrn;
                    block11: {
                        x x3;
                        block9: {
                            block8: {
                                a02 = (a0)x2;
                                f16 = f12 - (float)a02.H;
                                this.j.e = f13 * ((float)Math.PI / 180);
                                this.j.y = f14 * ((float)Math.PI / 180);
                                float[] arrf = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
                                float[] arrf2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
                                float[] arrf3 = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
                                arrn = net.minecraft.client.w.j.b();
                                float[] arrf4 = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
                                float[] arrf5 = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
                                float[] arrf6 = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
                                float f17 = (1.0f - a02.e(f16)) * 0.55f;
                                for (int i2 = 0; i2 < 12; ++i2) {
                                    this.i[i2].y = (float)Math.PI * arrf[i2];
                                    this.i[i2].e = (float)Math.PI * arrf2[i2];
                                    this.i[i2].r = (float)Math.PI * arrf3[i2];
                                    this.i[i2].v = arrf4[i2] * (1.0f + net.minecraft.k.h.c(f12 * 1.5f + (float)i2) * 0.01f - f17);
                                    this.i[i2].h = 16.0f + arrf5[i2] * (1.0f + net.minecraft.k.h.c(f12 * 1.5f + (float)i2) * 0.01f - f17);
                                    this.i[i2].u = arrf6[i2] * (1.0f + net.minecraft.k.h.c(f12 * 1.5f + (float)i2) * 0.01f - f17);
                                    if (arrn == null) {
                                        if (arrn == null) continue;
                                    }
                                    break block8;
                                }
                                this.k.u = -8.25f;
                            }
                            x x4 = Q.P().Z();
                            x3 = a02;
                            if (arrn == null) {
                                if (((a0)x3).f()) {
                                    x4 = a02.g();
                                }
                                x3 = x4;
                            }
                            if (arrn != null) break block9;
                            if (x3 == null) break block10;
                            x3 = x4;
                        }
                        l3 = x3.c(0.0f);
                        l2 = x2.c(0.0f);
                        double d10 = l3.d - l2.d;
                        if (arrn != null) break block11;
                        if (!(d10 > 0.0)) break block12;
                        this.k.h = 0.0f;
                    }
                    if (arrn == null) break block13;
                }
                this.k.h = 1.0f;
            }
            l l4 = x2.b(0.0f);
            l4 = new l(l4.e, 0.0, l4.b);
            l l5 = new l(l2.e - l3.e, 0.0, l2.b - l3.b).d().b(1.5707964f);
            double d11 = l4.g(l5);
            this.k.v = net.minecraft.k.h.a((float)Math.abs(d11)) * 2.0f * (float)Math.signum(d11);
        }
        this.k.q = true;
        float f18 = a02.a(f16);
        this.l[0].e = net.minecraft.k.h.g(f18) * (float)Math.PI * 0.05f;
        this.l[1].e = net.minecraft.k.h.g(f18) * (float)Math.PI * 0.1f;
        this.l[1].v = -1.5f;
        this.l[1].h = 0.5f;
        this.l[1].u = 14.0f;
        this.l[2].e = net.minecraft.k.h.g(f18) * (float)Math.PI * 0.15f;
        this.l[2].v = 0.5f;
        this.l[2].h = 0.5f;
        this.l[2].u = 6.0f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public K() {
        block2: {
            this.g = 64;
            int[] arrn = net.minecraft.client.w.j.b();
            this.f = 64;
            this.i = new c[12];
            this.j = new c(this);
            this.j.b(0, 0).a(-6.0f, 10.0f, -8.0f, 12, 12, 16);
            this.j.b(0, 28).a(-8.0f, 10.0f, -6.0f, 2, 12, 12);
            this.j.b(0, 28).a(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
            this.j.b(16, 40).a(-6.0f, 8.0f, -6.0f, 12, 2, 12);
            this.j.b(16, 40).a(-6.0f, 22.0f, -6.0f, 12, 2, 12);
            for (int i2 = 0; i2 < this.i.length; ++i2) {
                this.i[i2] = new c(this, 0, 0);
                this.i[i2].a(-1.0f, -4.5f, -1.0f, 2, 9, 2);
                this.j.a(this.i[i2]);
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block2;
            }
            this.k = new c(this, 8, 0);
            this.k.a(-1.0f, 15.0f, 0.0f, 2, 2, 1);
            this.j.a(this.k);
            this.l = new c[3];
            this.l[0] = new c(this, 40, 0);
            this.l[0].a(-2.0f, 14.0f, 7.0f, 4, 4, 8);
            this.l[1] = new c(this, 0, 54);
            this.l[1].a(0.0f, 14.0f, 0.0f, 3, 3, 7);
            this.l[2] = new c(this);
            this.l[2].b(41, 32).a(0.0f, 14.0f, 0.0f, 2, 2, 6);
            this.l[2].b(25, 19).a(1.0f, 10.5f, 3.0f, 1, 9, 9);
            this.j.a(this.l[0]);
            this.l[0].a(this.l[1]);
            this.l[1].a(this.l[2]);
        }
    }
}

