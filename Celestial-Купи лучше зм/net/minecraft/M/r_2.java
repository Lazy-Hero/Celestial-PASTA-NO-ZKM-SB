/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.aj.l;
import net.minecraft.g.d;
import net.minecraft.m.m;

public class r
extends m {
    private final /* synthetic */ l a;

    static l a(r r2) {
        return r2.a;
    }

    public r(d[] arrd, l l2) {
        super(arrd);
        this.a = l2;
    }

    @Override
    public net.minecraft.w.d a(net.minecraft.w.d d10, Random random, k k2) {
        d10.c(this.a.a(random));
        return d10;
    }
}

