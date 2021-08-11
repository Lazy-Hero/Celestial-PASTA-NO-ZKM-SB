/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.J.f;
import net.minecraft.J.g;
import net.minecraft.J.j;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.bq;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ag.C;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.k.p;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o
extends x {
    private /* synthetic */ double aN;
    private /* synthetic */ boolean a4;
    private /* synthetic */ float aP;
    private /* synthetic */ float aL;
    private static final /* synthetic */ net.minecraft.q.r<Boolean>[] aT;
    private /* synthetic */ double a6;
    private /* synthetic */ double aM;
    private /* synthetic */ float aY;
    private /* synthetic */ boolean a1;
    private /* synthetic */ int aV;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aU;
    private /* synthetic */ double aR;
    private /* synthetic */ float a0;
    private /* synthetic */ double aX;
    private /* synthetic */ f aO;
    private static final /* synthetic */ net.minecraft.q.r<Float> aQ;
    private /* synthetic */ double a7;
    private /* synthetic */ f a2;
    private /* synthetic */ boolean aS;
    private static final /* synthetic */ net.minecraft.q.r<Integer> a3;
    private /* synthetic */ boolean aW;
    private /* synthetic */ double aK;
    private final /* synthetic */ float[] aZ;
    private static final /* synthetic */ net.minecraft.q.r<Integer> a5;

    @Override
    public boolean aY() {
        return true;
    }

    private void b() {
        block3: {
            o o2;
            block4: {
                int n2;
                block2: {
                    int n3 = net.minecraft.J.j.d();
                    n2 = this.aV;
                    if (n3 == 0) break block2;
                    if (n2 <= 0) break block3;
                    o2 = this;
                    if (n3 == 0) break block4;
                    n2 = o2.a1() ? 1 : 0;
                }
                if (n2 != 0) break block3;
                o2 = this;
            }
            double d10 = o2.a + (this.aK - this.a) / (double)this.aV;
            double d11 = this.aF + (this.aX - this.aF) / (double)this.aV;
            double d12 = this.ax + (this.aN - this.ax) / (double)this.aV;
            double d13 = h.b(this.aM - (double)this.e);
            this.e = (float)((double)this.e + d13 / (double)this.aV);
            this.at = (float)((double)this.at + (this.aR - (double)this.at) / (double)this.aV);
            --this.aV;
            this.g(d10, d11, d12);
            this.e(this.e, this.at);
        }
    }

    public o(z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
        this.aq = 0.0;
        this.G = 0.0;
        this.d = 0.0;
        this.N = d10;
        this.L = d11;
        this.k = d12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean j() {
        int n2;
        block10: {
            k k2 = this.m();
            int n3 = h.f(k2.e);
            int n4 = net.minecraft.J.j.d();
            int n5 = h.i(k2.f);
            int n6 = h.f(k2.b);
            int n7 = h.i(k2.b + 0.001);
            int n8 = h.f(k2.d);
            int n9 = h.i(k2.g);
            int n10 = 0;
            this.a7 = Double.MIN_VALUE;
            p p2 = net.minecraft.k.p.a();
            try {
                int n11 = n3;
                block2: while (true) {
                    int n12 = n11;
                    block3: while (n12 < n5) {
                        n2 = n6;
                        if (n4 == 0) break block10;
                        int n13 = n2;
                        while (n13 < n7) {
                            block11: {
                                n12 = n8;
                                if (n4 == 0) continue block3;
                                int n14 = n12;
                                while (n14 < n9) {
                                    p2.a(n11, n13, n14);
                                    i i2 = this.aG.d(p2);
                                    if (n4 != 0) {
                                        if (n4 != 0) {
                                            if (i2.o() == c.L) {
                                                float f10 = bq.b(i2, this.aG, p2);
                                                this.a7 = Math.max((double)f10, this.a7);
                                                double d10 = k2.b - (double)f10;
                                                double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                                if (n4 != 0) {
                                                    d11 = d11 < 0 ? 1.0 : 0.0;
                                                }
                                                n10 |= d11;
                                            }
                                            ++n14;
                                        }
                                        if (n4 != 0) continue;
                                    }
                                    break block11;
                                }
                                ++n13;
                            }
                            if (n4 != 0) continue;
                        }
                        ++n11;
                        if (n4 != 0) continue block2;
                    }
                    break;
                }
                p2.b();
            }
            catch (Throwable throwable) {
                p2.b();
                throw throwable;
            }
            n2 = n10;
        }
        return n2 != 0;
    }

    @Override
    public aA b() {
        return this.K().l();
    }

    static {
        a3 = net.minecraft.q.m.a(o.class, net.minecraft.q.h.n);
        a5 = net.minecraft.q.m.a(o.class, net.minecraft.q.h.n);
        aQ = net.minecraft.q.m.a(o.class, net.minecraft.q.h.k);
        aU = net.minecraft.q.m.a(o.class, net.minecraft.q.h.n);
        aT = new net.minecraft.q.r[]{net.minecraft.q.m.a(o.class, net.minecraft.q.h.g), net.minecraft.q.m.a(o.class, net.minecraft.q.h.g)};
    }

    @Override
    protected boolean h() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float a(int n2, float f10) {
        int n3 = net.minecraft.J.j.d();
        o o2 = this;
        if (n3 != 0) {
            if (!o2.a(n2)) return 0.0f;
            o2 = this;
        }
        float f11 = (float)h.a((double)o2.aZ[n2] - (double)0.3926991f, (double)this.aZ[n2], (double)f10);
        return f11;
    }

    @Override
    public void n(x x2) {
        block6: {
            int n2;
            block4: {
                double d10;
                block5: {
                    int n3 = net.minecraft.J.j.d();
                    n2 = x2 instanceof o;
                    if (n3 == 0) break block4;
                    if (n2 == 0) break block5;
                    if (!(x2.m().b < this.m().a)) break block6;
                    super.n(x2);
                    if (n3 != 0) break block6;
                }
                n2 = (d10 = x2.m().b - this.m().b) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
            }
            if (n2 <= 0) {
                super.n(x2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void l() {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        int n3 = net.minecraft.J.j.d();
        x x2 = this;
        if (n3 != 0) {
            if (x2.ap.b(aT[n2]) == false) return false;
            x2 = this.af();
        }
        if (x2 == null) return false;
        return true;
    }

    @Override
    public void aT() {
        this.b(-this.k());
        this.e(10);
        this.b(this.f() * 11.0f);
    }

    @Override
    public boolean M() {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.P;
        if (n2 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void q(x var1_1) {
        block10: {
            block13: {
                block12: {
                    block11: {
                        block9: {
                            var2_2 = net.minecraft.J.j.c();
                            if (this.l(var1_1) == false) return;
                            var3_3 = 0.0f;
                            v0 = this;
                            if (var2_2 != 0) ** GOTO lbl10
                            if (v0.P) {
                                v1 = 0.009999999776482582;
                            } else {
                                v0 = this;
lbl10:
                                // 2 sources

                                v1 = v0.o();
                            }
                            var4_4 = (float)(v1 + var1_1.an());
                            v2 = this.j().size();
                            if (var2_2 != 0) break block9;
                            if (v2 <= 1) break block10;
                            v2 = var5_5 = this.j().indexOf(var1_1);
                        }
                        if (var2_2 != 0) break block11;
                        if (var5_5 != 0) break block12;
                        var3_3 = 0.2f;
                    }
                    if (var2_2 == 0) break block13;
                }
                var3_3 = -0.6f;
            }
            if (var1_1 instanceof C) {
                var3_3 = (float)((double)var3_3 + 0.2);
            }
        }
        var5_6 = new l(var3_3, 0.0, 0.0).b(-this.e * 0.017453292f - 1.5707964f);
        var1_1.g(this.a + var5_6.e, this.aF + (double)var4_4, this.ax + var5_6.b);
        var1_1.e += this.aP;
        var1_1.a(var1_1.aK() + this.aP);
        this.a(var1_1);
        v3 = var1_1 instanceof C;
        if (var2_2 == 0) {
            if (v3 == 0) return;
            v3 = this.j().size();
        }
        v4 = 1;
        if (var2_2 == 0) {
            if (v3 <= v4) return;
            v3 = var1_1.W();
            v4 = 2;
        }
        v5 = v3 % v4;
        if (var2_2 == 0) {
            v5 = v5 == 0 ? 90 : 270;
        }
        var6_7 = v5;
        var1_1.e(((C)var1_1).bf + (float)var6_7);
        var1_1.a(var1_1.aK() + (float)var6_7);
    }

    public o(z z2) {
        super(z2);
        this.aZ = new float[2];
        this.az = true;
        this.c(1.375f, 0.5625f);
    }

    public void e(int n2) {
        this.ap.b(a3, n2);
    }

    @Override
    public void c(x x2) {
        this.a(x2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void ae() {
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

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
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
    protected boolean f(x x2) {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.j().size();
        if (n2 != 0) {
            bl2 = bl2 < BADBOOL 2;
        }
        return bl2;
    }

    protected void a(x x2) {
        x2.e(this.e);
        float f10 = h.b(x2.e - this.e);
        float f11 = h.c(f10, -105.0f, 105.0f);
        x2.ak += f11 - f10;
        x2.e += f11 - f10;
        x2.a(x2.e);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private f c() {
        block11: {
            block10: {
                int n2;
                block9: {
                    f f10;
                    block8: {
                        f f11 = this.a();
                        n2 = net.minecraft.J.j.c();
                        f10 = f11;
                        if (n2 != 0) break block8;
                        if (f10 == null) break block9;
                        this.a7 = this.m().a;
                        f10 = f11;
                    }
                    return f10;
                }
                o o2 = this;
                if (n2 == 0) {
                    if (o2.j()) {
                        return net.minecraft.J.f.IN_WATER;
                    }
                    o2 = this;
                }
                float f12 = o2.e();
                if (n2 != 0) break block10;
                if (!(f12 > 0.0f)) break block11;
                this.a0 = f12;
            }
            return net.minecraft.J.f.ON_LAND;
        }
        return net.minecraft.J.f.IN_AIR;
    }

    @Override
    @Nullable
    public k az() {
        return this.m();
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.aK = d10;
        this.aX = d11;
        this.aN = d12;
        this.aM = f10;
        this.aR = f11;
        this.aV = 10;
    }

    public float f() {
        return this.ap.b(aQ).floatValue();
    }

    public net.minecraft.w.k d() {
        switch (this.m()) {
            default: {
                return net.minecraft.u.h.N;
            }
            case SPRUCE: {
                return net.minecraft.u.h.Z;
            }
            case BIRCH: {
                return net.minecraft.u.h.s;
            }
            case JUNGLE: {
                return net.minecraft.u.h.U;
            }
            case ACACIA: {
                return net.minecraft.u.h.R;
            }
            case DARK_OAK: 
        }
        return net.minecraft.u.h.O;
    }

    public int k() {
        return this.ap.b(a5);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    private f a() {
        int n2;
        block12: {
            k k2 = this.m();
            double d10 = k2.a + 0.001;
            int n3 = h.f(k2.e);
            int n4 = net.minecraft.J.j.c();
            int n5 = h.i(k2.f);
            int n6 = h.f(k2.a);
            int n7 = h.i(d10);
            int n8 = h.f(k2.d);
            int n9 = h.i(k2.g);
            int n10 = 0;
            p p2 = net.minecraft.k.p.a();
            try {
                int n11 = n3;
                block3: while (true) {
                    int n12 = n11;
                    block4: while (n12 < n5) {
                        n2 = n6;
                        if (n4 != 0) break block12;
                        int n13 = n2;
                        while (n13 < n7) {
                            block13: {
                                n12 = n8;
                                if (n4 != 0) continue block4;
                                int n14 = n12;
                                while (n14 < n9) {
                                    block14: {
                                        block15: {
                                            double d11;
                                            block16: {
                                                p2.a(n11, n13, n14);
                                                i i2 = this.aG.d(p2);
                                                if (n4 != 0) break block13;
                                                if (n4 != 0) break block14;
                                                if (i2.o() != c.L) break block15;
                                                double d12 = d10 - (double)bq.b(i2, this.aG, p2);
                                                d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                                if (n4 != 0) break block16;
                                                if (d11 >= 0) break block15;
                                                d11 = i2.b(bq.z).intValue();
                                            }
                                            if (n4 == 0) {
                                                if (d11 != false) {
                                                    f f10;
                                                    f f11 = f10 = net.minecraft.J.f.UNDER_FLOWING_WATER;
                                                    p2.b();
                                                    return f11;
                                                }
                                                d11 = 1.0;
                                            }
                                            n10 = (int)d11;
                                        }
                                        ++n14;
                                    }
                                    if (n4 == 0) continue;
                                }
                                ++n13;
                            }
                            if (n4 == 0) continue;
                        }
                        ++n11;
                        if (n4 == 0) continue block3;
                    }
                    break;
                }
                p2.b();
            }
            catch (Throwable throwable) {
                p2.b();
                throw throwable;
            }
            n2 = n10;
        }
        if (n2 == 0) return null;
        f f12 = net.minecraft.J.f.UNDER_WATER;
        return f12;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(double var1_1, boolean var3_2, i var4_3, n var5_4) {
        block14: {
            block12: {
                block15: {
                    block16: {
                        block13: {
                            this.a6 = this.G;
                            var6_5 = net.minecraft.J.j.d();
                            v0 = this.N();
                            if (var6_5 != 0) {
                                if (v0 != 0) return;
                                v0 = var3_2;
                            }
                            if (var6_5 == 0) break block13;
                            if (v0 == 0) break block14;
                            v1 = this;
                            if (var6_5 == 0) break block15;
                            cfr_temp_0 = v1.an - 3.0f;
                            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        }
                        if (v0 <= 0) break block16;
                        v1 = this;
                        if (var6_5 != 0) {
                            if (v1.a2 != net.minecraft.J.f.ON_LAND) {
                                this.an = 0.0f;
                                return;
                            }
                            this.d(this.an, 1.0f);
                            v1 = this;
                        }
                        if (var6_5 == 0) break block15;
                        if (v1.aG.C) break block16;
                        v1 = this;
                        if (var6_5 != 0) {
                            if (!v1.P) {
                                this.a();
                                v1 = this;
                                if (var6_5 != 0) {
                                    if (v1.aG.M().c("doEntityDrops")) {
                                        block11: {
                                            for (var7_6 = 0; var7_6 < 3; ++var7_6) {
                                                this.a(new d(net.minecraft.w.k.b(net.minecraft.u.g.cB), 1, this.m().a()), 0.0f);
                                                if (var6_5 != 0) {
                                                    if (var6_5 != 0) continue;
                                                }
                                                break block11;
                                            }
                                            var7_6 = 0;
                                        }
                                        while (var7_6 < 2) {
                                            this.a(net.minecraft.u.h.bz, 1, 0.0f);
                                            ++var7_6;
                                            if (var6_5 != 0) {
                                                if (var6_5 != 0) continue;
                                            }
                                            break block12;
                                        }
                                    } else {
                                        ** GOTO lbl49
                                    }
                                } else {
                                    ** GOTO lbl48
                                }
                            } else {
                                ** GOTO lbl47
                            }
                        }
                        break block15;
lbl47:
                        // 2 sources

                        break block16;
lbl48:
                        // 2 sources

                        break block15;
                    }
                    v1 = this;
                }
                v1.an = 0.0f;
            }
            if (var6_5 != 0) return;
        }
        if (this.aG.d(new n(this).k()).o() == c.L) return;
        if (!(var1_1 < 0.0)) return;
        this.an = (float)((double)this.an - var1_1);
    }

    public int g() {
        return this.ap.b(a3);
    }

    private void o() {
        block6: {
            double d10;
            double d11;
            block18: {
                int n2;
                block17: {
                    double d12;
                    int n3;
                    block16: {
                        o o2;
                        block9: {
                            f f10;
                            f f11;
                            block14: {
                                block15: {
                                    block12: {
                                        block13: {
                                            block10: {
                                                block11: {
                                                    block7: {
                                                        block8: {
                                                            block4: {
                                                                block5: {
                                                                    double d13 = -0.04f;
                                                                    n3 = net.minecraft.J.j.c();
                                                                    d12 = this.aI() ? 0.0 : (double)-0.04f;
                                                                    d11 = 0.0;
                                                                    this.aL = 0.05f;
                                                                    f11 = this.aO;
                                                                    f10 = net.minecraft.J.f.IN_AIR;
                                                                    if (n3 != 0) break block4;
                                                                    if (f11 != f10) break block5;
                                                                    f11 = this.a2;
                                                                    f10 = net.minecraft.J.f.IN_AIR;
                                                                    if (n3 != 0) break block4;
                                                                    if (f11 == f10) break block5;
                                                                    f11 = this.a2;
                                                                    f10 = net.minecraft.J.f.ON_LAND;
                                                                    if (n3 != 0) break block4;
                                                                    if (f11 == f10) break block5;
                                                                    this.a7 = this.m().b + (double)this.aD;
                                                                    this.g(this.a, (double)(this.p() - this.aD) + 0.101, this.ax);
                                                                    this.G = 0.0;
                                                                    this.a6 = 0.0;
                                                                    this.a2 = net.minecraft.J.f.IN_WATER;
                                                                    if (n3 == 0) break block6;
                                                                }
                                                                f11 = this.a2;
                                                                f10 = net.minecraft.J.f.IN_WATER;
                                                            }
                                                            if (n3 != 0) break block7;
                                                            if (f11 != f10) break block8;
                                                            d11 = (this.a7 - this.m().b) / (double)this.aD;
                                                            this.aL = 0.9f;
                                                            if (n3 == 0) break block9;
                                                        }
                                                        f11 = this.a2;
                                                        f10 = net.minecraft.J.f.UNDER_FLOWING_WATER;
                                                    }
                                                    if (n3 != 0) break block10;
                                                    if (f11 != f10) break block11;
                                                    d12 = -7.0E-4;
                                                    this.aL = 0.9f;
                                                    if (n3 == 0) break block9;
                                                }
                                                f11 = this.a2;
                                                f10 = net.minecraft.J.f.UNDER_WATER;
                                            }
                                            if (n3 != 0) break block12;
                                            if (f11 != f10) break block13;
                                            d11 = 0.01f;
                                            this.aL = 0.45f;
                                            if (n3 == 0) break block9;
                                        }
                                        f11 = this.a2;
                                        f10 = net.minecraft.J.f.IN_AIR;
                                    }
                                    if (n3 != 0) break block14;
                                    if (f11 != f10) break block15;
                                    this.aL = 0.9f;
                                    if (n3 == 0) break block9;
                                }
                                o2 = this;
                                if (n3 != 0) break block16;
                                f11 = o2.a2;
                                f10 = net.minecraft.J.f.ON_LAND;
                            }
                            if (f11 != f10) break block9;
                            this.aL = this.a0;
                            n2 = this.af() instanceof net.minecraft.i.j;
                            if (n3 != 0) break block17;
                            if (n2 != 0) {
                                this.a0 /= 2.0f;
                            }
                        }
                        this.aq *= (double)this.aL;
                        this.d *= (double)this.aL;
                        this.aP *= this.aL;
                        o2 = this;
                    }
                    o2.G += d12;
                    d10 = d11;
                    if (n3 != 0) break block18;
                    double d14 = d10 - 0.0;
                    n2 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                }
                if (n2 <= 0) break block6;
                d10 = 0.65;
            }
            double d15 = d10;
            this.G += d11 * 0.06153846016296973;
            double d16 = 0.75;
            this.G *= 0.75;
        }
    }

    @Override
    protected void a(r r2) {
        block0: {
            if (!r2.a("Type", 8)) break block0;
            this.a(net.minecraft.J.g.a(r2.j("Type")));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public k k(x x2) {
        int n2 = net.minecraft.J.j.d();
        x x3 = x2;
        if (n2 != 0) {
            if (!x3.aY()) return null;
            x3 = x2;
        }
        k k2 = x3.m();
        return k2;
    }

    public void a(boolean bl2, boolean bl3) {
        this.ap.b(aT[0], bl2);
        this.ap.b(aT[1], bl3);
    }

    @Override
    public double o() {
        return -0.1;
    }

    public g m() {
        return net.minecraft.J.g.a(this.ap.b(aU));
    }

    public void b(int n2) {
        this.ap.b(a5, n2);
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.aW = bl2;
        this.a4 = bl3;
        this.a1 = bl4;
        this.aS = bl5;
    }

    @Override
    protected void f(r r2) {
        r2.a("Type", this.m().b());
    }

    public void b(float f10) {
        this.ap.b(aQ, Float.valueOf(f10));
    }

    public void a(g g10) {
        this.ap.b(aU, g10.ordinal());
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        int n2;
        block6: {
            block7: {
                int n3 = net.minecraft.J.j.c();
                n2 = j2.a4();
                if (n3 == 0) {
                    if (n2 != 0) {
                        return false;
                    }
                    n2 = this.aG.C;
                }
                if (n3 != 0) break block6;
                if (n2 != 0) break block7;
                float f10 = this.aY - 60.0f;
                n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                if (n3 != 0) break block6;
                if (n2 < 0) {
                    j2.h(this);
                }
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    @Nullable
    protected net.minecraft.ar.d n() {
        switch (this.c()) {
            case IN_WATER: 
            case UNDER_WATER: 
            case UNDER_FLOWING_WATER: {
                return net.minecraft.u.E.cb;
            }
            case ON_LAND: {
                return net.minecraft.u.E.b7;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public x af() {
        List<x> list = this.j();
        int n2 = net.minecraft.J.j.d();
        Object object = list;
        if (n2 != 0) {
            if (object.isEmpty()) {
                return null;
            }
            object = list.get(0);
        }
        x x2 = (x)object;
        return x2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public float e() {
        var2_1 = this.m();
        var3_2 = new k(var2_1.e, var2_1.b - 0.001, var2_1.d, var2_1.f, var2_1.b, var2_1.g);
        var4_3 = h.f(var3_2.e) - 1;
        var5_4 = h.i(var3_2.f) + 1;
        var6_5 = h.f(var3_2.b) - 1;
        var7_6 = h.i(var3_2.a) + 1;
        var8_7 = h.f(var3_2.d) - 1;
        var9_8 = h.i(var3_2.g) + 1;
        var1_9 = net.minecraft.J.j.d();
        var10_10 = Lists.newArrayList();
        var11_11 = 0.0f;
        var12_12 = 0;
        var13_13 = net.minecraft.k.p.a();
        try {
            var14_14 = var4_3;
            block2: while (true) {
                v0 = var14_14;
                v1 = var5_4;
                block3: while (v0 < v1) {
                    if (var1_9 == 0) return var11_11 / (float)var12_12;
                    var15_15 = var8_7;
                    block4: while (true) {
                        v2 = var15_15;
                        block5: while (v2 < var9_8) {
                            block26: {
                                block25: {
                                    block24: {
                                        block23: {
                                            block22: {
                                                v0 = var14_14;
                                                v1 = var4_3;
                                                if (var1_9 == 0) continue block3;
                                                if (var1_9 == 0) break block22;
                                                if (v0 == v1) ** GOTO lbl-1000
                                                v3 = var14_14;
                                                if (var1_9 == 0) break block23;
                                                v4 = var5_4 - 1;
                                            }
                                            ** if (v3 == v4) goto lbl-1000
lbl-1000:
                                            // 1 sources

                                            {
                                                v3 = 0;
                                                ** GOTO lbl39
                                            }
lbl-1000:
                                            // 2 sources

                                            {
                                                v3 = 1;
                                            }
                                        }
                                        v5 = var15_15;
                                        v6 = var8_7;
                                        if (var1_9 == 0) break block24;
                                        if (v5 == v6) ** GOTO lbl-1000
                                        v5 = var15_15;
                                        if (var1_9 == 0) break block25;
                                        v6 = var9_8 - 1;
                                    }
                                    ** if (v5 == v6) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        v5 = 0;
                                        ** GOTO lbl53
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        v5 = 1;
                                    }
                                }
                                var16_16 = v3 + v5;
                                if (var1_9 == 0) continue block4;
                                if (var16_16 == 2) break block26;
                                for (var17_17 = var6_5; var17_17 < var7_6; ++var17_17) {
                                    block28: {
                                        block27: {
                                            v2 = var16_16;
                                            if (var1_9 == 0) continue block5;
                                            if (var1_9 == 0) break block27;
                                            if (v2 <= 0) break block28;
                                            v7 = var17_17;
                                        }
                                        v8 = var6_5;
                                        if (var1_9 != 0) {
                                            if (v7 == v8) continue;
                                            v7 = var17_17;
                                            v8 = var7_6 - 1;
                                        }
                                        if (v7 == v8) continue;
                                    }
                                    var13_13.a(var14_14, var17_17, var15_15);
                                    var18_18 = this.aG.d(var13_13);
                                    var18_18.a(this.aG, var13_13, var3_2, var10_10, this, false);
                                    v9 = var10_10;
                                    if (var1_9 != 0) {
                                        if (!v9.isEmpty()) {
                                            var11_11 += var18_18.b().x;
                                            ++var12_12;
                                        }
                                        v9 = var10_10;
                                    }
                                    v9.clear();
                                    if (var1_9 != 0) continue;
                                }
                            }
                            ++var15_15;
                            if (var1_9 != 0) continue block4;
                        }
                        break;
                    }
                    ++var14_14;
                    if (var1_9 != 0) continue block2;
                }
                break;
            }
            var13_13.b();
            return var11_11 / (float)var12_12;
        }
        catch (Throwable var19_19) {
            var13_13.b();
            throw var19_19;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float p() {
        k k2 = this.m();
        int n2 = h.f(k2.e);
        int n3 = h.i(k2.f);
        int n4 = h.f(k2.a);
        int n5 = h.i(k2.a - this.a6);
        int n6 = h.f(k2.d);
        int n7 = net.minecraft.J.j.d();
        int n8 = h.i(k2.g);
        p p2 = net.minecraft.k.p.a();
        try {
            float f10;
            int n9;
            float f11;
            block13: {
                block4: for (int i2 = n4; i2 < n5; ++i2) {
                    f11 = 0.0f;
                    n9 = n2;
                    if (n7 != 0) {
                        int n10 = n9;
                        block5: do {
                            int n11;
                            int n12;
                            if (n10 >= n3) {
                                float f12 = f11 - 1.0f;
                                n12 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                if (n7 != 0) {
                                    float f13;
                                    if (n7 != 0) {
                                        if (n12 >= 0) continue block4;
                                        n12 = p2.b();
                                    }
                                    float f14 = f13 = (float)n12 + f11;
                                    return f14;
                                }
                            } else {
                                n12 = n11 = n6;
                            }
                            while (n11 < n8) {
                                p2.a(n10, i2, n11);
                                i i3 = this.aG.d(p2);
                                if (n7 == 0) continue block5;
                                if (i3.o() == c.L) {
                                    f11 = Math.max(f11, bq.a(i3, this.aG, p2));
                                }
                                if (f11 >= 1.0f && n7 != 0) continue block4;
                                ++n11;
                                if (n7 != 0) continue;
                            }
                            ++n10;
                        } while (n7 != 0);
                        if (n7 != 0) continue;
                    }
                    break block13;
                }
                n9 = n5 + 1;
            }
            f11 = f10 = (float)n9;
            return f11;
        }
        finally {
            p2.b();
        }
    }

    @Override
    protected void ab() {
        int n2 = net.minecraft.J.j.d();
        this.ap.c(a3, 0);
        this.ap.c(a5, 1);
        int n3 = n2;
        this.ap.c(aQ, Float.valueOf(0.0f));
        this.ap.c(aU, net.minecraft.J.g.OAK.ordinal());
        for (net.minecraft.q.r<Boolean> r2 : aT) {
            this.ap.c(r2, false);
            if (n3 != 0) continue;
        }
    }
}

