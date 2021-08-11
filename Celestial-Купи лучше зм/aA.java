/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.minecraft.k.n;

public class aA
implements Iterator<n> {
    private /* synthetic */ double b;
    private /* synthetic */ double f;
    private /* synthetic */ double l;
    private final /* synthetic */ int d;
    private /* synthetic */ boolean h;
    private final /* synthetic */ fZ e;
    private /* synthetic */ double g;
    private final /* synthetic */ double a;
    private /* synthetic */ double i;
    private /* synthetic */ double j;
    private final /* synthetic */ int k;
    private final /* synthetic */ double m;
    private /* synthetic */ int c;

    @Override
    public boolean hasNext() {
        return this.h;
    }

    public static void main(String[] arrstring) throws Exception {
        n n2 = new n(-2, 10, 20);
        n n3 = new n(2, 12, 22);
        double d10 = -0.5;
        double d11 = 0.5;
        String string = dB.i();
        aA aA2 = new aA(n2, n3, d10, d11);
        System.out.println("Start: " + n2 + ", end: " + n3 + ", yDelta: " + d10 + ", zDelta: " + d11);
        while (aA2.hasNext()) {
            n n4 = aA2.b();
            System.out.println("" + n4);
            if (string != null) continue;
        }
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }

    private void a() {
        block5: {
            double d10;
            block6: {
                String string;
                block4: {
                    this.j += 1.0;
                    string = dB.i();
                    double d11 = this.j - this.g;
                    d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                    if (string == null) break block4;
                    if (d10 < 0) break block5;
                    this.j = this.f;
                    this.b += 1.0;
                    double d12 = this.b - this.i;
                    d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                }
                if (string == null) break block6;
                if (d10 < 0) break block5;
                this.b = this.l;
                this.l += this.a;
                this.i += this.a;
                this.b = this.l;
                this.f += this.m;
                this.g += this.m;
                this.j = this.f;
                ++this.c;
                d10 = this.c;
            }
            if (d10 >= this.k) {
                // empty if block
            }
        }
    }

    /*
     * Exception decompiling
     */
    public n b() {
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
     * Exception decompiling
     */
    public aA(n var1_1, n var2_2, double var3_3, double var5_4) {
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
    public void remove() {
        throw new RuntimeException("Not implemented");
    }
}

