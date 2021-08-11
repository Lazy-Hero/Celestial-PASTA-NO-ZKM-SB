/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aZ;
import net.minecraft.U.x;
import net.minecraft.ak.an;
import net.minecraft.k.h;
import net.minecraft.k.k;

class d
extends net.minecraft.ak.d {
    private final /* synthetic */ aZ j;
    private /* synthetic */ int i;

    public d(aZ aZ2) {
        super(aZ2);
        this.j = aZ2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private boolean a(double d10, double d11, double d12, double d13) {
        boolean bl2;
        block4: {
            double d14 = (d10 - this.j.a) / d13;
            double d15 = (d11 - this.j.aF) / d13;
            int[] arrn = S.f();
            double d16 = (d12 - this.j.ax) / d13;
            k k2 = this.j.m();
            int n2 = 1;
            while ((double)n2 < d13) {
                k2 = k2.c(d14, d15, d16);
                if (arrn != null) {
                    bl2 = this.j.aG.a((x)this.j, k2).isEmpty();
                    if (arrn == null) break block4;
                    if (!bl2) {
                        return false;
                    }
                    ++n2;
                }
                if (arrn != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a() {
        block3: {
            block5: {
                d d10;
                block6: {
                    int n2;
                    double d11;
                    double d12;
                    double d13;
                    double d14;
                    int[] arrn;
                    block4: {
                        d d15;
                        block2: {
                            arrn = S.f();
                            d15 = this;
                            if (arrn == null) break block2;
                            if (d15.a != an.MOVE_TO) break block3;
                            d15 = this;
                        }
                        d14 = d15.h - this.j.a;
                        d13 = this.b - this.j.aF;
                        d12 = this.g - this.j.ax;
                        d11 = d14 * d14 + d13 * d13 + d12 * d12;
                        int n3 = this.i;
                        n2 = n3;
                        this.i = n3 - 1;
                        if (arrn == null) break block4;
                        if (n2 > 0) break block3;
                        this.i += this.j.f().nextInt(5) + 2;
                        d11 = net.minecraft.k.h.e(d11);
                        d10 = this;
                        if (arrn == null) break block5;
                        n2 = d10.a(this.h, this.b, this.g, d11) ? 1 : 0;
                    }
                    if (n2 == 0) break block6;
                    this.j.aq += d14 / d11 * 0.1;
                    this.j.G += d13 / d11 * 0.1;
                    this.j.d += d12 / d11 * 0.1;
                    if (arrn != null) break block3;
                }
                d10 = this;
            }
            d10.a = an.WAIT;
        }
    }
}

