/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.aV;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.G;
import net.minecraft.ag.R;
import net.minecraft.ag.av;
import net.minecraft.ag.n;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.F;
import net.minecraft.ak.U;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.a1;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.aw;
import net.minecraft.ak.i;
import net.minecraft.ak.y;
import net.minecraft.ar.a3;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.w.bl;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class V
extends R {
    private /* synthetic */ boolean cK;
    private /* synthetic */ float cN;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cL;
    private /* synthetic */ boolean cP;
    private /* synthetic */ float cS;
    private /* synthetic */ float cO;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cR;
    private static final /* synthetic */ net.minecraft.q.r<Float> cQ;
    private /* synthetic */ float cM;

    @Override
    public void a(byte by2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (by2 != 8) break block1;
                    this.cP = true;
                    this.cO = 0.0f;
                    this.cM = 0.0f;
                }
                if (arrstring != null) break block2;
            }
            super.a(by2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(net.minecraft.i.j var1_1, a3 var2_2) {
        block28: {
            block21: {
                block22: {
                    block23: {
                        block24: {
                            block26: {
                                block27: {
                                    block25: {
                                        block20: {
                                            var4_3 = var1_1.c(var2_2);
                                            var3_4 = net.minecraft.ag.A.b();
                                            v0 = this.U();
                                            if (var3_4 == null) break block20;
                                            if (v0 == 0) break block21;
                                            v0 = var4_3.G();
                                        }
                                        if (var3_4 == null) break block22;
                                        if (v0 != 0) ** GOTO lbl-1000
                                        v1 = var4_3.w();
                                        if (var3_4 == null) break block23;
                                        if (!(v1 instanceof net.minecraft.w.aw)) break block24;
                                        var5_5 = (net.minecraft.w.aw)var4_3.w();
                                        v2 = var5_5.a();
                                        if (var3_4 == null) break block25;
                                        if (!v2) break block26;
                                        cfr_temp_0 = this.ap.b(V.cQ).floatValue() - 20.0f;
                                        v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                    }
                                    if (var3_4 == null) break block27;
                                    if (v2 >= false) break block26;
                                    v2 = var1_1.cw.g;
                                }
                                if (var3_4 == null) return v2;
                                if (!v2) {
                                    var4_3.b(1);
                                }
                                this.i((float)var5_5.b(var4_3));
                                return true;
                            }
                            if (var3_4 != null) ** GOTO lbl-1000
                        }
                        v3 = var4_3;
                        if (var3_4 == null) ** GOTO lbl38
                        v1 = v3.w();
                    }
                    if (v1 == net.minecraft.u.h.aL) {
                        v3 = var4_3;
lbl38:
                        // 2 sources

                        v0 = v3.d();
                        if (var3_4 != null) {
                            var5_5 = bl.d(v0);
                            if (var5_5 != this.F()) {
                                this.a((bl)var5_5);
                                v4 = var1_1.cw.g;
                                if (var3_4 == null) return v4;
                                if (v4 != false) return true;
                                var4_3.b(1);
                                return true;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 5 sources

                    {
                        v0 = this.a((B)var1_1);
                    }
                }
                if (var3_4 == null) return (boolean)v0;
                if (v0 == 0) break block28;
                v0 = this.aG.C;
                if (var3_4 == null) return (boolean)v0;
                if (v0 != 0) break block28;
                v0 = this.a(var4_3) ? 1 : 0;
                if (var3_4 == null) return (boolean)v0;
                if (v0 != 0) break block28;
                v5 = this.D();
                if (var3_4 != null) {
                    v5 = v5 == false;
                }
                this.cH.a(v5);
                this.aL = false;
                this.b7.f();
                this.d((B)null);
                if (var3_4 != null) break block28;
            }
            if (var4_3.w() == net.minecraft.u.h.bh) {
                v0 = this.H();
                if (var3_4 == null) return (boolean)v0;
                if (v0 == 0) {
                    v6 = var1_1.cw.g;
                    if (var3_4 != null) {
                        if (!v6) {
                            var4_3.b(1);
                        }
                        v6 = this.aG.C;
                    }
                    if (var3_4 == null) return v6;
                    if (v6 != false) return true;
                    v7 = this;
                    if (var3_4 != null) {
                        if (v7.g.nextInt(3) == 0) {
                            this.b(var1_1);
                            this.b7.f();
                            this.d((B)null);
                            this.cH.a(true);
                            this.f(20.0f);
                            this.a(true);
                            this.aG.a((x)this, (byte)7);
                            if (var3_4 != null) return true;
                        }
                        this.a(false);
                        v7 = this;
                    }
                    v7.aG.a((x)this, (byte)6);
                    return true;
                }
            }
        }
        v0 = super.b(var1_1, var2_2);
        return (boolean)v0;
    }

    public void a(bl bl2) {
        this.ap.b(cL, bl2.a());
    }

    @Override
    public void a(r r2) {
        block3: {
            int n2;
            V v2;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.a(r2);
                String[] arrstring2 = arrstring;
                v2 = this;
                n2 = r2.f("Angry");
                if (arrstring2 == null) break block2;
                v2.u(n2 != 0);
                if (!r2.a("CollarColor", 99)) break block3;
                v2 = this;
                n2 = r2.r("CollarColor");
            }
            v2.a(bl.d(n2));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.i.j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.H();
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = super.a(j2);
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        boolean bl2;
        block10: {
            block9: {
                V v2;
                V v3;
                String[] arrstring;
                block8: {
                    arrstring = net.minecraft.ag.A.b();
                    x x2 = this;
                    if (arrstring != null) {
                        if (x2.a(g10)) {
                            return false;
                        }
                        x2 = g10.h();
                    }
                    v3 = x2;
                    v2 = this;
                    if (arrstring != null) {
                        if (v2.cH != null) {
                            this.cH.a(false);
                        }
                        v2 = v3;
                    }
                    if (arrstring == null) break block8;
                    if (v2 == null) break block9;
                    v2 = v3;
                }
                bl2 = v2 instanceof net.minecraft.i.j;
                if (arrstring == null) break block10;
                if (bl2) break block9;
                bl2 = v3 instanceof f;
                if (arrstring == null) break block10;
                if (!bl2) {
                    f10 = (f10 + 1.0f) / 2.0f;
                }
            }
            bl2 = super.a(g10, f10);
        }
        return bl2;
    }

    @Override
    public void d(@Nullable B b10) {
        block4: {
            V v2;
            block5: {
                String[] arrstring;
                block2: {
                    block3: {
                        arrstring = net.minecraft.ag.A.b();
                        v2 = this;
                        if (arrstring == null) break block2;
                        super.d(b10);
                        if (b10 != null) break block3;
                        this.u(false);
                        if (arrstring != null) break block4;
                    }
                    v2 = this;
                }
                if (arrstring == null) break block5;
                if (v2.U()) break block4;
                v2 = this;
            }
            v2.u(true);
        }
    }

    public boolean H() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = (Byte)this.ap.b(cI) & 2;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    protected void a(net.minecraft.k.n n2, K k2) {
        this.a(net.minecraft.u.E.gg, 0.15f, 1.0f);
    }

    public float c() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.H();
        if (arrstring != null) {
            if (bl2) {
                return 1.5393804f;
            }
            bl2 = this.U();
        }
        return bl2 ? (0.55f - (this.H() - this.ap.b(cQ).floatValue()) * 0.02f) * (float)Math.PI : 0.62831855f;
    }

    @Override
    public void E() {
        block7: {
            V v2;
            block9: {
                String[] arrstring;
                block8: {
                    B b10;
                    block6: {
                        boolean bl2;
                        block4: {
                            block5: {
                                String[] arrstring2 = net.minecraft.ag.A.b();
                                super.E();
                                arrstring = arrstring2;
                                bl2 = this.aG.C;
                                if (arrstring == null) break block4;
                                if (bl2) break block5;
                                bl2 = this.cK;
                                if (arrstring == null) break block4;
                                if (!bl2) break block5;
                                bl2 = this.cP;
                                if (arrstring == null) break block4;
                                if (bl2) break block5;
                                bl2 = this.w();
                                if (arrstring == null) break block4;
                                if (bl2) break block5;
                                bl2 = this.A;
                                if (arrstring == null) break block4;
                                if (bl2) {
                                    this.cP = true;
                                    this.cO = 0.0f;
                                    this.cM = 0.0f;
                                    this.aG.a((x)this, (byte)8);
                                }
                            }
                            b10 = this;
                            if (arrstring == null) break block6;
                            bl2 = b10.aG.C;
                        }
                        if (bl2) break block7;
                        v2 = this;
                        if (arrstring == null) break block8;
                        b10 = v2.J();
                    }
                    if (b10 != null) break block7;
                    v2 = this;
                }
                if (arrstring == null) break block9;
                if (!v2.H()) break block7;
                v2 = this;
            }
            v2.u(false);
        }
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.aj;
    }

    @Override
    public void ae() {
        block15: {
            float f10;
            String[] arrstring;
            block20: {
                int n2;
                block19: {
                    block18: {
                        block16: {
                            block17: {
                                block13: {
                                    block14: {
                                        block12: {
                                            block10: {
                                                V v2;
                                                block11: {
                                                    String[] arrstring2 = net.minecraft.ag.A.b();
                                                    super.ae();
                                                    arrstring = arrstring2;
                                                    this.cS = this.cN;
                                                    v2 = this;
                                                    if (arrstring == null) break block10;
                                                    if (!v2.b()) break block11;
                                                    this.cN += (1.0f - this.cN) * 0.4f;
                                                    if (arrstring != null) break block12;
                                                }
                                                v2 = this;
                                            }
                                            v2.cN += (0.0f - this.cN) * 0.4f;
                                        }
                                        n2 = this.ar();
                                        if (arrstring == null) break block13;
                                        if (n2 == 0) break block14;
                                        this.cK = true;
                                        this.cP = false;
                                        this.cO = 0.0f;
                                        this.cM = 0.0f;
                                        if (arrstring != null) break block15;
                                    }
                                    n2 = this.cK;
                                }
                                if (arrstring == null) break block16;
                                if (n2 != 0) break block17;
                                n2 = this.cP;
                                if (arrstring == null) break block16;
                                if (n2 == 0) break block15;
                            }
                            n2 = this.cP;
                        }
                        if (arrstring == null) break block18;
                        if (n2 == 0) break block15;
                        float f11 = this.cO - 0.0f;
                        n2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    }
                    if (arrstring != null) {
                        if (n2 == 0) {
                            this.a(net.minecraft.u.E.fp, this.x(), (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
                        }
                        this.cM = this.cO;
                        this.cO += 0.05f;
                        float f12 = this.cM - 2.0f;
                        n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (arrstring == null) break block19;
                    if (n2 >= 0) {
                        this.cK = false;
                        this.cP = false;
                        this.cM = 0.0f;
                        this.cO = 0.0f;
                    }
                    f10 = this.cO;
                    if (arrstring == null) break block20;
                    float f13 = f10 - 0.4f;
                    n2 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (n2 <= 0) break block15;
                f10 = (float)this.m().b;
            }
            float f14 = f10;
            int n3 = (int)(h.g((this.cO - 0.4f) * (float)Math.PI) * 7.0f);
            for (int i2 = 0; i2 < n3; ++i2) {
                float f15 = (this.g.nextFloat() * 2.0f - 1.0f) * this.ad * 0.5f;
                float f16 = (this.g.nextFloat() * 2.0f - 1.0f) * this.ad * 0.5f;
                this.aG.a(net.minecraft.ar.aH.WATER_SPLASH, this.a + (double)f15, (double)(f14 + 0.8f), this.ax + (double)f16, this.aq, this.G, this.d, new int[0]);
                if (arrstring != null) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void s(boolean bl2) {
        block4: {
            V v2;
            block2: {
                block3: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    v2 = this;
                    if (arrstring == null) break block2;
                    super.s(bl2);
                    if (!bl2) break block3;
                    this.a(net.minecraft.U.M.f).a(20.0);
                    if (arrstring != null) break block4;
                }
                v2 = this;
            }
            v2.a(net.minecraft.U.M.f).a(8.0);
        }
        this.a(net.minecraft.U.M.g).a(4.0);
    }

    public bl F() {
        return bl.d(this.ap.b(cL) & 0xF);
    }

    public float b(float f10) {
        return (this.cS + (this.cN - this.cS) * f10) * 0.15f * (float)Math.PI;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(C c10) {
        C c11;
        String[] arrstring;
        block12: {
            boolean bl2;
            block11: {
                arrstring = net.minecraft.ag.A.b();
                if (c10 == this) {
                    return false;
                }
                bl2 = this.U();
                if (arrstring == null) break block11;
                if (!bl2) {
                    return false;
                }
                c11 = c10;
                if (arrstring == null) break block12;
                bl2 = c11 instanceof V;
            }
            if (!bl2) {
                return false;
            }
            c11 = c10;
        }
        V v2 = (V)c11;
        boolean bl3 = v2.U();
        if (arrstring != null) {
            if (!bl3) {
                return false;
            }
            bl3 = v2.D();
        }
        if (arrstring != null) {
            if (bl3) {
                return false;
            }
            bl3 = this.z();
        }
        if (arrstring != null) {
            if (!bl3) return false;
            bl3 = v2.z();
        }
        if (arrstring == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public int U() {
        return 8;
    }

    static {
        cQ = net.minecraft.q.m.a(V.class, net.minecraft.q.h.k);
        cR = net.minecraft.q.m.a(V.class, net.minecraft.q.h.g);
        cL = net.minecraft.q.m.a(V.class, net.minecraft.q.h.n);
    }

    static Random a(V v2) {
        return v2.g;
    }

    public boolean E() {
        return this.cK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.w.d d10) {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = d10.w() instanceof net.minecraft.w.aw;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = ((net.minecraft.w.aw)d10.w()).a();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public float a(float f10) {
        return 0.75f + (this.cM + (this.cO - this.cM) * f10) / 2.0f * 0.25f;
    }

    @Override
    public V a(E e10) {
        V v2;
        block3: {
            block2: {
                v2 = new V(this.aG);
                UUID uUID = this.b();
                String[] arrstring = net.minecraft.ag.A.b();
                if (arrstring == null) break block2;
                if (uUID == null) break block3;
                v2.b(uUID);
            }
            v2.s(true);
        }
        return v2;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.A;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("Angry", this.H());
        r2.a("CollarColor", (byte)this.F().a());
    }

    public float b(float f10, float f11) {
        float f12;
        float f13;
        block7: {
            float f14;
            block6: {
                float f15;
                block4: {
                    String[] arrstring;
                    block5: {
                        f14 = (this.cM + (this.cO - this.cM) * f10 + f11) / 1.8f;
                        arrstring = net.minecraft.ag.A.b();
                        float f16 = f14 - 0.0f;
                        f15 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        if (arrstring == null) break block4;
                        if (f15 >= 0) break block5;
                        f14 = 0.0f;
                        if (arrstring != null) break block6;
                    }
                    f13 = f14;
                    f12 = 1.0f;
                    if (arrstring == null) break block7;
                    float f17 = f13 - f12;
                    f15 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                }
                if (f15 > 0) {
                    f14 = 1.0f;
                }
            }
            f13 = h.g(f14 * (float)Math.PI) * h.g(f14 * (float)Math.PI * 11.0f) * 0.15f;
            f12 = (float)Math.PI;
        }
        return f13 * f12;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(B var1_1, B var2_2) {
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

    public void u(boolean bl2) {
        block2: {
            byte by2;
            block1: {
                String[] arrstring;
                block0: {
                    by2 = (Byte)this.ap.b(cI);
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cI, (byte)(by2 | 2));
                }
                if (arrstring != null) break block2;
            }
            this.ap.b(cI, (byte)(by2 & 0xFFFFFFFD));
        }
    }

    @Override
    public float l() {
        return this.aD * 0.8f;
    }

    @Override
    protected void H() {
        block0: {
            String[] arrstring = net.minecraft.ag.A.b();
            this.cH = new U(this);
            this.b5.a(1, new W(this));
            this.b5.a(2, this.cH);
            this.b5.a(3, new n(this, this, G.class, 24.0f, 1.5, 1.5));
            String[] arrstring2 = arrstring;
            this.b5.a(4, new net.minecraft.ak.C(this, 0.4f));
            this.b5.a(5, new i(this, 1.0, true));
            this.b5.a(6, new y(this, 1.0, 10.0f, 2.0f));
            this.b5.a(7, new net.minecraft.ak.G(this, 1.0));
            this.b5.a(8, new aA(this, 1.0));
            this.b5.a(9, new net.minecraft.ak.n(this, 8.0f));
            this.b5.a(10, new aa(this, net.minecraft.i.j.class, 8.0f));
            this.b5.a(10, new F(this));
            this.ci.a(1, new aw(this));
            this.ci.a(2, new net.minecraft.ak.av(this));
            this.ci.a(3, new Z((D)this, true, new Class[0]));
            this.ci.a(4, new a1<x>(this, C.class, false, new av(this)));
            this.ci.a(5, new au<aV>((D)this, aV.class, false));
            if (!net.minecraft.k.m.c()) break block0;
            net.minecraft.ag.A.b(new String[5]);
        }
    }

    @Override
    protected float x() {
        return 0.4f;
    }

    public V(z z2) {
        super(z2);
        this.c(0.6f, 0.85f);
        this.s(false);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cQ, Float.valueOf(this.V()));
        this.ap.c(cR, false);
        this.ap.c(cL, bl.RED.a());
    }

    @Override
    protected void D() {
        block4: {
            V v2;
            block2: {
                block3: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.D();
                    String[] arrstring2 = arrstring;
                    this.a(net.minecraft.U.M.d).a(0.3f);
                    v2 = this;
                    if (arrstring2 == null) break block2;
                    if (!v2.U()) break block3;
                    this.a(net.minecraft.U.M.f).a(20.0);
                    if (arrstring2 != null) break block4;
                }
                v2 = this;
            }
            v2.a(net.minecraft.U.M.f).a(8.0);
        }
        this.ao().b(net.minecraft.U.M.g).a(2.0);
    }

    @Override
    public boolean j(x x2) {
        boolean bl2 = x2.a(net.minecraft.ar.G.a(this), (float)((int)this.a(net.minecraft.U.M.g).d()));
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl3 = bl2;
        if (arrstring != null) {
            if (bl3) {
                this.a((B)this, x2);
            }
            bl3 = bl2;
        }
        return bl3;
    }

    @Override
    protected void h() {
        this.ap.b(cQ, Float.valueOf(this.V()));
    }

    public void t(boolean bl2) {
        this.ap.b(cR, bl2);
    }

    @Override
    protected d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.g8;
    }

    public boolean b() {
        return this.ap.b(cR);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected d q() {
        d d10;
        block8: {
            int n2;
            block7: {
                String[] arrstring = net.minecraft.ag.A.b();
                n2 = this.H();
                if (arrstring != null) {
                    if (n2 != 0) {
                        return net.minecraft.u.E.eY;
                    }
                    n2 = this.g.nextInt(3);
                }
                if (arrstring != null) {
                    if (n2 != 0) return net.minecraft.u.E.bh;
                    n2 = this.U() ? 1 : 0;
                }
                if (arrstring == null) break block7;
                if (n2 == 0) break block8;
                float f10 = this.ap.b(cQ).floatValue() - 10.0f;
                n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
            }
            if (n2 < 0) {
                d10 = net.minecraft.u.E.d4;
                return d10;
            }
        }
        d10 = net.minecraft.u.E.bn;
        return d10;
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, V.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int j() {
        String[] arrstring = net.minecraft.ag.A.b();
        V v2 = this;
        if (arrstring != null) {
            if (v2.D()) {
                return 20;
            }
            v2 = this;
        }
        int n2 = super.j();
        return n2;
    }
}

