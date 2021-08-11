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
import net.minecraft.w.H;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.e;

class ap
implements e {
    final /* synthetic */ H a;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(d d10, @Nullable z z2, @Nullable B b10) {
        int n2 = bl.c();
        B b11 = b10;
        if (n2 == 0) {
            if (b11 == null) return 0.0f;
            b11 = b10;
        }
        if (n2 == 0) {
            if (!b11.aq()) return 0.0f;
            b11 = b10;
        }
        if (b11.a() != d10) return 0.0f;
        return 1.0f;
    }

    ap(H h2) {
        this.a = h2;
    }
}

