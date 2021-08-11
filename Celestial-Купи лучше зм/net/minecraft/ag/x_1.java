/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.ag.A;
import net.minecraft.ag.D;

final class x
implements Predicate<net.minecraft.U.x> {
    x() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable net.minecraft.U.x x2) {
        String[] arrstring = A.b();
        boolean bl2 = x2 instanceof D;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = ((D)x2).ad();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

