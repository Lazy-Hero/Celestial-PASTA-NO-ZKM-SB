/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.am;

import java.util.List;
import net.minecraft.J.p;
import net.minecraft.P.r;
import net.minecraft.ah.A;
import net.minecraft.am.a;
import net.minecraft.am.g;
import net.minecraft.k.n;

final class b
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(A a10, g g10, List<p> list, int n2, n n3) {
        block2: {
            n n4 = new n(0, 128, 0);
            boolean bl2 = r.b();
            for (p p2 : list) {
                p2.b(n4);
                if (bl2) {
                    if (bl2) continue;
                }
                break block2;
            }
            g10.a(PREPARING_TO_SUMMON_PILLARS);
        }
    }
}

