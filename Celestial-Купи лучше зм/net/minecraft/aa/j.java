/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.aA.h;
import net.minecraft.ah.z;
import net.minecraft.o.l;
import net.minecraft.u.g;

public class j
extends h {
    protected static final /* synthetic */ i e;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(long l2, int n2, int n3, l l3, double d10, double d11, double d12) {
        this.a(l2, n2, n3, l3, d10, d11, d12, 1.0f + this.a.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(long var1_1, int var3_2, int var4_3, l var5_4, double var6_5, double var8_6, double var10_7, float var12_8, float var13_9, float var14_10, int var15_11, int var16_12, double var17_13) {
        var20_14 = var3_2 * 16 + 8;
        var19_15 = h.a();
        var22_16 = var4_3 * 16 + 8;
        var24_17 = 0.0f;
        var25_18 = 0.0f;
        var26_19 = new Random(var1_1);
        v0 = var16_12;
        if (!var19_15) {
            if (v0 <= 0) {
                var27_20 = this.c * 16 - 16;
                var16_12 = var27_20 - var26_19.nextInt(var27_20 / 4);
            }
            v0 = 0;
        }
        var27_20 = v0;
        v1 = var15_11;
        v2 = -1;
        if (!var19_15) {
            if (v1 == v2) {
                var15_11 = var16_12 / 2;
                var27_20 = 1;
            }
            v1 = var26_19.nextInt(var16_12 / 2);
            v2 = var16_12 / 4;
        }
        var28_21 = v1 + v2;
        v3 = var26_19.nextInt(6);
        if (!var19_15) {
            v3 = v3 == 0 ? 1 : 0;
        }
        var29_22 = v3;
        do {
            block69: {
                block71: {
                    block91: {
                        block70: {
                            v4 = var15_11;
                            v5 = var16_12;
                            block1: while (true) lbl-1000:
                            // 4 sources

                            {
                                block80: {
                                    block79: {
                                        block78: {
                                            block77: {
                                                block75: {
                                                    block76: {
                                                        block74: {
                                                            block73: {
                                                                block72: {
                                                                    if (v4 >= v5) return;
                                                                    var30_23 = 1.5 + (double)(net.minecraft.k.h.g((float)var15_11 * 3.1415927f / (float)var16_12) * var12_8);
                                                                    var32_24 = var30_23 * var17_13;
                                                                    var34_25 = net.minecraft.k.h.c(var14_10);
                                                                    var35_26 = net.minecraft.k.h.g(var14_10);
                                                                    var6_5 += (double)(net.minecraft.k.h.c(var13_9) * var34_25);
                                                                    var8_6 += (double)var35_26;
                                                                    var10_7 += (double)(net.minecraft.k.h.g(var13_9) * var34_25);
                                                                    if (var19_15) break block72;
                                                                    if (var29_22 == 0) break block73;
                                                                    var14_10 *= 0.92f;
                                                                }
                                                                if (!var19_15) break block74;
                                                            }
                                                            var14_10 *= 0.7f;
                                                        }
                                                        var14_10 += var25_18 * 0.1f;
                                                        var13_9 += var24_17 * 0.1f;
                                                        var25_18 *= 0.9f;
                                                        var24_17 *= 0.75f;
                                                        var25_18 += (var26_19.nextFloat() - var26_19.nextFloat()) * var26_19.nextFloat() * 2.0f;
                                                        var24_17 += (var26_19.nextFloat() - var26_19.nextFloat()) * var26_19.nextFloat() * 4.0f;
                                                        v6 = var27_20;
                                                        if (var19_15) break block75;
                                                        if (v6 != 0) break block76;
                                                        v6 = var15_11;
                                                        if (var19_15) break block75;
                                                        if (v6 == var28_21) {
                                                            cfr_temp_0 = var12_8 - 1.0f;
                                                            v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                            if (!var19_15) {
                                                                if (v6 > 0) {
                                                                    this.a(var26_19.nextLong(), var3_2, var4_3, var5_4, var6_5, var8_6, var10_7, var26_19.nextFloat() * 0.5f + 0.5f, var13_9 - 1.5707964f, var14_10 / 3.0f, var15_11, var16_12, 1.0);
                                                                    this.a(var26_19.nextLong(), var3_2, var4_3, var5_4, var6_5, var8_6, var10_7, var26_19.nextFloat() * 0.5f + 0.5f, var13_9 + 1.5707964f, var14_10 / 3.0f, var15_11, var16_12, 1.0);
                                                                    return;
                                                                } else {
                                                                    ** GOTO lbl68
                                                                }
                                                            } else {
                                                                ** GOTO lbl67
                                                            }
                                                        }
                                                        break block76;
lbl67:
                                                        // 2 sources

                                                        break block75;
                                                    }
                                                    v6 = var27_20;
                                                }
                                                if (var19_15) break block77;
                                                if (v6 != 0) break block78;
                                                v6 = var26_19.nextInt(4);
                                            }
                                            if (v6 == 0) break block69;
                                        }
                                        var36_27 = var6_5 - var20_14;
                                        var38_28 = var10_7 - var22_16;
                                        var40_29 = var16_12 - var15_11;
                                        var42_30 = var12_8 + 2.0f + 16.0f;
                                        cfr_temp_1 = var36_27 * var36_27 + var38_28 * var38_28 - var40_29 * var40_29 - var42_30 * var42_30;
                                        v7 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                        if (!var19_15) {
                                            if (v7 > 0) {
                                                return;
                                            }
                                            cfr_temp_2 = var6_5 - (var20_14 - 16.0 - var30_23 * 2.0);
                                            v7 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                        }
                                        if (!var19_15) {
                                            if (v7 < 0) break block69;
                                            cfr_temp_3 = var10_7 - (var22_16 - 16.0 - var30_23 * 2.0);
                                            v7 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                        }
                                        if (!var19_15) {
                                            if (v7 < 0) break block69;
                                            cfr_temp_4 = var6_5 - (var20_14 + 16.0 + var30_23 * 2.0);
                                            v7 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                        }
                                        if (!var19_15) {
                                            if (v7 > 0) break block69;
                                            cfr_temp_5 = var10_7 - (var22_16 + 16.0 + var30_23 * 2.0);
                                            v7 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
                                        }
                                        if (!var19_15) {
                                            if (v7 > 0) break block69;
                                            v7 = net.minecraft.k.h.f(var6_5 - var30_23) - var3_2 * 16 - 1;
                                        }
                                        var44_31 = v7;
                                        var45_32 = net.minecraft.k.h.f(var6_5 + var30_23) - var3_2 * 16 + 1;
                                        var46_33 = net.minecraft.k.h.f(var8_6 - var32_24) - 1;
                                        var47_34 = net.minecraft.k.h.f(var8_6 + var32_24) + 1;
                                        var48_35 = net.minecraft.k.h.f(var10_7 - var30_23) - var4_3 * 16 - 1;
                                        var49_36 = net.minecraft.k.h.f(var10_7 + var30_23) - var4_3 * 16 + 1;
                                        v8 = var44_31;
                                        if (!var19_15) {
                                            if (v8 < 0) {
                                                var44_31 = (double)false;
                                            }
                                            v8 = var45_32;
                                        }
                                        v9 = 16;
                                        if (!var19_15) {
                                            if (v8 > v9) {
                                                var45_32 = 16;
                                            }
                                            v8 = var46_33;
                                            v9 = 1;
                                        }
                                        if (var19_15) break block79;
                                        if (v8 < v9) {
                                            var46_33 = 1;
                                        }
                                        v8 = var47_34;
                                        if (var19_15) break block80;
                                        v9 = 120;
                                    }
                                    if (v8 > v9) {
                                        var47_34 = 120;
                                    }
                                    v8 = var48_35;
                                }
                                if (!var19_15) {
                                    if (v8 < 0) {
                                        var48_35 = 0;
                                    }
                                    v8 = var49_36;
                                }
                                if (!var19_15) {
                                    if (v8 > 16) {
                                        var49_36 = 16;
                                    }
                                    v8 = (double)false;
                                }
                                var50_37 = v8;
                                var51_38 = var44_31;
                                while (var50_37 == false) {
                                    v10 = var51_38;
                                    if (var19_15) break block70;
                                    v5 = var45_32;
                                    if (var19_15) ** GOTO lbl-1000
                                    if (v10 >= v5) break block1;
                                    var52_39 = var48_35;
                                    while (var50_37 == false) {
                                        v4 = var52_39;
                                        v5 = var49_36;
                                        if (var19_15) ** GOTO lbl-1000
                                        if (!var19_15) {
                                            if (v4 >= v5) break;
                                            v11 = var47_34;
                                            v12 = true;
                                        }
                                        var53_41 = v11 + v12;
                                        while (var50_37 == false) {
                                            block82: {
                                                block90: {
                                                    block89: {
                                                        block88: {
                                                            block87: {
                                                                block86: {
                                                                    block85: {
                                                                        block84: {
                                                                            block83: {
                                                                                block81: {
                                                                                    v13 = var53_41;
                                                                                    if (!var19_15) {
                                                                                        v5 = var46_33 - 1;
                                                                                        if (var19_15) continue block1;
                                                                                        if (v13 < v5) break;
                                                                                        v13 = var53_41;
                                                                                    }
                                                                                    if (var19_15) break block81;
                                                                                    if (v13 < 0) break block82;
                                                                                    v13 = var53_41;
                                                                                }
                                                                                if (v13 >= 128) break block82;
                                                                                var54_42 = var5_4.b((int)var51_38, (int)var53_41, var52_39);
                                                                                v14 = var54_42.b();
                                                                                if (var19_15) break block83;
                                                                                if (v14 == g.ag) break block84;
                                                                                v14 = var54_42.b();
                                                                            }
                                                                            if (v14 != g.bq) break block85;
                                                                        }
                                                                        var50_37 = (double)true;
                                                                    }
                                                                    v15 = var53_41;
                                                                    v16 = var46_33 - 1;
                                                                    if (var19_15) break block86;
                                                                    if (v15 == v16) break block82;
                                                                    v15 = var51_38;
                                                                    v16 = (int)var44_31;
                                                                }
                                                                if (var19_15) break block87;
                                                                if (v15 == v16) break block82;
                                                                v15 = var51_38;
                                                                v16 = var45_32 - 1;
                                                            }
                                                            if (var19_15) break block88;
                                                            if (v15 == v16) break block82;
                                                            v15 = var52_39;
                                                            v16 = var48_35;
                                                        }
                                                        if (var19_15) break block89;
                                                        if (v15 == v16) break block82;
                                                        v15 = var52_39;
                                                        if (var19_15) break block90;
                                                        v16 = var49_36 - 1;
                                                    }
                                                    if (v15 == v16) break block82;
                                                    v15 = var46_33;
                                                }
                                                var53_41 = v15;
                                            }
                                            --var53_41;
                                            if (!var19_15) continue;
                                        }
                                        ++var52_39;
                                        if (!var19_15) continue;
                                    }
                                    ++var51_38;
                                    if (!var19_15) continue;
                                }
                                break;
                            }
                            v10 = var50_37;
                        }
                        if (var19_15) break block91;
                        if (v10 != false) break block69;
                        v10 = var44_31;
                    }
                    var51_38 = v10;
                    block5: while (true) {
                        v17 = var51_38;
                        block6: while (v17 < var45_32) {
                            var52_40 = ((double)(var51_38 + var3_2 * 16) + 0.5 - var6_5) / var30_23;
                            v18 = var48_35;
                            if (var19_15) break block71;
                            var54_43 = v18;
                            block7: while (true) {
                                v19 = var54_43;
                                block8: while (v19 < var49_36) {
                                    var55_44 = ((double)(var54_43 + var4_3 * 16) + 0.5 - var10_7) / var30_23;
                                    v17 = var47_34;
                                    if (var19_15) continue block6;
                                    var57_45 = v17;
                                    while (var57_45 > var46_33) {
                                        block92: {
                                            block93: {
                                                block95: {
                                                    block96: {
                                                        block94: {
                                                            var58_46 = ((double)(var57_45 - true) + 0.5 - var8_6) / var32_24;
                                                            if (var19_15) break block92;
                                                            cfr_temp_6 = var58_46 - -0.7;
                                                            v19 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                                            if (var19_15) continue block8;
                                                            if (v19 <= 0 || !(var52_40 * var52_40 + var58_46 * var58_46 + var55_44 * var55_44 < 1.0)) break block93;
                                                            var60_47 = var5_4.b((int)var51_38, (int)var57_45, var54_43);
                                                            v20 = var60_47.b();
                                                            v21 = g.j;
                                                            if (var19_15) break block94;
                                                            if (v20 == v21) break block95;
                                                            v20 = var60_47.b();
                                                            if (var19_15) break block96;
                                                            v21 = g.bv;
                                                        }
                                                        if (v20 == v21) break block95;
                                                        v20 = var60_47.b();
                                                    }
                                                    if (v20 != g.aU) break block93;
                                                }
                                                var5_4.a((int)var51_38, (int)var57_45, var54_43, j.e);
                                            }
                                            --var57_45;
                                        }
                                        if (!var19_15) continue;
                                    }
                                    ++var54_43;
                                    if (!var19_15) continue block7;
                                }
                                break;
                            }
                            ++var51_38;
                            if (!var19_15) continue block5;
                        }
                        break;
                    }
                    v18 = var27_20;
                }
                if (v18 != 0) {
                    if (var19_15 == false) return;
                }
            }
            ++var15_11;
        } while (!var19_15);
    }

    @Override
    protected void a(z z2, int n2, int n3, int n4, int n5, l l2) {
        int n6;
        int n7 = this.a.nextInt(this.a.nextInt(this.a.nextInt(10) + 1) + 1);
        boolean bl2 = h.a();
        int n8 = this.a.nextInt(5);
        if (!bl2) {
            if (n8 != 0) {
                n7 = 0;
            }
            n8 = n6 = 0;
        }
        while (n6 < n7) {
            block7: {
                int n9;
                double d10 = n2 * 16 + this.a.nextInt(16);
                double d11 = this.a.nextInt(128);
                double d12 = n3 * 16 + this.a.nextInt(16);
                int n10 = 1;
                int n11 = this.a.nextInt(4);
                if (!bl2) {
                    if (n11 == 0) {
                        this.a(this.a.nextLong(), n4, n5, l2, d10, d11, d12);
                        n10 += this.a.nextInt(4);
                    }
                    n11 = n9 = 0;
                }
                while (n9 < n10) {
                    float f10 = this.a.nextFloat() * ((float)Math.PI * 2);
                    float f11 = (this.a.nextFloat() - 0.5f) * 2.0f / 8.0f;
                    float f12 = this.a.nextFloat() * 2.0f + this.a.nextFloat();
                    this.a(this.a.nextLong(), n4, n5, l2, d10, d11, d12, f12 * 2.0f, f10, f11, 0, 0, 0.5);
                    ++n9;
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block7;
                }
                ++n6;
            }
            if (!bl2) continue;
        }
    }

    static {
        e = g.bf.d();
    }
}

