/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.Q.at;
import net.minecraft.R.b;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a6
extends K {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        var4_4 = s.b();
        v0 = var3_3.length;
        if (var4_4 != null) {
            if (v0 < 2) {
                throw new z(this.a(var2_2), new Object[0]);
            }
            v0 = 0;
        }
        var5_5 = v0;
        var6_6 = var3_3[var5_5++];
        if ((var8_8 = ay.a(var7_7 = var3_3[var5_5++])) == null) {
            throw new s("commands.playsound.unknownSoundSource", new Object[]{var7_7});
        }
        var9_9 = a6.d(var1_1, var2_2, var3_3[var5_5++]);
        var10_10 = var2_2.h();
        var11_11 = var3_3.length > var5_5 ? a6.a(var10_10.e, var3_3[var5_5++], true) : var10_10.e;
        var13_12 = var3_3.length > var5_5 ? a6.a(var10_10.d, var3_3[var5_5++], 0, 0, false) : var10_10.d;
        var15_13 = var3_3.length > var5_5 ? a6.a(var10_10.b, var3_3[var5_5++], true) : var10_10.b;
        v1 = var3_3;
        if (var4_4 == null) ** GOTO lbl20
        if (v1.length > var5_5) {
            v1 = var3_3;
lbl20:
            // 2 sources

            v2 = a6.a(v1[var5_5++], 0.0, 3.4028234663852886E38);
        } else {
            v2 = 1.0;
        }
        var17_14 = v2;
        v3 = var3_3;
        if (var4_4 == null) ** GOTO lbl28
        if (v3.length > var5_5) {
            v3 = var3_3;
lbl28:
            // 2 sources

            v4 = a6.a(v3[var5_5++], 0.0, 2.0);
        } else {
            v4 = 1.0;
        }
        var19_15 = v4;
        v5 = var3_3;
        if (var4_4 == null) ** GOTO lbl36
        if (v5.length > var5_5) {
            v5 = var3_3;
lbl36:
            // 2 sources

            v6 = a6.a(v5[var5_5], 0.0, 1.0);
        } else {
            v6 = 0.0;
        }
        var21_16 = v6;
        v7 = var17_14;
        v8 = 1.0;
        if (var4_4 == null) ** GOTO lbl46
        if (v7 > v8) {
            v7 = var17_14;
            v8 = 16.0;
lbl46:
            // 2 sources

            v9 = v7 * v8;
        } else {
            v9 = 16.0;
        }
        var23_17 = v9;
        var25_18 = var9_9.f(var11_11, var13_12, var15_13);
        if (var4_4 == null) return;
        if (var25_18 > var23_17) {
            v10 = var21_16;
            v11 = 0.0;
            if (var4_4 != null) {
                if (v10 <= v11) {
                    throw new s("commands.playsound.playerTooFar", new Object[]{var9_9.g()});
                }
                v10 = var11_11;
                v11 = var9_9.a;
            }
            var27_19 = v10 - v11;
            var29_20 = var13_12 - var9_9.aF;
            var31_21 = var15_13 - var9_9.ax;
            v12 = var33_22 = Math.sqrt(var27_19 * var27_19 + var29_20 * var29_20 + var31_21 * var31_21);
            if (var4_4 != null) {
                if (v12 > 0.0) {
                    var11_11 = var9_9.a + var27_19 / var33_22 * 2.0;
                    var13_12 = var9_9.aF + var29_20 / var33_22 * 2.0;
                    var15_13 = var9_9.ax + var31_21 / var33_22 * 2.0;
                }
                v12 = var21_16;
            }
            var17_14 = v12;
        }
        var9_9.cD.a(new at(var6_6, var8_8, var11_11, var13_12, var15_13, (float)var17_14, (float)var19_15));
        a6.a(var2_2, (F)this, "commands.playsound.success", new Object[]{var6_6, var9_9.g()});
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public String a(J j2) {
        return "commands.playsound.usage";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a() {
        return "playsound";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        block10: {
            String[] arrstring2;
            block11: {
                int n3;
                int n4;
                block9: {
                    m[] arrm = s.b();
                    n4 = arrstring.length;
                    n3 = 1;
                    if (arrm != null) {
                        if (n4 == n3) {
                            return a6.a(arrstring, d.c.a());
                        }
                        n4 = arrstring.length;
                        n3 = 2;
                    }
                    if (arrm != null) {
                        if (n4 == n3) {
                            return a6.a(arrstring, ay.a());
                        }
                        n4 = arrstring.length;
                        n3 = 3;
                    }
                    if (arrm != null) {
                        if (n4 == n3) {
                            return a6.a(arrstring, b10.at());
                        }
                        n4 = arrstring.length;
                        n3 = 3;
                    }
                    if (arrm == null) break block9;
                    if (n4 <= n3) break block10;
                    arrstring2 = arrstring;
                    if (arrm == null) break block11;
                    n4 = arrstring2.length;
                    n3 = 6;
                }
                if (n4 > n3) break block10;
                arrstring2 = arrstring;
            }
            list = a6.a(arrstring2, 3, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }
}

