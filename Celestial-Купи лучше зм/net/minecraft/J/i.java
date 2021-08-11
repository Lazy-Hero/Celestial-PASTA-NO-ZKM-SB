/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.B;
import net.minecraft.N.p;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.k.n;

class i
extends p {
    final /* synthetic */ B m;

    @Override
    public void a(int n2) {
        this.m.aG.a((x)this.m, (byte)n2);
    }

    i(B b10) {
        this.m = b10;
    }

    @Override
    public z c() {
        return this.m.aG;
    }

    @Override
    public n h() {
        return new n(this.m);
    }
}

