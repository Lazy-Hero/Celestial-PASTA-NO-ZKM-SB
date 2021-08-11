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
import net.minecraft.w.d;

public class n
implements k {
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
    public boolean a(int n2, int n3) {
        m[] arrm = i.b();
        boolean bl2 = n2 * n3;
        if (arrm == null) {
            bl2 = bl2 >= BADBOOL 2;
        }
        return bl2;
    }

    @Override
    public d d() {
        return d.m;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        boolean bl2;
        m[] arrm;
        block5: {
            ArrayList arrayList = Lists.newArrayList();
            arrm = i.b();
            int n2 = 0;
            while (n2 < m2.e()) {
                block6: {
                    block7: {
                        int n3;
                        block10: {
                            block9: {
                                d d10;
                                d d11;
                                d d12;
                                block8: {
                                    d12 = m2.a(n2);
                                    if (arrm != null) break block6;
                                    bl2 = d12.G();
                                    if (arrm != null) break block5;
                                    if (bl2) break block7;
                                    arrayList.add(d12);
                                    if (arrm != null) break block6;
                                    if (arrayList.size() <= 1) break block7;
                                    d11 = (d)arrayList.get(0);
                                    d10 = d12;
                                    if (arrm != null) break block8;
                                    if (d10.w() != d11.w()) break block9;
                                    d10 = d11;
                                }
                                n3 = d10.t();
                                if (arrm != null) break block10;
                                if (n3 != 1) break block9;
                                n3 = d12.t();
                                if (arrm != null) break block10;
                                if (n3 != 1) break block9;
                                n3 = d11.w().i() ? 1 : 0;
                                if (arrm != null) break block10;
                                if (n3 != 0) break block7;
                            }
                            n3 = 0;
                        }
                        return n3 != 0;
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            bl2 = arrayList.size();
        }
        if (arrm == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        d d10;
        block12: {
            block11: {
                int n2;
                d d11;
                block14: {
                    int n3;
                    block13: {
                        ArrayList arrayList;
                        Object object;
                        d d12;
                        m[] arrm;
                        ArrayList arrayList2;
                        block10: {
                            int n4;
                            block5: {
                                arrayList2 = Lists.newArrayList();
                                int n5 = 0;
                                arrm = i.b();
                                while (n5 < m2.e()) {
                                    block6: {
                                        block7: {
                                            Object object2;
                                            block8: {
                                                block9: {
                                                    d12 = m2.a(n5);
                                                    if (arrm != null) break block6;
                                                    n4 = d12.G() ? 1 : 0;
                                                    if (arrm != null) break block5;
                                                    if (n4 != 0) break block7;
                                                    arrayList2.add(d12);
                                                    if (arrm != null) break block6;
                                                    if (arrayList2.size() <= 1) break block7;
                                                    object = (d)arrayList2.get(0);
                                                    object2 = d12;
                                                    if (arrm != null) break block8;
                                                    if (((d)object2).w() != ((d)object).w()) break block9;
                                                    object2 = object;
                                                    if (arrm != null) break block8;
                                                    if (((d)object2).t() != 1) break block9;
                                                    object2 = d12;
                                                    if (arrm != null) break block8;
                                                    if (((d)object2).t() != 1) break block9;
                                                    object2 = object;
                                                    if (arrm != null) break block8;
                                                    if (((d)object2).w().i()) break block7;
                                                }
                                                object2 = d.m;
                                            }
                                            return object2;
                                        }
                                        ++n5;
                                    }
                                    if (arrm == null) continue;
                                }
                                arrayList = arrayList2;
                                if (arrm != null) break block10;
                                n4 = arrayList.size();
                            }
                            if (n4 != 2) break block11;
                            arrayList = arrayList2.get(0);
                        }
                        d11 = (d)((Object)arrayList);
                        d12 = (d)arrayList2.get(1);
                        d10 = d11;
                        if (arrm != null) break block12;
                        if (d10.w() != d12.w()) break block11;
                        d10 = d11;
                        if (arrm != null) break block12;
                        if (d10.t() != 1) break block11;
                        d10 = d12;
                        if (arrm != null) break block12;
                        if (d10.t() != 1) break block11;
                        d10 = d11;
                        if (arrm != null) break block12;
                        if (!d10.w().i()) break block11;
                        object = d11.w();
                        int n6 = ((net.minecraft.w.k)object).e() - d11.u();
                        int n7 = ((net.minecraft.w.k)object).e() - d12.u();
                        int n8 = n6 + n7 + ((net.minecraft.w.k)object).e() * 5 / 100;
                        n3 = n2 = ((net.minecraft.w.k)object).e() - n8;
                        if (arrm != null) break block13;
                        if (n3 >= 0) break block14;
                        n3 = 0;
                    }
                    n2 = n3;
                }
                return new d(d11.w(), 1, n2);
            }
            d10 = d.m;
        }
        return d10;
    }

    @Override
    public boolean b() {
        return true;
    }
}

