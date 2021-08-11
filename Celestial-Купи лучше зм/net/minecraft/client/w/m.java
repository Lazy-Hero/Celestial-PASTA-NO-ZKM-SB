/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class m
extends j {
    public /* synthetic */ c[] j;
    public /* synthetic */ c k;
    public /* synthetic */ c i;

    public void a(boolean bl2) {
        this.i.q = bl2;
        int[] arrn = net.minecraft.client.w.j.b();
        boolean bl3 = bl2;
        if (arrn == null) {
            bl3 = !bl3;
        }
        this.k.q = bl3;
        c c10 = this.j[0];
        boolean bl4 = bl2;
        if (arrn == null) {
            bl4 = !bl4;
        }
        c10.q = bl4;
        this.j[1].q = bl2;
        c c11 = this.j[2];
        boolean bl5 = bl2;
        if (arrn == null) {
            bl5 = !bl5;
        }
        c11.q = bl5;
        this.j[3].q = bl2;
    }

    public m() {
        this.j = new c[4];
        this.g = 64;
        this.f = 64;
        this.i = new c(this, 0, 0);
        this.i.b(0.0f, 0.0f, 0.0f, 16, 16, 6, 0.0f);
        this.k = new c(this, 0, 22);
        this.k.b(0.0f, 0.0f, 0.0f, 16, 16, 6, 0.0f);
        this.j[0] = new c(this, 50, 0);
        this.j[1] = new c(this, 50, 6);
        this.j[2] = new c(this, 50, 12);
        this.j[3] = new c(this, 50, 18);
        this.j[0].a(0.0f, 6.0f, -16.0f, 3, 3, 3);
        this.j[1].a(0.0f, 6.0f, 0.0f, 3, 3, 3);
        this.j[2].a(-16.0f, 6.0f, -16.0f, 3, 3, 3);
        this.j[3].a(-16.0f, 6.0f, 0.0f, 3, 3, 3);
        this.j[0].y = 1.5707964f;
        this.j[1].y = 1.5707964f;
        this.j[2].y = 1.5707964f;
        this.j[3].y = 1.5707964f;
        this.j[0].r = 0.0f;
        this.j[1].r = 1.5707964f;
        this.j[2].r = 4.712389f;
        this.j[3].r = (float)Math.PI;
    }

    public int a() {
        return 51;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b() {
        this.i.b(0.0625f);
        this.k.b(0.0625f);
        this.j[0].b(0.0625f);
        this.j[1].b(0.0625f);
        this.j[2].b(0.0625f);
        this.j[3].b(0.0625f);
    }
}

