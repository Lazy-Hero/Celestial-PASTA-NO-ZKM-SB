/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.T.ah;
import net.minecraft.T.aq;

class c
implements Predicate<aq> {
    final /* synthetic */ ah a;

    c(ah ah2) {
        this.a = ah2;
    }

    public boolean a(@Nullable aq aq2) {
        return aq2.f();
    }
}

