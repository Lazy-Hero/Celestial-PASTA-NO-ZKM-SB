/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.E.s;
import net.minecraft.U.x;
import net.minecraft.k.k;
import net.minecraft.k.m;

final class a
implements Predicate<x> {
    final /* synthetic */ k a;

    a(k k2) {
        this.a = k2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        m[] arrm = s.b();
        if (x2 == null) return false;
        boolean bl2 = this.a.c(x2.m());
        if (arrm == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

