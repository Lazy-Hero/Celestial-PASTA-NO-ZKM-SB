/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.W.bq;
import net.minecraft.Z.i;
import net.minecraft.a7;
import net.minecraft.aZ;
import net.minecraft.ah.F;
import net.minecraft.ah.G;
import net.minecraft.ah.K;
import net.minecraft.ah.L;
import net.minecraft.ah.O;
import net.minecraft.ah.Q;
import net.minecraft.ah.U;
import net.minecraft.ah.a;
import net.minecraft.ah.b;
import net.minecraft.ah.c;
import net.minecraft.ah.e;
import net.minecraft.ah.g;
import net.minecraft.ah.h;
import net.minecraft.ah.k;
import net.minecraft.ah.r;
import net.minecraft.ah.t;
import net.minecraft.ah.w;
import net.minecraft.ar.Z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.a_;
import net.minecraft.ar.ao;
import net.minecraft.ar.av;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.c.f;
import net.minecraft.e.n;
import net.minecraft.k.j;
import net.minecraft.k.l;
import net.minecraft.k.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class z
implements t {
    private static /* synthetic */ String K;
    /* synthetic */ int[] L;
    public final /* synthetic */ G D;
    protected /* synthetic */ int r;
    protected /* synthetic */ float I;
    private final /* synthetic */ List<y> x;
    public final /* synthetic */ Random J;
    private /* synthetic */ int P;
    public final /* synthetic */ List<x> h;
    protected /* synthetic */ boolean i;
    private /* synthetic */ int n;
    public final /* synthetic */ net.minecraft.aq.b H;
    protected final /* synthetic */ net.minecraft.aw.b q;
    protected /* synthetic */ float d;
    protected final /* synthetic */ List<x> t;
    protected /* synthetic */ boolean s;
    protected /* synthetic */ float p;
    private /* synthetic */ boolean o;
    private /* synthetic */ int j;
    protected /* synthetic */ net.minecraft.o.k Q;
    protected final /* synthetic */ int G = 1013904223;
    protected /* synthetic */ net.minecraft.y.c g;
    private final /* synthetic */ Calendar z;
    public final /* synthetic */ List<y> N;
    public final /* synthetic */ List<y> e;
    private final /* synthetic */ net.minecraft.V.a c;
    protected /* synthetic */ boolean f;
    private final /* synthetic */ List<y> a;
    public final /* synthetic */ boolean C;
    protected /* synthetic */ a7 b;
    protected final /* synthetic */ a_<x> w;
    protected /* synthetic */ boolean F;
    protected /* synthetic */ n l;
    protected /* synthetic */ List<k> v;
    protected /* synthetic */ net.minecraft.aw.k E;
    protected /* synthetic */ float y;
    protected /* synthetic */ net.minecraft.D.b A;
    protected /* synthetic */ aZ B;
    protected /* synthetic */ net.minecraft.aj.h M;
    private final /* synthetic */ long m = 0xFFFFFFL;
    protected /* synthetic */ net.minecraft.aw.w u;
    public final /* synthetic */ List<x> O;
    public final /* synthetic */ List<net.minecraft.i.j> k;

    public double P() {
        return this.u.w() == net.minecraft.ah.L.g ? 0.0 : 63.0;
    }

    public void b(Collection<x> collection) {
        String string = net.minecraft.ah.z.I();
        this.O.addAll(collection);
        Iterator<x> iterator = collection.iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            x x2 = iterator.next();
            this.g(x2);
            if (string2 != null) continue;
        }
    }

    public void a(k k2) {
        this.v.add(k2);
    }

    public void t() {
        this.r(new net.minecraft.k.n(8, 64, 8));
    }

    public void a(String string, net.minecraft.aw.r r2) {
        this.E.a(string, r2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.W.K k2, net.minecraft.k.n n2, boolean bl2, aA aA2, @Nullable x x2) {
        net.minecraft.k.k k3;
        i i2 = this.d(n2);
        String string = net.minecraft.ah.z.I();
        net.minecraft.k.k k4 = k3 = bl2 ? null : k2.d().d(this, n2);
        if (k3 != net.minecraft.W.K.a) {
            boolean bl3 = this.a(k3.a(n2), x2);
            if (string == null) return bl3;
            if (!bl3) {
                return false;
            }
        }
        net.minecraft.ac.c c10 = i2.o();
        if (string != null) {
            if (c10 == net.minecraft.ac.c.n && k2 == net.minecraft.u.g.cb) {
                return true;
            }
            c10 = i2.o();
        }
        boolean bl4 = c10.k();
        if (string != null) {
            if (!bl4) return false;
            bl4 = k2.a(this, n2, aA2);
        }
        if (string == null) return bl4;
        if (!bl4) return false;
        return true;
    }

    public boolean d(net.minecraft.k.k k2) {
        return this.a(null, k2, true, Lists.newArrayList());
    }

    public void a(net.minecraft.k.n n2, net.minecraft.W.K k2, net.minecraft.k.n n3) {
        block5: {
            z z2;
            block4: {
                String string = net.minecraft.ah.z.I();
                z2 = this;
                if (string == null) break block4;
                if (z2.C) break block5;
                z2 = this;
            }
            i i2 = z2.d(n2);
            try {
                i2.a(this, n2, k2, n3);
            }
            catch (Throwable throwable) {
                f f10 = net.minecraft.c.f.a(throwable, "Exception while updating neighbours");
                net.minecraft.c.l l2 = f10.a("Block being updated");
                l2.a("Source block type", new r(this, k2));
                net.minecraft.c.l.a(l2, n2, i2);
                throw new Z(f10);
            }
        }
    }

    public boolean b(net.minecraft.ao.b b10, boolean bl2) {
        return this.a(b10.c, b10.e, b10.f, b10.a, b10.b, b10.d, bl2);
    }

    public float a(l l2, net.minecraft.k.k k2) {
        block11: {
            float f10;
            block7: {
                double d10;
                double d11;
                double d12;
                double d13;
                String string;
                double d14;
                double d15;
                block13: {
                    block12: {
                        block10: {
                            d15 = 1.0 / ((k2.f - k2.e) * 2.0 + 1.0);
                            d14 = 1.0 / ((k2.a - k2.b) * 2.0 + 1.0);
                            string = net.minecraft.ah.z.I();
                            d13 = 1.0 / ((k2.g - k2.d) * 2.0 + 1.0);
                            d12 = (1.0 - Math.floor(1.0 / d15) * d15) / 2.0;
                            d11 = (1.0 - Math.floor(1.0 / d13) * d13) / 2.0;
                            double d16 = d15 - 0.0;
                            d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                            if (string == null) break block10;
                            if (d10 < 0) break block11;
                            double d17 = d14 - 0.0;
                            d10 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                        }
                        if (string == null) break block12;
                        if (d10 < 0) break block11;
                        double d18 = d13 - 0.0;
                        d10 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                    }
                    if (string == null) break block13;
                    if (d10 < 0) break block11;
                    d10 = 0.0;
                }
                double d19 = d10;
                int n2 = 0;
                float f11 = 0.0f;
                while (f11 <= 1.0f) {
                    block8: {
                        float f12;
                        f10 = 0.0f;
                        if (string == null) break block7;
                        float f13 = f10;
                        while (f13 <= 1.0f) {
                            block9: {
                                f12 = 0.0f;
                                if (string == null) break block8;
                                float f14 = f12;
                                while (f14 <= 1.0f) {
                                    double d20 = k2.e + (k2.f - k2.e) * (double)f11;
                                    double d21 = k2.b + (k2.a - k2.b) * (double)f13;
                                    double d22 = k2.d + (k2.g - k2.d) * (double)f14;
                                    if (string != null) {
                                        if (string != null) {
                                            if (this.a(new l(d20 + d12, d21, d22 + d11), l2) == null) {
                                                ++d19;
                                            }
                                            ++n2;
                                            f14 = (float)((double)f14 + d13);
                                        }
                                        if (string != null) continue;
                                    }
                                    break block9;
                                }
                                f13 = (float)((double)f13 + d14);
                            }
                            if (string != null) continue;
                        }
                        f12 = f11 = (float)((double)f11 + d15);
                    }
                    if (string != null) continue;
                }
                f10 = (float)d19 / (float)n2;
            }
            return f10;
        }
        return 0.0f;
    }

    public void a(int n2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(n2, false, true, d10, d11, d12, d13, d14, d15, arrn);
            if (string != null) continue;
        }
    }

    public void a(@Nullable net.minecraft.i.j j2, int n2, net.minecraft.k.n n3, int n4) {
        String string = net.minecraft.ah.z.I();
        try {
            for (int i2 = 0; i2 < this.v.size(); ++i2) {
                this.v.get(i2).a(j2, n2, n3, n4);
                if (string != null && string != null) continue;
                break;
            }
        }
        catch (Throwable throwable) {
            f f10 = net.minecraft.c.f.a(throwable, "Playing level event");
            net.minecraft.c.l l2 = f10.a("Level event being played");
            l2.a("Block coordinates", net.minecraft.c.l.a(n3));
            l2.a("Event source", j2);
            l2.a("Event type", n2);
            l2.a("Event data", n4);
            throw new Z(f10);
        }
    }

    public void a(long l2) {
        this.u.b(l2);
    }

    public int a(String string) {
        return this.E.a(string);
    }

    public void a(double d10, double d11, double d12, double d13, double d14, double d15, @Nullable net.minecraft.P.r r2) {
    }

    /*
     * Exception decompiling
     */
    private boolean a(@Nullable x var1_1, net.minecraft.k.k var2_2, boolean var3_3, @Nullable List<net.minecraft.k.k> var4_4) {
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

    public static String I() {
        return K;
    }

    public List<net.minecraft.k.k> a(@Nullable x x2, net.minecraft.k.k k2) {
        ArrayList arrayList;
        block8: {
            net.minecraft.k.k k3;
            x x3;
            z z2;
            String string;
            block7: {
                arrayList = Lists.newArrayList();
                string = net.minecraft.ah.z.I();
                z2 = this;
                x3 = x2;
                k3 = k2;
                if (string == null) break block7;
                z2.a(x3, k3, false, arrayList);
                if (x2 == null) break block8;
                z2 = this;
                x3 = x2;
                k3 = k2.a(0.25);
            }
            List<x> list = z2.b(x3, k3);
            int n2 = 0;
            while (n2 < list.size()) {
                block9: {
                    block10: {
                        net.minecraft.k.k k4;
                        net.minecraft.k.k k5;
                        block11: {
                            x x4;
                            block12: {
                                x4 = list.get(n2);
                                if (string == null) break block9;
                                if (x2.i(x4)) break block10;
                                k4 = k5 = x4.az();
                                if (string == null) break block11;
                                if (k4 == null) break block12;
                                k4 = k5;
                                if (string == null) break block11;
                                if (k4.c(k2)) {
                                    arrayList.add(k5);
                                }
                            }
                            k5 = x2.k(x4);
                            if (string == null) break block9;
                            k4 = k5;
                        }
                        if (k4 != null) {
                            boolean bl2 = k5.c(k2);
                            if (string != null && bl2) {
                                bl2 = arrayList.add(k5);
                            }
                        }
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
        }
        return arrayList;
    }

    public void b(net.minecraft.k.n n2, net.minecraft.W.K k2) {
        Iterator<aA> iterator = av.HORIZONTAL.iterator();
        String string = net.minecraft.ah.z.I();
        while (iterator.hasNext()) {
            block4: {
                i i2;
                net.minecraft.k.n n3;
                block8: {
                    boolean bl2;
                    i i3;
                    block7: {
                        aA aA2;
                        block5: {
                            block6: {
                                net.minecraft.k.n n4;
                                z z2;
                                block3: {
                                    aA2 = iterator.next();
                                    n3 = n2.a(aA2);
                                    z2 = this;
                                    n4 = n3;
                                    if (string == null) break block3;
                                    if (!z2.n(n4)) break block4;
                                    z2 = this;
                                    n4 = n3;
                                }
                                i3 = z2.d(n4);
                                bl2 = net.minecraft.u.g.cP.g(i3);
                                if (string == null) break block5;
                                if (!bl2) break block6;
                                i3.a(this, n3, k2, n2);
                                if (string != null) break block4;
                            }
                            bl2 = i3.r();
                        }
                        if (string == null) break block7;
                        if (!bl2) break block4;
                        n3 = n3.a(aA2);
                        i2 = this.d(n3);
                        if (string == null) break block8;
                        i3 = i2;
                        bl2 = net.minecraft.u.g.cP.g(i3);
                    }
                    if (!bl2) break block4;
                    i2 = i3;
                }
                i2.a(this, n3, k2, n2);
            }
            if (string != null) continue;
        }
    }

    public int l(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        int n3 = n2.b();
        if (string != null) {
            if (n3 < 0) {
                return 0;
            }
            n3 = n2.b();
        }
        if (string != null) {
            if (n3 >= 256) {
                n2 = new net.minecraft.k.n(n2.e(), 255, n2.a());
            }
            n3 = this.b(n2).a(n2, 0);
        }
        return n3;
    }

    public void c(int n2, net.minecraft.k.n n3, int n4) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            k k2 = this.v.get(i2);
            k2.a(n2, n3, n4);
            if (string != null) continue;
        }
    }

    public boolean a(net.minecraft.k.k k2, net.minecraft.ac.c c10, x x2) {
        int n2;
        block18: {
            boolean bl2;
            block19: {
                l l2;
                String string;
                block14: {
                    int n3 = net.minecraft.k.h.f(k2.e);
                    int n4 = net.minecraft.k.h.i(k2.f);
                    int n5 = net.minecraft.k.h.f(k2.b);
                    int n6 = net.minecraft.k.h.i(k2.a);
                    int n7 = net.minecraft.k.h.f(k2.d);
                    string = net.minecraft.ah.z.I();
                    int n8 = net.minecraft.k.h.i(k2.g);
                    boolean bl3 = this.a(n3, n5, n7, n4, n6, n8, true);
                    if (string != null) {
                        if (!bl3) {
                            return false;
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    l2 = net.minecraft.k.l.a;
                    p p2 = net.minecraft.k.p.a();
                    int n9 = n3;
                    block0: while (true) {
                        int n10 = n9;
                        block1: while (n10 < n4) {
                            n2 = n5;
                            if (string == null) break block14;
                            int n11 = n2;
                            while (n11 < n6) {
                                block15: {
                                    n10 = n7;
                                    if (string == null) continue block1;
                                    int n12 = n10;
                                    while (n12 < n8) {
                                        block16: {
                                            block17: {
                                                p2.a(n9, n11, n12);
                                                i i2 = this.d(p2);
                                                net.minecraft.W.K k3 = i2.b();
                                                if (string == null) break block15;
                                                if (string == null) break block16;
                                                if (i2.o() != c10) break block17;
                                                double d10 = (float)(n11 + 1) - bq.a(i2.b(bq.z));
                                                if (string == null) break block16;
                                                if ((double)n6 >= d10) {
                                                    bl2 = true;
                                                    l2 = k3.a(this, (net.minecraft.k.n)p2, x2, l2);
                                                }
                                            }
                                            ++n12;
                                        }
                                        if (string != null) continue;
                                    }
                                    ++n11;
                                }
                                if (string != null) continue;
                            }
                            ++n9;
                            if (string != null) continue block0;
                        }
                        break;
                    }
                    p2.b();
                    double d11 = l2.a() - 0.0;
                    n2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                }
                if (string == null) break block18;
                if (n2 <= 0) break block19;
                n2 = x2.ah() ? 1 : 0;
                if (string == null) break block18;
                if (n2 != 0) {
                    l2 = l2.d();
                    double d12 = 0.014;
                    x2.aq += l2.e * 0.014;
                    x2.G += l2.d * 0.014;
                    x2.d += l2.b * 0.014;
                }
            }
            n2 = bl2 ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    public int a(net.minecraft.k.n n2, aA aA2) {
        return this.d(n2).b(this, n2, aA2);
    }

    public net.minecraft.k.n G() {
        net.minecraft.k.n n2;
        block3: {
            z z2;
            block2: {
                n2 = new net.minecraft.k.n(this.u.M(), this.u.j(), this.u.h());
                String string = net.minecraft.ah.z.I();
                z2 = this;
                if (string == null) break block2;
                if (z2.O().a(n2)) break block3;
                z2 = this;
            }
            n2 = z2.C(new net.minecraft.k.n(this.O().n(), 0.0, this.O().l()));
        }
        return n2;
    }

    public boolean a(net.minecraft.k.n n2, net.minecraft.k.n n3) {
        return this.a(n2, n3, true);
    }

    public float a(float f10) {
        return this.p + (this.y - this.p) * f10;
    }

    public void b(k k2) {
        this.v.remove(k2);
    }

    protected void S() {
        block18: {
            block37: {
                block35: {
                    z z2;
                    block36: {
                        String string;
                        block34: {
                            block32: {
                                z z3;
                                block33: {
                                    int n2;
                                    block20: {
                                        block21: {
                                            block28: {
                                                int n3;
                                                block29: {
                                                    net.minecraft.aw.w w2;
                                                    block30: {
                                                        block31: {
                                                            int n4;
                                                            block27: {
                                                                block26: {
                                                                    block22: {
                                                                        int n5;
                                                                        block23: {
                                                                            net.minecraft.aw.w w3;
                                                                            block24: {
                                                                                block25: {
                                                                                    int n6;
                                                                                    int n7;
                                                                                    block19: {
                                                                                        block17: {
                                                                                            string = net.minecraft.ah.z.I();
                                                                                            n7 = this.D.h();
                                                                                            if (string == null) break block17;
                                                                                            if (n7 == 0) break block18;
                                                                                            n7 = this.C;
                                                                                        }
                                                                                        if (string == null) break block19;
                                                                                        if (n7 != 0) break block18;
                                                                                        n7 = this.M().c("doWeatherCycle");
                                                                                    }
                                                                                    n2 = n6 = n7;
                                                                                    if (string == null) break block20;
                                                                                    if (n2 == 0) break block21;
                                                                                    int n8 = this.u.B();
                                                                                    int n9 = n8--;
                                                                                    if (string != null) {
                                                                                        if (n9 > 0) {
                                                                                            this.u.h(n8);
                                                                                            int n10 = this.u.k();
                                                                                            if (string != null) {
                                                                                                n10 = n10 != 0 ? 1 : 2;
                                                                                            }
                                                                                            this.u.a(n10);
                                                                                            int n11 = this.u.b();
                                                                                            if (string != null) {
                                                                                                n11 = n11 != 0 ? 1 : 2;
                                                                                            }
                                                                                            this.u.g(n11);
                                                                                        }
                                                                                        n9 = this.u.f();
                                                                                    }
                                                                                    n4 = n5 = n9;
                                                                                    if (string == null) break block22;
                                                                                    if (n4 > 0) break block23;
                                                                                    w3 = this.u;
                                                                                    if (string == null) break block24;
                                                                                    if (!w3.k()) break block25;
                                                                                    this.u.a(this.J.nextInt(12000) + 3600);
                                                                                    if (string != null) break block26;
                                                                                }
                                                                                w3 = this.u;
                                                                            }
                                                                            w3.a(this.J.nextInt(168000) + 12000);
                                                                            if (string != null) break block26;
                                                                        }
                                                                        this.u.a(--n5);
                                                                        n4 = n5;
                                                                    }
                                                                    if (string == null) break block27;
                                                                    if (n4 <= 0) {
                                                                        boolean bl2 = this.u.k();
                                                                        if (string != null) {
                                                                            bl2 = !bl2;
                                                                        }
                                                                        this.u.a(bl2);
                                                                    }
                                                                }
                                                                n4 = this.u.I();
                                                            }
                                                            n2 = n3 = n4;
                                                            if (string == null) break block28;
                                                            if (n2 > 0) break block29;
                                                            w2 = this.u;
                                                            if (string == null) break block30;
                                                            if (!w2.b()) break block31;
                                                            this.u.g(this.J.nextInt(12000) + 12000);
                                                            if (string != null) break block21;
                                                        }
                                                        w2 = this.u;
                                                    }
                                                    w2.g(this.J.nextInt(168000) + 12000);
                                                    if (string != null) break block21;
                                                }
                                                this.u.g(--n3);
                                                n2 = n3;
                                            }
                                            if (string == null) break block20;
                                            if (n2 <= 0) {
                                                boolean bl3 = this.u.b();
                                                if (string != null) {
                                                    bl3 = !bl3;
                                                }
                                                this.u.c(bl3);
                                            }
                                        }
                                        this.I = this.d;
                                        z3 = this;
                                        if (string == null) break block32;
                                        n2 = z3.u.k();
                                    }
                                    if (n2 == 0) break block33;
                                    this.d = (float)((double)this.d + 0.01);
                                    if (string != null) break block34;
                                }
                                z3 = this;
                            }
                            z3.d = (float)((double)this.d - 0.01);
                        }
                        this.d = net.minecraft.k.h.c(this.d, 0.0f, 1.0f);
                        this.p = this.y;
                        z2 = this;
                        if (string == null) break block35;
                        if (!z2.u.b()) break block36;
                        this.y = (float)((double)this.y + 0.01);
                        if (string != null) break block37;
                    }
                    z2 = this;
                }
                z2.y = (float)((double)this.y - 0.01);
            }
            this.y = net.minecraft.k.h.c(this.y, 0.0f, 1.0f);
        }
    }

    public void i(x x2) {
        this.a(x2, true);
    }

    @Nullable
    public net.minecraft.k.i a(l l2, l l3, boolean bl2) {
        return this.a(l2, l3, bl2, false, false);
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(n2, n3, n4, n5, n6, n7);
            if (string != null) continue;
        }
    }

    public boolean c(net.minecraft.k.n n2, net.minecraft.W.K k2) {
        return false;
    }

    public l b(float f10) {
        float f11 = this.h(f10);
        return this.D.a(f11, f10);
    }

    @Nullable
    public net.minecraft.R.b H() {
        return null;
    }

    public net.minecraft.A.b B() {
        return this.D.p();
    }

    public l a(x x2, float f10) {
        float f11;
        float f12;
        float f13;
        block10: {
            float f14;
            float f15;
            String string;
            block9: {
                float f16;
                float f17;
                float f18 = this.h(f10);
                float f19 = net.minecraft.k.h.c(f18 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
                f19 = net.minecraft.k.h.c(f19, 0.0f, 1.0f);
                int n2 = net.minecraft.k.h.f(x2.a);
                int n3 = net.minecraft.k.h.f(x2.aF);
                int n4 = net.minecraft.k.h.f(x2.ax);
                net.minecraft.k.n n5 = new net.minecraft.k.n(n2, n3, n4);
                net.minecraft.A.h h2 = this.c(n5);
                float f20 = h2.a(n5);
                int n6 = h2.a(f20);
                f13 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                f12 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                f11 = (float)(n6 & 0xFF) / 255.0f;
                f13 *= f19;
                string = net.minecraft.ah.z.I();
                f12 *= f19;
                f11 *= f19;
                float f21 = f17 = this.a(f10);
                if (string != null) {
                    if (f21 > 0.0f) {
                        f16 = (f13 * 0.3f + f12 * 0.59f + f11 * 0.11f) * 0.6f;
                        f15 = 1.0f - f17 * 0.75f;
                        f13 = f13 * f15 + f16 * (1.0f - f15);
                        f12 = f12 * f15 + f16 * (1.0f - f15);
                        f11 = f11 * f15 + f16 * (1.0f - f15);
                    }
                    f21 = this.g(f10);
                }
                f16 = f21;
                float f22 = f16 - 0.0f;
                f14 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                if (string != null) {
                    if (f14 > 0) {
                        f15 = (f13 * 0.3f + f12 * 0.59f + f11 * 0.11f) * 0.2f;
                        float f23 = 1.0f - f16 * 0.75f;
                        f13 = f13 * f23 + f15 * (1.0f - f23);
                        f12 = f12 * f23 + f15 * (1.0f - f23);
                        f11 = f11 * f23 + f15 * (1.0f - f23);
                    }
                    f14 = this.n;
                }
                if (string == null) break block9;
                if (f14 <= 0) break block10;
                f14 = this.n;
            }
            float f24 = f15 = (float)f14 - f10;
            float f25 = 1.0f;
            if (string != null) {
                if (f24 > f25) {
                    f15 = 1.0f;
                }
                f13 = f13 * (1.0f - (f15 *= 0.45f)) + 0.8f * f15;
                f12 = f12 * (1.0f - f15) + 0.8f * f15;
                f24 = f11 * (1.0f - f15);
                f25 = 1.0f * f15;
            }
            f11 = f24 + f25;
        }
        return new l(f13, f12, f11);
    }

    static {
        if (net.minecraft.ah.z.I() == null) {
            net.minecraft.ah.z.b("u3SbCc");
        }
    }

    public int y() {
        return this.P;
    }

    public void a(net.minecraft.k.n n2, net.minecraft.W.K k2, boolean bl2) {
        block3: {
            net.minecraft.W.K k3;
            net.minecraft.k.n n3;
            z z2;
            block2: {
                String string = net.minecraft.ah.z.I();
                this.a(n2.b(), k2, n2);
                String string2 = string;
                this.a(n2.m(), k2, n2);
                this.a(n2.k(), k2, n2);
                this.a(n2.a(), k2, n2);
                this.a(n2.i(), k2, n2);
                z2 = this;
                n3 = n2.j();
                k3 = k2;
                if (string2 == null) break block2;
                z2.a(n3, k3, n2);
                if (!bl2) break block3;
                z2 = this;
                n3 = n2;
                k3 = k2;
            }
            z2.d(n3, k3);
        }
    }

    public net.minecraft.D.b c() {
        return this.A;
    }

    @Nullable
    public net.minecraft.i.j a(double d10, double d11, double d12, double d13, boolean bl2) {
        Predicate<x> predicate = bl2 ? net.minecraft.ar.e.d : net.minecraft.ar.e.e;
        return this.a(d10, d11, d12, d13, predicate);
    }

    public U a(@Nullable x x2, double d10, double d11, double d12, float f10, boolean bl2, boolean bl3) {
        U u2 = new U(this, x2, d10, d11, d12, f10, bl2, bl3);
        u2.e();
        u2.a(true);
        return u2;
    }

    public boolean R() {
        String string = net.minecraft.ah.z.I();
        boolean bl2 = this.j;
        if (string != null) {
            bl2 = bl2 < BADBOOL 4;
        }
        return bl2;
    }

    public void a(net.minecraft.C.K<?> k2) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    public boolean a(net.minecraft.k.n n2, int n3) {
        return this.a(n2, n3, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t(net.minecraft.k.n n2) {
        net.minecraft.k.n n3;
        z z2;
        String string;
        block11: {
            int n4;
            block10: {
                string = net.minecraft.ah.z.I();
                n4 = this.J();
                if (string != null) {
                    if (n4 == 0) {
                        return false;
                    }
                    n4 = this.w(n2);
                }
                if (string == null) break block10;
                if (n4 == 0) {
                    return false;
                }
                z2 = this;
                n3 = n2;
                if (string == null) break block11;
                n4 = z2.d(n3).b();
            }
            if (n4 > n2.b()) {
                return false;
            }
            z2 = this;
            n3 = n2;
        }
        net.minecraft.A.h h2 = z2.c(n3);
        boolean bl2 = h2.g();
        if (string != null) {
            if (bl2) {
                return false;
            }
            bl2 = this.b(n2, false);
        }
        if (string != null) {
            if (bl2) return false;
            bl2 = h2.p();
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public int B(net.minecraft.k.n n2) {
        int n3;
        block5: {
            int n4 = 0;
            String string = net.minecraft.ah.z.I();
            for (aA aA2 : aA.values()) {
                int n5;
                block7: {
                    int n6;
                    int n7;
                    block6: {
                        n3 = n7 = this.b(n2.a(aA2), aA2);
                        if (string == null) break block5;
                        n6 = 15;
                        if (string == null) break block6;
                        if (n3 >= n6) {
                            return 15;
                        }
                        n5 = n7;
                        if (string == null) break block7;
                        n6 = n4;
                    }
                    if (n5 <= n6) continue;
                    n5 = n7;
                }
                n4 = n5;
                if (string != null) continue;
            }
            n3 = n4;
        }
        return n3;
    }

    public void z(net.minecraft.k.n n2) {
        block7: {
            y y2;
            y y3;
            block4: {
                block5: {
                    String string;
                    block6: {
                        y3 = this.b(n2);
                        string = net.minecraft.ah.z.I();
                        y2 = y3;
                        if (string == null) break block4;
                        if (y2 == null) break block5;
                        boolean bl2 = this.o;
                        if (string == null) break block6;
                        if (!bl2) break block5;
                        y3.i();
                        bl2 = this.x.remove(y3);
                    }
                    if (string != null) break block7;
                }
                y2 = y3;
            }
            if (y2 != null) {
                this.x.remove(y3);
                this.e.remove(y3);
                this.N.remove(y3);
            }
            this.b(n2).b(n2);
        }
    }

    @Nullable
    public net.minecraft.i.j a(double d10, double d11, double d12, double d13, double d14, @Nullable Function<net.minecraft.i.j, Double> function, @Nullable Predicate<net.minecraft.i.j> predicate) {
        net.minecraft.i.j j2;
        block9: {
            double d15 = -1.0;
            String string = net.minecraft.ah.z.I();
            net.minecraft.i.j j3 = null;
            int n2 = 0;
            while (n2 < this.k.size()) {
                block10: {
                    block11: {
                        double d16;
                        net.minecraft.i.j j4;
                        block24: {
                            double d17;
                            block25: {
                                double d18;
                                block22: {
                                    block23: {
                                        double d19;
                                        block20: {
                                            double d20;
                                            block21: {
                                                double d21;
                                                block17: {
                                                    float f10;
                                                    block19: {
                                                        float f11;
                                                        block18: {
                                                            net.minecraft.i.j j5;
                                                            block16: {
                                                                boolean bl2;
                                                                block15: {
                                                                    block14: {
                                                                        Predicate<net.minecraft.i.j> predicate2;
                                                                        block13: {
                                                                            boolean bl3;
                                                                            block12: {
                                                                                j4 = this.k.get(n2);
                                                                                if (string == null) break block10;
                                                                                j2 = j4;
                                                                                if (string == null) break block9;
                                                                                if (j2.cw.b) break block11;
                                                                                bl3 = j4.aL();
                                                                                if (string == null) break block12;
                                                                                if (!bl3) break block11;
                                                                                bl3 = j4.ae();
                                                                            }
                                                                            if (bl3) break block11;
                                                                            predicate2 = predicate;
                                                                            if (string == null) break block13;
                                                                            if (predicate2 == null) break block14;
                                                                            predicate2 = predicate;
                                                                        }
                                                                        if (!predicate2.apply((Object)j4)) break block11;
                                                                    }
                                                                    d17 = j4.a(d10, j4.aF, d12);
                                                                    d19 = d13;
                                                                    bl2 = j4.a4();
                                                                    if (string == null) break block15;
                                                                    if (bl2) {
                                                                        d19 = d13 * (double)0.8f;
                                                                    }
                                                                    j5 = j4;
                                                                    if (string == null) break block16;
                                                                    bl2 = j5.a3();
                                                                }
                                                                if (!bl2) break block17;
                                                                j5 = j4;
                                                            }
                                                            f11 = f10 = j5.Q();
                                                            if (string == null) break block18;
                                                            if (!(f11 < 0.1f)) break block19;
                                                            f11 = 0.1f;
                                                        }
                                                        f10 = f11;
                                                    }
                                                    d19 *= (double)(0.7f * f10);
                                                }
                                                if (function != null) {
                                                    d19 *= ((Double)MoreObjects.firstNonNull((Object)function.apply((Object)j4), (Object)1.0)).doubleValue();
                                                }
                                                d18 = (d21 = d14 - 0.0) == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                                                if (string == null) break block20;
                                                if (d18 < 0) break block21;
                                                double d22 = Math.abs(j4.aF - d11) - d14 * d14;
                                                d18 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                                                if (string == null) break block20;
                                                if (d18 >= 0) break block11;
                                            }
                                            d18 = (d20 = d13 - 0.0) == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                        }
                                        if (string == null) break block22;
                                        if (d18 < 0) break block23;
                                        double d23 = d17 - d19 * d19;
                                        d18 = d23 == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                                        if (string == null) break block22;
                                        if (d18 >= 0) break block11;
                                    }
                                    d16 = d15;
                                    if (string == null) break block24;
                                    double d24 = d16 - -1.0;
                                    d18 = d24 == 0.0 ? 0 : (d24 > 0.0 ? 1 : -1);
                                }
                                if (d18 == false) break block25;
                                d16 = d17;
                                if (string == null) break block24;
                                if (!(d16 < d15)) break block11;
                            }
                            d16 = d17;
                        }
                        d15 = d16;
                        j3 = j4;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            j2 = j3;
        }
        return j2;
    }

    private void a(int n2, boolean bl2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(n2, bl2, d10, d11, d12, d13, d14, d15, arrn);
            if (string != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void K() {
        block83: {
            block84: {
                block67: {
                    block66: {
                        block65: {
                            block64: {
                                block63: {
                                    v0 = net.minecraft.ah.z.I();
                                    this.H.b("entities");
                                    this.H.b("global");
                                    var1_1 = v0;
                                    for (var2_2 = 0; var2_2 < this.h.size(); ++var2_2) {
                                        var3_4 = this.h.get(var2_2);
                                        try {
                                            ++var3_4.H;
                                            var3_4.ae();
                                            if (var1_1 == null) break block63;
                                        }
                                        catch (Throwable var4_6) {
                                            var5_11 = net.minecraft.c.f.a(var4_6, "Ticking entity");
                                            var6_16 = var5_11.a("Entity being ticked");
                                            v1 = var3_4;
                                            if (var1_1 != null) {
                                                if (v1 == null) {
                                                    var6_16.a("Entity", "~~NULL~~");
                                                    if (var1_1 != null) throw new Z(var5_11);
                                                }
                                                v1 = var3_4;
                                            }
                                            v1.a(var6_16);
                                            throw new Z(var5_11);
                                        }
                                        v2 = var3_4;
                                        if (var1_1 == null || !v2.P) continue;
                                        v2 = this.h.remove(var2_2--);
                                        if (var1_1 != null) continue;
                                    }
                                    this.H.a("remove");
                                    this.O.removeAll(this.t);
                                }
                                var2_2 = 0;
                                while (var2_2 < this.t.size()) {
                                    block68: {
                                        block69: {
                                            block70: {
                                                var3_4 = this.t.get(var2_2);
                                                var4_7 = var3_4.v;
                                                var5_12 = var3_4.y;
                                                if (var1_1 == null) break block68;
                                                v3 = var3_4.D ? 1 : 0;
                                                if (var1_1 == null) break block64;
                                                if (v3 == 0) break block69;
                                                v4 = this;
                                                v5 = var4_7;
                                                v6 = var5_12;
                                                if (var1_1 == null) break block70;
                                                if (!v4.a(v5, v6, true)) break block69;
                                                v4 = this;
                                                v5 = var4_7;
                                                v6 = var5_12;
                                            }
                                            v4.b(v5, v6).b((x)var3_4);
                                        }
                                        ++var2_2;
                                    }
                                    if (var1_1 != null) continue;
                                }
                                v3 = var2_2 = 0;
                            }
                            while (var2_2 < this.t.size()) {
                                this.b(this.t.get(var2_2));
                                ++var2_2;
                                if (var1_1 != null) {
                                    if (var1_1 != null) continue;
                                }
                                break block65;
                            }
                            this.t.clear();
                            this.k();
                            this.H.a("regular");
                        }
                        for (var2_2 = 0; var2_2 < this.O.size(); ++var2_2) {
                            block73: {
                                block74: {
                                    block77: {
                                        block75: {
                                            block76: {
                                                block71: {
                                                    block72: {
                                                        var3_4 = this.O.get(var2_2);
                                                        var4_8 = var3_4.as();
                                                        if (var1_1 == null) break block66;
                                                        v7 = var4_8;
                                                        if (var1_1 != null) {
                                                            if (v7 != null) {
                                                                v8 = var4_8;
                                                                if (var1_1 != null) {
                                                                    if (!v8.P) {
                                                                        v8 = var4_8;
                                                                        if (var1_1 != null) {
                                                                            if (v8.l((x)var3_4) && var1_1 != null) continue;
                                                                        }
                                                                    } else {
                                                                        v8 = var3_4;
                                                                    }
                                                                }
                                                                v8.aO();
                                                            }
                                                            this.H.b("tick");
                                                            v7 = var3_4;
                                                        }
                                                        v9 = v7.P;
                                                        if (var1_1 == null) break block71;
                                                        if (v9) break block72;
                                                        v9 = var3_4 instanceof net.minecraft.i.k;
                                                        if (var1_1 != null) {
                                                            if (!v9) {
                                                                try {
                                                                    this.i((x)var3_4);
                                                                }
                                                                catch (Throwable var5_13) {
                                                                    var6_18 = net.minecraft.c.f.a(var5_13, "Ticking entity");
                                                                    var7_21 = var6_18.a("Entity being ticked");
                                                                    var3_4.a(var7_21);
                                                                    throw new Z(var6_18);
                                                                }
                                                            } else {
                                                                ** GOTO lbl99
                                                            }
                                                        }
                                                        break block71;
                                                    }
                                                    this.H.c();
                                                    v10 = this.H;
                                                    if (var1_1 == null) break block73;
                                                    v10.b("remove");
                                                    v9 = var3_4.P;
                                                }
                                                if (!v9) break block74;
                                                var5_12 = var3_4.v;
                                                var6_17 = var3_4.y;
                                                v11 = var3_4;
                                                if (var1_1 == null) break block75;
                                                if (!v11.D) break block76;
                                                v12 = this;
                                                if (var1_1 == null) break block77;
                                                if (v12.a(var5_12, var6_17, true)) {
                                                    this.b(var5_12, var6_17).b((x)var3_4);
                                                }
                                            }
                                            v11 = this.O.remove(var2_2--);
                                        }
                                        v12 = this;
                                    }
                                    v12.b((x)var3_4);
                                }
                                v10 = this.H;
                            }
                            v10.c();
                            if (var1_1 != null) continue;
                        }
                        this.H.a("blockEntities");
                    }
                    v13 = this.a;
                    if (var1_1 != null) {
                        if (!v13.isEmpty()) {
                            this.N.removeAll(this.a);
                            this.e.removeAll(this.a);
                            this.a.clear();
                        }
                        this.o = true;
                        v13 = this.N;
                    }
                    var2_3 = v13.iterator();
                    while (var2_3.hasNext()) {
                        block81: {
                            block82: {
                                block80: {
                                    block78: {
                                        block79: {
                                            var3_4 = var2_3.next();
                                            v14 = var3_4.a();
                                            if (var1_1 == null) break block67;
                                            if (var1_1 == null) break block78;
                                            if (v14) break block79;
                                            v15 = var3_4.h();
                                            if (var1_1 == null) break block78;
                                            if (!v15) break block79;
                                            var4_9 = var3_4.j();
                                            v15 = this.n(var4_9);
                                            if (var1_1 != null) {
                                                if (v15) {
                                                    v15 = this.c.a(var4_9);
                                                    if (var1_1 != null) {
                                                        if (v15) {
                                                            try {
                                                                this.H.a((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$updateEntities$0(net.minecraft.N.y ), ()Ljava/lang/String;)((y)var3_4));
                                                                ((ao)var3_4).c();
                                                                this.H.c();
                                                            }
                                                            catch (Throwable var5_14) {
                                                                var6_19 = net.minecraft.c.f.a(var5_14, "Ticking block entity");
                                                                var7_22 = var6_19.a("Block entity being ticked");
                                                                var3_4.a(var7_22);
                                                                throw new Z(var6_19);
                                                            }
                                                        } else {
                                                            ** GOTO lbl169
                                                        }
                                                    } else {
                                                        ** GOTO lbl168
                                                    }
                                                } else {
                                                    ** GOTO lbl167
                                                }
                                            }
                                            break block78;
lbl167:
                                            // 2 sources

                                            break block79;
lbl168:
                                            // 2 sources

                                            break block78;
                                        }
                                        v15 = var3_4.a();
                                    }
                                    if (var1_1 == null) break block80;
                                    if (!v15) break block81;
                                    var2_3.remove();
                                    this.e.remove(var3_4);
                                    v16 = this;
                                    v17 = var3_4.j();
                                    if (var1_1 == null) break block82;
                                    v15 = v16.n(v17);
                                }
                                if (!v15) break block81;
                                v16 = this;
                                v17 = var3_4.j();
                            }
                            v16.b(v17).b(var3_4.j());
                        }
                        if (var1_1 != null) continue;
                    }
                    this.o = false;
                    this.H.a("pendingBlockEntities");
                    v18 = this;
                    if (var1_1 == null) break block83;
                    v14 = v18.x.isEmpty();
                }
                if (v14) break block84;
                var3_5 = 0;
                while (var3_5 < this.x.size()) {
                    block85: {
                        block86: {
                            block88: {
                                block87: {
                                    var4_10 = this.x.get(var3_5);
                                    if (var1_1 == null) return;
                                    if (var1_1 == null) break block85;
                                    if (var4_10.a()) break block86;
                                    v19 = this.e.contains(var4_10);
                                    if (var1_1 == null) break block87;
                                    if (!v19) {
                                        this.b(var4_10);
                                    }
                                    v20 = this;
                                    v21 = var4_10.j();
                                    if (var1_1 == null) break block88;
                                    v19 = v20.n(v21);
                                }
                                if (!v19) break block86;
                                v20 = this;
                                v21 = var4_10.j();
                            }
                            var5_15 = v20.b(v21);
                            var6_20 = var5_15.c(var4_10.j());
                            var5_15.a(var4_10.j(), var4_10);
                            this.a(var4_10.j(), var6_20, var6_20, 3);
                        }
                        ++var3_5;
                    }
                    if (var1_1 != null) continue;
                }
                this.x.clear();
            }
            this.H.c();
            v18 = this;
        }
        v18.H.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public net.minecraft.c.l a(f var1_1) {
        var3_2 = var1_1.a("Affected level", 1);
        var2_3 = net.minecraft.ah.z.I();
        v0 = this.u;
        if (var2_3 == null) ** GOTO lbl9
        if (v0 == null) {
            v1 = "????";
        } else {
            v0 = this.u;
lbl9:
            // 2 sources

            v1 = v0.p();
        }
        var3_2.a("Level name", v1);
        var3_2.a("All players", new b(this));
        var3_2.a("Chunk stats", new O(this));
        try {
            this.u.a(var3_2);
            return var3_2;
        }
        catch (Throwable var4_4) {
            var3_2.a("Level Data Unobtainable", var4_4);
        }
        return var3_2;
    }

    public boolean a(net.minecraft.k.n n2, boolean bl2) {
        i i2 = this.d(n2);
        String string = net.minecraft.ah.z.I();
        net.minecraft.W.K k2 = i2.b();
        if (string != null) {
            if (i2.o() == net.minecraft.ac.c.A) {
                return false;
            }
            this.b(2001, n2, net.minecraft.W.K.l(i2));
        }
        boolean bl3 = bl2;
        if (string != null) {
            if (bl3) {
                k2.a(this, n2, i2, 0);
            }
            bl3 = this.a(n2, net.minecraft.u.g.bf.d(), 3);
        }
        return bl3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.k.n var1_1, i var2_2, int var3_3) {
        block34: {
            block35: {
                block30: {
                    block31: {
                        block32: {
                            block33: {
                                block28: {
                                    block29: {
                                        block26: {
                                            block27: {
                                                block25: {
                                                    block24: {
                                                        var4_4 = net.minecraft.ah.z.I();
                                                        v0 = this.m(var1_1);
                                                        if (var4_4 == null) break block24;
                                                        if (v0) {
                                                            return false;
                                                        }
                                                        v1 = this;
                                                        if (var4_4 == null) break block25;
                                                        v0 = v1.C;
                                                    }
                                                    if (!v0) {
                                                        v1 = this;
                                                        if (var4_4 != null) {
                                                            if (v1.u.w() == net.minecraft.ah.L.e) {
                                                                return false;
                                                            } else {
                                                                ** GOTO lbl-1000
                                                            }
                                                        }
                                                    } else lbl-1000:
                                                    // 3 sources

                                                    {
                                                        v1 = this;
                                                    }
                                                }
                                                var5_5 = v1.b(var1_1);
                                                var6_6 = var2_2.b();
                                                v2 = var7_7 = var5_5.a(var1_1, var2_2);
                                                if (var4_4 != null) {
                                                    if (v2 == null) {
                                                        return false;
                                                    }
                                                    v2 = var2_2;
                                                }
                                                v3 = v2.j();
                                                if (var4_4 == null) break block26;
                                                if (v3 != var7_7.j()) break block27;
                                                v4 = var2_2.h();
                                                v5 = var7_7.h();
                                                if (var4_4 == null) break block28;
                                                if (v4 == v5) break block29;
                                            }
                                            this.H.b("checkLight");
                                            v3 = this.i(var1_1) ? 1 : 0;
                                        }
                                        this.H.c();
                                    }
                                    v4 = var3_3;
                                    v5 = 2;
                                }
                                v6 = v4 & v5;
                                if (var4_4 == null) break block30;
                                if (v6 == 0) break block31;
                                v6 = this.C ? 1 : 0;
                                if (var4_4 == null) break block32;
                                if (v6 == 0) break block33;
                                v6 = var3_3 & 4;
                                if (var4_4 == null) break block30;
                                if (v6 != 0) break block31;
                            }
                            v6 = var5_5.a() ? 1 : 0;
                        }
                        if (var4_4 == null) break block30;
                        if (v6 != 0) {
                            this.a(var1_1, var7_7, var2_2, var3_3);
                        }
                    }
                    v6 = this.C ? 1 : 0;
                }
                if (var4_4 == null) break block34;
                if (v6 != 0) break block35;
                v6 = var3_3 & 1;
                if (var4_4 == null) break block34;
                if (v6 != 0) {
                    this.b(var1_1, var7_7.b(), true);
                    v6 = var2_2.p() ? 1 : 0;
                    if (var4_4 == null) return (boolean)v6;
                    if (v6 == 0) return (boolean)1;
                    this.b(var1_1, var6_6);
                    if (var4_4 != null) return (boolean)1;
                }
            }
            v6 = this.C ? 1 : 0;
        }
        if (var4_4 == null) return (boolean)v6;
        if (v6 != 0) return (boolean)1;
        v6 = var3_3 & 16;
        if (var4_4 == null) return (boolean)v6;
        if (v6 != 0) return (boolean)1;
        this.d(var1_1, var6_6);
        return (boolean)1;
    }

    public boolean J() {
        String string = net.minecraft.ah.z.I();
        double d10 = (double)this.a(1.0f) - 0.2;
        double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (string != null) {
            d11 = d11 > 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    public List<x> a() {
        return this.O;
    }

    public void a(aH aH2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        this.a(aH2.a(), aH2.c(), d10, d11, d12, d13, d14, d15, arrn);
    }

    public net.minecraft.aw.w b() {
        return this.u;
    }

    @Nullable
    public net.minecraft.i.j c(String string) {
        int n2 = 0;
        String string2 = net.minecraft.ah.z.I();
        while (n2 < this.k.size()) {
            net.minecraft.i.j j2 = this.k.get(n2);
            if (string2 != null) {
                if (string.equals(j2.g())) {
                    return j2;
                }
                ++n2;
            }
            if (string2 != null) continue;
        }
        return null;
    }

    public void f(float f10) {
        this.p = f10;
        this.y = f10;
    }

    @Override
    @Nullable
    public y b(net.minecraft.k.n n2) {
        y y2;
        String string;
        block9: {
            z z2;
            block8: {
                string = net.minecraft.ah.z.I();
                if (this.m(n2)) {
                    return null;
                }
                y2 = null;
                z2 = this;
                if (string == null) break block8;
                if (!z2.o) break block9;
                z2 = this;
            }
            y2 = z2.o(n2);
        }
        y y3 = y2;
        if (string != null) {
            if (y3 == null) {
                y2 = this.b(n2).a(n2, net.minecraft.o.j.IMMEDIATE);
            }
            y3 = y2;
        }
        if (string != null) {
            if (y3 == null) {
                y2 = this.o(n2);
            }
            y3 = y2;
        }
        return y3;
    }

    public int i() {
        return 256;
    }

    public int a(Class<?> class_) {
        int n2;
        block5: {
            int n3 = 0;
            String string = net.minecraft.ah.z.I();
            for (x x2 : this.O) {
                block8: {
                    boolean bl2;
                    block6: {
                        block7: {
                            n2 = x2 instanceof C;
                            if (string == null) break block5;
                            if (string == null) break block6;
                            if (n2 == 0) break block7;
                            bl2 = ((C)x2).d();
                            if (string == null) break block6;
                            if (bl2) break block8;
                        }
                        bl2 = class_.isAssignableFrom(x2.getClass());
                    }
                    if (bl2) {
                        ++n3;
                    }
                }
                if (string != null) continue;
            }
            n2 = n3;
        }
        return n2;
    }

    public net.minecraft.aw.b v() {
        return this.q;
    }

    @Nullable
    public net.minecraft.i.j a(net.minecraft.k.n n2, double d10, double d11) {
        return this.a((double)((float)n2.e() + 0.5f), (double)((float)n2.b() + 0.5f), (double)((float)n2.a() + 0.5f), d10, d11, null, null);
    }

    public a M() {
        return this.u.E();
    }

    public void b(net.minecraft.k.n n2, @Nullable y y2) {
        block6: {
            boolean bl2;
            block9: {
                String string;
                block5: {
                    boolean bl3;
                    block8: {
                        y y3;
                        block7: {
                            string = net.minecraft.ah.z.I();
                            if (this.m(n2)) break block6;
                            y3 = y2;
                            if (string == null) break block7;
                            if (y3 == null) break block6;
                            y3 = y2;
                        }
                        bl2 = y3.a();
                        if (string == null) break block8;
                        if (bl2) break block6;
                        bl2 = this.o;
                    }
                    if (string == null) break block6;
                    if (!bl2) break block9;
                    y2.a(n2);
                    Iterator<y> iterator = this.x.iterator();
                    while (iterator.hasNext()) {
                        block11: {
                            y y4;
                            block10: {
                                y y5;
                                y4 = y5 = iterator.next();
                                if (string == null) break block10;
                                bl3 = y4.j().equals(n2);
                                if (string == null) break block5;
                                if (!bl3) break block11;
                                y4 = y5;
                            }
                            y4.i();
                            iterator.remove();
                        }
                        if (string != null) continue;
                    }
                    bl3 = this.x.add(y2);
                }
                if (string != null) break block6;
            }
            this.b(n2).a(n2, y2);
            bl2 = this.b(y2);
        }
    }

    public boolean a(net.minecraft.k.k k2, @Nullable x x2) {
        boolean bl2;
        block3: {
            List<x> list = this.b(null, k2);
            String string = net.minecraft.ah.z.I();
            int n2 = 0;
            while (n2 < list.size()) {
                block4: {
                    block5: {
                        boolean bl3;
                        block10: {
                            block9: {
                                x x3;
                                block8: {
                                    x x4;
                                    block7: {
                                        block6: {
                                            x4 = list.get(n2);
                                            if (string == null) break block4;
                                            bl2 = x4.P;
                                            if (string == null) break block3;
                                            if (bl2) break block5;
                                            x3 = x4;
                                            if (string == null) break block6;
                                            if (!x3.az) break block5;
                                            x3 = x4;
                                        }
                                        if (string == null) break block7;
                                        if (x3 == x2) break block5;
                                        x3 = x2;
                                    }
                                    if (string == null) break block8;
                                    if (x3 == null) break block9;
                                    x3 = x4;
                                }
                                bl3 = x3.i(x2);
                                if (string == null) break block10;
                                if (!bl3) break block5;
                            }
                            bl3 = false;
                        }
                        return bl3;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    public void w() throws w {
        this.q.b();
    }

    public boolean a(net.minecraft.k.n n2, net.minecraft.k.n n3, boolean bl2) {
        return this.a(n2.e(), n2.b(), n2.a(), n3.e(), n3.b(), n3.a(), bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e(int n2, int n3) {
        net.minecraft.k.n n4 = this.G();
        String string = net.minecraft.ah.z.I();
        int n5 = n2 * 16 + 8 - n4.e();
        int n6 = n3 * 16 + 8 - n4.a();
        int n7 = 128;
        int n8 = n5;
        int n9 = -128;
        if (string != null) {
            if (n8 < n9) return 0 != 0;
            n8 = n5;
            n9 = 128;
        }
        if (string != null) {
            if (n8 > n9) return 0 != 0;
            n8 = n6;
            n9 = -128;
        }
        if (string != null) {
            if (n8 < n9) return 0 != 0;
            n8 = n6;
            if (string == null) return n8 != 0;
            n9 = 128;
        }
        if (n8 > n9) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean m(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        int n3 = n2.b();
        if (string == null) return n3 != 0;
        if (n3 < 0) return 1 != 0;
        n3 = n2.b();
        if (string == null) return n3 != 0;
        if (n3 < 256) return 0 != 0;
        return 1 != 0;
    }

    protected void h() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(net.minecraft.k.n var1_1, net.minecraft.W.K var2_2, net.minecraft.k.n var3_3) {
        var4_4 = net.minecraft.ah.z.I();
        v0 = this;
        if (var4_4 != null) {
            if (v0.C != false) return;
            v0 = this;
        }
        var5_5 = v0.d(var1_1);
        v1 = var5_5.b();
        if (var4_4 == null) ** GOTO lbl12
        if (v1 != net.minecraft.u.g.ce) return;
        try {
            v1 = var5_5.b();
lbl12:
            // 2 sources

            ((net.minecraft.W.af)v1).b(var5_5, this, var1_1, var2_2, var3_3);
            return;
        }
        catch (Throwable var6_6) {
            var7_7 = net.minecraft.c.f.a(var6_6, "Exception while updating neighbours");
            var8_8 = var7_7.a("Block being updated");
            var8_8.a("Source block type", new g(this, var2_2));
            net.minecraft.c.l.a(var8_8, var1_1, var5_5);
            throw new Z(var7_7);
        }
    }

    public int s(net.minecraft.k.n n2) {
        return this.d(n2, true);
    }

    public void a(net.minecraft.k.n n2, i i2, i i3, int n3) {
        String string = net.minecraft.ah.z.I();
        for (int i4 = 0; i4 < this.v.size(); ++i4) {
            this.v.get(i4).a(this, n2, i2, i3, n3);
            if (string != null) continue;
        }
    }

    protected z(net.minecraft.aw.b b10, net.minecraft.aw.w w2, G g10, net.minecraft.aq.b b11, boolean bl2) {
        this.P = 63;
        this.O = Lists.newArrayList();
        this.t = Lists.newArrayList();
        this.e = Lists.newArrayList();
        this.N = Lists.newArrayList();
        this.x = Lists.newArrayList();
        this.a = Lists.newArrayList();
        this.k = Lists.newArrayList();
        this.h = Lists.newArrayList();
        this.w = new a_();
        this.m = 0xFFFFFFL;
        this.r = new Random().nextInt();
        this.G = 1013904223;
        this.J = new Random();
        this.l = new n();
        this.v = Lists.newArrayList((Object[])new k[]{this.l});
        this.z = Calendar.getInstance();
        this.A = new net.minecraft.D.b();
        this.f = true;
        this.i = true;
        this.L = new int[32768];
        this.q = b10;
        this.H = b11;
        this.u = w2;
        this.D = g10;
        this.C = bl2;
        this.c = g10.m();
    }

    public void d(net.minecraft.k.n n2, net.minecraft.W.K k2) {
        this.b(n2.b(), k2, n2);
        this.b(n2.m(), k2, n2);
        this.b(n2.k(), k2, n2);
        this.b(n2.a(), k2, n2);
        this.b(n2.i(), k2, n2);
        this.b(n2.j(), k2, n2);
    }

    public void a(@Nullable net.minecraft.i.j j2, net.minecraft.k.n n2, d d10, ay ay2, float f10, float f11) {
        this.a(j2, (double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5, d10, ay2, f10, f11);
    }

    public boolean y(net.minecraft.k.n n2) {
        return this.c(n2, false);
    }

    public void b(net.minecraft.k.n n2, net.minecraft.k.n n3) {
        this.a(n2.e(), n2.b(), n2.a(), n3.e(), n3.b(), n3.a());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public net.minecraft.k.i a(l var1_1, l var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
        block65: {
            block67: {
                block66: {
                    var6_6 = net.minecraft.ah.z.I();
                    v0 = Double.isNaN(var1_1.e);
                    if (var6_6 != null) {
                        if (v0 != 0) return null;
                        v0 = Double.isNaN(var1_1.d);
                    }
                    if (var6_6 != null) {
                        if (v0 != 0) return null;
                        v0 = Double.isNaN(var1_1.b);
                    }
                    if (var6_6 != null) {
                        if (v0 != 0) return null;
                        v0 = Double.isNaN(var2_2.e);
                    }
                    if (var6_6 != null) {
                        if (v0 != 0) return null;
                        v0 = Double.isNaN(var2_2.d);
                    }
                    if (var6_6 != null) {
                        if (v0 != 0) return null;
                        v0 = Double.isNaN(var2_2.b);
                    }
                    if (var6_6 != null) {
                        if (v0 != 0) return null;
                        v0 = net.minecraft.k.h.f(var2_2.e);
                    }
                    var7_7 = v0;
                    var8_8 = net.minecraft.k.h.f(var2_2.d);
                    var9_9 = net.minecraft.k.h.f(var2_2.b);
                    var10_10 = net.minecraft.k.h.f(var1_1.e);
                    var11_11 = net.minecraft.k.h.f(var1_1.d);
                    var12_12 = net.minecraft.k.h.f(var1_1.b);
                    var13_13 = new net.minecraft.k.n(var10_10, var11_11, var12_12);
                    var14_14 = this.d(var13_13);
                    var15_15 = var14_14.b();
                    v1 = var4_4;
                    if (var6_6 == null) break block66;
                    if (v1 && var14_14.d(this, var13_13) == net.minecraft.W.K.a) break block67;
                    v1 = var15_15.a(var14_14, var3_3);
                }
                if (v1) {
                    v2 = var16_16 = var14_14.a(this, var13_13, var1_1, var2_2);
                    if (var6_6 == null) return v2;
                    if (v2 != null) {
                        v2 = var16_16;
                        return v2;
                    }
                }
            }
            var16_16 = null;
            var17_17 = 200;
            while (var17_17-- >= 0) {
                block93: {
                    block94: {
                        block90: {
                            block91: {
                                block92: {
                                    block87: {
                                        block88: {
                                            block89: {
                                                block85: {
                                                    block86: {
                                                        block82: {
                                                            block83: {
                                                                block84: {
                                                                    block80: {
                                                                        block81: {
                                                                            block77: {
                                                                                block78: {
                                                                                    block79: {
                                                                                        block75: {
                                                                                            block76: {
                                                                                                block72: {
                                                                                                    block73: {
                                                                                                        block74: {
                                                                                                            block70: {
                                                                                                                block71: {
                                                                                                                    block68: {
                                                                                                                        block69: {
                                                                                                                            v3 = Double.isNaN(var1_1.e);
                                                                                                                            if (var6_6 == null) break block65;
                                                                                                                            if (var6_6 != null) {
                                                                                                                                if (v3 != false) return null;
                                                                                                                                v4 = Double.isNaN(var1_1.d);
                                                                                                                            }
                                                                                                                            if (var6_6 != null) {
                                                                                                                                if (v4 != false) return null;
                                                                                                                                v4 = Double.isNaN(var1_1.b) ? 1 : 0;
                                                                                                                            }
                                                                                                                            if (var6_6 != null) {
                                                                                                                                if (v4 != 0) {
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                v4 = var10_10;
                                                                                                                            }
                                                                                                                            if (var6_6 == null) break block68;
                                                                                                                            if (v4 != var7_7) break block69;
                                                                                                                            v4 = var11_11;
                                                                                                                            if (var6_6 == null) break block68;
                                                                                                                            if (v4 == var8_8) {
                                                                                                                                v4 = var12_12;
                                                                                                                                if (var6_6 != null) {
                                                                                                                                    if (v4 == var9_9) {
                                                                                                                                        if (var5_5 == false) return null;
                                                                                                                                        v5 = var16_16;
                                                                                                                                        return v5;
                                                                                                                                    } else {
                                                                                                                                        ** GOTO lbl70
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    ** GOTO lbl69
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break block69;
lbl69:
                                                                                                                            // 2 sources

                                                                                                                            break block68;
                                                                                                                        }
                                                                                                                        v4 = 1;
                                                                                                                    }
                                                                                                                    var18_18 = v4;
                                                                                                                    var19_19 = 1;
                                                                                                                    var20_20 = 1;
                                                                                                                    var21_21 = 999.0;
                                                                                                                    var23_22 = 999.0;
                                                                                                                    var25_23 = 999.0;
                                                                                                                    v6 = var7_7;
                                                                                                                    v7 = var10_10;
                                                                                                                    if (var6_6 == null) break block70;
                                                                                                                    if (v6 <= v7) break block71;
                                                                                                                    var21_21 = (double)var10_10 + 1.0;
                                                                                                                    if (var6_6 != null) break block72;
                                                                                                                }
                                                                                                                v6 = var7_7;
                                                                                                                if (var6_6 == null) break block73;
                                                                                                                v7 = var10_10;
                                                                                                            }
                                                                                                            if (v6 >= v7) break block74;
                                                                                                            var21_21 = (double)var10_10 + 0.0;
                                                                                                            if (var6_6 != null) break block72;
                                                                                                        }
                                                                                                        v6 = 0;
                                                                                                    }
                                                                                                    var18_18 = v6;
                                                                                                }
                                                                                                v8 = var8_8;
                                                                                                v9 = var11_11;
                                                                                                if (var6_6 == null) break block75;
                                                                                                if (v8 <= v9) break block76;
                                                                                                var23_22 = (double)var11_11 + 1.0;
                                                                                                if (var6_6 != null) break block77;
                                                                                            }
                                                                                            v8 = var8_8;
                                                                                            if (var6_6 == null) break block78;
                                                                                            v9 = var11_11;
                                                                                        }
                                                                                        if (v8 >= v9) break block79;
                                                                                        var23_22 = (double)var11_11 + 0.0;
                                                                                        if (var6_6 != null) break block77;
                                                                                    }
                                                                                    v8 = 0;
                                                                                }
                                                                                var19_19 = v8;
                                                                            }
                                                                            v10 = var9_9;
                                                                            v11 = var12_12;
                                                                            if (var6_6 == null) break block80;
                                                                            if (v10 <= v11) break block81;
                                                                            var25_23 = (double)var12_12 + 1.0;
                                                                            if (var6_6 != null) break block82;
                                                                        }
                                                                        v10 = var9_9;
                                                                        if (var6_6 == null) break block83;
                                                                        v11 = var12_12;
                                                                    }
                                                                    if (v10 >= v11) break block84;
                                                                    var25_23 = (double)var12_12 + 0.0;
                                                                    if (var6_6 != null) break block82;
                                                                }
                                                                v10 = 0;
                                                            }
                                                            var20_20 = v10;
                                                        }
                                                        var27_24 = 999.0;
                                                        var29_25 = 999.0;
                                                        var31_26 = 999.0;
                                                        var33_27 = var2_2.e - var1_1.e;
                                                        var35_28 = var2_2.d - var1_1.d;
                                                        var37_29 = var2_2.b - var1_1.b;
                                                        v12 = var18_18;
                                                        if (var6_6 != null) {
                                                            if (v12 != 0) {
                                                                var27_24 = (var21_21 - var1_1.e) / var33_27;
                                                            }
                                                            v12 = var19_19;
                                                        }
                                                        if (var6_6 != null) {
                                                            if (v12 != 0) {
                                                                var29_25 = (var23_22 - var1_1.d) / var35_28;
                                                            }
                                                            v12 = var20_20;
                                                        }
                                                        if (var6_6 != null) {
                                                            if (v12 != 0) {
                                                                var31_26 = (var25_23 - var1_1.b) / var37_29;
                                                            }
                                                            v12 = (cfr_temp_0 = var27_24 - -0.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                        }
                                                        if (var6_6 != null) {
                                                            if (v12 == 0) {
                                                                var27_24 = -1.0E-4;
                                                            }
                                                            v12 = (cfr_temp_1 = var29_25 - -0.0) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                        }
                                                        if (var6_6 != null) {
                                                            if (v12 == 0) {
                                                                var29_25 = -1.0E-4;
                                                            }
                                                            v12 = (cfr_temp_2 = var31_26 - -0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                        }
                                                        if (var6_6 != null) {
                                                            if (v12 == 0) {
                                                                var31_26 = -1.0E-4;
                                                            }
                                                            v12 = var27_24 == var29_25 ? 0 : (var27_24 < var29_25 ? -1 : 1);
                                                        }
                                                        if (var6_6 == null) break block85;
                                                        if (v12 >= 0) break block86;
                                                        v12 = var27_24 == var31_26 ? 0 : (var27_24 < var31_26 ? -1 : 1);
                                                        if (var6_6 == null) break block85;
                                                        if (v12 >= 0) break block86;
                                                        var39_30 = var7_7 > var10_10 ? aA.WEST : aA.EAST;
                                                        var1_1 = new l(var21_21, var1_1.d + var35_28 * var27_24, var1_1.b + var37_29 * var27_24);
                                                        if (var6_6 != null) break block87;
                                                    }
                                                    v12 = var29_25 == var31_26 ? 0 : (var29_25 < var31_26 ? -1 : 1);
                                                }
                                                if (var6_6 == null) break block88;
                                                if (v12 >= 0) break block89;
                                                var39_30 = var8_8 > var11_11 ? aA.DOWN : aA.UP;
                                                var1_1 = new l(var1_1.e + var33_27 * var29_25, var23_22, var1_1.b + var37_29 * var29_25);
                                                if (var6_6 != null) break block87;
                                            }
                                            v12 = var9_9;
                                        }
                                        var39_30 = v12 > var12_12 ? aA.NORTH : aA.SOUTH;
                                        var1_1 = new l(var1_1.e + var33_27 * var31_26, var1_1.d + var35_28 * var31_26, var25_23);
                                    }
                                    var10_10 = net.minecraft.k.h.f(var1_1.e) - (var39_30 == aA.EAST ? 1 : 0);
                                    var11_11 = net.minecraft.k.h.f(var1_1.d) - (var39_30 == aA.UP ? 1 : 0);
                                    var12_12 = net.minecraft.k.h.f(var1_1.b) - (var39_30 == aA.SOUTH ? 1 : 0);
                                    var13_13 = new net.minecraft.k.n(var10_10, var11_11, var12_12);
                                    var40_31 = this.d(var13_13);
                                    var41_32 = var40_31.b();
                                    v13 = var4_4;
                                    if (var6_6 == null) break block90;
                                    if (!v13) break block91;
                                    v14 = var40_31;
                                    if (var6_6 == null) break block92;
                                    if (v14.o() == net.minecraft.ac.c.Q) break block91;
                                    v14 = var40_31;
                                }
                                if (v14.d(this, var13_13) == net.minecraft.W.K.a) break block93;
                            }
                            v13 = var41_32.a(var40_31, var3_3);
                        }
                        if (!v13) break block94;
                        v15 = var42_33 = var40_31.a(this, var13_13, var1_1, var2_2);
                        if (var6_6 == null) return v15;
                        if (v15 != null) {
                            v15 = var42_33;
                            return v15;
                        }
                        if (var6_6 != null) break block93;
                    }
                    var16_16 = new net.minecraft.k.i(net.minecraft.k.j.MISS, var1_1, var39_30, var13_13);
                }
                if (var6_6 != null) continue;
            }
            v3 = var5_5;
        }
        if (v3 == false) return null;
        v16 = var16_16;
        return v16;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b(net.minecraft.k.n n2, aA aA2) {
        int n3;
        i i2 = this.d(n2);
        String string = net.minecraft.ah.z.I();
        i i3 = i2;
        if (string != null) {
            if (i3.r()) {
                n3 = this.a(n2);
                return n3;
            }
            i3 = i2;
        }
        n3 = i3.a(this, n2, aA2);
        return n3;
    }

    public boolean a(net.minecraft.ao.b b10) {
        return this.b(b10, true);
    }

    public String q() {
        return "All: " + this.O.size();
    }

    public boolean p(net.minecraft.k.n n2) {
        return this.c(n2, true);
    }

    public boolean i(net.minecraft.k.n n2) {
        boolean bl2 = false;
        String string = net.minecraft.ah.z.I();
        boolean bl3 = this.D.h();
        if (string != null) {
            if (bl3) {
                bl2 |= this.c(net.minecraft.ah.c.SKY, n2);
            }
            bl3 = bl2 |= this.c(net.minecraft.ah.c.BLOCK, n2);
        }
        return bl3;
    }

    public net.minecraft.o.k f() {
        return this.Q;
    }

    @Override
    public i d(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        z z2 = this;
        net.minecraft.k.n n3 = n2;
        if (string != null) {
            if (z2.m(n3)) {
                return net.minecraft.u.g.bf.d();
            }
            z2 = this;
            n3 = n2;
        }
        net.minecraft.o.a a10 = z2.b(n3);
        return a10.c(n2);
    }

    public Calendar F() {
        String string = net.minecraft.ah.z.I();
        z z2 = this;
        if (string != null) {
            if (z2.r() % 600L == 0L) {
                this.z.setTimeInMillis(net.minecraft.R.b.R());
            }
            z2 = this;
        }
        return z2.z;
    }

    public void a(K k2) {
        this.u.e(true);
    }

    public int e() {
        String string = net.minecraft.ah.z.I();
        int n2 = this.D.b();
        if (string != null) {
            n2 = n2 != 0 ? 128 : 256;
        }
        return n2;
    }

    public boolean a(net.minecraft.k.n n2, net.minecraft.W.K k2) {
        return true;
    }

    public float e(float f10) {
        float f11 = this.h(f10);
        return f11 * ((float)Math.PI * 2);
    }

    public void N() {
    }

    public void a(c c10, net.minecraft.k.n n2, int n3) {
        block3: {
            net.minecraft.k.n n4;
            z z2;
            block4: {
                boolean bl2;
                block2: {
                    String string = net.minecraft.ah.z.I();
                    bl2 = this.u(n2);
                    if (string == null) break block2;
                    if (!bl2) break block3;
                    z2 = this;
                    n4 = n2;
                    if (string == null) break block4;
                    bl2 = z2.n(n4);
                }
                if (!bl2) break block3;
                z2 = this;
                n4 = n2;
            }
            net.minecraft.o.a a10 = z2.b(n4);
            a10.a(c10, n2, n3);
            this.e(n2);
        }
    }

    public boolean n(net.minecraft.k.n n2) {
        return this.e(n2, true);
    }

    public void L() {
        this.S();
    }

    public net.minecraft.k.n c(net.minecraft.k.n n2) {
        net.minecraft.k.n n3;
        block3: {
            net.minecraft.o.a a10 = this.b(n2);
            net.minecraft.k.n n4 = new net.minecraft.k.n(n2.e(), a10.b() + 16, n2.a());
            String string = net.minecraft.ah.z.I();
            while (n4.b() >= 0) {
                n3 = n4.k();
                if (string != null) {
                    net.minecraft.k.n n5 = n3;
                    net.minecraft.ac.c c10 = a10.c(n5).o();
                    if (string != null) {
                        if (c10.n() && c10 != net.minecraft.ac.c.J && string != null) break;
                        n4 = n5;
                    }
                    if (string != null) continue;
                }
                break block3;
            }
            n3 = n4;
        }
        return n3;
    }

    public void a(x x2, byte by2) {
    }

    @Nullable
    public net.minecraft.i.j b(x x2, double d10) {
        return this.a(x2.a, x2.aF, x2.ax, d10, true);
    }

    @Nullable
    public <T extends x> T a(Class<? extends T> class_, net.minecraft.k.k k2, T t2) {
        x x2;
        block5: {
            List<T> list = this.a(class_, k2);
            x x3 = null;
            double d10 = Double.MAX_VALUE;
            String string = net.minecraft.ah.z.I();
            int n2 = 0;
            while (n2 < list.size()) {
                block6: {
                    block7: {
                        x x4 = (x)list.get(n2);
                        if (string == null) break block6;
                        x2 = x4;
                        if (string == null) break block5;
                        if (x2 == t2 || !net.minecraft.ar.e.e.apply((Object)x4)) break block7;
                        double d11 = t2.s(x4);
                        if (string == null) break block6;
                        if (d11 <= d10) {
                            x3 = x4;
                            d10 = d11;
                        }
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            x2 = x3;
        }
        return (T)x2;
    }

    public void b(net.minecraft.k.n n2, net.minecraft.W.K k2, boolean bl2) {
        block3: {
            z z2;
            block2: {
                String string = net.minecraft.ah.z.I();
                z2 = this;
                if (string == null) break block2;
                if (z2.u.w() == net.minecraft.ah.L.e) break block3;
                z2 = this;
            }
            z2.a(n2, k2, bl2);
        }
    }

    public void c(net.minecraft.k.n n2, net.minecraft.W.K k2, int n3, int n4) {
    }

    public void a(net.minecraft.k.n n2, net.minecraft.W.K k2, aA aA2) {
        block10: {
            String string = net.minecraft.ah.z.I();
            aA aA3 = aA2;
            aA aA4 = aA.WEST;
            if (string != null) {
                if (aA3 != aA4) {
                    this.a(n2.b(), k2, n2);
                }
                aA3 = aA2;
                aA4 = aA.EAST;
            }
            if (string != null) {
                if (aA3 != aA4) {
                    this.a(n2.m(), k2, n2);
                }
                aA3 = aA2;
                aA4 = aA.DOWN;
            }
            if (string != null) {
                if (aA3 != aA4) {
                    this.a(n2.k(), k2, n2);
                }
                aA3 = aA2;
                aA4 = aA.UP;
            }
            if (string != null) {
                if (aA3 != aA4) {
                    this.a(n2.a(), k2, n2);
                }
                aA3 = aA2;
                aA4 = aA.NORTH;
            }
            if (string != null) {
                if (aA3 != aA4) {
                    this.a(n2.i(), k2, n2);
                }
                aA3 = aA2;
                aA4 = aA.SOUTH;
            }
            if (aA3 == aA4) break block10;
            this.a(n2.j(), k2, n2);
        }
    }

    public int k(float f10) {
        float f11 = this.h(f10);
        float f12 = 1.0f - (net.minecraft.k.h.c(f11 * ((float)Math.PI * 2)) * 2.0f + 0.5f);
        f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
        f12 = 1.0f - f12;
        f12 = (float)((double)f12 * (1.0 - (double)(this.a(f10) * 5.0f) / 16.0));
        f12 = (float)((double)f12 * (1.0 - (double)(this.g(f10) * 5.0f) / 16.0));
        f12 = 1.0f - f12;
        return (int)(f12 * 11.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean u(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        int n3 = this.m(n2);
        if (string != null) {
            if (n3 != 0) return 0 != 0;
            n3 = n2.e();
        }
        int n4 = -30000000;
        if (string != null) {
            if (n3 < n4) return 0 != 0;
            n3 = n2.a();
            n4 = -30000000;
        }
        if (string != null) {
            if (n3 < n4) return 0 != 0;
            n3 = n2.e();
            n4 = 30000000;
        }
        if (string != null) {
            if (n3 >= n4) return 0 != 0;
            n3 = n2.a();
            if (string == null) return n3 != 0;
            n4 = 30000000;
        }
        if (n3 >= n4) return 0 != 0;
        return 1 != 0;
    }

    public void b(net.minecraft.k.n n2, net.minecraft.W.K k2, int n3, int n4) {
    }

    private boolean j(net.minecraft.k.n n2) {
        return this.d(n2).o() == net.minecraft.ac.c.L;
    }

    public List<x> b(@Nullable x x2, net.minecraft.k.k k2) {
        return this.a(x2, k2, net.minecraft.ar.e.e);
    }

    public void i(float f10) {
        this.I = f10;
        this.d = f10;
    }

    protected void k() {
    }

    public void e(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(n2);
            if (string != null) continue;
        }
    }

    public boolean q(net.minecraft.k.n n2) {
        int n3;
        block9: {
            net.minecraft.k.n n4;
            String string;
            block11: {
                boolean bl2;
                block10: {
                    string = net.minecraft.ah.z.I();
                    net.minecraft.k.n n5 = n2;
                    if (string != null) {
                        if (n5.b() >= this.y()) {
                            return this.w(n2);
                        }
                        n5 = new net.minecraft.k.n(n2.e(), this.y(), n2.a());
                    }
                    n4 = n5;
                    bl2 = this.w(n4);
                    if (string == null) break block10;
                    if (bl2) break block11;
                    bl2 = false;
                }
                return bl2;
            }
            net.minecraft.k.n n6 = n4.k();
            while (n6.b() > n2.b()) {
                block12: {
                    block13: {
                        boolean bl3;
                        block14: {
                            i i2 = this.d(n6);
                            if (string == null) break block12;
                            n3 = i2.j();
                            if (string == null) break block9;
                            if (n3 <= 0) break block13;
                            bl3 = i2.o().b();
                            if (string == null) break block14;
                            if (bl3) break block13;
                            bl3 = false;
                        }
                        return bl3;
                    }
                    n6 = n6.k();
                }
                if (string != null) continue;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public boolean a(net.minecraft.k.k k2) {
        int n2;
        block7: {
            int n3 = net.minecraft.k.h.f(k2.e);
            int n4 = net.minecraft.k.h.i(k2.f);
            int n5 = net.minecraft.k.h.f(k2.b);
            int n6 = net.minecraft.k.h.i(k2.a);
            int n7 = net.minecraft.k.h.f(k2.d);
            int n8 = net.minecraft.k.h.i(k2.g);
            p p2 = net.minecraft.k.p.a();
            String string = net.minecraft.ah.z.I();
            int n9 = n3;
            block0: while (true) {
                int n10 = n9;
                block1: while (n10 < n4) {
                    n2 = n5;
                    if (string == null) break block7;
                    int n11 = n2;
                    block2: while (true) {
                        int n12 = n11;
                        block3: while (n12 < n6) {
                            n10 = n7;
                            if (string == null) continue block1;
                            int n13 = n10;
                            while (n13 < n8) {
                                i i2 = this.d(p2.a(n9, n11, n13));
                                if (string != null) {
                                    n12 = i2.o().b() ? 1 : 0;
                                    if (string == null) continue block3;
                                    if (n12 != 0) {
                                        p2.b();
                                        return true;
                                    }
                                    ++n13;
                                }
                                if (string != null) continue;
                            }
                            ++n11;
                            if (string != null) continue block2;
                        }
                        break;
                    }
                    ++n9;
                    if (string != null) continue block0;
                }
                break;
            }
            p2.b();
            n2 = 0;
        }
        return n2 != 0;
    }

    @Override
    public L a() {
        return this.u.w();
    }

    public void c(int n2) {
        this.n = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private int a(net.minecraft.k.n var1_1, c var2_2) {
        block28: {
            block30: {
                block29: {
                    var3_3 = net.minecraft.ah.z.I();
                    if (var2_2 == net.minecraft.ah.c.SKY) {
                        v0 = this;
                        v1 = var1_1;
                        if (var3_3 != null) {
                            if (v0.w(v1)) {
                                return 15;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = this;
                        v1 = var1_1;
                    }
                    var4_4 = v0.d(v1);
                    var5_5 = var2_2 == net.minecraft.ah.c.SKY ? 0 : var4_4.h();
                    v2 = var6_6 = var4_4.j();
                    v3 = 15;
                    if (var3_3 == null) break block28;
                    if (v2 < v3) break block29;
                    v2 = var4_4.h();
                    if (var3_3 == null) break block30;
                    if (v2 > 0) {
                        var6_6 = 1;
                    }
                }
                v2 = var6_6;
            }
            v3 = 1;
        }
        if (var3_3 != null) {
            if (v2 < v3) {
                var6_6 = 1;
            }
            v2 = var6_6;
            v3 = 15;
        }
        if (var3_3 != null) {
            if (v2 >= v3) {
                return 0;
            }
            v2 = var5_5;
            if (var3_3 == null) return v2;
            v3 = 14;
        }
        if (v2 >= v3) {
            v2 = var5_5;
            return v2;
        }
        var7_7 = net.minecraft.k.p.a();
        try {
            block27: {
                for (aA var11_12 : aA.values()) {
                    block32: {
                        block31: {
                            var7_7.b(var1_1).a(var11_12);
                            v4 = var12_13 = this.a(var2_2, (net.minecraft.k.n)var7_7) - var6_6;
                            if (var3_3 == null) break block27;
                            v5 = var5_5;
                            if (var3_3 == null) break block31;
                            if (v4 > v5) {
                                var5_5 = var12_13;
                            }
                            v6 = var5_5;
                            if (var3_3 == null) break block32;
                            v5 = 14;
                        }
                        if (v6 < v5) continue;
                        v6 = var5_5;
                    }
                    var14_15 = var13_14 = v6;
                    return var14_15;
                }
                v4 = var5_5;
            }
            var8_9 = v4;
            return var8_9;
        }
        finally {
            var7_7.b();
        }
    }

    /*
     * Exception decompiling
     */
    public boolean c(net.minecraft.k.n var1_1, boolean var2_2) {
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

    public <T extends x> List<T> a(Class<? extends T> class_, net.minecraft.k.k k2, @Nullable Predicate<? super T> predicate) {
        int n2 = net.minecraft.k.h.f((k2.e - 2.0) / 16.0);
        int n3 = net.minecraft.k.h.i((k2.f + 2.0) / 16.0);
        int n4 = net.minecraft.k.h.f((k2.d - 2.0) / 16.0);
        String string = net.minecraft.ah.z.I();
        int n5 = net.minecraft.k.h.i((k2.g + 2.0) / 16.0);
        ArrayList arrayList = Lists.newArrayList();
        int n6 = n2;
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 < n3) {
                for (int i2 = n4; i2 < n5; ++i2) {
                    z z2 = this;
                    int n8 = n6;
                    int n9 = i2;
                    if (string != null) {
                        n7 = z2.a(n8, n9, true) ? 1 : 0;
                        if (string == null) continue block1;
                        if (n7 == 0) continue;
                        z2 = this;
                        n8 = n6;
                        n9 = i2;
                    }
                    z2.b(n8, n9).a(class_, k2, arrayList, predicate);
                    if (string != null) continue;
                }
                ++n6;
                if (string != null) continue block0;
            }
            break;
        }
        return arrayList;
    }

    public static void b(String string) {
        K = string;
    }

    public boolean a(net.minecraft.k.n n2, i i2) {
        return this.a(n2, i2, 3);
    }

    public boolean a(boolean bl2) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Deprecated
    public int d(int n2, int n3) {
        String string = net.minecraft.ah.z.I();
        int n4 = n2;
        int n5 = -30000000;
        if (string == null) return n4 + n5;
        if (n4 >= n5) {
            n4 = n3;
            n5 = -30000000;
            if (string == null) return n4 + n5;
            if (n4 >= n5) {
                n4 = n2;
                n5 = 30000000;
                if (string == null) return n4 + n5;
                if (n4 < n5) {
                    n4 = n3;
                    n5 = 30000000;
                    if (string == null) return n4 + n5;
                    if (n4 < n5) {
                        z z2 = this;
                        int n6 = n2 >> 4;
                        int n7 = n3 >> 4;
                        int n8 = 1;
                        if (string != null) {
                            if (!z2.a(n6, n7, n8 != 0)) {
                                return 0;
                            }
                            z2 = this;
                            n6 = n2 >> 4;
                            n7 = n3;
                            n8 = 4;
                        }
                        net.minecraft.o.a a10 = z2.b(n6, n7 >> n8);
                        return a10.v();
                    }
                }
            }
        }
        n4 = this.y();
        n5 = 1;
        return n4 + n5;
    }

    protected void o() {
        block3: {
            block4: {
                z z2;
                boolean bl2;
                block2: {
                    String string = net.minecraft.ah.z.I();
                    bl2 = this.u.b();
                    if (string == null) break block2;
                    if (!bl2) break block3;
                    this.y = 1.0f;
                    z2 = this;
                    if (string == null) break block4;
                    bl2 = z2.u.k();
                }
                if (!bl2) break block3;
                z2 = this;
            }
            z2.d = 1.0f;
        }
    }

    public boolean a(@Nullable net.minecraft.i.j j2, net.minecraft.k.n n2, aA aA2) {
        block3: {
            net.minecraft.k.n n3;
            z z2;
            block2: {
                n2 = n2.a(aA2);
                String string = net.minecraft.ah.z.I();
                z2 = this;
                n3 = n2;
                if (string == null) break block2;
                if (z2.d(n3).b() != net.minecraft.u.g.C) break block3;
                this.a(j2, 1009, n2, 0);
                z2 = this;
                n3 = n2;
            }
            z2.v(n3);
            return true;
        }
        return false;
    }

    public void d(int n2) {
        this.j = n2;
    }

    public void b(long l2) {
        this.u.a(l2);
    }

    public void a(y y2) {
        this.a.add(y2);
    }

    public void b(int n2) {
        this.P = n2;
    }

    public int b(c c10, net.minecraft.k.n n2) {
        net.minecraft.k.n n3;
        z z2;
        block17: {
            block18: {
                int n4;
                block20: {
                    int n5;
                    int n6;
                    int n7;
                    block19: {
                        int n8;
                        String string;
                        block16: {
                            string = net.minecraft.ah.z.I();
                            n8 = this.D.h();
                            if (string != null) {
                                if (n8 == 0 && c10 == net.minecraft.ah.c.SKY) {
                                    return 0;
                                }
                                n8 = n2.b();
                            }
                            if (string != null) {
                                if (n8 < 0) {
                                    n2 = new net.minecraft.k.n(n2.e(), 0, n2.a());
                                }
                                n8 = this.u(n2) ? 1 : 0;
                            }
                            if (string != null) {
                                if (n8 == 0) {
                                    return c10.defaultLightValue;
                                }
                                n8 = this.n(n2) ? 1 : 0;
                            }
                            if (string == null) break block16;
                            if (n8 == 0) {
                                return c10.defaultLightValue;
                            }
                            z2 = this;
                            n3 = n2;
                            if (string == null) break block17;
                            n8 = z2.d(n3).c() ? 1 : 0;
                        }
                        if (n8 == 0) break block18;
                        n7 = this.a(c10, n2.a());
                        int n9 = this.a(c10, n2.m());
                        int n10 = this.a(c10, n2.b());
                        int n11 = this.a(c10, n2.j());
                        n6 = this.a(c10, n2.i());
                        n4 = n9;
                        n5 = n7;
                        if (string != null) {
                            if (n4 > n5) {
                                n7 = n9;
                            }
                            n4 = n10;
                            n5 = n7;
                        }
                        if (string != null) {
                            if (n4 > n5) {
                                n7 = n10;
                            }
                            n4 = n11;
                            n5 = n7;
                        }
                        if (string == null) break block19;
                        if (n4 > n5) {
                            n7 = n11;
                        }
                        n4 = n6;
                        if (string == null) break block20;
                        n5 = n7;
                    }
                    if (n4 > n5) {
                        n7 = n6;
                    }
                    n4 = n7;
                }
                return n4;
            }
            z2 = this;
            n3 = n2;
        }
        net.minecraft.o.a a10 = z2.b(n3);
        return a10.a(c10, n2);
    }

    public i A(net.minecraft.k.n n2) {
        net.minecraft.k.n n3 = new net.minecraft.k.n(n2.e(), this.y(), n2.a());
        String string = net.minecraft.ah.z.I();
        while (!this.a(n3.a())) {
            n3 = n3.a();
            if (string != null) continue;
        }
        return this.d(n3);
    }

    public void p() {
        block0: {
            int n2 = this.k(1.0f);
            if (n2 == this.j) break block0;
            this.j = n2;
        }
    }

    public boolean f(net.minecraft.k.n n2) {
        net.minecraft.A.h h2 = this.c(n2);
        return h2.o();
    }

    public U a(@Nullable x x2, double d10, double d11, double d12, float f10, boolean bl2) {
        return this.a(x2, d10, d11, d12, f10, false, bl2);
    }

    protected void a(int n2, int n3, net.minecraft.o.a a10) {
        a10.s();
    }

    public <T extends x> List<T> b(Class<? extends T> class_, Predicate<? super T> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        String string = net.minecraft.ah.z.I();
        for (x x2 : this.k) {
            block6: {
                boolean bl2;
                block5: {
                    bl2 = class_.isAssignableFrom(x2.getClass());
                    if (string == null) break block5;
                    if (!bl2) break block6;
                    bl2 = predicate.apply((Object)x2);
                }
                if (string != null && bl2) {
                    bl2 = arrayList.add(x2);
                }
            }
            if (string != null) continue;
        }
        return arrayList;
    }

    public float d(float f10) {
        float f11 = this.h(f10);
        float f12 = 1.0f - (net.minecraft.k.h.c(f11 * ((float)Math.PI * 2)) * 2.0f + 0.25f);
        f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
        return f12 * f12 * 0.5f;
    }

    public boolean v(net.minecraft.k.n n2) {
        return this.a(n2, net.minecraft.u.g.bf.d(), 3);
    }

    public boolean u() {
        String string = net.minecraft.ah.z.I();
        double d10 = (double)this.g(1.0f) - 0.9;
        double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (string != null) {
            d11 = d11 > 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean f(x var1_1) {
        var3_2 = net.minecraft.k.h.f(var1_1.a / 16.0);
        var4_3 = net.minecraft.k.h.f(var1_1.ax / 16.0);
        var2_4 = net.minecraft.ah.z.I();
        var5_5 = var1_1.j;
        v0 = var1_1 instanceof net.minecraft.i.j;
        if (var2_4 != null) {
            if (v0) {
                var5_5 = true;
            }
            v0 = var5_5;
        }
        if (var2_4 != null) {
            if (!v0) {
                v0 = this.a(var3_2, var4_3, false);
                if (var2_4 != null) {
                    if (!v0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1 instanceof net.minecraft.i.j;
            }
        }
        if (var2_4 == null) return v0;
        if (v0) {
            var6_6 = (net.minecraft.i.j)var1_1;
            this.k.add(var6_6);
            this.l();
        }
        this.b(var3_2, var4_3).a(var1_1);
        this.O.add(var1_1);
        this.g(var1_1);
        return true;
    }

    public String m() {
        return this.Q.a();
    }

    public boolean c(net.minecraft.k.k k2) {
        int n2;
        block6: {
            block8: {
                int n3 = net.minecraft.k.h.f(k2.e);
                int n4 = net.minecraft.k.h.i(k2.f);
                int n5 = net.minecraft.k.h.f(k2.b);
                int n6 = net.minecraft.k.h.i(k2.a);
                String string = net.minecraft.ah.z.I();
                int n7 = net.minecraft.k.h.f(k2.d);
                int n8 = net.minecraft.k.h.i(k2.g);
                n2 = this.a(n3, n5, n7, n4, n6, n8, true);
                if (string == null) break block6;
                if (n2 == 0) break block8;
                p p2 = net.minecraft.k.p.a();
                int n9 = n3;
                block0: while (true) {
                    int n10 = n9;
                    block1: while (n10 < n4) {
                        n2 = n5;
                        if (string == null) break block6;
                        int n11 = n2;
                        while (n11 < n6) {
                            block7: {
                                n10 = n7;
                                if (string == null) continue block1;
                                for (int i2 = v609967; i2 < n8; ++i2) {
                                    block9: {
                                        block10: {
                                            net.minecraft.W.K k3;
                                            block11: {
                                                net.minecraft.W.K k4 = this.d(p2.a(n9, n11, i2)).b();
                                                if (string == null) break block7;
                                                if (string == null) break block9;
                                                if (k4 == net.minecraft.u.g.C) break block10;
                                                k3 = k4;
                                                if (string == null) break block11;
                                                if (k3 == net.minecraft.u.g.ag) break block10;
                                                k3 = k4;
                                            }
                                            if (k3 != net.minecraft.u.g.bq) continue;
                                        }
                                        p2.b();
                                    }
                                    return true;
                                }
                                ++n11;
                            }
                            if (string != null) continue;
                        }
                        ++n9;
                        if (string != null) continue block0;
                    }
                    break;
                }
                p2.b();
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    /*
     * Exception decompiling
     */
    public void a(aH var1_1, boolean var2_2, double var3_3, double var5_4, double var7_5, double var9_6, double var11_7, double var13_8, int ... var15_9) {
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

    public void l() {
    }

    public net.minecraft.aj.h D() {
        return this.M;
    }

    public boolean c(net.minecraft.k.n n2, aA aA2) {
        String string = net.minecraft.ah.z.I();
        boolean bl2 = this.b(n2, aA2);
        if (string != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Nullable
    public List<F> a(net.minecraft.o.a a10, boolean bl2) {
        return null;
    }

    public boolean a(double d10, double d11, double d12, double d13) {
        boolean bl2;
        block3: {
            int n2 = 0;
            String string = net.minecraft.ah.z.I();
            while (n2 < this.k.size()) {
                block4: {
                    block5: {
                        double d14;
                        block6: {
                            block7: {
                                net.minecraft.i.j j2 = this.k.get(n2);
                                if (string == null) break block4;
                                bl2 = net.minecraft.ar.e.e.apply((Object)j2);
                                if (string == null) break block3;
                                if (!bl2) break block5;
                                double d15 = j2.a(d10, d11, d12);
                                double d16 = d13 - 0.0;
                                d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                if (string == null) break block6;
                                if (d14 < 0) break block7;
                                double d17 = d15 - d13 * d13;
                                d14 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                if (string == null) break block6;
                                if (d14 >= 0) break block5;
                            }
                            d14 = 1.0;
                        }
                        return (boolean)d14;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int a(c c10, net.minecraft.k.n n2) {
        net.minecraft.k.n n3;
        z z2;
        block8: {
            int n4;
            block7: {
                String string = net.minecraft.ah.z.I();
                n4 = n2.b();
                if (string != null) {
                    if (n4 < 0) {
                        n2 = new net.minecraft.k.n(n2.e(), 0, n2.a());
                    }
                    n4 = this.u(n2) ? 1 : 0;
                }
                if (string == null) break block7;
                if (n4 == 0) {
                    return c10.defaultLightValue;
                }
                z2 = this;
                n3 = n2;
                if (string == null) break block8;
                n4 = z2.n(n3) ? 1 : 0;
            }
            if (n4 == 0) {
                return c10.defaultLightValue;
            }
            z2 = this;
            n3 = n2;
        }
        net.minecraft.o.a a10 = z2.b(n3);
        return a10.a(c10, n2);
    }

    public boolean d(x x2) {
        this.h.add(x2);
        return true;
    }

    public e g() {
        return this.b().o();
    }

    public net.minecraft.o.a b(net.minecraft.k.n n2) {
        return this.b(n2.e() >> 4, n2.a() >> 4);
    }

    public boolean x(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        int n3 = this.b(n2.k(), aA.DOWN);
        if (string != null) {
            if (n3 > 0) {
                return true;
            }
            n3 = this.b(n2.a(), aA.UP);
        }
        if (string != null) {
            if (n3 > 0) {
                return true;
            }
            n3 = this.b(n2.i(), aA.NORTH);
        }
        if (string != null) {
            if (n3 > 0) {
                return true;
            }
            n3 = this.b(n2.j(), aA.SOUTH);
        }
        if (string != null) {
            if (n3 > 0) {
                return true;
            }
            n3 = this.b(n2.b(), aA.WEST);
        }
        if (string != null) {
            if (n3 > 0) {
                return true;
            }
            n3 = this.b(n2.m(), aA.EAST);
        }
        if (string != null) {
            n3 = n3 > 0 ? 1 : 0;
        }
        return n3 != 0;
    }

    public int d(net.minecraft.k.n n2, boolean n3) {
        int n4;
        block13: {
            block14: {
                block21: {
                    net.minecraft.k.n n5;
                    block20: {
                        int n6;
                        block19: {
                            String string;
                            block15: {
                                block16: {
                                    int n7;
                                    block18: {
                                        int n8;
                                        int n9;
                                        int n10;
                                        block17: {
                                            string = net.minecraft.ah.z.I();
                                            n4 = n2.e();
                                            if (string == null) break block13;
                                            if (n4 < -30000000) break block14;
                                            n4 = n2.a();
                                            if (string == null) break block13;
                                            if (n4 < -30000000) break block14;
                                            n4 = n2.e();
                                            if (string == null) break block13;
                                            if (n4 >= 30000000) break block14;
                                            n4 = n2.a();
                                            if (string == null) break block13;
                                            if (n4 >= 30000000) break block14;
                                            n6 = n3;
                                            if (string == null) break block15;
                                            if (n6 == 0) break block16;
                                            n6 = this.d(n2).c() ? 1 : 0;
                                            if (string == null) break block15;
                                            if (n6 == 0) break block16;
                                            n10 = this.d(n2.a(), false);
                                            int n11 = this.d(n2.m(), false);
                                            int n12 = this.d(n2.b(), false);
                                            int n13 = this.d(n2.j(), false);
                                            n9 = this.d(n2.i(), false);
                                            n7 = n11;
                                            n8 = n10;
                                            if (string != null) {
                                                if (n7 > n8) {
                                                    n10 = n11;
                                                }
                                                n7 = n12;
                                                n8 = n10;
                                            }
                                            if (string != null) {
                                                if (n7 > n8) {
                                                    n10 = n12;
                                                }
                                                n7 = n13;
                                                n8 = n10;
                                            }
                                            if (string == null) break block17;
                                            if (n7 > n8) {
                                                n10 = n13;
                                            }
                                            n7 = n9;
                                            if (string == null) break block18;
                                            n8 = n10;
                                        }
                                        if (n7 > n8) {
                                            n10 = n9;
                                        }
                                        n7 = n10;
                                    }
                                    return n7;
                                }
                                n6 = n2.b();
                            }
                            if (string == null) break block19;
                            if (n6 < 0) {
                                return 0;
                            }
                            n5 = n2;
                            if (string == null) break block20;
                            n6 = n5.b();
                        }
                        if (n6 < 256) break block21;
                        n5 = new net.minecraft.k.n(n2.e(), 255, n2.a());
                    }
                    n2 = n5;
                }
                net.minecraft.o.a a10 = this.b(n2);
                return a10.a(n2, this.j);
            }
            n4 = 15;
        }
        return n4;
    }

    @Nullable
    public net.minecraft.i.j a(x x2, double d10) {
        return this.a(x2.a, x2.aF, x2.ax, d10, false);
    }

    public float j(float f10) {
        float f11 = this.h(f10);
        float f12 = 1.0f - (net.minecraft.k.h.c(f11 * ((float)Math.PI * 2)) * 2.0f + 0.2f);
        f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
        f12 = 1.0f - f12;
        f12 = (float)((double)f12 * (1.0 - (double)(this.a(f10) * 5.0f) / 16.0));
        f12 = (float)((double)f12 * (1.0 - (double)(this.g(f10) * 5.0f) / 16.0));
        return f12 * 0.8f + 0.2f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3) {
        String string = net.minecraft.ah.z.I();
        boolean bl2 = this.a(n2, n3, false);
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = this.Q.b(n2, n3);
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public net.minecraft.A.h c(net.minecraft.k.n n2) {
        String string = net.minecraft.ah.z.I();
        z z2 = this;
        if (string != null) {
            if (z2.n(n2)) {
                net.minecraft.o.a a10 = this.b(n2);
                try {
                    return a10.a(n2, this.D.p());
                }
                catch (Throwable throwable) {
                    f f10 = net.minecraft.c.f.a(throwable, "Getting biome");
                    net.minecraft.c.l l2 = f10.a("Coordinates of biome request");
                    l2.a("Location", new Q(this, n2));
                    throw new Z(f10);
                }
            }
            z2 = this;
        }
        return z2.D.p().a(n2, net.minecraft.u.d.s);
    }

    public void a(double d10, double d11, double d12, d d13, ay ay2, float f10, float f11, boolean bl2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean e(x x2) {
        double d10;
        block11: {
            String string;
            block13: {
                double d11;
                block12: {
                    double d12;
                    block10: {
                        double d13;
                        double d14;
                        double d15;
                        block9: {
                            block7: {
                                block8: {
                                    d15 = this.c.g();
                                    d12 = this.c.f();
                                    string = net.minecraft.ah.z.I();
                                    d14 = this.c.r();
                                    d11 = this.c.d();
                                    if (string == null) break block7;
                                    if (!x2.G()) break block8;
                                    d15 += 1.0;
                                    d12 += 1.0;
                                    d14 -= 1.0;
                                    d11 -= 1.0;
                                    if (string != null) break block9;
                                }
                                d15 -= 1.0;
                                d12 -= 1.0;
                                d14 += 1.0;
                            }
                            d11 += 1.0;
                        }
                        d10 = (d13 = x2.a - d15) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        if (string == null) break block10;
                        if (d10 <= 0) break block11;
                        double d16 = x2.a - d14;
                        d10 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                    }
                    if (string == null) break block12;
                    if (d10 >= 0) break block11;
                    double d17 = x2.ax - d12;
                    d10 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                }
                if (string == null) break block13;
                if (d10 <= 0) break block11;
                double d18 = x2.ax - d11;
                d10 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
            }
            if (string == null) return (boolean)d10;
            if (d10 < 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    protected void b(x x2) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).b(x2);
            if (string != null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(net.minecraft.k.n n2, boolean bl2) {
        net.minecraft.A.h h2 = this.c(n2);
        float f10 = h2.a(n2);
        String string = net.minecraft.ah.z.I();
        float f11 = f10 - 0.15f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (string != null) {
            if (f12 >= 0) {
                return false;
            }
            f12 = (float)bl2;
        }
        if (string != null) {
            if (f12 == false) {
                return true;
            }
            f12 = n2.b();
        }
        if (string == null) return (boolean)f12;
        if (f12 >= 0) {
            f12 = n2.b();
            if (string == null) return (boolean)f12;
            if (f12 < 256) {
                f12 = this.a(net.minecraft.ah.c.BLOCK, n2);
                if (string == null) return (boolean)f12;
                if (f12 < 10) {
                    i i2 = this.d(n2);
                    if (i2.o() != net.minecraft.ac.c.A) return false;
                    boolean bl3 = net.minecraft.u.g.o.a(this, n2);
                    if (string == null) return bl3;
                    if (!bl3) return false;
                    return true;
                }
            }
        }
        f12 = 0.0f;
        return (boolean)f12;
    }

    @Nullable
    public net.minecraft.aw.r a(Class<? extends net.minecraft.aw.r> class_, String string) {
        return this.E.a(class_, string);
    }

    public int z() {
        return this.n;
    }

    public int Q() {
        return this.j;
    }

    @Nullable
    public net.minecraft.k.i a(l l2, l l3) {
        return this.a(l2, l3, false, false, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g(net.minecraft.k.n n2) {
        double d10;
        net.minecraft.k.k k2 = this.d(n2).d(this, n2);
        String string = net.minecraft.ah.z.I();
        net.minecraft.k.k k3 = k2;
        if (string != null) {
            if (k3 == net.minecraft.W.K.a) return 0 != 0;
            k3 = k2;
        }
        int n3 = (d10 = k3.d() - 1.0) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (string == null) return n3 != 0;
        if (n3 < 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, int n3, int n4, int n5) {
        z z2;
        block7: {
            int n6;
            int n7;
            String string;
            block6: {
                string = net.minecraft.ah.z.I();
                n7 = n4;
                if (string == null) break block6;
                if (n7 > n5) {
                    n6 = n5;
                    n5 = n4;
                    n4 = n6;
                }
                z2 = this;
                if (string == null) break block7;
                n7 = z2.D.h() ? 1 : 0;
            }
            if (n7 != 0) {
                for (n6 = n4; n6 <= n5; ++n6) {
                    this.c(net.minecraft.ah.c.SKY, new net.minecraft.k.n(n2, n6, n3));
                    if (string == null) return;
                    if (string != null) continue;
                }
            }
            z2 = this;
        }
        z2.a(n2, n4, n3, n2, n5, n3);
    }

    @Nullable
    public List<F> a(net.minecraft.ao.b b10, boolean bl2) {
        return null;
    }

    public <T extends x> List<T> a(Class<? extends T> class_, net.minecraft.k.k k2) {
        return this.a(class_, k2, net.minecraft.ar.e.e);
    }

    public boolean w(net.minecraft.k.n n2) {
        return this.b(n2).a(n2);
    }

    public void c(Collection<y> collection) {
        block5: {
            String string;
            block4: {
                block3: {
                    string = net.minecraft.ah.z.I();
                    boolean bl2 = this.o;
                    if (string == null) break block3;
                    if (!bl2) break block4;
                    bl2 = this.x.addAll(collection);
                }
                if (string != null) break block5;
            }
            for (y y2 : collection) {
                this.b(y2);
                if (string != null) continue;
            }
        }
    }

    public void a(x x2) {
        block6: {
            boolean bl2;
            block7: {
                String string = net.minecraft.ah.z.I();
                x2.j(false);
                x2.a();
                String string2 = string;
                int n2 = x2 instanceof net.minecraft.i.j;
                if (string2 != null) {
                    if (n2 != 0) {
                        this.k.remove(x2);
                        this.l();
                    }
                    n2 = x2.v;
                }
                int n3 = n2;
                int n4 = x2.y;
                bl2 = x2.D;
                if (string2 == null) break block6;
                if (!bl2) break block7;
                bl2 = this.a(n3, n4, true);
                if (string2 == null) break block6;
                if (bl2) {
                    this.b(n3, n4).b(x2);
                }
            }
            bl2 = this.O.remove(x2);
        }
        this.b(x2);
    }

    public void a(boolean bl2, boolean bl3) {
        this.f = bl2;
        this.i = bl3;
    }

    public boolean b(y y2) {
        boolean bl2;
        String string;
        boolean bl3;
        block6: {
            block7: {
                bl3 = this.e.add(y2);
                string = net.minecraft.ah.z.I();
                bl2 = bl3;
                if (string == null) break block6;
                if (!bl2) break block7;
                bl2 = y2 instanceof ao;
                if (string == null) break block6;
                if (bl2) {
                    this.N.add(y2);
                }
            }
            bl2 = this.C;
        }
        if (string != null) {
            if (bl2) {
                net.minecraft.k.n n2 = y2.j();
                i i2 = this.d(n2);
                this.a(n2, i2, i2, 2);
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public net.minecraft.V.a O() {
        return this.c;
    }

    public void a(net.minecraft.k.n n2, y y2) {
        block3: {
            net.minecraft.k.n n3;
            z z2;
            block2: {
                String string = net.minecraft.ah.z.I();
                z2 = this;
                n3 = n2;
                if (string == null) break block2;
                if (!z2.n(n3)) break block3;
                z2 = this;
                n3 = n2;
            }
            z2.b(n3).w();
        }
    }

    protected abstract net.minecraft.o.k A();

    public boolean e(net.minecraft.k.k k2) {
        return this.a(k2, (x)null);
    }

    public boolean a(net.minecraft.k.n n2, int n3, boolean bl2) {
        return this.a(n2.e() - n3, n2.b() - n3, n2.a() - n3, n2.e() + n3, n2.b() + n3, n2.a() + n3, bl2);
    }

    public boolean a(net.minecraft.k.k k2, net.minecraft.ac.c c10) {
        int n2;
        block5: {
            int n3 = net.minecraft.k.h.f(k2.e);
            int n4 = net.minecraft.k.h.i(k2.f);
            String string = net.minecraft.ah.z.I();
            int n5 = net.minecraft.k.h.f(k2.b);
            int n6 = net.minecraft.k.h.i(k2.a);
            int n7 = net.minecraft.k.h.f(k2.d);
            int n8 = net.minecraft.k.h.i(k2.g);
            p p2 = net.minecraft.k.p.a();
            int n9 = n3;
            block0: while (true) {
                int n10 = n9;
                block1: while (n10 < n4) {
                    n2 = n5;
                    if (string == null) break block5;
                    int n11 = n2;
                    while (n11 < n6) {
                        block6: {
                            n10 = n7;
                            if (string == null) continue block1;
                            for (int i2 = v611405; i2 < n8; ++i2) {
                                if (string != null) {
                                    if (this.d(p2.a(n9, n11, i2)).o() != c10) continue;
                                    p2.b();
                                    return true;
                                }
                                break block6;
                            }
                            ++n11;
                        }
                        if (string != null) continue;
                    }
                    ++n9;
                    if (string != null) continue block0;
                }
                break;
            }
            p2.b();
            n2 = 0;
        }
        return n2 != 0;
    }

    public float k(net.minecraft.k.n n2) {
        return this.D.j()[this.s(n2)];
    }

    public void a(@Nullable net.minecraft.i.j j2, double d10, double d11, double d12, d d13, ay ay2, float f10, float f11) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(j2, d13, ay2, d10, d11, d12, f10, f11);
            if (string != null) continue;
        }
    }

    public float E() {
        return net.minecraft.ah.G.j[this.D.a(this.u.m())];
    }

    public net.minecraft.y.c n() {
        return this.g;
    }

    public Random a(int n2, int n3, int n4) {
        long l2 = (long)n2 * 341873128712L + (long)n3 * 132897987541L + this.b().L() + (long)n4;
        this.J.setSeed(l2);
        return this.J;
    }

    public net.minecraft.k.n C(net.minecraft.k.n n2) {
        return new net.minecraft.k.n(n2.e(), this.c(n2.e(), n2.a()), n2.a());
    }

    @Override
    public int a(net.minecraft.k.n n2, int n3) {
        int n4;
        int n5 = this.b(net.minecraft.ah.c.SKY, n2);
        String string = net.minecraft.ah.z.I();
        int n6 = n4 = this.b(net.minecraft.ah.c.BLOCK, n2);
        int n7 = n3;
        if (string != null) {
            if (n6 < n7) {
                n4 = n3;
            }
            n6 = n5 << 20;
            n7 = n4 << 4;
        }
        return n6 | n7;
    }

    @Nullable
    public net.minecraft.aw.k j() {
        return this.E;
    }

    public boolean a(net.minecraft.i.j j2, net.minecraft.k.n n2) {
        return true;
    }

    public net.minecraft.o.a b(int n2, int n3) {
        return this.Q.a(n2, n3);
    }

    public long C() {
        return this.u.L();
    }

    protected void g(x x2) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(x2);
            if (string != null) continue;
        }
    }

    public float h(float f10) {
        return this.D.a(this.u.m(), f10);
    }

    public l c(float f10) {
        float f11;
        float f12;
        float f13;
        block6: {
            float f14;
            float f15;
            float f16;
            float f17;
            block5: {
                float f18;
                float f19 = this.h(f10);
                float f20 = net.minecraft.k.h.c(f19 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
                f20 = net.minecraft.k.h.c(f20, 0.0f, 1.0f);
                f13 = 1.0f;
                f12 = 1.0f;
                String string = net.minecraft.ah.z.I();
                f11 = 1.0f;
                float f21 = f18 = this.a(f10);
                float f22 = 0.0f;
                if (string != null) {
                    if (f21 > f22) {
                        f17 = (f13 * 0.3f + f12 * 0.59f + f11 * 0.11f) * 0.6f;
                        f16 = 1.0f - f18 * 0.95f;
                        f13 = f13 * f16 + f17 * (1.0f - f16);
                        f12 = f12 * f16 + f17 * (1.0f - f16);
                        f11 = f11 * f16 + f17 * (1.0f - f16);
                    }
                    f13 *= f20 * 0.9f + 0.1f;
                    f12 *= f20 * 0.9f + 0.1f;
                    f21 = f11;
                    f22 = f20 * 0.85f + 0.15f;
                }
                f11 = f21 * f22;
                f15 = f17 = this.g(f10);
                f14 = 0.0f;
                if (string == null) break block5;
                if (!(f15 > f14)) break block6;
                f15 = f13 * 0.3f + f12 * 0.59f + f11 * 0.11f;
                f14 = 0.2f;
            }
            f16 = f15 * f14;
            float f23 = 1.0f - f17 * 0.95f;
            f13 = f13 * f23 + f16 * (1.0f - f23);
            f12 = f12 * f23 + f16 * (1.0f - f23);
            f11 = f11 * f23 + f16 * (1.0f - f23);
        }
        return new l(f13, f12, f11);
    }

    public net.minecraft.k.n d(net.minecraft.k.n n2) {
        return this.b(n2).d(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        String string = net.minecraft.ah.z.I();
        int n8 = n6;
        if (string == null) return n8 != 0;
        if (n8 < 0) return 0 != 0;
        n8 = n3;
        if (string == null) return n8 != 0;
        if (n8 >= 256) return 0 != 0;
        n7 >>= 4;
        int n9 = n2 >>= 4;
        do {
            int n10 = n9;
            block1: while (true) {
                if (n10 > (n5 >>= 4)) return 1 != 0;
                int n11 = n4 >>= 4;
                if (string == null) return n11 != 0;
                for (int i2 = v611845; i2 <= n7; ++i2) {
                    n10 = this.a(n9, i2, bl2) ? 1 : 0;
                    if (string == null) continue block1;
                    if (string == null) boolean bl3;
                    return bl3;
                    if (n10 != 0) continue;
                    return false;
                }
                break;
            }
            ++n9;
        } while (string != null);
        return 1 != 0;
    }

    public long s() {
        return this.u.m();
    }

    public void a(int n2, net.minecraft.k.n n3, int n4) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).b(n2, n3, n4);
            if (string != null) continue;
        }
    }

    public h h(net.minecraft.k.n n2) {
        float f10;
        long l2;
        block3: {
            net.minecraft.k.n n3;
            z z2;
            block2: {
                l2 = 0L;
                String string = net.minecraft.ah.z.I();
                f10 = 0.0f;
                z2 = this;
                n3 = n2;
                if (string == null) break block2;
                if (!z2.n(n3)) break block3;
                f10 = this.E();
                z2 = this;
                n3 = n2;
            }
            l2 = z2.b(n3).m();
        }
        return new h(this.g(), this.s(), l2, f10);
    }

    public void c(x x2) {
        block8: {
            block7: {
                String string = net.minecraft.ah.z.I();
                boolean bl2 = x2.aU();
                if (string != null) {
                    if (bl2) {
                        x2.at();
                    }
                    bl2 = x2.N();
                }
                if (string != null) {
                    if (bl2) {
                        x2.aO();
                    }
                    x2.a();
                    bl2 = x2 instanceof net.minecraft.i.j;
                }
                if (string == null) break block7;
                if (!bl2) break block8;
                bl2 = this.k.remove(x2);
            }
            this.l();
            this.b(x2);
        }
    }

    public int a(net.minecraft.k.n n2) {
        int n3;
        block13: {
            int n4;
            int n5;
            block12: {
                n5 = 0;
                String string = net.minecraft.ah.z.I();
                n3 = n5 = Math.max(n5, this.a(n2.k(), aA.DOWN));
                n4 = 15;
                if (string != null) {
                    if (n3 >= n4) {
                        return n5;
                    }
                    n3 = n5 = Math.max(n5, this.a(n2.a(), aA.UP));
                    n4 = 15;
                }
                if (string != null) {
                    if (n3 >= n4) {
                        return n5;
                    }
                    n3 = n5 = Math.max(n5, this.a(n2.i(), aA.NORTH));
                    n4 = 15;
                }
                if (string != null) {
                    if (n3 >= n4) {
                        return n5;
                    }
                    n3 = n5 = Math.max(n5, this.a(n2.j(), aA.SOUTH));
                    n4 = 15;
                }
                if (string != null) {
                    if (n3 >= n4) {
                        return n5;
                    }
                    n3 = n5 = Math.max(n5, this.a(n2.b(), aA.WEST));
                    n4 = 15;
                }
                if (string == null) break block12;
                if (n3 >= n4) {
                    return n5;
                }
                n3 = n5 = Math.max(n5, this.a(n2.m(), aA.EAST));
                if (string == null) break block13;
                n4 = 15;
            }
            n3 = n3 >= n4 ? n5 : n5;
        }
        return n3;
    }

    public float g(float f10) {
        return (this.I + (this.d - this.I) * f10) * this.a(f10);
    }

    @Nullable
    public net.minecraft.i.j a(x x2, double d10, double d11) {
        return this.a(x2.a, x2.aF, x2.ax, d10, d11, null, null);
    }

    private static String lambda$updateEntities$0(y y2) {
        return String.valueOf(net.minecraft.N.y.a(y2.getClass()));
    }

    public boolean e(net.minecraft.k.n n2, boolean bl2) {
        return this.a(n2.e() >> 4, n2.a() >> 4, bl2);
    }

    public long r() {
        return this.u.x();
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Nullable
    public net.minecraft.i.j a(UUID uUID) {
        int n2 = 0;
        String string = net.minecraft.ah.z.I();
        while (n2 < this.k.size()) {
            net.minecraft.i.j j2 = this.k.get(n2);
            if (string != null) {
                if (uUID.equals(j2.u())) {
                    return j2;
                }
                ++n2;
            }
            if (string != null) continue;
        }
        return null;
    }

    public void a(net.minecraft.k.n n2, net.minecraft.W.K k2, int n3) {
    }

    @Override
    public boolean a(net.minecraft.k.n n2) {
        return this.d(n2).o() == net.minecraft.ac.c.A;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean c(c var1_1, net.minecraft.k.n var2_2) {
        block30: {
            block28: {
                block29: {
                    var4_3 = new f4(var1_1, var2_2);
                    var3_4 = net.minecraft.ah.z.I();
                    af.a(var4_3);
                    v0 = var4_3.a();
                    if (var3_4 != null) {
                        if (v0 != 0) {
                            return false;
                        }
                        v0 = this.a(var2_2, 17, false);
                    }
                    if (var3_4 != null) {
                        if (v0 == 0) {
                            return false;
                        }
                        v0 = 0;
                    }
                    var5_5 = v0;
                    var6_6 = 0;
                    this.H.b("getBrightness");
                    var7_7 = this.a(var1_1, var2_2);
                    var8_8 = this.a(var2_2, var1_1);
                    var9_9 = var2_2.e();
                    var10_10 = var2_2.b();
                    var11_11 = var2_2.a();
                    v1 = var8_8;
                    v2 = var7_7;
                    if (var3_4 == null) break block28;
                    if (v1 <= v2) break block29;
                    this.L[var6_6++] = 133152;
                    if (var3_4 != null) break block30;
                }
                v1 = var8_8;
                v2 = var7_7;
            }
            if (v1 >= v2) break block30;
            this.L[var6_6++] = 133152 | var7_7 << 18;
            block0: while (true) {
                v3 = var5_5;
                v4 = var6_6;
                block1: while (v3 < v4) {
                    block31: {
                        var12_12 = this.L[var5_5++];
                        var13_13 = (var12_12 & 63) - 32 + var9_9;
                        var14_14 = (var12_12 >> 6 & 63) - 32 + var10_10;
                        var15_15 = (var12_12 >> 12 & 63) - 32 + var11_11;
                        var16_16 = var12_12 >> 18 & 15;
                        var17_18 = new net.minecraft.k.n(var13_13, var14_14, var15_15);
                        v5 = var18_20 = this.a(var1_1, var17_18);
                        if (var3_4 == null) break block31;
                        v6 = var16_16;
                        if (var3_4 == null) ** GOTO lbl86
                        if (v5 != v6) continue block0;
                        this.a(var1_1, var17_18, 0);
                        v5 = var16_16;
                    }
                    if (var3_4 != null) {
                        if (v5 <= 0) continue block0;
                        v5 = net.minecraft.k.h.g(var13_13 - var9_9);
                    }
                    if ((var19_21 = v5) + (var20_22 = net.minecraft.k.h.g(var14_14 - var10_10)) + (var21_23 = net.minecraft.k.h.g(var15_15 - var11_11)) >= 17) continue block0;
                    var22_24 = net.minecraft.k.p.a();
                    var23_26 = aA.values();
                    var24_27 = var23_26.length;
                    var25_28 = 0;
                    while (var25_28 < var24_27) {
                        var26_29 = var23_26[var25_28];
                        var27_30 = var13_13 + var26_29.r();
                        var28_31 = var14_14 + var26_29.p();
                        var29_32 = var15_15 + var26_29.i();
                        var22_24.a(var27_30, var28_31, var29_32);
                        var30_33 = Math.max(1, this.d(var22_24).j());
                        var18_20 = this.a(var1_1, (net.minecraft.k.n)var22_24);
                        if (var3_4 != null) {
                            v3 = var18_20;
                            v4 = var16_16 - var30_33;
                            if (var3_4 == null) continue block1;
                            if (v3 == v4 && var6_6 < this.L.length) {
                                this.L[var6_6++] = var27_30 - var9_9 + 32 | var28_31 - var10_10 + 32 << 6 | var29_32 - var11_11 + 32 << 12 | var16_16 - var30_33 << 18;
                            }
                            ++var25_28;
                        }
                        if (var3_4 != null) continue;
                    }
                    var22_24.b();
                    if (var3_4 != null) continue block0;
                }
                break;
            }
            var5_5 = 0;
        }
        this.H.c();
        this.H.b("checkedPosition < toCheckCount");
        do {
            block33: {
                block32: {
                    v7 = var5_5;
                    v6 = var6_6;
lbl86:
                    // 2 sources

                    if (v7 >= v6) break;
                    var12_12 = this.L[var5_5++];
                    var13_13 = (var12_12 & 63) - 32 + var9_9;
                    var14_14 = (var12_12 >> 6 & 63) - 32 + var10_10;
                    var15_15 = (var12_12 >> 12 & 63) - 32 + var11_11;
                    var16_17 = new net.minecraft.k.n(var13_13, var14_14, var15_15);
                    var17_19 = this.a(var1_1, var16_17);
                    v8 = var18_20 = this.a(var16_17, var1_1);
                    if (var3_4 == null) return (boolean)v8;
                    v9 = var17_19;
                    if (var3_4 != null) {
                        if (v8 == v9) continue;
                        this.a(var1_1, var16_17, var18_20);
                        v10 = var18_20;
                        v9 = var17_19;
                    }
                    if (var3_4 != null) {
                        if (v10 <= v9) continue;
                        v10 = var13_13;
                        v9 = var9_9;
                    }
                    var19_21 = Math.abs((int)(v10 - v9));
                    var20_22 = Math.abs(var14_14 - var10_10);
                    var21_23 = Math.abs(var15_15 - var11_11);
                    v11 = var6_6;
                    if (var3_4 != null) {
                        v11 = v11 < this.L.length - 6 ? 1 : 0;
                    }
                    var22_25 = v11;
                    v12 = var19_21 + var20_22 + var21_23;
                    if (var3_4 != null) {
                        if (v12 >= 17) continue;
                        v12 = var22_25;
                    }
                    if (var3_4 != null) {
                        if (v12 == 0) continue;
                        v12 = this.a(var1_1, var16_17.b());
                    }
                    v13 = var18_20;
                    if (var3_4 != null) {
                        if (v12 < v13) {
                            this.L[var6_6++] = var13_13 - 1 - var9_9 + 32 + (var14_14 - var10_10 + 32 << 6) + (var15_15 - var11_11 + 32 << 12);
                        }
                        v12 = this.a(var1_1, var16_17.m());
                        v13 = var18_20;
                    }
                    if (var3_4 != null) {
                        if (v12 < v13) {
                            this.L[var6_6++] = var13_13 + 1 - var9_9 + 32 + (var14_14 - var10_10 + 32 << 6) + (var15_15 - var11_11 + 32 << 12);
                        }
                        v12 = this.a(var1_1, var16_17.k());
                        v13 = var18_20;
                    }
                    if (var3_4 != null) {
                        if (v12 < v13) {
                            this.L[var6_6++] = var13_13 - var9_9 + 32 + (var14_14 - 1 - var10_10 + 32 << 6) + (var15_15 - var11_11 + 32 << 12);
                        }
                        v12 = this.a(var1_1, var16_17.a());
                        v13 = var18_20;
                    }
                    if (var3_4 != null) {
                        if (v12 < v13) {
                            this.L[var6_6++] = var13_13 - var9_9 + 32 + (var14_14 + 1 - var10_10 + 32 << 6) + (var15_15 - var11_11 + 32 << 12);
                        }
                        v12 = this.a(var1_1, var16_17.i());
                        v13 = var18_20;
                    }
                    if (var3_4 == null) break block32;
                    if (v12 < v13) {
                        this.L[var6_6++] = var13_13 - var9_9 + 32 + (var14_14 - var10_10 + 32 << 6) + (var15_15 - 1 - var11_11 + 32 << 12);
                    }
                    v14 = this;
                    if (var3_4 == null) break block33;
                    v12 = v14.a(var1_1, var16_17.j());
                    v13 = var18_20;
                }
                if (v12 >= v13) continue;
                v14 = this;
            }
            v14.L[var6_6++] = var13_13 - var9_9 + 32 + (var14_14 - var10_10 + 32 << 6) + (var15_15 + 1 - var11_11 + 32 << 12);
        } while (var3_4 != null);
        this.H.c();
        return (boolean)1;
    }

    protected abstract boolean a(int var1, int var2, boolean var3);

    public void h(x x2) {
        int n2;
        String string;
        block4: {
            int n3 = net.minecraft.k.h.f(x2.a / 16.0);
            string = net.minecraft.ah.z.I();
            int n4 = net.minecraft.k.h.f(x2.ax / 16.0);
            int n5 = 2;
            int n6 = -2;
            while (n6 <= 2) {
                block5: {
                    n2 = -2;
                    if (string == null) break block4;
                    for (int i2 = v617484; i2 <= 2; ++i2) {
                        this.b(n3 + n6, n4 + i2);
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break block5;
                    }
                    ++n6;
                }
                if (string != null) continue;
            }
            n2 = this.O.contains(x2) ? 1 : 0;
        }
        if (string != null && n2 == 0) {
            n2 = this.O.add(x2) ? 1 : 0;
        }
    }

    public List<x> a(@Nullable x x2, net.minecraft.k.k k2, @Nullable Predicate<? super x> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = net.minecraft.k.h.f((k2.e - 2.0) / 16.0);
        int n3 = net.minecraft.k.h.f((k2.f + 2.0) / 16.0);
        int n4 = net.minecraft.k.h.f((k2.d - 2.0) / 16.0);
        int n5 = net.minecraft.k.h.f((k2.g + 2.0) / 16.0);
        String string = net.minecraft.ah.z.I();
        int n6 = n2;
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 <= n3) {
                for (int i2 = n4; i2 <= n5; ++i2) {
                    z z2 = this;
                    int n8 = n6;
                    int n9 = i2;
                    if (string != null) {
                        n7 = z2.a(n8, n9, true) ? 1 : 0;
                        if (string == null) continue block1;
                        if (n7 == 0) continue;
                        z2 = this;
                        n8 = n6;
                        n9 = i2;
                    }
                    z2.b(n8, n9).a(x2, k2, arrayList, predicate);
                    if (string != null) continue;
                }
                ++n6;
                if (string != null) continue block0;
            }
            break;
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f(net.minecraft.k.n n2, boolean bl2) {
        boolean bl3;
        block8: {
            net.minecraft.o.a a10;
            String string;
            block7: {
                net.minecraft.o.a a11;
                string = net.minecraft.ah.z.I();
                z z2 = this;
                if (string != null) {
                    if (z2.m(n2)) {
                        return false;
                    }
                    z2 = this;
                }
                a10 = a11 = z2.Q.c(n2.e() >> 4, n2.a() >> 4);
                if (string == null) break block7;
                if (a10 == null) break block8;
                a10 = a11;
            }
            bl3 = a10.y();
            if (string == null) return bl3;
            if (!bl3) {
                i i2 = this.d(n2);
                boolean bl4 = i2.o().o();
                if (string != null) {
                    if (!bl4) return false;
                    bl4 = i2.k();
                }
                if (string == null) return bl4;
                if (!bl4) return false;
                return true;
            }
        }
        bl3 = bl2;
        return bl3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(x var1_1, boolean var2_2) {
        block100: {
            block99: {
                block92: {
                    block93: {
                        block98: {
                            block97: {
                                block96: {
                                    block94: {
                                        block95: {
                                            block90: {
                                                block91: {
                                                    block88: {
                                                        block89: {
                                                            block86: {
                                                                block87: {
                                                                    block84: {
                                                                        block85: {
                                                                            block82: {
                                                                                block83: {
                                                                                    block80: {
                                                                                        block81: {
                                                                                            block78: {
                                                                                                block79: {
                                                                                                    block76: {
                                                                                                        block77: {
                                                                                                            block74: {
                                                                                                                block75: {
                                                                                                                    block72: {
                                                                                                                        block73: {
                                                                                                                            block70: {
                                                                                                                                block71: {
                                                                                                                                    block66: {
                                                                                                                                        block67: {
                                                                                                                                            block68: {
                                                                                                                                                block69: {
                                                                                                                                                    block64: {
                                                                                                                                                        block65: {
                                                                                                                                                            var3_3 = net.minecraft.ah.z.I();
                                                                                                                                                            v0 = var1_1 instanceof net.minecraft.i.j;
                                                                                                                                                            if (var3_3 == null) break block64;
                                                                                                                                                            if (v0 != 0) break block65;
                                                                                                                                                            var4_4 = net.minecraft.k.h.f(var1_1.a);
                                                                                                                                                            var5_5 = net.minecraft.k.h.f(var1_1.ax);
                                                                                                                                                            var6_6 = 32;
                                                                                                                                                            v0 = var2_2;
                                                                                                                                                            if (var3_3 == null) break block64;
                                                                                                                                                            if (v0 != 0) {
                                                                                                                                                                v0 = this.a(var4_4 - 32, 0, var5_5 - 32, var4_4 + 32, 0, var5_5 + 32, true) ? 1 : 0;
                                                                                                                                                                if (var3_3 != null) {
                                                                                                                                                                    if (v0 == 0) {
                                                                                                                                                                        return;
                                                                                                                                                                    } else {
                                                                                                                                                                        ** GOTO lbl17
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    ** GOTO lbl16
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            break block65;
lbl16:
                                                                                                                                                            // 2 sources

                                                                                                                                                            break block64;
                                                                                                                                                        }
                                                                                                                                                        var1_1.am = var1_1.a;
                                                                                                                                                        var1_1.af = var1_1.aF;
                                                                                                                                                        var1_1.n = var1_1.ax;
                                                                                                                                                        var1_1.ak = var1_1.e;
                                                                                                                                                        var1_1.E = var1_1.at;
                                                                                                                                                        v0 = var2_2;
                                                                                                                                                    }
                                                                                                                                                    if (var3_3 == null) break block66;
                                                                                                                                                    if (v0 == 0) break block67;
                                                                                                                                                    v0 = var1_1.D;
                                                                                                                                                    if (var3_3 == null) break block66;
                                                                                                                                                    if (v0 == 0) break block67;
                                                                                                                                                    ++var1_1.H;
                                                                                                                                                    v1 = var1_1;
                                                                                                                                                    if (var3_3 == null) break block68;
                                                                                                                                                    if (!v1.N()) break block69;
                                                                                                                                                    var1_1.aZ();
                                                                                                                                                    if (var3_3 != null) break block67;
                                                                                                                                                }
                                                                                                                                                v1 = var1_1;
                                                                                                                                            }
                                                                                                                                            v1.ae();
                                                                                                                                        }
                                                                                                                                        this.H.b("chunkCheck");
                                                                                                                                        v2 = var1_1;
                                                                                                                                        if (var3_3 == null) break block70;
                                                                                                                                        v0 = Double.isNaN(v2.a);
                                                                                                                                    }
                                                                                                                                    if (v0 != 0) break block71;
                                                                                                                                    v3 = Double.isInfinite(var1_1.a);
                                                                                                                                    if (var3_3 == null) break block72;
                                                                                                                                    if (!v3) break block73;
                                                                                                                                }
                                                                                                                                v2 = var1_1;
                                                                                                                            }
                                                                                                                            v2.a = var1_1.am;
                                                                                                                        }
                                                                                                                        v4 = var1_1;
                                                                                                                        if (var3_3 == null) break block74;
                                                                                                                        v3 = Double.isNaN(v4.aF);
                                                                                                                    }
                                                                                                                    if (v3) break block75;
                                                                                                                    v5 = Double.isInfinite(var1_1.aF);
                                                                                                                    if (var3_3 == null) break block76;
                                                                                                                    if (!v5) break block77;
                                                                                                                }
                                                                                                                v4 = var1_1;
                                                                                                            }
                                                                                                            v4.aF = var1_1.af;
                                                                                                        }
                                                                                                        v6 = var1_1;
                                                                                                        if (var3_3 == null) break block78;
                                                                                                        v5 = Double.isNaN(v6.ax);
                                                                                                    }
                                                                                                    if (v5) break block79;
                                                                                                    v7 = Double.isInfinite(var1_1.ax);
                                                                                                    if (var3_3 == null) break block80;
                                                                                                    if (!v7) break block81;
                                                                                                }
                                                                                                v6 = var1_1;
                                                                                            }
                                                                                            v6.ax = var1_1.n;
                                                                                        }
                                                                                        v8 = var1_1;
                                                                                        if (var3_3 == null) break block82;
                                                                                        v7 = Double.isNaN(v8.at);
                                                                                    }
                                                                                    if (v7) break block83;
                                                                                    v9 = Double.isInfinite(var1_1.at);
                                                                                    if (var3_3 == null) break block84;
                                                                                    if (!v9) break block85;
                                                                                }
                                                                                v8 = var1_1;
                                                                            }
                                                                            v8.at = var1_1.E;
                                                                        }
                                                                        v10 = var1_1;
                                                                        if (var3_3 == null) break block86;
                                                                        v9 = Double.isNaN(v10.e);
                                                                    }
                                                                    if (v9) break block87;
                                                                    v11 = Double.isInfinite(var1_1.e);
                                                                    if (var3_3 == null) break block88;
                                                                    if (v11 == 0) break block89;
                                                                }
                                                                v10 = var1_1;
                                                            }
                                                            v10.e = var1_1.ak;
                                                        }
                                                        v11 = net.minecraft.k.h.f(var1_1.a / 16.0);
                                                    }
                                                    var4_4 = v11 ? 1 : 0;
                                                    var5_5 = net.minecraft.k.h.f(var1_1.aF / 16.0);
                                                    var6_6 = net.minecraft.k.h.f(var1_1.ax / 16.0);
                                                    v12 = var1_1.D;
                                                    if (var3_3 == null) break block90;
                                                    if (v12 == 0) break block91;
                                                    v12 = var1_1.v;
                                                    if (var3_3 == null) break block90;
                                                    if (v12 != var4_4) break block91;
                                                    v12 = var1_1.q;
                                                    if (var3_3 == null) break block90;
                                                    if (v12 != var5_5) break block91;
                                                    v13 = var1_1.y;
                                                    if (var3_3 == null) break block92;
                                                    if (v13 == var6_6) break block93;
                                                }
                                                v12 = var1_1.D;
                                            }
                                            if (var3_3 == null) break block94;
                                            if (v12 == 0) break block95;
                                            v12 = this.a(var1_1.v, var1_1.y, true) ? 1 : 0;
                                            if (var3_3 == null) break block94;
                                            if (v12 != 0) {
                                                this.b(var1_1.v, var1_1.y).a(var1_1, var1_1.q);
                                            }
                                        }
                                        v12 = var1_1.aJ() ? 1 : 0;
                                    }
                                    if (var3_3 == null) break block96;
                                    if (v12 != 0) break block97;
                                    v14 = this;
                                    v15 = var4_4;
                                    v16 = var6_6;
                                    if (var3_3 == null) break block98;
                                    v12 = v14.a(v15, v16, true) ? 1 : 0;
                                }
                                if (v12 != 0) break block97;
                                var1_1.D = false;
                                if (var3_3 != null) break block93;
                            }
                            v14 = this;
                            v15 = var4_4;
                            v16 = var6_6;
                        }
                        v14.b(v15, v16).a(var1_1);
                    }
                    this.H.c();
                    v13 = var2_2;
                }
                if (var3_3 == null) break block99;
                if (v13 == 0) return;
                v17 = var1_1;
                if (var3_3 == null) break block100;
                v13 = v17.D ? 1 : 0;
            }
            if (v13 == 0) return;
            v17 = var1_1;
        }
        var7_7 = v17.j().iterator();
        do {
            if (var7_7.hasNext() == false) return;
            v18 = var8_8 = var7_7.next();
            if (var3_3 != null) {
                if (!v18.P) {
                    v18 = var8_8.as();
                    if (var3_3 != null) {
                        if (v18 == var1_1) {
                            this.i(var8_8);
                            if (var3_3 != null) continue;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 4 sources

                {
                    v18 = var8_8;
                }
            }
            v18.aO();
        } while (var3_3 != null);
    }

    public void a(net.minecraft.k.n n2, net.minecraft.W.K k2, int n3, int n4) {
        this.d(n2).a(this, n2, n3, n4);
    }

    public void r(net.minecraft.k.n n2) {
        this.u.a(n2);
    }

    public z x() {
        return this;
    }

    public int c(int n2, int n3) {
        int n4;
        block6: {
            int n5;
            int n6;
            block2: {
                block3: {
                    boolean bl2;
                    String string;
                    block4: {
                        block5: {
                            string = net.minecraft.ah.z.I();
                            n6 = n2;
                            n5 = -30000000;
                            if (string == null) break block2;
                            if (n6 < n5) break block3;
                            n6 = n3;
                            n5 = -30000000;
                            if (string == null) break block2;
                            if (n6 < n5) break block3;
                            n6 = n2;
                            n5 = 30000000;
                            if (string == null) break block2;
                            if (n6 >= n5) break block3;
                            n6 = n3;
                            n5 = 30000000;
                            if (string == null) break block2;
                            if (n6 >= n5) break block3;
                            bl2 = this.a(n2 >> 4, n3 >> 4, true);
                            if (string == null) break block4;
                            if (!bl2) break block5;
                            n4 = this.b(n2 >> 4, n3 >> 4).b(n2 & 0xF, n3 & 0xF);
                            if (string != null) break block6;
                        }
                        bl2 = false;
                    }
                    n4 = bl2 ? 1 : 0;
                    if (string != null) break block6;
                }
                n6 = this.y();
                n5 = 1;
            }
            n4 = n6 + n5;
        }
        return n4;
    }

    public int d() {
        return this.D.a(this.u.m());
    }

    @Nullable
    public net.minecraft.i.j a(double d10, double d11, double d12, double d13, Predicate<x> predicate) {
        net.minecraft.i.j j2;
        block3: {
            double d14 = -1.0;
            net.minecraft.i.j j3 = null;
            String string = net.minecraft.ah.z.I();
            int n2 = 0;
            while (n2 < this.k.size()) {
                block4: {
                    block5: {
                        double d15;
                        net.minecraft.i.j j4;
                        block8: {
                            double d16;
                            block9: {
                                double d17;
                                block6: {
                                    block7: {
                                        j2 = this.k.get(n2);
                                        if (string == null) break block3;
                                        j4 = j2;
                                        if (string == null) break block4;
                                        if (!predicate.apply((Object)j4)) break block5;
                                        d16 = j4.a(d10, d11, d12);
                                        double d18 = d13 - 0.0;
                                        d17 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                        if (string == null) break block6;
                                        if (d17 < 0) break block7;
                                        double d19 = d16 - d13 * d13;
                                        d17 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                        if (string == null) break block6;
                                        if (d17 >= 0) break block5;
                                    }
                                    d15 = d14;
                                    if (string == null) break block8;
                                    double d20 = d15 - -1.0;
                                    d17 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                                }
                                if (d17 == false) break block9;
                                d15 = d16;
                                if (string == null) break block8;
                                if (!(d15 < d14)) break block5;
                            }
                            d15 = d16;
                        }
                        d14 = d15;
                        j3 = j4;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            j2 = j3;
        }
        return j2;
    }

    public void a(net.minecraft.k.n n2, @Nullable d d10) {
        String string = net.minecraft.ah.z.I();
        for (int i2 = 0; i2 < this.v.size(); ++i2) {
            this.v.get(i2).a(d10, n2);
            if (string != null) continue;
        }
    }

    @Nullable
    public net.minecraft.k.n a(String string, net.minecraft.k.n n2, boolean bl2) {
        return null;
    }

    public boolean b(net.minecraft.k.k k2) {
        int n2;
        block7: {
            int n3 = net.minecraft.k.h.f(k2.e);
            int n4 = net.minecraft.k.h.i(k2.f);
            int n5 = net.minecraft.k.h.f(k2.b);
            int n6 = net.minecraft.k.h.i(k2.a);
            int n7 = net.minecraft.k.h.f(k2.d);
            int n8 = net.minecraft.k.h.i(k2.g);
            String string = net.minecraft.ah.z.I();
            p p2 = net.minecraft.k.p.a();
            int n9 = n3;
            block0: while (true) {
                int n10 = n9;
                block1: while (n10 < n4) {
                    n2 = n5;
                    if (string == null) break block7;
                    int n11 = n2;
                    while (n11 < n6) {
                        block8: {
                            n10 = n7;
                            if (string == null) continue block1;
                            int n12 = n10;
                            while (n12 < n8) {
                                i i2 = this.d(p2.a(n9, n11, n12));
                                if (string != null) {
                                    if (string != null) {
                                        if (i2.o() != net.minecraft.ac.c.A) {
                                            p2.b();
                                            return true;
                                        }
                                        ++n12;
                                    }
                                    if (string != null) continue;
                                }
                                break block8;
                            }
                            ++n11;
                        }
                        if (string != null) continue;
                    }
                    ++n9;
                    if (string != null) continue block0;
                }
                break;
            }
            p2.b();
            n2 = 0;
        }
        return n2 != 0;
    }

    @Nullable
    public x a(int n2) {
        return this.w.f(n2);
    }

    @Nullable
    private y o(net.minecraft.k.n n2) {
        int n3 = 0;
        String string = net.minecraft.ah.z.I();
        while (n3 < this.x.size()) {
            block3: {
                block4: {
                    y y2;
                    block5: {
                        y y3 = this.x.get(n3);
                        if (string == null) break block3;
                        if (y3.a()) break block4;
                        y2 = y3;
                        if (string == null) break block5;
                        if (!y2.j().equals(n2)) break block4;
                        y2 = y3;
                    }
                    return y2;
                }
                ++n3;
            }
            if (string != null) continue;
        }
        return null;
    }

    public void a(Collection<x> collection) {
        this.t.addAll(collection);
    }

    public void a(net.minecraft.k.n n2, i i2, Random random) {
        this.F = true;
        i2.b().a(this, n2, i2, random);
        this.F = false;
    }

    public void b(int n2, net.minecraft.k.n n3, int n4) {
        this.a(null, n2, n3, n4);
    }

    public <T extends x> List<T> a(Class<? extends T> class_, Predicate<? super T> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        Iterator<x> iterator = this.O.iterator();
        String string = net.minecraft.ah.z.I();
        while (iterator.hasNext()) {
            block6: {
                boolean bl2;
                x x2;
                block5: {
                    x2 = iterator.next();
                    bl2 = class_.isAssignableFrom(x2.getClass());
                    if (string == null) break block5;
                    if (!bl2) break block6;
                    bl2 = predicate.apply((Object)x2);
                }
                if (string != null && bl2) {
                    bl2 = arrayList.add(x2);
                }
            }
            if (string != null) continue;
        }
        return arrayList;
    }
}

