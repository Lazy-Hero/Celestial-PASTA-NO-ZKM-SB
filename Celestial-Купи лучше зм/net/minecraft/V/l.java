/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.v;

import net.minecraft.U.y;
import net.minecraft.ar.aH;
import net.minecraft.h.d;
import net.minecraft.k.h;
import net.minecraft.k.o;
import net.minecraft.v.b;
import net.minecraft.v.c;
import net.minecraft.v.j;

public class l
extends j {
    private /* synthetic */ int d;
    private /* synthetic */ int a;
    private /* synthetic */ y e;

    public b<l> b() {
        return b.f;
    }

    @Override
    public void d() {
        block3: {
            y y2;
            block2: {
                int[] arrn = net.minecraft.v.c.b();
                y2 = this.e;
                if (arrn != null) break block2;
                if (y2 == null) break block3;
                y2 = this.e;
            }
            y2.a();
            this.e = null;
        }
    }

    @Override
    public void c() {
        this.a = 0;
        ++this.d;
    }

    public void b() {
        this.d = 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void h() {
        block10: {
            int n2;
            int n3;
            int[] arrn;
            block6: {
                block7: {
                    l l2;
                    block8: {
                        block9: {
                            arrn = net.minecraft.v.c.b();
                            n3 = ++this.a;
                            n2 = 200;
                            if (arrn != null) break block6;
                            if (n3 < n2) break block7;
                            l2 = this;
                            if (arrn != null) break block8;
                            if (l2.d < 4) break block9;
                            this.c.d().b(b.k);
                            if (arrn == null) break block10;
                        }
                        l2 = this;
                    }
                    l2.c.d().b(b.h);
                    if (arrn == null) break block10;
                }
                n3 = this.a;
                n2 = 10;
            }
            if (n3 == n2) {
                block5: {
                    net.minecraft.k.l l3 = new net.minecraft.k.l(this.c.cO.a - this.c.a, 0.0, this.c.cO.ax - this.c.ax).d();
                    float f10 = 5.0f;
                    double d10 = this.c.cO.a + l3.e * 5.0 / 2.0;
                    double d11 = this.c.cO.ax + l3.b * 5.0 / 2.0;
                    double d12 = this.c.cO.aF + (double)(this.c.cO.aD / 2.0f);
                    o o2 = new o(h.f(d10), h.f(d12), h.f(d11));
                    while (this.c.aG.a(o2)) {
                        o2.a(h.f(d10), h.f(d12 -= 1.0), h.f(d11));
                        if (arrn == null) {
                            if (arrn == null) continue;
                        }
                        break block5;
                    }
                    d12 = h.f(d12) + 1;
                    this.e = new y(this.c.aG, d10, d12, d11);
                    this.e.b(this.c);
                    this.e.d(5.0f);
                    this.e.a(200);
                    this.e.a(aH.DRAGON_BREATH);
                    this.e.a(new net.minecraft.K.j(net.minecraft.u.c.o));
                }
                this.c.aG.f(this.e);
            }
        }
    }

    public l(d d10) {
        super(d10);
    }

    @Override
    public void a() {
        block6: {
            l l2;
            int[] arrn;
            block7: {
                int n2;
                block5: {
                    ++this.a;
                    arrn = net.minecraft.v.c.b();
                    n2 = this.a % 2;
                    if (arrn != null) break block5;
                    if (n2 != 0) break block6;
                    l2 = this;
                    if (arrn != null) break block7;
                    n2 = l2.a;
                }
                if (n2 >= 10) break block6;
                l2 = this;
            }
            net.minecraft.k.l l3 = l2.c.d(1.0f).d();
            l3.b(-0.7853982f);
            double d10 = this.c.cO.a;
            double d11 = this.c.cO.aF + (double)(this.c.cO.aD / 2.0f);
            double d12 = this.c.cO.ax;
            int n3 = 0;
            while (n3 < 8) {
                block4: {
                    double d13 = d10 + this.c.f().nextGaussian() / 2.0;
                    double d14 = d11 + this.c.f().nextGaussian() / 2.0;
                    double d15 = d12 + this.c.f().nextGaussian() / 2.0;
                    for (int i2 = 0; i2 < 6; ++i2) {
                        this.c.aG.a(aH.DRAGON_BREATH, d13, d14, d15, -l3.e * (double)0.08f * (double)i2, -l3.d * (double)0.6f, -l3.b * (double)0.08f * (double)i2, new int[0]);
                        if (arrn == null) {
                            if (arrn == null) continue;
                        }
                        break block4;
                    }
                    l3.b(0.19634955f);
                    ++n3;
                }
                if (arrn == null) continue;
            }
        }
    }
}

