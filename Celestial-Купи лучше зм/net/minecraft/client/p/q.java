/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.p;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.client.p.r;

class q
implements Function<String, Predicate<i>> {
    final /* synthetic */ a a;
    final /* synthetic */ r b;

    @Nullable
    public Predicate<i> a(@Nullable String string) {
        return r.a(this.b, this.a, string);
    }

    q(r r2, a a10) {
        this.b = r2;
        this.a = a10;
    }
}

