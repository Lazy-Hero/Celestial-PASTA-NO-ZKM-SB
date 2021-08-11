/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.aA.b;
import net.minecraft.aA.c;
import net.minecraft.aA.h;

public class d
extends b {
    private final /* synthetic */ c[] a;
    private final /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public double[] a(double[] arrd, int n2, int n3, int n4, int n5, int n6, int n7, double d10, double d11, double d12) {
        boolean bl2;
        block6: {
            block5: {
                block4: {
                    bl2 = h.a();
                    double[] arrd2 = arrd;
                    if (bl2) break block4;
                    if (arrd2 != null) break block5;
                    arrd2 = arrd = new double[n5 * n6 * n7];
                }
                if (!bl2) break block6;
            }
            for (int i2 = 0; i2 < arrd.length; ++i2) {
                arrd[i2] = 0.0;
                if (!bl2) continue;
            }
        }
        double d13 = 1.0;
        for (int i3 = 0; i3 < this.b; ++i3) {
            double d14 = (double)n2 * d13 * d10;
            double d15 = (double)n3 * d13 * d11;
            double d16 = (double)n4 * d13 * d12;
            long l2 = net.minecraft.k.h.g(d14);
            long l3 = net.minecraft.k.h.g(d16);
            d14 -= (double)l2;
            d16 -= (double)l3;
            this.a[i3].a(arrd, d14 += (double)(l2 %= 0x1000000L), d15, d16 += (double)(l3 %= 0x1000000L), n5, n6, n7, d10 * d13, d11 * d13, d12 * d13, d13);
            d13 /= 2.0;
            if (!bl2) continue;
        }
        return arrd;
    }

    public d(Random random, int n2) {
        this.b = n2;
        this.a = new c[n2];
        boolean bl2 = h.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = new c(random);
            if (!bl2) continue;
        }
    }

    public double[] a(double[] arrd, int n2, int n3, int n4, int n5, double d10, double d11, double d12) {
        return this.a(arrd, n2, 10, n3, n4, 1, n5, d10, 1.0, d11);
    }
}

