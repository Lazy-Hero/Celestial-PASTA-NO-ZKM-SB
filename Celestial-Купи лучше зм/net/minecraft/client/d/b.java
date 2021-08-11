/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.d;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ar.v;
import net.minecraft.client.d.d;
import net.minecraft.client.d.e;
import net.minecraft.client.d.g;
import net.minecraft.client.x.n;
import net.minecraft.k.m;

public class b {
    private final /* synthetic */ Map<K, g> a;
    private final /* synthetic */ Set<K> b;

    /*
     * Enabled aggressive block sorting
     */
    public Map<i, n> b(K k2) {
        Map<i, n> map;
        m[] arrm = d.b();
        Object object = this.b;
        if (arrm != null) {
            if (object.contains(k2)) {
                map = Collections.emptyMap();
                return map;
            }
            object = MoreObjects.firstNonNull((Object)this.a.get(k2), (Object)new e());
        }
        map = ((g)object).a(k2);
        return map;
    }

    public Set<v> a(K k2) {
        HashSet hashSet;
        block8: {
            g g10;
            m[] arrm;
            block10: {
                Object object;
                block9: {
                    arrm = d.b();
                    Object object2 = this.b;
                    if (arrm != null) {
                        if (object2.contains(k2)) {
                            return Collections.emptySet();
                        }
                        object2 = this.a.get(k2);
                    }
                    g10 = (g)object2;
                    object = g10;
                    if (arrm == null) break block9;
                    if (object != null) break block10;
                    object = K.h.b(k2);
                }
                return Collections.singleton(object);
            }
            HashSet hashSet2 = Sets.newHashSet();
            for (n n2 : g10.a(k2).values()) {
                hashSet = hashSet2;
                if (arrm != null) {
                    hashSet.add(new v(n2.c(), n2.a()));
                    if (arrm != null) continue;
                }
                break block8;
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(K k2, g g10) {
        this.a.put(k2, g10);
    }

    public void a(K ... arrk) {
        Collections.addAll(this.b, arrk);
    }

    public Map<i, n> a() {
        IdentityHashMap identityHashMap;
        block2: {
            IdentityHashMap identityHashMap2 = Maps.newIdentityHashMap();
            Iterator iterator = K.h.iterator();
            m[] arrm = d.b();
            while (iterator.hasNext()) {
                K k2 = (K)iterator.next();
                identityHashMap = identityHashMap2;
                if (arrm != null) {
                    identityHashMap.putAll(this.b(k2));
                    if (arrm != null) continue;
                }
                break block2;
            }
            identityHashMap = identityHashMap2;
        }
        return identityHashMap;
    }

    public b() {
        this.a = Maps.newIdentityHashMap();
        this.b = Sets.newIdentityHashSet();
    }
}

