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
import net.minecraft.P.r;
import net.minecraft.ao.R;
import net.minecraft.ao.S;
import net.minecraft.ao.b;
import net.minecraft.ao.be;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;

abstract class I
extends u {
    @Nullable
    protected u a(R r2, List<u> list, Random random, int n2, int n3, boolean bl2) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                case NORTH: {
                    return this.a(r2, list, random, this.e.c - 1, this.e.e + n2, this.e.f + n3, aA.WEST, this.d(), bl2);
                }
                case SOUTH: {
                    return this.a(r2, list, random, this.e.c - 1, this.e.e + n2, this.e.f + n3, aA.WEST, this.d(), bl2);
                }
                case WEST: {
                    return this.a(r2, list, random, this.e.c + n3, this.e.e + n2, this.e.f - 1, aA.NORTH, this.d(), bl2);
                }
                case EAST: {
                    return this.a(r2, list, random, this.e.c + n3, this.e.e + n2, this.e.f - 1, aA.NORTH, this.d(), bl2);
                }
            }
        }
        return null;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2) {
    }

    @Nullable
    protected u b(R r2, List<u> list, Random random, int n2, int n3, boolean bl2) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                case NORTH: {
                    return this.a(r2, list, random, this.e.c + n2, this.e.e + n3, this.e.f - 1, aA2, this.d(), bl2);
                }
                case SOUTH: {
                    return this.a(r2, list, random, this.e.c + n2, this.e.e + n3, this.e.d + 1, aA2, this.d(), bl2);
                }
                case WEST: {
                    return this.a(r2, list, random, this.e.c - 1, this.e.e + n3, this.e.f + n2, aA2, this.d(), bl2);
                }
                case EAST: {
                    return this.a(r2, list, random, this.e.a + 1, this.e.e + n3, this.e.f + n2, aA2, this.d(), bl2);
                }
            }
        }
        return null;
    }

    private int a(List<be> list) {
        int n2;
        int n3;
        String[] arrstring;
        block6: {
            int n4 = 0;
            arrstring = u.b();
            n3 = 0;
            for (be be2 : list) {
                block7: {
                    int n5;
                    int n6;
                    block9: {
                        block8: {
                            n2 = be2.a;
                            if (arrstring == null) break block6;
                            if (arrstring == null) break block7;
                            if (n2 <= 0) break block8;
                            n6 = be2.c;
                            n5 = be2.a;
                            if (arrstring == null) break block9;
                            if (n6 < n5) {
                                n4 = 1;
                            }
                        }
                        n6 = n3;
                        n5 = be2.b;
                    }
                    int n7 = n3 = n6 + n5;
                }
                if (arrstring != null) continue;
            }
            n2 = n4;
        }
        if (arrstring != null) {
            n2 = n2 != 0 ? n3 : -1;
        }
        return n2;
    }

    @Override
    protected void a(r r2, j j2) {
    }

    /*
     * Exception decompiling
     */
    private I a(R var1_1, List<be> var2_2, List<u> var3_3, Random var4_4, int var5_5, int var6_6, int var7_7, aA var8_8, int var9_9) {
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

    @Nullable
    protected u c(R r2, List<u> list, Random random, int n2, int n3, boolean bl2) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                case NORTH: {
                    return this.a(r2, list, random, this.e.a + 1, this.e.e + n2, this.e.f + n3, aA.EAST, this.d(), bl2);
                }
                case SOUTH: {
                    return this.a(r2, list, random, this.e.a + 1, this.e.e + n2, this.e.f + n3, aA.EAST, this.d(), bl2);
                }
                case WEST: {
                    return this.a(r2, list, random, this.e.c + n3, this.e.e + n2, this.e.d + 1, aA.SOUTH, this.d(), bl2);
                }
                case EAST: {
                    return this.a(r2, list, random, this.e.c + n3, this.e.e + n2, this.e.d + 1, aA.SOUTH, this.d(), bl2);
                }
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean a(b b10) {
        String[] arrstring = u.b();
        b b11 = b10;
        if (arrstring != null) {
            if (b11 == null) return 0 != 0;
            b11 = b10;
        }
        int n2 = b11.e;
        if (arrstring == null) return n2 != 0;
        if (n2 <= 10) return 0 != 0;
        return 1 != 0;
    }

    public I() {
    }

    private u a(R r2, List<u> list, Random random, int n2, int n3, int n4, @Nullable aA aA2, int n5, boolean bl2) {
        block8: {
            int n6;
            int n7;
            String[] arrstring;
            block7: {
                arrstring = u.b();
                n7 = Math.abs(n2 - r2.a().c);
                n6 = 112;
                if (arrstring == null) break block7;
                if (n7 > n6) break block8;
                n7 = Math.abs(n4 - r2.a().f);
                n6 = 112;
            }
            if (n7 <= n6) {
                I i2;
                List<be> list2 = r2.h;
                if (bl2) {
                    list2 = r2.g;
                }
                I i3 = i2 = this.a(r2, list2, list, random, n2, n3, n4, aA2, n5 + 1);
                if (arrstring != null) {
                    if (i3 != null) {
                        list.add(i2);
                        r2.j.add(i2);
                    }
                    i3 = i2;
                }
                return i3;
            }
        }
        return S.a(list, random, n2, n3, n4, aA2, n5);
    }

    protected I(int n2) {
        super(n2);
    }
}

