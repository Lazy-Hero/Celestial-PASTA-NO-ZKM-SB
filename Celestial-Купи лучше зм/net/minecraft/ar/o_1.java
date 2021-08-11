/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import net.minecraft.ar.v;

public class o {
    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2, Map<K, V> map) {
        block3: {
            Iterator<V> iterator = iterable2.iterator();
            Iterator<K> iterator2 = iterable.iterator();
            int n2 = v.d();
            while (iterator2.hasNext()) {
                K k2 = iterator2.next();
                map.put(k2, iterator.next());
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block3;
            }
            if (iterator.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        return map;
    }

    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2) {
        return o.a(iterable, iterable2, Maps.newLinkedHashMap());
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}

