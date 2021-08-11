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
import net.minecraft.i.k;
import net.minecraft.k.m;

final class H
implements Predicate<x> {
    final /* synthetic */ net.minecraft.ah.s a;
    final /* synthetic */ boolean b;

    H(boolean bl2, net.minecraft.ah.s s2) {
        this.b = bl2;
        this.a = s2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(@Nullable x x2) {
        m[] arrm = s.b();
        x x3 = x2;
        if (arrm != null) {
            if (!(x3 instanceof k)) {
                return false;
            }
            x3 = x2;
        }
        k k2 = (k)x3;
        net.minecraft.ah.s s2 = k2.c7.e();
        return this.b == (s2 != this.a);
    }
}

