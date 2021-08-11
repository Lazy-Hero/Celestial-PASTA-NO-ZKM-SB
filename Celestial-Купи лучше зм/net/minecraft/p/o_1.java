/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.by;
import net.minecraft.W.k;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class o
extends a {
    private final /* synthetic */ K a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, n var3_3) {
        block89: {
            block90: {
                block88: {
                    block80: {
                        var5_4 = this.a;
                        var4_5 = net.minecraft.p.a.d();
                        if (var5_4 == null) {
                            var5_4 = var2_2.nextBoolean() != false ? g.a1 : g.db;
                        }
                        var6_6 = var2_2.nextInt(3) + 4;
                        v0 = var2_2.nextInt(12);
                        if (!var4_5) {
                            if (v0 == 0) {
                                var6_6 *= 2;
                            }
                            v0 = 1;
                        }
                        var7_7 = v0;
                        v1 = var3_3.b();
                        if (var4_5 != false) return (boolean)v1;
                        if (v1 < 1) return (boolean)0;
                        v1 = var3_3.b() + var6_6 + 1;
                        if (var4_5 != false) return (boolean)v1;
                        if (v1 >= 256) return (boolean)0;
                        var8_8 = var3_3.b();
                        block0: while (true) {
                            v2 = var8_8;
                            block1: while (v2 <= var3_3.b() + 1 + var6_6) {
                                block82: {
                                    block81: {
                                        var9_10 = 3;
                                        v3 = var8_8;
                                        if (var4_5) break block80;
                                        if (var4_5) break block81;
                                        if (v3 > var3_3.b() + 3) break block82;
                                        v4 = false;
                                    }
                                    var9_10 = v4;
                                }
                                var10_13 = new net.minecraft.k.o();
                                var11_15 = var3_3.e() - var9_10;
                                block2: while (true) {
                                    v5 = var11_15;
                                    block3: while (v5 <= var3_3.e() + var9_10) {
                                        v2 = var7_7;
                                        if (var4_5) continue block1;
                                        if (!var4_5) {
                                            if (v2 == 0) break block2;
                                            v6 = var12_18 = var3_3.a() - var9_10;
                                        }
                                        while (var12_18 <= var3_3.a() + var9_10) {
                                            block87: {
                                                block83: {
                                                    block84: {
                                                        block86: {
                                                            block85: {
                                                                v5 = var7_7;
                                                                if (var4_5) continue block3;
                                                                if (!var4_5) {
                                                                    if (v5 == 0) break;
                                                                    v7 = var8_8;
                                                                }
                                                                if (var4_5) break block83;
                                                                if (v7 < 0) break block84;
                                                                v7 = var8_8;
                                                                if (var4_5) break block83;
                                                                if (v7 >= 256) break block84;
                                                                v8 = var13_19 = var1_1.d(var10_13.a(var11_15, var8_8, var12_18)).o();
                                                                v9 = c.A;
                                                                if (var4_5) break block85;
                                                                if (v8 == v9) break block86;
                                                                v8 = var13_19;
                                                                v9 = c.J;
                                                            }
                                                            if (v8 != v9) {
                                                                var7_7 = 0;
                                                            }
                                                        }
                                                        if (!var4_5) break block87;
                                                    }
                                                    v7 = 0;
                                                }
                                                var7_7 = v7;
                                            }
                                            ++var12_18;
                                            if (!var4_5) continue;
                                        }
                                        ++var11_15;
                                        if (!var4_5) continue block2;
                                    }
                                    break;
                                }
                                ++var8_8;
                                if (!var4_5) continue block0;
                            }
                            break;
                        }
                        v3 = var7_7;
                    }
                    if (var4_5 != false) return (boolean)v3;
                    if (v3 == 0) {
                        return (boolean)0;
                    }
                    v10 = var8_9 = var1_1.d(var3_3.k()).b();
                    if (var4_5) break block88;
                    if (v10 == g.bv) break block89;
                    v10 = var8_9;
                }
                if (var4_5) break block90;
                if (v10 == g.aU) break block89;
                v10 = var8_9;
            }
            if (v10 != g.a8) {
                return false;
            }
        }
        var9_11 = var3_3.b() + var6_6;
        if (var5_4 == g.db) {
            var9_12 = var3_3.b() + var6_6 - 3;
        }
        var10_14 = var9_12;
        block5: while (true) {
            v11 = var10_14;
            block6: while (v11 <= var3_3.b() + var6_6) {
                var11_15 = 1;
                v12 = var10_14;
                v13 = var3_3.b() + var6_6;
                if (var4_5) ** GOTO lbl298
                if (v12 < v13) {
                    ++var11_15;
                }
                if (var5_4 == g.a1) {
                    var11_15 = 3;
                }
                var12_18 = var3_3.e() - var11_15;
                var13_20 = var3_3.e() + var11_15;
                var14_21 = var3_3.a() - var11_15;
                var15_22 = var3_3.a() + var11_15;
                var16_23 = var12_18;
                block7: while (true) {
                    v14 = var16_23;
                    v15 = var13_20;
                    block8: while (v14 <= v15) {
                        v11 = var14_21;
                        if (var4_5) continue block6;
                        var17_24 = v11;
                        while (var17_24 <= var15_22) {
                            block126: {
                                block107: {
                                    block125: {
                                        block124: {
                                            block123: {
                                                block101: {
                                                    block122: {
                                                        block120: {
                                                            block121: {
                                                                block118: {
                                                                    block119: {
                                                                        block116: {
                                                                            block117: {
                                                                                block114: {
                                                                                    block115: {
                                                                                        block112: {
                                                                                            block113: {
                                                                                                block110: {
                                                                                                    block111: {
                                                                                                        block108: {
                                                                                                            block109: {
                                                                                                                block104: {
                                                                                                                    block105: {
                                                                                                                        block106: {
                                                                                                                            block102: {
                                                                                                                                block103: {
                                                                                                                                    block100: {
                                                                                                                                        block99: {
                                                                                                                                            block98: {
                                                                                                                                                block97: {
                                                                                                                                                    block95: {
                                                                                                                                                        block96: {
                                                                                                                                                            block94: {
                                                                                                                                                                block93: {
                                                                                                                                                                    block91: {
                                                                                                                                                                        block92: {
                                                                                                                                                                            var18_25 = 5;
                                                                                                                                                                            v14 = var16_23;
                                                                                                                                                                            v15 = var12_18;
                                                                                                                                                                            if (var4_5) continue block8;
                                                                                                                                                                            if (var4_5) break block91;
                                                                                                                                                                            if (v14 != v15) break block92;
                                                                                                                                                                            --var18_25;
                                                                                                                                                                            if (!var4_5) break block93;
                                                                                                                                                                        }
                                                                                                                                                                        v16 = var16_23;
                                                                                                                                                                        v17 = var13_20;
                                                                                                                                                                    }
                                                                                                                                                                    if (var4_5) break block94;
                                                                                                                                                                    if (v16 == v17) {
                                                                                                                                                                        ++var18_25;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v16 = var17_24;
                                                                                                                                                                v17 = var14_21;
                                                                                                                                                            }
                                                                                                                                                            if (var4_5) break block95;
                                                                                                                                                            if (v16 != v17) break block96;
                                                                                                                                                            var18_25 -= 3;
                                                                                                                                                            if (!var4_5) break block97;
                                                                                                                                                        }
                                                                                                                                                        v16 = var17_24;
                                                                                                                                                        if (var4_5) break block98;
                                                                                                                                                        v17 = var15_22;
                                                                                                                                                    }
                                                                                                                                                    if (v16 == v17) {
                                                                                                                                                        var18_25 += 3;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v16 = var18_25;
                                                                                                                                            }
                                                                                                                                            var19_26 = k.a(v16);
                                                                                                                                            if (var5_4 == g.a1) break block99;
                                                                                                                                            v18 = var10_14;
                                                                                                                                            v19 = var3_3.b() + var6_6;
                                                                                                                                            if (var4_5) break block100;
                                                                                                                                            if (v18 >= v19) break block101;
                                                                                                                                        }
                                                                                                                                        v18 = var16_23;
                                                                                                                                        v19 = var12_18;
                                                                                                                                    }
                                                                                                                                    if (var4_5) break block102;
                                                                                                                                    if (v18 == v19) break block103;
                                                                                                                                    v18 = var16_23;
                                                                                                                                    v19 = var13_20;
                                                                                                                                    if (var4_5) break block104;
                                                                                                                                    if (v18 != v19) break block105;
                                                                                                                                }
                                                                                                                                v18 = var17_24;
                                                                                                                                v19 = var14_21;
                                                                                                                            }
                                                                                                                            if (var4_5) break block106;
                                                                                                                            if (v18 == v19) break block107;
                                                                                                                            v18 = var17_24;
                                                                                                                            v19 = var15_22;
                                                                                                                        }
                                                                                                                        if (var4_5) break block104;
                                                                                                                        if (v18 == v19 && !var4_5) break block107;
                                                                                                                    }
                                                                                                                    v18 = var16_23;
                                                                                                                    v19 = var3_3.e() - (var11_15 - 1);
                                                                                                                }
                                                                                                                if (var4_5) break block108;
                                                                                                                if (v18 != v19) break block109;
                                                                                                                v18 = var17_24;
                                                                                                                v19 = var14_21;
                                                                                                                if (var4_5) break block108;
                                                                                                                if (v18 == v19) {
                                                                                                                    var19_26 = k.NORTH_WEST;
                                                                                                                }
                                                                                                            }
                                                                                                            v18 = var16_23;
                                                                                                            v19 = var12_18;
                                                                                                        }
                                                                                                        if (var4_5) break block110;
                                                                                                        if (v18 != v19) break block111;
                                                                                                        v18 = var17_24;
                                                                                                        v19 = var3_3.a() - (var11_15 - 1);
                                                                                                        if (var4_5) break block110;
                                                                                                        if (v18 == v19) {
                                                                                                            var19_26 = k.NORTH_WEST;
                                                                                                        }
                                                                                                    }
                                                                                                    v18 = var16_23;
                                                                                                    v19 = var3_3.e() + (var11_15 - 1);
                                                                                                }
                                                                                                if (var4_5) break block112;
                                                                                                if (v18 != v19) break block113;
                                                                                                v18 = var17_24;
                                                                                                v19 = var14_21;
                                                                                                if (var4_5) break block112;
                                                                                                if (v18 == v19) {
                                                                                                    var19_26 = k.NORTH_EAST;
                                                                                                }
                                                                                            }
                                                                                            v18 = var16_23;
                                                                                            v19 = var13_20;
                                                                                        }
                                                                                        if (var4_5) break block114;
                                                                                        if (v18 != v19) break block115;
                                                                                        v18 = var17_24;
                                                                                        v19 = var3_3.a() - (var11_15 - 1);
                                                                                        if (var4_5) break block114;
                                                                                        if (v18 == v19) {
                                                                                            var19_26 = k.NORTH_EAST;
                                                                                        }
                                                                                    }
                                                                                    v18 = var16_23;
                                                                                    v19 = var3_3.e() - (var11_15 - 1);
                                                                                }
                                                                                if (var4_5) break block116;
                                                                                if (v18 != v19) break block117;
                                                                                v18 = var17_24;
                                                                                v19 = var15_22;
                                                                                if (var4_5) break block116;
                                                                                if (v18 == v19) {
                                                                                    var19_26 = k.SOUTH_WEST;
                                                                                }
                                                                            }
                                                                            v18 = var16_23;
                                                                            v19 = var12_18;
                                                                        }
                                                                        if (var4_5) break block118;
                                                                        if (v18 != v19) break block119;
                                                                        v18 = var17_24;
                                                                        v19 = var3_3.a() + (var11_15 - 1);
                                                                        if (var4_5) break block118;
                                                                        if (v18 == v19) {
                                                                            var19_26 = k.SOUTH_WEST;
                                                                        }
                                                                    }
                                                                    v18 = var16_23;
                                                                    v19 = var3_3.e() + (var11_15 - 1);
                                                                }
                                                                if (var4_5) break block120;
                                                                if (v18 != v19) break block121;
                                                                v18 = var17_24;
                                                                v19 = var15_22;
                                                                if (var4_5) break block120;
                                                                if (v18 == v19) {
                                                                    var19_26 = k.SOUTH_EAST;
                                                                }
                                                            }
                                                            v18 = var16_23;
                                                            v19 = var13_20;
                                                        }
                                                        if (var4_5) break block122;
                                                        if (v18 != v19) break block101;
                                                        v18 = var17_24;
                                                        v19 = var3_3.a() + (var11_15 - 1);
                                                    }
                                                    if (v18 == v19) {
                                                        var19_26 = k.SOUTH_EAST;
                                                    }
                                                }
                                                if (var19_26 != k.CENTER) break block123;
                                                v20 = var10_14;
                                                v21 = var3_3.b() + var6_6;
                                                if (var4_5) break block124;
                                                if (v20 < v21) {
                                                    var19_26 = k.ALL_INSIDE;
                                                }
                                            }
                                            v22 = var3_3;
                                            if (var4_5) break block125;
                                            v20 = v22.b();
                                            v21 = var3_3.b() + var6_6 - 1;
                                        }
                                        if (v20 < v21 && var19_26 == k.ALL_INSIDE) break block107;
                                        v22 = var20_27 = new n(var16_23, var10_14, var17_24);
                                    }
                                    if (var4_5) break block126;
                                    if (!var1_1.d(var20_27).m()) {
                                        this.a(var1_1, var20_27, var5_4.d().a(by.z, var19_26));
                                    }
                                }
                                ++var17_24;
                            }
                            if (!var4_5) continue;
                        }
                        ++var16_23;
                        if (!var4_5) continue block7;
                    }
                    break;
                }
                ++var10_14;
                if (!var4_5) continue block5;
            }
            break;
        }
        var10_14 = 0;
        do {
            v12 = var10_14;
            v13 = var6_6;
lbl298:
            // 2 sources

            if (v12 >= v13) return true;
            var11_17 = var1_1.d(var3_3.c(var10_14));
            if (var4_5) continue;
            v23 = var11_17.m();
            if (var4_5 != false) return v23;
            if (!v23) {
                this.a(var1_1, var3_3.c(var10_14), var5_4.d().a(by.z, k.STEM));
            }
            ++var10_14;
        } while (!var4_5);
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public o() {
        super(false);
        this.a = null;
    }

    public o(K k2) {
        super(true);
        this.a = k2;
    }
}

