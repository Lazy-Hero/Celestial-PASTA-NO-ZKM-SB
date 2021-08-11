/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import net.minecraft.T.V;
import net.minecraft.ag.Q;
import net.minecraft.w.bl;

class h
implements Predicate<Q> {
    final /* synthetic */ V a;

    private static gP a(gP gP2) {
        return gP2;
    }

    h(V v2) {
        this.a = v2;
    }

    public boolean a(Q q2) {
        return q2.a() == bl.BLUE;
    }
}

