/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import java.util.Comparator;
import net.minecraft.W.K;
import net.minecraft.client.m.b;
import net.minecraft.client.m.e;
import net.minecraft.l.f;
import net.minecraft.l.m;
import net.minecraft.w.k;

class a
implements Comparator<f> {
    final /* synthetic */ e a;
    final /* synthetic */ b b;

    a(e e10, b b10) {
        this.a = e10;
        this.b = b10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(f var1_1, f var2_2) {
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
                                                var6_5 = null;
                                                var3_6 = K.c();
                                                var7_7 = null;
                                                v0 = this.a.y;
                                                if (var3_6 == null) break block10;
                                                if (v0 != 2) break block11;
                                                var6_5 = m.a(K.a(var4_3));
                                                var7_7 = m.a(K.a(var5_4));
                                                break block12;
                                            }
                                            v0 = this.a.y;
                                        }
                                        if (var3_6 == null) break block13;
                                        if (v0 != 0) break block14;
                                        var6_5 = m.c(var4_3);
                                        var7_7 = m.c(var5_4);
                                        break block12;
                                    }
                                    v0 = this.a.y;
                                }
                                v1 = 1;
                                if (var3_6 == null) break block15;
                                if (v0 != v1) break block16;
                                var6_5 = m.b(var4_3);
                                var7_7 = m.b(var5_4);
                                break block12;
                            }
                            v0 = this.a.y;
                            v1 = 3;
                        }
                        if (var3_6 == null) ** GOTO lbl40
                        if (v0 == v1) {
                            var6_5 = m.f(var4_3);
                            var7_7 = m.f(var5_4);
                        } else {
                            v0 = this.a.y;
                            v1 = 4;
lbl40:
                            // 2 sources

                            if (v0 == v1) {
                                var6_5 = m.e(var4_3);
                                var7_7 = m.e(var5_4);
                            }
                        }
                    }
                    v2 = var6_5;
                    if (var3_6 == null) break block17;
                    if (v2 != null) break block18;
                    v2 = var7_7;
                    if (var3_6 == null) break block17;
                    if (v2 == null) break block19;
                }
                v2 = var6_5;
            }
            if (var3_6 != null) {
                if (v2 == null) {
                    return 1;
                }
                v2 = var7_7;
            }
            if (v2 == null) {
                return -1;
            }
            var8_8 = net.minecraft.client.m.b.p(this.a.D).a(var6_5);
            var9_9 = net.minecraft.client.m.b.p(this.a.D).a(var7_7);
            v3 = var8_8;
            v4 = var9_9;
            if (var3_6 == null) return v3 - v4;
            if (v3 != v4) {
                return (var8_8 - var9_9) * this.a.A;
            }
        }
        v3 = k.a(var4_3);
        v4 = k.a(var5_4);
        return v3 - v4;
    }
}

