/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.W.D;
import net.minecraft.W.cL;

final class cO
implements Predicate<D> {
    private static gP a(gP gP2) {
        return gP2;
    }

    cO() {
    }

    public boolean a(@Nullable D d10) {
        boolean bl2 = cL.e();
        boolean bl3 = d10.b();
        if (bl2) {
            bl3 = bl3 < BADBOOL 4;
        }
        return bl3;
    }
}

