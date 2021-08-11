/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class cX
extends K {
    protected static final /* synthetic */ k[] z;
    public static final /* synthetic */ f A;

    @Override
    public int d(i i2) {
        return i2.b(A) - 1;
    }

    @Override
    public boolean a(t t2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = t2.d(n2).b(A).intValue();
        if (!bl2) {
            bl3 = bl3 < BADBOOL 5;
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    protected cX() {
        super(net.minecraft.ac.c.v);
        this.h(this.e.a().a(A, 1));
        this.a(true);
        this.a(net.minecraft.ad.a.j);
    }

    private boolean a(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.a(z2, n2);
        if (bl2) {
            if (!bl3) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
                return false;
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z[i2.b(A)];
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        boolean bl2 = cL.b();
        int n3 = z2.a(net.minecraft.ah.c.BLOCK, n2);
        if (!bl2 && n3 > 11) {
            this.a(z2, n2, z2.d(n2), 0);
            n3 = z2.v(n2) ? 1 : 0;
        }
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.aB;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        this.a(z2, n2, i2);
    }

    @Override
    public boolean b(t t2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = t2.d(n2).b(A).intValue();
        if (!bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? net.minecraft.Z.d.SOLID : net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        cX.a(z2, n2, new d(net.minecraft.u.h.aB, i2.b(A) + 1, 0));
        z2.v(n2);
        j2.b(net.minecraft.l.m.a(this));
    }

    static {
        A = f.a("layers", 1, 8);
        z = new k[]{new k(0.0, 0.0, 0.0, 1.0, 0.0, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.625, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.75, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.875, 1.0), new k(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A);
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, (n2 & 7) + 1);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        int n3;
        boolean bl2;
        block6: {
            block5: {
                i i3;
                block4: {
                    i i4;
                    bl2 = cL.b();
                    if (aA2 == aA.UP) {
                        return true;
                    }
                    i3 = i4 = t2.d(n2.a(aA2));
                    if (bl2) break block4;
                    if (i3.b() != this) break block5;
                    i3 = i4;
                }
                n3 = i3.b(A);
                if (bl2) break block6;
                if (n3 >= i2.b(A)) return 0 != 0;
            }
            n3 = super.b(i2, t2, n2, aA2) ? 1 : 0;
        }
        if (bl2) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public boolean i(i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = i2.b(A).intValue();
        if (!bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        int n3 = i2.b(A) - 1;
        float f10 = 0.125f;
        k k2 = i2.f(t2, n2);
        return new k(k2.e, k2.b, k2.d, k2.f, (float)n3 * 0.125f, k2.g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        i i2 = z2.d(n2.k());
        K k2 = i2.b();
        boolean bl2 = cL.b();
        K k3 = k2;
        K k4 = g.cF;
        if (!bl2) {
            if (k3 == k4) return false;
            k3 = k2;
            k4 = g.cq;
        }
        if (!bl2) {
            if (k3 == k4) return false;
            k3 = k2;
            k4 = g.ah;
        }
        if (k3 == k4) return false;
        net.minecraft.Z.d d10 = i2.c(z2, n2.k(), aA.UP);
        if (d10 == net.minecraft.Z.d.SOLID) return 1 != 0;
        if (i2.o() == net.minecraft.ac.c.J) return 1 != 0;
        if (k2 != this) return 0 != 0;
        int n3 = i2.b(A);
        if (bl2) return n3 != 0;
        if (n3 != 8) return 0 != 0;
        return 1 != 0;
    }
}

