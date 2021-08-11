/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.W;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.client.F.f;
import net.minecraft.client.b.c;
import net.minecraft.client.w.aE;
import net.minecraft.u.g;

public class r
extends f<W> {
    private static final /* synthetic */ v a;
    private final /* synthetic */ aE g;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(W var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6, float var10_7) {
        block26: {
            block19: {
                block27: {
                    block25: {
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        block20: {
                                            v0 = net.minecraft.client.F.f.b();
                                            var12_8 = var1_1.l();
                                            net.minecraft.client.a.v.M();
                                            var11_9 = v0;
                                            var13_10 = 0.6666667f;
                                            if (var11_9 == null) break block20;
                                            if (var12_8 != net.minecraft.u.g.aR) break block21;
                                            net.minecraft.client.a.v.b((float)var2_2 + 0.5f, (float)var4_3 + 0.5f, (float)var6_4 + 0.5f);
                                        }
                                        var14_11 = (float)(var1_1.m() * 360) / 16.0f;
                                        net.minecraft.client.a.v.a(-var14_11, 0.0f, 1.0f, 0.0f);
                                        this.g.i.q = true;
                                        if (var11_9 != null) break block22;
                                    }
                                    var14_12 = var1_1.m();
                                    var15_14 = 0.0f;
                                    v1 = var14_12;
                                    v2 = 2;
                                    if (var11_9 != null) {
                                        if (v1 == v2) {
                                            var15_14 = 180.0f;
                                        }
                                        v1 = var14_12;
                                        v2 = 4;
                                    }
                                    if (var11_9 != null) {
                                        if (v1 == v2) {
                                            var15_14 = 90.0f;
                                        }
                                        v1 = var14_12;
                                        v2 = 5;
                                    }
                                    if (v1 == v2) {
                                        var15_14 = -90.0f;
                                    }
                                    net.minecraft.client.a.v.b((float)var2_2 + 0.5f, (float)var4_3 + 0.5f, (float)var6_4 + 0.5f);
                                    net.minecraft.client.a.v.a(-var15_14, 0.0f, 1.0f, 0.0f);
                                    net.minecraft.client.a.v.b(0.0f, -0.3125f, -0.4375f);
                                    this.g.i.q = false;
                                }
                                v3 = var9_6;
                                if (var11_9 == null) break block23;
                                if (v3 < 0) break block24;
                                this.b(r.c[var9_6]);
                                net.minecraft.client.a.v.q(5890);
                                net.minecraft.client.a.v.M();
                                net.minecraft.client.a.v.d(4.0f, 2.0f, 1.0f);
                                net.minecraft.client.a.v.b(0.0625f, 0.0625f, 0.0625f);
                                v3 = 5888;
                            }
                            net.minecraft.client.a.v.q(v3);
                            if (var11_9 != null) break block25;
                        }
                        this.b(r.a);
                    }
                    net.minecraft.client.a.v.q();
                    net.minecraft.client.a.v.M();
                    net.minecraft.client.a.v.d(0.6666667f, -0.6666667f, -0.6666667f);
                    this.g.a();
                    net.minecraft.client.a.v.B();
                    var14_13 = this.a();
                    var15_14 = 0.010416667f;
                    net.minecraft.client.a.v.b(0.0f, 0.33333334f, 0.046666667f);
                    net.minecraft.client.a.v.d(0.010416667f, -0.010416667f, 0.010416667f);
                    net.minecraft.client.a.v.a(0.0f, 0.0f, -0.010416667f);
                    net.minecraft.client.a.v.a(false);
                    var16_15 = 0;
                    v4 = fU.g();
                    if (var11_9 != null) {
                        if (v4 != 0) {
                            var16_15 = fa.c(var16_15);
                        }
                        v4 = var9_6;
                    }
                    if (var11_9 == null) break block26;
                    if (v4 >= 0) break block27;
                    for (var17_16 = 0; var17_16 < var1_1.k.length; ++var17_16) {
                        block28: {
                            if (var11_9 == null) break block19;
                            v5 = var1_1.k[var17_16];
                            if (var11_9 != null) {
                                if (v5 == null) continue;
                                v5 = var1_1.k[var17_16];
                            }
                            var18_17 = v5;
                            v6 /* !! */  = var19_18 = net.minecraft.client.b.c.a(var18_17, 90, var14_13, false, true);
                            if (var11_9 == null) break block28;
                            if (v6 /* !! */  == null) ** GOTO lbl-1000
                            v6 /* !! */  = var19_18;
                        }
                        if (var11_9 == null) ** GOTO lbl85
                        if (!v6 /* !! */ .isEmpty()) {
                            v6 /* !! */  = var19_18.get(0);
lbl85:
                            // 2 sources

                            v7 = ((k)v6 /* !! */ ).a();
                        } else lbl-1000:
                        // 2 sources

                        {
                            v7 = "";
                        }
                        var20_19 = v7;
                        v8 = var17_16;
                        if (var11_9 == null) continue;
                        if (v8 == var1_1.m) {
                            var20_19 = "> " + var20_19 + " <";
                            var14_13.b(var20_19, -var14_13.e(var20_19) / 2, var17_16 * 10 - var1_1.k.length * 5, var16_15);
                            if (var11_9 != null) continue;
                        }
                        v8 = var14_13.b(var20_19, -var14_13.e(var20_19) / 2, var17_16 * 10 - var1_1.k.length * 5, var16_15);
                        if (var11_9 != null) continue;
                    }
                }
                net.minecraft.client.a.v.a(true);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.B();
            }
            v4 = var9_6;
        }
        if (var11_9 != null) {
            if (v4 < 0) return;
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.B();
            v4 = 5888;
        }
        net.minecraft.client.a.v.q(v4);
    }

    public r() {
        this.g = new aE();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new v("textures/entity/sign.png");
    }
}

