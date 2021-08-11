/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import java.awt.Color;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.N.r;
import net.minecraft.U.B;
import net.minecraft.W.D;
import net.minecraft.W.H;
import net.minecraft.W.K;
import net.minecraft.W.c5;
import net.minecraft.W.cM;
import net.minecraft.W.cZ;
import net.minecraft.W.d1;
import net.minecraft.W.d2;
import net.minecraft.W.d3;
import net.minecraft.W.dG;
import net.minecraft.W.dO;
import net.minecraft.W.dZ;
import net.minecraft.W.da;
import net.minecraft.W.dg;
import net.minecraft.W.dq;
import net.minecraft.ah.z;
import net.minecraft.ar.Z;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.D.x;
import net.minecraft.client.F.e;
import net.minecraft.client.Q;
import net.minecraft.client.a.C;
import net.minecraft.client.a.E;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.J;
import net.minecraft.client.a.N;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aD;
import net.minecraft.client.a.aE;
import net.minecraft.client.a.a_;
import net.minecraft.client.a.ad;
import net.minecraft.client.a.aq;
import net.minecraft.client.a.m;
import net.minecraft.client.a.o;
import net.minecraft.client.a.s;
import net.minecraft.client.a.t;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.j.j;
import net.minecraft.client.j.u;
import net.minecraft.client.x.L;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.d;
import net.minecraft.client.x.n;
import net.minecraft.client.x.y;
import net.minecraft.client.y.b;
import net.minecraft.k.h;
import net.minecraft.u.g;
import net.minecraft.w.aY;
import net.minecraft.w.bl;
import net.minecraft.w.k;

