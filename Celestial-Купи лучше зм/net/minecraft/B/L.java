/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.v;
import net.minecraft.w.d;

class L
extends D {
    final /* synthetic */ v g;
    final /* synthetic */ net.minecraft.ag.D f;

    L(v v2, a a10, int n2, int n3, int n4, net.minecraft.ag.D d10) {
        this.g = v2;
        this.f = d10;
        super(a10, n2, n3, n4);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean e() {
        return this.f.E();
    }

    @Override
    public boolean d(d d10) {
        return this.f.c(d10);
    }
}

