/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.N.h;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.D;
import net.minecraft.client.a.I;
import net.minecraft.client.a.l;
import net.minecraft.client.j.g;
import net.minecraft.w.bl;

public class j {
    private final /* synthetic */ Map<String, D> a;
    private final /* synthetic */ String b;
    private final /* synthetic */ v c;
    private final /* synthetic */ String d;

    private static gP a(gP gP2) {
        return gP2;
    }

    private boolean a() {
        int n2;
        String string;
        block5: {
            long l2 = System.currentTimeMillis();
            string = I.j();
            Iterator<String> iterator = this.a.keySet().iterator();
            while (iterator.hasNext()) {
                block7: {
                    boolean bl2;
                    block6: {
                        String string2 = iterator.next();
                        D d10 = this.a.get(string2);
                        long l3 = l2 - d10.a - 5000L;
                        n2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                        if (string != null) break block5;
                        if (string != null) break block6;
                        if (n2 <= 0) break block7;
                        Q.P().aN().c(d10.b);
                        iterator.remove();
                        bl2 = true;
                    }
                    return bl2;
                }
                if (string == null) continue;
            }
            n2 = this.a.size();
        }
        if (string == null) {
            n2 = n2 < 256 ? 1 : 0;
        }
        return n2 != 0;
    }

    @Nullable
    public v a(String string, List<h> list, List<bl> list2) {
        D d10;
        block10: {
            D d11;
            block11: {
                block9: {
                    String string2;
                    block13: {
                        int n2;
                        block12: {
                            string2 = I.j();
                            Object object = string;
                            if (string2 == null) {
                                if (((String)object).isEmpty()) {
                                    return null;
                                }
                                string = this.b + string;
                                object = this.a.get(string);
                            }
                            d10 = d11 = (D)object;
                            if (string2 != null) break block10;
                            if (d10 != null) break block11;
                            n2 = this.a.size();
                            if (string2 != null) break block12;
                            if (n2 < 256) break block13;
                            n2 = this.a() ? 1 : 0;
                        }
                        if (n2 == 0) {
                            return l.b;
                        }
                    }
                    ArrayList arrayList = Lists.newArrayList();
                    for (h h2 : list) {
                        arrayList.add(this.d + h2.c() + ".png");
                        if (string2 == null) {
                            if (string2 == null) continue;
                        }
                        break block9;
                    }
                    d11 = new D(null);
                    d11.b = new v(string);
                    Q.P().aN().a(d11.b, new g(this.c, arrayList, list2));
                }
                this.a.put(string, d11);
            }
            d11.a = System.currentTimeMillis();
            d10 = d11;
        }
        return d10.b;
    }

    public j(String string, v v2, String string2) {
        this.a = Maps.newLinkedHashMap();
        this.b = string;
        this.c = v2;
        this.d = string2;
    }
}

