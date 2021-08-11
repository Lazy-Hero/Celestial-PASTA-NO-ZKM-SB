/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.a4;
import net.minecraft.ao.aZ;
import net.minecraft.ao.am;
import net.minecraft.ao.b;
import net.minecraft.ao.h;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class ab
extends am {
    private /* synthetic */ int k;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("Length", this.k);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.m("Length");
    }

    public ab(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
        this.k = Math.max(b10.f(), b10.a());
    }

    public ab() {
    }

    public static b a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2) {
        int n5 = 7 * net.minecraft.k.h.a(random, 3, 5);
        String[] arrstring = u.b();
        while (n5 >= 7) {
            b b10 = b.a(n2, n3, n4, 0, 0, 0, 3, 3, n5, aA2);
            if (arrstring != null) {
                if (u.a(list, b10) == null) {
                    return b10;
                }
                n5 -= 7;
            }
            if (arrstring != null) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(u var1_1, List<u> var2_2, Random var3_3) {
        block28: {
            var5_4 = 0;
            var4_5 = u.b();
            var6_6 = var3_3.nextInt(5);
            while (var6_6 < this.k - 8) {
                block29: {
                    var7_8 = this.b((a4)var1_1, var2_2, var3_3, 0, var6_6);
                    if (var4_5 == null) break block29;
                    v0 = var7_8;
                    if (var4_5 == null) ** GOTO lbl23
                    if (v0 != null) {
                        var6_6 += Math.max(var7_8.e.f(), var7_8.e.a());
                        var5_4 = 1;
                    }
                    var6_6 += 2 + var3_3.nextInt(5);
                }
                if (var4_5 != null) continue;
            }
            var6_6 = var3_3.nextInt(5);
            while (var6_6 < this.k - 8) {
                block30: {
                    v1 = this;
                    if (var4_5 == null) break block28;
                    var7_8 = v1.a((a4)var1_1, var2_2, var3_3, 0, var6_6);
                    if (var4_5 == null) break block30;
                    v0 = var7_8;
lbl23:
                    // 2 sources

                    if (v0 != null) {
                        var6_6 += Math.max(var7_8.e.f(), var7_8.e.a());
                        var5_4 = 1;
                    }
                    var6_6 += 2 + var3_3.nextInt(5);
                }
                if (var4_5 != null) continue;
            }
            v1 = this;
        }
        var6_7 = v1.e();
        v2 = var5_4;
        if (var4_5 != null) {
            if (v2 != 0) {
                v2 = var3_3.nextInt(3);
                if (var4_5 != null) {
                    if (v2 > 0 && var6_7 != null) {
                        switch (aZ.a[var6_7.ordinal()]) {
                            default: {
                                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.c - 1, this.e.e, this.e.f, aA.WEST, this.d());
                                if (var4_5 != null) ** break;
                            }
                            case 2: {
                                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.c - 1, this.e.e, this.e.d - 2, aA.WEST, this.d());
                                if (var4_5 != null) ** break;
                            }
                            case 3: {
                                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.c, this.e.e, this.e.f - 1, aA.NORTH, this.d());
                                if (var4_5 != null) ** break;
                            }
                            case 4: {
                                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.a - 2, this.e.e, this.e.f - 1, aA.NORTH, this.d());
                                ** break;
                            }
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 7 sources

            {
                v2 = var5_4;
            }
        }
        if (var4_5 != null) {
            if (v2 == 0) return;
            v2 = var3_3.nextInt(3);
        }
        if (v2 <= 0) return;
        if (var6_7 == null) return;
        switch (aZ.a[var6_7.ordinal()]) {
            default: {
                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.a + 1, this.e.e, this.e.f, aA.EAST, this.d());
                if (var4_5 != null) return;
            }
            case 2: {
                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.a + 1, this.e.e, this.e.d - 2, aA.EAST, this.d());
                if (var4_5 != null) return;
            }
            case 3: {
                net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.c, this.e.e, this.e.d + 1, aA.SOUTH, this.d());
                if (var4_5 != null) return;
            }
            case 4: 
        }
        net.minecraft.ao.h.a((a4)var1_1, var2_2, var3_3, this.e.a - 2, this.e.e, this.e.d + 1, aA.SOUTH, this.d());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, b var3_3) {
        var5_4 = this.a(g.ci.d());
        var4_5 = u.b();
        var6_6 = this.a(g.cB.d());
        var7_7 = this.a(g.di.d());
        var8_8 = this.a(g.cW.d());
        var9_9 = this.e.c;
        do {
            v0 = var9_9;
            block1: while (true) {
                if (v0 > this.e.a) return (boolean)1;
                v1 = this.e.f;
                if (var4_5 == null) return (boolean)v1;
                var10_10 = v1;
                while (var10_10 <= this.e.d) {
                    block16: {
                        block17: {
                            var11_11 = new n(var9_9, 64, var10_10);
                            if (var4_5 == null) break block16;
                            v0 = var3_3.a(var11_11) ? 1 : 0;
                            if (var4_5 == null) continue block1;
                            if (v0 == 0) break block17;
                            var11_11 = var1_1.c(var11_11).k();
                            v2 = var11_11.b();
                            v3 = var1_1.y();
                            if (var4_5 == null) ** GOTO lbl29
                            if (v2 < v3) {
                                var11_11 = new n(var11_11.e(), var1_1.y() - 1, var11_11.a());
                            }
                            do {
                                block25: {
                                    block23: {
                                        block24: {
                                            block22: {
                                                block21: {
                                                    block20: {
                                                        block18: {
                                                            block19: {
                                                                v2 = var11_11.b();
                                                                v3 = var1_1.y() - 1;
lbl29:
                                                                // 2 sources

                                                                if (v2 < v3) break;
                                                                var12_12 = var1_1.d(var11_11);
                                                                if (var4_5 == null) break block16;
                                                                v4 = var12_12;
                                                                if (var4_5 == null) break block18;
                                                                if (v4.b() != g.aU) break block19;
                                                                v5 = var1_1.a(var11_11.a());
                                                                if (var4_5 != null) {
                                                                    if (v5) {
                                                                        var1_1.a(var11_11, var5_4, 2);
                                                                        if (var4_5 != null) break;
                                                                    } else {
                                                                        ** GOTO lbl42
                                                                    }
                                                                }
                                                                break block20;
                                                            }
                                                            v4 = var12_12;
                                                        }
                                                        if (var4_5 == null) break block21;
                                                        v5 = v4.o().b();
                                                    }
                                                    if (v5) {
                                                        var1_1.a(var11_11, var6_6, 2);
                                                        if (var4_5 != null) break;
                                                    }
                                                    v4 = var12_12;
                                                }
                                                v6 = v4.b();
                                                v7 /* !! */  = g.aO;
                                                if (var4_5 == null) break block22;
                                                if (v6 == v7 /* !! */ ) break block23;
                                                v6 = var12_12.b();
                                                v7 /* !! */  = g.bC;
                                            }
                                            if (var4_5 == null) break block24;
                                            if (v6 == v7 /* !! */ ) break block23;
                                            v6 = var12_12.b();
                                            v7 /* !! */  = g.aQ;
                                        }
                                        if (v6 != v7 /* !! */ ) break block25;
                                    }
                                    var1_1.a(var11_11, var7_7, 2);
                                    var1_1.a(var11_11.k(), var8_8, 2);
                                    if (var4_5 != null) break;
                                }
                                var11_11 = var11_11.k();
                            } while (var4_5 != null);
                        }
                        ++var10_10;
                    }
                    if (var4_5 != null) continue;
                }
                break;
            }
            ++var9_9;
        } while (var4_5 != null);
        return (boolean)1;
    }
}

