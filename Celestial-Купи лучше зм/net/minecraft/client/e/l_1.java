/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.client.E;

import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.D.b;
import net.minecraft.J.u;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ah.G;
import net.minecraft.ah.c;
import net.minecraft.ah.e;
import net.minecraft.ah.p;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.at.g;
import net.minecraft.c.f;
import net.minecraft.client.E.h;
import net.minecraft.client.E.j;
import net.minecraft.client.E.m;
import net.minecraft.client.E.n;
import net.minecraft.client.E.o;
import net.minecraft.client.Q;
import net.minecraft.client.e.w;
import net.minecraft.client.e.y;
import net.minecraft.client.u.aT;
import net.minecraft.o.a;
import net.minecraft.u.E;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l
extends z {
    protected /* synthetic */ Set<net.minecraft.k.f> Z;
    private static /* synthetic */ String W;
    private final /* synthetic */ Set<x> T;
    private final /* synthetic */ net.minecraft.client.o.j ab;
    private /* synthetic */ int S;
    private final /* synthetic */ Set<net.minecraft.k.f> V;
    private final /* synthetic */ Set<x> U;
    private /* synthetic */ boolean aa;
    private final /* synthetic */ Q X;
    private /* synthetic */ n Y;
    private /* synthetic */ int R;
    private /* synthetic */ int ac;

    public void a(int n2, int n3, int n4, int n5, Random random, boolean bl2, net.minecraft.k.o o2) {
        block6: {
            block5: {
                net.minecraft.W.K k2;
                int n6;
                int n7;
                int n8;
                block4: {
                    n8 = n2 + this.J.nextInt(n5) - this.J.nextInt(n5);
                    String string = net.minecraft.client.E.l.d();
                    n7 = n3 + this.J.nextInt(n5) - this.J.nextInt(n5);
                    n6 = n4 + this.J.nextInt(n5) - this.J.nextInt(n5);
                    o2.a(n8, n7, n6);
                    i i2 = this.d(o2);
                    k2 = i2.b();
                    if (string != null) break block4;
                    k2.a(i2, (z)this, (net.minecraft.k.n)o2, random);
                    if (!bl2) break block5;
                    k2 = i2.b();
                }
                if (k2 == net.minecraft.u.g.ah) {
                    this.a(aH.BARRIER, (double)((float)n8 + 0.5f), (double)((float)n7 + 0.5f), (double)((float)n6 + 0.5f), 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (net.minecraft.k.m.d()) break block6;
            net.minecraft.client.E.l.a("npayo");
        }
    }

    @Override
    public boolean a(net.minecraft.k.n n2, i i2, int n3) {
        this.aa = this.b();
        boolean bl2 = super.a(n2, i2, n3);
        this.aa = false;
        return bl2;
    }

    @Override
    protected void b(x x2) {
        block3: {
            boolean bl2;
            block4: {
                String string;
                block2: {
                    String string2 = net.minecraft.client.E.l.d();
                    super.b(x2);
                    string = string2;
                    bl2 = this.U.contains(x2);
                    if (string != null) break block2;
                    if (!bl2) break block3;
                    bl2 = x2.aL();
                }
                if (string != null) break block3;
                if (!bl2) break block4;
                this.T.add(x2);
                if (string == null) break block3;
            }
            bl2 = this.U.remove(x2);
        }
    }

    protected void c() {
        block4: {
            int n2;
            String string;
            block6: {
                int n3;
                int n4;
                block7: {
                    n4 = net.minecraft.k.h.f(this.X.s.a / 16.0);
                    n3 = net.minecraft.k.h.f(this.X.s.ax / 16.0);
                    string = net.minecraft.client.E.l.d();
                    n2 = n4;
                    if (string != null) break block6;
                    if (n2 != this.ac) break block7;
                    n2 = n3;
                    if (string != null) break block6;
                    if (n2 == this.R) break block4;
                }
                this.ac = n4;
                this.R = n3;
                this.Z.clear();
                n2 = this.X.ac.bf;
            }
            int n5 = n2;
            this.H.b("buildList");
            int n6 = net.minecraft.k.h.f(this.X.s.a / 16.0);
            int n7 = net.minecraft.k.h.f(this.X.s.ax / 16.0);
            int n8 = -n5;
            while (n8 <= n5) {
                block5: {
                    if (string != null) break block4;
                    for (int i2 = -n5; i2 <= n5; ++i2) {
                        this.Z.add(new net.minecraft.k.f(n8 + n6, i2 + n7));
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block5;
                    }
                    ++n8;
                }
                if (string == null) continue;
            }
            this.H.c();
        }
    }

    public x b(int n2) {
        x x2 = (x)this.w.e(n2);
        String string = net.minecraft.client.E.l.d();
        x x3 = x2;
        if (string == null) {
            if (x3 != null) {
                this.U.remove(x2);
                this.c(x2);
            }
            x3 = x2;
        }
        return x3;
    }

    @Override
    public void L() {
        block6: {
            boolean bl2;
            int n2;
            String string = net.minecraft.client.E.l.d();
            super.L();
            this.a(this.r() + 1L);
            String string2 = string;
            int n3 = this.M().c("doDaylightCycle");
            if (string2 == null) {
                if (n3 != 0) {
                    this.b(this.s() + 1L);
                }
                this.H.b("reEntryProcessing");
                n3 = n2 = 0;
            }
            while (n2 < 10) {
                bl2 = this.T.isEmpty();
                if (string2 == null && string2 == null) {
                    if (bl2) break;
                    x x2 = this.T.iterator().next();
                    this.T.remove(x2);
                    if (string2 == null) {
                        if (!this.O.contains(x2)) {
                            this.f(x2);
                        }
                        ++n2;
                    }
                    if (string2 == null) continue;
                }
                break block6;
            }
            this.H.a("chunkCache");
            bl2 = this.Y.b();
        }
        this.H.a("blocks");
        this.h();
        this.H.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1, int var2_2, int var3_3) {
        block8: {
            block6: {
                block7: {
                    var5_4 = 32;
                    var6_5 = new Random();
                    var7_6 = this.X.s.av();
                    var4_7 = net.minecraft.client.E.l.d();
                    v0 = var7_6;
                    if (var4_7 != null) break block6;
                    if (v0 == null) break block7;
                    v0 = var7_6;
                    if (var4_7 != null || net.minecraft.W.K.a(v0.w()) == net.minecraft.u.g.ah) break block6;
                }
                v0 = var7_6 = this.X.s.b();
            }
            if (this.X.aW.i() != net.minecraft.ah.s.CREATIVE) ** GOTO lbl-1000
            v1 = var7_6;
            if (var4_7 != null) break block8;
            if (v1.G()) ** GOTO lbl-1000
            v1 = var7_6;
        }
        if (v1.w() == net.minecraft.w.k.b(net.minecraft.u.g.ah)) {
            v2 = true;
        } else lbl-1000:
        // 3 sources

        {
            v2 = false;
        }
        var8_8 = v2;
        var9_9 = new net.minecraft.k.o();
        var10_10 = 0;
        do {
            if (var10_10 >= 667) return;
            this.a(var1_1, var2_2, var3_3, 16, var6_5, var8_8, var9_9);
            this.a(var1_1, var2_2, var3_3, 32, var6_5, var8_8, var9_9);
            ++var10_10;
        } while (var4_7 == null);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(long l2) {
        block4: {
            block3: {
                long l3;
                String string;
                block2: {
                    string = net.minecraft.client.E.l.d();
                    l3 = l2;
                    if (string != null) break block2;
                    if (l3 >= 0L) break block3;
                    l3 = -l2;
                }
                l2 = l3;
                this.M().a("doDaylightCycle", "false");
                if (string == null) break block4;
            }
            this.M().a("doDaylightCycle", "true");
        }
        super.b(l2);
    }

    @Override
    public void a(double d10, double d11, double d12, d d13, ay ay2, float f10, float f11, boolean n2) {
        block3: {
            y y2;
            block1: {
                double d14;
                double d15;
                String string;
                block2: {
                    int n3;
                    double d16;
                    block0: {
                        d16 = this.X.Z().a(d10, d11, d12);
                        y2 = new y(d13, ay2, f10, f11, (float)d10, (float)d11, (float)d12);
                        string = net.minecraft.client.E.l.d();
                        n3 = n2;
                        if (string != null) break block0;
                        if (n3 == 0) break block1;
                        d15 = d16;
                        d14 = 100.0;
                        if (string != null) break block2;
                        double d17 = d15 - d14;
                        n3 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                    }
                    if (n3 <= 0) break block1;
                    d15 = Math.sqrt(d16);
                    d14 = 40.0;
                }
                double d18 = d15 / d14;
                this.X.p().a(y2, (int)(d18 * 20.0));
                if (string == null) break block3;
            }
            this.X.p().c(y2);
        }
    }

    static Set a(l l2) {
        return l2.U;
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public boolean a() {
        return this.aa;
    }

    @Override
    public void a(@Nullable net.minecraft.i.j j2, double d10, double d11, double d12, d d13, ay ay2, float f10, float f11) {
        block0: {
            if (j2 != this.X.s) break block0;
            this.a(d10, d11, d12, d13, ay2, f10, f11, false);
        }
    }

    public void a(int n2, int n3, boolean bl2) {
        block4: {
            block2: {
                block3: {
                    String string = net.minecraft.client.E.l.d();
                    if (string != null) break block2;
                    if (!bl2) break block3;
                    this.Y.b(n2, n3);
                    if (string == null) break block4;
                }
                this.Y.a(n2, n3);
            }
            this.a(n2 * 16, 0, n3 * 16, n2 * 16 + 15, 256, n3 * 16 + 15);
        }
    }

    @Override
    protected void g(x x2) {
        super.g(x2);
        this.T.remove(x2);
    }

    @Override
    @Nullable
    public x a(int n2) {
        return n2 == this.X.s.W() ? this.X.s : super.a(n2);
    }

    @Override
    protected void h() {
        String string = net.minecraft.client.E.l.d();
        this.c();
        String string2 = string;
        int n2 = this.S--;
        if (string2 == null) {
            if (n2 > 0) {
                // empty if block
            }
            this.V.retainAll(this.Z);
            n2 = this.V.size();
        }
        if (string2 == null) {
            if (n2 == this.Z.size()) {
                this.V.clear();
            }
            n2 = 0;
        }
        int n3 = n2;
        for (net.minecraft.k.f f10 : this.Z) {
            block10: {
                int n4;
                block9: {
                    n4 = this.V.contains(f10);
                    if (string2 != null) break block9;
                    if (n4 != 0) break block10;
                    n4 = f10.c * 16;
                }
                int n5 = n4;
                int n6 = f10.b * 16;
                this.H.b("getChunk");
                a a10 = this.b(f10.c, f10.b);
                this.a(n5, n6, a10);
                this.H.c();
                this.V.add(f10);
                if (++n3 >= 10) {
                    return;
                }
            }
            if (string2 == null) continue;
        }
    }

    @Override
    public void a(double d10, double d11, double d12, double d13, double d14, double d15, @Nullable r r2) {
        this.X.au.a(new aT(this, d10, d11, d12, d13, d14, d15, this.X.au, r2));
    }

    @Override
    public void N() {
        this.ab.e().a(new g("Quitting"));
    }

    static Set b(l l2) {
        return l2.T;
    }

    public l(net.minecraft.client.o.j j2, net.minecraft.ah.K k2, int n2, e e10, net.minecraft.aq.b b10) {
        String string;
        block5: {
            h h2;
            block6: {
                block4: {
                    super(new net.minecraft.aw.g(), new net.minecraft.aw.w(k2, "MpServer"), net.minecraft.client.E.l.a(n2), b10, true);
                    this.U = Sets.newHashSet();
                    this.T = Sets.newHashSet();
                    this.X = net.minecraft.client.Q.P();
                    this.V = Sets.newHashSet();
                    this.ac = Integer.MIN_VALUE;
                    this.R = Integer.MIN_VALUE;
                    this.aa = false;
                    this.S = this.J.nextInt(12000);
                    this.Z = Sets.newHashSet();
                    this.ab = j2;
                    String string2 = net.minecraft.client.E.l.d();
                    this.b().a(e10);
                    this.D.a(this);
                    this.r(new net.minecraft.k.n(8, 64, 8));
                    this.Q = this.A();
                    string = string2;
                    this.E = new net.minecraft.aw.l();
                    this.p();
                    this.o();
                    cq.d(this, cq.aE, new Object[0]);
                    cq.b(cq.bv, this);
                    h2 = this.X.aW;
                    if (string != null) break block4;
                    if (h2 == null) break block5;
                    h2 = this.X.aW;
                }
                if (string != null) break block6;
                if (h2.getClass() != h.class) break block5;
                h2 = this.X.aW = new ep(this.X, j2);
            }
            eO.a((ep)h2);
        }
        if (string != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(int n2, int n3, boolean bl2) {
        String string = net.minecraft.client.E.l.d();
        boolean bl3 = bl2;
        if (string != null) return bl3;
        if (bl3) return true;
        bl3 = ((n)this.f()).a(n2, n3).y();
        if (string != null) return bl3;
        if (bl3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static G a(int n2) {
        G g10;
        String string = net.minecraft.client.E.l.d();
        int n3 = cq.W.b();
        if (string == null) {
            if (n3 != 0) {
                g10 = (G)cq.d(cq.W, n2);
                return g10;
            }
            n3 = n2;
        }
        g10 = net.minecraft.ah.p.a(n3).c();
        return g10;
    }

    public void a(b b10) {
        this.A = b10;
    }

    @Deprecated
    public boolean b(net.minecraft.k.n n2, i i2) {
        int n3 = n2.e();
        int n4 = n2.b();
        int n5 = n2.a();
        this.b(n3, n4, n5, n3, n4, n5);
        return super.a(n2, i2, 3);
    }

    @Override
    public void a(K<?> k2) {
        this.ab.a(k2);
    }

    public static String d() {
        return W;
    }

    @Override
    public void c(x x2) {
        super.c(x2);
        this.U.remove(x2);
    }

    public void a(net.minecraft.k.n n2, d d10, ay ay2, float f10, float f11, boolean bl2) {
        this.a((double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5, d10, ay2, f10, f11, bl2);
    }

    @Override
    public net.minecraft.c.l a(f f10) {
        net.minecraft.c.l l2 = super.a(f10);
        l2.a("Forced entities", new j(this));
        l2.a("Retry entities", new o(this));
        l2.a("Server brand", new m(this));
        l2.a("Server type", new net.minecraft.client.E.f(this));
        return l2;
    }

    public void e() {
        int n2;
        x x2;
        String string;
        int n3;
        block21: {
            block20: {
                int n4;
                String string2 = net.minecraft.client.E.l.d();
                this.O.removeAll(this.t);
                n3 = 0;
                string = string2;
                while (n3 < this.t.size()) {
                    block22: {
                        block23: {
                            int n5;
                            int n6;
                            l l2;
                            block24: {
                                x2 = (x)this.t.get(n3);
                                int n7 = x2.v;
                                n2 = x2.y;
                                if (string != null) break block22;
                                n4 = x2.D ? 1 : 0;
                                if (string != null) break block20;
                                if (n4 == 0) break block23;
                                l2 = this;
                                n6 = n7;
                                n5 = n2;
                                if (string != null) break block24;
                                if (!l2.a(n6, n5, true)) break block23;
                                l2 = this;
                                n6 = n7;
                                n5 = n2;
                            }
                            l2.b(n6, n5).b(x2);
                        }
                        ++n3;
                    }
                    if (string == null) continue;
                }
                n4 = n3 = 0;
            }
            while (n3 < this.t.size()) {
                this.b((x)this.t.get(n3));
                ++n3;
                if (string == null) {
                    if (string == null) continue;
                }
                break block21;
            }
            this.t.clear();
        }
        for (n3 = 0; n3 < this.O.size(); ++n3) {
            l l3;
            block27: {
                block25: {
                    x x3;
                    block26: {
                        x x4;
                        x2 = (x)this.O.get(n3);
                        x x5 = x4 = x2.as();
                        if (string == null) {
                            if (x5 != null) {
                                x x6 = x4;
                                if (string == null) {
                                    if (!x6.P) {
                                        x6 = x4;
                                        if (string == null) {
                                            if (x6.l(x2) && string == null) continue;
                                        }
                                    } else {
                                        x6 = x2;
                                    }
                                }
                                x6.aO();
                            }
                            x5 = x2;
                        }
                        int n8 = x5.P;
                        if (string == null) {
                            if (n8 == 0) continue;
                            n8 = x2.v;
                        }
                        n2 = n8;
                        int n9 = x2.y;
                        x3 = x2;
                        if (string != null) break block25;
                        if (!x3.D) break block26;
                        l3 = this;
                        if (string != null) break block27;
                        if (l3.a(n2, n9, true)) {
                            this.b(n2, n9).b(x2);
                        }
                    }
                    x3 = this.O.remove(n3--);
                }
                l3 = this;
            }
            l3.b(x2);
            if (string == null) continue;
        }
    }

    static Q c(l l2) {
        return l2.X;
    }

    private boolean b() {
        String string = net.minecraft.client.E.l.d();
        boolean bl2 = this.X.aW instanceof ep;
        if (string == null) {
            if (bl2) {
                ep ep2 = (ep)this.X.aW;
                return ep2.d();
            }
            bl2 = false;
        }
        return bl2;
    }

    static {
        if (net.minecraft.client.E.l.d() != null) {
            net.minecraft.client.E.l.a("j2Us1");
        }
    }

    @Override
    protected void S() {
    }

    @Override
    public n f() {
        return (n)super.f();
    }

    @Override
    protected net.minecraft.o.k A() {
        this.Y = new n(this);
        return this.Y;
    }

    public static void a(String string) {
        W = string;
    }

    public void a(int n2, x x2) {
        x x3 = this.a(n2);
        String string = net.minecraft.client.E.l.d();
        x x4 = x3;
        if (string == null) {
            if (x4 != null) {
                this.c(x3);
            }
            this.U.add(x2);
            x4 = x2;
        }
        x4.g(n2);
        l l2 = this;
        if (string == null) {
            if (!l2.f(x2)) {
                this.T.add(x2);
            }
            l2 = this;
        }
        l2.w.a(n2, x2);
    }

    @Override
    public boolean f(x x2) {
        boolean bl2;
        block4: {
            boolean bl3;
            block2: {
                boolean bl4;
                block3: {
                    String string = net.minecraft.client.E.l.d();
                    bl3 = super.f(x2);
                    this.U.add(x2);
                    String string2 = string;
                    bl4 = bl3;
                    if (string2 != null) break block2;
                    if (!bl4) break block3;
                    bl2 = x2 instanceof u;
                    if (string2 != null) break block4;
                    if (!bl2) break block2;
                    this.X.p().c(new w((u)x2));
                    if (string2 == null) break block2;
                }
                bl4 = this.T.add(x2);
            }
            bl2 = bl3;
        }
        return bl2;
    }

    @Override
    public int a(net.minecraft.k.n n2, int n3) {
        int n4 = super.a(n2, n3);
        String string = net.minecraft.client.E.l.d();
        int n5 = fU.bi();
        if (string == null) {
            if (n5 != 0) {
                n4 = gk.a(n2, n4);
            }
            n5 = n4;
        }
        return n5;
    }

    @Override
    protected void a(int n2, int n3, a a10) {
        block16: {
            block25: {
                l l2;
                int n4;
                int n5;
                int n6;
                int n7;
                block24: {
                    String string;
                    block23: {
                        double d10;
                        block21: {
                            double d11;
                            net.minecraft.client.q.c c10;
                            block22: {
                                int n8;
                                int n9;
                                block19: {
                                    block20: {
                                        block18: {
                                            block17: {
                                                l l3;
                                                block15: {
                                                    String string2 = net.minecraft.client.E.l.d();
                                                    super.a(n2, n3, a10);
                                                    string = string2;
                                                    l3 = this;
                                                    if (string != null) break block15;
                                                    if (l3.S != 0) break block16;
                                                    l3 = this;
                                                }
                                                net.minecraft.client.q.c c11 = c10 = l3.X.s;
                                                if (string == null) {
                                                    if (c11 == null) {
                                                        return;
                                                    }
                                                    c11 = c10;
                                                }
                                                n9 = Math.abs(c11.v - a10.t);
                                                n8 = 1;
                                                if (string != null) break block17;
                                                if (n9 > n8) break block18;
                                                n9 = Math.abs(c10.y - a10.i);
                                                n8 = 1;
                                            }
                                            if (string != null) break block19;
                                            if (n9 <= n8) break block20;
                                        }
                                        return;
                                    }
                                    n9 = this.r = this.r * 3 + 1013904223;
                                    n8 = 2;
                                }
                                int n10 = n9 >> n8;
                                n7 = n10 & 0xF;
                                n6 = n10 >> 8 & 0xF;
                                n5 = n10 >> 16 & 0xFF;
                                n5 /= 2;
                                double d12 = c10.aF - 160.0;
                                d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                                if (string != null) break block21;
                                if (d10 <= 0) break block22;
                                n5 += 128;
                                if (string == null) break block23;
                            }
                            d10 = (d11 = c10.aF - 96.0) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        }
                        if (d10 > 0) {
                            n5 += 64;
                        }
                    }
                    net.minecraft.k.n n11 = new net.minecraft.k.n(n7 + n2, n5, n6 + n3);
                    i i2 = a10.c(n11);
                    double d13 = this.X.s.a((double)(n7 += n2) + 0.5, (double)n5 + 0.5, (double)(n6 += n3) + 0.5);
                    double d14 = d13 - 4.0;
                    double d15 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                    if (string == null) {
                        if (d15 < 0) {
                            return;
                        }
                        double d16 = d13 - 255.0;
                        d15 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                    }
                    if (d15 > 0) {
                        return;
                    }
                    if (i2.o() != net.minecraft.ac.c.A) break block16;
                    n4 = this.l(n11);
                    if (string != null) break block24;
                    if (n4 > this.J.nextInt(8)) break block16;
                    l2 = this;
                    if (string != null) break block25;
                    n4 = l2.a(c.SKY, n11);
                }
                if (n4 > 0) break block16;
                this.a((double)n7 + 0.5, (double)n5 + 0.5, (double)n6 + 0.5, net.minecraft.u.E.gD, ay.AMBIENT, 0.7f, 0.8f + this.J.nextFloat() * 0.2f, false);
                l2 = this;
            }
            l2.S = this.J.nextInt(12000) + 6000;
        }
    }
}

