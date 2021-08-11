/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.ax.T;
import net.minecraft.ax.h;
import net.minecraft.w.k;

final class i
extends h {
    @Override
    public boolean a(k k2) {
        h[] arrh = h.values();
        String[] arrstring = T.b();
        int n2 = arrh.length;
        int n3 = 0;
        while (n3 < n2) {
            block3: {
                block4: {
                    boolean bl2;
                    block5: {
                        h h2 = arrh[n3];
                        if (arrstring != null) break block3;
                        if (h2 == h.ALL) break block4;
                        bl2 = h2.a(k2);
                        if (arrstring != null) break block5;
                        if (!bl2) break block4;
                        bl2 = true;
                    }
                    return bl2;
                }
                ++n3;
            }
            if (arrstring == null) continue;
        }
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

