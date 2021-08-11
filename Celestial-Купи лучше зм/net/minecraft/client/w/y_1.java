/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class y
extends j {
    public /* synthetic */ c k;
    public /* synthetic */ c i;
    public /* synthetic */ c n;
    public /* synthetic */ c m;
    public /* synthetic */ c l;
    public /* synthetic */ c j;
    public /* synthetic */ c o;

    public y() {
        this.i = new c(this).b(0, 0).a(-6.0f, -5.0f, 0.0f, 6, 10, 0);
        this.k = new c(this).b(16, 0).a(0.0f, -5.0f, 0.0f, 6, 10, 0);
        this.o = new c(this).b(0, 10).a(0.0f, -4.0f, -0.99f, 5, 8, 1);
        this.n = new c(this).b(12, 10).a(0.0f, -4.0f, -0.01f, 5, 8, 1);
        this.l = new c(this).b(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.m = new c(this).b(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.j = new c(this).b(12, 0).a(-1.0f, -5.0f, 0.0f, 2, 10, 0);
        this.i.a(0.0f, 0.0f, -1.0f);
        this.k.a(0.0f, 0.0f, 1.0f);
        this.j.e = 1.5707964f;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.b(f15);
        this.k.b(f15);
        this.j.b(f15);
        this.o.b(f15);
        this.n.b(f15);
        this.l.b(f15);
        this.m.b(f15);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        float f16 = (net.minecraft.k.h.g(f10 * 0.02f) * 0.1f + 1.25f) * f13;
        this.i.e = (float)Math.PI + f16;
        this.k.e = -f16;
        this.o.e = f16;
        this.n.e = -f16;
        this.l.e = f16 - f16 * 2.0f * f11;
        this.m.e = f16 - f16 * 2.0f * f12;
        this.o.v = net.minecraft.k.h.g(f16);
        this.n.v = net.minecraft.k.h.g(f16);
        this.l.v = net.minecraft.k.h.g(f16);
        this.m.v = net.minecraft.k.h.g(f16);
    }
}

