/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.Y;
import net.minecraft.ao.a6;
import net.minecraft.ao.a9;
import net.minecraft.ao.aJ;
import net.minecraft.ao.aM;
import net.minecraft.ao.aU;
import net.minecraft.ao.aa;
import net.minecraft.ao.al;
import net.minecraft.ao.b;
import net.minecraft.ao.bE;
import net.minecraft.ao.bV;
import net.minecraft.ao.bX;
import net.minecraft.ao.bk;
import net.minecraft.ao.d;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aE
extends Y {
    private /* synthetic */ s s;
    private /* synthetic */ s r;
    private final /* synthetic */ List<Y> t;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void e(z var1_1, Random var2_2, b var3_3) {
        block18: {
            block19: {
                block16: {
                    var4_4 = u.b();
                    v0 = this.a(var3_3, 14, 21, 20, 43);
                    if (var4_4 != null) {
                        if (v0 != 0) {
                            block15: {
                                this.a(var1_1, var3_3, 14, 0, 21, 20, 0, 43, aE.l, aE.l, false);
                                this.a(var1_1, var3_3, 14, 1, 22, 20, 14, 43, false);
                                this.a(var1_1, var3_3, 18, 12, 22, 20, 12, 39, aE.l, aE.l, false);
                                this.a(var1_1, var3_3, 18, 12, 21, 20, 12, 21, aE.n, aE.n, false);
                                for (var5_5 = 0; var5_5 < 4; ++var5_5) {
                                    this.a(var1_1, var3_3, var5_5 + 14, var5_5 + 9, 21, var5_5 + 14, var5_5 + 9, 43 - var5_5, aE.n, aE.n, false);
                                    if (var4_4 != null) {
                                        if (var4_4 != null) continue;
                                    }
                                    break block15;
                                }
                                var5_5 = 23;
                            }
                            while (var5_5 <= 39) {
                                this.a(var1_1, aE.q, 19, 13, var5_5, var3_3);
                                var5_5 += 3;
                                if (var4_4 != null) {
                                    if (var4_4 != null) continue;
                                }
                                break block16;
                            }
                        }
                        v0 = this.a(var3_3, 37, 21, 43, 43);
                    }
                    if (var4_4 != null) {
                        if (v0 != 0) {
                            block17: {
                                this.a(var1_1, var3_3, 37, 0, 21, 43, 0, 43, aE.l, aE.l, false);
                                this.a(var1_1, var3_3, 37, 1, 22, 43, 14, 43, false);
                                this.a(var1_1, var3_3, 37, 12, 22, 39, 12, 39, aE.l, aE.l, false);
                                this.a(var1_1, var3_3, 37, 12, 21, 39, 12, 21, aE.n, aE.n, false);
                                for (var5_5 = 0; var5_5 < 4; ++var5_5) {
                                    this.a(var1_1, var3_3, 43 - var5_5, var5_5 + 9, 21, 43 - var5_5, var5_5 + 9, 43 - var5_5, aE.n, aE.n, false);
                                    if (var4_4 != null) {
                                        if (var4_4 != null) continue;
                                    }
                                    break block17;
                                }
                                var5_5 = 23;
                            }
                            while (var5_5 <= 39) {
                                this.a(var1_1, aE.q, 38, 13, var5_5, var3_3);
                                var5_5 += 3;
                                if (var4_4 == null) return;
                                if (var4_4 != null) continue;
                            }
                        } else {
                            ** GOTO lbl42
                        }
                    }
                    break block19;
                }
                v0 = this.a(var3_3, 15, 37, 42, 43) ? 1 : 0;
            }
            if (var4_4 != null) {
                if (v0 == 0) return;
                this.a(var1_1, var3_3, 21, 0, 37, 36, 0, 43, aE.l, aE.l, false);
                this.a(var1_1, var3_3, 21, 1, 37, 36, 14, 43, false);
                this.a(var1_1, var3_3, 21, 12, 37, 36, 12, 39, aE.l, aE.l, false);
                v0 = var5_5 = 0;
            }
            while (var5_5 < 4) {
                this.a(var1_1, var3_3, 15 + var5_5, var5_5 + 9, 43 - var5_5, 42 - var5_5, var5_5 + 9, 43 - var5_5, aE.n, aE.n, false);
                ++var5_5;
                if (var4_4 != null) {
                    if (var4_4 != null) continue;
                }
                break block18;
            }
            var5_5 = 21;
        }
        do {
            if (var5_5 > 36) return;
            this.a(var1_1, aE.q, var5_5, 13, 38, var3_3);
            var5_5 += 3;
        } while (var4_4 != null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aE(Random var1_1, int var2_2, int var3_3, aA var4_4) {
        block9: {
            block8: {
                block12: {
                    block11: {
                        block10: {
                            v0 = u.b();
                            super(0);
                            this.t = Lists.newArrayList();
                            var5_5 = v0;
                            this.a(var4_4);
                            var6_6 = this.e();
                            if (var5_5 == null) break block10;
                            if (var6_6.g() != Q.Z) break block11;
                            this.e = new b(var2_2, 39, var3_3, var2_2 + 58 - 1, 61, var3_3 + 58 - 1);
                        }
                        if (var5_5 != null) break block12;
                    }
                    this.e = new b(var2_2, 39, var3_3, var2_2 + 58 - 1, 61, var3_3 + 58 - 1);
                }
                var7_7 = this.a(var1_1);
                this.r.a = true;
                this.t.add(new al(var6_6, this.r));
                this.t.add(new a6(var6_6, this.s, var1_1));
                var8_8 = Lists.newArrayList();
                var8_8.add(new aU(null));
                var8_8.add(new bE(null));
                var8_8.add(new aM(null));
                var8_8.add(new bX(null));
                var8_8.add(new bk(null));
                var8_8.add(new aJ(null));
                var8_8.add(new bV(null));
                block0: for (s var10_11 : var7_7) {
                    block13: {
                        v1 = var10_11.a ? 1 : 0;
                        if (var5_5 == null) break block8;
                        if (var5_5 == null) break block13;
                        if (v1 != 0) ** GOTO lbl51
                        v2 = var10_11.c();
                    }
                    if (v2) ** GOTO lbl51
                    var11_13 = var8_8.iterator();
                    while (var11_13.hasNext() || var5_5 == null) {
                        var12_15 = (d)var11_13.next();
                        if (!var12_15.a(var10_11)) continue;
                        if (var5_5 == null) continue block0;
                        this.t.add(var12_15.a(var6_6, var10_11, var1_1));
lbl51:
                        // 3 sources

                        if (var5_5 != null) continue block0;
                    }
                }
                v1 = this.e.e;
            }
            var9_10 = v1;
            var10_12 = this.b(9, 22);
            var11_14 = this.a(9, 22);
            for (Y var13_16 : this.t) {
                v3 = var13_16.a();
                if (var5_5 != null) {
                    v3.a(var10_12, var9_10, var11_14);
                    if (var5_5 != null) continue;
                }
                break block9;
            }
            v3 = b.a(this.b(1, 1), this.a(1), this.a(1, 1), this.b(23, 21), this.a(8), this.a(23, 21));
        }
        var12_15 = v3;
        var13_17 = b.a(this.b(34, 1), this.a(1), this.a(34, 1), this.b(56, 21), this.a(8), this.a(56, 21));
        var14_18 = b.a(this.b(22, 22), this.a(13), this.a(22, 22), this.b(35, 35), this.a(17), this.a(35, 35));
        var15_19 = var1_1.nextInt();
        this.t.add(new aa(var6_6, (b)var12_15, var15_19++));
        this.t.add(new aa(var6_6, var13_17, var15_19++));
        this.t.add(new a9(var6_6, var14_18));
    }

    private void b(z z2, Random random, b b10) {
        block26: {
            int n2;
            String[] arrstring;
            block25: {
                arrstring = u.b();
                int n3 = this.a(b10, 0, 21, 6, 58);
                if (arrstring != null) {
                    if (n3 != 0) {
                        block22: {
                            block21: {
                                block20: {
                                    this.a(z2, b10, 0, 0, 21, 6, 0, 57, l, l, false);
                                    this.a(z2, b10, 0, 1, 21, 6, 7, 57, false);
                                    this.a(z2, b10, 4, 4, 21, 6, 4, 53, l, l, false);
                                    for (n2 = 0; n2 < 4; ++n2) {
                                        this.a(z2, b10, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, n, n, false);
                                        if (arrstring != null) {
                                            if (arrstring != null) continue;
                                        }
                                        break block20;
                                    }
                                    n2 = 23;
                                }
                                while (n2 < 53) {
                                    this.a(z2, q, 5, 5, n2, b10);
                                    n2 += 3;
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block21;
                                }
                                this.a(z2, q, 5, 5, 52, b10);
                            }
                            for (n2 = 0; n2 < 4; ++n2) {
                                this.a(z2, b10, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, n, n, false);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block22;
                            }
                            this.a(z2, b10, 4, 1, 52, 6, 3, 52, l, l, false);
                        }
                        this.a(z2, b10, 5, 1, 51, 5, 3, 53, l, l, false);
                    }
                    n3 = this.a(b10, 51, 21, 58, 58);
                }
                if (arrstring != null) {
                    if (n3 != 0) {
                        block24: {
                            block23: {
                                this.a(z2, b10, 51, 0, 21, 57, 0, 57, l, l, false);
                                this.a(z2, b10, 51, 1, 21, 57, 7, 57, false);
                                this.a(z2, b10, 51, 4, 21, 53, 4, 53, l, l, false);
                                for (n2 = 0; n2 < 4; ++n2) {
                                    this.a(z2, b10, 57 - n2, n2 + 1, 21, 57 - n2, n2 + 1, 57 - n2, n, n, false);
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block23;
                                }
                                n2 = 23;
                            }
                            while (n2 < 53) {
                                this.a(z2, q, 52, 5, n2, b10);
                                n2 += 3;
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block24;
                            }
                            this.a(z2, q, 52, 5, 52, b10);
                            this.a(z2, b10, 51, 1, 52, 53, 3, 52, l, l, false);
                        }
                        this.a(z2, b10, 52, 1, 51, 52, 3, 53, l, l, false);
                    }
                    n3 = this.a(b10, 0, 51, 57, 57) ? 1 : 0;
                }
                if (arrstring == null) break block25;
                if (n3 == 0) break block26;
                this.a(z2, b10, 7, 0, 51, 50, 0, 57, l, l, false);
                this.a(z2, b10, 7, 1, 51, 50, 10, 57, false);
                n3 = n2 = 0;
            }
            while (n2 < 4) {
                this.a(z2, b10, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, n, n, false);
                ++n2;
                if (arrstring != null) continue;
            }
        }
    }

    private void f(z z2, Random random, b b10) {
        block11: {
            block9: {
                int n2;
                String[] arrstring;
                block8: {
                    block7: {
                        block10: {
                            arrstring = u.b();
                            int n3 = this.a(b10, 15, 20, 42, 21);
                            if (arrstring == null) break block10;
                            if (n3 == 0) break block11;
                            this.a(z2, b10, 15, 0, 21, 42, 0, 21, l, l, false);
                            this.a(z2, b10, 26, 1, 21, 31, 3, 21, false);
                            this.a(z2, b10, 21, 12, 21, 36, 12, 21, l, l, false);
                            this.a(z2, b10, 17, 11, 21, 40, 11, 21, l, l, false);
                            this.a(z2, b10, 16, 10, 21, 41, 10, 21, l, l, false);
                            this.a(z2, b10, 15, 7, 21, 42, 9, 21, l, l, false);
                            this.a(z2, b10, 16, 6, 21, 41, 6, 21, l, l, false);
                            this.a(z2, b10, 17, 5, 21, 40, 5, 21, l, l, false);
                            this.a(z2, b10, 21, 4, 21, 36, 4, 21, l, l, false);
                            this.a(z2, b10, 22, 3, 21, 26, 3, 21, l, l, false);
                            this.a(z2, b10, 31, 3, 21, 35, 3, 21, l, l, false);
                            this.a(z2, b10, 23, 2, 21, 25, 2, 21, l, l, false);
                            this.a(z2, b10, 32, 2, 21, 34, 2, 21, l, l, false);
                            this.a(z2, b10, 28, 4, 20, 29, 4, 21, n, n, false);
                            this.a(z2, n, 27, 3, 21, b10);
                            this.a(z2, n, 30, 3, 21, b10);
                            this.a(z2, n, 26, 2, 21, b10);
                            this.a(z2, n, 31, 2, 21, b10);
                            this.a(z2, n, 25, 1, 21, b10);
                            this.a(z2, n, 32, 1, 21, b10);
                            n3 = n2 = 0;
                        }
                        while (n2 < 7) {
                            this.a(z2, k, 28 - n2, 6 + n2, 21, b10);
                            this.a(z2, k, 29 + n2, 6 + n2, 21, b10);
                            ++n2;
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block7;
                        }
                        n2 = 0;
                    }
                    while (n2 < 4) {
                        this.a(z2, k, 28 - n2, 9 + n2, 21, b10);
                        this.a(z2, k, 29 + n2, 9 + n2, 21, b10);
                        ++n2;
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block8;
                    }
                    this.a(z2, k, 28, 12, 21, b10);
                    this.a(z2, k, 29, 12, 21, b10);
                }
                for (n2 = 0; n2 < 3; ++n2) {
                    this.a(z2, k, 22 - n2 * 2, 8, 21, b10);
                    this.a(z2, k, 22 - n2 * 2, 9, 21, b10);
                    this.a(z2, k, 35 + n2 * 2, 8, 21, b10);
                    this.a(z2, k, 35 + n2 * 2, 9, 21, b10);
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block9;
                }
                this.a(z2, b10, 15, 13, 21, 42, 15, 21, false);
                this.a(z2, b10, 15, 1, 21, 15, 6, 21, false);
                this.a(z2, b10, 16, 1, 21, 16, 5, 21, false);
                this.a(z2, b10, 17, 1, 21, 20, 4, 21, false);
                this.a(z2, b10, 21, 1, 21, 21, 3, 21, false);
                this.a(z2, b10, 22, 1, 21, 22, 2, 21, false);
                this.a(z2, b10, 23, 1, 21, 24, 1, 21, false);
                this.a(z2, b10, 42, 1, 21, 42, 6, 21, false);
                this.a(z2, b10, 41, 1, 21, 41, 5, 21, false);
                this.a(z2, b10, 37, 1, 21, 40, 4, 21, false);
                this.a(z2, b10, 36, 1, 21, 36, 3, 21, false);
                this.a(z2, b10, 33, 1, 21, 34, 1, 21, false);
            }
            this.a(z2, b10, 35, 1, 21, 35, 2, 21, false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private List<s> a(Random var1_1) {
        block42: {
            block41: {
                block39: {
                    block37: {
                        block35: {
                            var3_2 = new s[75];
                            var4_3 = 0;
                            var2_5 = u.b();
                            while (var4_3 < 5) {
                                block36: {
                                    v0 = 0;
                                    if (var2_5 == null) break block35;
                                    for (var5_6 = v156010; var5_6 < 4; ++var5_6) {
                                        var6_8 = 0;
                                        var7_10 = aE.a(var4_3, 0, var5_6);
                                        var3_2[var7_10] = new s(var7_10);
                                        if (var2_5 != null) {
                                            if (var2_5 != null) continue;
                                        }
                                        break block36;
                                    }
                                    ++var4_3;
                                }
                                if (var2_5 != null) continue;
                            }
                            v0 = var4_3 = 0;
                        }
                        while (var4_3 < 5) {
                            block38: {
                                v1 = 0;
                                if (var2_5 == null) break block37;
                                for (var5_6 = v156031; var5_6 < 4; ++var5_6) {
                                    var6_8 = 1;
                                    var7_10 = aE.a(var4_3, 1, var5_6);
                                    var3_2[var7_10] = new s(var7_10);
                                    if (var2_5 != null) {
                                        if (var2_5 != null) continue;
                                    }
                                    break block38;
                                }
                                ++var4_3;
                            }
                            if (var2_5 != null) continue;
                        }
                        v1 = var4_3 = 1;
                    }
                    while (var4_3 < 4) {
                        block40: {
                            v2 = 0;
                            if (var2_5 == null) break block39;
                            for (var5_6 = v156056; var5_6 < 2; ++var5_6) {
                                var6_8 = 2;
                                var7_10 = aE.a(var4_3, 2, var5_6);
                                var3_2[var7_10] = new s(var7_10);
                                if (var2_5 != null) {
                                    if (var2_5 != null) continue;
                                }
                                break block40;
                            }
                            ++var4_3;
                        }
                        if (var2_5 != null) continue;
                    }
                    this.r = var3_2[aE.o];
                    v2 = 0;
                }
                var4_3 = v2;
                block6: while (true) {
                    v3 = var4_3;
                    block7: while (v3 < 5) {
                        for (var5_6 = 0; var5_6 < 5; ++var5_6) {
                            v3 = 0;
                            if (var2_5 == null) continue block7;
                            var6_8 = v3;
                            block9: while (true) {
                                v4 = var6_8;
                                block10: while (v4 < 3) {
                                    block43: {
                                        var7_10 = aE.a(var4_3, var6_8, var5_6);
                                        if (var2_5 == null) continue block9;
                                        v5 = var3_2[var7_10];
                                        if (var2_5 == null) break block41;
                                        if (v5 == null) break block43;
                                        var8_12 = aA.values();
                                        var9_14 = var8_12.length;
                                        var10_16 = 0;
                                        while (var10_16 < var9_14) {
                                            block44: {
                                                block45: {
                                                    block51: {
                                                        block50: {
                                                            block49: {
                                                                block48: {
                                                                    block47: {
                                                                        block46: {
                                                                            var11_19 = var8_12[var10_16];
                                                                            var12_21 = var4_3 + var11_19.r();
                                                                            var13_22 = var6_8 + var11_19.p();
                                                                            var14_23 = var5_6 + var11_19.i();
                                                                            if (var2_5 == null) break block44;
                                                                            v4 = var12_21;
                                                                            if (var2_5 == null) continue block10;
                                                                            if (v4 < 0) break block45;
                                                                            v6 = var12_21;
                                                                            if (var2_5 == null) break block46;
                                                                            if (v6 >= 5) break block45;
                                                                            v6 = var14_23;
                                                                        }
                                                                        if (var2_5 == null) break block47;
                                                                        if (v6 < 0) break block45;
                                                                        v6 = var14_23;
                                                                    }
                                                                    if (var2_5 == null) break block48;
                                                                    if (v6 >= 5) break block45;
                                                                    v6 = var13_22;
                                                                }
                                                                if (var2_5 == null) break block49;
                                                                if (v6 < 0) break block45;
                                                                v6 = var13_22;
                                                            }
                                                            v7 = 3;
                                                            if (var2_5 == null) break block50;
                                                            if (v6 >= v7) break block45;
                                                            v6 = var12_21;
                                                            v7 = var13_22;
                                                        }
                                                        var15_24 = aE.a(v6, v7, var14_23);
                                                        if (var2_5 == null) break block44;
                                                        if (var3_2[var15_24] == null) break block45;
                                                        if (var14_23 != var5_6) break block51;
                                                        var3_2[var7_10].a((aA)var11_19, var3_2[var15_24]);
                                                        if (var2_5 != null) break block45;
                                                    }
                                                    var3_2[var7_10].a(var11_19.h(), var3_2[var15_24]);
                                                }
                                                ++var10_16;
                                            }
                                            if (var2_5 != null) continue;
                                        }
                                    }
                                    ++var6_8;
                                    if (var2_5 != null) continue block9;
                                }
                                break;
                            }
                            if (var2_5 != null) continue;
                        }
                        ++var4_3;
                        if (var2_5 != null) continue block6;
                    }
                    break;
                }
                v5 = new s(1003);
            }
            var4_4 = v5;
            var5_7 = new s(1001);
            var6_9 = new s(1002);
            var3_2[aE.g].a(aA.UP, var4_4);
            var3_2[aE.h].a(aA.SOUTH, var5_7);
            var3_2[aE.i].a(aA.SOUTH, var6_9);
            var4_4.a = true;
            var5_7.a = true;
            var6_9.a = true;
            this.r.e = true;
            this.s = var3_2[aE.a(var1_1.nextInt(4), 0, 2)];
            this.s.a = true;
            this.s.f[aA.EAST.f()].a = true;
            this.s.f[aA.NORTH.f()].a = true;
            this.s.f[aA.EAST.f()].f[aA.NORTH.f()].a = true;
            this.s.f[aA.UP.f()].a = true;
            this.s.f[aA.EAST.f()].f[aA.UP.f()].a = true;
            this.s.f[aA.NORTH.f()].f[aA.UP.f()].a = true;
            this.s.f[aA.EAST.f()].f[aA.NORTH.f()].f[aA.UP.f()].a = true;
            var7_11 = Lists.newArrayList();
            var8_12 = var3_2;
            var9_14 = var8_12.length;
            var10_16 = 0;
            while (var10_16 < var9_14) {
                var11_19 = var8_12[var10_16];
                if (var2_5 != null) {
                    v8 = var11_19;
                    if (var2_5 == null) break block42;
                    if (v8 != null) {
                        var11_19.b();
                        var7_11.add(var11_19);
                    }
                    ++var10_16;
                }
                if (var2_5 != null) continue;
            }
            v8 = var4_4;
        }
        v8.b();
        Collections.shuffle(var7_11, var1_1);
        var8_13 = 1;
        for (s var10_18 : var7_11) {
            var11_20 = 0;
            v9 = 0;
            if (var2_5 == null) return var7_11;
            var12_21 = v9;
            block14: while (true) {
                v10 = var11_20;
                v11 = 2;
                while (v10 < v11) {
                    v12 = var12_21++;
                    if (var2_5 != null) {
                        v11 = 5;
                        if (var2_5 == null) continue;
                        if (v12 >= v11) break block14;
                        v12 = var1_1.nextInt(6);
                    }
                    var13_22 = v12;
                    v13 = var10_18.c[var13_22];
                    if (var2_5 != null) {
                        if (v13 == 0) continue block14;
                        v13 = aA.a(var13_22).h().f();
                    }
                    var14_23 = v13;
                    var10_18.c[var13_22] = false;
                    var10_18.f[var13_22].c[var14_23] = false;
                    v14 = var10_18;
                    if (var2_5 != null) {
                        if (v14.a(var8_13++)) {
                            v14 = var10_18.f[var13_22];
                            if (var2_5 != null) {
                                if (v14.a(var8_13++)) {
                                    ++var11_20;
                                    if (var2_5 != null) continue block14;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 4 sources

                        {
                            var10_18.c[var13_22] = true;
                            v14 = var10_18.f[var13_22];
                        }
                    }
                    v14.c[var14_23] = true;
                    if (var2_5 != null) continue block14;
                }
                break;
            }
            if (var2_5 != null) continue;
        }
        var7_11.add(var4_4);
        var7_11.add(var5_7);
        v9 = var7_11.add(var6_9) ? 1 : 0;
        return var7_11;
    }

    public aE() {
        this.t = Lists.newArrayList();
    }

    private void c(z z2, Random random, b b10) {
        block4: {
            int n2;
            String[] arrstring;
            block3: {
                arrstring = u.b();
                int n3 = this.a(b10, 22, 5, 35, 17);
                if (arrstring == null) break block3;
                if (n3 == 0) break block4;
                this.a(z2, b10, 25, 0, 0, 32, 8, 20, false);
                n3 = n2 = 0;
            }
            while (n2 < 4) {
                this.a(z2, b10, 24, 2, 5 + n2 * 4, 24, 4, 5 + n2 * 4, n, n, false);
                this.a(z2, b10, 22, 4, 5 + n2 * 4, 23, 4, 5 + n2 * 4, n, n, false);
                this.a(z2, n, 25, 5, 5 + n2 * 4, b10);
                this.a(z2, n, 26, 6, 5 + n2 * 4, b10);
                this.a(z2, m, 26, 5, 5 + n2 * 4, b10);
                this.a(z2, b10, 33, 2, 5 + n2 * 4, 33, 4, 5 + n2 * 4, n, n, false);
                this.a(z2, b10, 34, 4, 5 + n2 * 4, 35, 4, 5 + n2 * 4, n, n, false);
                this.a(z2, n, 32, 5, 5 + n2 * 4, b10);
                this.a(z2, n, 31, 6, 5 + n2 * 4, b10);
                this.a(z2, m, 31, 5, 5 + n2 * 4, b10);
                this.a(z2, b10, 27, 6, 5 + n2 * 4, 30, 6, 5 + n2 * 4, l, l, false);
                ++n2;
                if (arrstring != null) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(boolean var1_1, int var2_2, z var3_3, Random var4_4, b var5_5) {
        block15: {
            block14: {
                block13: {
                    block12: {
                        var7_6 = 24;
                        var6_7 = u.b();
                        v0 = this.a(var5_5, var2_2, 0, var2_2 + 23, 20);
                        if (var6_7 != null) {
                            if (v0 == 0) return;
                            this.a(var3_3, var5_5, var2_2 + 0, 0, 0, var2_2 + 24, 0, 20, aE.l, aE.l, false);
                            this.a(var3_3, var5_5, var2_2 + 0, 1, 0, var2_2 + 24, 10, 20, false);
                            v0 = var8_8 = 0;
                        }
                        while (var8_8 < 4) {
                            this.a(var3_3, var5_5, var2_2 + var8_8, var8_8 + 1, var8_8, var2_2 + var8_8, var8_8 + 1, 20, aE.n, aE.n, false);
                            this.a(var3_3, var5_5, var2_2 + var8_8 + 7, var8_8 + 5, var8_8 + 7, var2_2 + var8_8 + 7, var8_8 + 5, 20, aE.n, aE.n, false);
                            this.a(var3_3, var5_5, var2_2 + 17 - var8_8, var8_8 + 5, var8_8 + 7, var2_2 + 17 - var8_8, var8_8 + 5, 20, aE.n, aE.n, false);
                            this.a(var3_3, var5_5, var2_2 + 24 - var8_8, var8_8 + 1, var8_8, var2_2 + 24 - var8_8, var8_8 + 1, 20, aE.n, aE.n, false);
                            this.a(var3_3, var5_5, var2_2 + var8_8 + 1, var8_8 + 1, var8_8, var2_2 + 23 - var8_8, var8_8 + 1, var8_8, aE.n, aE.n, false);
                            this.a(var3_3, var5_5, var2_2 + var8_8 + 8, var8_8 + 5, var8_8 + 7, var2_2 + 16 - var8_8, var8_8 + 5, var8_8 + 7, aE.n, aE.n, false);
                            ++var8_8;
                            if (var6_7 != null) {
                                if (var6_7 != null) continue;
                            }
                            break block12;
                        }
                        this.a(var3_3, var5_5, var2_2 + 4, 4, 4, var2_2 + 6, 4, 20, aE.l, aE.l, false);
                        this.a(var3_3, var5_5, var2_2 + 7, 4, 4, var2_2 + 17, 4, 6, aE.l, aE.l, false);
                        this.a(var3_3, var5_5, var2_2 + 18, 4, 4, var2_2 + 20, 4, 20, aE.l, aE.l, false);
                        this.a(var3_3, var5_5, var2_2 + 11, 8, 11, var2_2 + 13, 8, 20, aE.l, aE.l, false);
                        this.a(var3_3, aE.q, var2_2 + 12, 9, 12, var5_5);
                        this.a(var3_3, aE.q, var2_2 + 12, 9, 15, var5_5);
                        this.a(var3_3, aE.q, var2_2 + 12, 9, 18, var5_5);
                    }
                    v1 = var1_1;
                    if (var6_7 != null) {
                        v1 = v1 != 0 ? 19 : 5;
                    }
                    var8_8 = var2_2 + v1;
                    v2 = var1_1;
                    if (var6_7 != null) {
                        v2 = v2 != 0 ? 5 : 19;
                    }
                    var9_9 = var2_2 + v2;
                    for (var10_10 = 20; var10_10 >= 5; var10_10 -= 3) {
                        this.a(var3_3, aE.q, var8_8, 5, var10_10, var5_5);
                        if (var6_7 != null) {
                            if (var6_7 != null) continue;
                        }
                        break block13;
                    }
                    var10_10 = 19;
                }
                while (var10_10 >= 7) {
                    this.a(var3_3, aE.q, var9_9, 5, var10_10, var5_5);
                    var10_10 -= 3;
                    if (var6_7 != null) {
                        if (var6_7 != null) continue;
                    }
                    break block14;
                }
                var10_10 = 0;
            }
            while (var10_10 < 4) {
                if (var6_7 == null) break block15;
                v3 = var1_1;
                if (var6_7 == null) ** GOTO lbl59
                if (v3 != 0) {
                    v4 = var2_2 + (24 - (17 - var10_10 * 3));
                } else {
                    v3 = var2_2 + 17;
lbl59:
                    // 2 sources

                    v4 = v3 - var10_10 * 3;
                }
                var11_11 = v4;
                this.a(var3_3, aE.q, var11_11, 5, 5, var5_5);
                ++var10_10;
                if (var6_7 != null) continue;
            }
            this.a(var3_3, aE.q, var9_9, 5, 5, var5_5);
            this.a(var3_3, var5_5, var2_2 + 11, 1, 12, var2_2 + 13, 7, 12, aE.l, aE.l, false);
        }
        this.a(var3_3, var5_5, var2_2 + 12, 1, 11, var2_2 + 12, 7, 13, aE.l, aE.l, false);
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        block24: {
            aE aE2;
            String[] arrstring;
            block23: {
                int n2;
                block20: {
                    int n3;
                    int n4 = Math.max(z2.y(), 64) - this.e.e;
                    this.a(z2, b10, 0, 0, 0, 58, n4, 58, false);
                    this.a(false, 0, z2, random, b10);
                    this.a(true, 33, z2, random, b10);
                    this.c(z2, random, b10);
                    this.f(z2, random, b10);
                    String[] arrstring2 = u.b();
                    this.d(z2, random, b10);
                    this.b(z2, random, b10);
                    arrstring = arrstring2;
                    this.a(z2, random, b10);
                    this.e(z2, random, b10);
                    n2 = 0;
                    block0: while (true) {
                        int n5 = n2;
                        block1: while (n5 < 7) {
                            n3 = 0;
                            if (arrstring == null) break block20;
                            int n6 = n3;
                            while (n6 < 7) {
                                block30: {
                                    block29: {
                                        int n7;
                                        block28: {
                                            block21: {
                                                int n8;
                                                block25: {
                                                    int n9;
                                                    int n10;
                                                    block27: {
                                                        block26: {
                                                            n5 = n6;
                                                            if (arrstring == null) continue block1;
                                                            if (arrstring == null) break block25;
                                                            if (n5 != 0) break block26;
                                                            n10 = n2;
                                                            n9 = 3;
                                                            if (arrstring == null) break block27;
                                                            if (n10 == n9) {
                                                                n6 = 6;
                                                            }
                                                        }
                                                        n10 = n2;
                                                        n9 = 9;
                                                    }
                                                    n8 = n10 * n9;
                                                }
                                                void var8_11 = n8;
                                                int n11 = n6 * 9;
                                                int n12 = 0;
                                                while (n12 < 4) {
                                                    block22: {
                                                        n7 = 0;
                                                        if (arrstring == null) break block21;
                                                        for (int i2 = v160354; i2 < 4; ++i2) {
                                                            this.a(z2, n, (int)(var8_11 + n12), 0, n11 + i2, b10);
                                                            this.b(z2, n, (int)(var8_11 + n12), -1, n11 + i2, b10);
                                                            if (arrstring != null) {
                                                                if (arrstring != null) continue;
                                                            }
                                                            break block22;
                                                        }
                                                        ++n12;
                                                    }
                                                    if (arrstring != null) continue;
                                                }
                                                n7 = n2;
                                            }
                                            if (arrstring == null) break block28;
                                            if (n7 == 0) break block29;
                                            n7 = n2;
                                        }
                                        if (n7 == 6) break block29;
                                        n6 += 6;
                                        if (arrstring != null) break block30;
                                    }
                                    ++n6;
                                }
                                if (arrstring != null) continue;
                            }
                            ++n2;
                            if (arrstring != null) continue block0;
                        }
                        break;
                    }
                    n3 = n2 = 0;
                }
                while (n2 < 5) {
                    this.a(z2, b10, -1 - n2, 0 + n2 * 2, -1 - n2, -1 - n2, 23, 58 + n2, false);
                    this.a(z2, b10, 58 + n2, 0 + n2 * 2, -1 - n2, 58 + n2, 23, 58 + n2, false);
                    this.a(z2, b10, 0 - n2, 0 + n2 * 2, -1 - n2, 57 + n2, 23, -1 - n2, false);
                    aE2 = this;
                    if (arrstring != null) {
                        aE2.a(z2, b10, 0 - n2, 0 + n2 * 2, 58 + n2, 57 + n2, 23, 58 + n2, false);
                        ++n2;
                        if (arrstring != null) continue;
                    }
                    break block23;
                }
                aE2 = this;
            }
            for (Y y2 : aE2.t) {
                bl2 = y2.a().b(b10);
                if (arrstring != null) {
                    if (arrstring != null && bl2) {
                        y2.a(z2, random, b10);
                    }
                    if (arrstring != null) continue;
                }
                break block24;
            }
            bl2 = true;
        }
        return bl2;
    }

    private void d(z z2, Random random, b b10) {
        block5: {
            block3: {
                int n2;
                String[] arrstring;
                block4: {
                    arrstring = u.b();
                    int n3 = this.a(b10, 21, 21, 36, 36);
                    if (arrstring == null) break block4;
                    if (n3 == 0) break block5;
                    this.a(z2, b10, 21, 0, 22, 36, 0, 36, l, l, false);
                    this.a(z2, b10, 21, 1, 22, 36, 23, 36, false);
                    n3 = n2 = 0;
                }
                while (n2 < 4) {
                    this.a(z2, b10, 21 + n2, 13 + n2, 21 + n2, 36 - n2, 13 + n2, 21 + n2, n, n, false);
                    this.a(z2, b10, 21 + n2, 13 + n2, 36 - n2, 36 - n2, 13 + n2, 36 - n2, n, n, false);
                    this.a(z2, b10, 21 + n2, 13 + n2, 22 + n2, 21 + n2, 13 + n2, 35 - n2, n, n, false);
                    this.a(z2, b10, 36 - n2, 13 + n2, 22 + n2, 36 - n2, 13 + n2, 35 - n2, n, n, false);
                    ++n2;
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block3;
                }
                this.a(z2, b10, 25, 16, 25, 32, 16, 32, l, l, false);
                this.a(z2, b10, 25, 17, 25, 25, 19, 25, n, n, false);
                this.a(z2, b10, 32, 17, 25, 32, 19, 25, n, n, false);
                this.a(z2, b10, 25, 17, 32, 25, 19, 32, n, n, false);
                this.a(z2, b10, 32, 17, 32, 32, 19, 32, n, n, false);
                this.a(z2, n, 26, 20, 26, b10);
                this.a(z2, n, 27, 21, 27, b10);
                this.a(z2, m, 27, 20, 27, b10);
                this.a(z2, n, 26, 20, 31, b10);
                this.a(z2, n, 27, 21, 30, b10);
                this.a(z2, m, 27, 20, 30, b10);
                this.a(z2, n, 31, 20, 31, b10);
                this.a(z2, n, 30, 21, 30, b10);
                this.a(z2, m, 30, 20, 30, b10);
                this.a(z2, n, 31, 20, 26, b10);
                this.a(z2, n, 30, 21, 27, b10);
                this.a(z2, m, 30, 20, 27, b10);
                this.a(z2, b10, 28, 21, 27, 29, 21, 27, l, l, false);
                this.a(z2, b10, 27, 21, 28, 27, 21, 29, l, l, false);
                this.a(z2, b10, 28, 21, 30, 29, 21, 30, l, l, false);
            }
            this.a(z2, b10, 30, 21, 28, 30, 21, 29, l, l, false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(z var1_1, Random var2_2, b var3_3) {
        block23: {
            block24: {
                block21: {
                    var4_4 = u.b();
                    v0 = this.a(var3_3, 7, 21, 13, 50);
                    if (var4_4 != null) {
                        if (v0 != 0) {
                            block20: {
                                this.a(var1_1, var3_3, 7, 0, 21, 13, 0, 50, aE.l, aE.l, false);
                                this.a(var1_1, var3_3, 7, 1, 21, 13, 10, 50, false);
                                this.a(var1_1, var3_3, 11, 8, 21, 13, 8, 53, aE.l, aE.l, false);
                                for (var5_5 = 0; var5_5 < 4; ++var5_5) {
                                    this.a(var1_1, var3_3, var5_5 + 7, var5_5 + 5, 21, var5_5 + 7, var5_5 + 5, 54, aE.n, aE.n, false);
                                    if (var4_4 != null) {
                                        if (var4_4 != null) continue;
                                    }
                                    break block20;
                                }
                                var5_5 = 21;
                            }
                            while (var5_5 <= 45) {
                                this.a(var1_1, aE.q, 12, 9, var5_5, var3_3);
                                var5_5 += 3;
                                if (var4_4 != null) {
                                    if (var4_4 != null) continue;
                                }
                                break block21;
                            }
                        }
                        v0 = this.a(var3_3, 44, 21, 50, 54);
                    }
                    if (var4_4 != null) {
                        if (v0 != 0) {
                            block22: {
                                this.a(var1_1, var3_3, 44, 0, 21, 50, 0, 50, aE.l, aE.l, false);
                                this.a(var1_1, var3_3, 44, 1, 21, 50, 10, 50, false);
                                this.a(var1_1, var3_3, 44, 8, 21, 46, 8, 53, aE.l, aE.l, false);
                                for (var5_5 = 0; var5_5 < 4; ++var5_5) {
                                    this.a(var1_1, var3_3, 50 - var5_5, var5_5 + 5, 21, 50 - var5_5, var5_5 + 5, 54, aE.n, aE.n, false);
                                    if (var4_4 != null) {
                                        if (var4_4 != null) continue;
                                    }
                                    break block22;
                                }
                                var5_5 = 21;
                            }
                            while (var5_5 <= 45) {
                                this.a(var1_1, aE.q, 45, 9, var5_5, var3_3);
                                var5_5 += 3;
                                if (var4_4 == null) return;
                                if (var4_4 != null) continue;
                            }
                        } else {
                            ** GOTO lbl40
                        }
                    }
                    break block24;
                }
                v0 = this.a(var3_3, 8, 44, 49, 54) ? 1 : 0;
            }
            if (var4_4 != null) {
                if (v0 == 0) return;
                this.a(var1_1, var3_3, 14, 0, 44, 43, 0, 50, aE.l, aE.l, false);
                this.a(var1_1, var3_3, 14, 1, 44, 43, 10, 50, false);
                v0 = var5_5 = 12;
            }
            while (var5_5 <= 45) {
                block31: {
                    block25: {
                        block26: {
                            block30: {
                                block29: {
                                    block28: {
                                        block27: {
                                            this.a(var1_1, aE.q, var5_5, 9, 45, var3_3);
                                            this.a(var1_1, aE.q, var5_5, 9, 52, var3_3);
                                            if (var4_4 == null) break block25;
                                            v1 = var5_5;
                                            v2 = 12;
                                            if (var4_4 == null) ** GOTO lbl98
                                            if (v1 == v2) break block26;
                                            v3 = var5_5;
                                            v4 = 18;
                                            if (var4_4 == null) break block27;
                                            if (v3 == v4) break block26;
                                            v3 = var5_5;
                                            v4 = 24;
                                        }
                                        if (var4_4 == null) break block28;
                                        if (v3 == v4) break block26;
                                        v3 = var5_5;
                                        v4 = 33;
                                    }
                                    if (var4_4 == null) break block29;
                                    if (v3 == v4) break block26;
                                    v3 = var5_5;
                                    v4 = 39;
                                }
                                if (var4_4 == null) break block30;
                                if (v3 == v4) break block26;
                                v3 = var5_5;
                                v4 = 45;
                            }
                            if (v3 != v4) break block31;
                        }
                        this.a(var1_1, aE.q, var5_5, 9, 47, var3_3);
                        this.a(var1_1, aE.q, var5_5, 9, 50, var3_3);
                        this.a(var1_1, aE.q, var5_5, 10, 45, var3_3);
                        this.a(var1_1, aE.q, var5_5, 10, 46, var3_3);
                        this.a(var1_1, aE.q, var5_5, 10, 51, var3_3);
                        this.a(var1_1, aE.q, var5_5, 10, 52, var3_3);
                        this.a(var1_1, aE.q, var5_5, 11, 47, var3_3);
                        this.a(var1_1, aE.q, var5_5, 11, 50, var3_3);
                        this.a(var1_1, aE.q, var5_5, 12, 48, var3_3);
                    }
                    this.a(var1_1, aE.q, var5_5, 12, 49, var3_3);
                }
                var5_5 += 3;
                if (var4_4 != null) continue;
            }
            var5_5 = 0;
            do {
                v1 = var5_5;
                v2 = 3;
lbl98:
                // 2 sources

                if (v1 >= v2) break;
                this.a(var1_1, var3_3, 8 + var5_5, 5 + var5_5, 54, 49 - var5_5, 5 + var5_5, 54, aE.l, aE.l, false);
                ++var5_5;
                if (var4_4 == null) break block23;
            } while (var4_4 != null);
            this.a(var1_1, var3_3, 11, 8, 54, 46, 8, 54, aE.n, aE.n, false);
        }
        this.a(var1_1, var3_3, 14, 8, 44, 43, 8, 53, aE.l, aE.l, false);
    }
}

