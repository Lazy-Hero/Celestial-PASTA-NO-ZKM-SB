/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class an
extends j {
    private final /* synthetic */ c[] i;
    private final /* synthetic */ c[] j;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        c c10;
        int n2;
        int[] arrn;
        int n3;
        c[] arrc;
        block3: {
            this.a(f10, f11, f12, f13, f14, f15, x2);
            arrc = this.j;
            n3 = arrc.length;
            arrn = net.minecraft.client.w.j.b();
            for (n2 = 0; n2 < n3; ++n2) {
                c10 = arrc[n2];
                c10.b(f15);
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block3;
            }
            arrc = this.i;
            n3 = arrc.length;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            c10 = arrc[n2];
            c10.b(f15);
            if (arrn == null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        float f16 = net.minecraft.k.h.c(f12 * 0.1f);
        this.i[1].y = (0.065f + 0.05f * f16) * (float)Math.PI;
        this.i[2].a(-2.0f, 6.9f + net.minecraft.k.h.c(this.i[1].y) * 10.0f, -0.5f + net.minecraft.k.h.g(this.i[1].y) * 10.0f);
        this.i[2].y = (0.265f + 0.1f * f16) * (float)Math.PI;
        this.j[0].e = f13 * ((float)Math.PI / 180);
        this.j[0].y = f14 * ((float)Math.PI / 180);
    }

    public an(float f10) {
        this.g = 64;
        this.f = 64;
        this.i = new c[3];
        this.i[0] = new c(this, 0, 16);
        this.i[0].b(-10.0f, 3.9f, -0.5f, 20, 3, 3, f10);
        this.i[1] = new c(this).a(this.g, this.f);
        this.i[1].a(-2.0f, 6.9f, -0.5f);
        this.i[1].b(0, 22).b(0.0f, 0.0f, 0.0f, 3, 10, 3, f10);
        this.i[1].b(24, 22).b(-4.0f, 1.5f, 0.5f, 11, 2, 2, f10);
        this.i[1].b(24, 22).b(-4.0f, 4.0f, 0.5f, 11, 2, 2, f10);
        this.i[1].b(24, 22).b(-4.0f, 6.5f, 0.5f, 11, 2, 2, f10);
        this.i[2] = new c(this, 12, 22);
        this.i[2].b(0.0f, 0.0f, 0.0f, 3, 6, 3, f10);
        this.j = new c[3];
        this.j[0] = new c(this, 0, 0);
        this.j[0].b(-4.0f, -4.0f, -4.0f, 8, 8, 8, f10);
        this.j[1] = new c(this, 32, 0);
        this.j[1].b(-4.0f, -4.0f, -4.0f, 6, 6, 6, f10);
        this.j[1].v = -8.0f;
        this.j[1].h = 4.0f;
        this.j[2] = new c(this, 32, 0);
        this.j[2].b(-4.0f, -4.0f, -4.0f, 6, 6, 6, f10);
        this.j[2].v = 10.0f;
        this.j[2].h = 4.0f;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        net.minecraft.h.c c10 = (net.minecraft.h.c)b10;
        int[] arrn = net.minecraft.client.w.j.b();
        for (int i2 = 1; i2 < 3; ++i2) {
            this.j[i2].e = (c10.d(i2 - 1) - b10.bf) * ((float)Math.PI / 180);
            this.j[i2].y = c10.f(i2 - 1) * ((float)Math.PI / 180);
            if (arrn == null) continue;
        }
    }
}

