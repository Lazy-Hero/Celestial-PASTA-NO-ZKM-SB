/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class e
extends d {
    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = n4 + 2;
        int n9 = n5 + 2;
        int[] arrn = this.f.a(n6, n7, n8, n9);
        m[] arrm = d.b();
        int[] arrn2 = b.a(n4 * n5);
        int n10 = 0;
        block0: while (true) {
            int n11 = n10;
            block1: while (n11 < n5) {
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n12;
                    int n13;
                    block42: {
                        block43: {
                            int n14;
                            int n15;
                            block40: {
                                block41: {
                                    int n16;
                                    block38: {
                                        block39: {
                                            int n17;
                                            block36: {
                                                block37: {
                                                    int n18;
                                                    int n19;
                                                    block28: {
                                                        block29: {
                                                            int n20;
                                                            block31: {
                                                                block35: {
                                                                    int n21;
                                                                    block34: {
                                                                        block32: {
                                                                            block33: {
                                                                                block30: {
                                                                                    block26: {
                                                                                        block27: {
                                                                                            n19 = arrn[i2 + 0 + (n10 + 0) * n8];
                                                                                            n17 = arrn[i2 + 2 + (n10 + 0) * n8];
                                                                                            n16 = arrn[i2 + 0 + (n10 + 2) * n8];
                                                                                            n15 = arrn[i2 + 2 + (n10 + 2) * n8];
                                                                                            n20 = arrn[i2 + 1 + (n10 + 1) * n8];
                                                                                            this.a((long)(i2 + n2), (long)(n10 + n3));
                                                                                            n11 = n20;
                                                                                            if (arrm == null) continue block1;
                                                                                            if (arrm == null) break block26;
                                                                                            if (n11 != 0) break block27;
                                                                                            n18 = n19;
                                                                                            if (arrm == null) break block28;
                                                                                            if (n18 != 0) break block29;
                                                                                            n18 = n17;
                                                                                            if (arrm == null) break block28;
                                                                                            if (n18 != 0) break block29;
                                                                                            n18 = n16;
                                                                                            if (arrm == null) break block28;
                                                                                            if (n18 != 0) break block29;
                                                                                            n18 = n15;
                                                                                            if (arrm == null) break block28;
                                                                                            if (n18 != 0) break block29;
                                                                                        }
                                                                                        n21 = n20;
                                                                                    }
                                                                                    if (arrm == null) break block30;
                                                                                    if (n21 <= 0) break block31;
                                                                                    n21 = n19;
                                                                                }
                                                                                if (arrm == null) break block32;
                                                                                if (n21 == 0) break block33;
                                                                                n21 = n17;
                                                                                if (arrm == null) break block32;
                                                                                if (n21 == 0) break block33;
                                                                                n21 = n16;
                                                                                if (arrm == null) break block32;
                                                                                if (n21 == 0) break block33;
                                                                                n21 = n15;
                                                                                if (arrm == null) break block32;
                                                                                if (n21 != 0) break block31;
                                                                            }
                                                                            n21 = this.a(5);
                                                                        }
                                                                        if (arrm == null) break block34;
                                                                        if (n21 != 0) break block35;
                                                                        n21 = n20;
                                                                    }
                                                                    if (n21 == 4) {
                                                                        arrn2[i2 + n10 * n4] = 4;
                                                                        if (arrm != null) continue;
                                                                    }
                                                                    arrn2[i2 + n10 * n4] = 0;
                                                                    if (arrm != null) continue;
                                                                }
                                                                arrn2[i2 + n10 * n4] = n20;
                                                                if (arrm != null) continue;
                                                            }
                                                            arrn2[i2 + n10 * n4] = n20;
                                                            if (arrm != null) continue;
                                                        }
                                                        n18 = 1;
                                                    }
                                                    n14 = n18;
                                                    n13 = 1;
                                                    n12 = n19;
                                                    if (arrm == null) break block36;
                                                    if (n12 == 0) break block37;
                                                    n12 = this.a(n14++);
                                                    if (arrm == null) break block36;
                                                    if (n12 == 0) {
                                                        n13 = n19;
                                                    }
                                                }
                                                n12 = n17;
                                            }
                                            if (arrm == null) break block38;
                                            if (n12 == 0) break block39;
                                            n12 = this.a(n14++);
                                            if (arrm == null) break block38;
                                            if (n12 == 0) {
                                                n13 = n17;
                                            }
                                        }
                                        n12 = n16;
                                    }
                                    if (arrm == null) break block40;
                                    if (n12 == 0) break block41;
                                    n12 = this.a(n14++);
                                    if (arrm == null) break block40;
                                    if (n12 == 0) {
                                        n13 = n16;
                                    }
                                }
                                n12 = n15;
                            }
                            if (arrm == null) break block42;
                            if (n12 == 0) break block43;
                            n12 = this.a(n14++);
                            if (arrm == null) break block42;
                            if (n12 == 0) {
                                n13 = n15;
                            }
                        }
                        n12 = this.a(3);
                    }
                    if (arrm != null) {
                        if (n12 == 0) {
                            arrn2[i2 + n10 * n4] = n13;
                            if (arrm != null) continue;
                        }
                        n12 = n13;
                    }
                    if (n12 == 4) {
                        arrn2[i2 + n10 * n4] = 4;
                        if (arrm != null) continue;
                    }
                    arrn2[i2 + n10 * n4] = 0;
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

    public e(long l2, d d10) {
        super(l2);
        this.f = d10;
    }
}

