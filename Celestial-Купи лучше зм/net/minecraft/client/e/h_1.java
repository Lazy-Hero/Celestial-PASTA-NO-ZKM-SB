/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.client.E;

import io.netty.buffer.Unpooled;
import net.minecraft.C.m;
import net.minecraft.C.u;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.a0;
import net.minecraft.W.aj;
import net.minecraft.ac.c;
import net.minecraft.ag.D;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.az.k;
import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import net.minecraft.client.e.y;
import net.minecraft.d.E;
import net.minecraft.d.F;
import net.minecraft.d.I;
import net.minecraft.d.N;
import net.minecraft.d.a;
import net.minecraft.d.e;
import net.minecraft.d.r;
import net.minecraft.d.t;
import net.minecraft.d.v;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.g;
import net.minecraft.l.i;
import net.minecraft.w.a_;
import net.minecraft.w.d;

public class h {
    private /* synthetic */ float c;
    private final /* synthetic */ Q j;
    private /* synthetic */ d f;
    private final /* synthetic */ net.minecraft.client.o.j b;
    private /* synthetic */ s e;
    private /* synthetic */ boolean h;
    public /* synthetic */ float g;
    private /* synthetic */ int i;
    public /* synthetic */ int d;
    private /* synthetic */ n a;

    public void a(d d10) {
        block2: {
            boolean bl2;
            block1: {
                String string = l.d();
                bl2 = this.e.b();
                if (string != null) break block1;
                if (!bl2) break block2;
                bl2 = d10.G();
            }
            if (!bl2) {
                this.b.a(new E(-1, d10));
            }
        }
    }

