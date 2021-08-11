/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.b;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.b.a;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b<K, V>
implements a<K, V> {
    private /* synthetic */ Object[] d;
    private static final /* synthetic */ Logger e;
    protected final /* synthetic */ Map<K, V> c;
    private static /* synthetic */ m[] b;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public Set<K> a() {
        return Collections.unmodifiableSet(this.c.keySet());
    }

    protected Map<K, V> c() {
        return Maps.newHashMap();
    }

    public static m[] b() {
        return b;
    }

    @Override
    public boolean a(K k2) {
        return this.c.containsKey(k2);
    }

    public b() {
        this.c = this.c();
    }

    static {
        e = LogManager.getLogger();
        net.minecraft.b.b.b(new m[2]);
    }

    @Override
    @Nullable
    public V a(@Nullable K k2) {
        return this.c.get(k2);
    }

    @Override
    @Nullable
    public V a(Random random) {
        m[] arrm = net.minecraft.b.b.b();
        Object object = this.d;
        if (arrm != null) {
            if (object == null) {
                Collection<V> collection = this.c.values();
                if (collection.isEmpty()) {
                    return null;
                }
                this.d = collection.toArray(new Object[collection.size()]);
            }
            object = this.d[random.nextInt(this.d.length)];
        }
        return (V)object;
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    @Override
    public Iterator<V> iterator() {
        return this.c.values().iterator();
    }

    @Override
    public void a(K k2, V v2) {
        Validate.notNull(k2);
        Validate.notNull(v2);
        this.d = null;
        if (this.c.containsKey(k2)) {
            e.debug("Adding duplicate key '{}' to registry", k2);
        }
        this.c.put(k2, v2);
    }
}

