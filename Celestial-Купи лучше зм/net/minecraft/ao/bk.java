/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.Y;
import net.minecraft.ao.a1;
import net.minecraft.ao.bz;
import net.minecraft.ao.d;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

class bk
implements d {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(s s2) {
        String[] arrstring = u.b();
        boolean bl2 = s2.c[aA.UP.f()];
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = s2.f[aA.UP.f()].a;
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public Y a(aA aA2, s s2, Random random) {
        s2.a = true;
        s2.f[aA.UP.f()].a = true;
        return new a1(aA2, s2, random);
    }

    bk(bz bz2) {
        this();
    }

    private bk() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

