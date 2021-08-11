/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.P.r;
import net.minecraft.U.c;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ax.T;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.b;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class E
extends x {
    public /* synthetic */ int aL;
    private /* synthetic */ int aM;
    private /* synthetic */ int aQ;
    public /* synthetic */ int aO;
    private /* synthetic */ int aN;
    private /* synthetic */ net.minecraft.i.j aK;
    public /* synthetic */ int aP;

    @Override
    public boolean t() {
        return this.aG.a(this.m(), net.minecraft.ac.c.L, this);
    }

    public static int a(int n2) {
        int n3;
        block21: {
            int n4;
            block20: {
                int n5 = net.minecraft.J.j.d();
                n3 = n2;
                n4 = 2477;
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 2477;
                    }
                    n3 = n2;
                    n4 = 1237;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 1237;
                    }
                    n3 = n2;
                    n4 = 617;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 617;
                    }
                    n3 = n2;
                    n4 = 307;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 307;
                    }
                    n3 = n2;
                    n4 = 149;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 149;
                    }
                    n3 = n2;
                    n4 = 73;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 73;
                    }
                    n3 = n2;
                    n4 = 37;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 37;
                    }
                    n3 = n2;
                    n4 = 17;
                }
                if (n5 != 0) {
                    if (n3 >= n4) {
                        return 17;
                    }
                    n3 = n2;
                    n4 = 7;
                }
                if (n5 == 0) break block20;
                if (n3 >= n4) {
                    return 7;
                }
                n3 = n2;
                if (n5 == 0) break block21;
                n4 = 3;
            }
            n3 = n3 >= n4 ? 3 : 1;
        }
        return n3;
    }

    private int c(int n2) {
        return n2 * 2;
    }

    @Override
    public void a(r r2) {
        this.aM = r2.q("Health");
        this.aP = r2.q("Age");
        this.aN = r2.q("Value");
    }

    public int a() {
        int n2;
        block21: {
            int n3;
            block20: {
                int n4 = net.minecraft.J.j.c();
                n2 = this.aN;
                n3 = 2477;
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 10;
                    }
                    n2 = this.aN;
                    n3 = 1237;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 9;
                    }
                    n2 = this.aN;
                    n3 = 617;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 8;
                    }
                    n2 = this.aN;
                    n3 = 307;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 7;
                    }
                    n2 = this.aN;
                    n3 = 149;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 6;
                    }
                    n2 = this.aN;
                    n3 = 73;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 5;
                    }
                    n2 = this.aN;
                    n3 = 37;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 4;
                    }
                    n2 = this.aN;
                    n3 = 17;
                }
                if (n4 == 0) {
                    if (n2 >= n3) {
                        return 3;
                    }
                    n2 = this.aN;
                    n3 = 7;
                }
                if (n4 != 0) break block20;
                if (n2 >= n3) {
                    return 2;
                }
                n2 = this.aN;
                if (n4 != 0) break block21;
                n3 = 3;
            }
            n2 = n2 >= n3 ? 1 : 0;
        }
        return n2;
    }

    @Override
    protected void c(int n2) {
        this.a(net.minecraft.ar.G.c, (float)n2);
    }

    public E(z z2) {
        super(z2);
        this.aM = 5;
        this.c(0.25f, 0.25f);
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    public void f(r r2) {
        r2.a("Health", (short)this.aM);
        r2.a("Age", (short)this.aP);
        r2.a("Value", (short)this.aN);
    }

    @Override
    public int aS() {
        float f10 = 0.5f;
        f10 = h.c(f10, 0.0f, 1.0f);
        int n2 = super.aS();
        int n3 = net.minecraft.J.j.c();
        int n4 = n2 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n4 += (int)(f10 * 15.0f * 16.0f);
        int n7 = 240;
        if (n3 == 0) {
            if (n6 > n7) {
                n4 = 240;
            }
            n6 = n4;
            n7 = n5 << 16;
        }
        return n6 | n7;
    }

    @Override
    public boolean aN() {
        return false;
    }

    @Override
    public boolean a(G g10, float f10) {
        int n2 = net.minecraft.J.j.c();
        int n3 = this.a(g10);
        if (n2 == 0) {
            if (n3 != 0) {
                return false;
            }
            this.B();
            n3 = this.aM = (int)((float)this.aM - f10);
        }
        if (n2 == 0) {
            if (n3 <= 0) {
                this.a();
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    @Override
    public void e(net.minecraft.i.j j2) {
        block6: {
            E e10;
            block11: {
                int n2;
                block9: {
                    int n3;
                    block10: {
                        net.minecraft.i.j j3;
                        block8: {
                            int n4;
                            block7: {
                                block5: {
                                    n3 = net.minecraft.J.j.c();
                                    n4 = this.aG.C;
                                    if (n3 != 0) break block5;
                                    if (n4 != 0) break block6;
                                    n4 = this.aL;
                                }
                                if (n3 != 0) break block7;
                                if (n4 != 0) break block6;
                                j3 = j2;
                                if (n3 != 0) break block8;
                                n4 = j3.cl;
                            }
                            if (n4 != 0) break block6;
                            j2.cl = 2;
                            j3 = j2;
                        }
                        j3.a((x)this, 1);
                        d d10 = net.minecraft.ax.T.b(b.i, j2);
                        n2 = d10.G();
                        if (n3 != 0) break block9;
                        if (n2 != 0) break block10;
                        n2 = d10.a() ? 1 : 0;
                        if (n3 != 0) break block9;
                        if (n2 != 0) {
                            int n5 = Math.min(this.c(this.aN), d10.u());
                            this.aN -= this.b(n5);
                            d10.a(d10.u() - n5);
                        }
                    }
                    e10 = this;
                    if (n3 != 0) break block11;
                    n2 = e10.aN;
                }
                if (n2 > 0) {
                    j2.b(this.aN);
                }
                e10 = this;
            }
            e10.a();
        }
    }

    public E(z z2, double d10, double d11, double d12, int n2) {
        super(z2);
        this.aM = 5;
        this.c(0.5f, 0.5f);
        this.g(d10, d11, d12);
        this.e = (float)(Math.random() * 360.0);
        this.aq = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.G = (float)(Math.random() * 0.2) * 2.0f;
        this.d = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.aN = n2;
    }

    @Override
    protected void ab() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private int b(int n2) {
        return n2 / 2;
    }

    @Override
    public void ae() {
        block36: {
            E e10;
            block35: {
                int n2;
                block34: {
                    int n3;
                    block33: {
                        E e11;
                        block31: {
                            block32: {
                                net.minecraft.i.j j2;
                                block29: {
                                    block30: {
                                        E e12;
                                        block23: {
                                            block24: {
                                                block27: {
                                                    E e13;
                                                    block28: {
                                                        block25: {
                                                            E e14;
                                                            block26: {
                                                                E e15;
                                                                block22: {
                                                                    int n4;
                                                                    block21: {
                                                                        int n5 = net.minecraft.J.j.c();
                                                                        super.ae();
                                                                        n3 = n5;
                                                                        n4 = this.aL--;
                                                                        if (n3 != 0) break block21;
                                                                        if (n4 > 0) {
                                                                            // empty if block
                                                                        }
                                                                        this.N = this.a;
                                                                        this.L = this.aF;
                                                                        this.k = this.ax;
                                                                        e15 = this;
                                                                        if (n3 != 0) break block22;
                                                                        n4 = e15.aI() ? 1 : 0;
                                                                    }
                                                                    if (n4 == 0) {
                                                                        this.G -= (double)0.03f;
                                                                    }
                                                                    e15 = this;
                                                                }
                                                                if (n3 == 0) {
                                                                    if (e15.aG.d(new n(this)).o() == net.minecraft.ac.c.g) {
                                                                        this.G = 0.2f;
                                                                        this.aq = (this.g.nextFloat() - this.g.nextFloat()) * 0.2f;
                                                                        this.d = (this.g.nextFloat() - this.g.nextFloat()) * 0.2f;
                                                                        this.a(net.minecraft.u.E.b8, 0.4f, 2.0f + this.g.nextFloat() * 0.4f);
                                                                    }
                                                                    e15 = this;
                                                                }
                                                                e15.e(this.a, (this.m().b + this.m().a) / 2.0, this.ax);
                                                                double d10 = 8.0;
                                                                e12 = this;
                                                                if (n3 != 0) break block23;
                                                                if (e12.aQ >= this.aO - 20 + this.W() % 100) break block24;
                                                                e14 = this;
                                                                if (n3 != 0) break block25;
                                                                if (e14.aK == null) break block26;
                                                                e13 = this;
                                                                if (n3 != 0) break block27;
                                                                if (!(e13.aK.s(this) > 64.0)) break block28;
                                                            }
                                                            e14 = this;
                                                        }
                                                        e14.aK = this.aG.a((x)this, 8.0);
                                                    }
                                                    e13 = this;
                                                }
                                                e13.aQ = this.aO;
                                            }
                                            e12 = this;
                                        }
                                        j2 = e12.aK;
                                        if (n3 != 0) break block29;
                                        if (j2 == null) break block30;
                                        j2 = this.aK;
                                        if (n3 != 0) break block29;
                                        if (j2.ae()) {
                                            this.aK = null;
                                        }
                                    }
                                    e11 = this;
                                    if (n3 != 0) break block31;
                                    j2 = e11.aK;
                                }
                                if (j2 == null) break block32;
                                double d11 = (this.aK.a - this.a) / 8.0;
                                double d12 = (this.aK.aF + (double)this.aK.l() / 2.0 - this.aF) / 8.0;
                                double d13 = (this.aK.ax - this.ax) / 8.0;
                                double d14 = Math.sqrt(d11 * d11 + d12 * d12 + d13 * d13);
                                double d15 = 1.0 - d14;
                                if (n3 != 0) break block33;
                                if (d15 > 0.0) {
                                    d15 *= d15;
                                    this.aq += d11 / d14 * d15 * 0.1;
                                    this.G += d12 / d14 * d15 * 0.1;
                                    this.d += d13 / d14 * d15 * 0.1;
                                }
                            }
                            e11 = this;
                        }
                        e11.a(c.SELF, this.aq, this.G, this.d);
                    }
                    float f10 = 0.98f;
                    n2 = this.A;
                    if (n3 == 0) {
                        if (n2 != 0) {
                            f10 = this.aG.d((n)new n((int)h.f((double)this.a), (int)(h.f((double)this.m().b) - 1), (int)h.f((double)this.ax))).b().x * 0.98f;
                        }
                        this.aq *= (double)f10;
                        this.G *= (double)0.98f;
                        this.d *= (double)f10;
                        n2 = this.A ? 1 : 0;
                    }
                    if (n3 != 0) break block34;
                    if (n2 != 0) {
                        this.G *= (double)-0.9f;
                    }
                    ++this.aO;
                    ++this.aP;
                    e10 = this;
                    if (n3 != 0) break block35;
                    n2 = e10.aP;
                }
                if (n2 < 6000) break block36;
                e10 = this;
            }
            e10.a();
        }
    }

    public int b() {
        return this.aN;
    }
}

