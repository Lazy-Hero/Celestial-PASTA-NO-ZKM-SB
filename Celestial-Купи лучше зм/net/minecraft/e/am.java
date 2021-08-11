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
import net.minecraft.E.s;
import net.minecraft.Z.i;
import net.minecraft.k.m;

final class am
implements Predicate<i> {
    final /* synthetic */ int a;

    am(int n2) {
        this.a = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(@Nullable i i2) {
        m[] arrm = s.b();
        int n2 = this.a;
        if (arrm != null) {
            n2 = n2 == i2.b().d(i2) ? 1 : 0;
        }
        return n2 != 0;
    }
}

