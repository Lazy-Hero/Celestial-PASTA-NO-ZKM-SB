/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.J.o;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.client.w.a;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class x
extends j
implements a {
    private final /* synthetic */ int k;
    public /* synthetic */ c l;
    public /* synthetic */ c[] j;
    public /* synthetic */ c[] i;

    @Override
    public void a(net.minecraft.U.x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        v.a(90.0f, 0.0f, 1.0f, 0.0f);
        v.a(false, false, false, false);
        this.l.b(f15);
        v.a(true, true, true, true);
    }

    @Override
    public void b(net.minecraft.U.x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block2: {
            int[] arrn = net.minecraft.client.w.j.b();
            v.a(90.0f, 0.0f, 1.0f, 0.0f);
            o o2 = (o)x2;
            this.a(f10, f11, f12, f13, f14, f15, x2);
            int[] arrn2 = arrn;
            for (int i2 = 0; i2 < 5; ++i2) {
                this.j[i2].b(f15);
                if (arrn2 == null) {
                    if (arrn2 == null) continue;
                }
                break block2;
            }
            this.a(o2, 0, f15, f10);
            this.a(o2, 1, f15, f10);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public x() {
        this.j = new c[5];
        this.i = new c[2];
        this.k = aZ.c(1);
        this.j[0] = new c(this, 0, 0).a(128, 64);
        this.j[1] = new c(this, 0, 19).a(128, 64);
        this.j[2] = new c(this, 0, 27).a(128, 64);
        this.j[3] = new c(this, 0, 35).a(128, 64);
        this.j[4] = new c(this, 0, 43).a(128, 64);
        int n2 = 32;
        int n3 = 6;
        int n4 = 20;
        int n5 = 4;
        int n6 = 28;
        this.j[0].b(-14.0f, -9.0f, -3.0f, 28, 16, 3, 0.0f);
        this.j[0].a(0.0f, 3.0f, 1.0f);
        this.j[1].b(-13.0f, -7.0f, -1.0f, 18, 6, 2, 0.0f);
        this.j[1].a(-15.0f, 4.0f, 4.0f);
        this.j[2].b(-8.0f, -7.0f, -1.0f, 16, 6, 2, 0.0f);
        this.j[2].a(15.0f, 4.0f, 0.0f);
        this.j[3].b(-14.0f, -7.0f, -1.0f, 28, 6, 2, 0.0f);
        this.j[3].a(0.0f, 4.0f, -9.0f);
        this.j[4].b(-14.0f, -7.0f, -1.0f, 28, 6, 2, 0.0f);
        this.j[4].a(0.0f, 4.0f, 9.0f);
        this.j[0].y = 1.5707964f;
        this.j[1].e = 4.712389f;
        this.j[2].e = 1.5707964f;
        this.j[3].e = (float)Math.PI;
        this.i[0] = this.a(true);
        this.i[0].a(3.0f, -5.0f, 9.0f);
        this.i[1] = this.a(false);
        this.i[1].a(3.0f, -5.0f, -9.0f);
        this.i[1].e = (float)Math.PI;
        this.i[0].r = 0.19634955f;
        this.i[1].r = 0.19634955f;
        this.l = new c(this, 0, 0).a(128, 64);
        this.l.b(-14.0f, -9.0f, -3.0f, 28, 16, 3, 0.0f);
        this.l.a(0.0f, -3.0f, 1.0f);
        this.l.y = 1.5707964f;
    }

    protected c a(boolean bl2) {
        int[] arrn = net.minecraft.client.w.j.b();
        c c10 = new c(this, 62, bl2 ? 0 : 20).a(128, 64);
        int n2 = 20;
        int n3 = 7;
        int n4 = 6;
        float f10 = -5.0f;
        c c11 = c10;
        float f11 = -1.0f;
        if (arrn == null) {
            c11.a(f11, 0.0f, -5.0f, 2, 2, 18);
            c11 = c10;
            f11 = bl2 ? -1.001f : 0.001f;
        }
        c11.a(f11, -3.0f, 8.0f, 1, 6, 7);
        return c10;
    }

    protected void a(o o2, int n2, float f10, float f11) {
        float f12 = o2.a(n2, f11);
        c c10 = this.i[n2];
        int[] arrn = net.minecraft.client.w.j.b();
        c10.y = (float)net.minecraft.k.h.a(-1.0471975803375244, -0.2617993950843811, (double)((net.minecraft.k.h.g(-f12) + 1.0f) / 2.0f));
        c10.e = (float)net.minecraft.k.h.a(-0.7853981633974483, 0.7853981633974483, (double)((net.minecraft.k.h.g(-f12 + 1.0f) + 1.0f) / 2.0f));
        if (arrn == null) {
            if (n2 == 1) {
                c10.e = (float)Math.PI - c10.e;
            }
            c10.b(f10);
        }
    }
}

