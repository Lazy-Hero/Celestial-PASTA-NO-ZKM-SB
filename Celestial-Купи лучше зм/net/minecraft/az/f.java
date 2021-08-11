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
import net.minecraft.w.a4;
import net.minecraft.w.d;

public class f
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

    @Override
    public boolean b() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public d a(net.minecraft.B.m m2) {
        d d10;
        block17: {
            int n2;
            int n3;
            m[] arrm;
            d d11;
            int n4;
            block18: {
                boolean bl2;
                block12: {
                    n4 = 0;
                    d11 = d.m;
                    arrm = i.b();
                    int n5 = 0;
                    while (n5 < m2.e()) {
                        block13: {
                            block14: {
                                d d12;
                                net.minecraft.w.k k2;
                                net.minecraft.w.k k3;
                                block15: {
                                    d d13;
                                    block16: {
                                        d13 = m2.a(n5);
                                        if (arrm != null) break block13;
                                        bl2 = d13.G();
                                        if (arrm != null) break block12;
                                        if (bl2) break block14;
                                        k3 = d13.w();
                                        k2 = h.as;
                                        if (arrm != null) break block15;
                                        if (k3 != k2) break block16;
                                        d d14 = d11;
                                        if (arrm == null) {
                                            if (!d14.G()) {
                                                return d.m;
                                            }
                                            d14 = d11 = d13;
                                        }
                                        if (arrm == null) break block14;
                                    }
                                    d12 = d13;
                                    if (arrm != null) return d12;
                                    k3 = d12.w();
                                    k2 = h.a5;
                                }
                                if (k3 != k2) {
                                    d12 = d.m;
                                    return d12;
                                }
                                ++n4;
                            }
                            ++n5;
                        }
                        if (arrm == null) continue;
                    }
                    d10 = d11;
                    if (arrm != null) return d10;
                    bl2 = d10.G();
                }
                if (bl2) break block17;
                d10 = d11;
                if (arrm != null) return d10;
                if (!d10.x()) break block17;
                n3 = n4;
                n2 = 1;
                if (arrm != null) break block18;
                if (n3 < n2) break block17;
                d10 = d11;
                if (arrm != null) return d10;
                n3 = a4.a(d10);
                n2 = 2;
            }
            if (n3 < n2) {
                d d15 = new d(h.as, n4);
                d15.b(d11.v().c());
                d15.v().b("generation", a4.a(d11) + 1);
                d d16 = d11;
                if (arrm != null) return d16;
                if (d16.c()) {
                    d15.d(d11.g());
                }
                d16 = d15;
                return d16;
            }
        }
        d10 = d.m;
        return d10;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), d.m);
        m[] arrm = i.b();
        int n2 = 0;
        while (n2 < a22.size()) {
            d d10 = m2.a(n2);
            if (arrm == null) {
                if (d10.w() instanceof a4) {
                    d d11 = d10.C();
                    d11.c(1);
                    a22.set(n2, d11);
                    if (arrm == null) break;
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        int n2;
        d d10;
        m[] arrm;
        int n3;
        block9: {
            n3 = 0;
            arrm = i.b();
            d10 = d.m;
            int n4 = 0;
            while (n4 < m2.e()) {
                block10: {
                    block11: {
                        net.minecraft.w.k k2;
                        net.minecraft.w.k k3;
                        block12: {
                            d d11;
                            block13: {
                                d11 = m2.a(n4);
                                if (arrm != null) break block10;
                                n2 = d11.G();
                                if (arrm != null) break block9;
                                if (n2 != 0) break block11;
                                k3 = d11.w();
                                k2 = h.as;
                                if (arrm != null) break block12;
                                if (k3 != k2) break block13;
                                d d12 = d10;
                                if (arrm == null) {
                                    if (!d12.G()) {
                                        return false;
                                    }
                                    d12 = d10 = d11;
                                }
                                if (arrm == null) break block11;
                            }
                            k3 = d11.w();
                            k2 = h.a5;
                        }
                        if (k3 != k2) {
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
            n2 = d10.x();
        }
        if (arrm == null) {
            if (n2 == 0) return 0 != 0;
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

    private static gP a(gP gP2) {
        return gP2;
    }
}

