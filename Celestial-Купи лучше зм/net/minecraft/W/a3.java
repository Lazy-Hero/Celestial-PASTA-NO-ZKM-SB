/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.B.V;
import net.minecraft.N.P;
import net.minecraft.N.Q;
import net.minecraft.N.y;
import net.minecraft.O.f;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.dT;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.e;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a3
extends ak {
    public static final /* synthetic */ c z;
    public static final /* synthetic */ net.minecraft.b.c<k, net.minecraft.O.c> B;
    protected /* synthetic */ Random A;
    public static final /* synthetic */ e C;

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d().a(C, aA.a(n2 & 7));
        boolean bl3 = n2 & 8;
        if (!bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(z, bl3);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(i var1_1, z var2_2, n var3_3, K var4_4, n var5_5) {
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
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block3: {
            y y2;
            block4: {
                y y3;
                n n3;
                z z3;
                boolean bl2;
                block2: {
                    bl2 = cL.e();
                    z3 = z2;
                    n3 = n2;
                    if (!bl2) break block2;
                    z3.a(n3, i2.a(C, aA.a(n2, b10)), 2);
                    if (!d10.c()) break block3;
                    z3 = z2;
                    n3 = n2;
                }
                y2 = y3 = z3.b(n3);
                if (!bl2) break block4;
                if (!(y2 instanceof P)) break block3;
                y2 = y3;
            }
            ((P)y2).a(d10.g());
        }
    }

    private void c(z z2, n n2, i i2) {
        block4: {
            boolean bl2;
            aA aA2;
            block8: {
                aA aA3;
                aA aA4;
                boolean bl3;
                boolean bl4;
                boolean bl5;
                block11: {
                    block12: {
                        boolean bl6;
                        block13: {
                            boolean bl7;
                            block10: {
                                block9: {
                                    aA aA5;
                                    aA aA6;
                                    boolean bl8;
                                    boolean bl9;
                                    block5: {
                                        block6: {
                                            boolean bl10;
                                            block7: {
                                                bl5 = cL.b();
                                                if (z2.C) break block4;
                                                aA2 = i2.b(C);
                                                bl9 = z2.d(n2.i()).m();
                                                bl8 = z2.d(n2.j()).m();
                                                aA6 = aA2;
                                                aA5 = aA.NORTH;
                                                if (bl5) break block5;
                                                if (aA6 != aA5) break block6;
                                                bl10 = bl9;
                                                if (bl5) break block7;
                                                if (!bl10) break block6;
                                                bl10 = bl8;
                                            }
                                            if (bl10) break block6;
                                            aA2 = aA.SOUTH;
                                            if (!bl5) break block8;
                                        }
                                        aA6 = aA2;
                                        aA5 = aA.SOUTH;
                                    }
                                    if (aA6 != aA5) break block9;
                                    bl7 = bl8;
                                    if (bl5) break block10;
                                    if (!bl7) break block9;
                                    bl7 = bl9;
                                    if (bl5) break block10;
                                    if (bl7) break block9;
                                    aA2 = aA.NORTH;
                                    if (!bl5) break block8;
                                }
                                bl7 = z2.d(n2.b()).m();
                            }
                            bl4 = bl7;
                            bl3 = z2.d(n2.m()).m();
                            aA4 = aA2;
                            aA3 = aA.WEST;
                            if (bl5) break block11;
                            if (aA4 != aA3) break block12;
                            bl6 = bl4;
                            if (bl5) break block13;
                            if (!bl6) break block12;
                            bl6 = bl3;
                        }
                        if (bl6) break block12;
                        aA2 = aA.EAST;
                        if (!bl5) break block8;
                    }
                    aA4 = aA2;
                    aA3 = aA.EAST;
                }
                if (aA4 != aA3) break block8;
                bl2 = bl3;
                if (bl5) break block4;
                if (!bl2) break block8;
                bl2 = bl4;
                if (bl5) break block4;
                if (!bl2) {
                    aA2 = aA.WEST;
                }
            }
            bl2 = z2.a(n2, i2.a(C, aA2).a(z, false), 2);
        }
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(C).f();
        boolean bl2 = cL.e();
        int n3 = i2.b(z).booleanValue();
        if (bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        super.b(z2, n2, i2);
        this.c(z2, n2, i2);
    }

    protected a3() {
        super(net.minecraft.ac.c.H);
        this.A = new Random();
        this.h(this.e.a().a(C, aA.NORTH).a(z, false));
        this.a(net.minecraft.ad.a.p);
    }

    protected void a(z z2, n n2) {
        block2: {
            d d10;
            net.minecraft.O.c c10;
            int n3;
            P p2;
            dT dT2;
            block4: {
                boolean bl2;
                block3: {
                    P p3;
                    block1: {
                        dT2 = new dT(z2, n2);
                        bl2 = cL.b();
                        p3 = p2 = (P)dT2.c();
                        if (bl2) break block1;
                        if (p3 == null) break block2;
                        p3 = p2;
                    }
                    n3 = p3.b();
                    if (bl2) break block3;
                    if (n3 >= 0) break block4;
                    z2.b(1001, n2, 0);
                }
                if (!bl2) break block2;
            }
            if ((c10 = this.a(d10 = p2.a(n3))) != net.minecraft.O.c.a) {
                p2.a(n3, c10.a(dT2, d10));
            }
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C, z);
    }

    @Override
    public void a(z z2, n n2, i i2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.b();
        if (!bl2) {
            if (y2 instanceof P) {
                V.a(z2, n2, (net.minecraft.B.a)((P)y2));
                z2.b(n2, this);
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(C, ae2.a(i2.b(C)));
    }

    static {
        C = aQ.z;
        z = net.minecraft.ae.c.a("triggered");
        B = new net.minecraft.b.c(new net.minecraft.O.d());
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block0: {
            if (z2.C) break block0;
            this.a(z2, n2);
        }
    }

    public static net.minecraft.O.a a(net.minecraft.O.i i2) {
        aA aA2 = i2.b().b(C);
        double d10 = i2.a() + 0.7 * (double)aA2.r();
        double d11 = i2.f() + 0.7 * (double)aA2.p();
        double d12 = i2.d() + 0.7 * (double)aA2.i();
        return new f(d10, d11, d12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(C, aA.a(n2, b10)).a(z, false);
    }

    @Override
    public y a(z z2, int n2) {
        return new P();
    }

    @Override
    public int b(i i2, z z2, n n2) {
        return net.minecraft.B.n.a(z2.b(n2));
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(C)));
    }

    @Override
    public int a(z z2) {
        return 4;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, net.minecraft.ar.a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block5: {
            block6: {
                j j3;
                block7: {
                    block8: {
                        boolean bl3 = cL.b();
                        z z3 = z2;
                        if (!bl3) {
                            if (z3.C) {
                                return true;
                            }
                            z3 = z2;
                        }
                        y y2 = z3.b(n2);
                        bl2 = y2 instanceof P;
                        if (bl3) break block5;
                        if (!bl2) break block6;
                        j3 = j2;
                        if (bl3) break block7;
                        j3.a((P)y2);
                        if (!(y2 instanceof Q)) break block8;
                        j2.b(net.minecraft.l.m.J);
                        if (!bl3) break block6;
                    }
                    j3 = j2;
                }
                j3.b(net.minecraft.l.m.j);
            }
            bl2 = true;
        }
        return bl2;
    }

    protected net.minecraft.O.c a(d d10) {
        return B.a(d10.w());
    }
}

