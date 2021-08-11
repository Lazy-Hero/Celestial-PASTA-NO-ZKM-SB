/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class B
extends j {
    public /* synthetic */ c l;
    public /* synthetic */ c p;
    public /* synthetic */ c j;
    public /* synthetic */ c k;
    public /* synthetic */ c o;
    public /* synthetic */ c i;
    public /* synthetic */ c n;
    public /* synthetic */ c m;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            B b10;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    int[] arrn2 = arrn;
                    b10 = this;
                    if (arrn2 != null) break block2;
                    if (!b10.h) break block3;
                    float f16 = 2.0f;
                    v.M();
                    v.b(0.0f, 5.0f * f15, 2.0f * f15);
                    this.k.b(f15);
                    this.o.b(f15);
                    this.n.b(f15);
                    v.B();
                    v.M();
                    v.d(0.5f, 0.5f, 0.5f);
                    v.b(0.0f, 24.0f * f15, 0.0f);
                    this.i.b(f15);
                    this.p.b(f15);
                    this.l.b(f15);
                    this.j.b(f15);
                    this.m.b(f15);
                    v.B();
                    if (arrn2 == null) break block4;
                }
                this.k.b(f15);
                this.o.b(f15);
                this.n.b(f15);
                this.i.b(f15);
                this.p.b(f15);
                this.l.b(f15);
                this.j.b(f15);
                b10 = this;
            }
            b10.m.b(f15);
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        this.k.y = f14 * ((float)Math.PI / 180);
        this.k.e = f13 * ((float)Math.PI / 180);
        this.o.y = this.k.y;
        this.o.e = this.k.e;
        this.n.y = this.k.y;
        this.n.e = this.k.e;
        this.i.y = 1.5707964f;
        this.p.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
        this.l.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
        this.j.r = f12;
        this.m.r = -f12;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public B() {
        int n2 = 16;
        this.k = new c(this, 0, 0);
        this.k.b(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.k.a(0.0f, 15.0f, -4.0f);
        this.o = new c(this, 14, 0);
        this.o.b(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.o.a(0.0f, 15.0f, -4.0f);
        this.n = new c(this, 14, 4);
        this.n.b(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.n.a(0.0f, 15.0f, -4.0f);
        this.i = new c(this, 0, 9);
        this.i.b(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.i.a(0.0f, 16.0f, 0.0f);
        this.p = new c(this, 26, 0);
        this.p.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.p.a(-2.0f, 19.0f, 1.0f);
        this.l = new c(this, 26, 0);
        this.l.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.l.a(1.0f, 19.0f, 1.0f);
        this.j = new c(this, 24, 13);
        this.j.a(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.j.a(-4.0f, 13.0f, 0.0f);
        this.m = new c(this, 24, 13);
        this.m.a(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.m.a(4.0f, 13.0f, 0.0f);
    }
}

