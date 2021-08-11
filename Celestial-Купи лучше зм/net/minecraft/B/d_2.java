/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  javax.annotation.Nullable
 */
package net.minecraft.b;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.L;
import net.minecraft.ar.ab;
import net.minecraft.b.b;

public class d<K, V>
extends b<K, V>
implements L<V> {
    protected final /* synthetic */ Map<V, K> a;
    protected final /* synthetic */ ab<V> f;

    @Override
    protected Map<K, V> c() {
        return HashBiMap.create();
    }

    @Override
    @Nullable
    public V a(int n2) {
        return this.f.a(n2);
    }

    @Override
    @Nullable
    public V a(@Nullable K k2) {
        return super.a(k2);
    }

    public d() {
        this.f = new ab(256);
        this.a = ((BiMap)this.c).inverse();
    }

    @Nullable
    public K b(V v2) {
        return this.a.get(v2);
    }

    public int c(@Nullable V v2) {
        return this.f.b(v2);
    }

    @Override
    public Iterator<V> iterator() {
        return this.f.iterator();
    }

    public void a(int n2, K k2, V v2) {
        this.f.a(v2, n2);
        this.a(k2, v2);
    }

    @Override
    public boolean a(K k2) {
        return (boolean)super.a(k2);
    }
}

