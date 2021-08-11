/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.ah;

import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import net.minecraft.U.C;
import net.minecraft.U.a;
import net.minecraft.U.k;
import net.minecraft.W.bp;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.al;
import net.minecraft.i.j;
import net.minecraft.k.f;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

public final class E {
    private final /* synthetic */ Set<f> a;
    private static final /* synthetic */ int b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static n a(z var0, int var1_1, int var2_2) {
        var4_3 = var0.b(var1_1, var2_2);
        var3_4 = z.I();
        var5_5 = var1_1 * 16 + var0.J.nextInt(16);
        var6_6 = var2_2 * 16 + var0.J.nextInt(16);
        v0 = var7_7 = h.d(var4_3.g(new n(var5_5, 0, var6_6)) + 1, 16);
        if (var3_4 == null) ** GOTO lbl11
        if (v0 > 0) {
            v1 = var7_7;
        } else {
            v0 = var4_3.b() + 16;
lbl11:
            // 2 sources

            v1 = v0 - 1;
        }
        var8_8 = var0.J.nextInt(v1);
        return new n(var5_5, var8_8, var6_6);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void a(z var0, net.minecraft.A.h var1_1, int var2_2, int var3_3, int var4_4, int var5_5, Random var6_6) {
        var8_7 = var1_1.a(k.CREATURE);
        var7_8 = z.I();
        v0 = var8_7.isEmpty();
        if (var7_8 == null) ** GOTO lbl8
        if (v0 != 0) return;
        do {
            v0 = (cfr_temp_0 = var6_6.nextFloat() - var1_1.j()) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
lbl8:
            // 2 sources

            block3: while (true) {
                if (v0 >= 0) return;
                var9_9 = al.a(var0.J, var8_7);
                var10_10 = var9_9.d + var6_6.nextInt(1 + var9_9.c - var9_9.d);
                var11_11 = null;
                var12_12 = var2_2 + var6_6.nextInt(var4_4);
                var13_13 = var3_3 + var6_6.nextInt(var5_5);
                var14_14 = var12_12;
                var15_15 = var13_13;
                var16_16 = 0;
                block4: while (true) {
                    v1 = var16_16;
                    v2 = var10_10;
                    block5: while (v1 < v2) {
                        var17_17 = false;
                        v0 = 0;
                        if (var7_8 == null) continue block3;
                        var18_18 = v0;
                        while (!var17_17) {
                            block13: {
                                v1 = var18_18;
                                v2 = 4;
                                if (var7_8 == null) continue block5;
                                if (v1 >= v2) break;
                                var19_19 = var0.c(new n(var12_12, 0, var13_13));
                                v3 = E.a(net.minecraft.U.a.ON_GROUND, var0, var19_19);
                                if (var7_8 != null) {
                                    if (v3 != 0) {
                                        try {
                                            var20_20 = var9_9.b.getConstructor(new Class[]{z.class}).newInstance(new Object[]{var0});
                                        }
                                        catch (Exception var21_21) {
                                            var21_21.printStackTrace();
                                            break block13;
                                        }
                                        var20_20.c((float)var12_12 + 0.5f, var19_19.b(), (float)var13_13 + 0.5f, var6_6.nextFloat() * 360.0f, 0.0f);
                                        var0.f(var20_20);
                                        var11_11 = var20_20.a(var0.h(new n(var20_20)), var11_11);
                                        var17_17 = true;
                                    }
                                    var12_12 += var6_6.nextInt(5) - var6_6.nextInt(5);
                                    v3 = var13_13 + (var6_6.nextInt(5) - var6_6.nextInt(5));
                                }
                                var13_13 = v3 ? 1 : 0;
                                do {
                                    block15: {
                                        block14: {
                                            if (var12_12 < var2_2) break block14;
                                            v4 = var12_12;
                                            v5 = var2_2 + var4_4;
                                            if (var7_8 == null || var7_8 == null) break block15;
                                            if (v4 >= v5) break block14;
                                            v4 = var13_13;
                                            v5 = var3_3;
                                            if (var7_8 != null) {
                                                if (v4 >= v5) {
                                                    v4 = var13_13;
                                                    v5 = var3_3 + var4_4;
                                                    if (var7_8 != null) {
                                                        if (v4 < v5) break;
                                                    } else {
                                                        ** GOTO lbl65
                                                    }
                                                } else {
                                                    ** GOTO lbl64
                                                }
                                            }
                                            break block15;
lbl64:
                                            // 2 sources

                                            break block14;
lbl65:
                                            // 2 sources

                                            break block15;
                                        }
                                        var12_12 = var14_14 + var6_6.nextInt(5) - var6_6.nextInt(5);
                                        v4 = var15_15 + var6_6.nextInt(5);
                                        v5 = var6_6.nextInt(5);
                                    }
                                    var13_13 = v4 - v5;
                                } while (var7_8 != null);
                            }
                            ++var18_18;
                            if (var7_8 != null) continue;
                        }
                        ++var16_16;
                        if (var7_8 != null) continue block4;
                    }
                    break block3;
                    break;
                }
                break;
            }
        } while (var7_8 != null);
    }

    static {
        b = (int)Math.pow(17.0, 2.0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(a var0, z var1_1, n var2_2) {
        block14: {
            block11: {
                block13: {
                    block12: {
                        var3_3 = z.I();
                        v0 = var1_1;
                        if (var3_3 != null) {
                            if (!v0.O().a(var2_2)) {
                                return false;
                            }
                            v0 = var1_1;
                        }
                        var4_4 = v0.d(var2_2);
                        if (var0 != net.minecraft.U.a.IN_WATER) break block11;
                        v1 = var4_4.o();
                        v2 = c.L;
                        if (var3_3 == null) break block12;
                        if (v1 != v2) return false;
                        v3 = var1_1.d(var2_2.k());
                        if (var3_3 == null) break block13;
                        v1 = v3.o();
                        v2 = c.L;
                    }
                    if (v1 != v2) return false;
                    v3 = var1_1.d(var2_2.a());
                }
                v4 = v3.r();
                if (var3_3 == null) return v4;
                if (v4 != false) return false;
                return true;
            }
            var5_5 = var2_2.k();
            v5 = var1_1.d(var5_5);
            if (var3_3 != null) {
                if (!v5.d()) {
                    return false;
                }
                v5 = var1_1.d(var5_5);
            }
            v6 = var6_6 = v5.b();
            v7 = g.g;
            if (var3_3 == null) break block14;
            if (v6 == v7) ** GOTO lbl-1000
            v6 = var6_6;
            v7 = g.ah;
        }
        if (v6 != v7) {
            v8 = true;
        } else lbl-1000:
        // 2 sources

        {
            v8 = false;
        }
        v9 = var7_7 = v8;
        if (var3_3 != null) {
            if (v9 == false) return false;
            v9 = E.a(var4_4);
        }
        if (var3_3 != null) {
            if (v9 == false) return false;
            v9 = E.a(var1_1.d(var2_2.a()));
        }
        if (var3_3 == null) return v9;
        if (v9 == false) return false;
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static boolean a(i i2) {
        String string = z.I();
        boolean bl2 = i2.e();
        if (string != null) {
            if (bl2) {
                return false;
            }
            bl2 = i2.a();
        }
        if (string != null) {
            if (bl2) {
                return false;
            }
            bl2 = i2.o().b();
        }
        if (string != null) {
            if (bl2) {
                return false;
            }
            bl2 = bp.a(i2);
        }
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public E() {
        this.a = Sets.newHashSet();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public int a(A var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        block50: {
            var5_5 = z.I();
            v0 = var2_2;
            if (var5_5 != null) {
                if (v0 == 0) {
                    v0 = var3_3;
                    if (var5_5 != null) {
                        if (v0 == 0) {
                            return 0;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    this.a.clear();
                    v0 = 0;
                }
            }
            var6_6 = v0;
            var7_7 = var1_1.k.iterator();
            block2: while (true) {
                v1 = var7_7.hasNext();
                block3: while (v1 != 0) {
                    var8_9 = (j)var7_7.next();
                    v2 = var8_9.ae();
                    if (var5_5 == null) break block50;
                    if (var5_5 != null) {
                        if (v2 != 0) continue block2;
                        v3 = h.f(var8_9.a / 16.0);
                    }
                    var9_10 = v3;
                    var10_12 = h.f(var8_9.ax / 16.0);
                    var11_13 = 8;
                    var12_14 = -8;
                    block4: while (true) {
                        v4 = var12_14;
                        v5 = 8;
                        block5: while (v4 <= v5) {
                            v1 = -8;
                            if (var5_5 == null) continue block3;
                            var13_17 = v1;
                            while (var13_17 <= 8) {
                                block52: {
                                    block53: {
                                        block54: {
                                            block51: {
                                                v6 = var12_14;
                                                if (var5_5 == null) break block51;
                                                v5 = -8;
                                                if (var5_5 == null) continue block5;
                                                if (v6 == v5) ** GOTO lbl-1000
                                                v6 = var12_14;
                                                if (var5_5 == null) break block51;
                                                if (v6 == 8) ** GOTO lbl-1000
                                                v6 = var13_17;
                                                if (var5_5 != null) {
                                                    if (v6 != -8) {
                                                        v6 = var13_17;
                                                        if (var5_5 != null) {
                                                            ** if (v6 != 8) goto lbl-1000
                                                        } else {
                                                            ** GOTO lbl51
                                                        }
                                                    } else {
                                                        ** GOTO lbl50
                                                    }
                                                }
                                                break block51;
lbl50:
                                                // 2 sources

                                                ** GOTO lbl-1000
lbl51:
                                                // 2 sources

                                                break block51;
lbl-1000:
                                                // 4 sources

                                                {
                                                    v6 = 1;
                                                    ** GOTO lbl55
                                                }
lbl-1000:
                                                // 1 sources

                                                {
                                                    v6 = 0;
                                                }
                                            }
                                            var14_18 = v6;
                                            var15_19 = new f(var12_14 + var9_10, var13_17 + var10_12);
                                            if (var5_5 == null) break block52;
                                            if (this.a.contains(var15_19)) break block53;
                                            ++var6_6;
                                            if (var5_5 == null) break block52;
                                            if (var14_18 != 0) break block53;
                                            v7 = var1_1;
                                            if (var5_5 == null) break block54;
                                            if (!v7.O().a((f)var15_19)) break block53;
                                            v7 = var1_1;
                                        }
                                        var16_20 = v7.g().c(var15_19.c, var15_19.b);
                                        if (var5_5 == null) break block52;
                                        if (var16_20 != null) {
                                            v8 = var16_20.d();
                                            if (var5_5 != null && v8) {
                                                v8 = this.a.add((f)var15_19);
                                            }
                                        }
                                    }
                                    ++var13_17;
                                }
                                if (var5_5 != null) continue;
                            }
                            ++var12_14;
                            if (var5_5 != null) continue block4;
                        }
                        break;
                    }
                    if (var5_5 != null) continue block2;
                }
                break;
            }
            v2 = 0;
        }
        var7_8 = v2;
        var8_9 = var1_1.G();
        var9_11 = k.values();
        var10_12 = var9_11.length;
        var11_13 = 0;
        block7: while (true) {
            v9 = var11_13;
            block8: while (v9 < var10_12) {
                block57: {
                    block60: {
                        block61: {
                            block58: {
                                block59: {
                                    block55: {
                                        block56: {
                                            var12_16 = var9_11[var11_13];
                                            v10 = var12_16.c() ? 1 : 0;
                                            if (var5_5 == null) return v10;
                                            if (var5_5 == null) break block55;
                                            if (v10 == 0) break block56;
                                            v11 = var3_3;
                                            if (var5_5 == null) break block55;
                                            if (v11 == 0) break block57;
                                        }
                                        v11 = var12_16.c() ? 1 : 0;
                                    }
                                    if (var5_5 == null) break block58;
                                    if (v11 != false) break block59;
                                    v11 = var2_2;
                                    if (var5_5 == null) break block58;
                                    if (v11 == 0) break block57;
                                }
                                v11 = var12_16.d() ? 1 : 0;
                            }
                            if (var5_5 == null) break block60;
                            if (v11 == 0) break block61;
                            v11 = var4_4 ? 1 : 0;
                            if (var5_5 == null) break block60;
                            if (v11 == 0) break block57;
                        }
                        v11 = var1_1.a(var12_16.a());
                    }
                    var13_17 = v11;
                    var14_18 = var12_16.b() * var6_6 / E.b;
                    if (var5_5 == null) continue block7;
                    if (var13_17 > var14_18) break block57;
                    var15_19 = new o();
                    var16_20 = this.a.iterator();
                    block9: while (true) lbl-1000:
                    // 3 sources

                    {
                        v12 = var16_20.hasNext();
                        block10: while (v12 != 0) {
                            var17_21 = var16_20.next();
                            var18_22 = E.a(var1_1, var17_21.c, var17_21.b);
                            var19_23 = var18_22.e();
                            var20_24 = var18_22.b();
                            var21_25 = var18_22.a();
                            var22_26 = var1_1.d(var18_22);
                            v9 = var22_26.r() ? 1 : 0;
                            if (var5_5 == null) continue block8;
                            if (var5_5 != null) {
                                if (v9 != 0) continue block9;
                                v13 = false;
                            }
                            var23_27 = v13;
                            var24_28 = 0;
                            block11: while (true) {
                                v14 = var24_28;
                                block12: while (v14 < 3) {
                                    var25_29 = var19_23;
                                    var26_30 = var20_24;
                                    var27_31 = var21_25;
                                    var28_32 = 6;
                                    var29_33 = null;
                                    var30_34 = null;
                                    var31_35 = h.i(Math.random() * 4.0);
                                    v12 = 0;
                                    if (var5_5 == null) continue block10;
                                    var32_36 = v12;
                                    while (var32_36 < var31_35) {
                                        block62: {
                                            block63: {
                                                block68: {
                                                    block73: {
                                                        block69: {
                                                            block72: {
                                                                block70: {
                                                                    block71: {
                                                                        block67: {
                                                                            block66: {
                                                                                block65: {
                                                                                    block64: {
                                                                                        var15_19.a(var25_29 += var1_1.J.nextInt(6) - var1_1.J.nextInt(6), var26_30 += var1_1.J.nextInt(1) - var1_1.J.nextInt(1), var27_31 += var1_1.J.nextInt(6) - var1_1.J.nextInt(6));
                                                                                        var33_37 = (float)var25_29 + 0.5f;
                                                                                        var34_38 = (float)var27_31 + 0.5f;
                                                                                        if (var5_5 == null) break block62;
                                                                                        v14 = var1_1.a(var33_37, (double)var26_30, var34_38, 24.0) ? 1 : 0;
                                                                                        if (var5_5 == null) continue block12;
                                                                                        if (v14 != 0 || !(var8_9.b(var33_37, var26_30, var34_38) >= 576.0)) break block63;
                                                                                        v15 = var29_33;
                                                                                        if (var5_5 == null) break block64;
                                                                                        if (v15 != null) break block65;
                                                                                        v16 = var1_1;
                                                                                        v17 = var12_16;
                                                                                        if (var5_5 == null) break block66;
                                                                                        v15 = var29_33 = v16.a(v17, (n)var15_19);
                                                                                    }
                                                                                    if (v15 == null && var5_5 != null) break;
                                                                                }
                                                                                v16 = var1_1;
                                                                                v17 = var12_16;
                                                                            }
                                                                            v18 = v16.a(v17, var29_33, (n)var15_19);
                                                                            if (var5_5 == null) break block67;
                                                                            if (!v18) break block63;
                                                                            v19 /* !! */  = net.minecraft.U.n.a(var29_33.b);
                                                                            if (var5_5 == null) ** GOTO lbl186
                                                                            v18 = E.a(v19 /* !! */ , var1_1, (n)var15_19);
                                                                        }
                                                                        if (!v18) break block63;
                                                                        try {
                                                                            v19 /* !! */  = var29_33.b.getConstructor(new Class[]{z.class}).newInstance(new Object[]{var1_1});
lbl186:
                                                                            // 2 sources

                                                                            var35_39 = (C)v19 /* !! */ ;
                                                                        }
                                                                        catch (Exception var36_40) {
                                                                            var36_40.printStackTrace();
                                                                            return var7_8;
                                                                        }
                                                                        var35_39.c(var33_37, var26_30, var34_38, var1_1.J.nextFloat() * 360.0f, 0.0f);
                                                                        v20 = var35_39.C();
                                                                        if (var5_5 == null) break block68;
                                                                        if (v20 == 0) break block69;
                                                                        v20 = var35_39.u();
                                                                        if (var5_5 == null) break block68;
                                                                        if (v20 == 0) break block69;
                                                                        var30_34 = var35_39.a(var1_1.h(new n(var35_39)), var30_34);
                                                                        v21 = var35_39;
                                                                        if (var5_5 == null) break block70;
                                                                        if (!v21.u()) break block71;
                                                                        ++var23_27;
                                                                        var1_1.f(var35_39);
                                                                        if (var5_5 != null) break block72;
                                                                    }
                                                                    v21 = var35_39;
                                                                }
                                                                v21.a();
                                                            }
                                                            v22 = var23_27;
                                                            v23 = var35_39.U();
                                                            if (var5_5 == null) break block73;
                                                            if (v22 >= v23 && var5_5 != null) ** GOTO lbl-1000
                                                        }
                                                        v22 = var7_8;
                                                        v23 = var23_27;
                                                    }
                                                    v20 = v22 + v23;
                                                }
                                                var7_8 = v20 ? 1 : 0;
                                            }
                                            ++var32_36;
                                        }
                                        if (var5_5 != null) continue;
                                    }
                                    ++var24_28;
                                    if (var5_5 != null) continue block11;
                                }
                                break;
                            }
                            if (var5_5 != null) continue block9;
                        }
                        break;
                    }
                }
                ++var11_13;
                if (var5_5 != null) continue block7;
            }
            break;
        }
        v10 = var7_8;
        return v10;
    }
}

