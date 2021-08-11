/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.A.h;
import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class p
extends d {
    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = n4 + 2;
        int n9 = n5 + 2;
        int[] arrn = this.f.a(n6, n7, n8, n9);
        int[] arrn2 = b.a(n4 * n5);
        m[] arrm = d.b();
        int n10 = 0;
        block0: while (true) {
            int n11 = n10;
            int n12 = n5;
            block1: while (n11 < n12) {
                for (int i2 = 0; i2 < n4; ++i2) {
                    block8: {
                        int n13;
                        int n14;
                        block10: {
                            int n15;
                            int n16;
                            block9: {
                                int n17;
                                block7: {
                                    int n18 = this.b(arrn[i2 + 0 + (n10 + 1) * n8]);
                                    n17 = this.b(arrn[i2 + 2 + (n10 + 1) * n8]);
                                    int n19 = this.b(arrn[i2 + 1 + (n10 + 0) * n8]);
                                    n16 = this.b(arrn[i2 + 1 + (n10 + 2) * n8]);
                                    n11 = n15 = this.b(arrn[i2 + 1 + (n10 + 1) * n8]);
                                    n12 = n18;
                                    if (arrm == null) continue block1;
                                    if (arrm == null) break block7;
                                    if (n11 != n12) break block8;
                                    n14 = n15;
                                    n13 = n19;
                                }
                                if (arrm == null) break block9;
                                if (n14 != n13) break block8;
                                n14 = n15;
                                n13 = n17;
                            }
                            if (arrm == null) break block10;
                            if (n14 != n13) break block8;
                            n14 = n15;
                            n13 = n16;
                        }
                        if (n14 == n13) {
                            arrn2[i2 + n10 * n4] = -1;
                            if (arrm != null) continue;
                        }
                    }
                    arrn2[i2 + n10 * n4] = h.b(net.minecraft.u.d.d);
                    if (arrm != null) continue;
                }
                ++n10;
                if (arrm != null) continue block0;
            }
            break;
        }
        return arrn2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int b(int n2) {
        int n3;
        m[] arrm = d.b();
        int n4 = n2;
        int n5 = 2;
        if (arrm != null) {
            if (n4 < n5) {
                n3 = n2;
                return n3;
            }
            n4 = 2;
            n5 = n2 & 1;
        }
        n3 = n4 + n5;
        return n3;
    }

    public p(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

