/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.Z;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.h;

public class a1
extends Z {
    private static final /* synthetic */ k[] C;

    static {
        C = new k[]{new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)};
    }

    @Override
    protected net.minecraft.w.k c() {
        return net.minecraft.u.h.aG;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return C[i2.b(this.a())];
    }

    @Override
    protected net.minecraft.w.k d() {
        return net.minecraft.u.h.aG;
    }
}

