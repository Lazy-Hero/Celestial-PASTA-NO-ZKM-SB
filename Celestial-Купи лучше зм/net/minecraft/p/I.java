/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class I
extends a {
    private final /* synthetic */ K a;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, n var3_3) {
        block91: {
            block92: {
                block68: {
                    block67: {
                        block66: {
                            block65: {
                                var3_3 = var3_3.a(-8, 0, -8);
                                var4_4 = net.minecraft.p.a.d();
                                while (var3_3.b() > 5) {
                                    v0 = var1_1.a(var3_3) ? 1 : 0;
                                    if (!var4_4 && !var4_4) {
                                        if (v0 == 0) break;
                                        var3_3 = var3_3.k();
                                        if (!var4_4) continue;
                                    }
                                    break block65;
                                }
                                v0 = var3_3.b();
                            }
                            if (!var4_4) {
                                if (v0 <= 4) {
                                    return false;
                                }
                                var3_3 = var3_3.a(4);
                                v0 = 2048;
                            }
                            var5_5 = new boolean[v0];
                            var6_6 = var2_2.nextInt(4) + 4;
                            var7_7 = 0;
                            block1: while (true) {
                                v1 = var7_7;
                                block2: while (v1 < var6_6) {
                                    var8_8 = var2_2.nextDouble() * 6.0 + 3.0;
                                    var10_14 = var2_2.nextDouble() * 4.0 + 2.0;
                                    var12_18 = var2_2.nextDouble() * 6.0 + 3.0;
                                    var14_19 = var2_2.nextDouble() * (16.0 - var8_8 - 2.0) + 1.0 + var8_8 / 2.0;
                                    var16_20 = var2_2.nextDouble() * (8.0 - var10_14 - 4.0) + 2.0 + var10_14 / 2.0;
                                    var18_21 = var2_2.nextDouble() * (16.0 - var12_18 - 2.0) + 1.0 + var12_18 / 2.0;
                                    v2 = 1;
                                    if (var4_4) break block66;
                                    var20_22 = v2;
                                    block3: while (true) {
                                        v3 = var20_22;
                                        block4: while (v3 < 15) {
                                            v1 = 1;
                                            if (var4_4) continue block2;
                                            var21_23 = v1;
                                            block5: while (true) {
                                                v4 = var21_23;
                                                block6: while (v4 < 15) {
                                                    v3 = 1;
                                                    if (var4_4) continue block4;
                                                    var22_24 = v3;
                                                    while (var22_24 < 7) {
                                                        var23_25 = ((double)var20_22 - var14_19) / (var8_8 / 2.0);
                                                        var25_26 = ((double)var22_24 - var16_20) / (var10_14 / 2.0);
                                                        var27_27 = ((double)var21_23 - var18_21) / (var12_18 / 2.0);
                                                        var29_28 = var23_25 * var23_25 + var25_26 * var25_26 + var27_27 * var27_27;
                                                        if (!var4_4) {
                                                            cfr_temp_0 = var29_28 - 1.0;
                                                            v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                            if (var4_4) continue block6;
                                                            if (v4 < 0) {
                                                                var5_5[(var20_22 * 16 + var21_23) * 8 + var22_24] = true;
                                                            }
                                                            ++var22_24;
                                                        }
                                                        if (!var4_4) continue;
                                                    }
                                                    ++var21_23;
                                                    if (!var4_4) continue block5;
                                                }
                                                break;
                                            }
                                            ++var20_22;
                                            if (!var4_4) continue block3;
                                        }
                                        break;
                                    }
                                    ++var7_7;
                                    if (!var4_4) continue block1;
                                }
                                break;
                            }
                            v2 = 0;
                        }
                        var7_7 = v2;
                        block8: while (true) {
                            v5 = var7_7;
                            block9: while (v5 < 16) {
                                v6 = 0;
                                if (var4_4) break block67;
                                var8_9 = v6;
                                block10: while (true) {
                                    v7 = var8_9;
                                    block11: while (v7 < 16) {
                                        v5 = 0;
                                        if (var4_4) continue block9;
                                        var9_29 = v5;
                                        while (var9_29 < 8) {
                                            block82: {
                                                block83: {
                                                    block85: {
                                                        block84: {
                                                            block72: {
                                                                block81: {
                                                                    block79: {
                                                                        block80: {
                                                                            block77: {
                                                                                block78: {
                                                                                    block75: {
                                                                                        block76: {
                                                                                            block73: {
                                                                                                block74: {
                                                                                                    block70: {
                                                                                                        block71: {
                                                                                                            block69: {
                                                                                                                v7 = var5_5[(var7_7 * 16 + var8_9) * 8 + var9_29];
                                                                                                                if (var4_4) continue block11;
                                                                                                                if (var4_4) break block69;
                                                                                                                if (v7 != 0) ** GOTO lbl-1000
                                                                                                                v8 = var7_7;
                                                                                                            }
                                                                                                            if (var4_4) break block70;
                                                                                                            if (v8 >= 15) break block71;
                                                                                                            v8 = var5_5[((var7_7 + 1) * 16 + var8_9) * 8 + var9_29];
                                                                                                            if (var4_4) break block72;
                                                                                                            if (v8 != 0) ** GOTO lbl-1000
                                                                                                        }
                                                                                                        v8 = var7_7;
                                                                                                    }
                                                                                                    if (var4_4) break block73;
                                                                                                    if (v8 <= 0) break block74;
                                                                                                    v8 = var5_5[((var7_7 - 1) * 16 + var8_9) * 8 + var9_29];
                                                                                                    if (var4_4) break block72;
                                                                                                    if (v8 != 0) ** GOTO lbl-1000
                                                                                                }
                                                                                                v8 = var8_9;
                                                                                            }
                                                                                            if (var4_4) break block75;
                                                                                            if (v8 >= 15) break block76;
                                                                                            v8 = var5_5[(var7_7 * 16 + var8_9 + 1) * 8 + var9_29];
                                                                                            if (var4_4) break block72;
                                                                                            if (v8 != 0) ** GOTO lbl-1000
                                                                                        }
                                                                                        v8 = var8_9;
                                                                                    }
                                                                                    if (var4_4) break block77;
                                                                                    if (v8 <= 0) break block78;
                                                                                    v8 = var5_5[(var7_7 * 16 + (var8_9 - 1)) * 8 + var9_29];
                                                                                    if (var4_4) break block72;
                                                                                    if (v8 != 0) ** GOTO lbl-1000
                                                                                }
                                                                                v8 = var9_29;
                                                                            }
                                                                            if (var4_4) break block79;
                                                                            if (v8 >= 7) break block80;
                                                                            v8 = var5_5[(var7_7 * 16 + var8_9) * 8 + var9_29 + 1];
                                                                            if (var4_4) break block72;
                                                                            if (v8 != 0) ** GOTO lbl-1000
                                                                        }
                                                                        v8 = var9_29;
                                                                    }
                                                                    if (var4_4) break block81;
                                                                    if (v8 <= 0) ** GOTO lbl-1000
                                                                    v8 = var5_5[(var7_7 * 16 + var8_9) * 8 + (var9_29 - 1)];
                                                                }
                                                                if (!var4_4) {
                                                                    ** if (v8 == 0) goto lbl-1000
                                                                }
                                                                break block72;
lbl-1000:
                                                                // 6 sources

                                                                {
                                                                    v8 = 1;
                                                                    ** GOTO lbl135
                                                                }
lbl-1000:
                                                                // 3 sources

                                                                {
                                                                    v8 = var10_15 = 0;
                                                                }
                                                            }
                                                            if (var4_4) break block82;
                                                            if (var10_15 == 0) break block83;
                                                            var11_30 = var1_1.d(var3_3.a(var7_7, var9_29, var8_9)).o();
                                                            v9 = var9_29;
                                                            v10 = 4;
                                                            if (var4_4) break block84;
                                                            if (v9 >= v10) {
                                                                v9 = var11_30.b() ? 1 : 0;
                                                                if (!var4_4) {
                                                                    if (v9 != 0) {
                                                                        return false;
                                                                    } else {
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                }
                                                            } else lbl-1000:
                                                            // 3 sources

                                                            {
                                                                v9 = var9_29;
                                                            }
                                                            if (var4_4) break block85;
                                                            v10 = 4;
                                                        }
                                                        if (v9 >= v10) break block83;
                                                        v9 = var11_30.d() ? 1 : 0;
                                                    }
                                                    if (v9 == 0 && var1_1.d(var3_3.a(var7_7, var9_29, var8_9)).b() != this.a) {
                                                        return false;
                                                    }
                                                }
                                                ++var9_29;
                                            }
                                            if (!var4_4) continue;
                                        }
                                        ++var8_9;
                                        if (!var4_4) continue block10;
                                    }
                                    break;
                                }
                                ++var7_7;
                                if (!var4_4) continue block8;
                            }
                            break;
                        }
                        v6 = 0;
                    }
                    var7_7 = v6;
                    block13: while (true) {
                        v11 = var7_7;
                        block14: while (v11 < 16) {
                            v12 = 0;
                            if (var4_4) break block68;
                            var8_10 = v12;
                            block15: while (true) {
                                v13 = var8_10;
                                block16: while (v13 < 16) {
                                    v11 = 0;
                                    if (var4_4) continue block14;
                                    for (var9_29 = v2046939; var9_29 < 8; ++var9_29) {
                                        v13 = var5_5[(var7_7 * 16 + var8_10) * 8 + var9_29];
                                        if (var4_4) continue block16;
                                        if (v13 == 0) continue;
                                        var1_1.a(var3_3.a(var7_7, var9_29, var8_10), var9_29 >= 4 ? g.bf.d() : this.a.d(), 2);
                                        if (!var4_4) continue;
                                    }
                                    ++var8_10;
                                    if (!var4_4) continue block15;
                                }
                                break;
                            }
                            ++var7_7;
                            if (!var4_4) continue block13;
                        }
                        break;
                    }
                    v12 = 0;
                }
                var7_7 = v12;
                block18: while (true) {
                    v14 = var7_7;
                    block19: while (v14 < 16) {
                        v15 = 0;
                        if (var4_4 != false) return (boolean)v15;
                        var8_11 = v15;
                        block20: while (true) {
                            v16 = var8_11;
                            block21: while (v16 < 16) {
                                v14 = 4;
                                if (var4_4) continue block19;
                                var9_29 = v14;
                                while (var9_29 < 8) {
                                    block87: {
                                        block86: {
                                            block90: {
                                                block89: {
                                                    block88: {
                                                        v16 = var5_5[(var7_7 * 16 + var8_11) * 8 + var9_29];
                                                        if (var4_4) continue block21;
                                                        if (v16 == 0) break block86;
                                                        var10_16 = var3_3.a(var7_7, var9_29 - 1, var8_11);
                                                        if (var4_4) break block87;
                                                        if (var1_1.d(var10_16).b() != g.bv) break block86;
                                                        v17 = var1_1;
                                                        if (var4_4) break block88;
                                                        if (v17.a(net.minecraft.ah.c.SKY, var3_3.a(var7_7, var9_29, var8_11)) <= 0) break block86;
                                                        v17 = var1_1;
                                                    }
                                                    var11_30 = v17.c(var10_16);
                                                    if (var4_4) break block89;
                                                    if (var11_30.B.b() != g.a8) break block90;
                                                    var1_1.a(var10_16, g.a8.d(), 2);
                                                }
                                                if (!var4_4) break block86;
                                            }
                                            var1_1.a(var10_16, g.aU.d(), 2);
                                        }
                                        ++var9_29;
                                    }
                                    if (!var4_4) continue;
                                }
                                ++var8_11;
                                if (!var4_4) continue block20;
                            }
                            break;
                        }
                        ++var7_7;
                        if (!var4_4) continue block18;
                    }
                    break;
                }
                v18 = this.a.d().o();
                v19 = c.g;
                if (var4_4) break block91;
                if (v18 != v19) break block92;
                var7_7 = 0;
                block23: while (true) {
                    v20 = var7_7;
                    block24: while (v20 < 16) {
                        v15 = 0;
                        if (var4_4 != false) return (boolean)v15;
                        var8_12 = v15;
                        block25: while (true) {
                            v21 = var8_12;
                            block26: while (v21 < 16) {
                                v20 = 0;
                                if (var4_4) continue block24;
                                var9_29 = v20;
                                while (var9_29 < 8) {
                                    block106: {
                                        block107: {
                                            block108: {
                                                block109: {
                                                    block96: {
                                                        block105: {
                                                            block103: {
                                                                block104: {
                                                                    block101: {
                                                                        block102: {
                                                                            block99: {
                                                                                block100: {
                                                                                    block97: {
                                                                                        block98: {
                                                                                            block94: {
                                                                                                block95: {
                                                                                                    block93: {
                                                                                                        v21 = var5_5[(var7_7 * 16 + var8_12) * 8 + var9_29];
                                                                                                        if (var4_4) continue block26;
                                                                                                        if (var4_4) break block93;
                                                                                                        if (v21 != 0) ** GOTO lbl-1000
                                                                                                        v22 = var7_7;
                                                                                                    }
                                                                                                    if (var4_4) break block94;
                                                                                                    if (v22 >= 15) break block95;
                                                                                                    v22 = var5_5[((var7_7 + 1) * 16 + var8_12) * 8 + var9_29];
                                                                                                    if (var4_4) break block96;
                                                                                                    if (v22 != 0) ** GOTO lbl-1000
                                                                                                }
                                                                                                v22 = var7_7;
                                                                                            }
                                                                                            if (var4_4) break block97;
                                                                                            if (v22 <= 0) break block98;
                                                                                            v22 = var5_5[((var7_7 - 1) * 16 + var8_12) * 8 + var9_29];
                                                                                            if (var4_4) break block96;
                                                                                            if (v22 != 0) ** GOTO lbl-1000
                                                                                        }
                                                                                        v22 = var8_12;
                                                                                    }
                                                                                    if (var4_4) break block99;
                                                                                    if (v22 >= 15) break block100;
                                                                                    v22 = var5_5[(var7_7 * 16 + var8_12 + 1) * 8 + var9_29];
                                                                                    if (var4_4) break block96;
                                                                                    if (v22 != 0) ** GOTO lbl-1000
                                                                                }
                                                                                v22 = var8_12;
                                                                            }
                                                                            if (var4_4) break block101;
                                                                            if (v22 <= 0) break block102;
                                                                            v22 = var5_5[(var7_7 * 16 + (var8_12 - 1)) * 8 + var9_29];
                                                                            if (var4_4) break block96;
                                                                            if (v22 != 0) ** GOTO lbl-1000
                                                                        }
                                                                        v22 = var9_29;
                                                                    }
                                                                    if (var4_4) break block103;
                                                                    if (v22 >= 7) break block104;
                                                                    v22 = var5_5[(var7_7 * 16 + var8_12) * 8 + var9_29 + 1];
                                                                    if (var4_4) break block96;
                                                                    if (v22 != 0) ** GOTO lbl-1000
                                                                }
                                                                v22 = var9_29;
                                                            }
                                                            if (var4_4) break block105;
                                                            if (v22 <= 0) ** GOTO lbl-1000
                                                            v22 = var5_5[(var7_7 * 16 + var8_12) * 8 + (var9_29 - 1)];
                                                        }
                                                        if (!var4_4) {
                                                            ** if (v22 == 0) goto lbl-1000
                                                        }
                                                        break block96;
lbl-1000:
                                                        // 6 sources

                                                        {
                                                            v22 = 1;
                                                            ** GOTO lbl309
                                                        }
lbl-1000:
                                                        // 3 sources

                                                        {
                                                            v22 = var10_17 = 0;
                                                        }
                                                    }
                                                    if (var4_4) break block106;
                                                    if (var10_17 == 0) break block107;
                                                    v23 = var9_29;
                                                    if (var4_4) break block108;
                                                    if (v23 < 4) break block109;
                                                    v23 = var2_2.nextInt(2);
                                                    if (var4_4) break block108;
                                                    if (v23 == 0) break block107;
                                                }
                                                v23 = var1_1.d(var3_3.a(var7_7, var9_29, var8_12)).o().d() ? 1 : 0;
                                            }
                                            if (!var4_4 && v23 != 0) {
                                                v23 = var1_1.a(var3_3.a(var7_7, var9_29, var8_12), g.bx.d(), 2) ? 1 : 0;
                                            }
                                        }
                                        ++var9_29;
                                    }
                                    if (!var4_4) continue;
                                }
                                ++var8_12;
                                if (!var4_4) continue block25;
                            }
                            break;
                        }
                        ++var7_7;
                        if (!var4_4) continue block23;
                    }
                    break;
                }
            }
            v18 = this.a.d().o();
            v19 = c.L;
        }
        if (v18 != v19) return (boolean)1;
        var7_7 = 0;
        do {
            v24 = var7_7;
            block29: while (true) {
                if (v24 >= 16) return (boolean)1;
                v15 = 0;
                if (var4_4 != false) return (boolean)v15;
                var8_13 = v15;
                while (var8_13 < 16) {
                    var9_29 = 4;
                    if (!var4_4) {
                        v24 = var1_1.y(var3_3.a(var7_7, 4, var8_13)) ? 1 : 0;
                        if (var4_4) continue block29;
                        if (v24 != 0) {
                            var1_1.a(var3_3.a(var7_7, 4, var8_13), g.cF.d(), 2);
                        }
                        ++var8_13;
                    }
                    if (!var4_4) continue;
                }
                break;
            }
            ++var7_7;
        } while (!var4_4);
        return (boolean)1;
    }

    public I(K k2) {
        this.a = k2;
    }
}

