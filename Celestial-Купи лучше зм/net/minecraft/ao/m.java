/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.A.d;
import net.minecraft.T.a2;
import net.minecraft.T.aN;
import net.minecraft.T.aW;
import net.minecraft.T.ad;
import net.minecraft.T.ay;
import net.minecraft.ah.z;
import net.minecraft.ao.aB;
import net.minecraft.ao.ac;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.k.n;

public class m
extends j {
    private final /* synthetic */ List<d> g;

    private static gP a(gP gP2) {
        return gP2;
    }

    public m() {
        this.g = Lists.newArrayList();
        this.g.add(new d(aW.class, 10, 2, 3));
        this.g.add(new d(aN.class, 5, 4, 4));
        this.g.add(new d(a2.class, 8, 5, 5));
        this.g.add(new d(ay.class, 2, 5, 5));
        this.g.add(new d(ad.class, 3, 4, 4));
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

    @Override
    protected boolean b(int n2, int n3) {
        int n4;
        block7: {
            int n5;
            block6: {
                int n6 = n2 >> 4;
                int n7 = n3 >> 4;
                String[] arrstring = u.b();
                this.a.setSeed((long)(n6 ^ n7 << 4) ^ this.d.C());
                this.a.nextInt();
                n4 = this.a.nextInt(3);
                if (arrstring != null) {
                    if (n4 != 0) {
                        return false;
                    }
                    n4 = n2;
                }
                n5 = (n6 << 4) + 4 + this.a.nextInt(8);
                if (arrstring == null) break block6;
                if (n4 != n5) {
                    return false;
                }
                n4 = n3;
                if (arrstring == null) break block7;
                n5 = (n7 << 4) + 4 + this.a.nextInt(8);
            }
            n4 = n4 == n5 ? 1 : 0;
        }
        return n4 != 0;
    }

    @Override
    protected ac a(int n2, int n3) {
        return new aB(this.d, this.a, n2, n3);
    }

    @Override
    public String a() {
        return "Fortress";
    }

    public List<d> a() {
        return this.g;
    }
}

