/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import java.util.Collections;
import java.util.Iterator;
import net.minecraft.k.d;
import net.minecraft.k.e;
import net.minecraft.k.n;
import net.minecraft.k.s;

class c<T>
implements Iterable<T[]> {
    private final /* synthetic */ Class<T> b;
    private final /* synthetic */ Iterable<? extends T>[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    private c(Class<T> class_, Iterable<? extends T>[] arriterable) {
        this.b = class_;
        this.a = arriterable;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Iterator<T[]> iterator() {
        Object object;
        boolean bl2 = n.e();
        Object[] arrobject = this.a;
        if (!bl2) {
            if (arrobject.length > 0) {
                object = new d(this.b, this.a, null);
                return object;
            }
            arrobject = s.b(this.b, 0);
        }
        object = Collections.singletonList(arrobject).iterator();
        return object;
    }

    c(Class class_, Iterable[] arriterable, e e10) {
        this(class_, arriterable);
    }
}

