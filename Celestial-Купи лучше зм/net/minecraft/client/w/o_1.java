/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;

public class o
extends n {
    private static gP b(gP gP2) {
        return gP2;
    }

    public o() {
        this(0.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block3: {
            x x3;
            block2: {
                int[] arrn = net.minecraft.client.w.j.b();
                x3 = x2;
                if (arrn != null) break block2;
                if (!(x3 instanceof net.minecraft.J.n)) break block3;
                x3 = x2;
            }
            net.minecraft.J.n n2 = (net.minecraft.J.n)x3;
            this.n.y = (float)Math.PI / 180 * n2.c().c();
            this.n.e = (float)Math.PI / 180 * n2.c().d();
            this.n.r = (float)Math.PI / 180 * n2.c().a();
            this.n.a(0.0f, 1.0f, 0.0f);
            this.j.y = (float)Math.PI / 180 * n2.l().c();
            this.j.e = (float)Math.PI / 180 * n2.l().d();
            this.j.r = (float)Math.PI / 180 * n2.l().a();
            this.k.y = (float)Math.PI / 180 * n2.n().c();
            this.k.e = (float)Math.PI / 180 * n2.n().d();
            this.k.r = (float)Math.PI / 180 * n2.n().a();
            this.o.y = (float)Math.PI / 180 * n2.a().c();
            this.o.e = (float)Math.PI / 180 * n2.a().d();
            this.o.r = (float)Math.PI / 180 * n2.a().a();
            this.m.y = (float)Math.PI / 180 * n2.w().c();
            this.m.e = (float)Math.PI / 180 * n2.w().d();
            this.m.r = (float)Math.PI / 180 * n2.w().a();
            this.m.a(1.9f, 11.0f, 0.0f);
            this.i.y = (float)Math.PI / 180 * n2.v().c();
            this.i.e = (float)Math.PI / 180 * n2.v().d();
            this.i.r = (float)Math.PI / 180 * n2.v().a();
            this.i.a(-1.9f, 11.0f, 0.0f);
            net.minecraft.client.w.o.a(this.n, this.q);
        }
    }

    public o(float f10) {
        this(f10, 64, 32);
    }

    protected o(float f10, int n2, int n3) {
        super(f10, 0.0f, n2, n3);
    }
}

