/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.P.r;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.aw.w;

final class v
implements g {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(c c10, r r2, int n2) {
        String[] arrstring = w.d();
        r r3 = r2;
        if (arrstring != null) {
            if (r3.a("Player", 10)) {
                r2.a("Player", c10.a(f.PLAYER, r2.h("Player"), n2));
            }
            r3 = r2;
        }
        return r3;
    }

    v() {
    }
}

