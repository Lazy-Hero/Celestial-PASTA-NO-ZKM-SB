/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.l;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.P.w;
import net.minecraft.Q.N;
import net.minecraft.Q.O;
import net.minecraft.a6;
import net.minecraft.ar.v;
import net.minecraft.az.t;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.l.d;
import net.minecraft.l.i;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j
extends i {
    private static final /* synthetic */ Logger e;

    private static gP b(gP gP2) {
        return gP2;
    }

    private List<net.minecraft.az.k> c() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            int n2 = net.minecraft.l.d.h();
            int n3 = this.c.nextSetBit(0);
            while (n3 >= 0) {
                arrayList = arrayList2;
                if (n2 == 0) {
                    arrayList.add(t.a.a((v)n3));
                    n3 = this.c.nextSetBit(n3 + 1);
                    if (n2 == 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public void a(List<net.minecraft.az.k> list, k k2) {
        j j2;
        ArrayList arrayList;
        block3: {
            arrayList = Lists.newArrayList();
            int n2 = net.minecraft.l.d.h();
            for (net.minecraft.az.k k3 : list) {
                block5: {
                    block6: {
                        boolean bl2;
                        block4: {
                            j2 = this;
                            if (n2 != 0) break block3;
                            bl2 = j2.d.get(j.d(k3));
                            if (n2 != 0) break block4;
                            if (bl2) break block5;
                            bl2 = k3.b();
                        }
                        if (n2 != 0) break block6;
                        if (bl2) break block5;
                        this.g(k3);
                        this.b(k3);
                        bl2 = arrayList.add(k3);
                    }
                    a6.u.a(k2, k3);
                }
                if (n2 == 0) continue;
            }
            j2 = this;
        }
        j2.a(O.ADD, k2, arrayList);
    }

    public void b(List<net.minecraft.az.k> list, k k2) {
        j j2;
        ArrayList arrayList;
        block3: {
            arrayList = Lists.newArrayList();
            Iterator<net.minecraft.az.k> iterator = list.iterator();
            int n2 = net.minecraft.l.d.e();
            while (iterator.hasNext()) {
                net.minecraft.az.k k3 = iterator.next();
                j2 = this;
                if (n2 != 0) {
                    boolean bl2 = j2.d.get(j.d(k3));
                    if (n2 != 0 && bl2) {
                        this.e(k3);
                        bl2 = arrayList.add(k3);
                    }
                    if (n2 != 0) continue;
                }
                break block3;
            }
            j2 = this;
        }
        j2.a(O.REMOVE, k2, arrayList);
    }

    public r a() {
        r r2;
        block5: {
            int n2;
            block4: {
                r2 = new r();
                n2 = net.minecraft.l.d.e();
                r2.a("isGuiOpen", this.a);
                r2.a("isFilteringCraftable", this.b);
                u u2 = new u();
                for (net.minecraft.az.k object : this.b()) {
                    u2.a(new w(t.a.b(object).toString()));
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                        m.b(!m.d());
                        break;
                    }
                    break block4;
                }
                r2.a("recipes", u2);
            }
            u u3 = new u();
            for (net.minecraft.az.k k2 : this.c()) {
                u3.a(new w(t.a.b(k2).toString()));
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block5;
            }
            r2.a("toBeDisplayed", u3);
        }
        return r2;
    }

    public void a(k k2) {
        k2.cD.a(new N(O.INIT, this.b(), this.c(), this.a, this.b));
    }

    private List<net.minecraft.az.k> b() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            int n2 = this.d.nextSetBit(0);
            int n3 = net.minecraft.l.d.e();
            while (n2 >= 0) {
                arrayList = arrayList2;
                if (n3 != 0) {
                    arrayList.add(t.a.a((v)n2));
                    n2 = this.d.nextSetBit(n2 + 1);
                    if (n3 != 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    static {
        e = LogManager.getLogger();
    }

    public void a(r r2) {
        Object object;
        this.a = r2.f("isGuiOpen");
        this.b = r2.f("isFilteringCraftable");
        int n2 = net.minecraft.l.d.e();
        u u2 = r2.c("recipes", 8);
        for (int i2 = 0; i2 < u2.b(); ++i2) {
            block7: {
                block6: {
                    v v2 = new v(u2.c(i2));
                    object = t.a(v2);
                    if (n2 == 0) break block6;
                    if (object != null) break block7;
                    e.info("Tried to load unrecognized recipe: {} removed now.", (Object)v2);
                }
                if (n2 != 0) continue;
            }
            this.g((net.minecraft.az.k)object);
            if (n2 != 0) continue;
        }
        u u3 = r2.c("toBeDisplayed", 8);
        for (int i3 = 0; i3 < u3.b(); ++i3) {
            net.minecraft.az.k k2;
            block9: {
                block8: {
                    object = new v(u3.c(i3));
                    k2 = t.a((v)object);
                    if (n2 == 0) break block8;
                    if (k2 != null) break block9;
                    e.info("Tried to load unrecognized recipe: {} removed now.", object);
                }
                if (n2 != 0) continue;
            }
            this.b(k2);
            if (n2 != 0) continue;
        }
    }

    private void a(O o2, k k2, List<net.minecraft.az.k> list) {
        k2.cD.a(new N(o2, list, Collections.emptyList(), this.a, this.b));
    }
}

