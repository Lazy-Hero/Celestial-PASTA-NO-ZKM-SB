/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
package net.minecraft.client.D;

import com.google.common.base.Function;
import javax.annotation.Nullable;
import net.minecraft.client.D.a;
import net.minecraft.client.D.h;
import net.minecraft.client.D.u;

class A
implements Function<a, String> {
    final /* synthetic */ u a;

    A(u u2) {
        this.a = u2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(@Nullable a a10) {
        boolean bl2 = h.c();
        a a11 = a10;
        if (bl2) {
            if (a11 == null) {
                return "<NULL>";
            }
            a11 = a10;
        }
        String string = a11.b();
        return string;
    }
}

