/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.az;

import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.i;
import net.minecraft.az.k;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class c
implements k {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = i.b();
        boolean bl2 = n2 * n3;
        if (arrm == null) {
            bl2 = bl2 >= BADBOOL 2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d a(net.minecraft.B.m var1_1) {
        block16: {
            block10: {
                var3_2 = d.m;
                var2_3 = i.b();
                var4_4 = d.m;
                var5_5 = 0;
                while (var5_5 < var1_1.e()) {
                    block11: {
                        block12: {
                            block15: {
                                block13: {
                                    block14: {
                                        var6_7 = var1_1.a(var5_5);
                                        if (var2_3 != null) break block11;
                                        v0 = var6_7.G();
                                        if (var2_3 != null) break block10;
                                        if (v0) break block12;
                                        v1 = var6_7.w();
                                        v2 = h.aU;
                                        if (var2_3 != null) break block13;
                                        if (v1 != v2) break block14;
                                        var3_2 = var6_7;
                                        if (var2_3 == null) break block12;
                                    }
                                    v3 = var6_7;
                                    if (var2_3 != null) break block15;
                                    v1 = v3.w();
                                    v2 = h.cq;
                                }
                                if (v1 != v2) break block12;
                                v3 = var6_7.C();
                            }
                            var4_4 = v3;
                        }
                        ++var5_5;
                    }
                    if (var2_3 == null) continue;
                }
                v4 = var4_4;
                if (var2_3 != null) break block16;
                v0 = v4.G();
            }
            if (v0) {
                return var4_4;
            }
            v4 = var3_2;
        }
        v5 = var5_6 = v4.c("BlockEntityTag");
        if (var2_3 != null) ** GOTO lbl45
        if (v5 == null) {
            v6 = new r();
        } else {
            v5 = var5_6;
lbl45:
            // 2 sources

            v6 = v5.c();
        }
        var6_7 = v6;
        var6_7.b("Base", var3_2.d() & 15);
        var4_4.a("BlockEntityTag", (net.minecraft.P.i)var6_7);
        return var4_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        boolean bl2;
        d d10;
        m[] arrm;
        block12: {
            d d11 = d.m;
            arrm = i.b();
            d10 = d.m;
            int n2 = 0;
            while (n2 < m2.e()) {
                block13: {
                    block14: {
                        d d12;
                        d d13;
                        block17: {
                            net.minecraft.w.k k2;
                            net.minecraft.w.k k3;
                            block15: {
                                block16: {
                                    d13 = m2.a(n2);
                                    if (arrm != null) break block13;
                                    bl2 = d13.G();
                                    if (arrm != null) break block12;
                                    if (bl2) break block14;
                                    k3 = d13.w();
                                    k2 = h.aU;
                                    if (arrm != null) break block15;
                                    if (k3 != k2) break block16;
                                    d d14 = d10;
                                    if (arrm == null) {
                                        if (!d14.G()) {
                                            return false;
                                        }
                                        d14 = d10 = d13;
                                    }
                                    if (arrm == null) break block14;
                                }
                                d12 = d13;
                                if (arrm != null) break block17;
                                k3 = d12.w();
                                k2 = h.cq;
                            }
                            if (k3 != k2) {
                                return false;
                            }
                            d12 = d11;
                        }
                        if (arrm == null) {
                            if (!d12.G()) {
                                return false;
                            }
                            d12 = d13;
                        }
                        if (arrm == null) {
                            if (d12.c("BlockEntityTag") != null) {
                                return false;
                            }
                            d12 = d13;
                        }
                        d11 = d12;
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            bl2 = d11.G();
        }
        if (arrm == null) {
            if (bl2) return false;
            bl2 = d10.G();
        }
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public d d() {
        return d.m;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), d.m);
        m[] arrm = i.b();
        int n2 = 0;
        while (n2 < a22.size()) {
            d d10 = m2.a(n2);
            if (arrm == null) {
                if (d10.w().t()) {
                    a22.set(n2, new d(d10.w().s()));
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }

    @Override
    public boolean b() {
        return true;
    }
}

