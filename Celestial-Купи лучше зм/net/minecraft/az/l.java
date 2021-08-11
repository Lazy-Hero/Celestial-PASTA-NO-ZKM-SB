/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.az;

import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.i;
import net.minecraft.az.k;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.t;

public class l
implements k {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.B.m var1_1, z var2_2) {
        block18: {
            var4_3 = d.m;
            var3_4 = i.b();
            var5_5 = d.m;
            var6_6 = 0;
            while (var6_6 < var1_1.e()) {
                block19: {
                    block20: {
                        block25: {
                            block23: {
                                block24: {
                                    block21: {
                                        block22: {
                                            var7_7 = var1_1.a(var6_6);
                                            if (var3_4 != null) break block19;
                                            v0 = var7_7.G();
                                            if (var3_4 != null) break block18;
                                            if (v0) break block20;
                                            v1 = var7_7;
                                            if (var3_4 == null) {
                                                if (v1.w() != h.aU) {
                                                    return false;
                                                }
                                                v1 = var4_3;
                                            }
                                            if (var3_4 == null) {
                                                if (!v1.G()) {
                                                    v1 = var5_5;
                                                    if (var3_4 == null) {
                                                        if (!v1.G()) {
                                                            return false;
                                                        } else {
                                                            ** GOTO lbl-1000
                                                        }
                                                    }
                                                } else lbl-1000:
                                                // 3 sources

                                                {
                                                    v1 = var7_7;
                                                }
                                            }
                                            var8_8 = t.a(v1);
                                            v2 = net.minecraft.N.z.b(var7_7);
                                            if (var3_4 == null) {
                                                v2 = v2 > false;
                                            }
                                            var9_9 = v2;
                                            v3 = var4_3.G();
                                            if (var3_4 != null) break block21;
                                            if (v3) break block22;
                                            v4 = var9_9;
                                            if (var3_4 != null) return v4;
                                            if (v4) {
                                                return false;
                                            }
                                            if (var8_8 != t.a(var4_3)) {
                                                return false;
                                            }
                                            var5_5 = var7_7;
                                            if (var3_4 == null) break block20;
                                        }
                                        v3 = var5_5.G();
                                    }
                                    if (var3_4 != null) break block23;
                                    if (v3) break block24;
                                    v5 = var9_9;
                                    if (var3_4 != null) return v5;
                                    if (!v5) {
                                        return false;
                                    }
                                    if (var8_8 != t.a(var5_5)) {
                                        return false;
                                    }
                                    var4_3 = var7_7;
                                    if (var3_4 == null) break block20;
                                }
                                v3 = var9_9;
                            }
                            if (!v3) break block25;
                            var4_3 = var7_7;
                            if (var3_4 == null) break block20;
                        }
                        var5_5 = var7_7;
                    }
                    ++var6_6;
                }
                if (var3_4 == null) continue;
            }
            v0 = var4_3.G();
        }
        if (var3_4 == null) {
            if (v0 != false) return false;
            v0 = var5_5.G();
        }
        if (var3_4 != null) return v0;
        if (v0 != false) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), d.m);
        m[] arrm = i.b();
        int n2 = 0;
        while (n2 < a22.size()) {
            block3: {
                block4: {
                    d d10;
                    block8: {
                        int n3;
                        d d11;
                        block7: {
                            block5: {
                                block6: {
                                    d11 = m2.a(n2);
                                    if (arrm != null) break block3;
                                    if (d11.G()) break block4;
                                    n3 = d11.w().t();
                                    if (arrm != null) break block5;
                                    if (n3 == 0) break block6;
                                    a22.set(n2, new d(d11.w().s()));
                                    if (arrm == null) break block4;
                                }
                                n3 = d11.x() ? 1 : 0;
                            }
                            if (arrm != null) break block7;
                            if (n3 == 0) break block4;
                            d10 = d11;
                            if (arrm != null) break block8;
                            n3 = net.minecraft.N.z.b(d10);
                        }
                        if (n3 <= 0) break block4;
                        d10 = d11.C();
                    }
                    d d12 = d10;
                    d12.c(1);
                    a22.set(n2, d12);
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }

    @Override
    public d d() {
        return d.m;
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

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        d d10;
        block3: {
            int n2 = 0;
            m[] arrm = i.b();
            while (n2 < m2.e()) {
                block4: {
                    block5: {
                        d d11;
                        block6: {
                            d d12 = m2.a(n2);
                            if (arrm != null) break block4;
                            d10 = d12;
                            if (arrm != null) break block3;
                            if (d10.G()) break block5;
                            d11 = d12;
                            if (arrm != null) break block6;
                            if (net.minecraft.N.z.b(d11) <= 0) break block5;
                            d11 = d12.C();
                        }
                        d d13 = d11;
                        d13.c(1);
                        return d13;
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            d10 = d.m;
        }
        return d10;
    }
}

