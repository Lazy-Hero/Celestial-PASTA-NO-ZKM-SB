/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ag.R;
import net.minecraft.ak.h;
import net.minecraft.ak.y;
import net.minecraft.k.n;

public class z
extends y {
    private static gP a(gP gP2) {
        return gP2;
    }

    public z(R r2, double d10, float f10, float f11) {
        super(r2, d10, f10, f11);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(int n2, int n3, int n4, int n5, int n6) {
        i i2 = this.h.d(new n(n2 + n5, n4 - 1, n3 + n6));
        String string = net.minecraft.ak.h.h();
        boolean bl2 = i2.d();
        if (string == null) {
            if (!bl2) {
                if (i2.o() != c.J) return false;
            }
            bl2 = this.h.a(new n(n2 + n5, n4, n3 + n6));
        }
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.h.a(new n(n2 + n5, n4 + 1, n3 + n6));
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

