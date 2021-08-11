/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ah.A;
import net.minecraft.ah.z;

class N
implements Predicate<B> {
    final /* synthetic */ A a;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable B b10) {
        String string = z.I();
        B b11 = b10;
        if (string != null) {
            if (b11 == null) return false;
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (string != null) {
            if (!bl2) return false;
            bl2 = this.a.w(b10.f());
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    N(A a10) {
        this.a = a10;
    }
}

