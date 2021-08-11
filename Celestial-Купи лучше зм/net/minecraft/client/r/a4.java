/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.r;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.J.s;
import net.minecraft.T.a0;
import net.minecraft.T.a3;
import net.minecraft.T.a5;
import net.minecraft.T.aN;
import net.minecraft.T.aO;
import net.minecraft.T.aS;
import net.minecraft.T.aZ;
import net.minecraft.T.a_;
import net.minecraft.T.ab;
import net.minecraft.T.ad;
import net.minecraft.T.ag;
import net.minecraft.T.ah;
import net.minecraft.T.ai;
import net.minecraft.T.am;
import net.minecraft.T.aq;
import net.minecraft.T.az;
import net.minecraft.U.x;
import net.minecraft.W.bn;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.Q;
import net.minecraft.client.a.as;
import net.minecraft.client.j.u;
import net.minecraft.client.q.a;
import net.minecraft.client.r.A;
import net.minecraft.client.r.B;
import net.minecraft.client.r.C;
import net.minecraft.client.r.D;
import net.minecraft.client.r.E;
import net.minecraft.client.r.F;
import net.minecraft.client.r.G;
import net.minecraft.client.r.H;
import net.minecraft.client.r.I;
import net.minecraft.client.r.J;
import net.minecraft.client.r.K;
import net.minecraft.client.r.L;
import net.minecraft.client.r.M;
import net.minecraft.client.r.N;
import net.minecraft.client.r.O;
import net.minecraft.client.r.P;
import net.minecraft.client.r.R;
import net.minecraft.client.r.S;
import net.minecraft.client.r.T;
import net.minecraft.client.r.U;
import net.minecraft.client.r.V;
import net.minecraft.client.r.W;
import net.minecraft.client.r.X;
import net.minecraft.client.r.Y;
import net.minecraft.client.r.Z;
import net.minecraft.client.r.a1;
import net.minecraft.client.r.a2;
import net.minecraft.client.r.a6;
import net.minecraft.client.r.a7;
import net.minecraft.client.r.a9;
import net.minecraft.client.r.aA;
import net.minecraft.client.r.aC;
import net.minecraft.client.r.aD;
import net.minecraft.client.r.aE;
import net.minecraft.client.r.aF;
import net.minecraft.client.r.aG;
import net.minecraft.client.r.aH;
import net.minecraft.client.r.aR;
import net.minecraft.client.r.aT;
import net.minecraft.client.r.aV;
import net.minecraft.client.r.aW;
import net.minecraft.client.r.aX;
import net.minecraft.client.r.aa;
import net.minecraft.client.r.ae;
import net.minecraft.client.r.al;
import net.minecraft.client.r.an;
import net.minecraft.client.r.ao;
import net.minecraft.client.r.at;
import net.minecraft.client.r.au;
import net.minecraft.client.r.av;
import net.minecraft.client.r.aw;
import net.minecraft.client.r.ay;
import net.minecraft.client.r.b;
import net.minecraft.client.r.c;
import net.minecraft.client.r.e;
import net.minecraft.client.r.g;
import net.minecraft.client.r.h;
import net.minecraft.client.r.i;
import net.minecraft.client.r.j;
import net.minecraft.client.r.k;
import net.minecraft.client.r.m;
import net.minecraft.client.r.n;
import net.minecraft.client.r.o;
import net.minecraft.client.r.q;
import net.minecraft.client.r.r;
import net.minecraft.client.r.t;
import net.minecraft.client.r.v;
import net.minecraft.client.r.w;
import net.minecraft.client.r.y;
import net.minecraft.client.r.z;
import net.minecraft.h.d;
import net.p;

