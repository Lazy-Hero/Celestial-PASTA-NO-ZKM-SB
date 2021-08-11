/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public abstract class b
extends a {
    public b(boolean bl2) {
        super(bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(K k2) {
        c c10 = k2.d().o();
        boolean bl2 = a.d();
        c c12 = c10;
        c12 = c.A;
        if (!bl2) {
            if (c11 == c12) return true;
            c c12 = c10;
            c12 = c.J;
        }
        if (c11 == c12) return true;
        K k4 = k2;
        k4 = g.aU;
        if (!bl2) {
            if (k3 == k4) return true;
            K k4 = k2;
            k4 = g.bv;
        }
        if (!bl2) {
            if (k3 == k4) return true;
            K k4 = k2;
            k4 = g.bu;
        }
        if (!bl2) {
            if (k3 == k4) return true;
            K k4 = k2;
            k4 = g.aB;
        }
        if (!bl2) {
            if (k3 == k4) return true;
            K k4 = k2;
            k4 = g.dj;
        }
        if (!bl2) {
            if (k3 == k4) return true;
            K k4 = k2;
            k4 = g.aW;
        }
        if (k3 != k4) return false;
        return true;
    }

    public void a(z z2, Random random, n n2) {
    }

    protected void a(z z2, n n2) {
        block0: {
            if (z2.d(n2).b() == g.bv) break block0;
            this.a(z2, n2, g.bv.d());
        }
    }

    private static gP d(gP gP2) {
        return gP2;
    }
}

