/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class I
extends j {
    private final /* synthetic */ c j;
    private final /* synthetic */ c k;
    private final /* synthetic */ c i;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f10 * 2.0f;
        int[] arrn = net.minecraft.client.w.j.b();
        float f17 = f16;
        float f18 = 1.0f;
        if (arrn == null) {
            if (f17 > f18) {
                f16 = 1.0f;
            }
            f16 = 1.0f - f16 * f16 * f16;
            this.j.r = (float)Math.PI - f16 * 0.35f * (float)Math.PI;
            this.k.r = (float)Math.PI + f16 * 0.35f * (float)Math.PI;
            this.k.e = (float)Math.PI;
            f17 = (f10 + net.minecraft.k.h.g(f10 * 2.7f)) * 0.6f;
            f18 = 12.0f;
        }
        float f19 = f17 * f18;
        this.k.h = this.j.h = 24.0f - f19;
        this.i.h = this.j.h;
        this.i.b(f15);
        this.j.b(f15);
        this.k.b(f15);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public I() {
        this.i = new c(this, 0, 0);
        this.i.a(-5.0f, 22.0f, -5.0f);
        this.i.a(0.0f, 0.0f, 0.0f, 10, 12, 10);
        this.j = new c(this, 40, 0);
        this.j.a(1.5f, 22.0f, -4.0f);
        this.j.a(0.0f, 0.0f, 0.0f, 4, 14, 8);
        this.k = new c(this, 40, 0);
        this.k.a(-1.5f, 22.0f, 4.0f);
        this.k.a(0.0f, 0.0f, 0.0f, 4, 14, 8);
    }
}

