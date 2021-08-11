/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.T.S;
import net.minecraft.T.ah;
import net.minecraft.T.t;

class j
implements Predicate<net.minecraft.i.j> {
    final /* synthetic */ t a;

    j(t t2) {
        this.a = t2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable net.minecraft.i.j j2) {
        int[] arrn = S.f();
        if (j2 == null) return false;
        boolean bl2 = ah.a(t.a(this.a), j2);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

