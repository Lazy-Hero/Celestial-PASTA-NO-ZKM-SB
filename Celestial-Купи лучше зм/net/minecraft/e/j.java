/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.e.e;
import net.minecraft.e.h;
import net.minecraft.e.i;
import net.minecraft.e.o;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class j
extends i {
    public void c(boolean bl2) {
        this.b.c(bl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(l var1_1, l var2_2, int var3_3, int var4_4, int var5_5) {
        var7_6 = net.minecraft.k.h.f(var1_1.e);
        var8_7 = net.minecraft.k.h.f(var1_1.d);
        var9_8 = net.minecraft.k.h.f(var1_1.b);
        var6_9 = i.g();
        var10_10 = var2_2.e - var1_1.e;
        var12_11 = var2_2.d - var1_1.d;
        var14_12 = var2_2.b - var1_1.b;
        v0 = var16_13 = var10_10 * var10_10 + var12_11 * var12_11 + var14_12 * var14_12;
        v1 = 1.0E-8;
        if (var6_9 == 0) {
            if (v0 < v1) {
                return false;
            }
            v0 = 1.0;
            v1 = Math.sqrt(var16_13);
        }
        var18_14 = v0 / v1;
        var20_15 = 1.0 / Math.abs(var10_10 *= var18_14);
        var22_16 = 1.0 / Math.abs(var12_11 *= var18_14);
        var24_17 = 1.0 / Math.abs(var14_12 *= var18_14);
        var26_18 = (double)var7_6 - var1_1.e;
        var28_19 = (double)var8_7 - var1_1.d;
        var30_20 = (double)var9_8 - var1_1.b;
        cfr_temp_0 = var10_10 - 0.0;
        v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
        if (var6_9 == 0) {
            if (v2 >= 0) {
                var26_18 += 1.0;
            }
            v2 = (cfr_temp_1 = var12_11 - 0.0) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
        }
        if (var6_9 == 0) {
            if (v2 >= 0) {
                var28_19 += 1.0;
            }
            v2 = (cfr_temp_2 = var14_12 - 0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
        }
        if (var6_9 == 0) {
            if (v2 >= 0) {
                var30_20 += 1.0;
            }
            var26_18 /= var10_10;
            var28_19 /= var12_11;
            var30_20 /= var14_12;
            cfr_temp_3 = var10_10 - 0.0;
            v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
        }
        if (var6_9 == 0) {
            v2 = v2 < 0 ? (double)-1 : (double)true;
        }
        var32_21 = v2;
        cfr_temp_4 = var12_11 - 0.0;
        v3 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
        if (var6_9 == 0) {
            v3 = v3 < 0 ? (double)-1 : (double)true;
        }
        var33_22 = v3;
        cfr_temp_5 = var14_12 - 0.0;
        v4 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
        if (var6_9 == 0) {
            v4 = v4 < 0 ? (double)-1 : (double)true;
        }
        var34_23 = v4;
        var35_24 = net.minecraft.k.h.f(var2_2.e);
        var36_25 = net.minecraft.k.h.f(var2_2.d);
        var37_26 = net.minecraft.k.h.f(var2_2.b);
        var38_27 = var35_24 - var7_6;
        var39_28 = var36_25 - var8_7;
        var40_29 = var37_26 - var9_8;
        do lbl-1000:
        // 4 sources

        {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block16: {
                                if (var38_27 * var32_21 > 0) break block16;
                                v5 = var39_28 * var33_22;
                                if (var6_9 != 0 || var6_9 != 0) break block17;
                                if (v5 <= 0) {
                                    v6 = var40_29 * var34_23;
                                    if (var6_9 != 0) return (boolean)v6;
                                    if (v6 <= 0) return (boolean)1;
                                }
                            }
                            v5 = var26_18 == var30_20 ? 0 : (var26_18 < var30_20 ? -1 : 1);
                        }
                        if (var6_9 != 0) break block18;
                        if (v5 >= 0) break block19;
                        v5 = var26_18 == var28_19 ? 0 : (var26_18 < var28_19 ? -1 : 1);
                        if (var6_9 != 0) break block18;
                        if (v5 > 0) break block19;
                        var26_18 += var20_15;
                        var38_27 = var35_24 - (var7_6 += var32_21);
                        if (var6_9 == 0) ** GOTO lbl-1000
                    }
                    v5 = var28_19 == var26_18 ? 0 : (var28_19 < var26_18 ? -1 : 1);
                }
                if (var6_9 != 0) continue;
                if (v5 >= 0) break block20;
                v5 = var28_19 == var30_20 ? 0 : (var28_19 < var30_20 ? -1 : 1);
                if (var6_9 != 0) continue;
                if (v5 > 0) break block20;
                var28_19 += var22_16;
                var39_28 = var36_25 - (var8_7 += var33_22);
                if (var6_9 == 0) ** GOTO lbl-1000
            }
            var30_20 += var24_17;
            v5 = var40_29 = var37_26 - (var9_8 += var34_23);
        } while (var6_9 == 0);
        return (boolean)1;
    }

    @Override
    public void d() {
        block7: {
            l l2;
            j j2;
            block13: {
                int n2;
                block12: {
                    int n3;
                    block11: {
                        block10: {
                            block8: {
                                block9: {
                                    boolean bl2;
                                    block6: {
                                        ++this.a;
                                        n3 = i.n();
                                        bl2 = this.l;
                                        if (n3 != 0) {
                                            if (bl2) {
                                                this.m();
                                            }
                                            bl2 = this.o();
                                        }
                                        if (n3 == 0) break block6;
                                        if (bl2) break block7;
                                        j2 = this;
                                        if (n3 == 0) break block8;
                                        bl2 = j2.h();
                                    }
                                    if (!bl2) break block9;
                                    this.e();
                                    if (n3 != 0) break block10;
                                }
                                j2 = this;
                            }
                            if (n3 == 0) break block11;
                            if (j2.c == null) break block10;
                            n2 = this.c.a();
                            if (n3 == 0) break block12;
                            if (n2 >= this.c.f()) break block10;
                            l2 = this.c.a(this.j, this.c.a());
                            n2 = net.minecraft.k.h.f(this.j.a);
                            if (n3 == 0) break block12;
                            if (n2 != net.minecraft.k.h.f(l2.e)) break block10;
                            n2 = net.minecraft.k.h.f(this.j.aF);
                            if (n3 == 0) break block12;
                            if (n2 != net.minecraft.k.h.f(l2.d)) break block10;
                            n2 = net.minecraft.k.h.f(this.j.ax);
                            if (n3 == 0) break block12;
                            if (n2 == net.minecraft.k.h.f(l2.b)) {
                                this.c.a(this.c.a() + 1);
                            }
                        }
                        this.c();
                        j2 = this;
                    }
                    if (n3 == 0) break block13;
                    n2 = j2.o();
                }
                if (n2 != 0) break block7;
                j2 = this;
            }
            l2 = j2.c.a(this.j);
            this.j.w().a(l2.e, l2.d, l2.b, this.s);
        }
    }

    public boolean a() {
        return this.b.c();
    }

    @Override
    protected l q() {
        return new l(this.j.a, this.j.aF, this.j.ax);
    }

    public void a(boolean bl2) {
        this.b.b(bl2);
    }

    @Override
    public h a(x x2) {
        return this.b(new n(x2));
    }

    @Override
    public boolean a(n n2) {
        return this.r.d(n2).d();
    }

    public void b(boolean bl2) {
        this.b.a(bl2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected o l() {
        this.b = new e();
        this.b.c(true);
        return new o(this.b);
    }

    public j(C c10, z z2) {
        super(c10, z2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean h() {
        int n2 = i.n();
        boolean bl2 = this.a();
        if (n2 != 0) {
            if (bl2) {
                bl2 = this.j();
                if (n2 == 0) return bl2;
                if (bl2) return true;
            }
            bl2 = this.j.N();
        }
        if (n2 == 0) return bl2;
        if (bl2) return false;
        return true;
    }
}

