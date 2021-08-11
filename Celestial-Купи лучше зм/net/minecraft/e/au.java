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
import net.minecraft.Q.a5;
import net.minecraft.R.b;
import net.minecraft.ah.P;
import net.minecraft.ah.a;
import net.minecraft.at.g;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class au
extends K {
    public static void a(a a10, String string, b b10) {
        block6: {
            int n2;
            m[] arrm;
            block5: {
                arrm = s.b();
                n2 = "reducedDebugInfo".equals(string);
                if (arrm == null) break block5;
                if (n2 == 0) break block6;
                n2 = a10.c(string) ? 1 : 0;
            }
            if (arrm != null) {
                n2 = n2 != 0 ? 22 : 23;
            }
            byte by2 = (byte)n2;
            for (k k2 : b10.O().u()) {
                k2.cD.a(new a5(k2, by2));
                if (arrm != null) continue;
            }
        }
    }

    @Override
    public String a() {
        return "gamerule";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block15: {
            block16: {
                block17: {
                    block14: {
                        var5_4 = this.a(var1_1);
                        var4_5 = s.b();
                        v0 = var3_3;
                        if (var4_5 == null) ** GOTO lbl7
                        if (v0.length > 0) {
                            v0 = var3_3;
lbl7:
                            // 2 sources

                            v1 = v0[0];
                        } else {
                            v1 = "";
                        }
                        var6_6 = v1;
                        v2 = var3_3;
                        if (var4_5 == null) ** GOTO lbl15
                        if (v2.length > 1) {
                            v2 = var3_3;
lbl15:
                            // 2 sources

                            v3 = au.a(v2, 1);
                        } else {
                            v3 = "";
                        }
                        var7_7 = v3;
                        v4 = var3_3.length;
                        if (var4_5 == null) break block14;
                        switch (v4) {
                            case 0: {
                                var2_2.a(new g(au.a(var5_4.b())));
                                if (var4_5 != null) return;
                            }
                            case 1: {
                                v5 = var5_4;
                                v6 = var6_6;
                                if (var4_5 != null) {
                                    if (!v5.a(v6)) {
                                        throw new s("commands.gamerule.norule", new Object[]{var6_6});
                                    }
                                    v5 = var5_4;
                                    v6 = var6_6;
                                }
                                var8_8 = v5.d(v6);
                                var2_2.a(new g(var6_6).a(" = ").a(var8_8));
                                var2_2.a(d.QUERY_RESULT, var5_4.b(var6_6));
                                if (var4_5 != null) return;
                            }
                        }
                        v7 = var5_4;
                        v8 = var6_6;
                        if (var4_5 == null) break block15;
                        v4 = v7.a(v8, P.BOOLEAN_VALUE) ? 1 : 0;
                    }
                    if (v4 == 0) break block16;
                    v9 = "true".equals(var7_7);
                    if (var4_5 == null) break block17;
                    if (v9) break block16;
                    v9 = "false".equals(var7_7);
                }
                if (!v9) {
                    throw new s("commands.generic.boolean.invalid", new Object[]{var7_7});
                }
            }
            var5_4.a(var6_6, var7_7);
            v7 = var5_4;
            v8 = var6_6;
        }
        au.a(v7, v8, var1_1);
        au.a(var2_2, (F)this, "commands.gamerule.success", new Object[]{var6_6, var7_7});
    }

    @Override
    public String a(J j2) {
        return "commands.gamerule.usage";
    }

    private a a(b b10) {
        return b10.c(0).M();
    }

    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        m[] arrm = s.b();
        int n3 = arrstring.length;
        int n4 = 1;
        if (arrm != null) {
            if (n3 == n4) {
                return au.a(arrstring, this.a(b10).b());
            }
            n3 = arrstring.length;
            n4 = 2;
        }
        if (n3 == n4) {
            a a10 = this.a(b10);
            boolean bl2 = a10.a(arrstring[0], P.BOOLEAN_VALUE);
            if (arrm != null) {
                if (bl2) {
                    return au.a(arrstring, "true", "false");
                }
                bl2 = a10.a(arrstring[0], P.FUNCTION);
            }
            if (bl2) {
                return au.a(arrstring, b10.s().e().keySet());
            }
        }
        return Collections.emptyList();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 2;
    }
}

