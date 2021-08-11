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
import net.minecraft.U.x;
import net.minecraft.ak.h;
import net.minecraft.ak.m;

class c
implements Predicate<x> {
    final /* synthetic */ m a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        String string = h.h();
        boolean bl2 = x2.aL();
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.a.h.v().a(x2);
        }
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.a.h.e(x2);
        }
        if (string != null) return bl2;
        if (bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    c(m m2) {
        this.a = m2;
    }
}

