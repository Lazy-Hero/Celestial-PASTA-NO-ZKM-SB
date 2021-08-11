/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.P.r;
import net.minecraft.W.aN;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class A
extends u {
    public /* synthetic */ double a2;
    private /* synthetic */ int a4;
    public /* synthetic */ double a1;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> a3;

    protected void l(boolean bl2) {
        this.ap.b(a3, bl2);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(a3, false);
    }

    @Override
    public i n() {
        return (this.b() ? net.minecraft.u.g.bn : net.minecraft.u.g.bJ).d().a(aN.B, net.minecraft.ar.aA.NORTH);
    }

    @Override
    public void a(G g10) {
        block3: {
            A a10;
            block4: {
                boolean bl2;
                block2: {
                    int n2 = net.minecraft.J.j.c();
                    super.a(g10);
                    int n3 = n2;
                    bl2 = g10.j();
                    if (n3 != 0) break block2;
                    if (bl2) break block3;
                    a10 = this;
                    if (n3 != 0) break block4;
                    bl2 = a10.aG.M().c("doEntityDrops");
                }
                if (!bl2) break block3;
                a10 = this;
            }
            a10.a(new d(net.minecraft.u.g.bJ, 1), 0.0f);
        }
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        int n2;
        block7: {
            block5: {
                block6: {
                    d d10 = j2.c(a32);
                    int n3 = net.minecraft.J.j.d();
                    if (n3 == 0) break block5;
                    if (d10.w() != net.minecraft.u.h.b4) break block6;
                    n2 = this.a4 + 3600;
                    if (n3 == 0) break block7;
                    if (n2 <= 32000) {
                        if (!j2.cw.g) {
                            d10.b(1);
                        }
                        this.a4 += 3600;
                    }
                }
                this.a1 = this.a - j2.a;
                this.a2 = this.ax - j2.ax;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    @Override
    protected void f(r r2) {
        super.f(r2);
        r2.a("PushX", this.a1);
        r2.a("PushZ", this.a2);
        r2.a("Fuel", (short)this.a4);
    }

    @Override
    protected double k() {
        return 0.2;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        this.a1 = r2.e("PushX");
        this.a2 = r2.e("PushZ");
        this.a4 = r2.q("Fuel");
    }

    @Override
    public j o() {
        return net.minecraft.J.j.FURNACE;
    }

    @Override
    protected void a(n n2, i i2) {
        block3: {
            double d10;
            double d11;
            block5: {
                double d12;
                block6: {
                    double d13;
                    int n3;
                    block4: {
                        block2: {
                            super.a(n2, i2);
                            d12 = this.a1 * this.a1 + this.a2 * this.a2;
                            n3 = net.minecraft.J.j.c();
                            double d14 = d12 - 1.0E-4;
                            d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            if (n3 != 0) break block2;
                            if (d13 <= 0) break block3;
                            double d15 = this.aq * this.aq + this.d * this.d - 0.001;
                            d13 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        }
                        if (n3 != 0) break block4;
                        if (d13 <= 0) break block3;
                        d12 = h.e(d12);
                        this.a1 /= d12;
                        this.a2 /= d12;
                        d11 = this.a1 * this.aq + this.a2 * this.d;
                        d10 = 0.0;
                        if (n3 != 0) break block5;
                        double d16 = d11 - d10;
                        d13 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                    }
                    if (d13 >= 0) break block6;
                    this.a1 = 0.0;
                    this.a2 = 0.0;
                    if (n3 == 0) break block3;
                }
                d11 = d12;
                d10 = this.k();
            }
            double d17 = d11 / d10;
            this.a1 *= d17;
            this.a2 *= d17;
        }
    }

    public A(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }

    static {
        a3 = net.minecraft.q.m.a(A.class, net.minecraft.q.h.g);
    }

    @Override
    public void ae() {
        block12: {
            A a10;
            block13: {
                int n2;
                block11: {
                    A a11;
                    int n3;
                    block10: {
                        int n4;
                        block9: {
                            int n5 = net.minecraft.J.j.d();
                            super.ae();
                            n3 = n5;
                            n4 = this.a4--;
                            if (n3 == 0) break block9;
                            if (n4 > 0) {
                                // empty if block
                            }
                            a11 = this;
                            if (n3 == 0) break block10;
                            n4 = a11.a4;
                        }
                        if (n4 <= 0) {
                            this.a1 = 0.0;
                            this.a2 = 0.0;
                        }
                        a11 = this;
                    }
                    boolean bl2 = this.a4;
                    if (n3 != 0) {
                        bl2 = bl2 > false;
                    }
                    a11.l(bl2);
                    n2 = this.b();
                    if (n3 == 0) break block11;
                    if (n2 == 0) break block12;
                    a10 = this;
                    if (n3 == 0) break block13;
                    n2 = a10.g.nextInt(4);
                }
                if (n2 != 0) break block12;
                a10 = this;
            }
            a10.aG.a(net.minecraft.ar.aH.SMOKE_LARGE, this.a, this.aF + 0.8, this.ax, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected void i() {
        block4: {
            block2: {
                block3: {
                    double d10 = this.a1 * this.a1 + this.a2 * this.a2;
                    int n2 = net.minecraft.J.j.d();
                    if (n2 == 0) break block2;
                    if (!(d10 > 1.0E-4)) break block3;
                    d10 = h.e(d10);
                    this.a1 /= d10;
                    this.a2 /= d10;
                    double d11 = 1.0;
                    this.aq *= (double)0.8f;
                    this.G *= 0.0;
                    this.d *= (double)0.8f;
                    this.aq += this.a1 * 1.0;
                    this.d += this.a2 * 1.0;
                    if (n2 != 0) break block4;
                }
                this.aq *= (double)0.98f;
                this.G *= 0.0;
            }
            this.d *= (double)0.98f;
        }
        super.i();
    }

    public A(z z2) {
        super(z2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected boolean b() {
        return this.ap.b(a3);
    }

    public static void b(b b10) {
        net.minecraft.J.u.a(b10, A.class);
    }
}

