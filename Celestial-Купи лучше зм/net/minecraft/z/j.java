/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.z.b;
import net.minecraft.z.d;

public abstract class j
extends x {
    private /* synthetic */ int aP;
    public /* synthetic */ B aN;
    public /* synthetic */ double aK;
    private /* synthetic */ int aO;
    public /* synthetic */ double aL;
    public /* synthetic */ double aM;

    @Override
    public boolean b(double d10) {
        double d11 = this.m().d() * 4.0;
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = Double.isNaN(d11);
        if (arrm == null) {
            double d12;
            if (bl2) {
                d11 = 4.0;
            }
            bl2 = (d12 = d10 - (d11 *= 64.0) * d11) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (arrm == null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    @Override
    public void ae() {
        block26: {
            j j2;
            block23: {
                block24: {
                    m[] arrm;
                    block18: {
                        j j3;
                        block25: {
                            boolean bl2;
                            block19: {
                                block20: {
                                    block21: {
                                        block22: {
                                            arrm = net.minecraft.z.d.b();
                                            bl2 = this.aG.C;
                                            if (arrm != null) break block19;
                                            if (bl2) break block20;
                                            j2 = this;
                                            if (arrm != null) break block21;
                                            if (j2.aN == null) break block22;
                                            j2 = this;
                                            if (arrm != null) break block23;
                                            if (j2.aN.P) break block24;
                                        }
                                        j2 = this;
                                    }
                                    if (arrm != null) break block23;
                                    if (!j2.aG.n(new n(this))) break block24;
                                }
                                super.ae();
                                j3 = this;
                                if (arrm != null) break block25;
                                bl2 = j3.b();
                            }
                            if (bl2) {
                                this.h(1);
                            }
                            j3 = this;
                        }
                        int n2 = ++this.aP;
                        if (arrm == null) {
                            n2 = n2 >= 25 ? 1 : 0;
                        }
                        i i2 = b.a(j3, true, n2 != 0, this.aN);
                        if (arrm == null) {
                            if (i2 != null) {
                                this.a(i2);
                            }
                            this.a += this.aq;
                            this.aF += this.G;
                            this.ax += this.d;
                            b.a(this, 0.2f);
                        }
                        float f10 = this.c();
                        j j4 = this;
                        if (arrm == null) {
                            if (j4.aj()) {
                                for (int i3 = 0; i3 < 4; ++i3) {
                                    float f11 = 0.25f;
                                    this.aG.a(net.minecraft.ar.aH.WATER_BUBBLE, this.a - this.aq * 0.25, this.aF - this.G * 0.25, this.ax - this.d * 0.25, this.aq, this.G, this.d, new int[0]);
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block18;
                                }
                                f10 = 0.8f;
                            }
                            this.aq += this.aM;
                            this.G += this.aK;
                            this.d += this.aL;
                            this.aq *= (double)f10;
                            this.G *= (double)f10;
                            this.d *= (double)f10;
                            this.aG.a(this.a(), this.a, this.aF + 0.5, this.ax, 0.0, 0.0, 0.0, new int[0]);
                            j4 = this;
                        }
                        j4.g(this.a, this.aF, this.ax);
                    }
                    if (arrm == null) break block26;
                }
                j2 = this;
            }
            j2.a();
        }
    }

    protected abstract void a(i var1);

    @Override
    public float S() {
        return 1.0f;
    }

    protected aH a() {
        return net.minecraft.ar.aH.SMOKE_NORMAL;
    }

    @Override
    public void f(r r2) {
        r2.a("direction", this.a(new double[]{this.aq, this.G, this.d}));
        r2.a("power", this.a(new double[]{this.aM, this.aK, this.aL}));
        r2.b("life", this.aO);
    }

    protected boolean b() {
        return true;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public float aw() {
        return 1.0f;
    }

    public j(z z2, B b10, double d10, double d11, double d12) {
        super(z2);
        this.aN = b10;
        this.c(1.0f, 1.0f);
        this.c(b10.a, b10.aF, b10.ax, b10.e, b10.at);
        this.g(this.a, this.aF, this.ax);
        this.aq = 0.0;
        this.G = 0.0;
        this.d = 0.0;
        double d13 = h.e((d10 += this.g.nextGaussian() * 0.4) * d10 + (d11 += this.g.nextGaussian() * 0.4) * d11 + (d12 += this.g.nextGaussian() * 0.4) * d12);
        this.aM = d10 / d13 * 0.1;
        this.aK = d11 / d13 * 0.1;
        this.aL = d12 / d13 * 0.1;
    }

    public j(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2);
        this.c(1.0f, 1.0f);
        this.c(d10, d11, d12, this.e, this.at);
        this.g(d10, d11, d12);
        double d16 = h.e(d13 * d13 + d14 * d14 + d15 * d15);
        this.aM = d13 / d16 * 0.1;
        this.aK = d14 / d16 * 0.1;
        this.aL = d15 / d16 * 0.1;
    }

    @Override
    public void a(r r2) {
        block9: {
            j j2;
            block6: {
                block7: {
                    u u2;
                    u u3;
                    m[] arrm;
                    block8: {
                        int n2;
                        block4: {
                            block5: {
                                arrm = net.minecraft.z.d.b();
                                n2 = r2.a("power", 9);
                                if (arrm != null) break block4;
                                if (n2 == 0) break block5;
                                u3 = r2.c("power", 6);
                                n2 = u3.b();
                                if (arrm != null) break block4;
                                if (n2 == 3) {
                                    this.aM = u3.g(0);
                                    this.aK = u3.g(1);
                                    this.aL = u3.g(2);
                                }
                            }
                            j2 = this;
                            if (arrm != null) break block6;
                            j2.aO = r2.m("life");
                            n2 = r2.a("direction", 9) ? 1 : 0;
                        }
                        if (n2 == 0) break block7;
                        u2 = r2.c("direction", 6);
                        if (arrm != null) break block8;
                        if (u2.b() != 3) break block7;
                        u2 = r2.c("direction", 6);
                    }
                    u3 = u2;
                    this.aq = u3.g(0);
                    this.G = u3.g(1);
                    this.d = u3.g(2);
                    if (arrm == null) break block9;
                }
                j2 = this;
            }
            j2.a();
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(G g10, float f10) {
        block8: {
            m[] arrm;
            block10: {
                block9: {
                    x x2;
                    block7: {
                        arrm = net.minecraft.z.d.b();
                        x2 = this;
                        if (arrm == null) {
                            if (x2.a(g10)) {
                                return false;
                            }
                            this.B();
                            x2 = g10.h();
                        }
                        if (arrm != null) break block7;
                        if (x2 == null) break block8;
                        x2 = g10.h();
                    }
                    l l2 = x2.Y();
                    if (arrm != null) break block9;
                    if (l2 == null) break block10;
                    this.aq = l2.e;
                    this.G = l2.d;
                    this.d = l2.b;
                    this.aM = this.aq * 0.1;
                    this.aK = this.G * 0.1;
                }
                this.aL = this.d * 0.1;
            }
            boolean bl2 = g10.h() instanceof B;
            if (arrm == null) {
                if (bl2) {
                    this.aN = (B)g10.h();
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    public j(z z2) {
        super(z2);
        this.c(1.0f, 1.0f);
    }

    @Override
    protected void ab() {
    }

    protected float c() {
        return 0.95f;
    }

    public static void a(net.minecraft.av.b b10, String string) {
    }
}

