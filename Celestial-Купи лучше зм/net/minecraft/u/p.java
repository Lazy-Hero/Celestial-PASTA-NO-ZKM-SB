/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.a;
import net.minecraft.U.b;
import net.minecraft.ah.z;
import net.minecraft.u.e;
import net.minecraft.w.d;
import net.minecraft.z.t;

class p
extends net.minecraft.O.e {
    final /* synthetic */ d c;
    final /* synthetic */ e d;

    p(e e10, d d10) {
        this.d = e10;
        this.c = d10;
    }

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
}

