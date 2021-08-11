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
import net.minecraft.U.h;
import net.minecraft.U.x;
import net.minecraft.ar.v;
import net.minecraft.k.m;

final class f
implements Predicate<x> {
    final /* synthetic */ boolean a;
    final /* synthetic */ v b;

    private static gP a(gP gP2) {
        return gP2;
    }

    f(v v2, boolean bl2) {
        this.b = v2;
        this.a = bl2;
    }

    public boolean a(@Nullable x x2) {
        m[] arrm = s.b();
        boolean bl2 = h.a(x2, this.b);
        if (arrm != null) {
            bl2 = bl2 != this.a;
        }
        return bl2;
    }
}

