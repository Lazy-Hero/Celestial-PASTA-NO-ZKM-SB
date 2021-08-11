/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.z;

import net.minecraft.K.k;
import net.minecraft.client.z.c;
import net.minecraft.client.z.m;
import net.minecraft.w.d;

final class j
implements c {
    private static gP a(gP gP2) {
        return gP2;
    }

    j() {
    }

    @Override
    public int a(d d10, int n2) {
        int n3 = m.b();
        int n4 = n2;
        if (n3 != 0) {
            n4 = n4 == 0 ? k.b(d10) : -1;
        }
        return n4;
    }
}

