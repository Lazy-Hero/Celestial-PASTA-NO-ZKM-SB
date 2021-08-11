/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.h;

import com.google.common.base.Predicate;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.T.ae;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.O;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.S;
import net.minecraft.ah.d;
import net.minecraft.ah.i;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.h.a;
import net.minecraft.h.b;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.z.f;

public class c
extends ae
implements O {
    private static final /* synthetic */ Predicate<x> cy;
    private static final /* synthetic */ net.minecraft.q.r<Integer>[] cx;
    private final /* synthetic */ int[] cC;
    private final /* synthetic */ int[] cI;
    private final /* synthetic */ float[] cA;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cG;
    private final /* synthetic */ float[] cH;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cF;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cB;
    private /* synthetic */ int cD;
    private final /* synthetic */ float[] cE;
    private final /* synthetic */ float[] cz;
    private final /* synthetic */ S cJ;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cK;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(K k2) {
        K k3;
        int n2;
        block12: {
            K k4;
            block11: {
                n2 = net.minecraft.U.D.g();
                K k4 = k2;
                k4 = net.minecraft.u.g.g;
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.df;
                }
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.ad;
                }
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.de;
                }
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.aS;
                }
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.bZ;
                }
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.ah;
                }
                if (n2 != 0) {
                    if (k3 == k4) return false;
                    K k4 = k2;
                    k4 = net.minecraft.u.g.bD;
                }
                if (n2 == 0) break block11;
                if (k3 == k4) return false;
                k3 = k2;
                if (n2 == 0) break block12;
                k4 = net.minecraft.u.g.Y;
            }
            if (k3 == k4) return false;
            k3 = k2;
        }
        K k5 = net.minecraft.u.g.cS;
        if (n2 != 0) {
            if (k3 == k5) return false;
            K k5 = k2;
            k5 = net.minecraft.u.g.m;
        }
        if (k3 == k5) return false;
        return true;
    }

    public void k(int n2) {
        this.ap.b(cB, n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        var3_3 = net.minecraft.U.D.g();
                        v0 = this.a(var1_1);
                        if (var3_3 == 0) return v0;
                        if (v0) {
                            return false;
                        }
                        v1 = var1_1;
                        if (var3_3 != 0) {
                            if (v1 == net.minecraft.ar.G.u) return false;
                            v1 = var1_1;
                        }
                        v2 = v1.h() instanceof c;
                        if (var3_3 == 0) return v2;
                        if (v2 != false) return false;
                        v3 = this.m();
                        if (var3_3 == 0) break block13;
                        if (v3 > 0 && var1_1 != net.minecraft.ar.G.l) {
                            return false;
                        }
                        v4 = this;
                        if (var3_3 == 0) ** GOTO lbl28
                        v3 = v4.f() ? 1 : 0;
                    }
                    if (v3 != 0) {
                        v5 = var4_4 = var1_1.q();
                        if (var3_3 != 0) {
                            if (v5 instanceof f) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v4 = var1_1.h();
lbl28:
                        // 2 sources

                        v5 = var4_4 = v4;
                    }
                    if (var3_3 == 0) break block14;
                    if (v5 == null) break block15;
                    v5 = var4_4;
                }
                v6 = v5 instanceof j;
                if (var3_3 == 0) break block16;
                if (v6 == 0) {
                    v6 = var4_4 instanceof B;
                    if (var3_3 != 0) {
                        if (v6 != 0 && ((B)var4_4).ag() == this.ag()) {
                            return false;
                        } else {
                            ** GOTO lbl42
                        }
                    } else {
                        ** GOTO lbl41
                    }
                }
                break block15;
lbl41:
                // 2 sources

                break block16;
            }
            v6 = this.cD;
        }
        if (var3_3 != 0) {
            if (v6 <= 0) {
                this.cD = 20;
            }
            v6 = var5_5 = 0;
        }
        while (var5_5 < this.cC.length) {
            v7 = this;
            if (var3_3 == 0) return super.a(var1_1, var2_2);
            v8 = var5_5++;
            v7.cC[v8] = v7.cC[v8] + 3;
            if (var3_3 != 0) continue;
        }
        v7 = this;
        return super.a(var1_1, var2_2);
    }

    public float f(int n2) {
        return this.cE[n2];
    }

    @Override
    protected void F() {
        this.a8 = 0;
    }

    @Override
    public net.minecraft.U.g ag() {
        return net.minecraft.U.g.UNDEAD;
    }

    private double a(int n2) {
        if (n2 <= 0) {
            return this.ax;
        }
        float f10 = (this.bf + (float)(180 * (n2 - 1))) * ((float)Math.PI / 180);
        float f11 = h.g(f10);
        return this.ax + (double)f11 * 1.3;
    }

    private double c(int n2) {
        return n2 <= 0 ? this.aF + 3.0 : this.aF + 2.2;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("Invul", this.m());
    }

    @Override
    public void a(B b10, float f10) {
        this.a(0, b10);
    }

    @Override
    protected void H() {
        this.b5.a(0, new b(this));
        this.b5.a(1, new W(this));
        this.b5.a(2, new net.minecraft.ak.k(this, 1.0, 40, 20.0f));
        this.b5.a(5, new aA(this, 1.0));
        this.b5.a(6, new aa(this, j.class, 8.0f));
        this.b5.a(7, new F(this));
        this.ci.a(1, new Z((D)this, false, new Class[0]));
        this.ci.a(2, new au<x>(this, C.class, 0, false, false, cy));
    }

    @Override
    public void b(k k2) {
        super.b(k2);
        this.cJ.b(k2);
    }

    public int m() {
        return this.ap.b(cB);
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.cJ.a(this.d());
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.e3;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void h() {
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
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.fi;
    }

    @Override
    public void E() {
        block48: {
            int n2;
            int n3;
            block47: {
                int n4;
                block32: {
                    int n5;
                    block31: {
                        int n6;
                        double d10;
                        double d11;
                        double d12;
                        block30: {
                            int n7;
                            block33: {
                                double d13;
                                c c10;
                                block35: {
                                    block34: {
                                        double d14;
                                        double d15;
                                        x x2;
                                        block40: {
                                            x x3;
                                            block38: {
                                                block39: {
                                                    block41: {
                                                        c c11;
                                                        double d16;
                                                        block36: {
                                                            block37: {
                                                                this.G *= (double)0.6f;
                                                                n3 = net.minecraft.U.D.i();
                                                                n7 = this.aG.C;
                                                                if (n3 != 0) break block33;
                                                                if (n7 != 0) break block34;
                                                                n7 = this.b(0);
                                                                if (n3 != 0) break block33;
                                                                if (n7 <= 0) break block34;
                                                                c10 = this;
                                                                if (n3 != 0) break block35;
                                                                x2 = c10.aG.a(this.b(0));
                                                                if (x2 == null) break block34;
                                                                double d17 = this.aF - x2.aF;
                                                                d16 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                                                if (n3 != 0) break block36;
                                                                if (d16 < 0) break block37;
                                                                x3 = this;
                                                                if (n3 != 0) break block38;
                                                                if (x3.f()) break block39;
                                                                d15 = this.aF;
                                                                d14 = x2.aF + 5.0;
                                                                if (n3 != 0) break block40;
                                                                if (!(d15 < d14)) break block39;
                                                            }
                                                            c11 = this;
                                                            if (n3 != 0) break block41;
                                                            double d18 = c11.G - 0.0;
                                                            d16 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                                        }
                                                        if (d16 < 0) {
                                                            this.G = 0.0;
                                                        }
                                                        c11 = this;
                                                    }
                                                    c11.G += (0.5 - this.G) * (double)0.6f;
                                                }
                                                x3 = x2;
                                            }
                                            d15 = x3.a;
                                            d14 = this.a;
                                        }
                                        double d19 = d15 - d14;
                                        d12 = x2.ax - this.ax;
                                        d11 = d19 * d19 + d12 * d12;
                                        double d20 = d11 - 9.0;
                                        n7 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                                        if (n3 != 0) break block33;
                                        if (n7 > 0) {
                                            d10 = h.e(d11);
                                            this.aq += (d19 / d10 * 0.5 - this.aq) * (double)0.6f;
                                            this.d += (d12 / d10 * 0.5 - this.d) * (double)0.6f;
                                        }
                                    }
                                    c10 = this;
                                }
                                n7 = (d13 = c10.aq * this.aq + this.d * this.d - (double)0.05f) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            }
                            if (n3 == 0) {
                                if (n7 > 0) {
                                    this.e = (float)h.a(this.d, this.aq) * 57.295776f - 90.0f;
                                }
                                super.E();
                                n7 = n5 = 0;
                            }
                            while (n5 < 2) {
                                this.cz[n5] = this.cA[n5];
                                this.cH[n5] = this.cE[n5];
                                ++n5;
                                if (n3 == 0) {
                                    if (n3 == 0) continue;
                                }
                                break block30;
                            }
                            n5 = 0;
                        }
                        while (n5 < 2) {
                            block43: {
                                block42: {
                                    n2 = this.b(n5 + 1);
                                    x x4 = null;
                                    n6 = n2;
                                    if (n3 != 0) break block31;
                                    if (n6 > 0) {
                                        x4 = this.aG.a(n2);
                                    }
                                    if (x4 == null) break block42;
                                    d12 = this.e(n5 + 1);
                                    d11 = this.c(n5 + 1);
                                    d10 = this.a(n5 + 1);
                                    double d21 = x4.a - d12;
                                    double d22 = x4.aF + (double)x4.l() - d11;
                                    double d23 = x4.ax - d10;
                                    double d24 = h.e(d21 * d21 + d23 * d23);
                                    float f10 = (float)(h.a(d23, d21) * 57.29577951308232) - 90.0f;
                                    float f11 = (float)(-(h.a(d22, d24) * 57.29577951308232));
                                    this.cE[n5] = this.b(this.cE[n5], f11, 40.0f);
                                    this.cA[n5] = this.b(this.cA[n5], f10, 10.0f);
                                    if (n3 == 0) break block43;
                                }
                                this.cA[n5] = this.b(this.cA[n5], this.bf, 10.0f);
                            }
                            ++n5;
                            if (n3 == 0) continue;
                        }
                        n5 = this.f() ? 1 : 0;
                        n6 = n2 = 0;
                    }
                    while (n2 < 3) {
                        block44: {
                            block45: {
                                z z2;
                                double d25;
                                double d26;
                                double d27;
                                block46: {
                                    d27 = this.e(n2);
                                    d26 = this.c(n2);
                                    d25 = this.a(n2);
                                    this.aG.a(net.minecraft.ar.aH.SMOKE_NORMAL, d27 + this.g.nextGaussian() * (double)0.3f, d26 + this.g.nextGaussian() * (double)0.3f, d25 + this.g.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0, new int[0]);
                                    if (n3 != 0) break block44;
                                    n4 = n5;
                                    if (n3 != 0) break block32;
                                    if (n4 == 0) break block45;
                                    z2 = this.aG;
                                    if (n3 != 0) break block46;
                                    if (z2.J.nextInt(4) != 0) break block45;
                                    z2 = this.aG;
                                }
                                z2.a(net.minecraft.ar.aH.SPELL_MOB, d27 + this.g.nextGaussian() * (double)0.3f, d26 + this.g.nextGaussian() * (double)0.3f, d25 + this.g.nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5, new int[0]);
                            }
                            ++n2;
                        }
                        if (n3 == 0) continue;
                    }
                    n4 = this.m();
                }
                if (n3 != 0) break block47;
                if (n4 <= 0) break block48;
                n4 = n2 = 0;
            }
            while (n2 < 3) {
                this.aG.a(net.minecraft.ar.aH.SPELL_MOB, this.a + this.g.nextGaussian(), this.aF + (double)(this.g.nextFloat() * 3.3f), this.ax + this.g.nextGaussian(), (double)0.7f, (double)0.7f, (double)0.9f, new int[0]);
                ++n2;
                if (n3 == 0) continue;
            }
        }
    }

    public void l() {
        this.k(220);
        this.f(this.H() / 3.0f);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(300.0);
        this.a(net.minecraft.U.M.d).a(0.6f);
        this.a(net.minecraft.U.M.b).a(40.0);
        this.a(net.minecraft.U.M.i).a(4.0);
    }

    private double e(int n2) {
        if (n2 <= 0) {
            return this.a;
        }
        float f10 = (this.bf + (float)(180 * (n2 - 1))) * ((float)Math.PI / 180);
        float f11 = h.c(f10);
        return this.a + (double)f11 * 1.3;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cF, 0);
        this.ap.c(cK, 0);
        this.ap.c(cG, 0);
        this.ap.c(cB, 0);
    }

    public boolean f() {
        int n2 = net.minecraft.U.D.g();
        float f10 = this.V() - this.H() / 2.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (n2 != 0) {
            f11 = f11 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    public c(z z2) {
        super(z2);
        this.cE = new float[2];
        this.cA = new float[2];
        this.cH = new float[2];
        this.cz = new float[2];
        this.cI = new int[2];
        this.cC = new int[2];
        this.cJ = (S)new S(this.d(), net.minecraft.ah.d.PURPLE, net.minecraft.ah.i.PROGRESS).a(true);
        this.f(this.H());
        this.c(0.9f, 3.5f);
        this.al = true;
        ((net.minecraft.e.k)this.l()).a(true);
        this.ch = 50;
    }

    private void a(int n2, double d10, double d11, double d12, boolean bl2) {
        this.aG.a(null, 1024, new n(this), 0);
        double d13 = this.e(n2);
        double d14 = this.c(n2);
        double d15 = this.a(n2);
        int n3 = net.minecraft.U.D.i();
        double d16 = d10 - d13;
        double d17 = d11 - d14;
        double d18 = d12 - d15;
        net.minecraft.z.n n4 = new net.minecraft.z.n(this.aG, this, d16, d17, d18);
        boolean bl3 = bl2;
        if (n3 == 0) {
            if (bl3) {
                n4.a(true);
            }
            n4.aF = d14;
            n4.a = d13;
            n4.ax = d15;
            bl3 = this.aG.f(n4);
        }
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    @Override
    protected boolean g(x x2) {
        return false;
    }

    @Override
    public void b(net.minecraft.K.j j2) {
    }

    private float b(float f10, float f11, float f12) {
        float f13;
        float f14;
        block6: {
            float f15;
            float f16;
            block5: {
                f16 = h.b(f11 - f10);
                int n2 = net.minecraft.U.D.g();
                f15 = f16 == f12 ? 0 : (f16 > f12 ? 1 : -1);
                if (n2 == 0) break block5;
                if (f15 > 0) {
                    f16 = f12;
                }
                f14 = f16;
                f13 = -f12;
                if (n2 == 0) break block6;
                float f17 = f14 - f13;
                f15 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            }
            if (f15 < 0) {
                f16 = -f12;
            }
            f14 = f10;
            f13 = f16;
        }
        return f14 + f13;
    }

    public int b(int n2) {
        return this.ap.b(cx[n2]);
    }

    public static void b(net.minecraft.av.b b10) {
        C.a(b10, c.class);
    }

    @Override
    public void a(r r2) {
        block3: {
            c c10;
            block2: {
                int n2 = net.minecraft.U.D.i();
                super.a(r2);
                this.k(r2.m("Invul"));
                int n3 = n2;
                c10 = this;
                if (n3 != 0) break block2;
                if (!c10.g()) break block3;
                c10 = this;
            }
            c10.cJ.a(this.d());
        }
    }

    @Override
    public void a(boolean bl2) {
    }

    @Override
    public void d(float f10, float f11) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(k k2) {
        super.a(k2);
        this.cJ.a(k2);
    }

    @Override
    public void ax() {
    }

    /*
     * Exception decompiling
     */
    private void a(int var1_1, B var2_2) {
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

    public void a(int n2, int n3) {
        this.ap.b(cx[n2], n3);
    }

    static {
        cF = net.minecraft.q.m.a(c.class, net.minecraft.q.h.n);
        cK = net.minecraft.q.m.a(c.class, net.minecraft.q.h.n);
        cG = net.minecraft.q.m.a(c.class, net.minecraft.q.h.n);
        cx = new net.minecraft.q.r[]{cF, cK, cG};
        cB = net.minecraft.q.m.a(c.class, net.minecraft.q.h.n);
        cy = new a();
    }

    public float d(int n2) {
        return this.cA[n2];
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.aL;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        block3: {
            t t2;
            block2: {
                t t3 = this.a(net.minecraft.u.h.aF, 1);
                int n3 = net.minecraft.U.D.g();
                t2 = t3;
                if (n3 == 0) break block2;
                if (t2 == null) break block3;
                t2 = t3;
            }
            t2.k();
        }
    }
}

