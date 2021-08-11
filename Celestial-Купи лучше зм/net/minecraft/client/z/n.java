/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.z;

import javax.annotation.Nullable;
import net.minecraft.A.J;
import net.minecraft.W.D;
import net.minecraft.W.bR;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.client.z.m;
import net.minecraft.client.z.w;

final class n
implements w {
    @Override
    public int a(i i2, @Nullable t t2, @Nullable net.minecraft.k.n n2, int n3) {
        D d10 = i2.b(bR.D);
        int n4 = m.d();
        D d11 = d10;
        D d12 = D.SPRUCE;
        if (n4 == 0) {
            if (d11 == d12) {
                return net.minecraft.ah.m.a();
            }
            d11 = d10;
            d12 = D.BIRCH;
        }
        if (d11 == d12) {
            return net.minecraft.ah.m.c();
        }
        return t2 != null && n2 != null ? J.c(t2, n2) : net.minecraft.ah.m.b();
    }

    n() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

