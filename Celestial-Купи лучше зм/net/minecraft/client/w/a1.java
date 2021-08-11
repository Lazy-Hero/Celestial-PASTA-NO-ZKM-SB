/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.P;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class a1
extends j {
    private final /* synthetic */ c p;
    private final /* synthetic */ c q;
    private final /* synthetic */ c i;
    private /* synthetic */ float m;
    private final /* synthetic */ c o;
    private final /* synthetic */ c r;
    private final /* synthetic */ c n;
    private final /* synthetic */ c s;
    private final /* synthetic */ c j;
    private final /* synthetic */ c k;
    private final /* synthetic */ c l;
    private final /* synthetic */ c u;
    private final /* synthetic */ c t;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        super.a(b10, f10, f11, f12);
        this.m = net.minecraft.k.h.g(((P)b10).a(f12) * (float)Math.PI);
    }

    public a1() {
        this.a("head.main", 0, 0);
        this.a("head.nose", 0, 24);
        this.a("head.ear1", 0, 10);
        this.a("head.ear2", 6, 10);
        this.l = new c(this, 26, 24);
        this.l.a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.l.a(3.0f, 17.5f, 3.7f);
        this.l.A = true;
        this.a(this.l, 0.0f, 0.0f, 0.0f);
        this.t = new c(this, 8, 24);
        this.t.a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.t.a(-3.0f, 17.5f, 3.7f);
        this.t.A = true;
        this.a(this.t, 0.0f, 0.0f, 0.0f);
        this.s = new c(this, 30, 15);
        this.s.a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.s.a(3.0f, 17.5f, 3.7f);
        this.s.A = true;
        this.a(this.s, -0.34906584f, 0.0f, 0.0f);
        this.r = new c(this, 16, 15);
        this.r.a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.r.a(-3.0f, 17.5f, 3.7f);
        this.r.A = true;
        this.a(this.r, -0.34906584f, 0.0f, 0.0f);
        this.q = new c(this, 0, 0);
        this.q.a(-3.0f, -2.0f, -10.0f, 6, 5, 10);
        this.q.a(0.0f, 19.0f, 8.0f);
        this.q.A = true;
        this.a(this.q, -0.34906584f, 0.0f, 0.0f);
        this.j = new c(this, 8, 15);
        this.j.a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.j.a(3.0f, 17.0f, -1.0f);
        this.j.A = true;
        this.a(this.j, -0.17453292f, 0.0f, 0.0f);
        this.p = new c(this, 0, 15);
        this.p.a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.p.a(-3.0f, 17.0f, -1.0f);
        this.p.A = true;
        this.a(this.p, -0.17453292f, 0.0f, 0.0f);
        this.o = new c(this, 32, 0);
        this.o.a(-2.5f, -4.0f, -5.0f, 5, 4, 5);
        this.o.a(0.0f, 16.0f, -1.0f);
        this.o.A = true;
        this.a(this.o, 0.0f, 0.0f, 0.0f);
        this.u = new c(this, 52, 0);
        this.u.a(-2.5f, -9.0f, -1.0f, 2, 5, 1);
        this.u.a(0.0f, 16.0f, -1.0f);
        this.u.A = true;
        this.a(this.u, 0.0f, -0.2617994f, 0.0f);
        this.i = new c(this, 58, 0);
        this.i.a(0.5f, -9.0f, -1.0f, 2, 5, 1);
        this.i.a(0.0f, 16.0f, -1.0f);
        this.i.A = true;
        this.a(this.i, 0.0f, 0.2617994f, 0.0f);
        this.n = new c(this, 52, 6);
        this.n.a(-1.5f, -1.5f, 0.0f, 3, 3, 2);
        this.n.a(0.0f, 20.0f, 7.0f);
        this.n.A = true;
        this.a(this.n, -0.3490659f, 0.0f, 0.0f);
        this.k = new c(this, 32, 9);
        this.k.a(-0.5f, -2.5f, -5.5f, 1, 1, 1);
        this.k.a(0.0f, 16.0f, -1.0f);
        this.k.A = true;
        this.a(this.k, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            a1 a12;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    int[] arrn2 = arrn;
                    a12 = this;
                    if (arrn2 != null) break block2;
                    if (!a12.h) break block3;
                    float f16 = 1.5f;
                    v.M();
                    v.d(0.56666666f, 0.56666666f, 0.56666666f);
                    v.b(0.0f, 22.0f * f15, 2.0f * f15);
                    this.o.b(f15);
                    this.i.b(f15);
                    this.u.b(f15);
                    this.k.b(f15);
                    v.B();
                    v.M();
                    v.d(0.4f, 0.4f, 0.4f);
                    v.b(0.0f, 36.0f * f15, 0.0f);
                    this.l.b(f15);
                    this.t.b(f15);
                    this.s.b(f15);
                    this.r.b(f15);
                    this.q.b(f15);
                    this.j.b(f15);
                    this.p.b(f15);
                    this.n.b(f15);
                    v.B();
                    if (arrn2 == null) break block4;
                }
                v.M();
                v.d(0.6f, 0.6f, 0.6f);
                v.b(0.0f, 16.0f * f15, 0.0f);
                this.l.b(f15);
                this.t.b(f15);
                this.s.b(f15);
                this.r.b(f15);
                this.q.b(f15);
                this.j.b(f15);
                this.p.b(f15);
                this.o.b(f15);
                this.u.b(f15);
                this.i.b(f15);
                this.n.b(f15);
                a12 = this;
            }
            a12.k.b(f15);
            v.B();
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        float f16 = f12 - (float)x2.H;
        P p2 = (P)x2;
        this.k.y = f14 * ((float)Math.PI / 180);
        this.o.y = f14 * ((float)Math.PI / 180);
        this.u.y = f14 * ((float)Math.PI / 180);
        this.i.y = f14 * ((float)Math.PI / 180);
        this.k.e = f13 * ((float)Math.PI / 180);
        this.o.e = f13 * ((float)Math.PI / 180);
        this.u.e = this.k.e - 0.2617994f;
        this.i.e = this.k.e + 0.2617994f;
        this.m = net.minecraft.k.h.g(p2.a(f16) * (float)Math.PI);
        this.s.y = (this.m * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.r.y = (this.m * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.l.y = this.m * 50.0f * ((float)Math.PI / 180);
        this.t.y = this.m * 50.0f * ((float)Math.PI / 180);
        this.j.y = (this.m * -40.0f - 11.0f) * ((float)Math.PI / 180);
        this.p.y = (this.m * -40.0f - 11.0f) * ((float)Math.PI / 180);
    }

    private void a(c c10, float f10, float f11, float f12) {
        c10.y = f10;
        c10.e = f11;
        c10.r = f12;
    }
}

