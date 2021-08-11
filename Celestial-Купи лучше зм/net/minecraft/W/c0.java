/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.W.cL;

final class c0
implements Predicate<cL> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable cL cL2) {
        boolean bl2 = cL.e();
        cL cL3 = cL2;
        cL cL4 = cL.NORTH_EAST;
        if (bl2) {
            if (cL3 == cL4) return false;
            cL3 = cL2;
            cL4 = cL.NORTH_WEST;
        }
        if (bl2) {
            if (cL3 == cL4) return false;
            cL3 = cL2;
            cL4 = cL.SOUTH_EAST;
        }
        if (bl2) {
            if (cL3 == cL4) return false;
            cL3 = cL2;
            cL4 = cL.SOUTH_WEST;
        }
        if (cL3 == cL4) return false;
        return true;
    }

    c0() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

