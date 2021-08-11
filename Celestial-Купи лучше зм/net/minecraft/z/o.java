/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import java.util.List;
import net.minecraft.J.E;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bq;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.aj.b;
import net.minecraft.ar.aH;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.z.c;
import net.minecraft.z.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o
extends x {
    private /* synthetic */ int aP;
    private /* synthetic */ int aN;
    private /* synthetic */ int aM;
    private /* synthetic */ int aT;
    private /* synthetic */ int aK;
    private /* synthetic */ c aL;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aQ;
    private /* synthetic */ boolean aU;
    private /* synthetic */ net.minecraft.i.j aO;
    public /* synthetic */ x aW;
    private /* synthetic */ int aS;
    private /* synthetic */ int aR;
    private /* synthetic */ float aV;

    private void f() {
        block10: {
            m[] arrm;
            block9: {
                block8: {
                    float f10 = h.e(this.aq * this.aq + this.d * this.d);
                    arrm = net.minecraft.z.d.b();
                    this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                    this.at = (float)(h.a(this.G, (double)f10) * 57.29577951308232);
                    while (this.at - this.E < -180.0f) {
                        this.E -= 360.0f;
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block8;
                    }
                    while (this.at - this.E >= 180.0f) {
                        this.E += 360.0f;
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block9;
                    }
                }
                while (this.e - this.ak < -180.0f) {
                    this.ak -= 360.0f;
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block10;
                }
            }
            while (this.e - this.ak >= 180.0f) {
                this.ak += 360.0f;
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block10;
            }
            this.at = this.E + (this.at - this.E) * 0.2f;
            this.e = this.ak + (this.e - this.ak) * 0.2f;
        }
    }

    @Override
    public void f(r r2) {
    }

    private void c() {
        float f10 = this.aO.E + (this.aO.at - this.aO.E);
        float f11 = this.aO.ak + (this.aO.e - this.aO.ak);
        float f12 = h.c(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f13 = h.g(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f14 = -h.c(-f10 * ((float)Math.PI / 180));
        float f15 = h.g(-f10 * ((float)Math.PI / 180));
        double d10 = this.aO.N + (this.aO.a - this.aO.N) - (double)f13 * 0.3;
        double d11 = this.aO.L + (this.aO.aF - this.aO.L) + (double)this.aO.l();
        double d12 = this.aO.k + (this.aO.ax - this.aO.k) - (double)f12 * 0.3;
        this.c(d10, d11, d12, f11, f10);
        this.aq = -f13;
        this.G = h.c(-(f15 / f14), -5.0f, 5.0f);
        this.d = -f12;
        float f16 = h.e(this.aq * this.aq + this.G * this.G + this.d * this.d);
        this.aq *= 0.6 / (double)f16 + 0.5 + this.g.nextGaussian() * 0.0045;
        this.G *= 0.6 / (double)f16 + 0.5 + this.g.nextGaussian() * 0.0045;
        this.d *= 0.6 / (double)f16 + 0.5 + this.g.nextGaussian() * 0.0045;
        float f17 = h.e(this.aq * this.aq + this.d * this.d);
        this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
        this.at = (float)(h.a(this.G, (double)f17) * 57.29577951308232);
        this.ak = this.e;
        this.E = this.at;
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        m[] arrm = net.minecraft.z.d.b();
        if (arrm == null) {
            if (aQ.equals(r2)) {
                int n2 = this.E().b(aQ);
                this.aW = n2 > 0 ? this.aG.a(n2 - 1) : null;
            }
            super.a(r2);
        }
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    protected void ab() {
        this.E().c(aQ, 0);
    }

    public o(z z2, net.minecraft.i.j j2, double d10, double d11, double d12) {
        super(z2);
        this.aL = c.FLYING;
        this.a(j2);
        this.g(d10, d11, d12);
        this.N = this.a;
        this.L = this.aF;
        this.k = this.ax;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean e() {
        block4: {
            int n2;
            m[] arrm;
            block5: {
                double d10;
                block6: {
                    net.minecraft.w.d d11 = this.aO.av();
                    arrm = net.minecraft.z.d.b();
                    net.minecraft.w.d d12 = this.aO.b();
                    int n3 = d11.w() == net.minecraft.u.h.bQ ? 1 : 0;
                    int n4 = d12.w() == net.minecraft.u.h.bQ ? 1 : 0;
                    n2 = this.aO.P;
                    if (arrm != null) return n2 != 0;
                    if (n2 != 0) break block4;
                    n2 = this.aO.aL();
                    if (arrm != null) return n2 != 0;
                    if (n2 == 0) break block4;
                    n2 = n3;
                    if (arrm != null) break block5;
                    if (n2 != 0) break block6;
                    n2 = n4;
                    if (arrm != null) return n2 != 0;
                    if (n2 == 0) break block4;
                }
                n2 = (d10 = this.s(this.aO) - 1024.0) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
            }
            if (arrm != null) return n2 != 0;
            if (n2 <= 0) {
                return false;
            }
        }
        this.a();
        return 1 != 0;
    }

    @Override
    public boolean b(double d10) {
        double d11 = 64.0;
        m[] arrm = net.minecraft.z.d.b();
        double d12 = d10 - 4096.0;
        double d13 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (arrm == null) {
            d13 = d13 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d13;
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
    }

    protected void i() {
        block3: {
            net.minecraft.i.j j2;
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                j2 = this.aO;
                if (arrm != null) break block2;
                if (j2 == null) break block3;
                j2 = this.aO;
            }
            double d10 = j2.a - this.a;
            double d11 = this.aO.aF - this.aF;
            double d12 = this.aO.ax - this.ax;
            double d13 = 0.1;
            this.aW.aq += d10 * 0.1;
            this.aW.G += d11 * 0.1;
            this.aW.d += d12 * 0.1;
        }
    }

    private void b() {
        this.E().b(aQ, this.aW.W() + 1);
    }

    public void a(int n2) {
        this.aT = n2;
    }

    @Override
    public void ae() {
        block24: {
            double d10;
            net.minecraft.Z.i i2;
            block39: {
                double d11;
                n n2;
                block47: {
                    o o2;
                    float f10;
                    m[] arrm;
                    block46: {
                        c c10;
                        c c11;
                        block40: {
                            block41: {
                                block43: {
                                    x x2;
                                    block44: {
                                        block45: {
                                            block42: {
                                                block32: {
                                                    block33: {
                                                        block37: {
                                                            o o3;
                                                            block38: {
                                                                float f11;
                                                                block36: {
                                                                    block35: {
                                                                        block34: {
                                                                            block31: {
                                                                                net.minecraft.Z.i i3;
                                                                                block30: {
                                                                                    block28: {
                                                                                        o o4;
                                                                                        block29: {
                                                                                            int n3;
                                                                                            block27: {
                                                                                                block25: {
                                                                                                    block26: {
                                                                                                        o o5;
                                                                                                        block22: {
                                                                                                            block23: {
                                                                                                                m[] arrm2 = net.minecraft.z.d.b();
                                                                                                                super.ae();
                                                                                                                arrm = arrm2;
                                                                                                                o5 = this;
                                                                                                                if (arrm != null) break block22;
                                                                                                                if (o5.aO != null) break block23;
                                                                                                                this.a();
                                                                                                                if (arrm == null) break block24;
                                                                                                            }
                                                                                                            o5 = this;
                                                                                                        }
                                                                                                        n3 = o5.aG.C;
                                                                                                        if (arrm != null) break block25;
                                                                                                        if (n3 != 0) break block26;
                                                                                                        n3 = this.e();
                                                                                                        if (arrm != null) break block25;
                                                                                                        if (n3 != 0) break block24;
                                                                                                    }
                                                                                                    n3 = this.aU;
                                                                                                }
                                                                                                if (arrm != null) break block27;
                                                                                                if (n3 == 0) break block28;
                                                                                                ++this.aM;
                                                                                                o4 = this;
                                                                                                if (arrm != null) break block29;
                                                                                                n3 = o4.aM;
                                                                                            }
                                                                                            if (n3 < 1200) break block28;
                                                                                            o4 = this;
                                                                                        }
                                                                                        o4.a();
                                                                                        return;
                                                                                    }
                                                                                    f10 = 0.0f;
                                                                                    n2 = new n(this);
                                                                                    i3 = i2 = this.aG.d(n2);
                                                                                    if (arrm != null) break block30;
                                                                                    if (i3.o() != net.minecraft.ac.c.L) break block31;
                                                                                    i3 = i2;
                                                                                }
                                                                                f10 = bq.a(i3, this.aG, n2);
                                                                            }
                                                                            c c10 = this.aL;
                                                                            c10 = c.FLYING;
                                                                            if (arrm != null) break block32;
                                                                            if (c11 != c10) break block33;
                                                                            o o6 = this;
                                                                            if (arrm != null) break block34;
                                                                            if (o6.aW == null) break block35;
                                                                            this.aq = 0.0;
                                                                            this.G = 0.0;
                                                                            this.d = 0.0;
                                                                            o6 = this;
                                                                        }
                                                                        o6.aL = c.HOOKED_IN_ENTITY;
                                                                        return;
                                                                    }
                                                                    float f11 = f10 - 0.0f;
                                                                    f11 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                                    if (arrm == null) {
                                                                        if (f11 > 0) {
                                                                            this.aq *= 0.3;
                                                                            this.G *= 0.2;
                                                                            this.d *= 0.3;
                                                                            this.aL = c.BOBBING;
                                                                            return;
                                                                        }
                                                                        f11 = (float)this.aG.C;
                                                                    }
                                                                    if (arrm != null) break block36;
                                                                    if (f11 == false) {
                                                                        this.d();
                                                                    }
                                                                    o3 = this;
                                                                    if (arrm != null) break block37;
                                                                    f11 = (float)o3.aU;
                                                                }
                                                                if (f11 != false) break block38;
                                                                o3 = this;
                                                                if (arrm != null) break block37;
                                                                if (o3.A) break block38;
                                                                o3 = this;
                                                                if (arrm != null) break block37;
                                                                if (o3.aE) break block38;
                                                                ++this.aN;
                                                                if (arrm == null) break block39;
                                                            }
                                                            this.aN = 0;
                                                            this.aq = 0.0;
                                                            this.G = 0.0;
                                                            o3 = this;
                                                        }
                                                        o3.d = 0.0;
                                                        if (arrm == null) break block39;
                                                    }
                                                    c c10 = this.aL;
                                                    c10 = c.HOOKED_IN_ENTITY;
                                                }
                                                if (arrm != null) break block40;
                                                if (c11 != c10) break block41;
                                                x2 = this.aW;
                                                if (arrm != null) break block42;
                                                if (x2 == null) break block43;
                                                x2 = this.aW;
                                            }
                                            if (arrm != null) break block44;
                                            if (!x2.P) break block45;
                                            this.aW = null;
                                            this.aL = c.FLYING;
                                            if (arrm == null) break block43;
                                        }
                                        this.a = this.aW.a;
                                        x2 = this.aW;
                                    }
                                    double d12 = x2.aD;
                                    this.aF = this.aW.m().b + d12 * 0.8;
                                    this.ax = this.aW.ax;
                                    this.g(this.a, this.aF, this.ax);
                                }
                                return;
                            }
                            o2 = this;
                            if (arrm != null) break block46;
                            c c10 = o2.aL;
                            c10 = c.BOBBING;
                        }
                        if (c11 != c10) break block39;
                        this.aq *= 0.9;
                        this.d *= 0.9;
                        o2 = this;
                    }
                    d10 = o2.aF + this.G - (double)n2.b() - (double)f10;
                    double d11 = Math.abs(d10) - 0.01;
                    d11 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                    if (arrm == null) {
                        if (d11 < 0) {
                            d10 += Math.signum(d10) * 0.1;
                        }
                        this.G -= d10 * (double)this.g.nextFloat() * 0.2;
                        d11 = (double)this.aG.C;
                    }
                    if (arrm != null) break block47;
                    if (d11 != false) break block39;
                    float f13 = f10 - 0.0f;
                    d11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (d11 > 0) {
                    this.b(n2);
                }
            }
            if (i2.o() != net.minecraft.ac.c.L) {
                this.G -= 0.03;
            }
            this.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
            this.f();
            d10 = 0.92;
            this.aq *= 0.92;
            this.G *= 0.92;
            this.d *= 0.92;
            this.g(this.a, this.aF, this.ax);
        }
    }

    public int h() {
        int n2;
        block8: {
            block9: {
                int n3;
                int n4;
                m[] arrm;
                block12: {
                    block7: {
                        o o2;
                        block10: {
                            block11: {
                                arrm = net.minecraft.z.d.b();
                                n2 = this.aG.C;
                                if (arrm != null) break block8;
                                if (n2 != 0 || this.aO == null) break block9;
                                n4 = 0;
                                o2 = this;
                                if (arrm != null) break block10;
                                if (o2.aW == null) break block11;
                                this.i();
                                this.aG.a((x)this, (byte)31);
                                int n5 = this.aW instanceof t;
                                if (arrm == null) {
                                    n5 = n4 = n5 != 0 ? 3 : 5;
                                }
                                if (arrm == null) break block7;
                            }
                            o2 = this;
                        }
                        n3 = o2.aK;
                        if (arrm != null) break block12;
                        if (n3 <= 0) break block7;
                        b b10 = new b((A)this.aG);
                        b10.a((float)this.aP + this.aO.y());
                        for (net.minecraft.w.d d10 : this.aG.D().a(net.minecraft.aj.j.h).a(this.g, b10.a())) {
                            block15: {
                                block14: {
                                    net.minecraft.w.k k2;
                                    net.minecraft.w.k k3;
                                    block13: {
                                        t t2 = new t(this.aG, this.a, this.aF, this.ax, d10);
                                        double d11 = this.aO.a - this.a;
                                        double d12 = this.aO.aF - this.aF;
                                        double d13 = this.aO.ax - this.ax;
                                        double d14 = h.e(d11 * d11 + d12 * d12 + d13 * d13);
                                        double d15 = 0.1;
                                        t2.aq = d11 * 0.1;
                                        t2.G = d12 * 0.1 + (double)h.e(d14) * 0.08;
                                        t2.d = d13 * 0.1;
                                        this.aG.f(t2);
                                        this.aO.aG.f(new E(this.aO.aG, this.aO.a, this.aO.aF + 0.5, this.aO.ax + 0.5, this.g.nextInt(6) + 1));
                                        net.minecraft.w.k k4 = d10.w();
                                        if (arrm != null) break block7;
                                        net.minecraft.w.k k2 = k4;
                                        k2 = net.minecraft.u.h.aw;
                                        if (arrm != null) break block13;
                                        if (k3 == k2) break block14;
                                        net.minecraft.w.k k2 = k4;
                                        k2 = net.minecraft.u.h.cd;
                                    }
                                    if (k3 != k2) break block15;
                                }
                                this.aO.a(net.minecraft.l.m.n, 1);
                            }
                            if (arrm == null) continue;
                        }
                        n4 = 1;
                    }
                    n3 = this.aU ? 1 : 0;
                }
                if (arrm == null) {
                    if (n3 != 0) {
                        n4 = 2;
                    }
                    this.a();
                    n3 = n4;
                }
                return n3;
            }
            n2 = 0;
        }
        return n2;
    }

    private void b(n n2) {
        block34: {
            block42: {
                o o2;
                block43: {
                    m[] arrm;
                    block55: {
                        block54: {
                            o o3;
                            int n3;
                            block50: {
                                block51: {
                                    double d10;
                                    double d11;
                                    double d12;
                                    A a10;
                                    block53: {
                                        K k2;
                                        block52: {
                                            K k3;
                                            float f10;
                                            float f11;
                                            block49: {
                                                float f12;
                                                float f13;
                                                block46: {
                                                    int n4;
                                                    block47: {
                                                        block48: {
                                                            block44: {
                                                                block45: {
                                                                    float f14;
                                                                    int n5;
                                                                    block35: {
                                                                        block36: {
                                                                            o o4;
                                                                            block37: {
                                                                                block38: {
                                                                                    block41: {
                                                                                        block40: {
                                                                                            K k4;
                                                                                            block39: {
                                                                                                block30: {
                                                                                                    block31: {
                                                                                                        block32: {
                                                                                                            o o5;
                                                                                                            block33: {
                                                                                                                block28: {
                                                                                                                    block29: {
                                                                                                                        n n6;
                                                                                                                        block26: {
                                                                                                                            float f15;
                                                                                                                            block27: {
                                                                                                                                a10 = (A)this.aG;
                                                                                                                                arrm = net.minecraft.z.d.b();
                                                                                                                                n5 = 1;
                                                                                                                                n6 = n2.a();
                                                                                                                                float f16 = this.g.nextFloat() - 0.25f;
                                                                                                                                f14 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                                                                                                if (arrm != null) break block26;
                                                                                                                                if (f14 >= 0) break block27;
                                                                                                                                f14 = (float)this.aG.t(n6);
                                                                                                                                if (arrm != null) break block26;
                                                                                                                                if (f14 != false) {
                                                                                                                                    ++n5;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            f14 = (f15 = this.g.nextFloat() - 0.5f) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                                                                                                        }
                                                                                                                        if (arrm != null) break block28;
                                                                                                                        if (f14 >= 0) break block29;
                                                                                                                        f14 = (float)this.aG.w(n6);
                                                                                                                        if (arrm != null) break block28;
                                                                                                                        if (f14 == false) {
                                                                                                                            --n5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    f14 = this.aK;
                                                                                                                }
                                                                                                                if (arrm != null) break block30;
                                                                                                                if (f14 <= 0) break block31;
                                                                                                                --this.aK;
                                                                                                                o5 = this;
                                                                                                                if (arrm != null) break block32;
                                                                                                                if (o5.aK > 0) break block33;
                                                                                                                this.aR = 0;
                                                                                                                this.aS = 0;
                                                                                                                if (arrm == null) break block34;
                                                                                                            }
                                                                                                            o5 = this;
                                                                                                        }
                                                                                                        o5.G -= 0.2 * (double)this.g.nextFloat() * (double)this.g.nextFloat();
                                                                                                        if (arrm == null) break block34;
                                                                                                    }
                                                                                                    f14 = this.aS;
                                                                                                }
                                                                                                if (arrm != null) break block35;
                                                                                                if (f14 <= 0) break block36;
                                                                                                this.aS -= n5;
                                                                                                o4 = this;
                                                                                                if (arrm != null) break block37;
                                                                                                if (o4.aS <= 0) break block38;
                                                                                                this.aV = (float)((double)this.aV + this.g.nextGaussian() * 4.0);
                                                                                                float f17 = this.aV * ((float)Math.PI / 180);
                                                                                                f11 = h.g(f17);
                                                                                                f10 = h.c(f17);
                                                                                                d12 = this.a + (double)(f11 * (float)this.aS * 0.1f);
                                                                                                d11 = (float)h.f(this.m().b) + 1.0f;
                                                                                                d10 = this.ax + (double)(f10 * (float)this.aS * 0.1f);
                                                                                                k4 = k3 = a10.d(new n(d12, d11 - 1.0, d10)).b();
                                                                                                if (arrm != null) break block39;
                                                                                                if (k4 == net.minecraft.u.g.bQ) break block40;
                                                                                                k4 = k3;
                                                                                            }
                                                                                            if (k4 != net.minecraft.u.g.cL) break block41;
                                                                                        }
                                                                                        float f18 = this.g.nextFloat();
                                                                                        float f19 = 0.15f;
                                                                                        if (arrm == null) {
                                                                                            if (f18 < f19) {
                                                                                                a10.a(net.minecraft.ar.aH.WATER_BUBBLE, d12, d11 - (double)0.1f, d10, 1, (double)f11, 0.1, (double)f10, 0.0, new int[0]);
                                                                                            }
                                                                                            f18 = f11;
                                                                                            f19 = 0.04f;
                                                                                        }
                                                                                        float f20 = f18 * f19;
                                                                                        float f21 = f10 * 0.04f;
                                                                                        a10.a(net.minecraft.ar.aH.WATER_WAKE, d12, d11, d10, 0, (double)f21, 0.01, (double)(-f20), 1.0, new int[0]);
                                                                                        a10.a(net.minecraft.ar.aH.WATER_WAKE, d12, d11, d10, 0, (double)(-f21), 0.01, (double)f20, 1.0, new int[0]);
                                                                                    }
                                                                                    if (arrm == null) break block34;
                                                                                }
                                                                                this.G = -0.4f * h.a(this.g, 0.6f, 1.0f);
                                                                                this.a(net.minecraft.u.E.hL, 0.25f, 1.0f + (this.g.nextFloat() - this.g.nextFloat()) * 0.4f);
                                                                                o4 = this;
                                                                            }
                                                                            double d13 = o4.m().b + 0.5;
                                                                            a10.a(net.minecraft.ar.aH.WATER_BUBBLE, this.a, d13, this.ax, (int)(1.0f + this.ad * 20.0f), (double)this.ad, 0.0, (double)this.ad, (double)0.2f, new int[0]);
                                                                            a10.a(net.minecraft.ar.aH.WATER_WAKE, this.a, d13, this.ax, (int)(1.0f + this.ad * 20.0f), (double)this.ad, 0.0, (double)this.ad, (double)0.2f, new int[0]);
                                                                            this.aK = h.a(this.g, 20, 40);
                                                                            if (arrm == null) break block34;
                                                                        }
                                                                        o2 = this;
                                                                        if (arrm != null) break block42;
                                                                        f14 = o2.aR;
                                                                    }
                                                                    if (f14 <= 0) break block43;
                                                                    this.aR -= n5;
                                                                    f13 = 0.15f;
                                                                    n3 = this.aR;
                                                                    n4 = 20;
                                                                    if (arrm != null) break block44;
                                                                    if (n3 >= n4) break block45;
                                                                    f13 = (float)((double)f13 + (double)(20 - this.aR) * 0.05);
                                                                    if (arrm == null) break block46;
                                                                }
                                                                n3 = this.aR;
                                                                n4 = 40;
                                                            }
                                                            if (arrm != null) break block47;
                                                            if (n3 >= n4) break block48;
                                                            f13 = (float)((double)f13 + (double)(40 - this.aR) * 0.02);
                                                            if (arrm == null) break block46;
                                                        }
                                                        n3 = this.aR;
                                                        if (arrm != null) break block49;
                                                        n4 = 60;
                                                    }
                                                    if (n3 < n4) {
                                                        f13 = (float)((double)f13 + (double)(60 - this.aR) * 0.01);
                                                    }
                                                }
                                                n3 = (f12 = this.g.nextFloat() - f13) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                            }
                                            if (arrm != null) break block50;
                                            if (n3 >= 0) break block51;
                                            f11 = h.a(this.g, 0.0f, 360.0f) * ((float)Math.PI / 180);
                                            f10 = h.a(this.g, 25.0f, 60.0f);
                                            d12 = this.a + (double)(h.g(f11) * f10 * 0.1f);
                                            d11 = (float)h.f(this.m().b) + 1.0f;
                                            d10 = this.ax + (double)(h.c(f11) * f10 * 0.1f);
                                            k2 = k3 = a10.d(new n((int)d12, (int)d11 - 1, (int)d10)).b();
                                            if (arrm != null) break block52;
                                            if (k2 == net.minecraft.u.g.bQ) break block53;
                                            k2 = k3;
                                        }
                                        if (k2 != net.minecraft.u.g.cL) break block51;
                                    }
                                    a10.a(net.minecraft.ar.aH.WATER_SPLASH, d12, d11, d10, 2 + this.g.nextInt(2), (double)0.1f, 0.0, (double)0.1f, 0.0, new int[0]);
                                }
                                o3 = this;
                                if (arrm != null) break block54;
                                n3 = o3.aR;
                            }
                            if (n3 > 0) break block55;
                            this.aV = h.a(this.g, 0.0f, 360.0f);
                            o3 = this;
                        }
                        o3.aS = h.a(this.g, 20, 80);
                    }
                    if (arrm == null) break block34;
                }
                this.aR = h.a(this.g, 100, 600);
                o2 = this;
            }
            o2.aR -= this.aT * 20 * 5;
        }
    }

    private void d() {
        block17: {
            block19: {
                x x2;
                m[] arrm;
                block8: {
                    j j2;
                    j j3;
                    i i2;
                    block18: {
                        i i3;
                        block16: {
                            l l2;
                            l l3;
                            block10: {
                                l l4;
                                block9: {
                                    l3 = new l(this.a, this.aF, this.ax);
                                    l2 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                    i2 = this.aG.a(l3, l2, false, true, false);
                                    arrm = net.minecraft.z.d.b();
                                    l3 = new l(this.a, this.aF, this.ax);
                                    l4 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                    if (arrm != null) break block9;
                                    l2 = l4;
                                    if (i2 == null) break block10;
                                    l4 = new l(i2.c.e, i2.c.d, i2.c.b);
                                }
                                l2 = l4;
                            }
                            x x3 = null;
                            List<x> list = this.aG.b((x)this, this.m().d(this.aq, this.G, this.d).a(1.0));
                            double d10 = 0.0;
                            for (x x4 : list) {
                                block12: {
                                    double d11;
                                    double d12;
                                    block15: {
                                        k k2;
                                        i i4;
                                        x x5;
                                        block13: {
                                            block14: {
                                                block11: {
                                                    x5 = this;
                                                    if (arrm != null) break block11;
                                                    x2 = x4;
                                                    if (arrm != null) break block8;
                                                    if (!x5.c(x2)) break block12;
                                                    x5 = x4;
                                                }
                                                if (arrm != null) break block13;
                                                if (x5 != this.aO) break block14;
                                                x5 = this;
                                                if (arrm != null) break block13;
                                                if (x5.aN < 5) break block12;
                                            }
                                            x5 = x4;
                                        }
                                        if ((i4 = (k2 = x5.m().a(0.3f)).b(l3, l2)) == null) break block12;
                                        d11 = d12 = l3.f(i4.c);
                                        if (arrm != null) break block12;
                                        if (d11 < d10) break block15;
                                        d11 = d10;
                                        if (arrm != null || d11 != 0.0) break block12;
                                    }
                                    x3 = x4;
                                    d11 = d10 = d12;
                                }
                                if (arrm == null) continue;
                            }
                            if (x3 != null) {
                                i2 = new i(x3);
                            }
                            i3 = i2;
                            if (arrm != null) break block16;
                            if (i3 == null) break block17;
                            i3 = i2;
                        }
                        j3 = i3.d;
                        j2 = net.minecraft.k.j.MISS;
                        if (arrm != null) break block18;
                        if (j3 == j2) break block17;
                        j3 = i2.d;
                        j2 = net.minecraft.k.j.ENTITY;
                    }
                    if (j3 != j2) break block19;
                    o o2 = this;
                    x2 = i2.e;
                }
                o2.aW = x2;
                this.b();
                if (arrm == null) break block17;
            }
            this.aU = true;
        }
    }

    @Override
    public void a() {
        block3: {
            block2: {
                m[] arrm = net.minecraft.z.d.b();
                super.a();
                m[] arrm2 = arrm;
                net.minecraft.i.j j2 = this.aO;
                if (arrm2 != null) break block2;
                if (j2 == null) break block3;
                j2 = this.aO;
            }
            j2.ch = null;
        }
    }

    public o(z z2, net.minecraft.i.j j2) {
        super(z2);
        this.aL = c.FLYING;
        this.a(j2);
        this.c();
    }

    @Override
    public void a(byte by2) {
        block4: {
            o o2;
            block6: {
                block5: {
                    m[] arrm = net.minecraft.z.d.b();
                    if (arrm != null) break block4;
                    if (by2 != 31) break block5;
                    o2 = this;
                    if (arrm != null) break block6;
                    if (!o2.aG.C) break block5;
                    o2 = this;
                    if (arrm != null) break block6;
                    if (!(o2.aW instanceof net.minecraft.i.j)) break block5;
                    o2 = this;
                    if (arrm != null) break block6;
                    if (((net.minecraft.i.j)o2.aW).c()) {
                        this.i();
                    }
                }
                o2 = this;
            }
            super.a(by2);
        }
    }

    @Override
    public void a(r r2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean c(x x2) {
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = x2.M();
        if (arrm != null) return bl2;
        if (bl2) return true;
        bl2 = x2 instanceof t;
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public net.minecraft.i.j g() {
        return this.aO;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(int n2) {
        this.aP = n2;
    }

    static {
        aQ = net.minecraft.q.m.a(o.class, net.minecraft.q.h.n);
    }

    private void a(net.minecraft.i.j j2) {
        this.c(0.25f, 0.25f);
        this.Z = true;
        this.aO = j2;
        this.aO.ch = this;
    }
}

