/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.ad.a;
import net.minecraft.ar.a3;
import net.minecraft.i.j;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class at
extends k {
    public at() {
        this.a(net.minecraft.ad.a.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, j j2, B b10, a3 a32) {
        int n2 = bl.c();
        boolean bl2 = d10.c();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        bl2 = b10 instanceof j;
        if (n2 != 0) return bl2;
        if (bl2) return false;
        b10.a(d10.g());
        boolean bl3 = b10 instanceof C;
        if (n2 != 0) return bl3;
        if (bl3) {
            ((C)b10).A();
        }
        d10.b(1);
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

