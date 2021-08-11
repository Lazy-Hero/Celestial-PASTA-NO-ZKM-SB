/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.A;
import net.minecraft.ar.aA;
import net.minecraft.client.F.f;
import net.minecraft.client.a.v;
import net.minecraft.client.w.m;
import net.minecraft.w.bl;

public class i
extends f<A> {
    private /* synthetic */ m h;
    private static final /* synthetic */ net.minecraft.ar.v[] a;
    private /* synthetic */ int g;

    private void a(boolean bl2, double d10, double d11, double d12, int n2, float f10) {
        float f11;
        float f12;
        float f13;
        block6: {
            int n3;
            int n4;
            block9: {
                block10: {
                    String[] arrstring;
                    block7: {
                        block8: {
                            block4: {
                                block5: {
                                    String[] arrstring2 = net.minecraft.client.F.f.b();
                                    this.h.a(bl2);
                                    arrstring = arrstring2;
                                    v.M();
                                    f13 = 0.0f;
                                    f12 = 0.0f;
                                    f11 = 0.0f;
                                    n4 = n2;
                                    n3 = aA.NORTH.k();
                                    if (arrstring == null) break block4;
                                    if (n4 != n3) break block5;
                                    f13 = 0.0f;
                                    if (arrstring != null) break block6;
                                }
                                n4 = n2;
                                n3 = aA.SOUTH.k();
                            }
                            if (arrstring == null) break block7;
                            if (n4 != n3) break block8;
                            f13 = 180.0f;
                            f12 = 1.0f;
                            f11 = 1.0f;
                            if (arrstring != null) break block6;
                        }
                        n4 = n2;
                        n3 = aA.WEST.k();
                    }
                    if (arrstring == null) break block9;
                    if (n4 != n3) break block10;
                    f13 = -90.0f;
                    f11 = 1.0f;
                    if (arrstring != null) break block6;
                }
                n4 = n2;
                n3 = aA.EAST.k();
            }
            if (n4 == n3) {
                f13 = 90.0f;
                f12 = 1.0f;
            }
        }
        v.b((float)d10 + f12, (float)d11 + 0.5625f, (float)d12 + f11);
        v.a(90.0f, 1.0f, 0.0f, 0.0f);
        v.a(f13, 0.0f, 0.0f, 1.0f);
        v.q();
        v.M();
        this.h.b();
        v.B();
        v.b(1.0f, 1.0f, 1.0f, f10);
        v.B();
    }

    public i() {
        this.h = new m();
        this.g = this.h.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        bl[] arrbl = bl.values();
        a = new net.minecraft.ar.v[arrbl.length];
        for (bl bl2 : arrbl) {
            i.a[bl2.e()] = new net.minecraft.ar.v("textures/entity/bed/" + bl2.b() + ".png");
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(A var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6, float var10_7) {
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
}

