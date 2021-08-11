/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 */
package net.minecraft.k;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.k.c;
import net.minecraft.k.n;
import net.minecraft.k.r;

public class s {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static <T> Iterable<T[]> b(Class<T> class_, Iterable<? extends Iterable<? extends T>> iterable) {
        return new c(class_, s.a(Iterable.class, iterable), null);
    }

    static Object[] b(Class class_, int n2) {
        return s.a(class_, n2);
    }

    private static <T> T[] a(Class<? super T> class_, int n2) {
        return (Object[])Array.newInstance(class_, n2);
    }

    private static <T> Iterable<List<T>> a(Iterable<Object[]> iterable) {
        return Iterables.transform(iterable, new r(null));
    }

    private static <T> T[] a(Class<? super T> class_, Iterable<? extends T> iterable) {
        ArrayList arrayList;
        ArrayList arrayList2;
        block2: {
            arrayList2 = Lists.newArrayList();
            Iterator<T> iterator = iterable.iterator();
            boolean bl2 = n.g();
            while (iterator.hasNext()) {
                T t2 = iterator.next();
                arrayList = arrayList2;
                if (bl2) {
                    arrayList.add(t2);
                    if (bl2) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList.toArray(s.a(class_, arrayList2.size()));
    }

    public static <T> Iterable<List<T>> b(Iterable<? extends Iterable<? extends T>> iterable) {
        return s.a(s.b(Object.class, iterable));
    }
}

