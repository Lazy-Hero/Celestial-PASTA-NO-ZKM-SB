/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.Y;
import net.minecraft.ao.aC;
import net.minecraft.ao.bz;
import net.minecraft.ao.d;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

class aJ
implements d {
    private static gP a(gP gP2) {
        return gP2;
    }

    private aJ() {
    }

    @Override
    public Y a(aA aA2, s s2, Random random) {
        s2.a = true;
        return new aC(aA2, s2, random);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(s s2) {
        String[] arrstring = u.b();
        boolean bl2 = s2.c[aA.WEST.f()];
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = s2.c[aA.EAST.f()];
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = s2.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = s2.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = s2.c[aA.UP.f()];
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    aJ(bz bz2) {
        this();
    }
}

