/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.aA.b;
import net.minecraft.aA.h;
import net.minecraft.aA.s;

public class e
extends b {
    private final /* synthetic */ s[] b;
    private final /* synthetic */ int a;

    public double a(double d10, double d11) {
        double d12;
        block2: {
            double d13 = 0.0;
            boolean bl2 = h.a();
            double d14 = 1.0;
            for (int i2 = 0; i2 < this.a; ++i2) {
                d13 += this.b[i2].a(d10 * d14, d11 * d14) / d14;
                d12 = d14 / 2.0;
                if (!bl2) {
                    d14 = d12;
                    if (!bl2) continue;
                }
                break block2;
            }
            d12 = d13;
        }
        return d12;
    }

    public double[] a(double[] arrd, double d10, double d11, int n2, int n3, double d12, double d13, double d14, double d15) {
        boolean bl2;
        block7: {
            double[] arrd2;
            block8: {
                int n4;
                int n5;
                block10: {
                    block9: {
                        bl2 = h.a();
                        arrd2 = arrd;
                        if (bl2) break block8;
                        if (arrd2 == null) break block9;
                        n5 = arrd.length;
                        n4 = n2 * n3;
                        if (bl2) break block10;
                        if (n5 < n4) break block9;
                        for (int i2 = 0; i2 < arrd.length; ++i2) {
                            arrd[i2] = 0.0;
                            if (!bl2) {
                                if (!bl2) continue;
                            }
                            break block7;
                        }
                        if (!bl2) break block7;
                    }
                    n5 = n2;
                    n4 = n3;
                }
                arrd2 = new double[n5 * n4];
            }
            arrd = arrd2;
        }
        double d16 = 1.0;
        double d17 = 1.0;
        for (int i3 = 0; i3 < this.a; ++i3) {
            this.b[i3].a(arrd, d10, d11, n2, n3, d12 * d17 * d16, d13 * d17 * d16, 0.55 / d16);
            d17 *= d14;
            d16 *= d15;
            if (!bl2) continue;
        }
        return arrd;
    }

    public e(Random random, int n2) {
        this.a = n2;
        this.b = new s[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b[i2] = new s(random);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public double[] a(double[] arrd, double d10, double d11, int n2, int n3, double d12, double d13, double d14) {
        return this.a(arrd, d10, d11, n2, n3, d12, d13, d14, 0.5);
    }
}

