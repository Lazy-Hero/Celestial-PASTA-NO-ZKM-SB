/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.T.a4;
import net.minecraft.T.a5;
import net.minecraft.T.aS;
import net.minecraft.T.aT;
import net.minecraft.T.ao;
import net.minecraft.U.C;
import net.minecraft.U.E;
import net.minecraft.U.I;
import net.minecraft.U.e;
import net.minecraft.U.x;
import net.minecraft.a6;
import net.minecraft.ag.A;
import net.minecraft.ag.B;
import net.minecraft.ag.a1;
import net.minecraft.ag.b;
import net.minecraft.ag.c;
import net.minecraft.ag.g;
import net.minecraft.ag.h;
import net.minecraft.ag.i;
import net.minecraft.ag.t;
import net.minecraft.ag.y;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.H;
import net.minecraft.ak.K;
import net.minecraft.ak.M;
import net.minecraft.ak.Q;
import net.minecraft.ak.R;
import net.minecraft.ak.a7;
import net.minecraft.ak.aA;
import net.minecraft.ak.aE;
import net.minecraft.ak.aH;
import net.minecraft.ak.aX;
import net.minecraft.ak.aa;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.av.f;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.bl;
import net.minecraft.x.d;
import net.minecraft.y.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class W
extends E
implements I,
e {
    private /* synthetic */ String cM;
    private /* synthetic */ int cR;
    @Nullable
    private /* synthetic */ net.minecraft.i.j cT;
    private final /* synthetic */ net.minecraft.B.b cH;
    private /* synthetic */ boolean cN;
    private /* synthetic */ int cG;
    private static final /* synthetic */ Logger cF;
    private /* synthetic */ boolean cS;
    private /* synthetic */ boolean cU;
    private /* synthetic */ boolean cI;
    private /* synthetic */ boolean cJ;
    private static final /* synthetic */ a1[][][][] cL;
    @Nullable
    private /* synthetic */ a cV;
    /* synthetic */ net.minecraft.y.g cO;
    private /* synthetic */ boolean cP;
    private /* synthetic */ int cQ;
    private /* synthetic */ int cD;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cE;
    private /* synthetic */ int cK;

    @Override
    public void a(@Nullable a a10) {
    }

    @Override
    public n a() {
        return new n(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(net.minecraft.i.j j2, a3 a32) {
        boolean bl2;
        block10: {
            boolean bl3;
            String[] arrstring;
            block13: {
                block14: {
                    block12: {
                        W w2;
                        block11: {
                            boolean bl4;
                            net.minecraft.w.d d10 = j2.c(a32);
                            arrstring = net.minecraft.ag.A.b();
                            bl2 = bl4 = d10.w() == net.minecraft.u.h.bc;
                            if (arrstring != null) {
                                if (bl2) {
                                    d10.a(j2, (net.minecraft.U.B)this, a32);
                                    return true;
                                }
                                bl2 = this.a(d10, this.getClass());
                            }
                            if (arrstring == null) return bl2;
                            if (bl2) break block10;
                            bl2 = this.aL();
                            if (arrstring == null) return bl2;
                            if (!bl2) break block10;
                            bl2 = this.H();
                            if (arrstring == null) return bl2;
                            if (bl2) break block10;
                            bl2 = this.Q();
                            if (arrstring == null) return bl2;
                            if (bl2) break block10;
                            w2 = this;
                            if (arrstring == null) break block11;
                            if (w2.cV != null) break block12;
                            w2 = this;
                        }
                        w2.P();
                    }
                    if (a32 == net.minecraft.ar.a3.MAIN_HAND) {
                        j2.b(net.minecraft.l.m.u);
                    }
                    bl3 = this.aG.C;
                    if (arrstring == null) break block13;
                    if (bl3) break block14;
                    bl3 = this.cV.isEmpty();
                    if (arrstring == null) break block13;
                    if (!bl3) {
                        this.b(j2);
                        j2.a(this);
                        if (arrstring != null) return true;
                    }
                }
                bl3 = this.cV.isEmpty();
            }
            if (arrstring == null) return bl3;
            if (!bl3) return true;
            return super.b(j2, a32);
        }
        bl2 = super.b(j2, a32);
        return bl2;
    }

    private boolean b(int n2) {
        boolean bl2;
        block8: {
            String[] arrstring = net.minecraft.ag.A.b();
            int n3 = this.aa();
            if (arrstring != null) {
                n3 = n3 == 0 ? 1 : 0;
            }
            int n4 = n3;
            int n5 = 0;
            while (n5 < this.cH.e()) {
                block9: {
                    block10: {
                        int n6;
                        block23: {
                            net.minecraft.w.d d10;
                            block22: {
                                int n7;
                                net.minecraft.w.d d11;
                                block21: {
                                    block20: {
                                        int n8;
                                        block13: {
                                            block14: {
                                                net.minecraft.w.d d12;
                                                block19: {
                                                    net.minecraft.w.k k2;
                                                    net.minecraft.w.k k3;
                                                    block17: {
                                                        block18: {
                                                            block15: {
                                                                block16: {
                                                                    block11: {
                                                                        block12: {
                                                                            d11 = this.cH.a(n5);
                                                                            if (arrstring == null) break block9;
                                                                            bl2 = d11.G();
                                                                            if (arrstring == null) break block8;
                                                                            if (bl2) break block10;
                                                                            k3 = d11.w();
                                                                            k2 = net.minecraft.u.h.cG;
                                                                            if (arrstring == null) break block11;
                                                                            if (k3 != k2) break block12;
                                                                            n8 = d11.t();
                                                                            if (arrstring == null) break block13;
                                                                            if (n8 >= 3 * n2) break block14;
                                                                        }
                                                                        k3 = d11.w();
                                                                        k2 = net.minecraft.u.h.f;
                                                                    }
                                                                    if (arrstring == null) break block15;
                                                                    if (k3 != k2) break block16;
                                                                    n8 = d11.t();
                                                                    if (arrstring == null) break block13;
                                                                    if (n8 >= 12 * n2) break block14;
                                                                }
                                                                k3 = d11.w();
                                                                k2 = net.minecraft.u.h.aG;
                                                            }
                                                            if (arrstring == null) break block17;
                                                            if (k3 != k2) break block18;
                                                            n8 = d11.t();
                                                            if (arrstring == null) break block13;
                                                            if (n8 >= 12 * n2) break block14;
                                                        }
                                                        d12 = d11;
                                                        if (arrstring == null) break block19;
                                                        k3 = d12.w();
                                                        k2 = net.minecraft.u.h.b;
                                                    }
                                                    if (k3 != k2) break block20;
                                                    d12 = d11;
                                                }
                                                n7 = d12.t();
                                                if (arrstring == null) break block21;
                                                if (n7 < 12 * n2) break block20;
                                            }
                                            n8 = 1;
                                        }
                                        return n8 != 0;
                                    }
                                    n7 = n4;
                                }
                                if (n7 == 0) break block10;
                                d10 = d11;
                                if (arrstring == null) break block22;
                                if (d10.w() != net.minecraft.u.h.b1) break block10;
                                d10 = d11;
                            }
                            n6 = d10.t();
                            if (arrstring == null) break block23;
                            if (n6 < 9 * n2) break block10;
                            n6 = 1;
                        }
                        return n6 != 0;
                    }
                    ++n5;
                }
                if (arrstring != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public W a(E e10) {
        W w2 = new W(this.aG);
        w2.a(this.aG.h(new n(w2)), null);
        return w2;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.5);
    }

    @Override
    public void a(net.minecraft.y.b b10) {
        block14: {
            int n2;
            String[] arrstring;
            block10: {
                block13: {
                    block11: {
                        W w2;
                        block12: {
                            block9: {
                                block7: {
                                    block8: {
                                        String[] arrstring2 = net.minecraft.ag.A.b();
                                        b10.h();
                                        this.b_ = -this.X();
                                        this.a(net.minecraft.u.E.X, this.x(), this.p());
                                        arrstring = arrstring2;
                                        n2 = 3 + this.g.nextInt(4);
                                        if (arrstring == null) break block7;
                                        if (b10.c() == 1) break block8;
                                        w2 = this;
                                        if (arrstring == null) break block9;
                                        if (w2.g.nextInt(5) != 0) break block10;
                                    }
                                    this.cR = 40;
                                    this.cI = true;
                                    this.cJ = true;
                                }
                                w2 = this;
                            }
                            if (arrstring == null) break block11;
                            if (w2.cT == null) break block12;
                            this.cM = this.cT.g();
                            if (arrstring != null) break block13;
                        }
                        w2 = this;
                    }
                    w2.cM = null;
                }
                n2 += 5;
            }
            net.minecraft.y.b b11 = b10;
            if (arrstring != null) {
                if (b11.k().w() == net.minecraft.u.h.aO) {
                    this.cQ += b10.k().t();
                }
                b11 = b10;
            }
            boolean bl2 = b11.g();
            if (arrstring != null) {
                if (bl2) {
                    this.aG.f(new net.minecraft.J.E(this.aG, this.a, this.aF + 0.5, this.ax, n2));
                }
                bl2 = this.cT instanceof net.minecraft.i.k;
            }
            if (!bl2) break block14;
            a6.x.a((net.minecraft.i.k)this.cT, this, b10.l());
        }
    }

    public void r(boolean bl2) {
        this.cP = bl2;
    }

    @Override
    public void a(byte n2) {
        block2: {
            block5: {
                int n3;
                int n4;
                String[] arrstring;
                block3: {
                    block4: {
                        block0: {
                            block1: {
                                arrstring = net.minecraft.ag.A.b();
                                n4 = n2;
                                n3 = 12;
                                if (arrstring == null) break block0;
                                if (n4 != n3) break block1;
                                this.a(net.minecraft.ar.aH.HEART);
                                if (arrstring != null) break block2;
                            }
                            n4 = n2;
                            n3 = 13;
                        }
                        if (arrstring == null) break block3;
                        if (n4 != n3) break block4;
                        this.a(net.minecraft.ar.aH.VILLAGER_ANGRY);
                        if (arrstring != null) break block2;
                    }
                    n4 = n2;
                    n3 = 14;
                }
                if (n4 != n3) break block5;
                this.a(net.minecraft.ar.aH.VILLAGER_HAPPY);
                if (arrstring != null) break block2;
            }
            super.a((byte)n2);
        }
    }

    public boolean F() {
        return this.cN;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return this.H() ? net.minecraft.u.E.bR : net.minecraft.u.E.bE;
    }

    @Override
    public z c() {
        return this.aG;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.T;
    }

    public void t(boolean bl2) {
        this.cN = bl2;
    }

    @Override
    public void a(G g10) {
        block10: {
            W w2;
            block4: {
                block5: {
                    String[] arrstring;
                    block7: {
                        boolean bl2;
                        block8: {
                            x x2;
                            block9: {
                                x x3;
                                block6: {
                                    arrstring = net.minecraft.ag.A.b();
                                    w2 = this;
                                    if (arrstring == null) break block4;
                                    if (w2.cO == null) break block5;
                                    x3 = x2 = g10.h();
                                    if (arrstring == null) break block6;
                                    if (x3 == null) break block7;
                                    x3 = x2;
                                }
                                bl2 = x3 instanceof net.minecraft.i.j;
                                if (arrstring == null) break block8;
                                if (!bl2) break block9;
                                this.cO.a(x2.g(), -2);
                                if (arrstring != null) break block5;
                            }
                            bl2 = x2 instanceof net.minecraft.T.k;
                        }
                        if (!bl2) break block5;
                        this.cO.d();
                        if (arrstring != null) break block5;
                    }
                    net.minecraft.i.j j2 = this.aG.a((x)this, 16.0);
                    if (arrstring == null) break block10;
                    if (j2 != null) {
                        this.cO.d();
                    }
                }
                w2 = this;
            }
            super.a(g10);
        }
    }

    @Override
    @Nullable
    public a a(net.minecraft.i.j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        a a10 = this.cV;
        if (arrstring != null) {
            if (a10 == null) {
                this.P();
            }
            a10 = this.cV;
        }
        return a10;
    }

    public W(z z2) {
        this(z2, 0);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.t;
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        return false;
    }

    @Override
    public void c(@Nullable net.minecraft.U.B b10) {
        block5: {
            W w2;
            block9: {
                boolean bl2;
                block8: {
                    int n2;
                    String[] arrstring;
                    block7: {
                        net.minecraft.U.B b11;
                        block6: {
                            block4: {
                                String[] arrstring2 = net.minecraft.ag.A.b();
                                super.c(b10);
                                arrstring = arrstring2;
                                b11 = this;
                                if (arrstring == null) break block4;
                                if (b11.cO == null) break block5;
                                b11 = b10;
                            }
                            if (arrstring == null) break block6;
                            if (b11 == null) break block5;
                            this.cO.b(b10);
                            b11 = b10;
                        }
                        n2 = b11 instanceof net.minecraft.i.j;
                        if (arrstring == null) break block7;
                        if (n2 == 0) break block5;
                        n2 = -1;
                    }
                    int n3 = n2;
                    bl2 = this.Q();
                    if (arrstring == null) break block8;
                    if (bl2) {
                        n3 = -3;
                    }
                    this.cO.a(b10.g(), n3);
                    w2 = this;
                    if (arrstring == null) break block9;
                    bl2 = w2.aL();
                }
                if (!bl2) break block5;
                w2 = this;
            }
            w2.aG.a((x)this, (byte)13);
        }
    }

    static {
        cF = LogManager.getLogger();
        cE = net.minecraft.q.m.a(W.class, net.minecraft.q.h.n);
        cL = new a1[][][][]{{{{new h(net.minecraft.u.h.b1, new b(18, 22)), new h(net.minecraft.u.h.f, new b(15, 19)), new h(net.minecraft.u.h.aG, new b(15, 19)), new i(net.minecraft.u.h.cG, new b(-4, -2))}, {new h(net.minecraft.w.k.b(net.minecraft.u.g.G), new b(8, 13)), new i(net.minecraft.u.h.ck, new b(-3, -2))}, {new h(net.minecraft.w.k.b(net.minecraft.u.g.ae), new b(7, 12)), new i(net.minecraft.u.h.ci, new b(-7, -5))}, {new i(net.minecraft.u.h.ae, new b(-10, -6)), new i(net.minecraft.u.h.aW, new b(1, 1))}}, {{new h(net.minecraft.u.h.aC, new b(15, 20)), new h(net.minecraft.u.h.b4, new b(16, 24)), new c(net.minecraft.u.h.aw, new b(6, 6), net.minecraft.u.h.cd, new b(6, 6))}, {new y(net.minecraft.u.h.bQ, new b(7, 8))}}, {{new h(net.minecraft.w.k.b(net.minecraft.u.g.s), new b(16, 22)), new i(net.minecraft.u.h.aT, new b(3, 4))}, {new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s)), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 1), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 2), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 3), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 4), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 5), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 6), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 7), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 8), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 9), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 10), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 11), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 12), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 13), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 14), new b(1, 2)), new i(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, 15), new b(1, 2))}}, {{new h(net.minecraft.u.h.aC, new b(15, 20)), new i(net.minecraft.u.h.x, new b(-12, -8))}, {new i(net.minecraft.u.h.i, new b(2, 3)), new c(net.minecraft.w.k.b(net.minecraft.u.g.di), new b(10, 10), net.minecraft.u.h.aj, new b(6, 10))}}}, {{{new h(net.minecraft.u.h.C, new b(24, 36)), new g()}, {new h(net.minecraft.u.h.b8, new b(8, 10)), new i(net.minecraft.u.h.b7, new b(10, 12)), new i(net.minecraft.w.k.b(net.minecraft.u.g.c8), new b(3, 4))}, {new h(net.minecraft.u.h.as, new b(2, 2)), new i(net.minecraft.u.h.br, new b(10, 12)), new i(net.minecraft.w.k.b(net.minecraft.u.g.a), new b(-5, -3))}, {new g()}, {new g()}, {new i(net.minecraft.u.h.bc, new b(20, 22))}}, {{new h(net.minecraft.u.h.C, new b(24, 36))}, {new h(net.minecraft.u.h.b7, new b(1, 1))}, {new i(net.minecraft.u.h.Y, new b(7, 11))}, {new t(new b(12, 20), "Monument", net.minecraft.aw.C.MONUMENT), new t(new b(16, 28), "Mansion", net.minecraft.aw.C.MANSION)}}}, {{{new h(net.minecraft.u.h.ba, new b(36, 40)), new h(net.minecraft.u.h.I, new b(8, 10))}, {new i(net.minecraft.u.h.a7, new b(-4, -1)), new i(new net.minecraft.w.d(net.minecraft.u.h.aL, 1, bl.BLUE.a()), new b(-2, -1))}, {new i(net.minecraft.u.h.o, new b(4, 7)), new i(net.minecraft.w.k.b(net.minecraft.u.g.W), new b(-3, -1))}, {new i(net.minecraft.u.h.bG, new b(3, 11))}}}, {{{new h(net.minecraft.u.h.b4, new b(16, 24)), new i(net.minecraft.u.h.af, new b(4, 6))}, {new h(net.minecraft.u.h.ad, new b(7, 9)), new i(net.minecraft.u.h.aK, new b(10, 14))}, {new h(net.minecraft.u.h.ag, new b(3, 4)), new y(net.minecraft.u.h.an, new b(16, 19))}, {new i(net.minecraft.u.h.b_, new b(5, 7)), new i(net.minecraft.u.h.H, new b(9, 11)), new i(net.minecraft.u.h.p, new b(5, 7)), new i(net.minecraft.u.h.a4, new b(11, 15))}}, {{new h(net.minecraft.u.h.b4, new b(16, 24)), new i(net.minecraft.u.h.cv, new b(6, 8))}, {new h(net.minecraft.u.h.ad, new b(7, 9)), new y(net.minecraft.u.h.bs, new b(9, 10))}, {new h(net.minecraft.u.h.ag, new b(3, 4)), new y(net.minecraft.u.h.bN, new b(12, 15)), new y(net.minecraft.u.h.b9, new b(9, 12))}}, {{new h(net.minecraft.u.h.b4, new b(16, 24)), new y(net.minecraft.u.h.u, new b(5, 7))}, {new h(net.minecraft.u.h.ad, new b(7, 9)), new y(net.minecraft.u.h.aZ, new b(9, 11))}, {new h(net.minecraft.u.h.ag, new b(3, 4)), new y(net.minecraft.u.h.cm, new b(12, 15))}}}, {{{new h(net.minecraft.u.h.aP, new b(14, 18)), new h(net.minecraft.u.h.bp, new b(14, 18))}, {new h(net.minecraft.u.h.b4, new b(16, 24)), new i(net.minecraft.u.h.cw, new b(-7, -5)), new i(net.minecraft.u.h.F, new b(-8, -6))}}, {{new h(net.minecraft.u.h.aQ, new b(9, 12)), new i(net.minecraft.u.h.E, new b(2, 4))}, {new y(net.minecraft.u.h.cy, new b(7, 12))}, {new i(net.minecraft.u.h.be, new b(8, 10))}}}, {new a1[0][]}};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(net.minecraft.w.k k2) {
        String[] arrstring = net.minecraft.ag.A.b();
        net.minecraft.w.k k3 = k2;
        net.minecraft.w.k k4 = net.minecraft.u.h.cG;
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.f;
        }
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.aG;
        }
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.b1;
        }
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.a6;
        }
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.b;
        }
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.bR;
        }
        if (k3 != k4) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, net.minecraft.w.d d10) {
        int n3;
        String[] arrstring = net.minecraft.ag.A.b();
        int n4 = super.a(n2, d10);
        if (arrstring != null) {
            if (n4 != 0) {
                return true;
            }
            n4 = n2 - 300;
        }
        int n5 = n3 = n4;
        if (arrstring == null) return n5 != 0;
        if (n5 < 0) return 0 != 0;
        n5 = n3;
        if (arrstring == null) return n5 != 0;
        if (n5 >= this.cH.e()) return 0 != 0;
        this.cH.a(n3, d10);
        return true;
    }

    public boolean s(boolean bl2) {
        boolean bl3;
        block5: {
            block6: {
                String[] arrstring = net.minecraft.ag.A.b();
                bl3 = this.cJ;
                if (arrstring == null) break block5;
                if (bl3) break block6;
                bl3 = bl2;
                if (arrstring == null) break block5;
                if (!bl3) break block6;
                bl3 = this.D();
                if (arrstring == null) break block5;
                if (!bl3) break block6;
                int n2 = 0;
                for (int i2 = 0; i2 < this.cH.e(); ++i2) {
                    int n3;
                    block7: {
                        block8: {
                            net.minecraft.w.d d10;
                            block12: {
                                net.minecraft.w.d d11;
                                block13: {
                                    net.minecraft.w.k k2;
                                    net.minecraft.w.k k3;
                                    block9: {
                                        block11: {
                                            block10: {
                                                d11 = this.cH.a(i2);
                                                bl3 = d11.G();
                                                if (arrstring == null) break block5;
                                                if (arrstring == null) break block7;
                                                if (bl3) break block8;
                                                k3 = d11.w();
                                                k2 = net.minecraft.u.h.cG;
                                                if (arrstring == null) break block9;
                                                if (k3 != k2) break block10;
                                                d10 = d11;
                                                if (arrstring == null) break block11;
                                                if (d10.t() < 3) break block10;
                                                n2 = 1;
                                                this.cH.a(i2, 3);
                                                if (arrstring != null) break block8;
                                            }
                                            d10 = d11;
                                        }
                                        if (arrstring == null) break block12;
                                        k3 = d10.w();
                                        k2 = net.minecraft.u.h.f;
                                    }
                                    if (k3 == k2) break block13;
                                    d10 = d11;
                                    if (arrstring == null) break block12;
                                    if (d10.w() != net.minecraft.u.h.aG) break block8;
                                }
                                d10 = d11;
                            }
                            n3 = d10.t();
                            if (arrstring == null) break block7;
                            if (n3 >= 12) {
                                n2 = 1;
                                this.cH.a(i2, 12);
                            }
                        }
                        n3 = n2;
                    }
                    if (n3 == false) continue;
                    this.aG.a((x)this, (byte)18);
                    this.cJ = true;
                    if (arrstring != null) break;
                    if (arrstring != null) continue;
                }
            }
            bl3 = this.cJ;
        }
        return bl3;
    }

    public void a(int n2) {
        this.ap.b(cE, n2);
    }

    @Override
    protected void h() {
        W w2;
        block14: {
            block15: {
                W w3;
                block16: {
                    block9: {
                        int n2;
                        Object object;
                        Object object2;
                        int n3;
                        String[] arrstring;
                        block10: {
                            block11: {
                                net.minecraft.y.g g10;
                                block12: {
                                    block13: {
                                        arrstring = net.minecraft.ag.A.b();
                                        n3 = this.cK = this.cK - 1;
                                        if (arrstring == null) break block10;
                                        if (n3 > 0) break block11;
                                        object2 = new n(this);
                                        this.aG.n().b((n)object2);
                                        this.cK = 70 + this.g.nextInt(50);
                                        g10 = this.cO = this.aG.n().a((n)object2, 32);
                                        if (arrstring == null) break block12;
                                        if (g10 != null) break block13;
                                        this.j();
                                        if (arrstring != null) break block11;
                                    }
                                    g10 = this.cO;
                                }
                                object = g10.b();
                                this.a((n)object, this.cO.j());
                                n3 = this.cS ? 1 : 0;
                                if (arrstring == null) break block10;
                                if (n3 != 0) {
                                    this.cS = false;
                                    this.cO.a(5);
                                }
                            }
                            w2 = this;
                            if (arrstring == null) break block14;
                            n3 = w2.H() ? 1 : 0;
                        }
                        if (n3 != 0) break block15;
                        w2 = this;
                        if (arrstring == null) break block14;
                        if (w2.cR <= 0) break block15;
                        --this.cR;
                        w2 = this;
                        if (arrstring == null) break block14;
                        if (w2.cR > 0) break block15;
                        w3 = this;
                        if (arrstring == null) break block16;
                        if (!w3.cI) break block9;
                        object2 = this.cV.iterator();
                        while (object2.hasNext()) {
                            block18: {
                                Object object3;
                                block17: {
                                    object3 = object = (net.minecraft.y.b)object2.next();
                                    if (arrstring == null) break block17;
                                    n2 = ((net.minecraft.y.b)object3).j();
                                    if (arrstring == null) break block9;
                                    if (n2 == 0) break block18;
                                    object3 = object;
                                }
                                ((net.minecraft.y.b)object3).a(this.g.nextInt(6) + this.g.nextInt(6) + 2);
                            }
                            if (arrstring != null) continue;
                        }
                        this.P();
                        this.cI = false;
                        w3 = this;
                        if (arrstring == null) break block16;
                        if (w3.cO == null) break block9;
                        w3 = this;
                        if (arrstring == null) break block16;
                        if (w3.cM != null) {
                            this.aG.a((x)this, (byte)14);
                            n2 = this.cO.a(this.cM, 1);
                        }
                    }
                    w3 = this;
                }
                w3.b(new net.minecraft.K.j(net.minecraft.u.c.t, 200, 0));
            }
            w2 = this;
        }
        super.h();
    }

    @Override
    @Nullable
    public net.minecraft.i.j b() {
        return this.cT;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.eX;
    }

    public boolean U() {
        boolean bl2;
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl3 = this.aa();
        if (arrstring != null) {
            bl3 = !bl3;
        }
        boolean bl4 = bl2 = bl3;
        if (arrstring != null) {
            if (bl4) {
                boolean bl5 = this.b(5);
                if (arrstring != null) {
                    bl5 = !bl5;
                }
                return bl5;
            }
            bl4 = (this.b(1) ? 1 : 0) != 0;
        }
        if (arrstring != null) {
            bl4 = !bl4;
        }
        return bl4;
    }

    @Override
    public float l() {
        return this.Q() ? 0.81f : 1.62f;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cE, 0);
    }

    public boolean z() {
        boolean bl2;
        block3: {
            int n2 = 0;
            String[] arrstring = net.minecraft.ag.A.b();
            while (n2 < this.cH.e()) {
                block4: {
                    block5: {
                        block7: {
                            net.minecraft.w.k k2;
                            net.minecraft.w.k k3;
                            block9: {
                                net.minecraft.w.d d10;
                                block8: {
                                    block6: {
                                        d10 = this.cH.a(n2);
                                        if (arrstring == null) break block4;
                                        bl2 = d10.G();
                                        if (arrstring == null) break block3;
                                        if (bl2) break block5;
                                        k3 = d10.w();
                                        k2 = net.minecraft.u.h.a6;
                                        if (arrstring == null) break block6;
                                        if (k3 == k2) break block7;
                                        k3 = d10.w();
                                        k2 = net.minecraft.u.h.f;
                                    }
                                    if (arrstring == null) break block8;
                                    if (k3 == k2) break block7;
                                    k3 = d10.w();
                                    k2 = net.minecraft.u.h.aG;
                                }
                                if (arrstring == null) break block9;
                                if (k3 == k2) break block7;
                                k3 = d10.w();
                                k2 = net.minecraft.u.h.bR;
                            }
                            if (k3 != k2) break block5;
                        }
                        return true;
                    }
                    ++n2;
                }
                if (arrstring != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public W(z z2, int n2) {
        super(z2);
        this.cH = new net.minecraft.B.b("Items", false, 8);
        this.a(n2);
        this.c(0.6f, 1.95f);
        ((net.minecraft.e.k)this.l()).d(true);
        this.o(true);
    }

    public void a(boolean bl2) {
        this.cJ = bl2;
    }

    @Override
    protected boolean k() {
        return false;
    }

    private void P() {
        block14: {
            int n2;
            a1[][] arra1;
            int n3;
            String[] arrstring;
            block15: {
                int n4;
                int n5;
                a1[][][] arra12;
                block13: {
                    block12: {
                        block10: {
                            W w2;
                            block11: {
                                arra12 = cL[this.aa()];
                                arrstring = net.minecraft.ag.A.b();
                                w2 = this;
                                if (arrstring == null) break block10;
                                if (w2.cG == 0) break block11;
                                w2 = this;
                                if (arrstring == null) break block10;
                                if (w2.cD == 0) break block11;
                                ++this.cD;
                                if (arrstring != null) break block12;
                            }
                            this.cG = this.g.nextInt(arra12.length) + 1;
                            w2 = this;
                        }
                        w2.cD = 1;
                    }
                    W w3 = this;
                    if (arrstring != null) {
                        if (w3.cV == null) {
                            this.cV = new a();
                        }
                        w3 = this;
                    }
                    n5 = w3.cG - 1;
                    n3 = this.cD - 1;
                    n4 = n5;
                    if (arrstring == null) break block13;
                    if (n4 < 0) break block14;
                    n4 = n5;
                }
                if (n4 >= arra12.length) break block14;
                arra1 = arra12[n5];
                n2 = n3;
                if (arrstring == null) break block15;
                if (n2 < 0) break block14;
                n2 = n3;
            }
            if (n2 < arra1.length) {
                a1[] arra13;
                for (a1 a12 : arra13 = arra1[n3]) {
                    a12.a(this, this.cV, this.g);
                    if (arrstring != null) continue;
                }
            }
        }
    }

    @Override
    protected void H() {
        String[] arrstring = net.minecraft.ag.A.b();
        this.b5.a(0, new net.minecraft.ak.W(this));
        String[] arrstring2 = arrstring;
        this.b5.a(1, new net.minecraft.ak.m<a4>(this, a4.class, 8.0f, 0.6, 0.6));
        this.b5.a(1, new net.minecraft.ak.m<ao>(this, ao.class, 12.0f, 0.8, 0.8));
        this.b5.a(1, new net.minecraft.ak.m<aT>(this, aT.class, 8.0f, 0.8, 0.8));
        this.b5.a(1, new net.minecraft.ak.m<aS>(this, aS.class, 8.0f, 0.6, 0.6));
        this.b5.a(1, new aE(this));
        this.b5.a(1, new aH(this));
        this.b5.a(2, new H(this));
        this.b5.a(3, new R(this));
        this.b5.a(4, new net.minecraft.ak.r(this, true));
        this.b5.a(5, new M(this, 0.6));
        this.b5.a(6, new net.minecraft.ak.a6(this));
        this.b5.a(7, new net.minecraft.ak.x(this));
        this.b5.a(9, new a7(this, net.minecraft.i.j.class, 3.0f, 1.0f));
        this.b5.a(9, new aX(this));
        this.b5.a(9, new aA(this, 0.6));
        this.b5.a(10, new aa(this, C.class, 8.0f));
        if (arrstring2 == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    @Override
    public void f(r r2) {
        block8: {
            String[] arrstring;
            block10: {
                W w2;
                String string;
                r r3;
                block9: {
                    String[] arrstring2 = net.minecraft.ag.A.b();
                    super.f(r2);
                    r2.b("Profession", this.aa());
                    arrstring = arrstring2;
                    r2.b("Riches", this.cQ);
                    r2.b("Career", this.cG);
                    r2.b("CareerLevel", this.cD);
                    r3 = r2;
                    string = "Willing";
                    w2 = this;
                    if (arrstring == null) break block9;
                    r3.a(string, w2.cJ);
                    if (this.cV == null) break block10;
                    r3 = r2;
                    string = "Offers";
                    w2 = this;
                }
                r3.a(string, w2.cV.a());
            }
            u u2 = new u();
            int n2 = 0;
            while (n2 < this.cH.e()) {
                net.minecraft.w.d d10 = this.cH.a(n2);
                if (arrstring != null) {
                    if (arrstring != null) {
                        if (!d10.G()) {
                            u2.a(d10.a(new r()));
                        }
                        ++n2;
                    }
                    if (arrstring != null) continue;
                }
                break block8;
            }
            r2.a("Inventory", u2);
        }
    }

    @Override
    public void a(r r2) {
        block6: {
            net.minecraft.P.i i2;
            String[] arrstring = net.minecraft.ag.A.b();
            super.a(r2);
            this.a(r2.m("Profession"));
            this.cQ = r2.m("Riches");
            String[] arrstring2 = arrstring;
            this.cG = r2.m("Career");
            this.cD = r2.m("CareerLevel");
            this.cJ = r2.f("Willing");
            r r3 = r2;
            String string = "Offers";
            int n2 = 10;
            if (arrstring2 != null) {
                if (r3.a(string, n2)) {
                    i2 = r2.h("Offers");
                    this.cV = new a((r)i2);
                }
                r3 = r2;
                string = "Inventory";
                n2 = 10;
            }
            i2 = r3.c(string, n2);
            int n3 = 0;
            while (n3 < ((u)i2).b()) {
                net.minecraft.w.d d10 = new net.minecraft.w.d(((u)i2).d(n3));
                if (arrstring2 != null) {
                    if (arrstring2 != null) {
                        if (!d10.G()) {
                            this.cH.a(d10);
                        }
                        ++n3;
                    }
                    if (arrstring2 != null) continue;
                }
                break block6;
            }
            this.o(true);
            this.ah();
        }
    }

    @Override
    protected void a(net.minecraft.J.t t2) {
        block3: {
            net.minecraft.w.d d10;
            net.minecraft.w.d d11;
            block4: {
                net.minecraft.w.d d12;
                block5: {
                    W w2;
                    String[] arrstring;
                    block2: {
                        d12 = t2.m();
                        arrstring = net.minecraft.ag.A.b();
                        net.minecraft.w.k k2 = d12.w();
                        w2 = this;
                        if (arrstring == null) break block2;
                        if (!w2.a(k2)) break block3;
                        w2 = this;
                    }
                    d10 = d11 = w2.cH.a(d12);
                    if (arrstring == null) break block4;
                    if (!d10.G()) break block5;
                    t2.a();
                    if (arrstring != null) break block3;
                }
                d10 = d12;
            }
            d10.c(d11.t());
        }
    }

    @Override
    public void b(@Nullable net.minecraft.i.j j2) {
        this.cT = j2;
    }

    public int aa() {
        return Math.max(this.ap.b(cE) % 6, 0);
    }

    public boolean D() {
        return this.b(1);
    }

    @Override
    public void a(net.minecraft.w.d d10) {
        block3: {
            W w2;
            block4: {
                int n2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    n2 = this.aG.C;
                    if (arrstring == null) break block2;
                    if (n2 != 0) break block3;
                    w2 = this;
                    if (arrstring == null) break block4;
                    n2 = w2.b_;
                }
                if (n2 <= -this.X() + 20) break block3;
                this.b_ = -this.X();
                w2 = this;
            }
            w2.a(d10.G() ? net.minecraft.u.E.gS : net.minecraft.u.E.X, this.x(), this.p());
        }
    }

    private void a(net.minecraft.ar.aH aH2) {
        String[] arrstring = net.minecraft.ag.A.b();
        for (int i2 = 0; i2 < 5; ++i2) {
            double d10 = this.g.nextGaussian() * 0.02;
            double d11 = this.g.nextGaussian() * 0.02;
            double d12 = this.g.nextGaussian() * 0.02;
            this.aG.a(aH2, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 1.0 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, d10, d11, d12, new int[0]);
            if (arrstring != null) continue;
        }
    }

    public net.minecraft.B.b b() {
        return this.cH;
    }

    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2, boolean bl2) {
        j2 = super.a(h2, j2);
        String[] arrstring = net.minecraft.ag.A.b();
        if (arrstring != null) {
            if (bl2) {
                this.a(this.aG.J.nextInt(6));
            }
            this.ah();
            this.P();
        }
        return j2;
    }

    public boolean E() {
        return this.b(2);
    }

    static Logger a() {
        return cF;
    }

    @Override
    protected void b() {
        String[] arrstring = net.minecraft.ag.A.b();
        W w2 = this;
        if (arrstring != null) {
            if (w2.aa() == 0) {
                this.b5.a(8, new K(this, 0.6));
            }
            w2 = this;
        }
        super.b();
    }

    public void Q() {
        this.cS = true;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        return this.a(h2, j2, true);
    }

    public static void b(net.minecraft.av.b b10) {
        C.a(b10, W.class);
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new d(W.class, "Inventory"));
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new B());
    }

    public boolean H() {
        return this.cT != null;
    }

    private void ah() {
        block3: {
            W w2;
            block6: {
                int n2;
                block4: {
                    String[] arrstring;
                    block5: {
                        block2: {
                            arrstring = net.minecraft.ag.A.b();
                            n2 = this.cU;
                            if (arrstring == null) break block2;
                            if (n2 != 0) break block3;
                            this.cU = true;
                            n2 = this.Q();
                        }
                        if (arrstring == null) break block4;
                        if (n2 == 0) break block5;
                        this.b5.a(8, new Q(this, 0.32));
                        if (arrstring != null) break block3;
                    }
                    w2 = this;
                    if (arrstring == null) break block6;
                    n2 = w2.aa();
                }
                if (n2 != 0) break block3;
                w2 = this;
            }
            w2.b5.a(6, new K(this, 0.6));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public k d() {
        block33: {
            block32: {
                block31: {
                    block30: {
                        var2_1 = this.aM();
                        var1_2 = net.minecraft.ag.A.b();
                        v0 = var3_3 = this.aB();
                        if (var1_2 == null) break block30;
                        if (v0 == null) break block31;
                        v0 = var3_3;
                    }
                    if (!v0.isEmpty()) {
                        var4_4 = new net.minecraft.at.g(net.minecraft.D.m.a(var2_1, var3_3));
                        var4_4.e().a(this.aP());
                        var4_4.e().a(this.a2());
                        return var4_4;
                    }
                }
                v1 = this;
                if (var1_2 == null) break block32;
                if (v1.cV != null) break block33;
                v1 = this;
            }
            v1.P();
        }
        var4_5 = null;
        v2 = this.aa();
        if (var1_2 == null) ** GOTO lbl29
        switch (v2) {
            case 0: {
                v2 = this.cG;
lbl29:
                // 2 sources

                v3 = 1;
                if (var1_2 != null) {
                    if (v2 == v3) {
                        var4_5 = "farmer";
                        break;
                    }
                    v2 = this.cG;
                    v3 = 2;
                }
                if (var1_2 != null) {
                    if (v2 == v3) {
                        var4_5 = "fisherman";
                        break;
                    }
                    v2 = this.cG;
                    v3 = 3;
                }
                if (var1_2 != null) {
                    if (v2 == v3) {
                        var4_5 = "shepherd";
                        break;
                    }
                    v2 = this.cG;
                    v3 = 4;
                }
                if (v2 != v3) break;
                var4_5 = "fletcher";
                break;
            }
            case 1: {
                v4 = this.cG;
                v5 = 1;
                if (var1_2 != null) {
                    if (v4 == v5) {
                        var4_5 = "librarian";
                        break;
                    }
                    v4 = this.cG;
                    v5 = 2;
                }
                if (v4 != v5) break;
                var4_5 = "cartographer";
                break;
            }
            case 2: {
                var4_5 = "cleric";
                break;
            }
            case 3: {
                v6 = this.cG;
                v7 = 1;
                if (var1_2 != null) {
                    if (v6 == v7) {
                        var4_5 = "armor";
                        break;
                    }
                    v6 = this.cG;
                    v7 = 2;
                }
                if (var1_2 != null) {
                    if (v6 == v7) {
                        var4_5 = "weapon";
                        break;
                    }
                    v6 = this.cG;
                    v7 = 3;
                }
                if (v6 != v7) break;
                var4_5 = "tool";
                break;
            }
            case 4: {
                v8 = this.cG;
                v9 = 1;
                if (var1_2 != null) {
                    if (v8 == v9) {
                        var4_5 = "butcher";
                        break;
                    }
                    v8 = this.cG;
                    v9 = 2;
                }
                if (v8 != v9) break;
                var4_5 = "leather";
                break;
            }
            case 5: {
                var4_5 = "nitwit";
                break;
            }
        }
        if (var4_5 == null) return super.d();
        var5_6 = new net.minecraft.at.h("entity.Villager." + var4_5, new Object[0]);
        var5_6.e().a(this.aP());
        v10 = var5_6;
        if (var1_2 == null) return v10;
        v10.e().a(this.a2());
        if (var2_1 != null) {
            var5_6.e().a(var2_1.e());
        }
        v10 = var5_6;
        return v10;
    }

    @Override
    public void a(net.minecraft.an.b b10) {
        block7: {
            boolean bl2;
            String[] arrstring;
            block6: {
                arrstring = net.minecraft.ag.A.b();
                bl2 = this.aG.C;
                if (arrstring == null) break block6;
                if (bl2) break block7;
                bl2 = this.P;
            }
            if (!bl2) {
                a5 a52 = new a5(this.aG);
                a52.c(this.a, this.aF, this.ax, this.e, this.at);
                a52.a(this.aG.h(new n(a52)), null);
                a52.m(this.T());
                boolean bl3 = this.g();
                if (arrstring != null) {
                    if (bl3) {
                        a52.a(this.aB());
                        a52.b(this.i());
                    }
                    bl3 = this.aG.f(a52);
                }
                this.a();
            }
        }
    }

    public boolean Y() {
        return this.cP;
    }
}

