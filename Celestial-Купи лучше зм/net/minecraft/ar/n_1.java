/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.ar.v;

final class n
implements Predicate<x> {
    n() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int n2 = v.b();
        boolean bl2 = x2.aL();
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = x2.aU();
        }
        if (n2 == 0) {
            if (bl2) return false;
            bl2 = x2.N();
        }
        if (n2 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

