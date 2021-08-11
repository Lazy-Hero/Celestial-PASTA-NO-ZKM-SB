/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ao.C;
import net.minecraft.ao.a;
import net.minecraft.ao.aY;
import net.minecraft.ao.ap;
import net.minecraft.ao.bG;
import net.minecraft.ao.u;
import net.minecraft.ap.g;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;

class as {
    private /* synthetic */ int a;
    private final /* synthetic */ j c;
    private /* synthetic */ int b;
    private final /* synthetic */ Random d;

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(List<C> list, n n2, ae ae2, bG bG2) {
        n n3 = n2.a(ae2.a(aA.EAST), 1);
        list.add(new C(this.c, bG2.c(this.d), n3, ae2, h.NONE));
    }

    private void a(List<C> list, n n2, ae ae2, aA aA2, bG bG2) {
        String string;
        ae ae3;
        block3: {
            block8: {
                aA aA3;
                aA aA4;
                String[] arrstring;
                block6: {
                    block7: {
                        block4: {
                            block5: {
                                block2: {
                                    ae3 = ae.NONE;
                                    string = bG2.a(this.d);
                                    arrstring = u.b();
                                    aA4 = aA2;
                                    aA3 = aA.EAST;
                                    if (arrstring == null) break block2;
                                    if (aA4 == aA3) break block3;
                                    aA4 = aA2;
                                    aA3 = aA.NORTH;
                                }
                                if (arrstring == null) break block4;
                                if (aA4 != aA3) break block5;
                                ae3 = ae3.a(ae.COUNTERCLOCKWISE_90);
                                if (arrstring != null) break block3;
                            }
                            aA4 = aA2;
                            aA3 = aA.WEST;
                        }
                        if (arrstring == null) break block6;
                        if (aA4 != aA3) break block7;
                        ae3 = ae3.a(ae.CLOCKWISE_180);
                        if (arrstring != null) break block3;
                    }
                    aA4 = aA2;
                    aA3 = aA.SOUTH;
                }
                if (aA4 != aA3) break block8;
                ae3 = ae3.a(ae.CLOCKWISE_90);
                if (arrstring != null) break block3;
            }
            string = bG2.e(this.d);
        }
        n n3 = g.a(new n(1, 0, 0), h.NONE, ae3, 7, 7);
        ae3 = ae3.a(ae2);
        n3 = n3.a(ae2);
        n n4 = n2.a(n3.e(), 0, n3.a());
        list.add(new C(this.c, string, n4, ae3));
    }

