/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;

public class aX
extends av {
    private final /* synthetic */ aH O;
    private /* synthetic */ int P;
    private final /* synthetic */ x M;
    private final /* synthetic */ int N;

    @Override
    public void i() {
        block10: {
            aX aX2;
            block9: {
                int n2;
                block8: {
                    int n3 = 0;
                    int[] arrn = av.e();
                    while (n3 < 16) {
                        double d10 = this.y.nextFloat() * 2.0f - 1.0f;
                        double d11 = this.y.nextFloat() * 2.0f - 1.0f;
                        double d12 = this.y.nextFloat() * 2.0f - 1.0f;
                        if (arrn != null) {
                            double d13 = d10 * d10 + d11 * d11 + d12 * d12 - 1.0;
                            n2 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                            if (arrn == null) break block8;
                            if (n2 <= 0) {
                                double d14 = this.M.a + d10 * (double)this.M.ad / 4.0;
                                double d15 = this.M.m().b + (double)(this.M.aD / 2.0f) + d11 * (double)this.M.aD / 4.0;
                                double d16 = this.M.ax + d12 * (double)this.M.ad / 4.0;
                                this.a.a(this.O, false, d14, d15, d16, d10, d11 + 0.2, d12, new int[0]);
                            }
                            ++n3;
                        }
                        if (arrn != null) continue;
                    }
                    ++this.P;
                    aX2 = this;
                    if (arrn == null) break block9;
                    n2 = aX2.P;
                }
                if (n2 < this.N) break block10;
                aX2 = this;
            }
            aX2.c();
        }
    }

    public aX(z z2, x x2, aH aH2) {
        this(z2, x2, aH2, 3);
    }

    @Override
    public int d() {
        return 3;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
    }

    public aX(z z2, x x2, aH aH2, int n2) {
        super(z2, x2.a, x2.m().b + (double)(x2.aD / 2.0f), x2.ax, x2.aq, x2.G, x2.d);
        this.M = x2;
        this.N = n2;
        this.O = aH2;
        this.i();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

