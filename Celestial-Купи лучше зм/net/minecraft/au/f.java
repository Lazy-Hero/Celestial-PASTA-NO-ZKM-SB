/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.au;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.au.h;

public class f
implements Predicate<i> {
    private final /* synthetic */ c a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable i i2) {
        int n2 = h.c();
        i i3 = i2;
        if (n2 != 0) {
            if (i3 == null) return false;
            i3 = i2;
        }
        if (i3.o() != this.a) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static f a(c c10) {
        return new f(c10);
    }

    private f(c c10) {
        this.a = c10;
    }
}

