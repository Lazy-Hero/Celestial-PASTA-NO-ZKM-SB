/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.z;

import net.minecraft.U.h;
import net.minecraft.U.q;
import net.minecraft.client.z.c;
import net.minecraft.client.z.m;
import net.minecraft.w.aG;
import net.minecraft.w.d;

final class r
implements c {
    @Override
    public int a(d d10, int n2) {
        q q2 = h.g.get(aG.a(d10));
        int n3 = m.b();
        if (q2 == null) {
            return -1;
        }
        int n4 = n2;
        if (n3 != 0) {
            n4 = n4 == 0 ? q2.d : q2.a;
        }
        return n4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    r() {
    }
}

