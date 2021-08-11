/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.ax;
import net.minecraft.W.b2;
import net.minecraft.W.bR;
import net.minecraft.W.bc;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.p.f;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h
extends f {
    private static final /* synthetic */ i h;
    private static final /* synthetic */ i i;
    private final /* synthetic */ boolean g;
    private static final /* synthetic */ i j;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, Random random, n n2) {
        this.c(z2, n2.b().i());
        this.c(z2, n2.b(2).i());
        this.c(z2, n2.b().f(2));
        boolean bl2 = net.minecraft.p.a.d();
        this.c(z2, n2.b(2).f(2));
        boolean bl3 = bl2;
        for (int i2 = 0; i2 < 5; ++i2) {
            int n3;
            int n4;
            block4: {
                int n5;
                block6: {
                    block5: {
                        block3: {
                            int n6 = random.nextInt(64);
                            n4 = n6 % 8;
                            n3 = n6 / 8;
                            n5 = n4;
                            if (bl3) break block3;
                            if (n5 == 0) break block4;
                            n5 = n4;
                        }
                        if (bl3) break block5;
                        if (n5 == 7) break block4;
                        n5 = n3;
                    }
                    if (bl3) break block6;
                    if (n5 == 0) break block4;
                    n5 = n3;
                }
                if (n5 != 7) continue;
            }
            this.c(z2, n2.a(-3 + n4, 0, -3 + n3));
            if (!bl3) continue;
        }
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        int n4 = this.a(random);
        boolean bl2 = net.minecraft.p.a.d();
        int n5 = this.a(z2, random, n2, n4);
        if (!bl2) {
            if (n5 == 0) {
                return false;
            }
            this.a(z2, n2.e(), n2.a(), n2.b() + n4, 0, random);
            n5 = n3 = 0;
        }
        while (n3 < n4) {
            block18: {
                block28: {
                    c c10;
                    c c11;
                    block27: {
                        i i2;
                        block25: {
                            block26: {
                                block24: {
                                    block23: {
                                        block21: {
                                            block22: {
                                                block20: {
                                                    block19: {
                                                        block17: {
                                                            block16: {
                                                                c c12;
                                                                c c13;
                                                                block15: {
                                                                    i2 = z2.d(n2.c(n3));
                                                                    c13 = i2.o();
                                                                    c12 = c.A;
                                                                    if (bl2) break block15;
                                                                    if (c13 == c12) break block16;
                                                                    c13 = i2.o();
                                                                    c12 = c.J;
                                                                }
                                                                if (c13 != c12) break block17;
                                                            }
                                                            this.a(z2, n2.c(n3), this.a);
                                                        }
                                                        if (n3 >= n4 - 1) break block18;
                                                        i2 = z2.d(n2.a(1, n3, 0));
                                                        c11 = i2.o();
                                                        c10 = c.A;
                                                        if (bl2) break block19;
                                                        if (c11 == c10) break block20;
                                                        c11 = i2.o();
                                                        c10 = c.J;
                                                    }
                                                    if (bl2) break block21;
                                                    if (c11 != c10) break block22;
                                                }
                                                this.a(z2, n2.a(1, n3, 0), this.a);
                                            }
                                            i2 = z2.d(n2.a(1, n3, 1));
                                            c11 = i2.o();
                                            c10 = c.A;
                                        }
                                        if (bl2) break block23;
                                        if (c11 == c10) break block24;
                                        c11 = i2.o();
                                        c10 = c.J;
                                    }
                                    if (bl2) break block25;
                                    if (c11 != c10) break block26;
                                }
                                this.a(z2, n2.a(1, n3, 1), this.a);
                            }
                            i2 = z2.d(n2.a(0, n3, 1));
                            c11 = i2.o();
                            c10 = c.A;
                        }
                        if (bl2) break block27;
                        if (c11 == c10) break block28;
                        c11 = i2.o();
                        c10 = c.J;
                    }
                    if (c11 != c10) break block18;
                }
                this.a(z2, n2.a(0, n3, 1), this.a);
            }
            ++n3;
            if (!bl2) continue;
        }
        return true;
    }

    public h(boolean bl2, boolean bl3) {
        super(bl2, 13, 15, i, j);
        this.g = bl3;
    }

    private void b(z z2, n n2) {
        boolean bl2 = net.minecraft.p.a.c();
        for (int i2 = 2; i2 >= -3; --i2) {
            i i3;
            block4: {
                block3: {
                    n n3 = n2.c(i2);
                    i3 = z2.d(n3);
                    K k2 = i3.b();
                    if (!bl2) break block3;
                    if (k2 != net.minecraft.u.g.aU && k2 != net.minecraft.u.g.bv) break block4;
                    this.a(z2, n3, h);
                }
                if (bl2) break;
            }
            if (i3.o() != c.A && i2 < 0 && bl2) break;
            if (bl2) continue;
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void a(z var1_1, int var2_2, int var3_3, int var4_4, int var5_5, Random var6_6) {
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

    private void c(z z2, n n2) {
        int n3 = -2;
        boolean bl2 = net.minecraft.p.a.c();
        block0: while (true) {
            int n4 = n3;
            int n5 = 2;
            block1: while (n4 <= n5) {
                for (int i2 = -2; i2 <= 2; ++i2) {
                    block6: {
                        int n6;
                        int n7;
                        block5: {
                            n4 = Math.abs(n3);
                            n5 = 2;
                            if (!bl2) continue block1;
                            if (!bl2) break block5;
                            if (n4 != n5) break block6;
                            n7 = Math.abs(i2);
                            n6 = 2;
                        }
                        if (n7 == n6) continue;
                    }
                    this.b(z2, n2.a(n3, 0, i2));
                    if (bl2) continue;
                }
                ++n3;
                if (bl2) continue block0;
            }
            break;
        }
    }

    static {
        i = net.minecraft.u.g.bu.d().a(bc.B, D.SPRUCE);
        j = net.minecraft.u.g.bU.d().a(bR.D, D.SPRUCE).a(b2.A, false);
        h = net.minecraft.u.g.bv.d().a(ax.A, da.PODZOL);
    }
}

