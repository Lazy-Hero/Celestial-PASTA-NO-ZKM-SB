/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.x.J;
import net.minecraft.client.x.n;

class O
implements Predicate<n> {
    final /* synthetic */ v b;
    final /* synthetic */ J a;

    public boolean a(@Nullable n n2) {
        return this.b.equals(n2);
    }

    O(J j2, v v2) {
        this.a = j2;
        this.b = v2;
    }
}

