/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.m;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.aj.k;
import net.minecraft.ax.f;
import net.minecraft.ax.u;
import net.minecraft.k.h;
import net.minecraft.m.m;
import net.minecraft.w.S;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class n
extends m {
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ List<u> d;

    static List a(n n2) {
        return n2.d;
    }

    public n(net.minecraft.g.d[] arrd, @Nullable List<u> list) {
        net.minecraft.k.m[] arrm = m.b();
        super(arrd);
        net.minecraft.k.m[] arrm2 = arrm;
        List<u> list2 = list;
        if (arrm2 != null) {
            list2 = list2 == null ? Collections.emptyList() : list;
        }
        this.d = list2;
    }

    static {
        a = LogManager.getLogger();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public d a(d d10, Random random, k k2) {
        block20: {
            d d11;
            int n2;
            u u2;
            block18: {
                block19: {
                    net.minecraft.k.m[] arrm;
                    block17: {
                        Object object;
                        block13: {
                            block14: {
                                Object object2;
                                block12: {
                                    arrm = m.b();
                                    object = this.d;
                                    if (arrm == null) break block13;
                                    if (!object.isEmpty()) break block14;
                                    ArrayList arrayList = Lists.newArrayList();
                                    for (u u3 : u.e) {
                                        block16: {
                                            boolean bl2;
                                            block15: {
                                                object2 = d10.w();
                                                if (arrm == null) break block12;
                                                if (object2 == net.minecraft.u.h.b8) break block15;
                                                bl2 = u3.a(d10);
                                                if (arrm == null || !bl2) break block16;
                                            }
                                            bl2 = arrayList.add(u3);
                                        }
                                        if (arrm != null) continue;
                                    }
                                    object2 = arrayList;
                                    if (arrm != null) {
                                        if (object2.isEmpty()) {
                                            a.warn("Couldn't find a compatible enchantment for {}", (Object)d10);
                                            return d10;
                                        }
                                        object2 = arrayList.get(random.nextInt(arrayList.size()));
                                    }
                                }
                                u2 = (u)object2;
                                if (arrm != null) break block17;
                            }
                            object = this.d.get(random.nextInt(this.d.size()));
                        }
                        u2 = (u)object;
                    }
                    n2 = h.a(random, u2.g(), u2.f());
                    d11 = d10;
                    if (arrm == null) break block18;
                    if (d11.w() != net.minecraft.u.h.b8) break block19;
                    d10 = new d(net.minecraft.u.h.a0);
                    S.a(d10, new f(u2, n2));
                    if (arrm != null) break block20;
                }
                d11 = d10;
            }
            d11.a(u2, n2);
        }
        return d10;
    }
}

