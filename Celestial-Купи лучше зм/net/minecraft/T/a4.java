/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.P.r;
import net.minecraft.T.S;
import net.minecraft.T.aE;
import net.minecraft.T.aN;
import net.minecraft.T.aR;
import net.minecraft.T.aX;
import net.minecraft.T.ae;
import net.minecraft.T.ag;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ag.L;
import net.minecraft.ag.W;
import net.minecraft.ah.e;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.F;
import net.minecraft.ak.I;
import net.minecraft.ak.M;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.q;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.e.k;
import net.minecraft.j.c;
import net.minecraft.j.f;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a4
extends ae {
    private final /* synthetic */ q cA;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cG;
    private /* synthetic */ float cz;
    private static final /* synthetic */ f cF;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cB;
    private static final /* synthetic */ UUID cC;
    protected static final /* synthetic */ c cD;
    private /* synthetic */ float cx;
    private /* synthetic */ boolean cy;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cE;

    @Override
    public void a(G g10) {
        block2: {
            aR aR2;
            block4: {
                boolean bl2;
                aR aR3;
                block3: {
                    x x2;
                    int[] arrn;
                    block1: {
                        int[] arrn2 = net.minecraft.T.S.f();
                        super.a(g10);
                        arrn = arrn2;
                        x2 = g10.h();
                        if (arrn == null) break block1;
                        if (!(x2 instanceof aR)) break block2;
                        x2 = g10.h();
                    }
                    aR3 = (aR)x2;
                    bl2 = aR3.y();
                    if (arrn == null) break block3;
                    if (!bl2) break block2;
                    aR2 = aR3;
                    if (arrn == null) break block4;
                    bl2 = aR2.z();
                }
                if (!bl2) break block2;
                aR2 = aR3;
            }
            aR2.m();
            net.minecraft.w.d d10 = this.R();
            if (!d10.G()) {
                this.a(d10, 0.0f);
            }
        }
    }

    public void q(boolean bl2) {
        block6: {
            a4 a42;
            block4: {
                block5: {
                    int[] arrn = net.minecraft.T.S.f();
                    this.E().b(cE, bl2);
                    int[] arrn2 = arrn;
                    a42 = this;
                    if (arrn2 == null) break block4;
                    if (a42.aG == null) break block5;
                    a42 = this;
                    if (arrn2 == null) break block4;
                    if (a42.aG.C) break block5;
                    net.minecraft.j.b b10 = this.a(net.minecraft.U.M.d);
                    b10.a(cF);
                    if (arrn2 == null) break block6;
                    if (bl2) {
                        b10.b(cF);
                    }
                }
                a42 = this;
            }
            a42.p(bl2);
        }
    }

    @Override
    public float l() {
        float f10 = 1.74f;
        if (this.Q()) {
            f10 = (float)((double)f10 - 0.81);
        }
        return f10;
    }

    @Override
    protected void b(h h2) {
        block1: {
            block3: {
                int[] arrn;
                block2: {
                    float f10;
                    block0: {
                        int[] arrn2 = net.minecraft.T.S.f();
                        super.b(h2);
                        arrn = arrn2;
                        float f11 = this.g.nextFloat() - (this.aG.g() == net.minecraft.ah.e.HARD ? 0.05f : 0.01f);
                        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                        if (arrn == null) break block0;
                        if (f12 >= 0) break block1;
                        f12 = f10 = (float)this.g.nextInt(3);
                    }
                    if (arrn == null) break block2;
                    if (f10 != false) break block3;
                    this.a(net.minecraft.B.X.MAINHAND, new net.minecraft.w.d(net.minecraft.u.h.bs));
                }
                if (arrn != null) break block1;
            }
            this.a(net.minecraft.B.X.MAINHAND, new net.minecraft.w.d(net.minecraft.u.h.u));
        }
    }

    @Override
    public boolean j(x x2) {
        int n2;
        block4: {
            int n3;
            block5: {
                n3 = super.j(x2);
                int[] arrn = net.minecraft.T.S.f();
                n2 = n3;
                if (arrn == null) break block4;
                if (n2 == 0) break block5;
                float f10 = this.aG.h(new n(this)).a();
                n2 = this.av().G();
                if (arrn == null) break block4;
                if (n2 == 0) break block5;
                n2 = this.p();
                if (arrn == null) break block4;
                if (n2 == 0) break block5;
                float f11 = this.g.nextFloat() - f10 * 0.3f;
                n2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (arrn == null) break block4;
                if (n2 < 0) {
                    x2.h(2 * (int)f10);
                }
            }
            n2 = n3;
        }
        return n2 != 0;
    }

    @Override
    public void a(r r2) {
        int[] arrn = net.minecraft.T.S.f();
        super.a(r2);
        int[] arrn2 = arrn;
        if (arrn2 != null) {
            if (r2.f("IsBaby")) {
                this.q(true);
            }
            this.r(r2.f("CanBreakDoors"));
        }
    }

    @Override
    public boolean a(G g10, float f10) {
        boolean bl2;
        block6: {
            block7: {
                int n2;
                block5: {
                    block11: {
                        double d10;
                        a4 a42;
                        B b10;
                        int[] arrn;
                        block12: {
                            B b11;
                            block8: {
                                block9: {
                                    x x2;
                                    block10: {
                                        arrn = net.minecraft.T.S.f();
                                        bl2 = super.a(g10, f10);
                                        if (arrn == null) break block6;
                                        if (!bl2) break block7;
                                        b11 = b10 = this.J();
                                        if (arrn == null) break block8;
                                        if (b11 != null) break block9;
                                        x2 = g10.h();
                                        if (arrn == null) break block10;
                                        if (!(x2 instanceof B)) break block9;
                                        x2 = g10.h();
                                    }
                                    b10 = (B)x2;
                                }
                                b11 = b10;
                            }
                            if (b11 == null) break block11;
                            a42 = this;
                            if (arrn == null) break block12;
                            if (a42.aG.g() != net.minecraft.ah.e.HARD) break block11;
                            a42 = this;
                        }
                        n2 = (d10 = (double)a42.g.nextFloat() - this.a(cD).d()) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                        if (arrn == null) break block5;
                        if (n2 >= 0) break block11;
                        n2 = this.aG.M().c("doMobSpawning") ? 1 : 0;
                        if (arrn == null) break block5;
                        if (n2 == 0) break block11;
                        int n3 = net.minecraft.k.h.f(this.a);
                        int n4 = net.minecraft.k.h.f(this.aF);
                        int n5 = net.minecraft.k.h.f(this.ax);
                        a4 a43 = new a4(this.aG);
                        int n6 = 0;
                        while (n6 < 50) {
                            block13: {
                                block14: {
                                    block18: {
                                        boolean bl3;
                                        block17: {
                                            block16: {
                                                int n7;
                                                block15: {
                                                    int n8 = n3 + net.minecraft.k.h.a(this.g, 7, 40) * net.minecraft.k.h.a(this.g, -1, 1);
                                                    int n9 = n4 + net.minecraft.k.h.a(this.g, 7, 40) * net.minecraft.k.h.a(this.g, -1, 1);
                                                    int n10 = n5 + net.minecraft.k.h.a(this.g, 7, 40) * net.minecraft.k.h.a(this.g, -1, 1);
                                                    if (arrn == null) break block13;
                                                    n2 = this.aG.d(new n(n8, n9 - 1, n10)).d() ? 1 : 0;
                                                    if (arrn == null) break block5;
                                                    if (n2 == 0) break block14;
                                                    n7 = this.aG.s(new n(n8, n9, n10));
                                                    if (arrn == null) break block15;
                                                    if (n7 >= 10) break block14;
                                                    a43.g(n8, n9, n10);
                                                    if (arrn == null) break block13;
                                                    n7 = this.aG.a((double)n8, (double)n9, (double)n10, 7.0) ? 1 : 0;
                                                }
                                                if (n7 != 0) break block14;
                                                bl3 = this.aG.a(a43.m(), a43);
                                                if (arrn == null) break block16;
                                                if (!bl3) break block14;
                                                bl3 = this.aG.a((x)a43, a43.m()).isEmpty();
                                            }
                                            if (arrn == null) break block17;
                                            if (!bl3) break block14;
                                            bl3 = this.aG.a(a43.m());
                                        }
                                        if (arrn == null) break block18;
                                        if (bl3) break block14;
                                        bl3 = this.aG.f(a43);
                                    }
                                    a43.d(b10);
                                    a43.a(this.aG.h(new n(a43)), null);
                                    this.a(cD).b(new f("Zombie reinforcement caller charge", -0.05f, 0));
                                    a43.a(cD).b(new f("Zombie reinforcement callee charge", -0.05f, 0));
                                    if (arrn != null) break;
                                }
                                ++n6;
                            }
                            if (arrn != null) continue;
                        }
                    }
                    n2 = 1;
                }
                return n2 != 0;
            }
            bl2 = false;
        }
        return bl2;
    }

    static {
        cD = new net.minecraft.j.e(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).a("Spawn Reinforcements Chance");
        cC = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
        cF = new f(cC, "Baby speed boost", 0.5, 1);
        cE = net.minecraft.q.m.a(a4.class, net.minecraft.q.h.g);
        cG = net.minecraft.q.m.a(a4.class, net.minecraft.q.h.n);
        cB = net.minecraft.q.m.a(a4.class, net.minecraft.q.h.g);
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        block34: {
            a4 a42;
            block33: {
                double d10;
                block32: {
                    Random random;
                    float f10;
                    int[] arrn;
                    block31: {
                        a4 a43;
                        block27: {
                            block29: {
                                block28: {
                                    int n2;
                                    block30: {
                                        float f11;
                                        a4 a44;
                                        Object object;
                                        block26: {
                                            block20: {
                                                Object object2;
                                                int n3;
                                                block22: {
                                                    block23: {
                                                        block25: {
                                                            Object object3;
                                                            block24: {
                                                                block21: {
                                                                    net.minecraft.U.j j3;
                                                                    block19: {
                                                                        j2 = super.a(h2, j2);
                                                                        arrn = net.minecraft.T.S.f();
                                                                        f10 = h2.b();
                                                                        float f12 = this.g.nextFloat() - 0.55f * f10;
                                                                        float f13 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                                                        if (arrn != null) {
                                                                            f13 = f13 < 0 ? 1.0f : 0.0f;
                                                                        }
                                                                        this.o((boolean)f13);
                                                                        j3 = j2;
                                                                        if (arrn != null) {
                                                                            if (j3 == null) {
                                                                                j2 = new aE(this, this.aG.J.nextFloat() < 0.05f, null);
                                                                            }
                                                                            j3 = j2;
                                                                        }
                                                                        if (arrn == null) break block19;
                                                                        if (!(j3 instanceof aE)) break block20;
                                                                        j3 = j2;
                                                                    }
                                                                    object = (aE)j3;
                                                                    n3 = ((aE)object).b;
                                                                    if (arrn == null) break block21;
                                                                    if (n3 == 0) break block20;
                                                                    this.q(true);
                                                                    double d11 = (double)this.aG.J.nextFloat() - 0.05;
                                                                    n3 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                                                }
                                                                if (arrn == null) break block22;
                                                                if (n3 >= 0) break block23;
                                                                object3 = object2 = this.aG.a(L.class, this.m().a(5.0, 3.0, 5.0), net.minecraft.ar.e.a);
                                                                if (arrn == null) break block24;
                                                                if (object3.isEmpty()) break block25;
                                                                object3 = object2.get(0);
                                                            }
                                                            L l2 = (L)object3;
                                                            l2.a(true);
                                                            this.h(l2);
                                                        }
                                                        if (arrn != null) break block20;
                                                    }
                                                    a44 = this;
                                                    if (arrn == null) break block26;
                                                    double d12 = (double)a44.aG.J.nextFloat() - 0.05;
                                                    n3 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                                }
                                                if (n3 < 0) {
                                                    object2 = new L(this.aG);
                                                    ((x)object2).c(this.a, this.aF, this.ax, this.e, 0.0f);
                                                    ((C)object2).a(h2, null);
                                                    ((L)object2).a(true);
                                                    this.aG.f((x)object2);
                                                    this.h((x)object2);
                                                }
                                            }
                                            a44 = this;
                                        }
                                        float f14 = (f11 = this.g.nextFloat() - f10 * 0.1f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                        if (arrn != null) {
                                            f14 = f14 < 0 ? 1.0f : 0.0f;
                                        }
                                        a44.r((boolean)f14);
                                        this.b(h2);
                                        this.a(h2);
                                        a43 = this;
                                        if (arrn == null) break block27;
                                        if (!a43.b(net.minecraft.B.X.HEAD).G()) break block28;
                                        object = this.aG.F();
                                        if (arrn == null) break block29;
                                        if (((Calendar)object).get(2) + 1 != 10) break block28;
                                        n2 = ((Calendar)object).get(5);
                                        if (arrn == null) break block30;
                                        if (n2 != 31) break block28;
                                        random = this.g;
                                        if (arrn == null) break block31;
                                        float f15 = random.nextFloat() - 0.25f;
                                        n2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                    }
                                    if (n2 < 0) {
                                        this.a(net.minecraft.B.X.HEAD, new net.minecraft.w.d(this.g.nextFloat() < 0.1f ? net.minecraft.u.g.y : net.minecraft.u.g.G));
                                        this.cf[net.minecraft.B.X.HEAD.a()] = 0.0f;
                                    }
                                }
                                this.a(net.minecraft.U.M.h).b(new f("Random spawn bonus", this.g.nextDouble() * (double)0.05f, 0));
                            }
                            a43 = this;
                        }
                        random = a43.g;
                    }
                    double d13 = random.nextDouble() * 1.5 * (double)f10;
                    double d14 = d13 - 1.0;
                    d10 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    if (arrn == null) break block32;
                    if (d10 > 0) {
                        this.a(net.minecraft.U.M.b).b(new f("Random zombie-spawn bonus", d13, 2));
                    }
                    a42 = this;
                    if (arrn == null) break block33;
                    float f16 = a42.g.nextFloat() - f10 * 0.05f;
                    d10 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                }
                if (d10 >= 0) break block34;
                this.a(cD).b(new f("Leader zombie bonus", this.g.nextDouble() * 0.25 + 0.5, 0));
                this.a(net.minecraft.U.M.f).b(new f("Leader zombie bonus", this.g.nextDouble() * 3.0 + 1.0, 2));
                a42 = this;
            }
            a42.r(true);
        }
        return j2;
    }

    @Override
    public net.minecraft.U.g ag() {
        return net.minecraft.U.g.UNDEAD;
    }

    public boolean y() {
        return this.E().b(cB);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.f8;
    }

    public void r(boolean bl2) {
        block3: {
            a4 a42;
            block4: {
                block5: {
                    boolean bl3;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.T.S.f();
                        bl3 = this.cy;
                        if (arrn == null) break block2;
                        if (bl3 == bl2) break block3;
                        this.cy = bl2;
                        a42 = this;
                        if (arrn == null) break block4;
                        ((k)a42.l()).d(bl2);
                        bl3 = bl2;
                    }
                    if (!bl3) break block5;
                    this.b5.a(1, this.cA);
                    if (arrn != null) break block3;
                }
                a42 = this;
            }
            a42.b5.a(this.cA);
        }
    }

    @Override
    public boolean Q() {
        return this.E().b(cE);
    }

    protected boolean U() {
        return true;
    }

    @Override
    protected void ab() {
        super.ab();
        this.E().c(cE, false);
        this.E().c(cG, 0);
        this.E().c(cB, false);
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.aC;
    }

    protected final void m(float f10) {
        super.c(this.cx * f10, this.cz * f10);
    }

    protected void P() {
        this.b5.a(6, new I(this, 1.0, false));
        this.ci.a(1, new Z((D)this, true, aN.class));
        this.ci.a(2, new au<net.minecraft.i.j>((D)this, net.minecraft.i.j.class, true));
        this.ci.a(3, new au<W>((D)this, W.class, false));
        this.ci.a(3, new au<aX>((D)this, aX.class, true));
    }

    public void p(boolean bl2) {
        this.m(bl2 ? 0.5f : 1.0f);
    }

    public void a(boolean bl2) {
        this.E().b(cB, bl2);
    }

    public a4(z z2) {
        super(z2);
        this.cA = new q(this);
        this.cx = -1.0f;
        this.c(0.6f, 1.95f);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected final void c(float var1_1, float var2_2) {
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

    public static void b(b b10) {
        C.a(b10, a4.class);
    }

    @Override
    protected int a(net.minecraft.i.j j2) {
        int[] arrn = net.minecraft.T.S.f();
        int n2 = this.Q();
        if (arrn != null) {
            if (n2 != 0) {
                this.ch = (int)((float)this.ch * 2.5f);
            }
            n2 = super.a(j2);
        }
        return n2;
    }

    protected net.minecraft.w.d R() {
        return new net.minecraft.w.d(net.minecraft.u.h.cp, 1, 2);
    }

    @Override
    public void E() {
        block7: {
            a4 a42;
            block5: {
                block6: {
                    int n2;
                    block8: {
                        int n3;
                        block9: {
                            int n4;
                            block10: {
                                block11: {
                                    int[] arrn = net.minecraft.T.S.f();
                                    a42 = this;
                                    if (arrn == null) break block5;
                                    if (!a42.aG.R()) break block6;
                                    a42 = this;
                                    if (arrn == null) break block5;
                                    if (a42.aG.C) break block6;
                                    a42 = this;
                                    if (arrn == null) break block5;
                                    if (a42.Q()) break block6;
                                    a42 = this;
                                    if (arrn == null) break block5;
                                    if (!a42.U()) break block6;
                                    float f10 = this.S();
                                    if (arrn == null) break block7;
                                    if (!(f10 > 0.5f)) break block6;
                                    a42 = this;
                                    if (arrn == null) break block5;
                                    if (!(a42.g.nextFloat() * 30.0f < (f10 - 0.4f) * 2.0f)) break block6;
                                    a42 = this;
                                    if (arrn == null) break block5;
                                    if (!a42.aG.w(new n(this.a, this.aF + (double)this.l(), this.ax))) break block6;
                                    n3 = 1;
                                    net.minecraft.w.d d10 = this.b(net.minecraft.B.X.HEAD);
                                    n2 = d10.G();
                                    if (arrn == null) break block8;
                                    if (n2 != 0) break block9;
                                    n4 = d10.j();
                                    if (arrn == null) break block10;
                                    if (n4 == 0) break block11;
                                    d10.a(d10.u() + this.g.nextInt(2));
                                    n4 = d10.u();
                                    if (arrn == null) break block10;
                                    if (n4 >= d10.E()) {
                                        this.c(d10);
                                        this.a(net.minecraft.B.X.HEAD, net.minecraft.w.d.m);
                                    }
                                }
                                n4 = 0;
                            }
                            n3 = n4;
                        }
                        n2 = n3;
                    }
                    if (n2 != 0) {
                        this.h(8);
                    }
                }
                a42 = this;
            }
            super.E();
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.b).a(35.0);
        this.a(net.minecraft.U.M.d).a(0.23f);
        this.a(net.minecraft.U.M.g).a(3.0);
        this.a(net.minecraft.U.M.i).a(2.0);
        this.ao().b(cD).a(this.g.nextDouble() * (double)0.1f);
    }

    protected d Q() {
        return net.minecraft.u.E.aO;
    }

    @Override
    protected void H() {
        this.b5.a(0, new net.minecraft.ak.W(this));
        this.b5.a(2, new net.minecraft.ak.j(this, 1.0, false));
        this.b5.a(5, new M(this, 1.0));
        this.b5.a(7, new aA(this, 1.0));
        this.b5.a(8, new aa(this, net.minecraft.i.j.class, 8.0f));
        this.b5.a(8, new F(this));
        this.P();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b(net.minecraft.w.d d10) {
        boolean bl2;
        int[] arrn;
        block3: {
            block2: {
                arrn = net.minecraft.T.S.f();
                if (d10.w() != net.minecraft.u.h.bB) break block2;
                bl2 = this.Q();
                if (arrn == null) break block3;
                if (!bl2) break block2;
                bl2 = this.N();
                if (arrn == null) break block3;
                if (bl2) return false;
            }
            bl2 = super.b(d10);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void f(r r2) {
        int[] arrn = net.minecraft.T.S.f();
        super.f(r2);
        int[] arrn2 = arrn;
        if (arrn2 != null) {
            if (this.Q()) {
                r2.a("IsBaby", true);
            }
            r2.a("CanBreakDoors", this.f());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(B var1_1) {
        block11: {
            block12: {
                v0 = net.minecraft.T.S.f();
                super.a(var1_1);
                var2_2 = v0;
                v1 /* !! */  = this;
                if (var2_2 == null) break block11;
                if (v1 /* !! */ .aG.g() == net.minecraft.ah.e.NORMAL) break block12;
                v1 /* !! */  = this;
                if (var2_2 == null) break block11;
                if (v1 /* !! */ .aG.g() != net.minecraft.ah.e.HARD) return;
            }
            v1 /* !! */  = var1_1;
        }
        if (v1 /* !! */  instanceof W == false) return;
        v2 /* !! */  = this;
        if (var2_2 != null) {
            if (v2 /* !! */ .aG.g() != net.minecraft.ah.e.HARD) {
                v2 /* !! */  = this;
                if (var2_2 != null) {
                    if (v2 /* !! */ .g.nextBoolean()) {
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v2 /* !! */  = var1_1;
            }
        }
        var3_3 = (W)v2 /* !! */ ;
        var4_4 = new ag(this.aG);
        var4_4.p(var3_3);
        this.aG.c(var3_3);
        var4_4.a(this.aG.h(new n(var4_4)), new aE(this, false, null));
        var4_4.a(var3_3.aa());
        var4_4.q(var3_3.Q());
        var4_4.m(var3_3.T());
        v3 = var3_3.g();
        if (var2_2 != null) {
            if (v3) {
                var4_4.a(var3_3.aB());
                var4_4.b(var3_3.i());
            }
            v3 = this.aG.f(var4_4);
        }
        this.aG.a(null, 1026, new n(this), 0);
    }

    public boolean f() {
        return this.cy;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.U;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(this.Q(), 0.15f, 1.0f);
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.dE;
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        int[] arrn = net.minecraft.T.S.f();
        if (arrn != null) {
            if (cE.equals(r2)) {
                this.p(this.Q());
            }
            super.a(r2);
        }
    }

    @Override
    public double an() {
        return this.Q() ? 0.0 : -0.45;
    }
}

