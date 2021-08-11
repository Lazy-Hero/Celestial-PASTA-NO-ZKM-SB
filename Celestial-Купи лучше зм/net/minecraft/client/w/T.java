/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.U;
import net.minecraft.client.w.b;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class T
extends j {
    /* synthetic */ c t;
    private /* synthetic */ b l;
    /* synthetic */ c q;
    /* synthetic */ c m;
    /* synthetic */ c o;
    /* synthetic */ c r;
    /* synthetic */ c k;
    /* synthetic */ c n;
    /* synthetic */ c i;
    /* synthetic */ c j;
    /* synthetic */ c s;
    /* synthetic */ c p;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.j.b(f15);
        this.n.b(f15);
        this.i.b(f15);
        this.t.b(f15);
        this.m.b(f15);
        this.r.b(f15);
        this.s.b(f15);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        block6: {
            block9: {
                block10: {
                    boolean bl2;
                    int[] arrn;
                    block7: {
                        U u2;
                        block8: {
                            B b11;
                            block5: {
                                this.q.y = -0.2214f;
                                arrn = net.minecraft.client.w.j.b();
                                this.j.y = 0.4937f;
                                this.n.y = -0.69813174f;
                                this.n.e = (float)(-Math.PI);
                                this.i.y = -0.69813174f;
                                this.i.e = (float)(-Math.PI);
                                this.r.y = -0.0299f;
                                this.s.y = -0.0299f;
                                this.r.h = 22.0f;
                                this.s.h = 22.0f;
                                b11 = b10;
                                if (arrn != null) break block5;
                                if (!(b11 instanceof U)) break block6;
                                b11 = b10;
                            }
                            u2 = (U)b11;
                            bl2 = u2.E();
                            if (arrn == null) {
                                if (bl2) {
                                    this.r.r = -0.34906584f;
                                    this.s.r = 0.34906584f;
                                    this.l = net.minecraft.client.w.b.PARTY;
                                    return;
                                }
                                bl2 = u2.D();
                            }
                            if (arrn != null) break block7;
                            if (!bl2) break block8;
                            float f13 = 1.9f;
                            this.m.h = 17.59f;
                            this.t.y = 1.5388988f;
                            this.t.h = 22.97f;
                            this.j.h = 18.4f;
                            this.n.r = -0.0873f;
                            this.n.h = 18.84f;
                            this.i.r = 0.0873f;
                            this.i.h = 18.84f;
                            this.r.h += 1.0f;
                            this.s.h += 1.0f;
                            this.r.y += 1.0f;
                            this.s.y += 1.0f;
                            this.l = net.minecraft.client.w.b.SITTING;
                            if (arrn == null) break block9;
                        }
                        bl2 = u2.F();
                    }
                    if (!bl2) break block10;
                    this.r.y += 0.69813174f;
                    this.s.y += 0.69813174f;
                    this.l = net.minecraft.client.w.b.FLYING;
                    if (arrn == null) break block9;
                }
                this.l = net.minecraft.client.w.b.STANDING;
            }
            this.r.r = 0.0f;
            this.s.r = 0.0f;
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        float f16;
        block5: {
            T t2;
            block6: {
                block8: {
                    T t3;
                    b b10;
                    b b11;
                    block7: {
                        f16 = f12 * 0.3f;
                        int[] arrn = net.minecraft.client.w.j.b();
                        this.m.y = f14 * ((float)Math.PI / 180);
                        this.m.e = f13 * ((float)Math.PI / 180);
                        this.m.r = 0.0f;
                        this.m.v = 0.0f;
                        this.j.v = 0.0f;
                        this.t.v = 0.0f;
                        this.i.v = -1.5f;
                        this.n.v = 1.5f;
                        t2 = this;
                        if (arrn != null) break block5;
                        if (t2.l == net.minecraft.client.w.b.FLYING) break block6;
                        b11 = this.l;
                        b10 = net.minecraft.client.w.b.SITTING;
                        if (arrn != null) break block7;
                        if (b11 == b10) {
                            return;
                        }
                        t3 = this;
                        if (arrn != null) break block8;
                        b11 = t3.l;
                        b10 = net.minecraft.client.w.b.PARTY;
                    }
                    if (b11 == b10) {
                        float f17 = net.minecraft.k.h.c((float)x2.H);
                        float f18 = net.minecraft.k.h.g((float)x2.H);
                        this.m.v = f17;
                        this.m.h = 15.69f + f18;
                        this.m.y = 0.0f;
                        this.m.e = 0.0f;
                        this.m.r = net.minecraft.k.h.g((float)x2.H) * 0.4f;
                        this.j.v = f17;
                        this.j.h = 16.5f + f18;
                        this.n.r = -0.0873f - f12;
                        this.n.v = 1.5f + f17;
                        this.n.h = 16.94f + f18;
                        this.i.r = 0.0873f + f12;
                        this.i.v = -1.5f + f17;
                        this.i.h = 16.94f + f18;
                        this.t.v = f17;
                        this.t.h = 21.07f + f18;
                        return;
                    }
                    this.r.y += net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
                    t3 = this;
                }
                t3.s.y += net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
            }
            this.m.h = 15.69f + f16;
            this.t.y = 1.015f + net.minecraft.k.h.c(f10 * 0.6662f) * 0.3f * f11;
            this.t.h = 21.07f + f16;
            this.j.h = 16.5f + f16;
            this.n.r = -0.0873f - f12;
            this.n.h = 16.94f + f16;
            this.i.r = 0.0873f + f12;
            this.i.h = 16.94f + f16;
            this.r.h = 22.0f + f16;
            t2 = this;
        }
        t2.s.h = 22.0f + f16;
    }

    public T() {
        this.l = net.minecraft.client.w.b.STANDING;
        this.g = 32;
        this.f = 32;
        this.j = new c(this, 2, 8);
        this.j.a(-1.5f, 0.0f, -1.5f, 3, 6, 3);
        this.j.a(0.0f, 16.5f, -3.0f);
        this.t = new c(this, 22, 1);
        this.t.a(-1.5f, -1.0f, -1.0f, 3, 4, 1);
        this.t.a(0.0f, 21.07f, 1.16f);
        this.n = new c(this, 19, 8);
        this.n.a(-0.5f, 0.0f, -1.5f, 1, 5, 3);
        this.n.a(1.5f, 16.94f, -2.76f);
        this.i = new c(this, 19, 8);
        this.i.a(-0.5f, 0.0f, -1.5f, 1, 5, 3);
        this.i.a(-1.5f, 16.94f, -2.76f);
        this.m = new c(this, 2, 2);
        this.m.a(-1.0f, -1.5f, -1.0f, 2, 3, 2);
        this.m.a(0.0f, 15.69f, -2.76f);
        this.o = new c(this, 10, 0);
        this.o.a(-1.0f, -0.5f, -2.0f, 2, 1, 4);
        this.o.a(0.0f, -2.0f, -1.0f);
        this.m.a(this.o);
        this.p = new c(this, 11, 7);
        this.p.a(-0.5f, -1.0f, -0.5f, 1, 2, 1);
        this.p.a(0.0f, -0.5f, -1.5f);
        this.m.a(this.p);
        this.k = new c(this, 16, 7);
        this.k.a(-0.5f, 0.0f, -0.5f, 1, 2, 1);
        this.k.a(0.0f, -1.75f, -2.45f);
        this.m.a(this.k);
        this.q = new c(this, 2, 18);
        this.q.a(0.0f, -4.0f, -2.0f, 0, 5, 4);
        this.q.a(0.0f, -2.15f, 0.15f);
        this.m.a(this.q);
        this.r = new c(this, 14, 18);
        this.r.a(-0.5f, 0.0f, -0.5f, 1, 2, 1);
        this.r.a(1.0f, 22.0f, -1.05f);
        this.s = new c(this, 14, 18);
        this.s.a(-0.5f, 0.0f, -0.5f, 1, 2, 1);
        this.s.a(-1.0f, 22.0f, -1.05f);
    }
}

