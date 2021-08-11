/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.Sys
 */
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.k.m;
import net.minecraft.u.h;
import org.lwjgl.Sys;

public class cR
extends bE {
    public /* synthetic */ ArrayList<String> l;
    /* synthetic */ int k;
    /* synthetic */ int n;
    /* synthetic */ hH m;

    public cR() {
        block0: {
            m[] arrm = h.b();
            super("Spammer", a5.World);
            m[] arrm2 = arrm;
            this.l = new ArrayList();
            ArrayList<String> arrayList = new ArrayList<String>();
            cj.b.f.b(new hH("Spammer Mode", (bE)this, "Default", arrayList));
            arrayList.add("Default");
            arrayList.add("Absurd");
            arrayList.add("HvH?");
            arrayList.add("Custom");
            this.m = new hH("Message Delay", this, 100.0, 10.0, 500.0, 10.0);
            cj.b.f.b(this.m);
            if (net.minecraft.k.m.d()) break block0;
            h.b(new m[5]);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void d() {
        String string = cj.b.f.a("Spammer Mode").m();
        m[] arrm = h.b();
        if (arrm == null) {
            if (string.equalsIgnoreCase("Custom")) {
                Sys.openURL((String)(cR.c.aJ + "\\NeverHook\\spammer.txt"));
            }
            super.d();
        }
    }

    /*
     * Exception decompiling
     */
    @cL
    public void a(fb var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 9[CASE]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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

