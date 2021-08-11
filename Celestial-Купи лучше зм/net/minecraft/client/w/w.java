/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class w
extends j {
    private final /* synthetic */ c i;
    private final /* synthetic */ c[] j;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        int[] arrn = net.minecraft.client.w.j.b();
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.b(f15);
        c[] arrc = this.j;
        int[] arrn2 = arrn;
        for (c c10 : arrc) {
            c10.b(f15);
            if (arrn2 == null) continue;
        }
    }

    public w() {
        block2: {
            this.j = new c[12];
            int[] arrn = net.minecraft.client.w.j.b();
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                this.j[i2] = new c(this, 0, 16);
                this.j[i2].a(0.0f, 0.0f, 0.0f, 2, 8, 2);
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block2;
            }
            this.i = new c(this, 0, 0);
            this.i.a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block8: {
            int n2;
            int[] arrn;
            float f16;
            block7: {
                block6: {
                    f16 = f12 * (float)Math.PI * -0.1f;
                    arrn = net.minecraft.client.w.j.b();
                    for (n2 = 0; n2 < 4; ++n2) {
                        this.j[n2].h = -2.0f + net.minecraft.k.h.c(((float)(n2 * 2) + f12) * 0.25f);
                        this.j[n2].v = net.minecraft.k.h.c(f16) * 9.0f;
                        this.j[n2].u = net.minecraft.k.h.g(f16) * 9.0f;
                        f16 += 1.0f;
                        if (arrn == null) {
                            if (arrn == null) continue;
                        }
                        break block6;
                    }
                    f16 = 0.7853982f + f12 * (float)Math.PI * 0.03f;
                }
                for (n2 = 4; n2 < 8; ++n2) {
                    this.j[n2].h = 2.0f + net.minecraft.k.h.c(((float)(n2 * 2) + f12) * 0.25f);
                    this.j[n2].v = net.minecraft.k.h.c(f16) * 7.0f;
                    this.j[n2].u = net.minecraft.k.h.g(f16) * 7.0f;
                    f16 += 1.0f;
                    if (arrn == null) {
                        if (arrn == null) continue;
                    }
                    break block7;
                }
                f16 = 0.47123894f + f12 * (float)Math.PI * -0.05f;
            }
            for (n2 = 8; n2 < 12; ++n2) {
                this.j[n2].h = 11.0f + net.minecraft.k.h.c(((float)n2 * 1.5f + f12) * 0.5f);
                this.j[n2].v = net.minecraft.k.h.c(f16) * 5.0f;
                this.j[n2].u = net.minecraft.k.h.g(f16) * 5.0f;
                f16 += 1.0f;
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block8;
            }
            this.i.e = f13 * ((float)Math.PI / 180);
            this.i.y = f14 * ((float)Math.PI / 180);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

