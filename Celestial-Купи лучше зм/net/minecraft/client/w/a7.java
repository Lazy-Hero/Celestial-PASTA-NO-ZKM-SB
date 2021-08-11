/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class a7
extends j {
    /* synthetic */ c j;
    /* synthetic */ c[] i;

    public a7() {
        int[] arrn = net.minecraft.client.w.j.b();
        this.i = new c[8];
        int n2 = -16;
        int[] arrn2 = arrn;
        this.j = new c(this, 0, 0);
        this.j.a(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.j.h += 8.0f;
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2] = new c(this, 48, 0);
            double d10 = (double)i2 * Math.PI * 2.0 / (double)this.i.length;
            float f10 = (float)Math.cos(d10) * 5.0f;
            float f11 = (float)Math.sin(d10) * 5.0f;
            this.i[i2].a(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.i[i2].v = f10;
            this.i[i2].u = f11;
            this.i[i2].h = 15.0f;
            d10 = (double)i2 * Math.PI * -2.0 / (double)this.i.length + 1.5707963267948966;
            this.i[i2].e = (float)d10;
            if (arrn2 == null) continue;
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        c[] arrc = this.i;
        int n2 = arrc.length;
        int[] arrn = net.minecraft.client.w.j.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            c c10 = arrc[i2];
            c10.y = f12;
            if (arrn == null) continue;
        }
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        int[] arrn = net.minecraft.client.w.j.b();
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.j.b(f15);
        c[] arrc = this.i;
        int n2 = arrc.length;
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < n2; ++i2) {
            c c10 = arrc[i2];
            c10.b(f15);
            if (arrn2 == null) continue;
        }
    }
}

