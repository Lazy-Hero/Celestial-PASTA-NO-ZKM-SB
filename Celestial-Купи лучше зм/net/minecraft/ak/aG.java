/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ak.X;
import net.minecraft.ak.h;
import net.minecraft.ak.t;

class aG
implements Predicate<B> {
    final /* synthetic */ t a;

    private static gP a(gP gP2) {
        return gP2;
    }

    aG(t t2) {
        this.a = t2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable B b10) {
        double d10 = this.a.a();
        String string = h.h();
        boolean bl2 = b10.a4();
        if (string == null) {
            if (bl2) {
                d10 *= (double)0.8f;
            }
            bl2 = b10.a3();
        }
        if (string == null) {
            if (bl2) {
                return false;
            }
            double d11 = (double)b10.o(t.a(this.a)) - d10;
            bl2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (bl2 > false) return false;
            bl2 = X.a(t.a(this.a), b10, false, true);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

