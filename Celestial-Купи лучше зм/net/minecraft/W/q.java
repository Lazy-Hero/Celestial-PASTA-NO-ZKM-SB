/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.bT;
import net.minecraft.W.cL;
import net.minecraft.ar.aA;

class q
implements Predicate<x> {
    final /* synthetic */ aA b;
    final /* synthetic */ bT a;

    q(bT bT2, aA aA2) {
        this.a = bT2;
        this.b = aA2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        boolean bl2 = cL.e();
        x x3 = x2;
        if (bl2) {
            if (x3 == null) return false;
            x3 = x2;
        }
        if (x3.K() != this.b) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

