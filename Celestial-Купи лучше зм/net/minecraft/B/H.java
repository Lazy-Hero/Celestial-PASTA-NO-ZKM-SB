/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.K.i;
import net.minecraft.K.k;
import net.minecraft.a6;
import net.minecraft.i.j;
import net.minecraft.u.h;
import net.minecraft.w.d;

class H
extends D {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public d a(j j2, d d10) {
        i i2 = k.d(d10);
        int n2 = n.c();
        if (n2 == 0) {
            if (j2 instanceof net.minecraft.i.k) {
                a6.p.a((net.minecraft.i.k)j2, i2);
            }
            super.a(j2, d10);
        }
        return d10;
    }

    @Override
    public int a() {
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(d d10) {
        net.minecraft.w.k k2 = d10.w();
        int n2 = n.b();
        net.minecraft.w.k k4 = k2;
        k4 = h.V;
        if (n2 != 0) {
            if (k3 == k4) return true;
            net.minecraft.w.k k4 = k2;
            k4 = h.b3;
        }
        if (n2 != 0) {
            if (k3 == k4) return true;
            net.minecraft.w.k k4 = k2;
            k4 = h.W;
        }
        if (n2 != 0) {
            if (k3 == k4) return true;
            net.minecraft.w.k k4 = k2;
            k4 = h.ch;
        }
        if (k3 != k4) return false;
        return true;
    }

    public H(a a10, int n2, int n3, int n4) {
        super(a10, n2, n3, n4);
    }

    @Override
    public boolean d(d d10) {
        return H.a(d10);
    }
}

