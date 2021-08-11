/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  javax.annotation.Nullable
 */
package net.minecraft.j;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.V;
import net.minecraft.j.b;
import net.minecraft.j.c;
import net.minecraft.j.f;
import net.minecraft.k.m;

public abstract class g {
    protected final /* synthetic */ Multimap<c, c> a;
    protected final /* synthetic */ Map<String, b> b;
    protected final /* synthetic */ Map<c, b> c;

    public g() {
        this.c = Maps.newHashMap();
        this.b = new V<b>();
        this.a = HashMultimap.create();
    }

    public b a(c c10) {
        return this.c.get(c10);
    }

    public Collection<b> a() {
        return this.b.values();
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    protected abstract b c(c var1);

    @Nullable
    public b a(String string) {
        return this.b.get(string);
    }

    public void a(b b10) {
    }

    public void a(Multimap<String, f> multimap) {
        Iterator iterator = multimap.entries().iterator();
        m[] arrm = f.b();
        while (iterator.hasNext()) {
            block4: {
                b b10;
                Map.Entry entry;
                block3: {
                    b b11;
                    entry = (Map.Entry)iterator.next();
                    b10 = b11 = this.a((String)entry.getKey());
                    if (arrm == null) break block3;
                    if (b10 == null) break block4;
                    b10 = b11;
                }
                b10.a((f)entry.getValue());
            }
            if (arrm != null) continue;
        }
    }

    public b b(c c10) {
        m[] arrm = f.b();
        g g10 = this;
        if (arrm != null) {
            if (g10.b.containsKey(c10.c())) {
                throw new IllegalArgumentException("Attribute is already registered!");
            }
            g10 = this;
        }
        b b10 = g10.c(c10);
        this.b.put(c10.c(), b10);
        this.c.put(c10, b10);
        for (c c11 = c10.a(); c11 != null; c11 = c11.a()) {
            this.a.put((Object)c11, (Object)c10);
            if (arrm != null) continue;
        }
        return b10;
    }

    public void b(Multimap<String, f> multimap) {
        Iterator iterator = multimap.entries().iterator();
        m[] arrm = f.b();
        while (iterator.hasNext()) {
            block4: {
                b b10;
                Map.Entry entry;
                block3: {
                    b b11;
                    entry = (Map.Entry)iterator.next();
                    b10 = b11 = this.a((String)entry.getKey());
                    if (arrm == null) break block3;
                    if (b10 == null) break block4;
                    b11.a((f)entry.getValue());
                    b10 = b11;
                }
                b10.b((f)entry.getValue());
            }
            if (arrm != null) continue;
        }
    }
}

