/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class U
extends j {
    protected /* synthetic */ float j;
    public /* synthetic */ c l;
    public /* synthetic */ c k;
    public /* synthetic */ c p;
    public /* synthetic */ c o;
    public /* synthetic */ c m;
    public /* synthetic */ c n;
    protected /* synthetic */ float i;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            U u2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    int[] arrn2 = arrn;
                    u2 = this;
                    if (arrn2 != null) break block2;
                    if (!u2.h) break block3;
                    float f16 = 2.0f;
                    v.M();
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
                u2 = this;
            }
            u2.l.b(f15);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public U(int n2, float f10) {
        this.o = new c(this, 0, 0);
        this.i = 8.0f;
        this.j = 4.0f;
        this.o.b(-4.0f, -4.0f, -8.0f, 8, 8, 8, f10);
        this.o.a(0.0f, 18 - n2, -6.0f);
        this.m = new c(this, 28, 8);
        this.m.b(-5.0f, -10.0f, -7.0f, 10, 16, 8, f10);
        this.m.a(0.0f, 17 - n2, 2.0f);
        this.p = new c(this, 0, 16);
        this.p.b(-2.0f, 0.0f, -2.0f, 4, n2, 4, f10);
        this.p.a(-3.0f, 24 - n2, 7.0f);
        this.k = new c(this, 0, 16);
        this.k.b(-2.0f, 0.0f, -2.0f, 4, n2, 4, f10);
        this.k.a(3.0f, 24 - n2, 7.0f);
        this.n = new c(this, 0, 16);
        this.n.b(-2.0f, 0.0f, -2.0f, 4, n2, 4, f10);
        this.n.a(-3.0f, 24 - n2, -5.0f);
        this.l = new c(this, 0, 16);
        this.l.b(-2.0f, 0.0f, -2.0f, 4, n2, 4, f10);
        this.l.a(3.0f, 24 - n2, -5.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        this.o.y = f14 * ((float)Math.PI / 180);
        this.o.e = f13 * ((float)Math.PI / 180);
        this.m.y = 1.5707964f;
        this.p.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
        this.k.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
        this.n.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
        this.l.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
    }
}

