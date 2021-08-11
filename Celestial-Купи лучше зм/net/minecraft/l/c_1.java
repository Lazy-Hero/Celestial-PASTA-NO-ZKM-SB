/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.L;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.L.b;
import net.minecraft.L.d;
import net.minecraft.L.e;
import net.minecraft.ar.v;
import net.minecraft.k.m;

public class c {
    private static final /* synthetic */ Map<Class<? extends b>, d<?>> a;
    private static final /* synthetic */ Map<v, d<?>> b;

    public static <T extends b> d<T> a(T t2) {
        d<?> d10 = a.get(t2.getClass());
        boolean bl2 = d.c();
        d<?> d11 = d10;
        if (!bl2) {
            if (d11 == null) {
                throw new IllegalArgumentException("Unknown loot entity property " + t2);
            }
            d11 = d10;
        }
        if (bl2) {
            m.b(!m.d());
        }
        return d11;
    }

    public static d<?> a(v v2) {
        d<?> d10 = b.get(v2);
        boolean bl2 = d.c();
        d<?> d11 = d10;
        if (!bl2) {
            if (d11 == null) {
                throw new IllegalArgumentException("Unknown loot entity property '" + v2 + "'");
            }
            d11 = d10;
        }
        if (!m.d()) {
            d.b(!bl2);
        }
        return d11;
    }

    static {
        b = Maps.newHashMap();
        a = Maps.newHashMap();
        c.a(new e());
    }

    public static <T extends b> void a(d<? extends T> d10) {
        v v2 = d10.b();
        Class<T> class_ = d10.d();
        if (b.containsKey(v2)) {
            throw new IllegalArgumentException("Can't re-register entity property name " + v2);
        }
        if (a.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register entity property class " + class_.getName());
        }
        b.put(v2, d10);
        a.put(class_, d10);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

