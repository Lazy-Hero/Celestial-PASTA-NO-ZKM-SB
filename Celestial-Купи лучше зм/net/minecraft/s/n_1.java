/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.A.h;
import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class n
extends d {
    public n(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.f.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = b.a(n4 * n5);
        int n6 = 0;
        m[] arrm = d.b();
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 < n5) {
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n8;
                    block8: {
                        int n9;
                        block7: {
                            this.a((long)(i2 + n2), (long)(n6 + n3));
                            n8 = arrn[i2 + 1 + (n6 + 1) * (n4 + 2)];
                            n7 = this.a(57);
                            if (arrm == null) continue block1;
                            if (arrm == null) break block7;
                            if (n7 != 0) break block8;
                            n9 = n8;
                        }
                        if (n9 == h.b(net.minecraft.u.d.s)) {
                            arrn2[i2 + n6 * n4] = h.b(net.minecraft.u.d.ac);
                            if (arrm != null) continue;
                        }
                        arrn2[i2 + n6 * n4] = n8;
                        if (arrm != null) continue;
                    }
                    arrn2[i2 + n6 * n4] = n8;
                    if (arrm != null) continue;
                }
                ++n6;
                if (arrm != null) continue block0;
            }
            break;
        }
        return arrn2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

