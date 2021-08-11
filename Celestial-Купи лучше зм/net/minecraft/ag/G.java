/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.B.a;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.O;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.E;
import net.minecraft.ag.d;
import net.minecraft.ag.q;
import net.minecraft.ag.r;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.D;
import net.minecraft.ak.F;
import net.minecraft.ak.P;
import net.minecraft.ak.T;
import net.minecraft.ak.W;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ar.aH;
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.k;
import net.minecraft.z.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class G
extends E
implements O {
    private static final /* synthetic */ net.minecraft.q.r<Integer> c6;
    @Nullable
    private /* synthetic */ G c9;
    private static final /* synthetic */ net.minecraft.q.r<Integer> c8;
    private static final /* synthetic */ net.minecraft.q.r<Integer> c5;
    private /* synthetic */ boolean c4;
    @Nullable
    private /* synthetic */ G c7;

    public int ag() {
        return net.minecraft.k.h.c(this.ap.b(c5), 0, 3);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.k;
    }

    public void X() {
        String[] arrstring = net.minecraft.ag.A.b();
        G g10 = this.c9;
        if (arrstring != null) {
            if (g10 != null) {
                this.c9.c7 = null;
            }
            g10 = this;
        }
        g10.c9 = null;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.ef;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(C c10) {
        String[] arrstring = net.minecraft.ag.A.b();
        C c11 = c10;
        if (arrstring != null) {
            if (c11 == this) return false;
            c11 = c10;
        }
        boolean bl2 = c11 instanceof G;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = this.Y();
        }
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = ((G)c10).Y();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected net.minecraft.ar.d ap() {
        return net.minecraft.u.E.hi;
    }

    @Override
    protected void H() {
        this.b5.a(0, new W(this));
        this.b5.a(1, new T(this, 1.2));
        this.b5.a(2, new D(this, 2.1f));
        this.b5.a(3, new net.minecraft.ak.k(this, 1.25, 40, 20.0f));
        this.b5.a(3, new P(this, 1.2));
        this.b5.a(4, new net.minecraft.ak.G(this, 1.0));
        this.b5.a(5, new net.minecraft.ak.A(this, 1.0));
        this.b5.a(6, new aA(this, 0.7));
        this.b5.a(7, new aa(this, net.minecraft.i.j.class, 6.0f));
        this.b5.a(8, new F(this));
        this.ci.a(1, new q(this));
        this.ci.a(2, new r(this));
    }

    public boolean H() {
        return this.c7 != null;
    }

    public G(z z2) {
        super(z2);
        this.c(0.9f, 1.87f);
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.cQ;
    }

    @Override
    public void f(net.minecraft.P.r r2) {
        block3: {
            G g10;
            String string;
            net.minecraft.P.r r3;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.f(r2);
                String[] arrstring2 = arrstring;
                r2.b("Variant", this.ag());
                r3 = r2;
                string = "Strength";
                g10 = this;
                if (arrstring2 == null) break block2;
                r3.b(string, g10.J());
                if (this.cO.a(1).G()) break block3;
                r3 = r2;
                string = "DecorItem";
                g10 = this;
            }
            r3.a(string, g10.cO.a(1).a(new net.minecraft.P.r()));
        }
    }

    @Override
    public void q(x x2) {
        block3: {
            G g10;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                g10 = this;
                if (arrstring == null) break block2;
                if (!g10.l(x2)) break block3;
                g10 = this;
            }
            float f10 = net.minecraft.k.h.c(g10.bf * ((float)Math.PI / 180));
            float f11 = net.minecraft.k.h.g(this.bf * ((float)Math.PI / 180));
            float f12 = 0.3f;
            x2.g(this.a + (double)(0.3f * f11), this.aF + this.o() + x2.an(), this.ax - (double)(0.3f * f10));
        }
    }

    static void a(G g10, boolean bl2) {
        g10.z(bl2);
    }

    @Override
    public void a(a a10) {
        block1: {
            bl bl2;
            bl bl3;
            block2: {
                bl3 = this.af();
                String[] arrstring = net.minecraft.ag.A.b();
                super.a(a10);
                bl bl4 = this.af();
                if (this.H <= 20) break block1;
                bl2 = bl4;
                if (arrstring == null) break block2;
                if (bl2 == null) break block1;
                bl2 = bl4;
            }
            if (bl2 != bl3) {
                this.a(net.minecraft.u.E.hX, 0.5f, 1.0f);
            }
        }
    }

    private void a(net.minecraft.w.d d10) {
        block4: {
            G g10;
            block2: {
                block3: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    g10 = this;
                    if (arrstring == null) break block2;
                    if (!g10.c(d10)) break block3;
                    this.a(bl.c(d10.d()));
                    if (arrstring != null) break block4;
                }
                g10 = this;
            }
            g10.a((bl)null);
        }
    }

    @Override
    public boolean al() {
        return false;
    }

    @Override
    public void a(boolean bl2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean B() {
        String[] arrstring = net.minecraft.ag.A.b();
        float f10 = this.V() - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (arrstring == null) return (boolean)f11;
        if (f11 > 0) {
            f11 = (float)this.D();
            if (arrstring == null) return (boolean)f11;
            if (f11 == false) {
                f11 = 0.0f;
                return (boolean)f11;
            }
        }
        f11 = 1.0f;
        return (boolean)f11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d(float f10, float f11) {
        G g10;
        block7: {
            block6: {
                int n2;
                String[] arrstring;
                int n3;
                block5: {
                    n3 = net.minecraft.k.h.f((f10 * 0.5f - 3.0f) * f11);
                    arrstring = net.minecraft.ag.A.b();
                    n2 = n3;
                    if (arrstring != null) {
                        if (n2 <= 0) return;
                        float f12 = f10 - 6.0f;
                        n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (arrstring == null) break block5;
                    if (n2 < 0) break block6;
                    this.a(net.minecraft.ar.G.e, (float)n3);
                    g10 = this;
                    if (arrstring == null) break block7;
                    n2 = g10.aU() ? 1 : 0;
                }
                if (n2 != 0) {
                    for (x x2 : this.r()) {
                        x2.a(net.minecraft.ar.G.e, (float)n3);
                        if (arrstring == null) return;
                        if (arrstring != null) continue;
                    }
                }
            }
            g10 = this;
        }
        i i2 = g10.aG.d(new n(this.a, this.aF - 0.2 - (double)this.ak, this.ax));
        K k2 = i2.b();
        if (i2.o() == c.A || this.aR()) return;
        d_ d_2 = k2.l();
        this.aG.a(null, this.a, this.aF, this.ax, d_2.b(), this.ad(), d_2.c() * 0.5f, d_2.e() * 0.75f);
    }

    @Override
    public double o() {
        return (double)this.aD * 0.67;
    }

    private static gP d(gP gP2) {
        return gP2;
    }

    private void z(boolean bl2) {
        this.c4 = bl2;
    }

    @Override
    public boolean K() {
        return false;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        int n2;
        block4: {
            int n3;
            block2: {
                block3: {
                    j2 = super.a(h2, j2);
                    String[] arrstring = net.minecraft.ag.A.b();
                    this.aa();
                    n3 = j2 instanceof d;
                    if (arrstring == null) break block2;
                    if (n3 == 0) break block3;
                    n2 = ((d)j2).a;
                    if (arrstring != null) break block4;
                }
                n3 = this.g.nextInt(4);
            }
            n2 = n3;
            j2 = new d(n2, null);
        }
        this.o(n2);
        return j2;
    }

    @Override
    protected void ah() {
        block3: {
            G g10;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                g10 = this;
                if (arrstring == null) break block2;
                if (g10.aG.C) break block3;
                super.ah();
                g10 = this;
            }
            g10.a(this.cO.a(1));
        }
    }

    @Override
    public void P() {
        block0: {
            net.minecraft.ar.d d10 = this.ap();
            if (d10 == null) break block0;
            this.a(d10, this.x(), this.p());
        }
    }

    @Override
    public void a(B b10, float f10) {
        this.e(b10);
    }

    public void o(int n2) {
        this.ap.b(c5, n2);
    }

    @Override
    public int aA() {
        return 30;
    }

    @Override
    public void a(net.minecraft.P.r r2) {
        String[] arrstring = net.minecraft.ag.A.b();
        this.n(r2.m("Strength"));
        super.a(r2);
        this.o(r2.m("Variant"));
        String[] arrstring2 = arrstring;
        if (arrstring2 != null) {
            if (r2.a("DecorItem", 10)) {
                this.cO.a(1, new net.minecraft.w.d(r2.h("DecorItem")));
            }
            this.ah();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected int ao() {
        int n2;
        String[] arrstring = net.minecraft.ag.A.b();
        G g10 = this;
        if (arrstring != null) {
            if (g10.F()) {
                n2 = 2 + 3 * this.a();
                return n2;
            }
            g10 = this;
        }
        n2 = super.ao();
        return n2;
    }

    @Override
    public int a() {
        return this.J();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public bl af() {
        int n2 = this.ap.b(c6);
        String[] arrstring = net.minecraft.ag.A.b();
        int n3 = n2;
        if (arrstring != null) {
            if (n3 == -1) {
                return null;
            }
            n3 = n2;
        }
        bl bl2 = bl.c(n3);
        return bl2;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(c8, 0);
        this.ap.c(c6, -1);
        this.ap.c(c5, 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(@Nullable bl var1_1) {
        var2_2 = net.minecraft.ag.A.b();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl8
        if (v0 == null) {
            v1 = -1;
        } else {
            v0 = var1_1;
lbl8:
            // 2 sources

            v1 = v0.e();
        }
        this.ap.b(net.minecraft.ag.G.c6, v1);
    }

    public int J() {
        return this.ap.b(c8);
    }

    @Override
    protected double h() {
        return 2.0;
    }

    @Override
    protected void R() {
        this.a(net.minecraft.u.E.dv, 1.0f, (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
    }

    private void aa() {
        String[] arrstring = net.minecraft.ag.A.b();
        float f10 = this.g.nextFloat() - 0.04f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (arrstring != null) {
            f11 = f11 < 0 ? (float)5 : (float)3;
        }
        float f12 = f11;
        this.n(1 + this.g.nextInt((int)f12));
    }

    private void n(int n2) {
        this.ap.b(c8, Math.max(1, Math.min(5, n2)));
    }

    @Nullable
    public G ao() {
        return this.c9;
    }

    static {
        c8 = net.minecraft.q.m.a(G.class, net.minecraft.q.h.n);
        c6 = net.minecraft.q.m.a(G.class, net.minecraft.q.h.n);
        c5 = net.minecraft.q.m.a(G.class, net.minecraft.q.h.n);
    }

    @Override
    protected net.minecraft.ar.d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.a_;
    }

    public boolean an() {
        return this.af() != null;
    }

    @Override
    public boolean E() {
        return true;
    }

    @Override
    public boolean aw() {
        return false;
    }

    static boolean a(G g10) {
        return g10.c4;
    }

    @Override
    protected boolean a(net.minecraft.i.j j2, net.minecraft.w.d d10) {
        float f10;
        block34: {
            boolean bl2;
            block35: {
                String[] arrstring;
                block30: {
                    block31: {
                        int n2;
                        block32: {
                            block33: {
                                block28: {
                                    block29: {
                                        int n3;
                                        block26: {
                                            block27: {
                                                float f11;
                                                block25: {
                                                    float f12;
                                                    block24: {
                                                        k k2;
                                                        k k3;
                                                        block22: {
                                                            k k4;
                                                            block23: {
                                                                n3 = 0;
                                                                n2 = 0;
                                                                f11 = 0.0f;
                                                                bl2 = false;
                                                                arrstring = net.minecraft.ag.A.b();
                                                                k3 = k4 = d10.w();
                                                                k2 = net.minecraft.u.h.b1;
                                                                if (arrstring == null) break block22;
                                                                if (k3 != k2) break block23;
                                                                n3 = 10;
                                                                n2 = 3;
                                                                f11 = 2.0f;
                                                                if (arrstring != null) break block24;
                                                            }
                                                            k3 = k4;
                                                            k2 = net.minecraft.w.k.b(net.minecraft.u.g.aL);
                                                        }
                                                        if (k3 != k2) break block24;
                                                        n3 = 90;
                                                        n2 = 6;
                                                        f11 = 10.0f;
                                                        f10 = (float)this.aD();
                                                        if (arrstring == null) break block25;
                                                        if (f10 == false) break block24;
                                                        f10 = this.z();
                                                        if (arrstring == null) break block25;
                                                        if (f10 == false) {
                                                            bl2 = true;
                                                            this.a(j2);
                                                        }
                                                    }
                                                    f10 = (f12 = this.V() - this.H()) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                                }
                                                if (arrstring == null) break block26;
                                                if (f10 >= 0) break block27;
                                                float f13 = f11 - 0.0f;
                                                f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                if (arrstring == null) break block26;
                                                if (f10 > 0) {
                                                    this.i(f11);
                                                    bl2 = true;
                                                }
                                            }
                                            f10 = (float)this.Q();
                                        }
                                        if (arrstring == null) break block28;
                                        if (f10 == false) break block29;
                                        f10 = n3;
                                        if (arrstring == null) break block28;
                                        if (f10 > 0) {
                                            this.aG.a(net.minecraft.ar.aH.VILLAGER_HAPPY, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, 0.0, 0.0, 0.0, new int[0]);
                                            boolean bl3 = this.aG.C;
                                            if (arrstring != null) {
                                                if (!bl3) {
                                                    this.k(n3);
                                                }
                                                bl3 = true;
                                            }
                                            bl2 = bl3;
                                        }
                                    }
                                    f10 = n2;
                                }
                                if (arrstring == null) break block30;
                                if (f10 <= 0) break block31;
                                f10 = (float)bl2;
                                if (arrstring == null) break block32;
                                if (f10 != false) break block33;
                                f10 = (float)this.aD();
                                if (arrstring == null) break block30;
                                if (f10 != false) break block31;
                            }
                            f10 = this.R();
                        }
                        if (arrstring == null) break block30;
                        if (f10 >= this.aA()) break block31;
                        bl2 = true;
                        f10 = (float)this.aG.C;
                        if (arrstring == null) break block30;
                        if (f10 == false) {
                            this.n(n2);
                        }
                    }
                    f10 = (float)bl2;
                }
                if (arrstring == null) break block34;
                if (f10 == false) break block35;
                f10 = (float)this.aR();
                if (arrstring == null) break block34;
                if (f10 == false) {
                    this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.aD, this.ad(), 1.0f, 1.0f + (this.g.nextFloat() - this.g.nextFloat()) * 0.2f);
                }
            }
            f10 = (float)bl2;
        }
        return (boolean)f10;
    }

    public void b(G g10) {
        this.c9 = g10;
        this.c9.c7 = this;
    }

    @Override
    public boolean c(net.minecraft.w.d d10) {
        return d10.w() == net.minecraft.w.k.b(net.minecraft.u.g.D);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.b).a(40.0);
    }

    public boolean ae() {
        return this.c9 != null;
    }

    @Override
    protected void az() {
        block3: {
            G g10;
            block4: {
                boolean bl2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    bl2 = this.ae();
                    if (arrstring == null) break block2;
                    if (bl2) break block3;
                    g10 = this;
                    if (arrstring == null) break block4;
                    bl2 = g10.Q();
                }
                if (!bl2) break block3;
                g10 = this;
            }
            super.az();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public G a(net.minecraft.U.E var1_1) {
        var3_2 = new G(this.aG);
        this.a(var1_1, var3_2);
        var4_3 = (G)var1_1;
        var2_4 = net.minecraft.ag.A.b();
        var5_5 = this.g.nextInt(Math.max(this.J(), var4_3.J())) + 1;
        v0 = this;
        if (var2_4 != null) {
            if (v0.g.nextFloat() < 0.03f) {
                ++var5_5;
            }
            var3_2.n(var5_5);
            v0 = var3_2;
        }
        v1 = this;
        if (var2_4 == null) ** GOTO lbl18
        if (v1.g.nextBoolean()) {
            v2 = this.ag();
        } else {
            v1 = var4_3;
lbl18:
            // 2 sources

            v2 = v1.ag();
        }
        v0.o(v2);
        return var3_2;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.gU, 0.15f, 1.0f);
    }

    private void e(B b10) {
        p p2 = new p(this.aG, this);
        double d10 = b10.a - this.a;
        double d11 = b10.m().b + (double)(b10.aD / 3.0f) - p2.aF;
        double d12 = b10.ax - this.ax;
        float f10 = net.minecraft.k.h.e(d10 * d10 + d12 * d12) * 0.2f;
        p2.a(d10, d11 + (double)f10, d12, 1.5f, 10.0f);
        this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.gn, this.ad(), 1.0f, 1.0f + (this.g.nextFloat() - this.g.nextFloat()) * 0.2f);
        this.aG.f(p2);
        this.c4 = true;
    }
}

