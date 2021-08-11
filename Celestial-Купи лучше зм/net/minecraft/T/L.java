/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.a3;
import net.minecraft.W.b8;
import net.minecraft.ak.h;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class L
extends h {
    private /* synthetic */ int d;
    private final /* synthetic */ a3 c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void c() {
        block3: {
            block2: {
                int[] arrn = S.f();
                L l2 = this;
                if (arrn == null) break block2;
                if (l2.d != 0) break block3;
                l2 = this;
            }
            l2.d = 20;
        }
    }

    public L(a3 a32) {
        this.c = a32;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        --this.d;
        var1_1 = S.f();
        v0 = this;
        if (var1_1 != null) {
            if (v0.d > 0) return;
            v0 = this;
        }
        var2_2 = v0.c.aG;
        var3_3 = this.c.f();
        var4_4 = new n(this.c);
        var5_5 = 0;
        do {
            block15: {
                block14: {
                    if (var5_5 > 5) return;
                    v1 = var5_5;
                    if (var1_1 != null) {
                        if (v1 < -5) return;
                        v1 = var6_6 = 0;
                    }
                    while (var6_6 <= 10) {
                        block17: {
                            block16: {
                                v2 = var6_6;
                                if (var1_1 == null) break block14;
                                v3 = -10;
                                if (var1_1 == null) break block15;
                                if (v2 < v3) break;
                                var7_7 = 0;
                                while (var7_7 <= 10) {
                                    block21: {
                                        block18: {
                                            block19: {
                                                block20: {
                                                    v4 = var7_7;
                                                    if (var1_1 == null) break block16;
                                                    v5 = -10;
                                                    if (var1_1 == null) break block17;
                                                    if (v4 < v5) break;
                                                    var8_8 = var4_4.a(var6_6, var5_5, var7_7);
                                                    var9_9 = var2_2.d(var8_8);
                                                    if (var9_9.b() != g.be) break block18;
                                                    v6 = var2_2.M().c("mobGriefing");
                                                    if (var1_1 == null) break block19;
                                                    if (!v6) break block20;
                                                    var2_2.a(var8_8, true);
                                                    if (var1_1 != null) break block19;
                                                }
                                                v6 = var2_2.a(var8_8, var9_9.b(b8.z).d(), 3);
                                            }
                                            v7 = var3_3.nextBoolean() ? 1 : 0;
                                            if (var1_1 != null) {
                                                if (v7 != 0) {
                                                    return;
                                                } else {
                                                    ** GOTO lbl47
                                                }
                                            }
                                            break block21;
                                        }
                                        v7 = var7_7;
                                    }
                                    if (var1_1 != null) {
                                        v7 = v7 <= 0 ? 1 : 0;
                                    }
                                    var7_7 = v7 - var7_7;
                                    if (var1_1 != null) continue;
                                }
                                v4 = var6_6;
                            }
                            if (var1_1 != null) {
                                v4 = v4 <= 0 ? 1 : 0;
                            }
                            v5 = var6_6;
                        }
                        var6_6 = v4 - v5;
                        if (var1_1 != null) continue;
                    }
                    v2 = var5_5;
                }
                if (var1_1 != null) {
                    v2 = v2 <= 0 ? 1 : 0;
                }
                v3 = var5_5;
            }
            var5_5 = v2 - v3;
        } while (var1_1 != null);
    }

    @Override
    public boolean c() {
        int[] arrn = S.f();
        boolean bl2 = this.d;
        if (arrn != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }
}

