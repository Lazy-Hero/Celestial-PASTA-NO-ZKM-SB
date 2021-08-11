/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import java.util.Comparator;
import net.minecraft.W.K;
import net.minecraft.client.m.b;
import net.minecraft.client.m.f;
import net.minecraft.l.m;
import net.minecraft.w.k;

class c
implements Comparator<net.minecraft.l.f> {
    final /* synthetic */ f a;
    final /* synthetic */ b b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(net.minecraft.l.f var1_1, net.minecraft.l.f var2_2) {
        block19: {
            block17: {
                block18: {
                    block12: {
                        block15: {
                            block16: {
                                block13: {
                                    block14: {
                                        block10: {
                                            block11: {
                                                var4_3 = var1_1.a();
                                                var5_4 = var2_2.a();
                                                var6_5 = k.a(var4_3);
                                                var7_6 = k.a(var5_4);
                                                var8_7 = null;
                                                var3_8 = K.c();
                                                var9_9 = null;
                                                v0 = this.a.y;
                                                if (var3_8 == null) break block10;
                                                if (v0 != 0) break block11;
                                                var8_7 = m.a(var4_3);
                                                var9_9 = m.a(var5_4);
                                                break block12;
                                            }
                                            v0 = this.a.y;
                                        }
                                        v1 = 1;
                                        if (var3_8 == null) break block13;
                                        if (v0 != v1) break block14;
                                        var8_7 = m.c(var4_3);
                                        var9_9 = m.c(var5_4);
                                        break block12;
                                    }
                                    v0 = this.a.y;
                                    v1 = 2;
                                }
                                if (var3_8 == null) break block15;
                                if (v0 != v1) break block16;
                                var8_7 = m.b(var4_3);
                                var9_9 = m.b(var5_4);
                                break block12;
                            }
                            v0 = this.a.y;
                            v1 = 3;
                        }
                        if (var3_8 == null) ** GOTO lbl43
                        if (v0 == v1) {
                            var8_7 = m.f(var4_3);
                            var9_9 = m.f(var5_4);
                        } else {
                            v0 = this.a.y;
                            v1 = 4;
lbl43:
                            // 2 sources

                            if (v0 == v1) {
                                var8_7 = m.e(var4_3);
                                var9_9 = m.e(var5_4);
                            }
                        }
                    }
                    v2 = var8_7;
                    if (var3_8 == null) break block17;
                    if (v2 != null) break block18;
                    v2 = var9_9;
                    if (var3_8 == null) break block17;
                    if (v2 == null) break block19;
                }
                v2 = var8_7;
            }
            if (var3_8 != null) {
                if (v2 == null) {
                    return 1;
                }
                v2 = var9_9;
            }
            if (v2 == null) {
                return -1;
            }
            var10_10 = net.minecraft.client.m.b.p(this.a.D).a(var8_7);
            var11_11 = net.minecraft.client.m.b.p(this.a.D).a(var9_9);
            v3 = var10_10;
            v4 = var11_11;
            if (var3_8 == null) return v3 - v4;
            if (v3 != v4) {
                return (var10_10 - var11_11) * this.a.A;
            }
        }
        v3 = var6_5;
        v4 = var7_6;
        return v3 - v4;
    }

    c(f f10, b b10) {
        this.a = f10;
        this.b = b10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

