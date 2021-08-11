/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.r;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aW;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.l.c;
import net.minecraft.client.r.a4;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.q;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class b<T extends x>
implements q {
    protected final /* synthetic */ a4 h;
    private static /* synthetic */ m[] f;
    protected /* synthetic */ float d;
    public /* synthetic */ float a;
    private /* synthetic */ net.minecraft.ar.v e;
    private static final /* synthetic */ net.minecraft.ar.v c;
    protected /* synthetic */ boolean g;
    private /* synthetic */ Class b;

    private void a(i i2, double d10, double d11, double d12, n n2, float f10, float f11, double d13, double d14, double d15) {
        block2: {
            double d16;
            I i3;
            block5: {
                double d17;
                block4: {
                    double d18;
                    block3: {
                        m[] arrm = net.minecraft.client.r.b.b();
                        if (!i2.k()) break block2;
                        W w2 = W.c();
                        i3 = w2.b();
                        d16 = ((double)f10 - (d11 - ((double)n2.b() + d14)) / 2.0) * 0.5 * (double)this.c().k(n2);
                        double d19 = d16 - 0.0;
                        d18 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                        if (arrm != null) break block3;
                        if (d18 < 0) break block2;
                        d17 = d16;
                        if (arrm != null) break block4;
                        double d20 = d17 - 1.0;
                        d18 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (d18 <= 0) break block5;
                    d17 = 1.0;
                }
                d16 = d17;
            }
            k k2 = i2.f(this.c(), n2);
            double d21 = (double)n2.e() + k2.e + d13;
            double d22 = (double)n2.e() + k2.f + d13;
            double d23 = (double)n2.b() + k2.b + d14 + 0.015625;
            double d24 = (double)n2.a() + k2.d + d15;
            double d25 = (double)n2.a() + k2.g + d15;
            float f12 = (float)((d10 - d21) / 2.0 / (double)f11 + 0.5);
            float f13 = (float)((d10 - d22) / 2.0 / (double)f11 + 0.5);
            float f14 = (float)((d12 - d24) / 2.0 / (double)f11 + 0.5);
            float f15 = (float)((d12 - d25) / 2.0 / (double)f11 + 0.5);
            i3.c(d21, d23, d24).a(f12, f14).a(1.0f, 1.0f, 1.0f, (float)d16).d();
            i3.c(d21, d23, d25).a(f12, f15).a(1.0f, 1.0f, 1.0f, (float)d16).d();
            i3.c(d22, d23, d25).a(f13, f15).a(1.0f, 1.0f, 1.0f, (float)d16).d();
            i3.c(d22, d23, d24).a(f13, f14).a(1.0f, 1.0f, 1.0f, (float)d16).d();
        }
    }

    protected void a(T t2, double d10, double d11, double d12, String string, double d13) {
        this.a(t2, string, d10, d11, d12, 64);
    }

    protected void a(T t2, String string, double d10, double d11, double d12, int n2) {
        block7: {
            double d13;
            m[] arrm;
            block6: {
                double d14 = ((x)t2).s(this.h.b);
                arrm = net.minecraft.client.r.b.b();
                double d13 = d14 - (double)(n2 * n2);
                d13 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                if (arrm != null) break block6;
                if (d13 > 0) break block7;
                d13 = (double)((x)t2).a4();
            }
            double d16 = d13;
            float f10 = this.h.f;
            float f11 = this.h.a;
            boolean bl2 = this.h.q.L;
            if (arrm == null) {
                bl2 = bl2;
            }
            boolean bl3 = bl2;
            float f13 = ((x)t2).aD;
            f13 = 0.5f;
            if (arrm == null) {
                float f13 = f12 + f13;
                f13 = d16 != false ? 0.25f : 0.0f;
            }
            float f14 = f12 - f13;
            int n3 = "deadmau5".equals(string);
            if (arrm == null) {
                n3 = n3 != 0 ? -10 : 0;
            }
            int n4 = n3;
            net.minecraft.client.a.x.a(this.d(), string, (float)d10, (float)d11 + f14, (float)d12, n4, f10, f11, bl3, (boolean)d16);
        }
    }

    public boolean e() {
        return false;
    }

    static {
        c = new net.minecraft.ar.v("textures/misc/shadow.png");
        net.minecraft.client.r.b.b(null);
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    private z c() {
        return this.h.h;
    }

    public void b(net.minecraft.ar.v v2) {
        this.h.d.b(v2);
    }

    @Override
    public net.minecraft.ar.v a() {
        return this.e;
    }

    private void a(x x2, double d10, double d11, double d12, float f10, float f11) {
        block10: {
            block8: {
                x x3;
                float f12;
                z z2;
                m[] arrm;
                block11: {
                    block12: {
                        block9: {
                            arrm = net.minecraft.client.r.b.b();
                            if (arrm != null) break block9;
                            if (fU.ag() && cS.db) break block10;
                            v.a();
                            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                            this.h.d.b(c);
                        }
                        z2 = this.c();
                        v.a(false);
                        f12 = this.a;
                        x3 = x2;
                        if (arrm != null) break block11;
                        if (!(x3 instanceof C)) break block12;
                        C c10 = (C)x2;
                        f12 *= c10.L();
                        x3 = c10;
                        if (arrm != null) break block11;
                        if (((B)x3).Q()) {
                            f12 *= 0.5f;
                        }
                    }
                    x3 = x2;
                }
                double d13 = x3.am + (x2.a - x2.am) * (double)f11;
                double d14 = x2.af + (x2.aF - x2.af) * (double)f11;
                double d15 = x2.n + (x2.ax - x2.n) * (double)f11;
                int n2 = net.minecraft.k.h.f(d13 - (double)f12);
                int n3 = net.minecraft.k.h.f(d13 + (double)f12);
                int n4 = net.minecraft.k.h.f(d14 - (double)f12);
                int n5 = net.minecraft.k.h.f(d14);
                int n6 = net.minecraft.k.h.f(d15 - (double)f12);
                int n7 = net.minecraft.k.h.f(d15 + (double)f12);
                double d16 = d10 - d13;
                double d17 = d11 - d14;
                double d18 = d12 - d15;
                W w2 = W.c();
                I i2 = w2.b();
                i2.a(7, net.minecraft.client.y.b.t);
                for (n n8 : n.a(new n(n2, n4, n6), new n(n3, n5, n7))) {
                    i i3 = z2.d(n8.k());
                    if (arrm == null) {
                        if (i3.n() != aW.INVISIBLE && z2.s(n8) > 3) {
                            this.a(i3, d10, d11, d12, n8, f10, f12, d16, d17, d18);
                        }
                        if (arrm == null) continue;
                    }
                    break block8;
                }
                w2.a();
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                v.f();
            }
            v.a(true);
        }
    }

    @Nullable
    protected abstract net.minecraft.ar.v d(T var1);

    private void a(x x2, double d10, double d11, double d12, float f10) {
        block4: {
            v.y();
            net.minecraft.client.j.j j2 = Q.P().an();
            net.minecraft.client.j.c c10 = j2.b("minecraft:blocks/fire_layer_0");
            m[] arrm = net.minecraft.client.r.b.b();
            net.minecraft.client.j.c c11 = j2.b("minecraft:blocks/fire_layer_1");
            v.M();
            v.b((float)d10, (float)d11, (float)d12);
            float f11 = x2.ad * 1.4f;
            v.d(f11, f11, f11);
            W w2 = W.c();
            I i2 = w2.b();
            float f12 = 0.5f;
            float f13 = 0.0f;
            float f14 = x2.aD / f11;
            float f15 = (float)(x2.aF - x2.m().b);
            v.a(-this.h.f, 0.0f, 1.0f, 0.0f);
            v.b(0.0f, 0.0f, -0.3f + (float)((int)f14) * 0.02f);
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            float f16 = 0.0f;
            int n2 = 0;
            i2.a(7, net.minecraft.client.y.b.m);
            while (f14 > 0.0f) {
                if (arrm == null) {
                    net.minecraft.client.j.c c12 = n2 % 2 == 0 ? c10 : c11;
                    this.b(net.minecraft.client.j.j.x);
                    float f17 = c12.i();
                    float f18 = c12.u();
                    float f19 = c12.l();
                    float f20 = c12.m();
                    if (arrm == null) {
                        if (n2 / 2 % 2 == 0) {
                            float f21 = f19;
                            f19 = f17;
                            f17 = f21;
                        }
                        i2.c((double)(f12 - 0.0f), (double)(0.0f - f15), (double)f16).a(f19, f20).d();
                        i2.c((double)(-f12 - 0.0f), (double)(0.0f - f15), (double)f16).a(f17, f20).d();
                        i2.c((double)(-f12 - 0.0f), (double)(1.4f - f15), (double)f16).a(f17, f18).d();
                        i2.c((double)(f12 - 0.0f), (double)(1.4f - f15), (double)f16).a(f19, f18).d();
                        f14 -= 0.45f;
                        f15 -= 0.45f;
                        f12 *= 0.9f;
                        f16 += 0.03f;
                        ++n2;
                    }
                    if (arrm == null) continue;
                }
                break block4;
            }
            w2.a();
            v.B();
            v.j();
        }
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    @Override
    public Class b() {
        return this.b;
    }

    protected int a(T t2) {
        int n2;
        block6: {
            int n3;
            block5: {
                net.minecraft.D.m m2;
                m[] arrm;
                block4: {
                    n3 = 0xFFFFFF;
                    net.minecraft.D.m m3 = (net.minecraft.D.m)((x)t2).aM();
                    arrm = net.minecraft.client.r.b.b();
                    m2 = m3;
                    if (arrm != null) break block4;
                    if (m2 == null) break block5;
                    m2 = m3;
                }
                String string = a5.d(m2.c());
                n2 = string.length();
                if (arrm != null) break block6;
                if (n2 >= 2) {
                    n3 = this.d().e(string.charAt(1));
                }
            }
            n2 = n3;
        }
        return n2;
    }

    public void d(T t2, double d10, double d11, double d12, float f10, float f11) {
        block3: {
            b b10;
            block2: {
                m[] arrm = net.minecraft.client.r.b.b();
                b10 = this;
                if (arrm != null) break block2;
                if (b10.g) break block3;
                b10 = this;
            }
            b10.a(t2, d10, d11, d12);
        }
    }

    public a5 d() {
        return this.h.d();
    }

    public static void a(k k2, double d10, double d11, double d12) {
        block0: {
            v.L();
            W w2 = W.c();
            I i2 = w2.b();
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            i2.a(d10, d11, d12);
            i2.a(7, net.minecraft.client.y.b.a);
            i2.c(k2.e, k2.a, k2.d).d(0.0f, 0.0f, -1.0f).d();
            i2.c(k2.f, k2.a, k2.d).d(0.0f, 0.0f, -1.0f).d();
            i2.c(k2.f, k2.b, k2.d).d(0.0f, 0.0f, -1.0f).d();
            i2.c(k2.e, k2.b, k2.d).d(0.0f, 0.0f, -1.0f).d();
            i2.c(k2.e, k2.b, k2.g).d(0.0f, 0.0f, 1.0f).d();
            i2.c(k2.f, k2.b, k2.g).d(0.0f, 0.0f, 1.0f).d();
            i2.c(k2.f, k2.a, k2.g).d(0.0f, 0.0f, 1.0f).d();
            i2.c(k2.e, k2.a, k2.g).d(0.0f, 0.0f, 1.0f).d();
            m[] arrm = net.minecraft.client.r.b.b();
            i2.c(k2.e, k2.b, k2.d).d(0.0f, -1.0f, 0.0f).d();
            i2.c(k2.f, k2.b, k2.d).d(0.0f, -1.0f, 0.0f).d();
            i2.c(k2.f, k2.b, k2.g).d(0.0f, -1.0f, 0.0f).d();
            i2.c(k2.e, k2.b, k2.g).d(0.0f, -1.0f, 0.0f).d();
            i2.c(k2.e, k2.a, k2.g).d(0.0f, 1.0f, 0.0f).d();
            i2.c(k2.f, k2.a, k2.g).d(0.0f, 1.0f, 0.0f).d();
            i2.c(k2.f, k2.a, k2.d).d(0.0f, 1.0f, 0.0f).d();
            i2.c(k2.e, k2.a, k2.d).d(0.0f, 1.0f, 0.0f).d();
            m[] arrm2 = arrm;
            i2.c(k2.e, k2.b, k2.g).d(-1.0f, 0.0f, 0.0f).d();
            i2.c(k2.e, k2.a, k2.g).d(-1.0f, 0.0f, 0.0f).d();
            i2.c(k2.e, k2.a, k2.d).d(-1.0f, 0.0f, 0.0f).d();
            i2.c(k2.e, k2.b, k2.d).d(-1.0f, 0.0f, 0.0f).d();
            i2.c(k2.f, k2.b, k2.d).d(1.0f, 0.0f, 0.0f).d();
            i2.c(k2.f, k2.a, k2.d).d(1.0f, 0.0f, 0.0f).d();
            i2.c(k2.f, k2.a, k2.g).d(1.0f, 0.0f, 0.0f).d();
            i2.c(k2.f, k2.b, k2.g).d(1.0f, 0.0f, 0.0f).d();
            w2.a();
            i2.a(0.0, 0.0, 0.0);
            v.x();
            if (m.d()) break block0;
            net.minecraft.client.r.b.b(new m[2]);
        }
    }

    public static void b(m[] arrm) {
        f = arrm;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(T t2, net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        boolean bl2;
        m[] arrm;
        k k2;
        block6: {
            block7: {
                k k3;
                block4: {
                    block5: {
                        k2 = ((x)t2).aF().a(0.5);
                        arrm = net.minecraft.client.r.b.b();
                        k3 = k2;
                        if (arrm != null) break block4;
                        if (k3.c()) break block5;
                        double d13 = k2.d() - 0.0;
                        bl2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        if (arrm != null) break block6;
                        if (bl2) break block7;
                    }
                    k3 = new k(((x)t2).a - 2.0, ((x)t2).aF - 2.0, ((x)t2).ax - 2.0, ((x)t2).a + 2.0, ((x)t2).aF + 2.0, ((x)t2).ax + 2.0);
                }
                k2 = k3;
            }
            bl2 = ((x)t2).i(d10, d11, d12);
        }
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = ((x)t2).Z;
        }
        if (arrm != null) return bl2;
        if (bl2) return true;
        bl2 = b10.a(k2);
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected boolean c(T t2) {
        net.minecraft.ar.v v2 = this.d(t2);
        m[] arrm = net.minecraft.client.r.b.b();
        net.minecraft.ar.v v3 = this.e;
        if (arrm == null) {
            if (v3 != null) {
                v2 = this.e;
            }
            v3 = v2;
        }
        if (v3 == null) {
            return false;
        }
        this.b(v2);
        return true;
    }

    protected b(a4 a42) {
        this.d = 1.0f;
        this.b = null;
        this.e = null;
        this.h = a42;
    }

    public void c(T t2, double d10, double d11, double d12, float f10, float f11) {
    }

    protected void a(T t2, double d10, double d11, double d12) {
        block3: {
            T t3;
            b b10;
            block2: {
                m[] arrm = net.minecraft.client.r.b.b();
                b10 = this;
                t3 = t2;
                if (arrm != null) break block2;
                if (!b10.b(t3)) break block3;
                b10 = this;
                t3 = t2;
            }
            b10.a(t3, ((x)t2).d().a(), d10, d11, d12, 64);
        }
    }

    @Override
    public void a(net.minecraft.ar.v v2) {
        this.e = v2;
    }

    public void b(x x2, double d10, double d11, double d12, float f10, float f11) {
        block5: {
            block10: {
                int n2;
                block9: {
                    m[] arrm;
                    block8: {
                        block6: {
                            block7: {
                                c c10;
                                block4: {
                                    arrm = net.minecraft.client.r.b.b();
                                    c10 = this.h.q;
                                    if (arrm != null) break block4;
                                    if (c10 == null) break block5;
                                    c10 = this.h.q;
                                }
                                n2 = c10.bN;
                                if (arrm != null) break block6;
                                if (n2 == 0) break block7;
                                float f12 = this.a - 0.0f;
                                n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                if (arrm != null) break block6;
                                if (n2 <= 0) break block7;
                                n2 = x2.a3() ? 1 : 0;
                                if (arrm != null) break block6;
                                if (n2 != 0) break block7;
                                n2 = this.h.a() ? 1 : 0;
                                if (arrm != null) break block6;
                                if (n2 == 0) break block7;
                                double d13 = this.h.b(x2.a, x2.aF, x2.ax);
                                float f13 = (float)((1.0 - d13 / 256.0) * (double)this.d);
                                float f14 = f13 - 0.0f;
                                n2 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                if (arrm != null) break block6;
                                if (n2 > 0) {
                                    this.a(x2, d10, d11, d12, f13, f11);
                                }
                            }
                            n2 = x2.q();
                        }
                        if (arrm != null) break block8;
                        if (n2 == 0) break block5;
                        n2 = x2 instanceof j;
                    }
                    if (arrm != null) break block9;
                    if (n2 == 0) break block10;
                    n2 = ((j)x2).ae();
                }
                if (n2 != 0) break block5;
            }
            this.a(x2, d10, d11, d12, f11);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean b(T t2) {
        m[] arrm = net.minecraft.client.r.b.b();
        boolean bl2 = ((x)t2).v();
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = ((x)t2).g();
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static m[] b() {
        return f;
    }

    public a4 f() {
        return this.h;
    }

    @Override
    public void a(Class class_) {
        this.b = class_;
    }
}

