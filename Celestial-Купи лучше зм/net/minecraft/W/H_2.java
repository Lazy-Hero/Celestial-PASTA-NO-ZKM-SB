/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.w.ap;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.i;
import net.minecraft.w.k;
import net.minecraft.w.o;

public class H
extends k {
    @Override
    public int g(d d10) {
        return 72000;
    }

    @Override
    public int o() {
        return 1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        j j3;
        d d10;
        block4: {
            block5: {
                boolean bl2;
                block6: {
                    d10 = j2.c(a32);
                    int n2 = bl.g();
                    boolean bl3 = this.a(j2).G();
                    if (n2 != 0) {
                        bl3 = !bl3;
                    }
                    boolean bl4 = bl3;
                    j3 = j2;
                    if (n2 == 0) break block4;
                    if (j3.cw.g) break block5;
                    bl2 = bl4;
                    if (n2 == 0) break block6;
                    if (bl2) break block5;
                    bl2 = bl4;
                }
                return bl2 ? new t<d>(aX.PASS, d10) : new t<d>(aX.FAIL, d10);
            }
            j3 = j2;
        }
        j3.a(a32);
        return new t<d>(aX.SUCCESS, d10);
    }

    public static float a(int n2) {
        float f10 = (float)n2 / 20.0f;
        int n3 = bl.c();
        float f11 = f10 = (f10 * f10 + f10 * 2.0f) / 3.0f;
        if (n3 == 0) {
            if (f11 > 1.0f) {
                f10 = 1.0f;
            }
            f11 = f10;
        }
        return f11;
    }

    public H() {
        this.f = 1;
        this.d(384);
        this.a(net.minecraft.ad.a.o);
        this.a(new v("pull"), new i(this));
        this.a(new v("pulling"), new ap(this));
    }

    protected boolean a(d d10) {
        return d10.w() instanceof o;
    }

    @Override
    public bE b(d d10) {
        return bE.BOW;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(d var1_1, z var2_2, B var3_3, int var4_4) {
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

    private d a(j j2) {
        d d10;
        block8: {
            int n2;
            int n3 = bl.g();
            int n4 = this.a(j2.c(a3.OFF_HAND));
            if (n3 != 0) {
                if (n4 != 0) {
                    return j2.c(a3.OFF_HAND);
                }
                n4 = this.a(j2.c(a3.MAIN_HAND));
            }
            if (n3 != 0) {
                if (n4 != 0) {
                    return j2.c(a3.MAIN_HAND);
                }
                n4 = n2 = 0;
            }
            while (n2 < j2.cB.e()) {
                d10 = j2.cB.a(n2);
                if (n3 != 0) {
                    d d11 = d10;
                    if (n3 != 0) {
                        if (this.a(d11)) {
                            return d11;
                        }
                        ++n2;
                    }
                    if (n3 != 0) continue;
                }
                break block8;
            }
            d10 = d.m;
        }
        return d10;
    }
}

