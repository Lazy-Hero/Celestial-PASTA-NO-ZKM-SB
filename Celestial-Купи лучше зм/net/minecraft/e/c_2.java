/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.E;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.U.x;
import net.minecraft.k.l;

final class c
implements Comparator<x> {
    final /* synthetic */ l a;

    public int a(x x2, x x3) {
        return ComparisonChain.start().compare(x2.a(this.a.e, this.a.d, this.a.b), x3.a(this.a.e, this.a.d, this.a.b)).result();
    }

    c(l l2) {
        this.a = l2;
    }
}

