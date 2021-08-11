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
import net.minecraft.W.ci;

final class cP
implements Predicate<C> {
    final /* synthetic */ ci a;

    public boolean a(@Nullable C c10) {
        return c10.a() == this.a;
    }

    cP(ci ci2) {
        this.a = ci2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

