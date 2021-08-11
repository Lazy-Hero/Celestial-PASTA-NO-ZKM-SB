/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.w.U;
import net.minecraft.client.w.c;

public class W
extends U {
    private final /* synthetic */ c q;
    private final /* synthetic */ c r;

    /*
     * Exception decompiling
     */
    @Override
    public void b(x var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
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

    public W(float f10) {
        super(15, f10);
        this.g = 128;
        this.f = 64;
        this.o = new c(this, 0, 0);
        this.o.b(-2.0f, -14.0f, -10.0f, 4, 4, 9, f10);
        this.o.a(0.0f, 7.0f, -6.0f);
        this.o.b(0, 14).b(-4.0f, -16.0f, -6.0f, 8, 18, 6, f10);
        this.o.b(17, 0).b(-4.0f, -19.0f, -4.0f, 3, 3, 2, f10);
        this.o.b(17, 0).b(1.0f, -19.0f, -4.0f, 3, 3, 2, f10);
        this.m = new c(this, 29, 0);
        this.m.b(-6.0f, -10.0f, -7.0f, 12, 18, 10, f10);
        this.m.a(0.0f, 5.0f, 2.0f);
        this.r = new c(this, 45, 28);
        this.r.b(-3.0f, 0.0f, 0.0f, 8, 8, 3, f10);
        this.r.a(-8.5f, 3.0f, 3.0f);
        this.r.e = 1.5707964f;
        this.q = new c(this, 45, 41);
        this.q.b(-3.0f, 0.0f, 0.0f, 8, 8, 3, f10);
        this.q.a(5.5f, 3.0f, 3.0f);
        this.q.e = 1.5707964f;
        int n2 = 4;
        int n3 = 14;
        this.p = new c(this, 29, 29);
        this.p.b(-2.0f, 0.0f, -2.0f, 4, 14, 4, f10);
        this.p.a(-2.5f, 10.0f, 6.0f);
        this.k = new c(this, 29, 29);
        this.k.b(-2.0f, 0.0f, -2.0f, 4, 14, 4, f10);
        this.k.a(2.5f, 10.0f, 6.0f);
        this.n = new c(this, 29, 29);
        this.n.b(-2.0f, 0.0f, -2.0f, 4, 14, 4, f10);
        this.n.a(-2.5f, 10.0f, -4.0f);
        this.l = new c(this, 29, 29);
        this.l.b(-2.0f, 0.0f, -2.0f, 4, 14, 4, f10);
        this.l.a(2.5f, 10.0f, -4.0f);
        this.p.v -= 1.0f;
        this.k.v += 1.0f;
        this.p.u += 0.0f;
        this.k.u += 0.0f;
        this.n.v -= 1.0f;
        this.l.v += 1.0f;
        this.n.u -= 1.0f;
        this.l.u -= 1.0f;
        this.j += 2.0f;
    }
}

