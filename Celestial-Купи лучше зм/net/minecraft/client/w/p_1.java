/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.J.n;
import net.minecraft.U.x;
import net.minecraft.ar.b;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.o;

public class p
extends o {
    public /* synthetic */ c v;
    public /* synthetic */ c t;
    public /* synthetic */ c u;
    public /* synthetic */ c s;

    @Override
    public void a(float f10, b b10) {
        c c10 = this.a(b10);
        boolean bl2 = c10.q;
        c10.q = true;
        super.a(f10, b10);
        c10.q = bl2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block5: {
            x x3;
            int[] arrn;
            block4: {
                int[] arrn2 = net.minecraft.client.w.j.b();
                super.a(f10, f11, f12, f13, f14, f15, x2);
                arrn = arrn2;
                x3 = x2;
                if (arrn != null) break block4;
                if (!(x3 instanceof n)) break block5;
                x3 = x2;
            }
            n n2 = (n)x3;
            this.k.q = n2.u();
            this.o.q = n2.u();
            boolean bl2 = n2.x();
            if (arrn == null) {
                bl2 = !bl2;
            }
            this.s.q = bl2;
            this.m.a(1.9f, 12.0f, 0.0f);
            this.i.a(-1.9f, 12.0f, 0.0f);
            this.v.y = (float)Math.PI / 180 * n2.l().c();
            this.v.e = (float)Math.PI / 180 * n2.l().d();
            this.v.r = (float)Math.PI / 180 * n2.l().a();
            this.u.y = (float)Math.PI / 180 * n2.l().c();
            this.u.e = (float)Math.PI / 180 * n2.l().d();
            this.u.r = (float)Math.PI / 180 * n2.l().a();
            this.t.y = (float)Math.PI / 180 * n2.l().c();
            this.t.e = (float)Math.PI / 180 * n2.l().d();
            this.t.r = (float)Math.PI / 180 * n2.l().a();
            this.s.y = 0.0f;
            this.s.e = (float)Math.PI / 180 * -x2.e;
            this.s.r = 0.0f;
        }
    }

    public p() {
        this(0.0f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block6: {
            boolean bl2;
            block4: {
                block5: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    super.b(x2, f10, f11, f12, f13, f14, f15);
                    int[] arrn2 = arrn;
                    net.minecraft.client.a.v.M();
                    bl2 = this.h;
                    if (arrn2 != null) break block4;
                    if (!bl2) break block5;
                    float f16 = 2.0f;
                    net.minecraft.client.a.v.d(0.5f, 0.5f, 0.5f);
                    net.minecraft.client.a.v.b(0.0f, 24.0f * f15, 0.0f);
                    this.v.b(f15);
                    this.u.b(f15);
                    this.t.b(f15);
                    this.s.b(f15);
                    if (arrn2 == null) break block6;
                }
                bl2 = x2.a4();
            }
            if (bl2) {
                net.minecraft.client.a.v.b(0.0f, 0.2f, 0.0f);
            }
            this.v.b(f15);
            this.u.b(f15);
            this.t.b(f15);
            this.s.b(f15);
        }
        net.minecraft.client.a.v.B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p(float f10) {
        super(f10, 64, 64);
        this.n = new c(this, 0, 0);
        this.n.b(-1.0f, -7.0f, -1.0f, 2, 7, 2, f10);
        this.n.a(0.0f, 0.0f, 0.0f);
        this.j = new c(this, 0, 26);
        this.j.b(-6.0f, 0.0f, -1.5f, 12, 3, 3, f10);
        this.j.a(0.0f, 0.0f, 0.0f);
        this.o = new c(this, 24, 0);
        this.o.b(-2.0f, -2.0f, -1.0f, 2, 12, 2, f10);
        this.o.a(-5.0f, 2.0f, 0.0f);
        this.k = new c(this, 32, 16);
        this.k.A = true;
        this.k.b(0.0f, -2.0f, -1.0f, 2, 12, 2, f10);
        this.k.a(5.0f, 2.0f, 0.0f);
        this.i = new c(this, 8, 0);
        this.i.b(-1.0f, 0.0f, -1.0f, 2, 11, 2, f10);
        this.i.a(-1.9f, 12.0f, 0.0f);
        this.m = new c(this, 40, 16);
        this.m.A = true;
        this.m.b(-1.0f, 0.0f, -1.0f, 2, 11, 2, f10);
        this.m.a(1.9f, 12.0f, 0.0f);
        this.v = new c(this, 16, 0);
        this.v.b(-3.0f, 3.0f, -1.0f, 2, 7, 2, f10);
        this.v.a(0.0f, 0.0f, 0.0f);
        this.v.q = true;
        this.u = new c(this, 48, 16);
        this.u.b(1.0f, 3.0f, -1.0f, 2, 7, 2, f10);
        this.u.a(0.0f, 0.0f, 0.0f);
        this.t = new c(this, 0, 48);
        this.t.b(-4.0f, 10.0f, -1.0f, 8, 2, 2, f10);
        this.t.a(0.0f, 0.0f, 0.0f);
        this.s = new c(this, 0, 32);
        this.s.b(-6.0f, 11.0f, -6.0f, 12, 1, 12, f10);
        this.s.a(0.0f, 12.0f, 0.0f);
        this.q.q = false;
    }
}

