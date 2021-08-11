/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.av;
import net.minecraft.client.u.az;

public class a0
extends az {
    private static gP b(gP gP2) {
        return gP2;
    }

    protected a0(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        block1: {
            block3: {
                double d16;
                block2: {
                    int[] arrn;
                    block0: {
                        int[] arrn2 = av.e();
                        super(z2, d10, d11, d12);
                        this.u = 0.04f;
                        arrn = arrn2;
                        this.h();
                        double d17 = d14 - 0.0;
                        d16 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                        if (arrn == null) break block0;
                        if (d16 != false) break block1;
                        double d18 = d13 - 0.0;
                        d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block2;
                    if (d16 != false) break block3;
                    double d19 = d15 - 0.0;
                    d16 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                }
                if (d16 == false) break block1;
            }
            this.s = d13;
            this.n = d14 + 0.1;
            this.I = d15;
        }
    }
}

