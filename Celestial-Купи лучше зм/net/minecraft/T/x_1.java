/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aF;
import net.minecraft.T.i;
import net.minecraft.U.B;
import net.minecraft.ak.au;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.k.k;

class x
extends au<B> {
    public x(aF aF2) {
        super(aF2, B.class, 10, true, false, new i());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        x x2 = this;
        if (arrn != null) {
            if (x2.e.aM() == null) return false;
            x2 = this;
        }
        boolean bl2 = super.c();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    protected k a(double d10) {
        aA aA2 = ((aF)this.e).c();
        int[] arrn = S.f();
        Q q2 = aA2.g();
        Q q3 = Q.X;
        if (arrn != null) {
            if (q2 == q3) {
                return this.e.m().a(4.0, d10, d10);
            }
            q2 = aA2.g();
            q3 = Q.Z;
        }
        return q2 == q3 ? this.e.m().a(d10, d10, 4.0) : this.e.m().a(d10, 4.0, d10);
    }
}

