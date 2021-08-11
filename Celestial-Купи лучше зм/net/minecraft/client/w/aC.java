/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class aC
extends j {
    /* synthetic */ c l;
    /* synthetic */ c i;
    /* synthetic */ c j;
    /* synthetic */ c k;

    public aC(int n2) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    int[] arrn2 = arrn;
                    if (arrn2 != null) break block2;
                    if (n2 <= 0) break block3;
                    this.l = new c(this, 0, n2);
                    this.l.a(-3.0f, 17.0f, -3.0f, 6, 6, 6);
                    this.i = new c(this, 32, 0);
                    this.i.a(-3.25f, 18.0f, -3.5f, 2, 2, 2);
                    this.k = new c(this, 32, 4);
                    this.k.a(1.25f, 18.0f, -3.5f, 2, 2, 2);
                    this.j = new c(this, 32, 8);
                    this.j.a(0.0f, 21.0f, -3.5f, 1, 1, 1);
                    if (arrn2 == null) break block4;
                }
                this.l = new c(this, 0, n2);
            }
            this.l.a(-4.0f, 16.0f, -4.0f, 8, 8, 8);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block3: {
            c c10;
            block2: {
                this.a(f10, f11, f12, f13, f14, f15, x2);
                v.b(0.0f, 0.001f, 0.0f);
                int[] arrn = net.minecraft.client.w.j.b();
                this.l.b(f15);
                int[] arrn2 = arrn;
                c10 = this.i;
                if (arrn2 != null) break block2;
                if (c10 == null) break block3;
                this.i.b(f15);
                this.k.b(f15);
                c10 = this.j;
            }
            c10.b(f15);
        }
    }
}

