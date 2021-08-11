/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.J.G;
import net.minecraft.O.a;
import net.minecraft.O.e;
import net.minecraft.U.b;
import net.minecraft.ah.z;
import net.minecraft.w.d;

final class n
extends e {
    n() {
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }

    @Override
    protected b a(z z2, a a10, d d10) {
        return new G(z2, a10.a(), a10.f(), a10.d());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }
}

