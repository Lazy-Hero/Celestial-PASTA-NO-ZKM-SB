/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class aX
extends j {
    public /* synthetic */ c j;
    public /* synthetic */ c n;
    public /* synthetic */ c k;
    public /* synthetic */ c l;
    public /* synthetic */ c m;
    public /* synthetic */ c i;

    public aX(float f10, float f11, int n2, int n3) {
        this.j = new c(this).a(n2, n3);
        this.j.a(0.0f, 0.0f + f11, 0.0f);
        this.j.b(0, 0).b(-4.0f, -10.0f, -4.0f, 8, 10, 8, f10);
        this.k = new c(this).a(n2, n3);
        this.k.a(0.0f, f11 - 2.0f, 0.0f);
        this.k.b(24, 0).b(-1.0f, -1.0f, -6.0f, 2, 4, 2, f10);
        this.j.a(this.k);
        this.l = new c(this).a(n2, n3);
        this.l.a(0.0f, 0.0f + f11, 0.0f);
        this.l.b(16, 20).b(-4.0f, 0.0f, -3.0f, 8, 12, 6, f10);
        this.l.b(0, 38).b(-4.0f, 0.0f, -3.0f, 8, 18, 6, f10 + 0.5f);
        this.m = new c(this).a(n2, n3);
        this.m.a(0.0f, 0.0f + f11 + 2.0f, 0.0f);
        this.m.b(44, 22).b(-8.0f, -2.0f, -2.0f, 4, 8, 4, f10);
        this.m.b(44, 22).b(4.0f, -2.0f, -2.0f, 4, 8, 4, f10);
        this.m.b(40, 38).b(-4.0f, 2.0f, -2.0f, 8, 4, 4, f10);
        this.i = new c(this, 0, 22).a(n2, n3);
        this.i.a(-2.0f, 12.0f + f11, 0.0f);
        this.i.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        this.n = new c(this, 0, 22).a(n2, n3);
        this.n.A = true;
        this.n.a(2.0f, 12.0f + f11, 0.0f);
        this.n.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.j.b(f15);
        this.l.b(f15);
        this.i.b(f15);
        this.n.b(f15);
        this.m.b(f15);
    }

    public aX(float f10) {
        this(f10, 0.0f, 64, 64);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        this.j.e = f13 * ((float)Math.PI / 180);
        this.j.y = f14 * ((float)Math.PI / 180);
        this.m.h = 3.0f;
        this.m.u = -1.0f;
        this.m.y = -0.75f;
        this.i.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11 * 0.5f;
        this.n.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11 * 0.5f;
        this.i.e = 0.0f;
        this.n.e = 0.0f;
    }
}

