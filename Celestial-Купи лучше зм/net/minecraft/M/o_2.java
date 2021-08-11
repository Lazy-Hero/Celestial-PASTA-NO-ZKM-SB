/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.aj.l;
import net.minecraft.ax.T;
import net.minecraft.g.d;
import net.minecraft.m.m;

public class o
extends m {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ l a;

    public o(d[] arrd, l l2, boolean bl2) {
        super(arrd);
        this.a = l2;
        this.d = bl2;
    }

    static boolean b(o o2) {
        return o2.d;
    }

    @Override
    public net.minecraft.w.d a(net.minecraft.w.d d10, Random random, k k2) {
        return T.a(random, d10, this.a.a(random), this.d);
    }

    static l a(o o2) {
        return o2.a;
    }
}

