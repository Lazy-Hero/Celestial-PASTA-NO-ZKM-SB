/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.r;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.m;

public class r
extends b<net.minecraft.an.b> {
    @Nullable
    protected v a(net.minecraft.an.b b10) {
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(net.minecraft.an.b b10, double d10, double d11, double d12, float f10, float f11) {
        block39: {
            int n2;
            double d13;
            double d14;
            double[] arrd;
            double[] arrd2;
            m[] arrm;
            I i2;
            W w2;
            block38: {
                w2 = W.c();
                i2 = w2.b();
                arrm = b.b();
                net.minecraft.client.a.v.L();
                net.minecraft.client.a.v.y();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE);
                arrd2 = new double[8];
                arrd = new double[8];
                d14 = 0.0;
                d13 = 0.0;
                Random random = new Random(b10.aK);
                for (n2 = 7; n2 >= 0; --n2) {
                    arrd2[n2] = d14;
                    arrd[n2] = d13;
                    d14 += (double)(random.nextInt(11) - 5);
                    d13 += (double)(random.nextInt(11) - 5);
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block38;
                }
                n2 = 0;
            }
            block1: while (true) {
                int n3 = n2;
                block2: while (n3 < 4) {
                    Random random = new Random(b10.aK);
                    if (arrm != null) break block39;
                    int n4 = 0;
                    block3: while (true) {
                        int n5 = n4;
                        block4: while (n5 < 3) {
                            int n6;
                            int n7;
                            block41: {
                                int n8;
                                block40: {
                                    n7 = 7;
                                    n6 = 0;
                                    n3 = n4;
                                    if (arrm != null) continue block2;
                                    if (arrm == null) {
                                        if (n3 > 0) {
                                            n7 = 7 - n4;
                                        }
                                        n8 = n4;
                                    }
                                    if (arrm != null) break block40;
                                    if (n8 <= 0) break block41;
                                    n8 = n7 - 2;
                                }
                                n6 = n8;
                            }
                            double d15 = arrd2[n7] - d14;
                            double d16 = arrd[n7] - d13;
                            int n9 = n7;
                            block5: while (true) {
                                int n10 = n9;
                                int n11 = n6;
                                block6: while (n10 >= n11) {
                                    int n12;
                                    double d17;
                                    double d18;
                                    block44: {
                                        block42: {
                                            block43: {
                                                d18 = d15;
                                                d17 = d16;
                                                if (arrm != null) break block42;
                                                n5 = n4;
                                                if (arrm != null) continue block4;
                                                if (n5 != 0) break block43;
                                                d15 += (double)(random.nextInt(11) - 5);
                                                d16 += (double)(random.nextInt(11) - 5);
                                                if (arrm == null) break block44;
                                            }
                                            d15 += (double)(random.nextInt(31) - 15);
                                        }
                                        d16 += (double)(random.nextInt(31) - 15);
                                    }
                                    i2.a(5, net.minecraft.client.y.b.i);
                                    float f12 = 0.5f;
                                    float f13 = 0.45f;
                                    float f14 = 0.45f;
                                    float f15 = 0.5f;
                                    double d19 = 0.1 + (double)n2 * 0.2;
                                    if (n4 == 0) {
                                        d19 *= (double)n9 * 0.1 + 1.0;
                                    }
                                    double d20 = 0.1 + (double)n2 * 0.2;
                                    int n13 = n4;
                                    if (arrm == null) {
                                        if (n13 == 0) {
                                            d20 *= (double)(n9 - 1) * 0.1 + 1.0;
                                        }
                                        n13 = n12 = 0;
                                    }
                                    while (n12 < 5) {
                                        double d21;
                                        double d22;
                                        double d23;
                                        double d24;
                                        block58: {
                                            block57: {
                                                int n14;
                                                int n15;
                                                block56: {
                                                    block54: {
                                                        block55: {
                                                            block53: {
                                                                block52: {
                                                                    block51: {
                                                                        block50: {
                                                                            int n16;
                                                                            int n17;
                                                                            block49: {
                                                                                block47: {
                                                                                    block48: {
                                                                                        block46: {
                                                                                            block45: {
                                                                                                d24 = d10 + 0.5 - d19;
                                                                                                d23 = d12 + 0.5 - d19;
                                                                                                n10 = n12;
                                                                                                n11 = 1;
                                                                                                if (arrm != null) continue block6;
                                                                                                if (arrm != null) break block45;
                                                                                                if (n10 == n11) break block46;
                                                                                                n17 = n12;
                                                                                                n16 = 2;
                                                                                            }
                                                                                            if (arrm != null) break block47;
                                                                                            if (n17 != n16) break block48;
                                                                                        }
                                                                                        d24 += d19 * 2.0;
                                                                                    }
                                                                                    n17 = n12;
                                                                                    n16 = 2;
                                                                                }
                                                                                if (arrm != null) break block49;
                                                                                if (n17 == n16) break block50;
                                                                                n17 = n12;
                                                                                n16 = 3;
                                                                            }
                                                                            if (n17 != n16) break block51;
                                                                        }
                                                                        d23 += d19 * 2.0;
                                                                    }
                                                                    d22 = d10 + 0.5 - d20;
                                                                    d21 = d12 + 0.5 - d20;
                                                                    n15 = n12;
                                                                    n14 = 1;
                                                                    if (arrm != null) break block52;
                                                                    if (n15 == n14) break block53;
                                                                    n15 = n12;
                                                                    n14 = 2;
                                                                }
                                                                if (arrm != null) break block54;
                                                                if (n15 != n14) break block55;
                                                            }
                                                            d22 += d20 * 2.0;
                                                        }
                                                        n15 = n12;
                                                        n14 = 2;
                                                    }
                                                    if (arrm != null) break block56;
                                                    if (n15 == n14) break block57;
                                                    n15 = n12;
                                                    n14 = 3;
                                                }
                                                if (n15 != n14) break block58;
                                            }
                                            d21 += d20 * 2.0;
                                        }
                                        i2.c(d22 + d15, d11 + (double)(n9 * 16), d21 + d16).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                                        i2.c(d24 + d18, d11 + (double)((n9 + 1) * 16), d23 + d17).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                                        ++n12;
                                        if (arrm == null) continue;
                                    }
                                    w2.a();
                                    --n9;
                                    if (arrm == null) continue block5;
                                }
                                break;
                            }
                            ++n4;
                            if (arrm == null) continue block3;
                        }
                        break;
                    }
                    ++n2;
                    if (arrm == null) continue block1;
                }
                break;
            }
            net.minecraft.client.a.v.f();
            net.minecraft.client.a.v.j();
            net.minecraft.client.a.v.x();
        }
    }

    public r(a4 a42) {
        super(a42);
    }
}

