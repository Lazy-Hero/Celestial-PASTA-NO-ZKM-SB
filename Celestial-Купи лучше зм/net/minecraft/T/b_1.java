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
import net.minecraft.T.aR;
import net.minecraft.T.aX;
import net.minecraft.T.k;
import net.minecraft.U.C;

class b
implements Predicate<C> {
    final /* synthetic */ aX a;

    private static gP a(gP gP2) {
        return gP2;
    }

    b(aX aX2) {
        this.a = aX2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable C c10) {
        int[] arrn = S.f();
        if (c10 == null) return false;
        boolean bl2 = k.c.apply((Object)c10);
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = c10 instanceof aR;
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }
}

