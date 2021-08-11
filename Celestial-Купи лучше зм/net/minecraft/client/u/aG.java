/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;

public class aG
extends av {
    private /* synthetic */ int N;
    private final /* synthetic */ int M = 8;

    @Override
    public void i() {
        block8: {
            aG aG2;
            block7: {
                int[] arrn;
                block6: {
                    arrn = av.e();
                    for (int i2 = 0; i2 < 6; ++i2) {
                        double d10 = this.b + (this.y.nextDouble() - this.y.nextDouble()) * 4.0;
                        double d11 = this.D + (this.y.nextDouble() - this.y.nextDouble()) * 4.0;
                        double d12 = this.z + (this.y.nextDouble() - this.y.nextDouble()) * 4.0;
                        float f10 = this.N;
                        this.getClass();
                        this.a.a(aH.EXPLOSION_LARGE, d10, d11, d12, (double)(f10 / 8.0f), 0.0, 0.0, new int[0]);
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block6;
                    }
                    ++this.N;
                }
                aG2 = this;
                if (arrn == null) break block7;
                this.getClass();
                if (aG2.N != 8) break block8;
                aG2 = this;
            }
            aG2.c();
        }
    }

    protected aG(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.M = 8;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
    }

    @Override
    public int d() {
        return 1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

