/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class H
extends j {
    private final /* synthetic */ c[] i;
    private static final /* synthetic */ int[][] j;
    private static final /* synthetic */ int[][] k;
    private static final /* synthetic */ int l;

    static {
        k = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
        j = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
        l = k.length;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        c[] arrc = this.i;
        int n2 = arrc.length;
        int[] arrn = net.minecraft.client.w.j.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            c c10 = arrc[i2];
            c10.b(f15);
            if (arrn == null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        int[] arrn = net.minecraft.client.w.j.b();
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2].e = net.minecraft.k.h.c(f12 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs(i2 - 2));
            this.i[i2].v = net.minecraft.k.h.g(f12 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs(i2 - 2);
            if (arrn == null) continue;
        }
    }

    public H() {
        int[] arrn = net.minecraft.client.w.j.b();
        this.i = new c[l];
        float f10 = -3.5f;
        int[] arrn2 = arrn;
        int n2 = 0;
        while (n2 < this.i.length) {
            this.i[n2] = new c(this, j[n2][0], j[n2][1]);
            this.i[n2].a((float)k[n2][0] * -0.5f, 0.0f, (float)k[n2][2] * -0.5f, k[n2][0], k[n2][1], k[n2][2]);
            this.i[n2].a(0.0f, 24 - k[n2][1], f10);
            if (arrn2 == null) {
                if (n2 < this.i.length - 1) {
                    f10 += (float)(k[n2][2] + k[n2 + 1][2]) * 0.5f;
                }
                ++n2;
            }
            if (arrn2 == null) continue;
        }
    }
}

