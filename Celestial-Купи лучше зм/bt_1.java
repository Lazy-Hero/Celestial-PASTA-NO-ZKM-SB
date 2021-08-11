/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ac.c;

public class bt
extends bE {
    public /* synthetic */ int m;
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH k;

    /*
     * Exception decompiling
     */
    @cL
    public void a(fb var1_1) {
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

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fR fR2) {
        block6: {
            B b10;
            int[] arrn;
            block5: {
                arrn = net.minecraft.ac.c.i();
                b10 = bt.c.s;
                if (arrn == null) break block5;
                if (!(b10.o(bn.l) <= bn.m.r())) break block6;
                b10 = bn.l;
            }
            if (b10 == null) {
                return;
            }
            if (cj.b.i.a(bn.class).i() && bn.l != null) {
                int n2 = bt.c.s.aE;
                if (arrn != null) {
                    float f10;
                    if (n2 != 0) {
                        this.b();
                    }
                    n2 = (f10 = bn.l.V() - 0.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                }
                if (n2 > 0) {
                    this.a();
                }
            }
        }
    }

    public bt() {
        super("TargetStrafe", a5.Combat);
        this.m = -1;
        k = new hH("Strafe Speed", this, 0.23, 0.1, 2.0, 0.01);
        cj.b.f.b(k);
        l = new hH("Distance", this, 3.0, 0.1, 6.0, 0.1);
        cj.b.f.b(l);
        cj.b.f.b(new hH("Wellmore Exploit", this, true));
        cj.b.f.b(new hH("AutoJump", this, true));
        cj.b.f.b(new hH("AutoShift", this, false));
    }

    @cL
    public void b(fR fR2) {
        block15: {
            block24: {
                net.minecraft.client.q.c c10;
                int n2;
                block23: {
                    int[] arrn;
                    block22: {
                        block20: {
                            block21: {
                                block19: {
                                    block18: {
                                        block17: {
                                            block16: {
                                                block14: {
                                                    int[] arrn2 = net.minecraft.ac.c.i();
                                                    this.b("" + l.r());
                                                    arrn = arrn2;
                                                    if (bn.l == null) {
                                                        return;
                                                    }
                                                    n2 = bt.c.s.aE;
                                                    if (arrn != null) {
                                                        if (n2 != 0) {
                                                            this.b();
                                                        }
                                                        n2 = bt.c.ac.C.h();
                                                    }
                                                    if (arrn != null) {
                                                        if (n2 != 0) {
                                                            this.m = 1;
                                                        }
                                                        n2 = bt.c.ac.G.h();
                                                    }
                                                    if (arrn != null) {
                                                        float f10;
                                                        if (n2 != 0) {
                                                            this.m = -1;
                                                        }
                                                        n2 = (f10 = bt.c.s.o(bn.l) - bn.m.r()) == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                                    }
                                                    if (arrn == null) break block14;
                                                    if (n2 > 0) break block15;
                                                    float f11 = bn.l.V() - 0.0f;
                                                    n2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                }
                                                if (arrn == null) break block16;
                                                if (n2 <= 0) break block15;
                                                n2 = cj.b.f.a("AutoJump").l() ? 1 : 0;
                                            }
                                            if (arrn == null) break block17;
                                            if (n2 == 0) break block15;
                                            n2 = cj.b.i.a(bn.class).i() ? 1 : 0;
                                        }
                                        if (arrn == null) break block18;
                                        if (n2 == 0) break block15;
                                        n2 = cj.b.i.a(bt.class).i() ? 1 : 0;
                                    }
                                    if (arrn == null) break block19;
                                    if (n2 == 0) break block15;
                                    n2 = bt.c.s.A ? 1 : 0;
                                }
                                if (arrn == null) break block20;
                                if (n2 == 0) break block21;
                                bt.c.s.aH();
                                n2 = cj.b.f.a("Wellmore Exploit").l() ? 1 : 0;
                                if (arrn == null) break block20;
                                if (n2 != 0) {
                                    bt.c.s.G = 0.419973;
                                }
                            }
                            n2 = cj.b.f.a("Wellmore Exploit").l() ? 1 : 0;
                        }
                        if (arrn == null) break block22;
                        if (n2 == 0) break block15;
                        double d10 = bt.c.s.G - 0.0;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block23;
                    if (n2 <= 0) break block15;
                    c10 = bt.c.s;
                    if (arrn == null) break block24;
                    n2 = c10.A ? 1 : 0;
                }
                if (n2 != 0) break block15;
                c10 = bt.c.s;
            }
            c10.G -= 0.00205;
        }
    }

    private void b() {
        block4: {
            block2: {
                bt bt2;
                block3: {
                    int[] arrn = net.minecraft.ac.c.i();
                    bt2 = this;
                    if (arrn == null) break block2;
                    if (bt2.m != 1) break block3;
                    this.m = -1;
                    if (arrn != null) break block4;
                }
                bt2 = this;
            }
            bt2.m = 1;
        }
    }

    public void a() {
        block7: {
            double d10;
            float[] arrf;
            block5: {
                block6: {
                    int[] arrn = net.minecraft.ac.c.i();
                    B b10 = bn.l;
                    if (arrn != null) {
                        if (b10 == null) {
                            return;
                        }
                        b10 = bn.l;
                    }
                    B b11 = b10;
                    arrf = d5.a((x)b11, false);
                    d10 = bt.c.s.o(b11);
                    if (arrn == null) break block5;
                    if (!(d10 <= l.f())) break block6;
                    hC.a(k.r(), arrf[0], this.m, 0.0);
                    if (arrn != null) break block7;
                }
                d10 = k.r();
            }
            hC.a(d10, arrf[0], this.m, 1.0);
        }
    }
}

