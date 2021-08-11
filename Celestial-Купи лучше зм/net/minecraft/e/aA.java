/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.w;
import net.minecraft.E.z;
import net.minecraft.P.a;
import net.minecraft.R.b;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aA
extends K {
    private static final /* synthetic */ Map<String, Integer> d;

    @Override
    public String a() {
        return "replaceitem";
    }

    private int a(String string) throws s {
        m[] arrm = s.b();
        int n2 = d.containsKey(string);
        if (arrm != null) {
            if (n2 == 0) {
                throw new s("commands.generic.parameter.invalid", string);
            }
            n2 = d.get(string);
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @Override
    public String a(J j2) {
        return "commands.replaceitem.usage";
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
        block54: {
            block52: {
                block53: {
                    block49: {
                        block51: {
                            block50: {
                                block48: {
                                    block46: {
                                        block47: {
                                            block45: {
                                                block43: {
                                                    block44: {
                                                        var4_4 = s.b();
                                                        v0 = var3_3.length;
                                                        if (var4_4 != null) {
                                                            if (v0 < 1) {
                                                                throw new z("commands.replaceitem.usage", new Object[0]);
                                                            }
                                                            v0 = "entity".equals(var3_3[0]) ? 1 : 0;
                                                        }
                                                        if (var4_4 == null) break block43;
                                                        if (v0 == 0) break block44;
                                                        var5_5 = 0;
                                                        if (var4_4 != null) break block45;
                                                    }
                                                    v0 = "block".equals(var3_3[0]) ? 1 : 0;
                                                }
                                                if (var4_4 != null) {
                                                    if (v0 == 0) {
                                                        throw new z("commands.replaceitem.usage", new Object[0]);
                                                    }
                                                    v0 = 1;
                                                }
                                                var5_5 = v0;
                                            }
                                            v1 = var5_5;
                                            if (var4_4 == null) break block46;
                                            if (v1 == 0) break block47;
                                            v2 = var3_3.length;
                                            if (var4_4 != null) {
                                                if (v2 < 6) {
                                                    throw new z("commands.replaceitem.block.usage", new Object[0]);
                                                }
                                                v2 = var6_6 = 4;
                                            }
                                            if (var4_4 != null) break block48;
                                        }
                                        v1 = var3_3.length;
                                    }
                                    if (var4_4 != null) {
                                        if (v1 < 4) {
                                            throw new z("commands.replaceitem.entity.usage", new Object[0]);
                                        }
                                        v1 = 2;
                                    }
                                    var6_6 = v1;
                                }
                                var7_7 = var3_3[var6_6];
                                var8_8 = this.a(var3_3[var6_6++]);
                                try {
                                    var9_9 = aA.a(var2_2, var3_3[var6_6]);
                                }
                                catch (w var10_10) {
                                    if (net.minecraft.W.K.d(var3_3[var6_6]) != g.bf) {
                                        throw var10_10;
                                    }
                                    var9_9 = null;
                                }
                                ++var6_6;
                                v3 = var3_3.length;
                                if (var4_4 != null) {
                                    v3 = v3 > var6_6 ? aA.a(var3_3[var6_6++], 1, var9_9.a()) : 1;
                                }
                                var10_11 = v3;
                                v4 = var3_3.length;
                                if (var4_4 != null) {
                                    v4 = v4 > var6_6 ? aA.d(var3_3[var6_6++]) : 0;
                                }
                                var11_12 = v4;
                                var12_13 = new net.minecraft.w.d(var9_9, var10_11, var11_12);
                                v5 = var3_3.length;
                                if (var4_4 != null) {
                                    if (v5 > var6_6) {
                                        var13_14 = aA.a(var3_3, var6_6);
                                        try {
                                            var12_13.b(net.minecraft.P.d.c((String)var13_14));
                                        }
                                        catch (a var14_15) {
                                            throw new s("commands.replaceitem.tagError", new Object[]{var14_15.getMessage()});
                                        }
                                    }
                                    v5 = var5_5;
                                }
                                if (v5 == 0) break block49;
                                var2_2.a(net.minecraft.E.d.AFFECTED_ITEMS, 0);
                                var13_14 = aA.b(var2_2, var3_3, 1, false);
                                var14_16 = var2_2.b();
                                v6 = var15_17 = var14_16.b((n)var13_14);
                                if (var4_4 != null) {
                                    if (v6 == null) throw new s("commands.replaceitem.noContainer", new Object[]{var13_14.e(), var13_14.b(), var13_14.a()});
                                    v6 = var15_17;
                                }
                                if (var4_4 != null) {
                                    if (!(v6 instanceof net.minecraft.B.a)) {
                                        throw new s("commands.replaceitem.noContainer", new Object[]{var13_14.e(), var13_14.b(), var13_14.a()});
                                    }
                                    v6 = var15_17;
                                }
                                var16_18 = (net.minecraft.B.a)v6;
                                v7 = var8_8;
                                if (var4_4 == null) break block50;
                                if (v7 < 0) break block51;
                                v7 = var8_8;
                            }
                            if (v7 < var16_18.e()) {
                                var16_18.a(var8_8, var12_13);
                            }
                        }
                        if (var4_4 != null) break block52;
                    }
                    var13_14 = aA.a(var1_1, var2_2, var3_3[1]);
                    var2_2.a(net.minecraft.E.d.AFFECTED_ITEMS, 0);
                    v8 = var13_14 instanceof j;
                    if (var4_4 != null) {
                        if (v8) {
                            ((j)var13_14).cu.a();
                        }
                        v8 = var13_14.a(var8_8, var12_13);
                    }
                    if (var4_4 == null) break block53;
                    if (!v8) {
                        throw new s("commands.replaceitem.failed", new Object[]{var7_7, var10_11, var12_13.G() != false ? "Air" : var12_13.F()});
                    }
                    v9 = var13_14;
                    if (var4_4 == null) break block54;
                    v8 = v9 instanceof j;
                }
                if (v8) {
                    ((j)var13_14).cu.a();
                }
            }
            var2_2.a(net.minecraft.E.d.AFFECTED_ITEMS, var10_11);
            v9 = var2_2;
        }
        v10 = new Object[3];
        v10[0] = var7_7;
        v10[1] = var10_11;
        v11 = var12_13;
        if (var4_4 == null) ** GOTO lbl119
        if (v11.G()) {
            v12 = "Air";
        } else {
            v11 = var12_13;
lbl119:
            // 2 sources

            v12 = v11.F();
        }
        v10[2] = v12;
        aA.a((J)v9, (F)this, "commands.replaceitem.success", v10);
    }

    static {
        int n2;
        d = Maps.newHashMap();
        for (n2 = 0; n2 < 54; ++n2) {
            d.put("slot.container." + n2, n2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            d.put("slot.hotbar." + n2, n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            d.put("slot.inventory." + n2, 9 + n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            d.put("slot.enderchest." + n2, 200 + n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            d.put("slot.villager." + n2, 300 + n2);
        }
        for (n2 = 0; n2 < 15; ++n2) {
            d.put("slot.horse." + n2, 500 + n2);
        }
        d.put("slot.weapon", 98);
        d.put("slot.weapon.mainhand", 98);
        d.put("slot.weapon.offhand", 99);
        d.put("slot.armor.head", 100 + X.HEAD.a());
        d.put("slot.armor.chest", 100 + X.CHEST.a());
        d.put("slot.armor.legs", 100 + X.LEGS.a());
        d.put("slot.armor.feet", 100 + X.FEET.a());
        d.put("slot.horse.saddle", 400);
        d.put("slot.horse.armor", 401);
        d.put("slot.horse.chest", 499);
    }

    @Override
    public int a() {
        return 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        int n3 = arrstring.length;
        if (arrm != null) {
            if (n3 <= 0) return 0 != 0;
            n3 = "entity".equals(arrstring[0]) ? 1 : 0;
        }
        if (arrm != null) {
            if (n3 == 0) return 0 != 0;
            n3 = n2;
        }
        if (arrm == null) return n3 != 0;
        if (n3 != 1) return 0 != 0;
        return 1 != 0;
    }
}

