/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.N.M;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class Q
extends D {
    @Override
    public int c(d d10) {
        int n2 = n.b();
        int n3 = Q.a(d10);
        if (n2 != 0) {
            n3 = n3 != 0 ? 1 : super.c(d10);
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(d d10) {
        int n2 = n.c();
        boolean bl2 = M.c(d10);
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = Q.a(d10);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static boolean a(d d10) {
        return d10.w() == h.P;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Q(a a10, int n2, int n3, int n4) {
        super(a10, n2, n3, n4);
    }
}

