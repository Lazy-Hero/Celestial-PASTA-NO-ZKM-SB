/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
package net.minecraft.Z;

import com.google.common.base.Function;
import javax.annotation.Nullable;
import net.minecraft.Z.c;
import net.minecraft.ae.a;

final class h
implements Function<a<?>, String> {
    h() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public String a(@Nullable a<?> a10) {
        String string = c.c();
        a<?> a11 = a10;
        if (string != null) {
            if (a11 == null) {
                return "<NULL>";
            }
            a11 = a10;
        }
        String string2 = a11.c();
        return string2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

