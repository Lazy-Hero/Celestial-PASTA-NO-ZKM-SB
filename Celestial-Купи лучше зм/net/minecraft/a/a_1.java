/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import net.minecraft.a.b;

final class a
implements ParameterizedType {
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{b.class};
    }

    a() {
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

