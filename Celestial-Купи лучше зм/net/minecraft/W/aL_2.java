/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.J.u;
import net.minecraft.O.i;
import net.minecraft.U.x;
import net.minecraft.W.a3;
import net.minecraft.W.bp;
import net.minecraft.W.cL;
import net.minecraft.ac.c;
import net.minecraft.ar.aA;
import net.minecraft.w.ae;
import net.minecraft.w.bl;
import net.minecraft.w.d;

final class aL
extends net.minecraft.O.d {
    private final /* synthetic */ net.minecraft.O.d c;

    private static gP a(gP gP2) {
        return gP2;
    }

    aL() {
        this.c = new net.minecraft.O.d();
    }

    @Override
    protected void a(i i2) {
        i2.a().b(1000, i2.e(), 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(i var1_1, d var2_2) {
        block15: {
            block16: {
                block12: {
                    block13: {
                        block14: {
                            var4_3 = var1_1.b().b(a3.C);
                            var3_4 = bl.c();
                            var5_5 = var1_1.a();
                            var6_6 = var1_1.a() + (double)var4_3.r() * 1.125;
                            var8_7 = Math.floor(var1_1.f()) + (double)var4_3.p();
                            var10_8 = var1_1.d() + (double)var4_3.i() * 1.125;
                            var12_9 = var1_1.e().a(var4_3);
                            v0 = var13_10 = var5_5.d(var12_9);
                            if (var3_4 != 0) ** GOTO lbl12
                            if (v0.b() instanceof bp) {
                                v0 = var13_10;
lbl12:
                                // 2 sources

                                v1 = v0.b(((bp)var13_10.b()).a());
                            } else {
                                v1 = cL.NORTH_SOUTH;
                            }
                            var14_11 = v1;
                            v2 = var13_10;
                            if (var3_4 != 0) break block12;
                            if (!bp.a(v2)) break block13;
                            if (!var14_11.c()) break block14;
                            var15_12 = 0.6;
                            if (var3_4 == 0) break block15;
                        }
                        var15_12 = 0.1;
                        if (var3_4 == 0) break block15;
                    }
                    v2 = var13_10;
                }
                if (var3_4 == 0) {
                    if (v2.o() != net.minecraft.ac.c.A) return this.c.a(var1_1, var2_2);
                    v2 = var5_5.d(var12_9.k());
                }
                if (var3_4 == 0) {
                    if (!bp.a(v2)) {
                        return this.c.a(var1_1, var2_2);
                    }
                    v2 = var5_5.d(var12_9.k());
                }
                var17_13 = v2;
                v3 = var17_13;
                if (var3_4 != 0) ** GOTO lbl40
                if (v3.b() instanceof bp) {
                    v3 = var17_13;
lbl40:
                    // 2 sources

                    v4 = v3.b(((bp)var17_13.b()).a());
                } else {
                    v4 = var18_14 = cL.NORTH_SOUTH;
                }
                if (var4_3 == aA.DOWN || !var18_14.c()) break block16;
                var15_12 = -0.4;
                if (var3_4 == 0) break block15;
            }
            var15_12 = -0.9;
        }
        var17_13 = u.a(var5_5, var6_6, var8_7 + var15_12, var10_8, ae.a((ae)var2_2.w()));
        v5 = var2_2.c();
        if (var3_4 == 0) {
            if (v5) {
                var17_13.a(var2_2.g());
            }
            v5 = var5_5.f((x)var17_13);
        }
        var2_2.b(1);
        return var2_2;
    }
}

