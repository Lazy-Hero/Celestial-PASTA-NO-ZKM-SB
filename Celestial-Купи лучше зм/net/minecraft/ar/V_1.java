/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.ar.v;

public class V<V>
implements Map<String, V> {
    private final /* synthetic */ Map<String, V> a;

    @Override
    public V remove(Object object) {
        return this.a.remove(object.toString().toLowerCase(Locale.ROOT));
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object.toString().toLowerCase(Locale.ROOT));
    }

    public V() {
        this.a = Maps.newLinkedHashMap();
    }

    @Override
    public Collection<V> values() {
        return this.a.values();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    public V a(String string, V v2) {
        return this.a.put(string.toLowerCase(Locale.ROOT), v2);
    }

    @Override
    public Set<Map.Entry<String, V>> entrySet() {
        return this.a.entrySet();
    }

    @Override
    public void putAll(Map<? extends String, ? extends V> map) {
        Iterator<Map.Entry<String, V>> iterator = map.entrySet().iterator();
        int n2 = v.d();
        while (iterator.hasNext()) {
            Map.Entry<String, V> entry = iterator.next();
            this.a(entry.getKey(), entry.getValue());
            if (n2 != 0) continue;
        }
    }

    @Override
    public V get(Object object) {
        return this.a.get(object.toString().toLowerCase(Locale.ROOT));
    }

    @Override
    public Set<String> keySet() {
        return this.a.keySet();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public void clear() {
        this.a.clear();
    }
}

