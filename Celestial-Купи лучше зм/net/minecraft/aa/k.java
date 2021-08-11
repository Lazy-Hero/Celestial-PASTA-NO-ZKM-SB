/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.aA.h;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.o.l;
import net.minecraft.u.g;

public class k
extends h {
    protected static final /* synthetic */ i g;
    protected static final /* synthetic */ i f;
    private final /* synthetic */ float[] e;

    @Override
    protected void a(z z2, int n2, int n3, int n4, int n5, l l2) {
        block4: {
            int n6;
            boolean bl2;
            block3: {
                bl2 = h.b();
                n6 = this.a.nextInt(50);
                if (!bl2) break block3;
                if (n6 != 0) break block4;
                n6 = n2 * 16 + this.a.nextInt(16);
            }
            double d10 = n6;
            double d11 = this.a.nextInt(this.a.nextInt(40) + 8) + 20;
            double d12 = n3 * 16 + this.a.nextInt(16);
            boolean bl3 = true;
            for (int i2 = 0; i2 < 1; ++i2) {
                float f10 = this.a.nextFloat() * ((float)Math.PI * 2);
                float f11 = (this.a.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f12 = (this.a.nextFloat() * 2.0f + this.a.nextFloat()) * 2.0f;
                this.a(this.a.nextLong(), n4, n5, l2, d10, d11, d12, f12, f10, f11, 0, 0, 3.0);
                if (bl2) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        f = net.minecraft.u.g.ag.d();
        g = net.minecraft.u.g.bf.d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(long var1_1, int var3_2, int var4_3, l var5_4, double var6_5, double var8_6, double var10_7, float var12_8, float var13_9, float var14_10, int var15_11, int var16_12, double var17_13) {
        block63: {
            block62: {
                var20_14 = new Random(var1_1);
                var21_15 = var3_2 * 16 + 8;
                var23_16 = var4_3 * 16 + 8;
                var25_17 = 0.0f;
                var19_18 = h.a();
                var26_19 = 0.0f;
                v0 = var16_12;
                if (!var19_18) {
                    if (v0 <= 0) {
                        var27_20 = this.c * 16 - 16;
                        var16_12 = var27_20 - var20_14.nextInt(var27_20 / 4);
                    }
                    v0 = 0;
                }
                var27_20 = v0;
                v1 = var15_11;
                v2 = -1;
                if (var19_18) break block62;
                if (v1 != v2) break block63;
                v1 = var16_12;
                v2 = 2;
            }
            var15_11 = v1 / v2;
            var27_20 = 1;
        }
        var28_21 = 1.0f;
        for (var29_22 = 0; var29_22 < 256; ++var29_22) {
            block66: {
                block65: {
                    block64: {
                        v3 = var29_22;
                        if (var19_18) ** GOTO lbl40
                        if (var19_18) break block64;
                        if (v3 == 0) break block65;
                        v4 = var20_14.nextInt(3);
                    }
                    if (v4 != false) break block66;
                }
                var28_21 = 1.0f + var20_14.nextFloat() * var20_14.nextFloat();
            }
            this.e[var29_22] = var28_21 * var28_21;
            if (!var19_18) continue;
        }
        do {
            block59: {
                block61: {
                    block60: {
                        v3 = var15_11;
lbl40:
                        // 2 sources

                        v5 = var16_12;
                        block2: while (true) lbl-1000:
                        // 4 sources

                        {
                            block68: {
                                block67: {
                                    if (v3 >= v5) return;
                                    var29_23 = 1.5 + (double)(net.minecraft.k.h.g((float)var15_11 * 3.1415927f / (float)var16_12) * var12_8);
                                    var31_24 = var29_23 * var17_13;
                                    var29_23 *= (double)var20_14.nextFloat() * 0.25 + 0.75;
                                    var31_24 *= (double)var20_14.nextFloat() * 0.25 + 0.75;
                                    var33_25 = net.minecraft.k.h.c(var14_10);
                                    var34_26 = net.minecraft.k.h.g(var14_10);
                                    var6_5 += (double)(net.minecraft.k.h.c(var13_9) * var33_25);
                                    var8_6 += (double)var34_26;
                                    v6 = var10_7 + (double)(net.minecraft.k.h.g(var13_9) * var33_25);
                                    if (!var19_18) {
                                        var10_7 = v6;
                                        var14_10 *= 0.7f;
                                        var14_10 += var26_19 * 0.05f;
                                        var13_9 += var25_17 * 0.05f;
                                        var26_19 *= 0.8f;
                                        var25_17 *= 0.5f;
                                        var26_19 += (var20_14.nextFloat() - var20_14.nextFloat()) * var20_14.nextFloat() * 2.0f;
                                        var25_17 += (var20_14.nextFloat() - var20_14.nextFloat()) * var20_14.nextFloat() * 4.0f;
                                        if (var27_20 == 0 && var20_14.nextInt(4) == 0) break block59;
                                        v6 = var6_5 - var21_15;
                                    }
                                    var35_27 = v6;
                                    var37_28 = var10_7 - var23_16;
                                    var39_29 = var16_12 - var15_11;
                                    var41_30 = var12_8 + 2.0f + 16.0f;
                                    cfr_temp_0 = var35_27 * var35_27 + var37_28 * var37_28 - var39_29 * var39_29 - var41_30 * var41_30;
                                    v7 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (!var19_18) {
                                        if (v7 > 0) {
                                            return;
                                        }
                                        cfr_temp_1 = var6_5 - (var21_15 - 16.0 - var29_23 * 2.0);
                                        v7 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                    }
                                    if (!var19_18) {
                                        if (v7 < 0) break block59;
                                        cfr_temp_2 = var10_7 - (var23_16 - 16.0 - var29_23 * 2.0);
                                        v7 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                    }
                                    if (!var19_18) {
                                        if (v7 < 0) break block59;
                                        cfr_temp_3 = var6_5 - (var21_15 + 16.0 + var29_23 * 2.0);
                                        v7 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                    }
                                    if (!var19_18) {
                                        if (v7 > 0) break block59;
                                        cfr_temp_4 = var10_7 - (var23_16 + 16.0 + var29_23 * 2.0);
                                        v7 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                    }
                                    if (!var19_18) {
                                        if (v7 > 0) break block59;
                                        v7 = net.minecraft.k.h.f(var6_5 - var29_23) - var3_2 * 16 - 1;
                                    }
                                    var43_31 = v7;
                                    var44_32 = net.minecraft.k.h.f(var6_5 + var29_23) - var3_2 * 16 + 1;
                                    var45_33 = net.minecraft.k.h.f(var8_6 - var31_24) - 1;
                                    var46_34 = net.minecraft.k.h.f(var8_6 + var31_24) + 1;
                                    var47_35 = net.minecraft.k.h.f(var10_7 - var29_23) - var4_3 * 16 - 1;
                                    var48_36 = net.minecraft.k.h.f(var10_7 + var29_23) - var4_3 * 16 + 1;
                                    v8 = var43_31;
                                    if (!var19_18) {
                                        if (v8 < 0) {
                                            var43_31 = (double)false;
                                        }
                                        v8 = var44_32;
                                    }
                                    v9 = 16;
                                    if (!var19_18) {
                                        if (v8 > v9) {
                                            var44_32 = 16;
                                        }
                                        v8 = var45_33;
                                        v9 = 1;
                                    }
                                    if (var19_18) break block67;
                                    if (v8 < v9) {
                                        var45_33 = 1;
                                    }
                                    v8 = var46_34;
                                    if (var19_18) break block68;
                                    v9 = 248;
                                }
                                if (v8 > v9) {
                                    var46_34 = 248;
                                }
                                v8 = var47_35;
                            }
                            if (!var19_18) {
                                if (v8 < 0) {
                                    var47_35 = 0;
                                }
                                v8 = var48_36;
                            }
                            if (!var19_18) {
                                if (v8 > 16) {
                                    var48_36 = 16;
                                }
                                v8 = (double)false;
                            }
                            var49_37 = v8;
                            var50_38 = var43_31;
                            while (var49_37 == false) {
                                v10 = var50_38;
                                if (var19_18) break block60;
                                v5 = var44_32;
                                if (var19_18) ** GOTO lbl-1000
                                if (v10 >= v5) break block2;
                                var51_40 = var47_35;
                                while (var49_37 == false) {
                                    v3 = (int)var51_40;
                                    v5 = var48_36;
                                    if (var19_18) ** GOTO lbl-1000
                                    if (!var19_18) {
                                        if (v3 >= v5) break;
                                        v11 = var46_34;
                                        v12 = true;
                                    }
                                    var52_41 = v11 + v12;
                                    while (var49_37 == false) {
                                        block70: {
                                            block78: {
                                                block77: {
                                                    block76: {
                                                        block75: {
                                                            block74: {
                                                                block73: {
                                                                    block72: {
                                                                        block71: {
                                                                            block69: {
                                                                                v13 = var52_41;
                                                                                if (!var19_18) {
                                                                                    v5 = var45_33 - 1;
                                                                                    if (var19_18) continue block2;
                                                                                    if (v13 < v5) break;
                                                                                    v13 = var52_41;
                                                                                }
                                                                                if (var19_18) break block69;
                                                                                if (v13 < 0) break block70;
                                                                                v13 = var52_41;
                                                                            }
                                                                            if (v13 >= 256) break block70;
                                                                            var53_43 = var5_4.b((int)var50_38, (int)var52_41, (int)var51_40);
                                                                            v14 = var53_43.b();
                                                                            if (var19_18) break block71;
                                                                            if (v14 == net.minecraft.u.g.cL) break block72;
                                                                            v14 = var53_43.b();
                                                                        }
                                                                        if (v14 != net.minecraft.u.g.bQ) break block73;
                                                                    }
                                                                    var49_37 = (double)true;
                                                                }
                                                                v15 = var52_41;
                                                                v16 = var45_33 - 1;
                                                                if (var19_18) break block74;
                                                                if (v15 == v16) break block70;
                                                                v15 = var50_38;
                                                                v16 = (int)var43_31;
                                                            }
                                                            if (var19_18) break block75;
                                                            if (v15 == v16) break block70;
                                                            v15 = var50_38;
                                                            v16 = var44_32 - 1;
                                                        }
                                                        if (var19_18) break block76;
                                                        if (v15 == v16) break block70;
                                                        v15 = var51_40;
                                                        v16 = var47_35;
                                                    }
                                                    if (var19_18) break block77;
                                                    if (v15 == v16) break block70;
                                                    v15 = var51_40;
                                                    if (var19_18) break block78;
                                                    v16 = var48_36 - 1;
                                                }
                                                if (v15 == v16) break block70;
                                                v15 = var45_33;
                                            }
                                            var52_41 = v15;
                                        }
                                        --var52_41;
                                        if (!var19_18) continue;
                                    }
                                    ++var51_40;
                                    if (!var19_18) continue;
                                }
                                ++var50_38;
                                if (!var19_18) continue;
                            }
                            break;
                        }
                        v10 = var49_37;
                    }
                    if (v10 != false) break block59;
                    var50_39 = new o();
                    var51_40 = var43_31;
                    block6: while (true) {
                        v17 = var51_40;
                        block7: while (v17 < var44_32) {
                            var52_42 = ((double)(var51_40 + var3_2 * 16) + 0.5 - var6_5) / var29_23;
                            v18 = var47_35;
                            if (var19_18) break block61;
                            var54_44 = v18;
                            block8: while (true) {
                                v19 = var54_44;
                                block9: while (v19 < var48_36) {
                                    block79: {
                                        var55_45 = ((double)(var54_44 + var4_3 * 16) + 0.5 - var10_7) / var29_23;
                                        var57_46 = 0;
                                        if (var19_18) continue block8;
                                        cfr_temp_5 = var52_42 * var52_42 + var55_45 * var55_45 - 1.0;
                                        v17 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
                                        if (var19_18) continue block7;
                                        if (v17 >= 0) break block79;
                                        var58_47 = var46_34;
                                        while (var58_47 > var45_33) {
                                            block80: {
                                                block81: {
                                                    block87: {
                                                        block85: {
                                                            block86: {
                                                                block83: {
                                                                    block84: {
                                                                        block82: {
                                                                            var59_48 = ((double)(var58_47 - 1) + 0.5 - var8_6) / var31_24;
                                                                            if (var19_18) break block80;
                                                                            cfr_temp_6 = (var52_42 * var52_42 + var55_45 * var55_45) * (double)this.e[var58_47 - 1] + var59_48 * var59_48 / 6.0 - 1.0;
                                                                            v19 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                                                                            if (var19_18) continue block9;
                                                                            if (v19 >= 0) break block81;
                                                                            var61_49 = var5_4.b((int)var51_40, var58_47, var54_44);
                                                                            v20 = var61_49.b();
                                                                            v21 /* !! */  = net.minecraft.u.g.aU;
                                                                            if (!var19_18) {
                                                                                if (v20 == v21 /* !! */ ) {
                                                                                    var57_46 = 1;
                                                                                }
                                                                                v20 = var61_49.b();
                                                                                v21 /* !! */  = net.minecraft.u.g.bx;
                                                                            }
                                                                            if (var19_18) break block82;
                                                                            if (v20 == v21 /* !! */ ) break block83;
                                                                            v20 = var61_49.b();
                                                                            if (var19_18) break block84;
                                                                            v21 /* !! */  = net.minecraft.u.g.bv;
                                                                        }
                                                                        if (v20 == v21 /* !! */ ) break block83;
                                                                        v20 = var61_49.b();
                                                                    }
                                                                    if (v20 != net.minecraft.u.g.aU) break block81;
                                                                }
                                                                v22 = var58_47 - 1;
                                                                if (var19_18) break block85;
                                                                if (v22 >= 10) break block86;
                                                                var5_4.a((int)var51_40, var58_47, var54_44, k.f);
                                                                if (!var19_18) break block81;
                                                            }
                                                            var5_4.a((int)var51_40, var58_47, var54_44, k.g);
                                                            if (var19_18) break block80;
                                                            v22 = var57_46;
                                                        }
                                                        if (v22 == 0) break block81;
                                                        v23 = var5_4;
                                                        v24 = var51_40;
                                                        v25 = var58_47 - 1;
                                                        v26 = var54_44;
                                                        if (var19_18) break block87;
                                                        if (v23.b((int)v24, v25, v26).b() != net.minecraft.u.g.bv) break block81;
                                                        var50_39.a((int)(var51_40 + var3_2 * 16), 0, var54_44 + var4_3 * 16);
                                                        v23 = var5_4;
                                                        v24 = var51_40;
                                                        v25 = var58_47 - 1;
                                                        v26 = var54_44;
                                                    }
                                                    v23.a((int)v24, v25, v26, this.d.c((n)var50_39).B);
                                                }
                                                --var58_47;
                                            }
                                            if (!var19_18) continue;
                                        }
                                    }
                                    ++var54_44;
                                    if (!var19_18) continue block8;
                                }
                                break;
                            }
                            ++var51_40;
                            if (!var19_18) continue block6;
                        }
                        break;
                    }
                    v18 = var27_20;
                }
                if (v18 != 0) {
                    if (var19_18 == false) return;
                }
            }
            ++var15_11;
        } while (!var19_18);
    }

    public k() {
        this.e = new float[1024];
    }
}

