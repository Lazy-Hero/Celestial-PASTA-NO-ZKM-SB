/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.J.q;
import net.minecraft.W.b1;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.au.h;
import net.minecraft.k.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class U
extends k {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public t<d> a(z var1_1, net.minecraft.i.j var2_2, a3 var3_3) {
        block12: {
            block11: {
                var5_4 = var2_2.c(var3_3);
                var6_5 = this.a(var1_1, var2_2, false);
                var4_6 = bl.c();
                if (var4_6 != 0) ** GOTO lbl12
                if (var6_5 != null && var6_5.d == j.BLOCK) {
                    v0 = var1_1;
                    if (var4_6 == 0) {
                        if (v0.d(var6_5.a()).b() == g.ad) {
                            return new t<d>(aX.PASS, var5_4);
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    var2_2.a(var3_3);
lbl12:
                    // 2 sources

                    v0 = var1_1;
                }
                if (var4_6 == 0) {
                    if (v0.C != false) return new t<d>(aX.SUCCESS, var5_4);
                    v0 = var1_1;
                }
                if ((var7_7 = ((A)v0).a().a(var1_1, "Stronghold", new n(var2_2), false)) == null) return new t<d>(aX.SUCCESS, var5_4);
                var8_8 = new q(var1_1, var2_2.a, var2_2.aF + (double)(var2_2.aD / 2.0f), var2_2.ax);
                var8_8.b(var7_7);
                var1_1.f(var8_8);
                v1 = var2_2 instanceof net.minecraft.i.k;
                if (var4_6 != 0) break block11;
                if (v1) {
                    a6.k.a((net.minecraft.i.k)var2_2, var7_7);
                }
                var1_1.a(null, var2_2.a, var2_2.aF, var2_2.ax, E.dy, ay.NEUTRAL, 0.5f, 0.4f / (U.r.nextFloat() * 0.4f + 0.8f));
                var1_1.a(null, 1003, new n(var2_2), 0);
                v2 = var2_2;
                if (var4_6 != 0) break block12;
                v1 = v2.cw.g;
            }
            if (!v1) {
                var5_4.b(1);
            }
            v2 = var2_2;
        }
        v2.b(m.b(this));
        return new t<d>(aX.SUCCESS, var5_4);
    }

    @Override
    public aX a(net.minecraft.i.j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block11: {
            block9: {
                h h2;
                int n3;
                block14: {
                    h h3;
                    block8: {
                        int n4;
                        int n5;
                        d d10;
                        i i2;
                        block13: {
                            i i3;
                            block12: {
                                i2 = z2.d(n2);
                                d10 = j2.c(a32);
                                n3 = bl.g();
                                if (!j2.a(n2.a(aA2), aA2, d10)) break block11;
                                i3 = i2;
                                if (n3 == 0) break block12;
                                if (i3.b() != g.ad) break block11;
                                i3 = i2;
                            }
                            n5 = i3.b(b1.A).booleanValue();
                            if (n3 == 0) break block13;
                            if (n5 != 0) break block11;
                            n5 = z2.C;
                        }
                        if (n3 != 0) {
                            if (n5 != 0) {
                                return aX.SUCCESS;
                            }
                            z2.a(n2, i2.a(b1.A, true), 2);
                            z2.b(n2, g.ad);
                            d10.b(1);
                            n5 = n4 = 0;
                        }
                        while (n4 < 16) {
                            double d11 = (float)n2.e() + (5.0f + r.nextFloat() * 6.0f) / 16.0f;
                            double d12 = (float)n2.b() + 0.8125f;
                            double d13 = (float)n2.a() + (5.0f + r.nextFloat() * 6.0f) / 16.0f;
                            double d14 = 0.0;
                            double d15 = 0.0;
                            double d16 = 0.0;
                            z2.a(aH.SMOKE_NORMAL, d11, d12, d13, 0.0, 0.0, 0.0, new int[0]);
                            ++n4;
                            if (n3 != 0) {
                                if (n3 != 0) continue;
                            }
                            break block8;
                        }
                        z2.a(null, n2, E.c0, ay.BLOCKS, 1.0f, 1.0f);
                    }
                    h2 = h3 = b1.a().a(z2, n2);
                    if (n3 == 0) break block14;
                    if (h2 == null) break block9;
                    h2 = h3;
                }
                n n6 = h2.b().a(-3, 0, -3);
                int n7 = 0;
                while (n7 < 3) {
                    block10: {
                        if (n3 == 0) break block9;
                        for (int i4 = 0; i4 < 3; ++i4) {
                            z2.a(n6.a(n7, 0, i4), g.df.d(), 2);
                            if (n3 != 0) {
                                if (n3 != 0) continue;
                            }
                            break block10;
                        }
                        ++n7;
                    }
                    if (n3 != 0) continue;
                }
                z2.a(1038, n6.a(1, 0, 1), 0);
            }
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public U() {
        this.a(net.minecraft.ad.a.n);
    }
}

