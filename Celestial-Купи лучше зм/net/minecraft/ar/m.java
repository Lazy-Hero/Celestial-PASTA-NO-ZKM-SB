/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ar.L;
import net.minecraft.ar.v;

public class m<T>
implements L<T> {
    private final /* synthetic */ List<T> b;
    private final /* synthetic */ IdentityHashMap<T, Integer> a;

    public m() {
        this(512);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(T t2) {
        Integer n2 = this.a.get(t2);
        int n3 = v.d();
        Integer n4 = n2;
        if (n3 != 0) {
            if (n4 == null) {
                return -1;
            }
            n4 = n2;
        }
        int n5 = n4;
        return n5;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.a.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public final T a(int n2) {
        T t2;
        block5: {
            int n3;
            block4: {
                int n4 = v.d();
                n3 = n2;
                if (n4 == 0) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < this.b.size()) {
                t2 = this.b.get(n2);
                return t2;
            }
        }
        t2 = null;
        return t2;
    }

    public m(int n2) {
        this.b = Lists.newArrayListWithExpectedSize((int)n2);
        this.a = new IdentityHashMap(n2);
    }

    public void a(T t2, int n2) {
        block2: {
            int n3 = v.d();
            this.a.put(t2, n2);
            int n4 = n3;
            while (this.b.size() <= n2) {
                this.b.add(null);
                if (n4 != 0) {
                    if (n4 != 0) continue;
                }
                break block2;
            }
            this.b.set(n2, t2);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.filter(this.b.iterator(), (Predicate)Predicates.notNull());
    }
}

