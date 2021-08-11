/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;

public class u
extends d {
    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int[] a(int var1_1, int var2_2, int var3_3, int var4_4) {
        block20: {
            var6_5 = (var1_1 -= 2) >> 2;
            var7_6 = (var2_2 -= 2) >> 2;
            var8_7 = (var3_3 >> 2) + 2;
            var9_8 = (var4_4 >> 2) + 2;
            var10_9 = this.f.a(var6_5, var7_6, var8_7, var9_8);
            var11_10 = var8_7 - 1 << 2;
            var5_11 = d.b();
            var12_12 = var9_8 - 1 << 2;
            var13_13 = b.a(var11_10 * var12_12);
            var14_14 = 0;
            block0: while (true) {
                v0 = var14_14;
                block1: while (v0 < var9_8 - 1) {
                    var16_17 = var10_9[var15_16 + 0 + (var14_14 + 0) * var8_7];
                    v1 = var10_9[var15_16 + 0 + (var14_14 + 1) * var8_7];
                    if (var5_11 == null) break block20;
                    var17_18 = v1;
                    for (var15_16 = 0; var15_16 < var8_7 - 1; ++var15_16) {
                        block21: {
                            var18_19 = 3.6;
                            this.a((long)(var15_16 + var6_5 << 2), (long)(var14_14 + var7_6 << 2));
                            var20_20 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                            var22_21 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                            this.a((long)(var15_16 + var6_5 + 1 << 2), (long)(var14_14 + var7_6 << 2));
                            var24_22 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                            var26_23 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                            this.a((long)(var15_16 + var6_5 << 2), (long)(var14_14 + var7_6 + 1 << 2));
                            var28_24 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                            var30_25 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                            this.a((long)(var15_16 + var6_5 + 1 << 2), (long)(var14_14 + var7_6 + 1 << 2));
                            var32_26 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                            var34_27 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                            var36_28 = var10_9[var15_16 + 1 + (var14_14 + 0) * var8_7] & 255;
                            var37_29 = var10_9[var15_16 + 1 + (var14_14 + 1) * var8_7] & 255;
                            v0 = 0;
                            if (var5_11 == null) continue block1;
                            var38_30 = v0;
                            block3: while (true) {
                                v2 = var38_30;
                                block4: while (v2 < 4) {
                                    var39_31 = ((var14_14 << 2) + var38_30) * var11_10 + (var15_16 << 2);
                                    v3 = 0;
                                    if (var5_11 == null) break block21;
                                    for (var40_32 = v1387175; var40_32 < 4; ++var40_32) {
                                        block27: {
                                            block28: {
                                                block26: {
                                                    block24: {
                                                        block25: {
                                                            block22: {
                                                                block23: {
                                                                    var41_33 = ((double)var38_30 - var22_21) * ((double)var38_30 - var22_21) + ((double)var40_32 - var20_20) * ((double)var40_32 - var20_20);
                                                                    var43_34 = ((double)var38_30 - var26_23) * ((double)var38_30 - var26_23) + ((double)var40_32 - var24_22) * ((double)var40_32 - var24_22);
                                                                    var45_35 = ((double)var38_30 - var30_25) * ((double)var38_30 - var30_25) + ((double)var40_32 - var28_24) * ((double)var40_32 - var28_24);
                                                                    var47_36 = ((double)var38_30 - var34_27) * ((double)var38_30 - var34_27) + ((double)var40_32 - var32_26) * ((double)var40_32 - var32_26);
                                                                    v2 = var41_33 == var43_34 ? 0 : (var41_33 < var43_34 ? -1 : 1);
                                                                    if (var5_11 == null) continue block4;
                                                                    if (var5_11 == null) break block22;
                                                                    if (v2 >= 0) break block23;
                                                                    v4 = var41_33 == var45_35 ? 0 : (var41_33 < var45_35 ? -1 : 1);
                                                                    if (var5_11 == null) break block22;
                                                                    if (v4 < 0) {
                                                                        v4 = var41_33 == var47_36 ? 0 : (var41_33 < var47_36 ? -1 : 1);
                                                                        if (var5_11 != null) {
                                                                            if (v4 < 0) {
                                                                                var13_13[var39_31++] = var16_17;
                                                                                if (var5_11 != null) continue;
                                                                            } else {
                                                                                ** GOTO lbl62
                                                                            }
                                                                        } else {
                                                                            ** GOTO lbl61
                                                                        }
                                                                    }
                                                                    break block23;
lbl61:
                                                                    // 2 sources

                                                                    break block22;
                                                                }
                                                                v4 = var43_34 == var41_33 ? 0 : (var43_34 < var41_33 ? -1 : 1);
                                                            }
                                                            if (var5_11 == null) break block24;
                                                            if (v4 >= 0) break block25;
                                                            v4 = var43_34 == var45_35 ? 0 : (var43_34 < var45_35 ? -1 : 1);
                                                            if (var5_11 == null) break block24;
                                                            if (v4 < 0) {
                                                                v4 = var43_34 == var47_36 ? 0 : (var43_34 < var47_36 ? -1 : 1);
                                                                if (var5_11 != null) {
                                                                    if (v4 < 0) {
                                                                        var13_13[var39_31++] = var36_28;
                                                                        if (var5_11 != null) continue;
                                                                    } else {
                                                                        ** GOTO lbl77
                                                                    }
                                                                } else {
                                                                    ** GOTO lbl76
                                                                }
                                                            }
                                                            break block25;
lbl76:
                                                            // 2 sources

                                                            break block24;
                                                        }
                                                        v4 = var45_35 == var41_33 ? 0 : (var45_35 < var41_33 ? -1 : 1);
                                                    }
                                                    if (var5_11 == null) break block26;
                                                    if (v4 >= 0) break block27;
                                                    v4 = var45_35 == var43_34 ? 0 : (var45_35 < var43_34 ? -1 : 1);
                                                }
                                                if (var5_11 == null) break block28;
                                                if (v4 >= 0) break block27;
                                                v4 = var45_35 == var47_36 ? 0 : (var45_35 < var47_36 ? -1 : 1);
                                            }
                                            if (v4 < 0) {
                                                var13_13[var39_31++] = var17_18;
                                                if (var5_11 != null) continue;
                                            }
                                        }
                                        var13_13[var39_31++] = var37_29;
                                        if (var5_11 != null) continue;
                                    }
                                    ++var38_30;
                                    if (var5_11 != null) continue block3;
                                }
                                break;
                            }
                            var16_17 = var36_28;
                            v3 = var37_29;
                        }
                        var17_18 = v3;
                        if (var5_11 != null) continue;
                    }
                    ++var14_14;
                    if (var5_11 != null) continue block0;
                }
                break;
            }
            v1 = var3_3 * var4_4;
        }
        var14_15 = b.a(v1);
        for (var15_16 = 0; var15_16 < var4_4; ++var15_16) {
            v5 = var13_13;
            if (var5_11 == null) return v5;
            System.arraycopy(v5, (var15_16 + (var2_2 & 3)) * var11_10 + (var1_1 & 3), var14_15, var15_16 * var3_3, var3_3);
            if (var5_11 != null) continue;
        }
        v5 = var14_15;
        return v5;
    }

    public u(long l2, d d10) {
        super(l2);
        this.f = d10;
    }
}

