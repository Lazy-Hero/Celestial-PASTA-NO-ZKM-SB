/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import java.util.Random;
import net.minecraft.O.a;
import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.m;
import net.minecraft.u.f;

final class r
extends d {
    r() {
    }

    @Override
    protected void a(i i2) {
        i2.a().b(1018, i2.e(), 0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        aA aA2 = i2.b().b(a3.C);
        a a10 = a3.a(i2);
        double d11 = a10.a() + (double)((float)aA2.r() * 0.3f);
        double d12 = a10.f() + (double)((float)aA2.p() * 0.3f);
        double d13 = a10.d() + (double)((float)aA2.i() * 0.3f);
        z z2 = i2.a();
        boolean bl2 = f.a();
        Random random = z2.J;
        double d14 = random.nextGaussian() * 0.05 + (double)aA2.r();
        double d15 = random.nextGaussian() * 0.05 + (double)aA2.p();
        double d16 = random.nextGaussian() * 0.05 + (double)aA2.i();
        z2.f(new net.minecraft.z.m(z2, d11, d12, d13, d14, d15, d16));
        d10.b(1);
        if (m.c()) {
            f.b(!bl2);
        }
        return d10;
    }
}

