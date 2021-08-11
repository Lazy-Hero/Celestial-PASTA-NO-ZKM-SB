/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.E.a;
import net.minecraft.client.E.c;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aY;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public class aE
extends L {
    private /* synthetic */ aq A;
    private final /* synthetic */ a z;
    private final /* synthetic */ L B;
    private /* synthetic */ aq y;
    private /* synthetic */ s D;
    private final /* synthetic */ Predicate<String> C;

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.y.a(n2, n3, n4);
        this.A.a(n2, n3, n4);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
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
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("addServer.title", new Object[0]), h / 2, 17, 0xFFFFFF);
        this.a(this.v, net.minecraft.client.D.h.a("addServer.enterName", new Object[0]), h / 2 - 100, 53, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("addServer.enterIp", new Object[0]), h / 2 - 100, 94, 0xA0A0A0);
        this.A.d();
        this.y.d();
        super.a(n2, n3, f10);
    }

    @Override
    public void e() {
        this.A.i();
        this.y.i();
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

    public aE(L l2, a a10) {
        this.C = new aY(this);
        this.B = l2;
        this.z = a10;
    }

    @Override
    protected void a(s s2) throws IOException {
        block2: {
            int n2;
            block5: {
                block6: {
                    int n3;
                    String[] arrstring;
                    block3: {
                        block4: {
                            block1: {
                                arrstring = q.b();
                                n2 = s2.h;
                                if (arrstring == null) break block1;
                                if (n2 == 0) break block2;
                                n2 = s2.g;
                            }
                            n3 = 2;
                            if (arrstring == null) break block3;
                            if (n2 != n3) break block4;
                            this.z.a(net.minecraft.client.E.c.values()[(this.z.a().ordinal() + 1) % net.minecraft.client.E.c.values().length]);
                            this.D.m = net.minecraft.client.D.h.a("addServer.resourcePack", new Object[0]) + ": " + this.z.a().a().a();
                            if (arrstring != null) break block2;
                        }
                        n2 = s2.g;
                        if (arrstring == null) break block5;
                        n3 = 1;
                    }
                    if (n2 != n3) break block6;
                    this.B.a(false, 0);
                    if (arrstring != null) break block2;
                }
                n2 = s2.g;
            }
            if (n2 == 0) {
                this.z.c = this.A.n();
                this.z.h = this.y.n();
                this.B.a(true, 0);
            }
        }
    }
}

