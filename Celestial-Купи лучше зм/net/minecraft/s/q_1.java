/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class q
extends d {
    private static gP b(gP gP2) {
        return gP2;
    }

    public q(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn;
        block4: {
            int[] arrn2 = this.f.a(n2, n3, n4, n5);
            int[] arrn3 = b.a(n4 * n5);
            m[] arrm = d.b();
            for (int i2 = 0; i2 < n5; ++i2) {
                for (int i3 = 0; i3 < n4; ++i3) {
                    this.a((long)(i3 + n2), (long)(i2 + n3));
                    arrn = arrn3;
                    if (arrm != null) {
                        int n6 = arrn2[i3 + i2 * n4];
                        if (arrm != null) {
                            n6 = n6 > 0 ? this.a(299999) + 2 : 0;
                        }
                        arrn[i3 + i2 * n4] = n6;
                        if (arrm != null) continue;
                    }
                    break block4;
                }
                if (arrm != null) continue;
            }
            arrn = arrn3;
        }
        return arrn;
    }
}

