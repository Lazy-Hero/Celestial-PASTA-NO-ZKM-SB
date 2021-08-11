/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.B;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.ad.a;
import net.minecraft.az.k;
import net.minecraft.az.t;
import net.minecraft.l.i;
import net.minecraft.w.d;

public class j
extends i {
    public static final /* synthetic */ Map<a, List<net.minecraft.client.h.k>> e;
    public static final /* synthetic */ List<net.minecraft.client.h.k> f;

    private static List lambda$func_194082_a$1(a a10) {
        return new ArrayList();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private static List lambda$func_194082_a$0(a a10) {
        return new ArrayList();
    }

    static {
        e = Maps.newHashMap();
        f = Lists.newArrayList();
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (k k2 : t.a) {
            net.minecraft.client.h.k k3;
            if (k2.b()) continue;
            a a10 = j.a(k2.d());
            String string = k2.a();
            if (string.isEmpty()) {
                k3 = j.a(a10);
            } else {
                k3 = (net.minecraft.client.h.k)hashBasedTable.get((Object)a10, (Object)string);
                if (k3 == null) {
                    k3 = j.a(a10);
                    hashBasedTable.put((Object)a10, (Object)string, (Object)k3);
                }
            }
            k3.a(k2);
        }
    }

    private static net.minecraft.client.h.k a(a a10) {
        net.minecraft.client.h.k k2 = new net.minecraft.client.h.k();
        f.add(k2);
        e.computeIfAbsent(a10, j::lambda$func_194082_a$0).add(k2);
        e.computeIfAbsent(net.minecraft.ad.a.b, j::lambda$func_194082_a$1).add(k2);
        return k2;
    }

    private static a a(d d10) {
        a a10 = d10.w().j();
        if (a10 != net.minecraft.ad.a.r && a10 != net.minecraft.ad.a.d && a10 != net.minecraft.ad.a.p) {
            return a10 == net.minecraft.ad.a.o ? net.minecraft.ad.a.d : net.minecraft.ad.a.n;
        }
        return a10;
    }
}

