/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class P
extends j {
    private final /* synthetic */ c i;

    public P(float f10) {
        this.i = new c(this);
        int n2 = 2;
        this.i.b(0, 0).b(-4.0f, 0.0f, 0.0f, 2, 2, 2, f10);
        this.i.b(0, 0).b(0.0f, -4.0f, 0.0f, 2, 2, 2, f10);
        this.i.b(0, 0).b(0.0f, 0.0f, -4.0f, 2, 2, 2, f10);
        this.i.b(0, 0).b(0.0f, 0.0f, 0.0f, 2, 2, 2, f10);
        this.i.b(0, 0).b(2.0f, 0.0f, 0.0f, 2, 2, 2, f10);
        this.i.b(0, 0).b(0.0f, 2.0f, 0.0f, 2, 2, 2, f10);
        this.i.b(0, 0).b(0.0f, 0.0f, 2.0f, 2, 2, 2, f10);
        this.i.a(0.0f, 0.0f, 0.0f);
    }

    public P() {
        this(0.0f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.b(f15);
    }
}

