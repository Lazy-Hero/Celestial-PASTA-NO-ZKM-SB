/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.n;

import net.minecraft.client.n.b;
import net.minecraft.client.n.d;
import net.minecraft.client.n.e;
import net.minecraft.client.n.h;
import net.minecraft.client.n.k;

class f<T extends b> {
    private final /* synthetic */ T a;
    private /* synthetic */ long e;
    private /* synthetic */ long b;
    final /* synthetic */ e d;
    private /* synthetic */ h c;

    private float a(long l2) {
        float f10 = net.minecraft.k.h.c((float)(l2 - this.e) / 600.0f, 0.0f, 1.0f);
        String[] arrstring = net.minecraft.client.n.d.b();
        float f11 = f10 * f10;
        if (arrstring != null) {
            f10 = f11;
            f11 = this.c == h.HIDE ? 1.0f - f10 : f10;
        }
        return f11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    f(e e10, b b10, k k2) {
        this(e10, b10);
    }

    public T a() {
        return this.a;
    }

    /*
     * Exception decompiling
     */
    public boolean a(int var1_1, int var2_2) {
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
     * Ignored method signature, as it can't be verified against descriptor
     */
    private f(e e10, b b10) {
        this.d = e10;
        this.e = -1L;
        this.b = -1L;
        this.c = h.SHOW;
        this.a = b10;
    }
}

