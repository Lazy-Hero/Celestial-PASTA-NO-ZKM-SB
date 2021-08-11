/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.a4;
import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;
import net.minecraft.k.h;

public class v
extends n {
    public v(float f10, float f11, boolean bl2) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    super(f10, 0.0f, 64, bl2 ? 32 : 64);
                    if (arrn != null) break block2;
                    if (!bl2) break block3;
                    this.n = new c(this, 0, 0);
                    this.n.b(-4.0f, -10.0f, -4.0f, 8, 8, 8, f10);
                    this.n.a(0.0f, 0.0f + f11, 0.0f);
                    this.j = new c(this, 16, 16);
                    this.j.a(0.0f, 0.0f + f11, 0.0f);
                    this.j.b(-4.0f, 0.0f, -2.0f, 8, 12, 4, f10 + 0.1f);
                    this.i = new c(this, 0, 16);
                    this.i.a(-2.0f, 12.0f + f11, 0.0f);
                    this.i.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10 + 0.1f);
                    this.m = new c(this, 0, 16);
                    this.m.A = true;
                    this.m.a(2.0f, 12.0f + f11, 0.0f);
                    this.m.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10 + 0.1f);
                    if (arrn == null) break block4;
                }
                this.n = new c(this, 0, 0);
                this.n.a(0.0f, f11, 0.0f);
                this.n.b(0, 0).b(-4.0f, -10.0f, -4.0f, 8, 10, 8, f10);
                this.n.b(24, 0).b(-1.0f, -3.0f, -6.0f, 2, 4, 2, f10);
                this.j = new c(this, 16, 20);
                this.j.a(0.0f, 0.0f + f11, 0.0f);
                this.j.b(-4.0f, 0.0f, -3.0f, 8, 12, 6, f10);
                this.j.b(0, 38).b(-4.0f, 0.0f, -3.0f, 8, 18, 6, f10 + 0.05f);
                this.o = new c(this, 44, 38);
                this.o.b(-3.0f, -2.0f, -2.0f, 4, 12, 4, f10);
                this.o.a(-5.0f, 2.0f + f11, 0.0f);
                this.k = new c(this, 44, 38);
                this.k.A = true;
                this.k.b(-1.0f, -2.0f, -2.0f, 4, 12, 4, f10);
                this.k.a(5.0f, 2.0f + f11, 0.0f);
                this.i = new c(this, 0, 22);
                this.i.a(-2.0f, 12.0f + f11, 0.0f);
                this.i.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
                this.m = new c(this, 0, 22);
                this.m.A = true;
                this.m.a(2.0f, 12.0f + f11, 0.0f);
            }
            this.m.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        }
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        float f16;
        super.a(f10, f11, f12, f13, f14, f15, x2);
        a4 a42 = (a4)x2;
        float f17 = net.minecraft.k.h.g(this.a * (float)Math.PI);
        float f18 = net.minecraft.k.h.g((1.0f - (1.0f - this.a) * (1.0f - this.a)) * (float)Math.PI);
        this.o.r = 0.0f;
        this.k.r = 0.0f;
        this.o.e = -(0.1f - f17 * 0.6f);
        this.k.e = 0.1f - f17 * 0.6f;
        this.o.y = f16 = (float)(-Math.PI) / (a42.y() ? 1.5f : 2.25f);
        this.k.y = f16;
        this.o.y += f17 * 1.2f - f18 * 0.4f;
        this.k.y += f17 * 1.2f - f18 * 0.4f;
        this.o.r += net.minecraft.k.h.c(f12 * 0.09f) * 0.05f + 0.05f;
        this.k.r -= net.minecraft.k.h.c(f12 * 0.09f) * 0.05f + 0.05f;
        this.o.y += net.minecraft.k.h.g(f12 * 0.067f) * 0.05f;
        this.k.y -= net.minecraft.k.h.g(f12 * 0.067f) * 0.05f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public v() {
        this(0.0f, 0.0f, false);
    }
}

