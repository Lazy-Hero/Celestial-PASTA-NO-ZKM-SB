/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.v;
import net.minecraft.u.h;
import net.minecraft.w.d;

class K
extends D {
    final /* synthetic */ net.minecraft.ag.D f;
    final /* synthetic */ v g;

    private static gP a(gP gP2) {
        return gP2;
    }

    K(v v2, a a10, int n2, int n3, int n4, net.minecraft.ag.D d10) {
        this.g = v2;
        this.f = d10;
        super(a10, n2, n3, n4);
    }

    @Override
    public boolean e() {
        return this.f.al();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(d d10) {
        int n2 = n.c();
        if (d10.w() != h.be) return false;
        boolean bl2 = this.b();
        if (n2 == 0) {
            if (bl2) return false;
            bl2 = this.f.al();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }
}

