/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.V;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class ae
extends j {
    /* synthetic */ c k;
    public /* synthetic */ c j;
    /* synthetic */ c l;
    public /* synthetic */ c n;
    public /* synthetic */ c m;
    public /* synthetic */ c p;
    public /* synthetic */ c i;
    public /* synthetic */ c o;

    public ae() {
        float f10 = 0.0f;
        float f11 = 13.5f;
        this.m = new c(this, 0, 0);
        this.m.b(-2.0f, -3.0f, -2.0f, 6, 6, 4, 0.0f);
        this.m.a(-1.0f, 13.5f, -7.0f);
        this.p = new c(this, 18, 14);
        this.p.b(-3.0f, -2.0f, -3.0f, 6, 9, 6, 0.0f);
        this.p.a(0.0f, 14.0f, 2.0f);
        this.l = new c(this, 21, 0);
        this.l.b(-3.0f, -3.0f, -3.0f, 8, 6, 7, 0.0f);
        this.l.a(-1.0f, 14.0f, 2.0f);
        this.o = new c(this, 0, 18);
        this.o.b(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.o.a(-2.5f, 16.0f, 7.0f);
        this.n = new c(this, 0, 18);
        this.n.b(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.n.a(0.5f, 16.0f, 7.0f);
        this.j = new c(this, 0, 18);
        this.j.b(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.j.a(-2.5f, 16.0f, -4.0f);
        this.i = new c(this, 0, 18);
        this.i.b(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.i.a(0.5f, 16.0f, -4.0f);
        this.k = new c(this, 9, 18);
        this.k.b(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.k.a(-1.0f, 12.0f, 8.0f);
        this.m.b(16, 14).b(-2.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.m.b(16, 14).b(2.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.m.b(0, 10).b(-0.5f, 0.0f, -5.0f, 3, 3, 4, 0.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        this.m.y = f14 * ((float)Math.PI / 180);
        this.m.e = f13 * ((float)Math.PI / 180);
        this.k.y = f12;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            ae ae2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    super.b(x2, f10, f11, f12, f13, f14, f15);
                    int[] arrn2 = arrn;
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    ae2 = this;
                    if (arrn2 != null) break block2;
                    if (!ae2.h) break block3;
                    float f16 = 2.0f;
                    v.M();
                    v.b(0.0f, 5.0f * f15, 2.0f * f15);
                    this.m.d(f15);
                    v.B();
                    v.M();
                    v.d(0.5f, 0.5f, 0.5f);
                    v.b(0.0f, 24.0f * f15, 0.0f);
                    this.p.b(f15);
                    this.o.b(f15);
                    this.n.b(f15);
                    this.j.b(f15);
                    this.i.b(f15);
                    this.k.d(f15);
                    this.l.b(f15);
                    v.B();
                    if (arrn2 == null) break block4;
                }
                this.m.d(f15);
                this.p.b(f15);
                this.o.b(f15);
                this.n.b(f15);
                this.j.b(f15);
                this.i.b(f15);
                this.k.d(f15);
                ae2 = this;
            }
            ae2.l.b(f15);
        }
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        V v2;
        block8: {
            block7: {
                int[] arrn;
                block6: {
                    block5: {
                        block4: {
                            v2 = (V)b10;
                            arrn = net.minecraft.client.w.j.b();
                            if (arrn != null) break block4;
                            if (!v2.H()) break block5;
                            this.k.e = 0.0f;
                        }
                        if (arrn == null) break block6;
                    }
                    this.k.e = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
                }
                if (!v2.D()) break block7;
                this.l.a(-1.0f, 16.0f, -3.0f);
                this.l.y = 1.2566371f;
                this.l.e = 0.0f;
                this.p.a(0.0f, 18.0f, 0.0f);
                this.p.y = 0.7853982f;
                this.k.a(-1.0f, 21.0f, 6.0f);
                this.o.a(-2.5f, 22.0f, 2.0f);
                this.o.y = 4.712389f;
                this.n.a(0.5f, 22.0f, 2.0f);
                this.n.y = 4.712389f;
                this.j.y = 5.811947f;
                this.j.a(-2.49f, 17.0f, -4.0f);
                this.i.y = 5.811947f;
                this.i.a(0.51f, 17.0f, -4.0f);
                if (arrn == null) break block8;
            }
            this.p.a(0.0f, 14.0f, 2.0f);
            this.p.y = 1.5707964f;
            this.l.a(-1.0f, 14.0f, -3.0f);
            this.l.y = this.p.y;
            this.k.a(-1.0f, 12.0f, 8.0f);
            this.o.a(-2.5f, 16.0f, 7.0f);
            this.n.a(0.5f, 16.0f, 7.0f);
            this.j.a(-2.5f, 16.0f, -4.0f);
            this.i.a(0.5f, 16.0f, -4.0f);
            this.o.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
            this.n.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
            this.j.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11;
            this.i.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11;
        }
        this.m.r = v2.b(f12) + v2.b(f12, 0.0f);
        this.l.r = v2.b(f12, -0.08f);
        this.p.r = v2.b(f12, -0.16f);
        this.k.r = v2.b(f12, -0.2f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

