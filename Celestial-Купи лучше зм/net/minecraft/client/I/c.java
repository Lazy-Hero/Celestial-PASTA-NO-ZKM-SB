/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.client.I.h;
import net.minecraft.client.I.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.s;

class c
extends s {
    private final /* synthetic */ int s;
    private final /* synthetic */ int u;
    private /* synthetic */ boolean t;
    private final /* synthetic */ net.minecraft.ar.v v;

    protected c(int n2, int n3, int n4, net.minecraft.ar.v v2, int n5, int n6) {
        super(n2, n3, n4, 22, 22, "");
        this.v = v2;
        this.s = n5;
        this.u = n6;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block21: {
            block20: {
                block17: {
                    block18: {
                        block19: {
                            block15: {
                                block16: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                block11: {
                                                    var5_5 = net.minecraft.client.I.v.a();
                                                    v0 = this;
                                                    if (var5_5 == null) {
                                                        if (v0.l == false) return;
                                                        var1_1.aN().b(net.minecraft.client.I.h.a());
                                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                        v0 = this;
                                                    }
                                                    v1 = var2_2;
                                                    v2 = this.o;
                                                    if (var5_5 != null) break block11;
                                                    if (v1 < v2) ** GOTO lbl-1000
                                                    v1 = var3_3;
                                                    v2 = this.r;
                                                }
                                                if (var5_5 != null) break block12;
                                                if (v1 < v2) ** GOTO lbl-1000
                                                v1 = var2_2;
                                                v2 = this.o + this.i;
                                            }
                                            if (var5_5 != null) break block13;
                                            if (v1 >= v2) ** GOTO lbl-1000
                                            v1 = var3_3;
                                            if (var5_5 != null) break block14;
                                            v2 = this.r + this.n;
                                        }
                                        ** if (v1 >= v2) goto lbl-1000
lbl-1000:
                                        // 1 sources

                                        {
                                            v1 = 1;
                                            ** GOTO lbl31
                                        }
lbl-1000:
                                        // 4 sources

                                        {
                                            v1 = 0;
                                        }
                                    }
                                    v0.a = v1;
                                    var6_6 = 219;
                                    var7_7 = 0;
                                    v3 = this.h;
                                    if (var5_5 != null) break block15;
                                    if (v3) break block16;
                                    var7_7 += this.i * 2;
                                    if (var5_5 == null) break block17;
                                }
                                v3 = this.t;
                            }
                            if (var5_5 != null) break block18;
                            if (!v3) break block19;
                            var7_7 += this.i * 1;
                            if (var5_5 == null) break block17;
                        }
                        v3 = this.a;
                    }
                    if (var5_5 != null) break block20;
                    if (v3) {
                        var7_7 += this.i * 3;
                    }
                }
                v4 = this;
                v5 = this.o;
                v6 = this.r;
                v7 = var7_7;
                v8 = 219;
                v9 = this.i;
                v10 = this.n;
                if (var5_5 != null) break block21;
                v4.a(v5, v6, v7, v8, v9, v10);
                v3 = net.minecraft.client.I.h.a().equals(this.v);
            }
            if (!v3) {
                var1_1.aN().b(this.v);
            }
            v4 = this;
            v5 = this.o + 2;
            v6 = this.r + 2;
            v7 = this.s;
            v8 = this.u;
            v9 = 18;
            v10 = 18;
        }
        v4.a(v5, v6, v7, v8, v9, v10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a() {
        return this.t;
    }

    public void a(boolean bl2) {
        this.t = bl2;
    }
}

