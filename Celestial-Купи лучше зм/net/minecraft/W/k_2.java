/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.j.f;
import net.minecraft.k.i;
import net.minecraft.w.A;
import net.minecraft.w.B;
import net.minecraft.w.C;
import net.minecraft.w.D;
import net.minecraft.w.E;
import net.minecraft.w.F;
import net.minecraft.w.G;
import net.minecraft.w.H;
import net.minecraft.w.I;
import net.minecraft.w.J;
import net.minecraft.w.K;
import net.minecraft.w.L;
import net.minecraft.w.M;
import net.minecraft.w.N;
import net.minecraft.w.O;
import net.minecraft.w.P;
import net.minecraft.w.Q;
import net.minecraft.w.R;
import net.minecraft.w.S;
import net.minecraft.w.T;
import net.minecraft.w.U;
import net.minecraft.w.V;
import net.minecraft.w.W;
import net.minecraft.w.X;
import net.minecraft.w.Y;
import net.minecraft.w.Z;
import net.minecraft.w.a;
import net.minecraft.w.a0;
import net.minecraft.w.a1;
import net.minecraft.w.a2;
import net.minecraft.w.a4;
import net.minecraft.w.a5;
import net.minecraft.w.a6;
import net.minecraft.w.a7;
import net.minecraft.w.a8;
import net.minecraft.w.a9;
import net.minecraft.w.aA;
import net.minecraft.w.aB;
import net.minecraft.w.aC;
import net.minecraft.w.aD;
import net.minecraft.w.aE;
import net.minecraft.w.aF;
import net.minecraft.w.aG;
import net.minecraft.w.aH;
import net.minecraft.w.aI;
import net.minecraft.w.aJ;
import net.minecraft.w.aM;
import net.minecraft.w.aO;
import net.minecraft.w.aP;
import net.minecraft.w.aQ;
import net.minecraft.w.aR;
import net.minecraft.w.aS;
import net.minecraft.w.aT;
import net.minecraft.w.aU;
import net.minecraft.w.aV;
import net.minecraft.w.aW;
import net.minecraft.w.aZ;
import net.minecraft.w.a_;
import net.minecraft.w.aa;
import net.minecraft.w.ab;
import net.minecraft.w.ae;
import net.minecraft.w.ag;
import net.minecraft.w.ah;
import net.minecraft.w.ai;
import net.minecraft.w.aj;
import net.minecraft.w.ak;
import net.minecraft.w.al;
import net.minecraft.w.am;
import net.minecraft.w.an;
import net.minecraft.w.ao;
import net.minecraft.w.aq;
import net.minecraft.w.as;
import net.minecraft.w.at;
import net.minecraft.w.au;
import net.minecraft.w.av;
import net.minecraft.w.aw;
import net.minecraft.w.ay;
import net.minecraft.w.az;
import net.minecraft.w.b;
import net.minecraft.w.b1;
import net.minecraft.w.b6;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.bv;
import net.minecraft.w.bw;
import net.minecraft.w.c;
import net.minecraft.w.d;
import net.minecraft.w.e;
import net.minecraft.w.g;
import net.minecraft.w.h;
import net.minecraft.w.j;
import net.minecraft.w.l;
import net.minecraft.w.m;
import net.minecraft.w.n;
import net.minecraft.w.o;
import net.minecraft.w.p;
import net.minecraft.w.q;
import net.minecraft.w.r;
import net.minecraft.w.s;
import net.minecraft.w.t;
import net.minecraft.w.u;
import net.minecraft.w.v;
import net.minecraft.w.w;
import net.minecraft.w.x;
import net.minecraft.w.y;
import net.minecraft.w.z;

public class k {
    protected /* synthetic */ boolean e;
    private static final /* synthetic */ e o;
    protected static final /* synthetic */ UUID h;
    protected static final /* synthetic */ UUID b;
    private static final /* synthetic */ Map<net.minecraft.W.K, k> p;
    private static final /* synthetic */ e i;
    protected /* synthetic */ int f;
    private /* synthetic */ String c;
    private /* synthetic */ int m;
    private final /* synthetic */ net.minecraft.b.a<net.minecraft.ar.v, e> j;
    protected /* synthetic */ boolean a;
    private static final /* synthetic */ e g;
    private /* synthetic */ k d;
    protected static /* synthetic */ Random r;
    private static /* synthetic */ boolean k;
    public static final /* synthetic */ net.minecraft.b.d<net.minecraft.ar.v, k> q;
    private static final /* synthetic */ e l;
    private /* synthetic */ net.minecraft.ad.a n;

    public k b(k k2) {
        this.d = k2;
        return this;
    }

    public boolean a(d d10, net.minecraft.ah.z z2, net.minecraft.Z.i i2, net.minecraft.k.n n2, net.minecraft.U.B b10) {
        return false;
    }

    public k a(net.minecraft.ad.a a10) {
        this.n = a10;
        return this;
    }

    private static void a(int n2, String string, k k2) {
        net.minecraft.w.k.a(n2, new net.minecraft.ar.v(string), k2);
    }

    protected static void a(net.minecraft.W.K k2, k k3) {
        net.minecraft.w.k.a(net.minecraft.W.K.b(k2), net.minecraft.W.K.h.b(k2), k3);
        p.put(k2, k3);
    }

    @Nullable
    public net.minecraft.ad.a j() {
        return this.n;
    }

    public boolean e(d d10) {
        return d10.r();
    }

    public String c(d d10) {
        return net.minecraft.ab.a.a(this.d(d10));
    }

    public boolean a(d d10, net.minecraft.i.j j2, net.minecraft.U.B b10, a3 a32) {
        return false;
    }

    public static void b(boolean bl2) {
        k = bl2;
    }

    public void a(d d10, @Nullable net.minecraft.ah.z z2, List<String> list, net.minecraft.client.B.o o2) {
    }

    public static int a(k k2) {
        return k2 == null ? 0 : q.c(k2);
    }

    public int g(d d10) {
        return 0;
    }

    public boolean l() {
        return this.e;
    }

