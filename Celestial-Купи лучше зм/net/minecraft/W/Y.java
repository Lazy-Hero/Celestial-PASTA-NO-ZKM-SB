/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class Y
extends K {
    protected static final /* synthetic */ k z;

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(i i2) {
        boolean bl2 = cL.b();
        K k3 = i2.b();
        k3 = g.aU;
        if (!bl2) {
            if (k2 == k3) return true;
            K k3 = i2.b();
            k3 = g.bv;
        }
        if (!bl2) {
            if (k2 == k3) return true;
            K k3 = i2.b();
            k3 = g.cU;
        }
        if (k2 != k3) return false;
        return true;
    }

    protected Y() {
        this(net.minecraft.ac.c.f);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    protected Y(c c10, net.minecraft.ac.a a10) {
        super(c10, a10);
        this.a(true);
        this.a(net.minecraft.ad.a.j);
    }

    public boolean a(z z2, n n2, i i2) {
        return this.a(z2.d(n2.k()));
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        super.a(i2, z2, n2, k2, n3);
        this.c(z2, n2, i2);
    }

    protected Y(c c10) {
        this(c10, c10.a());
    }

    @Override
    public boolean p(i i2) {
        return false;
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
            bl3 = this.a(z2.d(n2.k()));
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        this.c(z2, n2, i2);
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    protected void c(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.a(z2, n2, i2);
        if (bl2 && !bl3) {
            this.a(z2, n2, i2, 0);
            bl3 = z2.a(n2, g.bf.d(), 3);
        }
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    static {
        z = new k(0.3f, 0.0, 0.3f, 0.7f, 0.6f, 0.7f);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }
}

