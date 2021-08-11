/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.w.d;

public class q
extends x {
    private /* synthetic */ boolean aM;
    private /* synthetic */ double aL;
    private /* synthetic */ double aO;
    private /* synthetic */ int aK;
    private /* synthetic */ double aN;

    public q(z z2) {
        super(z2);
        this.c(0.25f, 0.25f);
    }

    @Override
    public void ae() {
        block40: {
            int n2;
            block35: {
                q q2;
                block38: {
                    block39: {
                        int n3;
                        block37: {
                            block36: {
                                block34: {
                                    block26: {
                                        q q3;
                                        block32: {
                                            block33: {
                                                block28: {
                                                    block30: {
                                                        q q4;
                                                        block31: {
                                                            float f10;
                                                            block29: {
                                                                q q5;
                                                                float f11;
                                                                block27: {
                                                                    block25: {
                                                                        block24: {
                                                                            block23: {
                                                                                this.am = this.a;
                                                                                n2 = net.minecraft.J.j.c();
                                                                                this.af = this.aF;
                                                                                this.n = this.ax;
                                                                                super.ae();
                                                                                this.a += this.aq;
                                                                                this.aF += this.G;
                                                                                this.ax += this.d;
                                                                                f11 = h.e(this.aq * this.aq + this.d * this.d);
                                                                                this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                                                                                this.at = (float)(h.a(this.G, (double)f11) * 57.29577951308232);
                                                                                while (this.at - this.E < -180.0f) {
                                                                                    this.E -= 360.0f;
                                                                                    if (n2 == 0) {
                                                                                        if (n2 == 0) continue;
                                                                                    }
                                                                                    break block23;
                                                                                }
                                                                                while (this.at - this.E >= 180.0f) {
                                                                                    this.E += 360.0f;
                                                                                    if (n2 == 0) {
                                                                                        if (n2 == 0) continue;
                                                                                    }
                                                                                    break block24;
                                                                                }
                                                                            }
                                                                            while (this.e - this.ak < -180.0f) {
                                                                                this.ak -= 360.0f;
                                                                                if (n2 == 0) {
                                                                                    if (n2 == 0) continue;
                                                                                }
                                                                                break block25;
                                                                            }
                                                                        }
                                                                        while (this.e - this.ak >= 180.0f) {
                                                                            this.ak += 360.0f;
                                                                            if (n2 == 0) {
                                                                                if (n2 == 0) continue;
                                                                            }
                                                                            break block25;
                                                                        }
                                                                        this.at = this.E + (this.at - this.E) * 0.2f;
                                                                        this.e = this.ak + (this.e - this.ak) * 0.2f;
                                                                    }
                                                                    q5 = this;
                                                                    if (n2 != 0) break block27;
                                                                    if (q5.aG.C) break block28;
                                                                    q5 = this;
                                                                }
                                                                double d10 = q5.aN - this.a;
                                                                double d11 = this.aL - this.ax;
                                                                float f12 = (float)Math.sqrt(d10 * d10 + d11 * d11);
                                                                float f13 = (float)h.a(d11, d10);
                                                                double d12 = (double)f11 + (double)(f12 - f11) * 0.0025;
                                                                float f14 = f12 - 1.0f;
                                                                f10 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                                                if (n2 != 0) break block29;
                                                                if (f10 < 0) {
                                                                    d12 *= 0.8;
                                                                    this.G *= 0.8;
                                                                }
                                                                this.aq = Math.cos(f13) * d12;
                                                                this.d = Math.sin(f13) * d12;
                                                                q4 = this;
                                                                if (n2 != 0) break block30;
                                                                double d13 = q4.aF - this.aO;
                                                                f10 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                                                            }
                                                            if (f10 >= 0) break block31;
                                                            this.G += (1.0 - this.G) * (double)0.015f;
                                                            if (n2 == 0) break block28;
                                                        }
                                                        q4 = this;
                                                    }
                                                    q4.G += (-1.0 - this.G) * (double)0.015f;
                                                }
                                                float f15 = 0.25f;
                                                q3 = this;
                                                if (n2 != 0) break block32;
                                                if (!q3.aj()) break block33;
                                                for (int i2 = 0; i2 < 4; ++i2) {
                                                    this.aG.a(net.minecraft.ar.aH.WATER_BUBBLE, this.a - this.aq * 0.25, this.aF - this.G * 0.25, this.ax - this.d * 0.25, this.aq, this.G, this.d, new int[0]);
                                                    if (n2 == 0) {
                                                        if (n2 == 0) continue;
                                                    }
                                                    break block26;
                                                }
                                                if (n2 == 0) break block26;
                                            }
                                            q3 = this;
                                        }
                                        q3.aG.a(net.minecraft.ar.aH.PORTAL, this.a - this.aq * 0.25 + this.g.nextDouble() * 0.6 - 0.3, this.aF - this.G * 0.25 - 0.5, this.ax - this.d * 0.25 + this.g.nextDouble() * 0.6 - 0.3, this.aq, this.G, this.d, new int[0]);
                                    }
                                    n3 = this.aG.C;
                                    if (n2 != 0) break block34;
                                    if (n3 != 0) break block35;
                                    this.g(this.a, this.aF, this.ax);
                                    n3 = ++this.aK;
                                }
                                if (n2 != 0) break block36;
                                if (n3 <= 80) break block35;
                                n3 = this.aG.C ? 1 : 0;
                            }
                            if (n2 != 0) break block37;
                            if (n3 != 0) break block35;
                            this.a(net.minecraft.u.E.f4, 1.0f, 1.0f);
                            this.a();
                            q2 = this;
                            if (n2 != 0) break block38;
                            n3 = q2.aM ? 1 : 0;
                        }
                        if (n3 == 0) break block39;
                        this.aG.f(new t(this.aG, this.a, this.aF, this.ax, new d(net.minecraft.u.h.cE)));
                        if (n2 == 0) break block35;
                    }
                    q2 = this;
                }
                q2.aG.b(2003, new n(this), 0);
            }
            if (net.minecraft.k.m.d()) break block40;
            net.minecraft.J.j.b(++n2);
        }
    }

    @Override
    public void a(r r2) {
    }

    @Override
    public boolean b(double d10) {
        double d11 = this.m().d() * 4.0;
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = Double.isNaN(d11);
        if (n2 != 0) {
            double d12;
            if (bl2) {
                d11 = 4.0;
            }
            bl2 = (d12 = d10 - (d11 *= 64.0) * d11) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (n2 != 0) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public q(z z2, double d10, double d11, double d12) {
        super(z2);
        this.aK = 0;
        this.c(0.25f, 0.25f);
        this.g(d10, d11, d12);
    }

    @Override
    public void f(r r2) {
    }

    @Override
    protected void ab() {
    }

    public void b(n n2) {
        int n3;
        block6: {
            double d10;
            block4: {
                int n4;
                double d11;
                block5: {
                    d11 = n2.e();
                    n4 = n2.b();
                    d10 = n2.a();
                    double d12 = d11 - this.a;
                    n3 = net.minecraft.J.j.d();
                    double d13 = d10 - this.ax;
                    float f10 = h.e(d12 * d12 + d13 * d13);
                    if (n3 == 0) break block4;
                    if (!(f10 > 12.0f)) break block5;
                    this.aN = this.a + d12 / (double)f10 * 12.0;
                    this.aL = this.ax + d13 / (double)f10 * 12.0;
                    this.aO = this.aF + 8.0;
                    if (n3 != 0) break block6;
                }
                this.aN = d11;
                this.aO = n4;
            }
            this.aL = d10;
        }
        this.aK = 0;
        int n5 = this.g.nextInt(5);
        if (n3 != 0) {
            n5 = n5 > 0 ? 1 : 0;
        }
        this.aM = n5;
    }

    @Override
    public float S() {
        return 1.0f;
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    @Override
    public boolean aN() {
        return false;
    }

    @Override
    public void b(double d10, double d11, double d12) {
        block3: {
            float f10;
            block4: {
                float f11;
                block2: {
                    this.aq = d10;
                    this.G = d11;
                    int n2 = net.minecraft.J.j.d();
                    this.d = d12;
                    float f12 = this.E - 0.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (n2 == 0) break block2;
                    if (f11 != false) break block3;
                    f10 = this.ak;
                    if (n2 == 0) break block4;
                    float f13 = f10 - 0.0f;
                    f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (f11 != false) break block3;
                f10 = h.e(d10 * d10 + d12 * d12);
            }
            float f14 = f10;
            this.e = (float)(h.a(d10, d12) * 57.29577951308232);
            this.at = (float)(h.a(d11, (double)f14) * 57.29577951308232);
            this.ak = this.e;
            this.E = this.at;
        }
    }
}

