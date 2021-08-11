/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.K;
import net.minecraft.A.M;
import net.minecraft.A.q;
import net.minecraft.ah.z;

class P
extends M {
    final /* synthetic */ q M;

    private P(q q2) {
        this.M = q2;
    }

    P(q q2, K k2) {
        this(q2);
    }

    @Override
    protected void a(z z2, Random random) {
        super.a(z2, random);
        this.b(z2, random, 20, this.e, 32, 80);
    }
}

