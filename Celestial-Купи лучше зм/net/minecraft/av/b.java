/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.av;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.P.r;
import net.minecraft.ar.T;
import net.minecraft.av.a;
import net.minecraft.av.c;
import net.minecraft.av.d;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b
implements c {
    private final /* synthetic */ Map<d, List<a>> b;
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ int c;
    private final /* synthetic */ Map<d, List<g>> d;

    public void a(d d10, a a10) {
        block11: {
            block7: {
                int n2;
                List list;
                block10: {
                    m[] arrm;
                    int n3;
                    block8: {
                        block9: {
                            list = this.a(this.b, d10);
                            n3 = a10.a();
                            arrm = f.b();
                            n2 = n3;
                            if (arrm == null) break block8;
                            if (n2 <= this.c) break block9;
                            a.warn("Ignored fix registered for version: {} as the DataVersion of the game is: {}", (Object)n3, (Object)this.c);
                            if (arrm != null) break block7;
                        }
                        n2 = list.isEmpty() ? 1 : 0;
                    }
                    if (arrm == null) break block7;
                    if (n2 != 0) break block10;
                    n2 = ((a)T.a(list)).a();
                    if (arrm == null) break block7;
                    if (n2 <= n3) break block10;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        if (arrm != null) {
                            List list2 = list;
                            int n4 = i2;
                            if (arrm != null) {
                                if (((a)list2.get(n4)).a() <= n3) continue;
                                list2 = list;
                                n4 = i2;
                            }
                            list2.add(n4, a10);
                            if (arrm != null) break;
                            if (arrm != null) continue;
                        }
                        break block7;
                    }
                    if (arrm != null) break block7;
                }
                n2 = list.add(a10) ? 1 : 0;
            }
            if (m.d()) break block11;
            f.b(new m[2]);
        }
    }

    public void a(d d10, g g10) {
        this.a(this.d, d10).add(g10);
    }

    private <V> List<V> a(Map<d, List<V>> map, d d10) {
        ArrayList arrayList = map.get(d10);
        m[] arrm = f.b();
        ArrayList arrayList2 = arrayList;
        if (arrm != null) {
            if (arrayList2 == null) {
                arrayList = Lists.newArrayList();
                map.put(d10, arrayList);
            }
            arrayList2 = arrayList;
        }
        return arrayList2;
    }

    public void a(f f10, g g10) {
        this.a((d)f10, g10);
    }

    private r c(d d10, r r2, int n2) {
        List<a> list = this.b.get(d10);
        m[] arrm = f.b();
        if (list != null) {
            int n3 = 0;
            while (n3 < list.size()) {
                a a10 = list.get(n3);
                if (arrm != null) {
                    if (a10.a() > n2) {
                        r2 = a10.a(r2);
                    }
                    ++n3;
                }
                if (arrm != null) continue;
            }
        }
        return r2;
    }

    public b(int n2) {
        this.d = Maps.newHashMap();
        this.b = Maps.newHashMap();
        this.c = n2;
    }

    @Override
    public r a(d d10, r r2, int n2) {
        block3: {
            block2: {
                m[] arrm = f.b();
                if (arrm == null) break block2;
                if (n2 >= this.c) break block3;
                r2 = this.c(d10, r2, n2);
            }
            r2 = this.b(d10, r2, n2);
        }
        return r2;
    }

    private r b(d d10, r r2, int n2) {
        r r3;
        List<g> list = this.d.get(d10);
        m[] arrm = f.b();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                r3 = list.get(i2).a(this, r2, n2);
                if (arrm != null) {
                    r2 = r3;
                    if (arrm != null) continue;
                }
                break;
            }
        } else {
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public r a(d d10, r r2) {
        m[] arrm = f.b();
        int n2 = r2.a("DataVersion", 99);
        if (arrm != null) {
            n2 = n2 != 0 ? r2.m("DataVersion") : -1;
        }
        int n3 = n2;
        return n3 >= 1343 ? r2 : this.a(d10, r2, n3);
    }

    static {
        a = LogManager.getLogger();
    }
}

