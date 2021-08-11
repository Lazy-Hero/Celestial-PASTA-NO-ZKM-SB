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

final class aW
implements Predicate<x> {
    final /* synthetic */ String b;
    final /* synthetic */ boolean a;

    private static gP a(gP gP2) {
        return gP2;
    }

    aW(String string, boolean bl2) {
        this.b = string;
        this.a = bl2;
    }

    public boolean a(@Nullable x x2) {
        m[] arrm = s.b();
        if (x2 == null) {
            return false;
        }
        boolean bl2 = "".equals(this.b);
        if (arrm != null) {
            if (bl2) {
                boolean bl3 = x2.X().isEmpty();
                if (arrm != null) {
                    bl3 = bl3 != this.a;
                }
                return bl3;
            }
            bl2 = x2.X().contains(this.b);
        }
        if (arrm != null) {
            bl2 = bl2 != this.a;
        }
        return bl2;
    }
}

