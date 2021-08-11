/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.o;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

class E
extends D {
    final /* synthetic */ o f;

    public E(o o2, a a10, int n2, int n3, int n4) {
        this.f = o2;
        super(a10, n2, n3, n4);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(d d10) {
        k k2 = d10.w();
        int n2 = n.b();
        k k3 = k2;
        k k4 = h.aO;
        if (n2 != 0) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = h.ag;
        }
        if (n2 != 0) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = h.I;
        }
        if (n2 != 0) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = h.ad;
        }
        if (k3 != k4) return false;
        return true;
    }
}

