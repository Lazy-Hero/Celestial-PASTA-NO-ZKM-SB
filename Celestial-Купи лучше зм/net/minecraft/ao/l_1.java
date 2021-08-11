/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Map;
import net.minecraft.A.q;
import net.minecraft.ah.z;
import net.minecraft.ao.aQ;
import net.minecraft.ao.ac;
import net.minecraft.ao.bw;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class l
extends j {
    private /* synthetic */ double g;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean b(int n2, int n3) {
        double d10;
        block5: {
            String[] arrstring;
            block4: {
                arrstring = u.b();
                double d11 = this.a.nextDouble() - this.g;
                d10 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                if (arrstring == null) break block4;
                if (d10 >= 0) break block5;
                d10 = this.a.nextInt(80);
            }
            if (arrstring == null) return (boolean)d10;
            if (d10 < Math.max(Math.abs(n2), Math.abs(n3))) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public l(Map<String, String> map) {
        this.g = 0.004;
        String[] arrstring = u.b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("chance")) {
                this.g = h.a(entry.getValue(), this.g);
            }
            if (arrstring != null) continue;
        }
    }

    @Override
    public String a() {
        return "Mineshaft";
    }

    /*
     * Exception decompiling
     */
    @Override
    public n a(z var1_1, n var2_2, boolean var3_3) {
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

    @Override
    protected ac a(int n2, int n3) {
        net.minecraft.A.h h2 = this.d.c(new n((n2 << 4) + 8, 64, (n3 << 4) + 8));
        aQ aQ2 = h2 instanceof q ? aQ.MESA : aQ.NORMAL;
        return new bw(this.d, this.a, n2, n3, aQ2);
    }

    public l() {
        this.g = 0.004;
    }
}

