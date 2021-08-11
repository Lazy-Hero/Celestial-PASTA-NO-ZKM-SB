/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.p;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.client.p.c;
import net.minecraft.client.p.h;
import net.minecraft.client.p.m;

class g
implements Function<m, Predicate<i>> {
    final /* synthetic */ net.minecraft.Z.c a;
    final /* synthetic */ c b;

    g(c c10, net.minecraft.Z.c c11) {
        this.b = c10;
        this.a = c11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public Predicate<i> a(@Nullable m m2) {
        String string = h.b();
        m m3 = m2;
        if (string != null) {
            if (m3 == null) {
                return null;
            }
            m3 = m2;
        }
        Predicate<i> predicate = m3.a(this.a);
        return predicate;
    }
}

