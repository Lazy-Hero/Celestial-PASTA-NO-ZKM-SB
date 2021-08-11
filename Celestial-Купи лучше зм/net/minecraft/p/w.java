/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.N.O;
import net.minecraft.N.T;
import net.minecraft.T.a4;
import net.minecraft.T.am;
import net.minecraft.T.ay;
import net.minecraft.U.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w
extends a {
    private static final /* synthetic */ v[] d;
    private static final /* synthetic */ Logger a;

    private v a(Random random) {
        return d[random.nextInt(d.length)];
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = LogManager.getLogger();
        d = new v[]{h.a(ay.class), h.a(a4.class), h.a(a4.class), h.a(am.class)};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, n var3_3) {
        block87: {
            block86: {
                block73: {
                    block72: {
                        block71: {
                            var5_4 = 3;
                            var6_5 = var2_2.nextInt(2) + 2;
                            var7_6 = -var6_5 - 1;
                            var4_7 = net.minecraft.p.a.d();
                            var8_8 = var6_5 + 1;
                            var9_9 = -1;
                            var10_10 = 4;
                            var11_11 = var2_2.nextInt(2) + 2;
                            var12_12 = -var11_11 - 1;
                            var13_13 = var11_11 + 1;
                            var14_14 = 0;
                            var15_15 = var7_6;
                            block0: while (true) {
                                v0 = var15_15;
                                block1: while (v0 <= var8_8) {
                                    v1 = -1;
                                    if (var4_7) break block71;
                                    var16_17 = v1;
                                    block2: while (true) {
                                        v2 = var16_17;
                                        v3 = 4;
                                        block3: while (v2 <= v3) {
                                            v0 = var12_12;
                                            if (var4_7) continue block1;
                                            for (var17_18 = v2075826; var17_18 <= var13_13; ++var17_18) {
                                                block76: {
                                                    block77: {
                                                        block75: {
                                                            var18_19 = var3_3.a(var15_15, var16_17, var17_18);
                                                            var19_21 = var1_1.d(var18_19).o();
                                                            var20_23 = var19_21.d();
                                                            v2 = var16_17;
                                                            v3 = -1;
                                                            if (var4_7) continue block3;
                                                            if (!var4_7) {
                                                                if (v2 == v3) {
                                                                    v4 = var20_23 ? 1 : 0;
                                                                    if (!var4_7) {
                                                                        if (v4 == 0) {
                                                                            return false;
                                                                        } else {
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                    }
                                                                } else lbl-1000:
                                                                // 3 sources

                                                                {
                                                                    v4 = var16_17;
                                                                }
                                                                v5 = 4;
                                                            }
                                                            if (var4_7) break block75;
                                                            if (v4 == v5) {
                                                                v4 = var20_23 ? 1 : 0;
                                                                if (!var4_7) {
                                                                    if (v4 == 0) {
                                                                        return false;
                                                                    } else {
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                }
                                                            } else lbl-1000:
                                                            // 3 sources

                                                            {
                                                                v4 = var15_15;
                                                            }
                                                            if (var4_7) break block76;
                                                            v5 = var7_6;
                                                        }
                                                        if (v4 == v5) break block77;
                                                        v4 = var15_15;
                                                        if (var4_7) break block76;
                                                        if (v4 == var8_8) break block77;
                                                        v4 = var17_18;
                                                        if (!var4_7) {
                                                            if (v4 != var12_12) {
                                                                v4 = var17_18;
                                                                if (!var4_7) {
                                                                    if (v4 != var13_13) continue;
                                                                } else {
                                                                    ** GOTO lbl64
                                                                }
                                                            } else {
                                                                ** GOTO lbl63
                                                            }
                                                        }
                                                        break block76;
lbl63:
                                                        // 2 sources

                                                        break block77;
lbl64:
                                                        // 2 sources

                                                        break block76;
                                                    }
                                                    v4 = var16_17;
                                                }
                                                if (!var4_7) {
                                                    if (v4 != 0) continue;
                                                    v4 = var1_1.a(var18_19) ? 1 : 0;
                                                }
                                                if (!var4_7) {
                                                    if (v4 == 0) continue;
                                                    v4 = var1_1.a(var18_19.a()) ? 1 : 0;
                                                }
                                                if (v4 == 0) continue;
                                                ++var14_14;
                                                if (!var4_7) continue;
                                            }
                                            ++var16_17;
                                            if (!var4_7) continue block2;
                                        }
                                        break;
                                    }
                                    ++var15_15;
                                    if (!var4_7) continue block0;
                                }
                                break;
                            }
                            v1 = var14_14;
                        }
                        if (var4_7 != false) return (boolean)v1;
                        if (v1 < true) return (boolean)0;
                        v1 = var14_14;
                        if (var4_7 != false) return (boolean)v1;
                        if (v1 > 5) return (boolean)0;
                        var15_15 = var7_6;
                        block5: while (true) {
                            v6 = var15_15;
                            block6: while (v6 <= var8_8) {
                                v7 = 3;
                                if (var4_7) break block72;
                                var16_17 = v7;
                                block7: while (true) {
                                    v8 = var16_17;
                                    v9 = -1;
                                    block8: while (v8 >= v9) {
                                        v6 = var12_12;
                                        if (var4_7) continue block6;
                                        for (var17_18 = v2075892; var17_18 <= var13_13; ++var17_18) {
                                            block82: {
                                                block80: {
                                                    block81: {
                                                        block78: {
                                                            block79: {
                                                                var18_19 = var3_3.a(var15_15, var16_17, var17_18);
                                                                v10 = var15_15;
                                                                if (var4_7) break block78;
                                                                v9 = var7_6;
                                                                if (var4_7) continue block8;
                                                                if (v10 == v9) break block79;
                                                                v10 = var16_17;
                                                                if (var4_7) break block78;
                                                                if (v10 == -1) break block79;
                                                                v10 = var17_18;
                                                                if (var4_7) break block78;
                                                                if (v10 == var12_12) break block79;
                                                                v10 = var15_15;
                                                                if (!var4_7) {
                                                                    if (v10 != var8_8) {
                                                                        v10 = var16_17;
                                                                        if (!var4_7) {
                                                                            if (v10 != 4) {
                                                                                v10 = var17_18;
                                                                                if (!var4_7) {
                                                                                    if (v10 != var13_13) {
                                                                                        v11 = var1_1;
                                                                                        v12 = var18_19;
                                                                                        if (!var4_7) {
                                                                                            if (v11.d(v12).b() == g.cd) continue;
                                                                                            v11 = var1_1;
                                                                                            v12 = var18_19;
                                                                                        }
                                                                                        v11.v(v12);
                                                                                        if (!var4_7) continue;
                                                                                    } else {
                                                                                        ** GOTO lbl137
                                                                                    }
                                                                                } else {
                                                                                    ** GOTO lbl136
                                                                                }
                                                                            } else {
                                                                                ** GOTO lbl135
                                                                            }
                                                                        } else {
                                                                            ** GOTO lbl134
                                                                        }
                                                                    } else {
                                                                        ** GOTO lbl133
                                                                    }
                                                                }
                                                                break block78;
lbl133:
                                                                // 2 sources

                                                                break block79;
lbl134:
                                                                // 2 sources

                                                                break block78;
lbl135:
                                                                // 2 sources

                                                                break block79;
lbl136:
                                                                // 2 sources

                                                                break block78;
                                                            }
                                                            v10 = var18_19.b();
                                                        }
                                                        if (var4_7) break block80;
                                                        if (v10 < 0) break block81;
                                                        v10 = var1_1.d(var18_19.k()).o().d() ? 1 : 0;
                                                        if (!var4_7) {
                                                            if (v10 == 0) {
                                                                var1_1.v(var18_19);
                                                                if (!var4_7) continue;
                                                            } else {
                                                                ** GOTO lbl149
                                                            }
                                                        }
                                                        break block80;
                                                    }
                                                    v13 = var1_1.d(var18_19);
                                                    if (var4_7) break block82;
                                                    v10 = v13.o().d() ? 1 : 0;
                                                }
                                                if (v10 == 0) continue;
                                                v13 = var1_1.d(var18_19);
                                            }
                                            if (v13.b() == g.cd) continue;
                                            v14 = var16_17;
                                            if (var4_7) continue;
                                            if (v14 == -1) {
                                                v14 = var2_2.nextInt(4);
                                                if (var4_7) continue;
                                                if (v14 != 0) {
                                                    var1_1.a(var18_19, g.x.d(), 2);
                                                    if (!var4_7) continue;
                                                }
                                            }
                                            v14 = var1_1.a(var18_19, g.cW.d(), 2) ? 1 : 0;
                                            if (!var4_7) continue;
                                        }
                                        --var16_17;
                                        if (!var4_7) continue block7;
                                    }
                                    break;
                                }
                                ++var15_15;
                                if (!var4_7) continue block5;
                            }
                            break;
                        }
                        v7 = 0;
                    }
                    var15_15 = v7;
                    block10: while (true) {
                        v15 = var15_15;
                        block11: while (v15 < 2) {
                            v16 = 0;
                            if (var4_7) break block73;
                            var16_17 = v16;
                            while (var16_17 < 3) {
                                block83: {
                                    block84: {
                                        block85: {
                                            block74: {
                                                var17_18 = var3_3.e() + var2_2.nextInt(var6_5 * 2 + 1) - var6_5;
                                                var18_20 = var3_3.b();
                                                var19_22 = var3_3.a() + var2_2.nextInt(var11_11 * 2 + 1) - var11_11;
                                                var20_24 = new n(var17_18, var18_20, var19_22);
                                                if (var4_7) break block83;
                                                v15 = var1_1.a(var20_24) ? 1 : 0;
                                                if (var4_7) continue block11;
                                                if (v15 == 0) break block84;
                                                var21_25 = 0;
                                                for (aA var23_27 : av.HORIZONTAL) {
                                                    v17 = var1_1.d(var20_24.a(var23_27)).o().d();
                                                    if (!var4_7) {
                                                        if (v17 != 0) {
                                                            ++var21_25;
                                                        }
                                                        if (!var4_7) continue;
                                                    }
                                                    break block74;
                                                }
                                                v17 = var21_25;
                                            }
                                            if (var4_7) break block85;
                                            if (v17 != true) break block84;
                                            v17 = var1_1.a(var20_24, g.cd.a(var1_1, var20_24, g.cd.d()), 2) ? 1 : 0;
                                        }
                                        var22_26 = var1_1.b(var20_24);
                                        if (var4_7) continue block10;
                                        if (!(var22_26 instanceof O)) break;
                                        ((O)var22_26).a(j.az, var2_2.nextLong());
                                        if (!var4_7) break;
                                    }
                                    ++var16_17;
                                }
                                if (!var4_7) continue;
                            }
                            ++var15_15;
                            if (!var4_7) continue block10;
                        }
                        break;
                    }
                    v16 = var1_1.a(var3_3, g.i.d(), 2) ? 1 : 0;
                }
                v18 = var15_16 = var1_1.b(var3_3);
                if (var4_7) break block86;
                if (!(v18 instanceof T)) break block87;
                v18 = var15_16;
            }
            ((T)v18).a().a(this.a(var2_2));
            if (var4_7 == false) return true;
        }
        w.a.error("Failed to fetch mob spawner entity at ({}, {}, {})", (Object)var3_3.e(), (Object)var3_3.b(), (Object)var3_3.a());
        return true;
    }
}

