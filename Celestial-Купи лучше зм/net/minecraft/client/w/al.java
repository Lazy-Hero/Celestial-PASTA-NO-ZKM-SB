/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class al
extends j {
    public /* synthetic */ c i;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.e = f13 * ((float)Math.PI / 180);
        this.i.y = f14 * ((float)Math.PI / 180);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.b(f15);
    }

    public al() {
        this.g = 64;
        this.f = 32;
        this.i = new c(this);
        this.i.b(0, 0).b(-4.0f, -4.0f, -1.0f, 8, 8, 2, 0.0f);
        this.i.b(0, 10).b(-1.0f, -4.0f, -4.0f, 2, 8, 8, 0.0f);
        this.i.b(20, 0).b(-4.0f, -1.0f, -4.0f, 8, 2, 8, 0.0f);
        this.i.a(0.0f, 0.0f, 0.0f);
    }
}

