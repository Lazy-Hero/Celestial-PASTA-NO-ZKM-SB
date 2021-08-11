/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.M;
import net.minecraft.T.N;
import net.minecraft.T.O;
import net.minecraft.T.P;
import net.minecraft.T.S;
import net.minecraft.T.aX;
import net.minecraft.T.f;
import net.minecraft.T.k;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.L;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ak.t;
import net.minecraft.ak.u;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ai
extends C
implements k {
    public /* synthetic */ float ct;
    public /* synthetic */ float cu;
    public /* synthetic */ float cr;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cs;
    private /* synthetic */ boolean cq;

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("Size", this.g() - 1);
        r2.a("wasOnGround", this.cq);
    }

    @Override
    @Nullable
    protected v D() {
        return this.g() == 1 ? net.minecraft.aj.j.S : net.minecraft.aj.j.av;
    }

    protected boolean e() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.m();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public ai(z z2) {
        super(z2);
        this.b9 = new f(this);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cs, 1);
    }

    protected void c() {
        this.cu *= 0.6f;
    }

    @Override
    public void a(r r2) {
        int[] arrn = net.minecraft.T.S.f();
        super.a(r2);
        int n2 = r2.m("Size");
        int[] arrn2 = arrn;
        if (arrn2 != null) {
            if (n2 < 0) {
                n2 = 0;
            }
            this.b(n2 + 1, false);
            this.cq = r2.f("wasOnGround");
        }
    }

    public int g() {
        return this.ap.b(cs);
    }

    @Override
    public void e(j j2) {
        block3: {
            ai ai2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                ai2 = this;
                if (arrn == null) break block2;
                if (!ai2.e()) break block3;
                ai2 = this;
            }
            ai2.e((B)j2);
        }
    }

    protected boolean w() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.g();
        if (arrn != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    protected net.minecraft.ar.d a() {
        return this.m() ? net.minecraft.u.E.h3 : net.minecraft.u.E.fv;
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block4: {
            ai ai2;
            block6: {
                block5: {
                    int[] arrn = net.minecraft.T.S.f();
                    if (arrn == null) break block4;
                    if (!cs.equals(r2)) break block5;
                    int n2 = this.g();
                    this.c(0.51000005f * (float)n2, 0.51000005f * (float)n2);
                    this.e = this.a1;
                    this.bf = this.a1;
                    ai2 = this;
                    if (arrn == null) break block6;
                    if (!ai2.aj()) break block5;
                    ai2 = this;
                    if (arrn == null) break block6;
                    if (ai2.g.nextInt(20) == 0) {
                        this.aQ();
                    }
                }
                ai2 = this;
            }
            super.a(r2);
        }
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return this.m() ? net.minecraft.u.E.ba : net.minecraft.u.E.ci;
    }

    protected int b() {
        return this.g.nextInt(20) + 10;
    }

    protected void e(B b10) {
        block2: {
            int n2;
            block3: {
                int[] arrn;
                block1: {
                    int n3 = this.g();
                    arrn = net.minecraft.T.S.f();
                    n2 = this.c((x)b10);
                    if (arrn == null) break block1;
                    if (n2 == 0) break block2;
                    double d10 = this.s(b10) - 0.6 * (double)n3 * 0.6 * (double)n3;
                    n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                }
                if (arrn == null) break block3;
                if (n2 >= 0) break block2;
                n2 = b10.a(net.minecraft.ar.G.a(this), (float)this.f()) ? 1 : 0;
            }
            if (n2 != 0) {
                this.a(net.minecraft.u.E.gH, 1.0f, (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
                this.a(this, b10);
            }
        }
    }

    protected net.minecraft.ar.d o() {
        return this.m() ? net.minecraft.u.E.eB : net.minecraft.u.E.gd;
    }

    protected int f() {
        return this.g();
    }

    @Override
    public void n(x x2) {
        block3: {
            ai ai2;
            block4: {
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.T.S.f();
                    super.n(x2);
                    int[] arrn2 = arrn;
                    bl2 = x2 instanceof aX;
                    if (arrn2 == null) break block2;
                    if (!bl2) break block3;
                    ai2 = this;
                    if (arrn2 == null) break block4;
                    bl2 = ai2.e();
                }
                if (!bl2) break block3;
                ai2 = this;
            }
            ai2.e((B)x2);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a() {
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

    @Override
    protected net.minecraft.w.k P() {
        return this.g() == 1 ? net.minecraft.u.h.bw : null;
    }

    static {
        cs = net.minecraft.q.m.a(ai.class, net.minecraft.q.h.n);
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        int n2;
        block6: {
            int n3;
            int n4;
            block4: {
                int n5;
                block5: {
                    n5 = this.g.nextInt(3);
                    int[] arrn = net.minecraft.T.S.f();
                    n4 = n5++;
                    n3 = 2;
                    if (arrn == null) break block4;
                    if (n4 >= n3) break block5;
                    float f10 = this.g.nextFloat() - 0.5f * h2.b();
                    n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                    if (arrn == null) break block6;
                    if (n2 < 0) {
                        // empty if block
                    }
                }
                n4 = 1;
                n3 = n5;
            }
            n2 = n4 << n3;
        }
        int n6 = n2;
        this.b(n6, true);
        return super.a(h2, j2);
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return this.m() ? net.minecraft.u.E.bG : net.minecraft.u.E.dJ;
    }

    protected void b(int n2, boolean bl2) {
        int[] arrn = net.minecraft.T.S.f();
        this.ap.b(cs, n2);
        this.c(0.51000005f * (float)n2, 0.51000005f * (float)n2);
        int[] arrn2 = arrn;
        this.g(this.a, this.aF, this.ax);
        this.a(net.minecraft.U.M.f).a((double)(n2 * n2));
        this.a(net.minecraft.U.M.d).a(0.2f + 0.1f * (float)n2);
        if (arrn2 != null) {
            if (bl2) {
                this.f(this.H());
            }
            this.ch = n2;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected void aH() {
        this.G = 0.42f;
        this.aA = true;
    }

    public boolean m() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.g();
        if (arrn != null) {
            bl2 = bl2 <= true;
        }
        return bl2;
    }

    @Override
    public void ae() {
        ai ai2;
        block19: {
            block18: {
                int n2;
                int[] arrn;
                block16: {
                    block17: {
                        block12: {
                            block13: {
                                ai ai3;
                                block15: {
                                    block14: {
                                        arrn = net.minecraft.T.S.f();
                                        n2 = this.aG.C;
                                        if (arrn == null) break block13;
                                        if (n2 != 0) break block14;
                                        ai3 = this;
                                        if (arrn == null) break block15;
                                        if (ai3.aG.g() != net.minecraft.ah.e.PEACEFUL) break block14;
                                        n2 = this.g();
                                        if (arrn == null) break block13;
                                        if (n2 > 0) {
                                            this.P = true;
                                        }
                                    }
                                    this.ct += (this.cu - this.ct) * 0.5f;
                                    this.cr = this.ct;
                                    super.ae();
                                    ai3 = this;
                                }
                                n2 = ai3.A;
                            }
                            if (arrn == null) break block16;
                            if (n2 == 0) break block17;
                            n2 = this.cq;
                            if (arrn == null) break block16;
                            if (n2 != 0) break block17;
                            int n3 = this.g();
                            for (int i2 = 0; i2 < n3 * 8; ++i2) {
                                float f10 = this.g.nextFloat() * ((float)Math.PI * 2);
                                float f11 = this.g.nextFloat() * 0.5f + 0.5f;
                                float f12 = h.g(f10) * (float)n3 * 0.5f * f11;
                                float f13 = h.c(f10) * (float)n3 * 0.5f * f11;
                                z z2 = this.aG;
                                aH aH2 = this.p();
                                double d10 = this.a + (double)f12;
                                double d11 = this.ax + (double)f13;
                                z2.a(aH2, d10, this.m().b, d11, 0.0, 0.0, 0.0, new int[0]);
                                if (arrn != null) {
                                    if (arrn != null) continue;
                                }
                                break block12;
                            }
                            this.a(this.o(), this.x(), ((this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f) / 0.8f);
                            this.cu = -0.5f;
                        }
                        if (arrn != null) break block18;
                    }
                    ai2 = this;
                    if (arrn == null) break block19;
                    n2 = ai2.A;
                }
                if (n2 != 0) break block18;
                ai2 = this;
                if (arrn == null) break block19;
                if (ai2.cq) {
                    this.cu = 1.0f;
                }
            }
            this.cq = this.A;
            ai2 = this;
        }
        ai2.c();
    }

    protected aH p() {
        return net.minecraft.ar.aH.SLIME;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        block13: {
            block12: {
                var2_1 = new n(h.f(this.a), 0, h.f(this.ax));
                var1_2 = net.minecraft.T.S.f();
                var3_3 = this.aG.b(var2_1);
                v0 = this.aG;
                if (var1_2 != null) {
                    if (v0.b().w() == net.minecraft.ah.L.g) {
                        v1 = this;
                        if (var1_2 != null) {
                            if (v1.g.nextInt(4) != 1) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = this;
                    }
                    v0 = v1.aG;
                }
                if (var1_2 != null) {
                    if (v0.g() == net.minecraft.ah.e.PEACEFUL) return (boolean)0;
                    v0 = this.aG;
                }
                if ((var4_4 = v0.c(var2_1)) != net.minecraft.u.d.n) break block12;
                cfr_temp_0 = this.aF - 50.0;
                v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var1_2 == null) break block13;
                if (v2 <= 0) break block12;
                cfr_temp_1 = this.aF - 70.0;
                v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                if (var1_2 == null) break block13;
                if (v2 >= 0) break block12;
                cfr_temp_2 = this.g.nextFloat() - 0.5f;
                v2 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                if (var1_2 != null) {
                    if (v2 < 0) {
                        cfr_temp_3 = this.g.nextFloat() - this.aG.E();
                        v2 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                        if (var1_2 != null) {
                            if (v2 < 0) {
                                v2 = this.aG.s(new n(this));
                                if (var1_2 != null) {
                                    if (v2 <= this.g.nextInt(8)) {
                                        return super.C();
                                    } else {
                                        ** GOTO lbl43
                                    }
                                } else {
                                    ** GOTO lbl42
                                }
                            } else {
                                ** GOTO lbl41
                            }
                        } else {
                            ** GOTO lbl40
                        }
                    } else {
                        ** GOTO lbl39
                    }
                }
                break block13;
lbl39:
                // 2 sources

                break block12;
lbl40:
                // 2 sources

                break block13;
lbl41:
                // 2 sources

                break block12;
lbl42:
                // 2 sources

                break block13;
            }
            v2 = this.g.nextInt(10);
        }
        if (var1_2 == null) return (boolean)v2;
        if (v2 != 0) return (boolean)0;
        v2 = var3_3.c(987234911L).nextInt(10);
        if (var1_2 == null) return (boolean)v2;
        if (v2 != 0) return (boolean)0;
        cfr_temp_4 = this.aF - 40.0;
        v2 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
        if (var1_2 == null) return (boolean)v2;
        if (v2 >= 0) return (boolean)0;
        return super.C();
    }

    @Override
    protected void H() {
        this.b5.a(1, new O(this));
        this.b5.a(2, new M(this));
        this.b5.a(3, new N(this));
        this.b5.a(5, new P(this));
        this.ci.a(1, new u(this));
        this.ci.a(3, new t(this, aX.class));
    }

    protected ai n() {
        return new ai(this.aG);
    }

    @Override
    public int j() {
        return 0;
    }

    public static void b(b b10) {
        C.a(b10, ai.class);
    }

    @Override
    protected float x() {
        return 0.4f * (float)this.g();
    }

    @Override
    public float l() {
        return 0.625f * this.aD;
    }
}

