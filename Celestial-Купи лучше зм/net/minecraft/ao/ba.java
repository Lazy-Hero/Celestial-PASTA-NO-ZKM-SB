/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.bC;
import net.minecraft.ao.u;

final class ba
extends bC {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2) {
        String[] arrstring = u.b();
        int n3 = super.a(n2);
        if (arrstring != null) {
            if (n3 == 0) return 0 != 0;
            n3 = n2;
        }
        if (arrstring == null) return n3 != 0;
        if (n3 <= 4) return 0 != 0;
        return 1 != 0;
    }

    ba(Class class_, int n2, int n3) {
        super(class_, n2, n3);
    }
}

