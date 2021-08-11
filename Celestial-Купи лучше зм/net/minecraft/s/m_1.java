/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;

public class m
extends d {
    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn;
        block11: {
            int n6;
            block9: {
                int n7;
                int[] arrn2;
                int n8;
                block13: {
                    net.minecraft.k.m[] arrm;
                    block12: {
                        block10: {
                            block8: {
                                arrn = b.a(n4 * n5);
                                arrm = d.b();
                                for (int i2 = 0; i2 < n5; ++i2) {
                                    n8 = 0;
                                    if (arrm == null) break block8;
                                    for (int i3 = v1372437; i3 < n4; ++i3) {
                                        this.a((long)(n2 + i3), (long)(n3 + i2));
                                        arrn2 = arrn;
                                        n7 = i3 + i2 * n4;
                                        n6 = this.a(10);
                                        if (arrm != null) {
                                            boolean bl2;
                                            if (arrm != null) {
                                                bl2 = n6 == 0;
                                            }
                                            arrn2[n7] = bl2;
                                            if (arrm != null) continue;
                                        }
                                        break block9;
                                    }
                                    if (arrm != null) continue;
                                }
                                n8 = n2;
                            }
                            if (arrm == null) break block10;
                            if (n8 <= -n4) break block11;
                            n8 = n2;
                        }
                        if (arrm == null) break block12;
                        if (n8 > 0) break block11;
                        n8 = n3;
                    }
                    if (arrm == null) break block13;
                    if (n8 <= -n5) break block11;
                    n8 = n3;
                }
                if (n8 > 0) break block11;
                arrn2 = arrn;
                n7 = -n2 + -n3 * n4;
                n6 = 1;
            }
            arrn2[n7] = n6;
        }
        return arrn;
    }

    public m(long l2) {
        super(l2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

