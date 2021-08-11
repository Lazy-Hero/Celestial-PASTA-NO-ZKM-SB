/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.k;

public class cF
extends K {
    @Override
    public void a(z z2, n n2, i i2, Random random) {
        boolean bl2 = cL.e();
        int n3 = z2.a(net.minecraft.ah.c.BLOCK, n2);
        if (bl2 && n3 > 11) {
            this.a(z2, n2, z2.d(n2), 0);
            n3 = z2.v(n2) ? 1 : 0;
        }
    }

    protected cF() {
        super(net.minecraft.ac.c.E);
        this.a(true);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public int a(Random random) {
        return 4;
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.aB;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

