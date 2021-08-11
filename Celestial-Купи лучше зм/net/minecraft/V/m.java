/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.v;

import net.minecraft.U.x;
import net.minecraft.h.d;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.v.b;
import net.minecraft.v.c;
import net.minecraft.v.j;

public class m
extends j {
    private /* synthetic */ int a;

    public b<m> b() {
        return b.h;
    }

    @Override
    public void h() {
        block11: {
            net.minecraft.i.j j2;
            block16: {
                m m2;
                int[] arrn;
                block15: {
                    block8: {
                        block14: {
                            float f10;
                            block13: {
                                float f11;
                                block12: {
                                    block10: {
                                        m m3;
                                        block9: {
                                            ++this.a;
                                            j2 = this.c.aG.a((x)this.c, 20.0, 10.0);
                                            arrn = net.minecraft.v.c.b();
                                            if (j2 == null) break block8;
                                            m3 = this;
                                            if (arrn != null) break block9;
                                            if (m3.a <= 25) break block10;
                                            m3 = this;
                                        }
                                        m3.c.d().b(b.l);
                                        if (arrn == null) break block11;
                                    }
                                    l l2 = new l(j2.a - this.c.a, 0.0, j2.ax - this.c.ax).d();
                                    l l3 = new l(h.g(this.c.e * ((float)Math.PI / 180)), 0.0, -h.c(this.c.e * ((float)Math.PI / 180))).d();
                                    float f12 = (float)l3.g(l2);
                                    float f13 = (float)(Math.acos(f12) * 57.29577951308232) + 0.5f;
                                    float f14 = f13 - 0.0f;
                                    f11 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                    if (arrn != null) break block12;
                                    if (f11 < 0) break block13;
                                    float f15 = f13 - 10.0f;
                                    f11 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                }
                                if (f11 <= 0) break block14;
                            }
                            double d10 = j2.a - this.c.cO.a;
                            double d11 = j2.ax - this.c.cO.ax;
                            double d12 = h.b(h.b(180.0 - h.a(d10, d11) * 57.29577951308232 - (double)this.c.e), -100.0, 100.0);
                            this.c.bT *= 0.8f;
                            float f16 = f10 = h.e(d10 * d10 + d11 * d11) + 1.0f;
                            if (arrn == null) {
                                if (f10 > 40.0f) {
                                    f10 = 40.0f;
                                }
                                this.c.bT = (float)((double)this.c.bT + d12 * (double)(0.7f / f10 / f16));
                            }
                            this.c.e += this.c.bT;
                        }
                        if (arrn == null) break block11;
                    }
                    m2 = this;
                    if (arrn != null) break block15;
                    if (m2.a < 100) break block11;
                    j2 = this.c.aG.a((x)this.c, 150.0, 150.0);
                    m2 = this;
                }
                m2.c.d().b(b.k);
                if (arrn != null) break block16;
                if (j2 == null) break block11;
                this.c.d().b(b.i);
            }
            this.c.d().a(b.i).a(new l(j2.a, j2.aF, j2.ax));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c() {
        this.a = 0;
    }

    public m(d d10) {
        super(d10);
    }
}

