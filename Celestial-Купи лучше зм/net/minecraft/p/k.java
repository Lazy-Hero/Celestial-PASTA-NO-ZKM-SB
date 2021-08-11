/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.b2;
import net.minecraft.W.bR;
import net.minecraft.W.bc;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class k
extends b {
    private static final /* synthetic */ i d;
    private static final /* synthetic */ i a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, n var3_3) {
        block40: {
            block50: {
                block49: {
                    block39: {
                        var5_4 = var2_2.nextInt(5) + 7;
                        var6_5 = var5_4 - var2_2.nextInt(2) - 3;
                        var7_6 = var5_4 - var6_5;
                        var4_7 = net.minecraft.p.a.d();
                        var8_8 = 1 + var2_2.nextInt(var7_6 + 1);
                        v0 = var3_3.b();
                        if (var4_7 != false) return (boolean)v0;
                        if (v0 < 1) return (boolean)0;
                        v0 = var3_3.b() + var5_4 + 1;
                        if (var4_7 != false) return (boolean)v0;
                        if (v0 > 256) return (boolean)0;
                        var9_9 = 1;
                        var10_10 = var3_3.b();
                        block0: while (true) {
                            v1 = var10_10;
                            block1: while (v1 <= var3_3.b() + 1 + var5_4) {
                                block44: {
                                    block42: {
                                        block43: {
                                            v2 = var9_9;
                                            if (var4_7 || var4_7) break block39;
                                            if (v2 == 0) break block0;
                                            var11_12 = 1;
                                            v3 = var10_10 - var3_3.b();
                                            if (var4_7) break block42;
                                            if (v3 >= var6_5) break block43;
                                            var11_12 = 0;
                                            if (!var4_7) break block44;
                                        }
                                        v3 = var8_8;
                                    }
                                    var11_12 = v3;
                                }
                                var12_13 = new o();
                                var13_15 = var3_3.e() - var11_12;
                                block2: while (true) {
                                    v4 = var13_15;
                                    block3: while (v4 <= var3_3.e() + var11_12) {
                                        v1 = var9_9;
                                        if (var4_7) continue block1;
                                        if (!var4_7) {
                                            if (v1 == 0) break block2;
                                            v5 = var14_18 = var3_3.a() - var11_12;
                                        }
                                        while (var14_18 <= var3_3.a() + var11_12) {
                                            block48: {
                                                block45: {
                                                    block46: {
                                                        block47: {
                                                            v4 = var9_9;
                                                            if (var4_7) continue block3;
                                                            if (!var4_7) {
                                                                if (v4 == 0) break;
                                                                v6 = var10_10;
                                                            }
                                                            if (var4_7) break block45;
                                                            if (v6 < 0) break block46;
                                                            v6 = var10_10;
                                                            if (var4_7) break block45;
                                                            if (v6 >= 256) break block46;
                                                            v7 = this.a(var1_1.d(var12_13.a(var13_15, var10_10, var14_18)).b());
                                                            if (var4_7) break block47;
                                                            if (v7) break block48;
                                                            v7 = false;
                                                        }
                                                        var9_9 = v7 ? 1 : 0;
                                                        if (!var4_7) break block48;
                                                    }
                                                    v6 = 0;
                                                }
                                                var9_9 = v6;
                                            }
                                            ++var14_18;
                                            if (!var4_7) continue;
                                        }
                                        ++var13_15;
                                        if (!var4_7) continue block2;
                                    }
                                    break;
                                }
                                ++var10_10;
                                if (!var4_7) continue block0;
                            }
                            break;
                        }
                        v2 = var9_9;
                    }
                    if (var4_7 != false) return (boolean)v2;
                    if (v2 == 0) {
                        return (boolean)0;
                    }
                    v8 = var10_11 = var1_1.d(var3_3.k()).b();
                    v9 /* !! */  = g.aU;
                    if (var4_7) break block49;
                    if (v8 == v9 /* !! */ ) break block50;
                    v8 = var10_11;
                    v9 /* !! */  = g.bv;
                }
                if (v8 != v9 /* !! */ ) return (boolean)0;
            }
            v10 = var3_3.b();
            if (var4_7 != false) return (boolean)v10;
            if (v10 >= 256 - var5_4 - 1) return (boolean)0;
            this.a(var1_1, var3_3.k());
            var11_12 = 0;
            for (var12_14 = var3_3.b() + var5_4; var12_14 >= var3_3.b() + var6_5; --var12_14) {
                block41: {
                    v11 = var3_3.e() - var11_12;
                    if (var4_7) break block40;
                    var13_15 = v11;
                    block6: while (true) {
                        v12 = var13_15;
                        v13 = var3_3.e() + var11_12;
                        block7: while (v12 <= v13) {
                            var14_18 = var13_15 - var3_3.e();
                            v14 = var3_3.a() - var11_12;
                            if (var4_7) break block41;
                            var15_19 = v14;
                            while (var15_19 <= var3_3.a() + var11_12) {
                                block55: {
                                    block54: {
                                        block52: {
                                            block53: {
                                                block51: {
                                                    var16_20 = var15_19 - var3_3.a();
                                                    v12 = Math.abs(var14_18);
                                                    v13 = var11_12;
                                                    if (var4_7) continue block7;
                                                    if (var4_7) break block51;
                                                    if (v12 != v13) break block52;
                                                    v15 = Math.abs(var16_20);
                                                    if (var4_7) break block53;
                                                    v16 = var11_12;
                                                }
                                                if (v15 != v16) break block52;
                                                v15 = var11_12;
                                            }
                                            if (v15 > 0) break block54;
                                        }
                                        var17_21 = new n(var13_15, var12_14, var15_19);
                                        if (var4_7) break block55;
                                        if (!var1_1.d(var17_21).m()) {
                                            this.a(var1_1, var17_21, k.d);
                                        }
                                    }
                                    ++var15_19;
                                }
                                if (!var4_7) continue;
                            }
                            ++var13_15;
                            if (!var4_7) continue block6;
                        }
                        break;
                    }
                    v14 = var11_12;
                }
                v17 = 1;
                if (!var4_7) {
                    if (v14 >= v17) {
                        v14 = var12_14;
                        v17 = var3_3.b() + var6_5 + 1;
                        if (!var4_7) {
                            if (v14 == v17) {
                                --var11_12;
                                if (!var4_7) continue;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 4 sources

                    {
                        v14 = var11_12;
                        v17 = var8_8;
                    }
                }
                if (v14 >= v17) continue;
                ++var11_12;
                if (!var4_7) continue;
            }
            v11 = 0;
        }
        var12_14 = v11;
        do {
            block58: {
                block57: {
                    block56: {
                        if (var12_14 >= var5_4 - 1) return true;
                        v18 = var13_17 = var1_1.d(var3_3.c(var12_14)).o();
                        v19 = c.A;
                        if (var4_7) break block56;
                        if (v18 == v19) break block57;
                        v18 = var13_17;
                        v19 = c.J;
                    }
                    if (v18 != v19) break block58;
                }
                this.a(var1_1, var3_3.c(var12_14), k.a);
            }
            ++var12_14;
        } while (!var4_7);
        return true;
    }

    static {
        a = g.bu.d().a(bc.B, D.SPRUCE);
        d = g.bU.d().a(bR.D, D.SPRUCE).a(b2.A, false);
    }

    public k() {
        super(false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

