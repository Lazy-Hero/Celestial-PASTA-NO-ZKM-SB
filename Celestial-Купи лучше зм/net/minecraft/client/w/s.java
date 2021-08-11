/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.aV;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.a3;
import net.minecraft.ar.b;
import net.minecraft.client.w.c;
import net.minecraft.client.w.e;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;
import net.minecraft.k.h;
import net.minecraft.w.d;

public class s
extends n {
    public s(float f10, boolean bl2) {
        block3: {
            block2: {
                int[] arrn = net.minecraft.client.w.j.b();
                super(f10, 0.0f, 64, 32);
                int[] arrn2 = arrn;
                if (arrn2 != null) break block2;
                if (bl2) break block3;
                this.o = new c(this, 40, 16);
                this.o.b(-1.0f, -2.0f, -1.0f, 2, 12, 2, f10);
                this.o.a(-5.0f, 2.0f, 0.0f);
                this.k = new c(this, 40, 16);
                this.k.A = true;
                this.k.b(-1.0f, -2.0f, -1.0f, 2, 12, 2, f10);
                this.k.a(5.0f, 2.0f, 0.0f);
                this.i = new c(this, 0, 16);
                this.i.b(-1.0f, 0.0f, -1.0f, 2, 12, 2, f10);
                this.i.a(-2.0f, 12.0f, 0.0f);
                this.m = new c(this, 0, 16);
                this.m.A = true;
                this.m.b(-1.0f, 0.0f, -1.0f, 2, 12, 2, f10);
            }
            this.m.a(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void a(float f10, b b10) {
        float f11 = b10 == net.minecraft.ar.b.RIGHT ? 1.0f : -1.0f;
        c c10 = this.a(b10);
        c10.v += f11;
        c10.a(f10);
        c10.v -= f11;
    }

    public s() {
        this(0.0f, false);
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        block2: {
            block3: {
                block5: {
                    B b11;
                    int[] arrn;
                    block4: {
                        this.r = e.EMPTY;
                        arrn = net.minecraft.client.w.j.b();
                        this.l = e.EMPTY;
                        d d10 = b10.c(a3.MAIN_HAND);
                        if (arrn != null) break block2;
                        if (d10.w() != net.minecraft.u.h.i) break block3;
                        b11 = (aV)b10;
                        if (arrn != null) break block4;
                        if (!b11.f()) break block3;
                        b11 = b10;
                    }
                    if (((B)b11).al() != net.minecraft.ar.b.RIGHT) break block5;
                    this.r = e.BOW_AND_ARROW;
                    if (arrn == null) break block3;
                }
                this.l = e.BOW_AND_ARROW;
            }
            super.a(b10, f10, f11, f12);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block3: {
            block5: {
                d d10;
                block4: {
                    boolean bl2;
                    d d11;
                    block2: {
                        super.a(f10, f11, f12, f13, f14, f15, x2);
                        d11 = ((B)x2).av();
                        int[] arrn = net.minecraft.client.w.j.b();
                        aV aV2 = (aV)x2;
                        bl2 = aV2.f();
                        if (arrn != null) break block2;
                        if (!bl2) break block3;
                        d10 = d11;
                        if (arrn != null) break block4;
                        bl2 = d10.G();
                    }
                    if (bl2) break block5;
                    d10 = d11;
                }
                if (d10.w() == net.minecraft.u.h.i) break block3;
            }
            float f16 = net.minecraft.k.h.g(this.a * (float)Math.PI);
            float f17 = net.minecraft.k.h.g((1.0f - (1.0f - this.a) * (1.0f - this.a)) * (float)Math.PI);
            this.o.r = 0.0f;
            this.k.r = 0.0f;
            this.o.e = -(0.1f - f16 * 0.6f);
            this.k.e = 0.1f - f16 * 0.6f;
            this.o.y = -1.5707964f;
            this.k.y = -1.5707964f;
            this.o.y -= f16 * 1.2f - f17 * 0.4f;
            this.k.y -= f16 * 1.2f - f17 * 0.4f;
            this.o.r += net.minecraft.k.h.c(f12 * 0.09f) * 0.05f + 0.05f;
            this.k.r -= net.minecraft.k.h.c(f12 * 0.09f) * 0.05f + 0.05f;
            this.o.y += net.minecraft.k.h.g(f12 * 0.067f) * 0.05f;
            this.k.y -= net.minecraft.k.h.g(f12 * 0.067f) * 0.05f;
        }
    }
}

