/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.m;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.ar.v;
import net.minecraft.m.c;
import net.minecraft.m.d;
import net.minecraft.m.e;
import net.minecraft.m.f;
import net.minecraft.m.g;
import net.minecraft.m.h;
import net.minecraft.m.i;
import net.minecraft.m.j;
import net.minecraft.m.k;
import net.minecraft.m.l;
import net.minecraft.m.m;

public class a {
    private static final /* synthetic */ Map<v, c<?>> b;
    private static final /* synthetic */ Map<Class<? extends m>, c<?>> a;

    public static c<?> a(v v2) {
        c<?> c10 = b.get(v2);
        net.minecraft.k.m[] arrm = m.b();
        c<?> c11 = c10;
        if (arrm != null) {
            if (c11 == null) {
                throw new IllegalArgumentException("Unknown loot item function '" + v2 + "'");
            }
            c11 = c10;
        }
        return c11;
    }

    public static <T extends m> c<T> a(T t2) {
        c<?> c10 = a.get(t2.getClass());
        net.minecraft.k.m[] arrm = m.b();
        c<?> c11 = c10;
        if (arrm != null) {
            if (c11 == null) {
                throw new IllegalArgumentException("Unknown loot item function " + t2);
            }
            c11 = c10;
        }
        return c11;
    }

    static {
        b = Maps.newHashMap();
        a = Maps.newHashMap();
        net.minecraft.m.a.a(new h());
        net.minecraft.m.a.a(new j());
        net.minecraft.m.a.a(new e());
        net.minecraft.m.a.a(new d());
        net.minecraft.m.a.a(new k());
        net.minecraft.m.a.a(new l());
        net.minecraft.m.a.a(new f());
        net.minecraft.m.a.a(new i());
        net.minecraft.m.a.a(new g());
    }

    public static <T extends m> void a(c<? extends T> c10) {
        v v2 = c10.a();
        Class<T> class_ = c10.b();
        if (b.containsKey(v2)) {
            throw new IllegalArgumentException("Can't re-register item function name " + v2);
        }
        if (a.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register item function class " + class_.getName());
        }
        b.put(v2, c10);
        a.put(class_, c10);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

