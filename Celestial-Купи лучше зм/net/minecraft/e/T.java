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
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.w;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.U.B;
import net.minecraft.ax.u;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class T
extends K {
    @Override
    public int a() {
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block6: {
            int n3;
            int n4;
            block5: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm == null) break block5;
                if (n4 == n3) {
                    return T.a(arrstring, b10.at());
                }
                arrstring2 = arrstring;
                if (arrm == null) break block6;
                n4 = arrstring2.length;
                n3 = 2;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = T.a(arrstring2, u.e.a());
        return list;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block20: {
            block19: {
                var4_4 = s.b();
                if (var3_3.length < 2) {
                    throw new z("commands.enchant.usage", new Object[0]);
                }
                var5_5 = T.a(var1_1, var2_2, var3_3[0], B.class);
                var2_2.a(d.AFFECTED_ITEMS, 0);
                try {
                    var6_6 = u.c(T.a(var3_3[1], 0));
                }
                catch (w var7_7) {
                    var6_6 = u.a(var3_3[1]);
                }
                if (var6_6 == null) {
                    throw new w("commands.enchant.notFound", new Object[]{var3_3[1]});
                }
                var7_8 = 1;
                var8_9 = var5_5.av();
                v0 = var8_9.G();
                if (var4_4 != null) {
                    if (v0 != 0) {
                        throw new s("commands.enchant.noItem", new Object[0]);
                    }
                    v0 = var6_6.a(var8_9);
                }
                if (var4_4 != null) {
                    if (v0 == 0) {
                        throw new s("commands.enchant.cantEnchant", new Object[0]);
                    }
                    v0 = var3_3.length;
                }
                if (var4_4 == null) break block19;
                if (v0 >= 3) {
                    var7_8 = T.a(var3_3[2], var6_6.g(), var6_6.f());
                }
                v1 = var8_9;
                if (var4_4 == null) break block20;
                v0 = v1.x() ? 1 : 0;
            }
            if (v0 != 0) {
                var9_10 = var8_9.D();
                var10_11 = 0;
                while (var10_11 < var9_10.b()) {
                    var11_12 = var9_10.d(var10_11).q("id");
                    if (var4_4 == null) return;
                    if (var4_4 != null) {
                        if (u.c(var11_12) != null) {
                            var12_13 = u.c(var11_12);
                            if (var4_4 != null) {
                                if (!var6_6.b(var12_13)) {
                                    throw new s("commands.enchant.cantCombine", new Object[]{var6_6.d(var7_8), var12_13.d(var9_10.d(var10_11).q("lvl"))});
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            ++var10_11;
                        }
                    }
                    if (var4_4 != null) continue;
                }
            }
            v1 = var8_9;
        }
        v1.a(var6_6, var7_8);
        T.a(var2_2, (F)this, "commands.enchant.success", new Object[0]);
        var2_2.a(d.AFFECTED_ITEMS, 1);
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public String a(J j2) {
        return "commands.enchant.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "enchant";
    }
}

