/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aH;
import net.minecraft.U.B;
import net.minecraft.ak.i;

class o
extends i {
    final /* synthetic */ aH n;

    public o(aH aH2) {
        this.n = aH2;
        super(aH2, 1.25, true);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void g() {
        this.n.a(false);
        super.g();
    }

    @Override
    protected double a(B b10) {
        return 4.0f + b10.ad;
    }

    @Override
    protected void a(B b10, double d10) {
        block5: {
            block7: {
                o o2;
                int[] arrn;
                block9: {
                    double d11;
                    block8: {
                        block6: {
                            block3: {
                                double d12;
                                double d13;
                                block4: {
                                    d13 = this.a(b10);
                                    arrn = S.f();
                                    d11 = d10 == d13 ? 0 : (d10 < d13 ? -1 : 1);
                                    if (arrn == null) break block3;
                                    if (d11 > 0) break block4;
                                    d11 = this.g;
                                    if (arrn == null) break block3;
                                    if (d11 > 0) break block4;
                                    this.g = 20;
                                    this.k.j(b10);
                                    this.n.a(false);
                                    if (arrn != null) break block5;
                                }
                                d11 = (d12 = d10 - d13 * 2.0) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                            }
                            if (arrn == null) break block6;
                            if (d11 > 0) break block7;
                            d11 = this.g;
                        }
                        if (arrn == null) break block8;
                        if (d11 <= 0) {
                            this.n.a(false);
                            this.g = 20;
                        }
                        o2 = this;
                        if (arrn == null) break block9;
                        d11 = o2.g;
                    }
                    if (d11 > 10) break block5;
                    this.n.a(true);
                    o2 = this;
                }
                o2.n.c();
                if (arrn != null) break block5;
            }
            this.g = 20;
            this.n.a(false);
        }
    }
}

