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

final class C
implements Predicate<x> {
    final /* synthetic */ x a;

    C(x x2) {
        this.a = x2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(@Nullable x x2) {
        int n2 = v.d();
        while (x2.N()) {
            if ((x2 = x2.as()) != this.a && n2 != 0) continue;
            return false;
        }
        return true;
    }
}

