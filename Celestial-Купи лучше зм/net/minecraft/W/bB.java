/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.w.k;

public class bB
extends K {
    @Override
    public int a(int n2, Random random) {
        return net.minecraft.k.h.c(this.a(random) + random.nextInt(n2 + 1), 1, 5);
    }

    @Override
    public int a(Random random) {
        return 2 + random.nextInt(2);
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.V;
    }

    public bB(c c10) {
        super(c10);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    protected boolean r() {
        return true;
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.M;
    }
}

