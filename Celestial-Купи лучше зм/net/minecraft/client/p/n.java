/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.p;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.Z.c;
import net.minecraft.client.p.h;
import net.minecraft.client.x.W;

public class n {
    private /* synthetic */ c b;
    private final /* synthetic */ List<h> a;

    public Set<W> a() {
        HashSet hashSet;
        block2: {
            HashSet hashSet2 = Sets.newHashSet();
            Iterator<h> iterator = this.a.iterator();
            String string = h.b();
            while (iterator.hasNext()) {
                h h2 = iterator.next();
                hashSet = hashSet2;
                if (string != null) {
                    hashSet.add(h2.a());
                    if (string != null) continue;
                }
                break block2;
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public List<h> c() {
        return this.a;
    }

    public void a(c c10) {
        this.b = c10;
    }

    public c b() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int hashCode() {
        int n2;
        String string = h.b();
        int n3 = 31 * this.a.hashCode();
        c c10 = this.b;
        if (string != null) {
            if (c10 == null) {
                n2 = 0;
                return n3 + n2;
            }
            c10 = this.b;
        }
        n2 = c10.hashCode();
        return n3 + n2;
    }

    public n(List<h> list) {
        this.a = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = h.b();
        Object object2 = this;
        if (string != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof n;
        if (string == null) return bl2;
        if (!bl2) return false;
        n n2 = (n)object;
        bl2 = this.a.equals(n2.a);
        if (string == null) return bl2;
        if (!bl2) return false;
        c c10 = this.b;
        if (string == null) return c10.equals(n2.b);
        if (c10 == null) {
            if (n2.b != null) return false;
            return true;
        }
        c10 = this.b;
        return c10.equals(n2.b);
    }
}

