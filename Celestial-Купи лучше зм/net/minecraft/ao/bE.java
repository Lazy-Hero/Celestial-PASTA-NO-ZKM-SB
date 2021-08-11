/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.Y;
import net.minecraft.ao.aw;
import net.minecraft.ao.bz;
import net.minecraft.ao.d;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

class bE
implements d {
    private bE() {
    }

    bE(bz bz2) {
        this();
    }

    @Override
    public Y a(aA aA2, s s2, Random random) {
        s2.a = true;
        s2.f[aA.NORTH.f()].a = true;
        s2.f[aA.UP.f()].a = true;
        s2.f[aA.NORTH.f()].f[aA.UP.f()].a = true;
        return new aw(aA2, s2, random);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(s s2) {
        String[] arrstring = u.b();
        boolean bl2 = s2.c[aA.NORTH.f()];
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = s2.f[aA.NORTH.f()].a;
        if (arrstring == null) return bl2;
        if (bl2) return false;
        bl2 = s2.c[aA.UP.f()];
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = s2.f[aA.UP.f()].a;
        if (arrstring == null) return bl2;
        if (bl2) return false;
        s s3 = s2.f[aA.NORTH.f()];
        boolean bl3 = s3.c[aA.UP.f()];
        if (arrstring != null) {
            if (!bl3) return false;
            bl3 = s3.f[aA.UP.f()].a;
        }
        if (arrstring == null) return bl3;
        if (bl3) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

