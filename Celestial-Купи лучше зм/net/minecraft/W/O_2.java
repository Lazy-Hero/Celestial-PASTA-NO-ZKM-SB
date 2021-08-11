/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.k;

public class O
extends k {
    private final /* synthetic */ K s;

    /*
     * Exception decompiling
     */
    public static void a(z var0, n var1_1, aA var2_2, K var3_3, boolean var4_4) {
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

    private static gP a(gP gP2) {
        return gP2;
    }

    public O(K k2) {
        this.s = k2;
        this.a(net.minecraft.ad.a.p);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public aX a(j var1_1, z var2_2, n var3_3, a3 var4_4, aA var5_5, float var6_6, float var7_7, float var8_8) {
        block8: {
            block13: {
                block11: {
                    block12: {
                        block9: {
                            block10: {
                                block6: {
                                    block7: {
                                        var9_9 = bl.c();
                                        if (var5_5 != aA.UP) {
                                            return aX.FAIL;
                                        }
                                        var10_10 = var2_2.d(var3_3);
                                        var11_11 = var10_10.b();
                                        if (!var11_11.b((t)var2_2, var3_3)) {
                                            var3_3 = var3_3.a(var5_5);
                                        }
                                        var12_12 = var1_1.c(var4_4);
                                        v0 = var1_1.a(var3_3, var5_5, var12_12);
                                        if (var9_9 == 0) {
                                            if (v0 == false) return aX.FAIL;
                                            v0 = this.s.a(var2_2, var3_3);
                                        }
                                        if (v0 == false) return aX.FAIL;
                                        var13_13 = aA.a(var1_1.e);
                                        var14_14 = var13_13.r();
                                        var15_15 = var13_13.i();
                                        v1 = var14_14;
                                        if (var9_9 != 0) break block6;
                                        if (v1 >= false) break block7;
                                        cfr_temp_0 = var8_8 - 0.5f;
                                        v1 = (boolean)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                        if (var9_9 != 0) break block8;
                                        if (v1 < false) ** GOTO lbl-1000
                                    }
                                    v1 = var14_14;
                                }
                                if (var9_9 != 0) break block9;
                                if (v1 <= false) break block10;
                                cfr_temp_1 = var8_8 - 0.5f;
                                v1 = (boolean)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                if (var9_9 != 0) break block8;
                                if (v1 > false) ** GOTO lbl-1000
                            }
                            v1 = var15_15;
                        }
                        if (var9_9 != 0) break block11;
                        if (v1 >= false) break block12;
                        cfr_temp_2 = var6_6 - 0.5f;
                        v1 = (boolean)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var9_9 != 0) break block8;
                        if (v1 > false) ** GOTO lbl-1000
                    }
                    v1 = var15_15;
                }
                if (var9_9 != 0) break block13;
                if (v1 <= false) ** GOTO lbl-1000
                cfr_temp_3 = var6_6 - 0.5f;
                v1 = (boolean)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
            }
            if (var9_9 == 0) {
                ** if (v1 >= false) goto lbl-1000
            }
            break block8;
lbl-1000:
            // 4 sources

            {
                v1 = true;
                ** GOTO lbl56
            }
lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
        }
        var16_16 = v1;
        O.a(var2_2, var3_3, var13_13, this.s, var16_16);
        var17_17 = this.s.l();
        var2_2.a(var1_1, var3_3, var17_17.a(), ay.BLOCKS, (var17_17.c() + 1.0f) / 2.0f, var17_17.e() * 0.8f);
        var12_12.b(1);
        return aX.SUCCESS;
    }
}

