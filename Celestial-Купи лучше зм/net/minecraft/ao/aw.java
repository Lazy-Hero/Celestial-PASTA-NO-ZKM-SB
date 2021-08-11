/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.Y;
import net.minecraft.ao.b;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class aw
extends Y {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, b var3_3) {
        block35: {
            var5_4 = this.p.f[aA.NORTH.f()];
            var4_5 = u.b();
            var6_6 = this.p;
            var7_7 = var5_4.f[aA.UP.f()];
            var8_8 = var6_6.f[aA.UP.f()];
            v0 = this.p;
            if (var4_5 != null) {
                if (v0.d / 25 > 0) {
                    this.a(var1_1, var3_3, 0, 8, var5_4.c[aA.DOWN.f()]);
                    this.a(var1_1, var3_3, 0, 0, var6_6.c[aA.DOWN.f()]);
                }
                v0 = var8_8.f[aA.UP.f()];
            }
            if (var4_5 != null) {
                if (v0 == null) {
                    this.a(var1_1, var3_3, 1, 8, 1, 6, 8, 7, aw.l);
                }
                v0 = var7_7.f[aA.UP.f()];
            }
            if (v0 == null) {
                this.a(var1_1, var3_3, 1, 8, 8, 6, 8, 14, aw.l);
            }
            for (var9_9 = 1; var9_9 <= 7; ++var9_9) {
                block38: {
                    block37: {
                        block36: {
                            var10_10 = aw.n;
                            v1 = var9_9;
                            v2 = 2;
                            if (var4_5 == null) ** GOTO lbl41
                            if (var4_5 == null) break block36;
                            if (v1 == v2) break block37;
                            v3 = var9_9;
                            v4 = 6;
                        }
                        if (v3 != v4) break block38;
                    }
                    var10_10 = aw.l;
                }
                this.a(var1_1, var3_3, 0, var9_9, 0, 0, var9_9, 15, var10_10, var10_10, false);
                this.a(var1_1, var3_3, 7, var9_9, 0, 7, var9_9, 15, var10_10, var10_10, false);
                this.a(var1_1, var3_3, 1, var9_9, 0, 6, var9_9, 0, var10_10, var10_10, false);
                this.a(var1_1, var3_3, 1, var9_9, 15, 6, var9_9, 15, var10_10, var10_10, false);
                if (var4_5 != null) continue;
            }
            var9_9 = 1;
            do {
                block41: {
                    block40: {
                        block39: {
                            v1 = var9_9;
                            v2 = 7;
lbl41:
                            // 2 sources

                            if (v1 > v2) break;
                            var10_10 = aw.k;
                            v5 = var9_9;
                            if (var4_5 == null) break block35;
                            v6 = 2;
                            if (var4_5 == null) break block39;
                            if (v5 == v6) break block40;
                            v7 = var9_9;
                            v6 = 6;
                        }
                        if (v7 != v6) break block41;
                    }
                    var10_10 = aw.m;
                }
                this.a(var1_1, var3_3, 3, var9_9, 7, 4, var9_9, 8, var10_10, var10_10, false);
                ++var9_9;
            } while (var4_5 != null);
            v5 = var6_6.c[aA.SOUTH.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 3, 1, 0, 4, 2, 0, false);
            }
            v5 = var6_6.c[aA.EAST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 7, 1, 3, 7, 2, 4, false);
            }
            v5 = var6_6.c[aA.WEST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 0, 1, 3, 0, 2, 4, false);
            }
            v5 = var5_4.c[aA.NORTH.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 3, 1, 15, 4, 2, 15, false);
            }
            v5 = var5_4.c[aA.WEST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 0, 1, 11, 0, 2, 12, false);
            }
            v5 = var5_4.c[aA.EAST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 7, 1, 11, 7, 2, 12, false);
            }
            v5 = var8_8.c[aA.SOUTH.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 3, 5, 0, 4, 6, 0, false);
            }
            v5 = var8_8.c[aA.EAST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 7, 5, 3, 7, 6, 4, false);
                this.a(var1_1, var3_3, 5, 4, 2, 6, 4, 5, aw.n, aw.n, false);
                this.a(var1_1, var3_3, 6, 1, 2, 6, 3, 2, aw.n, aw.n, false);
                this.a(var1_1, var3_3, 6, 1, 5, 6, 3, 5, aw.n, aw.n, false);
            }
            v5 = var8_8.c[aA.WEST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 0, 5, 3, 0, 6, 4, false);
                this.a(var1_1, var3_3, 1, 4, 2, 2, 4, 5, aw.n, aw.n, false);
                this.a(var1_1, var3_3, 1, 1, 2, 1, 3, 2, aw.n, aw.n, false);
                this.a(var1_1, var3_3, 1, 1, 5, 1, 3, 5, aw.n, aw.n, false);
            }
            v5 = var7_7.c[aA.NORTH.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 3, 5, 15, 4, 6, 15, false);
            }
            v5 = var7_7.c[aA.WEST.f()];
        }
        if (var4_5 != null) {
            if (v5 != 0) {
                this.a(var1_1, var3_3, 0, 5, 11, 0, 6, 12, false);
                this.a(var1_1, var3_3, 1, 4, 10, 2, 4, 13, aw.n, aw.n, false);
                this.a(var1_1, var3_3, 1, 1, 10, 1, 3, 10, aw.n, aw.n, false);
                this.a(var1_1, var3_3, 1, 1, 13, 1, 3, 13, aw.n, aw.n, false);
            }
            v5 = var7_7.c[aA.EAST.f()];
        }
        if (var4_5 == null) return (boolean)v5;
        if (v5 == 0) return (boolean)1;
        this.a(var1_1, var3_3, 7, 5, 11, 7, 6, 12, false);
        this.a(var1_1, var3_3, 5, 4, 10, 6, 4, 13, aw.n, aw.n, false);
        this.a(var1_1, var3_3, 6, 1, 10, 6, 3, 10, aw.n, aw.n, false);
        this.a(var1_1, var3_3, 6, 1, 13, 6, 3, 13, aw.n, aw.n, false);
        return (boolean)1;
    }

    public aw() {
    }

    public aw(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 1, 2, 2);
    }
}

