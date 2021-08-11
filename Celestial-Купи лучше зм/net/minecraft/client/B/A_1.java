/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.ak;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

class A
extends s {
    private final /* synthetic */ boolean s;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block19: {
            block18: {
                block17: {
                    block15: {
                        block16: {
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            var5_5 = q.b();
                                            v0 = this.l;
                                            if (var5_5 != null) {
                                                if (v0 == 0) return;
                                                var1_1.aN().b(ak.b());
                                                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                v0 = var2_2;
                                            }
                                            v1 = this.o;
                                            if (var5_5 == null) break block11;
                                            if (v0 < v1) ** GOTO lbl-1000
                                            v0 = var3_3;
                                            v1 = this.r;
                                        }
                                        if (var5_5 == null) break block12;
                                        if (v0 < v1) ** GOTO lbl-1000
                                        v0 = var2_2;
                                        v1 = this.o + this.i;
                                    }
                                    if (var5_5 == null) break block13;
                                    if (v0 >= v1) ** GOTO lbl-1000
                                    v0 = var3_3;
                                    if (var5_5 == null) break block14;
                                    v1 = this.r + this.n;
                                }
                                ** if (v0 >= v1) goto lbl-1000
lbl-1000:
                                // 1 sources

                                {
                                    v0 = 1;
                                    ** GOTO lbl30
                                }
lbl-1000:
                                // 4 sources

                                {
                                    v0 = 0;
                                }
                            }
                            var6_6 = v0;
                            var7_7 = 0;
                            var8_8 = 176;
                            v2 = this.h;
                            if (var5_5 == null) break block15;
                            if (v2 != 0) break block16;
                            var8_8 += this.i * 2;
                            if (var5_5 != null) break block17;
                        }
                        v2 = var6_6;
                    }
                    if (var5_5 == null) break block18;
                    if (v2 != 0) {
                        var8_8 += this.i;
                    }
                }
                v3 = this;
                if (var5_5 == null) break block19;
                v2 = v3.s ? 1 : 0;
            }
            if (v2 == 0) {
                var7_7 += this.n;
            }
            v3 = this;
        }
        v3.a(this.o, this.r, var8_8, var7_7, this.i, this.n);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public A(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 12, 19, "");
        this.s = bl2;
    }
}

