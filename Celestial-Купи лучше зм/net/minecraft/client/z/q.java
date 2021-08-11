/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.z;

import net.minecraft.P.i;
import net.minecraft.P.t;
import net.minecraft.client.z.c;
import net.minecraft.client.z.m;
import net.minecraft.w.Z;
import net.minecraft.w.d;

final class q
implements c {
    private static gP a(gP gP2) {
        return gP2;
    }

    q() {
    }

    @Override
    public int a(d d10, int n2) {
        int n3;
        int n4;
        int n5;
        block10: {
            i i2;
            int n6;
            block12: {
                int n7;
                block11: {
                    n6 = m.b();
                    n7 = n2;
                    if (n6 == 0) break block11;
                    if (n7 == 1) break block12;
                    n7 = -1;
                }
                return n7;
            }
            i i3 = i2 = Z.a(d10, "Colors");
            if (n6 != 0) {
                if (!(i3 instanceof t)) {
                    return 0x8A8A8A;
                }
                i3 = i2;
            }
            int[] arrn = ((t)i3).a();
            int n8 = arrn.length;
            if (n6 != 0) {
                if (n8 == 1) {
                    return arrn[0];
                }
                n8 = 0;
            }
            n5 = n8;
            n4 = 0;
            n3 = 0;
            for (int n9 : arrn) {
                n5 += (n9 & 0xFF0000) >> 16;
                n4 += (n9 & 0xFF00) >> 8;
                n3 += (n9 & 0xFF) >> 0;
                if (n6 != 0) {
                    if (n6 != 0) continue;
                }
                break block10;
            }
            n5 /= arrn.length;
            n4 /= arrn.length;
            n3 /= arrn.length;
        }
        return n5 << 16 | n4 << 8 | n3;
    }
}

