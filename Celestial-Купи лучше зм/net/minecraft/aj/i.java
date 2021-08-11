/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.aj;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.B.a;
import net.minecraft.aj.c;
import net.minecraft.aj.j;
import net.minecraft.aj.k;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i {
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ c[] a;
    public static final /* synthetic */ i b;

    private void a(List<d> list, int n2, Random random) {
        block9: {
            boolean bl2;
            d d10;
            m[] arrm;
            ArrayList arrayList;
            block8: {
                int n3;
                arrayList = Lists.newArrayList();
                Iterator<d> iterator = list.iterator();
                arrm = j.b();
                while (iterator.hasNext()) {
                    block12: {
                        block13: {
                            int n4;
                            block10: {
                                block11: {
                                    d10 = iterator.next();
                                    n3 = d10.G() ? 1 : 0;
                                    if (arrm == null) break block8;
                                    if (arrm == null) break block10;
                                    if (n3 == 0) break block11;
                                    iterator.remove();
                                    if (arrm != null) break block12;
                                }
                                n4 = d10.t();
                            }
                            if (arrm == null) break block13;
                            if (n4 <= 1) break block12;
                            n4 = arrayList.add(d10) ? 1 : 0;
                        }
                        iterator.remove();
                    }
                    if (arrm != null) continue;
                }
                n3 = n2 = n2 - list.size();
            }
            while (n2 > 0) {
                block16: {
                    int n5;
                    d d11;
                    block17: {
                        block14: {
                            int n6;
                            block15: {
                                bl2 = arrayList.isEmpty();
                                if (arrm == null || arrm == null) break block9;
                                if (bl2) break;
                                d10 = (d)arrayList.remove(h.a(random, 0, arrayList.size() - 1));
                                int n7 = h.a(random, 1, d10.t() / 2);
                                d11 = d10.d(n7);
                                n6 = d10.t();
                                if (arrm == null) break block14;
                                if (n6 <= 1) break block15;
                                n6 = random.nextBoolean() ? 1 : 0;
                                if (arrm == null) break block14;
                                if (n6 == 0) break block15;
                                arrayList.add(d10);
                                if (arrm != null) break block14;
                            }
                            n6 = list.add(d10) ? 1 : 0;
                        }
                        n5 = d11.t();
                        if (arrm == null) break block16;
                        if (n5 <= 1) break block17;
                        n5 = random.nextBoolean() ? 1 : 0;
                        if (arrm == null) break block16;
                        if (n5 == 0) break block17;
                        arrayList.add(d11);
                        if (arrm != null) break block16;
                    }
                    n5 = list.add(d11) ? 1 : 0;
                }
                if (arrm != null) continue;
            }
            bl2 = list.addAll(arrayList);
        }
        Collections.shuffle(list, random);
    }

    private List<Integer> a(a a10, Random random) {
        ArrayList arrayList;
        block2: {
            arrayList = Lists.newArrayList();
            m[] arrm = j.b();
            for (int i2 = 0; i2 < a10.e(); ++i2) {
                if (arrm != null) {
                    boolean bl2 = a10.a(i2).G();
                    if (arrm == null || !bl2) continue;
                    bl2 = arrayList.add(i2);
                    if (arrm != null) continue;
                }
                break block2;
            }
            Collections.shuffle(arrayList, random);
        }
        return arrayList;
    }

    public void a(a a10, Random random, k k2) {
        List<d> list = this.a(random, k2);
        List<Integer> list2 = this.a(a10, random);
        m[] arrm = j.b();
        this.a(list, list2.size(), random);
        for (d d10 : list) {
            block7: {
                block6: {
                    boolean bl2 = list2.isEmpty();
                    if (arrm != null) {
                        if (bl2) {
                            c.warn("Tried to over-fill a container");
                            return;
                        }
                        bl2 = d10.G();
                    }
                    if (!bl2) break block6;
                    a10.a((int)list2.remove(list2.size() - 1), d.m);
                    if (arrm != null) break block7;
                }
                a10.a((int)list2.remove(list2.size() - 1), d10);
            }
            if (arrm != null) continue;
        }
    }

    static {
        c = LogManager.getLogger();
        b = new i(new c[0]);
    }

    public List<d> a(Random random, k k2) {
        ArrayList arrayList;
        block4: {
            block3: {
                m[] arrm;
                block2: {
                    arrayList = Lists.newArrayList();
                    arrm = j.b();
                    if (!k2.b(this)) break block3;
                    for (c c10 : this.a) {
                        c10.b(arrayList, random, k2);
                        if (arrm != null) {
                            if (arrm != null) continue;
                        }
                        break block2;
                    }
                    k2.a(this);
                }
                if (arrm != null) break block4;
            }
            c.warn("Detected infinite loop in loot tables");
        }
        return arrayList;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static c[] a(i i2) {
        return i2.a;
    }

    public i(c[] arrc) {
        this.a = arrc;
    }
}