    public boolean q() {
        int n2 = bl.c();
        boolean bl2 = this.j.a().isEmpty();
        if (n2 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i() {
        int n2 = bl.c();
        int n3 = this.m;
        if (n2 == 0) {
            if (n3 <= 0) return 0 != 0;
            n3 = this.e;
        }
        if (n2 != 0) return n3 != 0;
        if (n3 == 0) return 1 != 0;
        n3 = this.f;
        if (n2 != 0) return n3 != 0;
        if (n3 != 1) return 0 != 0;
        return 1 != 0;
    }

    protected k d(int n2) {
        int n3 = bl.g();
        k k2 = this;
        if (n3 != 0) {
            k2.m = n2;
            if (n2 > 0) {
                this.a(new net.minecraft.ar.v("damaged"), i);
                this.a(new net.minecraft.ar.v("damage"), o);
            }
            k2 = this;
        }
        return k2;
    }

    public String d(d d10) {
        return "item." + this.c;
    }

    public String h() {
        return "item." + this.c;
    }

    public net.minecraft.ar.t<d> a(net.minecraft.ah.z z2, net.minecraft.i.j j2, a3 a32) {
        return new net.minecraft.ar.t<d>(aX.PASS, j2.c(a32));
    }

    public static boolean r() {
        boolean bl2 = net.minecraft.w.k.f();
        return !bl2;
    }

    private static void a(net.minecraft.W.K k2) {
        net.minecraft.w.k.a(k2, new s(k2));
    }

    public void a(d d10, net.minecraft.ah.z z2, net.minecraft.U.B b10, int n2) {
    }

    public boolean k() {
        return false;
    }

    public boolean a(net.minecraft.Z.i i2) {
        return false;
    }

    public boolean m() {
        return false;
    }

    public void a(d d10, net.minecraft.ah.z z2, net.minecraft.i.j j2) {
    }

    public static k b(net.minecraft.W.K k2) {
        k k3 = p.get(k2);
        return k3 == null ? net.minecraft.u.h.v : k3;
    }

    public bE b(d d10) {
        return bE.NONE;
    }

    public boolean a(d d10, net.minecraft.U.B b10, net.minecraft.U.B b11) {
        return false;
    }

    public Multimap<String, f> a(net.minecraft.B.X x2) {
        return HashMultimap.create();
    }

    public k g() {
        this.a = true;
        return this;
    }

    public boolean c() {
        return true;
    }

    public static k a(int n2) {
        return q.a((net.minecraft.ar.v)n2);
    }

    public boolean t() {
        return this.d != null;
    }

    protected k a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public static void n() {
        net.minecraft.w.k.a(net.minecraft.u.g.bf, new l(net.minecraft.u.g.bf));
        net.minecraft.w.k.a(net.minecraft.u.g.bx, new y(net.minecraft.u.g.bx, net.minecraft.u.g.bx, new aB()).b("stone"));
        net.minecraft.w.k.a(net.minecraft.u.g.aU, new v(net.minecraft.u.g.aU, false));
        net.minecraft.w.k.a(net.minecraft.u.g.bv, new y(net.minecraft.u.g.bv, net.minecraft.u.g.bv, new aJ()).b("dirt"));
        net.minecraft.w.k.a(net.minecraft.u.g.cW);
        net.minecraft.w.k.a(net.minecraft.u.g.cB, new y(net.minecraft.u.g.cB, net.minecraft.u.g.cB, new aj()).b("wood"));
        net.minecraft.w.k.a(net.minecraft.u.g.dj, new y(net.minecraft.u.g.dj, net.minecraft.u.g.dj, new aP()).b("sapling"));
        net.minecraft.w.k.a(net.minecraft.u.g.g);
        net.minecraft.w.k.a(net.minecraft.u.g.aO, new y((net.minecraft.W.K)net.minecraft.u.g.aO, (net.minecraft.W.K)net.minecraft.u.g.aO, new aM()).b("sand"));
        net.minecraft.w.k.a(net.minecraft.u.g.di);
        net.minecraft.w.k.a(net.minecraft.u.g.aK);
        net.minecraft.w.k.a(net.minecraft.u.g.ak);
        net.minecraft.w.k.a(net.minecraft.u.g.l);
        net.minecraft.w.k.a(net.minecraft.u.g.bu, new y(net.minecraft.u.g.bu, net.minecraft.u.g.bu, new aQ()).b("log"));
        net.minecraft.w.k.a(net.minecraft.u.g.aB, new y(net.minecraft.u.g.aB, net.minecraft.u.g.aB, new ai()).b("log"));
        net.minecraft.w.k.a(net.minecraft.u.g.bU, new x(net.minecraft.u.g.bU).b("leaves"));
        net.minecraft.w.k.a(net.minecraft.u.g.S, new x(net.minecraft.u.g.S).b("leaves"));
        net.minecraft.w.k.a(net.minecraft.u.g.a2, new y(net.minecraft.u.g.a2, net.minecraft.u.g.a2, new j()).b("sponge"));
        net.minecraft.w.k.a(net.minecraft.u.g.a);
        net.minecraft.w.k.a(net.minecraft.u.g.aC);
        net.minecraft.w.k.a(net.minecraft.u.g.av);
        net.minecraft.w.k.a(net.minecraft.u.g.n);
        net.minecraft.w.k.a(net.minecraft.u.g.bC, new y(net.minecraft.u.g.bC, net.minecraft.u.g.bC, new as()).b("sandStone"));
        net.minecraft.w.k.a(net.minecraft.u.g.dm);
        net.minecraft.w.k.a(net.minecraft.u.g.w);
        net.minecraft.w.k.a(net.minecraft.u.g.aY);
        net.minecraft.w.k.a(net.minecraft.u.g.M, new A(net.minecraft.u.g.M));
        net.minecraft.w.k.a(net.minecraft.u.g.dh);
        net.minecraft.w.k.a(net.minecraft.u.g.dc, new v(net.minecraft.u.g.dc, true).a(new String[]{"shrub", "grass", "fern"}));
        net.minecraft.w.k.a(net.minecraft.u.g.b9);
        net.minecraft.w.k.a(net.minecraft.u.g.cr, new A(net.minecraft.u.g.cr));
        net.minecraft.w.k.a(net.minecraft.u.g.s, new u(net.minecraft.u.g.s).b("cloth"));
        net.minecraft.w.k.a(net.minecraft.u.g.cZ, new y((net.minecraft.W.K)net.minecraft.u.g.cZ, (net.minecraft.W.K)net.minecraft.u.g.cZ, new aI()).b("flower"));
        net.minecraft.w.k.a(net.minecraft.u.g.cj, new y((net.minecraft.W.K)net.minecraft.u.g.cj, (net.minecraft.W.K)net.minecraft.u.g.cj, new aZ()).b("rose"));
        net.minecraft.w.k.a(net.minecraft.u.g.cg);
        net.minecraft.w.k.a(net.minecraft.u.g.z);
        net.minecraft.w.k.a(net.minecraft.u.g.a7);
        net.minecraft.w.k.a(net.minecraft.u.g.E);
        net.minecraft.w.k.a(net.minecraft.u.g.bO, new C(net.minecraft.u.g.bO, net.minecraft.u.g.bO, net.minecraft.u.g.H).b("stoneSlab"));
        net.minecraft.w.k.a(net.minecraft.u.g.cY);
        net.minecraft.w.k.a(net.minecraft.u.g.cR);
        net.minecraft.w.k.a(net.minecraft.u.g.c8);
        net.minecraft.w.k.a(net.minecraft.u.g.x);
        net.minecraft.w.k.a(net.minecraft.u.g.bP);
        net.minecraft.w.k.a(net.minecraft.u.g.h);
        net.minecraft.w.k.a(net.minecraft.u.g.aD);
        net.minecraft.w.k.a(net.minecraft.u.g.cm);
        net.minecraft.w.k.a(net.minecraft.u.g.P);
        net.minecraft.w.k.a(net.minecraft.u.g.aF);
        net.minecraft.w.k.a(net.minecraft.u.g.V);
        net.minecraft.w.k.a(net.minecraft.u.g.a_);
        net.minecraft.w.k.a(net.minecraft.u.g.F, new C(net.minecraft.u.g.F, net.minecraft.u.g.F, net.minecraft.u.g.bS).b("purpurSlab"));
        net.minecraft.w.k.a(net.minecraft.u.g.i);
        net.minecraft.w.k.a(net.minecraft.u.g.aX);
        net.minecraft.w.k.a(net.minecraft.u.g.cd);
        net.minecraft.w.k.a(net.minecraft.u.g.cO);
        net.minecraft.w.k.a(net.minecraft.u.g.bF);
        net.minecraft.w.k.a(net.minecraft.u.g.aj);
        net.minecraft.w.k.a(net.minecraft.u.g.cU);
        net.minecraft.w.k.a(net.minecraft.u.g.bJ);
        net.minecraft.w.k.a(net.minecraft.u.g.cD);
        net.minecraft.w.k.a(net.minecraft.u.g.bM);
        net.minecraft.w.k.a(net.minecraft.u.g.a0);
        net.minecraft.w.k.a(net.minecraft.u.g.ao);
        net.minecraft.w.k.a(net.minecraft.u.g.dl);
        net.minecraft.w.k.a(net.minecraft.u.g.bc);
        net.minecraft.w.k.a(net.minecraft.u.g.cu);
        net.minecraft.w.k.a(net.minecraft.u.g.c5);
        net.minecraft.w.k.a(net.minecraft.u.g.aI);
        net.minecraft.w.k.a(net.minecraft.u.g.o, new D(net.minecraft.u.g.o));
        net.minecraft.w.k.a(net.minecraft.u.g.cF);
        net.minecraft.w.k.a(net.minecraft.u.g.da);
        net.minecraft.w.k.a(net.minecraft.u.g.aA);
        net.minecraft.w.k.a(net.minecraft.u.g.d);
        net.minecraft.w.k.a(net.minecraft.u.g.ct);
        net.minecraft.w.k.a(net.minecraft.u.g.bt);
        net.minecraft.w.k.a(net.minecraft.u.g.cN);
        net.minecraft.w.k.a(net.minecraft.u.g.q);
        net.minecraft.w.k.a(net.minecraft.u.g.bd);
        net.minecraft.w.k.a(net.minecraft.u.g.bs);
        net.minecraft.w.k.a(net.minecraft.u.g.aa);
        net.minecraft.w.k.a(net.minecraft.u.g.G);
        net.minecraft.w.k.a(net.minecraft.u.g.j);
        net.minecraft.w.k.a(net.minecraft.u.g.br);
        net.minecraft.w.k.a(net.minecraft.u.g.W);
        net.minecraft.w.k.a(net.minecraft.u.g.y);
        net.minecraft.w.k.a(net.minecraft.u.g.cI);
        net.minecraft.w.k.a(net.minecraft.u.g.be, new y(net.minecraft.u.g.be, net.minecraft.u.g.be, new ag()).b("monsterStoneEgg"));
        net.minecraft.w.k.a(net.minecraft.u.g.ay, new y(net.minecraft.u.g.ay, net.minecraft.u.g.ay, new g()).b("stonebricksmooth"));
        net.minecraft.w.k.a(net.minecraft.u.g.a1);
        net.minecraft.w.k.a(net.minecraft.u.g.db);
        net.minecraft.w.k.a(net.minecraft.u.g.dd);
        net.minecraft.w.k.a(net.minecraft.u.g.a6);
        net.minecraft.w.k.a(net.minecraft.u.g.ae);
        net.minecraft.w.k.a(net.minecraft.u.g.aW, new v(net.minecraft.u.g.aW, false));
        net.minecraft.w.k.a(net.minecraft.u.g.dp);
        net.minecraft.w.k.a(net.minecraft.u.g.aq);
        net.minecraft.w.k.a(net.minecraft.u.g.O);
        net.minecraft.w.k.a(net.minecraft.u.g.cJ);
        net.minecraft.w.k.a(net.minecraft.u.g.cC);
        int n2 = bl.g();
        net.minecraft.w.k.a(net.minecraft.u.g.bI);
        net.minecraft.w.k.a(net.minecraft.u.g.cG);
        net.minecraft.w.k.a(net.minecraft.u.g.cX);
        net.minecraft.w.k.a(net.minecraft.u.g.a8);
        net.minecraft.w.k.a(net.minecraft.u.g.c_, new w(net.minecraft.u.g.c_));
        net.minecraft.w.k.a(net.minecraft.u.g.dk);
        net.minecraft.w.k.a(net.minecraft.u.g.dn);
        net.minecraft.w.k.a(net.minecraft.u.g.aP);
        net.minecraft.w.k.a(net.minecraft.u.g.bH);
        net.minecraft.w.k.a(net.minecraft.u.g.ad);
        net.minecraft.w.k.a(net.minecraft.u.g.v);
        net.minecraft.w.k.a(net.minecraft.u.g.dg);
        net.minecraft.w.k.a(net.minecraft.u.g.bG);
        net.minecraft.w.k.a(net.minecraft.u.g.as);
        net.minecraft.w.k.a(net.minecraft.u.g.e, new C(net.minecraft.u.g.e, net.minecraft.u.g.e, net.minecraft.u.g.f).b("woodSlab"));
        net.minecraft.w.k.a(net.minecraft.u.g.ch);
        net.minecraft.w.k.a(net.minecraft.u.g.au);
        net.minecraft.w.k.a(net.minecraft.u.g.ba);
        net.minecraft.w.k.a(net.minecraft.u.g.b);
        net.minecraft.w.k.a(net.minecraft.u.g.cs);
        net.minecraft.w.k.a(net.minecraft.u.g.aT);
        net.minecraft.w.k.a(net.minecraft.u.g.bA);
        net.minecraft.w.k.a(net.minecraft.u.g.al);
        net.minecraft.w.k.a(net.minecraft.u.g.de);
        net.minecraft.w.k.a(net.minecraft.u.g.bX);
        net.minecraft.w.k.a(net.minecraft.u.g.bl, new y(net.minecraft.u.g.bl, net.minecraft.u.g.bl, new bw()).b("cobbleWall"));
        net.minecraft.w.k.a(net.minecraft.u.g.I);
        net.minecraft.w.k.a(net.minecraft.u.g.cb, new z(net.minecraft.u.g.cb).b("anvil"));
        net.minecraft.w.k.a(net.minecraft.u.g.c4);
        net.minecraft.w.k.a(net.minecraft.u.g.cH);
        net.minecraft.w.k.a(net.minecraft.u.g.cp);
        net.minecraft.w.k.a(net.minecraft.u.g.cQ);
        net.minecraft.w.k.a(net.minecraft.u.g.b8);
        net.minecraft.w.k.a(net.minecraft.u.g.u);
        net.minecraft.w.k.a(net.minecraft.u.g.ac);
        net.minecraft.w.k.a(net.minecraft.u.g.k, new y(net.minecraft.u.g.k, net.minecraft.u.g.k, new String[]{"default", "chiseled", "lines"}).b("quartzBlock"));
        net.minecraft.w.k.a(net.minecraft.u.g.bN);
        net.minecraft.w.k.a(net.minecraft.u.g.az);
        net.minecraft.w.k.a(net.minecraft.u.g.cw);
        net.minecraft.w.k.a(net.minecraft.u.g.ck, new u(net.minecraft.u.g.ck).b("clayHardenedStained"));
        net.minecraft.w.k.a(net.minecraft.u.g.ah);
        net.minecraft.w.k.a(net.minecraft.u.g.bV);
        net.minecraft.w.k.a(net.minecraft.u.g.aL);
        net.minecraft.w.k.a(net.minecraft.u.g.D, new u(net.minecraft.u.g.D).b("woolCarpet"));
        net.minecraft.w.k.a(net.minecraft.u.g.an);
        net.minecraft.w.k.a(net.minecraft.u.g.r);
        net.minecraft.w.k.a(net.minecraft.u.g.cq);
        net.minecraft.w.k.a(net.minecraft.u.g.co);
        net.minecraft.w.k.a(net.minecraft.u.g.am);
        net.minecraft.w.k.a(net.minecraft.u.g.t);
        net.minecraft.w.k.a(net.minecraft.u.g.ci);
        net.minecraft.w.k.a(net.minecraft.u.g.bW, new y((net.minecraft.W.K)net.minecraft.u.g.bW, (net.minecraft.W.K)net.minecraft.u.g.bW, new a()).b("doublePlant"));
        net.minecraft.w.k.a(net.minecraft.u.g.a5, new u(net.minecraft.u.g.a5).b("stainedGlass"));
        net.minecraft.w.k.a(net.minecraft.u.g.cv, new u(net.minecraft.u.g.cv).b("stainedGlassPane"));
        net.minecraft.w.k.a(net.minecraft.u.g.cz, new y(net.minecraft.u.g.cz, net.minecraft.u.g.cz, new b6()).b("prismarine"));
        net.minecraft.w.k.a(net.minecraft.u.g.af);
        net.minecraft.w.k.a(net.minecraft.u.g.aQ, new y(net.minecraft.u.g.aQ, net.minecraft.u.g.aQ, new b1()).b("redSandStone"));
        net.minecraft.w.k.a(net.minecraft.u.g.bE);
        net.minecraft.w.k.a(net.minecraft.u.g.U, new C(net.minecraft.u.g.U, net.minecraft.u.g.U, net.minecraft.u.g.at).b("stoneSlab2"));
        net.minecraft.w.k.a(net.minecraft.u.g.aS);
        net.minecraft.w.k.a(net.minecraft.u.g.bZ);
        net.minecraft.w.k.a(net.minecraft.u.g.bR);
        net.minecraft.w.k.a(net.minecraft.u.g.bz);
        net.minecraft.w.k.a(net.minecraft.u.g.Z);
        net.minecraft.w.k.a(net.minecraft.u.g.bm);
        net.minecraft.w.k.a(net.minecraft.u.g.Y);
        net.minecraft.w.k.a(net.minecraft.u.g.ce);
        net.minecraft.w.k.a(net.minecraft.u.g.b1, new B(net.minecraft.u.g.b1));
        net.minecraft.w.k.a(net.minecraft.u.g.bk, new B(net.minecraft.u.g.bk));
        net.minecraft.w.k.a(net.minecraft.u.g.X, new B(net.minecraft.u.g.X));
        net.minecraft.w.k.a(net.minecraft.u.g.L, new B(net.minecraft.u.g.L));
        net.minecraft.w.k.a(net.minecraft.u.g.aE, new B(net.minecraft.u.g.aE));
        net.minecraft.w.k.a(net.minecraft.u.g.bo, new B(net.minecraft.u.g.bo));
        net.minecraft.w.k.a(net.minecraft.u.g.bh, new B(net.minecraft.u.g.bh));
        net.minecraft.w.k.a(net.minecraft.u.g.J, new B(net.minecraft.u.g.J));
        net.minecraft.w.k.a(net.minecraft.u.g.ap, new B(net.minecraft.u.g.ap));
        net.minecraft.w.k.a(net.minecraft.u.g.bg, new B(net.minecraft.u.g.bg));
        net.minecraft.w.k.a(net.minecraft.u.g.b5, new B(net.minecraft.u.g.b5));
        net.minecraft.w.k.a(net.minecraft.u.g.N, new B(net.minecraft.u.g.N));
        net.minecraft.w.k.a(net.minecraft.u.g.by, new B(net.minecraft.u.g.by));
        net.minecraft.w.k.a(net.minecraft.u.g.cx, new B(net.minecraft.u.g.cx));
        net.minecraft.w.k.a(net.minecraft.u.g.bw, new B(net.minecraft.u.g.bw));
        net.minecraft.w.k.a(net.minecraft.u.g.a3, new B(net.minecraft.u.g.a3));
        net.minecraft.w.k.a(net.minecraft.u.g.c7);
        net.minecraft.w.k.a(net.minecraft.u.g.A);
        net.minecraft.w.k.a(net.minecraft.u.g.bb);
        net.minecraft.w.k.a(net.minecraft.u.g.c0);
        net.minecraft.w.k.a(net.minecraft.u.g.cn);
        net.minecraft.w.k.a(net.minecraft.u.g.b3);
        net.minecraft.w.k.a(net.minecraft.u.g.cf);
        net.minecraft.w.k.a(net.minecraft.u.g.b2);
        net.minecraft.w.k.a(net.minecraft.u.g.cc);
        net.minecraft.w.k.a(net.minecraft.u.g.a9);
        net.minecraft.w.k.a(net.minecraft.u.g.T);
        net.minecraft.w.k.a(net.minecraft.u.g.c1);
        net.minecraft.w.k.a(net.minecraft.u.g.ab);
        net.minecraft.w.k.a(net.minecraft.u.g.ax);
        net.minecraft.w.k.a(net.minecraft.u.g.c2);
        net.minecraft.w.k.a(net.minecraft.u.g.c6);
        net.minecraft.w.k.a(net.minecraft.u.g.cK, new u(net.minecraft.u.g.cK).b("concrete"));
        net.minecraft.w.k.a(net.minecraft.u.g.aw, new u(net.minecraft.u.g.aw).b("concrete_powder"));
        net.minecraft.w.k.a(net.minecraft.u.g.bD);
        net.minecraft.w.k.a(256, "iron_shovel", new aS(a8.IRON).b("shovelIron"));
        net.minecraft.w.k.a(257, "iron_pickaxe", new ab(a8.IRON).b("pickaxeIron"));
        net.minecraft.w.k.a(258, "iron_axe", new am(a8.IRON).b("hatchetIron"));
        net.minecraft.w.k.a(259, "flint_and_steel", new a1().b("flintAndSteel"));
        net.minecraft.w.k.a(260, "apple", new aw(4, 0.3f, false).b("apple"));
        net.minecraft.w.k.a(261, "bow", new H().b("bow"));
        net.minecraft.w.k.a(262, "arrow", new o().b("arrow"));
        net.minecraft.w.k.a(263, "coal", new M().b("coal"));
        net.minecraft.w.k.a(264, "diamond", new k().b("diamond").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(265, "iron_ingot", new k().b("ingotIron").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(266, "gold_ingot", new k().b("ingotGold").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(267, "iron_sword", new a_(a8.IRON).b("swordIron"));
        net.minecraft.w.k.a(268, "wooden_sword", new a_(a8.WOOD).b("swordWood"));
        net.minecraft.w.k.a(269, "wooden_shovel", new aS(a8.WOOD).b("shovelWood"));
        net.minecraft.w.k.a(270, "wooden_pickaxe", new ab(a8.WOOD).b("pickaxeWood"));
        net.minecraft.w.k.a(271, "wooden_axe", new am(a8.WOOD).b("hatchetWood"));
        net.minecraft.w.k.a(272, "stone_sword", new a_(a8.STONE).b("swordStone"));
        net.minecraft.w.k.a(273, "stone_shovel", new aS(a8.STONE).b("shovelStone"));
        net.minecraft.w.k.a(274, "stone_pickaxe", new ab(a8.STONE).b("pickaxeStone"));
        net.minecraft.w.k.a(275, "stone_axe", new am(a8.STONE).b("hatchetStone"));
        net.minecraft.w.k.a(276, "diamond_sword", new a_(a8.DIAMOND).b("swordDiamond"));
        net.minecraft.w.k.a(277, "diamond_shovel", new aS(a8.DIAMOND).b("shovelDiamond"));
        net.minecraft.w.k.a(278, "diamond_pickaxe", new ab(a8.DIAMOND).b("pickaxeDiamond"));
        net.minecraft.w.k.a(279, "diamond_axe", new am(a8.DIAMOND).b("hatchetDiamond"));
        net.minecraft.w.k.a(280, "stick", new k().g().b("stick").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(281, "bowl", new k().b("bowl").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(282, "mushroom_stew", new a9(6).b("mushroomStew"));
        net.minecraft.w.k.a(283, "golden_sword", new a_(a8.GOLD).b("swordGold"));
        net.minecraft.w.k.a(284, "golden_shovel", new aS(a8.GOLD).b("shovelGold"));
        net.minecraft.w.k.a(285, "golden_pickaxe", new ab(a8.GOLD).b("pickaxeGold"));
        net.minecraft.w.k.a(286, "golden_axe", new am(a8.GOLD).b("hatchetGold"));
        net.minecraft.w.k.a(287, "string", new E(net.minecraft.u.g.cM).b("string").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(288, "feather", new k().b("feather").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(289, "gunpowder", new k().b("sulphur").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(290, "wooden_hoe", new aa(a8.WOOD).b("hoeWood"));
        net.minecraft.w.k.a(291, "stone_hoe", new aa(a8.STONE).b("hoeStone"));
        net.minecraft.w.k.a(292, "iron_hoe", new aa(a8.IRON).b("hoeIron"));
        net.minecraft.w.k.a(293, "diamond_hoe", new aa(a8.DIAMOND).b("hoeDiamond"));
        net.minecraft.w.k.a(294, "golden_hoe", new aa(a8.GOLD).b("hoeGold"));
        net.minecraft.w.k.a(295, "wheat_seeds", new a2(net.minecraft.u.g.c3, net.minecraft.u.g.cU).b("seeds"));
        net.minecraft.w.k.a(296, "wheat", new k().b("wheat").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(297, "bread", new aw(5, 0.6f, false).b("bread"));
        net.minecraft.w.k.a(298, "leather_helmet", new m(aU.LEATHER, 0, net.minecraft.B.X.HEAD).b("helmetCloth"));
        net.minecraft.w.k.a(299, "leather_chestplate", new m(aU.LEATHER, 0, net.minecraft.B.X.CHEST).b("chestplateCloth"));
        net.minecraft.w.k.a(300, "leather_leggings", new m(aU.LEATHER, 0, net.minecraft.B.X.LEGS).b("leggingsCloth"));
        net.minecraft.w.k.a(301, "leather_boots", new m(aU.LEATHER, 0, net.minecraft.B.X.FEET).b("bootsCloth"));
        net.minecraft.w.k.a(302, "chainmail_helmet", new m(aU.CHAIN, 1, net.minecraft.B.X.HEAD).b("helmetChain"));
        net.minecraft.w.k.a(303, "chainmail_chestplate", new m(aU.CHAIN, 1, net.minecraft.B.X.CHEST).b("chestplateChain"));
        net.minecraft.w.k.a(304, "chainmail_leggings", new m(aU.CHAIN, 1, net.minecraft.B.X.LEGS).b("leggingsChain"));
        net.minecraft.w.k.a(305, "chainmail_boots", new m(aU.CHAIN, 1, net.minecraft.B.X.FEET).b("bootsChain"));
        net.minecraft.w.k.a(306, "iron_helmet", new m(aU.IRON, 2, net.minecraft.B.X.HEAD).b("helmetIron"));
        net.minecraft.w.k.a(307, "iron_chestplate", new m(aU.IRON, 2, net.minecraft.B.X.CHEST).b("chestplateIron"));
        net.minecraft.w.k.a(308, "iron_leggings", new m(aU.IRON, 2, net.minecraft.B.X.LEGS).b("leggingsIron"));
        net.minecraft.w.k.a(309, "iron_boots", new m(aU.IRON, 2, net.minecraft.B.X.FEET).b("bootsIron"));
        net.minecraft.w.k.a(310, "diamond_helmet", new m(aU.DIAMOND, 3, net.minecraft.B.X.HEAD).b("helmetDiamond"));
        net.minecraft.w.k.a(311, "diamond_chestplate", new m(aU.DIAMOND, 3, net.minecraft.B.X.CHEST).b("chestplateDiamond"));
        net.minecraft.w.k.a(312, "diamond_leggings", new m(aU.DIAMOND, 3, net.minecraft.B.X.LEGS).b("leggingsDiamond"));
        net.minecraft.w.k.a(313, "diamond_boots", new m(aU.DIAMOND, 3, net.minecraft.B.X.FEET).b("bootsDiamond"));
        net.minecraft.w.k.a(314, "golden_helmet", new m(aU.GOLD, 4, net.minecraft.B.X.HEAD).b("helmetGold"));
        net.minecraft.w.k.a(315, "golden_chestplate", new m(aU.GOLD, 4, net.minecraft.B.X.CHEST).b("chestplateGold"));
        net.minecraft.w.k.a(316, "golden_leggings", new m(aU.GOLD, 4, net.minecraft.B.X.LEGS).b("leggingsGold"));
        net.minecraft.w.k.a(317, "golden_boots", new m(aU.GOLD, 4, net.minecraft.B.X.FEET).b("bootsGold"));
        net.minecraft.w.k.a(318, "flint", new k().b("flint").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(319, "porkchop", new aw(3, 0.3f, true).b("porkchopRaw"));
        net.minecraft.w.k.a(320, "cooked_porkchop", new aw(8, 0.8f, true).b("porkchopCooked"));
        net.minecraft.w.k.a(321, "painting", new aC(net.minecraft.J.m.class).b("painting"));
        net.minecraft.w.k.a(322, "golden_apple", new av(4, 1.2f, false).b().b("appleGold"));
        net.minecraft.w.k.a(323, "sign", new ah().b("sign"));
        net.minecraft.w.k.a(324, "wooden_door", new O(net.minecraft.u.g.aJ).b("doorOak"));
        k k2 = new I(net.minecraft.u.g.bf).b("bucket").b(16);
        net.minecraft.w.k.a(325, "bucket", k2);
        net.minecraft.w.k.a(326, "water_bucket", new I(net.minecraft.u.g.cL).b("bucketWater").b(k2));
        net.minecraft.w.k.a(327, "lava_bucket", new I(net.minecraft.u.g.ag).b("bucketLava").b(k2));
        net.minecraft.w.k.a(328, "minecart", new ae(net.minecraft.J.j.RIDEABLE).b("minecart"));
        net.minecraft.w.k.a(329, "saddle", new ak().b("saddle"));
        net.minecraft.w.k.a(330, "iron_door", new O(net.minecraft.u.g.bL).b("doorIron"));
        net.minecraft.w.k.a(331, "redstone", new ay().b("redstone"));
        net.minecraft.w.k.a(332, "snowball", new a0().b("snowball"));
        net.minecraft.w.k.a(333, "boat", (k)new F(net.minecraft.J.g.OAK));
        net.minecraft.w.k.a(334, "leather", new k().b("leather").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(335, "milk_bucket", new J().b("milk").b(k2));
        net.minecraft.w.k.a(336, "brick", new k().b("brick").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(337, "clay_ball", new k().b("clay").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(338, "reeds", new E(net.minecraft.u.g.aZ).b("reeds").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(339, "paper", new k().b("paper").a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(340, "book", new G().b("book").a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(341, "slime_ball", new k().b("slimeball").a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(342, "chest_minecart", new ae(net.minecraft.J.j.CHEST).b("minecartChest"));
        net.minecraft.w.k.a(343, "furnace_minecart", new ae(net.minecraft.J.j.FURNACE).b("minecartFurnace"));
        net.minecraft.w.k.a(344, "egg", new Q().b("egg"));
        net.minecraft.w.k.a(345, "compass", new N().b("compass").a(net.minecraft.ad.a.d));
        net.minecraft.w.k.a(346, "fishing_rod", new au().b("fishingRod"));
        net.minecraft.w.k.a(347, "clock", new L().b("clock").a(net.minecraft.ad.a.d));
        net.minecraft.w.k.a(348, "glowstone_dust", new k().b("yellowDust").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(349, "fish", new aE(false).b("fish").a(true));
        net.minecraft.w.k.a(350, "cooked_fish", new aE(true).b("fish").a(true));
        net.minecraft.w.k.a(351, "dye", new P().b("dyePowder"));
        net.minecraft.w.k.a(352, "bone", new k().b("bone").g().a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(353, "sugar", new k().b("sugar").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(354, "cake", new E(net.minecraft.u.g.b7).b(1).b("cake").a(net.minecraft.ad.a.k));
        net.minecraft.w.k.a(355, "bed", new r().b(1).b("bed"));
        net.minecraft.w.k.a(356, "repeater", new E(net.minecraft.u.g.bB).b("diode").a(net.minecraft.ad.a.p));
        net.minecraft.w.k.a(357, "cookie", new aw(2, 0.1f, false).b("cookie"));
        net.minecraft.w.k.a(358, "filled_map", new an().b("map"));
        net.minecraft.w.k.a(359, "shears", new aW().b("shears"));
        net.minecraft.w.k.a(360, "melon", new aw(2, 0.3f, false).b("melon"));
        net.minecraft.w.k.a(361, "pumpkin_seeds", new a2(net.minecraft.u.g.Q, net.minecraft.u.g.cU).b("seeds_pumpkin"));
        net.minecraft.w.k.a(362, "melon_seeds", new a2(net.minecraft.u.g.aM, net.minecraft.u.g.cU).b("seeds_melon"));
        net.minecraft.w.k.a(363, "beef", new aw(3, 0.3f, true).b("beefRaw"));
        net.minecraft.w.k.a(364, "cooked_beef", new aw(8, 0.8f, true).b("beefCooked"));
        net.minecraft.w.k.a(365, "chicken", new aw(2, 0.3f, true).a(new net.minecraft.K.j(net.minecraft.u.c.r, 600, 0), 0.3f).b("chickenRaw"));
        net.minecraft.w.k.a(366, "cooked_chicken", new aw(6, 0.6f, true).b("chickenCooked"));
        net.minecraft.w.k.a(367, "rotten_flesh", new aw(4, 0.1f, true).a(new net.minecraft.K.j(net.minecraft.u.c.r, 600, 0), 0.8f).b("rottenFlesh"));
        net.minecraft.w.k.a(368, "ender_pearl", new V().b("enderPearl"));
        net.minecraft.w.k.a(369, "blaze_rod", new k().b("blazeRod").a(net.minecraft.ad.a.m).g());
        net.minecraft.w.k.a(370, "ghast_tear", new k().b("ghastTear").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(371, "gold_nugget", new k().b("goldNugget").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(372, "nether_wart", new a2(net.minecraft.u.g.cE, net.minecraft.u.g.br).b("netherStalkSeeds"));
        net.minecraft.w.k.a(373, "potion", new ao().b("potion"));
        k k3 = new aA().b("glassBottle");
        net.minecraft.w.k.a(374, "glass_bottle", k3);
        net.minecraft.w.k.a(375, "spider_eye", new aw(2, 0.8f, false).a(new net.minecraft.K.j(net.minecraft.u.c.g, 100, 0), 1.0f).b("spiderEye"));
        net.minecraft.w.k.a(376, "fermented_spider_eye", new k().b("fermentedSpiderEye").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(377, "blaze_powder", new k().b("blazePowder").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(378, "magma_cream", new k().b("magmaCream").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(379, "brewing_stand", new E(net.minecraft.u.g.B).b("brewingStand").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(380, "cauldron", new E(net.minecraft.u.g.aH).b("cauldron").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(381, "ender_eye", new U().b("eyeOfEnder"));
        net.minecraft.w.k.a(382, "speckled_melon", new k().b("speckledMelon").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(383, "spawn_egg", new aG().b("monsterPlacer"));
        net.minecraft.w.k.a(384, "experience_bottle", new W().b("expBottle"));
        net.minecraft.w.k.a(385, "fire_charge", new X().b("fireball"));
        net.minecraft.w.k.a(386, "writable_book", new a5().b("writingBook").a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(387, "written_book", new a4().b("writtenBook").b(16));
        net.minecraft.w.k.a(388, "emerald", new k().b("emerald").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(389, "item_frame", new aC(net.minecraft.J.l.class).b("frame"));
        net.minecraft.w.k.a(390, "flower_pot", new E(net.minecraft.u.g.cA).b("flowerPot").a(net.minecraft.ad.a.j));
        net.minecraft.w.k.a(391, "carrot", new a6(3, 0.6f, net.minecraft.u.g.b4, net.minecraft.u.g.cU).b("carrots"));
        net.minecraft.w.k.a(392, "potato", new a6(1, 0.3f, net.minecraft.u.g.ca, net.minecraft.u.g.cU).b("potato"));
        net.minecraft.w.k.a(393, "baked_potato", new aw(5, 0.6f, false).b("potatoBaked"));
        net.minecraft.w.k.a(394, "poisonous_potato", new aw(2, 0.3f, false).a(new net.minecraft.K.j(net.minecraft.u.c.g, 100, 0), 0.6f).b("potatoPoisonous"));
        net.minecraft.w.k.a(395, "map", new aF().b("emptyMap"));
        net.minecraft.w.k.a(396, "golden_carrot", new aw(6, 1.2f, false).b("carrotGolden").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(397, "skull", new az().b("skull"));
        net.minecraft.w.k.a(398, "carrot_on_a_stick", new K().b("carrotOnAStick"));
        net.minecraft.w.k.a(399, "nether_star", new aq().b("netherStar").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(400, "pumpkin_pie", new aw(8, 0.3f, false).b("pumpkinPie").a(net.minecraft.ad.a.k));
        net.minecraft.w.k.a(401, "fireworks", new Y().b("fireworks"));
        net.minecraft.w.k.a(402, "firework_charge", new Z().b("fireworksCharge").a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(403, "enchanted_book", new S().b(1).b("enchantedBook"));
        net.minecraft.w.k.a(404, "comparator", new E(net.minecraft.u.g.cP).b("comparator").a(net.minecraft.ad.a.p));
        net.minecraft.w.k.a(405, "netherbrick", new k().b("netherbrick").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(406, "quartz", new k().b("netherquartz").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(407, "tnt_minecart", new ae(net.minecraft.J.j.TNT).b("minecartTnt"));
        net.minecraft.w.k.a(408, "hopper_minecart", new ae(net.minecraft.J.j.HOPPER).b("minecartHopper"));
        net.minecraft.w.k.a(409, "prismarine_shard", new k().b("prismarineShard").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(410, "prismarine_crystals", new k().b("prismarineCrystals").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(411, "rabbit", new aw(3, 0.3f, true).b("rabbitRaw"));
        net.minecraft.w.k.a(412, "cooked_rabbit", new aw(5, 0.6f, true).b("rabbitCooked"));
        net.minecraft.w.k.a(413, "rabbit_stew", new a9(10).b("rabbitStew"));
        net.minecraft.w.k.a(414, "rabbit_foot", new k().b("rabbitFoot").a(net.minecraft.ad.a.q));
        net.minecraft.w.k.a(415, "rabbit_hide", new k().b("rabbitHide").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(416, "armor_stand", new n().b("armorStand").b(16));
        net.minecraft.w.k.a(417, "iron_horse_armor", new k().b("horsearmormetal").b(1).a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(418, "golden_horse_armor", new k().b("horsearmorgold").b(1).a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(419, "diamond_horse_armor", new k().b("horsearmordiamond").b(1).a(net.minecraft.ad.a.n));
        net.minecraft.w.k.a(420, "lead", new a7().b("leash"));
        net.minecraft.w.k.a(421, "name_tag", new at().b("nameTag"));
        net.minecraft.w.k.a(422, "command_block_minecart", new ae(net.minecraft.J.j.COMMAND_BLOCK).b("minecartCommandBlock").a((net.minecraft.ad.a)null));
        net.minecraft.w.k.a(423, "mutton", new aw(2, 0.3f, true).b("muttonRaw"));
        net.minecraft.w.k.a(424, "cooked_mutton", new aw(6, 0.8f, true).b("muttonCooked"));
        net.minecraft.w.k.a(425, "banner", new t().b("banner"));
        net.minecraft.w.k.a(426, "end_crystal", (k)new T());
        net.minecraft.w.k.a(427, "spruce_door", new O(net.minecraft.u.g.bT).b("doorSpruce"));
        net.minecraft.w.k.a(428, "birch_door", new O(net.minecraft.u.g.cV).b("doorBirch"));
        net.minecraft.w.k.a(429, "jungle_door", new O(net.minecraft.u.g.c).b("doorJungle"));
        net.minecraft.w.k.a(430, "acacia_door", new O(net.minecraft.u.g.cl).b("doorAcacia"));
        net.minecraft.w.k.a(431, "dark_oak_door", new O(net.minecraft.u.g.p).b("doorDarkOak"));
        net.minecraft.w.k.a(432, "chorus_fruit", new al(4, 0.3f).b().b("chorusFruit").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(433, "chorus_fruit_popped", new k().b("chorusFruitPopped").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(434, "beetroot", new aw(1, 0.6f, false).b("beetroot"));
        net.minecraft.w.k.a(435, "beetroot_seeds", new a2(net.minecraft.u.g.K, net.minecraft.u.g.cU).b("beetroot_seeds"));
        net.minecraft.w.k.a(436, "beetroot_soup", new a9(6).b("beetroot_soup"));
        net.minecraft.w.k.a(437, "dragon_breath", new k().a(net.minecraft.ad.a.q).b("dragon_breath").b(k3));
        net.minecraft.w.k.a(438, "splash_potion", new aT().b("splash_potion"));
        net.minecraft.w.k.a(439, "spectral_arrow", new p().b("spectral_arrow"));
        net.minecraft.w.k.a(440, "tipped_arrow", new q().b("tipped_arrow"));
        net.minecraft.w.k.a(441, "lingering_potion", new aD().b("lingering_potion"));
        net.minecraft.w.k.a(442, "shield", new aR().b("shield"));
        net.minecraft.w.k.a(443, "elytra", new R().b("elytra"));
        net.minecraft.w.k.a(444, "spruce_boat", (k)new F(net.minecraft.J.g.SPRUCE));
        int n3 = n2;
        net.minecraft.w.k.a(445, "birch_boat", (k)new F(net.minecraft.J.g.BIRCH));
        net.minecraft.w.k.a(446, "jungle_boat", (k)new F(net.minecraft.J.g.JUNGLE));
        net.minecraft.w.k.a(447, "acacia_boat", (k)new F(net.minecraft.J.g.ACACIA));
        net.minecraft.w.k.a(448, "dark_oak_boat", (k)new F(net.minecraft.J.g.DARK_OAK));
        net.minecraft.w.k.a(449, "totem_of_undying", new k().b("totem").b(1).a(net.minecraft.ad.a.o));
        net.minecraft.w.k.a(450, "shulker_shell", new k().b("shulkerShell").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(452, "iron_nugget", new k().b("ironNugget").a(net.minecraft.ad.a.m));
        net.minecraft.w.k.a(453, "knowledge_book", new aH().b("knowledgeBook"));
        net.minecraft.w.k.a(2256, "record_13", new aV("13", net.minecraft.u.E.dt).b("record"));
        net.minecraft.w.k.a(2257, "record_cat", new aV("cat", net.minecraft.u.E.ap).b("record"));
        net.minecraft.w.k.a(2258, "record_blocks", new aV("blocks", net.minecraft.u.E.hR).b("record"));
        net.minecraft.w.k.a(2259, "record_chirp", new aV("chirp", net.minecraft.u.E.g_).b("record"));
        net.minecraft.w.k.a(2260, "record_far", new aV("far", net.minecraft.u.E.el).b("record"));
        net.minecraft.w.k.a(2261, "record_mall", new aV("mall", net.minecraft.u.E.gy).b("record"));
        net.minecraft.w.k.a(2262, "record_mellohi", new aV("mellohi", net.minecraft.u.E.fh).b("record"));
        net.minecraft.w.k.a(2263, "record_stal", new aV("stal", net.minecraft.u.E.i).b("record"));
        net.minecraft.w.k.a(2264, "record_strad", new aV("strad", net.minecraft.u.E.aR).b("record"));
        net.minecraft.w.k.a(2265, "record_ward", new aV("ward", net.minecraft.u.E.a4).b("record"));
        net.minecraft.w.k.a(2266, "record_11", new aV("11", net.minecraft.u.E.dK).b("record"));
        net.minecraft.w.k.a(2267, "record_wait", new aV("wait", net.minecraft.u.E.dW).b("record"));
        if (n3 == 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    private static void a(int n2, net.minecraft.ar.v v2, k k2) {
        q.a(n2, v2, k2);
    }

    public boolean d() {
        return this.a;
    }

    public int e() {
        return this.m;
    }

    @Nullable
    public k s() {
        return this.d;
    }

    public void a(d d10, net.minecraft.ah.z z2, net.minecraft.U.x x2, int n2, boolean bl2) {
    }

    public boolean p() {
        return false;
    }

    public aX a(net.minecraft.i.j j2, net.minecraft.ah.z z2, net.minecraft.k.n n2, a3 a32, net.minecraft.ar.aA aA2, float f10, float f11, float f12) {
        return aX.PASS;
    }

    public boolean a(d d10, d d11) {
        return false;
    }

    public void a(net.minecraft.ad.a a10, net.minecraft.ar.a2<d> a22) {
        int n2 = bl.g();
        boolean bl2 = this.b(a10);
        if (n2 != 0 && bl2) {
            bl2 = a22.add(new d(this));
        }
    }

    static {
        q = new net.minecraft.b.d();
        p = Maps.newHashMap();
        i = new bv();
        o = new b();
        l = new aO();
        g = new c();
        h = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
        b = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
        r = new Random();
        net.minecraft.w.k.b(true);
    }

    @Nullable
    public static k a(String string) {
        k k2 = q.a(new net.minecraft.ar.v(string));
        int n2 = bl.g();
        k k3 = k2;
        if (n2 != 0) {
            if (k3 == null) {
                try {
                    return net.minecraft.w.k.a(Integer.parseInt(string));
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            k3 = k2;
        }
        return k3;
    }

    public int c(int n2) {
        return 0;
    }

    public float a(d d10, net.minecraft.Z.i i2) {
        return 1.0f;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean b(net.minecraft.ad.a a10) {
        net.minecraft.ad.a a11 = this.j();
        int n2 = bl.c();
        net.minecraft.ad.a a12 = a11;
        if (n2 == 0) {
            if (a12 == null) return false;
            a12 = a10;
        }
        net.minecraft.ad.a a13 = net.minecraft.ad.a.b;
        if (n2 == 0) {
            if (a12 == a13) return true;
            a12 = a10;
            a13 = a11;
        }
        if (a12 != a13) return false;
        return true;
    }

    public int o() {
        return 0;
    }

    protected i a(net.minecraft.ah.z z2, net.minecraft.i.j j2, boolean bl2) {
        float f10 = j2.at;
        int n2 = bl.c();
        float f11 = j2.e;
        double d10 = j2.a;
        double d11 = j2.aF + (double)j2.l();
        double d12 = j2.ax;
        net.minecraft.k.l l2 = new net.minecraft.k.l(d10, d11, d12);
        float f12 = net.minecraft.k.h.c(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f13 = net.minecraft.k.h.g(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f14 = -net.minecraft.k.h.c(-f10 * ((float)Math.PI / 180));
        float f15 = net.minecraft.k.h.g(-f10 * ((float)Math.PI / 180));
        float f16 = f13 * f14;
        float f17 = f12 * f14;
        double d13 = 5.0;
        net.minecraft.k.l l3 = l2.c((double)f16 * 5.0, (double)f15 * 5.0, (double)f17 * 5.0);
        boolean bl3 = bl2;
        if (n2 == 0) {
            bl3 = !bl3;
        }
        return z2.a(l2, l3, bl2, bl3, false);
    }

    public h a(d d10) {
        return d10.r() ? net.minecraft.w.h.RARE : net.minecraft.w.h.COMMON;
    }

    public final void a(net.minecraft.ar.v v2, e e10) {
        this.j.a(v2, e10);
    }

    public static boolean f() {
        return k;
    }

    public k b(int n2) {
        this.f = n2;
        return this;
    }

    public d b() {
        return new d(this);
    }

    public boolean a(net.minecraft.P.r r2) {
        return false;
    }

    public int a() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f(d d10) {
        int n2 = bl.c();
        boolean bl2 = this.a();
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = this.i();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public k b(String string) {
        this.c = string;
        return this;
    }

    public d a(d d10, net.minecraft.ah.z z2, net.minecraft.U.B b10) {
        return d10;
    }

    @Nullable
    public e a(net.minecraft.ar.v v2) {
        return this.j.a(v2);
    }

    public k() {
        this.j = new net.minecraft.b.b<net.minecraft.ar.v, e>();
        this.f = 64;
        this.a(new net.minecraft.ar.v("lefthanded"), l);
        this.a(new net.minecraft.ar.v("cooldown"), g);
    }

    public String h(d d10) {
        return net.minecraft.ab.a.a(this.c(d10) + ".name").trim();
    }
}

