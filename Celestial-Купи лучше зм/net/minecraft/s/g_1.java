/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class g
extends d {
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
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n12;
                    block10: {
                        boolean bl2;
                        block11: {
                            block12: {
                                block8: {
                                    block9: {
                                        int n13;
                                        int n14 = arrn[i2 + 1 + (n10 + 1) * n8];
                                        this.a((long)(i2 + n2), (long)(n10 + n3));
                                        n11 = n14;
                                        if (arrm == null) continue block1;
                                        if (arrm != null) {
                                            if (n11 == 0) {
                                                arrn2[i2 + n10 * n4] = 0;
                                                if (arrm != null) continue;
                                            }
                                            n13 = this.a(6);
                                        }
                                        n12 = n13;
                                        bl2 = n12;
                                        if (arrm == null) break block8;
                                        if (bl2) break block9;
                                        n12 = 4;
                                        if (arrm != null) break block10;
                                    }
                                    bl2 = n12;
                                }
                                if (arrm == null) break block11;
                                if (bl2 > true) break block12;
                                n12 = 3;
                                if (arrm != null) break block10;
                            }
                            bl2 = true;
                        }
                        n12 = bl2;
                    }
                    arrn2[i2 + n10 * n4] = n12;
                    if (arrm != null) continue;
                }
                ++n10;
                if (arrm != null) continue block0;
            }
            break;
        }
        return arrn2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public g(long l2, d d10) {
        super(l2);
        this.f = d10;
    }
}

