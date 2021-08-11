/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.W.bq;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.client.u.av;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class az
extends av {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        block16: {
            az az2;
            block20: {
                double d10;
                int[] arrn;
                block19: {
                    i i2;
                    n n2;
                    block17: {
                        i i3;
                        block18: {
                            boolean bl2;
                            block14: {
                                block15: {
                                    block13: {
                                        int n3;
                                        block12: {
                                            this.q = this.b;
                                            arrn = av.e();
                                            this.t = this.D;
                                            this.f = this.z;
                                            this.n -= (double)this.u;
                                            this.a(this.s, this.n, this.I);
                                            this.s *= (double)0.98f;
                                            this.n *= (double)0.98f;
                                            this.I *= (double)0.98f;
                                            int n4 = this.e;
                                            n3 = n4;
                                            this.e = n4 - 1;
                                            if (arrn != null) {
                                                if (n3 <= 0) {
                                                    this.c();
                                                }
                                                n3 = this.l ? 1 : 0;
                                            }
                                            if (arrn == null) break block12;
                                            if (n3 == 0) break block13;
                                            double d11 = Math.random() - 0.5;
                                            n3 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                        }
                                        if (n3 < 0) {
                                            this.c();
                                        }
                                        this.s *= (double)0.7f;
                                        this.I *= (double)0.7f;
                                    }
                                    n2 = new n(this.b, this.D, this.z);
                                    i3 = this.a.d(n2);
                                    c c10 = i3.o();
                                    bl2 = c10.b();
                                    if (arrn == null) break block14;
                                    if (bl2) break block15;
                                    bl2 = c10.d();
                                    if (arrn == null) break block14;
                                    if (!bl2) break block16;
                                }
                                i2 = i3;
                                if (arrn == null) break block17;
                                bl2 = i2.b() instanceof bq;
                            }
                            if (!bl2) break block18;
                            d10 = 1.0f - bq.a(i3.b(bq.z));
                            if (arrn != null) break block19;
                        }
                        i2 = i3;
                    }
                    d10 = i2.f((t)this.a, (n)n2).a;
                }
                double d12 = (double)net.minecraft.k.h.f(this.D) + d10;
                az2 = this;
                if (arrn == null) break block20;
                if (!(az2.D < d12)) break block16;
                az2 = this;
            }
            az2.c();
        }
    }

    protected az(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.s *= (double)0.3f;
        this.n = Math.random() * (double)0.2f + (double)0.1f;
        this.I *= (double)0.3f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.a(19 + this.y.nextInt(4));
        this.a(0.01f, 0.01f);
        this.u = 0.06f;
        this.e = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
}

