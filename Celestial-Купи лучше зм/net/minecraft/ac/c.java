/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ac;

import net.minecraft.ac.a;
import net.minecraft.ac.b;
import net.minecraft.ac.d;
import net.minecraft.ac.e;
import net.minecraft.ac.f;
import net.minecraft.ac.g;
import net.minecraft.ac.h;
import net.minecraft.k.m;

public class c {
    public static final /* synthetic */ c M;
    public static final /* synthetic */ c z;
    private /* synthetic */ b c;
    public static final /* synthetic */ c K;
    public static final /* synthetic */ c N;
    public static final /* synthetic */ c q;
    public static final /* synthetic */ c u;
    private /* synthetic */ boolean i;
    public static final /* synthetic */ c o;
    public static final /* synthetic */ c k;
    private /* synthetic */ boolean t;
    public static final /* synthetic */ c f;
    public static final /* synthetic */ c l;
    public static final /* synthetic */ c H;
    private static /* synthetic */ int[] C;
    public static final /* synthetic */ c r;
    public static final /* synthetic */ c e;
    public static final /* synthetic */ c R;
    public static final /* synthetic */ c I;
    public static final /* synthetic */ c L;
    public static final /* synthetic */ c g;
    public static final /* synthetic */ c G;
    public static final /* synthetic */ c P;
    public static final /* synthetic */ c p;
    public static final /* synthetic */ c E;
    private /* synthetic */ boolean a;
    public static final /* synthetic */ c h;
    private /* synthetic */ boolean d;
    public static final /* synthetic */ c Q;
    public static final /* synthetic */ c O;
    public static final /* synthetic */ c w;
    public static final /* synthetic */ c b;
    public static final /* synthetic */ c J;
    public static final /* synthetic */ c A;
    public static final /* synthetic */ c v;
    public static final /* synthetic */ c D;
    private final /* synthetic */ a s;
    public static final /* synthetic */ c n;
    public static final /* synthetic */ c j;
    public static final /* synthetic */ c y;
    public static final /* synthetic */ c F;
    private /* synthetic */ boolean B;
    public static final /* synthetic */ c x;
    public static final /* synthetic */ c m;

    public static void b(int[] arrn) {
        C = arrn;
    }

    protected c f() {
        this.B = true;
        return this;
    }

    static {
        A = new h(net.minecraft.ac.a.O);
        K = new c(net.minecraft.ac.a.t);
        q = new c(net.minecraft.ac.a.ad);
        k = new c(net.minecraft.ac.a.E).l();
        H = new c(net.minecraft.ac.a.T).q();
        D = new c(net.minecraft.ac.a.D).q();
        r = new c(net.minecraft.ac.a.D).q().r();
        L = new e(net.minecraft.ac.a.B).h();
        g = new e(net.minecraft.ac.a.X).h();
        J = new c(net.minecraft.ac.a.m).l().c().h();
        f = new f(net.minecraft.ac.a.m).h();
        z = new f(net.minecraft.ac.a.m).l().h().g();
        G = new c(net.minecraft.ac.a.g);
        x = new c(net.minecraft.ac.a.i).l();
        w = new h(net.minecraft.ac.a.O).h();
        o = new c(net.minecraft.ac.a.K);
        n = new f(net.minecraft.ac.a.O).h();
        e = new f(net.minecraft.ac.a.i).l();
        M = new c(net.minecraft.ac.a.O).c().f();
        R = new c(net.minecraft.ac.a.O).f();
        b = new c(net.minecraft.ac.a.X).l().c();
        j = new c(net.minecraft.ac.a.m).h();
        O = new c(net.minecraft.ac.a.u).c().f();
        l = new c(net.minecraft.ac.a.u).f();
        v = new f(net.minecraft.ac.a.b).g().c().q().h();
        E = new c(net.minecraft.ac.a.b).q();
        m = new c(net.minecraft.ac.a.m).c().h();
        N = new c(net.minecraft.ac.a.U);
        net.minecraft.ac.c.b(new int[4]);
        h = new c(net.minecraft.ac.a.m).h();
        p = new c(net.minecraft.ac.a.m).h();
        Q = new g(net.minecraft.ac.a.O).r();
        F = new c(net.minecraft.ac.a.O).h();
        I = new d(net.minecraft.ac.a.i).q().h();
        y = new c(net.minecraft.ac.a.T).r();
        P = new c(net.minecraft.ac.a.O).q().r();
        u = new h(net.minecraft.ac.a.O);
    }

    public boolean k() {
        return this.a;
    }

    private c c() {
        this.d = true;
        return this;
    }

    protected c l() {
        this.t = true;
        return this;
    }

    public c(a a10) {
        this.i = true;
        this.c = net.minecraft.ac.b.NORMAL;
        this.s = a10;
    }

    protected c q() {
        this.i = false;
        return this;
    }

    public a a() {
        return this.s;
    }

    public b m() {
        return this.c;
    }

    public boolean b() {
        return false;
    }

    public boolean d() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean e() {
        return this.t;
    }

    public c g() {
        this.a = true;
        return this;
    }

    public boolean n() {
        return true;
    }

    protected c r() {
        this.c = net.minecraft.ac.b.BLOCK;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean o() {
        m[] arrm = net.minecraft.ac.b.b();
        boolean bl2 = this.d;
        if (arrm == null) {
            if (bl2) return false;
            bl2 = this.n();
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static int[] i() {
        return C;
    }

    public boolean p() {
        return this.i;
    }

    protected c h() {
        this.c = net.minecraft.ac.b.DESTROY;
        return this;
    }

    public boolean j() {
        return true;
    }
}

