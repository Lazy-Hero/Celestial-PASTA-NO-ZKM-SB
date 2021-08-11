/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aH;
import net.minecraft.ak.P;

class q
extends P {
    final /* synthetic */ aH h;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        boolean bl2;
        int[] arrn;
        block2: {
            block3: {
                arrn = S.f();
                bl2 = this.h.Q();
                if (arrn == null) break block2;
                if (bl2) break block3;
                bl2 = this.h.p();
                if (arrn == null) break block2;
                if (!bl2) return false;
            }
            bl2 = super.c();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public q(aH aH2) {
        this.h = aH2;
        super(aH2, 2.0);
    }
}

