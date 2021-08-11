/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.W.cG;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.a2;
import net.minecraft.ao.a4;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class a_
extends a2 {
    public a_(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, b var3_3) {
        block39: {
            block37: {
                block46: {
                    block48: {
                        block47: {
                            block45: {
                                block35: {
                                    block34: {
                                        var4_4 = u.b();
                                        v0 = this;
                                        if (var4_4 != null) {
                                            if (v0.i < 0) {
                                                this.i = this.a(var1_1, var3_3);
                                                v1 = this;
                                                if (var4_4 != null) {
                                                    if (v1.i < 0) {
                                                        return true;
                                                    }
                                                    v1 = this;
                                                }
                                                v1.e.a(0, this.i - this.e.b + 7 - 1, 0);
                                            }
                                            v0 = this;
                                        }
                                        var5_5 = v0.a(g.cW.d());
                                        var6_6 = this.a(g.aX.d().a(cG.V, aA.NORTH));
                                        var7_7 = this.a(g.aX.d().a(cG.V, aA.SOUTH));
                                        var8_8 = this.a(g.aX.d().a(cG.V, aA.EAST));
                                        var9_9 = this.a(g.aX.d().a(cG.V, aA.WEST));
                                        var10_10 = this.a(g.cB.d());
                                        var11_11 = this.a(g.bu.d());
                                        this.a(var1_1, var3_3, 1, 1, 1, 7, 4, 4, g.bf.d(), g.bf.d(), false);
                                        this.a(var1_1, var3_3, 2, 1, 6, 8, 4, 10, g.bf.d(), g.bf.d(), false);
                                        this.a(var1_1, var3_3, 2, 0, 5, 8, 0, 10, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 1, 0, 1, 7, 0, 4, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 0, 0, 0, 0, 3, 5, var5_5, var5_5, false);
                                        this.a(var1_1, var3_3, 8, 0, 0, 8, 3, 10, var5_5, var5_5, false);
                                        this.a(var1_1, var3_3, 1, 0, 0, 7, 2, 0, var5_5, var5_5, false);
                                        this.a(var1_1, var3_3, 1, 0, 5, 2, 1, 5, var5_5, var5_5, false);
                                        this.a(var1_1, var3_3, 2, 0, 6, 2, 3, 10, var5_5, var5_5, false);
                                        this.a(var1_1, var3_3, 3, 0, 10, 7, 3, 10, var5_5, var5_5, false);
                                        this.a(var1_1, var3_3, 1, 2, 0, 7, 3, 0, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 1, 2, 5, 2, 3, 5, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 0, 4, 1, 8, 4, 1, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 0, 4, 4, 3, 4, 4, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 0, 5, 2, 8, 5, 3, var10_10, var10_10, false);
                                        this.a(var1_1, var10_10, 0, 4, 2, var3_3);
                                        this.a(var1_1, var10_10, 0, 4, 3, var3_3);
                                        this.a(var1_1, var10_10, 8, 4, 2, var3_3);
                                        this.a(var1_1, var10_10, 8, 4, 3, var3_3);
                                        this.a(var1_1, var10_10, 8, 4, 4, var3_3);
                                        var12_12 = var6_6;
                                        var13_13 = var7_7;
                                        var14_14 = var9_9;
                                        var15_15 = var8_8;
                                        var16_16 = -1;
                                        block0: while (true) {
                                            v2 = var16_16;
                                            v3 = 2;
                                            block1: while (v2 <= v3) {
                                                v4 = 0;
                                                if (var4_4 == null) break block34;
                                                for (var17_17 = v204774; var17_17 <= 8; ++var17_17) {
                                                    block43: {
                                                        block44: {
                                                            block42: {
                                                                this.a(var1_1, var12_12, var17_17, 4 + var16_16, var16_16, var3_3);
                                                                v5 = var16_16;
                                                                if (var4_4 != null) {
                                                                    v3 = -1;
                                                                    if (var4_4 == null) continue block1;
                                                                    if (v5 <= v3) {
                                                                        v5 = var17_17;
                                                                        if (var4_4 != null) {
                                                                            if (v5 > 1) continue;
                                                                        }
                                                                    } else {
                                                                        v5 = var16_16;
                                                                    }
                                                                }
                                                                if (var4_4 == null) ** GOTO lbl71
                                                                if (v5 <= 0) {
                                                                    v5 = var17_17;
                                                                    v6 = 3;
                                                                    if (var4_4 != null) {
                                                                        if (v5 > v6) continue;
                                                                    }
                                                                } else {
                                                                    v5 = var16_16;
lbl71:
                                                                    // 2 sources

                                                                    v6 = 1;
                                                                }
                                                                if (var4_4 == null) break block42;
                                                                if (v5 > v6) break block43;
                                                                v5 = var17_17;
                                                                v6 = 4;
                                                            }
                                                            if (var4_4 == null) break block44;
                                                            if (v5 <= v6) break block43;
                                                            v5 = var17_17;
                                                            v6 = 6;
                                                        }
                                                        if (v5 < v6) continue;
                                                    }
                                                    this.a(var1_1, var13_13, var17_17, 4 + var16_16, 5 - var16_16, var3_3);
                                                    if (var4_4 != null) continue;
                                                }
                                                ++var16_16;
                                                if (var4_4 != null) continue block0;
                                            }
                                            break;
                                        }
                                        this.a(var1_1, var3_3, 3, 4, 5, 3, 4, 10, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 7, 4, 2, 7, 4, 10, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 4, 5, 4, 4, 5, 10, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 6, 5, 4, 6, 5, 10, var10_10, var10_10, false);
                                        this.a(var1_1, var3_3, 5, 6, 3, 5, 6, 10, var10_10, var10_10, false);
                                        v4 = var16_16 = 4;
                                    }
                                    while (var16_16 >= 1) {
                                        block36: {
                                            this.a(var1_1, var10_10, var16_16, 2 + var16_16, 7 - var16_16, var3_3);
                                            v7 = 8 - var16_16;
                                            if (var4_4 == null) break block35;
                                            for (var17_17 = v204827; var17_17 <= 10; ++var17_17) {
                                                this.a(var1_1, var15_15, var16_16, 2 + var16_16, var17_17, var3_3);
                                                if (var4_4 != null) {
                                                    if (var4_4 != null) continue;
                                                }
                                                break block36;
                                            }
                                            --var16_16;
                                        }
                                        if (var4_4 != null) continue;
                                    }
                                    this.a(var1_1, var10_10, 6, 6, 3, var3_3);
                                    this.a(var1_1, var10_10, 7, 5, 4, var3_3);
                                    this.a(var1_1, var9_9, 6, 6, 4, var3_3);
                                    v7 = var16_16 = 6;
                                }
                                while (var16_16 <= 8) {
                                    block38: {
                                        v8 = 5;
                                        if (var4_4 == null) break block37;
                                        for (var17_17 = v205114; var17_17 <= 10; ++var17_17) {
                                            this.a(var1_1, var14_14, var16_16, 12 - var16_16, var17_17, var3_3);
                                            if (var4_4 != null) {
                                                if (var4_4 != null) continue;
                                            }
                                            break block38;
                                        }
                                        ++var16_16;
                                    }
                                    if (var4_4 != null) continue;
                                }
                                this.a(var1_1, var11_11, 0, 2, 1, var3_3);
                                this.a(var1_1, var11_11, 0, 2, 4, var3_3);
                                this.a(var1_1, g.a6.d(), 0, 2, 2, var3_3);
                                this.a(var1_1, g.a6.d(), 0, 2, 3, var3_3);
                                this.a(var1_1, var11_11, 4, 2, 0, var3_3);
                                this.a(var1_1, g.a6.d(), 5, 2, 0, var3_3);
                                this.a(var1_1, var11_11, 6, 2, 0, var3_3);
                                this.a(var1_1, var11_11, 8, 2, 1, var3_3);
                                this.a(var1_1, g.a6.d(), 8, 2, 2, var3_3);
                                this.a(var1_1, g.a6.d(), 8, 2, 3, var3_3);
                                this.a(var1_1, var11_11, 8, 2, 4, var3_3);
                                this.a(var1_1, var10_10, 8, 2, 5, var3_3);
                                this.a(var1_1, var11_11, 8, 2, 6, var3_3);
                                this.a(var1_1, g.a6.d(), 8, 2, 7, var3_3);
                                this.a(var1_1, g.a6.d(), 8, 2, 8, var3_3);
                                this.a(var1_1, var11_11, 8, 2, 9, var3_3);
                                this.a(var1_1, var11_11, 2, 2, 6, var3_3);
                                this.a(var1_1, g.a6.d(), 2, 2, 7, var3_3);
                                this.a(var1_1, g.a6.d(), 2, 2, 8, var3_3);
                                this.a(var1_1, var11_11, 2, 2, 9, var3_3);
                                this.a(var1_1, var11_11, 4, 4, 10, var3_3);
                                this.a(var1_1, g.a6.d(), 5, 4, 10, var3_3);
                                this.a(var1_1, var11_11, 6, 4, 10, var3_3);
                                this.a(var1_1, var10_10, 5, 5, 10, var3_3);
                                this.a(var1_1, g.bf.d(), 2, 1, 0, var3_3);
                                this.a(var1_1, g.bf.d(), 2, 2, 0, var3_3);
                                this.a(var1_1, aA.NORTH, 2, 3, 1, var3_3);
                                this.a(var1_1, var3_3, var2_2, 2, 1, 0, aA.NORTH);
                                this.a(var1_1, var3_3, 1, 0, -1, 3, 2, -1, g.bf.d(), g.bf.d(), false);
                                v9 = this.b(var1_1, 2, 0, -1, var3_3).o();
                                v10 = net.minecraft.ac.c.A;
                                if (var4_4 == null) break block45;
                                if (v9 != v10) break block46;
                                v11 = this.b(var1_1, 2, -1, -1, var3_3);
                                if (var4_4 == null) break block47;
                                v9 = v11.o();
                                v10 = net.minecraft.ac.c.A;
                            }
                            if (v9 == v10) break block46;
                            this.a(var1_1, var12_12, 2, 0, -1, var3_3);
                            v12 = this;
                            v13 = var1_1;
                            if (var4_4 == null) break block48;
                            v11 = v12.b(v13, 2, -1, -1, var3_3);
                        }
                        if (v11.b() != g.ci) break block46;
                        v12 = this;
                        v13 = var1_1;
                    }
                    v12.a(v13, g.aU.d(), 2, -1, -1, var3_3);
                }
                v8 = var16_16 = 0;
            }
            while (var16_16 < 5) {
                block40: {
                    v14 = 0;
                    if (var4_4 == null) break block39;
                    for (var17_17 = v205137; var17_17 < 9; ++var17_17) {
                        this.a(var1_1, var17_17, 7, var16_16, var3_3);
                        this.b(var1_1, var5_5, var17_17, -1, var16_16, var3_3);
                        if (var4_4 != null) {
                            if (var4_4 != null) continue;
                        }
                        break block40;
                    }
                    ++var16_16;
                }
                if (var4_4 != null) continue;
            }
            v14 = var16_16 = 5;
        }
        while (var16_16 < 11) {
            block41: {
                v15 = 2;
                if (var4_4 == null) return (boolean)v15;
                for (var17_17 = v205167; var17_17 < 9; ++var17_17) {
                    this.a(var1_1, var17_17, 7, var16_16, var3_3);
                    this.b(var1_1, var5_5, var17_17, -1, var16_16, var3_3);
                    if (var4_4 != null) {
                        if (var4_4 != null) continue;
                    }
                    break block41;
                }
                ++var16_16;
            }
            if (var4_4 != null) continue;
        }
        this.a(var1_1, var3_3, 4, 1, 2, 2);
        return (boolean)1;
    }

    public static a_ a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 9, 7, 12, aA2);
        return a_.a(b10) && u.a(list, b10) == null ? new a_(a42, n5, random, b10, aA2) : null;
    }

    public a_() {
    }
}

