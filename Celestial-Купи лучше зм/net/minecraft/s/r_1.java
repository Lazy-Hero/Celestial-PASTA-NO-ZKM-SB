/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.A.h;
import net.minecraft.S.b;
import net.minecraft.S.d;

public class r
extends d {
    private final /* synthetic */ d a;
    private final /* synthetic */ d g;

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int[] a(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = this.a.a(var1_1, var2_2, var3_3, var4_4);
        var7_6 = this.g.a(var1_1, var2_2, var3_3, var4_4);
        var8_7 = b.a(var3_3 * var4_4);
        var5_8 = d.b();
        for (var9_9 = 0; var9_9 < var3_3 * var4_4; ++var9_9) {
            block9: {
                block10: {
                    block11: {
                        block12: {
                            block14: {
                                block13: {
                                    v0 = var6_5;
                                    if (var5_8 == null) return v0;
                                    v1 = var9_9;
                                    if (var5_8 == null) break block9;
                                    if (v0[v1] == h.b(net.minecraft.u.d.e)) break block10;
                                    v2 = var6_5;
                                    v1 = var9_9;
                                    if (var5_8 == null) break block9;
                                    if (v2[v1] == h.b(net.minecraft.u.d.J)) break block10;
                                    v3 = var7_6;
                                    v4 = var9_9;
                                    if (var5_8 == null) break block11;
                                    if (v3[v4] != h.b(net.minecraft.u.d.d)) break block12;
                                    v5 = var6_5[var9_9];
                                    v6 = h.b(net.minecraft.u.d.S);
                                    if (var5_8 == null) break block13;
                                    if (v5 == v6) {
                                        var8_7[var9_9] = h.b(net.minecraft.u.d.g);
                                        if (var5_8 != null) continue;
                                    }
                                    v7 = var6_5;
                                    v8 = var9_9;
                                    if (var5_8 == null) break block14;
                                    v5 = v7[v8];
                                    v6 = h.b(net.minecraft.u.d.v);
                                }
                                if (v5 != v6) {
                                    v7 = var6_5;
                                    v8 = var9_9;
                                    if (var5_8 != null) {
                                        if (v7[v8] != h.b(net.minecraft.u.d.i)) {
                                            var8_7[var9_9] = var7_6[var9_9] & 255;
                                            if (var5_8 != null) continue;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 4 sources

                                {
                                    v7 = var8_7;
                                    v8 = var9_9;
                                }
                            }
                            v7[v8] = h.b(net.minecraft.u.d.i);
                            if (var5_8 != null) continue;
                        }
                        v3 = var8_7;
                        v4 = var9_9;
                    }
                    v3[v4] = var6_5[var9_9];
                    if (var5_8 != null) continue;
                }
                v2 = var8_7;
                v1 = var9_9;
            }
            v2[v1] = var6_5[var9_9];
            if (var5_8 != null) continue;
        }
        v0 = var8_7;
        return v0;
    }

    public r(long l2, d d10, d d11) {
        super(l2);
        this.a = d10;
        this.g = d11;
    }

    @Override
    public void a(long l2) {
        this.a.a(l2);
        this.g.a(l2);
        super.a(l2);
    }
}

