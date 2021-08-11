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
import net.minecraft.k.l;

final class m
implements Predicate<x> {
    final /* synthetic */ boolean a;
    final /* synthetic */ l c;
    final /* synthetic */ double b;
    final /* synthetic */ double d;
    final /* synthetic */ boolean e;

    m(l l2, boolean bl2, double d10, boolean bl3, double d11) {
        this.c = l2;
        this.a = bl2;
        this.d = d10;
        this.e = bl3;
        this.b = d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        int n2;
        double d10;
        net.minecraft.k.m[] arrm;
        block4: {
            block5: {
                arrm = s.b();
                if (x2 == null) {
                    return false;
                }
                d10 = this.c.b(x2.a, x2.aF, x2.ax);
                n2 = this.a;
                if (arrm == null) break block4;
                if (n2 != 0) break block5;
                double d11 = d10 - this.d;
                n2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                if (arrm == null) break block4;
                if (n2 < 0) return 0 != 0;
            }
            n2 = this.e;
        }
        if (arrm == null) return n2 != 0;
        if (n2 != 0) return 1 != 0;
        double d12 = d10 - this.b;
        n2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (arrm == null) return n2 != 0;
        if (n2 > 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

