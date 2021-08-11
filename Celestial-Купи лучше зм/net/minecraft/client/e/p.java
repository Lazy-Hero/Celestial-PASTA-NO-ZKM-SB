/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import net.minecraft.client.e.z;

final class p
implements ParameterizedType {
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, z.class};
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    p() {
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

