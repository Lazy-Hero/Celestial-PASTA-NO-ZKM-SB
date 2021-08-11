/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.I;

final class s
extends d {
    private final /* synthetic */ d c;

    private static gP a(gP gP2) {
        return gP2;
    }

    s() {
        this.c = new d();
    }

    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        I i3 = (I)d10.w();
        n n2 = i2.e().a(i2.b().b(a3.C));
        return i3.a(null, i2.a(), n2) ? new net.minecraft.w.d(h.P) : this.c.a(i2, d10);
    }
}

