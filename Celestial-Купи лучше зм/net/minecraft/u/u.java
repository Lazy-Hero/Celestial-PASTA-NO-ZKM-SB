/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.J.D;
import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.k.n;
import net.minecraft.u.E;

final class u
extends d {
    @Override
    protected net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        z z2 = i2.a();
        n n2 = i2.e().a(i2.b().b(a3.C));
        D d11 = new D(z2, (double)n2.e() + 0.5, n2.b(), (double)n2.a() + 0.5, null);
        z2.f(d11);
        z2.a(null, d11.a, d11.aF, d11.ax, E.ei, ay.BLOCKS, 1.0f, 1.0f);
        d10.b(1);
        return d10;
    }

    u() {
    }
}

