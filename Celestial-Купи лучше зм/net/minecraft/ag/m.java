/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.U.x;
import net.minecraft.ag.A;
import net.minecraft.ag.P;

class m<T extends x>
extends net.minecraft.ak.m<T> {
    private final /* synthetic */ P m;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String[] arrstring = A.b();
        boolean bl2 = this.m.H();
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = super.c();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public m(P p2, Class<T> class_, float f10, double d10, double d11) {
        super(p2, class_, f10, d10, d11);
        this.m = p2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

