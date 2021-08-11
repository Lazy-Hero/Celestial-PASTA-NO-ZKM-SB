/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class R
extends j {
    public /* synthetic */ c[] i;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.i[5].h = 4.0f - f12;
        int[] arrn = j.b();
        for (int i2 = 0; i2 < 6; ++i2) {
            this.i[i2].b(f15);
            if (arrn == null) continue;
        }
    }

    public R() {
        this.i = new c[7];
        this.i[0] = new c(this, 0, 10);
        this.i[1] = new c(this, 0, 0);
        this.i[2] = new c(this, 0, 0);
        this.i[3] = new c(this, 0, 0);
        this.i[4] = new c(this, 0, 0);
        this.i[5] = new c(this, 44, 10);
        int n2 = 20;
        int n3 = 8;
        int n4 = 16;
        int n5 = 4;
        this.i[0].b(-10.0f, -8.0f, -1.0f, 20, 16, 2, 0.0f);
        this.i[0].a(0.0f, 4.0f, 0.0f);
        this.i[5].b(-9.0f, -7.0f, -1.0f, 18, 14, 1, 0.0f);
        this.i[5].a(0.0f, 4.0f, 0.0f);
        this.i[1].b(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.i[1].a(-9.0f, 4.0f, 0.0f);
        this.i[2].b(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.i[2].a(9.0f, 4.0f, 0.0f);
        this.i[3].b(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.i[3].a(0.0f, 4.0f, -7.0f);
        this.i[4].b(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.i[4].a(0.0f, 4.0f, 7.0f);
        this.i[0].y = 1.5707964f;
        this.i[1].e = 4.712389f;
        this.i[2].e = 1.5707964f;
        this.i[3].e = (float)Math.PI;
        this.i[5].y = -1.5707964f;
    }
}

