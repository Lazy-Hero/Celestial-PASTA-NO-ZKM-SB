/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.I;
import net.minecraft.T.S;
import net.minecraft.T.a1;
import net.minecraft.T.ae;
import net.minecraft.T.e;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.M;
import net.minecraft.ak.a9;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.e.i;
import net.minecraft.e.m;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.q.h;
import net.minecraft.q.r;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a0
extends ae {
    private /* synthetic */ B cA;
    protected /* synthetic */ float cC;
    protected /* synthetic */ float cx;
    protected /* synthetic */ float cF;
    protected /* synthetic */ float cG;
    protected /* synthetic */ a9 cB;
    private static final /* synthetic */ r<Boolean> cz;
    private static final /* synthetic */ r<Integer> cy;
    private /* synthetic */ boolean cE;
    protected /* synthetic */ float cD;
    private /* synthetic */ int cH;

    public float e(float f10) {
        return this.cx + (this.cC - this.cx) * f10;
    }

    public int a() {
        return 80;
    }

    protected d b() {
        return net.minecraft.u.E.hq;
    }

    @Override
    public int X() {
        return 160;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean u() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.aG.a(this.m(), this);
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a((x)this, this.m()).isEmpty();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected void H() {
        M m2 = new M(this, 1.0);
        this.cB = new a9(this, 1.0, 80);
        this.b5.a(4, new I(this));
        this.b5.a(5, m2);
        this.b5.a(7, this.cB);
        this.b5.a(8, new aa(this, j.class, 8.0f));
        this.b5.a(8, new aa(this, a0.class, 12.0f, 0.01f));
        this.b5.a(9, new F(this));
        this.cB.a(3);
        m2.a(3);
        this.ci.a(1, new au<B>(this, B.class, 10, true, false, new a1(this)));
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    public void a(r<?> r2) {
        block3: {
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.a(r2);
                int[] arrn2 = arrn;
                if (arrn2 == null) break block2;
                if (!cy.equals(r2)) break block3;
                this.cH = 0;
            }
            this.cA = null;
        }
    }

    @Override
    public void a(float f10, float f11, float f12) {
        block5: {
            a0 a02;
            block2: {
                block3: {
                    int[] arrn;
                    block6: {
                        a0 a03;
                        B b10;
                        block4: {
                            arrn = net.minecraft.T.S.f();
                            a02 = this;
                            if (arrn == null) break block2;
                            if (!a02.r()) break block3;
                            a02 = this;
                            if (arrn == null) break block2;
                            if (!a02.aj()) break block3;
                            this.a(f10, f11, f12, 0.1f);
                            this.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
                            this.aq *= (double)0.9f;
                            this.G *= (double)0.9f;
                            this.d *= (double)0.9f;
                            b10 = this;
                            if (arrn == null) break block4;
                            if (b10.y()) break block5;
                            a03 = this;
                            if (arrn == null) break block6;
                            b10 = a03.J();
                        }
                        if (b10 != null) break block5;
                        a03 = this;
                    }
                    a03.G -= 0.005;
                    if (arrn != null) break block5;
                }
                a02 = this;
            }
            super.a(f10, f11, f12);
        }
    }

    @Override
    protected d aI() {
        return this.aj() ? net.minecraft.u.E.e5 : net.minecraft.u.E.fP;
    }

    public boolean f() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.ap.b(cy).intValue();
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void E() {
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

    static void a(a0 a02, int n2) {
        a02.a(n2);
    }

    private void a(boolean bl2) {
        this.ap.b(cz, bl2);
    }

    private void a(int n2) {
        this.ap.b(cy, n2);
    }

    public static void b(b b10) {
        C.a(b10, a0.class);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.g).a(6.0);
        this.a(net.minecraft.U.M.d).a(0.5);
        this.a(net.minecraft.U.M.b).a(16.0);
        this.a(net.minecraft.U.M.f).a(30.0);
    }

    public boolean y() {
        return this.ap.b(cz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        boolean bl2;
        int[] arrn;
        block2: {
            block3: {
                arrn = net.minecraft.T.S.f();
                bl2 = this.g.nextInt(20);
                if (arrn == null) break block2;
                if (!bl2) break block3;
                bl2 = this.aG.q(new n(this));
                if (arrn == null) break block2;
                if (bl2) return false;
            }
            bl2 = (super.C() ? 1 : 0) != 0;
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected i a(z z2) {
        return new m(this, z2);
    }

    @Override
    protected d q() {
        return this.aj() ? net.minecraft.u.E.dd : net.minecraft.u.E.az;
    }

    @Override
    public float l() {
        return this.aD * 0.5f;
    }

    public float a(float f10) {
        return this.cD + (this.cF - this.cD) * f10;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.M;
    }

    @Override
    protected d e(G g10) {
        return this.aj() ? net.minecraft.u.E.bJ : net.minecraft.u.E.fy;
    }

    static {
        cz = net.minecraft.q.m.a(a0.class, h.g);
        cy = net.minecraft.q.m.a(a0.class, h.n);
    }

    @Override
    public int j() {
        return 180;
    }

    static void a(a0 a02, boolean bl2) {
        a02.a(bl2);
    }

    public a0(z z2) {
        super(z2);
        this.ch = 10;
        this.c(0.85f, 0.85f);
        this.b9 = new e(this);
        this.cD = this.cF = this.g.nextFloat();
    }

    @Nullable
    public B g() {
        B b10;
        block7: {
            block8: {
                block10: {
                    block9: {
                        B b11;
                        boolean bl2;
                        int[] arrn;
                        block6: {
                            arrn = net.minecraft.T.S.f();
                            bl2 = this.f();
                            if (arrn == null) break block6;
                            if (!bl2) {
                                return null;
                            }
                            b10 = this;
                            if (arrn == null) break block7;
                            bl2 = b10.aG.C;
                        }
                        if (!bl2) break block8;
                        x x2 = this.cA;
                        if (arrn != null) {
                            if (x2 != null) {
                                return this.cA;
                            }
                            x2 = b11 = this.aG.a(this.ap.b(cy));
                        }
                        if (arrn == null) break block9;
                        if (!(b11 instanceof B)) break block10;
                        this.cA = b11;
                    }
                    return this.cA;
                }
                return null;
            }
            b10 = this.J();
        }
        return b10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cz, false);
        this.ap.c(cy, 0);
    }

    @Override
    public boolean a(G g10, float f10) {
        a0 a02;
        int[] arrn;
        block6: {
            block7: {
                x x2;
                block9: {
                    boolean bl2;
                    block8: {
                        arrn = net.minecraft.T.S.f();
                        a02 = this;
                        if (arrn == null) break block6;
                        if (a02.y()) break block7;
                        bl2 = g10.a();
                        if (arrn == null) break block8;
                        if (bl2) break block7;
                        x2 = g10.q();
                        if (arrn == null) break block9;
                        bl2 = x2 instanceof B;
                    }
                    if (!bl2) break block7;
                    x2 = g10.q();
                }
                B b10 = (B)x2;
                boolean bl3 = g10.j();
                if (arrn != null && !bl3) {
                    bl3 = b10.a(net.minecraft.ar.G.a((x)this), 2.0f);
                }
            }
            a02 = this;
        }
        if (arrn != null) {
            if (a02.cB != null) {
                this.cB.c();
            }
            a02 = this;
        }
        return super.a(g10, f10);
    }

    public float b(float f10) {
        return ((float)this.cH + f10) / (float)this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public float b(n n2) {
        float f10;
        int[] arrn = net.minecraft.T.S.f();
        a0 a02 = this;
        if (arrn != null) {
            if (a02.aG.d(n2).o() == c.L) {
                f10 = 10.0f + this.aG.k(n2) - 0.5f;
                return f10;
            }
            a02 = this;
        }
        f10 = super.b(n2);
        return f10;
    }
}

