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

public class b
implements k {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = i.b();
        int n4 = n2;
        int n5 = 3;
        if (arrm == null) {
            if (n4 < n5) return 0 != 0;
            n4 = n3;
            if (arrm != null) return n4 != 0;
            n5 = 3;
        }
        if (n4 < n5) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        int n2;
        m[] arrm;
        int n3;
        block8: {
            n3 = 0;
            d d10 = d.m;
            arrm = i.b();
            int n4 = 0;
            while (n4 < m2.e()) {
                block9: {
                    block10: {
                        net.minecraft.w.k k2;
                        block11: {
                            d d11;
                            block12: {
                                d11 = m2.a(n4);
                                if (arrm != null) break block9;
                                n2 = d11.G() ? 1 : 0;
                                if (arrm != null) break block8;
                                if (n2 != 0) break block10;
                                k2 = d11.w();
                                if (arrm != null) break block11;
                                if (k2 != h.a9) break block12;
                                d d12 = d10;
                                if (arrm == null) {
                                    if (!d12.G()) {
                                        return false;
                                    }
                                    d12 = d10 = d11;
                                }
                                if (arrm == null) break block10;
                            }
                            k2 = d11.w();
                        }
                        if (k2 != h.Y) {
                            return false;
                        }
                        ++n3;
                    }
                    ++n4;
                }
                if (arrm == null) continue;
            }
            n2 = d10.G();
        }
        if (arrm == null) {
            if (n2 != 0) return 0 != 0;
            n2 = n3;
        }
        if (arrm != null) return n2 != 0;
        if (n2 <= 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public d d() {
        return d.m;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        d d10;
        block18: {
            block19: {
                d d11;
                block21: {
                    boolean bl2;
                    d d12;
                    d d13;
                    block20: {
                        boolean bl3;
                        m[] arrm;
                        int n2;
                        block11: {
                            n2 = 0;
                            arrm = i.b();
                            d13 = d.m;
                            int n3 = 0;
                            while (n3 < m2.e()) {
                                block12: {
                                    block13: {
                                        block17: {
                                            d d14;
                                            block16: {
                                                net.minecraft.w.k k2;
                                                block14: {
                                                    d d15;
                                                    block15: {
                                                        d15 = m2.a(n3);
                                                        if (arrm != null) break block12;
                                                        bl3 = d15.G();
                                                        if (arrm != null) break block11;
                                                        if (bl3) break block13;
                                                        k2 = d15.w();
                                                        if (arrm != null) break block14;
                                                        if (k2 != h.a9) break block15;
                                                        d d16 = d13;
                                                        if (arrm == null) {
                                                            if (!d16.G()) {
                                                                return d.m;
                                                            }
                                                            d16 = d13 = d15;
                                                        }
                                                        if (arrm == null) break block13;
                                                    }
                                                    d14 = d15;
                                                    if (arrm != null) break block16;
                                                    k2 = d14.w();
                                                }
                                                if (k2 == h.Y) break block17;
                                                d14 = d.m;
                                            }
                                            return d14;
                                        }
                                        ++n2;
                                    }
                                    ++n3;
                                }
                                if (arrm == null) continue;
                            }
                            d10 = d13;
                            if (arrm != null) break block18;
                            bl3 = d10.G();
                        }
                        if (bl3 || n2 < true) break block19;
                        d12 = new d(h.a9, n2 + 1, d13.d());
                        bl2 = d13.c();
                        if (arrm != null) break block20;
                        if (bl2) {
                            d12.d(d13.g());
                        }
                        d11 = d13;
                        if (arrm != null) break block21;
                        bl2 = d11.x();
                    }
                    if (bl2) {
                        d12.b(d13.v());
                    }
                    d11 = d12;
                }
                return d11;
            }
            d10 = d.m;
        }
        return d10;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), d.m);
        int n2 = 0;
        m[] arrm = i.b();
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
}

