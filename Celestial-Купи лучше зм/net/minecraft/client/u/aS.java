/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.a3;
import net.minecraft.client.u.av;

public class aS
extends a3 {
    private static gP a(gP gP2) {
        return gP2;
    }

    public aS(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        block4: {
            aS aS2;
            block2: {
                block3: {
                    super(z2, d10, d11, d12, 176, 8, -0.05f);
                    this.s = d13;
                    this.n = d14;
                    this.I = d15;
                    this.E *= 0.75f;
                    int[] arrn = av.e();
                    this.e = 60 + this.y.nextInt(12);
                    aS2 = this;
                    if (arrn == null) break block2;
                    if (aS2.y.nextInt(4) != 0) break block3;
                    this.a(0.6f + this.y.nextFloat() * 0.2f, 0.6f + this.y.nextFloat() * 0.3f, this.y.nextFloat() * 0.2f);
                    if (arrn != null) break block4;
                }
                aS2 = this;
            }
            aS2.a(0.1f + this.y.nextFloat() * 0.2f, 0.4f + this.y.nextFloat() * 0.3f, this.y.nextFloat() * 0.2f);
        }
        this.a(0.6f);
    }
}

