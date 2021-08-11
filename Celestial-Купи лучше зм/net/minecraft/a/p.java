/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.B.a;
import net.minecraft.N.O;
import net.minecraft.Q.v;
import net.minecraft.W.a0;
import net.minecraft.W.aj;
import net.minecraft.W.az;
import net.minecraft.Z.i;
import net.minecraft.a.k;
import net.minecraft.ac.c;
import net.minecraft.ah.A;
import net.minecraft.ah.l;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class p {
    public /* synthetic */ net.minecraft.i.k i;
    public /* synthetic */ z j;
    private /* synthetic */ s h;
    private /* synthetic */ int b;
    private /* synthetic */ int f;
    private /* synthetic */ n g;
    private /* synthetic */ int d;
    private /* synthetic */ n e;
    private /* synthetic */ boolean k;
    private /* synthetic */ int a;
    private /* synthetic */ boolean c;

    public void a() {
        block14: {
            int n2;
            block18: {
                i i2;
                float f10;
                boolean bl2;
                block17: {
                    block16: {
                        p p2;
                        block15: {
                            boolean bl3;
                            block9: {
                                block10: {
                                    block13: {
                                        i i3;
                                        int n3;
                                        block11: {
                                            i i4;
                                            block12: {
                                                ++this.a;
                                                bl2 = net.minecraft.a.k.t();
                                                bl3 = this.k;
                                                if (!bl2) break block9;
                                                if (!bl3) break block10;
                                                n3 = this.a - this.f;
                                                i3 = i4 = this.j.d(this.g);
                                                if (!bl2) break block11;
                                                if (i3.o() != net.minecraft.ac.c.A) break block12;
                                                this.k = false;
                                                if (bl2) break block13;
                                            }
                                            i3 = i4;
                                        }
                                        f10 = i3.a(this.i, this.i.aG, this.g) * (float)(n3 + 1);
                                        int n4 = n2 = (int)(f10 * 10.0f);
                                        if (bl2) {
                                            float f11;
                                            if (n4 != this.b) {
                                                this.j.c(this.i.W(), this.g, n2);
                                                this.b = n2;
                                            }
                                            n4 = (f11 = f10 - 1.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                        }
                                        if (bl2 && n4 >= 0) {
                                            this.k = false;
                                            n4 = this.c(this.g) ? 1 : 0;
                                        }
                                    }
                                    if (bl2) break block14;
                                }
                                p2 = this;
                                if (!bl2) break block15;
                                bl3 = p2.c;
                            }
                            if (!bl3) break block14;
                            p2 = this;
                        }
                        i2 = p2.j.d(this.e);
                        if (!bl2) break block16;
                        if (i2.o() != net.minecraft.ac.c.A) break block17;
                        this.j.c(this.i.W(), this.e, -1);
                        this.b = -1;
                        this.c = false;
                    }
                    if (bl2) break block14;
                }
                int n5 = this.a - this.d;
                f10 = i2.a(this.i, this.i.aG, this.g) * (float)(n5 + 1);
                n2 = (int)(f10 * 10.0f);
                if (!bl2) break block18;
                if (n2 == this.b) break block14;
                this.j.c(this.i.W(), this.e, n2);
            }
            this.b = n2;
        }
    }

    public void a(A a10) {
        this.j = a10;
    }

    public s e() {
        return this.h;
    }

    public p(z z2) {
        this.h = s.NOT_SET;
        this.e = n.o;
        this.g = n.o;
        this.b = -1;
        this.j = z2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Exception decompiling
     */
    public boolean c(n var1_1) {
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

    private boolean b(n n2) {
        boolean bl2;
        i i2 = this.j.d(n2);
        boolean bl3 = net.minecraft.a.k.t();
        i2.b().a(this.j, n2, i2, this.i);
        boolean bl4 = bl3;
        boolean bl5 = bl2 = this.j.v(n2);
        if (bl4) {
            if (bl5) {
                i2.b().d(this.j, n2, i2);
            }
            bl5 = bl2;
        }
        return bl5;
    }

    public void b() {
        this.c = false;
        this.j.c(this.i.W(), this.e, -1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aX a(j var1_1, z var2_2, d var3_3, a3 var4_4) {
        block36: {
            block35: {
                block33: {
                    block34: {
                        block32: {
                            block31: {
                                block28: {
                                    block30: {
                                        block29: {
                                            block27: {
                                                var5_5 = net.minecraft.a.k.q();
                                                if (this.h == s.SPECTATOR) {
                                                    return aX.PASS;
                                                }
                                                v0 = var1_1.o().c(var3_3.w());
                                                if (!var5_5) {
                                                    if (v0 != 0) {
                                                        return aX.PASS;
                                                    }
                                                    v0 = var3_3.t();
                                                }
                                                var6_6 = v0;
                                                var7_7 = var3_3.d();
                                                var8_8 = var3_3.a(var2_2, var1_1, var4_4);
                                                v1 = var9_9 = var8_8.a();
                                                if (var5_5) break block27;
                                                if (v1 != var3_3) break block28;
                                                v1 = var9_9;
                                            }
                                            v2 = v1.t();
                                            if (var5_5) break block29;
                                            if (v2 != var6_6) break block28;
                                            v2 = var9_9.o();
                                        }
                                        if (var5_5) break block30;
                                        if (v2 > 0) break block28;
                                        v2 = var9_9.d();
                                    }
                                    if (v2 == var7_7) {
                                        return var8_8.b();
                                    }
                                }
                                if (var8_8.b() != aX.FAIL) break block31;
                                v3 = var9_9.o();
                                if (var5_5) break block32;
                                if (v3 > 0) {
                                    v3 = var1_1.aq() ? 1 : 0;
                                    if (!var5_5) {
                                        if (v3 == 0) {
                                            return var8_8.b();
                                        } else {
                                            ** GOTO lbl39
                                        }
                                    } else {
                                        ** GOTO lbl38
                                    }
                                }
                                break block31;
lbl38:
                                // 2 sources

                                break block32;
                            }
                            var1_1.a(var4_4, var9_9);
                            v3 = this.d() ? 1 : 0;
                        }
                        if (var5_5) break block33;
                        if (v3 == 0) break block34;
                        var9_9.c(var6_6);
                        v3 = var9_9.j() ? 1 : 0;
                        if (var5_5) break block33;
                        if (v3 != 0) {
                            var9_9.a(var7_7);
                        }
                    }
                    v3 = var9_9.G() ? 1 : 0;
                }
                if (var5_5) break block35;
                if (v3 != 0) {
                    var1_1.a(var4_4, net.minecraft.w.d.m);
                }
                v4 = var1_1;
                if (var5_5) break block36;
                v3 = v4.aq() ? 1 : 0;
            }
            if (v3 != 0) return var8_8.b();
            v4 = var1_1;
        }
        ((net.minecraft.i.k)v4).a(var1_1.cu);
        return var8_8.b();
    }

    public boolean c() {
        return this.h.e();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(n var1_1, aA var2_2) {
        block22: {
            block21: {
                block19: {
                    block20: {
                        var3_3 = net.minecraft.a.k.q();
                        v0 = this;
                        if (!var3_3) {
                            if (v0.d()) {
                                v1 = this.j.a(null, var1_1, var2_2);
                                if (!var3_3) {
                                    if (v1 != false) return;
                                    v1 = this.c(var1_1);
                                }
                                if (var3_3 == false) return;
                            }
                            v0 = this;
                        }
                        var4_4 = v0.j.d(var1_1);
                        var5_5 = var4_4.b();
                        v2 = this.h.d();
                        if (var3_3) break block19;
                        if (!v2) break block20;
                        v3 = this;
                        if (!var3_3) {
                            if (v3.h == s.SPECTATOR) {
                                return;
                            }
                            v3 = this;
                        }
                        v2 = v3.i.E();
                        if (var3_3) break block19;
                        if (!v2) {
                            var6_6 = this.i.av();
                            v2 = var6_6.G();
                            if (!var3_3) {
                                if (v2) {
                                    return;
                                }
                                v2 = var6_6.a(var5_5);
                            }
                            if (!var3_3) {
                                if (!v2) {
                                    return;
                                } else {
                                    ** GOTO lbl35
                                }
                            } else {
                                ** GOTO lbl34
                            }
                        }
                        break block20;
lbl34:
                        // 2 sources

                        break block19;
                    }
                    v2 = this.j.a(null, var1_1, var2_2);
                }
                this.d = this.a;
                var6_7 = 1.0f;
                v4 = var4_4.o();
                v5 = net.minecraft.ac.c.A;
                if (!var3_3) {
                    if (v4 != v5) {
                        var5_5.a(this.j, var1_1, this.i);
                        var6_7 = var4_4.a(this.i, this.i.aG, var1_1);
                    }
                    v4 = var4_4.o();
                    v5 = net.minecraft.ac.c.A;
                }
                if (v4 == v5) break block21;
                cfr_temp_0 = var6_7 - 1.0f;
                v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var3_3) break block22;
                if (v6 >= 0) {
                    this.c(var1_1);
                    if (var3_3 == false) return;
                }
            }
            this.c = true;
            this.e = var1_1;
            v6 = (int)(var6_7 * 10.0f);
        }
        var7_8 = v6;
        this.j.c(this.i.W(), var1_1, (int)var7_8);
        this.b = (int)var7_8;
    }

    public void a(s s2) {
        this.h = s2;
        s2.a(this.i.cw);
        this.i.l();
        this.i.c3.O().a(new net.minecraft.Q.aX(v.UPDATE_GAME_MODE, this.i));
        this.j.l();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aX a(j var1_1, z var2_2, d var3_3, a3 var4_4, n var5_5, aA var6_6, float var7_7, float var8_8, float var9_9) {
        block34: {
            block35: {
                block33: {
                    block32: {
                        block26: {
                            block27: {
                                block28: {
                                    block29: {
                                        block30: {
                                            block31: {
                                                var10_10 = net.minecraft.a.k.t();
                                                if (this.h != s.SPECTATOR) break block26;
                                                var11_11 = var2_2.b(var5_5);
                                                v0 = var11_11 instanceof l;
                                                if (!var10_10) break block27;
                                                if (!v0) break block28;
                                                var12_14 = var2_2.d(var5_5).b();
                                                v1 = var13_16 = (l)var11_11;
                                                if (!var10_10) break block29;
                                                if (!(v1 instanceof O)) break block30;
                                                v2 = var12_14;
                                                if (!var10_10) break block31;
                                                if (!(v2 instanceof az)) break block30;
                                                v2 = var12_14;
                                            }
                                            var13_16 = ((az)v2).g(var2_2, var5_5);
                                        }
                                        v1 = var13_16;
                                    }
                                    if (v1 != null) {
                                        var1_1.a(var13_16);
                                        return aX.SUCCESS;
                                    }
                                    if (var10_10 != false) return aX.PASS;
                                }
                                v0 = var11_11 instanceof a;
                            }
                            if (v0 == false) return aX.PASS;
                            var1_1.a((a)var11_11);
                            return aX.SUCCESS;
                        }
                        v3 = var1_1.a4();
                        if (!var10_10) break block32;
                        if (v3 == 0) ** GOTO lbl-1000
                        v3 = var1_1.av().G();
                    }
                    if (!var10_10) break block33;
                    if (v3 != 0) {
                        v3 = var1_1.b().G();
                        if (var10_10) {
                            ** if (v3 == 0) goto lbl-1000
                        } else {
                            ** GOTO lbl42
                        }
                    }
                    ** GOTO lbl-1000
lbl42:
                    // 2 sources

                    break block33;
lbl-1000:
                    // 2 sources

                    {
                        var11_12 = var2_2.d(var5_5);
                        v3 = var11_12.b().a(var2_2, var5_5, (i)var11_12, var1_1, var4_4, var6_6, var7_7, var8_8, var9_9) ? 1 : 0;
                        if (var10_10) {
                            if (v3 != 0) {
                                return aX.SUCCESS;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                        ** GOTO lbl50
                    }
lbl-1000:
                    // 4 sources

                    {
                        v3 = var3_3.G();
                    }
                }
                if (var10_10) {
                    if (v3 != 0) {
                        return aX.PASS;
                    }
                    v3 = var1_1.o().c(var3_3.w());
                }
                if (var10_10) {
                    if (v3 != 0) {
                        return aX.PASS;
                    }
                    v3 = var3_3.w() instanceof net.minecraft.w.s;
                }
                if (!var10_10) break block34;
                if (v3 == 0) break block35;
                v3 = var1_1.b();
                if (!var10_10) break block34;
                if (v3 == 0) {
                    var11_12 = ((net.minecraft.w.s)var3_3.w()).a();
                    v3 = var11_12 instanceof a0;
                    if (var10_10) {
                        if (v3 != 0) return aX.FAIL;
                        v3 = var11_12 instanceof aj;
                    }
                    if (var10_10) {
                        if (v3 != 0) {
                            return aX.FAIL;
                        } else {
                            ** GOTO lbl74
                        }
                    } else {
                        ** GOTO lbl73
                    }
                }
                break block35;
lbl73:
                // 2 sources

                break block34;
            }
            v3 = this.d();
        }
        if (var10_10) {
            if (v3 == 0) return var3_3.a(var1_1, var2_2, var5_5, var4_4, var6_6, var7_7, var8_8, var9_9);
            v3 = var3_3.d();
        }
        var11_13 = v3;
        var12_15 = var3_3.t();
        var13_17 = var3_3.a(var1_1, var2_2, var5_5, var4_4, var6_6, var7_7, var8_8, var9_9);
        var3_3.a(var11_13);
        var3_3.c(var12_15);
        return var13_17;
    }

    public boolean d() {
        return this.h.b();
    }

    public void a(n n2) {
        block3: {
            block7: {
                p p2;
                float f10;
                block5: {
                    boolean bl2;
                    block6: {
                        i i2;
                        int n3;
                        block4: {
                            i i3;
                            int n4;
                            block2: {
                                bl2 = net.minecraft.a.k.t();
                                n4 = n2.equals(this.e);
                                if (!bl2) break block2;
                                if (n4 == 0) break block3;
                                n4 = this.a - this.d;
                            }
                            n3 = n4;
                            i2 = i3 = this.j.d(n2);
                            if (!bl2) break block4;
                            if (i2.o() == net.minecraft.ac.c.A) break block3;
                            i2 = i3;
                        }
                        float f11 = i2.a(this.i, this.i.aG, n2) * (float)(n3 + 1);
                        float f12 = f11 - 0.7f;
                        f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        if (!bl2) break block5;
                        if (f10 < 0) break block6;
                        this.c = false;
                        this.j.c(this.i.W(), n2, -1);
                        this.c(n2);
                        if (bl2) break block3;
                    }
                    p2 = this;
                    if (!bl2) break block7;
                    f10 = (float)p2.k;
                }
                if (f10 != false) break block3;
                this.c = false;
                this.k = true;
                this.g = n2;
                p2 = this;
            }
            p2.f = this.d;
        }
    }

    public void b(s s2) {
        boolean bl2 = net.minecraft.a.k.q();
        p p2 = this;
        if (!bl2) {
            if (p2.h == s.NOT_SET) {
                this.h = s2;
            }
            p2 = this;
        }
        p2.a(this.h);
    }
}

