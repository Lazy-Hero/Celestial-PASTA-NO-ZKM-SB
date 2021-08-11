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

final class B
implements Predicate<x> {
    final /* synthetic */ int b;
    final /* synthetic */ int a;

    B(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int n2;
        int n3;
        k k2;
        m[] arrm;
        block5: {
            block6: {
                arrm = s.b();
                x x3 = x2;
                if (arrm != null) {
                    if (!(x3 instanceof k)) {
                        return false;
                    }
                    x3 = x2;
                }
                k2 = (k)x3;
                n3 = this.a;
                n2 = -1;
                if (arrm == null) break block5;
                if (n3 <= n2) break block6;
                n3 = k2.b4;
                n2 = this.a;
                if (arrm == null) break block5;
                if (n3 < n2) return 0 != 0;
            }
            n3 = this.b;
            if (arrm == null) return n3 != 0;
            n2 = -1;
        }
        if (n3 <= n2) return 1 != 0;
        n3 = k2.b4;
        if (arrm == null) return n3 != 0;
        if (n3 > this.b) return 0 != 0;
        return 1 != 0;
    }
}

