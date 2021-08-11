/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;

public class q
extends n {
    public /* synthetic */ boolean t;
    public /* synthetic */ boolean s;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.n.q = true;
        float f16 = -14.0f;
        this.j.y = 0.0f;
        this.j.h = -14.0f;
        this.j.u = -0.0f;
        this.i.y -= 0.0f;
        int[] arrn = net.minecraft.client.w.j.b();
        this.m.y -= 0.0f;
        this.o.y = (float)((double)this.o.y * 0.5);
        this.k.y = (float)((double)this.k.y * 0.5);
        this.i.y = (float)((double)this.i.y * 0.5);
        this.m.y = (float)((double)this.m.y * 0.5);
        float f17 = 0.4f;
        float f18 = this.o.y - 0.4f;
        float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (arrn == null) {
            float f20;
            if (f19 > 0) {
                this.o.y = 0.4f;
            }
            f19 = (f20 = this.k.y - 0.4f) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        }
        if (arrn == null) {
            float f21;
            if (f19 > 0) {
                this.k.y = 0.4f;
            }
            f19 = (f21 = this.o.y - -0.4f) == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
        }
        if (arrn == null) {
            float f22;
            if (f19 < 0) {
                this.o.y = -0.4f;
            }
            f19 = (f22 = this.k.y - -0.4f) == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
        }
        if (arrn == null) {
            float f23;
            if (f19 < 0) {
                this.k.y = -0.4f;
            }
            f19 = (f23 = this.i.y - 0.4f) == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
        }
        if (arrn == null) {
            float f24;
            if (f19 > 0) {
                this.i.y = 0.4f;
            }
            f19 = (f24 = this.m.y - 0.4f) == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
        }
        if (arrn == null) {
            float f25;
            if (f19 > 0) {
                this.m.y = 0.4f;
            }
            f19 = (f25 = this.i.y - -0.4f) == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
        }
        if (arrn == null) {
            float f26;
            if (f19 < 0) {
                this.i.y = -0.4f;
            }
            f19 = (f26 = this.m.y - -0.4f) == 0.0f ? 0 : (f26 < 0.0f ? -1 : 1);
        }
        if (arrn == null) {
            if (f19 < 0) {
                this.m.y = -0.4f;
            }
            f19 = (float)this.s;
        }
        if (arrn == null) {
            if (f19 != false) {
                this.o.y = -0.5f;
                this.k.y = -0.5f;
                this.o.r = 0.05f;
                this.k.r = -0.05f;
            }
            this.o.u = 0.0f;
            this.k.u = 0.0f;
            this.i.u = 0.0f;
            this.m.u = 0.0f;
            this.i.h = -5.0f;
            this.m.h = -5.0f;
            this.n.u = -0.0f;
            this.n.h = -13.0f;
            this.q.v = this.n.v;
            this.q.h = this.n.h;
            this.q.u = this.n.u;
            this.q.y = this.n.y;
            this.q.e = this.n.e;
            this.q.r = this.n.r;
            f19 = (float)this.t;
        }
        if (f19 != false) {
            float f27 = 1.0f;
            this.n.h -= 5.0f;
        }
    }

    public q(float f10) {
        super(0.0f, -14.0f, 64, 32);
        float f11 = -14.0f;
        this.q = new c(this, 0, 16);
        this.q.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, f10 - 0.5f);
        this.q.a(0.0f, -14.0f, 0.0f);
        this.j = new c(this, 32, 16);
        this.j.b(-4.0f, 0.0f, -2.0f, 8, 12, 4, f10);
        this.j.a(0.0f, -14.0f, 0.0f);
        this.o = new c(this, 56, 0);
        this.o.b(-1.0f, -2.0f, -1.0f, 2, 30, 2, f10);
        this.o.a(-3.0f, -12.0f, 0.0f);
        this.k = new c(this, 56, 0);
        this.k.A = true;
        this.k.b(-1.0f, -2.0f, -1.0f, 2, 30, 2, f10);
        this.k.a(5.0f, -12.0f, 0.0f);
        this.i = new c(this, 56, 0);
        this.i.b(-1.0f, 0.0f, -1.0f, 2, 30, 2, f10);
        this.i.a(-2.0f, -2.0f, 0.0f);
        this.m = new c(this, 56, 0);
        this.m.A = true;
        this.m.b(-1.0f, 0.0f, -1.0f, 2, 30, 2, f10);
        this.m.a(2.0f, -2.0f, 0.0f);
    }
}

