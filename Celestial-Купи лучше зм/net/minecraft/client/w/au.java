/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.Q;
import net.minecraft.client.w.U;
import net.minecraft.client.w.c;

public class au
extends U {
    private /* synthetic */ float q;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.o.y = this.q;
    }

    public au() {
        super(12, 0.0f);
        this.o = new c(this, 0, 0);
        this.o.b(-3.0f, -4.0f, -6.0f, 6, 6, 8, 0.0f);
        this.o.a(0.0f, 6.0f, -8.0f);
        this.m = new c(this, 28, 8);
        this.m.b(-4.0f, -10.0f, -7.0f, 8, 16, 6, 0.0f);
        this.m.a(0.0f, 5.0f, 2.0f);
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        super.a(b10, f10, f11, f12);
        this.o.h = 6.0f + ((Q)b10).a(f12) * 9.0f;
        this.q = ((Q)b10).b(f12);
    }
}

