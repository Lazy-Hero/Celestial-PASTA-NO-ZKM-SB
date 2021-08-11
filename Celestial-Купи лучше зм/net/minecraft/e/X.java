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
import net.minecraft.E.C;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.u;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.ar.v;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class X
extends K {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block8: {
            int n3;
            int n4;
            block7: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm != null) {
                    if (n4 == n3) {
                        return X.a(arrstring, b10.s().e().keySet());
                    }
                    n4 = arrstring.length;
                    n3 = 2;
                }
                if (arrm == null) break block7;
                if (n4 == n3) {
                    return X.a(arrstring, "if", "unless");
                }
                arrstring2 = arrstring;
                if (arrm == null) break block8;
                n4 = arrstring2.length;
                n3 = 3;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = X.a(arrstring2, b10.at());
        return list;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "function";
    }

    @Override
    public String a(J j2) {
        return "commands.function.usage";
    }

    @Override
    public int a() {
        return 2;
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
            block21: {
                block24: {
                    block22: {
                        block23: {
                            block19: {
                                block18: {
                                    var4_4 = s.b();
                                    v0 = var3_3.length;
                                    v1 = 1;
                                    if (var4_4 == null) break block18;
                                    if (v0 == v1) break block19;
                                    v0 = var3_3.length;
                                    v1 = 3;
                                }
                                if (v0 != v1) {
                                    throw new z("commands.function.usage", new Object[0]);
                                }
                            }
                            var5_5 = new v(var3_3[0]);
                            var6_6 = var1_1.s().a(var5_5);
                            if (var6_6 == null) {
                                throw new s("commands.function.unknown", new Object[]{var5_5});
                            }
                            v2 = var3_3.length;
                            if (var4_4 == null) break block20;
                            if (v2 != 3) break block21;
                            var7_7 = var3_3[1];
                            v3 = "if".equals(var7_7);
                            if (var4_4 == null) break block22;
                            if (!v3) break block23;
                            var8_9 = true;
                            if (var4_4 != null) break block24;
                        }
                        v3 = "unless".equals(var7_7);
                    }
                    if (var4_4 != null) {
                        if (!v3) {
                            throw new z("commands.function.usage", new Object[0]);
                        }
                        v3 = false;
                    }
                    var8_9 = v3;
                }
                var9_10 = 0;
                try {
                    v4 = X.e(var1_1, var2_2, var3_3[2]).isEmpty();
                    if (var4_4 != null) {
                        v4 = v4 == false;
                    }
                    var9_10 = v4 ? 1 : 0;
                }
                catch (u var10_11) {
                    // empty catch block
                }
                v2 = var8_9 ? 1 : 0;
                if (var4_4 != null) {
                    if (v2 != var9_10) {
                        throw new s("commands.function.skipped", new Object[]{var5_5});
                    } else {
                        ** GOTO lbl48
                    }
                }
                break block20;
            }
            v2 = var1_1.s().a(var6_6, C.a(var2_2).a().a(2).a(false));
        }
        var7_8 = v2;
        X.a(var2_2, (F)this, "commands.function.success", new Object[]{var5_5, var7_8});
    }
}

