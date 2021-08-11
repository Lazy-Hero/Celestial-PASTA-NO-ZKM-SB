/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.ag.Y;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class l
extends j {
    private final /* synthetic */ c j;
    private final /* synthetic */ c i;
    private final /* synthetic */ c k;
    private final /* synthetic */ c m;
    private final /* synthetic */ c n;
    private final /* synthetic */ c l;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    if (arrn != null) break block2;
                    if (!((Y)x2).b()) break block3;
                    this.l.y = f14 * ((float)Math.PI / 180);
                    this.l.e = (float)Math.PI - f13 * ((float)Math.PI / 180);
                    this.l.r = (float)Math.PI;
                    this.l.a(0.0f, -2.0f, 0.0f);
                    this.n.a(-3.0f, 0.0f, 3.0f);
                    this.k.a(3.0f, 0.0f, 3.0f);
                    this.j.y = (float)Math.PI;
                    this.n.y = -0.15707964f;
                    this.n.e = -1.2566371f;
                    this.m.e = -1.7278761f;
                    this.k.y = this.n.y;
                    this.k.e = -this.n.e;
                    this.i.e = -this.m.e;
                    if (arrn == null) break block4;
                }
                this.l.y = f14 * ((float)Math.PI / 180);
                this.l.e = f13 * ((float)Math.PI / 180);
                this.l.r = 0.0f;
                this.l.a(0.0f, 0.0f, 0.0f);
                this.n.a(0.0f, 0.0f, 0.0f);
                this.k.a(0.0f, 0.0f, 0.0f);
                this.j.y = 0.7853982f + net.minecraft.k.h.c(f12 * 0.1f) * 0.15f;
                this.j.e = 0.0f;
                this.n.e = net.minecraft.k.h.c(f12 * 1.3f) * (float)Math.PI * 0.25f;
                this.k.e = -this.n.e;
                this.m.e = this.n.e * 0.5f;
            }
            this.i.e = -this.n.e * 0.5f;
        }
    }

    public l() {
        this.g = 64;
        this.f = 64;
        this.l = new c(this, 0, 0);
        this.l.a(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        c c10 = new c(this, 24, 0);
        c10.a(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.l.a(c10);
        c c11 = new c(this, 24, 0);
        c11.A = true;
        c11.a(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.l.a(c11);
        this.j = new c(this, 0, 16);
        this.j.a(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.j.b(0, 34).a(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.n = new c(this, 42, 0);
        this.n.a(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.m = new c(this, 24, 16);
        this.m.a(-12.0f, 1.0f, 1.5f);
        this.m.a(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.k = new c(this, 42, 0);
        this.k.A = true;
        this.k.a(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.i = new c(this, 24, 16);
        this.i.A = true;
        this.i.a(12.0f, 1.0f, 1.5f);
        this.i.a(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.j.a(this.n);
        this.j.a(this.k);
        this.n.a(this.m);
        this.k.a(this.i);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.a(f10, f11, f12, f13, f14, f15, x2);
        this.l.b(f15);
        this.j.b(f15);
    }
}

