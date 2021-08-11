/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.awt.Color;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.y.b;
import net.minecraft.k.h;

public abstract class aL {
    protected /* synthetic */ int m;
    protected final /* synthetic */ Q u;
    protected /* synthetic */ boolean p;
    protected /* synthetic */ boolean b;
    protected /* synthetic */ long c;
    protected /* synthetic */ int t;
    protected /* synthetic */ float r;
    protected /* synthetic */ boolean l;
    protected /* synthetic */ int e;
    protected final /* synthetic */ int a;
    protected /* synthetic */ float f;
    protected /* synthetic */ int v;
    protected /* synthetic */ int s;
    protected /* synthetic */ int k;
    protected /* synthetic */ int o;
    protected /* synthetic */ boolean g;
    private /* synthetic */ int h;
    private /* synthetic */ int j;
    protected /* synthetic */ int i;
    protected /* synthetic */ int q;
    protected /* synthetic */ int n;
    private /* synthetic */ boolean w;
    protected /* synthetic */ int d;

    public void a(int n2, int n3, int n4, int n5) {
        this.k = n2;
        this.d = n3;
        this.s = n4;
        this.o = n5;
        this.e = 0;
        this.v = n2;
    }

    protected void a(int n2, int n3, int n4, int n5, float f10) {
        int n6 = this.d();
        W w2 = W.c();
        I i2 = w2.b();
        String[] arrstring = net.minecraft.client.b.q.b();
        for (int i3 = 0; i3 < n6; ++i3) {
            int n7;
            int n8;
            int n9;
            block13: {
                block14: {
                    block11: {
                        block12: {
                            block10: {
                                int n10;
                                block9: {
                                    n9 = n3 + i3 * this.a + this.m;
                                    n8 = this.a - 4;
                                    n7 = n9;
                                    n10 = this.o;
                                    if (arrstring == null) break block9;
                                    if (n7 > n10) break block10;
                                    n7 = n9 + n8;
                                    if (arrstring == null) break block11;
                                    n10 = this.s;
                                }
                                if (n7 >= n10) break block12;
                            }
                            this.a(i3, n2, n9, f10);
                        }
                        n7 = this.l ? 1 : 0;
                    }
                    if (arrstring == null) break block13;
                    if (n7 == 0) break block14;
                    n7 = this.a(i3) ? 1 : 0;
                    if (arrstring == null) break block13;
                    if (n7 != 0) {
                        int n11 = this.e + (this.k / 2 - this.j() / 2);
                        int n12 = this.e + this.k / 2 + this.j() / 2;
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        net.minecraft.client.a.v.L();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n11, (double)(n9 + n8 + 2), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n12, (double)(n9 + n8 + 2), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n12, (double)(n9 - 2), 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                        i2.c((double)n11, (double)(n9 - 2), 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                        i2.c((double)(n11 + 1), (double)(n9 + n8 + 1), 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)(n12 - 1), (double)(n9 + n8 + 1), 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)(n12 - 1), (double)(n9 - 1), 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                        i2.c((double)(n11 + 1), (double)(n9 - 1), 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                        w2.a();
                        net.minecraft.client.a.v.x();
                    }
                }
                n7 = n9;
            }
            int n13 = this.s - this.a;
            if (arrstring != null) {
                if (n7 < n13) continue;
                n7 = n9;
                n13 = this.o;
            }
            if (n7 > n13) continue;
            this.a(i3, n2, n9, n8, n4, n5, f10);
            if (arrstring != null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public void f() {
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

    protected void a(int n2, int n3, int n4, float f10) {
    }

    protected void b(int n2, int n3, int n4, int n5) {
        W w2 = W.c();
        I i2 = w2.b();
        this.u.aN().b(net.minecraft.client.b.q.f);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        float f10 = 32.0f;
        i2.a(7, net.minecraft.client.y.b.t);
        i2.c((double)this.e, (double)n3, 0.0).a(0.0, (float)n3 / 32.0f).b(64, 64, 64, n5).d();
        i2.c((double)(this.e + this.k), (double)n3, 0.0).a((float)this.k / 32.0f, (float)n3 / 32.0f).b(64, 64, 64, n5).d();
        i2.c((double)(this.e + this.k), (double)n2, 0.0).a((float)this.k / 32.0f, (float)n2 / 32.0f).b(64, 64, 64, n4).d();
        i2.c((double)this.e, (double)n2, 0.0).a(0.0, (float)n2 / 32.0f).b(64, 64, 64, n4).d();
        w2.a();
    }

    public int i() {
        return this.a;
    }

    protected void b(int n2, int n3) {
    }

    public void c(int n2) {
        this.e = n2;
        this.v = n2 + this.k;
    }

    public int g() {
        return (int)this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c(int n2, int n3) {
        int n4;
        String[] arrstring;
        int n5;
        int n6;
        block7: {
            int n7;
            block6: {
                int n8 = this.e + this.k / 2 - this.j() / 2;
                int n9 = this.e + this.k / 2 + this.j() / 2;
                n6 = n3 - this.s - this.m + (int)this.f - 4;
                n5 = n6 / this.a;
                arrstring = net.minecraft.client.b.q.b();
                n4 = n2;
                n7 = this.h();
                if (arrstring != null) {
                    if (n4 >= n7) return -1;
                    n4 = n2;
                    n7 = n8;
                }
                if (arrstring == null) break block6;
                if (n4 < n7) return -1;
                n4 = n2;
                if (arrstring == null) break block7;
                n7 = n9;
            }
            if (n4 > n7) return -1;
            n4 = n5;
        }
        if (arrstring != null) {
            if (n4 < 0) return -1;
            n4 = n6;
        }
        if (arrstring != null) {
            if (n4 < 0) return -1;
            n4 = n5;
        }
        if (arrstring == null) return n4;
        if (n4 >= this.d()) return -1;
        n4 = n5;
        return n4;
    }

    protected abstract boolean a(int var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        int n4 = this.s;
        if (arrstring != null) {
            if (n3 < n4) return 0 != 0;
            n3 = n2;
            n4 = this.o;
        }
        if (arrstring != null) {
            if (n3 > n4) return 0 != 0;
            n3 = this.i;
            n4 = this.e;
        }
        if (arrstring != null) {
            if (n3 < n4) return 0 != 0;
            n3 = this.i;
            if (arrstring == null) return n3 != 0;
            n4 = this.v;
        }
        if (n3 > n4) return 0 != 0;
        return 1 != 0;
    }

    protected void a(W w2) {
        I i2 = w2.b();
        this.u.aN().b(net.minecraft.client.b.q.f);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        float f10 = 32.0f;
        i2.a(7, net.minecraft.client.y.b.t);
        i2.c((double)this.e, (double)this.o, 0.0).a((float)this.e / 32.0f, (float)(this.o + (int)this.f) / 32.0f).b(32, 32, 32, 255).d();
        i2.c((double)this.v, (double)this.o, 0.0).a((float)this.v / 32.0f, (float)(this.o + (int)this.f) / 32.0f).b(32, 32, 32, 255).d();
        i2.c((double)this.v, (double)this.s, 0.0).a((float)this.v / 32.0f, (float)(this.s + (int)this.f) / 32.0f).b(32, 32, 32, 255).d();
        i2.c((double)this.e, (double)this.s, 0.0).a((float)this.e / 32.0f, (float)(this.s + (int)this.f) / 32.0f).b(32, 32, 32, 255).d();
        w2.a();
    }

    protected int h() {
        return this.k / 2 + 124;
    }

    protected void a(boolean bl2, int n2) {
        block3: {
            int n3;
            block2: {
                this.p = bl2;
                String[] arrstring = net.minecraft.client.b.q.b();
                aL aL2 = this;
                n3 = n2;
                if (arrstring == null) break block2;
                aL2.m = n3;
                if (bl2) break block3;
                aL2 = this;
                n3 = 0;
            }
            aL2.m = n3;
        }
    }

    protected abstract void c();

    protected abstract int d();

    public void a(int n2, int n3) {
        this.j = n2;
        this.h = n3;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, float var7);

    public int j() {
        return 220;
    }

    public void a(boolean bl2) {
        this.l = bl2;
    }

    protected int a() {
        return this.d() * this.a + this.m;
    }

    public void b(int n2, int n3, float f10) {
        block10: {
            int n4;
            int n5;
            String[] arrstring;
            block9: {
                arrstring = net.minecraft.client.b.q.b();
                n5 = this.g;
                if (arrstring == null) break block9;
                if (n5 == 0) break block10;
                this.i = n2;
                this.q = n3;
                this.c();
                n5 = this.h();
            }
            int n6 = n5;
            int n7 = n6 + 6;
            this.b();
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.C();
            W w2 = W.c();
            I i2 = w2.b();
            this.a(w2);
            int n8 = this.e + this.k / 2 - this.j() / 2 + 2;
            int n9 = this.s + 4 - (int)this.f;
            int n10 = this.p;
            if (arrstring != null) {
                if (n10 != 0) {
                    this.a(n8, n9, w2);
                }
                this.a(n8, n9, n2, n3, f10);
                net.minecraft.client.a.v.n();
                this.b(0, this.s, 255, 255);
                this.b(this.o, this.d, 255, 255);
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ZERO, G.ONE);
                net.minecraft.client.a.v.v();
                net.minecraft.client.a.v.g(7425);
                net.minecraft.client.a.v.L();
                n10 = 4;
            }
            int n11 = n10;
            i2.a(7, net.minecraft.client.y.b.t);
            i2.c((double)this.e, (double)(this.s + 4), 0.0).a(0.0, 1.0).b(0, 0, 0, 0).d();
            i2.c((double)this.v, (double)(this.s + 4), 0.0).a(1.0, 1.0).b(0, 0, 0, 0).d();
            i2.c((double)this.v, (double)this.s, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
            i2.c((double)this.e, (double)this.s, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
            w2.a();
            i2.a(7, net.minecraft.client.y.b.t);
            i2.c((double)this.e, (double)this.o, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
            i2.c((double)this.v, (double)this.o, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
            i2.c((double)this.v, (double)(this.o - 4), 0.0).a(1.0, 0.0).b(0, 0, 0, 0).d();
            i2.c((double)this.e, (double)(this.o - 4), 0.0).a(0.0, 0.0).b(0, 0, 0, 0).d();
            w2.a();
            int n12 = n4 = this.k();
            if (arrstring != null) {
                if (n12 > 0) {
                    int n13 = (this.o - this.s) * (this.o - this.s) / this.a();
                    n13 = net.minecraft.k.h.c(n13, 32, this.o - this.s - 8);
                    int n14 = (int)this.f * (this.o - this.s - n13) / n4 + this.s;
                    if (arrstring != null) {
                        if (n14 < this.s) {
                            n14 = this.s;
                        }
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)this.o, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)n7, (double)this.o, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)n7, (double)this.s, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                        i2.c((double)n6, (double)this.s, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                        w2.a();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)(n14 + n13), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n7, (double)(n14 + n13), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n7, (double)n14, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                        i2.c((double)n6, (double)n14, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                        w2.a();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)(n14 + n13 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
                        i2.c((double)(n7 - 1), (double)(n14 + n13 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
                        i2.c((double)(n7 - 1), (double)n14, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
                        i2.c((double)n6, (double)n14, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
                    }
                    w2.a();
                }
                this.d(n2, n3);
                net.minecraft.client.a.v.x();
                n12 = 7424;
            }
            net.minecraft.client.a.v.g(n12);
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.f();
        }
    }

    protected abstract void a(int var1, boolean var2, int var3, int var4);

    protected void a(int n2, int n3, W w2) {
    }

    public aL(Q q2, int n2, int n3, int n4, int n5, int n6) {
        this.b = true;
        this.t = -2;
        this.n = -1;
        this.g = true;
        this.l = true;
        this.w = true;
        this.u = q2;
        this.k = n2;
        this.d = n3;
        this.s = n4;
        this.o = n5;
        this.a = n6;
        this.e = 0;
        this.v = n2;
    }

    public void a(int n2, int n3, float f10) {
        block10: {
            int n4;
            int n5;
            String[] arrstring;
            block9: {
                arrstring = net.minecraft.client.b.q.b();
                n5 = this.g;
                if (arrstring == null) break block9;
                if (n5 == 0) break block10;
                this.i = n2;
                this.q = n3;
                n5 = this.h();
            }
            int n6 = n5;
            int n7 = n6 + 6;
            this.b();
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.C();
            W w2 = W.c();
            I i2 = w2.b();
            l l2 = new l(this.u);
            dJ.a(-5.0, 0.0, l2.e() - -6, l2.a(), 0.5, new Color(44, 44, 44, 255).getRGB(), new Color(33, 33, 33, 255).getRGB(), true);
            dJ.a(1.0, 1.4, l2.e() - 1, (double)l2.a() - 1.7, 0.5, new Color(17, 17, 17, 255).getRGB(), new Color(33, 33, 33, 255).getRGB(), true);
            int n8 = this.e + this.k / 2 - this.j() / 2 + 2;
            int n9 = this.s + 4 - (int)this.f;
            int n10 = this.p;
            if (arrstring != null) {
                if (n10 != 0) {
                    this.a(n8, n9, w2);
                }
                this.a(n8, n9, n2, n3, f10);
                net.minecraft.client.a.v.n();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ZERO, G.ONE);
                net.minecraft.client.a.v.v();
                net.minecraft.client.a.v.g(7425);
                net.minecraft.client.a.v.L();
                n10 = this.k();
            }
            int n11 = n4 = n10;
            if (arrstring != null) {
                if (n11 > 0) {
                    int n12 = (this.o - this.s) * (this.o - this.s) / this.a();
                    n12 = net.minecraft.k.h.c(n12, 32, this.o - this.s - 8);
                    int n13 = (int)this.f * (this.o - this.s - n12) / n4 + this.s;
                    if (arrstring != null) {
                        if (n13 < this.s) {
                            n13 = this.s;
                        }
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)this.o, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)n7, (double)this.o, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)n7, (double)this.s, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                        i2.c((double)n6, (double)this.s, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                        w2.a();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)(n13 + n12), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n7, (double)(n13 + n12), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n7, (double)n13, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                        i2.c((double)n6, (double)n13, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                        w2.a();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)(n13 + n12 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
                        i2.c((double)(n7 - 1), (double)(n13 + n12 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
                        i2.c((double)(n7 - 1), (double)n13, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
                        i2.c((double)n6, (double)n13, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
                    }
                    w2.a();
                }
                this.d(n2, n3);
                net.minecraft.client.a.v.x();
                n11 = 7424;
            }
            net.minecraft.client.a.v.g(n11);
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.f();
        }
    }

    protected void d(int n2, int n3) {
    }

    protected void b() {
        this.f = net.minecraft.k.h.c(this.f, 0.0f, (float)this.k());
    }

    public void b(boolean bl2) {
        this.w = bl2;
    }

    public boolean e() {
        return this.w;
    }

    public void d(int n2) {
        this.f += (float)n2;
        this.b();
        this.t = -2;
    }

    public int k() {
        return Math.max(0, this.a() - (this.o - this.s - 4));
    }

    public void a(s s2) {
        block2: {
            int n2;
            int n3;
            block3: {
                block4: {
                    String[] arrstring;
                    block1: {
                        arrstring = net.minecraft.client.b.q.b();
                        n3 = s2.h;
                        if (arrstring == null) break block1;
                        if (n3 == 0) break block2;
                        n3 = s2.g;
                    }
                    n2 = this.j;
                    if (arrstring == null) break block3;
                    if (n3 != n2) break block4;
                    this.f -= (float)(this.a * 2 / 3);
                    this.t = -2;
                    this.b();
                    if (arrstring != null) break block2;
                }
                n3 = s2.g;
                n2 = this.h;
            }
            if (n3 == n2) {
                this.f += (float)(this.a * 2 / 3);
                this.t = -2;
                this.b();
            }
        }
    }
}

