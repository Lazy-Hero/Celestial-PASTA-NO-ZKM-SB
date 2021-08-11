/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.z;

import net.minecraft.W.d2;
import net.minecraft.ah.q;
import net.minecraft.client.z.c;
import net.minecraft.client.z.m;
import net.minecraft.w.d;

final class u
implements c {
    private static gP a(gP gP2) {
        return gP2;
    }

    u() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(d d10, int n2) {
        block5: {
            d2 d22;
            d2 d23;
            block4: {
                d2 d24 = d2.a(d10.d());
                int n3 = m.b();
                d23 = d24;
                d22 = d2.GRASS;
                if (n3 == 0) break block4;
                if (d23 == d22) break block5;
                d23 = d24;
                d22 = d2.FERN;
            }
            if (d23 != d22) {
                return -1;
            }
        }
        int n4 = q.a(0.5, 1.0);
        return n4;
    }
}

