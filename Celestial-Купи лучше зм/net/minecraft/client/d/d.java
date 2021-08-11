/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.UnmodifiableIterator
 */
package net.minecraft.client.d;

import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.client.d.g;
import net.minecraft.client.x.n;
import net.minecraft.k.m;

public abstract class d
implements g {
    private static /* synthetic */ m[] b;
    protected /* synthetic */ Map<i, n> a;

    public static void b(m[] arrm) {
        b = arrm;
    }

    public d() {
        this.a = Maps.newLinkedHashMap();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private <T extends Comparable<T>> String a(a<T> a10, Comparable<?> comparable) {
        return a10.a(comparable);
    }

    @Override
    public Map<i, n> a(K k2) {
        Map<i, n> map;
        block2: {
            UnmodifiableIterator unmodifiableIterator = k2.i().f().iterator();
            m[] arrm = d.b();
            while (unmodifiableIterator.hasNext()) {
                i i2 = (i)unmodifiableIterator.next();
                map = this.a;
                if (arrm != null) {
                    map.put(i2, this.a(i2));
                    if (arrm != null) continue;
                }
                break block2;
            }
            map = this.a;
        }
        return map;
    }

    public String a(Map<a<?>, Comparable<?>> map) {
        String string;
        block11: {
            StringBuilder stringBuilder;
            block10: {
                int n2;
                StringBuilder stringBuilder2;
                block9: {
                    stringBuilder2 = new StringBuilder();
                    Iterator<Map.Entry<a<?>, Comparable<?>>> iterator = map.entrySet().iterator();
                    m[] arrm = d.b();
                    while (iterator.hasNext()) {
                        Map.Entry<a<?>, Comparable<?>> entry = iterator.next();
                        Object object = stringBuilder2;
                        if (arrm != null) {
                            n2 = ((StringBuilder)object).length();
                            if (arrm == null) break block9;
                            if (n2 != 0) {
                                stringBuilder2.append(",");
                            }
                            object = entry.getKey();
                        }
                        a a10 = (a)object;
                        stringBuilder2.append(a10.c());
                        stringBuilder2.append("=");
                        stringBuilder2.append(this.a(a10, entry.getValue()));
                        if (arrm != null) continue;
                    }
                    stringBuilder = stringBuilder2;
                    if (arrm == null) break block10;
                    n2 = stringBuilder.length();
                }
                if (n2 == 0) {
                    stringBuilder2.append("normal");
                }
                stringBuilder = stringBuilder2;
            }
            string = stringBuilder.toString();
            if (m.d()) break block11;
            d.b(new m[2]);
        }
        return string;
    }

    public static m[] b() {
        return b;
    }

    protected abstract n a(i var1);

    static {
        if (d.b() == null) {
            d.b(new m[5]);
        }
    }
}

