/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class t
extends d {
    private static gP b(gP gP2) {
        return gP2;
    }

    public t(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        m[] arrm = d.b();
        int n8 = n4 + 2;
        int n9 = n5 + 2;
        int[] arrn = this.f.a(n6, n7, n8, n9);
        int[] arrn2 = b.a(n4 * n5);
        int n10 = 0;
        block0: while (true) {
            int n11 = n10;
            int n12 = n5;
            block1: while (n11 < n12) {
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n13;
                    block11: {
                        int n14;
                        block13: {
                            int n15;
                            int n16;
                            block12: {
                                int n17;
                                int n18;
                                block7: {
                                    int n19;
                                    block8: {
                                        block9: {
                                            int n20;
                                            block10: {
                                                n18 = arrn[i2 + 0 + (n10 + 1) * n8];
                                                n19 = arrn[i2 + 2 + (n10 + 1) * n8];
                                                n16 = arrn[i2 + 1 + (n10 + 0) * n8];
                                                n17 = arrn[i2 + 1 + (n10 + 2) * n8];
                                                n13 = arrn[i2 + 1 + (n10 + 1) * n8];
                                                n11 = n18;
                                                n12 = n19;
                                                if (arrm == null) continue block1;
                                                if (arrm == null) break block7;
                                                if (n11 != n12) break block8;
                                                n14 = n16;
                                                n15 = n17;
                                                if (arrm == null) break block7;
                                                if (n14 != n15) break block8;
                                                this.a((long)(i2 + n2), (long)(n10 + n3));
                                                n20 = this.a(2);
                                                if (arrm == null) break block9;
                                                if (n20 != 0) break block10;
                                                n13 = n18;
                                                if (arrm != null) break block11;
                                            }
                                            n20 = n13 = n16;
                                        }
                                        if (arrm != null) break block11;
                                    }
                                    n14 = n18;
                                    n15 = n19;
                                }
                                if (arrm == null) break block12;
                                if (n14 == n15) {
                                    n13 = n18;
                                }
                                n14 = n16;
                                if (arrm == null) break block13;
                                n15 = n17;
                            }
                            if (n14 != n15) break block11;
                            n14 = n16;
                        }
                        n13 = n14;
                    }
                    arrn2[i2 + n10 * n4] = n13;
                    if (arrm != null) continue;
                }
                ++n10;
                if (arrm != null) continue block0;
            }
            break;
        }
        return arrn2;
    }
}

