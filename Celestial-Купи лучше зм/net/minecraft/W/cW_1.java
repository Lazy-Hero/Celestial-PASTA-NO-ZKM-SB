/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.ar.ay;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cW
extends K {
    protected static final /* synthetic */ k A;
    public static final /* synthetic */ e z;
    protected static final /* synthetic */ k F;
    public static final /* synthetic */ c B;
    protected static final /* synthetic */ k C;
    public static final /* synthetic */ c D;
    protected static final /* synthetic */ k E;

    /*
     * Exception decompiling
     */
    public void a(z var1_1, n var2_2, i var3_3, boolean var4_4, boolean var5_5, int var6_6, @Nullable i var7_7) {
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
    public int c(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        Object object = i2.b(D);
        if (!bl2) {
            if (!((Boolean)object).booleanValue()) {
                return 0;
            }
            object = i2.b(z);
        }
        return object == aA2 ? 15 : 0;
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        int n3 = i2.b(D).booleanValue();
        if (!bl2) {
            n3 = n3 != 0 ? 15 : 0;
        }
        return n3;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        i i2 = this.d().a(D, false).a(B, false);
        if (aA2.g().d()) {
            i2 = i2.a(z, aA2);
        }
        return i2;
    }

    @Override
    public aC p() {
        return aC.CUTOUT_MIPPED;
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d().a(z, aA.b(n2 & 3));
        boolean bl3 = n2 & 8;
        if (!bl2) {
            bl3 = bl3 > false;
        }
        i i3 = i2.a(D, bl3);
        boolean bl4 = n2 & 4;
        if (!bl2) {
            bl4 = bl4 > false;
        }
        return i3.a(B, bl4);
    }

    private void a(z z2, n n2, aA aA2) {
        z2.a(n2, (K)this, false);
        z2.a(n2.a(aA2.h()), (K)this, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, aA aA2) {
        boolean bl2;
        aA aA3 = aA2.h();
        n n3 = n2.a(aA3);
        i i2 = z2.d(n3);
        boolean bl3 = cL.b();
        boolean bl4 = bl2 = cW.a(i2.b());
        if (!bl3) {
            if (bl4) return false;
            bl4 = aA2.g().d();
        }
        if (!bl4) return false;
        i i3 = i2;
        if (!bl3) {
            if (i3.c(z2, n3, aA2) != net.minecraft.Z.d.SOLID) return false;
            i3 = i2;
        }
        boolean bl5 = i3.a();
        if (bl3) return bl5;
        if (bl5) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, n n2) {
        boolean bl2;
        block3: {
            Iterator<aA> iterator = av.HORIZONTAL.iterator();
            boolean bl3 = cL.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl4;
                    block4: {
                        aA aA2 = iterator.next();
                        bl2 = this.a(z2, n2, aA2);
                        if (bl3) break block3;
                        if (bl3) break block4;
                        if (!bl2) break block5;
                        bl4 = true;
                    }
                    return bl4;
                }
                if (!bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.e();
        if (k2 != this && this.a(z2, n2, i2)) {
            aA aA2 = i2.b(z);
            boolean bl3 = this.a(z2, n2, aA2);
            if (bl2 && !bl3) {
                this.a(z2, n2, i2, 0);
                bl3 = z2.v(n2);
            }
        }
    }

    private boolean a(z z2, n n2, i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.a(z2, n2);
        if (!bl2) {
            if (!bl3) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
                return false;
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        this.a(z2, n2, i2, false, false, -1, null);
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(z)) {
            default: {
                return A;
            }
            case WEST: {
                return F;
            }
            case SOUTH: {
                return C;
            }
            case NORTH: 
        }
        return E;
    }

    public cW() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(z, aA.NORTH).a(D, false).a(B, false));
        this.a(net.minecraft.ad.a.p);
        this.a(true);
    }

    static {
        z = bF.z;
        D = net.minecraft.ae.c.a("powered");
        B = net.minecraft.ae.c.a("attached");
        E = new k(0.3125, 0.0, 0.625, 0.6875, 0.625, 1.0);
        C = new k(0.3125, 0.0, 0.0, 0.6875, 0.625, 0.375);
        F = new k(0.625, 0.0, 0.3125, 1.0, 0.625, 0.6875);
        A = new k(0.0, 0.0, 0.3125, 0.375, 0.625, 0.6875);
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        boolean bl2;
        block6: {
            boolean bl3;
            block7: {
                block5: {
                    boolean bl4;
                    block4: {
                        boolean bl5 = i2.b(B);
                        bl4 = cL.e();
                        bl3 = i2.b(D);
                        bl2 = bl5;
                        if (!bl4) break block4;
                        if (bl2) break block5;
                        bl2 = bl3;
                    }
                    if (!bl4) break block6;
                    if (!bl2) break block7;
                }
                this.a(z2, n2, i2, true, false, -1, null);
            }
            bl2 = bl3;
        }
        if (bl2) {
            z2.a(n2, (K)this, false);
            z2.a(n2.a(i2.b(z).h()), (K)this, false);
        }
        super.a(z2, n2, i2);
    }

    @Override
    public void b(z z2, n n2, i i2, Random random) {
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        this.a(z2, n2, i2, false, true, -1, null);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(z).k();
        boolean bl2 = cL.e();
        int n3 = i2.b(D).booleanValue();
        if (bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = i2.b(B).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= 4;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    private void a(z z2, n n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        block3: {
            boolean bl6;
            block8: {
                boolean bl7;
                block6: {
                    block7: {
                        block4: {
                            block5: {
                                block1: {
                                    block2: {
                                        bl7 = cL.e();
                                        bl6 = bl3;
                                        if (!bl7) break block1;
                                        if (!bl6) break block2;
                                        bl6 = bl5;
                                        if (!bl7) break block1;
                                        if (bl6) break block2;
                                        z2.a(null, n2, net.minecraft.u.E.cC, ay.BLOCKS, 0.4f, 0.6f);
                                        if (bl7) break block3;
                                    }
                                    bl6 = bl3;
                                }
                                if (!bl7) break block4;
                                if (bl6) break block5;
                                bl6 = bl5;
                                if (!bl7) break block4;
                                if (!bl6) break block5;
                                z2.a(null, n2, net.minecraft.u.E.aP, ay.BLOCKS, 0.4f, 0.5f);
                                if (bl7) break block3;
                            }
                            bl6 = bl2;
                        }
                        if (!bl7) break block6;
                        if (!bl6) break block7;
                        bl6 = bl4;
                        if (!bl7) break block6;
                        if (bl6) break block7;
                        z2.a(null, n2, net.minecraft.u.E.gB, ay.BLOCKS, 0.4f, 0.7f);
                        if (bl7) break block3;
                    }
                    bl6 = bl2;
                }
                if (!bl7) break block8;
                if (bl6) break block3;
                bl6 = bl4;
            }
            if (bl6) {
                z2.a(null, n2, net.minecraft.u.E.bo, ay.BLOCKS, 0.4f, 1.2f / (z2.J.nextFloat() * 0.2f + 0.9f));
            }
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, D, B);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }
}

