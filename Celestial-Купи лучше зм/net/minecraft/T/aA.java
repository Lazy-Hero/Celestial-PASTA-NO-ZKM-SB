/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.T.S;
import net.minecraft.T.a_;
import net.minecraft.i.k;

class aA
implements Predicate<k> {
    final /* synthetic */ a_ a;

    aA(a_ a_2) {
        this.a = a_2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(@Nullable k k2) {
        double d10;
        block5: {
            int[] arrn;
            block4: {
                arrn = S.f();
                double d11 = this.a.s(k2) - 2500.0;
                d10 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                if (arrn == null) break block4;
                if (d10 >= 0) break block5;
                d10 = (double)k2.c7.c();
            }
            if (arrn == null) return (boolean)d10;
            if (d10 != false) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }
}

