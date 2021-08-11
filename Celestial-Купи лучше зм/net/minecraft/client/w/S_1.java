/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class S
extends j {
    private final /* synthetic */ c m;
    private final /* synthetic */ c p;
    private final /* synthetic */ c q;
    private /* synthetic */ int k;
    private final /* synthetic */ c j;
    private final /* synthetic */ c i;
    private final /* synthetic */ c o;
    private final /* synthetic */ c l;
    private final /* synthetic */ c n;

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        block2: {
            block5: {
                boolean bl2;
                int[] arrn;
                block3: {
                    net.minecraft.ag.S s2;
                    block4: {
                        block0: {
                            block1: {
                                s2 = (net.minecraft.ag.S)b10;
                                arrn = net.minecraft.client.w.j.b();
                                this.o.h = 12.0f;
                                this.o.u = -10.0f;
                                this.j.h = 15.0f;
                                this.j.u = -9.0f;
                                this.q.h = 15.0f;
                                this.q.u = 8.0f;
                                this.i.h = 20.0f;
                                this.i.u = 14.0f;
                                this.p.h = 13.8f;
                                this.p.u = -5.0f;
                                this.n.h = 13.8f;
                                this.n.u = -5.0f;
                                this.l.h = 18.0f;
                                this.l.u = 5.0f;
                                this.m.h = 18.0f;
                                this.m.u = 5.0f;
                                this.q.y = 0.9f;
                                bl2 = s2.a4();
                                if (arrn != null) break block0;
                                if (!bl2) break block1;
                                this.o.h += 1.0f;
                                this.j.h += 2.0f;
                                this.q.h += 1.0f;
                                this.i.h += -4.0f;
                                this.i.u += 2.0f;
                                this.q.y = 1.5707964f;
                                this.i.y = 1.5707964f;
                                this.k = 0;
                                if (arrn == null) break block2;
                            }
                            bl2 = s2.ai();
                        }
                        if (arrn != null) break block3;
                        if (!bl2) break block4;
                        this.i.h = this.q.h;
                        this.i.u += 2.0f;
                        this.q.y = 1.5707964f;
                        this.i.y = 1.5707964f;
                        this.k = 2;
                        if (arrn == null) break block2;
                    }
                    bl2 = s2.D();
                }
                if (!bl2) break block5;
                this.o.y = 0.7853982f;
                this.o.h += -4.0f;
                this.o.u += 5.0f;
                this.j.h += -3.3f;
                this.j.u += 1.0f;
                this.q.h += 8.0f;
                this.q.u += -2.0f;
                this.i.h += 2.0f;
                this.i.u += -0.8f;
                this.q.y = 1.7278761f;
                this.i.y = 2.670354f;
                this.p.y = -0.15707964f;
                this.p.h = 15.8f;
                this.p.u = -7.0f;
                this.n.y = -0.15707964f;
                this.n.h = 15.8f;
                this.n.u = -7.0f;
                this.l.y = -1.5707964f;
                this.l.h = 21.0f;
                this.l.u = 1.0f;
                this.m.y = -1.5707964f;
                this.m.h = 21.0f;
                this.m.u = 1.0f;
                this.k = 3;
                if (arrn == null) break block2;
            }
            this.k = 1;
        }
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            S s2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    int[] arrn2 = arrn;
                    s2 = this;
                    if (arrn2 != null) break block2;
                    if (!s2.h) break block3;
                    float f16 = 2.0f;
                    v.M();
                    v.d(0.75f, 0.75f, 0.75f);
                    v.b(0.0f, 10.0f * f15, 4.0f * f15);
                    this.j.b(f15);
                    v.B();
                    v.M();
                    v.d(0.5f, 0.5f, 0.5f);
                    v.b(0.0f, 24.0f * f15, 0.0f);
                    this.o.b(f15);
                    this.l.b(f15);
                    this.m.b(f15);
                    this.p.b(f15);
                    this.n.b(f15);
                    this.q.b(f15);
                    this.i.b(f15);
                    v.B();
                    if (arrn2 == null) break block4;
                }
                this.j.b(f15);
                this.o.b(f15);
                this.q.b(f15);
                this.i.b(f15);
                this.l.b(f15);
                this.m.b(f15);
                this.p.b(f15);
                s2 = this;
            }
            s2.n.b(f15);
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block3: {
            block6: {
                S s2;
                block7: {
                    int n2;
                    int n3;
                    int[] arrn;
                    block4: {
                        block5: {
                            block2: {
                                this.j.y = f14 * ((float)Math.PI / 180);
                                this.j.e = f13 * ((float)Math.PI / 180);
                                arrn = net.minecraft.client.w.j.b();
                                n3 = this.k;
                                n2 = 3;
                                if (arrn != null) break block2;
                                if (n3 == n2) break block3;
                                this.o.y = 1.5707964f;
                                n3 = this.k;
                                n2 = 2;
                            }
                            if (arrn != null) break block4;
                            if (n3 != n2) break block5;
                            this.l.y = net.minecraft.k.h.c(f10 * 0.6662f) * f11;
                            this.m.y = net.minecraft.k.h.c(f10 * 0.6662f + 0.3f) * f11;
                            this.p.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI + 0.3f) * f11;
                            this.n.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * f11;
                            this.i.y = 1.7278761f + 0.31415927f * net.minecraft.k.h.c(f10) * f11;
                            if (arrn == null) break block3;
                        }
                        this.l.y = net.minecraft.k.h.c(f10 * 0.6662f) * f11;
                        this.m.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * f11;
                        this.p.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * f11;
                        this.n.y = net.minecraft.k.h.c(f10 * 0.6662f) * f11;
                        s2 = this;
                        if (arrn != null) break block6;
                        n3 = s2.k;
                        n2 = 1;
                    }
                    if (n3 != n2) break block7;
                    this.i.y = 1.7278761f + 0.7853982f * net.minecraft.k.h.c(f10) * f11;
                    if (arrn == null) break block3;
                }
                s2 = this;
            }
            s2.i.y = 1.7278761f + 0.47123894f * net.minecraft.k.h.c(f10) * f11;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public S() {
        this.k = 1;
        this.a("head.main", 0, 0);
        this.a("head.nose", 0, 24);
        this.a("head.ear1", 0, 10);
        this.a("head.ear2", 6, 10);
        this.j = new c(this, "head");
        this.j.a("main", -2.5f, -2.0f, -3.0f, 5, 4, 5);
        this.j.a("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2);
        this.j.a("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2);
        this.j.a("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2);
        this.j.a(0.0f, 15.0f, -9.0f);
        this.o = new c(this, 20, 0);
        this.o.b(-2.0f, 3.0f, -8.0f, 4, 16, 6, 0.0f);
        this.o.a(0.0f, 12.0f, -10.0f);
        this.q = new c(this, 0, 15);
        this.q.a(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.q.y = 0.9f;
        this.q.a(0.0f, 15.0f, 8.0f);
        this.i = new c(this, 4, 15);
        this.i.a(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.i.a(0.0f, 20.0f, 14.0f);
        this.l = new c(this, 8, 13);
        this.l.a(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.l.a(1.1f, 18.0f, 5.0f);
        this.m = new c(this, 8, 13);
        this.m.a(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.m.a(-1.1f, 18.0f, 5.0f);
        this.p = new c(this, 40, 0);
        this.p.a(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.p.a(1.2f, 13.8f, -5.0f);
        this.n = new c(this, 40, 0);
        this.n.a(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.n.a(-1.2f, 13.8f, -5.0f);
    }
}

