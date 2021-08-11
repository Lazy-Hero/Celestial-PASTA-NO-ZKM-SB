/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.a;
import net.minecraft.O.e;
import net.minecraft.U.b;
import net.minecraft.ah.z;
import net.minecraft.u.D;
import net.minecraft.w.d;
import net.minecraft.z.t;

class o
extends e {
    final /* synthetic */ D d;
    final /* synthetic */ d c;

    @Override
    protected b a(z z2, a a10, d d10) {
        return new t(z2, a10.a(), a10.f(), a10.d(), this.c.C());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }

    o(D d10, d d11) {
        this.d = d10;
        this.c = d11;
    }
}

