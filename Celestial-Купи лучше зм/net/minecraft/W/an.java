/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.h;

public class an
extends K {
    protected static final /* synthetic */ k[] A;
    public static final /* synthetic */ f z;

    @Override
    public int b(i i2, z z2, n n2) {
        return (7 - i2.b(z)) * 2;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    private boolean a(z z2, n n2, i i2, j j2) {
        block5: {
            int n3;
            block6: {
                int n4;
                boolean bl2 = cL.e();
                int n5 = j2.b(false);
                if (bl2) {
                    if (n5 == 0) {
                        return false;
                    }
                    j2.b(net.minecraft.l.m.t);
                    j2.S().a(2, 0.1f);
                    n5 = i2.b(z);
                }
                n3 = n4 = n5;
                if (!bl2) break block5;
                if (n3 >= 6) break block6;
                z2.a(n2, i2.a(z, n4 + 1), 3);
                if (bl2) break block5;
            }
            n3 = z2.v(n2) ? 1 : 0;
        }
        return true;
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    static {
        z = f.a("bites", 0, 6);
        A = new k[]{new k(0.0625, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new k(0.1875, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new k(0.3125, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new k(0.4375, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new k(0.5625, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new k(0.6875, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new k(0.8125, 0.0, 0.0625, 0.9375, 0.5, 0.9375)};
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(net.minecraft.u.h.aW);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.C;
        if (bl2) return bl3;
        if (!bl3) {
            bl3 = this.a(z2, n2, i2, j2);
            return bl3;
        }
        net.minecraft.w.d d10 = j2.c(a32);
        boolean bl4 = this.a(z2, n2, i2, j2);
        if (bl2) return bl4;
        if (bl4) return true;
        bl4 = d10.G();
        if (bl2) return bl4;
        if (!bl4) return false;
        return true;
    }

    protected an() {
        super(net.minecraft.ac.c.F);
        this.h(this.e.a().a(z, 0));
        this.a(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = super.a(z2, n2);
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.b(z2, n2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private boolean b(z z2, n n2) {
        return z2.d(n2.k()).o().d();
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(z2, n2);
        if (!bl2 && !bl3) {
            bl3 = z2.v(n2);
        }
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A[i2.b(z)];
    }
}

