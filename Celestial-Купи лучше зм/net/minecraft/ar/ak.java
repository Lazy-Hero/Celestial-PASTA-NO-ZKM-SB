/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.ar.v;

final class ak
implements Predicate<T> {
    final /* synthetic */ double c;
    final /* synthetic */ double a;
    final /* synthetic */ double d;
    final /* synthetic */ double b;

    private static gP a(gP gP2) {
        return gP2;
    }

    ak(double d10, double d11, double d12, double d13) {
        this.c = d10;
        this.a = d11;
        this.b = d12;
        this.d = d13;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable T t2) {
        double d10;
        int n2 = v.d();
        Object t3 = t2;
        if (n2 != 0) {
            if (t3 == null) return 0 != 0;
            t3 = t2;
        }
        int n3 = (d10 = ((x)t3).a(this.c, this.a, this.b) - this.d) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (n2 == 0) return n3 != 0;
        if (n3 > 0) return 0 != 0;
        return 1 != 0;
    }
}

