/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aC;
import net.minecraft.T.aa;
import net.minecraft.T.ao;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.d;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.z.i;

class T
extends S {
    final /* synthetic */ ao g;

    @Override
    protected d g() {
        return E.d3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(double var1_1, double var3_2, double var5_3, double var7_4, float var9_5, int var10_6) {
        var12_7 = new n(var1_1, var7_4, var3_2);
        var13_8 = false;
        var14_9 = 0.0;
        var11_10 = S.f();
        block0: while (true) {
            block6: {
                block7: {
                    block8: {
                        if (this.g.aG.f(var12_7, true)) break block6;
                        v0 = this.g.aG.f(var12_7.k(), true) ? 1 : 0;
                        if (var11_10 == null) ** GOTO lbl26
                        if (v0 == 0) break block6;
                        v1 = this.g.aG.a(var12_7);
                        if (var11_10 == null) break block7;
                        if (v1) break block8;
                        var16_11 = this.g.aG.d(var12_7);
                        var17_12 = var16_11.d(this.g.aG, var12_7);
                        if (var11_10 == null) break block7;
                        if (var17_12 != null) {
                            var14_9 = var17_12.a;
                        }
                    }
                    v1 = var13_8 = true;
                }
                if (var11_10 != null) break;
            }
            var12_7 = var12_7.k();
            do {
                v0 = var12_7.b();
lbl26:
                // 2 sources

                if (v0 >= h.f(var5_3) - 1) continue block0;
            } while (var11_10 == null);
            break;
        }
        if (var13_8 == false) return;
        var16_11 = new i(this.g.aG, var1_1, (double)var12_7.b() + var14_9, var3_2, var9_5, var10_6, this.g);
        this.g.aG.f((x)var16_11);
    }

    @Override
    protected int d() {
        return 100;
    }

    @Override
    protected int a() {
        return 40;
    }

    @Override
    protected void e() {
        block10: {
            double d10;
            float f10;
            double d11;
            double d12;
            int[] arrn;
            block11: {
                double d13;
                block12: {
                    float f11;
                    block9: {
                        B b10 = this.g.J();
                        arrn = S.f();
                        d12 = Math.min(b10.aF, this.g.aF);
                        d11 = Math.max(b10.aF, this.g.aF) + 1.0;
                        f10 = (float)h.a(b10.ax - this.g.ax, b10.a - this.g.a);
                        double d14 = this.g.s(b10) - 9.0;
                        d13 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        if (arrn == null) break block11;
                        if (d13 >= 0) break block12;
                        for (d10 = 0.0; d10 < 5; ++d10) {
                            f11 = f10 + (float)d10 * (float)Math.PI * 0.4f;
                            this.a(this.g.a + (double)h.c(f11) * 1.5, this.g.ax + (double)h.g(f11) * 1.5, d12, d11, f11, 0);
                            if (arrn != null) {
                                if (arrn != null) continue;
                            }
                            break block9;
                        }
                        d10 = 0.0;
                    }
                    while (d10 < 8) {
                        f11 = f10 + (float)d10 * (float)Math.PI * 2.0f / 8.0f + 1.2566371f;
                        this.a(this.g.a + (double)h.c(f11) * 2.5, this.g.ax + (double)h.g(f11) * 2.5, d12, d11, f11, 3);
                        ++d10;
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block10;
                    }
                    if (arrn != null) break block10;
                }
                d13 = d10 = 0.0;
            }
            while (d10 < 16) {
                double d15 = 1.25 * (double)(d10 + true);
                int n2 = 1 * d10;
                this.a(this.g.a + (double)h.c(f10) * d15, this.g.ax + (double)h.g(f10) * d15, d12, d11, f10, n2);
                ++d10;
                if (arrn != null) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private T(ao ao2) {
        this.g = ao2;
        super(ao2);
    }

    T(ao ao2, aa aa2) {
        this(ao2);
    }

    @Override
    protected aC b() {
        return aC.FANGS;
    }
}

