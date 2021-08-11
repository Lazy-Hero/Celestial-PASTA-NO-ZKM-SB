/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.client.b;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.client.b.f;

public class g
extends f {
    private final /* synthetic */ Predicate<String> d;

    public Predicate<String> a() {
        return this.d;
    }

    public g(int n2, String string, boolean bl2, Predicate<String> predicate) {
        super(n2, string, bl2);
        this.d = (Predicate)MoreObjects.firstNonNull(predicate, (Object)Predicates.alwaysTrue());
    }
}

