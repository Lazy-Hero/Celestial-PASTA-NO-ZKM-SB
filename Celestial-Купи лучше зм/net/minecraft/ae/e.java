/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 */
package net.minecraft.ae;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.ae.d;
import net.minecraft.ar.aA;

public class e
extends d<aA> {
    public static e a(String string) {
        return e.a(string, (Predicate<aA>)Predicates.alwaysTrue());
    }

    public static e a(String string, Predicate<aA> predicate) {
        return e.a(string, Collections2.filter((Collection)Lists.newArrayList((Object[])aA.values()), predicate));
    }

    protected e(String string, Collection<aA> collection) {
        super(string, aA.class, collection);
    }

    public static e a(String string, Collection<aA> collection) {
        return new e(string, collection);
    }
}

