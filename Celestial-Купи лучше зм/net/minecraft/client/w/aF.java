/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.aX;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class aF
extends aX {
    public /* synthetic */ boolean q;
    private final /* synthetic */ c o;
    private final /* synthetic */ c p;

    public aF(float f10) {
        super(f10, 0.0f, 64, 128);
        this.p = new c(this).a(64, 128);
        this.p.a(0.0f, -2.0f, 0.0f);
        this.p.b(0, 0).b(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.k.a(this.p);
        this.o = new c(this).a(64, 128);
        this.o.a(-5.0f, -10.03125f, -5.0f);
        this.o.b(0, 64).a(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.j.a(this.o);
        c c10 = new c(this).a(64, 128);
        c10.a(1.75f, -4.0f, 2.0f);
        c10.b(0, 76).a(0.0f, 0.0f, 0.0f, 7, 4, 7);
        c10.y = -0.05235988f;
        c10.r = 0.02617994f;
        this.o.a(c10);
        c c11 = new c(this).a(64, 128);
        c11.a(1.75f, -4.0f, 2.0f);
        c11.b(0, 87).a(0.0f, 0.0f, 0.0f, 4, 4, 4);
        c11.y = -0.10471976f;
        c11.r = 0.05235988f;
        c10.a(c11);
        c c12 = new c(this).a(64, 128);
        c12.a(1.75f, -2.0f, 2.0f);
        c12.b(0, 95).b(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        c12.y = -0.20943952f;
        c12.r = 0.10471976f;
        c11.a(c12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block3: {
            block2: {
                super.a(f10, f11, f12, f13, f14, f15, x2);
                this.k.i = 0.0f;
                this.k.F = 0.0f;
                this.k.E = 0.0f;
                int[] arrn = net.minecraft.client.w.j.b();
                float f16 = 0.01f * (float)(x2.W() % 10);
                this.k.y = net.minecraft.k.h.g((float)x2.H * f16) * 4.5f * ((float)Math.PI / 180);
                this.k.e = 0.0f;
                this.k.r = net.minecraft.k.h.c((float)x2.H * f16) * 2.5f * ((float)Math.PI / 180);
                aF aF2 = this;
                if (arrn != null) break block2;
                if (!aF2.q) break block3;
                this.k.y = -0.9f;
                this.k.E = -0.09375f;
                aF2 = this;
            }
            aF2.k.F = 0.1875f;
        }
    }
}

