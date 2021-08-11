/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class aW
extends k {
    @Override
    public float a(d d10, i i2) {
        K k2 = i2.b();
        if (k2 != g.dh && i2.o() != c.J) {
            return k2 == g.s ? 5.0f : super.a(d10, i2);
        }
        return 15.0f;
    }

    public aW() {
        this.b(1);
        this.d(238);
        this.a(net.minecraft.ad.a.d);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, z z2, i i2, n n2, B b10) {
        int n3 = bl.g();
        if (!z2.C) {
            d10.a(1, b10);
        }
        K k2 = i2.b();
        if (i2.o() == c.J) return true;
        K k3 = k2;
        if (n3 != 0) {
            if (k3 == g.dh) return true;
            k3 = k2;
        }
        K k4 = g.dc;
        if (n3 != 0) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.aW;
        }
        if (n3 != 0) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.cM;
        }
        if (n3 != 0) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.s;
        }
        if (k3 == k4) return true;
        boolean bl2 = super.a(d10, z2, i2, n2, b10);
        if (n3 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(i i2) {
        K k2 = i2.b();
        int n2 = bl.c();
        K k3 = k2;
        if (n2 == 0) {
            if (k3 == g.dh) return true;
            k3 = k2;
        }
        K k4 = g.bK;
        if (n2 == 0) {
            if (k3 == k4) return true;
            K k4 = k2;
            k4 = g.cM;
        }
        if (k3 != k4) return false;
        return true;
    }
}

