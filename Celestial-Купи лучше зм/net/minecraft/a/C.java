/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.Q.E;
import net.minecraft.Q.I;
import net.minecraft.V.a;
import net.minecraft.V.b;
import net.minecraft.a.k;

class C
implements b {
    final /* synthetic */ k a;

    @Override
    public void c(a a10, double d10) {
    }

    @Override
    public void b(a a10, double d10) {
        this.a.a(new I(a10, E.SET_SIZE));
    }

    @Override
    public void a(a a10, double d10) {
    }

    @Override
    public void a(a a10, double d10, double d11) {
        this.a.a(new I(a10, E.SET_CENTER));
    }

    @Override
    public void b(a a10, int n2) {
        this.a.a(new I(a10, E.SET_WARNING_TIME));
    }

    @Override
    public void a(a a10, double d10, double d11, long l2) {
        this.a.a(new I(a10, E.LERP_SIZE));
    }

    @Override
    public void a(a a10, int n2) {
        this.a.a(new I(a10, E.SET_WARNING_BLOCKS));
    }

    C(k k2) {
        this.a = k2;
    }
}

