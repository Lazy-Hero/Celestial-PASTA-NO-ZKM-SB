/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.z;

import javax.annotation.Nullable;
import net.minecraft.A.J;
import net.minecraft.W.B;
import net.minecraft.W.al;
import net.minecraft.W.d2;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.client.z.m;
import net.minecraft.client.z.w;
import net.minecraft.k.n;

final class b
implements w {
    b() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(i i2, @Nullable t t2, @Nullable n n2, int n3) {
        block3: {
            d2 d22;
            d2 d23;
            block2: {
                d2 d24 = i2.b(al.B);
                int n4 = m.b();
                if (t2 == null) return -1;
                if (n2 == null) return -1;
                d23 = d24;
                d22 = d2.GRASS;
                if (n4 == 0) break block2;
                if (d23 == d22) break block3;
                d23 = d24;
                d22 = d2.FERN;
            }
            if (d23 != d22) return -1;
        }
        int n5 = J.a(t2, i2.b(al.A) == B.UPPER ? n2.k() : n2);
        return n5;
    }
}

