/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.as.m;
import net.minecraft.client.A.b;
import net.minecraft.client.D.h;
import net.minecraft.client.E.e;
import net.minecraft.client.E.l;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a1;
import net.minecraft.client.b.aF;
import net.minecraft.client.b.al;
import net.minecraft.client.b.av;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class Z
extends L {
    private /* synthetic */ int z;
    private /* synthetic */ int y;

    @Override
    public void e() {
        super.e();
        ++this.y;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        block11: {
            var2_2 = q.b();
            if (var2_2 == null) break block11;
            switch (var1_1.g) {
                case 0: {
                    this.m.a(new al(this, this.m.ac));
                    if (var2_2 != null) return;
                }
                case 1: {
                    var3_3 = this.m.n();
                    var4_4 = this.m.aB();
                    var1_1.h = false;
                    this.m.e.N();
                    this.m.a((l)null);
                    v0 = var3_3;
                    if (var2_2 == null) ** GOTO lbl19
                    if (!v0) ** GOTO lbl18
                    this.m.a(new a1());
                    if (var2_2 != null) ** GOTO lbl24
lbl18:
                    // 2 sources

                    v0 = var4_4;
lbl19:
                    // 2 sources

                    if (!v0) ** GOTO lbl23
                    var5_5 = new m();
                    var5_5.b(new a1());
                    if (var2_2 != null) ** GOTO lbl24
lbl23:
                    // 2 sources

                    this.m.a(new av(new a1()));
                }
lbl24:
                // 4 sources

                default: {
                    if (var2_2 != null) return;
                }
                case 4: {
                    this.m.a((L)null);
                    this.m.i();
                    if (var2_2 != null) return;
                }
                case 5: {
                    this.m.a(new b(this.m.s.c9.h()));
                    if (var2_2 != null) return;
                }
                case 6: {
                    this.m.a(new net.minecraft.client.m.b(this, this.m.s.a()));
                    if (var2_2 != null) return;
                }
                case 7: {
                    this.m.a(new aF(this));
                    if (var2_2 != null) return;
                }
                case 90: 
            }
            this.m.e.N();
            this.m.a((l)null);
        }
        this.m.a(new e(new a1(), this.m, P.a));
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("menu.game", new Object[0]), h / 2, 40, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void r() {
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

