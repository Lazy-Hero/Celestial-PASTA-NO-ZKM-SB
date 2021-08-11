/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.z;

import net.minecraft.client.z.c;
import net.minecraft.client.z.m;
import net.minecraft.w.d;

final class i
implements c {
    i() {
    }

    @Override
    public int a(d d10, int n2) {
        int n3 = m.d();
        int n4 = n2;
        if (n3 == 0) {
            n4 = n4 > 0 ? -1 : ((net.minecraft.w.m)d10.w()).c(d10);
        }
        return n4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

