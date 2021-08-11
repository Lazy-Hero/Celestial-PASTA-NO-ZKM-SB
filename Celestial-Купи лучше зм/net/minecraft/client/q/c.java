/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.q;

import javax.annotation.Nullable;
import net.minecraft.J.t;
import net.minecraft.J.u;
import net.minecraft.K.b;
import net.minecraft.N.W;
import net.minecraft.N.Y;
import net.minecraft.N.j;
import net.minecraft.U.B;
import net.minecraft.U.e;
import net.minecraft.ag.D;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.at.k;
import net.minecraft.client.I.m;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.O;
import net.minecraft.client.b.a2;
import net.minecraft.client.b.a6;
import net.minecraft.client.b.aV;
import net.minecraft.client.b.ak;
import net.minecraft.client.b.ay;
import net.minecraft.client.q.a;
import net.minecraft.d.C;
import net.minecraft.d.F;
import net.minecraft.d.H;
import net.minecraft.d.J;
import net.minecraft.d.K;
import net.minecraft.d.o;
import net.minecraft.d.q;
import net.minecraft.d.r;
import net.minecraft.d.s;
import net.minecraft.d.w;
import net.minecraft.d.x;
import net.minecraft.d.y;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.l.g;
import net.minecraft.l.i;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c
extends a {
    public /* synthetic */ float cK;
    private /* synthetic */ float cQ;
    private /* synthetic */ double c5;
    protected /* synthetic */ Q c2;
    private /* synthetic */ String c3;
    private /* synthetic */ boolean cU;
    private /* synthetic */ float c1;
    private /* synthetic */ boolean dg;
    public /* synthetic */ int c7;
    private /* synthetic */ double c6;
    public /* synthetic */ float cX;
    private /* synthetic */ boolean c_;
    protected /* synthetic */ int cW;
    private final /* synthetic */ i cS;
    private /* synthetic */ boolean c8;
    public /* synthetic */ float da;
    private /* synthetic */ double cV;
    public /* synthetic */ float cO;
    private final /* synthetic */ g cM;
    public /* synthetic */ net.minecraft.ar.a6 c4;
    private /* synthetic */ boolean db;
    private /* synthetic */ a3 cR;
    private /* synthetic */ int dc;
    private /* synthetic */ int cY;
    public final /* synthetic */ net.minecraft.client.o.j c9;
    private /* synthetic */ boolean cJ;
    private /* synthetic */ int cZ;
    private /* synthetic */ float df;
    public /* synthetic */ float cL;
    public /* synthetic */ float dd;
    private /* synthetic */ boolean cP;
    private /* synthetic */ float c0;
    private /* synthetic */ int cT;
    private /* synthetic */ float cN;
    private /* synthetic */ boolean de;

    @Override
    public void a(d d10, float f10, float f11) {
        this.aG.a(this.a, this.aF, this.ax, d10, this.ad(), f10, f11, false);
    }

    @Override
    public void ag() {
        this.c9.a(new q(this.cm.b));
        this.Q();
    }

    @Override
    public void h(net.minecraft.U.x x2) {
        this.c2.au.a(x2, net.minecraft.ar.aH.CRIT);
    }

    @Override
    protected net.minecraft.w.d a(t t2) {
        return net.minecraft.w.d.m;
    }

    @Override
    public boolean a(net.minecraft.U.x x2, boolean bl2) {
        int n2 = net.minecraft.U.B.ah();
        boolean bl3 = super.a(x2, bl2);
        if (n2 == 0) {
            if (!bl3) {
                return false;
            }
            bl3 = x2 instanceof u;
        }
        if (n2 == 0) {
            if (bl3) {
                this.c2.p().c(new net.minecraft.client.e.x(this, (u)x2));
            }
            bl3 = x2 instanceof net.minecraft.J.o;
        }
        if (n2 == 0) {
            if (bl3) {
                this.ak = x2.e;
                this.e = x2.e;
                this.a(x2.e);
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public void a(Y y2) {
        this.c2.a(new net.minecraft.client.I.t(y2));
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a4() {
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
    public boolean c() {
        return true;
    }

    @Override
    public a3 aN() {
        return this.cR;
    }

    public void Q() {
        this.cB.e(net.minecraft.w.d.m);
        super.ag();
        this.c2.a((L)null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean F() {
        int n2 = net.minecraft.U.B.ah();
        boolean bl2 = this.a4();
        if (n2 != 0) return bl2;
        if (bl2) {
            return false;
        }
        float f10 = net.minecraft.ar.a6.a - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (n2 != 0) return (boolean)f11;
        if (f11 == false) {
            float f12 = net.minecraft.ar.a6.e - 0.0f;
            f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (n2 != 0) return (boolean)f11;
            if (f11 == false) {
                f11 = 0.0f;
                return (boolean)f11;
            }
        }
        f11 = 1.0f;
        return (boolean)f11;
    }

    @Override
    public void i(float f10) {
    }

    public void b(String string) {
        block0: {
            fO fO2 = new fO(string);
            af.a(fO2);
            if (fO2.a()) break block0;
            this.c9.a(new w(fO2.a()));
        }
    }

    @Override
    public void k(boolean bl2) {
        super.k(bl2);
        this.c7 = 0;
    }

    @Override
    public void a(W w2) {
        this.c2.a(new net.minecraft.client.I.s(w2));
    }

    /*
     * Exception decompiling
     */
    private void R() {
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
    protected boolean e(double d10, double d11, double d12) {
        int n2;
        block40: {
            block41: {
                int n3;
                block51: {
                    int n4;
                    int n5;
                    block49: {
                        int n6;
                        block50: {
                            double d13;
                            double d14;
                            block48: {
                                block46: {
                                    n n7;
                                    block47: {
                                        block44: {
                                            block45: {
                                                double d15;
                                                block42: {
                                                    block43: {
                                                        block39: {
                                                            boolean bl2;
                                                            block38: {
                                                                block36: {
                                                                    block37: {
                                                                        boolean bl3;
                                                                        block32: {
                                                                            block33: {
                                                                                block34: {
                                                                                    block35: {
                                                                                        fq fq2 = new fq();
                                                                                        int n8 = net.minecraft.U.B.aL();
                                                                                        af.a(fq2);
                                                                                        n5 = n8;
                                                                                        bl3 = fq2.a();
                                                                                        if (n5 != 0) {
                                                                                            if (bl3) {
                                                                                                return false;
                                                                                            }
                                                                                            bl3 = cj.b.i.a(bU.class).i();
                                                                                        }
                                                                                        if (n5 == 0) break block32;
                                                                                        if (bl3) break block33;
                                                                                        bl2 = cj.b.i.a(bK.class).i();
                                                                                        if (n5 == 0) break block34;
                                                                                        if (!bl2) break block35;
                                                                                        bl3 = bK.m.l();
                                                                                        if (n5 == 0) break block32;
                                                                                        if (bl3) break block33;
                                                                                    }
                                                                                    bl2 = cj.b.i.a(cT.class).i();
                                                                                }
                                                                                if (n5 == 0) break block36;
                                                                                if (!bl2) break block37;
                                                                            }
                                                                            bl3 = false;
                                                                        }
                                                                        return bl3;
                                                                    }
                                                                    bl2 = this.K;
                                                                }
                                                                if (n5 == 0) break block38;
                                                                if (!bl2) break block39;
                                                                bl2 = false;
                                                            }
                                                            return bl2;
                                                        }
                                                        n7 = new n(d10, d11, d12);
                                                        d15 = d10 - (double)n7.e();
                                                        d14 = d12 - (double)n7.a();
                                                        n2 = this.a(n7);
                                                        if (n5 == 0) break block40;
                                                        if (n2 != 0) break block41;
                                                        n4 = -1;
                                                        d13 = 9999.0;
                                                        n6 = this.a(n7.b());
                                                        if (n5 == 0) break block42;
                                                        if (n6 == 0) break block43;
                                                        n6 = d15 == d13 ? 0 : (d15 < d13 ? -1 : 1);
                                                        if (n5 == 0) break block42;
                                                        if (n6 < 0) {
                                                            d13 = d15;
                                                            n4 = 0;
                                                        }
                                                    }
                                                    n6 = this.a(n7.m());
                                                }
                                                if (n5 == 0) break block44;
                                                if (n6 == 0) break block45;
                                                double d16 = 1.0 - d15 - d13;
                                                n6 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                                if (n5 == 0) break block44;
                                                if (n6 < 0) {
                                                    d13 = 1.0 - d15;
                                                    n4 = 1;
                                                }
                                            }
                                            n6 = this.a(n7.i());
                                        }
                                        if (n5 == 0) break block46;
                                        if (n6 == 0) break block47;
                                        n6 = d14 == d13 ? 0 : (d14 < d13 ? -1 : 1);
                                        if (n5 == 0) break block46;
                                        if (n6 < 0) {
                                            d13 = d14;
                                            n4 = 4;
                                        }
                                    }
                                    n6 = this.a(n7.j()) ? 1 : 0;
                                }
                                if (n5 == 0) break block48;
                                if (n6 == 0) break block49;
                                double d17 = 1.0 - d14 - d13;
                                n6 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                            }
                            if (n5 == 0) break block50;
                            if (n6 >= 0) break block49;
                            d13 = 1.0 - d14;
                            n6 = 5;
                        }
                        n4 = n6;
                    }
                    float f10 = 0.1f;
                    n2 = n4;
                    if (n5 != 0) {
                        if (n2 == 0) {
                            this.aq = -0.1f;
                        }
                        n2 = n4;
                    }
                    n3 = 1;
                    if (n5 != 0) {
                        if (n2 == n3) {
                            this.aq = 0.1f;
                        }
                        int n3 = n4;
                        n3 = 4;
                    }
                    if (n5 == 0) break block51;
                    if (n2 == n3) {
                        this.d = -0.1f;
                    }
                    n2 = n4;
                    if (n5 == 0) break block40;
                    n3 = 5;
                }
                if (n2 == n3) {
                    this.d = 0.1f;
                }
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.B.a var1_1) {
        block17: {
            block18: {
                block16: {
                    var2_2 = net.minecraft.U.B.aL();
                    v0 = var1_1;
                    if (var2_2 == 0) ** GOTO lbl6
                    if (v0 instanceof net.minecraft.ah.o) {
                        v0 = var1_1;
lbl6:
                        // 2 sources

                        v1 = ((net.minecraft.ah.o)v0).a();
                    } else {
                        v1 = "minecraft:container";
                    }
                    var3_3 = v1;
                    v2 = "minecraft:chest".equals(var3_3);
                    if (var2_2 != 0) {
                        if (v2) {
                            this.c2.a(new net.minecraft.client.I.j(this.cB, var1_1));
                            if (var2_2 != 0) return;
                        }
                        v2 = "minecraft:hopper".equals(var3_3);
                    }
                    if (var2_2 != 0) {
                        if (v2) {
                            this.c2.a(new ay(this.cB, var1_1));
                            if (var2_2 != 0) return;
                        }
                        v2 = "minecraft:furnace".equals(var3_3);
                    }
                    if (var2_2 != 0) {
                        if (v2) {
                            this.c2.a(new m(this.cB, var1_1));
                            if (var2_2 != 0) return;
                        }
                        v2 = "minecraft:brewing_stand".equals(var3_3);
                    }
                    if (var2_2 != 0) {
                        if (v2) {
                            this.c2.a(new net.minecraft.client.I.i(this.cB, var1_1));
                            if (var2_2 != 0) return;
                        }
                        v2 = "minecraft:beacon".equals(var3_3);
                    }
                    if (var2_2 != 0) {
                        if (v2) {
                            this.c2.a(new net.minecraft.client.I.h(this.cB, var1_1));
                            if (var2_2 != 0) return;
                        }
                        v2 = "minecraft:dispenser".equals(var3_3);
                    }
                    if (var2_2 == 0) break block16;
                    if (v2) break block17;
                    v2 = "minecraft:dropper".equals(var3_3);
                }
                if (var2_2 == 0) break block18;
                if (v2) break block17;
                v2 = "minecraft:shulker_box".equals(var3_3);
            }
            if (v2) {
                this.c2.a(new net.minecraft.client.I.o(this.cB, var1_1));
                if (var2_2 != 0) return;
            }
            this.c2.a(new net.minecraft.client.I.j(this.cB, var1_1));
            if (var2_2 != 0) return;
        }
        this.c2.a(new net.minecraft.client.I.l(this.cB, var1_1));
    }

    @Override
    public void a(net.minecraft.ah.o o2) {
        block3: {
            boolean bl2;
            block4: {
                String string;
                block5: {
                    int n2;
                    block1: {
                        block2: {
                            string = o2.a();
                            n2 = net.minecraft.U.B.aL();
                            bl2 = "minecraft:crafting_table".equals(string);
                            if (n2 == 0) break block1;
                            if (!bl2) break block2;
                            this.c2.a(new net.minecraft.client.I.k(this.cB, this.aG));
                            if (n2 != 0) break block3;
                        }
                        bl2 = "minecraft:enchanting_table".equals(string);
                    }
                    if (n2 == 0) break block4;
                    if (!bl2) break block5;
                    this.c2.a(new aV(this.cB, this.aG, o2));
                    if (n2 != 0) break block3;
                }
                bl2 = "minecraft:anvil".equals(string);
            }
            if (bl2) {
                this.c2.a(new a2(this.cB, this.aG));
            }
        }
    }

    @Override
    public void ae() {
        block7: {
            block12: {
                boolean bl2;
                block8: {
                    int n2;
                    block9: {
                        block11: {
                            net.minecraft.U.x x2;
                            net.minecraft.U.x x3;
                            block10: {
                                n2 = net.minecraft.U.B.aL();
                                if (!this.aG.n(new n(this.a, 0.0, this.ax))) break block7;
                                fb fb2 = new fb();
                                af.a(fb2);
                                super.ae();
                                bl2 = this.N();
                                if (n2 == 0) break block8;
                                if (!bl2) break block9;
                                this.c9.a(new C(this.e, this.at, this.A));
                                this.c9.a(new y(this.bu, this.bU, this.c4.h, this.c4.d));
                                x2 = x3 = this.aX();
                                if (n2 == 0) break block10;
                                if (x2 == this) break block11;
                                x2 = x3;
                            }
                            if (x2.a1()) {
                                this.c9.a(new x(x3));
                            }
                        }
                        if (n2 != 0) break block7;
                    }
                    this.R();
                    if (n2 == 0) break block12;
                    bl2 = cj.b.i.a(cT.class).i();
                }
                if (bl2) break block7;
                this.e = this.c0;
            }
            this.at = this.df;
        }
    }

    @Override
    public void a(net.minecraft.N.B b10) {
        this.c2.a(new O(b10));
    }

    public void a(net.minecraft.az.k k2) {
        block3: {
            net.minecraft.az.k k3;
            i i2;
            block2: {
                int n2 = net.minecraft.U.B.aL();
                i2 = this.cS;
                k3 = k2;
                if (n2 == 0) break block2;
                if (!i2.a(k3)) break block3;
                i2 = this.cS;
                k3 = k2;
            }
            i2.c(k3);
            this.c9.a(new o(k2));
        }
    }

    @Override
    public void a(j j2) {
        this.c2.a(new net.minecraft.client.I.r(j2));
    }

    public void l(int n2) {
        this.cY = n2;
    }

    @Override
    public boolean a(int n2, String string) {
        int n3 = net.minecraft.U.B.aL();
        int n4 = n2;
        if (n3 != 0) {
            n4 = n4 <= this.b() ? 1 : 0;
        }
        return n4 != 0;
    }

    public int b() {
        return this.cY;
    }

    @Override
    public void n() {
        this.c9.a(new s(net.minecraft.d.J.PERFORM_RESPAWN));
    }

    public c(Q q2, z z2, net.minecraft.client.o.j j2, g g10, i i2) {
        super(z2, j2.d());
        this.cY = 0;
        this.cP = true;
        this.c9 = j2;
        this.cM = g10;
        this.cS = i2;
        this.c2 = q2;
        this.p = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void aZ() {
        block6: {
            v0 = net.minecraft.U.B.aL();
            super.aZ();
            var1_1 = v0;
            this.cJ = false;
            v1 = this.as();
            if (var1_1 != 0) {
                if (v1 instanceof net.minecraft.J.o == false) return;
                v1 = this.as();
            }
            var2_2 = (net.minecraft.J.o)v1;
            var2_2.a(this.c4.f, this.c4.b, this.c4.g, this.c4.c);
            v2 = this.c4.f;
            if (var1_1 == 0) break block6;
            if (v2) ** GOTO lbl-1000
            v2 = this.c4.b;
            if (var1_1 == 0) break block6;
            if (v2) ** GOTO lbl-1000
            v2 = this.c4.g;
            if (var1_1 != 0) {
                if (!v2) {
                    v2 = this.c4.c;
                    if (var1_1 != 0) {
                        ** if (!v2) goto lbl-1000
                    } else {
                        ** GOTO lbl25
                    }
                } else {
                    ** GOTO lbl24
                }
            }
            break block6;
lbl24:
            // 2 sources

            ** GOTO lbl-1000
lbl25:
            // 2 sources

            break block6;
lbl-1000:
            // 4 sources

            {
                v2 = true;
                ** GOTO lbl29
            }
lbl-1000:
            // 1 sources

            {
                v2 = false;
            }
        }
        this.cJ |= v2;
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block13: {
            c c10;
            block15: {
                int n2;
                block14: {
                    int n3;
                    block12: {
                        block8: {
                            block9: {
                                block10: {
                                    int n4;
                                    block11: {
                                        int n5 = net.minecraft.U.B.ah();
                                        super.a(r2);
                                        n3 = n5;
                                        n2 = bd.equals(r2);
                                        if (n3 != 0) break block8;
                                        if (n2 == 0) break block9;
                                        int n6 = (Byte)this.ap.b(bd) & 1;
                                        if (n3 == 0) {
                                            n6 = n6 > 0 ? 1 : 0;
                                        }
                                        n4 = n6;
                                        a3 a32 = ((Byte)this.ap.b(bd) & 2) > 0 ? net.minecraft.ar.a3.OFF_HAND : net.minecraft.ar.a3.MAIN_HAND;
                                        n2 = n4;
                                        if (n3 != 0) break block10;
                                        if (n2 == 0) break block11;
                                        n2 = this.c_ ? 1 : 0;
                                        if (n3 != 0) break block10;
                                        if (n2 != 0) break block11;
                                        this.a(a32);
                                        if (n3 == 0) break block9;
                                    }
                                    n2 = n4;
                                }
                                if (n3 != 0) break block8;
                                if (n2 != 0) break block9;
                                n2 = this.c_ ? 1 : 0;
                                if (n3 != 0) break block8;
                                if (n2 != 0) {
                                    this.aJ();
                                }
                            }
                            n2 = ae.equals(r2);
                        }
                        if (n3 != 0) break block12;
                        if (n2 == 0) break block13;
                        n2 = this.aK();
                    }
                    if (n3 != 0) break block14;
                    if (n2 == 0) break block13;
                    c10 = this;
                    if (n3 != 0) break block15;
                    n2 = c10.de;
                }
                if (n2 != 0) break block13;
                c10 = this;
            }
            c10.c2.p().c(new net.minecraft.client.e.u(this));
        }
    }

    @Override
    protected void b(G g10, float f10) {
        block3: {
            c c10;
            block2: {
                int n2 = net.minecraft.U.B.ah();
                c10 = this;
                if (n2 != 0) break block2;
                if (c10.a(g10)) break block3;
                c10 = this;
            }
            c10.f(this.V() - f10);
        }
    }

    @Override
    public void a(net.minecraft.l.d d10, int n2) {
        block2: {
            net.minecraft.l.d d11;
            block1: {
                int n3 = net.minecraft.U.B.aL();
                d11 = d10;
                if (n3 == 0) break block1;
                if (d11 == null) break block2;
                d11 = d10;
            }
            if (d11.d) {
                super.a(d10, n2);
            }
        }
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public l b(float f10) {
        return c.b(this.at, this.e);
    }

    @Override
    public void a(byte n2) {
        block2: {
            block1: {
                int n3;
                int n4;
                int n5;
                block0: {
                    n5 = net.minecraft.U.B.aL();
                    n4 = n2;
                    n3 = 24;
                    if (n5 == 0) break block0;
                    if (n4 < n3) break block1;
                    n4 = n2;
                    n3 = 28;
                }
                if (n4 > n3) break block1;
                this.l(n2 - 24);
                if (n5 != 0) break block2;
            }
            super.a((byte)n2);
        }
    }

    @Override
    public void a(a3 a32) {
        block3: {
            block4: {
                c c10;
                boolean bl2;
                block2: {
                    net.minecraft.w.d d10 = this.c(a32);
                    int n2 = net.minecraft.U.B.aL();
                    bl2 = d10.G();
                    if (n2 == 0) break block2;
                    if (bl2) break block3;
                    c10 = this;
                    if (n2 == 0) break block4;
                    bl2 = c10.aq();
                }
                if (bl2) break block3;
                super.a(a32);
                this.c_ = true;
                c10 = this;
            }
            c10.cR = a32;
        }
    }

    public void c() {
        this.c9.a(new net.minecraft.d.D(this, net.minecraft.d.K.OPEN_INVENTORY));
    }

    @Override
    public void a(k k2) {
        this.c2.n.f().a(k2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(D d10, net.minecraft.B.a a10) {
        this.c2.a(new net.minecraft.client.I.n(this.cB, a10, d10));
    }

    @Override
    public void b(a3 a32) {
        super.b(a32);
        this.c9.a(new H(a32));
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

    @Override
    public void aJ() {
        super.aJ();
        this.c_ = false;
    }

    @Override
    public void a(e e10) {
        this.c2.a(new ak(this.cB, e10, this.aG));
    }

    @Override
    public void a(net.minecraft.w.d d10, a3 a32) {
        block0: {
            net.minecraft.w.k k2 = d10.w();
            if (k2 != net.minecraft.u.h.a5) break block0;
            this.c2.a(new a6(this, d10, true));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean u() {
        int n2 = net.minecraft.U.B.ah();
        boolean bl2 = this.c2.s.av();
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.c2.s.aj();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void g(net.minecraft.U.x x2) {
        this.c2.au.a(x2, net.minecraft.ar.aH.CRIT_MAGIC);
    }

    public g a() {
        return this.cM;
    }

    protected void e() {
        this.c9.a(new net.minecraft.d.D(this, net.minecraft.d.K.START_RIDING_JUMP, h.d(this.U() * 100.0f)));
    }

    @Override
    public boolean a(G g10, float f10) {
        return false;
    }

    @Override
    public boolean aq() {
        return this.c_;
    }

    @Override
    public void g() {
        block3: {
            block2: {
                int n2 = net.minecraft.U.B.ah();
                super.g();
                int n3 = n2;
                c c10 = this;
                if (n3 != 0) break block2;
                if (!c10.z()) break block3;
                this.bu = net.minecraft.ar.a6.e;
                this.bU = net.minecraft.ar.a6.a;
                this.aL = this.c4.h;
                this.dd = this.cX;
                this.cL = this.da;
                this.da = (float)((double)this.da + (double)(this.at - this.da) * 0.5);
                c10 = this;
            }
            c10.cX = (float)((double)this.cX + (double)(this.e - this.cX) * 0.5);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(n n2) {
        int n3 = net.minecraft.U.B.ah();
        boolean bl2 = this.aG.d(n2).r();
        if (n3 == 0) {
            if (bl2) return false;
            bl2 = this.aG.d(n2.a()).r();
        }
        if (n3 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public void a(net.minecraft.U.c c10, double d10, double d11, double d12) {
        f9 f92 = new f9(d10, d11, d12);
        af.a(f92);
        double d13 = this.a;
        double d14 = this.ax;
        d10 = f92.a();
        d11 = f92.c();
        d12 = f92.b();
        super.a(c10, d10, d11, d12);
        this.b((float)(this.a - d13), (float)(this.ax - d14));
    }

    public void a(float f10, int n2, int n3) {
        this.b7 = f10;
        this.b8 = n2;
        this.b4 = n3;
    }

    public boolean w() {
        return this.cP;
    }

    public boolean D() {
        return this.cJ;
    }

    @Override
    @Nullable
    public net.minecraft.K.j b(@Nullable b b10) {
        block3: {
            block2: {
                int n2 = net.minecraft.U.B.ah();
                if (n2 != 0) break block2;
                if (b10 != net.minecraft.u.c.s) break block3;
                this.cO = 0.0f;
            }
            this.cK = 0.0f;
        }
        return super.b(b10);
    }

    public i G() {
        return this.cS;
    }

    public float U() {
        return this.cQ;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y() {
        net.minecraft.U.x x2 = this.as();
        int n2 = net.minecraft.U.B.aL();
        boolean bl2 = this.N();
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = x2 instanceof net.minecraft.U.t;
        }
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = ((net.minecraft.U.t)((Object)x2)).b();
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void a(k k2, boolean bl2) {
        block2: {
            block1: {
                int n2;
                block0: {
                    n2 = net.minecraft.U.B.aL();
                    if (n2 == 0) break block0;
                    if (!bl2) break block1;
                    this.c2.n.a(k2, false);
                }
                if (n2 != 0) break block2;
            }
            this.c2.n.f().a(k2);
        }
    }

    public void c(String string) {
        this.c3 = string;
    }

    public void j(float f10) {
        block10: {
            block4: {
                c c10;
                block5: {
                    int n2;
                    block9: {
                        block6: {
                            float f11;
                            block7: {
                                block8: {
                                    n2 = net.minecraft.U.B.ah();
                                    c10 = this;
                                    if (n2 != 0) break block4;
                                    if (!c10.db) break block5;
                                    f11 = this.V() - f10;
                                    if (n2 != 0) break block6;
                                    if (!(f11 <= 0.0f)) break block7;
                                    this.f(f10);
                                    if (n2 != 0) break block8;
                                    if (!(f11 < 0.0f)) break block9;
                                    this.Q = this.a7 / 2;
                                }
                                if (n2 == 0) break block9;
                            }
                            this.aP = f11;
                            this.f(this.V());
                            this.Q = this.a7;
                            this.b(net.minecraft.ar.G.B, f11);
                            this.bn = 10;
                        }
                        this.bc = this.bn;
                    }
                    if (n2 == 0) break block10;
                }
                this.f(f10);
                c10 = this;
            }
            c10.db = true;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void b(float var1_1, float var2_2) {
        block41: {
            block34: {
                block38: {
                    block37: {
                        block36: {
                            block35: {
                                var3_3 = net.minecraft.U.B.ah();
                                v0 = this.w();
                                if (var3_3 == 0) {
                                    if (v0 == 0) return;
                                    v0 = this.cT;
                                }
                                if (var3_3 == 0) {
                                    if (v0 > 0) return;
                                    v0 = this.A ? 1 : 0;
                                }
                                if (var3_3 == 0) {
                                    if (v0 == 0) return;
                                    v0 = this.a4() ? 1 : 0;
                                }
                                if (var3_3 != 0) break block35;
                                if (v0 != 0) return;
                                v1 = this;
                                if (var3_3 != 0) break block36;
                                v0 = v1.N() ? 1 : 0;
                            }
                            if (v0 != 0) return;
                            v1 = this;
                        }
                        var4_4 = v1.c4.b();
                        cfr_temp_0 = var4_4.j - 0.0f;
                        v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        if (var3_3 != 0) break block37;
                        if (v2 != false) break block38;
                        cfr_temp_1 = var4_4.h - 0.0f;
                        v2 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    if (v2 == false) return;
                }
                var5_5 = new l(this.a, this.m().b, this.ax);
                var6_6 = this.a + (double)var1_1;
                var8_7 = this.ax + (double)var2_2;
                var10_8 = new l(var6_6, this.m().b, var8_7);
                var11_9 = new l(var1_1, 0.0, var2_2);
                var12_10 = this.aa();
                v3 = var13_11 = (float)var11_9.c();
                if (var3_3 == 0) {
                    if (v3 <= 0.001f) {
                        var14_12 = var12_10 * var4_4.j;
                        var15_13 = var12_10 * var4_4.h;
                        var16_15 = h.g(this.e * 0.017453292f);
                        var17_17 = h.c(this.e * 0.017453292f);
                        var11_9 = new l(var14_12 * var17_17 - var15_13 * var16_15, var11_9.d, var15_13 * var17_17 + var14_12 * var16_15);
                        v3 = var13_11 = (float)var11_9.c();
                        if (var3_3 == 0) {
                            if (v3 <= 0.001f) {
                                return;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v3 = (float)h.h(var13_11);
                    }
                }
                var14_12 = v3;
                var15_14 = var11_9.a((double)var14_12);
                var16_16 = this.aG();
                var17_17 = (float)(var16_16.e * var15_14.e + var16_16.b * var15_14.b);
                if (!(var17_17 >= -0.15f)) return;
                var18_18 = new n(this.a, this.m().a, this.ax);
                v4 = var19_19 = this.aG.d(var18_18);
                if (var3_3 == 0) {
                    if (v4.d(this.aG, var18_18) != null) return;
                    var18_18 = var18_18.a();
                    v4 = this.aG.d(var18_18);
                }
                if ((var20_20 = v4).d(this.aG, var18_18) != null) return;
                var21_21 = 7.0f;
                var22_22 = 1.2f;
                if (this.c(net.minecraft.u.c.n)) {
                    var22_22 += (float)(this.a(net.minecraft.u.c.n).h() + 1) * 0.75f;
                }
                var23_23 = Math.max(var12_10 * 7.0f, 1.0f / var14_12);
                var24_24 = var10_8.c(var15_14.a((double)var23_23));
                var25_25 = this.ad;
                var26_26 = this.aD;
                var27_27 = new net.minecraft.k.k(var5_5, var24_24.c(0.0, var26_26, 0.0)).a((double)var25_25, 0.0, var25_25);
                var28_28 = var5_5.c(0.0, 0.5099999904632568, 0.0);
                var24_24 = var24_24.c(0.0, 0.5099999904632568, 0.0);
                var29_29 = var15_14.a(new l(0.0, 1.0, 0.0));
                var30_30 = var29_29.a((double)(var25_25 * 0.5f));
                var31_31 = var28_28.b(var30_30);
                var32_32 = var24_24.b(var30_30);
                var33_33 = var28_28.c(var30_30);
                var34_34 = var24_24.c(var30_30);
                var35_35 = this.aG.a((net.minecraft.U.x)this, var27_27);
                if (!var35_35.isEmpty()) {
                    // empty if block
                }
                var36_36 = 1.4E-45f;
                var37_37 = var35_35.iterator();
                block0: while (var37_37.hasNext()) {
                    block39: {
                        block40: {
                            v5 = var38_39 = var37_37.next();
                            if (var3_3 != 0) break block39;
                            v6 = (float)v5.a(var31_31, var32_32);
                            if (var3_3 != 0) break block34;
                            if (v6 != false) break block40;
                            v5 = var38_39;
                            if (var3_3 != 0) break block39;
                            if (!v5.a(var33_33, var34_34)) ** GOTO lbl125
                        }
                        var36_36 = (float)var38_39.a;
                        v5 = var38_39;
                    }
                    var39_40 = v5.e();
                    var40_41 = new n(var39_40);
                    var41_42 = 1;
                    while (!((float)var41_42 >= var22_22) || var3_3 != 0) {
                        var42_43 = var40_41.c(var41_42);
                        var43_44 = this.aG.d(var42_43);
                        v7 = var43_44.d(this.aG, var42_43);
                        if (var3_3 != 0) ** GOTO lbl108
                        if (v7 != null) {
                            v7 = var44_45;
lbl108:
                            // 2 sources

                            var36_36 = (float)v7.a + (float)var42_43.b();
                            cfr_temp_2 = (double)var36_36 - this.m().b - (double)var22_22;
                            v8 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                            if (var3_3 == 0) {
                                if (v8 > 0) {
                                    return;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v8 = var41_42;
                        }
                        if (v8 > 1) {
                            var18_18 = var18_18.a();
                            var45_46 = this.aG.d(var18_18);
                            if (var3_3 == 0) {
                                if (var45_46.d(this.aG, var18_18) != null) {
                                    return;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            ++var41_42;
                        }
                        if (var3_3 == 0) continue;
lbl125:
                        // 2 sources

                        if (var3_3 == 0) continue block0;
                    }
                    break block0;
                }
                v9 = var36_36;
                if (var3_3 != 0) break block41;
                cfr_temp_3 = v9 - 1.4E-45f;
                v6 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
            }
            if (v6 == false) return;
            v9 = (float)((double)var36_36 - this.m().b);
        }
        var37_38 = v9;
        cfr_temp_4 = var37_38 - 0.5f;
        v10 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
        if (var3_3 == 0) {
            if (v10 <= 0) return;
            v10 = var37_38 == var22_22 ? 0 : (var37_38 < var22_22 ? -1 : 1);
        }
        if (v10 > 0) return;
        this.cT = 1;
    }

    @Override
    public void l() {
        this.c9.a(new net.minecraft.d.c(this.cw));
    }

    @Override
    @Nullable
    public t c(boolean bl2) {
        r r2 = bl2 ? r.DROP_ALL_ITEMS : r.DROP_ITEM;
        this.c9.a(new F(r2, net.minecraft.k.n.o, net.minecraft.ar.aA.DOWN));
        return null;
    }

    public String x() {
        return this.c3;
    }

    protected boolean z() {
        return this.c2.Z() == this;
    }

    @Override
    public n f() {
        return new n(this.a + 0.5, this.aF + 0.5, this.ax + 0.5);
    }

    @Override
    public void aO() {
        super.aO();
        this.cJ = false;
    }
}

