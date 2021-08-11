/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.u.h;
import net.minecraft.w.k;

public class b3
extends K {
    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.ap;
    }

    @Override
    public int a(int n2, Random random) {
        return Math.min(9, this.a(random) + random.nextInt(1 + n2));
    }

    @Override
    public int a(Random random) {
        return 3 + random.nextInt(5);
    }

    protected b3() {
        super(net.minecraft.ac.c.h, net.minecraft.ac.a.H);
        this.a(net.minecraft.ad.a.r);
    }
}

