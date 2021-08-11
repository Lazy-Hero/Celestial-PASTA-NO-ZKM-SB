/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.au;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.au.b;
import net.minecraft.au.h;

public class e
implements Predicate<i> {
    private final /* synthetic */ Map<a<?>, Predicate<?>> c;
    private final /* synthetic */ c a;
    public static final /* synthetic */ Predicate<i> b;

    public <V extends Comparable<V>> e a(a<V> a10, Predicate<? extends V> predicate) {
        if (!this.a.e().contains(a10)) {
            throw new IllegalArgumentException(this.a + " cannot support property " + a10);
        }
        this.c.put(a10, predicate);
        return this;
    }

    public static e a(K k2) {
        return new e(k2.i());
    }

    public boolean a(@Nullable i i2) {
        boolean bl2;
        block9: {
            block8: {
                boolean bl3;
                block6: {
                    i i3;
                    int n2;
                    block7: {
                        n2 = h.g();
                        i3 = i2;
                        if (n2 != 0) break block7;
                        if (i3 == null) break block8;
                        i3 = i2;
                    }
                    bl2 = i3.b().equals(this.a.b());
                    if (n2 != 0) break block9;
                    if (!bl2) break block8;
                    Map<a<?>, Predicate<?>> map = this.c;
                    if (n2 == 0) {
                        if (map.isEmpty()) {
                            return true;
                        }
                        map = this.c;
                    }
                    for (Map.Entry<a<?>, Predicate<?>> entry : map.entrySet()) {
                        block11: {
                            boolean bl4;
                            block10: {
                                bl3 = this.a(i2, entry.getKey(), entry.getValue());
                                if (n2 != 0) break block6;
                                if (n2 != 0) break block10;
                                if (bl3) break block11;
                                bl4 = false;
                            }
                            return bl4;
                        }
                        if (n2 == 0) continue;
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private e(c c10) {
        this.c = Maps.newHashMap();
        this.a = c10;
    }

    static {
        b = new b();
    }

    protected <T extends Comparable<T>> boolean a(i i2, a<T> a10, Predicate<T> predicate) {
        return predicate.apply(i2.b(a10));
    }
}

