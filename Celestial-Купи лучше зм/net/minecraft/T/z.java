/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aT;
import net.minecraft.U.B;
import net.minecraft.ak.au;

class z
extends au<B> {
    public z(aT aT2) {
        super(aT2, B.class, 0, true, true, aT.g());
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        boolean bl2 = aT.a((aT)this.e);
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = super.c();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

