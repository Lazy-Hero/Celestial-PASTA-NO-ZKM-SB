/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.U.x;

final class a
implements Predicate<x> {
    private static gP a(gP gP2) {
        return gP2;
    }

    a() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int n2 = j.c();
        x x3 = x2;
        if (n2 == 0) {
            if (!(x3 instanceof u)) return false;
            x3 = x2;
        }
        if (((u)x3).o() != j.RIDEABLE) return false;
        return true;
    }
}

