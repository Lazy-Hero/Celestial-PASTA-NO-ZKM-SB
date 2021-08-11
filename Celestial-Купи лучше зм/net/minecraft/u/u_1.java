/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.P.r;
import net.minecraft.U.M;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.av.g;

final class u
implements g {
    private static gP a(gP gP2) {
        return gP2;
    }

    u() {
    }

    @Override
    public r a(c c10, r r2, int n2) {
        int[] arrn = M.b();
        r r3 = r2;
        if (arrn != null) {
            if (r3.a("Passengers", 9)) {
                net.minecraft.P.u u2 = r2.c("Passengers", 10);
                for (int i2 = 0; i2 < u2.b(); ++i2) {
                    u2.a(i2, c10.a(f.ENTITY, u2.d(i2), n2));
                    if (arrn != null) continue;
                }
            }
            r3 = r2;
        }
        return r3;
    }
}

