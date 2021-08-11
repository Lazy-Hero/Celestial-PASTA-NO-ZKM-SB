/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.ag.T;
import net.minecraft.ak.h;
import net.minecraft.i.j;

public class B
extends h {
    private final /* synthetic */ T d;
    private /* synthetic */ boolean c;
    private /* synthetic */ j e;

    public B(T t2) {
        this.d = t2;
    }

    @Override
    public void b() {
        block3: {
            block6: {
                B b10;
                boolean bl2;
                block5: {
                    String string;
                    block4: {
                        block2: {
                            string = h.h();
                            bl2 = this.c;
                            if (string != null) break block2;
                            if (bl2) break block3;
                            bl2 = this.d.D();
                        }
                        if (string != null) break block4;
                        if (bl2) break block3;
                        bl2 = this.d.O();
                    }
                    if (string != null) break block5;
                    if (bl2) break block3;
                    b10 = this;
                    if (string != null) break block6;
                    bl2 = b10.d.m().c(this.e.m());
                }
                if (!bl2) break block3;
                b10 = this;
            }
            b10.c = this.d.c(this.e);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean c() {
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
    public boolean d() {
        String string = h.h();
        boolean bl2 = this.c;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public void a() {
        this.e = (j)this.d.a();
        this.c = false;
    }
}

