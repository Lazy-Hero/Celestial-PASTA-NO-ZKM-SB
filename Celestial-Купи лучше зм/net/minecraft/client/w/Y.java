/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.aH;
import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.U;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class Y
extends U {
    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            Y y2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    int[] arrn2 = arrn;
                    y2 = this;
                    if (arrn2 != null) break block2;
                    if (!y2.h) break block3;
                    float f16 = 2.0f;
                    this.i = 16.0f;
                    this.j = 4.0f;
                    v.M();
                    v.d(0.6666667f, 0.6666667f, 0.6666667f);
                    v.b(0.0f, this.i * f15, this.j * f15);
                    this.o.b(f15);
                    v.B();
                    v.M();
                    v.d(0.5f, 0.5f, 0.5f);
                    v.b(0.0f, 24.0f * f15, 0.0f);
                    this.m.b(f15);
                    this.p.b(f15);
                    this.k.b(f15);
                    this.n.b(f15);
                    this.l.b(f15);
                    v.B();
                    if (arrn2 == null) break block4;
                }
                this.o.b(f15);
                this.m.b(f15);
                this.p.b(f15);
                this.k.b(f15);
                this.n.b(f15);
                y2 = this;
            }
            y2.l.b(f15);
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        float f16 = f12 - (float)x2.H;
        float f17 = ((aH)x2).a(f16);
        f17 *= f17;
        float f18 = 1.0f - f17;
        this.m.y = 1.5707964f - f17 * (float)Math.PI * 0.35f;
        this.m.h = 9.0f * f18 + 11.0f * f17;
        this.n.h = 14.0f * f18 + -6.0f * f17;
        this.n.u = -8.0f * f18 + -4.0f * f17;
        this.n.y -= f17 * (float)Math.PI * 0.45f;
        this.l.h = this.n.h;
        this.l.u = this.n.u;
        this.l.y -= f17 * (float)Math.PI * 0.45f;
        this.o.h = 10.0f * f18 + -12.0f * f17;
        this.o.u = -16.0f * f18 + -3.0f * f17;
        this.o.y += f17 * (float)Math.PI * 0.15f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Y() {
        super(12, 0.0f);
        this.g = 128;
        this.f = 64;
        this.o = new c(this, 0, 0);
        this.o.b(-3.5f, -3.0f, -3.0f, 7, 7, 7, 0.0f);
        this.o.a(0.0f, 10.0f, -16.0f);
        this.o.b(0, 44).b(-2.5f, 1.0f, -6.0f, 5, 3, 3, 0.0f);
        this.o.b(26, 0).b(-4.5f, -4.0f, -1.0f, 2, 2, 1, 0.0f);
        c c10 = this.o.b(26, 0);
        c10.A = true;
        c10.b(2.5f, -4.0f, -1.0f, 2, 2, 1, 0.0f);
        this.m = new c(this);
        this.m.b(0, 19).b(-5.0f, -13.0f, -7.0f, 14, 14, 11, 0.0f);
        this.m.b(39, 0).b(-4.0f, -25.0f, -7.0f, 12, 12, 10, 0.0f);
        this.m.a(-2.0f, 9.0f, 12.0f);
        int n2 = 10;
        this.p = new c(this, 50, 22);
        this.p.b(-2.0f, 0.0f, -2.0f, 4, 10, 8, 0.0f);
        this.p.a(-3.5f, 14.0f, 6.0f);
        this.k = new c(this, 50, 22);
        this.k.b(-2.0f, 0.0f, -2.0f, 4, 10, 8, 0.0f);
        this.k.a(3.5f, 14.0f, 6.0f);
        this.n = new c(this, 50, 40);
        this.n.b(-2.0f, 0.0f, -2.0f, 4, 10, 6, 0.0f);
        this.n.a(-2.5f, 14.0f, -7.0f);
        this.l = new c(this, 50, 40);
        this.l.b(-2.0f, 0.0f, -2.0f, 4, 10, 6, 0.0f);
        this.l.a(2.5f, 14.0f, -7.0f);
        this.p.v -= 1.0f;
        this.k.v += 1.0f;
        this.p.u += 0.0f;
        this.k.u += 0.0f;
        this.n.v -= 1.0f;
        this.l.v += 1.0f;
        this.n.u -= 1.0f;
        this.l.u -= 1.0f;
        this.j += 2.0f;
    }
}

