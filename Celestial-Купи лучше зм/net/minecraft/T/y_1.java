/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.am;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ak.au;

class y<T extends B>
extends au<T> {
    public y(am am2, Class<T> class_) {
        super((D)am2, class_, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean c() {
        float f10;
        block5: {
            int[] arrn;
            block4: {
                float f11 = this.e.S();
                arrn = S.f();
                float f12 = f11 - 0.5f;
                f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (arrn == null) break block4;
                if (f10 >= 0) break block5;
                f10 = (float)super.c();
            }
            if (arrn == null) return (boolean)f10;
            if (f10 != false) {
                f10 = 1.0f;
                return (boolean)f10;
            }
        }
        f10 = 0.0f;
        return (boolean)f10;
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

