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
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.u.g;

final class de
implements Predicate<i> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable i i2) {
        boolean bl2 = cL.b();
        i i3 = i2;
        if (!bl2) {
            if (i3 == null) return false;
            i3 = i2;
        }
        K k2 = i3.b();
        K k3 = g.G;
        if (!bl2) {
            if (k2 == k3) return true;
            k2 = i2.b();
            k3 = g.y;
        }
        if (k2 != k3) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    de() {
    }
}

