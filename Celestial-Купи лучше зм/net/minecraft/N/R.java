/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.u;
import net.minecraft.J.t;
import net.minecraft.N.N;
import net.minecraft.N.O;
import net.minecraft.N.j;
import net.minecraft.N.s;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.ag;
import net.minecraft.W.az;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.ar.e;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class R
extends N
implements s,
ao {
    private /* synthetic */ long o;
    private /* synthetic */ int n;
    private /* synthetic */ a2<d> m;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(a a10, d d10, int n2, aA aA2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = a10 instanceof net.minecraft.B.k;
        if (arrm != null) return bl2;
        if (!bl2) return true;
        bl2 = ((net.minecraft.B.k)a10).a(n2, d10, aA2);
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private boolean i() {
        boolean bl2;
        block3: {
            Iterator iterator = this.m.iterator();
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

    @Override
    public d a(int n2, int n3) {
        this.a((net.minecraft.i.j)null);
        d d10 = W.a(this.a(), n2, n3);
        return d10;
    }

    public static a a(z z2, double d10, double d11, double d12) {
        a a10;
        block8: {
            a a11;
            block9: {
                Object object;
                block10: {
                    Object object2;
                    m[] arrm;
                    block6: {
                        block4: {
                            K k2;
                            n n2;
                            block7: {
                                y y2;
                                K k3;
                                block5: {
                                    a11 = null;
                                    int n3 = h.f(d10);
                                    int n4 = h.f(d11);
                                    arrm = net.minecraft.N.j.f();
                                    int n5 = h.f(d12);
                                    n2 = new n(n3, n4, n5);
                                    k3 = z2.d(n2).b();
                                    if (!k3.e()) break block4;
                                    object2 = z2.b(n2);
                                    y2 = object2;
                                    if (arrm != null) break block5;
                                    if (!(y2 instanceof a)) break block4;
                                    y2 = object2;
                                }
                                a10 = a11 = (a)((Object)y2);
                                if (arrm != null) break block6;
                                if (!(a10 instanceof O)) break block4;
                                k2 = k3;
                                if (arrm != null) break block7;
                                if (!(k2 instanceof az)) break block4;
                                k2 = k3;
                            }
                            a11 = ((az)k2).a(z2, n2, true);
                        }
                        a10 = a11;
                    }
                    if (arrm != null) break block8;
                    if (a10 != null) break block9;
                    object = object2 = z2.a((x)null, new k(d10 - 0.5, d11 - 0.5, d12 - 0.5, d10 + 0.5, d11 + 0.5, d12 + 0.5), (Predicate<? super x>)e.c);
                    if (arrm != null) break block10;
                    if (object.isEmpty()) break block9;
                    object = object2.get(z2.J.nextInt(object2.size()));
                }
                a11 = (a)object;
            }
            a10 = a11;
        }
        return a10;
    }

    @Override
    public r a(r r2) {
        r r3;
        block6: {
            boolean bl2;
            block5: {
                m[] arrm = net.minecraft.N.j.f();
                super.a(r2);
                m[] arrm2 = arrm;
                bl2 = this.b(r2);
                if (arrm2 != null) break block5;
                if (!bl2) {
                    W.b(r2, this.m);
                }
                r3 = r2;
                if (arrm2 != null) break block6;
                r3.b("TransferCooldown", this.n);
                bl2 = this.g();
            }
            if (bl2) {
                r2.a("CustomName", this.j);
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public net.minecraft.B.n a(net.minecraft.i.h h2, net.minecraft.i.j j2) {
        this.a(j2);
        return new u(h2, this, j2);
    }

    /*
     * Exception decompiling
     */
    private boolean k() {
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
    public boolean f() {
        return this.i();
    }

    private a j() {
        aA aA2 = ag.b(this.m());
        return R.a(this.d(), this.e() + (double)aA2.r(), this.b() + (double)aA2.p(), this.a() + (double)aA2.i());
    }

    private boolean l() {
        boolean bl2;
        block7: {
            int n2;
            a a10 = this.j();
            m[] arrm = net.minecraft.N.j.f();
            if (a10 == null) {
                return false;
            }
            aA aA2 = ag.b(this.m()).h();
            int n3 = this.b(a10, aA2);
            if (arrm == null) {
                if (n3 != 0) {
                    return false;
                }
                n3 = n2 = 0;
            }
            while (n2 < this.e()) {
                block9: {
                    d d10;
                    block11: {
                        boolean bl3;
                        block10: {
                            d d11;
                            block8: {
                                d11 = this.a(n2);
                                if (arrm != null) break block8;
                                bl2 = d11.G();
                                if (arrm != null) break block7;
                                if (bl2) break block9;
                                d11 = this.a(n2).C();
                            }
                            d10 = d11;
                            d d12 = R.a((a)this, a10, this.a(n2, 1), aA2);
                            bl3 = d12.G();
                            if (arrm != null) break block10;
                            if (!bl3) break block11;
                            a10.b();
                            bl3 = true;
                        }
                        return bl3;
                    }
                    this.a(n2, d10);
                }
                ++n2;
                if (arrm == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new net.minecraft.x.d(R.class, "Items"));
    }

    @Override
    public double e() {
        return (double)this.d.e() + 0.5;
    }

    public static a b(s s2) {
        return R.a(s2.d(), s2.e(), s2.b() + 1.0, s2.a());
    }

    public static List<t> b(z z2, double d10, double d11, double d12) {
        return z2.a(t.class, new k(d10 - 0.5, d11, d12 - 0.5, d10 + 0.5, d11 + 1.5, d12 + 0.5), e.b);
    }

    private boolean o() {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = this.n;
        if (arrm == null) {
            bl2 = bl2 > BADBOOL 8;
        }
        return bl2;
    }

    private static boolean a(s s2, a a10, int n2, aA aA2) {
        boolean bl2;
        block2: {
            block3: {
                d d10;
                block5: {
                    boolean bl3;
                    block4: {
                        d d11 = a10.a(n2);
                        m[] arrm = net.minecraft.N.j.f();
                        bl2 = d11.G();
                        if (arrm != null) break block2;
                        if (bl2) break block3;
                        bl2 = R.a(a10, d11, n2, aA2);
                        if (arrm != null) break block2;
                        if (!bl2) break block3;
                        d10 = d11.C();
                        d d12 = R.a(a10, (a)s2, a10.a(n2, 1), null);
                        bl3 = d12.G();
                        if (arrm != null) break block4;
                        if (!bl3) break block5;
                        a10.b();
                        bl3 = true;
                    }
                    return bl3;
                }
                a10.a(n2, d10);
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void c() {
        block5: {
            boolean bl2;
            m[] arrm;
            block6: {
                z z2;
                block4: {
                    arrm = net.minecraft.N.j.f();
                    z2 = this.a;
                    if (arrm != null) break block4;
                    if (z2 == null) break block5;
                    z2 = this.a;
                }
                bl2 = z2.C;
                if (arrm != null) break block6;
                if (bl2) break block5;
                --this.n;
                this.o = this.a.r();
                bl2 = this.m();
            }
            if (arrm == null && !bl2) {
                this.a(0);
                bl2 = this.k();
            }
        }
    }

    @Override
    public double b() {
        return (double)this.d.b() + 0.5;
    }

    public R() {
        this.m = a2.a(5, net.minecraft.w.d.m);
        this.n = -1;
    }

    private boolean m() {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = this.n;
        if (arrm == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public void c(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.c(r2);
        this.m = a2.a(this.e(), net.minecraft.w.d.m);
        m[] arrm2 = arrm;
        boolean bl2 = this.a(r2);
        if (arrm2 == null) {
            if (!bl2) {
                W.a(r2, this.m);
            }
            bl2 = r2.a("CustomName", 8);
        }
        if (bl2) {
            this.j = r2.j("CustomName");
        }
        this.n = r2.m("TransferCooldown");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static d a(a a10, a a11, d d10, int n2, aA aA2) {
        block10: {
            a a12;
            block18: {
                block17: {
                    R r2;
                    int n3;
                    block22: {
                        R r3;
                        block20: {
                            a a13;
                            m[] arrm;
                            block21: {
                                block19: {
                                    int n4;
                                    block16: {
                                        block15: {
                                            int n5;
                                            block14: {
                                                int n6;
                                                block13: {
                                                    d d11;
                                                    block11: {
                                                        block12: {
                                                            int n7;
                                                            block9: {
                                                                d11 = a11.a(n2);
                                                                arrm = net.minecraft.N.j.f();
                                                                n7 = R.b(a11, d10, n2, aA2);
                                                                if (arrm != null) break block9;
                                                                if (n7 == 0) break block10;
                                                                n7 = 0;
                                                            }
                                                            n6 = n7;
                                                            n5 = a11.f();
                                                            n4 = d11.G();
                                                            if (arrm != null) break block11;
                                                            if (n4 == 0) break block12;
                                                            a11.a(n2, d10);
                                                            d10 = net.minecraft.w.d.m;
                                                            n6 = 1;
                                                            if (arrm == null) break block13;
                                                        }
                                                        n4 = R.a(d11, d10);
                                                    }
                                                    if (arrm != null) break block14;
                                                    if (n4 != 0) {
                                                        int n8 = d10.f() - d11.t();
                                                        n3 = Math.min(d10.t(), n8);
                                                        d10.b(n3);
                                                        d11.g(n3);
                                                        int n9 = n3;
                                                        if (arrm == null) {
                                                            n9 = n9 > 0 ? 1 : 0;
                                                        }
                                                        n6 = n9;
                                                    }
                                                }
                                                n4 = n6;
                                            }
                                            if (arrm != null) break block15;
                                            if (n4 == 0) break block10;
                                            n4 = n5;
                                        }
                                        if (arrm != null) break block16;
                                        if (n4 == 0) break block17;
                                        a12 = a11;
                                        if (arrm != null) break block18;
                                        n4 = a12 instanceof R;
                                    }
                                    if (n4 == 0) break block17;
                                    r3 = (R)a11;
                                    a12 = r3;
                                    if (arrm != null) break block18;
                                    if (super.o()) break block17;
                                    n3 = 0;
                                    a13 = a10;
                                    if (arrm != null) break block19;
                                    if (a13 == null) break block20;
                                    a13 = a10;
                                }
                                if (arrm != null) break block21;
                                if (!(a13 instanceof R)) break block20;
                                a13 = a10;
                            }
                            R r4 = (R)a13;
                            r2 = r3;
                            if (arrm != null) break block22;
                            if (r2.o >= r4.o) {
                                n3 = 1;
                            }
                        }
                        r2 = r3;
                    }
                    r2.a(8 - n3);
                }
                a12 = a11;
            }
            a12.b();
        }
        return d10;
    }

    public static boolean a(a a10, a a11, t t2) {
        boolean bl2;
        block4: {
            d d10;
            block3: {
                boolean bl3;
                m[] arrm;
                block2: {
                    bl2 = false;
                    arrm = net.minecraft.N.j.f();
                    t t3 = t2;
                    if (arrm == null) {
                        if (t3 == null) {
                            return false;
                        }
                        t3 = t2;
                    }
                    d d11 = t3.m().C();
                    d10 = R.a(a10, a11, d11, null);
                    bl3 = d10.G();
                    if (arrm != null) break block2;
                    if (!bl3) break block3;
                    bl3 = true;
                }
                bl2 = bl3;
                t2.a();
                if (arrm == null) break block4;
            }
            t2.a(d10);
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static d a(a a10, a a11, d d10, @Nullable aA aA2) {
        d d11;
        block8: {
            int n2;
            m[] arrm;
            block6: {
                block7: {
                    arrm = net.minecraft.N.j.f();
                    n2 = a11 instanceof net.minecraft.B.k;
                    if (arrm != null) break block6;
                    if (n2 == 0 || aA2 == null) break block7;
                    net.minecraft.B.k k2 = (net.minecraft.B.k)a11;
                    int[] arrn = k2.a(aA2);
                    for (int i2 = 0; i2 < arrn.length; ++i2) {
                        d d12;
                        d11 = d10;
                        if (arrm != null) return d11;
                        if (arrm == null) {
                            if (d11.G()) break;
                            d12 = R.a(a10, a11, d10, arrn[i2], aA2);
                        }
                        d10 = d12;
                        if (arrm == null) continue;
                    }
                    if (arrm == null) break block8;
                }
                n2 = a11.e();
            }
            int n3 = n2;
            for (int i3 = 0; i3 < n3; ++i3) {
                d11 = d10;
                if (arrm != null || arrm != null) return d11;
                if (d11.G()) break;
                d10 = R.a(a10, a11, d10, i3, aA2);
                if (arrm == null) continue;
            }
        }
        d11 = d10;
        return d11;
    }

    private void a(int n2) {
        this.n = n2;
    }

    private boolean p() {
        boolean bl2;
        block3: {
            Iterator iterator = this.m.iterator();
            m[] arrm = net.minecraft.N.j.f();
            while (iterator.hasNext()) {
                block6: {
                    int n2;
                    block4: {
                        block5: {
                            d d10 = (d)iterator.next();
                            bl2 = d10.G();
                            if (arrm != null) break block3;
                            if (arrm != null) break block4;
                            if (bl2) break block5;
                            n2 = d10.t();
                            if (arrm != null) break block4;
                            if (n2 == d10.f()) break block6;
                        }
                        n2 = 0;
                    }
                    return n2 != 0;
                }
                if (arrm == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean b(a a10, d d10, int n2, aA aA2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = a10.b(n2, d10);
        if (arrm == null) {
            if (!bl2) {
                return false;
            }
            bl2 = a10 instanceof net.minecraft.B.k;
        }
        if (arrm != null) return bl2;
        if (!bl2) return true;
        bl2 = ((net.minecraft.B.k)a10).b(n2, d10, aA2);
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected a2<d> a() {
        return this.m;
    }

    @Override
    public int e() {
        return this.m.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        R r2 = this;
        if (arrm == null) {
            if (!r2.g()) return "container.hopper";
            r2 = this;
        }
        String string = r2.j;
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(a a10, aA aA2) {
        boolean bl2;
        m[] arrm = net.minecraft.N.j.f();
        int n2 = a10 instanceof net.minecraft.B.k;
        if (arrm == null) {
            if (n2 != 0) {
                int[] arrn;
                net.minecraft.B.k k2 = (net.minecraft.B.k)a10;
                int[] arrn2 = arrn = k2.a(aA2);
                int n3 = arrn2.length;
                int n4 = 0;
                while (n4 < n3) {
                    int n5 = arrn2[n4];
                    if (arrm == null) {
                        bl2 = k2.a(n5).G();
                        if (arrm != null) return bl2;
                        if (!bl2) {
                            return false;
                        }
                        ++n4;
                    }
                    if (arrm == null) continue;
                }
                if (arrm == null) return true;
            }
            n2 = a10.e();
        }
        int n6 = n2;
        int n7 = 0;
        do {
            if (n7 >= n6) return true;
            bl2 = a10.a(n7).G();
            if (arrm != null) return bl2;
            if (arrm != null) boolean bl3;
            return bl3;
            if (!bl2) {
                return false;
            }
            ++n7;
        } while (arrm == null);
        return true;
    }

    public static boolean a(s s2) {
        boolean bl2;
        block18: {
            block23: {
                m[] arrm;
                block19: {
                    block22: {
                        int n2;
                        aA aA2;
                        a a10;
                        block20: {
                            block21: {
                                int[] arrn;
                                a10 = R.b(s2);
                                arrm = net.minecraft.N.j.f();
                                if (a10 == null) break block19;
                                aA2 = aA.DOWN;
                                n2 = R.a(a10, aA2);
                                if (arrm == null) {
                                    if (n2 != 0) {
                                        return false;
                                    }
                                    n2 = a10 instanceof net.minecraft.B.k;
                                }
                                if (arrm != null) break block20;
                                if (n2 == 0) break block21;
                                net.minecraft.B.k object = (net.minecraft.B.k)a10;
                                int[] arrn2 = arrn = object.a(aA2);
                                int n3 = arrn2.length;
                                int n4 = 0;
                                while (n4 < n3) {
                                    int n5 = arrn2[n4];
                                    if (arrm == null) {
                                        bl2 = R.a(s2, a10, n5, aA2);
                                        if (arrm != null) break block18;
                                        if (bl2) {
                                            return true;
                                        }
                                        ++n4;
                                    }
                                    if (arrm == null) continue;
                                }
                                if (arrm == null) break block22;
                            }
                            n2 = a10.e();
                        }
                        int n6 = n2;
                        for (int i2 = 0; i2 < n6; ++i2) {
                            bl2 = R.a(s2, a10, i2, aA2);
                            if (arrm == null) {
                                boolean bl3;
                                if (arrm == null) {
                                    if (!bl2) continue;
                                    bl3 = true;
                                }
                                return bl3;
                            }
                            break block18;
                        }
                    }
                    if (arrm == null) break block23;
                }
                for (t t2 : R.b(s2.d(), s2.e(), s2.b(), s2.a())) {
                    block25: {
                        boolean bl4;
                        block24: {
                            bl2 = R.a(null, s2, t2);
                            if (arrm != null) break block18;
                            if (arrm != null) break block24;
                            if (!bl2) break block25;
                            bl4 = true;
                        }
                        return bl4;
                    }
                    if (arrm == null) continue;
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public double a() {
        return (double)this.d.a() + 0.5;
    }

    private static boolean a(d d10, d d11) {
        int n2;
        block8: {
            int n3;
            block7: {
                m[] arrm = net.minecraft.N.j.f();
                d d12 = d10;
                if (arrm == null) {
                    if (d12.w() != d11.w()) {
                        return false;
                    }
                    d12 = d10;
                }
                n2 = d12.d();
                n3 = d11.d();
                if (arrm != null) break block7;
                if (n2 != n3) {
                    return false;
                }
                n2 = d10.t();
                if (arrm != null) break block8;
                n3 = d10.f();
            }
            if (n2 > n3) {
                return false;
            }
            n2 = net.minecraft.w.d.b(d10, d11) ? 1 : 0;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(a a10, aA aA2) {
        boolean bl2;
        m[] arrm = net.minecraft.N.j.f();
        int n2 = a10 instanceof net.minecraft.B.k;
        if (arrm == null) {
            if (n2 != 0) {
                net.minecraft.B.k k2 = (net.minecraft.B.k)a10;
                int[] arrn = k2.a(aA2);
                for (Object object : (d)arrn) {
                    int n3;
                    d d10 = k2.a((int)object);
                    bl2 = d10.G();
                    if (arrm != null) return bl2;
                    if (arrm != null) return n3 != 0;
                    if (bl2) return 0 != 0;
                    n3 = d10.t();
                    if (arrm != null) return n3 != 0;
                    if (n3 == d10.f()) continue;
                    return 0 != 0;
                }
                if (arrm == null) return true;
            }
            n2 = a10.e();
        }
        int n4 = n2;
        int n5 = 0;
        do {
            int n6;
            if (n5 >= n4) return true;
            d d11 = a10.a(n5);
            bl2 = d11.G();
            if (arrm != null) return bl2;
            if (arrm != null) return n6 != 0;
            if (bl2) return 0 != 0;
            n6 = d11.t();
            if (arrm != null) return n6 != 0;
            if (n6 != d11.f()) {
                return 0 != 0;
            }
            ++n5;
        } while (arrm == null);
        return true;
    }

    @Override
    public String a() {
        return "minecraft:hopper";
    }

    @Override
    public void a(int n2, d d10) {
        block3: {
            d d11;
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                this.a((net.minecraft.i.j)null);
                m[] arrm2 = arrm;
                this.a().set(n2, d10);
                d11 = d10;
                if (arrm2 != null) break block2;
                if (d11.t() <= this.c()) break block3;
                d11 = d10;
            }
            d11.c(this.c());
        }
    }

    @Override
    public int c() {
        return 64;
    }
}

