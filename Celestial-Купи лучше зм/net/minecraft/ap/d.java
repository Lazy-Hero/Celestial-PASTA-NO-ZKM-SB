/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ap;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.ap.g;
import net.minecraft.i.j;

class d
implements Predicate<x> {
    final /* synthetic */ g a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(@Nullable x x2) {
        int[] arrn = g.c();
        boolean bl2 = x2 instanceof j;
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    d(g g10) {
        this.a = g10;
    }
}

