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
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P
extends K {
    @Override
    public String a(J j2) {
        return "commands.compare.usage";
    }

    @Override
    public int a() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "testforblocks";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block18: {
            block16: {
                block17: {
                    var5_5 = s.b();
                    v0 = var3_3.length;
                    if (var5_5 == null) ** GOTO lbl12
                    if (v0 > 0) {
                        v0 = var3_3.length;
                        v1 = 3;
                        if (var5_5 != null) {
                            if (v0 <= v1) {
                                return P.a(var3_3, 0, var4_4);
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

                        v1 = 3;
                    }
                    if (var5_5 != null) {
                        if (v0 > v1) {
                            v0 = var3_3.length;
                            v1 = 6;
                            if (var5_5 != null) {
                                if (v0 <= v1) {
                                    return P.a(var3_3, 3, var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var3_3.length;
                            v1 = 6;
                        }
                    }
                    if (var5_5 == null) break block16;
                    if (v0 <= v1) break block17;
                    v0 = var3_3.length;
                    v1 = 9;
                    if (var5_5 != null) {
                        if (v0 <= v1) {
                            return P.a(var3_3, 6, var4_4);
                        } else {
                            ** GOTO lbl31
                        }
                    }
                    break block16;
                }
                v2 = var3_3;
                if (var5_5 == null) break block18;
                v0 = v2.length;
                v1 = 10;
            }
            if (v0 != v1) {
                v3 = Collections.emptyList();
                return v3;
            }
            v2 = var3_3;
        }
        v3 = P.a(v2, new String[]{"masked", "all"});
        return v3;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
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
}

