/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.az;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.i;
import net.minecraft.az.k;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.aU;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class u
implements k {
    @Override
    public d a(net.minecraft.B.m m2) {
        float f10;
        float f11;
        int n2;
        int n3;
        int n4;
        net.minecraft.w.m m3;
        int n5;
        int n6;
        int[] arrn;
        d d10;
        block9: {
            d10 = d.m;
            arrn = new int[3];
            n6 = 0;
            n5 = 0;
            m3 = null;
            n4 = 0;
            m[] arrm = i.b();
            while (n4 < m2.e()) {
                block10: {
                    block11: {
                        d d11;
                        block18: {
                            net.minecraft.w.k k2;
                            d d12;
                            block12: {
                                block13: {
                                    boolean bl2;
                                    block16: {
                                        block17: {
                                            d d13;
                                            block14: {
                                                block15: {
                                                    d12 = m2.a(n4);
                                                    if (arrm != null) break block10;
                                                    n3 = d12.G();
                                                    if (arrm != null) break block9;
                                                    if (n3 != 0) break block11;
                                                    k2 = d12.w();
                                                    if (arrm != null) break block12;
                                                    if (!(k2 instanceof net.minecraft.w.m)) break block13;
                                                    d13 = d12;
                                                    if (arrm != null) break block14;
                                                    m3 = (net.minecraft.w.m)d13.w();
                                                    if (m3.c() != aU.LEATHER) break block15;
                                                    bl2 = d10.G();
                                                    if (arrm != null) break block16;
                                                    if (bl2) break block17;
                                                }
                                                d13 = d.m;
                                            }
                                            return d13;
                                        }
                                        d10 = d12.C();
                                        d10.c(1);
                                        if (arrm != null) break block10;
                                        bl2 = m3.a(d12);
                                    }
                                    if (!bl2) break block11;
                                    n2 = m3.c(d10);
                                    f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                                    f10 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                                    float f12 = (float)(n2 & 0xFF) / 255.0f;
                                    n6 = (int)((float)n6 + Math.max(f11, Math.max(f10, f12)) * 255.0f);
                                    arrn[0] = (int)((float)arrn[0] + f11 * 255.0f);
                                    arrn[1] = (int)((float)arrn[1] + f10 * 255.0f);
                                    arrn[2] = (int)((float)arrn[2] + f12 * 255.0f);
                                    ++n5;
                                    if (arrm == null) break block11;
                                }
                                d11 = d12;
                                if (arrm != null) break block18;
                                k2 = d11.w();
                            }
                            if (k2 != h.aL) {
                                return d.m;
                            }
                            d11 = d12;
                        }
                        float[] arrf = bl.d(d11.d()).f();
                        int n7 = (int)(arrf[0] * 255.0f);
                        int n8 = (int)(arrf[1] * 255.0f);
                        int n9 = (int)(arrf[2] * 255.0f);
                        n6 += Math.max(n7, Math.max(n8, n9));
                        arrn[0] = arrn[0] + n7;
                        arrn[1] = arrn[1] + n8;
                        arrn[2] = arrn[2] + n9;
                        ++n5;
                    }
                    ++n4;
                }
                if (arrm == null) continue;
            }
            if (m3 == null) {
                return d.m;
            }
            n4 = arrn[0] / n5;
            n3 = arrn[1] / n5;
        }
        int n10 = n3;
        n2 = arrn[2] / n5;
        f11 = (float)n6 / (float)n5;
        f10 = Math.max(n4, Math.max(n10, n2));
        n4 = (int)((float)n4 * f11 / f10);
        n10 = (int)((float)n10 * f11 / f10);
        n2 = (int)((float)n2 * f11 / f10);
        int n11 = (n4 << 8) + n10;
        n11 = (n11 << 8) + n2;
        m3.a(d10, n11);
        return d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean b() {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        boolean bl2;
        m[] arrm;
        ArrayList arrayList;
        block8: {
            d d10 = d.m;
            arrayList = Lists.newArrayList();
            int n2 = 0;
            arrm = i.b();
            while (n2 < m2.e()) {
                block9: {
                    block10: {
                        net.minecraft.w.k k2;
                        d d11;
                        block11: {
                            block12: {
                                d11 = m2.a(n2);
                                if (arrm != null) break block9;
                                bl2 = d11.G();
                                if (arrm != null) break block8;
                                if (bl2) break block10;
                                k2 = d11.w();
                                if (arrm != null) break block11;
                                if (!(k2 instanceof net.minecraft.w.m)) break block12;
                                net.minecraft.w.m m3 = (net.minecraft.w.m)d11.w();
                                if (m3.c() != aU.LEATHER) return false;
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
                        if (k2 != h.aL) {
                            return false;
                        }
                        arrayList.add(d11);
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            bl2 = d10.G();
        }
        if (arrm == null) {
            if (bl2) return false;
            bl2 = arrayList.isEmpty();
        }
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
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
}

