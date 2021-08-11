/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import java.util.List;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.z.d;

public final class b {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static i a(x x2, boolean bl2, boolean bl3, x x3) {
        i i2;
        block7: {
            x x4;
            x x5;
            block6: {
                double d10 = x2.a;
                double d11 = x2.aF;
                double d12 = x2.ax;
                m[] arrm = d.b();
                double d13 = x2.aq;
                double d14 = x2.G;
                double d15 = x2.d;
                z z2 = x2.aG;
                l l2 = new l(d10, d11, d12);
                l l3 = new l(d10 + d13, d11 + d14, d12 + d15);
                i2 = z2.a(l2, l3, false, true, false);
                if (!bl2) break block7;
                if (i2 != null) {
                    l3 = new l(i2.c.e, i2.c.d, i2.c.b);
                }
                x5 = null;
                List<x> list = z2.b(x2, x2.m().d(d13, d14, d15).a(1.0));
                double d16 = 0.0;
                int n2 = 0;
                while (n2 < list.size()) {
                    block8: {
                        block9: {
                            double d17;
                            block13: {
                                double d18;
                                x x6;
                                block14: {
                                    x x7;
                                    block12: {
                                        boolean bl4;
                                        block10: {
                                            block11: {
                                                x6 = list.get(n2);
                                                if (arrm != null) break block8;
                                                x4 = x6;
                                                if (arrm != null) break block6;
                                                if (!x4.M()) break block9;
                                                bl4 = bl3;
                                                if (arrm != null) break block10;
                                                if (bl4) break block11;
                                                bl4 = x6.d(x3);
                                                if (arrm != null) break block10;
                                                if (bl4) break block9;
                                            }
                                            x7 = x6;
                                            if (arrm != null) break block12;
                                            bl4 = x7.K;
                                        }
                                        if (bl4) break block9;
                                        x7 = x6;
                                    }
                                    k k2 = x7.m().a(0.3f);
                                    i i3 = k2.b(l2, l3);
                                    if (arrm != null) break block8;
                                    if (i3 == null) break block9;
                                    d17 = d18 = l2.f(i3.c);
                                    if (arrm != null) break block13;
                                    if (d17 < d16) break block14;
                                    d17 = d16;
                                    if (arrm != null) break block13;
                                    if (d17 != 0.0) break block9;
                                }
                                x5 = x6;
                                d17 = d18;
                            }
                            d16 = d17;
                        }
                        ++n2;
                    }
                    if (arrm == null) continue;
                }
                x4 = x5;
            }
            if (x4 != null) {
                i2 = new i(x5);
            }
        }
        return i2;
    }

    public static final void a(x x2, float f10) {
        block10: {
            m[] arrm;
            block9: {
                block8: {
                    double d10 = x2.aq;
                    double d11 = x2.G;
                    arrm = d.b();
                    double d12 = x2.d;
                    float f11 = h.e(d10 * d10 + d12 * d12);
                    x2.e = (float)(h.a(d12, d10) * 57.29577951308232) + 90.0f;
                    x2.at = (float)(h.a((double)f11, d11) * 57.29577951308232) - 90.0f;
                    while (x2.at - x2.E < -180.0f) {
                        x2.E -= 360.0f;
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block8;
                    }
                    while (x2.at - x2.E >= 180.0f) {
                        x2.E += 360.0f;
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block9;
                    }
                }
                while (x2.e - x2.ak < -180.0f) {
                    x2.ak -= 360.0f;
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block10;
                }
            }
            while (x2.e - x2.ak >= 180.0f) {
                x2.ak += 360.0f;
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block10;
            }
            x2.at = x2.E + (x2.at - x2.E) * f10;
            x2.e = x2.ak + (x2.e - x2.ak) * f10;
        }
    }
}

