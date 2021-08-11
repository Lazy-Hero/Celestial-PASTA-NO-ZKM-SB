/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.a;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.a.k;

final class h
implements Predicate<net.minecraft.i.k> {
    h() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable net.minecraft.i.k k2) {
        boolean bl2 = k.q();
        net.minecraft.i.k k3 = k2;
        if (!bl2) {
            if (k3 == null) return false;
            k3 = k2;
        }
        boolean bl3 = k3.ae();
        if (bl2) return bl3;
        if (!bl3) return true;
        bl3 = k2.n().M().c("spectatorsGenerateChunks");
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

