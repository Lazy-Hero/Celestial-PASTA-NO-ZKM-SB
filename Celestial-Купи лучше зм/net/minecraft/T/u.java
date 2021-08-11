/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aN;
import net.minecraft.U.D;
import net.minecraft.ak.au;
import net.minecraft.i.j;

class u
extends au<j> {
    public u(aN aN2) {
        super((D)aN2, j.class, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        boolean bl2 = ((aN)this.e).z();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = super.c();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

