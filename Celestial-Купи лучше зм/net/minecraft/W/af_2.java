/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.O.i;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.m;

final class af
extends net.minecraft.O.d {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected d b(i i2, d d10) {
        d d11 = m.a(i2, d10);
        int n2 = bl.c();
        d d12 = d11;
        if (n2 == 0) {
            d12 = d12.G() ? super.b(i2, d10) : d11;
        }
        return d12;
    }

    af() {
    }
}

