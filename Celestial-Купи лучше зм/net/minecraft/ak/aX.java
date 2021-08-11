/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.B.b;
import net.minecraft.J.t;
import net.minecraft.ag.W;
import net.minecraft.ak.a7;
import net.minecraft.ak.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class aX
extends a7 {
    private final /* synthetic */ W j;
    private /* synthetic */ int i;

    @Override
    public void a() {
        block4: {
            block2: {
                aX aX2;
                block3: {
                    String string = net.minecraft.ak.h.h();
                    super.a();
                    String string2 = string;
                    aX2 = this;
                    if (string2 != null) break block2;
                    if (!aX2.j.E()) break block3;
                    aX2 = this;
                    if (string2 != null) break block2;
                    if (!(aX2.c instanceof W)) break block3;
                    aX2 = this;
                    if (string2 != null) break block2;
                    if (!((W)aX2.c).U()) break block3;
                    this.i = 10;
                    if (string2 == null) break block4;
                }
                aX2 = this;
            }
            aX2.i = 0;
        }
    }

    public aX(W w2) {
        super(w2, W.class, 3.0f, 0.02f);
        this.j = w2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block10: {
            aX aX2;
            String string;
            block11: {
                int n2;
                block9: {
                    String string2 = net.minecraft.ak.h.h();
                    super.b();
                    string = string2;
                    n2 = this.i--;
                    if (string != null) break block9;
                    if (n2 <= 0) break block10;
                    aX2 = this;
                    if (string != null) break block11;
                    n2 = aX2.i;
                }
                if (n2 != 0) break block10;
                aX2 = this;
            }
            b b10 = aX2.j.b();
            for (int i2 = 0; i2 < b10.e(); ++i2) {
                int n3;
                d d10;
                block12: {
                    block13: {
                        block22: {
                            d d11;
                            block21: {
                                int n4;
                                k k2;
                                k k3;
                                block18: {
                                    k k4;
                                    block19: {
                                        int n5;
                                        int n6;
                                        block20: {
                                            block15: {
                                                block17: {
                                                    block16: {
                                                        block14: {
                                                            d11 = b10.a(i2);
                                                            d10 = net.minecraft.w.d.m;
                                                            n3 = d11.G();
                                                            if (string != null) break block12;
                                                            if (n3 != 0) break block13;
                                                            k k2 = k4 = d11.w();
                                                            k2 = net.minecraft.u.h.cG;
                                                            if (string != null) break block14;
                                                            if (k3 == k2) break block15;
                                                            k k2 = k4;
                                                            k2 = net.minecraft.u.h.f;
                                                        }
                                                        if (string != null) break block16;
                                                        if (k3 == k2) break block15;
                                                        k k2 = k4;
                                                        k2 = net.minecraft.u.h.aG;
                                                    }
                                                    if (string != null) break block17;
                                                    if (k3 == k2) break block15;
                                                    k k2 = k4;
                                                    k2 = net.minecraft.u.h.b;
                                                }
                                                if (string != null) break block18;
                                                if (k3 != k2) break block19;
                                            }
                                            int n5 = d11.t();
                                            n5 = 3;
                                            if (string != null) break block20;
                                            if (n6 <= n5) break block19;
                                            int n5 = d11.t();
                                            n5 = 2;
                                        }
                                        n4 = n6 / n5;
                                        d11.b(n4);
                                        d10 = new d(k4, n4, d11.d());
                                        if (string == null) break block21;
                                    }
                                    k k2 = k4;
                                    k2 = net.minecraft.u.h.b1;
                                }
                                if (k3 != k2) break block21;
                                n3 = d11.t();
                                if (string != null) break block22;
                                if (n3 > 5) {
                                    n4 = d11.t() / 2 / 3 * 3;
                                    int n7 = n4 / 3;
                                    d11.b(n4);
                                    d10 = new d(net.minecraft.u.h.cG, n7, 0);
                                }
                            }
                            n3 = d11.G() ? 1 : 0;
                        }
                        if (string != null) break block12;
                        if (n3 != 0) {
                            b10.a(i2, net.minecraft.w.d.m);
                        }
                    }
                    n3 = d10.G();
                }
                if (n3 != 0) continue;
                double d12 = this.j.aF - (double)0.3f + (double)this.j.l();
                t t2 = new t(this.j.aG, this.j.a, d12, this.j.ax, d10);
                float f10 = 0.3f;
                float f11 = this.j.a1;
                float f12 = this.j.at;
                t2.aq = -net.minecraft.k.h.g(f11 * ((float)Math.PI / 180)) * net.minecraft.k.h.c(f12 * ((float)Math.PI / 180)) * 0.3f;
                t2.d = net.minecraft.k.h.c(f11 * ((float)Math.PI / 180)) * net.minecraft.k.h.c(f12 * ((float)Math.PI / 180)) * 0.3f;
                t2.G = -net.minecraft.k.h.g(f12 * ((float)Math.PI / 180)) * 0.3f + 0.1f;
                t2.b();
                this.j.aG.f(t2);
                if (string == null) break;
                if (string == null) continue;
                break;
            }
        }
    }
}

