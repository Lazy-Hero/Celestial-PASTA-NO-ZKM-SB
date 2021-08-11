/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterables
 */
package net.minecraft.client.p;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import net.minecraft.Z.i;
import net.minecraft.client.p.g;
import net.minecraft.client.p.m;

public class c
implements m {
    final /* synthetic */ Iterable<m> c;

    public c(Iterable<m> iterable) {
        this.c = iterable;
    }

    @Override
    public Predicate<i> a(net.minecraft.Z.c c10) {
        return Predicates.or((Iterable)Iterables.transform(this.c, (Function)new g(this, c10)));
    }
}

