/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class a9
extends j {
    public /* synthetic */ c i;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.b(f15);
    }

    public a9() {
        this(0, 35, 64, 64);
    }

    public a9(int n2, int n3, int n4, int n5) {
        this.g = n4;
        this.f = n5;
        this.i = new c(this, n2, n3);
        this.i.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.i.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.e = f13 * ((float)Math.PI / 180);
        this.i.y = f14 * ((float)Math.PI / 180);
    }
}

