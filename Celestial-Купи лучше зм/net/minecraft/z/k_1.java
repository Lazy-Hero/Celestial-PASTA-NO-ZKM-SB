/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.Z;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.Z.c;
import net.minecraft.Z.f;

final class k
implements Predicate<f> {
    final /* synthetic */ Predicate a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable f f10) {
        String string = c.c();
        if (f10 == null) return false;
        boolean bl2 = this.a.apply((Object)f10.b());
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    k(Predicate predicate) {
        this.a = predicate;
    }
}

