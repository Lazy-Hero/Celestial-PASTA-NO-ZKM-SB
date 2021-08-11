/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.a2;
import net.minecraft.T.a3;
import net.minecraft.T.a4;
import net.minecraft.T.a5;
import net.minecraft.T.aD;
import net.minecraft.T.aF;
import net.minecraft.T.aH;
import net.minecraft.T.aN;
import net.minecraft.T.aO;
import net.minecraft.T.aR;
import net.minecraft.T.aS;
import net.minecraft.T.aT;
import net.minecraft.T.aW;
import net.minecraft.T.aZ;
import net.minecraft.T.a_;
import net.minecraft.T.ab;
import net.minecraft.T.ad;
import net.minecraft.T.ag;
import net.minecraft.T.ah;
import net.minecraft.T.ai;
import net.minecraft.T.ak;
import net.minecraft.T.am;
import net.minecraft.T.ao;
import net.minecraft.T.aq;
import net.minecraft.U.B;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.b2;
import net.minecraft.W.bf;
import net.minecraft.Z.i;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.T;
import net.minecraft.ag.V;
import net.minecraft.ag.a;
import net.minecraft.ag.v;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.P;
import net.minecraft.ak.W;
import net.minecraft.ak.aC;
import net.minecraft.ak.aa;
import net.minecraft.ak.e;
import net.minecraft.ak.w;
import net.minecraft.ar.G;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.h.c;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.g;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U
extends T
implements v {
    private static final /* synthetic */ net.minecraft.q.r<Integer> cU;
    public /* synthetic */ float cS;
    private static final /* synthetic */ k cM;
    private static final /* synthetic */ Predicate<net.minecraft.U.C> cP;
    public /* synthetic */ float cQ;
    public /* synthetic */ float cR;
    private static final /* synthetic */ Int2ObjectMap<d> cT;
    private /* synthetic */ boolean cL;
    private static final /* synthetic */ Set<k> cN;
    private /* synthetic */ n cO;
    public /* synthetic */ float cV;
    public /* synthetic */ float cW;

    @Override
    protected void D() {
        super.D();
        this.ao().b(net.minecraft.U.M.c);
        this.a(net.minecraft.U.M.f).a(6.0);
        this.a(net.minecraft.U.M.c).a(0.4f);
        this.a(net.minecraft.U.M.d).a(0.2f);
    }

    static {
        cU = net.minecraft.q.m.a(U.class, net.minecraft.q.h.n);
        cP = new a();
        cM = net.minecraft.u.h.ae;
        cN = Sets.newHashSet((Object[])new k[]{net.minecraft.u.h.a6, net.minecraft.u.h.bu, net.minecraft.u.h.bJ, net.minecraft.u.h.bR});
        cT = new Int2ObjectOpenHashMap(32);
        cT.put(net.minecraft.U.h.a.c(aW.class), (Object)net.minecraft.u.E.g);
        cT.put(net.minecraft.U.h.a.c(ab.class), (Object)net.minecraft.u.E.da);
        cT.put(net.minecraft.U.h.a.c(aR.class), (Object)net.minecraft.u.E.at);
        cT.put(net.minecraft.U.h.a.c(a_.class), (Object)net.minecraft.u.E.fx);
        cT.put(net.minecraft.U.h.a.c(net.minecraft.h.d.class), (Object)net.minecraft.u.E.bs);
        cT.put(net.minecraft.U.h.a.c(ah.class), (Object)net.minecraft.u.E.ay);
        cT.put(net.minecraft.U.h.a.c(aq.class), (Object)net.minecraft.u.E.bi);
        cT.put(net.minecraft.U.h.a.c(ao.class), (Object)net.minecraft.u.E.h4);
        cT.put(net.minecraft.U.h.a.c(aZ.class), (Object)net.minecraft.u.E.cg);
        cT.put(net.minecraft.U.h.a.c(aO.class), (Object)net.minecraft.u.E.hb);
        cT.put(net.minecraft.U.h.a.c(aD.class), (Object)net.minecraft.u.E.dg);
        cT.put(net.minecraft.U.h.a.c(ad.class), (Object)net.minecraft.u.E.dk);
        cT.put(net.minecraft.U.h.a.c(aN.class), (Object)net.minecraft.u.E.au);
        cT.put(net.minecraft.U.h.a.c(aH.class), (Object)net.minecraft.u.E.ag);
        cT.put(net.minecraft.U.h.a.c(aF.class), (Object)net.minecraft.u.E.c3);
        cT.put(net.minecraft.U.h.a.c(a3.class), (Object)net.minecraft.u.E.w);
        cT.put(net.minecraft.U.h.a.c(net.minecraft.T.ay.class), (Object)net.minecraft.u.E.cB);
        cT.put(net.minecraft.U.h.a.c(ai.class), (Object)net.minecraft.u.E.fs);
        cT.put(net.minecraft.U.h.a.c(am.class), (Object)net.minecraft.u.E.da);
        cT.put(net.minecraft.U.h.a.c(ak.class), (Object)net.minecraft.u.E.cs);
        cT.put(net.minecraft.U.h.a.c(aS.class), (Object)net.minecraft.u.E.b2);
        cT.put(net.minecraft.U.h.a.c(aT.class), (Object)net.minecraft.u.E.c);
        cT.put(net.minecraft.U.h.a.c(a5.class), (Object)net.minecraft.u.E.hO);
        cT.put(net.minecraft.U.h.a.c(c.class), (Object)net.minecraft.u.E.ff);
        cT.put(net.minecraft.U.h.a.c(a2.class), (Object)net.minecraft.u.E.hB);
        cT.put(net.minecraft.U.h.a.c(V.class), (Object)net.minecraft.u.E.hy);
        cT.put(net.minecraft.U.h.a.c(a4.class), (Object)net.minecraft.u.E.ha);
        cT.put(net.minecraft.U.h.a.c(ag.class), (Object)net.minecraft.u.E.J);
    }

    @Override
    public void E() {
        U u2;
        block4: {
            block5: {
                block2: {
                    U u3;
                    block3: {
                        String[] arrstring = net.minecraft.ag.A.b();
                        net.minecraft.ag.U.a(this.aG, this);
                        String[] arrstring2 = arrstring;
                        u3 = this;
                        if (arrstring2 == null) break block2;
                        if (u3.cO == null) break block3;
                        u3 = this;
                        if (arrstring2 == null) break block2;
                        if (u3.cO.b(this.a, this.aF, this.ax) > 12.0) break block3;
                        u2 = this;
                        if (arrstring2 == null) break block4;
                        if (u2.aG.d(this.cO).b() == net.minecraft.u.g.ct) break block5;
                    }
                    this.cL = false;
                    u3 = this;
                }
                u3.cO = null;
            }
            super.E();
            u2 = this;
        }
        u2.c();
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("Variant", this.d());
    }

    @Override
    protected float p() {
        return net.minecraft.ag.U.a(this.g);
    }

    private void c() {
        block8: {
            U u2;
            block9: {
                int n2;
                String[] arrstring;
                block6: {
                    block7: {
                        this.cR = this.cW;
                        arrstring = net.minecraft.ag.A.b();
                        this.cS = this.cV;
                        double d10 = this.cV;
                        int n3 = this.A;
                        if (arrstring != null) {
                            n3 = n3 != 0 ? -1 : 4;
                        }
                        this.cV = (float)(d10 + (double)n3 * 0.3);
                        this.cV = net.minecraft.k.h.c(this.cV, 0.0f, 1.0f);
                        n2 = this.A;
                        if (arrstring == null) break block6;
                        if (n2 != 0) break block7;
                        float f10 = this.cQ - 1.0f;
                        n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                        if (arrstring == null) break block6;
                        if (n2 < 0) {
                            this.cQ = 1.0f;
                        }
                    }
                    this.cQ = (float)((double)this.cQ * 0.9);
                    u2 = this;
                    if (arrstring == null) break block8;
                    n2 = u2.A ? 1 : 0;
                }
                if (n2 != 0) break block9;
                u2 = this;
                if (arrstring == null) break block8;
                if (u2.G < 0.0) {
                    this.G *= 0.6;
                }
            }
            u2 = this;
        }
        u2.cW += this.cQ * 2.0f;
    }

    @Override
    public float l() {
        return this.aD * 0.6f;
    }

    @Override
    protected float d(float f10) {
        this.a(net.minecraft.u.E.hW, 0.15f, 1.0f);
        return f10 + this.cV / 2.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        int n2 = net.minecraft.k.h.f(this.a);
        int n3 = net.minecraft.k.h.f(this.m().b);
        int n4 = net.minecraft.k.h.f(this.ax);
        String[] arrstring = net.minecraft.ag.A.b();
        n n5 = new n(n2, n3, n4);
        K k2 = this.aG.d(n5.k()).b();
        int n6 = k2 instanceof b2;
        if (arrstring == null) return n6 != 0;
        if (n6 != 0) return 1 != 0;
        K k3 = k2;
        if (arrstring != null) {
            if (k3 == net.minecraft.u.g.aU) return 1 != 0;
            k3 = k2;
        }
        n6 = k3 instanceof bf;
        if (arrstring == null) return n6 != 0;
        if (n6 != 0) return 1 != 0;
        if (k2 != net.minecraft.u.g.bf) return 0 != 0;
        n6 = this.aG.l(n5);
        if (arrstring != null) {
            if (n6 <= 8) return 0 != 0;
            n6 = super.C() ? 1 : 0;
        }
        if (arrstring == null) return n6 != 0;
        if (n6 == 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.hF;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.dz;
    }

    @Override
    public boolean a(C c10) {
        return false;
    }

    private static float a(Random random) {
        return (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f;
    }

    private static d b(Random random) {
        if (random.nextInt(1000) == 0) {
            ArrayList arrayList = new ArrayList(cT.keySet());
            return net.minecraft.ag.U.b((Integer)arrayList.get(random.nextInt(arrayList.size())));
        }
        return net.minecraft.u.E.bv;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.bm, 0.15f, 1.0f);
    }

    @Override
    public void d(float f10, float f11) {
    }

    @Override
    public boolean b(net.minecraft.i.j j2, net.minecraft.ar.a3 a32) {
        boolean bl2;
        block28: {
            block29: {
                String[] arrstring;
                block24: {
                    boolean bl3;
                    block27: {
                        block25: {
                            boolean bl4;
                            block26: {
                                net.minecraft.w.d d10;
                                block18: {
                                    boolean bl5;
                                    block20: {
                                        block21: {
                                            U u2;
                                            block22: {
                                                block23: {
                                                    block19: {
                                                        block17: {
                                                            d10 = j2.c(a32);
                                                            arrstring = net.minecraft.ag.A.b();
                                                            bl5 = this.U();
                                                            if (arrstring == null) break block17;
                                                            if (bl5) break block18;
                                                            bl5 = cN.contains(d10.w());
                                                        }
                                                        if (arrstring == null) break block19;
                                                        if (!bl5) break block18;
                                                        bl5 = j2.cw.g;
                                                    }
                                                    if (arrstring != null) {
                                                        if (!bl5) {
                                                            d10.b(1);
                                                        }
                                                        bl5 = this.aR();
                                                    }
                                                    if (arrstring != null) {
                                                        if (!bl5) {
                                                            this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.db, this.ad(), 1.0f, 1.0f + (this.g.nextFloat() - this.g.nextFloat()) * 0.2f);
                                                        }
                                                        bl5 = this.aG.C;
                                                    }
                                                    if (arrstring == null) break block20;
                                                    if (bl5) break block21;
                                                    u2 = this;
                                                    if (arrstring == null) break block22;
                                                    if (u2.g.nextInt(10) != 0) break block23;
                                                    this.b(j2);
                                                    this.a(true);
                                                    this.aG.a((x)this, (byte)7);
                                                    if (arrstring != null) break block21;
                                                }
                                                this.a(false);
                                                u2 = this;
                                            }
                                            u2.aG.a((x)this, (byte)6);
                                        }
                                        bl5 = true;
                                    }
                                    return bl5;
                                }
                                if (d10.w() != cM) break block24;
                                bl4 = j2.cw.g;
                                if (arrstring != null) {
                                    if (!bl4) {
                                        d10.b(1);
                                    }
                                    this.b(new net.minecraft.K.j(net.minecraft.u.c.g, 900));
                                    bl4 = j2.C();
                                }
                                if (arrstring == null) break block25;
                                if (bl4) break block26;
                                bl3 = this.Z();
                                if (arrstring == null) break block27;
                                if (bl3) break block25;
                            }
                            bl4 = this.a(net.minecraft.ar.G.a(j2), Float.MAX_VALUE);
                        }
                        bl3 = true;
                    }
                    return bl3;
                }
                bl2 = this.aG.C;
                if (arrstring == null) break block28;
                if (bl2) break block29;
                bl2 = this.F();
                if (arrstring == null) break block28;
                if (bl2) break block29;
                bl2 = this.U();
                if (arrstring == null) break block28;
                if (!bl2) break block29;
                bl2 = this.a((B)j2);
                if (arrstring == null) break block28;
                if (bl2) {
                    boolean bl6 = this.D();
                    if (arrstring != null) {
                        bl6 = !bl6;
                    }
                    this.cH.a(bl6);
                }
            }
            bl2 = super.b(j2, a32);
        }
        return bl2;
    }

    @Override
    @Nullable
    public E a(E e10) {
        return null;
    }

    @Override
    @Nullable
    protected net.minecraft.ar.v D() {
        return net.minecraft.aj.j.X;
    }

    public boolean E() {
        return this.cL;
    }

    public int d() {
        return net.minecraft.k.h.c(this.ap.b(cU), 0, 4);
    }

    @Override
    public ay ad() {
        return ay.NEUTRAL;
    }

    @Override
    protected void d(x x2) {
        block0: {
            if (x2 instanceof net.minecraft.i.j) break block0;
            super.d(x2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static d b(int n2) {
        d d10;
        String[] arrstring = net.minecraft.ag.A.b();
        Int2ObjectMap<d> int2ObjectMap = cT;
        int n3 = n2;
        if (arrstring != null) {
            if (!int2ObjectMap.containsKey(n3)) {
                d10 = net.minecraft.u.E.bv;
                return d10;
            }
            int2ObjectMap = cT;
            n3 = n2;
        }
        d10 = (d)int2ObjectMap.get(n3);
        return d10;
    }

    public boolean F() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.A;
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public boolean j(x x2) {
        return x2.a(net.minecraft.ar.G.a(this), 3.0f);
    }

    @Override
    protected net.minecraft.e.i a(z z2) {
        net.minecraft.e.j j2 = new net.minecraft.e.j(this, z2);
        j2.b(false);
        j2.a(true);
        j2.c(true);
        return j2;
    }

    public U(z z2) {
        super(z2);
        this.cQ = 1.0f;
        this.c(0.5f, 0.9f);
        this.b9 = new e(this);
    }

    @Override
    public boolean aY() {
        return true;
    }

    @Override
    public boolean a(net.minecraft.w.d d10) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(z z2, x x2) {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = x2.aR();
        if (arrstring == null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        n2 = z2.J.nextInt(50);
        if (arrstring == null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        List<net.minecraft.U.C> list = z2.a(net.minecraft.U.C.class, x2.m().a(20.0), cP);
        boolean bl2 = list.isEmpty();
        if (arrstring == null) return bl2;
        if (bl2) return false;
        net.minecraft.U.C c10 = list.get(z2.J.nextInt(list.size()));
        bl2 = c10.aR();
        if (arrstring == null) return bl2;
        if (bl2) return false;
        d d10 = net.minecraft.ag.U.b(net.minecraft.U.h.a.c(c10.getClass()));
        z2.a(null, x2.a, x2.aF, x2.ax, d10, x2.ad(), 0.7f, net.minecraft.ag.U.a(z2.J));
        return true;
    }

    @Override
    public boolean a(G g10, float f10) {
        String[] arrstring = net.minecraft.ag.A.b();
        U u2 = this;
        if (arrstring != null) {
            if (u2.a(g10)) {
                return false;
            }
            u2 = this;
        }
        if (arrstring != null) {
            if (u2.cH != null) {
                this.cH.a(false);
            }
            u2 = this;
        }
        return super.a(g10, f10);
    }

    @Override
    protected void a(double d10, boolean bl2, i i2, n n2) {
    }

    @Override
    protected boolean ag() {
        return true;
    }

    public void m(int n2) {
        this.ap.b(cU, n2);
    }

    @Override
    protected void H() {
        this.cH = new net.minecraft.ak.U(this);
        this.b5.a(0, new P(this, 1.25));
        this.b5.a(0, new W(this));
        this.b5.a(1, new aa(this, net.minecraft.i.j.class, 8.0f));
        this.b5.a(2, this.cH);
        this.b5.a(2, new net.minecraft.ak.z(this, 1.0, 5.0f, 1.0f));
        this.b5.a(2, new aC(this, 1.0));
        this.b5.a(3, new net.minecraft.ak.B(this));
        this.b5.a(3, new w(this, 1.0, 3.0f, 7.0f));
    }

    static Int2ObjectMap a() {
        return cT;
    }

    @Override
    @Nullable
    public d q() {
        return net.minecraft.ag.U.b(this.g);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cU, 0);
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        this.m(this.g.nextInt(5));
        return super.a(h2, j2);
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.m(r2.m("Variant"));
    }

    public static void b(z z2, x x2) {
        block3: {
            z z3;
            block5: {
                int n2;
                block4: {
                    String[] arrstring;
                    block2: {
                        arrstring = net.minecraft.ag.A.b();
                        n2 = x2.aR();
                        if (arrstring == null) break block2;
                        if (n2 != 0) break block3;
                        n2 = net.minecraft.ag.U.a(z2, x2);
                    }
                    if (arrstring == null) break block4;
                    if (n2 != 0) break block3;
                    z3 = z2;
                    if (arrstring == null) break block5;
                    n2 = z3.J.nextInt(200);
                }
                if (n2 != 0) break block3;
                z3 = z2;
            }
            z3.a(null, x2.a, x2.aF, x2.ax, net.minecraft.ag.U.b(z2.J), x2.ad(), 1.0f, net.minecraft.ag.U.a(z2.J));
        }
    }

    @Override
    public void a(n n2, boolean bl2) {
        this.cO = n2;
        this.cL = bl2;
    }
}

