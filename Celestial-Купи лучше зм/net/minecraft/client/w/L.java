/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.D;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class L
extends j {
    private final /* synthetic */ c B;
    private final /* synthetic */ c o;
    private final /* synthetic */ c A;
    private final /* synthetic */ c k;
    private final /* synthetic */ c M;
    private final /* synthetic */ c I;
    private final /* synthetic */ c w;
    private final /* synthetic */ c n;
    private final /* synthetic */ c K;
    private final /* synthetic */ c E;
    private final /* synthetic */ c N;
    private final /* synthetic */ c v;
    private final /* synthetic */ c m;
    private final /* synthetic */ c J;
    private final /* synthetic */ c S;
    private final /* synthetic */ c G;
    private final /* synthetic */ c r;
    private final /* synthetic */ c i;
    private final /* synthetic */ c y;
    private final /* synthetic */ c F;
    private final /* synthetic */ c Q;
    private final /* synthetic */ c T;
    private final /* synthetic */ c l;
    private final /* synthetic */ c s;
    private final /* synthetic */ c C;
    private final /* synthetic */ c p;
    private final /* synthetic */ c U;
    private final /* synthetic */ c j;
    private final /* synthetic */ c R;
    private final /* synthetic */ c L;
    private final /* synthetic */ c z;
    private final /* synthetic */ c u;
    private final /* synthetic */ c x;
    private final /* synthetic */ c P;
    private final /* synthetic */ c D;
    private final /* synthetic */ c t;
    private final /* synthetic */ c q;
    private final /* synthetic */ c H;
    private final /* synthetic */ c O;

    public L() {
        this.g = 128;
        this.f = 128;
        this.z = new c(this, 0, 34);
        int[] arrn = net.minecraft.client.w.j.b();
        this.z.a(-5.0f, -8.0f, -19.0f, 10, 10, 24);
        this.z.a(0.0f, 11.0f, 9.0f);
        this.C = new c(this, 44, 0);
        this.C.a(-1.0f, -1.0f, 0.0f, 2, 2, 3);
        this.C.a(0.0f, 3.0f, 14.0f);
        this.C.y = -1.134464f;
        this.Q = new c(this, 38, 7);
        this.Q.a(-1.5f, -2.0f, 3.0f, 3, 4, 7);
        this.Q.a(0.0f, 3.0f, 14.0f);
        this.Q.y = -1.134464f;
        this.P = new c(this, 24, 3);
        this.P.a(-1.5f, -4.5f, 9.0f, 3, 4, 7);
        this.P.a(0.0f, 3.0f, 14.0f);
        this.P.y = -1.3962634f;
        this.m = new c(this, 78, 29);
        this.m.a(-2.5f, -2.0f, -2.5f, 4, 9, 5);
        this.m.a(4.0f, 9.0f, 11.0f);
        this.p = new c(this, 78, 43);
        this.p.a(-2.0f, 0.0f, -1.5f, 3, 5, 3);
        this.p.a(4.0f, 16.0f, 11.0f);
        this.I = new c(this, 78, 51);
        this.I.a(-2.5f, 5.1f, -2.0f, 4, 3, 4);
        this.I.a(4.0f, 16.0f, 11.0f);
        this.L = new c(this, 96, 29);
        this.L.a(-1.5f, -2.0f, -2.5f, 4, 9, 5);
        this.L.a(-4.0f, 9.0f, 11.0f);
        this.U = new c(this, 96, 43);
        this.U.a(-1.0f, 0.0f, -1.5f, 3, 5, 3);
        this.U.a(-4.0f, 16.0f, 11.0f);
        this.O = new c(this, 96, 51);
        this.O.a(-1.5f, 5.1f, -2.0f, 4, 3, 4);
        this.O.a(-4.0f, 16.0f, 11.0f);
        this.G = new c(this, 44, 29);
        this.G.a(-1.9f, -1.0f, -2.1f, 3, 8, 4);
        this.G.a(4.0f, 9.0f, -8.0f);
        this.u = new c(this, 44, 41);
        this.u.a(-1.9f, 0.0f, -1.6f, 3, 5, 3);
        this.u.a(4.0f, 16.0f, -8.0f);
        this.j = new c(this, 44, 51);
        this.j.a(-2.4f, 5.1f, -2.1f, 4, 3, 4);
        this.j.a(4.0f, 16.0f, -8.0f);
        this.B = new c(this, 60, 29);
        this.B.a(-1.1f, -1.0f, -2.1f, 3, 8, 4);
        this.B.a(-4.0f, 9.0f, -8.0f);
        this.o = new c(this, 60, 41);
        this.o.a(-1.1f, 0.0f, -1.6f, 3, 5, 3);
        this.o.a(-4.0f, 16.0f, -8.0f);
        this.r = new c(this, 60, 51);
        this.r.a(-1.6f, 5.1f, -2.1f, 4, 3, 4);
        this.r.a(-4.0f, 16.0f, -8.0f);
        this.t = new c(this, 0, 0);
        this.t.a(-2.5f, -10.0f, -1.5f, 5, 5, 7);
        this.t.a(0.0f, 4.0f, -10.0f);
        this.t.y = 0.5235988f;
        this.l = new c(this, 24, 18);
        this.l.a(-2.0f, -10.0f, -7.0f, 4, 3, 6);
        this.l.a(0.0f, 3.95f, -10.0f);
        this.l.y = 0.5235988f;
        this.D = new c(this, 24, 27);
        this.D.a(-2.0f, -7.0f, -6.5f, 4, 2, 5);
        this.D.a(0.0f, 4.0f, -10.0f);
        this.D.y = 0.5235988f;
        this.t.a(this.l);
        this.t.a(this.D);
        this.H = new c(this, 0, 0);
        this.H.a(0.45f, -12.0f, 4.0f, 2, 3, 1);
        this.H.a(0.0f, 4.0f, -10.0f);
        this.H.y = 0.5235988f;
        this.M = new c(this, 0, 0);
        this.M.a(-2.45f, -12.0f, 4.0f, 2, 3, 1);
        this.M.a(0.0f, 4.0f, -10.0f);
        this.M.y = 0.5235988f;
        this.q = new c(this, 0, 12);
        this.q.a(-2.0f, -16.0f, 4.0f, 2, 7, 1);
        this.q.a(0.0f, 4.0f, -10.0f);
        this.q.y = 0.5235988f;
        this.q.r = 0.2617994f;
        this.F = new c(this, 0, 12);
        this.F.a(0.0f, -16.0f, 4.0f, 2, 7, 1);
        this.F.a(0.0f, 4.0f, -10.0f);
        this.F.y = 0.5235988f;
        this.F.r = -0.2617994f;
        this.S = new c(this, 0, 12);
        this.S.a(-2.05f, -9.8f, -2.0f, 4, 14, 8);
        this.S.a(0.0f, 4.0f, -10.0f);
        this.S.y = 0.5235988f;
        this.k = new c(this, 0, 34);
        this.k.a(-3.0f, 0.0f, 0.0f, 8, 8, 3);
        this.k.a(-7.5f, 3.0f, 10.0f);
        this.k.e = 1.5707964f;
        this.v = new c(this, 0, 47);
        this.v.a(-3.0f, 0.0f, 0.0f, 8, 8, 3);
        int[] arrn2 = arrn;
        this.v.a(4.5f, 3.0f, 10.0f);
        this.v.e = 1.5707964f;
        this.R = new c(this, 80, 0);
        this.R.a(-5.0f, 0.0f, -3.0f, 10, 1, 8);
        this.R.a(0.0f, 2.0f, 2.0f);
        this.K = new c(this, 106, 9);
        this.K.a(-1.5f, -1.0f, -3.0f, 3, 1, 2);
        this.K.a(0.0f, 2.0f, 2.0f);
        this.y = new c(this, 80, 9);
        this.y.a(-4.0f, -1.0f, 3.0f, 8, 1, 2);
        this.y.a(0.0f, 2.0f, 2.0f);
        this.n = new c(this, 74, 0);
        this.n.a(-0.5f, 6.0f, -1.0f, 1, 2, 2);
        this.n.a(5.0f, 3.0f, 2.0f);
        this.x = new c(this, 70, 0);
        this.x.a(-0.5f, 0.0f, -0.5f, 1, 6, 1);
        this.x.a(5.0f, 3.0f, 2.0f);
        this.A = new c(this, 74, 4);
        this.A.a(-0.5f, 6.0f, -1.0f, 1, 2, 2);
        this.A.a(-5.0f, 3.0f, 2.0f);
        this.w = new c(this, 80, 0);
        this.w.a(-0.5f, 0.0f, -0.5f, 1, 6, 1);
        this.w.a(-5.0f, 3.0f, 2.0f);
        this.s = new c(this, 74, 13);
        this.s.a(1.5f, -8.0f, -4.0f, 1, 2, 2);
        this.s.a(0.0f, 4.0f, -10.0f);
        this.s.y = 0.5235988f;
        this.J = new c(this, 74, 13);
        this.J.a(-2.5f, -8.0f, -4.0f, 1, 2, 2);
        this.J.a(0.0f, 4.0f, -10.0f);
        this.J.y = 0.5235988f;
        this.i = new c(this, 44, 10);
        this.i.a(2.6f, -6.0f, -6.0f, 0, 3, 16);
        this.i.a(0.0f, 4.0f, -10.0f);
        this.N = new c(this, 44, 5);
        this.N.a(-2.6f, -6.0f, -6.0f, 0, 3, 16);
        this.N.a(0.0f, 4.0f, -10.0f);
        this.T = new c(this, 58, 0);
        this.T.a(-1.0f, -11.5f, 5.0f, 2, 16, 4);
        this.T.a(0.0f, 4.0f, -10.0f);
        this.T.y = 0.5235988f;
        this.E = new c(this, 80, 12);
        this.E.b(-2.5f, -10.1f, -7.0f, 5, 5, 12, 0.2f);
        this.E.a(0.0f, 4.0f, -10.0f);
        this.E.y = 0.5235988f;
        if (arrn2 != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        block24: {
            float f13;
            block23: {
                block22: {
                    int n2;
                    float f14;
                    int n3;
                    int[] arrn;
                    block18: {
                        block19: {
                            float f15;
                            block20: {
                                block21: {
                                    float f16;
                                    float f17;
                                    block17: {
                                        float f18;
                                        float f19;
                                        block16: {
                                            float f20;
                                            block15: {
                                                super.a(b10, f10, f11, f12);
                                                float f21 = this.a(b10.aU, b10.bf, f12);
                                                arrn = net.minecraft.client.w.j.b();
                                                float f22 = this.a(b10.bh, b10.a1, f12);
                                                float f23 = b10.E + (b10.at - b10.E) * f12;
                                                f17 = f22 - f21;
                                                f16 = f23 * ((float)Math.PI / 180);
                                                float f24 = f17 - 20.0f;
                                                f20 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                                                if (arrn == null) {
                                                    float f25;
                                                    if (f20 > 0) {
                                                        f17 = 20.0f;
                                                    }
                                                    f20 = (f25 = f17 - -20.0f) == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
                                                }
                                                if (arrn != null) break block15;
                                                if (f20 < 0) {
                                                    f17 = -20.0f;
                                                }
                                                f19 = f11;
                                                f18 = 0.2f;
                                                if (arrn != null) break block16;
                                                float f26 = f19 - f18;
                                                f20 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                                            }
                                            if (f20 <= 0) break block17;
                                            f19 = f16;
                                            f18 = net.minecraft.k.h.c(f10 * 0.4f) * 0.15f * f11;
                                        }
                                        f16 = f19 + f18;
                                    }
                                    D d10 = (D)b10;
                                    float f27 = d10.b(f12);
                                    float f28 = d10.a(f12);
                                    float f29 = 1.0f - f28;
                                    float f30 = d10.e(f12);
                                    int n4 = d10.cU;
                                    if (arrn == null) {
                                        n4 = n4 != 0 ? 1 : 0;
                                    }
                                    n3 = n4;
                                    int n5 = d10.ac();
                                    boolean bl2 = d10.aU();
                                    f14 = (float)b10.H + f12;
                                    float f31 = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI);
                                    f15 = f31 * 0.8f * f11;
                                    this.t.h = 4.0f;
                                    this.t.u = -10.0f;
                                    this.C.h = 3.0f;
                                    this.Q.u = 14.0f;
                                    this.v.h = 3.0f;
                                    this.v.u = 10.0f;
                                    this.z.y = 0.0f;
                                    this.t.y = 0.5235988f + f16;
                                    this.t.e = f17 * ((float)Math.PI / 180);
                                    this.t.y = f28 * (0.2617994f + f16) + f27 * 2.1816616f + (1.0f - Math.max(f28, f27)) * this.t.y;
                                    this.t.e = f28 * f17 * ((float)Math.PI / 180) + (1.0f - Math.max(f28, f27)) * this.t.e;
                                    this.t.h = f28 * -6.0f + f27 * 11.0f + (1.0f - Math.max(f28, f27)) * this.t.h;
                                    this.t.u = f28 * -1.0f + f27 * -10.0f + (1.0f - Math.max(f28, f27)) * this.t.u;
                                    this.C.h = f28 * 9.0f + f29 * this.C.h;
                                    this.Q.u = f28 * 18.0f + f29 * this.Q.u;
                                    this.v.h = f28 * 5.5f + f29 * this.v.h;
                                    this.v.u = f28 * 15.0f + f29 * this.v.u;
                                    this.z.y = f28 * -0.7853982f + f29 * this.z.y;
                                    this.H.h = this.t.h;
                                    this.M.h = this.t.h;
                                    this.q.h = this.t.h;
                                    this.F.h = this.t.h;
                                    this.S.h = this.t.h;
                                    this.l.h = 0.02f;
                                    this.D.h = 0.0f;
                                    this.T.h = this.t.h;
                                    this.H.u = this.t.u;
                                    this.M.u = this.t.u;
                                    this.q.u = this.t.u;
                                    this.F.u = this.t.u;
                                    this.S.u = this.t.u;
                                    this.l.u = 0.02f - f30;
                                    this.D.u = f30;
                                    this.T.u = this.t.u;
                                    this.H.y = this.t.y;
                                    this.M.y = this.t.y;
                                    this.q.y = this.t.y;
                                    this.F.y = this.t.y;
                                    this.S.y = this.t.y;
                                    this.l.y = -0.09424778f * f30;
                                    this.D.y = 0.15707964f * f30;
                                    this.T.y = this.t.y;
                                    this.H.e = this.t.e;
                                    this.M.e = this.t.e;
                                    this.q.e = this.t.e;
                                    this.F.e = this.t.e;
                                    this.S.e = this.t.e;
                                    this.l.e = 0.0f;
                                    this.D.e = 0.0f;
                                    this.T.e = this.t.e;
                                    this.k.y = f15 / 5.0f;
                                    this.v.y = -f15 / 5.0f;
                                    f13 = 0.2617994f * f28;
                                    float f32 = net.minecraft.k.h.c(f14 * 0.6f + (float)Math.PI);
                                    this.G.h = -2.0f * f28 + 9.0f * f29;
                                    this.G.u = -2.0f * f28 + -8.0f * f29;
                                    this.B.h = this.G.h;
                                    this.B.u = this.G.u;
                                    this.p.h = this.m.h + net.minecraft.k.h.g(1.5707964f + f13 + f29 * -f31 * 0.5f * f11) * 7.0f;
                                    this.p.u = this.m.u + net.minecraft.k.h.c(-1.5707964f + f13 + f29 * -f31 * 0.5f * f11) * 7.0f;
                                    this.U.h = this.L.h + net.minecraft.k.h.g(1.5707964f + f13 + f29 * f31 * 0.5f * f11) * 7.0f;
                                    this.U.u = this.L.u + net.minecraft.k.h.c(-1.5707964f + f13 + f29 * f31 * 0.5f * f11) * 7.0f;
                                    float f33 = (-1.0471976f + f32) * f28 + f15 * f29;
                                    float f34 = (-1.0471976f - f32) * f28 + -f15 * f29;
                                    this.u.h = this.G.h + net.minecraft.k.h.g(1.5707964f + f33) * 7.0f;
                                    this.u.u = this.G.u + net.minecraft.k.h.c(-1.5707964f + f33) * 7.0f;
                                    this.o.h = this.B.h + net.minecraft.k.h.g(1.5707964f + f34) * 7.0f;
                                    this.o.u = this.B.u + net.minecraft.k.h.c(-1.5707964f + f34) * 7.0f;
                                    this.m.y = f13 + -f31 * 0.5f * f11 * f29;
                                    this.I.y = this.p.y = -0.08726646f * f28 + (-f31 * 0.5f * f11 - Math.max(0.0f, f31 * 0.5f * f11)) * f29;
                                    this.L.y = f13 + f31 * 0.5f * f11 * f29;
                                    this.O.y = this.U.y = -0.08726646f * f28 + (f31 * 0.5f * f11 - Math.max(0.0f, -f31 * 0.5f * f11)) * f29;
                                    this.G.y = f33;
                                    this.j.y = this.u.y = (this.G.y + (float)Math.PI * Math.max(0.0f, 0.2f + f32 * 0.2f)) * f28 + (f15 + Math.max(0.0f, f31 * 0.5f * f11)) * f29;
                                    this.B.y = f34;
                                    this.r.y = this.o.y = (this.B.y + (float)Math.PI * Math.max(0.0f, 0.2f - f32 * 0.2f)) * f28 + (-f15 + Math.max(0.0f, -f31 * 0.5f * f11)) * f29;
                                    this.I.h = this.p.h;
                                    this.I.u = this.p.u;
                                    this.O.h = this.U.h;
                                    this.O.u = this.U.u;
                                    this.j.h = this.u.h;
                                    this.j.u = this.u.u;
                                    this.r.h = this.o.h;
                                    this.r.u = this.o.u;
                                    n2 = n5;
                                    if (arrn != null) break block18;
                                    if (n2 == 0) break block19;
                                    this.R.h = f28 * 0.5f + f29 * 2.0f;
                                    this.R.u = f28 * 11.0f + f29 * 2.0f;
                                    this.K.h = this.R.h;
                                    this.y.h = this.R.h;
                                    this.x.h = this.R.h;
                                    this.w.h = this.R.h;
                                    this.n.h = this.R.h;
                                    this.A.h = this.R.h;
                                    this.k.h = this.v.h;
                                    this.K.u = this.R.u;
                                    this.y.u = this.R.u;
                                    this.x.u = this.R.u;
                                    this.w.u = this.R.u;
                                    this.n.u = this.R.u;
                                    this.A.u = this.R.u;
                                    this.k.u = this.v.u;
                                    this.R.y = this.z.y;
                                    this.K.y = this.z.y;
                                    this.y.y = this.z.y;
                                    this.i.h = this.t.h;
                                    this.N.h = this.t.h;
                                    this.E.h = this.t.h;
                                    this.s.h = this.t.h;
                                    this.J.h = this.t.h;
                                    this.i.u = this.t.u;
                                    this.N.u = this.t.u;
                                    this.E.u = this.t.u;
                                    this.s.u = this.t.u;
                                    this.J.u = this.t.u;
                                    this.i.y = f16;
                                    this.N.y = f16;
                                    this.E.y = this.t.y;
                                    this.s.y = this.t.y;
                                    this.J.y = this.t.y;
                                    this.E.e = this.t.e;
                                    this.s.e = this.t.e;
                                    this.i.e = this.t.e;
                                    this.J.e = this.t.e;
                                    this.N.e = this.t.e;
                                    if (arrn != null) break block20;
                                    if (!bl2) break block21;
                                    this.x.y = -1.0471976f;
                                    this.n.y = -1.0471976f;
                                    this.w.y = -1.0471976f;
                                    this.A.y = -1.0471976f;
                                    this.x.r = 0.0f;
                                    this.n.r = 0.0f;
                                    this.w.r = 0.0f;
                                    this.A.r = 0.0f;
                                    if (arrn == null) break block19;
                                }
                                this.x.y = f15 / 3.0f;
                                this.n.y = f15 / 3.0f;
                                this.w.y = f15 / 3.0f;
                                this.A.y = f15 / 3.0f;
                                this.x.r = f15 / 5.0f;
                                this.n.r = f15 / 5.0f;
                                this.w.r = -f15 / 5.0f;
                            }
                            this.A.r = -f15 / 5.0f;
                        }
                        f13 = -1.3089969f + f11 * 1.5f;
                        float f35 = f13 - 0.0f;
                        n2 = f35 == 0.0f ? 0 : (f35 > 0.0f ? 1 : -1);
                    }
                    if (arrn == null) {
                        if (n2 > 0) {
                            f13 = 0.0f;
                        }
                        n2 = n3;
                    }
                    if (n2 == 0) break block22;
                    this.C.e = net.minecraft.k.h.c(f14 * 0.7f);
                    f13 = 0.0f;
                    if (arrn == null) break block23;
                }
                this.C.e = 0.0f;
            }
            this.Q.e = this.C.e;
            this.P.e = this.C.e;
            this.Q.h = this.C.h;
            this.P.h = this.C.h;
            this.Q.u = this.C.u;
            this.P.u = this.C.u;
            this.C.y = f13;
            this.Q.y = f13;
            this.P.y = -0.2617994f + f13;
            if (!net.minecraft.k.m.c()) break block24;
            net.minecraft.client.w.j.b(new int[4]);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void b(x var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private float a(float f10, float f11, float f12) {
        float f13;
        block5: {
            float f14;
            block4: {
                int[] arrn = net.minecraft.client.w.j.b();
                for (f14 = f11 - f10; f14 < -180.0f; f14 += 360.0f) {
                    if (arrn == null) {
                        if (arrn == null) continue;
                    }
                    break block4;
                }
                while (f14 >= 180.0f) {
                    f13 = f14 - 360.0f;
                    if (arrn == null) {
                        f14 = f13;
                        if (arrn == null) continue;
                    }
                    break block5;
                }
            }
            f13 = f10 + f12 * f14;
        }
        return f13;
    }
}

