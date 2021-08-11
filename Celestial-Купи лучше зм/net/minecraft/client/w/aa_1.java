/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class aa
extends j {
    public /* synthetic */ c l;
    public /* synthetic */ c m;
    public /* synthetic */ c j;
    public /* synthetic */ c i;
    public /* synthetic */ c k;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.k.e = f13 * ((float)Math.PI / 180);
        this.k.y = f14 * ((float)Math.PI / 180);
        this.l.e = f13 * ((float)Math.PI / 180) * 0.25f;
        float f16 = net.minecraft.k.h.g(this.l.e);
        float f17 = net.minecraft.k.h.c(this.l.e);
        this.i.r = 1.0f;
        this.m.r = -1.0f;
        this.i.e = 0.0f + this.l.e;
        this.m.e = (float)Math.PI + this.l.e;
        this.i.v = f17 * 5.0f;
        this.i.u = -f16 * 5.0f;
        this.m.v = -f17 * 5.0f;
        this.m.u = f16 * 5.0f;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.l.b(f15);
        this.j.b(f15);
        this.k.b(f15);
        this.i.b(f15);
        this.m.b(f15);
    }

    public aa() {
        float f10 = 4.0f;
        float f11 = 0.0f;
        this.k = new c(this, 0, 0).a(64, 64);
        this.k.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.5f);
        this.k.a(0.0f, 4.0f, 0.0f);
        this.i = new c(this, 32, 0).a(64, 64);
        this.i.b(-1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        this.i.a(0.0f, 6.0f, 0.0f);
        this.m = new c(this, 32, 0).a(64, 64);
        this.m.b(-1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        this.m.a(0.0f, 6.0f, 0.0f);
        this.l = new c(this, 0, 16).a(64, 64);
        this.l.b(-5.0f, -10.0f, -5.0f, 10, 10, 10, -0.5f);
        this.l.a(0.0f, 13.0f, 0.0f);
        this.j = new c(this, 0, 36).a(64, 64);
        this.j.b(-6.0f, -12.0f, -6.0f, 12, 12, 12, -0.5f);
        this.j.a(0.0f, 24.0f, 0.0f);
    }
}