public class p
implements x {
    private final /* synthetic */ net.minecraft.client.z.g a;
    public /* synthetic */ float g;
    private static final /* synthetic */ net.minecraft.ar.v i;
    public /* synthetic */ net.minecraft.client.x.x e;
    private /* synthetic */ net.minecraft.ar.v c;
    private final /* synthetic */ E d;
    private final /* synthetic */ u b;
    private /* synthetic */ boolean h;
    private final /* synthetic */ boolean f = true;

    public p(u u2, net.minecraft.client.x.x x2, net.minecraft.client.z.g g10) {
        block4: {
            block2: {
                p p2;
                block3: {
                    String string = I.j();
                    String string2 = string;
                    this.f = true;
                    this.c = null;
                    this.h = false;
                    this.e = null;
                    this.b = u2;
                    p2 = this;
                    if (string2 != null) break block2;
                    p2.e = x2;
                    if (!cq.dG.b()) break block3;
                    this.d = (E)cq.a(cq.dG, x2);
                    if (string2 == null) break block4;
                }
                p2 = this;
            }
            p2.d = new E(x2);
        }
        this.a();
        this.a = g10;
    }

    public void b(net.minecraft.w.d d10, int n2, int n3) {
        this.a(d10, n2, n3, this.a(d10, null, null));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.w.d d10) {
        Y y2 = this.d.a(d10);
        String string = I.j();
        Y y3 = y2;
        if (string == null) {
            if (y3 == null) return false;
            y3 = y2;
        }
        boolean bl2 = y3.d();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(a5 var1_1, net.minecraft.w.d var2_2, int var3_3, int var4_4, @Nullable String var5_5) {
        block24: {
            block30: {
                block29: {
                    block27: {
                        block28: {
                            block25: {
                                block26: {
                                    block23: {
                                        block22: {
                                            block21: {
                                                var6_6 = I.j();
                                                v0 = var2_2.G();
                                                if (var6_6 == null) {
                                                    if (v0 != 0) return;
                                                    v0 = var2_2.t();
                                                }
                                                if (v0 != 1) break block21;
                                                v1 = var5_5;
                                                if (var6_6 != null) break block22;
                                                if (v1 == null) break block23;
                                            }
                                            v1 = var5_5;
                                        }
                                        if (var6_6 == null) {
                                            v1 = v1 == null ? String.valueOf(var2_2.t()) : var5_5;
                                        }
                                        var7_7 = v1;
                                        v.y();
                                        v.n();
                                        v.f();
                                        var1_1.c((String)var7_7, var3_3 + 19 - 2 - var1_1.e((String)var7_7), var4_4 + 6 + 3, 0xFFFFFF);
                                        v.j();
                                        v.t();
                                        v.a();
                                    }
                                    if (!ea.a(var2_2)) break block24;
                                    v.y();
                                    v.n();
                                    v.L();
                                    v.v();
                                    v.f();
                                    var7_7 = W.c();
                                    var8_8 = var7_7.b();
                                    var9_10 = var2_2.u();
                                    var10_12 = var2_2.E();
                                    var11_14 = Math.max(0.0f, (var10_12 - var9_10) / var10_12);
                                    var12_15 = Math.round(13.0f - var9_10 * 13.0f / var10_12);
                                    var13_16 = net.minecraft.k.h.b(var11_14 / 3.0f, 1.0f, 1.0f);
                                    v2 = cq.aK.b();
                                    if (var6_6 != null) break block25;
                                    if (v2 == 0) break block26;
                                    v2 = cq.Q.b();
                                    if (var6_6 != null) break block25;
                                    if (v2 != 0) {
                                        var14_17 = cq.f(var2_2.w(), cq.aK, new Object[]{var2_2});
                                        var16_18 = cq.c(var2_2.w(), cq.Q, new Object[]{var2_2});
                                        var12_15 = Math.round(13.0f - (float)var14_17 * 13.0f);
                                        var13_16 = var16_18;
                                    }
                                }
                                v2 = fU.g();
                            }
                            if (var6_6 == null) {
                                if (v2 != 0) {
                                    var13_16 = fa.a(var11_14, var13_16);
                                }
                                v2 = cq.aK.b();
                            }
                            if (var6_6 != null) break block27;
                            if (v2 == 0) break block28;
                            v2 = cq.Q.b();
                            if (var6_6 != null) break block27;
                            if (v2 != 0) {
                                var14_17 = cq.f(var2_2.w(), cq.aK, new Object[]{var2_2});
                                var16_18 = cq.c(var2_2.w(), cq.Q, new Object[]{var2_2});
                                var12_15 = Math.round(13.0f - (float)var14_17 * 13.0f);
                                var13_16 = var16_18;
                            }
                        }
                        v2 = fU.g();
                    }
                    if (var6_6 != null) break block29;
                    if (v2 == 0) break block30;
                    v2 = fa.a(var11_14, var13_16);
                }
                var13_16 = v2 ? 1 : 0;
            }
            this.a(var8_8, var3_3 + 2, var4_4 + 13, 13, 2, 0, 0, 0, 255);
            this.a(var8_8, var3_3 + 2, var4_4 + 13, var12_15, 1, var13_16 >> 16 & 255, var13_16 >> 8 & 255, var13_16 & 255, 255);
            v.a();
            v.e();
            v.x();
            v.j();
            v.t();
        }
        v3 = var7_7 = Q.P().s;
        if (var6_6 != null) ** GOTO lbl87
        if (v3 == null) {
            v4 = 0.0f;
        } else {
            v3 = var7_7;
lbl87:
            // 2 sources

            v4 = var8_9 = v3.o().a(var2_2.w(), Q.P().aD());
        }
        if (var6_6 == null) {
            if (!(var8_9 > 0.0f)) return;
            v.y();
            v.n();
            v.L();
        }
        var9_11 = W.c();
        var10_13 = var9_11.b();
        this.a(var10_13, var3_3, var4_4 + net.minecraft.k.h.d(16.0f * (1.0f - var8_9)), 16, net.minecraft.k.h.f(16.0f * var8_9), 255, 255, 255, 127);
        v.x();
        v.j();
        v.t();
    }

    protected void a(net.minecraft.w.d d10, int n2, int n3, Y y2) {
        block4: {
            block3: {
                Object object;
                String string;
                block2: {
                    this.h = true;
                    String string2 = I.j();
                    v.M();
                    this.b.b(j.x);
                    string = string2;
                    this.b.a(j.x).a(false, false);
                    v.q();
                    v.e();
                    v.a(516, 0.1f);
                    v.a();
                    v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                    v.b(1.0f, 1.0f, 1.0f, 1.0f);
                    this.a(n2, n3, y2.d());
                    object = cq.dH;
                    if (string != null) break block2;
                    if (!((ak)object).b()) break block3;
                    object = cq.d(cq.dH, new Object[]{y2, net.minecraft.client.x.d.GUI, false});
                }
                y2 = (Y)object;
                if (string == null) break block4;
            }
            y2.c().b(net.minecraft.client.x.d.GUI);
        }
        this.a(d10, y2);
        v.v();
        v.u();
        v.y();
        v.B();
        this.b.b(j.x);
        this.b.a(j.x).b();
        this.h = false;
    }

    public void a(net.minecraft.w.d d10, d d11) {
        if (!d10.G()) {
            Y y2 = this.a(d10, null, null);
            this.a(d10, y2, d11, false);
        }
    }

    @Override
    public void b(net.minecraft.client.D.t t2) {
        this.d.b();
    }

    protected void a(K k2, int n2, String string) {
        this.a(k.b(k2), n2, string);
    }

    public void a(Y y2, int n2) {
        this.a(y2, n2, net.minecraft.w.d.m);
    }

    private boolean a(L l2) {
        float f10;
        String string = I.j();
        float f11 = l2.d.x - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (string == null) {
            f12 = f12 < 0 ? 1.0f : 0.0f;
        }
        float f13 = (f10 = l2.d.y - 0.0f) == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (string == null) {
            f13 = f13 < 0 ? 1.0f : 0.0f;
        }
        int n2 = f12 ^ f13;
        float f14 = l2.d.z - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (string == null) {
            f15 = f15 < 0 ? 1.0f : 0.0f;
        }
        return (n2 ^ f15) != 0;
    }

    public void a(net.minecraft.w.d d10, Y y2) {
        block6: {
            block9: {
                p p2;
                block13: {
                    block12: {
                        boolean bl2;
                        block11: {
                            String string;
                            block10: {
                                block7: {
                                    block8: {
                                        block5: {
                                            string = I.j();
                                            bl2 = d10.G();
                                            if (string != null) break block5;
                                            if (bl2) break block6;
                                            v.M();
                                            v.b(-0.5f, -0.5f, -0.5f);
                                            bl2 = y2.a();
                                        }
                                        if (string != null) break block7;
                                        if (!bl2) break block8;
                                        v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                        v.q();
                                        net.minecraft.client.F.e.d.a(d10);
                                        if (string == null) break block9;
                                    }
                                    bl2 = fU.aH();
                                }
                                if (string == null) {
                                    if (bl2) {
                                        y2 = b1.a(d10, y2, this.c, false);
                                        this.c = null;
                                    }
                                    this.a(y2, d10);
                                    bl2 = d10.m();
                                }
                                if (string != null) break block10;
                                if (!bl2) break block9;
                                bl2 = fU.aH();
                            }
                            if (string != null) break block11;
                            if (!bl2) break block12;
                            p2 = this;
                            if (string != null) break block13;
                            bl2 = b1.a(p2, d10, y2);
                        }
                        if (bl2) break block9;
                    }
                    p2 = this;
                }
                p2.a(y2);
            }
            v.B();
        }
    }

    private void a(Y y2) {
        block34: {
            boolean bl2;
            block33: {
                String string;
                block22: {
                    block23: {
                        block32: {
                            boolean bl3;
                            String string2;
                            block31: {
                                float f10;
                                block26: {
                                    block30: {
                                        boolean bl4;
                                        block29: {
                                            int n2;
                                            block27: {
                                                block28: {
                                                    block24: {
                                                        block25: {
                                                            block20: {
                                                                block21: {
                                                                    c6 c62 = (c6)cj.b.i.a(c6.class);
                                                                    string = I.j();
                                                                    n2 = fU.aH();
                                                                    if (string != null) break block20;
                                                                    if (n2 == 0) break block21;
                                                                    bl2 = b1.f();
                                                                    if (string != null) break block22;
                                                                    if (!bl2) break block23;
                                                                }
                                                                n2 = fU.ag();
                                                            }
                                                            if (string != null) break block24;
                                                            if (n2 == 0) break block25;
                                                            n2 = cS.dn;
                                                            if (string != null) break block24;
                                                            if (n2 != 0) break block26;
                                                        }
                                                        v.a(false);
                                                        v.o(514);
                                                        v.y();
                                                        v.a(o.SRC_COLOR, G.ONE);
                                                        this.b.b(i);
                                                        n2 = fU.ag() ? 1 : 0;
                                                    }
                                                    if (string != null) break block27;
                                                    if (n2 == 0) break block28;
                                                    n2 = this.h ? 1 : 0;
                                                    if (string != null) break block27;
                                                    if (n2 == 0) {
                                                        as.p();
                                                    }
                                                }
                                                n2 = 5890;
                                            }
                                            v.q(n2);
                                            v.M();
                                            v.d(8.0f, 8.0f, 8.0f);
                                            f10 = (float)(Q.aj() % 3000L) / 3000.0f / 8.0f;
                                            v.b(f10, 0.0f, 0.0f);
                                            v.a(-50.0f, 0.0f, 0.0f, 1.0f);
                                            string2 = cj.b.f.a("Enchant color").m();
                                            bl4 = cj.b.i.a(c6.class).i();
                                            if (string != null) break block29;
                                            if (!bl4) break block30;
                                            bl4 = string2.equalsIgnoreCase("Rgb");
                                        }
                                        if (string == null) {
                                            if (bl4) {
                                                this.a(y2, Color.getHSBColor(c6.k / 255.0f, 1.0f, 1.0f).getRGB());
                                            }
                                            bl4 = string2.equalsIgnoreCase("Custom");
                                        }
                                        if (bl4) {
                                            this.a(y2, Color.WHITE.getRGB());
                                        }
                                    }
                                    this.a(y2, -8372020);
                                }
                                v.B();
                                v.M();
                                v.d(8.0f, 8.0f, 8.0f);
                                f10 = (float)(Q.aj() % 4873L) / 4873.0f / 8.0f;
                                v.b(-f10, 0.0f, 0.0f);
                                v.a(10.0f, 0.0f, 0.0f, 1.0f);
                                string2 = cj.b.f.a("Enchant color").m();
                                bl3 = cj.b.i.a(c6.class).i();
                                if (string != null) break block31;
                                if (!bl3) break block32;
                                bl3 = string2.equalsIgnoreCase("Rgb");
                            }
                            if (string == null) {
                                if (bl3) {
                                    this.a(y2, Color.getHSBColor(c6.k / 255.0f, 1.0f, 1.0f).getRGB());
                                }
                                bl3 = string2.equalsIgnoreCase("Custom");
                            }
                            if (bl3) {
                                this.a(y2, Color.WHITE.getRGB());
                            }
                        }
                        this.a(y2, -8372020);
                    }
                    v.B();
                    v.q(5888);
                    v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                    v.j();
                    v.o(515);
                    v.a(true);
                    this.b.b(j.x);
                    bl2 = fU.ag();
                }
                if (string != null) break block33;
                if (!bl2) break block34;
                bl2 = this.h;
            }
            if (!bl2) {
                as.j();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void a(I var1_1, List<P> var2_2, int var3_3, net.minecraft.w.d var4_4) {
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

    public E b() {
        return this.d;
    }

    /*
     * Exception decompiling
     */
    private void a(Y var1_1, int var2_2, net.minecraft.w.d var3_3) {
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

    static {
        i = new net.minecraft.ar.v("textures/misc/enchanted_item_glint.png");
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private void a(I i2, P p2, int n2) {
        block9: {
            block8: {
                String string;
                block7: {
                    block6: {
                        I i3;
                        block4: {
                            block5: {
                                string = I.j();
                                i3 = i2;
                                if (string != null) break block4;
                                if (!i3.c()) break block5;
                                i2.a(p2.f());
                                i2.b(p2.p());
                                if (string == null) break block6;
                            }
                            i3 = i2;
                        }
                        i3.a(p2.d());
                    }
                    Object object = cq.c2;
                    if (string != null) break block7;
                    if (!((ak)object).b()) break block8;
                    object = cq.d(cq.c2, i2, p2, n2);
                }
                if (string == null) break block9;
            }
            i2.c(n2);
        }
        this.a(i2, p2);
    }

    public void a(@Nullable B b10, net.minecraft.w.d d10, int n2, int n3) {
        String string = I.j();
        if (string == null) {
            if (!d10.G()) {
                this.g += 50.0f;
                try {
                    this.a(d10, n2, n3, this.a(d10, null, b10));
                }
                catch (Throwable throwable) {
                    f f10 = net.minecraft.c.f.a(throwable, "Rendering item");
                    l l2 = f10.a("Item being rendered");
                    l2.a("Item Type", new aE(this, d10));
                    l2.a("Item Aux", new aq(this, d10));
                    l2.a("Item NBT", new C(this, d10));
                    l2.a("Item Foil", new a_(this, d10));
                    throw new Z(f10);
                }
            }
        } else {
            this.g -= 50.0f;
        }
    }

    public Y a(net.minecraft.w.d d10, @Nullable z z2, @Nullable B b10) {
        Y y2;
        block22: {
            k k2;
            Object object;
            block21: {
                k k3;
                String string;
                block20: {
                    Object object2;
                    block19: {
                        boolean bl2;
                        block14: {
                            block15: {
                                Object object3;
                                block18: {
                                    block17: {
                                        k k4;
                                        block16: {
                                            y2 = this.d.a(d10);
                                            string = I.j();
                                            k3 = d10.w();
                                            bl2 = fU.aH();
                                            if (string != null) break block14;
                                            if (!bl2) break block15;
                                            k4 = k3;
                                            if (string != null) break block16;
                                            if (k4 == null) break block17;
                                            k4 = k3;
                                        }
                                        if (k4.q()) {
                                            this.c = y2.e().a(d10, z2, b10);
                                        }
                                    }
                                    object3 = object = b1.a(d10, y2, this.c, true);
                                    if (string != null) break block18;
                                    if (object3 == y2) break block15;
                                    object3 = object;
                                }
                                return object3;
                            }
                            object2 = cq.dn;
                            if (string != null) break block19;
                            bl2 = ((ak)object2).b();
                        }
                        if (!bl2) break block20;
                        object2 = cq.d(y2.e(), cq.dn, y2, d10, z2, b10);
                    }
                    return (Y)object2;
                }
                k2 = k3;
                if (string != null) break block21;
                if (k2 == null) break block22;
                k2 = k3;
            }
            if (k2.q()) {
                object = y2.e().a(d10, z2, b10);
                return object == null ? y2 : this.d.a().a(new n((net.minecraft.ar.v)object, "inventory"));
            }
        }
        return y2;
    }

    public void a(net.minecraft.w.d d10, int n2, int n3) {
        this.a(Q.P().s, d10, n2, n3);
    }

    private void a(int n2, int n3, boolean bl2) {
        block2: {
            block1: {
                String string;
                block0: {
                    v.b((float)n2, (float)n3, 100.0f + this.g);
                    String string2 = I.j();
                    v.b(8.0f, 8.0f, 0.0f);
                    v.d(1.0f, -1.0f, 1.0f);
                    v.d(16.0f, 16.0f, 16.0f);
                    string = string2;
                    if (string != null) break block0;
                    if (!bl2) break block1;
                    v.j();
                }
                if (string == null) break block2;
            }
            v.y();
        }
    }

    public void a(net.minecraft.w.d d10, B b10, d d11, boolean bl2) {
        if (!d10.G() && b10 != null) {
            Y y2 = this.a(d10, b10.aG, b10);
            this.a(d10, y2, d11, bl2);
        }
    }

    protected void a(k k2, int n2, String string) {
        this.d.a(k2, n2, new n(string, "inventory"));
    }

    private void a() {
        String string;
        block3: {
            this.a(net.minecraft.u.g.cb, "anvil_intact");
            this.a(net.minecraft.u.g.cb, 1, "anvil_slightly_damaged");
            this.a(net.minecraft.u.g.cb, 2, "anvil_very_damaged");
            this.a(net.minecraft.u.g.D, bl.BLACK.e(), "black_carpet");
            this.a(net.minecraft.u.g.D, bl.BLUE.e(), "blue_carpet");
            this.a(net.minecraft.u.g.D, bl.BROWN.e(), "brown_carpet");
            this.a(net.minecraft.u.g.D, bl.CYAN.e(), "cyan_carpet");
            this.a(net.minecraft.u.g.D, bl.GRAY.e(), "gray_carpet");
            this.a(net.minecraft.u.g.D, bl.GREEN.e(), "green_carpet");
            this.a(net.minecraft.u.g.D, bl.LIGHT_BLUE.e(), "light_blue_carpet");
            this.a(net.minecraft.u.g.D, bl.LIME.e(), "lime_carpet");
            this.a(net.minecraft.u.g.D, bl.MAGENTA.e(), "magenta_carpet");
            this.a(net.minecraft.u.g.D, bl.ORANGE.e(), "orange_carpet");
            this.a(net.minecraft.u.g.D, bl.PINK.e(), "pink_carpet");
            this.a(net.minecraft.u.g.D, bl.PURPLE.e(), "purple_carpet");
            this.a(net.minecraft.u.g.D, bl.RED.e(), "red_carpet");
            this.a(net.minecraft.u.g.D, bl.SILVER.e(), "silver_carpet");
            this.a(net.minecraft.u.g.D, bl.WHITE.e(), "white_carpet");
            this.a(net.minecraft.u.g.D, bl.YELLOW.e(), "yellow_carpet");
            this.a(net.minecraft.u.g.bl, d3.MOSSY.c(), "mossy_cobblestone_wall");
            this.a(net.minecraft.u.g.bl, d3.NORMAL.c(), "cobblestone_wall");
            this.a(net.minecraft.u.g.bv, da.COARSE_DIRT.a(), "coarse_dirt");
            this.a(net.minecraft.u.g.bv, da.DIRT.a(), "dirt");
            this.a(net.minecraft.u.g.bv, da.PODZOL.a(), "podzol");
            this.a(net.minecraft.u.g.bW, d2.FERN.c(), "double_fern");
            this.a(net.minecraft.u.g.bW, d2.GRASS.c(), "double_grass");
            this.a(net.minecraft.u.g.bW, d2.PAEONIA.c(), "paeonia");
            this.a(net.minecraft.u.g.bW, d2.ROSE.c(), "double_rose");
            this.a(net.minecraft.u.g.bW, d2.SUNFLOWER.c(), "sunflower");
            this.a(net.minecraft.u.g.bW, d2.SYRINGA.c(), "syringa");
            this.a(net.minecraft.u.g.bU, D.BIRCH.b(), "birch_leaves");
            this.a(net.minecraft.u.g.bU, D.JUNGLE.b(), "jungle_leaves");
            this.a(net.minecraft.u.g.bU, D.OAK.b(), "oak_leaves");
            this.a(net.minecraft.u.g.bU, D.SPRUCE.b(), "spruce_leaves");
            this.a(net.minecraft.u.g.S, D.ACACIA.b() - 4, "acacia_leaves");
            this.a(net.minecraft.u.g.S, D.DARK_OAK.b() - 4, "dark_oak_leaves");
            this.a(net.minecraft.u.g.bu, D.BIRCH.b(), "birch_log");
            this.a(net.minecraft.u.g.bu, D.JUNGLE.b(), "jungle_log");
            this.a(net.minecraft.u.g.bu, D.OAK.b(), "oak_log");
            this.a(net.minecraft.u.g.bu, D.SPRUCE.b(), "spruce_log");
            this.a(net.minecraft.u.g.aB, D.ACACIA.b() - 4, "acacia_log");
            this.a(net.minecraft.u.g.aB, D.DARK_OAK.b() - 4, "dark_oak_log");
            this.a(net.minecraft.u.g.be, d1.CHISELED_STONEBRICK.c(), "chiseled_brick_monster_egg");
            this.a(net.minecraft.u.g.be, d1.COBBLESTONE.c(), "cobblestone_monster_egg");
            this.a(net.minecraft.u.g.be, d1.CRACKED_STONEBRICK.c(), "cracked_brick_monster_egg");
            this.a(net.minecraft.u.g.be, d1.MOSSY_STONEBRICK.c(), "mossy_brick_monster_egg");
            this.a(net.minecraft.u.g.be, d1.STONE.c(), "stone_monster_egg");
            this.a(net.minecraft.u.g.be, d1.STONEBRICK.c(), "stone_brick_monster_egg");
            this.a(net.minecraft.u.g.cB, D.ACACIA.b(), "acacia_planks");
            this.a(net.minecraft.u.g.cB, D.BIRCH.b(), "birch_planks");
            this.a(net.minecraft.u.g.cB, D.DARK_OAK.b(), "dark_oak_planks");
            this.a(net.minecraft.u.g.cB, D.JUNGLE.b(), "jungle_planks");
            this.a(net.minecraft.u.g.cB, D.OAK.b(), "oak_planks");
            this.a(net.minecraft.u.g.cB, D.SPRUCE.b(), "spruce_planks");
            this.a(net.minecraft.u.g.cz, c5.BRICKS.a(), "prismarine_bricks");
            this.a(net.minecraft.u.g.cz, c5.DARK.a(), "dark_prismarine");
            this.a(net.minecraft.u.g.cz, c5.ROUGH.a(), "prismarine");
            this.a(net.minecraft.u.g.k, dG.CHISELED.a(), "chiseled_quartz_block");
            this.a(net.minecraft.u.g.k, dG.DEFAULT.a(), "quartz_block");
            this.a(net.minecraft.u.g.k, dG.LINES_Y.a(), "quartz_column");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.ALLIUM.b(), "allium");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.BLUE_ORCHID.b(), "blue_orchid");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.HOUSTONIA.b(), "houstonia");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.ORANGE_TULIP.b(), "orange_tulip");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.OXEYE_DAISY.b(), "oxeye_daisy");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.PINK_TULIP.b(), "pink_tulip");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.POPPY.b(), "poppy");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.RED_TULIP.b(), "red_tulip");
            this.a(net.minecraft.u.g.cj, net.minecraft.W.C.WHITE_TULIP.b(), "white_tulip");
            String string2 = I.j();
            this.a(net.minecraft.u.g.aO, dq.RED_SAND.b(), "red_sand");
            this.a(net.minecraft.u.g.aO, dq.SAND.b(), "sand");
            this.a(net.minecraft.u.g.bC, H.CHISELED.a(), "chiseled_sandstone");
            this.a(net.minecraft.u.g.bC, H.DEFAULT.a(), "sandstone");
            this.a(net.minecraft.u.g.bC, H.SMOOTH.a(), "smooth_sandstone");
            string = string2;
            this.a(net.minecraft.u.g.aQ, dZ.CHISELED.a(), "chiseled_red_sandstone");
            this.a(net.minecraft.u.g.aQ, dZ.DEFAULT.a(), "red_sandstone");
            this.a(net.minecraft.u.g.aQ, dZ.SMOOTH.a(), "smooth_red_sandstone");
            this.a(net.minecraft.u.g.dj, D.ACACIA.b(), "acacia_sapling");
            this.a(net.minecraft.u.g.dj, D.BIRCH.b(), "birch_sapling");
            this.a(net.minecraft.u.g.dj, D.DARK_OAK.b(), "dark_oak_sapling");
            this.a(net.minecraft.u.g.dj, D.JUNGLE.b(), "jungle_sapling");
            this.a(net.minecraft.u.g.dj, D.OAK.b(), "oak_sapling");
            this.a(net.minecraft.u.g.dj, D.SPRUCE.b(), "spruce_sapling");
            this.a(net.minecraft.u.g.a2, 0, "sponge");
            this.a(net.minecraft.u.g.a2, 1, "sponge_wet");
            this.a(net.minecraft.u.g.a5, bl.BLACK.e(), "black_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.BLUE.e(), "blue_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.BROWN.e(), "brown_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.CYAN.e(), "cyan_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.GRAY.e(), "gray_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.GREEN.e(), "green_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.LIGHT_BLUE.e(), "light_blue_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.LIME.e(), "lime_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.MAGENTA.e(), "magenta_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.ORANGE.e(), "orange_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.PINK.e(), "pink_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.PURPLE.e(), "purple_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.RED.e(), "red_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.SILVER.e(), "silver_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.WHITE.e(), "white_stained_glass");
            this.a(net.minecraft.u.g.a5, bl.YELLOW.e(), "yellow_stained_glass");
            this.a(net.minecraft.u.g.cv, bl.BLACK.e(), "black_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.BLUE.e(), "blue_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.BROWN.e(), "brown_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.CYAN.e(), "cyan_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.GRAY.e(), "gray_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.GREEN.e(), "green_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.LIGHT_BLUE.e(), "light_blue_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.LIME.e(), "lime_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.MAGENTA.e(), "magenta_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.ORANGE.e(), "orange_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.PINK.e(), "pink_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.PURPLE.e(), "purple_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.RED.e(), "red_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.SILVER.e(), "silver_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.WHITE.e(), "white_stained_glass_pane");
            this.a(net.minecraft.u.g.cv, bl.YELLOW.e(), "yellow_stained_glass_pane");
            this.a(net.minecraft.u.g.ck, bl.BLACK.e(), "black_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.BLUE.e(), "blue_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.BROWN.e(), "brown_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.CYAN.e(), "cyan_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.GRAY.e(), "gray_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.GREEN.e(), "green_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.LIGHT_BLUE.e(), "light_blue_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.LIME.e(), "lime_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.MAGENTA.e(), "magenta_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.ORANGE.e(), "orange_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.PINK.e(), "pink_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.PURPLE.e(), "purple_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.RED.e(), "red_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.SILVER.e(), "silver_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.WHITE.e(), "white_stained_hardened_clay");
            this.a(net.minecraft.u.g.ck, bl.YELLOW.e(), "yellow_stained_hardened_clay");
            this.a(net.minecraft.u.g.bx, cM.ANDESITE.d(), "andesite");
            this.a(net.minecraft.u.g.bx, cM.ANDESITE_SMOOTH.d(), "andesite_smooth");
            this.a(net.minecraft.u.g.bx, cM.DIORITE.d(), "diorite");
            this.a(net.minecraft.u.g.bx, cM.DIORITE_SMOOTH.d(), "diorite_smooth");
            this.a(net.minecraft.u.g.bx, cM.GRANITE.d(), "granite");
            this.a(net.minecraft.u.g.bx, cM.GRANITE_SMOOTH.d(), "granite_smooth");
            this.a(net.minecraft.u.g.bx, cM.STONE.d(), "stone");
            this.a(net.minecraft.u.g.ay, dO.CRACKED.a(), "cracked_stonebrick");
            this.a(net.minecraft.u.g.ay, dO.DEFAULT.a(), "stonebrick");
            this.a(net.minecraft.u.g.ay, dO.CHISELED.a(), "chiseled_stonebrick");
            this.a(net.minecraft.u.g.ay, dO.MOSSY.a(), "mossy_stonebrick");
            this.a(net.minecraft.u.g.bO, cZ.BRICK.b(), "brick_slab");
            this.a(net.minecraft.u.g.bO, cZ.COBBLESTONE.b(), "cobblestone_slab");
            this.a(net.minecraft.u.g.bO, cZ.WOOD.b(), "old_wood_slab");
            this.a(net.minecraft.u.g.bO, cZ.NETHERBRICK.b(), "nether_brick_slab");
            this.a(net.minecraft.u.g.bO, cZ.QUARTZ.b(), "quartz_slab");
            this.a(net.minecraft.u.g.bO, cZ.SAND.b(), "sandstone_slab");
            this.a(net.minecraft.u.g.bO, cZ.SMOOTHBRICK.b(), "stone_brick_slab");
            this.a(net.minecraft.u.g.bO, cZ.STONE.b(), "stone_slab");
            this.a(net.minecraft.u.g.U, dg.RED_SANDSTONE.a(), "red_sandstone_slab");
            this.a(net.minecraft.u.g.dc, net.minecraft.W.e.DEAD_BUSH.a(), "dead_bush");
            this.a(net.minecraft.u.g.dc, net.minecraft.W.e.FERN.a(), "fern");
            this.a(net.minecraft.u.g.dc, net.minecraft.W.e.GRASS.a(), "tall_grass");
            this.a(net.minecraft.u.g.e, D.ACACIA.b(), "acacia_slab");
            this.a(net.minecraft.u.g.e, D.BIRCH.b(), "birch_slab");
            this.a(net.minecraft.u.g.e, D.DARK_OAK.b(), "dark_oak_slab");
            this.a(net.minecraft.u.g.e, D.JUNGLE.b(), "jungle_slab");
            this.a(net.minecraft.u.g.e, D.OAK.b(), "oak_slab");
            this.a(net.minecraft.u.g.e, D.SPRUCE.b(), "spruce_slab");
            this.a(net.minecraft.u.g.s, bl.BLACK.e(), "black_wool");
            this.a(net.minecraft.u.g.s, bl.BLUE.e(), "blue_wool");
            this.a(net.minecraft.u.g.s, bl.BROWN.e(), "brown_wool");
            this.a(net.minecraft.u.g.s, bl.CYAN.e(), "cyan_wool");
            this.a(net.minecraft.u.g.s, bl.GRAY.e(), "gray_wool");
            this.a(net.minecraft.u.g.s, bl.GREEN.e(), "green_wool");
            this.a(net.minecraft.u.g.s, bl.LIGHT_BLUE.e(), "light_blue_wool");
            this.a(net.minecraft.u.g.s, bl.LIME.e(), "lime_wool");
            this.a(net.minecraft.u.g.s, bl.MAGENTA.e(), "magenta_wool");
            this.a(net.minecraft.u.g.s, bl.ORANGE.e(), "orange_wool");
            this.a(net.minecraft.u.g.s, bl.PINK.e(), "pink_wool");
            this.a(net.minecraft.u.g.s, bl.PURPLE.e(), "purple_wool");
            this.a(net.minecraft.u.g.s, bl.RED.e(), "red_wool");
            this.a(net.minecraft.u.g.s, bl.SILVER.e(), "silver_wool");
            this.a(net.minecraft.u.g.s, bl.WHITE.e(), "white_wool");
            this.a(net.minecraft.u.g.s, bl.YELLOW.e(), "yellow_wool");
            this.a(net.minecraft.u.g.cU, "farmland");
            this.a(net.minecraft.u.g.co, "acacia_stairs");
            this.a(net.minecraft.u.g.az, "activator_rail");
            this.a(net.minecraft.u.g.bX, "beacon");
            this.a(net.minecraft.u.g.g, "bedrock");
            this.a(net.minecraft.u.g.bA, "birch_stairs");
            this.a(net.minecraft.u.g.c8, "bookshelf");
            this.a(net.minecraft.u.g.cY, "brick_block");
            this.a(net.minecraft.u.g.cY, "brick_block");
            this.a(net.minecraft.u.g.cG, "brick_stairs");
            this.a(net.minecraft.u.g.cg, "brown_mushroom");
            this.a(net.minecraft.u.g.aA, "cactus");
            this.a(net.minecraft.u.g.d, "clay");
            this.a(net.minecraft.u.g.r, "coal_block");
            this.a(net.minecraft.u.g.l, "coal_ore");
            this.a(net.minecraft.u.g.cW, "cobblestone");
            this.a(net.minecraft.u.g.aj, "crafting_table");
            this.a(net.minecraft.u.g.am, "dark_oak_stairs");
            this.a(net.minecraft.u.g.cQ, "daylight_detector");
            this.a(net.minecraft.u.g.b9, "dead_bush");
            this.a(net.minecraft.u.g.aY, "detector_rail");
            this.a(net.minecraft.u.g.bF, "diamond_block");
            this.a(net.minecraft.u.g.cO, "diamond_ore");
            this.a(net.minecraft.u.g.n, "dispenser");
            this.a(net.minecraft.u.g.cw, "dropper");
            this.a(net.minecraft.u.g.cs, "emerald_block");
            this.a(net.minecraft.u.g.au, "emerald_ore");
            this.a(net.minecraft.u.g.bH, "enchanting_table");
            this.a(net.minecraft.u.g.ad, "end_portal_frame");
            this.a(net.minecraft.u.g.v, "end_stone");
            this.a(net.minecraft.u.g.bt, "oak_fence");
            this.a(net.minecraft.u.g.cN, "spruce_fence");
            this.a(net.minecraft.u.g.q, "birch_fence");
            this.a(net.minecraft.u.g.bd, "jungle_fence");
            this.a(net.minecraft.u.g.bs, "dark_oak_fence");
            this.a(net.minecraft.u.g.aa, "acacia_fence");
            this.a(net.minecraft.u.g.dp, "oak_fence_gate");
            this.a(net.minecraft.u.g.aq, "spruce_fence_gate");
            this.a(net.minecraft.u.g.O, "birch_fence_gate");
            this.a(net.minecraft.u.g.cJ, "jungle_fence_gate");
            this.a(net.minecraft.u.g.cC, "dark_oak_fence_gate");
            this.a(net.minecraft.u.g.bI, "acacia_fence_gate");
            this.a(net.minecraft.u.g.bJ, "furnace");
            this.a(net.minecraft.u.g.a, "glass");
            this.a(net.minecraft.u.g.a6, "glass_pane");
            this.a(net.minecraft.u.g.W, "glowstone");
            this.a(net.minecraft.u.g.w, "golden_rail");
            this.a(net.minecraft.u.g.a7, "gold_block");
            this.a(net.minecraft.u.g.aK, "gold_ore");
            this.a(net.minecraft.u.g.aU, "grass");
            this.a(net.minecraft.u.g.ci, "grass_path");
            this.a(net.minecraft.u.g.di, "gravel");
            this.a(net.minecraft.u.g.an, "hardened_clay");
            this.a(net.minecraft.u.g.aL, "hay_block");
            this.a(net.minecraft.u.g.cp, "heavy_weighted_pressure_plate");
            this.a(net.minecraft.u.g.ac, "hopper");
            this.a(net.minecraft.u.g.cF, "ice");
            this.a(net.minecraft.u.g.dd, "iron_bars");
            this.a(net.minecraft.u.g.E, "iron_block");
            this.a(net.minecraft.u.g.ak, "iron_ore");
            this.a(net.minecraft.u.g.bV, "iron_trapdoor");
            this.a(net.minecraft.u.g.ct, "jukebox");
            this.a(net.minecraft.u.g.al, "jungle_stairs");
            this.a(net.minecraft.u.g.cD, "ladder");
            this.a(net.minecraft.u.g.av, "lapis_block");
            this.a(net.minecraft.u.g.aC, "lapis_ore");
            this.a(net.minecraft.u.g.ao, "lever");
            this.a(net.minecraft.u.g.cH, "light_weighted_pressure_plate");
            this.a(net.minecraft.u.g.y, "lit_pumpkin");
            this.a(net.minecraft.u.g.ae, "melon_block");
            this.a(net.minecraft.u.g.x, "mossy_cobblestone");
            this.a(net.minecraft.u.g.a8, "mycelium");
            this.a(net.minecraft.u.g.j, "netherrack");
            this.a(net.minecraft.u.g.dk, "nether_brick");
            this.a(net.minecraft.u.g.dn, "nether_brick_fence");
            this.a(net.minecraft.u.g.aP, "nether_brick_stairs");
            this.a(net.minecraft.u.g.dm, "noteblock");
            this.a(net.minecraft.u.g.aX, "oak_stairs");
            this.a(net.minecraft.u.g.bP, "obsidian");
            this.a(net.minecraft.u.g.cq, "packed_ice");
            this.a(net.minecraft.u.g.cr, "piston");
            this.a(net.minecraft.u.g.G, "pumpkin");
            this.a(net.minecraft.u.g.u, "quartz_ore");
            this.a(net.minecraft.u.g.bN, "quartz_stairs");
            this.a(net.minecraft.u.g.bM, "rail");
            this.a(net.minecraft.u.g.b8, "redstone_block");
            this.a(net.minecraft.u.g.as, "redstone_lamp");
            this.a(net.minecraft.u.g.cu, "redstone_ore");
            this.a(net.minecraft.u.g.c5, "redstone_torch");
            this.a(net.minecraft.u.g.z, "red_mushroom");
            this.a(net.minecraft.u.g.ch, "sandstone_stairs");
            this.a(net.minecraft.u.g.bE, "red_sandstone_stairs");
            this.a(net.minecraft.u.g.af, "sea_lantern");
            this.a(net.minecraft.u.g.t, "slime");
            this.a(net.minecraft.u.g.da, "snow");
            this.a(net.minecraft.u.g.o, "snow_layer");
            this.a(net.minecraft.u.g.br, "soul_sand");
            this.a(net.minecraft.u.g.aT, "spruce_stairs");
            this.a(net.minecraft.u.g.M, "sticky_piston");
            this.a(net.minecraft.u.g.cX, "stone_brick_stairs");
            this.a(net.minecraft.u.g.aI, "stone_button");
            this.a(net.minecraft.u.g.dl, "stone_pressure_plate");
            this.a(net.minecraft.u.g.a0, "stone_stairs");
            this.a(net.minecraft.u.g.cR, "tnt");
            this.a(net.minecraft.u.g.h, "torch");
            this.a(net.minecraft.u.g.cI, "trapdoor");
            this.a(net.minecraft.u.g.b, "tripwire_hook");
            this.a(net.minecraft.u.g.aW, "vine");
            this.a(net.minecraft.u.g.c_, "waterlily");
            this.a(net.minecraft.u.g.dh, "web");
            this.a(net.minecraft.u.g.I, "wooden_button");
            this.a(net.minecraft.u.g.bc, "wooden_pressure_plate");
            this.a(net.minecraft.u.g.cZ, net.minecraft.W.C.DANDELION.b(), "dandelion");
            this.a(net.minecraft.u.g.aD, "end_rod");
            this.a(net.minecraft.u.g.cm, "chorus_plant");
            this.a(net.minecraft.u.g.P, "chorus_flower");
            this.a(net.minecraft.u.g.aF, "purpur_block");
            this.a(net.minecraft.u.g.V, "purpur_pillar");
            this.a(net.minecraft.u.g.a_, "purpur_stairs");
            this.a(net.minecraft.u.g.F, "purpur_slab");
            this.a(net.minecraft.u.g.bS, "purpur_double_slab");
            this.a(net.minecraft.u.g.dg, "end_bricks");
            this.a(net.minecraft.u.g.bR, "magma");
            this.a(net.minecraft.u.g.bz, "nether_wart_block");
            this.a(net.minecraft.u.g.Z, "red_nether_brick");
            this.a(net.minecraft.u.g.bm, "bone_block");
            this.a(net.minecraft.u.g.Y, "structure_void");
            this.a(net.minecraft.u.g.ce, "observer");
            this.a(net.minecraft.u.g.b1, "white_shulker_box");
            this.a(net.minecraft.u.g.bk, "orange_shulker_box");
            this.a(net.minecraft.u.g.X, "magenta_shulker_box");
            this.a(net.minecraft.u.g.L, "light_blue_shulker_box");
            this.a(net.minecraft.u.g.aE, "yellow_shulker_box");
            this.a(net.minecraft.u.g.bo, "lime_shulker_box");
            this.a(net.minecraft.u.g.bh, "pink_shulker_box");
            this.a(net.minecraft.u.g.J, "gray_shulker_box");
            this.a(net.minecraft.u.g.ap, "silver_shulker_box");
            this.a(net.minecraft.u.g.bg, "cyan_shulker_box");
            this.a(net.minecraft.u.g.b5, "purple_shulker_box");
            this.a(net.minecraft.u.g.N, "blue_shulker_box");
            this.a(net.minecraft.u.g.by, "brown_shulker_box");
            this.a(net.minecraft.u.g.cx, "green_shulker_box");
            this.a(net.minecraft.u.g.bw, "red_shulker_box");
            this.a(net.minecraft.u.g.a3, "black_shulker_box");
            this.a(net.minecraft.u.g.c7, "white_glazed_terracotta");
            this.a(net.minecraft.u.g.A, "orange_glazed_terracotta");
            this.a(net.minecraft.u.g.bb, "magenta_glazed_terracotta");
            this.a(net.minecraft.u.g.c0, "light_blue_glazed_terracotta");
            this.a(net.minecraft.u.g.cn, "yellow_glazed_terracotta");
            this.a(net.minecraft.u.g.b3, "lime_glazed_terracotta");
            this.a(net.minecraft.u.g.cf, "pink_glazed_terracotta");
            this.a(net.minecraft.u.g.b2, "gray_glazed_terracotta");
            this.a(net.minecraft.u.g.cc, "silver_glazed_terracotta");
            this.a(net.minecraft.u.g.a9, "cyan_glazed_terracotta");
            this.a(net.minecraft.u.g.T, "purple_glazed_terracotta");
            this.a(net.minecraft.u.g.c1, "blue_glazed_terracotta");
            this.a(net.minecraft.u.g.ab, "brown_glazed_terracotta");
            this.a(net.minecraft.u.g.ax, "green_glazed_terracotta");
            this.a(net.minecraft.u.g.c2, "red_glazed_terracotta");
            this.a(net.minecraft.u.g.c6, "black_glazed_terracotta");
            for (bl bl2 : bl.values()) {
                this.a(net.minecraft.u.g.cK, bl2.e(), bl2.b() + "_concrete");
                this.a(net.minecraft.u.g.aw, bl2.e(), bl2.b() + "_concrete_powder");
                if (string == null) {
                    if (string == null) continue;
                }
                break block3;
            }
            this.a(net.minecraft.u.g.cd, "chest");
            this.a(net.minecraft.u.g.c4, "trapped_chest");
            this.a(net.minecraft.u.g.ba, "ender_chest");
            this.a(net.minecraft.u.h.u, "iron_shovel");
            this.a(net.minecraft.u.h.aZ, "iron_pickaxe");
            this.a(net.minecraft.u.h.cv, "iron_axe");
            this.a(net.minecraft.u.h.cn, "flint_and_steel");
            this.a(net.minecraft.u.h.ci, "apple");
            this.a(net.minecraft.u.h.i, "bow");
            this.a(net.minecraft.u.h.x, "arrow");
            this.a(net.minecraft.u.h.aA, "spectral_arrow");
            this.a(net.minecraft.u.h.aI, "tipped_arrow");
            this.a(net.minecraft.u.h.b4, 0, "coal");
            this.a(net.minecraft.u.h.b4, 1, "charcoal");
            this.a(net.minecraft.u.h.ag, "diamond");
            this.a(net.minecraft.u.h.ad, "iron_ingot");
            this.a(net.minecraft.u.h.I, "gold_ingot");
            this.a(net.minecraft.u.h.bs, "iron_sword");
            this.a(net.minecraft.u.h.bF, "wooden_sword");
            this.a(net.minecraft.u.h.ac, "wooden_shovel");
            this.a(net.minecraft.u.h.bo, "wooden_pickaxe");
            this.a(net.minecraft.u.h.aS, "wooden_axe");
            this.a(net.minecraft.u.h.cj, "stone_sword");
            this.a(net.minecraft.u.h.bE, "stone_shovel");
            this.a(net.minecraft.u.h.ai, "stone_pickaxe");
            this.a(net.minecraft.u.h.k, "stone_axe");
            this.a(net.minecraft.u.h.bN, "diamond_sword");
            this.a(net.minecraft.u.h.al, "diamond_shovel");
            this.a(net.minecraft.u.h.cm, "diamond_pickaxe");
            this.a(net.minecraft.u.h.b9, "diamond_axe");
            this.a(net.minecraft.u.h.bz, "stick");
            this.a(net.minecraft.u.h.z, "bowl");
            this.a(net.minecraft.u.h.bb, "mushroom_stew");
            this.a(net.minecraft.u.h.X, "golden_sword");
            this.a(net.minecraft.u.h.b5, "golden_shovel");
            this.a(net.minecraft.u.h.bO, "golden_pickaxe");
            this.a(net.minecraft.u.h.B, "golden_axe");
            this.a(net.minecraft.u.h.aC, "string");
            this.a(net.minecraft.u.h.bi, "feather");
            this.a(net.minecraft.u.h.bZ, "gunpowder");
            this.a(net.minecraft.u.h.bY, "wooden_hoe");
            this.a(net.minecraft.u.h.bA, "stone_hoe");
            this.a(net.minecraft.u.h.b6, "iron_hoe");
            this.a(net.minecraft.u.h.a2, "diamond_hoe");
            this.a(net.minecraft.u.h.e, "golden_hoe");
            this.a(net.minecraft.u.h.a6, "wheat_seeds");
            this.a(net.minecraft.u.h.b1, "wheat");
            this.a(net.minecraft.u.h.cG, "bread");
            this.a(net.minecraft.u.h.ab, "leather_helmet");
            this.a(net.minecraft.u.h.cy, "leather_chestplate");
            this.a(net.minecraft.u.h.E, "leather_leggings");
            this.a(net.minecraft.u.h.K, "leather_boots");
            this.a(net.minecraft.u.h.p, "chainmail_helmet");
            this.a(net.minecraft.u.h.a4, "chainmail_chestplate");
            this.a(net.minecraft.u.h.H, "chainmail_leggings");
            this.a(net.minecraft.u.h.b_, "chainmail_boots");
            this.a(net.minecraft.u.h.af, "iron_helmet");
            this.a(net.minecraft.u.h.aK, "iron_chestplate");
            this.a(net.minecraft.u.h.aa, "iron_leggings");
            this.a(net.minecraft.u.h.D, "iron_boots");
            this.a(net.minecraft.u.h.bD, "diamond_helmet");
            this.a(net.minecraft.u.h.an, "diamond_chestplate");
            this.a(net.minecraft.u.h.bv, "diamond_leggings");
            this.a(net.minecraft.u.h.w, "diamond_boots");
            this.a(net.minecraft.u.h.S, "golden_helmet");
            this.a(net.minecraft.u.h.cF, "golden_chestplate");
            this.a(net.minecraft.u.h.bP, "golden_leggings");
            this.a(net.minecraft.u.h.cs, "golden_boots");
            this.a(net.minecraft.u.h.aj, "flint");
            this.a(net.minecraft.u.h.aP, "porkchop");
            this.a(net.minecraft.u.h.cw, "cooked_porkchop");
            this.a(net.minecraft.u.h.aR, "painting");
            this.a(net.minecraft.u.h.bt, "golden_apple");
            this.a(net.minecraft.u.h.bt, 1, "golden_apple");
            this.a(net.minecraft.u.h.bk, "sign");
            this.a(net.minecraft.u.h.Q, "oak_door");
            this.a(net.minecraft.u.h.bd, "spruce_door");
            this.a(net.minecraft.u.h.ao, "birch_door");
            this.a(net.minecraft.u.h.cD, "jungle_door");
            this.a(net.minecraft.u.h.ax, "acacia_door");
            this.a(net.minecraft.u.h.cb, "dark_oak_door");
            this.a(net.minecraft.u.h.P, "bucket");
            this.a(net.minecraft.u.h.ah, "water_bucket");
            this.a(net.minecraft.u.h.cg, "lava_bucket");
            this.a(net.minecraft.u.h.q, "minecart");
            this.a(net.minecraft.u.h.be, "saddle");
            this.a(net.minecraft.u.h.cA, "iron_door");
            this.a(net.minecraft.u.h.a7, "redstone");
            this.a(net.minecraft.u.h.aB, "snowball");
            this.a(net.minecraft.u.h.N, "oak_boat");
            this.a(net.minecraft.u.h.Z, "spruce_boat");
            this.a(net.minecraft.u.h.s, "birch_boat");
            this.a(net.minecraft.u.h.U, "jungle_boat");
            this.a(net.minecraft.u.h.R, "acacia_boat");
            this.a(net.minecraft.u.h.O, "dark_oak_boat");
            this.a(net.minecraft.u.h.aQ, "leather");
            this.a(net.minecraft.u.h.n, "milk_bucket");
            this.a(net.minecraft.u.h.by, "brick");
            this.a(net.minecraft.u.h.ca, "clay_ball");
            this.a(net.minecraft.u.h.co, "reeds");
            this.a(net.minecraft.u.h.C, "paper");
            this.a(net.minecraft.u.h.b8, "book");
            this.a(net.minecraft.u.h.bw, "slime_ball");
            this.a(net.minecraft.u.h.aq, "chest_minecart");
            this.a(net.minecraft.u.h.aE, "furnace_minecart");
            this.a(net.minecraft.u.h.bB, "egg");
            this.a(net.minecraft.u.h.b7, "compass");
            this.a(net.minecraft.u.h.bQ, "fishing_rod");
            this.a(net.minecraft.u.h.br, "clock");
            this.a(net.minecraft.u.h.cr, "glowstone_dust");
            this.a(net.minecraft.u.h.aw, aY.COD.a(), "cod");
            this.a(net.minecraft.u.h.aw, aY.SALMON.a(), "salmon");
            this.a(net.minecraft.u.h.aw, aY.CLOWNFISH.a(), "clownfish");
            this.a(net.minecraft.u.h.aw, aY.PUFFERFISH.a(), "pufferfish");
            this.a(net.minecraft.u.h.cd, aY.COD.a(), "cooked_cod");
            this.a(net.minecraft.u.h.cd, aY.SALMON.a(), "cooked_salmon");
            this.a(net.minecraft.u.h.aL, bl.BLACK.a(), "dye_black");
            this.a(net.minecraft.u.h.aL, bl.RED.a(), "dye_red");
            this.a(net.minecraft.u.h.aL, bl.GREEN.a(), "dye_green");
            this.a(net.minecraft.u.h.aL, bl.BROWN.a(), "dye_brown");
            this.a(net.minecraft.u.h.aL, bl.BLUE.a(), "dye_blue");
            this.a(net.minecraft.u.h.aL, bl.PURPLE.a(), "dye_purple");
            this.a(net.minecraft.u.h.aL, bl.CYAN.a(), "dye_cyan");
            this.a(net.minecraft.u.h.aL, bl.SILVER.a(), "dye_silver");
            this.a(net.minecraft.u.h.aL, bl.GRAY.a(), "dye_gray");
            this.a(net.minecraft.u.h.aL, bl.PINK.a(), "dye_pink");
            this.a(net.minecraft.u.h.aL, bl.LIME.a(), "dye_lime");
            this.a(net.minecraft.u.h.aL, bl.YELLOW.a(), "dye_yellow");
            this.a(net.minecraft.u.h.aL, bl.LIGHT_BLUE.a(), "dye_light_blue");
            this.a(net.minecraft.u.h.aL, bl.MAGENTA.a(), "dye_magenta");
            this.a(net.minecraft.u.h.aL, bl.ORANGE.a(), "dye_orange");
            this.a(net.minecraft.u.h.aL, bl.WHITE.a(), "dye_white");
            this.a(net.minecraft.u.h.bh, "bone");
            this.a(net.minecraft.u.h.bm, "sugar");
            this.a(net.minecraft.u.h.aW, "cake");
            this.a(net.minecraft.u.h.aY, "repeater");
            this.a(net.minecraft.u.h.ae, "cookie");
            this.a(net.minecraft.u.h.aT, "shears");
            this.a(net.minecraft.u.h.ap, "melon");
            this.a(net.minecraft.u.h.bJ, "pumpkin_seeds");
            this.a(net.minecraft.u.h.bu, "melon_seeds");
            this.a(net.minecraft.u.h.aV, "beef");
            this.a(net.minecraft.u.h.b2, "cooked_beef");
            this.a(net.minecraft.u.h.bp, "chicken");
            this.a(net.minecraft.u.h.F, "cooked_chicken");
            this.a(net.minecraft.u.h.cz, "rabbit");
            this.a(net.minecraft.u.h.bT, "cooked_rabbit");
            this.a(net.minecraft.u.h.h, "mutton");
            this.a(net.minecraft.u.h.ct, "cooked_mutton");
            this.a(net.minecraft.u.h.m, "rabbit_foot");
            this.a(net.minecraft.u.h.bX, "rabbit_hide");
            this.a(net.minecraft.u.h.cu, "rabbit_stew");
            this.a(net.minecraft.u.h.ba, "rotten_flesh");
            this.a(net.minecraft.u.h.o, "ender_pearl");
            this.a(net.minecraft.u.h.bx, "blaze_rod");
            this.a(net.minecraft.u.h.bK, "ghast_tear");
            this.a(net.minecraft.u.h.bM, "gold_nugget");
            this.a(net.minecraft.u.h.cl, "nether_wart");
            this.a(net.minecraft.u.h.b, "beetroot");
            this.a(net.minecraft.u.h.bR, "beetroot_seeds");
            this.a(net.minecraft.u.h.a_, "beetroot_soup");
            this.a(net.minecraft.u.h.A, "totem");
            this.a(net.minecraft.u.h.V, "bottle_drinkable");
            this.a(net.minecraft.u.h.b3, "bottle_splash");
            this.a(net.minecraft.u.h.W, "bottle_lingering");
            this.a(net.minecraft.u.h.ch, "glass_bottle");
            this.a(net.minecraft.u.h.g, "dragon_breath");
            this.a(net.minecraft.u.h.T, "spider_eye");
            this.a(net.minecraft.u.h.ak, "fermented_spider_eye");
            this.a(net.minecraft.u.h.cC, "blaze_powder");
            this.a(net.minecraft.u.h.y, "magma_cream");
            this.a(net.minecraft.u.h.c, "brewing_stand");
            this.a(net.minecraft.u.h.a1, "cauldron");
            this.a(net.minecraft.u.h.cE, "ender_eye");
            this.a(net.minecraft.u.h.bq, "speckled_melon");
            this.d.a(net.minecraft.u.h.bn, new s(this));
            this.a(net.minecraft.u.h.bG, "experience_bottle");
            this.a(net.minecraft.u.h.bL, "fire_charge");
            this.a(net.minecraft.u.h.a5, "writable_book");
            this.a(net.minecraft.u.h.aO, "emerald");
            this.a(net.minecraft.u.h.L, "item_frame");
            this.a(net.minecraft.u.h.cx, "flower_pot");
            this.a(net.minecraft.u.h.aG, "carrot");
            this.a(net.minecraft.u.h.f, "potato");
            this.a(net.minecraft.u.h.bg, "baked_potato");
            this.a(net.minecraft.u.h.bC, "poisonous_potato");
            this.a(net.minecraft.u.h.Y, "map");
            this.a(net.minecraft.u.h.aN, "golden_carrot");
            this.a(net.minecraft.u.h.cp, 0, "skull_skeleton");
            this.a(net.minecraft.u.h.cp, 1, "skull_wither");
            this.a(net.minecraft.u.h.cp, 2, "skull_zombie");
            this.a(net.minecraft.u.h.cp, 3, "skull_char");
            this.a(net.minecraft.u.h.cp, 4, "skull_creeper");
            this.a(net.minecraft.u.h.cp, 5, "skull_dragon");
            this.a(net.minecraft.u.h.bW, "carrot_on_a_stick");
            this.a(net.minecraft.u.h.aF, "nether_star");
            this.a(net.minecraft.u.h.cc, "end_crystal");
            this.a(net.minecraft.u.h.ck, "pumpkin_pie");
            this.a(net.minecraft.u.h.bS, "firework_charge");
            this.a(net.minecraft.u.h.t, "comparator");
            this.a(net.minecraft.u.h.b0, "netherbrick");
            this.a(net.minecraft.u.h.J, "quartz");
            this.a(net.minecraft.u.h.l, "tnt_minecart");
            this.a(net.minecraft.u.h.at, "hopper_minecart");
            this.a(net.minecraft.u.h.d, "armor_stand");
            this.a(net.minecraft.u.h.a, "iron_horse_armor");
            this.a(net.minecraft.u.h.bf, "golden_horse_armor");
            this.a(net.minecraft.u.h.aD, "diamond_horse_armor");
            this.a(net.minecraft.u.h.G, "lead");
            this.a(net.minecraft.u.h.bc, "name_tag");
            this.d.a(net.minecraft.u.h.aU, new aD(this));
            this.d.a(net.minecraft.u.h.bl, new t(this));
            this.d.a(net.minecraft.u.h.cq, new N(this));
            this.a(net.minecraft.u.h.cf, "elytra");
            this.a(net.minecraft.u.h.au, "chorus_fruit");
            this.a(net.minecraft.u.h.r, "chorus_fruit_popped");
            this.a(net.minecraft.u.h.ay, "shulker_shell");
            this.a(net.minecraft.u.h.a8, "iron_nugget");
            this.a(net.minecraft.u.h.a3, "record_13");
            this.a(net.minecraft.u.h.bV, "record_cat");
            this.a(net.minecraft.u.h.bI, "record_blocks");
            this.a(net.minecraft.u.h.aX, "record_chirp");
            this.a(net.minecraft.u.h.az, "record_far");
            this.a(net.minecraft.u.h.bH, "record_mall");
            this.a(net.minecraft.u.h.j, "record_mellohi");
            this.a(net.minecraft.u.h.aH, "record_stal");
            this.a(net.minecraft.u.h.aM, "record_strad");
            this.a(net.minecraft.u.h.am, "record_ward");
            this.a(net.minecraft.u.h.bU, "record_11");
            this.a(net.minecraft.u.h.bj, "record_wait");
            this.a(net.minecraft.u.h.ce, "prismarine_shard");
            this.a(net.minecraft.u.h.M, "prismarine_crystals");
            this.a(net.minecraft.u.h.ar, "knowledge_book");
            this.d.a(net.minecraft.u.h.a0, new m(this));
            this.d.a((k)net.minecraft.u.h.a9, new J(this));
            this.a(net.minecraft.u.g.de, "command_block");
            this.a(net.minecraft.u.h.av, "fireworks");
            this.a(net.minecraft.u.h.aJ, "command_block_minecart");
            this.a(net.minecraft.u.g.ah, "barrier");
            this.a(net.minecraft.u.g.i, "mob_spawner");
            this.a(net.minecraft.u.h.as, "written_book");
            this.a(net.minecraft.u.g.a1, net.minecraft.W.k.ALL_INSIDE.a(), "brown_mushroom_block");
            this.a(net.minecraft.u.g.db, net.minecraft.W.k.ALL_INSIDE.a(), "red_mushroom_block");
            this.a(net.minecraft.u.g.bG, "dragon_egg");
            this.a(net.minecraft.u.g.aS, "repeating_command_block");
            this.a(net.minecraft.u.g.bZ, "chain_command_block");
            this.a(net.minecraft.u.g.bD, r.SAVE.a(), "structure_block");
            this.a(net.minecraft.u.g.bD, r.LOAD.a(), "structure_block");
            this.a(net.minecraft.u.g.bD, r.CORNER.a(), "structure_block");
            this.a(net.minecraft.u.g.bD, r.DATA.a(), "structure_block");
        }
        Object object = cq.br;
        if (string == null && ((ak)object).b()) {
            object = cq.d(cq.br, this.d);
        }
    }

    private void a(I i2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        i2.a(7, net.minecraft.client.y.b.i);
        i2.c((double)(n2 + 0), (double)(n3 + 0), 0.0).b(n6, n7, n8, n9).d();
        i2.c((double)(n2 + 0), (double)(n3 + n5), 0.0).b(n6, n7, n8, n9).d();
        i2.c((double)(n2 + n4), (double)(n3 + n5), 0.0).b(n6, n7, n8, n9).d();
        i2.c((double)(n2 + n4), (double)(n3 + 0), 0.0).b(n6, n7, n8, n9).d();
        W.c().a();
    }

    private void a(K k2, String string) {
        this.a(k2, 0, string);
    }

    private void a(k k2, String string) {
        this.a(k2, 0, string);
    }

    private void a(I i2, P p2) {
        net.minecraft.k.m m2 = p2.b().m();
        i2.c(m2.e(), m2.b(), m2.a());
    }

    public void a(a5 a52, net.minecraft.w.d d10, int n2, int n3) {
        this.a(a52, d10, n2, n3, null);
    }

    protected void a(net.minecraft.w.d d10, Y y2, d d11, boolean bl2) {
        block5: {
            boolean bl3;
            block9: {
                block8: {
                    String string;
                    block7: {
                        Object object;
                        block6: {
                            boolean bl4;
                            block4: {
                                string = I.j();
                                bl4 = d10.G();
                                if (string != null) break block4;
                                if (bl4) break block5;
                                this.b.b(j.x);
                                this.b.a(j.x).a(false, false);
                                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                v.q();
                                v.a(516, 0.1f);
                                v.a();
                                v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
                                v.M();
                                object = cq.dH;
                                if (string != null) break block6;
                                bl4 = ((ak)object).b();
                            }
                            if (!bl4) break block7;
                            object = cq.d(cq.dH, new Object[]{y2, d11, bl2});
                        }
                        y2 = (Y)object;
                        if (string == null) break block8;
                    }
                    y y3 = y2.c();
                    y.a(y3.c(d11), bl2);
                    bl3 = this.a(y3.c(d11));
                    if (string != null) break block9;
                    if (bl3) {
                        v.a(ad.FRONT);
                    }
                }
                b1.a(bl2);
                this.a(d10, y2);
                bl3 = false;
            }
            b1.a(bl3);
            v.a(ad.BACK);
            v.B();
            v.u();
            v.f();
            this.b.b(j.x);
            this.b.a(j.x).b();
        }
    }

    private void a(Y y2, net.minecraft.w.d d10) {
        this.a(y2, -1, d10);
    }
}

