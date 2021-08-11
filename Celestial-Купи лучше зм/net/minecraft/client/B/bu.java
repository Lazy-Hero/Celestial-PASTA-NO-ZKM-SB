/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.q;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class bu
extends aL {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, int n3, int n4) {
        int n5;
        String[] arrstring = net.minecraft.client.b.q.b();
        int n6 = this.b(n3);
        if (arrstring == null) return n6 != 0;
        if (n6 == 0) return 0 != 0;
        n6 = n5 = this.c(n2, n3);
        if (arrstring == null) return n6 != 0;
        if (n6 < 0) return 0 != 0;
        int n7 = this.e + this.k / 2 - this.j() / 2 + 2;
        int n8 = this.s + 4 - this.g() + n5 * this.a + this.m;
        int n9 = n2 - n7;
        int n10 = n3 - n8;
        n6 = this.a(n5).b(n5, n2, n3, n4, n9, n10) ? 1 : 0;
        if (arrstring == null) return n6 != 0;
        if (n6 == 0) return 0 != 0;
        this.b(false);
        return true;
    }

    public boolean a(int n2, int n3, int n4) {
        block2: {
            String[] arrstring = net.minecraft.client.b.q.b();
            for (int i2 = 0; i2 < this.d(); ++i2) {
                int n5 = this.e + this.k / 2 - this.j() / 2 + 2;
                int n6 = this.s + 4 - this.g() + i2 * this.a + this.m;
                int n7 = n2 - n5;
                int n8 = n3 - n6;
                this.a(i2).a(i2, n2, n3, n4, n7, n8);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            this.b(true);
        }
        return false;
    }

    @Override
    protected void c() {
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, float var7_7) {
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
    protected boolean a(int n2) {
        return false;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public abstract aJ a(int var1);

    public bu(Q q2, int n2, int n3, int n4, int n5, int n6) {
        super(q2, n2, n3, n4, n5, n6);
    }

    @Override
    protected void a(int n2, int n3, int n4, float f10) {
        this.a(n2).a(n2, n3, n4, f10);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }
}

