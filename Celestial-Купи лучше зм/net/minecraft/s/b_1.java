/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.S;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class b {
    private static final /* synthetic */ List<int[]> e;
    private static final /* synthetic */ List<int[]> d;
    private static /* synthetic */ int c;
    private static final /* synthetic */ List<int[]> a;
    private static final /* synthetic */ List<int[]> b;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        c = 256;
        a = Lists.newArrayList();
        b = Lists.newArrayList();
        d = Lists.newArrayList();
        e = Lists.newArrayList();
    }

    public static synchronized int[] a(int n2) {
        Object object;
        block10: {
            int n3;
            block9: {
                int n4;
                m[] arrm;
                block8: {
                    arrm = net.minecraft.S.d.b();
                    n3 = n2;
                    n4 = 256;
                    if (arrm == null) break block8;
                    if (n3 <= n4) {
                        Object object2 = a;
                        if (arrm != null) {
                            if (object2.isEmpty()) {
                                int[] arrn = new int[256];
                                b.add(arrn);
                                return arrn;
                            }
                            object2 = a.remove(a.size() - 1);
                        }
                        int[] arrn = (int[])object2;
                        b.add(arrn);
                        return arrn;
                    }
                    n3 = n2;
                    if (arrm == null) break block9;
                    n4 = c;
                }
                if (n3 > n4) {
                    c = n2;
                    d.clear();
                    e.clear();
                    int[] arrn = new int[c];
                    e.add(arrn);
                    return arrn;
                }
                object = d;
                if (arrm == null) break block10;
                n3 = object.isEmpty() ? 1 : 0;
            }
            if (n3 != 0) {
                int[] arrn = new int[c];
                e.add(arrn);
                return arrn;
            }
            object = d.remove(d.size() - 1);
        }
        int[] arrn = (int[])object;
        e.add(arrn);
        return arrn;
    }

    public static synchronized String b() {
        return "cache: " + d.size() + ", tcache: " + a.size() + ", allocated: " + e.size() + ", tallocated: " + b.size();
    }

    public static synchronized void a() {
        m[] arrm = net.minecraft.S.d.b();
        boolean bl2 = d.isEmpty();
        if (arrm != null) {
            if (!bl2) {
                d.remove(d.size() - 1);
            }
            bl2 = a.isEmpty();
        }
        if (arrm != null) {
            if (!bl2) {
                a.remove(a.size() - 1);
            }
            d.addAll(e);
            bl2 = a.addAll(b);
        }
        e.clear();
        b.clear();
    }
}

