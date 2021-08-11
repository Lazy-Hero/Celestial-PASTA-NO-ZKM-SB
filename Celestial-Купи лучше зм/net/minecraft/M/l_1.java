/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.M;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.M.Q;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;

class l {
    private final /* synthetic */ a4 b;
    private final /* synthetic */ Set<aG<Q>> a;

    public void a() {
        Iterator iterator = Lists.newArrayList(this.a).iterator();
        int n2 = t.c();
        while (iterator.hasNext()) {
            aG aG2 = (aG)iterator.next();
            aG2.a(this.b);
            if (n2 != 0) continue;
        }
    }

    public l(a4 a42) {
        this.a = Sets.newHashSet();
        this.b = a42;
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public void b(aG<Q> aG2) {
        this.a.add(aG2);
    }

    public void a(aG<Q> aG2) {
        this.a.remove(aG2);
    }
}

