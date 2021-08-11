/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.ar.ay;
import net.minecraft.client.e.s;
import net.minecraft.client.e.t;
import net.minecraft.client.q.c;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.u.E;

public class u
extends t {
    private final /* synthetic */ c o;
    private /* synthetic */ int p;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c() {
        block22: {
            block8: {
                u u2;
                block9: {
                    m[] arrm;
                    block21: {
                        block19: {
                            u u3;
                            block20: {
                                block17: {
                                    block18: {
                                        u u4;
                                        int n2;
                                        int n3;
                                        block15: {
                                            block16: {
                                                block14: {
                                                    block13: {
                                                        block12: {
                                                            u u5;
                                                            block10: {
                                                                block11: {
                                                                    ++this.p;
                                                                    arrm = s.b();
                                                                    u2 = this;
                                                                    if (arrm == null) break block8;
                                                                    if (u2.o.P) break block9;
                                                                    u5 = this;
                                                                    if (arrm == null) break block10;
                                                                    if (u5.p <= 20) break block11;
                                                                    u2 = this;
                                                                    if (arrm == null) break block8;
                                                                    if (!u2.o.aK()) break block9;
                                                                }
                                                                this.b = (float)this.o.a;
                                                                this.h = (float)this.o.aF;
                                                                this.i = (float)this.o.ax;
                                                                u5 = this;
                                                            }
                                                            float f10 = net.minecraft.k.h.e(u5.o.aq * this.o.aq + this.o.d * this.o.d + this.o.G * this.o.G);
                                                            float f11 = f10 / 2.0f;
                                                            if (arrm == null) break block12;
                                                            if (!((double)f10 >= 0.01)) break block13;
                                                            this.e = net.minecraft.k.h.c(f11 * f11, 0.0f, 1.0f);
                                                        }
                                                        if (arrm != null) break block14;
                                                    }
                                                    this.e = 0.0f;
                                                }
                                                n3 = this.p;
                                                n2 = 20;
                                                if (arrm == null) break block15;
                                                if (n3 >= n2) break block16;
                                                this.e = 0.0f;
                                                if (arrm != null) break block17;
                                            }
                                            u4 = this;
                                            if (arrm == null) break block18;
                                            n3 = u4.p;
                                            n2 = 40;
                                        }
                                        if (n3 >= n2) break block17;
                                        u4 = this;
                                    }
                                    u4.e = (float)((double)this.e * ((double)(this.p - 20) / 20.0));
                                }
                                float f12 = 0.8f;
                                u3 = this;
                                if (arrm == null) break block19;
                                if (!(u3.e > 0.8f)) break block20;
                                this.f = 1.0f + (this.e - 0.8f);
                                if (arrm != null) break block21;
                            }
                            u3 = this;
                        }
                        u3.f = 1.0f;
                    }
                    if (arrm != null) break block22;
                }
                u2 = this;
            }
            u2.n = true;
        }
    }

    public u(c c10) {
        super(E.dp, ay.PLAYERS);
        this.o = c10;
        this.c = true;
        this.g = 0;
        this.e = 0.1f;
    }
}

