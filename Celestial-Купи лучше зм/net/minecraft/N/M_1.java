/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import java.util.Iterator;
import net.minecraft.B.Q;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.t;
import net.minecraft.N.J;
import net.minecraft.N.j;
import net.minecraft.P.r;
import net.minecraft.W.K;
import net.minecraft.W.aN;
import net.minecraft.ac.c;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.u.g;
import net.minecraft.w.F;
import net.minecraft.w.O;
import net.minecraft.w.a3;
import net.minecraft.w.a_;
import net.minecraft.w.aa;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class M
extends J
implements ao,
net.minecraft.B.k {
    private /* synthetic */ a2<d> p;
    private /* synthetic */ int r;
    private static final /* synthetic */ int[] m;
    private static final /* synthetic */ int[] j;
    private /* synthetic */ int l;
    private /* synthetic */ String q;
    private static final /* synthetic */ int[] n;
    private /* synthetic */ int o;
    private /* synthetic */ int k;

    @Override
    public boolean a(net.minecraft.i.j j2) {
        m[] arrm = net.minecraft.N.j.f();
        if (this.a.b(this.d) != this) {
            return false;
        }
        double d10 = j2.a((double)this.d.e() + 0.5, (double)this.d.b() + 0.5, (double)this.d.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (arrm == null) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    @Override
    public n a(net.minecraft.i.h h2, net.minecraft.i.j j2) {
        return new t(h2, this);
    }

    @Override
    public d a(int n2, int n3) {
        return W.a(this.p, n2, n3);
    }

    public void a(String string) {
        this.q = string;
    }

    public void j() {
        block6: {
            d d10;
            block11: {
                d d11;
                block12: {
                    k k2;
                    k k3;
                    m[] arrm;
                    block10: {
                        block9: {
                            d d12;
                            d d13;
                            d d14;
                            block7: {
                                block8: {
                                    Object object;
                                    block5: {
                                        arrm = net.minecraft.N.j.f();
                                        object = this;
                                        if (arrm != null) break block5;
                                        if (!((M)object).i()) break block6;
                                        object = this.p.get(0);
                                    }
                                    d11 = (d)object;
                                    d14 = net.minecraft.az.g.a().b(d11);
                                    d12 = d13 = this.p.get(2);
                                    if (arrm != null) break block7;
                                    if (!d12.G()) break block8;
                                    this.p.set(2, d14.C());
                                    if (arrm == null) break block9;
                                }
                                d12 = d13;
                            }
                            k3 = d12.w();
                            k2 = d14.w();
                            if (arrm != null) break block10;
                            if (k3 == k2) {
                                d13.g(1);
                            }
                        }
                        d10 = d11;
                        if (arrm != null) break block11;
                        k3 = d10.w();
                        k2 = net.minecraft.w.k.b(g.a2);
                    }
                    if (k3 != k2) break block12;
                    d10 = d11;
                    if (arrm != null) break block11;
                    if (d10.d() != 1) break block12;
                    d10 = this.p.get(1);
                    if (arrm != null) break block11;
                    if (d10.G()) break block12;
                    d10 = this.p.get(1);
                    if (arrm != null) break block11;
                    if (d10.w() == net.minecraft.u.h.P) {
                        this.p.set(1, new d(net.minecraft.u.h.ah));
                    }
                }
                d10 = d11;
            }
            d10.b(1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, d d10) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl3 = n2;
        bl3 = BADBOOL 2;
        if (arrm == null) {
            if (bl2 == bl3) {
                return false;
            }
            bl2 = n2;
            if (arrm != null) return bl2;
            bl3 = true;
        }
        if (bl2 != bl3) {
            return true;
        }
        d d11 = this.p.get(1);
        boolean bl4 = M.c(d10);
        if (arrm != null) return bl4;
        if (bl4) return true;
        d d12 = d10;
        if (arrm == null) {
            if (!Q.a(d12)) return false;
            d12 = d11;
        }
        if (d12.w() == net.minecraft.u.h.P) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        M m2 = this;
        if (arrm == null) {
            if (!m2.g()) return "container.furnace";
            m2 = this;
        }
        String string = m2.q;
        return string;
    }

    @Override
    public int c() {
        return 64;
    }

    public int a(d d10) {
        return 200;
    }

    public boolean k() {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = this.l;
        if (arrm == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(int var1_1, d var2_2) {
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
    public int c(int n2) {
        m[] arrm = net.minecraft.N.j.f();
        int n3 = n2;
        if (arrm == null) {
            switch (n3) {
                case 0: {
                    return this.l;
                }
                case 1: {
                    return this.r;
                }
                case 2: {
                    return this.o;
                }
                case 3: {
                    return this.k;
                }
            }
            n3 = 0;
        }
        return n3;
    }

    @Override
    public void d(net.minecraft.i.j j2) {
    }

    @Override
    public int e() {
        return this.p.size();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int b(d var0) {
        block58: {
            block57: {
                block56: {
                    block54: {
                        block55: {
                            block53: {
                                block52: {
                                    var1_1 = net.minecraft.N.j.f();
                                    v0 = var0;
                                    if (var1_1 == null) {
                                        if (v0.G()) {
                                            return 0;
                                        }
                                        v0 = var0;
                                    }
                                    v1 = var2_2 = v0.w();
                                    v2 = net.minecraft.w.k.b(g.e);
                                    if (var1_1 == null) {
                                        if (v1 == v2) {
                                            return 150;
                                        }
                                        v1 = var2_2;
                                        v2 = net.minecraft.w.k.b(g.s);
                                    }
                                    if (var1_1 == null) {
                                        if (v1 == v2) {
                                            return 100;
                                        }
                                        v1 = var2_2;
                                        v2 = net.minecraft.w.k.b(g.D);
                                    }
                                    if (var1_1 == null) {
                                        if (v1 == v2) {
                                            return 67;
                                        }
                                        v1 = var2_2;
                                        v2 = net.minecraft.w.k.b(g.cD);
                                    }
                                    if (var1_1 != null) break block52;
                                    if (v1 == v2) {
                                        return 300;
                                    }
                                    v1 = var2_2;
                                    if (var1_1 != null) break block53;
                                    v2 = net.minecraft.w.k.b(g.I);
                                }
                                if (v1 == v2) {
                                    return 100;
                                }
                                v1 = var2_2;
                            }
                            if (var1_1 == null) {
                                if (K.a(v1).d().o() == net.minecraft.ac.c.k) {
                                    return 300;
                                }
                                v1 = var2_2;
                            }
                            if (var1_1 == null) {
                                if (v1 == net.minecraft.w.k.b(g.r)) {
                                    return 16000;
                                }
                                v1 = var2_2;
                            }
                            v3 = v1 instanceof a3;
                            if (var1_1 == null) {
                                if (v3) {
                                    v3 = "WOOD".equals(((a3)var2_2).b());
                                    if (var1_1 == null) {
                                        if (v3) {
                                            return 200;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v3 = var2_2 instanceof a_;
                                }
                            }
                            if (var1_1 != null) break block54;
                            if (!v3) break block55;
                            v3 = "WOOD".equals(((a_)var2_2).a());
                            if (var1_1 == null) {
                                if (v3) {
                                    return 200;
                                } else {
                                    ** GOTO lbl59
                                }
                            }
                            break block54;
                        }
                        v4 = var2_2;
                        if (var1_1 != null) break block56;
                        v3 = v4 instanceof aa;
                    }
                    if (v3) {
                        v5 = "WOOD".equals(((aa)var2_2).a());
                        if (var1_1 != null) return v5;
                        if (v5 != 0) {
                            return 200;
                        }
                    }
                    v4 = var2_2;
                }
                if (var1_1 == null) {
                    if (v4 == net.minecraft.u.h.bz) {
                        return 100;
                    }
                    v4 = var2_2;
                }
                if (var1_1 == null) {
                    if (v4 == net.minecraft.u.h.i) return 300;
                    v4 = var2_2;
                }
                v6 /* !! */  = net.minecraft.u.h.bQ;
                if (var1_1 == null) {
                    if (v4 == v6 /* !! */ ) return 300;
                    v4 = var2_2;
                    v6 /* !! */  = net.minecraft.u.h.bk;
                }
                if (var1_1 == null) {
                    if (v4 == v6 /* !! */ ) {
                        return 200;
                    }
                    v4 = var2_2;
                    v6 /* !! */  = net.minecraft.u.h.b4;
                }
                if (var1_1 == null) {
                    if (v4 == v6 /* !! */ ) {
                        return 1600;
                    }
                    v4 = var2_2;
                    v6 /* !! */  = net.minecraft.u.h.cg;
                }
                if (var1_1 == null) {
                    if (v4 == v6 /* !! */ ) {
                        return 20000;
                    }
                    v4 = var2_2;
                    v6 /* !! */  = net.minecraft.w.k.b(g.dj);
                }
                if (var1_1 == null) {
                    if (v4 == v6 /* !! */ ) return 100;
                    v4 = var2_2;
                    v6 /* !! */  = net.minecraft.u.h.z;
                }
                if (var1_1 != null) break block57;
                if (v4 == v6 /* !! */ ) return 100;
                v4 = var2_2;
                if (var1_1 != null) break block58;
                v6 /* !! */  = net.minecraft.u.h.bx;
            }
            if (v4 == v6 /* !! */ ) {
                return 2400;
            }
            v4 = var2_2;
        }
        v7 = v4 instanceof O;
        if (var1_1 == null) {
            if (v7 != 0) {
                v8 = var2_2;
                if (var1_1 == null) {
                    if (v8 != net.minecraft.u.h.cA) {
                        return 200;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v8 = var2_2;
            }
            v7 = v8 instanceof F;
        }
        if (var1_1 != null) return v7;
        if (v7 == 0) return 0;
        return 400;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, d d10, aA aA2) {
        k k2;
        m[] arrm = net.minecraft.N.j.f();
        if (aA2 != aA.DOWN) return true;
        boolean bl2 = n2;
        if (arrm != null) return bl2;
        if (!bl2) return true;
        k k4 = k2 = d10.w();
        k4 = net.minecraft.u.h.ah;
        if (arrm == null) {
            if (k3 == k4) return true;
            k k4 = k2;
            k4 = net.minecraft.u.h.P;
        }
        if (k3 != k4) return false;
        return true;
    }

    @Override
    public void d() {
        this.p.clear();
    }

    @Override
    public void c() {
        block24: {
            int n2;
            block11: {
                int n3;
                block12: {
                    int n4;
                    block21: {
                        m[] arrm;
                        block23: {
                            int n5;
                            block22: {
                                block15: {
                                    block16: {
                                        block19: {
                                            M m2;
                                            block20: {
                                                boolean bl2;
                                                block17: {
                                                    block18: {
                                                        d d10;
                                                        block13: {
                                                            block14: {
                                                                n5 = this.k();
                                                                n3 = 0;
                                                                arrm = net.minecraft.N.j.f();
                                                                n2 = this.k();
                                                                if (arrm == null) {
                                                                    if (n2 != 0) {
                                                                        --this.l;
                                                                    }
                                                                    n2 = this.a.C;
                                                                }
                                                                if (arrm != null) break block11;
                                                                if (n2 != 0) break block12;
                                                                d10 = this.p.get(1);
                                                                bl2 = this.k();
                                                                if (arrm != null) break block13;
                                                                if (bl2) break block14;
                                                                n2 = d10.G();
                                                                if (arrm != null) break block15;
                                                                if (n2 != 0) break block16;
                                                                n2 = this.p.get(0).G() ? 1 : 0;
                                                                if (arrm != null) break block15;
                                                                if (n2 != 0) break block16;
                                                            }
                                                            bl2 = this.k();
                                                        }
                                                        if (arrm != null) break block17;
                                                        if (bl2) break block18;
                                                        bl2 = this.i();
                                                        if (arrm != null) break block17;
                                                        if (!bl2) break block18;
                                                        this.r = this.l = M.b(d10);
                                                        bl2 = this.k();
                                                        if (arrm != null) break block17;
                                                        if (!bl2) break block18;
                                                        n3 = 1;
                                                        bl2 = d10.G();
                                                        if (arrm != null) break block17;
                                                        if (bl2) break block18;
                                                        k k2 = d10.w();
                                                        d10.b(1);
                                                        bl2 = d10.G();
                                                        if (arrm != null) break block17;
                                                        if (bl2) {
                                                            k k3 = k2.s();
                                                            this.p.set(1, k3 == null ? net.minecraft.w.d.m : new d(k3));
                                                        }
                                                    }
                                                    m2 = this;
                                                    if (arrm != null) break block19;
                                                    bl2 = m2.k();
                                                }
                                                if (!bl2) break block20;
                                                m2 = this;
                                                if (arrm != null) break block19;
                                                if (!m2.i()) break block20;
                                                int n4 = ++this.o;
                                                n4 = this.k;
                                                if (arrm != null) break block21;
                                                if (n2 != n4) break block22;
                                                this.o = 0;
                                                this.k = this.a(this.p.get(0));
                                                this.j();
                                                n3 = 1;
                                                if (arrm == null) break block22;
                                            }
                                            m2 = this;
                                        }
                                        m2.o = 0;
                                        if (arrm == null) break block22;
                                    }
                                    n2 = this.k();
                                }
                                if (arrm != null) break block23;
                                if (n2 != 0) break block22;
                                n2 = this.o;
                                if (arrm != null) break block23;
                                if (n2 > 0) {
                                    this.o = h.c(this.o - 2, 0, this.k);
                                }
                            }
                            n2 = n5;
                        }
                        if (arrm != null) break block11;
                        n4 = this.k();
                    }
                    if (n2 != n4) {
                        n3 = 1;
                        aN.a(this.k(), this.a, this.d);
                    }
                }
                n2 = n3;
            }
            if (n2 == 0) break block24;
            this.b();
        }
    }

    public M() {
        this.p = a2.a(3, net.minecraft.w.d.m);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        String string = this.q;
        if (arrm == null) {
            if (string == null) return false;
            string = this.q;
        }
        boolean bl2 = string.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public boolean b(int n2, d d10, aA aA2) {
        return this.b(n2, d10);
    }

    @Override
    public void c(r r2) {
        block3: {
            block2: {
                super.c(r2);
                this.p = a2.a(this.e(), net.minecraft.w.d.m);
                W.a(r2, this.p);
                this.l = r2.q("BurnTime");
                m[] arrm = net.minecraft.N.j.f();
                this.o = r2.q("CookTime");
                this.k = r2.q("CookTimeTotal");
                M m2 = this;
                if (arrm != null) break block2;
                m2.r = M.b(this.p.get(1));
                if (!r2.a("CustomName", 8)) break block3;
                m2 = this;
            }
            m2.q = r2.j("CustomName");
        }
    }

    @Override
    public r a(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.a(r2);
        m[] arrm2 = arrm;
        r2.a("BurnTime", (short)this.l);
        r2.a("CookTime", (short)this.o);
        r2.a("CookTimeTotal", (short)this.k);
        r r3 = W.b(r2, this.p);
        if (arrm2 == null) {
            if (this.g()) {
                r2.a("CustomName", this.q);
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public String a() {
        return "minecraft:furnace";
    }

    @Override
    public d a(int n2) {
        return this.p.get(n2);
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (net.minecraft.av.g)new net.minecraft.x.d(M.class, "Items"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean i() {
        var1_1 = net.minecraft.N.j.f();
        v0 = this.p.get(0);
        if (var1_1 == null) {
            if (v0.G()) {
                return false;
            }
            v0 = net.minecraft.az.g.a().b(this.p.get(0));
        }
        v1 = var2_2 = v0;
        if (var1_1 == null) {
            if (v1.G()) {
                return false;
            }
            v1 = this.p.get(2);
        }
        var3_3 = v1;
        v2 = var3_3.G();
        if (var1_1 == null) {
            if (v2 != 0) {
                return true;
            }
            v2 = var3_3.c(var2_2);
        }
        if (var1_1 == null) {
            if (v2 == 0) {
                return false;
            }
            v2 = var3_3.t();
        }
        v3 = this.c();
        if (var1_1 == null) {
            if (v2 < v3) {
                v2 = var3_3.t();
                v3 = var3_3.f();
                if (var1_1 == null) {
                    if (v2 < v3) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v2 = var3_3.t();
                if (var1_1 != null) return (boolean)v2;
                v3 = var2_2.f();
            }
        }
        if (v2 >= v3) return (boolean)0;
        return (boolean)1;
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.p.iterator();
            m[] arrm = net.minecraft.N.j.f();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (arrm != null) break block3;
                        if (arrm != null) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (arrm == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(int var1_1, int var2_2) {
        var3_3 = net.minecraft.N.j.f();
        if (var3_3 != null) ** GOTO lbl6
        switch (var1_1) {
            case 0: {
                this.l = var2_2;
lbl6:
                // 2 sources

                if (var3_3 == null) return;
            }
            case 1: {
                this.r = var2_2;
                if (var3_3 == null) return;
            }
            case 2: {
                this.o = var2_2;
                if (var3_3 == null) return;
            }
            case 3: {
                this.k = var2_2;
                return;
            }
        }
    }

    @Override
    public int[] a(aA aA2) {
        m[] arrm = net.minecraft.N.j.f();
        aA aA3 = aA2;
        aA aA4 = aA.DOWN;
        if (arrm == null) {
            if (aA3 == aA4) {
                return m;
            }
            aA3 = aA2;
            aA4 = aA.UP;
        }
        return aA3 == aA4 ? n : j;
    }

    public static boolean a(a a10) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = a10.c(0);
        if (arrm == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public void c(net.minecraft.i.j j2) {
    }

    public static boolean c(d d10) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = M.b(d10);
        if (arrm == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public d b(int n2) {
        return W.a(this.p, n2);
    }

    static {
        n = new int[]{0};
        m = new int[]{2, 1};
        j = new int[]{1};
    }
}

