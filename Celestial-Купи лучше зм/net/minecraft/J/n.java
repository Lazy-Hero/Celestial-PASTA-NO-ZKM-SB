/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.B.i;
import net.minecraft.J.a;
import net.minecraft.J.h;
import net.minecraft.J.j;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ac.b;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aH;
import net.minecraft.ar.aX;
import net.minecraft.k.l;
import net.minecraft.k.t;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n
extends B {
    public static final /* synthetic */ net.minecraft.q.r<t> ce;
    private /* synthetic */ t ch;
    private /* synthetic */ t bZ;
    private static final /* synthetic */ t cl;
    public /* synthetic */ long b8;
    private static final /* synthetic */ Predicate<x> ci;
    public static final /* synthetic */ net.minecraft.q.r<t> ca;
    private /* synthetic */ t b2;
    public static final /* synthetic */ net.minecraft.q.r<t> b_;
    public static final /* synthetic */ net.minecraft.q.r<t> cd;
    private static final /* synthetic */ t bX;
    public static final /* synthetic */ net.minecraft.q.r<t> b0;
    private /* synthetic */ t ck;
    private static final /* synthetic */ t cb;
    private /* synthetic */ int b7;
    private /* synthetic */ t b4;
    public static final /* synthetic */ net.minecraft.q.r<t> cg;
    private final /* synthetic */ a2<d> b5;
    private /* synthetic */ t b9;
    private /* synthetic */ boolean bY;
    private static final /* synthetic */ t cc;
    public static final /* synthetic */ net.minecraft.q.r<Byte> b1;
    private static final /* synthetic */ t b3;
    private /* synthetic */ boolean b6;
    private final /* synthetic */ a2<d> cj;
    private static final /* synthetic */ t cf;

    private void a(boolean bl2) {
        this.ap.b(b1, this.a(this.ap.b(b1), 8, bl2));
    }

    @Override
    public void a(float f10, float f11, float f12) {
        block3: {
            n n2;
            block2: {
                int n3 = net.minecraft.J.j.c();
                n2 = this;
                if (n3 != 0) break block2;
                if (n2.aI()) break block3;
                n2 = this;
            }
            super.a(f10, f11, f12);
        }
    }

    private void a(net.minecraft.i.j j2, X x2, d d10, a3 a32) {
        block4: {
            d d11;
            block10: {
                d d12;
                d d13;
                int n2;
                block12: {
                    int n3;
                    block11: {
                        block9: {
                            block7: {
                                block8: {
                                    block5: {
                                        block6: {
                                            block2: {
                                                block3: {
                                                    d11 = this.b(x2);
                                                    n2 = net.minecraft.J.j.d();
                                                    n3 = d11.G();
                                                    if (n2 == 0) break block2;
                                                    if (n3 != 0) break block3;
                                                    n3 = this.b7 & 1 << x2.d() + 8;
                                                    if (n2 == 0) break block2;
                                                    if (n3 != 0) break block4;
                                                }
                                                n3 = d11.G();
                                            }
                                            if (n2 == 0) break block5;
                                            if (n3 == 0) break block6;
                                            n3 = this.b7 & 1 << x2.d() + 16;
                                            if (n2 == 0) break block5;
                                            if (n3 != 0) break block4;
                                        }
                                        n3 = j2.cw.g;
                                    }
                                    if (n2 == 0) break block7;
                                    if (n3 == 0) break block8;
                                    n3 = d11.G();
                                    if (n2 == 0) break block7;
                                    if (n3 == 0) break block8;
                                    n3 = d10.G() ? 1 : 0;
                                    if (n2 == 0) break block7;
                                    if (n3 != 0) break block8;
                                    d13 = d10.C();
                                    d13.c(1);
                                    this.a(x2, d13);
                                    if (n2 != 0) break block4;
                                }
                                n3 = d10.G();
                            }
                            if (n2 == 0) break block9;
                            if (n3 != 0) break block10;
                            n3 = d10.t();
                        }
                        if (n2 == 0) break block11;
                        if (n3 <= 1) break block10;
                        d12 = d11;
                        if (n2 == 0) break block12;
                        n3 = d12.G() ? 1 : 0;
                    }
                    if (n3 == 0) break block4;
                    d12 = d10.C();
                }
                d13 = d12;
                d13.c(1);
                this.a(x2, d13);
                d10.b(1);
                if (n2 != 0) break block4;
            }
            this.a(x2, d10);
            j2.a(a32, d11);
        }
    }

    @Override
    public void a(float f10) {
        this.aU = this.ak = f10;
        this.bh = this.a1 = f10;
    }

    public boolean k() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.ap.b(b1) & 0x10;
        if (n2 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    @Nullable
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.cy;
    }

    private void p(boolean bl2) {
        this.ap.b(b1, this.a(this.ap.b(b1), 1, bl2));
        this.c(0.5f, 1.975f);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
        var3_3 = net.minecraft.J.j.d();
        v0 = this.aG.C;
        if (var3_3 == 0) return v0;
        if (v0 != false) return false;
        v0 = this.P;
        if (var3_3 == 0) return v0;
        if (v0 != false) return false;
        v1 = net.minecraft.ar.G.l.equals(var1_1);
        if (var3_3 != 0) {
            if (v1) {
                this.a();
                return false;
            }
            v1 = this.a(var1_1);
        }
        if (var3_3 == 0) return v1;
        if (v1 != false) return false;
        v1 = this.b6;
        if (var3_3 == 0) return v1;
        if (v1 != false) return false;
        v1 = this.k();
        if (var3_3 == 0) return v1;
        if (v1 != false) return false;
        v2 = var1_1.j();
        if (var3_3 != 0) {
            if (v2 != 0) {
                this.e();
                this.a();
                return false;
            }
            v2 = net.minecraft.ar.G.c.equals(var1_1);
        }
        if (var3_3 != 0) {
            if (v2 != 0) {
                v3 = this;
                if (var3_3 != 0) {
                    if (v3.p()) {
                        this.c(0.15f);
                        if (var3_3 != 0) return false;
                    }
                    v3 = this;
                }
                v3.h(5);
                return false;
            }
            v2 = net.minecraft.ar.G.x.equals(var1_1);
        }
        if (var3_3 != 0) {
            if (v2 != 0) {
                cfr_temp_0 = this.V() - 0.5f;
                v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var3_3 != 0) {
                    if (v2 > 0) {
                        this.c(4.0f);
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v2 = "arrow".equals(var1_1.m());
            }
        }
        var4_4 = v2;
        v4 = var5_5 = "player".equals(var1_1.m());
        if (var3_3 != 0) {
            if (!v4) {
                v4 = var4_4;
                if (var3_3 != 0) {
                    if (!v4) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v4 = var1_1.q() instanceof f;
            }
        }
        if (var3_3 != 0) {
            if (v4) {
                var1_1.q().a();
            }
            v4 = var1_1.h() instanceof net.minecraft.i.j;
        }
        if (var3_3 != 0) {
            if (v4) {
                v4 = ((net.minecraft.i.j)var1_1.h()).cw.c;
                if (var3_3 != 0) {
                    if (!v4) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v4 = var1_1.c() ? 1 : 0;
            }
        }
        if (var3_3 == 0) return v4;
        if (v4) {
            this.m();
            this.f();
            this.a();
            return 0;
        }
        var6_6 = this.aG.r();
        if (var3_3 != 0) {
            if (var6_6 - this.b8 > 5L && !var4_4) {
                this.aG.a((x)this, (byte)32);
                this.b8 = var6_6;
                if (var3_3 != 0) return false;
            }
            this.o();
            this.f();
        }
        this.a();
        return false;
    }

    protected X a(l l2) {
        X x2;
        block6: {
            double d10;
            block11: {
                int n2;
                block9: {
                    double d11;
                    double d12;
                    block10: {
                        boolean bl2;
                        block7: {
                            double d13;
                            block8: {
                                double d14;
                                double d15;
                                double d16;
                                block4: {
                                    block5: {
                                        x2 = net.minecraft.B.X.MAINHAND;
                                        n2 = net.minecraft.J.j.d();
                                        bl2 = this.b();
                                        d12 = bl2 ? l2.d * 2.0 : l2.d;
                                        X x3 = net.minecraft.B.X.FEET;
                                        d16 = d12;
                                        d15 = 0.1;
                                        if (n2 == 0) break block4;
                                        if (!(d16 >= d15)) break block5;
                                        d16 = d12;
                                        d15 = 0.1 + (bl2 ? 0.8 : 0.45);
                                        if (n2 == 0) break block4;
                                        if (!(d16 < d15) || !this.a(x3)) break block5;
                                        x2 = net.minecraft.B.X.FEET;
                                        if (n2 != 0) break block6;
                                    }
                                    d16 = d12;
                                    d15 = 0.9;
                                }
                                d10 = (d14 = d16 - (d15 + (bl2 ? 0.3 : 0.0))) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                if (n2 == 0) break block7;
                                if (d10 < 0) break block8;
                                double d17 = d12 - (0.9 + (bl2 ? 1.0 : 0.7));
                                d10 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                if (n2 == 0) break block7;
                                if (d10 >= 0) break block8;
                                d10 = (double)this.a(net.minecraft.B.X.CHEST);
                                if (n2 == 0) break block7;
                                if (d10 == false) break block8;
                                x2 = net.minecraft.B.X.CHEST;
                                if (n2 != 0) break block6;
                            }
                            d10 = (d13 = d12 - 0.4) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (n2 == 0) break block9;
                        if (d10 < 0) break block10;
                        double d18 = d12 - (0.4 + (bl2 ? 1.0 : 0.8));
                        d10 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                        if (n2 == 0) break block9;
                        if (d10 >= 0) break block10;
                        d10 = (double)this.a(net.minecraft.B.X.LEGS);
                        if (n2 == 0) break block9;
                        if (d10 == false) break block10;
                        x2 = net.minecraft.B.X.LEGS;
                        if (n2 != 0) break block6;
                    }
                    d10 = (d11 = d12 - 1.6) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                }
                if (n2 == 0) break block11;
                if (d10 < 0) break block6;
                d10 = (double)this.a(net.minecraft.B.X.HEAD);
            }
            if (d10 != false) {
                x2 = net.minecraft.B.X.HEAD;
            }
        }
        return x2;
    }

    @Override
    public Iterable<d> aV() {
        return this.cj;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public float l() {
        float f10;
        int n2 = net.minecraft.J.j.c();
        n n3 = this;
        if (n2 == 0) {
            if (n3.Q()) {
                f10 = this.aD * 0.5f;
                return f10;
            }
            n3 = this;
        }
        f10 = n3.aD * 0.9f;
        return f10;
    }

    public void e(t t2) {
        this.b2 = t2;
        this.ap.b(b0, t2);
    }

    private void m(boolean bl2) {
        this.ap.b(b1, this.a(this.ap.b(b1), 4, bl2));
    }

    public void f(t t2) {
        this.b4 = t2;
        this.ap.b(cd, t2);
    }

    private void c(float f10) {
        block2: {
            float f11;
            block1: {
                int n2;
                block0: {
                    f11 = this.V();
                    f11 -= f10;
                    n2 = net.minecraft.J.j.c();
                    if (n2 != 0) break block0;
                    if (!(f11 <= 0.5f)) break block1;
                    this.e();
                    this.a();
                }
                if (n2 == 0) break block2;
            }
            this.f(f11);
        }
    }

    public t w() {
        return this.ch;
    }

    public void c(t t2) {
        this.b9 = t2;
        this.ap.b(ca, t2);
    }

    private void o(boolean bl2) {
        this.ap.b(b1, this.a(this.ap.b(b1), 16, bl2));
        this.c(0.5f, 1.975f);
    }

    @Override
    protected net.minecraft.ar.d a(int n2) {
        return net.minecraft.u.E.dI;
    }

    public void a(t t2) {
        this.ch = t2;
        this.ap.b(b_, t2);
    }

    @Override
    public void g(boolean bl2) {
        this.b6 = bl2;
        super.g(bl2);
    }

    @Override
    public boolean aF() {
        return false;
    }

    public t v() {
        return this.b2;
    }

    @Override
    public void y() {
        this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, d d10) {
        X x2;
        int n3;
        block8: {
            int n4;
            int n5;
            block15: {
                block16: {
                    block13: {
                        block14: {
                            block11: {
                                block12: {
                                    block9: {
                                        block10: {
                                            block6: {
                                                block7: {
                                                    n3 = net.minecraft.J.j.c();
                                                    n5 = n2;
                                                    n4 = 98;
                                                    if (n3 != 0) break block6;
                                                    if (n5 != n4) break block7;
                                                    x2 = net.minecraft.B.X.MAINHAND;
                                                    if (n3 == 0) break block8;
                                                }
                                                n5 = n2;
                                                n4 = 99;
                                            }
                                            if (n3 != 0) break block9;
                                            if (n5 != n4) break block10;
                                            x2 = net.minecraft.B.X.OFFHAND;
                                            if (n3 == 0) break block8;
                                        }
                                        n5 = n2;
                                        n4 = 100 + net.minecraft.B.X.HEAD.a();
                                    }
                                    if (n3 != 0) break block11;
                                    if (n5 != n4) break block12;
                                    x2 = net.minecraft.B.X.HEAD;
                                    if (n3 == 0) break block8;
                                }
                                n5 = n2;
                                n4 = 100 + net.minecraft.B.X.CHEST.a();
                            }
                            if (n3 != 0) break block13;
                            if (n5 != n4) break block14;
                            x2 = net.minecraft.B.X.CHEST;
                            if (n3 == 0) break block8;
                        }
                        n5 = n2;
                        n4 = 100 + net.minecraft.B.X.LEGS.a();
                    }
                    if (n3 != 0) break block15;
                    if (n5 != n4) break block16;
                    x2 = net.minecraft.B.X.LEGS;
                    if (n3 == 0) break block8;
                }
                n5 = n2;
                if (n3 != 0) return n5 != 0;
                n4 = 100 + net.minecraft.B.X.FEET.a();
            }
            if (n5 != n4) {
                return 0 != 0;
            }
            x2 = net.minecraft.B.X.FEET;
        }
        boolean bl2 = d10.G();
        if (n3 != 0) return bl2;
        if (!bl2) {
            bl2 = C.a(x2, d10);
            if (n3 != 0) return bl2;
            if (!bl2 && x2 != net.minecraft.B.X.HEAD) {
                return false;
            }
        }
        this.a(x2, d10);
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void d(x x2) {
    }

    @Override
    public double an() {
        return this.k() ? 0.0 : (double)0.1f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(r var1_1) {
        block8: {
            block9: {
                v0 = net.minecraft.J.j.c();
                super.a(var1_1);
                var2_2 = v0;
                v1 = var1_1.a("ArmorItems", 9);
                if (var2_2 != 0) break block9;
                if (v1) {
                    var3_3 = var1_1.c("ArmorItems", 10);
                    for (var4_7 = 0; var4_7 < this.cj.size(); ++var4_7) {
                        this.cj.set(var4_7, new d(var3_3.d(var4_7)));
                        if (var2_2 == 0) {
                            if (var2_2 == 0) continue;
                        }
                        break block8;
                    }
                }
                v2 = var1_1;
                v3 = "HandItems";
                v4 = 9;
                if (var2_2 != 0) ** GOTO lbl24
                v1 = v2.a(v3, v4);
            }
            if (v1) {
                v2 = var1_1;
                v3 = "HandItems";
                v4 = 10;
lbl24:
                // 2 sources

                var3_4 = v2.c(v3, v4);
                for (var4_7 = 0; var4_7 < this.b5.size(); ++var4_7) {
                    this.b5.set(var4_7, new d(var3_4.d(var4_7)));
                    if (var2_2 == 0) {
                        if (var2_2 == 0) continue;
                    }
                    break;
                }
            } else {
                this.g(var1_1.f("Invisible"));
                this.p(var1_1.f("Small"));
                this.m(var1_1.f("ShowArms"));
                this.b7 = var1_1.m("DisabledSlots");
                this.a(var1_1.f("NoBasePlate"));
                this.o(var1_1.f("Marker"));
            }
        }
        v5 = this.k();
        if (var2_2 == 0) {
            v5 = v5 == false;
        }
        this.bY = v5;
        this.K = this.aI();
        var3_6 = var1_1.h("Pose");
        this.b(var3_6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean r() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = super.r();
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = this.aI();
        }
        if (n2 == 0) return bl2;
        if (bl2) return false;
        return true;
    }

    private void b(r r2) {
        u u2 = r2.c("Head", 5);
        this.b(u2.c() ? cb : new t(u2));
        u u3 = r2.c("Body", 5);
        this.d(u3.c() ? cc : new t(u3));
        u u4 = r2.c("LeftArm", 5);
        this.c(u4.c() ? cl : new t(u4));
        u u5 = r2.c("RightArm", 5);
        this.f(u5.c() ? cf : new t(u5));
        u u6 = r2.c("LeftLeg", 5);
        this.a(u6.c() ? bX : new t(u6));
        u u7 = r2.c("RightLeg", 5);
        this.e(u7.c() ? b3 : new t(u7));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected final void c(float var1_1, float var2_2) {
        var4_3 = this.a;
        var6_4 = this.aF;
        var8_5 = this.ax;
        var3_6 = net.minecraft.J.j.c();
        v0 = this.k();
        if (var3_6 != 0) ** GOTO lbl11
        if (v0) {
            v1 = 0.0f;
        } else {
            v0 = this.Q();
lbl11:
            // 2 sources

            v1 = v0 != false ? 0.5f : 1.0f;
        }
        var10_7 = v1;
        super.c(var1_1 * var10_7, var2_2 * var10_7);
        this.g(var4_3, var6_4, var8_5);
    }

    @Override
    public boolean aA() {
        return this.a3();
    }

    @Override
    public void e(float f10) {
        this.aU = this.ak = f10;
        this.bh = this.a1 = f10;
    }

    private void o() {
        net.minecraft.W.K.a(this.aG, new net.minecraft.k.n(this), new d(net.minecraft.u.h.d));
        this.e();
    }

    static {
        cb = new t(0.0f, 0.0f, 0.0f);
        cc = new t(0.0f, 0.0f, 0.0f);
        cl = new t(-10.0f, 0.0f, -10.0f);
        cf = new t(-15.0f, 0.0f, 10.0f);
        bX = new t(-1.0f, 0.0f, -1.0f);
        b3 = new t(1.0f, 0.0f, 1.0f);
        b1 = net.minecraft.q.m.a(n.class, net.minecraft.q.h.m);
        cg = net.minecraft.q.m.a(n.class, net.minecraft.q.h.h);
        ce = net.minecraft.q.m.a(n.class, net.minecraft.q.h.h);
        ca = net.minecraft.q.m.a(n.class, net.minecraft.q.h.h);
        cd = net.minecraft.q.m.a(n.class, net.minecraft.q.h.h);
        b_ = net.minecraft.q.m.a(n.class, net.minecraft.q.h.h);
        b0 = net.minecraft.q.m.a(n.class, net.minecraft.q.h.h);
        ci = new a();
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public Iterable<d> k() {
        return this.b5;
    }

    @Override
    public void ae() {
        block17: {
            boolean bl2;
            int n2;
            block16: {
                super.ae();
                t t2 = this.ap.b(cg);
                n2 = net.minecraft.J.j.d();
                t t3 = this.bZ;
                if (n2 != 0) {
                    if (!t3.equals(t2)) {
                        this.b(t2);
                    }
                    t3 = this.ap.b(ce);
                }
                t t4 = t3;
                t t5 = this.ck;
                if (n2 != 0) {
                    if (!t5.equals(t4)) {
                        this.d(t4);
                    }
                    t5 = this.ap.b(ca);
                }
                t t6 = t5;
                t t7 = this.b9;
                if (n2 != 0) {
                    if (!t7.equals(t6)) {
                        this.c(t6);
                    }
                    t7 = this.ap.b(cd);
                }
                t t8 = t7;
                t t9 = this.b4;
                if (n2 != 0) {
                    if (!t9.equals(t8)) {
                        this.f(t8);
                    }
                    t9 = this.ap.b(b_);
                }
                t t10 = t9;
                t t11 = this.ch;
                if (n2 != 0) {
                    if (!t11.equals(t10)) {
                        this.a(t10);
                    }
                    t11 = this.ap.b(b0);
                }
                t t12 = t11;
                boolean bl3 = this.b2.equals(t12);
                if (n2 != 0) {
                    if (!bl3) {
                        this.e(t12);
                    }
                    bl3 = this.k();
                }
                bl2 = bl3;
                n n3 = this;
                if (n2 == 0) break block16;
                if (n3.bY == bl2) break block17;
                this.n(bl2);
                n3 = this;
            }
            boolean bl4 = bl2;
            if (n2 != 0) {
                bl4 = !bl4;
            }
            n3.az = bl4;
            this.bY = bl2;
        }
    }

    public n(z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
    }

    @Override
    public boolean Q() {
        return this.b();
    }

    @Override
    public void a(byte by2) {
        block5: {
            block3: {
                z z2;
                int n2;
                block4: {
                    byte by3;
                    block2: {
                        n2 = net.minecraft.J.j.d();
                        by3 = by2;
                        if (n2 == 0) break block2;
                        if (by3 != 32) break block3;
                        z2 = this.aG;
                        if (n2 == 0) break block4;
                        by3 = (byte)(z2.C ? 1 : 0);
                    }
                    if (by3 == 0) break block5;
                    z2 = this.aG;
                }
                z2.a(this.a, this.aF, this.ax, net.minecraft.u.E.cy, this.ad(), 0.3f, 1.0f, false);
                this.b8 = this.aG.r();
                if (n2 != 0) break block5;
            }
            super.a(by2);
        }
    }

    @Override
    protected void M() {
        this.g(this.b6);
    }

    @Override
    public void a(net.minecraft.an.b b10) {
    }

    @Override
    protected void af() {
        List<x> list = this.aG.a((x)this, this.m(), ci);
        int n2 = 0;
        int n3 = net.minecraft.J.j.d();
        while (n2 < list.size()) {
            x x2 = list.get(n2);
            if (n3 != 0) {
                if (this.s(x2) <= 0.2) {
                    x2.n(this);
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public aX a(net.minecraft.i.j var1_1, l var2_2, a3 var3_3) {
        block10: {
            block11: {
                block13: {
                    block12: {
                        var5_4 = var1_1.c(var3_3);
                        var4_5 = net.minecraft.J.j.c();
                        if (this.k() != false) return net.minecraft.ar.aX.PASS;
                        if (var5_4.w() == net.minecraft.u.h.bc) return net.minecraft.ar.aX.PASS;
                        v0 = this.aG.C;
                        if (var4_5 == 0) {
                            if (v0 != false) return net.minecraft.ar.aX.SUCCESS;
                            v0 = var1_1.ae();
                        }
                        if (v0 != false) return net.minecraft.ar.aX.SUCCESS;
                        var6_6 = C.a(var5_4);
                        v1 = var5_4.G();
                        if (var4_5 != 0) break block10;
                        if (!v1) break block11;
                        var7_7 = this.a(var2_2);
                        var8_8 = this.b(var7_7) != false ? var6_6 : var7_7;
                        v2 = this;
                        if (var4_5 != 0) break block12;
                        if (!v2.a(var8_8)) break block13;
                        v2 = this;
                    }
                    v2.a(var1_1, var8_8, var5_4, var3_3);
                }
                if (var4_5 == 0) return net.minecraft.ar.aX.SUCCESS;
            }
            v1 = this.b(var6_6);
        }
        if (v1) {
            return net.minecraft.ar.aX.FAIL;
        }
        if (var6_6.b() == net.minecraft.B.i.HAND) {
            v3 = this;
            if (var4_5 == 0) {
                if (!v3.u()) {
                    return net.minecraft.ar.aX.FAIL;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v3 = this;
        }
        v3.a(var1_1, var6_6, var5_4, var3_3);
        return net.minecraft.ar.aX.SUCCESS;
    }

    public boolean u() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.ap.b(b1) & 4;
        if (n2 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    private void m() {
        this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.aN, this.ad(), 1.0f, 1.0f);
    }

    @Override
    public boolean b(double d10) {
        double d11;
        int n2;
        block6: {
            double d12;
            double d13;
            block7: {
                double d14;
                block4: {
                    block5: {
                        d13 = this.m().d() * 4.0;
                        n2 = net.minecraft.J.j.c();
                        d14 = d13;
                        if (n2 != 0) break block4;
                        if (Double.isNaN(d14)) break block5;
                        double d15 = d13 - 0.0;
                        d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        if (n2 != 0) break block6;
                        if (d11 != false) break block7;
                    }
                    d14 = 4.0;
                }
                d13 = d14;
            }
            d11 = (d12 = d10 - (d13 *= 64.0) * d13) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (n2 == 0) {
            d11 = d11 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean M() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = super.M();
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = this.k();
        }
        if (n2 == 0) return bl2;
        if (bl2) return false;
        return true;
    }

    public boolean x() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.ap.b(b1) & 8;
        if (n2 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static void b(net.minecraft.av.b b10) {
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new net.minecraft.x.d(n.class, "ArmorItems", "HandItems"));
    }

    private void n(boolean bl2) {
        block2: {
            block1: {
                int n2;
                block0: {
                    n2 = net.minecraft.J.j.c();
                    if (n2 != 0) break block0;
                    if (!bl2) break block1;
                    this.c(0.0f, 0.0f);
                }
                if (n2 == 0) break block2;
            }
            this.c(0.5f, 1.975f);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public d b(X x2) {
        int n2 = net.minecraft.J.j.c();
        Object object = h.a;
        if (n2 != 0) return (d)object;
        switch (object[x2.b().ordinal()]) {
            case 1: {
                object = this.b5.get(x2.a());
                return (d)object;
            }
            case 2: {
                return this.cj.get(x2.a());
            }
        }
        return net.minecraft.w.d.m;
    }

    public n(z z2) {
        super(z2);
        this.b5 = net.minecraft.ar.a2.a(2, net.minecraft.w.d.m);
        this.cj = net.minecraft.ar.a2.a(4, net.minecraft.w.d.m);
        this.bZ = cb;
        this.ck = cc;
        this.b9 = cl;
        this.b4 = cf;
        this.ch = bX;
        this.b2 = b3;
        this.K = this.aI();
        this.c(0.5f, 1.975f);
    }

    @Override
    public void f(r r2) {
        block17: {
            boolean bl2;
            block16: {
                int n2;
                block15: {
                    int n3 = net.minecraft.J.j.c();
                    super.f(r2);
                    u u2 = new u();
                    n2 = n3;
                    for (d object : this.cj) {
                        r r3 = new r();
                        if (n2 == 0) {
                            if (n2 == 0) {
                                if (!object.G()) {
                                    object.a(r3);
                                }
                                u2.a(r3);
                            }
                            if (n2 == 0) continue;
                        }
                        break block15;
                    }
                    r2.a("ArmorItems", u2);
                }
                u u3 = new u();
                for (d d10 : this.b5) {
                    r r4 = new r();
                    if (n2 == 0) {
                        bl2 = d10.G();
                        if (n2 != 0) break block16;
                        if (!bl2) {
                            d10.a(r4);
                        }
                        u3.a(r4);
                    }
                    if (n2 == 0) continue;
                }
                r2.a("HandItems", u3);
                r2.a("Invisible", this.a3());
                r2.a("Small", this.b());
                r2.a("ShowArms", this.u());
                r2.b("DisabledSlots", this.b7);
                r2.a("NoBasePlate", this.x());
                if (n2 != 0) break block17;
                bl2 = this.k();
            }
            if (bl2) {
                r2.a("Marker", this.k());
            }
            r2.a("Pose", this.p());
        }
    }

    private r p() {
        r r2;
        block10: {
            r2 = new r();
            int n2 = net.minecraft.J.j.c();
            boolean bl2 = cb.equals(this.bZ);
            if (n2 == 0) {
                if (!bl2) {
                    r2.a("Head", this.bZ.b());
                }
                bl2 = cc.equals(this.ck);
            }
            if (n2 == 0) {
                if (!bl2) {
                    r2.a("Body", this.ck.b());
                }
                bl2 = cl.equals(this.b9);
            }
            if (n2 == 0) {
                if (!bl2) {
                    r2.a("LeftArm", this.b9.b());
                }
                bl2 = cf.equals(this.b4);
            }
            if (n2 == 0) {
                if (!bl2) {
                    r2.a("RightArm", this.b4.b());
                }
                bl2 = bX.equals(this.ch);
            }
            if (n2 == 0) {
                if (!bl2) {
                    r2.a("LeftLeg", this.ch.b());
                }
                bl2 = b3.equals(this.b2);
            }
            if (bl2) break block10;
            r2.a("RightLeg", this.b2.b());
        }
        return r2;
    }

    public t c() {
        return this.bZ;
    }

    private void f() {
        block3: {
            z z2;
            block2: {
                int n2 = net.minecraft.J.j.d();
                z2 = this.aG;
                if (n2 == 0) break block2;
                if (!(z2 instanceof A)) break block3;
                z2 = this.aG;
            }
            ((A)z2).a(net.minecraft.ar.aH.BLOCK_DUST, this.a, this.aF + (double)this.aD / 1.5, this.ax, 10, (double)(this.ad / 4.0f), (double)(this.aD / 4.0f), (double)(this.ad / 4.0f), 0.05, net.minecraft.W.K.l(net.minecraft.u.g.cB.d()));
        }
    }

    @Override
    public boolean aY() {
        return false;
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        int n2 = net.minecraft.J.j.d();
        if (n2 != 0) {
            if (b1.equals(r2)) {
                this.c(0.5f, 1.975f);
            }
            super.a(r2);
        }
    }

    private void e() {
        d d10;
        int n2;
        int n3;
        block7: {
            int n4;
            int n5 = net.minecraft.J.j.d();
            this.m();
            n3 = 0;
            n2 = n5;
            while (n3 < this.b5.size()) {
                d10 = this.b5.get(n3);
                if (n2 != 0) {
                    n4 = d10.G() ? 1 : 0;
                    if (n2 == 0) break block7;
                    if (n4 == 0) {
                        net.minecraft.W.K.a(this.aG, new net.minecraft.k.n(this).a(), d10);
                        this.b5.set(n3, net.minecraft.w.d.m);
                    }
                    ++n3;
                }
                if (n2 != 0) continue;
            }
            n4 = n3 = 0;
        }
        while (n3 < this.cj.size()) {
            d10 = this.cj.get(n3);
            if (n2 != 0) {
                if (!d10.G()) {
                    net.minecraft.W.K.a(this.aG, new net.minecraft.k.n(this).a(), d10);
                    this.cj.set(n3, net.minecraft.w.d.m);
                }
                ++n3;
            }
            if (n2 != 0) continue;
        }
    }

    public void b(t t2) {
        this.bZ = t2;
        this.ap.b(cg, t2);
    }

    public t a() {
        return this.b4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(X var1_1, d var2_2) {
        var3_3 = net.minecraft.J.j.c();
        v0 /* !! */  = h.a;
        if (var3_3 != 0) ** GOTO lbl8
        switch (v0 /* !! */ [var1_1.b().ordinal()]) {
            case 1: {
                this.b(var2_2);
                v0 /* !! */  = (int[])this.b5.set(var1_1.a(), var2_2);
lbl8:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 2: {
                this.b(var2_2);
                this.cj.set(var1_1.a(), var2_2);
                return;
            }
        }
    }

    public boolean b() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.ap.b(b1) & 1;
        if (n2 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    protected float a(float f10, float f11) {
        this.aU = this.ak;
        this.bf = this.e;
        return 0.0f;
    }

    public t n() {
        return this.b9;
    }

    @Override
    @Nullable
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.aN;
    }

    public t l() {
        return this.ck;
    }

    private boolean b(X x2) {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.b7 & 1 << x2.d();
        if (n2 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(b1, (byte)0);
        this.ap.c(cg, cb);
        this.ap.c(ce, cc);
        this.ap.c(ca, cl);
        this.ap.c(cd, cf);
        this.ap.c(b_, bX);
        this.ap.c(b0, b3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public b z() {
        b b10;
        int n2 = net.minecraft.J.j.c();
        n n3 = this;
        if (n2 == 0) {
            if (n3.k()) {
                b10 = b.IGNORE;
                return b10;
            }
            n3 = this;
        }
        b10 = super.z();
        return b10;
    }

    private byte a(byte by2, int n2, boolean bl2) {
        block4: {
            byte by3;
            block2: {
                block3: {
                    int n3 = net.minecraft.J.j.d();
                    by3 = bl2;
                    if (n3 == 0) break block2;
                    if (by3 == false) break block3;
                    by2 = (byte)(by2 | n2);
                    if (n3 != 0) break block4;
                }
                by3 = (byte)(by2 & ~n2);
            }
            by2 = by3;
        }
        return by2;
    }

    public void d(t t2) {
        this.ck = t2;
        this.ap.b(ce, t2);
    }

    @Override
    public net.minecraft.ar.b al() {
        return net.minecraft.ar.b.RIGHT;
    }
}

