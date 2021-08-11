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
import net.minecraft.U.x;
import net.minecraft.ag.A;
import net.minecraft.ag.P;
import net.minecraft.ag.Q;
import net.minecraft.ag.V;

class av
implements Predicate<x> {
    final /* synthetic */ V a;

    private static gP a(gP gP2) {
        return gP2;
    }

    av(V v2) {
        this.a = v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        String[] arrstring = A.b();
        boolean bl2 = x2 instanceof Q;
        if (arrstring == null) return bl2;
        if (bl2) return true;
        bl2 = x2 instanceof P;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

