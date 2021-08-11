/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.client.a.I;
import net.minecraft.client.a.x;

class V
implements Predicate<net.minecraft.U.x> {
    final /* synthetic */ x a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable net.minecraft.U.x x2) {
        String string = I.j();
        net.minecraft.U.x x3 = x2;
        if (string == null) {
            if (x3 == null) return false;
            x3 = x2;
        }
        boolean bl2 = x3.M();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    V(x x2) {
        this.a = x2;
    }
}

