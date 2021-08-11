/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Ordering
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.f;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.client.q.c;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class i
implements g {
    private final /* synthetic */ Q b;
    private final /* synthetic */ Map<Long, Map<n, Integer>> a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, long l2) {
        block12: {
            Object object;
            Object object2;
            Object object3;
            int n2;
            block11: {
                Object object4;
                long l3 = this.b.e.r();
                c c10 = this.b.s;
                n2 = f.c();
                double d10 = c10.am + (c10.a - c10.am) * (double)f10;
                double d11 = c10.af + (c10.aF - c10.af) * (double)f10;
                double d12 = c10.n + (c10.ax - c10.n) * (double)f10;
                z z2 = this.b.s.aG;
                v.a();
                v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
                v.d(2.0f);
                v.L();
                v.a(false);
                int n3 = 200;
                double d13 = 0.0025;
                HashSet hashSet = Sets.newHashSet();
                HashMap hashMap = Maps.newHashMap();
                Iterator<Map.Entry<Long, Map<n, Integer>>> iterator = this.a.entrySet().iterator();
                block0: while (true) {
                    boolean bl2 = iterator.hasNext();
                    block1: while (bl2) {
                        long l4;
                        block14: {
                            block13: {
                                object4 = iterator;
                                if (n2 == 0) break block11;
                                object3 = object4.next();
                                object2 = (Long)object3.getKey();
                                object = (Map)object3.getValue();
                                l4 = l3 - (Long)object2;
                                if (n2 == 0) break block13;
                                if (l4 <= 200L) break block14;
                                iterator.remove();
                            }
                            if (n2 != 0) continue block0;
                        }
                        for (Map.Entry entry : object.entrySet()) {
                            n n4 = (n)entry.getKey();
                            Integer n5 = (Integer)entry.getValue();
                            Serializable serializable = hashSet;
                            if (n2 != 0) {
                                bl2 = serializable.add(n4);
                                if (n2 == 0) continue block1;
                                if (bl2) {
                                    aF.b(new k(n.o).a(0.002).b(0.0025 * (double)l4).c((double)n4.e(), n4.b(), n4.a()).c(-d10, -d11, -d12), 1.0f, 1.0f, 1.0f, 1.0f);
                                    serializable = hashMap.put(n4, n5);
                                }
                            }
                            if (n2 != 0) continue;
                        }
                        if (n2 != 0) continue block0;
                    }
                    break;
                }
                object4 = object3 = hashMap.entrySet().iterator();
            }
            while (object3.hasNext()) {
                object2 = (Map.Entry)object3.next();
                object = (n)object2.getKey();
                Integer n6 = (Integer)object2.getValue();
                f.a(String.valueOf(n6), ((m)object).e(), ((m)object).b(), ((m)object).a(), f10, -1);
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block12;
            }
            v.a(true);
            v.x();
            v.f();
        }
    }

    i(Q q2) {
        this.a = Maps.newTreeMap((Comparator)Ordering.natural().reverse());
        this.b = q2;
    }

    public void a(long l2, n n2) {
        Integer n3;
        HashMap hashMap = this.a.get(l2);
        int n4 = f.b();
        HashMap hashMap2 = hashMap;
        if (n4 == 0) {
            if (hashMap2 == null) {
                hashMap = Maps.newHashMap();
                this.a.put(l2, hashMap);
            }
            hashMap2 = hashMap.get(n2);
        }
        Integer n5 = n3 = (Integer)((Object)hashMap2);
        if (n4 == 0) {
            if (n5 == null) {
                n3 = 0;
            }
            n5 = hashMap.put(n2, n3 + 1);
        }
    }
}

