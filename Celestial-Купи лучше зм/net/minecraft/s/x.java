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
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.w;
import net.minecraft.E.z;
import net.minecraft.P.c;
import net.minecraft.P.d;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.Z.i;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class x
extends K {
    @Override
    public String a() {
        return "testforblock";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block10: {
            block9: {
                block7: {
                    block8: {
                        var5_5 = a.b();
                        v0 = var3_3.length;
                        if (!var5_5) break block7;
                        if (v0 <= 0) break block8;
                        v0 = var3_3.length;
                        v1 = 3;
                        if (var5_5) {
                            if (v0 <= v1) {
                                return x.a(var3_3, 0, var4_4);
                            } else {
                                ** GOTO lbl11
                            }
                        }
                        break block9;
                    }
                    v2 = var3_3;
                    if (!var5_5) break block10;
                    v0 = v2.length;
                }
                v1 = 4;
            }
            if (v0 != v1) {
                v3 = Collections.emptyList();
                return v3;
            }
            v2 = var3_3;
        }
        v3 = x.a(v2, net.minecraft.W.K.h.a());
        return v3;
    }

    private static Exception a(Exception exception) {
        return exception;
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
        block26: {
            block25: {
                var4_4 = a.c();
                if (!var4_4) {
                    if (var3_3.length < 4) {
                        throw new z("commands.testforblock.usage", new Object[0]);
                    }
                    var2_2.a(net.minecraft.E.d.AFFECTED_BLOCKS, 0);
                }
                var5_5 = x.b(var2_2, var3_3, 0, false);
                var6_6 = x.b(var2_2, var3_3[3]);
                if (var6_6 == null) {
                    throw new w("commands.setblock.notFound", new Object[]{var3_3[3]});
                }
                var7_7 = var2_2.b();
                if (!var7_7.n(var5_5)) {
                    throw new s("commands.testforblock.outOfWorld", new Object[0]);
                }
                var8_8 = new r();
                var9_9 = 0;
                v0 = var3_3.length;
                if (var4_4) break block25;
                if (v0 < 6) break block26;
                v0 = var6_6.e() ? 1 : 0;
            }
            if (v0 != 0) {
                var10_10 = x.a(var3_3, 5);
                try {
                    var8_8 = d.c((String)var10_10);
                    var9_9 = 1;
                }
                catch (net.minecraft.P.a var11_11) {
                    throw new s("commands.setblock.tagError", new Object[]{var11_11.getMessage()});
                }
            }
        }
        if ((var11_12 = (var10_10 = var7_7.d(var5_5)).b()) != var6_6) {
            throw new s("commands.testforblock.failed.tile", new Object[]{var5_5.e(), var5_5.b(), var5_5.a(), var11_12.n(), var6_6.n()});
        }
        v1 = var3_3.length;
        if (!var4_4) {
            if (v1 >= 5) {
                v1 = K.a(var6_6, var3_3[4]).apply(var10_10) ? 1 : 0;
                if (!var4_4) {
                    if (v1 == 0) {
                        try {
                            var12_13 = var10_10.b().d((i)var10_10);
                            throw new s("commands.testforblock.failed.data", new Object[]{var5_5.e(), var5_5.b(), var5_5.a(), var12_13, Integer.parseInt(var3_3[4])});
                        }
                        catch (NumberFormatException var12_14) {
                            throw new s("commands.testforblock.failed.data", new Object[]{var5_5.e(), var5_5.b(), var5_5.a(), var10_10.toString(), var3_3[4]});
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var9_9;
            }
        }
        if (v1 != 0) {
            v2 = var12_15 = var7_7.b(var5_5);
            if (!var4_4) {
                if (v2 == null) {
                    throw new s("commands.testforblock.failed.tileEntity", new Object[]{var5_5.e(), var5_5.b(), var5_5.a()});
                }
                v2 = var12_15;
            }
            var13_16 = v2.a(new r());
            if (!var4_4) {
                if (!c.a(var8_8, var13_16, true)) {
                    throw new s("commands.testforblock.failed.nbt", new Object[]{var5_5.e(), var5_5.b(), var5_5.a()});
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            var2_2.a(net.minecraft.E.d.AFFECTED_BLOCKS, 1);
            x.a(var2_2, (F)this, "commands.testforblock.success", new Object[]{var5_5.e(), var5_5.b(), var5_5.a()});
        }
        if (var4_4 == false) return;
        m.b(m.c() == false);
    }

    @Override
    public String a(J j2) {
        return "commands.testforblock.usage";
    }

    @Override
    public int a() {
        return 2;
    }
}

