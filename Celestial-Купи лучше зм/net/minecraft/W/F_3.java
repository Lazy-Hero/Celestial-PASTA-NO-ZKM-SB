/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.J.g;
import net.minecraft.J.o;
import net.minecraft.U.x;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.k.h;
import net.minecraft.k.j;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class F
extends k {
    private final /* synthetic */ g s;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public t<d> a(z var1_1, net.minecraft.i.j var2_2, a3 var3_3) {
        block22: {
            block21: {
                block20: {
                    block17: {
                        var5_4 = var2_2.c(var3_3);
                        var6_5 = 1.0f;
                        var7_6 = var2_2.E + (var2_2.at - var2_2.E) * 1.0f;
                        var8_7 = var2_2.ak + (var2_2.e - var2_2.ak) * 1.0f;
                        var9_8 = var2_2.N + (var2_2.a - var2_2.N) * 1.0;
                        var11_9 = var2_2.L + (var2_2.aF - var2_2.L) * 1.0 + (double)var2_2.l();
                        var4_10 = bl.c();
                        var13_11 = var2_2.k + (var2_2.ax - var2_2.k) * 1.0;
                        var15_12 = new l(var9_8, var11_9, var13_11);
                        var16_13 = net.minecraft.k.h.c(-var8_7 * 0.017453292f - 3.1415927f);
                        var17_14 = net.minecraft.k.h.g(-var8_7 * 0.017453292f - 3.1415927f);
                        var18_15 = -net.minecraft.k.h.c(-var7_6 * 0.017453292f);
                        var19_16 = net.minecraft.k.h.g(-var7_6 * 0.017453292f);
                        var20_17 = var17_14 * var18_15;
                        var21_18 = var16_13 * var18_15;
                        var22_19 = 5.0;
                        var24_20 = var15_12.c((double)var20_17 * 5.0, (double)var19_16 * 5.0, (double)var21_18 * 5.0);
                        var25_21 = var1_1.a(var15_12, var24_20, true);
                        if (var25_21 == null) {
                            return new t<d>(aX.PASS, var5_4);
                        }
                        var26_22 = var2_2.b(1.0f);
                        var27_23 = false;
                        var28_24 = var1_1.b((x)var2_2, var2_2.m().d(var26_22.e * 5.0, var26_22.d * 5.0, var26_22.b * 5.0).a(1.0));
                        var29_25 = 0;
                        while (var29_25 < var28_24.size()) {
                            block18: {
                                block19: {
                                    var30_27 = var28_24.get(var29_25);
                                    if (var4_10 != 0) break block18;
                                    v0 = var30_27.M();
                                    if (var4_10 != 0) break block17;
                                    if (!v0) break block19;
                                    var31_29 = var30_27.m().a(var30_27.aw());
                                    if (var4_10 != 0) break block18;
                                    if (var31_29.b(var15_12)) {
                                        var27_23 = true;
                                    }
                                }
                                ++var29_25;
                            }
                            if (var4_10 == 0) continue;
                        }
                        v0 = var27_23;
                    }
                    if (v0) {
                        return new t<d>(aX.PASS, var5_4);
                    }
                    if (var25_21.d != j.BLOCK) {
                        return new t<d>(aX.PASS, var5_4);
                    }
                    v1 = var29_26 = var1_1.d(var25_21.a()).b();
                    if (var4_10 != 0) break block20;
                    if (v1 == net.minecraft.u.g.bQ) ** GOTO lbl-1000
                    v1 = var29_26;
                }
                if (v1 == net.minecraft.u.g.cL) lbl-1000:
                // 2 sources

                {
                    v2 = true;
                } else {
                    v2 = false;
                }
                var30_28 = v2;
                var31_29 = new o(var1_1, var25_21.c.e, var30_28 != false ? var25_21.c.d - 0.12 : var25_21.c.d, var25_21.c.b);
                var31_29.a(this.s);
                var31_29.e = var2_2.e;
                v3 = var1_1.a((x)var31_29, var31_29.m().a(-0.1)).isEmpty();
                if (var4_10 == 0) {
                    if (!v3) {
                        return new t<d>(aX.FAIL, var5_4);
                    }
                    v3 = var1_1.C;
                }
                if (var4_10 != 0) break block21;
                if (!v3) {
                    var1_1.f((x)var31_29);
                }
                v4 = var2_2;
                if (var4_10 != 0) break block22;
                v3 = v4.cw.g;
            }
            if (!v3) {
                var5_4.b(1);
            }
            v4 = var2_2;
        }
        v4.b(net.minecraft.l.m.b(this));
        v5 = new t<d>(aX.SUCCESS, var5_4);
        if (m.d() != false) return v5;
        bl.b(++var4_10);
        return v5;
    }

    public F(g g10) {
        this.s = g10;
        this.f = 1;
        this.a(net.minecraft.ad.a.t);
        this.b("boat." + g10.b());
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

