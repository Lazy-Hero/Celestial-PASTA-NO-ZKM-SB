/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 */
package net.minecraft.ar;

import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.ar.a;
import net.minecraft.ar.v;

class aR
implements Iterable<S> {
    final /* synthetic */ Class b;
    final /* synthetic */ a a;

    @Override
    public Iterator<S> iterator() {
        List list = (List)net.minecraft.ar.a.a(this.a).get(this.a.b(this.b));
        int n2 = v.d();
        List list2 = list;
        if (n2 != 0) {
            if (list2 == null) {
                return Collections.emptyIterator();
            }
            list2 = list;
        }
        Iterator iterator = list2.iterator();
        return Iterators.filter(iterator, (Class)this.b);
    }

    aR(a a10, Class class_) {
        this.a = a10;
        this.b = class_;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

