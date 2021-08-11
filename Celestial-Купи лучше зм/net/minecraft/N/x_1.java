/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.N.Y;
import net.minecraft.N.j;
import net.minecraft.N.r;
import net.minecraft.k.m;

class x
implements Predicate<Y> {
    final /* synthetic */ Y a;

    private static gP a(gP gP2) {
        return gP2;
    }

    x(Y y2) {
        this.a = y2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable Y y2) {
        m[] arrm = j.f();
        Y y3 = y2;
        if (arrm == null) {
            if (Y.a(y3) != r.CORNER) return false;
            y3 = this.a;
        }
        boolean bl2 = Y.b(y3).equals(Y.b(y2));
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

