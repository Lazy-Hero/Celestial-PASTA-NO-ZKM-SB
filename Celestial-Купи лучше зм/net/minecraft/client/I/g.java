/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.I;

import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Set;
import net.minecraft.B.D;
import net.minecraft.B.n;
import net.minecraft.at.l;
import net.minecraft.client.I.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.as;
import net.minecraft.client.b.L;
import net.minecraft.client.q.c;
import net.minecraft.k.h;
import net.minecraft.w.d;

public abstract class g
extends L {
    protected /* synthetic */ int F;
    private /* synthetic */ int P;
    private /* synthetic */ boolean K;
    private /* synthetic */ int Z;
    private /* synthetic */ D O;
    protected final /* synthetic */ Set<D> E;
    private /* synthetic */ D W;
    private /* synthetic */ int T;
    private /* synthetic */ d S;
    protected /* synthetic */ boolean y;
    private /* synthetic */ D A;
    private /* synthetic */ D Y;
    private /* synthetic */ int G;
    protected /* synthetic */ int H;
    private /* synthetic */ d V;
    public static final /* synthetic */ net.minecraft.ar.v N;
    private /* synthetic */ int R;
    private /* synthetic */ long I;
    private /* synthetic */ int z;
    private /* synthetic */ D D;
    private /* synthetic */ long U;
    private /* synthetic */ long Q;
    private /* synthetic */ boolean J;
    protected /* synthetic */ int M;
    public /* synthetic */ n X;
    private /* synthetic */ boolean C;
    protected /* synthetic */ int B;
    private /* synthetic */ d L;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(int n2, int n3, int n4, int n5) {
        int[] arrn = net.minecraft.client.I.v.a();
        int n6 = n2;
        if (arrn != null) return n6 != 0;
        if (n6 < n4) return 1 != 0;
        n6 = n3;
        if (arrn != null) return n6 != 0;
        if (n6 < n5) return 1 != 0;
        n6 = n2;
        if (arrn != null) return n6 != 0;
        if (n6 >= n4 + this.M) return 1 != 0;
        n6 = n3;
        if (arrn != null) return n6 != 0;
        if (n6 < n5 + this.F) return 0 != 0;
        return 1 != 0;
    }

    private void a(d d10, int n2, int n3, String string) {
        int[] arrn = net.minecraft.client.I.v.a();
        net.minecraft.client.a.v.b(0.0f, 0.0f, 32.0f);
        c = 200.0f;
        int[] arrn2 = arrn;
        this.x.g = 200.0f;
        this.x.a(d10, n2, n3);
        int n4 = this.V.G();
        if (arrn2 == null) {
            n4 = n4 != 0 ? 0 : 8;
        }
        this.x.a(this.v, d10, n2, n3 - n4, string);
        c = 0.0f;
        this.x.g = 0.0f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void d() {
        block10: {
            block9: {
                var2_1 = this.m.s.cB.h();
                var1_2 = net.minecraft.client.I.v.a();
                v0 = var2_1.G();
                if (var1_2 == null) {
                    if (v0 != 0) return;
                    v0 = this.y;
                }
                if (var1_2 != null) break block9;
                if (v0 == 0) return;
                v1 = this;
                if (var1_2 != null) break block10;
                v0 = v1.z;
            }
            if (v0 == 2) {
                this.T = var2_1.f();
                if (var1_2 == null) return;
            }
            this.T = var2_1.t();
            v1 = this;
        }
        var3_3 = v1.E.iterator();
        do {
            if (var3_3.hasNext() == false) return;
            var4_4 = var3_3.next();
            var5_5 = var2_1.C();
            v2 = var6_6 = var4_4.d();
            if (var1_2 != null) ** GOTO lbl30
            if (v2.G()) {
                v3 = 0;
            } else {
                v2 = var6_6;
lbl30:
                // 2 sources

                v3 = v2.t();
            }
            var7_7 = v3;
            net.minecraft.B.n.a(this.E, this.z, var5_5, var7_7);
            var8_8 = Math.min(var5_5.f(), var4_4.c(var5_5));
            if (var1_2 != null) continue;
            if (var5_5.t() > var8_8) {
                var5_5.c(var8_8);
            }
            this.T -= var5_5.t() - var7_7;
        } while (var1_2 == null);
    }

    private boolean a(D d10, int n2, int n3) {
        return this.a(d10.a, d10.b, 16, 16, n2, n3);
    }

    protected void b(int n2, int n3) {
    }

    protected void a(D d10, int n2, int n3, net.minecraft.B.h h2) {
        int[] arrn = net.minecraft.client.I.v.a();
        if (arrn == null) {
            if (d10 != null) {
                n2 = d10.d;
            }
            this.m.aW.a(this.X.b, n2, n3, h2, this.m.s);
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block13: {
            int n3;
            int n4;
            int[] arrn;
            block15: {
                block16: {
                    block14: {
                        D d10;
                        block12: {
                            block10: {
                                int n5;
                                block11: {
                                    block9: {
                                        int n6;
                                        block8: {
                                            arrn = net.minecraft.client.I.v.a();
                                            int n6 = n2;
                                            n6 = 1;
                                            if (arrn != null) break block8;
                                            if (n5 == n6) break block9;
                                            n5 = n2;
                                            if (arrn != null) break block10;
                                            n6 = this.m.ac.bW.e();
                                        }
                                        if (n5 != n6) break block11;
                                    }
                                    this.m.s.ag();
                                }
                                n5 = this.a(n2) ? 1 : 0;
                            }
                            d10 = this.W;
                            if (arrn != null) break block12;
                            if (d10 == null) break block13;
                            d10 = this.W;
                        }
                        n4 = d10.b();
                        if (arrn != null) break block14;
                        if (n4 == 0) break block13;
                        n4 = n2;
                    }
                    n3 = this.m.ac.aT.e();
                    if (arrn != null) break block15;
                    if (n4 != n3) break block16;
                    this.a(this.W, this.W.d, 0, net.minecraft.B.h.CLONE);
                    if (arrn == null) break block13;
                }
                int n3 = n2;
                n3 = this.m.ac.bU.e();
            }
            if (n4 == n3) {
                int n7 = g.q();
                if (arrn == null) {
                    n7 = n7 != 0 ? 1 : 0;
                }
                this.a(this.W, this.W.d, n7, net.minecraft.B.h.THROW);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void b(int var1_1, int var2_2, int var3_3) {
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
    public void h() {
        block3: {
            g g10;
            block2: {
                int[] arrn = net.minecraft.client.I.v.a();
                g10 = this;
                if (arrn != null) break block2;
                if (g10.m.s == null) break block3;
                g10 = this;
            }
            g10.X.b(this.m.s);
        }
    }

    protected void c(int n2, int n3) {
        block3: {
            g g10;
            block5: {
                D d10;
                block4: {
                    g g11;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.client.I.v.a();
                        g11 = this;
                        if (arrn != null) break block2;
                        if (!g11.m.s.cB.h().G()) break block3;
                        g11 = this;
                    }
                    d10 = g11.W;
                    if (arrn != null) break block4;
                    if (d10 == null) break block3;
                    g10 = this;
                    if (arrn != null) break block5;
                    d10 = g10.W;
                }
                if (!d10.b()) break block3;
                g10 = this;
            }
            g10.a(this.W.d(), n2, n3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = this.H;
        int[] arrn = net.minecraft.client.I.v.a();
        int n9 = this.B;
        n7 -= n9;
        int n10 = n6 -= n8;
        int n11 = n2 - 1;
        if (arrn == null) {
            if (n10 < n11) return 0 != 0;
            n10 = n6;
            n11 = n2 + n4 + 1;
        }
        if (arrn == null) {
            if (n10 >= n11) return 0 != 0;
            n10 = n7;
            n11 = n3 - 1;
        }
        if (arrn == null) {
            if (n10 < n11) return 0 != 0;
            n10 = n7;
            if (arrn != null) return n10 != 0;
            n11 = n3 + n5 + 1;
        }
        if (n10 >= n11) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(int var1_1, int var2_2, int var3_3) throws IOException {
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
    protected void a(int n2, int n3, int n4, long l2) {
        block9: {
            block23: {
                int n5;
                int[] arrn;
                D d10;
                block22: {
                    block21: {
                        d d11;
                        block19: {
                            block20: {
                                block18: {
                                    boolean bl2;
                                    block6: {
                                        g g10;
                                        block4: {
                                            block5: {
                                                block17: {
                                                    long l3;
                                                    block15: {
                                                        g g11;
                                                        block16: {
                                                            D d12;
                                                            block14: {
                                                                int n6;
                                                                block10: {
                                                                    block11: {
                                                                        block13: {
                                                                            g g12;
                                                                            D d13;
                                                                            block12: {
                                                                                block7: {
                                                                                    block8: {
                                                                                        d10 = this.a(n2, n3);
                                                                                        arrn = net.minecraft.client.I.v.a();
                                                                                        d11 = this.m.s.cB.h();
                                                                                        g10 = this;
                                                                                        if (arrn != null) break block4;
                                                                                        if (g10.O == null) break block5;
                                                                                        bl2 = this.m.ac.aZ;
                                                                                        if (arrn != null) break block6;
                                                                                        if (!bl2) break block5;
                                                                                        n6 = n4;
                                                                                        if (arrn != null) break block7;
                                                                                        if (n6 == 0) break block8;
                                                                                        n6 = n4;
                                                                                        if (arrn != null) break block7;
                                                                                        if (n6 != 1) break block9;
                                                                                    }
                                                                                    n6 = this.V.G() ? 1 : 0;
                                                                                }
                                                                                if (arrn != null) break block10;
                                                                                if (n6 == 0) break block11;
                                                                                d13 = d10;
                                                                                if (arrn != null) break block12;
                                                                                if (d13 == this.O) break block9;
                                                                                g12 = this;
                                                                                if (arrn != null) break block13;
                                                                                d13 = g12.O;
                                                                            }
                                                                            if (d13.d().G()) break block9;
                                                                            g12 = this;
                                                                        }
                                                                        g12.V = this.O.d().C();
                                                                        if (arrn == null) break block9;
                                                                    }
                                                                    n6 = this.V.t();
                                                                }
                                                                if (n6 <= 1) break block9;
                                                                d12 = d10;
                                                                if (arrn != null) break block14;
                                                                if (d12 == null) break block9;
                                                                d12 = d10;
                                                            }
                                                            if (!net.minecraft.B.n.a(d12, this.V, false)) break block9;
                                                            l3 = net.minecraft.client.Q.aj();
                                                            g11 = this;
                                                            if (arrn != null) break block15;
                                                            if (g11.D != d10) break block16;
                                                            if (l3 - this.Q <= 500L) break block17;
                                                            this.a(this.O, this.O.d, 0, net.minecraft.B.h.PICKUP);
                                                            this.a(d10, d10.d, 1, net.minecraft.B.h.PICKUP);
                                                            this.a(this.O, this.O.d, 0, net.minecraft.B.h.PICKUP);
                                                            this.Q = l3 + 750L;
                                                            this.V.b(1);
                                                            if (arrn == null) break block17;
                                                        }
                                                        this.D = d10;
                                                        g11 = this;
                                                    }
                                                    g11.Q = l3;
                                                }
                                                if (arrn == null) break block9;
                                            }
                                            g10 = this;
                                        }
                                        bl2 = g10.y;
                                    }
                                    if (!bl2 || d10 == null) break block9;
                                    n5 = d11.G();
                                    if (arrn != null) break block18;
                                    if (n5 != 0) break block9;
                                    n5 = d11.t();
                                }
                                if (arrn != null) break block19;
                                if (n5 > this.E.size()) break block20;
                                n5 = this.z;
                                if (arrn != null) break block19;
                                if (n5 != 2) break block9;
                            }
                            n5 = net.minecraft.B.n.a(d10, d11, true) ? 1 : 0;
                        }
                        if (arrn != null) break block21;
                        if (n5 == 0) break block9;
                        n5 = d10.d(d11) ? 1 : 0;
                    }
                    if (arrn != null) break block22;
                    if (n5 == 0) break block9;
                    n5 = this.X.b(d10) ? 1 : 0;
                }
                if (arrn != null) break block23;
                if (n5 == 0) break block9;
                n5 = this.E.add(d10) ? 1 : 0;
            }
            this.d();
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, int var2_2, float var3_3) {
        block18: {
            block19: {
                block22: {
                    block24: {
                        block23: {
                            block20: {
                                block21: {
                                    block17: {
                                        var5_4 = this.H;
                                        var6_5 = this.B;
                                        this.a(var3_3, var1_1, var2_2);
                                        net.minecraft.client.a.v.u();
                                        a0.a();
                                        v0 = net.minecraft.client.I.v.a();
                                        net.minecraft.client.a.v.y();
                                        net.minecraft.client.a.v.n();
                                        var4_6 = v0;
                                        super.a(var1_1, var2_2, var3_3);
                                        a0.b();
                                        net.minecraft.client.a.v.M();
                                        net.minecraft.client.a.v.b((float)var5_4, (float)var6_5, 0.0f);
                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                        net.minecraft.client.a.v.q();
                                        this.W = null;
                                        var7_7 = 240;
                                        var8_8 = 240;
                                        as.a(as.p, 240.0f, 240.0f);
                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                        for (var9_9 = 0; var9_9 < this.X.f.size(); ++var9_9) {
                                            var10_11 = this.X.f.get(var9_9);
                                            if (var4_6 == null) {
                                                v1 = var10_11.e();
                                                if (var4_6 == null) {
                                                    if (v1 != 0) {
                                                        this.a((D)var10_11);
                                                    }
                                                    v1 = this.a((D)var10_11, var1_1, var2_2);
                                                }
                                                if (var4_6 == null) {
                                                    if (v1 == 0) continue;
                                                    v1 = var10_11.e();
                                                }
                                                if (var4_6 == null) {
                                                    if (v1 == 0) continue;
                                                    this.W = var10_11;
                                                    net.minecraft.client.a.v.y();
                                                    net.minecraft.client.a.v.n();
                                                    v1 = var10_11.a;
                                                }
                                                var11_12 = v1;
                                                var12_14 = var10_11.b;
                                                net.minecraft.client.a.v.a(true, true, true, false);
                                                this.a(var11_12, var12_14, (double)(var11_12 + 16), (double)(var12_14 + 16), -2130706433, -2130706433);
                                                net.minecraft.client.a.v.a(true, true, true, true);
                                                net.minecraft.client.a.v.j();
                                                net.minecraft.client.a.v.t();
                                                if (var4_6 == null) continue;
                                            }
                                            break block17;
                                        }
                                        a0.a();
                                        this.b(var1_1, var2_2);
                                        a0.b();
                                    }
                                    var9_10 = this.m.s.cB;
                                    v2 = this;
                                    if (var4_6 != null) ** GOTO lbl58
                                    if (v2.V.G()) {
                                        v3 = var9_10.h();
                                    } else {
                                        v2 = this;
lbl58:
                                        // 2 sources

                                        v3 = v2.V;
                                    }
                                    var10_11 = v3;
                                    v4 = var10_11.G();
                                    if (var4_6 != null) break block18;
                                    if (v4) break block19;
                                    var11_12 = 8;
                                    v5 = this.V.G();
                                    if (var4_6 == null) {
                                        v5 = v5 != 0 ? 8 : 16;
                                    }
                                    var12_14 = v5;
                                    var13_15 = null;
                                    v6 = this.V.G();
                                    if (var4_6 != null) break block20;
                                    if (v6 != 0) break block21;
                                    v6 = this.K;
                                    if (var4_6 != null) break block20;
                                    if (v6 == 0) break block21;
                                    var10_11 = var10_11.C();
                                    var10_11.c(net.minecraft.k.h.f((float)var10_11.t() / 2.0f));
                                    if (var4_6 == null) break block22;
                                }
                                v6 = this.y;
                            }
                            if (var4_6 != null) break block23;
                            if (v6 == 0) break block22;
                            v6 = this.E.size();
                        }
                        if (var4_6 != null) break block24;
                        if (v6 <= 1) break block22;
                        var10_11 = var10_11.C();
                        var10_11.c(this.T);
                        v6 = var10_11.G() ? 1 : 0;
                    }
                    if (v6 != 0) {
                        var13_15 = "" + (Object)net.minecraft.at.l.YELLOW + "0";
                    }
                }
                this.a((d)var10_11, var1_1 - var5_4 - 8, var2_2 - var6_5 - var12_14, var13_15);
            }
            v4 = this.L.G();
        }
        if (!v4) {
            var11_13 = (float)(net.minecraft.client.Q.aj() - this.U) / 100.0f;
            cfr_temp_0 = var11_13 - 1.0f;
            v7 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            if (var4_6 == null) {
                if (v7 >= 0) {
                    var11_13 = 1.0f;
                    this.L = net.minecraft.w.d.m;
                }
                v7 = this.A.a - this.G;
            }
            var12_14 = (int)v7;
            var13_16 = this.A.b - this.Z;
            var14_17 = this.G + (int)((float)var12_14 * var11_13);
            var15_18 = this.Z + (int)((float)var13_16 * var11_13);
            this.a(this.L, var14_17, var15_18, (String)null);
        }
        net.minecraft.client.a.v.B();
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.t();
        a0.c();
    }

    /*
     * Exception decompiling
     */
    private void a(D var1_1) {
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
    public void e() {
        block4: {
            c c10;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.I.v.a();
                    super.e();
                    int[] arrn2 = arrn;
                    c10 = this.m.s;
                    if (arrn2 != null) break block2;
                    if (!c10.aL()) break block3;
                    c10 = this.m.s;
                    if (arrn2 != null) break block2;
                    if (!c10.P) break block4;
                }
                c10 = this.m.s;
            }
            c10.ag();
        }
    }

    protected abstract void a(float var1, int var2, int var3);

    protected boolean a(int n2) {
        int[] arrn = net.minecraft.client.I.v.a();
        int n3 = this.m.s.cB.h().G();
        if (arrn == null) {
            if (n3 != 0 && this.W != null) {
                for (int i2 = 0; i2 < 9; ++i2) {
                    n3 = n2;
                    if (arrn == null) {
                        boolean bl2;
                        if (arrn == null) {
                            if (n3 != this.m.ac.b3[i2].e()) continue;
                            this.a(this.W, this.W.d, i2, net.minecraft.B.h.SWAP);
                            bl2 = true;
                        }
                        return bl2;
                    }
                    break;
                }
            } else {
                n3 = 0;
            }
        }
        return n3 != 0;
    }

    @Override
    public void r() {
        super.r();
        this.m.s.cm = this.X;
        this.H = (h - this.M) / 2;
        this.B = (w - this.F) / 2;
    }

    public g(n n2) {
        this.M = 176;
        this.F = 166;
        this.V = net.minecraft.w.d.m;
        this.L = net.minecraft.w.d.m;
        this.E = Sets.newHashSet();
        this.S = net.minecraft.w.d.m;
        this.X = n2;
        this.C = true;
    }

    private D a(int n2, int n3) {
        int n4 = 0;
        int[] arrn = net.minecraft.client.I.v.a();
        while (n4 < this.X.f.size()) {
            block3: {
                block4: {
                    D d10;
                    block5: {
                        D d11 = this.X.f.get(n4);
                        if (arrn != null) break block3;
                        if (!this.a(d11, n2, n3)) break block4;
                        d10 = d11;
                        if (arrn != null) break block5;
                        if (!d10.e()) break block4;
                        d10 = d11;
                    }
                    return d10;
                }
                ++n4;
            }
            if (arrn == null) continue;
        }
        return null;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    static {
        N = new net.minecraft.ar.v("textures/gui/container/inventory.png");
    }
}

