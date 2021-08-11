/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.at;
import net.minecraft.U.B;
import net.minecraft.ar.b;
import net.minecraft.client.C.z;
import net.minecraft.client.r.N;
import net.minecraft.client.r.s;
import net.minecraft.client.w.M;

class am
extends z {
    final /* synthetic */ N b;

    @Override
    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block0: {
            if (!((at)b10).f()) break block0;
            super.a(b10, f10, f11, f12, f13, f14, f15, f16);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(b b10) {
        ((M)this.a.b()).a(b10).a(0.0625f);
    }

    am(N n2, s s2) {
        this.b = n2;
        super(s2);
    }
}

