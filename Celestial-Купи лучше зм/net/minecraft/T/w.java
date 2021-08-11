/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aF;
import net.minecraft.U.D;
import net.minecraft.ah.e;
import net.minecraft.ak.au;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.k;

class w
extends au<j> {
    final /* synthetic */ aF p;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        w w2 = this;
        if (arrn != null) {
            if (w2.p.aG.g() == net.minecraft.ah.e.PEACEFUL) return false;
            w2 = this;
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

    public w(aF aF2, aF aF3) {
        this.p = aF2;
        super((D)aF3, j.class, true);
    }
}

