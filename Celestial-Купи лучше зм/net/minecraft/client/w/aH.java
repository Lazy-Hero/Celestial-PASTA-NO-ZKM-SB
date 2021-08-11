/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class aH
extends j {
    public /* synthetic */ c s;
    public /* synthetic */ c k;
    public /* synthetic */ c i;
    public /* synthetic */ c n;
    public /* synthetic */ c p;
    public /* synthetic */ c m;
    public /* synthetic */ c j;
    public /* synthetic */ c l;
    public /* synthetic */ c o;
    public /* synthetic */ c r;
    public /* synthetic */ c q;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.r.b(f15);
        this.m.b(f15);
        this.k.b(f15);
        this.q.b(f15);
        this.i.b(f15);
        this.l.b(f15);
        this.n.b(f15);
        this.s.b(f15);
        this.j.b(f15);
        this.o.b(f15);
        this.p.b(f15);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        this.r.e = f13 * ((float)Math.PI / 180);
        this.r.y = f14 * ((float)Math.PI / 180);
        float f16 = 0.7853982f;
        this.q.r = -0.7853982f;
        this.i.r = 0.7853982f;
        this.l.r = -0.58119464f;
        this.n.r = 0.58119464f;
        this.s.r = -0.58119464f;
        this.j.r = 0.58119464f;
        this.o.r = -0.7853982f;
        this.p.r = 0.7853982f;
        float f17 = -0.0f;
        float f18 = 0.3926991f;
        this.q.e = 0.7853982f;
        this.i.e = -0.7853982f;
        this.l.e = 0.3926991f;
        this.n.e = -0.3926991f;
        this.s.e = -0.3926991f;
        this.j.e = 0.3926991f;
        this.o.e = -0.7853982f;
        this.p.e = 0.7853982f;
        float f19 = -(net.minecraft.k.h.c(f10 * 0.6662f * 2.0f + 0.0f) * 0.4f) * f11;
        float f20 = -(net.minecraft.k.h.c(f10 * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f11;
        float f21 = -(net.minecraft.k.h.c(f10 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f11;
        float f22 = -(net.minecraft.k.h.c(f10 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f11;
        float f23 = Math.abs(net.minecraft.k.h.g(f10 * 0.6662f + 0.0f) * 0.4f) * f11;
        float f24 = Math.abs(net.minecraft.k.h.g(f10 * 0.6662f + (float)Math.PI) * 0.4f) * f11;
        float f25 = Math.abs(net.minecraft.k.h.g(f10 * 0.6662f + 1.5707964f) * 0.4f) * f11;
        float f26 = Math.abs(net.minecraft.k.h.g(f10 * 0.6662f + 4.712389f) * 0.4f) * f11;
        this.q.e += f19;
        this.i.e += -f19;
        this.l.e += f20;
        this.n.e += -f20;
        this.s.e += f21;
        this.j.e += -f21;
        this.o.e += f22;
        this.p.e += -f22;
        this.q.r += f23;
        this.i.r += -f23;
        this.l.r += f24;
        this.n.r += -f24;
        this.s.r += f25;
        this.j.r += -f25;
        this.o.r += f26;
        this.p.r += -f26;
    }

    public aH() {
        float f10 = 0.0f;
        int n2 = 15;
        this.r = new c(this, 32, 4);
        this.r.b(-4.0f, -4.0f, -8.0f, 8, 8, 8, 0.0f);
        this.r.a(0.0f, 15.0f, -3.0f);
        this.m = new c(this, 0, 0);
        this.m.b(-3.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.m.a(0.0f, 15.0f, 0.0f);
        this.k = new c(this, 0, 12);
        this.k.b(-5.0f, -4.0f, -6.0f, 10, 8, 12, 0.0f);
        this.k.a(0.0f, 15.0f, 9.0f);
        this.q = new c(this, 18, 0);
        this.q.b(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.q.a(-4.0f, 15.0f, 2.0f);
        this.i = new c(this, 18, 0);
        this.i.b(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.i.a(4.0f, 15.0f, 2.0f);
        this.l = new c(this, 18, 0);
        this.l.b(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.l.a(-4.0f, 15.0f, 1.0f);
        this.n = new c(this, 18, 0);
        this.n.b(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.n.a(4.0f, 15.0f, 1.0f);
        this.s = new c(this, 18, 0);
        this.s.b(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.s.a(-4.0f, 15.0f, 0.0f);
        this.j = new c(this, 18, 0);
        this.j.b(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.j.a(4.0f, 15.0f, 0.0f);
        this.o = new c(this, 18, 0);
        this.o.b(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.o.a(-4.0f, 15.0f, -1.0f);
        this.p = new c(this, 18, 0);
        this.p.b(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.p.a(4.0f, 15.0f, -1.0f);
    }
}

