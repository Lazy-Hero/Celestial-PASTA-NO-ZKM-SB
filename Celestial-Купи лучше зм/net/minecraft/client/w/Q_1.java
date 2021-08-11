/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.ad;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class Q
extends j {
    /* synthetic */ c[] i;
    /* synthetic */ c j;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.j.b(f15);
        c[] arrc = this.i;
        int[] arrn = net.minecraft.client.w.j.b();
        for (c c10 : arrc) {
            c10.b(f15);
            if (arrn == null) continue;
        }
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        float f13;
        ad ad2 = (ad)b10;
        int[] arrn = net.minecraft.client.w.j.b();
        float f14 = ad2.cr + (ad2.ct - ad2.cr) * f12;
        float f15 = f14 - 0.0f;
        float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (arrn == null) {
            if (f16 < 0) {
                f14 = 0.0f;
            }
            f16 = f13 = 0.0f;
        }
        while (f13 < this.i.length) {
            this.i[f13].h = (float)(-(4 - f13)) * f14 * 1.7f;
            ++f13;
            if (arrn == null) continue;
        }
    }

    public Q() {
        block3: {
            int[] arrn = net.minecraft.client.w.j.b();
            int[] arrn2 = arrn;
            this.i = new c[8];
            for (int i2 = 0; i2 < this.i.length; ++i2) {
                int n2;
                int n3;
                block6: {
                    int n4;
                    block7: {
                        int n5;
                        block4: {
                            block5: {
                                n3 = 0;
                                n2 = i2;
                                if (arrn2 != null) break block3;
                                n4 = i2;
                                n5 = 2;
                                if (arrn2 != null) break block4;
                                if (n4 != n5) break block5;
                                n3 = 24;
                                n2 = 10;
                                if (arrn2 == null) break block6;
                            }
                            n4 = i2;
                            if (arrn2 != null) break block7;
                            n5 = 3;
                        }
                        if (n4 != n5) break block6;
                        n3 = 24;
                        n4 = 19;
                    }
                    n2 = n4;
                }
                this.i[i2] = new c(this, n3, n2);
                this.i[i2].a(-4.0f, 16 + i2, -4.0f, 8, 1, 8);
                if (arrn2 == null) continue;
            }
            this.j = new c(this, 0, 16);
            this.j.a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
        }
    }
}

