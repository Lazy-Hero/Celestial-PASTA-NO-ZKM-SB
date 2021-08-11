/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.ae;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.a1;
import net.minecraft.Z.i;
import net.minecraft.ab.a;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.V;
import net.minecraft.ag.e;
import net.minecraft.ag.k;
import net.minecraft.ag.l;
import net.minecraft.ag.m;
import net.minecraft.ag.o;
import net.minecraft.ag.p;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.G;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.al;
import net.minecraft.ak.at;
import net.minecraft.ak.au;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P
extends C {
    private /* synthetic */ boolean cJ;
    private /* synthetic */ int cM;
    private /* synthetic */ int cK;
    private /* synthetic */ int cL;
    private /* synthetic */ int cI;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cH;

    static at a(P p2) {
        return p2.bX;
    }

    @Override
    public void E() {
        block3: {
            P p2;
            block4: {
                int n2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.E();
                    String[] arrstring2 = arrstring;
                    n2 = this.cL++;
                    if (arrstring2 == null) break block2;
                    if (n2 != this.cK && arrstring2 != null) break block3;
                    p2 = this;
                    if (arrstring2 == null) break block4;
                    n2 = p2.cK;
                }
                if (n2 == 0) break block3;
                this.cL = 0;
                this.cK = 0;
                p2 = this;
            }
            p2.l(false);
        }
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.a(r2.m("RabbitType"));
        this.cI = r2.m("MoreCarrotTicks");
    }

    @Override
    public boolean j(x x2) {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = this.H();
        if (arrstring != null) {
            if (n2 == 99) {
                this.a(net.minecraft.u.E.a8, 1.0f, (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
                return x2.a(net.minecraft.ar.G.a(this), 8.0f);
            }
            n2 = x2.a(net.minecraft.ar.G.a(this), 3.0f) ? 1 : 0;
        }
        return n2 != 0;
    }

    private void R() {
        this.c();
        this.Q();
    }

    @Override
    public P a(E e10) {
        P p2;
        block2: {
            int n2;
            P p3;
            block3: {
                int n3;
                block4: {
                    block5: {
                        p3 = new P(this.aG);
                        n2 = this.m();
                        String[] arrstring = net.minecraft.ag.A.b();
                        p2 = this;
                        if (arrstring == null) break block2;
                        if (p2.g.nextInt(20) == 0) break block3;
                        n3 = e10 instanceof P;
                        if (arrstring == null) break block4;
                        if (n3 == 0) break block5;
                        n3 = this.g.nextBoolean() ? 1 : 0;
                        if (arrstring == null) break block4;
                        if (n3 == 0) break block5;
                        n2 = ((P)e10).H();
                        if (arrstring != null) break block3;
                    }
                    n3 = this.H();
                }
                n2 = n3;
            }
            p3.a(n2);
            p2 = p3;
        }
        return p2;
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, P.class);
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("RabbitType", this.H());
        r2.b("MoreCarrotTicks", this.cI);
    }

    public void b(double d10) {
        this.l().a(d10);
        this.b9.a(this.b9.b(), this.b9.e(), this.b9.f(), d10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected float T() {
        block14: {
            block13: {
                block12: {
                    block10: {
                        block11: {
                            block9: {
                                var1_1 = net.minecraft.ag.A.b();
                                v0 = this.aE;
                                if (var1_1 == null) break block9;
                                if (v0 != false) return 0.5f;
                                v1 = this;
                                if (var1_1 == null) break block10;
                                v0 = v1.b9.c();
                            }
                            if (!v0) break block11;
                            v1 = this;
                            if (var1_1 == null) break block10;
                            if (!(v1.b9.e() <= this.aF + 0.5)) return 0.5f;
                        }
                        v1 = this;
                    }
                    v2 = var2_2 = v1.b7.k();
                    if (var1_1 == null) break block12;
                    if (v2 == null) break block13;
                    v2 = var2_2;
                }
                v3 = v2.a();
                if (var1_1 == null) break block14;
                if (v3 < var2_2.f()) {
                    var3_3 = var2_2.a(this);
                    cfr_temp_0 = var3_3.d - (this.aF + 0.5);
                    v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                    if (var1_1 != null) {
                        if (v3 > 0) {
                            return 0.5f;
                        } else {
                            ** GOTO lbl32
                        }
                    } else {
                        ** GOTO lbl31
                    }
                }
                break block13;
lbl31:
                // 2 sources

                break block14;
            }
            v3 = (cfr_temp_1 = this.b9.d() - 0.6) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
        }
        if (v3 > 0) return 0.3f;
        return 0.2f;
    }

    @Override
    public ay ad() {
        return this.H() == 99 ? ay.HOSTILE : ay.NEUTRAL;
    }

    @Override
    public void l(boolean bl2) {
        block3: {
            P p2;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                p2 = this;
                if (arrstring == null) break block2;
                super.l(bl2);
                if (!bl2) break block3;
                p2 = this;
            }
            p2.a(this.E(), this.x(), ((this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    private void c() {
        block4: {
            block2: {
                P p2;
                block3: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    p2 = this;
                    if (arrstring == null) break block2;
                    if (!(p2.b9.d() < 2.2)) break block3;
                    this.cM = 10;
                    if (arrstring != null) break block4;
                }
                p2 = this;
            }
            p2.cM = 1;
        }
    }

    @Override
    protected d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.gh;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(net.minecraft.w.k k2) {
        String[] arrstring = net.minecraft.ag.A.b();
        net.minecraft.w.k k3 = k2;
        net.minecraft.w.k k4 = net.minecraft.u.h.aG;
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.u.h.aN;
        }
        if (arrstring != null) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = net.minecraft.w.k.b(net.minecraft.u.g.cZ);
        }
        if (k3 != k4) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.bS;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float a(float f10) {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = this.cK;
        if (arrstring != null) {
            if (n2 == 0) {
                return 0.0f;
            }
            n2 = this.cL;
        }
        float f11 = ((float)n2 + f10) / (float)this.cK;
        return f11;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.l;
    }

    @Override
    public void h() {
        block17: {
            P p2;
            block18: {
                boolean bl2;
                block22: {
                    Object object;
                    block23: {
                        String[] arrstring;
                        block24: {
                            net.minecraft.k.l l2;
                            block25: {
                                net.minecraft.e.h h2;
                                block26: {
                                    P p3;
                                    block20: {
                                        block21: {
                                            int n2;
                                            block19: {
                                                int n3;
                                                block15: {
                                                    block16: {
                                                        arrstring = net.minecraft.ag.A.b();
                                                        n3 = this.cM--;
                                                        if (arrstring != null) {
                                                            if (n3 > 0) {
                                                                // empty if block
                                                            }
                                                            n3 = this.cI;
                                                        }
                                                        if (arrstring == null) break block15;
                                                        if (n3 <= 0) break block16;
                                                        this.cI -= this.g.nextInt(3);
                                                        n3 = this.cI;
                                                        if (arrstring == null) break block15;
                                                        if (n3 < 0) {
                                                            this.cI = 0;
                                                        }
                                                    }
                                                    p2 = this;
                                                    if (arrstring == null) break block17;
                                                    n3 = p2.A ? 1 : 0;
                                                }
                                                if (n3 == 0) break block18;
                                                n2 = this.cJ;
                                                if (arrstring == null) break block19;
                                                if (n2 == 0) {
                                                    this.l(false);
                                                    this.R();
                                                }
                                                p3 = this;
                                                if (arrstring == null) break block20;
                                                n2 = p3.H();
                                            }
                                            if (n2 != 99) break block21;
                                            p3 = this;
                                            if (arrstring == null) break block20;
                                            if (p3.cM != 0) break block21;
                                            p3 = this;
                                            if (arrstring == null) break block20;
                                            object = p3.J();
                                            if (object == null) break block21;
                                            p3 = this;
                                            if (arrstring == null) break block20;
                                            if (p3.s((x)object) < 16.0) {
                                                this.a(((B)object).a, ((B)object).ax);
                                                this.b9.a(((B)object).a, ((B)object).aF, ((B)object).ax, this.b9.d());
                                                this.P();
                                                this.cJ = true;
                                            }
                                        }
                                        p3 = this;
                                    }
                                    object = (A)p3.bX;
                                    bl2 = ((A)object).a();
                                    if (arrstring == null) break block22;
                                    if (bl2) break block23;
                                    p2 = this;
                                    if (arrstring == null) break block17;
                                    if (!p2.b9.c()) break block18;
                                    p2 = this;
                                    if (arrstring == null) break block17;
                                    if (p2.cM != 0) break block18;
                                    net.minecraft.e.h h3 = this.b7.k();
                                    l2 = new net.minecraft.k.l(this.b9.b(), this.b9.e(), this.b9.f());
                                    if (arrstring == null) break block24;
                                    if (h3 == null) break block25;
                                    h2 = h3;
                                    if (arrstring == null) break block26;
                                    if (h2.a() >= h3.f()) break block25;
                                    h2 = h3;
                                }
                                l2 = h2.a(this);
                            }
                            this.a(l2.e, l2.b);
                            this.P();
                        }
                        if (arrstring != null) break block18;
                    }
                    bl2 = ((A)object).c();
                }
                if (!bl2) {
                    this.l();
                }
            }
            p2 = this;
        }
        p2.cJ = this.A;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.a(g10);
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = super.a(g10, f10);
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private void l() {
        ((A)this.bX).a(true);
    }

    private int m() {
        int n2;
        block10: {
            int n3;
            block8: {
                int n4;
                String[] arrstring;
                block9: {
                    net.minecraft.A.h h2 = this.aG.c(new n(this));
                    arrstring = net.minecraft.ag.A.b();
                    n4 = this.g.nextInt(100);
                    n2 = h2.d();
                    if (arrstring != null) {
                        if (n2 != 0) {
                            int n5 = n4;
                            if (arrstring != null) {
                                n5 = n5 < 80 ? 1 : 3;
                            }
                            return n5;
                        }
                        n2 = h2 instanceof net.minecraft.A.j;
                    }
                    if (arrstring != null) {
                        if (n2 != 0) {
                            return 4;
                        }
                        n2 = n4;
                    }
                    n3 = 50;
                    if (arrstring == null) break block8;
                    if (n2 >= n3) break block9;
                    n2 = 0;
                    break block10;
                }
                n2 = n4;
                if (arrstring == null) break block10;
                n3 = 90;
            }
            n2 = n2 < n3 ? 5 : 2;
        }
        return n2;
    }

    static {
        cH = net.minecraft.q.m.a(P.class, net.minecraft.q.h.n);
    }

    static boolean c(P p2) {
        return p2.aL;
    }

    @Override
    protected void aH() {
        block7: {
            z z2;
            block6: {
                double d10;
                block4: {
                    String[] arrstring;
                    block5: {
                        String[] arrstring2 = net.minecraft.ag.A.b();
                        super.aH();
                        arrstring = arrstring2;
                        double d11 = this.b9.d();
                        double d12 = d11 - 0.0;
                        d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                        if (arrstring == null) break block4;
                        if (d10 <= 0) break block5;
                        double d13 = this.aq * this.aq + this.d * this.d;
                        double d14 = d13 - 0.010000000000000002;
                        d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        if (arrstring == null) break block4;
                        if (d10 < 0) {
                            this.a(0.0f, 0.0f, 1.0f, 0.1f);
                        }
                    }
                    z2 = this.aG;
                    if (arrstring == null) break block6;
                    d10 = (double)z2.C;
                }
                if (d10 != false) break block7;
                z2 = this.aG;
            }
            z2.a((x)this, (byte)1);
        }
    }

    private void a(double d10, double d11) {
        this.e = (float)(net.minecraft.k.h.a(d11 - this.ax, d10 - this.a) * 57.29577951308232) - 90.0f;
    }

    private void Q() {
        ((A)this.bX).a(false);
    }

    public void a(int n2) {
        block4: {
            P p2;
            block6: {
                block5: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block4;
                    if (n2 != 99) break block5;
                    this.a(net.minecraft.U.M.i).a(8.0);
                    this.b5.a(4, new l(this));
                    this.ci.a(1, new Z((D)this, false, new Class[0]));
                    this.ci.a(2, new au<net.minecraft.i.j>((D)this, net.minecraft.i.j.class, true));
                    this.ci.a(2, new au<V>((D)this, V.class, true));
                    p2 = this;
                    if (arrstring == null) break block6;
                    if (!p2.g()) {
                        this.a(net.minecraft.ab.a.a("entity.KillerBunny.name"));
                    }
                }
                p2 = this;
            }
            p2.ap.b(cH, n2);
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(3.0);
        this.a(net.minecraft.U.M.d).a(0.3f);
    }

    public P(z z2) {
        super(z2);
        this.c(0.4f, 0.5f);
        this.bX = new A(this, this);
        this.b9 = new e(this);
        this.b(0.0);
    }

    public int H() {
        return this.ap.b(cH);
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.x;
    }

    public void P() {
        this.l(true);
        this.cK = 10;
        this.cL = 0;
    }

    static boolean b(P p2) {
        return p2.D();
    }

    protected d E() {
        return net.minecraft.u.E.cN;
    }

    @Override
    public boolean a(net.minecraft.w.d d10) {
        return this.a(d10.w());
    }

    @Override
    public void a(byte by2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (by2 != 1) break block1;
                    this.I();
                    this.cK = 10;
                    this.cL = 0;
                }
                if (arrstring != null) break block2;
            }
            super.a(by2);
        }
    }

    @Override
    public void ak() {
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cH, 0);
    }

    private boolean D() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.cI;
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        block8: {
            int n2;
            P p2;
            block7: {
                boolean bl2;
                String[] arrstring;
                int n3;
                block6: {
                    block5: {
                        block4: {
                            j2 = super.a(h2, j2);
                            n3 = this.m();
                            arrstring = net.minecraft.ag.A.b();
                            bl2 = false;
                            boolean bl3 = j2 instanceof k;
                            if (arrstring == null) break block4;
                            if (!bl3) break block5;
                            n3 = ((k)j2).a;
                            bl3 = bl2 = true;
                        }
                        if (arrstring != null) break block6;
                    }
                    j2 = new k(n3);
                }
                p2 = this;
                n2 = n3;
                if (arrstring == null) break block7;
                p2.a(n2);
                if (!bl2) break block8;
                p2 = this;
                n2 = -24000;
            }
            p2.l(n2);
        }
        return j2;
    }

    @Override
    protected void H() {
        this.b5.a(1, new W(this));
        this.b5.a(1, new p(this, 2.2));
        this.b5.a(2, new G(this, 0.8));
        this.b5.a(3, new al((D)this, 1.0, net.minecraft.u.h.aG, false));
        this.b5.a(3, new al((D)this, 1.0, net.minecraft.u.h.aN, false));
        this.b5.a(3, new al((D)this, 1.0, net.minecraft.w.k.b(net.minecraft.u.g.cZ), false));
        this.b5.a(4, new m<net.minecraft.i.j>(this, net.minecraft.i.j.class, 8.0f, 2.2, 2.2));
        this.b5.a(4, new m<V>(this, V.class, 10.0f, 2.2, 2.2));
        this.b5.a(4, new m<ae>(this, ae.class, 4.0f, 2.2, 2.2));
        this.b5.a(5, new o(this));
        this.b5.a(6, new aA(this, 0.6));
        this.b5.a(11, new aa(this, net.minecraft.i.j.class, 10.0f));
    }

    protected void n() {
        a1 a12 = (a1)net.minecraft.u.g.b4;
        i i2 = a12.b(a12.b());
        this.aG.a(net.minecraft.ar.aH.BLOCK_DUST, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, 0.0, 0.0, 0.0, net.minecraft.W.K.l(i2));
        this.cI = 40;
    }
}

