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
import net.minecraft.U.B;
import net.minecraft.U.x;

final class al
implements Predicate<x> {
    al() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int[] arrn = S.f();
        boolean bl2 = x2 instanceof B;
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = ((B)x2).aF();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

