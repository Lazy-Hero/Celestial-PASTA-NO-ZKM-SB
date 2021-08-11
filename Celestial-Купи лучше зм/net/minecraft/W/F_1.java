/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.W.C;
import net.minecraft.W.aE;

class F
implements Predicate<C> {
    final /* synthetic */ aE a;

    F(aE aE2) {
        this.a = aE2;
    }

    public boolean a(@Nullable C c10) {
        return c10.a() == this.a.b();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

