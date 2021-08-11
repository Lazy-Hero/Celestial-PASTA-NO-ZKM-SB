/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.ar.b;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;

public class r
extends n {
    public /* synthetic */ c z;
    private final /* synthetic */ boolean t;
    private final /* synthetic */ c y;
    public /* synthetic */ c s;
    public /* synthetic */ c v;
    public /* synthetic */ c w;
    public /* synthetic */ c u;
    private final /* synthetic */ c x;

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        this.s.q = bl2;
        this.u.q = bl2;
        this.z.q = bl2;
        this.v.q = bl2;
        this.w.q = bl2;
        this.y.q = bl2;
        this.x.q = bl2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        super.a(f10, f11, f12, f13, f14, f15, x2);
        net.minecraft.client.w.r.a(this.m, this.z);
        net.minecraft.client.w.r.a(this.i, this.v);
        net.minecraft.client.w.r.a(this.k, this.s);
        net.minecraft.client.w.r.a(this.o, this.u);
        net.minecraft.client.w.r.a(this.j, this.w);
    }

    public void a(float f10) {
        this.y.b(f10);
    }

    public void b(float f10) {
        net.minecraft.client.w.r.a(this.n, this.x);
        this.x.v = 0.0f;
        this.x.h = 0.0f;
        this.x.b(f10);
    }

    @Override
    public void a(float f10, b b10) {
        block1: {
            c c10;
            block0: {
                c10 = this.a(b10);
                int[] arrn = net.minecraft.client.w.j.b();
                if (!this.t) break block0;
                float f11 = 0.5f * (float)(b10 == net.minecraft.ar.b.RIGHT ? 1 : -1);
                c10.v += f11;
                c10.a(f10);
                c10.v -= f11;
                if (arrn == null) break block1;
            }
            c10.a(f10);
        }
    }

    public r(float f10, boolean bl2) {
        block4: {
            block2: {
                block3: {
                    super(f10, 0.0f, 64, 64);
                    this.t = bl2;
                    this.x = new c(this, 24, 0);
                    this.x.b(-3.0f, -6.0f, -1.0f, 6, 6, 1, f10);
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.y = new c(this, 0, 0);
                    this.y.a(64, 32);
                    int[] arrn2 = arrn;
                    this.y.b(-5.0f, 0.0f, -1.0f, 10, 16, 1, f10);
                    if (arrn2 != null) break block2;
                    if (!bl2) break block3;
                    this.k = new c(this, 32, 48);
                    this.k.b(-1.0f, -2.0f, -2.0f, 3, 12, 4, f10);
                    this.k.a(5.0f, 2.5f, 0.0f);
                    this.o = new c(this, 40, 16);
                    this.o.b(-2.0f, -2.0f, -2.0f, 3, 12, 4, f10);
                    this.o.a(-5.0f, 2.5f, 0.0f);
                    this.s = new c(this, 48, 48);
                    this.s.b(-1.0f, -2.0f, -2.0f, 3, 12, 4, f10 + 0.25f);
                    this.s.a(5.0f, 2.5f, 0.0f);
                    this.u = new c(this, 40, 32);
                    this.u.b(-2.0f, -2.0f, -2.0f, 3, 12, 4, f10 + 0.25f);
                    this.u.a(-5.0f, 2.5f, 10.0f);
                    if (arrn2 == null) break block4;
                }
                this.k = new c(this, 32, 48);
                this.k.b(-1.0f, -2.0f, -2.0f, 4, 12, 4, f10);
                this.k.a(5.0f, 2.0f, 0.0f);
                this.s = new c(this, 48, 48);
                this.s.b(-1.0f, -2.0f, -2.0f, 4, 12, 4, f10 + 0.25f);
                this.s.a(5.0f, 2.0f, 0.0f);
                this.u = new c(this, 40, 32);
                this.u.b(-3.0f, -2.0f, -2.0f, 4, 12, 4, f10 + 0.25f);
            }
            this.u.a(-5.0f, 2.0f, 10.0f);
        }
        this.m = new c(this, 16, 48);
        this.m.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        this.m.a(1.9f, 12.0f, 0.0f);
        this.z = new c(this, 0, 48);
        this.z.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10 + 0.25f);
        this.z.a(1.9f, 12.0f, 0.0f);
        this.v = new c(this, 0, 32);
        this.v.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10 + 0.25f);
        this.v.a(-1.9f, 12.0f, 0.0f);
        this.w = new c(this, 16, 32);
        this.w.b(-4.0f, 0.0f, -2.0f, 8, 12, 4, f10 + 0.25f);
        this.w.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block6: {
            boolean bl2;
            block4: {
                block5: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    super.b(x2, f10, f11, f12, f13, f14, f15);
                    int[] arrn2 = arrn;
                    net.minecraft.client.a.v.M();
                    bl2 = this.h;
                    if (arrn2 != null) break block4;
                    if (!bl2) break block5;
                    float f16 = 2.0f;
                    net.minecraft.client.a.v.d(0.5f, 0.5f, 0.5f);
                    net.minecraft.client.a.v.b(0.0f, 24.0f * f15, 0.0f);
                    this.z.b(f15);
                    this.v.b(f15);
                    this.s.b(f15);
                    this.u.b(f15);
                    this.w.b(f15);
                    if (arrn2 == null) break block6;
                }
                bl2 = x2.a4();
            }
            if (bl2) {
                net.minecraft.client.a.v.b(0.0f, 0.2f, 0.0f);
            }
            this.z.b(f15);
            this.v.b(f15);
            this.s.b(f15);
            this.u.b(f15);
            this.w.b(f15);
        }
        net.minecraft.client.a.v.B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

