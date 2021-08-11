/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.ai;
import net.minecraft.T.f;
import net.minecraft.ak.h;
import net.minecraft.u.c;

class N
extends h {
    private final /* synthetic */ ai d;
    private /* synthetic */ float e;
    private /* synthetic */ int c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public N(ai ai2) {
        this.d = ai2;
        this.a(2);
    }

    @Override
    public void b() {
        int[] arrn = S.f();
        N n2 = this;
        if (arrn != null) {
            if (--n2.c <= 0) {
                this.c = 40 + this.d.f().nextInt(60);
                this.e = this.d.f().nextInt(360);
            }
            n2 = this;
        }
        ((f)n2.d.w()).a(this.e, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        ai ai2 = this.d;
        if (arrn != null) {
            if (ai2.J() != null) return false;
            ai2 = this.d;
        }
        boolean bl2 = ai2.A;
        if (arrn == null) return bl2;
        if (bl2) return true;
        bl2 = this.d.aj();
        if (arrn == null) return bl2;
        if (bl2) return true;
        bl2 = this.d.av();
        if (arrn == null) return bl2;
        if (bl2) return true;
        bl2 = this.d.c(net.minecraft.u.c.m);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

