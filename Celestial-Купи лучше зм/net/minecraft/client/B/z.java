/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.aK;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class z
extends s {
    private /* synthetic */ boolean s;

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a() {
        return this.s;
    }

    public void a(boolean bl2) {
        this.s = bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block17: {
            block21: {
                block19: {
                    block20: {
                        block13: {
                            block14: {
                                block18: {
                                    block15: {
                                        block16: {
                                            block12: {
                                                block11: {
                                                    block10: {
                                                        block9: {
                                                            var5_5 = q.b();
                                                            v0 = this.l;
                                                            if (var5_5 != null) {
                                                                if (v0 == 0) return;
                                                                var1_1.aN().b(net.minecraft.client.b.s.j);
                                                                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                v0 = var2_2;
                                                            }
                                                            v1 = this.o;
                                                            if (var5_5 == null) break block9;
                                                            if (v0 < v1) ** GOTO lbl-1000
                                                            v0 = var3_3;
                                                            v1 = this.r;
                                                        }
                                                        if (var5_5 == null) break block10;
                                                        if (v0 < v1) ** GOTO lbl-1000
                                                        v0 = var2_2;
                                                        v1 = this.o + this.i;
                                                    }
                                                    if (var5_5 == null) break block11;
                                                    if (v0 >= v1) ** GOTO lbl-1000
                                                    v0 = var3_3;
                                                    if (var5_5 == null) break block12;
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
                                            v2 = this.s;
                                            if (var5_5 == null) break block13;
                                            if (v2 == 0) break block14;
                                            v3 = this.h;
                                            if (var5_5 == null) break block15;
                                            if (v3 != 0) break block16;
                                            var7_7 = aK.LOCKED_DISABLED;
                                            if (var5_5 != null) break block17;
                                        }
                                        v3 = var6_6;
                                    }
                                    if (v3 == 0) break block18;
                                    var7_7 = aK.LOCKED_HOVER;
                                    if (var5_5 != null) break block17;
                                }
                                var7_7 = aK.LOCKED;
                                if (var5_5 != null) break block17;
                            }
                            v2 = this.h;
                        }
                        if (var5_5 == null) break block19;
                        if (v2 != 0) break block20;
                        var7_7 = aK.UNLOCKED_DISABLED;
                        if (var5_5 != null) break block17;
                    }
                    v2 = var6_6;
                }
                if (v2 == 0) break block21;
                var7_7 = aK.UNLOCKED_HOVER;
                if (var5_5 != null) break block17;
            }
            var7_7 = aK.UNLOCKED;
        }
        this.a(this.o, this.r, var7_7.b(), var7_7.a(), this.i, this.n);
    }

    public z(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }
}

