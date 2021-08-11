/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.av;
import net.minecraft.k.h;

public class aH
extends av {
    private /* synthetic */ boolean M;
    private final /* synthetic */ float N;

    @Override
    public void i() {
        block10: {
            block12: {
                aH aH2;
                int n2;
                block11: {
                    int[] arrn;
                    block8: {
                        block9: {
                            this.q = this.b;
                            arrn = av.e();
                            this.t = this.D;
                            this.f = this.z;
                            int n3 = this.K;
                            n2 = n3;
                            this.K = n3 + 1;
                            if (arrn == null) break block8;
                            if (n2 < this.e) break block9;
                            this.c();
                            if (arrn != null) break block10;
                        }
                        this.a(3 * this.K / this.e + 5);
                        n2 = this.l ? 1 : 0;
                    }
                    if (arrn != null) {
                        if (n2 != 0) {
                            this.n = 0.0;
                            this.M = true;
                        }
                        n2 = this.M ? 1 : 0;
                    }
                    if (arrn != null) {
                        if (n2 != 0) {
                            this.n += 0.002;
                        }
                        this.a(this.s, this.n, this.I);
                        double d10 = this.D - this.t;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block11;
                    if (n2 == 0) {
                        this.s *= 1.1;
                        this.I *= 1.1;
                    }
                    this.s *= (double)0.96f;
                    this.I *= (double)0.96f;
                    aH2 = this;
                    if (arrn == null) break block12;
                    n2 = aH2.M ? 1 : 0;
                }
                if (n2 == 0) break block10;
                aH2 = this;
            }
            aH2.n *= (double)0.96f;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected aH(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.s = d13;
        this.n = d14;
        this.I = d15;
        this.B = net.minecraft.k.h.a(this.y, 0.7176471f, 0.8745098f);
        this.C = net.minecraft.k.h.a(this.y, 0.0f, 0.0f);
        this.p = net.minecraft.k.h.a(this.y, 0.8235294f, 0.9764706f);
        this.E *= 0.75f;
        this.N = this.E;
        this.e = (int)(20.0 / ((double)this.y.nextFloat() * 0.8 + 0.2));
        this.M = false;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.E = this.N * net.minecraft.k.h.c(((float)this.K + f10) / (float)this.e * 32.0f, 0.0f, 1.0f);
        super.a(i2, x2, f10, f11, f12, f13, f14, f15);
    }
}

