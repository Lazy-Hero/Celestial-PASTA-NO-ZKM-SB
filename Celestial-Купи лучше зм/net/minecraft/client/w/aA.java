/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.a9;
import net.minecraft.client.w.c;

public class aA
extends a9 {
    private final /* synthetic */ c j;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        super.b(x2, f10, f11, f12, f13, f14, f15);
        this.j.b(f15);
    }

    public aA() {
        super(0, 0, 64, 64);
        this.j = new c(this, 32, 0);
        this.j.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        this.j.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.j.e = this.i.e;
        this.j.y = this.i.y;
    }
}

