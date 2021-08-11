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
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.au.h;

public class a
implements Predicate<i> {
    private final /* synthetic */ K a;

    private a(K k2) {
        this.a = k2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable i i2) {
        int n2 = h.g();
        i i3 = i2;
        if (n2 == 0) {
            if (i3 == null) return false;
            i3 = i2;
        }
        if (i3.b() != this.a) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static a a(K k2) {
        return new a(k2);
    }
}

