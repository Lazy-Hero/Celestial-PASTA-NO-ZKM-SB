/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.h;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.g;
import net.minecraft.U.x;

final class a
implements Predicate<x> {
    a() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int n2 = D.g();
        x x3 = x2;
        if (n2 != 0) {
            if (!(x3 instanceof B)) return false;
            x3 = x2;
        }
        B b10 = (B)x3;
        if (n2 != 0) {
            if (b10.ag() == g.UNDEAD) return false;
            b10 = (B)x2;
        }
        boolean bl2 = b10.aF();
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

