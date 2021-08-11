/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.O;

import net.minecraft.O.a;
import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.U.b;
import net.minecraft.U.x;
import net.minecraft.W.a3;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.m;

public abstract class e
extends d {
    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        z z2 = i2.a();
        a a10 = a3.a(i2);
        aA aA2 = i2.b().b(a3.C);
        boolean bl2 = d.c();
        b b10 = this.a(z2, a10, d10);
        b10.a(aA2.r(), (float)aA2.p() + 0.1f, aA2.i(), this.b(), this.a());
        z2.f((x)((Object)b10));
        boolean bl3 = bl2;
        d10.b(1);
        if (m.c()) {
            d.b(!bl3);
        }
        return d10;
    }

    protected float b() {
        return 1.1f;
    }

    protected abstract b a(z var1, a var2, net.minecraft.w.d var3);

    protected float a() {
        return 6.0f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(i i2) {
        i2.a().b(1002, i2.e(), 0);
    }
}

