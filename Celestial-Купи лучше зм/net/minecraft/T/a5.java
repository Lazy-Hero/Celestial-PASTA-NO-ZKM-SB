/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.K.i;
import net.minecraft.T.S;
import net.minecraft.T.ae;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.O;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.k;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.j.f;
import net.minecraft.k.h;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.u.E;
import net.minecraft.u.a;
import net.minecraft.u.c;
import net.minecraft.w.d;
import net.minecraft.z.t;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a5
extends ae
implements O {
    private static final /* synthetic */ r<Boolean> cA;
    private static final /* synthetic */ f cx;
    private /* synthetic */ int cz;
    private static final /* synthetic */ UUID cy;

    public static void b(b b10) {
        C.a(b10, a5.class);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(26.0);
        this.a(net.minecraft.U.M.d).a(0.25);
    }

    @Override
    protected void ab() {
        super.ab();
        this.E().c(cA, false);
    }

    @Override
    protected void H() {
        this.b5.a(1, new W(this));
        this.b5.a(2, new k(this, 1.0, 60, 10.0f));
        this.b5.a(2, new aA(this, 1.0));
        this.b5.a(3, new aa(this, j.class, 8.0f));
        this.b5.a(3, new F(this));
        this.ci.a(1, new Z((D)this, false, new Class[0]));
        this.ci.a(2, new au<j>((D)this, j.class, true));
    }

    @Override
    public void a(B b10, float f10) {
        block5: {
            i i2;
            float f11;
            double d10;
            double d11;
            double d12;
            block8: {
                float f12;
                block12: {
                    int[] arrn;
                    block11: {
                        block9: {
                            float f13;
                            block10: {
                                block6: {
                                    float f14;
                                    block7: {
                                        B b11;
                                        block4: {
                                            arrn = net.minecraft.T.S.f();
                                            b11 = this;
                                            if (arrn == null) break block4;
                                            if (b11.f()) break block5;
                                            b11 = b10;
                                        }
                                        double d13 = b11.aF + (double)b10.l() - (double)1.1f;
                                        d12 = b10.a + b10.aq - this.a;
                                        d11 = d13 - this.aF;
                                        d10 = b10.ax + b10.d - this.ax;
                                        f11 = h.e(d12 * d12 + d10 * d10);
                                        i2 = net.minecraft.u.a.p;
                                        float f15 = f11 - 8.0f;
                                        f12 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                        if (arrn == null) break block6;
                                        if (f12 < 0) break block7;
                                        f12 = (float)b10.c(c.f);
                                        if (arrn == null) break block6;
                                        if (f12 != false) break block7;
                                        i2 = net.minecraft.u.a.j;
                                        if (arrn != null) break block8;
                                    }
                                    f12 = (f14 = b10.V() - 8.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                }
                                if (arrn == null) break block9;
                                if (f12 < 0) break block10;
                                f12 = (float)b10.c(c.g);
                                if (arrn == null) break block9;
                                if (f12 != false) break block10;
                                i2 = net.minecraft.u.a.c;
                                if (arrn != null) break block8;
                            }
                            f12 = (f13 = f11 - 3.0f) == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                        }
                        if (arrn == null) break block11;
                        if (f12 > 0) break block8;
                        f12 = (float)b10.c(c.d);
                    }
                    if (arrn == null) break block12;
                    if (f12 != false) break block8;
                    float f16 = this.g.nextFloat() - 0.25f;
                    f12 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                }
                if (f12 < 0) {
                    i2 = net.minecraft.u.a.y;
                }
            }
            t t2 = new t(this.aG, this, net.minecraft.K.k.a(new d(net.minecraft.u.h.b3), i2));
            t2.at -= -20.0f;
            t2.a(d12, d11 + (double)(f11 * 0.2f), d10, 0.75f, 8.0f);
            this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.g4, this.ad(), 1.0f, 0.8f + this.g.nextFloat() * 0.4f);
            this.aG.f(t2);
        }
    }

    public boolean f() {
        return this.E().b(cA);
    }

    @Override
    protected float a(G g10, float f10) {
        f10 = super.a(g10, f10);
        int[] arrn = net.minecraft.T.S.f();
        G g11 = g10;
        if (arrn != null) {
            if (g11.h() == this) {
                f10 = 0.0f;
            }
            g11 = g10;
        }
        if (g11.a()) {
            f10 = (float)((double)f10 * 0.15);
        }
        return f10;
    }

    static {
        cy = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
        cx = new f(cy, "Drinking speed penalty", -0.25, 0).a(false);
        cA = net.minecraft.q.m.a(a5.class, net.minecraft.q.h.g);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void E() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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

    public a5(z z2) {
        super(z2);
        this.c(0.6f, 1.95f);
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.cz;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public float l() {
        return 1.62f;
    }

    public void p(boolean bl2) {
        this.E().b(cA, bl2);
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.gN;
    }

    @Override
    public void a(boolean bl2) {
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.O;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.gv;
    }

    @Override
    public void a(byte n2) {
        block2: {
            block4: {
                int n3;
                int[] arrn;
                block3: {
                    arrn = net.minecraft.T.S.f();
                    int n4 = n2;
                    if (arrn == null) break block3;
                    if (n4 != 15) break block4;
                    n4 = n3 = 0;
                }
                while (n3 < this.g.nextInt(35) + 10) {
                    this.aG.a(net.minecraft.ar.aH.SPELL_WITCH, this.a + this.g.nextGaussian() * (double)0.13f, this.m().a + 0.5 + this.g.nextGaussian() * (double)0.13f, this.ax + this.g.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0, new int[0]);
                    ++n3;
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block2;
                }
                if (arrn != null) break block2;
            }
            super.a((byte)n2);
        }
    }
}

