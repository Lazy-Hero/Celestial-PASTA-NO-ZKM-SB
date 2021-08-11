/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package net.minecraft.b;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.b.b;
import net.minecraft.k.m;

public class c<K, V>
extends b<K, V> {
    private final /* synthetic */ V a;

    public c(V v2) {
        this.a = v2;
    }

    @Override
    @Nonnull
    public V a(@Nullable K k2) {
        Object v2 = super.a(k2);
        m[] arrm = b.b();
        Object v3 = v2;
        if (arrm != null) {
            v3 = v3 == null ? this.a : v2;
        }
        return v3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

