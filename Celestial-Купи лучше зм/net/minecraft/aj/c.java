/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.aj;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import net.minecraft.aj.d;
import net.minecraft.aj.j;
import net.minecraft.aj.k;
import net.minecraft.aj.l;
import net.minecraft.g.b;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class c {
    private final /* synthetic */ net.minecraft.g.d[] a;
    private final /* synthetic */ l b;
    private final /* synthetic */ l c;
    private final /* synthetic */ d[] d;

    private static gP a(gP gP2) {
        return gP2;
    }

    static l c(c c10) {
        return c10.c;
    }

    public void b(Collection<net.minecraft.w.d> collection, Random random, k k2) {
        block4: {
            int n2;
            m[] arrm;
            block3: {
                arrm = j.b();
                n2 = net.minecraft.g.b.a(this.a, random, k2);
                if (arrm == null) break block3;
                if (n2 == 0) break block4;
                n2 = this.c.a(random) + h.d(this.b.b(random) * k2.d());
            }
            int n3 = n2;
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(collection, random, k2);
                if (arrm != null) continue;
            }
        }
    }

    public c(d[] arrd, net.minecraft.g.d[] arrd2, l l2, l l3) {
        this.d = arrd;
        this.a = arrd2;
        this.c = l2;
        this.b = l3;
    }

    static l d(c c10) {
        return c10.b;
    }

    static net.minecraft.g.d[] a(c c10) {
        return c10.a;
    }

    protected void a(Collection<net.minecraft.w.d> collection, Random random, k k2) {
        block13: {
            int n2;
            m[] arrm;
            ArrayList arrayList;
            block14: {
                int n3;
                block12: {
                    block9: {
                        arrayList = Lists.newArrayList();
                        n3 = 0;
                        d[] arrd = this.d;
                        arrm = j.b();
                        int n4 = arrd.length;
                        int n5 = 0;
                        while (n5 < n4) {
                            block10: {
                                block11: {
                                    d d10 = arrd[n5];
                                    if (arrm == null) break block10;
                                    n2 = net.minecraft.g.b.a(d10.a, random, k2) ? 1 : 0;
                                    if (arrm == null) break block9;
                                    if (n2 == 0) break block11;
                                    int n6 = d10.a(k2.d());
                                    if (arrm == null) break block10;
                                    if (n6 > 0) {
                                        arrayList.add(d10);
                                        n3 += n6;
                                    }
                                }
                                ++n5;
                            }
                            if (arrm != null) continue;
                        }
                        n2 = n3;
                    }
                    if (arrm == null) break block12;
                    if (n2 == 0) break block13;
                    n2 = arrayList.isEmpty();
                }
                if (arrm == null) break block14;
                if (n2 != 0) break block13;
                n2 = random.nextInt(n3);
            }
            int n7 = n2;
            for (d d11 : arrayList) {
                block16: {
                    block15: {
                        n7 -= d11.a(k2.d());
                        if (arrm == null) break block15;
                        if (n7 >= 0) break block16;
                        d11.a(collection, random, k2);
                    }
                    return;
                }
                if (arrm != null) continue;
            }
        }
    }

    static d[] b(c c10) {
        return c10.d;
    }
}