public class a4 {
    private final /* synthetic */ ae c;
    public /* synthetic */ b o;
    public /* synthetic */ x v;
    public /* synthetic */ net.minecraft.client.l.c q;
    private /* synthetic */ boolean s;
    private /* synthetic */ boolean e;
    private /* synthetic */ net.minecraft.client.b.a5 p;
    public /* synthetic */ float a;
    public /* synthetic */ double g;
    private final /* synthetic */ Map<Class, b> t;
    public /* synthetic */ float f;
    public /* synthetic */ double m;
    public /* synthetic */ double i;
    public /* synthetic */ u d;
    private final /* synthetic */ Map<String, ae> l;
    private /* synthetic */ boolean r;
    public /* synthetic */ x n;
    public /* synthetic */ double k;
    public /* synthetic */ double j;
    public /* synthetic */ double u;
    public /* synthetic */ net.minecraft.ah.z h;
    public /* synthetic */ x b;

    public <T extends x> b<T> a(Class<? extends x> class_) {
        b<T> b10 = this.t.get(class_);
        net.minecraft.k.m[] arrm = net.minecraft.client.r.b.b();
        b<T> b11 = b10;
        if (arrm == null) {
            if (b11 == null) {
                Object object = class_;
                if (arrm == null && object != x.class) {
                    b10 = this.a(class_.getSuperclass());
                    object = this.t.put(class_, b10);
                }
            }
            b11 = b10;
        }
        return b11;
    }

    public net.minecraft.client.b.a5 d() {
        return this.p;
    }

    public void a(x x2, float f10, boolean bl2) {
        net.minecraft.k.m[] arrm = net.minecraft.client.r.b.b();
        x x3 = x2;
        if (arrm == null) {
            if (x3.H == 0) {
                x2.am = x2.a;
                x2.af = x2.aF;
                x2.n = x2.ax;
            }
            x3 = x2;
        }
        double d10 = x3.am + (x2.a - x2.am) * (double)f10;
        double d11 = x2.af + (x2.aF - x2.af) * (double)f10;
        double d12 = x2.n + (x2.ax - x2.n) * (double)f10;
        float f11 = x2.ak + (x2.e - x2.ak) * f10;
        int n2 = x2.aS();
        int n3 = x2.p();
        if (arrm == null) {
            if (n3 != 0) {
                n2 = 0xF000F0;
            }
            n3 = n2 % 65536;
        }
        int n4 = n3;
        int n5 = n2 / 65536;
        as.a(as.p, n4, (float)n5);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(x2, d10 - this.i, d11 - this.k, d12 - this.g, f11, f10, bl2);
    }

    public void a(float f10) {
        this.f = f10;
    }

    public void a(double d10, double d11, double d12) {
        this.i = d10;
        this.k = d11;
        this.g = d12;
    }

