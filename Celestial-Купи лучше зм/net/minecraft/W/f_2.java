/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.y;
import net.minecraft.h.d;
import net.minecraft.w.aA;
import net.minecraft.w.bl;

class f
implements Predicate<y> {
    final /* synthetic */ aA a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable y y2) {
        int n2 = bl.g();
        y y3 = y2;
        if (n2 != 0) {
            if (y3 == null) return false;
            y3 = y2;
        }
        boolean bl2 = y3.aL();
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = y2.f() instanceof d;
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    f(aA aA2) {
        this.a = aA2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

