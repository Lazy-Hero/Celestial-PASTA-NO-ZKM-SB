/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.az;

import net.minecraft.W.K;
import net.minecraft.W.as;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.i;
import net.minecraft.az.k;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class e
implements k {
    @Override
    public boolean b() {
        return true;
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
    public d d() {
        return d.m;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        int n2;
        m[] arrm;
        d d10;
        block6: {
            d10 = d.m;
            d d11 = d.m;
            arrm = i.b();
            int n3 = 0;
            while (n3 < m2.e()) {
                block7: {
                    block8: {
                        d d12;
                        block11: {
                            net.minecraft.w.k k2;
                            d d13;
                            block9: {
                                block10: {
                                    d13 = m2.a(n3);
                                    if (arrm != null) break block7;
                                    n2 = d13.G() ? 1 : 0;
                                    if (arrm != null) break block6;
                                    if (n2 != 0) break block8;
                                    k2 = d13.w();
                                    if (arrm != null) break block9;
                                    if (!(K.a(k2) instanceof as)) break block10;
                                    d10 = d13;
                                    if (arrm == null) break block8;
                                }
                                d12 = d13;
                                if (arrm != null) break block11;
                                k2 = d12.w();
                            }
                            if (k2 != h.aL) break block8;
                            d12 = d13;
                        }
                        d11 = d12;
                    }
                    ++n3;
                }
                if (arrm == null) continue;
            }
            n2 = d11.d();
        }
        d d14 = as.a(bl.d(n2));
        d d15 = d10;
        if (arrm == null) {
            if (d15.x()) {
                d14.b(d10.v().c());
            }
            d15 = d14;
        }
        return d15;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        boolean bl2;
        m[] arrm;
        boolean bl3;
        block7: {
            boolean bl4 = false;
            bl3 = false;
            arrm = i.b();
            int n2 = 0;
            while (n2 < m2.e()) {
                block8: {
                    block9: {
                        block12: {
                            net.minecraft.w.k k2;
                            block10: {
                                d d10;
                                block11: {
                                    d10 = m2.a(n2);
                                    if (arrm != null) break block8;
                                    bl2 = d10.G();
                                    if (arrm != null) break block7;
                                    if (bl2) break block9;
                                    k2 = d10.w();
                                    if (arrm != null) break block10;
                                    if (!(K.a(k2) instanceof as)) break block11;
                                    bl4 += 1;
                                    if (arrm == null) break block12;
                                }
                                k2 = d10.w();
                            }
                            if (k2 != h.aL) {
                                return false;
                            }
                        }
                        boolean bl5 = ++bl3;
                        if (arrm != null) return bl5;
                        if (bl5 > true) return false;
                        bl5 = bl4;
                        if (arrm != null) return bl5;
                        if (bl5 > true) {
                            return false;
                        }
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            bl2 = bl4;
        }
        boolean bl6 = true;
        if (arrm == null) {
            if (bl2 != bl6) return false;
            bl2 = bl3;
            if (arrm != null) return bl2;
            bl6 = true;
        }
        if (bl2 != bl6) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

