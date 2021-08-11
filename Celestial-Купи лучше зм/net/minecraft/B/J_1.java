/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.s;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;

class J
extends D {
    final /* synthetic */ s f;

    private static gP a(gP gP2) {
        return gP2;
    }

    J(s s2, a a10, int n2, int n3, int n4) {
        this.f = s2;
        super(a10, n2, n3, n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(d d10) {
        int n2 = n.c();
        d d11 = d10;
        if (n2 == 0) {
            if (d11.w() != h.aL) return false;
            d11 = d10;
        }
        boolean bl2 = d11.d();
        if (n2 != 0) return bl2;
        if (bl.d((int)bl2) != bl.BLUE) return false;
        return true;
    }
}

