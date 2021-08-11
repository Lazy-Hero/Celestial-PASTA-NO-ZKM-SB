/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aS;
import net.minecraft.U.B;
import net.minecraft.ak.an;
import net.minecraft.ak.d;
import net.minecraft.k.h;

class g
extends d {
    final /* synthetic */ aS i;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        block3: {
            B b10;
            block6: {
                block7: {
                    int[] arrn;
                    block4: {
                        double d10;
                        double d11;
                        double d12;
                        double d13;
                        block5: {
                            g g10;
                            block2: {
                                arrn = S.f();
                                g10 = this;
                                if (arrn == null) break block2;
                                if (g10.a != an.MOVE_TO) break block3;
                                g10 = this;
                            }
                            d13 = g10.h - this.i.a;
                            d12 = this.b - this.i.aF;
                            d11 = this.g - this.i.ax;
                            d10 = d13 * d13 + d12 * d12 + d11 * d11;
                            d10 = net.minecraft.k.h.e(d10);
                            if (arrn == null) break block4;
                            if (!(d10 < this.i.m().d())) break block5;
                            this.a = an.WAIT;
                            this.i.aq *= 0.5;
                            this.i.G *= 0.5;
                            this.i.d *= 0.5;
                            if (arrn != null) break block3;
                        }
                        this.i.aq += d13 / d10 * 0.05 * this.f;
                        this.i.G += d12 / d10 * 0.05 * this.f;
                        this.i.d += d11 / d10 * 0.05 * this.f;
                    }
                    b10 = this.i.J();
                    if (arrn == null) break block6;
                    if (b10 != null) break block7;
                    this.i.bf = this.i.e = -((float)net.minecraft.k.h.a(this.i.aq, this.i.d)) * 57.295776f;
                    if (arrn != null) break block3;
                }
                b10 = this.i.J();
            }
            double d14 = b10.a - this.i.a;
            double d15 = this.i.J().ax - this.i.ax;
            this.i.bf = this.i.e = -((float)net.minecraft.k.h.a(d14, d15)) * 57.295776f;
        }
    }

    public g(aS aS2, aS aS3) {
        this.i = aS2;
        super(aS3);
    }
}

