/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.b;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.e;

final class aO
implements e {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(d d10, @Nullable z z2, @Nullable B b10) {
        int n2 = bl.g();
        B b11 = b10;
        if (n2 != 0) {
            if (b11 == null) return 0.0f;
            b11 = b10;
        }
        if (b11.al() == b.RIGHT) return 0.0f;
        return 1.0f;
    }

    aO() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

