/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.J.s;
import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.ar.aA;

final class q
extends d {
    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        aA aA2 = i2.b().b(a3.C);
        double d11 = i2.a() + (double)aA2.r();
        double d12 = (float)i2.e().b() + 0.2f;
        double d13 = i2.d() + (double)aA2.i();
        s s2 = new s(i2.a(), d11, d12, d13, d10);
        i2.a().f(s2);
        d10.b(1);
        return d10;
    }

    @Override
    protected void a(i i2) {
        i2.a().b(1004, i2.e(), 0);
    }

    q() {
    }
}

