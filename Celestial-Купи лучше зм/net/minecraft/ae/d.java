/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.ae;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import net.minecraft.ae.b;
import net.minecraft.ar.p;
import net.minecraft.k.m;

public class d<T extends Enum<T>>
extends b<T> {
    private final /* synthetic */ Map<String, T> e;
    private final /* synthetic */ ImmutableSet<T> d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        String[] arrstring = b.b();
        Object object2 = this;
        if (arrstring != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof d;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = super.equals(object);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        d d10 = (d)object;
        boolean bl3 = this.d.equals(d10.d);
        if (arrstring != null) {
            if (!bl3) return false;
            bl3 = this.e.equals(d10.e);
        }
        if (arrstring == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public static <T extends Enum<T>> d<T> a(String string, Class<T> class_, Predicate<T> predicate) {
        return net.minecraft.ae.d.a(string, class_, Collections2.filter((Collection)Lists.newArrayList((Object[])class_.getEnumConstants()), predicate));
    }

    public static <T extends Enum<T>> d<T> a(String string, Class<T> class_) {
        return net.minecraft.ae.d.a(string, class_, Predicates.alwaysTrue());
    }

    @Override
    public String a(T t2) {
        return ((p)t2).a();
    }

    protected d(String string, Class<T> class_, Collection<T> collection) {
        super(string, class_);
        this.e = Maps.newHashMap();
        this.d = ImmutableSet.copyOf(collection);
        for (Enum enum_ : collection) {
            String string2 = ((p)((Object)enum_)).a();
            if (this.e.containsKey(string2)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + string2 + "'");
            }
            this.e.put(string2, enum_);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public Collection<T> a() {
        return this.d;
    }

    public static <T extends Enum<T>> d<T> a(String string, Class<T> class_, T ... arrT) {
        return net.minecraft.ae.d.a(string, class_, Lists.newArrayList((Object[])arrT));
    }

    public static <T extends Enum<T>> d<T> a(String string, Class<T> class_, Collection<T> collection) {
        return new d<T>(string, class_, collection);
    }

    @Override
    public Optional<T> a(String string) {
        return Optional.fromNullable(this.e.get(string));
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.e.hashCode();
        String[] arrstring = b.b();
        if (arrstring == null) {
            m.b(!m.d());
        }
        return n2;
    }
}

