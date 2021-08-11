/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a6;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

class D
extends s {
    private final /* synthetic */ boolean s;

    public D(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 23, 13, "");
        this.s = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                var5_5 = q.b();
                                v0 = this.l;
                                if (var5_5 != null) {
                                    if (v0 == 0) return;
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
                        ** GOTO lbl28
                    }
lbl-1000:
                    // 4 sources

                    {
                        v0 = 0;
                    }
                }
                var6_6 = v0;
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                var1_1.aN().b(a6.a());
                var7_7 = 0;
                var8_8 = 192;
                v2 = var6_6;
                if (var5_5 == null) break block15;
                if (v2 != 0) {
                    var7_7 += 23;
                }
                v3 = this;
                if (var5_5 == null) break block16;
                v2 = v3.s ? 1 : 0;
            }
            if (v2 == 0) {
                var8_8 += 13;
            }
            v3 = this;
        }
        v3.a(this.o, this.r, var7_7, var8_8, 23, 13);
    }
}

