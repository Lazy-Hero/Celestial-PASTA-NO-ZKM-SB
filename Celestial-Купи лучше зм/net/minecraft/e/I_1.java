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
import net.minecraft.k.h;
import net.minecraft.k.m;

final class I
implements Predicate<x> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    I(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        m[] arrm = s.b();
        x x3 = x2;
        if (arrm != null) {
            if (x3 == null) {
                return false;
            }
            x3 = x2;
        }
        int n2 = h.b(h.d(x3.e));
        int n3 = this.a;
        int n4 = this.b;
        if (arrm != null) {
            if (n3 > n4) {
                int n5 = n2;
                if (arrm == null) return n5 != 0;
                if (n5 >= this.a) return 1 != 0;
                n5 = n2;
                if (arrm == null) return n5 != 0;
                if (n5 > this.b) return 0 != 0;
                return 1 != 0;
            }
            n3 = n2;
            n4 = this.a;
        }
        if (arrm != null) {
            if (n3 < n4) return 0 != 0;
            n3 = n2;
            if (arrm == null) return n3 != 0;
            n4 = this.b;
        }
        if (n3 > n4) return 0 != 0;
        return 1 != 0;
    }
}

