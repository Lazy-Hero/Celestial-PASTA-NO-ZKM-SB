/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ak.an;
import net.minecraft.ak.d;
import net.minecraft.ak.h;

public class e
extends d {
    public e(C c10) {
        super(c10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        block7: {
            block8: {
                block11: {
                    block9: {
                        block10: {
                            var1_1 = net.minecraft.ak.h.h();
                            v0 = this;
                            if (var1_1 != null) break block7;
                            if (v0.a != an.MOVE_TO) break block8;
                            this.a = an.WAIT;
                            this.e.i(true);
                            var2_2 = this.h - this.e.a;
                            var4_3 = this.b - this.e.aF;
                            var6_4 = this.g - this.e.ax;
                            v1 = var8_5 = var2_2 * var2_2 + var4_3 * var4_3 + var6_4 * var6_4;
                            v2 = 2.500000277905201E-7;
                            if (var1_1 == null) {
                                if (v1 < v2) {
                                    this.e.k(0.0f);
                                    this.e.c(0.0f);
                                    return;
                                }
                                v1 = net.minecraft.k.h.a(var6_4, var2_2);
                                v2 = 57.29577951308232;
                            }
                            var10_6 = (float)(v1 * v2) - 90.0f;
                            this.e.e = this.a(this.e.e, var10_6, 10.0f);
                            v3 = this;
                            if (var1_1 != null) break block9;
                            if (!v3.e.A) break block10;
                            var11_7 = (float)(this.f * this.e.a(M.d).d());
                            if (var1_1 == null) break block11;
                        }
                        v3 = this;
                    }
                    var11_7 = (float)(v3.f * this.e.a(M.c).d());
                }
                this.e.g(var11_7);
                var12_8 = net.minecraft.k.h.e(var2_2 * var2_2 + var6_4 * var6_4);
                var14_9 = (float)(-(net.minecraft.k.h.a(var4_3, var12_8) * 57.29577951308232));
                v4 = this.e;
                v5 = this.a(this.e.at, var14_9, 10.0f);
                if (var1_1 != null) ** GOTO lbl43
                v4.at = v5;
                v4 = this.e;
                if (var4_3 > 0.0) {
                    v6 = var11_7;
                } else {
                    v5 = var11_7;
lbl43:
                    // 2 sources

                    v6 = -v5;
                }
                v4.k(v6);
                if (var1_1 == null) return;
            }
            this.e.i(false);
            this.e.k(0.0f);
            v0 = this;
        }
        v0.e.c(0.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

