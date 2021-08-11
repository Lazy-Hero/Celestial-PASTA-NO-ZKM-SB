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
import net.minecraft.E.a0;
import net.minecraft.E.s;
import net.minecraft.k.m;

final class r
implements Predicate<String> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable String string) {
        m[] arrm = s.b();
        if (string == null) return 0 != 0;
        int n2 = a0.a().contains(string);
        if (arrm == null) return n2 != 0;
        if (n2 != 0) return 1 != 0;
        n2 = string.length();
        if (arrm != null) {
            if (n2 <= "score_".length()) return 0 != 0;
            n2 = string.startsWith("score_") ? 1 : 0;
        }
        if (arrm == null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    r() {
    }
}

