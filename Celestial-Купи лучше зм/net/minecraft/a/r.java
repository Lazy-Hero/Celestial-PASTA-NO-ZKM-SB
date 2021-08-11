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
import net.minecraft.ar.aD;

final class r
implements Predicate<String> {
    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(@Nullable String string) {
        boolean bl2 = k.t();
        boolean bl3 = aD.a(string);
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    r() {
    }
}

