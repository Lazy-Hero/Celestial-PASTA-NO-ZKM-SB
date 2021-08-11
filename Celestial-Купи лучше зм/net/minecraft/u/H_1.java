/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.U;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.B.X;
import net.minecraft.J.D;
import net.minecraft.J.E;
import net.minecraft.J.F;
import net.minecraft.J.G;
import net.minecraft.J.l;
import net.minecraft.J.m;
import net.minecraft.J.n;
import net.minecraft.J.o;
import net.minecraft.J.p;
import net.minecraft.J.q;
import net.minecraft.J.r;
import net.minecraft.J.s;
import net.minecraft.J.t;
import net.minecraft.J.u;
import net.minecraft.Q.K;
import net.minecraft.Q.aA;
import net.minecraft.Q.aC;
import net.minecraft.Q.aE;
import net.minecraft.Q.aH;
import net.minecraft.Q.aW;
import net.minecraft.Q.an;
import net.minecraft.Q.ao;
import net.minecraft.Q.aq;
import net.minecraft.U.A;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.N;
import net.minecraft.U.x;
import net.minecraft.U.y;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.j.b;
import net.minecraft.j.h;
import net.minecraft.w.d;
import net.minecraft.z.f;
import net.minecraft.z.g;
import net.minecraft.z.i;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class H {
    public /* synthetic */ int b;
    private final /* synthetic */ boolean i;
    private /* synthetic */ long p;
    private /* synthetic */ List<x> g;
    private /* synthetic */ double z;
    private /* synthetic */ double w;
    private /* synthetic */ int u;
    private /* synthetic */ double h;
    private static final /* synthetic */ Logger j;
    private final /* synthetic */ int x;
    private final /* synthetic */ x l;
    private /* synthetic */ boolean c;
    private /* synthetic */ double k;
    private /* synthetic */ long r;
    private /* synthetic */ int t;
    private /* synthetic */ long n;
    private /* synthetic */ double f;
    private /* synthetic */ int d;
    private /* synthetic */ boolean e;
    public /* synthetic */ boolean v;
    private /* synthetic */ boolean o;
    private /* synthetic */ double a;
    private final /* synthetic */ Set<k> q;
    private /* synthetic */ int y;
    private final /* synthetic */ int m;
    private /* synthetic */ int s;

    public void d(k k2) {
        block47: {
            block61: {
                boolean bl2;
                int[] arrn;
                block48: {
                    block49: {
                        x x2;
                        block60: {
                            boolean bl3;
                            block59: {
                                block46: {
                                    Object object;
                                    block57: {
                                        block58: {
                                            block45: {
                                                block55: {
                                                    block56: {
                                                        net.minecraft.C.K<?> k3;
                                                        block53: {
                                                            boolean bl4;
                                                            block54: {
                                                                block51: {
                                                                    boolean bl5;
                                                                    block52: {
                                                                        block50: {
                                                                            arrn = M.b();
                                                                            if (k2 == this.l) break block47;
                                                                            bl2 = this.b(k2);
                                                                            if (arrn == null) break block48;
                                                                            if (!bl2) break block49;
                                                                            bl5 = this.q.contains(k2);
                                                                            if (arrn == null) break block50;
                                                                            if (bl5) break block47;
                                                                            bl5 = this.c(k2);
                                                                        }
                                                                        if (arrn == null) break block51;
                                                                        if (bl5) break block52;
                                                                        bl5 = this.l.j;
                                                                        if (arrn == null) break block51;
                                                                        if (!bl5) break block47;
                                                                    }
                                                                    bl5 = this.q.add(k2);
                                                                }
                                                                k3 = this.d();
                                                                k2.cD.a(k3);
                                                                boolean bl6 = this.l.E().c();
                                                                if (arrn != null) {
                                                                    if (!bl6) {
                                                                        k2.cD.a(new aH(this.l.W(), this.l.E(), true));
                                                                    }
                                                                    bl6 = this.i;
                                                                }
                                                                bl4 = bl6;
                                                                bl3 = this.l instanceof B;
                                                                if (arrn == null) break block53;
                                                                if (!bl3) break block54;
                                                                object = (X[])((B)this.l).ao();
                                                                Collection<b> collection = ((h)object).b();
                                                                bl3 = collection.isEmpty();
                                                                if (arrn != null) {
                                                                    if (!bl3) {
                                                                        k2.cD.a(new ao(this.l.W(), collection));
                                                                    }
                                                                    bl3 = ((B)this.l).aK();
                                                                }
                                                                if (arrn == null) break block53;
                                                                if (bl3) {
                                                                    bl4 = true;
                                                                }
                                                            }
                                                            this.k = this.l.aq;
                                                            this.f = this.l.G;
                                                            this.h = this.l.d;
                                                            bl3 = bl4;
                                                        }
                                                        if (arrn == null) break block55;
                                                        if (!bl3) break block56;
                                                        bl3 = k3 instanceof aE;
                                                        if (arrn == null) break block55;
                                                        if (!bl3) {
                                                            k2.cD.a(new net.minecraft.Q.k(this.l.W(), this.l.aq, this.l.G, this.l.d));
                                                        }
                                                    }
                                                    bl3 = this.l instanceof B;
                                                }
                                                if (arrn != null) {
                                                    if (bl3) {
                                                        object = X.values();
                                                        int n2 = ((X[])object).length;
                                                        int n3 = 0;
                                                        while (n3 < n2) {
                                                            Object object2 = object[n3];
                                                            d d10 = ((B)this.l).b((X)((Object)object2));
                                                            if (arrn != null) {
                                                                bl3 = d10.G();
                                                                if (arrn == null) break block45;
                                                                if (!bl3) {
                                                                    k2.cD.a(new aC(this.l.W(), (X)((Object)object2), d10));
                                                                }
                                                                ++n3;
                                                            }
                                                            if (arrn != null) continue;
                                                        }
                                                    }
                                                    bl3 = this.l instanceof j;
                                                }
                                            }
                                            if (arrn == null) break block57;
                                            if (!bl3) break block58;
                                            object = (j)this.l;
                                            bl3 = ((j)object).as();
                                            if (arrn == null) break block57;
                                            if (bl3) {
                                                k2.cD.a(new an((j)object, new net.minecraft.k.n(this.l)));
                                            }
                                        }
                                        bl3 = this.l instanceof B;
                                    }
                                    if (arrn != null) {
                                        if (bl3) {
                                            object = (B)this.l;
                                            for (net.minecraft.K.j j2 : ((B)object).az()) {
                                                k2.cD.a(new aA(this.l.W(), j2));
                                                if (arrn != null) {
                                                    if (arrn != null) continue;
                                                }
                                                break block46;
                                            }
                                        }
                                        bl3 = this.l.j().isEmpty();
                                    }
                                    if (arrn == null) break block59;
                                    if (!bl3) {
                                        k2.cD.a(new aq(this.l));
                                    }
                                }
                                x2 = this.l;
                                if (arrn == null) break block60;
                                bl3 = x2.N();
                            }
                            if (bl3) {
                                k2.cD.a(new aq(this.l.as()));
                            }
                            x2 = this.l;
                        }
                        x2.a(k2);
                        k2.l(this.l);
                        if (arrn != null) break block47;
                    }
                    bl2 = this.q.contains(k2);
                }
                if (arrn == null) break block61;
                if (!bl2) break block47;
                bl2 = this.q.remove(k2);
            }
            this.l.b(k2);
            k2.k(this.l);
        }
    }

    public boolean equals(Object object) {
        int[] arrn = M.b();
        boolean bl2 = object instanceof H;
        if (arrn != null) {
            if (bl2) {
                int n2 = ((H)object).l.W();
                if (arrn != null) {
                    n2 = n2 == this.l.W() ? 1 : 0;
                }
                return n2 != 0;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void e(k k2) {
        block3: {
            block2: {
                int[] arrn = M.b();
                boolean bl2 = this.q.contains(k2);
                if (arrn == null) break block2;
                if (!bl2) break block3;
                bl2 = this.q.remove(k2);
            }
            this.l.b(k2);
            k2.k(this.l);
        }
    }

    public void a() {
        Iterator<k> iterator = this.q.iterator();
        int[] arrn = M.b();
        while (iterator.hasNext()) {
            k k2 = iterator.next();
            this.l.b(k2);
            k2.k(this.l);
            if (arrn != null) continue;
        }
    }

    public void e() {
        this.o = false;
    }

    /*
     * Exception decompiling
     */
    public void b(List<j> var1_1) {
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

    public x c() {
        return this.l;
    }

    public void b(net.minecraft.C.K<?> k2) {
        Iterator<k> iterator = this.q.iterator();
        int[] arrn = M.b();
        while (iterator.hasNext()) {
            k k3 = iterator.next();
            k3.cD.a(k2);
            if (arrn != null) continue;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void a(int n2) {
        this.s = n2;
    }

    private boolean c(k k2) {
        return k2.n().g().a(k2, this.l.v, this.l.y);
    }

    public void a(net.minecraft.C.K<?> k2) {
        block3: {
            x x2;
            block2: {
                int[] arrn = M.b();
                this.b(k2);
                int[] arrn2 = arrn;
                x2 = this.l;
                if (arrn2 == null) break block2;
                if (!(x2 instanceof k)) break block3;
                x2 = this.l;
            }
            ((k)x2).cD.a(k2);
        }
    }

    public void a(k k2) {
        int[] arrn = M.b();
        boolean bl2 = this.q.contains(k2);
        if (arrn != null && bl2) {
            this.l.b(k2);
            k2.k(this.l);
            bl2 = this.q.remove(k2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(k k2) {
        double d10;
        block5: {
            int[] arrn;
            block8: {
                block7: {
                    int n2;
                    double d11;
                    block6: {
                        block4: {
                            double d12 = k2.a - (double)this.n / 4096.0;
                            d11 = k2.ax - (double)this.r / 4096.0;
                            arrn = M.b();
                            n2 = Math.min(this.x, this.s);
                            double d13 = d12 - (double)(-n2);
                            d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (arrn == null) break block4;
                            if (d10 < 0) break block5;
                            double d14 = d12 - (double)n2;
                            d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        }
                        if (arrn == null) break block6;
                        if (d10 > 0) break block5;
                        double d15 = d11 - (double)(-n2);
                        d10 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block7;
                    if (d10 < 0) break block5;
                    double d16 = d11 - (double)n2;
                    d10 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                }
                if (arrn == null) break block8;
                if (d10 > 0) break block5;
                d10 = (double)this.l.c(k2);
            }
            if (arrn == null) return (boolean)d10;
            if (d10 != false) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public void a(List<j> list) {
        int[] arrn = M.b();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.d((k)list.get(i2));
            if (arrn != null) continue;
        }
    }

    public H(x x2, int n2, int n3, int n4, boolean bl2) {
        this.g = Collections.emptyList();
        this.q = Sets.newHashSet();
        this.l = x2;
        this.x = n2;
        this.s = n3;
        this.m = n4;
        this.i = bl2;
        this.n = N.a(x2.a);
        this.p = N.a(x2.aF);
        this.r = N.a(x2.ax);
        this.t = net.minecraft.k.h.d(x2.e * 256.0f / 360.0f);
        this.u = net.minecraft.k.h.d(x2.at * 256.0f / 360.0f);
        this.d = net.minecraft.k.h.d(x2.aK() * 256.0f / 360.0f);
        this.e = x2.A;
    }

    static {
        j = LogManager.getLogger();
    }

    public int hashCode() {
        return this.l.W();
    }

    private void b() {
        block8: {
            Set<b> set;
            x x2;
            int[] arrn;
            block7: {
                boolean bl2;
                block6: {
                    net.minecraft.q.m m2 = this.l.E();
                    arrn = M.b();
                    bl2 = m2.e();
                    if (arrn == null) break block6;
                    if (bl2) {
                        this.a(new aH(this.l.W(), m2, false));
                    }
                    x2 = this.l;
                    if (arrn == null) break block7;
                    bl2 = x2 instanceof B;
                }
                if (!bl2) break block8;
                x2 = this.l;
            }
            h h2 = (h)((B)x2).ao();
            Set<b> set2 = set = h2.c();
            if (arrn != null) {
                if (!set2.isEmpty()) {
                    this.a(new ao(this.l.W(), set));
                }
                set2 = set;
            }
            set2.clear();
        }
    }

    private net.minecraft.C.K<?> d() {
        boolean bl2;
        int[] arrn;
        block58: {
            block59: {
                int n2;
                net.minecraft.Q.r r2;
                net.minecraft.z.j j2;
                block62: {
                    int n3;
                    block65: {
                        block63: {
                            block64: {
                                block60: {
                                    block61: {
                                        arrn = M.b();
                                        bl2 = this.l.P;
                                        if (arrn != null) {
                                            if (bl2) {
                                                j.warn("Fetching addPacket for removed entity");
                                            }
                                            bl2 = this.l instanceof k;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.y((j)this.l);
                                            }
                                            bl2 = this.l instanceof net.minecraft.ag.u;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                this.d = net.minecraft.k.h.d(this.l.aK() * 256.0f / 360.0f);
                                                return new aE((B)this.l);
                                            }
                                            bl2 = this.l instanceof m;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new K((m)this.l);
                                            }
                                            bl2 = this.l instanceof t;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 2, 1);
                                            }
                                            bl2 = this.l instanceof u;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                u u2 = (u)this.l;
                                                return new net.minecraft.Q.r(this.l, 10, u2.o().a());
                                            }
                                            bl2 = this.l instanceof o;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 1);
                                            }
                                            bl2 = this.l instanceof E;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new aW((E)this.l);
                                            }
                                            bl2 = this.l instanceof net.minecraft.z.o;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                j j3 = ((net.minecraft.z.o)this.l).g();
                                                return new net.minecraft.Q.r(this.l, 90, j3 == null ? this.l.W() : j3.W());
                                            }
                                            bl2 = this.l instanceof g;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                x x2 = ((g)this.l).aY;
                                                return new net.minecraft.Q.r(this.l, 91, 1 + (x2 == null ? this.l.W() : x2.W()));
                                            }
                                            bl2 = this.l instanceof net.minecraft.z.h;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                x x3 = ((f)this.l).aY;
                                                return new net.minecraft.Q.r(this.l, 60, 1 + (x3 == null ? this.l.W() : x3.W()));
                                            }
                                            bl2 = this.l instanceof net.minecraft.z.u;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 61);
                                            }
                                            bl2 = this.l instanceof net.minecraft.z.p;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 68);
                                            }
                                            bl2 = this.l instanceof net.minecraft.z.t;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 73);
                                            }
                                            bl2 = this.l instanceof G;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 75);
                                            }
                                            bl2 = this.l instanceof F;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 65);
                                            }
                                            bl2 = this.l instanceof q;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 72);
                                            }
                                            bl2 = this.l instanceof s;
                                        }
                                        if (arrn != null) {
                                            if (bl2) {
                                                return new net.minecraft.Q.r(this.l, 76);
                                            }
                                            bl2 = this.l instanceof net.minecraft.z.j;
                                        }
                                        if (arrn == null) break block58;
                                        if (!bl2) break block59;
                                        j2 = (net.minecraft.z.j)this.l;
                                        r2 = null;
                                        n2 = 63;
                                        n3 = this.l instanceof net.minecraft.z.m;
                                        if (arrn == null) break block60;
                                        if (n3 == 0) break block61;
                                        n2 = 64;
                                        if (arrn != null) break block62;
                                    }
                                    n3 = this.l instanceof net.minecraft.z.k;
                                }
                                if (arrn == null) break block63;
                                if (n3 == 0) break block64;
                                n2 = 93;
                                if (arrn != null) break block62;
                            }
                            n3 = this.l instanceof net.minecraft.z.n;
                        }
                        if (arrn == null) break block65;
                        if (n3 == 0) break block62;
                        n3 = 66;
                    }
                    n2 = n3;
                }
                r2 = j2.aN != null ? new net.minecraft.Q.r(this.l, n2, ((net.minecraft.z.j)this.l).aN.W()) : new net.minecraft.Q.r(this.l, n2, 0);
                r2.c((int)(j2.aM * 8000.0));
                r2.d((int)(j2.aK * 8000.0));
                r2.a((int)(j2.aL * 8000.0));
                return r2;
            }
            bl2 = this.l instanceof net.minecraft.z.q;
        }
        if (arrn != null) {
            if (bl2) {
                net.minecraft.Q.r r3 = new net.minecraft.Q.r(this.l, 67, 0);
                r3.c((int)(this.l.aq * 8000.0));
                r3.d((int)(this.l.G * 8000.0));
                r3.a((int)(this.l.d * 8000.0));
                return r3;
            }
            bl2 = this.l instanceof net.minecraft.z.s;
        }
        if (arrn != null) {
            if (bl2) {
                return new net.minecraft.Q.r(this.l, 62);
            }
            bl2 = this.l instanceof i;
        }
        if (arrn != null) {
            if (bl2) {
                return new net.minecraft.Q.r(this.l, 79);
            }
            bl2 = this.l instanceof D;
        }
        if (arrn != null) {
            if (bl2) {
                return new net.minecraft.Q.r(this.l, 50);
            }
            bl2 = this.l instanceof p;
        }
        if (arrn != null) {
            if (bl2) {
                return new net.minecraft.Q.r(this.l, 51);
            }
            bl2 = this.l instanceof r;
        }
        if (arrn != null) {
            if (bl2) {
                r r4 = (r)this.l;
                return new net.minecraft.Q.r(this.l, 70, net.minecraft.W.K.l(r4.c()));
            }
            bl2 = this.l instanceof n;
        }
        if (arrn != null) {
            if (bl2) {
                return new net.minecraft.Q.r(this.l, 78);
            }
            bl2 = this.l instanceof l;
        }
        if (arrn != null) {
            if (bl2) {
                l l2 = (l)this.l;
                return new net.minecraft.Q.r(this.l, 71, l2.aL.k(), l2.g());
            }
            bl2 = this.l instanceof A;
        }
        if (arrn != null) {
            if (bl2) {
                A a10 = (A)this.l;
                return new net.minecraft.Q.r(this.l, 77, 0, a10.g());
            }
            bl2 = this.l instanceof y;
        }
        if (bl2) {
            return new net.minecraft.Q.r(this.l, 3);
        }
        throw new IllegalArgumentException("Don't know how to add " + this.l.getClass() + "!");
    }
}

