/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.bQ;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class bD
extends bF {
    protected static final /* synthetic */ k B;
    protected final /* synthetic */ boolean A;

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        return aA2.g() != Q.Y;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    protected boolean f(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.d(z2, n2, i2);
        if (bl2) {
            bl3 = bl3 > false;
        }
        return bl3;
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    public boolean e(z z2, n n2, i i2) {
        aA aA2 = i2.b(z).h();
        boolean bl2 = cL.b();
        n n3 = n2.a(aA2);
        boolean bl3 = bD.h(z2.d(n3));
        if (!bl2) {
            if (bl3) {
                return z2.d(n3).b(z) != aA2;
            }
            bl3 = false;
        }
        return bl3;
    }

    protected abstract i i(i var1);

    protected int b(t t2, n n2, i i2) {
        aA aA2 = i2.b(z);
        aA aA3 = aA2.l();
        aA aA4 = aA2.d();
        return Math.max(this.a(t2, n2.a(aA3), aA3), this.a(t2, n2.a(aA4), aA4));
    }

    protected boolean d(i i2) {
        return i2.a();
    }

    static {
        B = new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    }

    @Override
    public void b(z z2, n n2, i i2, Random random) {
    }

    @Override
    public boolean d(K k2) {
        return this.g(k2.d());
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        return i2.a(t2, n2, aA2);
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, net.minecraft.w.d d10) {
        block0: {
            if (!this.f(z2, n2, i2)) break block0;
            z2.a(n2, (K)this, 1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean h(i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = g.bB.g(i2);
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = g.cP.g(i2);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    protected int a(t t2, n n2, aA aA2) {
        i i2 = t2.d(n2);
        K k2 = i2.b();
        boolean bl2 = cL.b();
        int n3 = this.d(i2);
        if (!bl2) {
            if (n3 != 0) {
                K k3 = k2;
                if (!bl2) {
                    if (k3 == g.b8) {
                        return 15;
                    }
                    k3 = k2;
                }
                return k3 == g.bK ? i2.b(bQ.z).intValue() : t2.a(n2, aA2);
            }
            n3 = 0;
        }
        return n3;
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        block3: {
            int n3;
            block2: {
                boolean bl2 = cL.b();
                n3 = this.b(i2);
                if (bl2) break block2;
                if (n3 != 0) break block3;
                n3 = 0;
            }
            return n3;
        }
        return i2.b(z) == aA2 ? this.c(t2, n2, i2) : 0;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, b10.K().h());
    }

    public boolean b(z z2, n n2) {
        return z2.d(n2.k()).d();
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? d.SOLID : d.UNDEFINED;
    }

    protected void c(z z2, n n2, i i2) {
        aA aA2 = i2.b(z);
        n n3 = n2.a(aA2.h());
        z2.a(n3, (K)this, n2);
        z2.a(n3, (K)this, aA2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.d(n2.k()).d();
        if (bl2) {
            if (!bl3) return false;
            bl3 = super.a(z2, n2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    protected void g(z z2, n n2, i i2) {
        block3: {
            int n3;
            block8: {
                int n4;
                block9: {
                    boolean bl2;
                    block6: {
                        block7: {
                            int n5;
                            block5: {
                                block4: {
                                    boolean bl3;
                                    block2: {
                                        bl2 = cL.e();
                                        bl3 = this.a((t)z2, n2, i2);
                                        if (!bl2) break block2;
                                        if (bl3) break block3;
                                        bl3 = this.f(z2, n2, i2);
                                    }
                                    boolean bl4 = bl3;
                                    n5 = this.A;
                                    if (!bl2) break block4;
                                    if (n5 == bl4) break block3;
                                    n5 = z2.c(n2, this) ? 1 : 0;
                                }
                                if (!bl2) break block5;
                                if (n5 != 0) break block3;
                                n5 = -1;
                            }
                            n3 = n5;
                            n4 = this.e(z2, n2, i2);
                            if (!bl2) break block6;
                            if (n4 == 0) break block7;
                            n3 = -3;
                            if (bl2) break block8;
                        }
                        n4 = this.A;
                    }
                    if (!bl2) break block9;
                    if (n4 == 0) break block8;
                    n4 = -2;
                }
                n3 = n4;
            }
            z2.b(n2, this, this.c(i2), n3);
        }
    }

    protected boolean b(i i2) {
        return this.A;
    }

    protected abstract int c(i var1);

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block3: {
            i i3;
            n n3;
            z z3;
            block7: {
                boolean bl2;
                block6: {
                    boolean bl3;
                    boolean bl4;
                    block4: {
                        block5: {
                            boolean bl5;
                            block2: {
                                bl4 = cL.e();
                                bl5 = this.a((t)z2, n2, i2);
                                if (!bl4) break block2;
                                if (bl5) break block3;
                                bl5 = this.f(z2, n2, i2);
                            }
                            bl3 = bl5;
                            bl2 = this.A;
                            if (!bl4) break block4;
                            if (!bl2) break block5;
                            bl2 = bl3;
                            if (!bl4) break block4;
                            if (bl2) break block5;
                            z2.a(n2, this.i(i2), 2);
                            if (bl4) break block3;
                        }
                        bl2 = this.A;
                    }
                    if (!bl4) break block6;
                    if (bl2) break block3;
                    z3 = z2;
                    n3 = n2;
                    i3 = this.e(i2);
                    if (!bl4) break block7;
                    z3.a(n3, i3, 2);
                    bl2 = bl3;
                }
                if (bl2) break block3;
                z3 = z2;
                n3 = n2;
                i3 = this.e(i2);
            }
            z3.b(n3, i3.b(), this.a(i2), -1);
        }
    }

    protected int a(i i2) {
        return this.c(i2);
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    protected abstract i e(i var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g(i i2) {
        K k2 = i2.b();
        boolean bl2 = cL.b();
        K k3 = k2;
        K k4 = this.e(this.d()).b();
        if (!bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = this.i(this.d()).b();
        }
        if (k3 != k4) return false;
        return true;
    }

    public boolean a(t t2, n n2, i i2) {
        return false;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        this.c(z2, n2, i2);
    }

    protected int c(t t2, n n2, i i2) {
        return 15;
    }

    protected bD(boolean bl2) {
        super(net.minecraft.ac.c.n);
        this.A = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d(z z2, n n2, i i2) {
        boolean bl2 = cL.b();
        bD bD2 = this;
        if (!bl2) {
            if (bD2.A) {
                for (aA aA2 : aA.values()) {
                    z2.a(n2.a(aA2), (K)this, false);
                    if (bl2) return;
                    if (!bl2) continue;
                }
            }
            bD2 = this;
        }
        super.d(z2, n2, i2);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return B;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int d(z z2, n n2, i i2) {
        int n3;
        i i3;
        int n4;
        aA aA2 = i2.b(z);
        n n5 = n2.a(aA2);
        boolean bl2 = cL.e();
        int n6 = n4 = z2.b(n5, aA2);
        if (!bl2) return n6;
        if (n6 >= 15) {
            n6 = n4;
            return n6;
        }
        i i4 = i3 = z2.d(n5);
        if (bl2) {
            if (i4.b() != g.bK) {
                n3 = 0;
                return Math.max(n4, n3);
            }
            i4 = i3;
        }
        n3 = i4.b(bQ.z);
        return Math.max(n4, n3);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            block3: {
                boolean bl3;
                block4: {
                    bl2 = cL.b();
                    bl3 = this.b(z2, n2);
                    if (bl2) break block3;
                    if (!bl3) break block4;
                    this.g(z2, n2, i2);
                    if (!bl2) break block5;
                }
                this.a(z2, n2, i2, 0);
                bl3 = z2.v(n2);
            }
            for (aA aA2 : aA.values()) {
                z2.a(n2.a(aA2), (K)this, false);
                if (!bl2) continue;
            }
        }
    }
}

