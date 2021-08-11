/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.am;
import net.minecraft.U.B;
import net.minecraft.ak.i;

class p
extends i {
    @Override
    protected double a(B b10) {
        return 4.0f + b10.ad;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        float f10 = this.k.S();
        int[] arrn = S.f();
        float f11 = f10 - 0.5f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (arrn == null) return (boolean)f12;
        if (f12 >= 0) {
            f12 = this.k.f().nextInt(100);
            if (arrn == null) return (boolean)f12;
            if (f12 == false) {
                this.k.d((B)null);
                return false;
            }
        }
        f12 = (float)super.e();
        return (boolean)f12;
    }

    public p(am am2) {
        super(am2, 1.0, true);
    }
}

