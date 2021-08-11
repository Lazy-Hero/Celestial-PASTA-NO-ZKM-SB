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
import net.minecraft.u.g;

public class a6
extends Y {
    public a6() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a6(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 2, 2, 2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, b var3_3) {
        this.a(var1_1, var3_3, 1, 8, 0, 14, 8, 14, a6.l);
        var5_4 = 7;
        var6_5 = a6.n;
        v0 = u.b();
        this.a(var1_1, var3_3, 0, 7, 0, 0, 7, 15, var6_5, var6_5, false);
        this.a(var1_1, var3_3, 15, 7, 0, 15, 7, 15, var6_5, var6_5, false);
        this.a(var1_1, var3_3, 1, 7, 0, 15, 7, 0, var6_5, var6_5, false);
        this.a(var1_1, var3_3, 1, 7, 15, 14, 7, 15, var6_5, var6_5, false);
        var7_6 = 1;
        var4_7 = v0;
        while (var7_6 <= 6) {
            block9: {
                block12: {
                    block13: {
                        block10: {
                            block11: {
                                v1 = a6.n;
                                if (var4_7 == null) break block10;
                                var6_5 = v1;
                                v2 = var7_6;
                                v3 = 2;
                                if (var4_7 == null) ** GOTO lbl50
                                if (v2 == v3) break block11;
                                v4 = var7_6;
                                if (var4_7 == null) break block12;
                                if (v4 != 6) break block13;
                            }
                            v1 = a6.l;
                        }
                        var6_5 = v1;
                    }
                    v4 = var8_8 = 0;
                }
                while (var8_8 <= 15) {
                    this.a(var1_1, var3_3, var8_8, var7_6, 0, var8_8, var7_6, 1, var6_5, var6_5, false);
                    this.a(var1_1, var3_3, var8_8, var7_6, 6, var8_8, var7_6, 9, var6_5, var6_5, false);
                    this.a(var1_1, var3_3, var8_8, var7_6, 14, var8_8, var7_6, 15, var6_5, var6_5, false);
                    var8_8 += 15;
                    if (var4_7 != null) {
                        if (var4_7 != null) continue;
                    }
                    break block9;
                }
                this.a(var1_1, var3_3, 1, var7_6, 0, 1, var7_6, 0, var6_5, var6_5, false);
                this.a(var1_1, var3_3, 6, var7_6, 0, 9, var7_6, 0, var6_5, var6_5, false);
                this.a(var1_1, var3_3, 14, var7_6, 0, 14, var7_6, 0, var6_5, var6_5, false);
                this.a(var1_1, var3_3, 1, var7_6, 15, 14, var7_6, 15, var6_5, var6_5, false);
                ++var7_6;
            }
            if (var4_7 != null) continue;
        }
        this.a(var1_1, var3_3, 6, 3, 6, 9, 6, 9, a6.k, a6.k, false);
        this.a(var1_1, var3_3, 7, 4, 7, 8, 5, 8, net.minecraft.u.g.a7.d(), net.minecraft.u.g.a7.d(), false);
        var7_6 = 3;
        block2: do {
            v2 = var7_6;
            v3 = 6;
lbl50:
            // 2 sources

            if (v2 > v3) break;
            v5 = 6;
            if (var4_7 == null) return (boolean)v5;
            for (var8_8 = v126355; var8_8 <= 9; var8_8 += 3) {
                this.a(var1_1, a6.m, var8_8, var7_6, 6, var3_3);
                this.a(var1_1, a6.m, var8_8, var7_6, 9, var3_3);
                if (var4_7 == null) continue block2;
                if (var4_7 != null) continue;
            }
            var7_6 += 3;
        } while (var4_7 != null);
        this.a(var1_1, var3_3, 5, 1, 6, 5, 2, 6, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 5, 1, 9, 5, 2, 9, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 10, 1, 6, 10, 2, 6, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 10, 1, 9, 10, 2, 9, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 6, 1, 5, 6, 2, 5, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 9, 1, 5, 9, 2, 5, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 6, 1, 10, 6, 2, 10, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 9, 1, 10, 9, 2, 10, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 5, 2, 5, 5, 6, 5, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 5, 2, 10, 5, 6, 10, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 10, 2, 5, 10, 6, 5, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 10, 2, 10, 10, 6, 10, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 5, 7, 1, 5, 7, 6, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 10, 7, 1, 10, 7, 6, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 5, 7, 9, 5, 7, 14, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 10, 7, 9, 10, 7, 14, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 1, 7, 5, 6, 7, 5, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 1, 7, 10, 6, 7, 10, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 9, 7, 5, 14, 7, 5, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 9, 7, 10, 14, 7, 10, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 2, 1, 2, 2, 1, 3, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 3, 1, 2, 3, 1, 2, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 13, 1, 2, 13, 1, 3, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 12, 1, 2, 12, 1, 2, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 2, 1, 12, 2, 1, 13, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 3, 1, 13, 3, 1, 13, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 13, 1, 12, 13, 1, 13, a6.n, a6.n, false);
        this.a(var1_1, var3_3, 12, 1, 13, 12, 1, 13, a6.n, a6.n, false);
        return (boolean)1;
    }
}

