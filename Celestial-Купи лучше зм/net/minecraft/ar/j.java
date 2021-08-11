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

final class j
implements Predicate<x> {
    j() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int n2 = v.b();
        boolean bl2 = x2 instanceof net.minecraft.i.j;
        if (n2 != 0) return bl2;
        if (!bl2) return true;
        bl2 = ((net.minecraft.i.j)x2).ae();
        if (n2 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