    public boolean a() {
        String string = l.d();
        boolean bl2 = this.e.b();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public d a(int n2, int n3, int n4, net.minecraft.B.h h2, j j2) {
        short s2 = j2.cm.a(j2.cB);
        d d10 = j2.cm.a(n3, n4, h2, j2);
        this.b.a(new a(n2, n3, n4, h2, d10, s2));
        return d10;
    }

    public aX a(j j2, x x2, a3 a32) {
        this.e();
        this.b.a(new net.minecraft.d.g(x2, a32));
        return this.e == s.SPECTATOR ? aX.PASS : j2.a(x2, a32);
    }

    public static void a(Q q2, h h2, n n2, aA aA2) {
        String string = l.d();
        boolean bl2 = q2.e.a(q2.s, n2, aA2);
        if (string == null && !bl2) {
            bl2 = h2.b(n2);
        }
    }

    public aX a(j j2, z z2, a3 a32) {
        net.minecraft.ar.t<d> t2;
        block6: {
            d d10;
            block5: {
                d d11;
                int n2;
                block4: {
                    String string = l.d();
                    h h2 = this;
                    if (string == null) {
                        if (h2.e == s.SPECTATOR) {
                            return aX.PASS;
                        }
                        this.e();
                        h2 = this;
                    }
                    h2.b.a(new t(a32));
                    d d12 = j2.c(a32);
                    int n3 = j2.o().c(d12.w());
                    if (string == null) {
                        if (n3 != 0) {
                            return aX.PASS;
                        }
                        n3 = d12.t();
                    }
                    n2 = n3;
                    t2 = d12.a(z2, j2, a32);
                    d11 = d10 = t2.a();
                    if (string != null) break block4;
                    if (d11 != d12) break block5;
                    d11 = d10;
                }
                if (d11.t() == n2) break block6;
            }
            j2.a(a32, d10);
        }
        return t2.b();
    }

    public void d() {
        block4: {
            u u2;
            block2: {
                block3: {
                    String string = l.d();
                    this.e();
                    String string2 = string;
                    u2 = this.b.e();
                    if (string2 != null) break block2;
                    if (!u2.j()) break block3;
                    this.b.e().i();
                    if (string2 == null) break block4;
                }
                u2 = this.b.e();
            }
            u2.e();
        }
    }

    public boolean h() {
        return this.e == s.SPECTATOR;
    }

    public boolean n() {
        return this.e.e();
    }

    public aX a(j j2, x x2, net.minecraft.k.i i2, a3 a32) {
        this.e();
        net.minecraft.k.l l2 = new net.minecraft.k.l(i2.c.e - x2.a, i2.c.d - x2.aF, i2.c.b - x2.ax);
        this.b.a(new net.minecraft.d.g(x2, a32, l2));
        return this.e == s.SPECTATOR ? aX.PASS : x2.a(j2, l2, a32);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        String string = l.d();
        boolean bl2 = this.j.s.N();
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.j.s.as() instanceof D;
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public boolean b() {
        return this.h;
    }

    public void c(j j2) {
        j2.e = -180.0f;
    }

    public boolean c() {
        return this.e.e();
    }

    public void a(j j2) {
        this.e.a(j2.cw);
    }

    /*
     * Exception decompiling
     */
    private boolean a(n var1_1) {
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

    public void a(j j2, x x2) {
        block3: {
            block2: {
                ft ft2 = new ft(x2);
                String string = l.d();
                af.a(ft2);
                String string2 = string;
                this.e();
                this.b.a(new net.minecraft.d.g(x2));
                if (string2 != null) break block2;
                if (this.e == s.SPECTATOR) break block3;
                j2.b(x2);
            }
            j2.u();
        }
    }

    public void m() {
        block3: {
            h h2;
            block2: {
                String string = l.d();
                h2 = this;
                if (string != null) break block2;
                if (!h2.h) break block3;
                this.j.aI().a(this.j.e, this.a, this.j.e.d(this.a), -1.0f);
                this.b.a(new F(r.ABORT_DESTROY_BLOCK, this.a, aA.DOWN));
                this.h = false;
                this.g = 0.0f;
                this.j.e.c(this.j.s.W(), this.a, -1);
                h2 = this;
            }
            h2.j.s.u();
        }
    }

    public net.minecraft.client.q.c a(z z2, g g10, i i2) {
        return new net.minecraft.client.q.c(this.j, z2, this.b, g10, i2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(int n2, k k2, boolean bl2, j j2) {
        this.b.a(new N(n2, k2, bl2));
    }

    public s i() {
        return this.e;
    }

    public void b(j j2) {
        this.e();
        this.b.a(new F(r.RELEASE_USE_ITEM, n.o, aA.DOWN));
        j2.ap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(n var1_1, aA var2_2) {
        v0 = l.d();
        this.e();
        var3_3 = v0;
        v1 = this.d--;
        if (var3_3 == null) {
            if (v1 > 0) {
                return true;
            }
            v1 = this.e.b() ? 1 : 0;
        }
        if (var3_3 == null) {
            if (v1 != 0) {
                v1 = this.j.e.O().a(var1_1);
                if (var3_3 == null) {
                    if (v1 != 0) {
                        this.d = 5;
                        this.j.aI().a(this.j.e, var1_1, this.j.e.d(var1_1), 1.0f);
                        this.b.a(new F(r.START_DESTROY_BLOCK, var1_1, var2_2));
                        net.minecraft.client.E.h.a(this.j, this, var1_1, var2_2);
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.a(var1_1);
            }
        }
        if (var3_3 != null) return (boolean)v1;
        if (v1 == 0) {
            v1 = this.b(var1_1, var2_2);
            return (boolean)v1;
        }
        var4_4 = this.j.e.d(var1_1);
        var5_5 = var4_4.b();
        if (var3_3 == null) {
            if (var4_4.o() == net.minecraft.ac.c.A) {
                this.h = false;
                return false;
            }
            this.g += var4_4.a(this.j.s, this.j.s.aG, var1_1);
        }
        v2 = (cfr_temp_0 = this.c % 4.0f - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var3_3 == null) {
            if (v2 == false) {
                var6_6 = var5_5.l();
                this.j.p().c(new y(var6_6.f(), ay.NEUTRAL, (var6_6.c() + 1.0f) / 8.0f, var6_6.e() * 0.5f, var1_1));
            }
            this.c += 1.0f;
            this.j.aI().a(this.j.e, var1_1, var4_4, net.minecraft.k.h.c(this.g, 0.0f, 1.0f));
            cfr_temp_1 = this.g - 1.0f;
            v2 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
        }
        if (var3_3 != null) return (boolean)v2;
        if (v2 >= 0) {
            this.h = false;
            this.b.a(new F(r.STOP_DESTROY_BLOCK, var1_1, var2_2));
            this.b(var1_1);
            this.g = 0.0f;
            this.c = 0.0f;
            this.d = 5;
        }
        this.j.e.c(this.j.s.W(), this.a, (int)(this.g * 10.0f) - 1);
        v2 = (float)true;
        return (boolean)v2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean b(n var1_1) {
        block30: {
            block28: {
                block29: {
                    block27: {
                        block25: {
                            block26: {
                                block23: {
                                    block24: {
                                        var2_2 = l.d();
                                        v0 = this.e.d();
                                        if (var2_2 != null) break block23;
                                        if (!v0) break block24;
                                        v1 = this;
                                        if (var2_2 == null) {
                                            if (v1.e == s.SPECTATOR) {
                                                return false;
                                            }
                                            v1 = this;
                                        }
                                        v0 = v1.j.s.E();
                                        if (var2_2 != null) break block23;
                                        if (!v0) {
                                            var3_3 = this.j.s.av();
                                            v0 = var3_3.G();
                                            if (var2_2 == null) {
                                                if (v0) {
                                                    return false;
                                                }
                                                v0 = var3_3.a(this.j.e.d(var1_1).b());
                                            }
                                            if (var2_2 == null) {
                                                if (!v0) {
                                                    return false;
                                                } else {
                                                    ** GOTO lbl24
                                                }
                                            } else {
                                                ** GOTO lbl23
                                            }
                                        }
                                        break block24;
lbl23:
                                        // 2 sources

                                        break block23;
                                    }
                                    v2 = this;
                                    if (var2_2 != null) break block25;
                                    v0 = v2.e.b();
                                }
                                if (!v0) break block26;
                                v3 = this.j;
                                if (var2_2 != null) break block27;
                                if (!v3.s.av().G()) {
                                    v3 = this.j;
                                    if (var2_2 == null) {
                                        if (v3.s.av().w() instanceof a_) {
                                            return false;
                                        } else {
                                            ** GOTO lbl39
                                        }
                                    } else {
                                        ** GOTO lbl38
                                    }
                                }
                                break block26;
lbl38:
                                // 2 sources

                                break block27;
                            }
                            v2 = this;
                        }
                        v3 = v2.j;
                    }
                    var3_3 = v3.e;
                    var4_4 = var3_3.d(var1_1);
                    var5_5 = var4_4.b();
                    v4 = var5_5 instanceof a0;
                    if (var2_2 != null) break block28;
                    if (v4) break block29;
                    v4 = var5_5 instanceof aj;
                    if (var2_2 != null) break block28;
                    if (!v4) break block30;
                }
                v4 = this.j.s.b();
            }
            if (var2_2 != null) return v4;
            if (!v4) {
                return false;
            }
        }
        if (var4_4.o() == net.minecraft.ac.c.A) {
            return false;
        }
        var3_3.b(2001, var1_1, K.l(var4_4));
        var5_5.a((z)var3_3, var1_1, var4_4, this.j.s);
        v5 = var6_6 = var3_3.a(var1_1, net.minecraft.u.g.bf.d(), 11);
        if (var2_2 == null) {
            if (v5) {
                var5_5.d((z)var3_3, var1_1, var4_4);
            }
            this.a = new n(this.a.e(), -1, this.a.a());
            v5 = this.e.b();
        }
        if (var2_2 != null) return v5;
        if (!v5) {
            var7_7 = this.j.s.av();
            v5 = var7_7.G();
            if (var2_2 != null) return v5;
            if (!v5) {
                var7_7.a((z)var3_3, var4_4, var1_1, this.j.s);
                v5 = var7_7.G();
                if (var2_2 != null) return v5;
                if (v5) {
                    this.j.s.a(a3.MAIN_HAND, net.minecraft.w.d.m);
                }
            }
        }
        v5 = var6_6;
        return v5;
    }

    public void a(int n2) {
        this.b.a(new net.minecraft.d.h("MC|PickItem", new m(Unpooled.buffer()).d(n2)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aX a(net.minecraft.client.q.c var1_1, l var2_2, n var3_3, aA var4_4, net.minecraft.k.l var5_5, a3 var6_6) {
        block35: {
            block36: {
                block34: {
                    block33: {
                        block27: {
                            block28: {
                                block31: {
                                    block32: {
                                        block29: {
                                            block30: {
                                                this.e();
                                                var8_7 = var1_1.c(var6_6);
                                                var9_8 = (float)(var5_5.e - (double)var3_3.e());
                                                var10_9 = (float)(var5_5.d - (double)var3_3.b());
                                                var11_10 = (float)(var5_5.b - (double)var3_3.a());
                                                var7_11 = l.d();
                                                var12_12 = false;
                                                v0 = this;
                                                if (var7_11 == null) {
                                                    if (!v0.j.e.O().a(var3_3)) {
                                                        return aX.FAIL;
                                                    }
                                                    v0 = this;
                                                }
                                                if (var7_11 != null) break block27;
                                                if (v0.e == s.SPECTATOR) break block28;
                                                var13_13 = var2_2.d(var3_3);
                                                v1 = var1_1.a4();
                                                if (var7_11 != null) break block29;
                                                if (!v1) break block30;
                                                v1 = var1_1.av().G();
                                                if (var7_11 != null) break block31;
                                                if (!v1) break block32;
                                                v1 = var1_1.b().G();
                                                if (var7_11 != null) break block31;
                                                if (!v1) break block32;
                                            }
                                            v1 = var13_13.b().a(var2_2, var3_3, (net.minecraft.Z.i)var13_13, var1_1, var6_6, var4_4, var9_8, var10_9, var11_10);
                                        }
                                        if (var7_11 != null) break block31;
                                        if (v1) {
                                            var12_12 = true;
                                        }
                                    }
                                    v1 = var12_12;
                                }
                                if (var7_11 != null) break block33;
                                if (v1) break block28;
                                v1 = var8_7.w() instanceof net.minecraft.w.s;
                                if (var7_11 != null) break block33;
                                if (v1) {
                                    var14_15 = (net.minecraft.w.s)var8_7.w();
                                    v1 = var14_15.a(var2_2, var3_3, var4_4, var1_1, var8_7);
                                    if (var7_11 == null) {
                                        if (!v1) {
                                            return aX.FAIL;
                                        } else {
                                            ** GOTO lbl46
                                        }
                                    } else {
                                        ** GOTO lbl45
                                    }
                                }
                                break block28;
lbl45:
                                // 2 sources

                                break block33;
                            }
                            v0 = this;
                        }
                        if (var7_11 != null) break block34;
                        v0.b.a(new v(var3_3, var4_4, var6_6, var9_8, var10_9, var11_10));
                        v1 = var12_12;
                    }
                    if (v1 != false) return aX.SUCCESS;
                    v0 = this;
                }
                if (v0.e == s.SPECTATOR) return aX.SUCCESS;
                v2 = var8_7.G();
                if (var7_11 == null) {
                    if (v2 != 0) {
                        return aX.PASS;
                    }
                    v2 = var1_1.o().c(var8_7.w());
                }
                if (var7_11 == null) {
                    if (v2 != 0) {
                        return aX.PASS;
                    }
                    v2 = var8_7.w() instanceof net.minecraft.w.s;
                }
                if (var7_11 != null) break block35;
                if (v2 == 0) break block36;
                v2 = var1_1.b();
                if (var7_11 != null) break block35;
                if (v2 == 0) {
                    var13_13 = ((net.minecraft.w.s)var8_7.w()).a();
                    v2 = var13_13 instanceof a0;
                    if (var7_11 == null) {
                        if (v2 != 0) return aX.FAIL;
                        v2 = var13_13 instanceof aj;
                    }
                    if (var7_11 == null) {
                        if (v2 != 0) {
                            return aX.FAIL;
                        } else {
                            ** GOTO lbl81
                        }
                    } else {
                        ** GOTO lbl80
                    }
                }
                break block36;
lbl80:
                // 2 sources

                break block35;
            }
            v2 = this.e.b();
        }
        if (var7_11 == null) {
            if (v2 == 0) return var8_7.a(var1_1, var2_2, var3_3, var6_6, var4_4, var9_8, var10_9, var11_10);
            v2 = var8_7.d();
        }
        var13_14 = v2;
        var14_16 = var8_7.t();
        var15_17 = var8_7.a(var1_1, var2_2, var3_3, var6_6, var4_4, var9_8, var10_9, var11_10);
        var8_7.a(var13_14);
        var8_7.c(var14_16);
        return var15_17;
    }

    public float g() {
        return this.e.b() ? 5.0f : 4.5f;
    }

    public void e() {
        block3: {
            block2: {
                int n2 = this.j.s.cB.a;
                String string = l.d();
                if (string != null) break block2;
                if (n2 == this.i) break block3;
                this.i = n2;
            }
            this.b.a(new I(this.i));
        }
    }

    public boolean k() {
        return this.e.b();
    }

    public boolean f() {
        return this.e.b();
    }

    public void a(int n2, int n3) {
        this.b.a(new e(n2, n3));
    }

    public void a(s s2) {
        this.e = s2;
        this.e.a(this.j.s.cw);
    }

    public boolean j() {
        return this.e == s.SPECTATOR;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean b(n var1_1, aA var2_2) {
        block39: {
            block40: {
                block38: {
                    block36: {
                        block37: {
                            block35: {
                                block34: {
                                    block32: {
                                        block33: {
                                            var3_3 = l.d();
                                            v0 = this.e.d();
                                            if (var3_3 != null) break block32;
                                            if (!v0) break block33;
                                            v1 = this;
                                            if (var3_3 == null) {
                                                if (v1.e == s.SPECTATOR) {
                                                    return false;
                                                }
                                                v1 = this;
                                            }
                                            v0 = v1.j.s.E();
                                            if (var3_3 != null) break block32;
                                            if (!v0) {
                                                var4_4 = this.j.s.av();
                                                v0 = var4_4.G();
                                                if (var3_3 == null) {
                                                    if (v0) {
                                                        return false;
                                                    }
                                                    v0 = var4_4.a(this.j.e.d(var1_1).b());
                                                }
                                                if (var3_3 == null) {
                                                    if (!v0) {
                                                        return false;
                                                    } else {
                                                        ** GOTO lbl24
                                                    }
                                                } else {
                                                    ** GOTO lbl23
                                                }
                                            }
                                            break block33;
lbl23:
                                            // 2 sources

                                            break block32;
                                        }
                                        v0 = this.j.e.O().a(var1_1);
                                    }
                                    if (var3_3 == null) {
                                        if (!v0) {
                                            return false;
                                        }
                                        v0 = this.e.b();
                                    }
                                    if (var3_3 == null) {
                                        if (v0) {
                                            this.j.aI().a(this.j.e, var1_1, this.j.e.d(var1_1), 1.0f);
                                            this.b.a(new F(r.START_DESTROY_BLOCK, var1_1, var2_2));
                                            net.minecraft.client.E.h.a(this.j, this, var1_1, var2_2);
                                            this.d = 5;
                                            if (var3_3 == null) return true;
                                        }
                                        v0 = this.h;
                                    }
                                    if (var3_3 != null) break block34;
                                    if (v0) {
                                        v2 = this.a(var1_1);
                                        if (var3_3 != null) return v2;
                                        if (v2 != false) return true;
                                    }
                                    v3 = this;
                                    if (var3_3 != null) break block35;
                                    v0 = v3.h;
                                }
                                if (v0) {
                                    this.b.a(new F(r.ABORT_DESTROY_BLOCK, this.a, var2_2));
                                }
                                v3 = this;
                            }
                            var4_4 = v3.j.e.d(var1_1);
                            this.j.aI().a(this.j.e, var1_1, (net.minecraft.Z.i)var4_4, 0.0f);
                            this.b.a(new F(r.START_DESTROY_BLOCK, var1_1, var2_2));
                            v4 = var5_5 = var4_4.o() != net.minecraft.ac.c.A ? 1 : 0;
                            if (var3_3 != null) break block36;
                            if (v4 == 0) break block37;
                            cfr_temp_0 = this.g - 0.0f;
                            v4 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var3_3 != null) break block36;
                            if (v4 == 0) {
                                var4_4.b().a((z)this.j.e, var1_1, this.j.s);
                            }
                        }
                        v4 = var5_5;
                    }
                    if (var3_3 != null) break block38;
                    if (v4 == 0) break block39;
                    cfr_temp_1 = var4_4.a(this.j.s, this.j.s.aG, var1_1) - 1.0f;
                    v4 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                }
                if (var3_3 != null) break block40;
                if (v4 < 0) break block39;
                v4 = this.b(var1_1) ? 1 : 0;
            }
            if (var3_3 == null) return true;
        }
        this.h = true;
        this.a = var1_1;
        this.f = this.j.s.av();
        this.g = 0.0f;
        this.c = 0.0f;
        this.j.e.c(this.j.s.W(), this.a, (int)(this.g * 10.0f) - 1);
        return true;
    }

    public h(Q q2, net.minecraft.client.o.j j2) {
        this.a = new n(-1, -1, -1);
        this.f = net.minecraft.w.d.m;
        this.e = s.SURVIVAL;
        this.j = q2;
        this.b = j2;
    }

    public void a(d d10, int n2) {
        block3: {
            h h2;
            block2: {
                String string = l.d();
                h2 = this;
                if (string != null) break block2;
                if (!h2.e.b()) break block3;
                h2 = this;
            }
            h2.b.a(new E(n2, d10));
        }
    }
}

