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
import net.minecraft.k.m;

final class n
implements Predicate<x> {
    final /* synthetic */ String b;
    final /* synthetic */ boolean a;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        m[] arrm = s.b();
        x x3 = x2;
        if (arrm != null) {
            if (x3 == null) return false;
            x3 = x2;
        }
        boolean bl2 = x3.g().equals(this.b);
        if (arrm == null) return bl2;
        if (bl2 == this.a) return false;
        return true;
    }

    n(String string, boolean bl2) {
        this.b = string;
        this.a = bl2;
    }
}

