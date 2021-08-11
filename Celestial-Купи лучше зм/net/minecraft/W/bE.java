/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.bw;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ah.t;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.k;

public class bE
extends bw {
    @Override
    public int b(i i2) {
        return -8356741;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public k a(i i2, Random random, int n2) {
        boolean bl2 = cL.b();
        int n3 = n2;
        if (!bl2) {
            if (n3 > 3) {
                n2 = 3;
            }
            n3 = random.nextInt(10 - n2 * 3);
        }
        return n3 == 0 ? net.minecraft.u.h.aj : super.a(i2, random, n2);
    }

    @Override
    public a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.T;
    }
}

