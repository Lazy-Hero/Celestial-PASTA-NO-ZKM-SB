/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.r;

import com.google.common.collect.Lists;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.at.l;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.j.f;
import net.minecraft.client.q.c;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.ah;
import net.minecraft.client.r.b;
import net.minecraft.i.a;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class s<T extends B>
extends b<T> {
    private static final /* synthetic */ Logger u;
    private static /* synthetic */ int[] o;
    private static final /* synthetic */ f s;
    public static /* synthetic */ float j;
    public /* synthetic */ float w;
    public /* synthetic */ float r;
    protected /* synthetic */ boolean q;
    public /* synthetic */ net.minecraft.client.w.j i;
    public /* synthetic */ float k;
    public /* synthetic */ float p;
    public static /* synthetic */ float n;
    public static final /* synthetic */ boolean m;
    protected /* synthetic */ FloatBuffer t;
    protected /* synthetic */ List<w<T>> x;
    public /* synthetic */ float l;
    public /* synthetic */ float v;

    /*
     * Exception decompiling
     */
    protected void a(T var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
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
    protected boolean b(T t2) {
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.u(as.p);
        net.minecraft.client.a.v.L();
        net.minecraft.client.a.v.u(as.U);
        return true;
    }

    protected void c() {
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.u(as.p);
        net.minecraft.client.a.v.x();
        net.minecraft.client.a.v.u(as.U);
    }

    protected void e(T t2, float f10) {
    }

    protected void b(T t2, double d10, double d11, double d12) {
        net.minecraft.client.a.v.b((float)d10, (float)d11, (float)d12);
    }

    public float b(T t2, float f10) {
        net.minecraft.client.a.v.q();
        net.minecraft.client.a.v.d(-1.0f, -1.0f, 1.0f);
        this.e(t2, f10);
        float f11 = 0.0625f;
        net.minecraft.client.a.v.b(0.0f, -1.501f, 0.0f);
        return 0.0625f;
    }

    public static int[] d() {
        return o;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected void a(T t2, float f10, float f11, float f12) {
        block4: {
            block9: {
                boolean bl2;
                block8: {
                    m[] arrm;
                    block6: {
                        block7: {
                            String string;
                            String string2;
                            block5: {
                                T t3;
                                block2: {
                                    block3: {
                                        m[] arrm2 = b.b();
                                        net.minecraft.client.a.v.a(180.0f - f11, 0.0f, 1.0f, 0.0f);
                                        arrm = arrm2;
                                        t3 = t2;
                                        if (arrm != null) break block2;
                                        if (((B)t3).a2 <= 0) break block3;
                                        float f13 = ((float)((B)t2).a2 + f12 - 1.0f) / 20.0f * 1.6f;
                                        float f14 = f13 = net.minecraft.k.h.a(f13);
                                        float f15 = 1.0f;
                                        if (arrm == null) {
                                            if (f14 > f15) {
                                                f13 = 1.0f;
                                            }
                                            f14 = f13 * this.c(t2);
                                            f15 = 0.0f;
                                        }
                                        net.minecraft.client.a.v.a(f14, f15, 0.0f, 1.0f);
                                        if (arrm == null) break block4;
                                    }
                                    t3 = t2;
                                }
                                string = string2 = net.minecraft.at.l.c(((x)t3).g());
                                if (arrm != null) break block5;
                                if (string == null) break block4;
                                string = "Dinnerbone";
                            }
                            bl2 = string.equals(string2);
                            if (arrm != null) break block6;
                            if (bl2) break block7;
                            bl2 = "Grumm".equals(string2);
                            if (arrm != null) break block6;
                            if (!bl2) break block4;
                        }
                        bl2 = t2 instanceof j;
                    }
                    if (arrm != null) break block8;
                    if (!bl2) break block9;
                    bl2 = ((j)t2).a(net.minecraft.i.a.CAPE);
                }
                if (!bl2) break block4;
            }
            net.minecraft.client.a.v.b(0.0f, ((B)t2).aD + 0.1f, 0.0f);
            net.minecraft.client.a.v.a(180.0f, 0.0f, 0.0f, 1.0f);
        }
    }

    public <V extends B, U extends w<V>> boolean a(U u2) {
        return this.x.add(u2);
    }

    /*
     * Exception decompiling
     */
    public void a(T var1_1, double var2_2, double var4_3, double var6_4, float var8_5, float var9_6) {
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
        u = LogManager.getLogger();
        s = new f(16, 16);
        n = 64.0f;
        j = 32.0f;
        net.minecraft.client.r.s.b(null);
        m = Boolean.getBoolean("animate.model.living");
        int[] arrn = s.a();
        for (int i2 = 0; i2 < 256; ++i2) {
            arrn[i2] = -1;
        }
        s.d();
    }

    protected float c(T t2) {
        return 90.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(T t2) {
        m[] arrm = b.b();
        boolean bl2 = ((x)t2).a3();
        if (arrm != null) return bl2;
        if (!bl2) return true;
        bl2 = this.g;
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected boolean c(T t2, float f10) {
        return this.a(t2, f10, true);
    }

    protected float a(float f10, float f11, float f12) {
        float f13;
        block5: {
            float f14;
            block4: {
                m[] arrm = b.b();
                for (f14 = f11 - f10; f14 < -180.0f; f14 += 360.0f) {
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block4;
                }
                while (f14 >= 180.0f) {
                    f13 = f14 - 360.0f;
                    if (arrm == null) {
                        f14 = f13;
                        if (arrm == null) continue;
                    }
                    break block5;
                }
            }
            f13 = f10 + f12 * f14;
        }
        return f13;
    }

    @Override
    public void a(T t2, double d10, double d11, double d12) {
        block15: {
            int n2;
            m[] arrm;
            block16: {
                block17: {
                    block13: {
                        block14: {
                            block11: {
                                block12: {
                                    block10: {
                                        block9: {
                                            arrm = b.b();
                                            n2 = cj.b.i.a(cH.class).i();
                                            if (arrm != null) break block9;
                                            if (n2 != 0) break block10;
                                            n2 = cj.b.i.a(cE.class).i();
                                        }
                                        if (arrm != null) break block11;
                                        if (n2 == 0) break block12;
                                    }
                                    return;
                                }
                                n2 = cq.ce.b();
                            }
                            if (arrm != null) break block13;
                            if (n2 == 0) break block14;
                            n2 = cq.b(cq.ce, t2, this, d10, d11, d12) ? 1 : 0;
                            if (arrm != null) break block13;
                            if (n2 != 0) break block15;
                        }
                        n2 = this.d(t2);
                    }
                    if (arrm != null) break block16;
                    if (n2 == 0) break block17;
                    double d13 = ((x)t2).s(this.h.b);
                    float f10 = ((x)t2).a4() ? j : n;
                    double d14 = d13 - (double)(f10 * f10);
                    n2 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                    if (arrm != null) break block16;
                    if (n2 < 0) {
                        f2 f22 = new f2((B)t2, ((x)t2).d().a());
                        af.a(f22);
                        if (f22.a()) {
                            return;
                        }
                        String string = ((x)t2).d().a();
                        net.minecraft.client.a.v.a(516, 0.1f);
                        this.a(t2, d10, d11, d12, string, d13);
                    }
                }
                n2 = cq.aJ.b();
            }
            if (arrm == null && n2 != 0) {
                n2 = cq.b(cq.aJ, t2, this, d10, d11, d12) ? 1 : 0;
            }
        }
    }

    protected void e() {
        block3: {
            float f10;
            float f11;
            float f12;
            float f13;
            block2: {
                m[] arrm = b.b();
                net.minecraft.client.a.v.u(as.U);
                m[] arrm2 = arrm;
                net.minecraft.client.a.v.x();
                net.minecraft.client.a.v.d(8960, 8704, as.j);
                net.minecraft.client.a.v.d(8960, as.E, 8448);
                net.minecraft.client.a.v.d(8960, as.C, as.U);
                net.minecraft.client.a.v.d(8960, as.l, as.X);
                net.minecraft.client.a.v.d(8960, as.g, 768);
                net.minecraft.client.a.v.d(8960, as.ab, 768);
                net.minecraft.client.a.v.d(8960, as.k, 8448);
                net.minecraft.client.a.v.d(8960, as.b, as.U);
                net.minecraft.client.a.v.d(8960, as.M, as.X);
                net.minecraft.client.a.v.d(8960, as.i, 770);
                net.minecraft.client.a.v.d(8960, as.R, 770);
                net.minecraft.client.a.v.u(as.p);
                net.minecraft.client.a.v.d(8960, 8704, as.j);
                net.minecraft.client.a.v.d(8960, as.E, 8448);
                net.minecraft.client.a.v.d(8960, as.g, 768);
                net.minecraft.client.a.v.d(8960, as.ab, 768);
                net.minecraft.client.a.v.d(8960, as.C, 5890);
                net.minecraft.client.a.v.d(8960, as.l, as.S);
                net.minecraft.client.a.v.d(8960, as.k, 8448);
                net.minecraft.client.a.v.d(8960, as.i, 770);
                net.minecraft.client.a.v.d(8960, as.b, 5890);
                f13 = 1.0f;
                f12 = 1.0f;
                f11 = 1.0f;
                f10 = 1.0f;
                if (arrm2 != null) break block2;
                net.minecraft.client.a.v.b(f13, f12, f11, f10);
                net.minecraft.client.a.v.u(as.t);
                net.minecraft.client.a.v.L();
                net.minecraft.client.a.v.t(0);
                net.minecraft.client.a.v.d(8960, 8704, as.j);
                net.minecraft.client.a.v.d(8960, as.E, 8448);
                net.minecraft.client.a.v.d(8960, as.g, 768);
                net.minecraft.client.a.v.d(8960, as.ab, 768);
                net.minecraft.client.a.v.d(8960, as.C, 5890);
                net.minecraft.client.a.v.d(8960, as.l, as.S);
                net.minecraft.client.a.v.d(8960, as.k, 8448);
                net.minecraft.client.a.v.d(8960, as.i, 770);
                net.minecraft.client.a.v.d(8960, as.b, 5890);
                net.minecraft.client.a.v.u(as.U);
                if (!fU.ag()) break block3;
                f13 = 0.0f;
                f12 = 0.0f;
                f11 = 0.0f;
                f10 = 0.0f;
            }
            cS.a(f13, f12, f11, f10);
        }
    }

    protected void a(T t2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        Iterator<w<T>> iterator = this.x.iterator();
        m[] arrm = b.b();
        while (iterator.hasNext()) {
            w<T> w2 = iterator.next();
            boolean bl2 = this.a(t2, f12, w2.a());
            w2.a(t2, f10, f11, f12, f13, f14, f15, f16);
            if (bl2) {
                this.e();
            }
            if (arrm == null) continue;
        }
    }

    protected int a(T t2, float f10, float f11) {
        return 0;
    }

    public net.minecraft.client.w.j b() {
        return this.i;
    }

    public void f() {
    }

    public static void b(int[] arrn) {
        o = arrn;
    }

    public s(a4 a42, net.minecraft.client.w.j j2, float f10) {
        super(a42);
        this.t = aZ.e(4);
        this.x = Lists.newArrayList();
        this.i = j2;
        this.a = f10;
    }

    protected float d(T t2, float f10) {
        return (float)((B)t2).H + f10;
    }

    /*
     * Exception decompiling
     */
    protected boolean a(T var1_1, float var2_2, boolean var3_3) {
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
     * Enabled aggressive block sorting
     */
    protected boolean d(T t2) {
        boolean bl2;
        m[] arrm;
        block18: {
            net.minecraft.D.l l2;
            net.minecraft.D.l l3;
            net.minecraft.D.l l4;
            block19: {
                T t3;
                c c10;
                block17: {
                    c10 = Q.P().s;
                    arrm = b.b();
                    boolean bl3 = ((x)t2).b(c10);
                    if (arrm == null) {
                        bl3 = !bl3;
                    }
                    bl2 = bl3;
                    t3 = t2;
                    if (arrm != null) break block17;
                    if (t3 == c10) break block18;
                    t3 = t2;
                }
                l4 = ((x)t3).aM();
                l3 = c10.aM();
                l2 = l4;
                if (arrm != null) break block19;
                if (l2 == null) break block18;
                l2 = l4;
            }
            net.minecraft.D.j j2 = l2.d();
            boolean bl4 = ah.a[j2.ordinal()];
            if (arrm != null) return bl4;
            switch (bl4) {
                case 1: {
                    return bl2;
                }
                case 2: {
                    return false;
                }
                case 3: {
                    boolean bl5;
                    net.minecraft.D.l l5 = l3;
                    if (arrm == null) {
                        if (l5 == null) {
                            bl5 = bl2;
                            return bl5;
                        }
                        l5 = l4;
                    }
                    bl5 = l5.a(l3);
                    if (arrm == null) {
                        if (!bl5) return false;
                        bl5 = l4.f();
                    }
                    if (arrm != null) return bl5;
                    if (bl5) return true;
                    bl5 = bl2;
                    if (arrm != null) return bl5;
                    if (!bl5) return false;
                    return true;
                }
                case 4: {
                    boolean bl6;
                    net.minecraft.D.l l6 = l3;
                    if (arrm == null) {
                        if (l6 == null) {
                            bl6 = bl2;
                            return bl6;
                        }
                        l6 = l4;
                    }
                    bl6 = l6.a(l3);
                    if (arrm == null) {
                        if (bl6) return false;
                        bl6 = bl2;
                    }
                    if (arrm != null) return bl6;
                    if (!bl6) return false;
                    return true;
                }
            }
            return true;
        }
        if (!Q.ak()) return false;
        if (t2 == this.h.b) return false;
        boolean bl7 = bl2;
        if (arrm == null) {
            if (!bl7) return false;
            bl7 = ((x)t2).aU();
        }
        if (arrm != null) return bl7;
        if (bl7) return false;
        return true;
    }

    protected float a(T t2, float f10) {
        return ((B)t2).c(f10);
    }

    public List<w<T>> a() {
        return this.x;
    }
}

