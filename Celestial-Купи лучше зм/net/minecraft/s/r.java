/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.P.d;
import net.minecraft.R.b;
import net.minecraft.W.K;
import net.minecraft.k.n;
import net.minecraft.s.a;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class r
extends net.minecraft.E.K {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block11: {
            block10: {
                var5_5 = a.b();
                v0 = var3_3.length;
                if (!var5_5) ** GOTO lbl12
                if (v0 > 0) {
                    v0 = var3_3.length;
                    v1 = 3;
                    if (var5_5) {
                        if (v0 <= v1) {
                            return r.a(var3_3, 0, var4_4);
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v0 = var3_3.length;
lbl12:
                    // 2 sources

                    v1 = 4;
                }
                if (!var5_5) break block10;
                if (v0 == v1) {
                    return r.a(var3_3, K.h.a());
                }
                v2 = var3_3;
                if (!var5_5) break block11;
                v0 = v2.length;
                v1 = 6;
            }
            if (v0 != v1) {
                v3 = Collections.emptyList();
                return v3;
            }
            v2 = var3_3;
        }
        v3 = r.a(v2, new String[]{"replace", "destroy", "keep"});
        return v3;
    }

    @Override
    public String a() {
        return "setblock";
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
        block43: {
            block42: {
                block41: {
                    block39: {
                        block36: {
                            block40: {
                                block37: {
                                    block38: {
                                        block35: {
                                            block34: {
                                                block33: {
                                                    block32: {
                                                        var4_4 = a.c();
                                                        if (!var4_4) {
                                                            if (var3_3.length < 4) {
                                                                throw new z("commands.setblock.usage", new Object[0]);
                                                            }
                                                            var2_2.a(net.minecraft.E.d.AFFECTED_BLOCKS, 0);
                                                        }
                                                        var5_5 = r.b(var2_2, var3_3, 0, false);
                                                        var6_6 = net.minecraft.E.K.b(var2_2, var3_3[3]);
                                                        if (var3_3.length < 5) break block32;
                                                        var7_7 = r.b(var6_6, var3_3[4]);
                                                        if (!var4_4) break block33;
                                                    }
                                                    var7_7 = var6_6.d();
                                                }
                                                if (!(var8_8 = var2_2.b()).n(var5_5)) {
                                                    throw new s("commands.setblock.outOfWorld", new Object[0]);
                                                }
                                                var9_9 = new net.minecraft.P.r();
                                                var10_10 = false;
                                                v0 = var3_3.length;
                                                v1 = 7;
                                                if (var4_4) break block34;
                                                if (v0 >= v1) {
                                                    v0 = var6_6.e() ? 1 : 0;
                                                    if (!var4_4) {
                                                        if (v0 != 0) {
                                                            var11_11 = r.a(var3_3, 6);
                                                            try {
                                                                var9_9 = d.c((String)var11_11);
                                                                var10_10 = true;
                                                            }
                                                            catch (net.minecraft.P.a var12_12) {
                                                                throw new s("commands.setblock.tagError", new Object[]{var12_12.getMessage()});
                                                            }
                                                        } else {
                                                            ** GOTO lbl-1000
                                                        }
                                                    }
                                                } else lbl-1000:
                                                // 4 sources

                                                {
                                                    v0 = var3_3.length;
                                                }
                                                if (var4_4) break block35;
                                                v1 = 6;
                                            }
                                            if (v0 < v1) break block36;
                                            v0 = "destroy".equals(var3_3[5]) ? 1 : 0;
                                        }
                                        if (var4_4) break block37;
                                        if (v0 == 0) break block38;
                                        v2 = var8_8;
                                        v3 = var5_5;
                                        if (var4_4) break block39;
                                        v2.a(v3, true);
                                        if (var6_6 == g.bf) {
                                            r.a(var2_2, (F)this, "commands.setblock.success", new Object[0]);
                                            return;
                                        }
                                        break block36;
                                    }
                                    v0 = "keep".equals(var3_3[5]) ? 1 : 0;
                                }
                                if (var4_4) break block40;
                                if (v0 == 0) break block36;
                                v2 = var8_8;
                                v3 = var5_5;
                                if (var4_4) break block39;
                                v0 = v2.a(v3) ? 1 : 0;
                            }
                            if (v0 == 0) {
                                throw new s("commands.setblock.noChange", new Object[0]);
                            }
                        }
                        v2 = var8_8;
                        v3 = var5_5;
                    }
                    var11_11 = v2.b(v3);
                    v4 = var11_11;
                    if (var4_4) break block41;
                    if (v4 == null) break block42;
                    v4 = var11_11;
                }
                v5 = v4 instanceof net.minecraft.B.a;
                if (var4_4) break block43;
                if (v5) {
                    ((net.minecraft.B.a)var11_11).d();
                }
            }
            v5 = var8_8.a(var5_5, var7_7, 2);
        }
        if (!var4_4) {
            if (!v5) {
                throw new s("commands.setblock.noChange", new Object[0]);
            }
            v5 = var10_10;
        }
        if (v5) {
            var12_13 = var8_8.b(var5_5);
            if (var4_4 != false) return;
            if (var12_13 != null) {
                var9_9.b("x", var5_5.e());
                var9_9.b("y", var5_5.b());
                var9_9.b("z", var5_5.a());
                var12_13.c(var9_9);
            }
        }
        var8_8.b(var5_5, var7_7.b(), false);
        var2_2.a(net.minecraft.E.d.AFFECTED_BLOCKS, 1);
        r.a(var2_2, (F)this, "commands.setblock.success", new Object[0]);
    }

    @Override
    public String a(J j2) {
        return "commands.setblock.usage";
    }

    @Override
    public int a() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

