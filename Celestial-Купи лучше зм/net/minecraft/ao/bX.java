/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.Y;
import net.minecraft.ao.Z;
import net.minecraft.ao.bz;
import net.minecraft.ao.d;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

class bX
implements d {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(s s2) {
        String[] arrstring = u.b();
        boolean bl2 = s2.c[aA.EAST.f()];
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = s2.f[aA.EAST.f()].a;
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    private bX() {
    }

    bX(bz bz2) {
        this();
    }

    @Override
    public Y a(aA aA2, s s2, Random random) {
        s2.a = true;
        s2.f[aA.EAST.f()].a = true;
        return new Z(aA2, s2, random);
    }
}

