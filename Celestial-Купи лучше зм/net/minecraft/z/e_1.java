/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
package net.minecraft.Z;

import com.google.common.base.Function;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.Z.c;
import net.minecraft.ae.a;

final class e
implements Function<Map.Entry<a<?>, Comparable<?>>, String> {
    private <T extends Comparable<T>> String a(a<T> a10, Comparable<?> comparable) {
        return a10.a(comparable);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public String a(@Nullable Map.Entry<a<?>, Comparable<?>> entry) {
        String string = c.c();
        Object object = entry;
        if (string != null) {
            if (object == null) {
                return "<NULL>";
            }
            object = entry.getKey();
        }
        a a10 = (a)object;
        return a10.c() + "=" + this.a(a10, entry.getValue());
    }

    e() {
    }
}

