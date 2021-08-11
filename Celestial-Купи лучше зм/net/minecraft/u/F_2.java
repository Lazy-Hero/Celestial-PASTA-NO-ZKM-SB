/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.c;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;

public abstract class F
extends C {
    public F(z z2) {
        super(z2);
    }

    @Override
    public void a(float f10, float f11, float f12) {
        int[] arrn;
        block9: {
            float f13;
            block13: {
                F f14;
                block12: {
                    block11: {
                        block10: {
                            F f15;
                            boolean bl2;
                            block7: {
                                block8: {
                                    arrn = net.minecraft.U.M.b();
                                    bl2 = this.aj();
                                    if (arrn == null) break block7;
                                    if (!bl2) break block8;
                                    this.a(f10, f11, f12, 0.02f);
                                    this.a(c.SELF, this.aq, this.G, this.d);
                                    this.aq *= (double)0.8f;
                                    this.G *= (double)0.8f;
                                    this.d *= (double)0.8f;
                                    if (arrn != null) break block9;
                                }
                                f15 = this;
                                if (arrn == null) break block10;
                                bl2 = f15.av();
                            }
                            if (!bl2) break block11;
                            this.a(f10, f11, f12, 0.02f);
                            this.a(c.SELF, this.aq, this.G, this.d);
                            this.aq *= 0.5;
                            this.G *= 0.5;
                            f15 = this;
                        }
                        f15.d *= 0.5;
                        if (arrn != null) break block9;
                    }
                    f13 = 0.91f;
                    f14 = this;
                    if (arrn == null) break block12;
                    if (!f14.A) break block13;
                    f14 = this;
                }
                f13 = f14.aG.d((n)new n((int)h.f((double)this.a), (int)(h.f((double)this.m().b) - 1), (int)h.f((double)this.ax))).b().x * 0.91f;
            }
            float f16 = 0.16277136f / (f13 * f13 * f13);
            this.a(f10, f11, f12, this.A ? 0.1f * f16 : 0.02f);
            f13 = 0.91f;
            F f17 = this;
            if (arrn != null) {
                if (f17.A) {
                    f13 = this.aG.d((n)new n((int)h.f((double)this.a), (int)(h.f((double)this.m().b) - 1), (int)h.f((double)this.ax))).b().x * 0.91f;
                }
                this.a(c.SELF, this.aq, this.G, this.d);
                this.aq *= (double)f13;
                this.G *= (double)f13;
                f17 = this;
            }
            f17.d *= (double)f13;
        }
        this.bR = this.a3;
        double d10 = this.a - this.N;
        double d11 = this.ax - this.k;
        float f18 = h.e(d10 * d10 + d11 * d11) * 4.0f;
        if (arrn != null) {
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            this.a3 += (f18 - this.a3) * 0.4f;
            this.bK += this.a3;
        }
    }

    @Override
    public void d(float f10, float f11) {
    }

    @Override
    protected void a(double d10, boolean bl2, i i2, n n2) {
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public boolean s() {
        return false;
    }
}