    private void a(List<C> list, n n2, ae ae2, aA aA2, aA aA3, bG bG2) {
        h h2;
        ae ae3;
        int n3;
        int n4;
        block6: {
            aA aA4;
            aA aA5;
            block19: {
                String[] arrstring;
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                block13: {
                                    block14: {
                                        block11: {
                                            block12: {
                                                block9: {
                                                    block10: {
                                                        block7: {
                                                            block8: {
                                                                block4: {
                                                                    block5: {
                                                                        n4 = 0;
                                                                        n3 = 0;
                                                                        arrstring = u.b();
                                                                        ae3 = ae2;
                                                                        h2 = h.NONE;
                                                                        aA5 = aA3;
                                                                        aA4 = aA.EAST;
                                                                        if (arrstring == null) break block4;
                                                                        if (aA5 != aA4) break block5;
                                                                        aA5 = aA2;
                                                                        aA4 = aA.SOUTH;
                                                                        if (arrstring == null) break block4;
                                                                        if (aA5 != aA4) break block5;
                                                                        n4 = -7;
                                                                        if (arrstring != null) break block6;
                                                                    }
                                                                    aA5 = aA3;
                                                                    aA4 = aA.EAST;
                                                                }
                                                                if (arrstring == null) break block7;
                                                                if (aA5 != aA4) break block8;
                                                                aA5 = aA2;
                                                                aA4 = aA.NORTH;
                                                                if (arrstring == null) break block7;
                                                                if (aA5 != aA4) break block8;
                                                                n4 = -7;
                                                                n3 = 6;
                                                                h2 = h.LEFT_RIGHT;
                                                                if (arrstring != null) break block6;
                                                            }
                                                            aA5 = aA3;
                                                            aA4 = aA.NORTH;
                                                        }
                                                        if (arrstring == null) break block9;
                                                        if (aA5 != aA4) break block10;
                                                        aA5 = aA2;
                                                        aA4 = aA.EAST;
                                                        if (arrstring == null) break block9;
                                                        if (aA5 != aA4) break block10;
                                                        n4 = 1;
                                                        n3 = 14;
                                                        ae3 = ae2.a(ae.COUNTERCLOCKWISE_90);
                                                        if (arrstring != null) break block6;
                                                    }
                                                    aA5 = aA3;
                                                    aA4 = aA.NORTH;
                                                }
                                                if (arrstring == null) break block11;
                                                if (aA5 != aA4) break block12;
                                                aA5 = aA2;
                                                aA4 = aA.WEST;
                                                if (arrstring == null) break block11;
                                                if (aA5 != aA4) break block12;
                                                n4 = 7;
                                                n3 = 14;
                                                ae3 = ae2.a(ae.COUNTERCLOCKWISE_90);
                                                h2 = h.LEFT_RIGHT;
                                                if (arrstring != null) break block6;
                                            }
                                            aA5 = aA3;
                                            aA4 = aA.SOUTH;
                                        }
                                        if (arrstring == null) break block13;
                                        if (aA5 != aA4) break block14;
                                        aA5 = aA2;
                                        aA4 = aA.WEST;
                                        if (arrstring == null) break block13;
                                        if (aA5 != aA4) break block14;
                                        n4 = 7;
                                        n3 = -8;
                                        ae3 = ae2.a(ae.CLOCKWISE_90);
                                        if (arrstring != null) break block6;
                                    }
                                    aA5 = aA3;
                                    aA4 = aA.SOUTH;
                                }
                                if (arrstring == null) break block15;
                                if (aA5 != aA4) break block16;
                                aA5 = aA2;
                                aA4 = aA.EAST;
                                if (arrstring == null) break block15;
                                if (aA5 != aA4) break block16;
                                n4 = 1;
                                n3 = -8;
                                ae3 = ae2.a(ae.CLOCKWISE_90);
                                h2 = h.LEFT_RIGHT;
                                if (arrstring != null) break block6;
                            }
                            aA5 = aA3;
                            aA4 = aA.WEST;
                        }
                        if (arrstring == null) break block17;
                        if (aA5 != aA4) break block18;
                        aA5 = aA2;
                        aA4 = aA.NORTH;
                        if (arrstring == null) break block17;
                        if (aA5 != aA4) break block18;
                        n4 = 15;
                        n3 = 6;
                        ae3 = ae2.a(ae.CLOCKWISE_180);
                        if (arrstring != null) break block6;
                    }
                    aA5 = aA3;
                    aA4 = aA.WEST;
                }
                if (arrstring == null) break block19;
                if (aA5 != aA4) break block6;
                aA5 = aA2;
                aA4 = aA.SOUTH;
            }
            if (aA5 == aA4) {
                n4 = 15;
                h2 = h.FRONT_BACK;
            }
        }
        n n5 = n2.a(ae2.a(aA.EAST), n4);
        n5 = n5.a(ae2.a(aA.SOUTH), n3);
        list.add(new C(this.c, bG2.d(this.d), n5, ae3, h2));
    }

    /*
     * Exception decompiling
     */
    private void a(List<C> var1_1, n var2_2, ae var3_3, a var4_4, @Nullable a var5_5) {
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

    private void a(List<C> list, aY aY2) {
        aA aA2 = aY2.c.a(aA.WEST);
        list.add(new C(this.c, "entrance", aY2.b.a(aA2, 9), aY2.c));
        aY2.b = aY2.b.a(aY2.c.a(aA.SOUTH), 16);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(List<C> var1_1, aY var2_2, a var3_3, aA var4_4, int var5_5, int var6_6, int var7_7, int var8_8) {
        var10_9 = var5_5;
        var9_10 = u.b();
        var11_11 = var6_6;
        var12_12 = var4_4;
        block0: while (true) lbl-1000:
        // 3 sources

        {
            v0 = ap.a(var3_3, var10_9 + var4_4.r(), var11_11 + var4_4.i());
            block1: while (true) {
                if (v0 != 0) ** GOTO lbl17
                this.d(var1_1, var2_2);
                var4_4 = var4_4.l();
                do {
                    block11: {
                        block6: {
                            block10: {
                                block9: {
                                    block7: {
                                        block8: {
                                            block5: {
                                                if (var9_10 == null) break block5;
                                                if (var10_9 == var7_7 && var11_11 == var8_8 && var12_12 == var4_4) break block6;
                                                this.c(var1_1, var2_2);
                                            }
                                            if (var9_10 != null) break block6;
lbl17:
                                            // 2 sources

                                            v1 = ap.a(var3_3, var10_9 + var4_4.r(), var11_11 + var4_4.i());
                                            if (var9_10 == null) break block7;
                                            if (v1 == 0) break block8;
                                            v1 = ap.a(var3_3, var10_9 + var4_4.r() + var4_4.d().r(), var11_11 + var4_4.i() + var4_4.d().i()) ? 1 : 0;
                                            if (var9_10 == null) break block7;
                                            if (v1 == 0) break block8;
                                            this.b(var1_1, var2_2);
                                            var10_9 += var4_4.r();
                                            var11_11 += var4_4.i();
                                            var4_4 = var4_4.d();
                                            if (var9_10 != null) break block6;
                                        }
                                        var11_11 += var4_4.i();
                                        v1 = var10_9 += var4_4.r();
                                    }
                                    v2 = var7_7;
                                    if (var9_10 == null) break block9;
                                    if (v1 != v2) break block10;
                                    v1 = var11_11;
                                    v2 = var8_8;
                                }
                                if (v1 == v2 && var12_12 == var4_4) break block6;
                            }
                            this.c(var1_1, var2_2);
                        }
                        v0 = var10_9;
                        v3 = var7_7;
                        if (var9_10 == null) break block11;
                        if (v0 != v3) ** GOTO lbl-1000
                        v0 = var11_11;
                        if (var9_10 == null) continue block1;
                        v3 = var8_8;
                    }
                    if (v0 != v3 || var12_12 != var4_4) continue block0;
                } while (var9_10 == null);
                break;
            }
            break;
        }
    }

    private void b(List<C> list, aY aY2) {
        aY2.b = aY2.b.a(aY2.c.a(aA.SOUTH), 6);
        aY2.b = aY2.b.a(aY2.c.a(aA.EAST), 8);
        aY2.c = aY2.c.a(ae.COUNTERCLOCKWISE_90);
    }

    private void c(List<C> list, aY aY2) {
        list.add(new C(this.c, aY2.a, aY2.b.a(aY2.c.a(aA.EAST), 7), aY2.c));
        aY2.b = aY2.b.a(aY2.c.a(aA.SOUTH), 8);
    }

    /*
     * Exception decompiling
     */
    public void a(n var1_1, ae var2_2, List<C> var3_3, ap var4_4) {
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

    public as(j j2, Random random) {
        this.c = j2;
        this.d = random;
    }

    private void d(List<C> list, aY aY2) {
        aY2.b = aY2.b.a(aY2.c.a(aA.SOUTH), -1);
        list.add(new C(this.c, "wall_corner", aY2.b, aY2.c));
        aY2.b = aY2.b.a(aY2.c.a(aA.SOUTH), -7);
        aY2.b = aY2.b.a(aY2.c.a(aA.WEST), -6);
        aY2.c = aY2.c.a(ae.CLOCKWISE_90);
    }

    private void a(List<C> list, n n2, ae ae2, aA aA2, aA aA3, bG bG2, boolean bl2) {
        block6: {
            n n3;
            aA aA4;
            aA aA5;
            block31: {
                String[] arrstring;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block25: {
                                    block26: {
                                        block23: {
                                            block24: {
                                                block21: {
                                                    block22: {
                                                        block19: {
                                                            block20: {
                                                                block17: {
                                                                    block18: {
                                                                        block15: {
                                                                            block16: {
                                                                                block13: {
                                                                                    block14: {
                                                                                        block11: {
                                                                                            block12: {
                                                                                                block9: {
                                                                                                    block10: {
                                                                                                        block7: {
                                                                                                            block8: {
                                                                                                                block4: {
                                                                                                                    block5: {
                                                                                                                        arrstring = u.b();
                                                                                                                        aA5 = aA3;
                                                                                                                        aA4 = aA.EAST;
                                                                                                                        if (arrstring == null) break block4;
                                                                                                                        if (aA5 != aA4) break block5;
                                                                                                                        aA5 = aA2;
                                                                                                                        aA4 = aA.SOUTH;
                                                                                                                        if (arrstring == null) break block4;
                                                                                                                        if (aA5 != aA4) break block5;
                                                                                                                        n3 = n2.a(ae2.a(aA.EAST), 1);
                                                                                                                        list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2));
                                                                                                                        if (arrstring != null) break block6;
                                                                                                                    }
                                                                                                                    aA5 = aA3;
                                                                                                                    aA4 = aA.EAST;
                                                                                                                }
                                                                                                                if (arrstring == null) break block7;
                                                                                                                if (aA5 != aA4) break block8;
                                                                                                                aA5 = aA2;
                                                                                                                aA4 = aA.NORTH;
                                                                                                                if (arrstring == null) break block7;
                                                                                                                if (aA5 != aA4) break block8;
                                                                                                                n3 = n2.a(ae2.a(aA.EAST), 1);
                                                                                                                n3 = n3.a(ae2.a(aA.SOUTH), 6);
                                                                                                                list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2, h.LEFT_RIGHT));
                                                                                                                if (arrstring != null) break block6;
                                                                                                            }
                                                                                                            aA5 = aA3;
                                                                                                            aA4 = aA.WEST;
                                                                                                        }
                                                                                                        if (arrstring == null) break block9;
                                                                                                        if (aA5 != aA4) break block10;
                                                                                                        aA5 = aA2;
                                                                                                        aA4 = aA.NORTH;
                                                                                                        if (arrstring == null) break block9;
                                                                                                        if (aA5 != aA4) break block10;
                                                                                                        n3 = n2.a(ae2.a(aA.EAST), 7);
                                                                                                        n3 = n3.a(ae2.a(aA.SOUTH), 6);
                                                                                                        list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2.a(ae.CLOCKWISE_180)));
                                                                                                        if (arrstring != null) break block6;
                                                                                                    }
                                                                                                    aA5 = aA3;
                                                                                                    aA4 = aA.WEST;
                                                                                                }
                                                                                                if (arrstring == null) break block11;
                                                                                                if (aA5 != aA4) break block12;
                                                                                                aA5 = aA2;
                                                                                                aA4 = aA.SOUTH;
                                                                                                if (arrstring == null) break block11;
                                                                                                if (aA5 != aA4) break block12;
                                                                                                n3 = n2.a(ae2.a(aA.EAST), 7);
                                                                                                list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2, h.FRONT_BACK));
                                                                                                if (arrstring != null) break block6;
                                                                                            }
                                                                                            aA5 = aA3;
                                                                                            aA4 = aA.SOUTH;
                                                                                        }
                                                                                        if (arrstring == null) break block13;
                                                                                        if (aA5 != aA4) break block14;
                                                                                        aA5 = aA2;
                                                                                        aA4 = aA.EAST;
                                                                                        if (arrstring == null) break block13;
                                                                                        if (aA5 != aA4) break block14;
                                                                                        n3 = n2.a(ae2.a(aA.EAST), 1);
                                                                                        list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2.a(ae.CLOCKWISE_90), h.LEFT_RIGHT));
                                                                                        if (arrstring != null) break block6;
                                                                                    }
                                                                                    aA5 = aA3;
                                                                                    aA4 = aA.SOUTH;
                                                                                }
                                                                                if (arrstring == null) break block15;
                                                                                if (aA5 != aA4) break block16;
                                                                                aA5 = aA2;
                                                                                aA4 = aA.WEST;
                                                                                if (arrstring == null) break block15;
                                                                                if (aA5 != aA4) break block16;
                                                                                n3 = n2.a(ae2.a(aA.EAST), 7);
                                                                                list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2.a(ae.CLOCKWISE_90)));
                                                                                if (arrstring != null) break block6;
                                                                            }
                                                                            aA5 = aA3;
                                                                            aA4 = aA.NORTH;
                                                                        }
                                                                        if (arrstring == null) break block17;
                                                                        if (aA5 != aA4) break block18;
                                                                        aA5 = aA2;
                                                                        aA4 = aA.WEST;
                                                                        if (arrstring == null) break block17;
                                                                        if (aA5 != aA4) break block18;
                                                                        n3 = n2.a(ae2.a(aA.EAST), 7);
                                                                        n3 = n3.a(ae2.a(aA.SOUTH), 6);
                                                                        list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2.a(ae.CLOCKWISE_90), h.FRONT_BACK));
                                                                        if (arrstring != null) break block6;
                                                                    }
                                                                    aA5 = aA3;
                                                                    aA4 = aA.NORTH;
                                                                }
                                                                if (arrstring == null) break block19;
                                                                if (aA5 != aA4) break block20;
                                                                aA5 = aA2;
                                                                aA4 = aA.EAST;
                                                                if (arrstring == null) break block19;
                                                                if (aA5 != aA4) break block20;
                                                                n3 = n2.a(ae2.a(aA.EAST), 1);
                                                                n3 = n3.a(ae2.a(aA.SOUTH), 6);
                                                                list.add(new C(this.c, bG2.a(this.d, bl2), n3, ae2.a(ae.COUNTERCLOCKWISE_90)));
                                                                if (arrstring != null) break block6;
                                                            }
                                                            aA5 = aA3;
                                                            aA4 = aA.SOUTH;
                                                        }
                                                        if (arrstring == null) break block21;
                                                        if (aA5 != aA4) break block22;
                                                        aA5 = aA2;
                                                        aA4 = aA.NORTH;
                                                        if (arrstring == null) break block21;
                                                        if (aA5 != aA4) break block22;
                                                        n3 = n2.a(ae2.a(aA.EAST), 1);
                                                        n3 = n3.a(ae2.a(aA.NORTH), 8);
                                                        list.add(new C(this.c, bG2.b(this.d, bl2), n3, ae2));
                                                        if (arrstring != null) break block6;
                                                    }
                                                    aA5 = aA3;
                                                    aA4 = aA.NORTH;
                                                }
                                                if (arrstring == null) break block23;
                                                if (aA5 != aA4) break block24;
                                                aA5 = aA2;
                                                aA4 = aA.SOUTH;
                                                if (arrstring == null) break block23;
                                                if (aA5 != aA4) break block24;
                                                n3 = n2.a(ae2.a(aA.EAST), 7);
                                                n3 = n3.a(ae2.a(aA.SOUTH), 14);
                                                list.add(new C(this.c, bG2.b(this.d, bl2), n3, ae2.a(ae.CLOCKWISE_180)));
                                                if (arrstring != null) break block6;
                                            }
                                            aA5 = aA3;
                                            aA4 = aA.WEST;
                                        }
                                        if (arrstring == null) break block25;
                                        if (aA5 != aA4) break block26;
                                        aA5 = aA2;
                                        aA4 = aA.EAST;
                                        if (arrstring == null) break block25;
                                        if (aA5 != aA4) break block26;
                                        n3 = n2.a(ae2.a(aA.EAST), 15);
                                        list.add(new C(this.c, bG2.b(this.d, bl2), n3, ae2.a(ae.CLOCKWISE_90)));
                                        if (arrstring != null) break block6;
                                    }
                                    aA5 = aA3;
                                    aA4 = aA.EAST;
                                }
                                if (arrstring == null) break block27;
                                if (aA5 != aA4) break block28;
                                aA5 = aA2;
                                aA4 = aA.WEST;
                                if (arrstring == null) break block27;
                                if (aA5 != aA4) break block28;
                                n3 = n2.a(ae2.a(aA.WEST), 7);
                                n3 = n3.a(ae2.a(aA.SOUTH), 6);
                                list.add(new C(this.c, bG2.b(this.d, bl2), n3, ae2.a(ae.COUNTERCLOCKWISE_90)));
                                if (arrstring != null) break block6;
                            }
                            aA5 = aA3;
                            aA4 = aA.UP;
                        }
                        if (arrstring == null) break block29;
                        if (aA5 != aA4) break block30;
                        aA5 = aA2;
                        aA4 = aA.EAST;
                        if (arrstring == null) break block29;
                        if (aA5 != aA4) break block30;
                        n3 = n2.a(ae2.a(aA.EAST), 15);
                        list.add(new C(this.c, bG2.b(this.d), n3, ae2.a(ae.CLOCKWISE_90)));
                        if (arrstring != null) break block6;
                    }
                    aA5 = aA3;
                    aA4 = aA.UP;
                }
                if (arrstring == null) break block31;
                if (aA5 != aA4) break block6;
                aA5 = aA2;
                aA4 = aA.SOUTH;
            }
            if (aA5 == aA4) {
                n3 = n2.a(ae2.a(aA.EAST), 1);
                n3 = n3.a(ae2.a(aA.NORTH), 0);
                list.add(new C(this.c, bG2.b(this.d), n3, ae2));
            }
        }
    }
}

