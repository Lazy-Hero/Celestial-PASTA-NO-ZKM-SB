/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class a6
extends j {
    private final /* synthetic */ float[] k;
    private final /* synthetic */ c[] i;
    private static final /* synthetic */ int[][] m;
    private static final /* synthetic */ int[][] l;
    private final /* synthetic */ c[] j;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block2: {
            int[] arrn = net.minecraft.client.w.j.b();
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                this.j[i2].e = net.minecraft.k.h.c(f12 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i2 - 2));
                this.j[i2].v = net.minecraft.k.h.g(f12 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs(i2 - 2);
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block2;
            }
            this.i[0].e = this.j[2].e;
            this.i[1].e = this.j[4].e;
            this.i[1].v = this.j[4].v;
            this.i[2].e = this.j[1].e;
            this.i[2].v = this.j[1].v;
        }
    }

    public a6() {
        block4: {
            int[] arrn = net.minecraft.client.w.j.b();
            this.j = new c[7];
            int[] arrn2 = arrn;
            this.k = new float[7];
            float f10 = -3.5f;
            int n2 = 0;
            while (n2 < this.j.length) {
                this.j[n2] = new c(this, l[n2][0], l[n2][1]);
                this.j[n2].a((float)m[n2][0] * -0.5f, 0.0f, (float)m[n2][2] * -0.5f, m[n2][0], m[n2][1], m[n2][2]);
                this.j[n2].a(0.0f, 24 - m[n2][1], f10);
                this.k[n2] = f10;
                if (arrn2 == null) {
                    if (arrn2 == null) {
                        if (n2 < this.j.length - 1) {
                            f10 += (float)(m[n2][2] + m[n2 + 1][2]) * 0.5f;
                        }
                        ++n2;
                    }
                    if (arrn2 == null) continue;
                }
                break block4;
            }
            this.i = new c[3];
            this.i[0] = new c(this, 20, 0);
            this.i[0].a(-5.0f, 0.0f, (float)m[2][2] * -0.5f, 10, 8, m[2][2]);
            this.i[0].a(0.0f, 16.0f, this.k[2]);
            this.i[1] = new c(this, 20, 11);
            this.i[1].a(-3.0f, 0.0f, (float)m[4][2] * -0.5f, 6, 4, m[4][2]);
            this.i[1].a(0.0f, 20.0f, this.k[4]);
            this.i[2] = new c(this, 20, 18);
            this.i[2].a(-3.0f, 0.0f, (float)m[4][2] * -0.5f, 6, 5, m[1][2]);
            this.i[2].a(0.0f, 19.0f, this.k[1]);
        }
    }

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

    static {
        m = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
        l = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

