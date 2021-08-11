/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package net.minecraft.aA;

import com.google.common.base.MoreObjects;
import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.aA.h;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.o.l;
import net.minecraft.u.g;

public class i
extends h {
    protected static final /* synthetic */ net.minecraft.Z.i f;
    protected static final /* synthetic */ net.minecraft.Z.i h;
    protected static final /* synthetic */ net.minecraft.Z.i g;
    protected static final /* synthetic */ net.minecraft.Z.i e;

    protected void a(long l2, int n2, int n3, l l3, double d10, double d11, double d12) {
        this.a(l2, n2, n3, l3, d10, d11, d12, 1.0f + this.a.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    @Override
    protected void a(z z2, int n2, int n3, int n4, int n5, l l2) {
        int n6 = this.a.nextInt(this.a.nextInt(this.a.nextInt(15) + 1) + 1);
        boolean bl2 = net.minecraft.aA.h.a();
        int n7 = this.a.nextInt(7);
        if (!bl2) {
            if (n7 != 0) {
                n6 = 0;
            }
            n7 = 0;
        }
        int n8 = n7;
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 < n6) {
                int n10;
                double d10 = n2 * 16 + this.a.nextInt(16);
                double d11 = this.a.nextInt(this.a.nextInt(120) + 8);
                double d12 = n3 * 16 + this.a.nextInt(16);
                int n11 = 1;
                int n12 = this.a.nextInt(4);
                if (!bl2) {
                    if (n12 == 0) {
                        this.a(this.a.nextLong(), n4, n5, l2, d10, d11, d12);
                        n11 += this.a.nextInt(4);
                    }
                    n12 = n10 = 0;
                }
                while (n10 < n11) {
                    float f10 = this.a.nextFloat() * ((float)Math.PI * 2);
                    float f11 = (this.a.nextFloat() - 0.5f) * 2.0f / 8.0f;
                    float f12 = this.a.nextFloat() * 2.0f + this.a.nextFloat();
                    i i2 = this;
                    if (!bl2) {
                        n9 = i2.a.nextInt(10);
                        if (bl2) continue block1;
                        if (n9 == 0) {
                            f12 *= this.a.nextFloat() * this.a.nextFloat() * 3.0f + 1.0f;
                        }
                        i2 = this;
                    }
                    i2.a(this.a.nextLong(), n4, n5, l2, d10, d11, d12, f12, f10, f11, 0, 0, 1.0);
                    ++n10;
                    if (!bl2) continue;
                }
                ++n8;
                if (!bl2) continue block0;
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(net.minecraft.Z.i i2, net.minecraft.Z.i i3) {
        net.minecraft.Z.i i4;
        block27: {
            block28: {
                K k2;
                boolean bl2;
                block26: {
                    K k3;
                    block25: {
                        block24: {
                            K k4;
                            block23: {
                                block22: {
                                    K k5;
                                    block21: {
                                        bl2 = net.minecraft.aA.h.a();
                                        K k5 = i2.b();
                                        k5 = net.minecraft.u.g.bx;
                                        if (bl2) break block21;
                                        if (k2 == k5) {
                                            return true;
                                        }
                                        k2 = i2.b();
                                        if (bl2) break block22;
                                        k5 = net.minecraft.u.g.bv;
                                    }
                                    if (k2 == k5) {
                                        return true;
                                    }
                                    k2 = i2.b();
                                }
                                k4 = net.minecraft.u.g.aU;
                                if (!bl2) {
                                    if (k2 == k4) {
                                        return true;
                                    }
                                    K k4 = i2.b();
                                    k4 = net.minecraft.u.g.an;
                                }
                                if (!bl2) {
                                    if (k2 == k4) {
                                        return true;
                                    }
                                    K k4 = i2.b();
                                    k4 = net.minecraft.u.g.ck;
                                }
                                if (!bl2) {
                                    if (k2 == k4) {
                                        return true;
                                    }
                                    K k4 = i2.b();
                                    k4 = net.minecraft.u.g.bC;
                                }
                                if (bl2) break block23;
                                if (k2 == k4) {
                                    return true;
                                }
                                k2 = i2.b();
                                if (bl2) break block24;
                                k4 = net.minecraft.u.g.aQ;
                            }
                            if (k2 == k4) {
                                return true;
                            }
                            k2 = i2.b();
                        }
                        k3 = net.minecraft.u.g.a8;
                        if (bl2) break block25;
                        if (k2 == k3) {
                            return true;
                        }
                        k2 = i2.b();
                        if (bl2) break block26;
                        k3 = net.minecraft.u.g.o;
                    }
                    if (k2 == k3) {
                        return true;
                    }
                    i4 = i2;
                    if (bl2) break block27;
                    k2 = i4.b();
                }
                if (k2 == net.minecraft.u.g.aO) break block28;
                i4 = i2;
                if (bl2) break block27;
                if (i4.b() != net.minecraft.u.g.di) return false;
            }
            i4 = i3;
        }
        if (i4.o() == net.minecraft.ac.c.L) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(long var1_1, int var3_2, int var4_3, l var5_4, double var6_5, double var8_6, double var10_7, float var12_8, float var13_9, float var14_10, int var15_11, int var16_12, double var17_13) {
        var20_14 = var3_2 * 16 + 8;
        var22_15 = var4_3 * 16 + 8;
        var19_16 = net.minecraft.aA.h.b();
        var24_17 = 0.0f;
        var25_18 = 0.0f;
        var26_19 = new Random(var1_1);
        v0 = var16_12;
        if (var19_16) {
            if (v0 <= 0) {
                var27_20 = this.c * 16 - 16;
                var16_12 = var27_20 - var26_19.nextInt(var27_20 / 4);
            }
            v0 = 0;
        }
        var27_20 = v0;
        v1 = var15_11;
        v2 = -1;
        if (var19_16) {
            if (v1 == v2) {
                var15_11 = var16_12 / 2;
                var27_20 = 1;
            }
            v1 = var26_19.nextInt(var16_12 / 2);
            v2 = var16_12 / 4;
        }
        var28_21 = v1 + v2;
        v3 = var26_19.nextInt(6);
        if (var19_16) {
            v3 = v3 == 0 ? 1 : 0;
        }
        var29_22 = v3;
        do {
            block89: {
                block91: {
                    block90: {
                        v4 = var15_11;
                        v5 = var16_12;
                        block1: while (true) lbl-1000:
                        // 4 sources

                        {
                            block100: {
                                block99: {
                                    block98: {
                                        block97: {
                                            block95: {
                                                block96: {
                                                    block94: {
                                                        block93: {
                                                            block92: {
                                                                if (v4 >= v5) return;
                                                                var30_23 = 1.5 + (double)(net.minecraft.k.h.g((float)var15_11 * 3.1415927f / (float)var16_12) * var12_8);
                                                                var32_24 = var30_23 * var17_13;
                                                                var34_25 = net.minecraft.k.h.c(var14_10);
                                                                var35_26 = net.minecraft.k.h.g(var14_10);
                                                                var6_5 += (double)(net.minecraft.k.h.c(var13_9) * var34_25);
                                                                var8_6 += (double)var35_26;
                                                                var10_7 += (double)(net.minecraft.k.h.g(var13_9) * var34_25);
                                                                if (!var19_16) break block92;
                                                                if (var29_22 == 0) break block93;
                                                                var14_10 *= 0.92f;
                                                            }
                                                            if (var19_16) break block94;
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
                                                    if (!var19_16) break block95;
                                                    if (v6 != 0) break block96;
                                                    v6 = var15_11;
                                                    if (!var19_16) break block95;
                                                    if (v6 != var28_21) break block96;
                                                    cfr_temp_0 = var12_8 - 1.0f;
                                                    v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                    if (var19_16) {
                                                        if (v6 > 0) {
                                                            v6 = var16_12;
                                                            if (var19_16) {
                                                                if (v6 > 0) {
                                                                    this.a(var26_19.nextLong(), var3_2, var4_3, var5_4, var6_5, var8_6, var10_7, var26_19.nextFloat() * 0.5f + 0.5f, var13_9 - 1.5707964f, var14_10 / 3.0f, var15_11, var16_12, 1.0);
                                                                    this.a(var26_19.nextLong(), var3_2, var4_3, var5_4, var6_5, var8_6, var10_7, var26_19.nextFloat() * 0.5f + 0.5f, var13_9 + 1.5707964f, var14_10 / 3.0f, var15_11, var16_12, 1.0);
                                                                    return;
                                                                } else {
                                                                    ** GOTO lbl72
                                                                }
                                                            } else {
                                                                ** GOTO lbl71
                                                            }
                                                        } else {
                                                            ** GOTO lbl70
                                                        }
                                                    }
                                                    break block95;
lbl70:
                                                    // 2 sources

                                                    break block96;
lbl71:
                                                    // 2 sources

                                                    break block95;
                                                }
                                                v6 = var27_20;
                                            }
                                            if (!var19_16) break block97;
                                            if (v6 != 0) break block98;
                                            v6 = var26_19.nextInt(4);
                                        }
                                        if (v6 == 0) break block89;
                                    }
                                    var36_27 = var6_5 - var20_14;
                                    var38_28 = var10_7 - var22_15;
                                    var40_29 = var16_12 - var15_11;
                                    var42_30 = var12_8 + 2.0f + 16.0f;
                                    cfr_temp_1 = var36_27 * var36_27 + var38_28 * var38_28 - var40_29 * var40_29 - var42_30 * var42_30;
                                    v7 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                    if (var19_16) {
                                        if (v7 > 0) {
                                            return;
                                        }
                                        cfr_temp_2 = var6_5 - (var20_14 - 16.0 - var30_23 * 2.0);
                                        v7 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                    }
                                    if (var19_16) {
                                        if (v7 < 0) break block89;
                                        cfr_temp_3 = var10_7 - (var22_15 - 16.0 - var30_23 * 2.0);
                                        v7 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                    }
                                    if (var19_16) {
                                        if (v7 < 0) break block89;
                                        cfr_temp_4 = var6_5 - (var20_14 + 16.0 + var30_23 * 2.0);
                                        v7 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                    }
                                    if (var19_16) {
                                        if (v7 > 0) break block89;
                                        cfr_temp_5 = var10_7 - (var22_15 + 16.0 + var30_23 * 2.0);
                                        v7 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
                                    }
                                    if (var19_16) {
                                        if (v7 > 0) break block89;
                                        v7 = net.minecraft.k.h.f(var6_5 - var30_23) - var3_2 * 16 - 1;
                                    }
                                    var44_31 = v7;
                                    var45_32 = net.minecraft.k.h.f(var6_5 + var30_23) - var3_2 * 16 + 1;
                                    var46_33 = net.minecraft.k.h.f(var8_6 - var32_24) - 1;
                                    var47_34 = net.minecraft.k.h.f(var8_6 + var32_24) + 1;
                                    var48_35 = net.minecraft.k.h.f(var10_7 - var30_23) - var4_3 * 16 - 1;
                                    var49_36 = net.minecraft.k.h.f(var10_7 + var30_23) - var4_3 * 16 + 1;
                                    v8 = var44_31;
                                    if (var19_16) {
                                        if (v8 < 0) {
                                            var44_31 = (double)false;
                                        }
                                        v8 = var45_32;
                                    }
                                    v9 = 16;
                                    if (var19_16) {
                                        if (v8 > v9) {
                                            var45_32 = 16;
                                        }
                                        v8 = var46_33;
                                        v9 = 1;
                                    }
                                    if (!var19_16) break block99;
                                    if (v8 < v9) {
                                        var46_33 = 1;
                                    }
                                    v8 = var47_34;
                                    if (!var19_16) break block100;
                                    v9 = 248;
                                }
                                if (v8 > v9) {
                                    var47_34 = 248;
                                }
                                v8 = var48_35;
                            }
                            if (var19_16) {
                                if (v8 < 0) {
                                    var48_35 = 0;
                                }
                                v8 = var49_36;
                            }
                            if (var19_16) {
                                if (v8 > 16) {
                                    var49_36 = 16;
                                }
                                v8 = (double)false;
                            }
                            var50_37 = v8;
                            var51_38 = var44_31;
                            while (var50_37 == false) {
                                v10 = var51_38;
                                if (!var19_16) break block90;
                                v5 = var45_32;
                                if (!var19_16) ** GOTO lbl-1000
                                if (v10 >= v5) break block1;
                                var52_40 = var48_35;
                                while (var50_37 == false) {
                                    v4 = (int)var52_40;
                                    v5 = var49_36;
                                    if (!var19_16) ** GOTO lbl-1000
                                    if (var19_16) {
                                        if (v4 >= v5) break;
                                        v11 = var47_34;
                                        v12 = true;
                                    }
                                    var53_41 = v11 + v12;
                                    while (var50_37 == false) {
                                        block102: {
                                            block110: {
                                                block109: {
                                                    block108: {
                                                        block107: {
                                                            block106: {
                                                                block105: {
                                                                    block104: {
                                                                        block103: {
                                                                            block101: {
                                                                                v13 = var53_41;
                                                                                if (var19_16) {
                                                                                    v5 = var46_33 - 1;
                                                                                    if (!var19_16) continue block1;
                                                                                    if (v13 < v5) break;
                                                                                    v13 = var53_41;
                                                                                }
                                                                                if (!var19_16) break block101;
                                                                                if (v13 < 0) break block102;
                                                                                v13 = var53_41;
                                                                            }
                                                                            if (v13 >= 256) break block102;
                                                                            var54_43 = var5_4.b((int)var51_38, (int)var53_41, (int)var52_40);
                                                                            v14 = var54_43.b();
                                                                            if (!var19_16) break block103;
                                                                            if (v14 == net.minecraft.u.g.cL) break block104;
                                                                            v14 = var54_43.b();
                                                                        }
                                                                        if (v14 != net.minecraft.u.g.bQ) break block105;
                                                                    }
                                                                    var50_37 = (double)true;
                                                                }
                                                                v15 = var53_41;
                                                                v16 = var46_33 - 1;
                                                                if (!var19_16) break block106;
                                                                if (v15 == v16) break block102;
                                                                v15 = var51_38;
                                                                v16 = (int)var44_31;
                                                            }
                                                            if (!var19_16) break block107;
                                                            if (v15 == v16) break block102;
                                                            v15 = var51_38;
                                                            v16 = var45_32 - 1;
                                                        }
                                                        if (!var19_16) break block108;
                                                        if (v15 == v16) break block102;
                                                        v15 = var52_40;
                                                        v16 = var48_35;
                                                    }
                                                    if (!var19_16) break block109;
                                                    if (v15 == v16) break block102;
                                                    v15 = var52_40;
                                                    if (!var19_16) break block110;
                                                    v16 = var49_36 - 1;
                                                }
                                                if (v15 == v16) break block102;
                                                v15 = var46_33;
                                            }
                                            var53_41 = v15;
                                        }
                                        --var53_41;
                                        if (var19_16) continue;
                                    }
                                    ++var52_40;
                                    if (var19_16) continue;
                                }
                                ++var51_38;
                                if (var19_16) continue;
                            }
                            break;
                        }
                        v10 = var50_37;
                    }
                    if (v10 != false) break block89;
                    var51_39 = new o();
                    var52_40 = var44_31;
                    block5: while (true) {
                        v17 = var52_40;
                        block6: while (v17 < var45_32) {
                            var53_42 = ((double)(var52_40 + var3_2 * 16) + 0.5 - var6_5) / var30_23;
                            v18 = var48_35;
                            if (!var19_16) break block91;
                            var55_44 = v18;
                            block7: while (true) {
                                v19 = var55_44;
                                block8: while (v19 < var49_36) {
                                    block111: {
                                        var56_45 = ((double)(var55_44 + var4_3 * 16) + 0.5 - var10_7) / var30_23;
                                        var58_46 = 0;
                                        if (!var19_16) continue block7;
                                        cfr_temp_6 = var53_42 * var53_42 + var56_45 * var56_45 - 1.0;
                                        v17 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                                        if (!var19_16) continue block6;
                                        if (v17 >= 0) break block111;
                                        var59_47 = var47_34;
                                        while (var59_47 > var46_33) {
                                            block112: {
                                                block113: {
                                                    block120: {
                                                        block118: {
                                                            block119: {
                                                                block117: {
                                                                    block116: {
                                                                        block115: {
                                                                            block114: {
                                                                                var60_48 = ((double)(var59_47 - 1) + 0.5 - var8_6) / var32_24;
                                                                                if (!var19_16) break block112;
                                                                                cfr_temp_7 = var60_48 - -0.7;
                                                                                v19 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                                                                if (!var19_16) continue block8;
                                                                                if (v19 <= 0 || !(var53_42 * var53_42 + var60_48 * var60_48 + var56_45 * var56_45 < 1.0)) break block113;
                                                                                var62_49 = var5_4.b((int)var52_40, var59_47, var55_44);
                                                                                var63_50 = (net.minecraft.Z.i)MoreObjects.firstNonNull((Object)var5_4.b((int)var52_40, var59_47 + 1, var55_44), (Object)i.h);
                                                                                v20 = var62_49.b();
                                                                                if (!var19_16) break block114;
                                                                                if (v20 == net.minecraft.u.g.aU) break block115;
                                                                                v20 = var62_49.b();
                                                                            }
                                                                            if (v20 != net.minecraft.u.g.a8) break block116;
                                                                        }
                                                                        var58_46 = 1;
                                                                    }
                                                                    v21 = this.a(var62_49, var63_50);
                                                                    if (!var19_16) break block117;
                                                                    if (v21 == 0) break block113;
                                                                    v21 = var59_47 - 1;
                                                                }
                                                                if (!var19_16) break block118;
                                                                if (v21 >= 10) break block119;
                                                                var5_4.a((int)var52_40, var59_47, var55_44, i.e);
                                                                if (var19_16) break block113;
                                                            }
                                                            var5_4.a((int)var52_40, var59_47, var55_44, i.h);
                                                            if (!var19_16) break block112;
                                                            v21 = var58_46;
                                                        }
                                                        if (v21 == 0) break block113;
                                                        v22 = var5_4;
                                                        v23 = var52_40;
                                                        v24 = var59_47 - 1;
                                                        v25 = var55_44;
                                                        if (!var19_16) break block120;
                                                        if (v22.b((int)v23, v24, v25).b() != net.minecraft.u.g.bv) break block113;
                                                        var51_39.a((int)(var52_40 + var3_2 * 16), 0, var55_44 + var4_3 * 16);
                                                        v22 = var5_4;
                                                        v23 = var52_40;
                                                        v24 = var59_47 - 1;
                                                        v25 = var55_44;
                                                    }
                                                    v22.a((int)v23, v24, v25, this.d.c((n)var51_39).B.b().d());
                                                }
                                                --var59_47;
                                            }
                                            if (var19_16) continue;
                                        }
                                    }
                                    ++var55_44;
                                    if (var19_16) continue block7;
                                }
                                break;
                            }
                            ++var52_40;
                            if (var19_16) continue block5;
                        }
                        break;
                    }
                    v18 = var27_20;
                }
                if (v18 != 0) {
                    if (var19_16 != false) return;
                }
            }
            ++var15_11;
        } while (var19_16);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        e = net.minecraft.u.g.bq.d();
        h = net.minecraft.u.g.bf.d();
        f = net.minecraft.u.g.bC.d();
        g = net.minecraft.u.g.aQ.d();
    }
}

