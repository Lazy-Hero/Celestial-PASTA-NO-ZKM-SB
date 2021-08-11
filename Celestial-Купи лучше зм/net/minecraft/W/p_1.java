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
import net.minecraft.N.X;
import net.minecraft.W.cL;
import net.minecraft.Z.f;
import net.minecraft.Z.i;
import net.minecraft.u.g;

final class p
implements Predicate<f> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable f f10) {
        f f11;
        boolean bl2;
        block5: {
            i i2;
            block4: {
                bl2 = cL.e();
                i2 = f10.b();
                if (!bl2) break block4;
                if (i2 == null) return 0 != 0;
                f11 = f10;
                if (!bl2) break block5;
                i2 = f11.b();
            }
            if (i2.b() != g.bY) return 0 != 0;
            f11 = f10;
        }
        int n2 = f11.a() instanceof X;
        if (bl2) {
            if (n2 == 0) return 0 != 0;
            n2 = ((X)f10.a()).a();
        }
        if (!bl2) return n2 != 0;
        if (n2 != true) return 0 != 0;
        return 1 != 0;
    }

    p() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

