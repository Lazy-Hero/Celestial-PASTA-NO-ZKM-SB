/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.ax;
import net.minecraft.W.b9;
import net.minecraft.W.cL;
import net.minecraft.W.da;
import net.minecraft.W.u;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class b7
extends K {
    protected static final /* synthetic */ k z;

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.e();
        boolean bl3 = net.minecraft.W.u.a[aA2.ordinal()];
        if (!bl2) return bl3;
        switch (bl3) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                i i3 = t2.d(n2.a(aA2));
                K k2 = i3.b();
                if (i3.i()) return false;
                K k3 = k2;
                K k4 = g.cU;
                if (bl2) {
                    if (k3 == k4) return false;
                    k3 = k2;
                    k4 = g.ci;
                }
                if (k3 == k4) return false;
                return true;
            }
        }
        bl3 = super.b(i2, t2, n2, aA2);
        return bl3;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return g.bv.a(g.bv.d().a(ax.A, da.DIRT), random, n2);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        super.a(i2, z2, n2, k2, n3);
        this.a(z2, n2);
    }

    protected b7() {
        super(net.minecraft.ac.c.q);
        this.d(255);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? d.SOLID : d.UNDEFINED;
    }

    static {
        z = new k(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);
    }

    @Override
    public void b(z z2, n n2, i i2) {
        super.b(z2, n2, i2);
        this.a(z2, n2);
    }

    private void a(z z2, n n2) {
        block3: {
            n n3;
            z z3;
            block2: {
                boolean bl2 = cL.e();
                z3 = z2;
                n3 = n2.a();
                if (!bl2) break block2;
                if (!z3.d(n3).o().d()) break block3;
                z3 = z2;
                n3 = n2;
            }
            b9.c(z3, n3);
        }
    }
}

