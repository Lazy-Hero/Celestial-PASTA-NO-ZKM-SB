/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class o
extends d {
    private static gP b(gP gP2) {
        return gP2;
    }

    public o(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = n4 + 2;
        m[] arrm = d.b();
        int n9 = n5 + 2;
        int[] arrn = this.f.a(n6, n7, n8, n9);
        int[] arrn2 = b.a(n4 * n5);
        int n10 = 0;
        block0: while (true) {
            int n11 = n10;
            block1: while (n11 < n5) {
                int n12 = 0;
                while (n12 < n4) {
                    block7: {
                        block8: {
                            int n13;
                            block12: {
                                block11: {
                                    int n14;
                                    block10: {
                                        int n15;
                                        block9: {
                                            int n16;
                                            int n17 = arrn[n12 + 1 + (n10 + 1 - 1) * (n4 + 2)];
                                            int n18 = arrn[n12 + 1 + 1 + (n10 + 1) * (n4 + 2)];
                                            n15 = arrn[n12 + 1 - 1 + (n10 + 1) * (n4 + 2)];
                                            n14 = arrn[n12 + 1 + (n10 + 1 + 1) * (n4 + 2)];
                                            arrn2[n12 + n10 * n4] = n16 = arrn[n12 + 1 + (n10 + 1) * n8];
                                            this.a((long)(n12 + n2), (long)(n10 + n3));
                                            if (arrm == null) break block7;
                                            n11 = n16;
                                            if (arrm == null) continue block1;
                                            if (n11 != 0) break block8;
                                            n13 = n17;
                                            if (arrm == null) break block9;
                                            if (n13 != 0) break block8;
                                            n13 = n18;
                                        }
                                        if (arrm == null) break block10;
                                        if (n13 != 0) break block8;
                                        n13 = n15;
                                    }
                                    if (arrm == null) break block11;
                                    if (n13 != 0) break block8;
                                    n13 = n14;
                                }
                                if (arrm == null) break block12;
                                if (n13 != 0) break block8;
                                n13 = this.a(2);
                            }
                            if (n13 == 0) {
                                arrn2[n12 + n10 * n4] = 1;
                            }
                        }
                        ++n12;
                    }
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

