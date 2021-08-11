/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.ah;
import net.minecraft.client.Q;
import net.minecraft.client.r.L;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.j;
import net.q;

public class N
extends M {
    public N() {
        super(ah.class, "enderman", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        L l2 = new L(a42);
        l2.i = j2;
        l2.a = f10;
        return l2;
    }

    @Override
    public j e() {
        return new net.minecraft.client.w.q(0.0f);
    }
}

