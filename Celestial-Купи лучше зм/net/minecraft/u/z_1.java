/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.U;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.U.M;
import net.minecraft.U.c;
import net.minecraft.U.m;
import net.minecraft.U.x;
import net.minecraft.W.bD;
import net.minecraft.Z.i;
import net.minecraft.an.b;
import net.minecraft.ar.G;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.w.d;
import org.apache.commons.lang3.Validate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class z
extends x {
    private static final /* synthetic */ Predicate<x> aK;
    @Nullable
    public /* synthetic */ aA aL;
    protected /* synthetic */ n aN;
    private /* synthetic */ int aM;

    @Override
    protected void ab() {
    }

    @Override
    public float a(net.minecraft.ar.h h2) {
        return this.a(h2.b(this.aL));
    }

    @Override
    public float a(ae ae2) {
        z z2;
        block14: {
            block15: {
                int[] arrn = net.minecraft.U.M.b();
                z2 = this;
                if (arrn == null) break block14;
                if (z2.aL == null) break block15;
                z2 = this;
                if (arrn == null) break block14;
                if (z2.aL.g() != net.minecraft.ar.Q.Y) {
                    switch (ae2) {
                        case CLOCKWISE_180: {
                            this.aL = this.aL.h();
                            if (arrn != null) break;
                        }
                        case COUNTERCLOCKWISE_90: {
                            this.aL = this.aL.d();
                            if (arrn != null) break;
                        }
                        case CLOCKWISE_90: {
                            this.aL = this.aL.l();
                            break;
                        }
                    }
                }
            }
            z2 = this;
        }
        float f10 = h.b(z2.e);
        switch (ae2) {
            case CLOCKWISE_180: {
                return f10 + 180.0f;
            }
            case COUNTERCLOCKWISE_90: {
                return f10 + 90.0f;
            }
            case CLOCKWISE_90: {
                return f10 + 270.0f;
            }
        }
        return f10;
    }

    protected void e() {
        block3: {
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            double d15;
            block6: {
                block5: {
                    int[] arrn;
                    block4: {
                        z z2;
                        block2: {
                            arrn = net.minecraft.U.M.b();
                            z2 = this;
                            if (arrn == null) break block2;
                            if (z2.aL == null) break block3;
                            z2 = this;
                        }
                        d15 = (double)z2.aN.e() + 0.5;
                        d14 = (double)this.aN.b() + 0.5;
                        d13 = (double)this.aN.a() + 0.5;
                        double d16 = 0.46875;
                        double d17 = this.a(this.h());
                        double d18 = this.a(this.c());
                        d15 -= (double)this.aL.r() * 0.46875;
                        d13 -= (double)this.aL.i() * 0.46875;
                        aA aA2 = this.aL.d();
                        this.a = d15 += d17 * (double)aA2.r();
                        this.aF = d14 += d18;
                        this.ax = d13 += d17 * (double)aA2.i();
                        d12 = this.h();
                        d11 = this.c();
                        d10 = this.h();
                        if (arrn == null) break block4;
                        if (this.aL.g() != net.minecraft.ar.Q.Z) break block5;
                        d10 = 1.0;
                    }
                    if (arrn != null) break block6;
                }
                d12 = 1.0;
            }
            this.a(new k(d15 - (d12 /= 32.0), d14 - (d11 /= 32.0), d13 - (d10 /= 32.0), d15 + d12, d14 + d11, d13 + d10));
        }
    }

    public abstract void d();

    @Override
    public void h(double d10, double d11, double d12) {
        block2: {
            int n2;
            block3: {
                int[] arrn;
                block1: {
                    arrn = net.minecraft.U.M.b();
                    n2 = this.aG.C;
                    if (arrn == null) break block1;
                    if (n2 != 0) break block2;
                    n2 = this.P ? 1 : 0;
                }
                if (arrn == null) break block3;
                if (n2 != 0) break block2;
                double d13 = d10 * d10 + d11 * d11 + d12 * d12 - 0.0;
                n2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            }
            if (n2 > 0) {
                this.a();
                this.a((x)null);
            }
        }
    }

    public n g() {
        return this.aN;
    }

    @Override
    public t a(d d10, float f10) {
        t t2 = new t(this.aG, this.a + (double)((float)this.aL.r() * 0.15f), this.aF + (double)f10, this.ax + (double)((float)this.aL.i() * 0.15f), d10);
        t2.b();
        this.aG.f(t2);
        return t2;
    }

    public z(net.minecraft.ah.z z2) {
        super(z2);
        this.c(0.5f, 0.5f);
    }

    @Override
    public void a(c c10, double d10, double d11, double d12) {
        block2: {
            int n2;
            block3: {
                int[] arrn;
                block1: {
                    arrn = net.minecraft.U.M.b();
                    n2 = this.aG.C;
                    if (arrn == null) break block1;
                    if (n2 != 0) break block2;
                    n2 = this.P ? 1 : 0;
                }
                if (arrn == null) break block3;
                if (n2 != 0) break block2;
                double d13 = d10 * d10 + d11 * d11 + d12 * d12 - 0.0;
                n2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            }
            if (n2 > 0) {
                this.a();
                this.a((x)null);
            }
        }
    }

    @Override
    public void a(b b10) {
    }

    @Override
    public void f(r r2) {
        r2.a("Facing", (byte)this.aL.k());
        n n2 = this.g();
        r2.b("TileX", n2.e());
        r2.b("TileY", n2.b());
        r2.b("TileZ", n2.a());
    }

    public abstract int c();

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public boolean a(G g10, float f10) {
        boolean bl2;
        block6: {
            block7: {
                int[] arrn = net.minecraft.U.M.b();
                bl2 = this.a(g10);
                if (arrn != null) {
                    if (bl2) {
                        return false;
                    }
                    bl2 = this.P;
                }
                if (arrn == null) break block6;
                if (bl2) break block7;
                bl2 = this.aG.C;
                if (arrn == null) break block6;
                if (!bl2) {
                    this.a();
                    this.B();
                    this.a(g10.h());
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    public z(net.minecraft.ah.z z2, n n2) {
        this(z2);
        this.aN = n2;
    }

    static {
        aK = new m();
    }

    @Override
    protected boolean R() {
        return false;
    }

    @Override
    public aA K() {
        return this.aL;
    }

    @Override
    public void g(double d10, double d11, double d12) {
        this.aN = new n(d10, d11, d12);
        this.e();
        this.aA = true;
    }

    public boolean b() {
        int n2;
        block8: {
            int[] arrn = net.minecraft.U.M.b();
            int n3 = this.aG.a((x)this, this.m()).isEmpty();
            if (arrn != null) {
                if (n3 == 0) {
                    return false;
                }
                n3 = Math.max(1, this.h() / 16);
            }
            int n4 = n3;
            int n5 = Math.max(1, this.c() / 16);
            n n6 = this.aN.a(this.aL.h());
            aA aA2 = this.aL.d();
            o o2 = new o();
            int n7 = 0;
            block0: while (true) {
                int n8 = n7;
                block1: while (n8 < n4) {
                    n2 = 0;
                    if (arrn == null) break block8;
                    int n9 = n2;
                    while (n9 < n5) {
                        block9: {
                            block10: {
                                boolean bl2;
                                block11: {
                                    int n10 = (n4 - 1) / -2;
                                    int n11 = (n5 - 1) / -2;
                                    o2.a(n6).a(aA2, n7 + n10).a(net.minecraft.ar.aA.UP, n9 + n11);
                                    i i2 = this.aG.d(o2);
                                    if (arrn == null) break block9;
                                    n8 = i2.o().d() ? 1 : 0;
                                    if (arrn == null) continue block1;
                                    if (n8 != 0) break block10;
                                    bl2 = bD.h(i2);
                                    if (arrn == null) break block11;
                                    if (bl2) break block10;
                                    bl2 = false;
                                }
                                return bl2;
                            }
                            ++n9;
                        }
                        if (arrn != null) continue;
                    }
                    ++n7;
                    if (arrn != null) continue block0;
                }
                break;
            }
            n2 = this.aG.a((x)this, this.m(), aK).isEmpty() ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    public void a(r r2) {
        this.aN = new n(r2.m("TileX"), r2.m("TileY"), r2.m("TileZ"));
        this.a(net.minecraft.ar.aA.b(r2.r("Facing")));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(x x2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = x2 instanceof j;
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.a(net.minecraft.ar.G.a((j)x2), 0.0f);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void ae() {
        block3: {
            z z2;
            block6: {
                int n2;
                block5: {
                    int[] arrn;
                    block4: {
                        block2: {
                            this.N = this.a;
                            arrn = net.minecraft.U.M.b();
                            this.L = this.aF;
                            this.k = this.ax;
                            int n3 = this.aM;
                            n2 = n3;
                            this.aM = n3 + 1;
                            if (arrn == null) break block2;
                            if (n2 != 100) break block3;
                            n2 = this.aG.C ? 1 : 0;
                        }
                        if (arrn == null) break block4;
                        if (n2 != 0) break block3;
                        this.aM = 0;
                        n2 = this.P ? 1 : 0;
                    }
                    if (arrn == null) break block5;
                    if (n2 != 0) break block3;
                    z2 = this;
                    if (arrn == null) break block6;
                    n2 = z2.b() ? 1 : 0;
                }
                if (n2 != 0) break block3;
                this.a();
                z2 = this;
            }
            z2.a((x)null);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected void a(aA aA2) {
        Validate.notNull((Object)aA2);
        Validate.isTrue((boolean)aA2.g().d());
        this.aL = aA2;
        this.ak = this.e = (float)(this.aL.k() * 90);
        this.e();
    }

    public abstract int h();

    public abstract void a(x var1);

    private double a(int n2) {
        return n2 % 32 == 0 ? 0.5 : 0.0;
    }
}

