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
import net.minecraft.U.C;
import net.minecraft.U.h;
import net.minecraft.ag.A;
import net.minecraft.ag.U;

final class a
implements Predicate<C> {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable C c10) {
        String[] arrstring = A.b();
        if (c10 == null) return false;
        boolean bl2 = U.a().containsKey(h.a.c(c10.getClass()));
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    a() {
    }
}

