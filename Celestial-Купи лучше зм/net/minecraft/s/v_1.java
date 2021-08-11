/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class v
extends d {
    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn;
        block7: {
            int n6;
            int n7;
            int[] arrn2;
            int n8;
            m[] arrm;
            block5: {
                int n9 = n2 >> 1;
                arrm = d.b();
                int n10 = n3 >> 1;
                int n11 = (n4 >> 1) + 2;
                int n12 = (n5 >> 1) + 2;
                int[] arrn3 = this.f.a(n9, n10, n11, n12);
                n8 = n11 - 1 << 1;
                int n13 = n12 - 1 << 1;
                arrn2 = b.a(n8 * n13);
                int n14 = 0;
                while (n14 < n12 - 1) {
                    block6: {
                        int n15;
                        n7 = (n14 << 1) * n8;
                        int n16 = arrn3[n15 + 0 + (n14 + 0) * n11];
                        n6 = arrn3[n15 + 0 + (n14 + 1) * n11];
                        if (arrm == null) break block5;
                        int n17 = n6;
                        for (n15 = 0; n15 < n11 - 1; ++n15) {
                            this.a((long)(n15 + n9 << 1), (long)(n14 + n10 << 1));
                            int n18 = arrn3[n15 + 1 + (n14 + 0) * n11];
                            int n19 = arrn3[n15 + 1 + (n14 + 1) * n11];
                            arrn2[n7] = n16;
                            arrn2[n7++ + n8] = this.a(n16, n17);
                            arrn2[n7] = this.a(n16, n18);
                            arrn2[n7++ + n8] = this.b(n16, n18, n17, n19);
                            n16 = n18;
                            n17 = n19;
                            if (arrm != null) {
                                if (arrm != null) continue;
                            }
                            break block6;
                        }
                        ++n14;
                    }
                    if (arrm != null) continue;
                }
                n6 = n4 * n5;
            }
            int[] arrn4 = b.a(n6);
            for (n7 = 0; n7 < n5; ++n7) {
                arrn = arrn2;
                if (arrm != null) {
                    System.arraycopy(arrn, (n7 + (n3 & 1)) * n8 + (n2 & 1), arrn4, n7 * n4, n4);
                    if (arrm != null) continue;
                }
                break block7;
            }
            arrn = arrn4;
        }
        return arrn;
    }

    public v(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static d a(long l2, d d10, int n2) {
        d d11;
        block2: {
            d d12 = d10;
            m[] arrm = d.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                d11 = new v(l2 + (long)i2, d12);
                if (arrm != null) {
                    d12 = d11;
                    if (arrm != null) continue;
                }
                break block2;
            }
            d11 = d12;
        }
        return d11;
    }
}