    public double b(double d10, double d11, double d12) {
        double d13 = d10 - this.m;
        double d14 = d11 - this.u;
        double d15 = d12 - this.j;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    public void a(@Nullable net.minecraft.ah.z z2) {
        block3: {
            block2: {
                net.minecraft.k.m[] arrm = net.minecraft.client.r.b.b();
                a4 a42 = this;
                if (arrm != null) break block2;
                a42.h = z2;
                if (z2 != null) break block3;
                a42 = this;
            }
            a42.b = null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(x var1_1, double var2_2, double var4_3, double var6_4, float var8_5, float var9_6, boolean var10_7) {
        block19: {
            block18: {
                block17: {
                    var12_8 = null;
                    var11_9 = net.minecraft.client.r.b.b();
                    var12_8 = this.b(var1_1);
                    if (var12_8 == null) return;
                    if (this.d == null) return;
                    var12_8.a(this.s);
                    if (var11_9 != null) ** GOTO lbl20
                    if (!net.p.e()) break block17;
                    this.v = var1_1;
                    this.o = var12_8;
                    {
                        catch (Throwable var13_10) {
                            throw new net.minecraft.ar.Z(net.minecraft.c.f.a(var13_10, "Rendering entity in world"));
                        }
                    }
                }
                try {
                    var12_8.d(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6);
lbl20:
                    // 2 sources

                    try {
                        if (!this.s) {
                            var12_8.b(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6);
                        }
                    }
                    catch (Throwable var13_11) {
                        throw new net.minecraft.ar.Z(net.minecraft.c.f.a(var13_11, "Post-rendering entity in world"));
                    }
                    v0 = this.e;
                    if (var11_9 != null) break block18;
                    if (v0 == false) return;
                }
                catch (Throwable var13_13) {
                    var14_14 = net.minecraft.c.f.a(var13_13, "Rendering entity in world");
                    var15_15 = var14_14.a("Entity being rendered");
                    var1_1.a(var15_15);
                    var16_16 = var14_14.a("Renderer details");
                    var16_16.a("Assigned renderer", var12_8);
                    var16_16.a("Location", net.minecraft.c.l.a(var2_2, var4_3, var6_4));
                    var16_16.a("Rotation", Float.valueOf(var8_5));
                    var16_16.a("Delta", Float.valueOf(var9_6));
                    throw new net.minecraft.ar.Z(var14_14);
                }
                v0 = var1_1.a3();
            }
            if (var11_9 != null) ** GOTO lbl47
            if (v0 != false) return;
            v0 = var10_7;
lbl47:
            // 2 sources

            if (var11_9 != null) break block19;
            if (v0 != false) return;
            v0 = Q.P().E();
        }
        if (v0 != false) return;
        try {
            this.a(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6);
            return;
        }
        catch (Throwable var13_12) {
            throw new net.minecraft.ar.Z(net.minecraft.c.f.a(var13_12, "Rendering entity hitbox in world"));
        }
    }

    public Map<Class, b> c() {
        return this.t;
    }

    public boolean a() {
        return this.r;
    }

    public Map<String, ae> e() {
        return Collections.unmodifiableMap(this.l);
    }

    public void a(net.minecraft.ah.z z2, net.minecraft.client.b.a5 a52, x x2, x x3, net.minecraft.client.l.c c10, float f10) {
        block13: {
            block8: {
                block9: {
                    net.minecraft.k.m[] arrm;
                    block12: {
                        net.minecraft.W.K k2;
                        net.minecraft.Z.i i2;
                        block10: {
                            net.minecraft.W.K k3;
                            block11: {
                                this.h = z2;
                                this.q = c10;
                                this.b = x2;
                                arrm = net.minecraft.client.r.b.b();
                                this.n = x3;
                                this.p = a52;
                                if (arrm != null) break block8;
                                if (!(x2 instanceof net.minecraft.U.B) || !((net.minecraft.U.B)x2).as()) break block9;
                                i2 = z2.d(new net.minecraft.k.n(x2));
                                k2 = k3 = i2.b();
                                if (arrm != null) break block10;
                                if (!cq.g(k2, cq.ct, i2, z2, new net.minecraft.k.n(x2), x2)) break block11;
                                net.minecraft.ar.aA aA2 = (net.minecraft.ar.aA)cq.d(k3, cq.al, i2, z2, new net.minecraft.k.n(x2));
                                int n2 = aA2.k();
                                this.f = n2 * 90 + 180;
                                this.a = 0.0f;
                                if (arrm == null) break block12;
                            }
                            k2 = k3;
                        }
                        if (k2 == net.minecraft.u.g.R) {
                            int n3 = i2.b(bn.z).k();
                            this.f = n3 * 90 + 180;
                            this.a = 0.0f;
                        }
                    }
                    if (arrm == null) break block13;
                }
                this.f = x2.ak + (x2.e - x2.ak) * f10;
            }
            this.a = x2.E + (x2.at - x2.E) * f10;
        }
        if (c10.L == 2) {
            this.f += 180.0f;
        }
        this.m = x2.am + (x2.a - x2.am) * (double)f10;
        this.u = x2.af + (x2.aF - x2.af) * (double)f10;
        this.j = x2.n + (x2.ax - x2.n) * (double)f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(x x2, net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        b<x> b11 = this.b(x2);
        net.minecraft.k.m[] arrm = net.minecraft.client.r.b.b();
        b<x> b12 = b11;
        if (arrm == null) {
            if (b12 == null) return false;
            b12 = b11;
        }
        boolean bl2 = b12.a(x2, b10, d10, d11, d12);
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public a4(u u2, net.minecraft.client.a.p p2) {
        this.t = Maps.newHashMap();
        this.l = Maps.newHashMap();
        this.r = true;
        this.v = null;
        this.o = null;
        this.d = u2;
        this.t.put(ab.class, new aC(this));
        this.t.put(am.class, new aA(this));
        this.t.put(net.minecraft.ag.O.class, new au(this));
        this.t.put(net.minecraft.ag.Q.class, new av(this));
        this.t.put(net.minecraft.ag.M.class, new I(this));
        this.t.put(net.minecraft.ag.N.class, new X(this));
        this.t.put(net.minecraft.ag.V.class, new an(this));
        this.t.put(net.minecraft.ag.L.class, new H(this));
        this.t.put(net.minecraft.ag.S.class, new Y(this));
        this.t.put(net.minecraft.ag.P.class, new aw(this));
        this.t.put(net.minecraft.ag.U.class, new Z(this));
        this.t.put(a3.class, new aE(this));
        this.t.put(aq.class, new M(this));
        this.t.put(net.minecraft.T.aR.class, new J(this));
        this.t.put(ah.class, new L(this));
        this.t.put(net.minecraft.T.an.class, new a9(this));
        this.t.put(net.minecraft.T.ay.class, new z(this));
        this.t.put(net.minecraft.T.a2.class, new B(this));
        this.t.put(net.minecraft.T.ak.class, new A(this));
        this.t.put(a5.class, new aX(this));
        this.t.put(net.minecraft.T.aW.class, new G(this));
        this.t.put(aN.class, new y(this));
        this.t.put(net.minecraft.T.a4.class, new D(this));
        this.t.put(ag.class, new F(this));
        this.t.put(aO.class, new E(this));
        this.t.put(ai.class, new a6(this));
        this.t.put(ad.class, new W(this));
        this.t.put(az.class, new P(this, 6.0f));
        this.t.put(aZ.class, new O(this));
        this.t.put(net.minecraft.ag.au.class, new aa(this));
        this.t.put(net.minecraft.ag.W.class, new aH(this));
        this.t.put(net.minecraft.T.aX.class, new U(this));
        this.t.put(net.minecraft.ag.Y.class, new w(this));
        net.minecraft.k.m[] arrm = net.minecraft.client.r.b.b();
        this.t.put(a0.class, new net.minecraft.client.r.Q(this));
        this.t.put(a_.class, new R(this));
        this.t.put(net.minecraft.T.aF.class, new al(this));
        this.t.put(net.minecraft.T.aH.class, new a1(this));
        this.t.put(net.minecraft.T.ao.class, new N(this));
        this.t.put(net.minecraft.T.aT.class, new a7(this));
        this.t.put(aS.class, new C(this));
        this.t.put(net.minecraft.T.aD.class, new T(this));
        this.t.put(d.class, new K(this));
        this.t.put(net.minecraft.J.p.class, new i(this));
        this.t.put(net.minecraft.h.c.class, new aF(this));
        this.t.put(x.class, new j(this));
        this.t.put(net.minecraft.J.m.class, new aT(this));
        this.t.put(net.minecraft.J.l.class, new net.minecraft.client.r.p(this, p2));
        this.t.put(net.minecraft.U.A.class, new q(this));
        this.t.put(net.minecraft.z.h.class, new net.minecraft.client.r.f(this));
        this.t.put(net.minecraft.z.g.class, new e(this));
        this.t.put(net.minecraft.z.u.class, new ay(this, net.minecraft.u.h.aB, p2));
        this.t.put(net.minecraft.J.F.class, new ay(this, net.minecraft.u.h.o, p2));
        this.t.put(net.minecraft.J.q.class, new ay(this, net.minecraft.u.h.cE, p2));
        this.t.put(net.minecraft.z.s.class, new ay(this, net.minecraft.u.h.bB, p2));
        this.t.put(net.minecraft.z.t.class, new net.minecraft.client.r.ak(this, p2));
        this.t.put(net.minecraft.J.G.class, new ay(this, net.minecraft.u.h.bG, p2));
        this.t.put(s.class, new ay(this, net.minecraft.u.h.av, p2));
        this.t.put(net.minecraft.z.l.class, new n(this, 2.0f));
        this.t.put(net.minecraft.z.m.class, new n(this, 0.5f));
        this.t.put(net.minecraft.z.k.class, new h(this));
        this.t.put(net.minecraft.z.n.class, new aW(this));
        this.t.put(net.minecraft.z.q.class, new aV(this));
        this.t.put(net.minecraft.J.t.class, new k(this, p2));
        this.t.put(net.minecraft.J.E.class, new aR(this));
        this.t.put(net.minecraft.J.D.class, new a2(this));
        this.t.put(net.minecraft.J.r.class, new m(this));
        this.t.put(net.minecraft.J.n.class, new t(this));
        this.t.put(net.minecraft.z.i.class, new net.minecraft.client.r.l(this));
        this.t.put(net.minecraft.J.C.class, new aD(this));
        this.t.put(net.minecraft.J.B.class, new ao(this));
        net.minecraft.k.m[] arrm2 = arrm;
        this.t.put(net.minecraft.J.u.class, new at(this));
        this.t.put(net.minecraft.J.o.class, new g(this));
        this.t.put(net.minecraft.z.o.class, new o(this));
        this.t.put(net.minecraft.U.y.class, new c(this));
        this.t.put(net.minecraft.ag.I.class, new S(this));
        this.t.put(net.minecraft.ag.J.class, new v(this));
        this.t.put(net.minecraft.ag.K.class, new v(this));
        this.t.put(net.minecraft.ag.H.class, new v(this, 0.92f));
        this.t.put(net.minecraft.ag.F.class, new v(this, 0.87f));
        this.t.put(net.minecraft.ag.G.class, new V(this));
        this.t.put(net.minecraft.z.p.class, new aG(this));
        this.t.put(net.minecraft.an.b.class, new r(this));
        this.c = new ae(this);
        this.l.put("default", this.c);
        this.l.put("slim", new ae(this, true));
        ee.a(this.l);
        Object object = cq.du;
        if (arrm2 == null && ((ak)object).b()) {
            object = cq.d(cq.du, this, this.t);
        }
        if (arrm2 != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    public void a(x x2, float f10) {
        block4: {
            net.minecraft.k.m[] arrm = net.minecraft.client.r.b.b();
            x x3 = x2;
            if (arrm == null) {
                if (x3.H == 0) {
                    x2.am = x2.a;
                    x2.af = x2.aF;
                    x2.n = x2.ax;
                }
                x3 = x2;
            }
            double d10 = x3.am + (x2.a - x2.am) * (double)f10;
            double d11 = x2.af + (x2.aF - x2.af) * (double)f10;
            double d12 = x2.n + (x2.ax - x2.n) * (double)f10;
            float f11 = x2.ak + (x2.e - x2.ak) * f10;
            int n2 = x2.aS();
            int n3 = x2.p();
            if (arrm == null) {
                if (n3 != 0) {
                    n2 = 0xF000F0;
                }
                n3 = n2 % 65536;
            }
            int n4 = n3;
            int n5 = n2 / 65536;
            as.a(as.p, n4, (float)n5);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            b<x> b10 = this.b(x2);
            if (b10 == null || this.d == null) break block4;
            b10.c(x2, d10 - this.i, d11 - this.k, d12 - this.g, f11, f10);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(x var1_1, double var2_2, double var4_3, double var6_4, float var8_5, float var9_6) {
        net.minecraft.client.a.v.a(false);
        net.minecraft.client.a.v.L();
        v0 = net.minecraft.client.r.b.b();
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.E();
        net.minecraft.client.a.v.f();
        var11_7 = var1_1.ad / 2.0f;
        var12_8 = var1_1.m();
        net.minecraft.client.a.aF.b(var12_8.e - var1_1.a + var2_2, var12_8.b - var1_1.aF + var4_3, var12_8.d - var1_1.ax + var6_4, var12_8.f - var1_1.a + var2_2, var12_8.a - var1_1.aF + var4_3, var12_8.g - var1_1.ax + var6_4, 1.0f, 1.0f, 1.0f, 1.0f);
        var13_9 = var1_1.aE();
        var10_10 = v0;
        v1 = var13_9;
        if (var10_10 != null) ** GOTO lbl16
        if (v1 != null) {
            v1 = var13_9;
lbl16:
            // 3 sources

            for (x var17_17 : v1) {
                var18_18 = (var17_17.a - var17_17.N) * (double)var9_6;
                var20_19 = (var17_17.aF - var17_17.L) * (double)var9_6;
                var22_20 = (var17_17.ax - var17_17.k) * (double)var9_6;
                var24_21 = var17_17.m();
                net.minecraft.client.a.aF.b(var24_21.e - this.i + var18_18, var24_21.b - this.k + var20_19, var24_21.d - this.g + var22_20, var24_21.f - this.i + var18_18, var24_21.a - this.k + var20_19, var24_21.g - this.g + var22_20, 0.25f, 1.0f, 0.0f, 1.0f);
                if (var10_10 == null) {
                    if (var10_10 == null) continue;
                }
                break;
            }
        } else if (var1_1 instanceof net.minecraft.U.B) {
            var14_12 = 0.01f;
            net.minecraft.client.a.aF.b(var2_2 - (double)var11_7, var4_3 + (double)var1_1.l() - 0.009999999776482582, var6_4 - (double)var11_7, var2_2 + (double)var11_7, var4_3 + (double)var1_1.l() + 0.009999999776482582, var6_4 + (double)var11_7, 1.0f, 0.0f, 0.0f, 1.0f);
        }
        var14_11 = net.minecraft.client.a.W.c();
        var15_14 = var14_11.b();
        var16_16 = var1_1.b(var9_6);
        var15_14.a(3, net.minecraft.client.y.b.i);
        var15_14.c(var2_2, var4_3 + (double)var1_1.l(), var6_4).b(0, 0, 255, 255).d();
        var15_14.c(var2_2 + var16_16.e * 2.0, var4_3 + (double)var1_1.l() + var16_16.d * 2.0, var6_4 + var16_16.b * 2.0).b(0, 0, 255, 255).d();
        var14_11.a();
        net.minecraft.client.a.v.x();
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.c();
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.a(true);
    }

    @Nullable
    public <T extends x> b<T> b(x x2) {
        block5: {
            ae ae2;
            x x3;
            net.minecraft.k.m[] arrm;
            block4: {
                arrm = net.minecraft.client.r.b.b();
                x3 = x2;
                if (arrm != null) break block4;
                if (!(x3 instanceof a)) break block5;
                x3 = x2;
            }
            String string = ((a)x3).h();
            ae ae3 = ae2 = this.l.get(string);
            if (arrm == null) {
                ae3 = ae3 != null ? ae2 : this.c;
            }
            return ae3;
        }
        return this.a(x2.getClass());
    }

    public void a(boolean bl2) {
        this.r = bl2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void b(boolean bl2) {
        this.s = bl2;
    }

    public boolean b() {
        return this.e;
    }

    public boolean a(x x2) {
        return this.b(x2).e();
    }

    public void c(boolean bl2) {
        this.e = bl2;
    }
}

