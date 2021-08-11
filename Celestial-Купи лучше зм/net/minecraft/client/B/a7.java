/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.E.a;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public class a7
extends L {
    private final /* synthetic */ a A;
    private final /* synthetic */ L y;
    private /* synthetic */ aq z;

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

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("selectServer.direct", new Object[0]), h / 2, 20, 0xFFFFFF);
        this.a(this.v, net.minecraft.client.D.h.a("addServer.enterIp", new Object[0]), h / 2 - 100, 100, 0xA0A0A0);
        this.z.d();
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.z.a(n2, n3, n4);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(s s2) throws IOException {
        block2: {
            int n2;
            block3: {
                block4: {
                    String[] arrstring;
                    block1: {
                        arrstring = q.b();
                        n2 = s2.h;
                        if (arrstring == null) break block1;
                        if (n2 == 0) break block2;
                        n2 = s2.g;
                    }
                    if (arrstring == null) break block3;
                    if (n2 != 1) break block4;
                    this.y.a(false, 0);
                    if (arrstring != null) break block2;
                }
                n2 = s2.g;
            }
            if (n2 == 0) {
                this.A.h = this.z.n();
                this.y.a(true, 0);
            }
        }
    }

    public a7(L l2, a a10) {
        this.y = l2;
        this.A = a10;
    }

    @Override
    public void e() {
        this.z.i();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(char var1_1, int var2_2) throws IOException {
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
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.m.ac.b8 = this.z.n();
        this.m.ac.e();
    }
}

