/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.ak.h;
import net.minecraft.ak.w;

class aD
implements Predicate<C> {
    final /* synthetic */ C a;
    final /* synthetic */ w b;

    aD(w w2, C c10) {
        this.b = w2;
        this.a = c10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable C c10) {
        String string = h.h();
        C c11 = c10;
        if (string == null) {
            if (c11 == null) return false;
            c11 = this.a;
        }
        if (c11.getClass() == c10.getClass()) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

