/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ab.a;
import net.minecraft.ac.c;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.L;
import net.minecraft.ag.R;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.G;
import net.minecraft.ak.O;
import net.minecraft.ak.U;
import net.minecraft.ak.W;
import net.minecraft.ak.a1;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.al;
import net.minecraft.ak.y;
import net.minecraft.ar.a3;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class S
extends R {
    private /* synthetic */ net.minecraft.ak.m<net.minecraft.i.j> cK;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cL;
    private /* synthetic */ al cM;

    @Override
    public void a(r r2) {
        super.a(r2);
        this.a(r2.m("CatType"));
    }

    @Override
    public boolean a(net.minecraft.w.d d10) {
        return d10.w() == net.minecraft.u.h.aw;
    }

    public S(z z2) {
        super(z2);
        this.c(0.6f, 0.7f);
    }

    @Override
    protected void H() {
        this.cH = new U(this);
        this.cM = new al((D)this, 0.6, net.minecraft.u.h.aw, true);
        this.b5.a(1, new W(this));
        this.b5.a(2, this.cH);
        this.b5.a(3, this.cM);
        this.b5.a(5, new y(this, 1.0, 10.0f, 5.0f));
        this.b5.a(6, new net.minecraft.ak.L(this, 0.8));
        this.b5.a(7, new net.minecraft.ak.C(this, 0.3f));
        this.b5.a(8, new O(this));
        this.b5.a(9, new G(this, 0.8));
        this.b5.a(10, new aA((D)this, 0.8, 1.0000001E-5f));
        this.b5.a(11, new aa(this, net.minecraft.i.j.class, 10.0f));
        this.ci.a(1, new a1<L>(this, L.class, false, null));
    }

    @Override
    public S a(E e10) {
        S s2 = new S(this.aG);
        String[] arrstring = net.minecraft.ag.A.b();
        S s3 = this;
        if (arrstring != null) {
            if (s3.U()) {
                s2.b(this.b());
                s2.s(true);
                s2.a(this.a());
            }
            s3 = s2;
        }
        return s3;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("CatType", this.a());
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(10.0);
        this.a(net.minecraft.U.M.d).a(0.3f);
    }

    @Override
    public void d(float f10, float f11) {
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cL, 0);
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        net.minecraft.U.j j3;
        block3: {
            block4: {
                int n2;
                String[] arrstring;
                block5: {
                    arrstring = net.minecraft.ag.A.b();
                    j3 = super.a(h2, j2);
                    if (arrstring == null) break block3;
                    j2 = j3;
                    if (this.a() != 0) break block4;
                    int n3 = this.aG.J.nextInt(7);
                    if (arrstring == null) break block5;
                    if (n3 != 0) break block4;
                    n3 = n2 = 0;
                }
                while (n2 < 2) {
                    S s2 = new S(this.aG);
                    s2.c(this.a, this.aF, this.ax, this.e, 0.0f);
                    s2.l(-24000);
                    this.aG.f(s2);
                    ++n2;
                    if (arrstring != null) continue;
                }
            }
            j3 = j2;
        }
        return j3;
    }

    public void a(int n2) {
        this.ap.b(cL, n2);
    }

    @Override
    protected float x() {
        return 0.4f;
    }

    @Override
    public boolean C() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.aG.J.nextInt(3);
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String g() {
        String string;
        S s2;
        block6: {
            boolean bl2;
            block5: {
                String[] arrstring = net.minecraft.ag.A.b();
                bl2 = this.g();
                if (arrstring == null) break block5;
                if (bl2) {
                    return this.aB();
                }
                s2 = this;
                if (arrstring == null) break block6;
                bl2 = s2.U();
            }
            if (bl2) {
                string = net.minecraft.ab.a.a("entity.Cat.name");
                return string;
            }
            s2 = this;
        }
        string = super.g();
        return string;
    }

    @Override
    public boolean b(net.minecraft.i.j j2, a3 a32) {
        int n2;
        block8: {
            block9: {
                boolean bl2;
                block12: {
                    block13: {
                        S s2;
                        block14: {
                            block15: {
                                String[] arrstring;
                                net.minecraft.w.d d10;
                                block11: {
                                    al al2;
                                    block10: {
                                        S s3;
                                        block6: {
                                            block7: {
                                                d10 = j2.c(a32);
                                                arrstring = net.minecraft.ag.A.b();
                                                s3 = this;
                                                if (arrstring == null) break block6;
                                                if (!s3.U()) break block7;
                                                n2 = this.a((B)j2);
                                                if (arrstring == null) break block8;
                                                if (n2 == 0) break block9;
                                                n2 = this.aG.C;
                                                if (arrstring == null) break block8;
                                                if (n2 != 0) break block9;
                                                n2 = this.a(d10) ? 1 : 0;
                                                if (arrstring == null) break block8;
                                                if (n2 != 0) break block9;
                                                boolean bl3 = this.D();
                                                if (arrstring != null) {
                                                    bl3 = !bl3;
                                                }
                                                this.cH.a(bl3);
                                                if (arrstring != null) break block9;
                                            }
                                            s3 = this;
                                        }
                                        al2 = s3.cM;
                                        if (arrstring == null) break block10;
                                        if (al2 == null) break block11;
                                        al2 = this.cM;
                                    }
                                    n2 = al2.a();
                                    if (arrstring == null) break block8;
                                    if (n2 == 0) break block9;
                                }
                                if (d10.w() != net.minecraft.u.h.aw) break block9;
                                double d11 = j2.s(this) - 9.0;
                                n2 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                if (arrstring == null) break block8;
                                if (n2 >= 0) break block9;
                                bl2 = j2.cw.g;
                                if (arrstring != null) {
                                    if (!bl2) {
                                        d10.b(1);
                                    }
                                    bl2 = this.aG.C;
                                }
                                if (arrstring == null) break block12;
                                if (bl2) break block13;
                                s2 = this;
                                if (arrstring == null) break block14;
                                if (s2.g.nextInt(3) != 0) break block15;
                                this.b(j2);
                                this.a(1 + this.aG.J.nextInt(3));
                                this.a(true);
                                this.cH.a(true);
                                this.aG.a((x)this, (byte)7);
                                if (arrstring != null) break block13;
                            }
                            this.a(false);
                            s2 = this;
                        }
                        s2.aG.a((x)this, (byte)6);
                    }
                    bl2 = true;
                }
                return bl2;
            }
            n2 = super.b(j2, a32);
        }
        return n2 != 0;
    }

    @Override
    @Nullable
    protected d q() {
        block6: {
            int n2;
            String[] arrstring;
            block5: {
                arrstring = net.minecraft.ag.A.b();
                n2 = this.U();
                if (arrstring == null) break block5;
                if (n2 == 0) break block6;
                n2 = this.z();
            }
            if (arrstring != null) {
                if (n2 != 0) {
                    return net.minecraft.u.E.eH;
                }
                n2 = this.g.nextInt(4);
            }
            return n2 == 0 ? net.minecraft.u.E.ad : net.minecraft.u.E.d8;
        }
        return null;
    }

    @Override
    protected void P() {
        block6: {
            S s2;
            block5: {
                String[] arrstring = net.minecraft.ag.A.b();
                s2 = this;
                if (arrstring != null) {
                    if (s2.cK == null) {
                        this.cK = new net.minecraft.ak.m<net.minecraft.i.j>(this, net.minecraft.i.j.class, 16.0f, 0.8, 1.33);
                    }
                    this.b5.a(this.cK);
                    s2 = this;
                }
                if (arrstring == null) break block5;
                if (s2.U()) break block6;
                s2 = this;
            }
            s2.b5.a(4, this.cK);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(C c10) {
        C c11;
        String[] arrstring;
        block10: {
            boolean bl2;
            block9: {
                arrstring = net.minecraft.ag.A.b();
                if (c10 == this) {
                    return false;
                }
                bl2 = this.U();
                if (arrstring == null) break block9;
                if (!bl2) {
                    return false;
                }
                c11 = c10;
                if (arrstring == null) break block10;
                bl2 = c11 instanceof S;
            }
            if (!bl2) {
                return false;
            }
            c11 = c10;
        }
        S s2 = (S)c11;
        boolean bl3 = s2.U();
        if (arrstring != null) {
            if (!bl3) {
                return false;
            }
            bl3 = this.z();
        }
        if (arrstring != null) {
            if (!bl3) return false;
            bl3 = s2.z();
        }
        if (arrstring == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, S.class);
    }

    static {
        cL = net.minecraft.q.m.a(S.class, net.minecraft.q.h.n);
    }

    public int a() {
        return this.ap.b(cL);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.b;
    }

    @Override
    public boolean u() {
        boolean bl2;
        block2: {
            block3: {
                n n2;
                block5: {
                    int n3;
                    block4: {
                        String[] arrstring = net.minecraft.ag.A.b();
                        bl2 = this.aG.a(this.m(), this);
                        if (arrstring == null) break block2;
                        if (!bl2) break block3;
                        bl2 = this.aG.a((x)this, this.m()).isEmpty();
                        if (arrstring == null) break block2;
                        if (!bl2) break block3;
                        bl2 = this.aG.a(this.m());
                        if (arrstring == null) break block2;
                        if (bl2) break block3;
                        n2 = new n(this.a, this.m().b, this.ax);
                        n3 = n2.b();
                        if (arrstring == null) break block4;
                        if (n3 >= this.aG.y()) break block5;
                        n3 = 0;
                    }
                    return n3 != 0;
                }
                i i2 = this.aG.d(n2.k());
                K k2 = i2.b();
                return k2 == net.minecraft.u.g.aU || i2.o() == c.J;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void h() {
        block10: {
            S s2;
            block4: {
                block5: {
                    String[] arrstring;
                    block8: {
                        block9: {
                            double d10;
                            block6: {
                                double d11;
                                double d12;
                                block7: {
                                    arrstring = net.minecraft.ag.A.b();
                                    s2 = this;
                                    if (arrstring == null) break block4;
                                    if (!s2.w().c()) break block5;
                                    d12 = this.w().d();
                                    double d13 = d12 - 0.6;
                                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                    if (arrstring == null) break block6;
                                    if (d10 != false) break block7;
                                    this.f(true);
                                    this.k(false);
                                    if (arrstring != null) break block8;
                                }
                                d10 = (d11 = d12 - 1.33) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                            }
                            if (d10 != false) break block9;
                            this.f(false);
                            this.k(true);
                            if (arrstring != null) break block8;
                        }
                        this.f(false);
                        this.k(false);
                    }
                    if (arrstring != null) break block10;
                }
                this.f(false);
                s2 = this;
            }
            s2.k(false);
        }
    }

    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        String[] arrstring = net.minecraft.ag.A.b();
        S s2 = this;
        if (arrstring != null) {
            if (s2.a(g10)) {
                return false;
            }
            s2 = this;
        }
        if (arrstring != null) {
            if (s2.cH != null) {
                this.cH.a(false);
            }
            s2 = this;
        }
        return super.a(g10, f10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean k() {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = this.U();
        if (arrstring != null) {
            if (n2 != 0) return 0 != 0;
            n2 = this.H;
        }
        if (arrstring == null) return n2 != 0;
        if (n2 <= 2400) return 0 != 0;
        return 1 != 0;
    }

    @Override
    protected d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.d;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.ew;
    }

    @Override
    public boolean j(x x2) {
        return x2.a(net.minecraft.ar.G.a(this), 3.0f);
    }
}

