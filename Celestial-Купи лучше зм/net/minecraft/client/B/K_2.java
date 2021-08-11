/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.D.b;
import net.minecraft.D.h;
import net.minecraft.D.m;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.G;
import net.minecraft.client.b.ap;
import net.minecraft.client.b.q;
import net.minecraft.client.o.e;

public class K
extends q {
    private /* synthetic */ boolean j;
    private /* synthetic */ k g;
    private /* synthetic */ long k;
    private final /* synthetic */ Q h;
    public static /* synthetic */ Ordering<e> i;
    private final /* synthetic */ G a;
    private /* synthetic */ k l;

    /*
     * Exception decompiling
     */
    private void a(h var1_1, int var2_2, String var3_3, int var4_4, int var5_5, e var6_6) {
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

    /*
     * Enabled aggressive block sorting
     */
    public static String a(e e10) {
        String string;
        String[] arrstring = q.b();
        e e11 = e10;
        if (arrstring != null) {
            if (e11.e() != null) {
                string = e10.e().a();
                return string;
            }
            e11 = e10;
        }
        string = m.a(e11.d(), e10.p().getName());
        return string;
    }

    public void b(@Nullable k k2) {
        this.l = k2;
    }

    public void a(@Nullable k k2) {
        this.g = k2;
    }

    static {
        i = Ordering.from((Comparator)new ap());
    }

    public void a() {
        this.l = null;
        this.g = null;
    }

    public K(Q q2, G g10) {
        this.h = q2;
        this.a = g10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(int n2, int n3, int n4, e e10) {
        int n5;
        block4: {
            int n6;
            block11: {
                block12: {
                    int n7;
                    String[] arrstring;
                    block9: {
                        block10: {
                            block7: {
                                block8: {
                                    block5: {
                                        block6: {
                                            block2: {
                                                block3: {
                                                    String[] arrstring2 = q.b();
                                                    v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                    arrstring = arrstring2;
                                                    this.h.aN().b(e);
                                                    boolean bl2 = false;
                                                    n6 = e10.n();
                                                    if (arrstring == null) break block2;
                                                    if (n6 >= 0) break block3;
                                                    n5 = 5;
                                                    if (arrstring != null) break block4;
                                                }
                                                n6 = e10.n();
                                            }
                                            n7 = 150;
                                            if (arrstring == null) break block5;
                                            if (n6 >= n7) break block6;
                                            n5 = 0;
                                            if (arrstring != null) break block4;
                                        }
                                        n6 = e10.n();
                                        n7 = 300;
                                    }
                                    if (arrstring == null) break block7;
                                    if (n6 >= n7) break block8;
                                    n5 = 1;
                                    if (arrstring != null) break block4;
                                }
                                n6 = e10.n();
                                n7 = 600;
                            }
                            if (arrstring == null) break block9;
                            if (n6 >= n7) break block10;
                            n5 = 2;
                            if (arrstring != null) break block4;
                        }
                        n6 = e10.n();
                        if (arrstring == null) break block11;
                        n7 = 1000;
                    }
                    if (n6 >= n7) break block12;
                    n5 = 3;
                    if (arrstring != null) break block4;
                }
                n6 = 4;
            }
            n5 = n6;
        }
        c += 100.0f;
        this.a(n3 + n2 - 11, n4, 0, 176 + n5 * 8, 10, 8);
        c -= 100.0f;
    }

    /*
     * Exception decompiling
     */
    public void a(int var1_1, b var2_2, @Nullable h var3_3) {
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

    public void a(boolean bl2) {
        block4: {
            block6: {
                K k2;
                block5: {
                    String[] arrstring = q.b();
                    if (arrstring == null) break block4;
                    if (!bl2) break block5;
                    k2 = this;
                    if (arrstring == null) break block6;
                    if (!k2.j) {
                        this.k = Q.aj();
                    }
                }
                k2 = this;
            }
            k2.j = bl2;
        }
    }
}

