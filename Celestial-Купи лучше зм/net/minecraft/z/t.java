/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.z;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import net.minecraft.K.j;
import net.minecraft.T.aW;
import net.minecraft.T.ah;
import net.minecraft.U.B;
import net.minecraft.U.y;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.x.c;
import net.minecraft.z.a;
import net.minecraft.z.d;
import net.minecraft.z.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t
extends r {
    private static final /* synthetic */ Logger aW;
    public static final /* synthetic */ Predicate<B> aY;
    private static final /* synthetic */ net.minecraft.q.r<net.minecraft.w.d> aX;

    @Override
    public void f(net.minecraft.P.r r2) {
        block0: {
            super.f(r2);
            net.minecraft.w.d d10 = this.c();
            if (d10.G()) break block0;
            r2.a("Potion", d10.a(new net.minecraft.P.r()));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(i i2, List<j> list) {
        block10: {
            List<B> list2;
            m[] arrm;
            block9: {
                List<B> list3;
                k k2 = this.m().a(4.0, 2.0, 4.0);
                arrm = net.minecraft.z.d.b();
                list2 = list3 = this.aG.a(B.class, k2);
                if (arrm != null) break block9;
                if (list2.isEmpty()) break block10;
                list2 = list3;
            }
            Iterator<B> iterator = list2.iterator();
            block0: while (true) {
                boolean bl2 = iterator.hasNext();
                block1: while (bl2) {
                    double d10;
                    B b10 = iterator.next();
                    if (!b10.L()) continue block0;
                    double d11 = d10 = this.s(b10);
                    double d12 = 16.0;
                    if (arrm == null) {
                        if (!(d11 < d12)) continue block0;
                        d11 = 1.0;
                        d12 = Math.sqrt(d10) / 4.0;
                    }
                    double d13 = d11 - d12;
                    if (b10 == i2.e) {
                        d13 = 1.0;
                    }
                    for (j j2 : list) {
                        block13: {
                            void var15_13;
                            int n2;
                            net.minecraft.K.b b11;
                            block11: {
                                block12: {
                                    b11 = j2.g();
                                    bl2 = b11.g();
                                    if (arrm != null) continue block1;
                                    if (arrm != null) break block11;
                                    if (!bl2) break block12;
                                    b11.a(this, this.b(), b10, j2.h(), d13);
                                    if (arrm == null) break block13;
                                }
                                n2 = (int)(d13 * (double)j2.e() + 0.5);
                            }
                            if ((var15_13 = n2) > 20) {
                                b10.b(new j(b11, (int)var15_13, j2.h(), j2.c(), j2.f()));
                            }
                        }
                        if (arrm == null) continue;
                    }
                    if (arrm == null) continue block0;
                }
                break;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void b() {
        block6: {
            List<B> list;
            m[] arrm;
            block5: {
                List<B> list2;
                k k2 = this.m().a(4.0, 2.0, 4.0);
                arrm = net.minecraft.z.d.b();
                list = list2 = this.aG.a(B.class, k2, aY);
                if (arrm != null) break block5;
                if (list.isEmpty()) break block6;
                list = list2;
            }
            for (B b10 : list) {
                block8: {
                    double d10;
                    block7: {
                        double d11 = this.s(b10);
                        double d12 = d11 - 16.0;
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                        if (arrm != null) break block7;
                        if (d10 >= 0) break block8;
                        d10 = (double)net.minecraft.z.t.a(b10);
                    }
                    if (arrm == null && d10 != false) {
                        d10 = (double)b10.a(net.minecraft.ar.G.u, 1.0f);
                    }
                }
                if (arrm == null) continue;
            }
        }
    }

    private boolean d() {
        return this.c().w() == h.W;
    }

    public t(z z2, B b10, net.minecraft.w.d d10) {
        super(z2, b10);
        this.a(d10);
    }

    public t(z z2, double d10, double d11, double d12, net.minecraft.w.d d13) {
        super(z2, d10, d11, d12);
        if (!d13.G()) {
            this.a(d13);
        }
    }

    public static void b(b b10) {
        r.a(b10, "ThrownPotion");
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new c(t.class, "Potion"));
    }

    public void a(net.minecraft.w.d d10) {
        this.E().b(aX, d10);
        this.E().c(aX);
    }

    public t(z z2) {
        super(z2);
    }

    static boolean b(B b10) {
        return net.minecraft.z.t.a(b10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(B b10) {
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = b10 instanceof ah;
        if (arrm != null) return bl2;
        if (bl2) return true;
        bl2 = b10 instanceof aW;
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public net.minecraft.w.d c() {
        net.minecraft.w.d d10 = this.E().b(aX);
        m[] arrm = net.minecraft.z.d.b();
        net.minecraft.w.d d11 = d10;
        if (arrm != null) return d11;
        if (d11.w() != h.b3) {
            d11 = d10;
            if (arrm != null) return d11;
            if (d11.w() != h.W) {
                if (this.aG == null) return new net.minecraft.w.d(h.b3);
                aW.error("ThrownPotion entity {} has no item?!", (Object)this.W());
                return new net.minecraft.w.d(h.b3);
            }
        }
        d11 = d10;
        return d11;
    }

    @Override
    protected float a() {
        return 0.05f;
    }

    static {
        aX = net.minecraft.q.m.a(t.class, net.minecraft.q.h.o);
        aW = LogManager.getLogger();
        aY = new a();
    }

    @Override
    protected void ab() {
        this.E().c(aX, net.minecraft.w.d.m);
    }

    private void a(n n2, aA aA2) {
        block3: {
            z z2;
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                z2 = this.aG;
                if (arrm != null) break block2;
                if (z2.d(n2).b() != net.minecraft.u.g.C) break block3;
                z2 = this.aG;
            }
            z2.a(null, n2.a(aA2), aA2.h());
        }
    }

    @Override
    public void a(net.minecraft.P.r r2) {
        block2: {
            net.minecraft.w.d d10;
            block1: {
                m[] arrm;
                block0: {
                    m[] arrm2 = net.minecraft.z.d.b();
                    super.a(r2);
                    arrm = arrm2;
                    d10 = new net.minecraft.w.d(r2.h("Potion"));
                    if (arrm != null) break block0;
                    if (!d10.G()) break block1;
                    this.a();
                }
                if (arrm == null) break block2;
            }
            this.a(d10);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(i var1_1) {
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

    private void a(net.minecraft.w.d d10, net.minecraft.K.i i2) {
        block5: {
            boolean bl2;
            y y2;
            block6: {
                m[] arrm = net.minecraft.z.d.b();
                y2 = new y(this.aG, this.a, this.aF, this.ax);
                y2.b(this.b());
                m[] arrm2 = arrm;
                y2.d(3.0f);
                y2.c(-0.5f);
                y2.e(10);
                y2.b(-y2.d() / (float)y2.h());
                y2.a(i2);
                for (j j2 : net.minecraft.K.k.c(d10)) {
                    y2.a(new j(j2));
                    if (arrm2 == null) continue;
                }
                net.minecraft.P.r r2 = d10.v();
                if (arrm2 != null) break block5;
                if (r2 == null) break block6;
                bl2 = r2.a("CustomPotionColor", 99);
                if (arrm2 != null) break block5;
                if (bl2) {
                    y2.f(r2.m("CustomPotionColor"));
                }
            }
            bl2 = this.aG.f(y2);
        }
    }
}

