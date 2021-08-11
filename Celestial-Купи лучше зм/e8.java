/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.client.Q;
import net.minecraft.client.b.l;
import net.minecraft.client.r.s;
import net.minecraft.k.m;

public abstract class e8 {
    protected static /* synthetic */ Color b;
    private final /* synthetic */ eb e;
    public static /* synthetic */ l h;
    public /* synthetic */ hH d;
    public /* synthetic */ double j;
    public /* synthetic */ double i;
    public /* synthetic */ double a;
    public /* synthetic */ double g;
    protected static /* synthetic */ Q c;
    private /* synthetic */ boolean f;

    public boolean a(boolean bl2) {
        this.f = bl2;
        return this.f;
    }

    public void a(int n2, int n3, int n4) {
    }

    public boolean d() {
        return this.f;
    }

    public boolean f() {
        return true;
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

    public eb e() {
        return this.e;
    }

    public double h() {
        return 0.0;
    }

    public void c(int n2, int n3) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public e8(eb eb2, int n2, int n3, int n4, int n5) {
        int[] arrn = s.d();
        this.e = eb2;
        this.i = n2;
        this.j = n3;
        this.a = n4;
        int[] arrn2 = arrn;
        this.g = n5;
        if (arrn2 != null) {
            m.b(!m.c());
        }
    }

    static {
        h = new l(Q.P());
        c = Q.P();
        b = new Color(26, 26, 26);
    }

    public int b() {
        return (int)this.g;
    }

    public void a(double d10) {
        this.i = d10;
    }

    public int a() {
        return (int)this.i;
    }

    public int c() {
        return (int)this.a;
    }

    public void a(int n2) {
        this.j = n2;
    }

    public int g() {
        return (int)this.j;
    }

    public void b(int n2, int n3) {
    }

    public void b(int n2, int n3, int n4) {
    }
}

