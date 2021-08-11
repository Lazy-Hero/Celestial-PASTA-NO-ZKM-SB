/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class C
extends j {
    public /* synthetic */ c o;
    public /* synthetic */ c k;
    public /* synthetic */ c j;
    public /* synthetic */ c n;
    public /* synthetic */ c m;
    public /* synthetic */ c i;
    public /* synthetic */ c l;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        this.m.e = f13 * ((float)Math.PI / 180);
        this.m.y = f14 * ((float)Math.PI / 180);
        this.j.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
        this.k.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
        this.i.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
        this.n.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.m.b(f15);
        this.l.b(f15);
        this.j.b(f15);
        this.k.b(f15);
        this.i.b(f15);
        this.n.b(f15);
    }

    public C(float f10) {
        int n2 = 6;
        this.m = new c(this, 0, 0);
        this.m.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, f10);
        this.m.a(0.0f, 6.0f, 0.0f);
        this.o = new c(this, 32, 0);
        this.o.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, f10 + 0.5f);
        this.o.a(0.0f, 6.0f, 0.0f);
        this.l = new c(this, 16, 16);
        this.l.b(-4.0f, 0.0f, -2.0f, 8, 12, 4, f10);
        this.l.a(0.0f, 6.0f, 0.0f);
        this.j = new c(this, 0, 16);
        this.j.b(-2.0f, 0.0f, -2.0f, 4, 6, 4, f10);
        this.j.a(-2.0f, 18.0f, 4.0f);
        this.k = new c(this, 0, 16);
        this.k.b(-2.0f, 0.0f, -2.0f, 4, 6, 4, f10);
        this.k.a(2.0f, 18.0f, 4.0f);
        this.i = new c(this, 0, 16);
        this.i.b(-2.0f, 0.0f, -2.0f, 4, 6, 4, f10);
        this.i.a(-2.0f, 18.0f, -4.0f);
        this.n = new c(this, 0, 16);
        this.n.b(-2.0f, 0.0f, -2.0f, 4, 6, 4, f10);
        this.n.a(2.0f, 18.0f, -4.0f);
    }

    public C() {
        this(0.0f);
    }
}

