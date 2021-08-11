/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.b;

import java.util.Set;
import javax.annotation.Nullable;

public interface a<K, V>
extends Iterable<V> {
    public void a(K var1, V var2);

    @Nullable
    public V a(K var1);

    public Set<K> a();
}

