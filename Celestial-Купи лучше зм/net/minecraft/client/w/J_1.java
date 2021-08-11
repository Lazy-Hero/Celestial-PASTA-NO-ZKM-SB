/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import java.util.Random;
import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class J
extends j {
    /* synthetic */ c j;
    /* synthetic */ c[] i;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        int[] arrn = net.minecraft.client.w.j.b();
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2].y = 0.2f * net.minecraft.k.h.g(f12 * 0.3f + (float)i2) + 0.4f;
            if (arrn == null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public J() {
        int[] arrn = net.minecraft.client.w.j.b();
        this.i = new c[9];
        int n2 = -16;
        this.j = new c(this, 0, 0);
        this.j.a(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.j.h += 8.0f;
        Random random = new Random(1660L);
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2] = new c(this, 0, 0);
            float f10 = (((float)(i2 % 3) - (float)(i2 / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f11 = ((float)(i2 / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n3 = random.nextInt(7) + 8;
            this.i[i2].a(-1.0f, 0.0f, -1.0f, 2, n3, 2);
            this.i[i2].v = f10;
            this.i[i2].u = f11;
            this.i[i2].h = 15.0f;
            if (arrn2 == null) continue;
        }
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block2: {
            int[] arrn = net.minecraft.client.w.j.b();
            this.a(f10, f11, f12, f13, f14, f15, x2);
            int[] arrn2 = arrn;
            v.M();
            v.b(0.0f, 0.6f, 0.0f);
            this.j.b(f15);
            for (c c10 : this.i) {
                c10.b(f15);
                if (arrn2 == null) {
                    if (arrn2 == null) continue;
                }
                break block2;
            }
            v.B();
        }
    }
}

