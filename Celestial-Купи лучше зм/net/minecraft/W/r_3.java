/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class r
extends k {
    public r() {
        this.a(net.minecraft.ad.a.j);
        this.d(0);
        this.a(true);
    }

    /*
     * Exception decompiling
     */
    @Override
    public aX a(j var1_1, z var2_2, n var3_3, a3 var4_4, aA var5_5, float var6_6, float var7_7, float var8_8) {
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
    public String d(d d10) {
        return super.h() + "." + bl.c(d10.d()).d();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        block4: {
            int n2;
            int n3;
            block3: {
                n3 = bl.g();
                int n4 = this.b(a10);
                if (n3 == 0) break block3;
                if (n4 == 0) break block4;
                n4 = n2 = 0;
            }
            while (n2 < 16) {
                a22.add(new d(this, 1, n2));
                ++n2;
                if (n3 != 0) continue;
            }
        }
    }
}

