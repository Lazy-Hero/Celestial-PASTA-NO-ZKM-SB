/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableCollection
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSortedMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.UnmodifiableIterator
 *  javax.annotation.Nullable
 */
package net.minecraft.Z;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.h;
import net.minecraft.Z.i;
import net.minecraft.Z.m;
import net.minecraft.ae.a;
import net.minecraft.k.s;
import net.o;

public class c {
    private final /* synthetic */ ImmutableList<i> b;
    private final /* synthetic */ ImmutableSortedMap<String, a<?>> f;
    private static final /* synthetic */ Pattern c;
    private static final /* synthetic */ Function<a<?>, String> e;
    private final /* synthetic */ K a;
    private static /* synthetic */ String d;

    public static <T extends Comparable<T>> String a(K k2, a<T> a10) {
        String string;
        block4: {
            String string2 = a10.c();
            String string3 = net.minecraft.Z.c.c();
            if (!c.matcher(string2).matches()) {
                throw new IllegalArgumentException("Block: " + k2.getClass() + " has invalidly named property: " + string2);
            }
            for (Comparable comparable : a10.a()) {
                string = a10.a(comparable);
                if (string3 != null) {
                    String string4 = string;
                    if (!c.matcher(string4).matches()) {
                        throw new IllegalArgumentException("Block: " + k2.getClass() + " has property: " + string2 + " with invalidly named value: " + string4);
                    }
                    if (string3 != null) continue;
                }
                break block4;
            }
            string = string2;
        }
        return string;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static String c() {
        return d;
    }

    public K b() {
        return this.a;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("block", (Object)K.h.b(this.a)).add("properties", (Object)Iterables.transform((Iterable)this.f.values(), e)).toString();
    }

    public ImmutableList<i> f() {
        return this.b;
    }

    private List<Iterable<Comparable<?>>> d() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            ImmutableCollection immutableCollection = this.f.values();
            UnmodifiableIterator unmodifiableIterator = immutableCollection.iterator();
            String string = net.minecraft.Z.c.c();
            while (unmodifiableIterator.hasNext()) {
                a a10 = (a)unmodifiableIterator.next();
                arrayList = arrayList2;
                if (string != null) {
                    arrayList.add(a10.a());
                    if (string != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    static {
        c = Pattern.compile("^[a-z0-9_]+$");
        e = new h();
        net.minecraft.Z.c.b("GLXMEc");
    }

    protected m a(K k2, ImmutableMap<a<?>, Comparable<?>> immutableMap, @Nullable ImmutableMap<o<?>, Optional<?>> immutableMap2) {
        return new m(k2, (ImmutableMap)immutableMap, null);
    }

    public i a() {
        return (i)this.b.get(0);
    }

    public static void b(String string) {
        d = string;
    }

    public Collection<a<?>> e() {
        return this.f.values();
    }

    public c(K k2, a<?> ... arra) {
        this(k2, arra, (ImmutableMap<o<?>, Optional<?>>)null);
    }

    @Nullable
    public a<?> a(String string) {
        return (a)this.f.get((Object)string);
    }

    protected c(K k2, a<?>[] arra, ImmutableMap<o<?>, Optional<?>> immutableMap) {
        block8: {
            Iterator<List<Comparable<Object>>> iterator;
            ArrayList arrayList;
            Object object;
            String string;
            Object object2;
            block7: {
                block6: {
                    String string2 = net.minecraft.Z.c.c();
                    this.a = k2;
                    HashMap hashMap = Maps.newHashMap();
                    object2 = arra;
                    int n2 = ((a<?>[])object2).length;
                    string = string2;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        object = object2[i2];
                        net.minecraft.Z.c.a(k2, object);
                        hashMap.put(object.c(), object);
                        if (string != null) {
                            if (string != null) continue;
                            net.minecraft.k.m.b(!net.minecraft.k.m.c());
                            break;
                        }
                        break block6;
                    }
                    this.f = ImmutableSortedMap.copyOf((Map)hashMap);
                }
                object2 = Maps.newLinkedHashMap();
                arrayList = Lists.newArrayList();
                iterator = s.b(this.d()).iterator();
                while (iterator.hasNext()) {
                    object = iterator.next();
                    Map map = net.minecraft.ar.o.a(this.f.values(), object);
                    m m2 = this.a(k2, ImmutableMap.copyOf(map), immutableMap);
                    object2.put(map, m2);
                    arrayList.add(m2);
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block7;
                }
                iterator = arrayList.iterator();
            }
            while (iterator.hasNext()) {
                object = (m)((Object)iterator.next());
                ((m)object).a((Map<Map<a<?>, Comparable<?>>, m>)object2);
                if (string != null) {
                    if (string != null) continue;
                }
                break block8;
            }
            this.b = ImmutableList.copyOf((Collection)arrayList);
        }
    }
}

