/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.g;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.g.d;
import net.minecraft.g.f;
import net.minecraft.g.g;
import net.minecraft.g.h;
import net.minecraft.g.i;
import net.minecraft.g.j;
import net.minecraft.g.k;

public class b {
    private static final /* synthetic */ Map<Class<? extends d>, f<?>> a;
    private static final /* synthetic */ Map<v, f<?>> b;

    static {
        b = Maps.newHashMap();
        a = Maps.newHashMap();
        net.minecraft.g.b.a(new j());
        net.minecraft.g.b.a(new k());
        net.minecraft.g.b.a(new g());
        net.minecraft.g.b.a(new i());
        net.minecraft.g.b.a(new h());
    }

    public static boolean a(@Nullable d[] arrd, Random random, net.minecraft.aj.k k2) {
        boolean bl2;
        block6: {
            int[] arrn = f.b();
            d[] arrd2 = arrd;
            if (arrn != null) {
                if (arrd2 == null) {
                    return true;
                }
                arrd2 = arrd;
            }
            d[] arrd3 = arrd2;
            int n2 = arrd3.length;
            int n3 = 0;
            while (n3 < n2) {
                d d10 = arrd3[n3];
                if (arrn != null) {
                    bl2 = d10.a(random, k2);
                    if (arrn == null) break block6;
                    if (!bl2) {
                        return false;
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static <T extends d> f<T> a(T t2) {
        f<?> f10 = a.get(t2.getClass());
        int[] arrn = f.b();
        f<?> f11 = f10;
        if (arrn != null) {
            if (f11 == null) {
                throw new IllegalArgumentException("Unknown loot item condition " + t2);
            }
            f11 = f10;
        }
        return f11;
    }

    public static f<?> a(v v2) {
        f<?> f10 = b.get(v2);
        int[] arrn = f.b();
        f<?> f11 = f10;
        if (arrn != null) {
            if (f11 == null) {
                throw new IllegalArgumentException("Unknown loot item condition '" + v2 + "'");
            }
            f11 = f10;
        }
        return f11;
    }

    public static <T extends d> void a(f<? extends T> f10) {
        v v2 = f10.c();
        Class<T> class_ = f10.d();
        if (b.containsKey(v2)) {
            throw new IllegalArgumentException("Can't re-register item condition name " + v2);
        }
        if (a.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register item condition class " + class_.getName());
        }
        b.put(v2, f10);
        a.put(class_, f10);
    }
}

