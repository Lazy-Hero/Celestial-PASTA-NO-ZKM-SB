/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.aX;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class N
extends j {
    public /* synthetic */ c n;
    public /* synthetic */ c m;
    public /* synthetic */ c k;
    public /* synthetic */ c i;
    public /* synthetic */ c j;
    public /* synthetic */ c l;

    private static gP a(gP gP2) {
        return gP2;
    }

    private float a(float f10, float f11) {
        return (Math.abs(f10 % f11 - f11 * 0.5f) - f11 * 0.25f) / (f11 * 0.25f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.i.b(f15);
        this.k.b(f15);
        this.n.b(f15);
        this.l.b(f15);
        this.m.b(f15);
        this.j.b(f15);
    }

    public N() {
        this(0.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        this.i.e = f13 * ((float)Math.PI / 180);
        this.i.y = f14 * ((float)Math.PI / 180);
        this.n.y = -1.5f * this.a(f10, 13.0f) * f11;
        this.l.y = 1.5f * this.a(f10, 13.0f) * f11;
        this.n.e = 0.0f;
        this.l.e = 0.0f;
    }

    public N(float f10, float f11) {
        int n2 = 128;
        int n3 = 128;
        this.i = new c(this).a(128, 128);
        this.i.a(0.0f, 0.0f + f11, -2.0f);
        this.i.b(0, 0).b(-4.0f, -12.0f, -5.5f, 8, 10, 8, f10);
        this.i.b(24, 0).b(-1.0f, -5.0f, -7.5f, 2, 4, 2, f10);
        this.k = new c(this).a(128, 128);
        this.k.a(0.0f, 0.0f + f11, 0.0f);
        this.k.b(0, 40).b(-9.0f, -2.0f, -6.0f, 18, 12, 11, f10);
        this.k.b(0, 70).b(-4.5f, 10.0f, -3.0f, 9, 5, 6, f10 + 0.5f);
        this.m = new c(this).a(128, 128);
        this.m.a(0.0f, -7.0f, 0.0f);
        this.m.b(60, 21).b(-13.0f, -2.5f, -3.0f, 4, 30, 6, f10);
        this.j = new c(this).a(128, 128);
        this.j.a(0.0f, -7.0f, 0.0f);
        this.j.b(60, 58).b(9.0f, -2.5f, -3.0f, 4, 30, 6, f10);
        this.n = new c(this, 0, 22).a(128, 128);
        this.n.a(-4.0f, 18.0f + f11, 0.0f);
        this.n.b(37, 0).b(-3.5f, -3.0f, -3.0f, 6, 16, 5, f10);
        this.l = new c(this, 0, 22).a(128, 128);
        this.l.A = true;
        this.l.b(60, 0).a(5.0f, 18.0f + f11, 0.0f);
        this.l.b(-3.5f, -3.0f, -3.0f, 6, 16, 5, f10);
    }

    public N(float f10) {
        this(f10, -7.0f);
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        block4: {
            block5: {
                block6: {
                    int n2;
                    int[] arrn;
                    block2: {
                        int n3;
                        aX aX2;
                        block3: {
                            int n4;
                            aX2 = (aX)b10;
                            arrn = net.minecraft.client.w.j.b();
                            n3 = n4 = aX2.c();
                            if (arrn != null) break block2;
                            if (n3 <= 0) break block3;
                            this.m.y = -2.0f + 1.5f * this.a((float)n4 - f12, 10.0f);
                            this.j.y = -2.0f + 1.5f * this.a((float)n4 - f12, 10.0f);
                            if (arrn == null) break block4;
                        }
                        n3 = n2 = aX2.e();
                    }
                    if (arrn != null) break block5;
                    if (n2 <= 0) break block6;
                    this.m.y = -0.8f + 0.025f * this.a(n2, 70.0f);
                    this.j.y = 0.0f;
                    if (arrn == null) break block4;
                }
                this.m.y = (-0.2f + 1.5f * this.a(f10, 13.0f)) * f11;
            }
            this.j.y = (-0.2f - 1.5f * this.a(f10, 13.0f)) * f11;
        }
    }
}

