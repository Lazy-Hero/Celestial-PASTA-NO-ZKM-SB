/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.client.q.c;
import net.minecraft.client.y.b;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class e
implements g {
    private final /* synthetic */ Q a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public e(Q q2) {
        this.a = q2;
    }

    @Override
    public void a(float f10, long l2) {
        block15: {
            c c10 = this.a.s;
            int n2 = f.b();
            double d10 = c10.am + (c10.a - c10.am) * (double)f10;
            double d11 = c10.af + (c10.aF - c10.af) * (double)f10;
            double d12 = c10.n + (c10.ax - c10.n) * (double)f10;
            z z2 = this.a.s.aG;
            Iterable<n> iterable = n.b(h.f(c10.a - 6.0), h.f(c10.aF - 6.0), h.f(c10.ax - 6.0), h.f(c10.a + 6.0), h.f(c10.aF + 6.0), h.f(c10.ax + 6.0));
            v.a();
            int n3 = n2;
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            v.d(2.0f);
            v.L();
            v.a(false);
            for (n n4 : iterable) {
                block17: {
                    I i2;
                    W w2;
                    i i3;
                    i i4;
                    block16: {
                        i4 = z2.d(n4);
                        if (n3 != 0) break block15;
                        i3 = i4;
                        if (n3 != 0) break block16;
                        if (i3.b() == net.minecraft.u.g.bf) break block17;
                        i3 = i4;
                    }
                    k k2 = i3.a(z2, n4).a(0.002).c(-d10, -d11, -d12);
                    double d13 = k2.e;
                    double d14 = k2.b;
                    double d15 = k2.d;
                    double d16 = k2.f;
                    double d17 = k2.a;
                    double d18 = k2.g;
                    float f11 = 1.0f;
                    float f12 = 0.0f;
                    float f13 = 0.0f;
                    float f14 = 0.5f;
                    d d19 = i4.c(z2, n4, aA.WEST);
                    d d20 = d.SOLID;
                    if (n3 == 0) {
                        if (d19 == d20) {
                            w2 = W.c();
                            i2 = w2.b();
                            i2.a(5, b.i);
                            i2.c(d13, d14, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d14, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d17, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d17, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            w2.a();
                        }
                        d19 = i4.c(z2, n4, aA.SOUTH);
                        d20 = d.SOLID;
                    }
                    if (n3 == 0) {
                        if (d19 == d20) {
                            w2 = W.c();
                            i2 = w2.b();
                            i2.a(5, b.i);
                            i2.c(d13, d17, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d14, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d17, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d14, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            w2.a();
                        }
                        d19 = i4.c(z2, n4, aA.EAST);
                        d20 = d.SOLID;
                    }
                    if (n3 == 0) {
                        if (d19 == d20) {
                            w2 = W.c();
                            i2 = w2.b();
                            i2.a(5, b.i);
                            i2.c(d16, d14, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d14, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d17, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d17, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            w2.a();
                        }
                        d19 = i4.c(z2, n4, aA.NORTH);
                        d20 = d.SOLID;
                    }
                    if (n3 == 0) {
                        if (d19 == d20) {
                            w2 = W.c();
                            i2 = w2.b();
                            i2.a(5, b.i);
                            i2.c(d16, d17, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d14, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d17, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d14, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            w2.a();
                        }
                        d19 = i4.c(z2, n4, aA.DOWN);
                        d20 = d.SOLID;
                    }
                    if (n3 == 0) {
                        if (d19 == d20) {
                            w2 = W.c();
                            i2 = w2.b();
                            i2.a(5, b.i);
                            i2.c(d13, d14, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d14, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d13, d14, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            i2.c(d16, d14, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                            w2.a();
                        }
                        d19 = i4.c(z2, n4, aA.UP);
                        d20 = d.SOLID;
                    }
                    if (d19 == d20) {
                        w2 = W.c();
                        i2 = w2.b();
                        i2.a(5, b.i);
                        i2.c(d13, d17, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                        i2.c(d13, d17, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                        i2.c(d16, d17, d15).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                        i2.c(d16, d17, d18).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                        w2.a();
                    }
                }
                if (n3 == 0) continue;
            }
            v.a(true);
            v.x();
            v.f();
        }
    }
}

