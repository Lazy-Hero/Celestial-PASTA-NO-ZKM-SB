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

public class p
implements k {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        int n2;
        block10: {
            block11: {
                int n3;
                block9: {
                    m[] arrm = i.b();
                    n2 = m2.d();
                    if (arrm != null) break block10;
                    if (n2 != 3) break block11;
                    n2 = m2.b();
                    if (arrm != null) break block10;
                    if (n2 != 3) break block11;
                    int n4 = 0;
                    block0: while (true) {
                        int n5 = n4;
                        block1: while (n5 < m2.d()) {
                            n3 = 0;
                            if (arrm != null) break block9;
                            for (int i2 = v1544163; i2 < m2.b(); ++i2) {
                                net.minecraft.w.k k2;
                                block13: {
                                    int n6;
                                    int n7;
                                    block12: {
                                        d d10;
                                        d d11 = d10 = m2.b(n4, i2);
                                        if (arrm == null) {
                                            n5 = d11.G() ? 1 : 0;
                                            if (arrm != null) continue block1;
                                            if (n5 != 0) {
                                                return false;
                                            }
                                            d11 = d10;
                                        }
                                        k2 = d11.w();
                                        n7 = n4;
                                        n6 = 1;
                                        if (arrm != null) break block12;
                                        if (n7 != n6) break block13;
                                        n7 = i2;
                                        n6 = 1;
                                    }
                                    if (n7 == n6) {
                                        if (k2 == h.W) continue;
                                        return false;
                                    }
                                }
                                if (k2 == h.x) continue;
                                return false;
                            }
                            ++n4;
                            if (arrm == null) continue block0;
                        }
                        break;
                    }
                    n3 = 1;
                }
                return n3 != 0;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    @Override
    public d d() {
        return d.m;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        return a2.a(m2.e(), d.m);
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
    public boolean a(int n2, int n3) {
        m[] arrm = i.b();
        int n4 = n2;
        int n5 = 2;
        if (arrm == null) {
            if (n4 < n5) return 0 != 0;
            n4 = n3;
            if (arrm != null) return n4 != 0;
            n5 = 2;
        }
        if (n4 < n5) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        d d10 = m2.b(1, 1);
        m[] arrm = i.b();
        d d11 = d10;
        if (arrm == null) {
            if (d11.w() != h.W) {
                return d.m;
            }
            d11 = new d(h.aI, 8);
        }
        d d12 = d11;
        net.minecraft.K.k.a(d12, net.minecraft.K.k.d(d10));
        net.minecraft.K.k.a(d12, net.minecraft.K.k.c(d10));
        return d12;
    }
}

