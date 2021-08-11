/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.p;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.client.p.h;
import net.minecraft.client.p.r;

class l
implements Predicate<i> {
    final /* synthetic */ a a;
    final /* synthetic */ r b;
    final /* synthetic */ Optional c;

    private static gP a(gP gP2) {
        return gP2;
    }

    l(r r2, a a10, Optional optional) {
        this.b = r2;
        this.a = a10;
        this.c = optional;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable i i2) {
        String string = h.b();
        i i3 = i2;
        if (string != null) {
            if (i3 == null) return false;
            i3 = i2;
        }
        boolean bl2 = i3.b(this.a).equals(this.c.get());
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

