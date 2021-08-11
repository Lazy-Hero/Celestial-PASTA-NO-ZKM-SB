/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.V;
import net.minecraft.W.K;
import net.minecraft.W.aL;
import net.minecraft.W.ac;
import net.minecraft.W.cU;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.client.F.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.d;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.j.j;
import net.minecraft.client.y.b;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class p
extends f<V> {
    private final /* synthetic */ d a;

    private boolean a(n n2, i i2, I i3, z z2, boolean bl2) {
        return this.a.a().a((t)z2, this.a.a(i2), i2, n2, i3, bl2);
    }

    @Override
    public void a(V v2, double d10, double d11, double d12, float f10, int n2, float f11) {
        block7: {
            I i2;
            W w2;
            block13: {
                int n3;
                z z2;
                i i3;
                n n4;
                block14: {
                    K k2;
                    String[] arrstring;
                    block12: {
                        block11: {
                            block10: {
                                int n5;
                                block8: {
                                    block9: {
                                        n4 = v2.j();
                                        arrstring = net.minecraft.client.F.f.b();
                                        i3 = v2.e();
                                        k2 = i3.b();
                                        if (i3.o() == net.minecraft.ac.c.A || !(v2.d(f10) < 1.0f)) break block7;
                                        w2 = W.c();
                                        i2 = w2.b();
                                        this.b(j.x);
                                        a0.a();
                                        v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                                        v.a();
                                        v.E();
                                        n5 = Q.at();
                                        if (arrstring == null) break block8;
                                        if (n5 == 0) break block9;
                                        v.g(7425);
                                        if (arrstring != null) break block10;
                                    }
                                    n5 = 7424;
                                }
                                v.g(n5);
                            }
                            i2.a(7, b.s);
                            i2.a(d10 - (double)n4.e() + (double)v2.b(f10), d11 - (double)n4.b() + (double)v2.a(f10), d12 - (double)n4.a() + (double)v2.c(f10));
                            z2 = this.c();
                            if (k2 != g.bi) break block11;
                            float f12 = v2.d(f10) - 0.25f;
                            n3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (arrstring == null) break block12;
                            if (n3 > 0) break block11;
                            i3 = i3.a(ac.M, true);
                            this.a(n4, i3, i2, z2, true);
                            if (arrstring != null) break block13;
                        }
                        n3 = v2.b();
                    }
                    if (arrstring == null) break block13;
                    if (n3 == 0) break block14;
                    n3 = v2.c() ? 1 : 0;
                    if (arrstring == null) break block13;
                    if (n3 != 0) break block14;
                    cU cU2 = k2 == g.M ? cU.STICKY : cU.DEFAULT;
                    i i4 = g.bi.d().a(ac.B, cU2).a(ac.z, i3.b(aL.z));
                    float f14 = v2.d(f10) - 0.5f;
                    f14 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (arrstring != null) {
                        f14 = f14 >= 0 ? 1.0f : 0.0f;
                    }
                    i4 = i4.a(ac.M, (boolean)f14);
                    this.a(n4, i4, i2, z2, true);
                    i2.a(d10 - (double)n4.e(), d11 - (double)n4.b(), d12 - (double)n4.a());
                    i3 = i3.a(aL.A, true);
                    this.a(n4, i3, i2, z2, true);
                    if (arrstring != null) break block13;
                }
                n3 = this.a(n4, i3, i2, z2, false) ? 1 : 0;
            }
            i2.a(0.0, 0.0, 0.0);
            w2.a();
            a0.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p() {
        this.a = Q.P().W();
    }
}

