/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class bk
extends K {
    protected static final /* synthetic */ k A;
    public static final /* synthetic */ e z;
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k B;

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        aA aA2;
        block3: {
            aA aA3;
            block2: {
                aA2 = aA.a(n2);
                boolean bl2 = cL.e();
                aA3 = aA2;
                if (!bl2) break block2;
                if (aA3.g() != Q.Y) break block3;
                aA3 = aA.NORTH;
            }
            aA2 = aA3;
        }
        return this.d().a(z, aA2);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        aA aA2 = i2.b(z);
        boolean bl2 = cL.e();
        bk bk2 = this;
        if (bl2) {
            if (!bk2.b(z2, n2.a(aA2.h()), aA2)) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
            }
            bk2 = this;
        }
        super.a(i2, z2, n2, k2, n3);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    static {
        z = bF.z;
        C = new k(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
        B = new k(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
        D = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
        A = new k(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
    }

    @Override
    public int d(i i2) {
        return i2.b(z).f();
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public boolean a(z z2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(z2, n2.b(), aA2);
        if (!bl2) {
            if (bl3) {
                return true;
            }
            bl3 = this.b(z2, n2.m(), aA2);
        }
        if (!bl2) {
            if (bl3) {
                return true;
            }
            bl3 = this.b(z2, n2.i(), aA2);
        }
        if (!bl2) {
            if (bl3) {
                return true;
            }
            bl3 = this.b(z2, n2.j(), aA2);
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(z z2, n n2, aA aA2) {
        i i2 = z2.d(n2);
        boolean bl2 = cL.e();
        boolean bl3 = bk.a(i2.b());
        if (bl3) return false;
        i i3 = i2;
        if (bl2) {
            if (i3.c(z2, n2, aA2) != d.SOLID) return false;
            i3 = i2;
        }
        boolean bl4 = i3.a();
        if (!bl2) return bl4;
        if (bl4) return false;
        return true;
    }

    protected bk() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(z, aA.NORTH));
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        bk bk2;
        block5: {
            boolean bl2;
            block7: {
                bk bk3;
                block8: {
                    boolean bl3;
                    block6: {
                        bl2 = cL.b();
                        bl3 = aA2.g().d();
                        if (bl2) break block6;
                        if (!bl3) break block7;
                        bk3 = this;
                        if (bl2) break block8;
                        bl3 = bk3.b(z2, n2.a(aA2.h()), aA2);
                    }
                    if (!bl3) break block7;
                    bk3 = this;
                }
                return bk3.d().a(z, aA2);
            }
            for (aA aA3 : av.HORIZONTAL) {
                block10: {
                    bk bk4;
                    block9: {
                        bk2 = this;
                        if (bl2) break block5;
                        if (bl2) break block9;
                        if (!bk2.b(z2, n2.a(aA3.h()), aA3)) break block10;
                        bk4 = this;
                    }
                    return bk4.d().a(z, aA3);
                }
                if (!bl2) continue;
            }
            bk2 = this;
        }
        return bk2.d();
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(z)) {
            case NORTH: {
                return A;
            }
            case SOUTH: {
                return D;
            }
            case WEST: {
                return B;
            }
        }
        return C;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }
}

