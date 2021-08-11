/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.a0;
import net.minecraft.U.M;
import net.minecraft.ak.an;
import net.minecraft.ak.ao;
import net.minecraft.ak.d;
import net.minecraft.k.h;

class e
extends d {
    private final /* synthetic */ a0 i;

    public e(a0 a02) {
        super(a02);
        this.i = a02;
    }

    @Override
    public void a() {
        block8: {
            a0 a02;
            block7: {
                e e10;
                block5: {
                    block6: {
                        int[] arrn = S.f();
                        e10 = this;
                        if (arrn == null) break block5;
                        if (e10.a != an.MOVE_TO) break block6;
                        a02 = this.i;
                        if (arrn == null) break block7;
                        if (a02.l().o()) break block6;
                        double d10 = this.h - this.i.a;
                        double d11 = this.b - this.i.aF;
                        double d12 = this.g - this.i.ax;
                        double d13 = net.minecraft.k.h.e(d10 * d10 + d11 * d11 + d12 * d12);
                        float f10 = (float)(net.minecraft.k.h.a(d12, d10) * 57.29577951308232) - 90.0f;
                        this.i.bf = this.i.e = this.a(this.i.e, f10, 90.0f);
                        float f11 = (float)(this.f * this.i.a(M.d).d());
                        this.i.g(this.i.aa() + (f11 - this.i.aa()) * 0.125f);
                        double d14 = Math.sin((double)(this.i.H + this.i.W()) * 0.5) * 0.05;
                        double d15 = Math.cos(this.i.e * ((float)Math.PI / 180));
                        double d16 = Math.sin(this.i.e * ((float)Math.PI / 180));
                        this.i.aq += d14 * d15;
                        this.i.d += d14 * d16;
                        d14 = Math.sin((double)(this.i.H + this.i.W()) * 0.75) * 0.05;
                        this.i.G += d14 * (d16 + d15) * 0.25;
                        this.i.G += (double)this.i.aa() * (d11 /= d13) * 0.1;
                        ao ao2 = this.i.I();
                        double d17 = this.i.a + d10 / d13 * 2.0;
                        double d18 = (double)this.i.l() + this.i.aF + d11 / d13;
                        double d19 = this.i.ax + d12 / d13 * 2.0;
                        double d20 = ao2.a();
                        double d21 = ao2.b();
                        double d22 = ao2.d();
                        ao ao3 = ao2;
                        if (arrn != null) {
                            if (!ao3.e()) {
                                d20 = d17;
                                d21 = d18;
                                d22 = d19;
                            }
                            ao3 = this.i.I();
                        }
                        ao3.a(d20 + (d17 - d20) * 0.125, d21 + (d18 - d21) * 0.125, d22 + (d19 - d22) * 0.125, 10.0f, 40.0f);
                        a0.a(this.i, true);
                        if (arrn != null) break block8;
                    }
                    this.i.g(0.0f);
                    e10 = this;
                }
                a02 = e10.i;
            }
            a0.a(a02, false);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

