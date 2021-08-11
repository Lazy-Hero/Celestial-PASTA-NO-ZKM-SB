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
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.client.p.m;
import net.minecraft.client.p.o;

public class e
implements m {
    private final /* synthetic */ Iterable<m> c;

    @Override
    public Predicate<i> a(c c10) {
        return Predicates.and((Iterable)Iterables.transform(this.c, (Function)new o(this, c10)));
    }

    public e(Iterable<m> iterable) {
        this.c = iterable;
    }
}

