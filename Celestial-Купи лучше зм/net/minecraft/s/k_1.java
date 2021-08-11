/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.a;
import net.minecraft.S.b;
import net.minecraft.S.c;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class k
extends d {
    private final /* synthetic */ a a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int[] b(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = var1_1 - 1;
        var5_6 = d.b();
        var7_7 = var2_2 - 1;
        var8_8 = 1 + var3_3 + 1;
        var9_9 = 1 + var4_4 + 1;
        var10_10 = this.f.a(var6_5, var7_7, var8_8, var9_9);
        var11_11 = b.a(var3_3 * var4_4);
        var12_12 = 0;
        do {
            v0 = var12_12;
            v1 = var4_4;
            block1: while (true) {
                if (v0 >= v1) return var11_11;
                var13_13 = 0;
                while (var13_13 < var3_3) {
                    block21: {
                        block22: {
                            block25: {
                                block26: {
                                    block24: {
                                        block23: {
                                            var14_14 = var10_10[var13_13 + 1 + (var12_12 + 1) * var8_8];
                                            if (var5_6 == null) break block21;
                                            v0 = var14_14;
                                            v1 = 4;
                                            if (var5_6 == null) continue block1;
                                            if (v0 != v1) break block22;
                                            var15_15 = var10_10[var13_13 + 1 + (var12_12 + 1 - 1) * var8_8];
                                            var16_16 = var10_10[var13_13 + 1 + 1 + (var12_12 + 1) * var8_8];
                                            var17_17 = var10_10[var13_13 + 1 - 1 + (var12_12 + 1) * var8_8];
                                            var18_18 = var10_10[var13_13 + 1 + (var12_12 + 1 + 1) * var8_8];
                                            v2 = var15_15;
                                            if (var5_6 == null) break block23;
                                            if (v2 == 2) ** GOTO lbl-1000
                                            v2 = var16_16;
                                            if (var5_6 == null) break block23;
                                            if (v2 == 2) ** GOTO lbl-1000
                                            v2 = var17_17;
                                            if (var5_6 != null) {
                                                if (v2 != 2) {
                                                    v2 = var18_18;
                                                    if (var5_6 != null) {
                                                        ** if (v2 != 2) goto lbl-1000
                                                    } else {
                                                        ** GOTO lbl40
                                                    }
                                                } else {
                                                    ** GOTO lbl39
                                                }
                                            }
                                            break block23;
lbl39:
                                            // 2 sources

                                            ** GOTO lbl-1000
lbl40:
                                            // 2 sources

                                            break block23;
lbl-1000:
                                            // 4 sources

                                            {
                                                v2 = 1;
                                                ** GOTO lbl44
                                            }
lbl-1000:
                                            // 1 sources

                                            {
                                                v2 = 0;
                                            }
                                        }
                                        var19_19 = v2;
                                        v3 = var15_15;
                                        if (var5_6 == null) break block24;
                                        if (v3 == 1) ** GOTO lbl-1000
                                        v3 = var16_16;
                                        if (var5_6 == null) break block24;
                                        if (v3 == 1) ** GOTO lbl-1000
                                        v3 = var17_17;
                                        if (var5_6 != null) {
                                            if (v3 != 1) {
                                                v3 = var18_18;
                                                if (var5_6 != null) {
                                                    ** if (v3 != 1) goto lbl-1000
                                                } else {
                                                    ** GOTO lbl60
                                                }
                                            } else {
                                                ** GOTO lbl59
                                            }
                                        }
                                        break block24;
lbl59:
                                        // 2 sources

                                        ** GOTO lbl-1000
lbl60:
                                        // 2 sources

                                        break block24;
lbl-1000:
                                        // 4 sources

                                        {
                                            v3 = 1;
                                            ** GOTO lbl64
                                        }
lbl-1000:
                                        // 1 sources

                                        {
                                            v3 = 0;
                                        }
                                    }
                                    v4 = var20_20 = v3;
                                    if (var5_6 == null) break block25;
                                    if (v4 != 0) break block26;
                                    v4 = var19_19;
                                    if (var5_6 == null) break block25;
                                    if (v4 == 0) break block22;
                                }
                                v4 = 3;
                            }
                            var14_14 = v4;
                        }
                        var11_11[var13_13 + var12_12 * var3_3] = var14_14;
                        ++var13_13;
                    }
                    if (var5_6 != null) continue;
                }
                break;
            }
            ++var12_12;
        } while (var5_6 != null);
        return var11_11;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int[] c(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = var1_1 - 1;
        var7_6 = var2_2 - 1;
        var8_7 = 1 + var3_3 + 1;
        var9_8 = 1 + var4_4 + 1;
        var5_9 = d.b();
        var10_10 = this.f.a(var6_5, var7_6, var8_7, var9_8);
        var11_11 = b.a(var3_3 * var4_4);
        var12_12 = 0;
        do {
            v0 = var12_12;
            v1 = var4_4;
            block1: while (true) {
                if (v0 >= v1) return var11_11;
                var13_13 = 0;
                while (var13_13 < var3_3) {
                    block21: {
                        block22: {
                            block25: {
                                block26: {
                                    block24: {
                                        block23: {
                                            this.a((long)(var13_13 + var1_1), (long)(var12_12 + var2_2));
                                            var14_14 = var10_10[var13_13 + 1 + (var12_12 + 1) * var8_7];
                                            if (var5_9 == null) break block21;
                                            v0 = var14_14;
                                            v1 = 1;
                                            if (var5_9 == null) continue block1;
                                            if (v0 != v1) break block22;
                                            var15_15 = var10_10[var13_13 + 1 + (var12_12 + 1 - 1) * var8_7];
                                            var16_16 = var10_10[var13_13 + 1 + 1 + (var12_12 + 1) * var8_7];
                                            var17_17 = var10_10[var13_13 + 1 - 1 + (var12_12 + 1) * var8_7];
                                            var18_18 = var10_10[var13_13 + 1 + (var12_12 + 1 + 1) * var8_7];
                                            v2 = var15_15;
                                            if (var5_9 == null) break block23;
                                            if (v2 == 3) ** GOTO lbl-1000
                                            v2 = var16_16;
                                            if (var5_9 == null) break block23;
                                            if (v2 == 3) ** GOTO lbl-1000
                                            v2 = var17_17;
                                            if (var5_9 != null) {
                                                if (v2 != 3) {
                                                    v2 = var18_18;
                                                    if (var5_9 != null) {
                                                        ** if (v2 != 3) goto lbl-1000
                                                    } else {
                                                        ** GOTO lbl41
                                                    }
                                                } else {
                                                    ** GOTO lbl40
                                                }
                                            }
                                            break block23;
lbl40:
                                            // 2 sources

                                            ** GOTO lbl-1000
lbl41:
                                            // 2 sources

                                            break block23;
lbl-1000:
                                            // 4 sources

                                            {
                                                v2 = 1;
                                                ** GOTO lbl45
                                            }
lbl-1000:
                                            // 1 sources

                                            {
                                                v2 = 0;
                                            }
                                        }
                                        var19_19 = v2;
                                        v3 = var15_15;
                                        if (var5_9 == null) break block24;
                                        if (v3 == 4) ** GOTO lbl-1000
                                        v3 = var16_16;
                                        if (var5_9 == null) break block24;
                                        if (v3 == 4) ** GOTO lbl-1000
                                        v3 = var17_17;
                                        if (var5_9 != null) {
                                            if (v3 != 4) {
                                                v3 = var18_18;
                                                if (var5_9 != null) {
                                                    ** if (v3 != 4) goto lbl-1000
                                                } else {
                                                    ** GOTO lbl61
                                                }
                                            } else {
                                                ** GOTO lbl60
                                            }
                                        }
                                        break block24;
lbl60:
                                        // 2 sources

                                        ** GOTO lbl-1000
lbl61:
                                        // 2 sources

                                        break block24;
lbl-1000:
                                        // 4 sources

                                        {
                                            v3 = 1;
                                            ** GOTO lbl65
                                        }
lbl-1000:
                                        // 1 sources

                                        {
                                            v3 = 0;
                                        }
                                    }
                                    var20_20 = v3;
                                    v4 = var19_19;
                                    if (var5_9 == null) break block25;
                                    if (v4 != 0) break block26;
                                    v4 = var20_20;
                                    if (var5_9 == null) break block25;
                                    if (v4 == 0) break block22;
                                }
                                v4 = 2;
                            }
                            var14_14 = v4;
                        }
                        var11_11[var13_13 + var12_12 * var3_3] = var14_14;
                        ++var13_13;
                    }
                    if (var5_9 != null) continue;
                }
                break;
            }
            ++var12_12;
        } while (var5_9 != null);
        return var11_11;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        m[] arrm = d.b();
        int[] arrn = c.a;
        if (arrm != null) {
            switch (arrn[this.a.ordinal()]) {
                default: {
                    return this.c(n2, n3, n4, n5);
                }
                case 2: {
                    return this.b(n2, n3, n4, n5);
                }
                case 3: 
            }
            arrn = this.d(n2, n3, n4, n5);
        }
        return arrn;
    }

    private int[] d(int n2, int n3, int n4, int n5) {
        int[] arrn = this.f.a(n2, n3, n4, n5);
        int[] arrn2 = b.a(n4 * n5);
        int n6 = 0;
        m[] arrm = d.b();
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 < n5) {
                int n8 = 0;
                while (n8 < n4) {
                    block5: {
                        int n9;
                        block6: {
                            int n10;
                            block7: {
                                this.a((long)(n8 + n2), (long)(n6 + n3));
                                n9 = arrn[n8 + n6 * n4];
                                if (arrm == null) break block5;
                                n7 = n9;
                                if (arrm == null) continue block1;
                                if (n7 == 0) break block6;
                                n10 = this.a(13);
                                if (arrm == null) break block7;
                                if (n10 != 0) break block6;
                                n10 = n9 | 1 + this.a(15) << 8 & 0xF00;
                            }
                            n9 = n10;
                        }
                        arrn2[n8 + n6 * n4] = n9;
                        ++n8;
                    }
                    if (arrm != null) continue;
                }
                ++n6;
                if (arrm != null) continue block0;
            }
            break;
        }
        return arrn2;
    }

    public k(long l2, d d10, a a10) {
        super(l2);
        this.f = d10;
        this.a = a10;
    }
}

