/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bA;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.k;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class N
extends K {
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k B;

    protected abstract i a(i var1, int var2);

    protected N(c c10, net.minecraft.ac.a a10) {
        super(c10, a10);
        this.a(net.minecraft.ad.a.p);
        this.a(true);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block2: {
            int n3;
            int n4;
            block1: {
                boolean bl2 = cL.b();
                n4 = z2.C;
                if (bl2) break block1;
                if (n4 != 0) break block2;
                n4 = this.a(i2);
            }
            if ((n3 = n4) > 0) {
                this.b(z2, n2, i2, n3);
            }
        }
    }

    protected void d(z z2, n n2) {
        z2.a(n2, (K)this, false);
        z2.a(n2.k(), (K)this, false);
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public int a(z z2) {
        return 20;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        return this.a(i2);
    }

    @Override
    public void b(z z2, n n2, i i2, Random random) {
    }

    protected abstract int e(z var1, n var2);

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        block2: {
            int n3;
            int n4;
            block1: {
                boolean bl2 = cL.e();
                n4 = z2.C;
                if (!bl2) break block1;
                if (n4 != 0) break block2;
                n4 = this.a(i2);
            }
            if ((n3 = n4) == 0) {
                this.b(z2, n2, i2, n3);
            }
        }
    }

    protected abstract void a(z var1, n var2);

    protected abstract int a(i var1);

    @Override
    public boolean a(t t2, n n2) {
        return true;
    }

    @Override
    public boolean a(z z2, n n2) {
        return this.f(z2, n2.k());
    }

    @Override
    public boolean m() {
        return true;
    }

    protected abstract void c(z var1, n var2);

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        return aA2 == aA.UP ? this.a(i2) : 0;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        N n3 = this;
        if (bl2) {
            if (n3.a(i2) > 0) {
                this.d(z2, n2);
            }
            n3 = this;
        }
        super.a(z2, n2, i2);
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.d(n2).d();
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = z2.d(n2).b() instanceof bA;
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    static {
        A = new k(0.0625, 0.0, 0.0625, 0.9375, 0.03125, 0.9375);
        z = new k(0.0625, 0.0, 0.0625, 0.9375, 0.0625, 0.9375);
        B = new k(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        boolean bl2 = cL.e();
        int n3 = this.a(i2);
        if (bl2) {
            n3 = n3 > 0 ? 1 : 0;
        }
        int n4 = n3;
        return n4 != 0 ? A : z;
    }

    protected void b(z z2, n n2, i i2, int n3) {
        block12: {
            int n4;
            block11: {
                int n5;
                block10: {
                    int n6;
                    boolean bl2;
                    block8: {
                        block9: {
                            int n7 = this.e(z2, n2);
                            bl2 = cL.e();
                            int n8 = n3;
                            if (bl2) {
                                n8 = n8 > 0 ? 1 : 0;
                            }
                            n6 = n8;
                            int n9 = n7;
                            if (bl2) {
                                n9 = n9 > 0 ? 1 : 0;
                            }
                            n5 = n9;
                            n4 = n3;
                            if (bl2) {
                                if (n4 != n7) {
                                    i2 = this.a(i2, n7);
                                    z2.a(n2, i2, 2);
                                    this.d(z2, n2);
                                    z2.b(n2, n2);
                                }
                                n4 = n5;
                            }
                            if (!bl2) break block8;
                            if (n4 != 0) break block9;
                            n4 = n6;
                            if (!bl2) break block8;
                            if (n4 == 0) break block9;
                            this.c(z2, n2);
                            if (bl2) break block10;
                        }
                        n4 = n5;
                    }
                    if (!bl2) break block11;
                    if (n4 == 0) break block10;
                    n4 = n6;
                    if (!bl2) break block11;
                    if (n4 == 0) {
                        this.a(z2, n2);
                    }
                }
                n4 = n5;
            }
            if (n4 == 0) break block12;
            z2.a(new n(n2), (K)this, this.a(z2));
        }
    }

    protected N(c c10) {
        this(c10, c10.a());
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.DESTROY;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.e();
        boolean bl3 = this.f(z2, n2.k());
        if (bl2 && !bl3) {
            this.a(z2, n2, i2, 0);
            bl3 = z2.v(n2);
        }
    }
}

