/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.a9;
import net.minecraft.T.aG;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.b;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class M
extends j {
    public /* synthetic */ c i;
    public /* synthetic */ c k;
    public /* synthetic */ c m;
    public /* synthetic */ c l;
    public /* synthetic */ c p;
    public /* synthetic */ c n;
    public /* synthetic */ c o;
    public /* synthetic */ c q;
    public /* synthetic */ c j;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block10: {
            a9 a92;
            a9 a93;
            block11: {
                a9 a94;
                block12: {
                    int[] arrn;
                    block5: {
                        block6: {
                            block9: {
                                float f16;
                                float f17;
                                block7: {
                                    block8: {
                                        this.j.e = f13 * ((float)Math.PI / 180);
                                        this.j.y = f14 * ((float)Math.PI / 180);
                                        this.i.h = 3.0f;
                                        this.i.u = -1.0f;
                                        this.i.y = -0.75f;
                                        arrn = net.minecraft.client.w.j.b();
                                        this.m.y = net.minecraft.k.h.c(f10 * 0.6662f) * 1.4f * f11 * 0.5f;
                                        this.l.y = net.minecraft.k.h.c(f10 * 0.6662f + (float)Math.PI) * 1.4f * f11 * 0.5f;
                                        this.m.e = 0.0f;
                                        this.l.e = 0.0f;
                                        a93 = a94 = ((aG)x2).a();
                                        a92 = a9.ATTACKING;
                                        if (arrn != null) break block5;
                                        if (a93 != a92) break block6;
                                        f17 = net.minecraft.k.h.g(this.a * (float)Math.PI);
                                        f16 = net.minecraft.k.h.g((1.0f - (1.0f - this.a) * (1.0f - this.a)) * (float)Math.PI);
                                        this.o.r = 0.0f;
                                        this.q.r = 0.0f;
                                        this.o.e = 0.15707964f;
                                        this.q.e = -0.15707964f;
                                        if (arrn != null) break block7;
                                        if (((B)x2).al() != net.minecraft.ar.b.RIGHT) break block8;
                                        this.o.y = -1.8849558f + net.minecraft.k.h.c(f12 * 0.09f) * 0.15f;
                                        this.q.y = -0.0f + net.minecraft.k.h.c(f12 * 0.19f) * 0.5f;
                                        this.o.y += f17 * 2.2f - f16 * 0.4f;
                                        this.q.y += f17 * 1.2f - f16 * 0.4f;
                                        if (arrn == null) break block9;
                                    }
                                    this.o.y = -0.0f + net.minecraft.k.h.c(f12 * 0.19f) * 0.5f;
                                    this.q.y = -1.8849558f + net.minecraft.k.h.c(f12 * 0.09f) * 0.15f;
                                    this.o.y += f17 * 1.2f - f16 * 0.4f;
                                }
                                this.q.y += f17 * 2.2f - f16 * 0.4f;
                            }
                            this.o.r += net.minecraft.k.h.c(f12 * 0.09f) * 0.05f + 0.05f;
                            this.q.r -= net.minecraft.k.h.c(f12 * 0.09f) * 0.05f + 0.05f;
                            this.o.y += net.minecraft.k.h.g(f12 * 0.067f) * 0.05f;
                            this.q.y -= net.minecraft.k.h.g(f12 * 0.067f) * 0.05f;
                            if (arrn == null) break block10;
                        }
                        a93 = a94;
                        a92 = a9.SPELLCASTING;
                    }
                    if (arrn != null) break block11;
                    if (a93 != a92) break block12;
                    this.o.u = 0.0f;
                    this.o.v = -5.0f;
                    this.q.u = 0.0f;
                    this.q.v = 5.0f;
                    this.o.y = net.minecraft.k.h.c(f12 * 0.6662f) * 0.25f;
                    this.q.y = net.minecraft.k.h.c(f12 * 0.6662f) * 0.25f;
                    this.o.r = 2.3561945f;
                    this.q.r = -2.3561945f;
                    this.o.e = 0.0f;
                    this.q.e = 0.0f;
                    if (arrn == null) break block10;
                }
                a93 = a94;
                a92 = a9.BOW_AND_ARROW;
            }
            if (a93 == a92) {
                this.o.e = -0.1f + this.j.e;
                this.o.y = -1.5707964f + this.j.y;
                this.q.y = -0.9424779f + this.j.y;
                this.q.e = this.j.e - 0.4f;
                this.q.r = 1.5707964f;
            }
        }
    }

    public M(float f10, float f11, int n2, int n3) {
        this.j = new c(this).a(n2, n3);
        this.j.a(0.0f, 0.0f + f11, 0.0f);
        this.j.b(0, 0).b(-4.0f, -10.0f, -4.0f, 8, 10, 8, f10);
        this.n = new c(this, 32, 0).a(n2, n3);
        this.n.b(-4.0f, -10.0f, -4.0f, 8, 12, 8, f10 + 0.45f);
        this.j.a(this.n);
        this.n.q = false;
        this.p = new c(this).a(n2, n3);
        this.p.a(0.0f, f11 - 2.0f, 0.0f);
        this.p.b(24, 0).b(-1.0f, -1.0f, -6.0f, 2, 4, 2, f10);
        this.j.a(this.p);
        this.k = new c(this).a(n2, n3);
        this.k.a(0.0f, 0.0f + f11, 0.0f);
        this.k.b(16, 20).b(-4.0f, 0.0f, -3.0f, 8, 12, 6, f10);
        this.k.b(0, 38).b(-4.0f, 0.0f, -3.0f, 8, 18, 6, f10 + 0.5f);
        this.i = new c(this).a(n2, n3);
        this.i.a(0.0f, 0.0f + f11 + 2.0f, 0.0f);
        this.i.b(44, 22).b(-8.0f, -2.0f, -2.0f, 4, 8, 4, f10);
        c c10 = new c(this, 44, 22).a(n2, n3);
        c10.A = true;
        c10.b(4.0f, -2.0f, -2.0f, 4, 8, 4, f10);
        this.i.a(c10);
        this.i.b(40, 38).b(-4.0f, 2.0f, -2.0f, 8, 4, 4, f10);
        this.m = new c(this, 0, 22).a(n2, n3);
        this.m.a(-2.0f, 12.0f + f11, 0.0f);
        this.m.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        this.l = new c(this, 0, 22).a(n2, n3);
        this.l.A = true;
        this.l.a(2.0f, 12.0f + f11, 0.0f);
        this.l.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        this.o = new c(this, 40, 46).a(n2, n3);
        this.o.b(-3.0f, -2.0f, -2.0f, 4, 12, 4, f10);
        this.o.a(-5.0f, 2.0f + f11, 0.0f);
        this.q = new c(this, 40, 46).a(n2, n3);
        this.q.A = true;
        this.q.b(-1.0f, -2.0f, -2.0f, 4, 12, 4, f10);
        this.q.a(5.0f, 2.0f + f11, 0.0f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    this.j.b(f15);
                    this.k.b(f15);
                    this.m.b(f15);
                    this.l.b(f15);
                    int[] arrn2 = arrn;
                    aG aG2 = (aG)x2;
                    if (arrn2 != null) break block2;
                    if (aG2.a() != a9.CROSSED) break block3;
                    this.i.b(f15);
                    if (arrn2 == null) break block4;
                }
                this.o.b(f15);
            }
            this.q.b(f15);
        }
    }

    public c a(b b10) {
        return b10 == net.minecraft.ar.b.LEFT ? this.q : this.o;
    }
}

