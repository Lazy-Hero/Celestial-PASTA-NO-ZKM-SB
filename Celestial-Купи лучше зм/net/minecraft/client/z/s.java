/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.z;

import javax.annotation.Nullable;
import net.minecraft.N.I;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.client.z.m;
import net.minecraft.client.z.w;
import net.minecraft.k.n;
import net.minecraft.w.k;

final class s
implements w {
    final /* synthetic */ m a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a(i i2, @Nullable t t2, @Nullable n n2, int n3) {
        int n4 = m.b();
        if (t2 != null && n2 != null) {
            y y2 = t2.b(n2);
            int n5 = y2 instanceof I;
            if (n4 != 0) {
                if (n5 != 0) {
                    k k2 = ((I)y2).a();
                    i i3 = K.a(k2).d();
                    return this.a.a(i3, t2, n2, n3);
                }
                n5 = -1;
            }
            return n5;
        }
        return -1;
    }

    s(m m2) {
        this.a = m2;
    }
}

