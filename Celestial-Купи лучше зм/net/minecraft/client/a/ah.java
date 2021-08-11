/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.W.bq;
import net.minecraft.W.cu;
import net.minecraft.W.dm;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.j.j;
import net.minecraft.client.z.m;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class ah {
    private final /* synthetic */ m b;
    private /* synthetic */ net.minecraft.client.j.c c;
    private final /* synthetic */ net.minecraft.client.j.c[] d;
    private final /* synthetic */ net.minecraft.client.j.c[] a;

    public ah(m m2) {
        this.d = new net.minecraft.client.j.c[2];
        this.a = new net.minecraft.client.j.c[2];
        this.b = m2;
        this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean a(t var1_1, i var2_2, n var3_3, I var4_4) {
        block66: {
            block67: {
                var5_5 = I.j();
                try {
                    block70: {
                        block71: {
                            block74: {
                                block72: {
                                    block73: {
                                        block68: {
                                            block69: {
                                                if (fU.ag()) {
                                                    fX.a(var2_2, var3_3, var1_1, var4_4);
                                                }
                                                var7_6 = (bq)var2_2.b();
                                                var8_7 = var2_2.o() == net.minecraft.ac.c.g ? 1 : 0;
                                                var9_8 = var8_7 != 0 ? this.d : this.a;
                                                var10_9 = var4_4.a(var1_1, var2_2, var3_3);
                                                var11_10 = fa.a(var1_1, var2_2, var3_3, var10_9);
                                                var12_11 = (float)(var11_10 >> 16 & 255) / 255.0f;
                                                var13_12 = (float)(var11_10 >> 8 & 255) / 255.0f;
                                                var14_13 = (float)(var11_10 & 255) / 255.0f;
                                                var15_14 = var2_2.d(var1_1, var3_3, aA.UP);
                                                var16_15 = var2_2.d(var1_1, var3_3, aA.DOWN);
                                                var17_16 = var10_9.k();
                                                var17_16[0] = var2_2.d(var1_1, var3_3, aA.NORTH);
                                                var17_16[1] = var2_2.d(var1_1, var3_3, aA.SOUTH);
                                                var17_16[2] = var2_2.d(var1_1, var3_3, aA.WEST);
                                                var17_16[3] = var2_2.d(var1_1, var3_3, aA.EAST);
                                                v0 = var15_14;
                                                if (var5_5 != null) break block68;
                                                if (v0 != 0) break block69;
                                                v0 = var16_15;
                                                if (var5_5 != null) break block68;
                                                if (v0 != 0) break block69;
                                                v0 = var17_16[0];
                                                if (var5_5 != null) break block68;
                                                if (v0 != 0) break block69;
                                                v0 = var17_16[1];
                                                if (var5_5 != null) break block68;
                                                if (v0 != 0) break block69;
                                                v0 = var17_16[2];
                                                if (var5_5 != null) break block68;
                                                if (v0 != 0) break block69;
                                                v1 = var17_16[3];
                                                if (var5_5 == null) {
                                                    if (!v1) break block66;
                                                }
                                                ** GOTO lbl321
                                            }
                                            v0 = 0;
                                        }
                                        var6_17 = v0;
                                        var18_19 = 0.5f;
                                        var19_20 = 1.0f;
                                        var20_21 = 0.8f;
                                        var21_22 = 0.6f;
                                        var22_23 = var2_2.o();
                                        var23_24 = this.a(var1_1, var3_3, var22_23);
                                        var24_25 = this.a(var1_1, var3_3.j(), var22_23);
                                        var25_26 = this.a(var1_1, var3_3.m().j(), var22_23);
                                        var26_27 = this.a(var1_1, var3_3.m(), var22_23);
                                        var27_28 = var3_3.e();
                                        var29_29 = var3_3.b();
                                        var31_30 = var3_3.a();
                                        var33_31 = 0.001f;
                                        v2 = var15_14;
                                        if (var5_5 != null) break block70;
                                        if (v2 == 0) break block71;
                                        var6_17 = 1;
                                        var34_32 = bq.a(var1_1, var3_3, var22_23, var2_2);
                                        var35_34 = var34_32 > -999.0f ? var9_8[1] : var9_8[0];
                                        var4_4.a(var35_34);
                                        var23_24 -= 0.001f;
                                        var24_25 -= 0.001f;
                                        var25_26 -= 0.001f;
                                        var26_27 -= 0.001f;
                                        v3 = var34_32;
                                        v4 = -999.0f;
                                        if (var5_5 != null) break block72;
                                        if (!(v3 < v4)) break block73;
                                        var36_37 = var35_34.a(0.0);
                                        var40_39 = var35_34.b(0.0);
                                        var37_42 = var36_37;
                                        var41_44 = var35_34.b(16.0);
                                        var38_47 = var35_34.a(16.0);
                                        var42_50 = var41_44;
                                        var39_53 = var38_47;
                                        var43_56 = var40_39;
                                        if (var5_5 == null) break block74;
                                    }
                                    v3 = h.g(var34_32);
                                    v4 = 0.25f;
                                }
                                var44_59 = v3 * v4;
                                var45_61 = h.c(var34_32) * 0.25f;
                                var46_64 = 8.0f;
                                var36_37 = var35_34.a((double)(8.0f + (-var45_61 - var44_59) * 16.0f));
                                var40_39 = var35_34.b((double)(8.0f + (-var45_61 + var44_59) * 16.0f));
                                var37_42 = var35_34.a((double)(8.0f + (-var45_61 + var44_59) * 16.0f));
                                var41_44 = var35_34.b((double)(8.0f + (var45_61 + var44_59) * 16.0f));
                                var38_47 = var35_34.a((double)(8.0f + (var45_61 + var44_59) * 16.0f));
                                var42_50 = var35_34.b((double)(8.0f + (var45_61 - var44_59) * 16.0f));
                                var39_53 = var35_34.a((double)(8.0f + (var45_61 - var44_59) * 16.0f));
                                var43_56 = var35_34.b((double)(8.0f + (-var45_61 - var44_59) * 16.0f));
                            }
                            var44_60 = var2_2.e(var1_1, var3_3);
                            var45_62 = var44_60 >> 16 & 65535;
                            var46_65 = var44_60 & 65535;
                            var47_66 = 1.0f * var12_11;
                            var48_68 = 1.0f * var13_12;
                            var49_69 = 1.0f * var14_13;
                            var4_4.c(var27_28 + 0.0, var29_29 + (double)var23_24, var31_30 + 0.0).a(var47_66, var48_68, var49_69, 1.0f).a(var36_37, var40_39).a(var45_62, var46_65).d();
                            var4_4.c(var27_28 + 0.0, var29_29 + (double)var24_25, var31_30 + 1.0).a(var47_66, var48_68, var49_69, 1.0f).a(var37_42, var41_44).a(var45_62, var46_65).d();
                            var4_4.c(var27_28 + 1.0, var29_29 + (double)var25_26, var31_30 + 1.0).a(var47_66, var48_68, var49_69, 1.0f).a(var38_47, var42_50).a(var45_62, var46_65).d();
                            var4_4.c(var27_28 + 1.0, var29_29 + (double)var26_27, var31_30 + 0.0).a(var47_66, var48_68, var49_69, 1.0f).a(var39_53, var43_56).a(var45_62, var46_65).d();
                            v2 = var7_6.c(var1_1, var3_3.a()) ? 1 : 0;
                            if (var5_5 != null) break block70;
                            if (v2 != 0) {
                                var4_4.c(var27_28 + 0.0, var29_29 + (double)var23_24, var31_30 + 0.0).a(var47_66, var48_68, var49_69, 1.0f).a(var36_37, var40_39).a(var45_62, var46_65).d();
                                var4_4.c(var27_28 + 1.0, var29_29 + (double)var26_27, var31_30 + 0.0).a(var47_66, var48_68, var49_69, 1.0f).a(var39_53, var43_56).a(var45_62, var46_65).d();
                                var4_4.c(var27_28 + 1.0, var29_29 + (double)var25_26, var31_30 + 1.0).a(var47_66, var48_68, var49_69, 1.0f).a(var38_47, var42_50).a(var45_62, var46_65).d();
                                var4_4.c(var27_28 + 0.0, var29_29 + (double)var24_25, var31_30 + 1.0).a(var47_66, var48_68, var49_69, 1.0f).a(var37_42, var41_44).a(var45_62, var46_65).d();
                            }
                        }
                        v2 = var16_15;
                    }
                    if (var5_5 == null) {
                        if (v2 != 0) {
                            var34_32 = var9_8[0].i();
                            var35_35 = var9_8[0].l();
                            var36_37 = var9_8[0].u();
                            var37_42 = var9_8[0].m();
                            var38_48 = var2_2.e(var1_1, var3_3.k());
                            var39_54 = var38_48 >> 16 & 65535;
                            var40_40 = var38_48 & 65535;
                            var4_4.c(var27_28, var29_29, var31_30 + 1.0).a(var12_11 * 0.5f, var13_12 * 0.5f, var14_13 * 0.5f, 1.0f).a(var34_32, var37_42).a(var39_54, var40_40).d();
                            var4_4.c(var27_28, var29_29, var31_30).a(var12_11 * 0.5f, var13_12 * 0.5f, var14_13 * 0.5f, 1.0f).a(var34_32, var36_37).a(var39_54, var40_40).d();
                            var4_4.c(var27_28 + 1.0, var29_29, var31_30).a(var12_11 * 0.5f, var13_12 * 0.5f, var14_13 * 0.5f, 1.0f).a(var35_35, var36_37).a(var39_54, var40_40).d();
                            var4_4.c(var27_28 + 1.0, var29_29, var31_30 + 1.0).a(var12_11 * 0.5f, var13_12 * 0.5f, var14_13 * 0.5f, 1.0f).a(var35_35, var37_42).a(var39_54, var40_40).d();
                            var6_17 = 1;
                        }
                        v2 = var34_33 = 0;
                    }
                    while (var34_33 < 4) {
                        block97: {
                            block88: {
                                block95: {
                                    block96: {
                                        block91: {
                                            block94: {
                                                block92: {
                                                    block93: {
                                                        block89: {
                                                            block90: {
                                                                block87: {
                                                                    block75: {
                                                                        block76: {
                                                                            block85: {
                                                                                block86: {
                                                                                    block84: {
                                                                                        block83: {
                                                                                            block81: {
                                                                                                block82: {
                                                                                                    block77: {
                                                                                                        block78: {
                                                                                                            block80: {
                                                                                                                block79: {
                                                                                                                    var35_36 = 0;
                                                                                                                    var36_38 = 0;
                                                                                                                    v5 = var34_33;
                                                                                                                    if (var5_5 != null) break block67;
                                                                                                                    if (var5_5 == null) {
                                                                                                                        if (v5 == 0) {
                                                                                                                            --var36_38;
                                                                                                                        }
                                                                                                                        v6 = var34_33;
                                                                                                                    }
                                                                                                                    v7 = 1;
                                                                                                                    if (var5_5 == null) {
                                                                                                                        if (v6 == v7) {
                                                                                                                            ++var36_38;
                                                                                                                        }
                                                                                                                        v6 = var34_33;
                                                                                                                        v7 = 2;
                                                                                                                    }
                                                                                                                    if (var5_5 == null) {
                                                                                                                        if (v6 == v7) {
                                                                                                                            --var35_36;
                                                                                                                        }
                                                                                                                        v6 = var34_33;
                                                                                                                        v7 = 3;
                                                                                                                    }
                                                                                                                    if (v6 == v7) {
                                                                                                                        ++var35_36;
                                                                                                                    }
                                                                                                                    var37_43 = var3_3.a(var35_36, 0, var36_38);
                                                                                                                    var38_49 = var9_8[1];
                                                                                                                    var4_4.a(var38_49);
                                                                                                                    var39_55 = 0.0f;
                                                                                                                    var40_41 = 0.0f;
                                                                                                                    v8 = var8_7;
                                                                                                                    if (var5_5 != null) break block75;
                                                                                                                    if (v8 != 0) break block76;
                                                                                                                    var41_45 = var1_1.d(var37_43);
                                                                                                                    var42_51 = var41_45.b();
                                                                                                                    if (var5_5 != null) break block77;
                                                                                                                    if (var42_51 == g.a) break block78;
                                                                                                                    v9 = var42_51;
                                                                                                                    if (var5_5 != null) break block79;
                                                                                                                    if (v9 == g.a5) break block78;
                                                                                                                    v9 = var42_51;
                                                                                                                }
                                                                                                                v10 = g.bX;
                                                                                                                if (var5_5 != null) break block80;
                                                                                                                if (v9 == v10) break block78;
                                                                                                                v9 = var42_51;
                                                                                                                v10 = g.t;
                                                                                                            }
                                                                                                            if (var5_5 != null) break block81;
                                                                                                            if (v9 != v10) break block82;
                                                                                                        }
                                                                                                        var38_49 = this.c;
                                                                                                    }
                                                                                                    var4_4.a(var38_49);
                                                                                                }
                                                                                                v9 = var42_51;
                                                                                                v10 = g.cU;
                                                                                            }
                                                                                            if (var5_5 != null) break block83;
                                                                                            if (v9 == v10) break block84;
                                                                                            v9 = var42_51;
                                                                                            if (var5_5 != null) break block85;
                                                                                            v10 = g.ci;
                                                                                        }
                                                                                        if (v9 != v10) break block86;
                                                                                    }
                                                                                    var39_55 = 0.9375f;
                                                                                    var40_41 = 0.9375f;
                                                                                }
                                                                                v9 = var42_51;
                                                                            }
                                                                            v8 = v9 instanceof cu;
                                                                            if (var5_5 != null) break block75;
                                                                            if (v8 == 0) break block76;
                                                                            var43_57 = (cu)var42_51;
                                                                            v8 = var43_57.b() ? 1 : 0;
                                                                            if (var5_5 != null) break block75;
                                                                            if (v8 == 0 && var41_45.b(cu.B) == dm.BOTTOM) {
                                                                                var39_55 = 0.5f;
                                                                                var40_41 = 0.5f;
                                                                            }
                                                                        }
                                                                        v8 = var17_16[var34_33];
                                                                    }
                                                                    if (var5_5 != null) break block87;
                                                                    if (v8 == 0) break block88;
                                                                    v8 = var34_33;
                                                                }
                                                                if (var5_5 != null) break block89;
                                                                if (v8 != 0) break block90;
                                                                var41_46 = var23_24;
                                                                var42_52 = var26_27;
                                                                var43_58 = var27_28;
                                                                var47_67 = var27_28 + 1.0;
                                                                var45_63 = var31_30 + 0.0010000000474974513;
                                                                var49_70 = var31_30 + 0.0010000000474974513;
                                                                if (var5_5 == null) break block91;
                                                            }
                                                            v8 = var34_33;
                                                        }
                                                        v11 = 1;
                                                        if (var5_5 != null) break block92;
                                                        if (v8 != v11) break block93;
                                                        var41_46 = var25_26;
                                                        var42_52 = var24_25;
                                                        var43_58 = var27_28 + 1.0;
                                                        var47_67 = var27_28;
                                                        var45_63 = var31_30 + 1.0 - 0.0010000000474974513;
                                                        var49_70 = var31_30 + 1.0 - 0.0010000000474974513;
                                                        if (var5_5 == null) break block91;
                                                    }
                                                    v8 = var34_33;
                                                    v11 = 2;
                                                }
                                                if (v8 != v11) break block94;
                                                var41_46 = var24_25;
                                                var42_52 = var23_24;
                                                var43_58 = var27_28 + 0.0010000000474974513;
                                                var47_67 = var27_28 + 0.0010000000474974513;
                                                var45_63 = var31_30 + 1.0;
                                                var49_70 = var31_30;
                                                if (var5_5 == null) break block91;
                                            }
                                            var41_46 = var26_27;
                                            var42_52 = var25_26;
                                            var43_58 = var27_28 + 1.0 - 0.0010000000474974513;
                                            var47_67 = var27_28 + 1.0 - 0.0010000000474974513;
                                            var45_63 = var31_30;
                                            var49_70 = var31_30 + 1.0;
                                        }
                                        v12 = var41_46 == var39_55 ? 0 : (var41_46 > var39_55 ? 1 : -1);
                                        if (var5_5 != null) break block95;
                                        if (v12 > 0) break block96;
                                        v12 = var42_52 == var40_41 ? 0 : (var42_52 > var40_41 ? 1 : -1);
                                        if (var5_5 != null) break block95;
                                        if (v12 <= 0) break block88;
                                    }
                                    var39_55 = Math.min(var39_55, var41_46);
                                    var40_41 = Math.min(var40_41, var42_52);
                                    v12 = var39_55 == var33_31 ? 0 : (var39_55 > var33_31 ? 1 : -1);
                                }
                                if (var5_5 == null) {
                                    if (v12 > 0) {
                                        var39_55 -= var33_31;
                                    }
                                    v12 = var40_41 == var33_31 ? 0 : (var40_41 > var33_31 ? 1 : -1);
                                }
                                if (var5_5 == null) {
                                    if (v12 > 0) {
                                        var40_41 -= var33_31;
                                    }
                                    v12 = (float)true;
                                }
                                var6_17 = (int)v12;
                                var51_71 = var38_49.a(0.0);
                                var52_72 = var38_49.a(8.0);
                                var53_73 = var38_49.b((double)((1.0f - var41_46) * 16.0f * 0.5f));
                                var54_74 = var38_49.b((double)((1.0f - var42_52) * 16.0f * 0.5f));
                                var55_75 = var38_49.b(8.0);
                                var56_76 = var38_49.b((double)((1.0f - var39_55) * 16.0f * 0.5f));
                                var57_77 = var38_49.b((double)((1.0f - var40_41) * 16.0f * 0.5f));
                                var58_78 = var2_2.e(var1_1, var37_43);
                                var59_79 = var58_78 >> 16 & 65535;
                                var60_80 = var58_78 & 65535;
                                var61_81 = var34_33 < 2 ? 0.8f : 0.6f;
                                var62_82 = 1.0f * var61_81 * var12_11;
                                var63_83 = 1.0f * var61_81 * var13_12;
                                var64_84 = 1.0f * var61_81 * var14_13;
                                var4_4.c(var43_58, var29_29 + (double)var41_46, var45_63).a(var62_82, var63_83, var64_84, 1.0f).a(var51_71, var53_73).a(var59_79, var60_80).d();
                                var4_4.c(var47_67, var29_29 + (double)var42_52, var49_70).a(var62_82, var63_83, var64_84, 1.0f).a(var52_72, var54_74).a(var59_79, var60_80).d();
                                var4_4.c(var47_67, var29_29 + (double)var40_41, var49_70).a(var62_82, var63_83, var64_84, 1.0f).a(var52_72, var57_77).a(var59_79, var60_80).d();
                                var4_4.c(var43_58, var29_29 + (double)var39_55, var45_63).a(var62_82, var63_83, var64_84, 1.0f).a(var51_71, var56_76).a(var59_79, var60_80).d();
                                if (var5_5 != null) break block97;
                                if (var38_49 != this.c) {
                                    var4_4.c(var43_58, var29_29 + (double)var39_55, var45_63).a(var62_82, var63_83, var64_84, 1.0f).a(var51_71, var56_76).a(var59_79, var60_80).d();
                                    var4_4.c(var47_67, var29_29 + (double)var40_41, var49_70).a(var62_82, var63_83, var64_84, 1.0f).a(var52_72, var57_77).a(var59_79, var60_80).d();
                                    var4_4.c(var47_67, var29_29 + (double)var42_52, var49_70).a(var62_82, var63_83, var64_84, 1.0f).a(var52_72, var54_74).a(var59_79, var60_80).d();
                                    var4_4.c(var43_58, var29_29 + (double)var41_46, var45_63).a(var62_82, var63_83, var64_84, 1.0f).a(var51_71, var53_73).a(var59_79, var60_80).d();
                                }
                            }
                            ++var34_33;
                        }
                        if (var5_5 == null) continue;
                    }
                    var4_4.a((net.minecraft.client.j.c)null);
                    var35_36 = var34_33 = var6_17;
                }
                catch (Throwable var65_85) {
                    if (fU.ag() == false) throw var65_85;
                    fX.g(var4_4);
                    throw var65_85;
                }
                v5 = fU.ag() ? 1 : 0;
            }
            if (var5_5 != null) return (boolean)v5;
            if (v5 != 0) {
                fX.g(var4_4);
            }
            v5 = var35_36;
            return (boolean)v5;
        }
        v1 = false;
lbl321:
        // 2 sources

        var6_18 = v1;
        v13 = fU.ag();
        if (var5_5 != null) return v13;
        if (v13) {
            fX.g(var4_4);
        }
        v13 = var6_18;
        return v13;
    }

    protected void a() {
        j j2 = Q.P().an();
        this.d[0] = j2.b("minecraft:blocks/lava_still");
        this.d[1] = j2.b("minecraft:blocks/lava_flow");
        this.a[0] = j2.b("minecraft:blocks/water_still");
        this.a[1] = j2.b("minecraft:blocks/water_flow");
        this.c = j2.b("minecraft:blocks/water_overlay");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private float a(t t2, n n2, c c10) {
        int n3 = 0;
        float f10 = 0.0f;
        String string = I.j();
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4;
            block12: {
                block11: {
                    i i3;
                    block10: {
                        c c11;
                        block9: {
                            c c12;
                            n n5 = n2.a(-(i2 & 1), 0, -(i2 >> 1 & 1));
                            i i4 = t2.d(n5.a());
                            if (string == null) {
                                if (i4.o() == c10) {
                                    return 1.0f;
                                }
                                i4 = t2.d(n5);
                            }
                            i3 = i4;
                            c11 = c12 = i3.o();
                            if (string != null) break block9;
                            if (c11 == c10) break block10;
                            c11 = c12;
                        }
                        if (c11.d()) continue;
                        f10 += 1.0f;
                        ++n3;
                        if (string == null) continue;
                    }
                    n4 = i3.b(bq.z);
                    if (string != null) break block11;
                    if (n4 < 8 && n4 != 0) break block12;
                    f10 += bq.a(n4) * 10.0f;
                }
                n3 += 10;
            }
            f10 += bq.a(n4);
            ++n3;
            if (string == null) continue;
        }
        return 1.0f - f10 / (float)n3;
    }
}

