/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.ao;
import net.minecraft.client.Q;
import net.minecraft.client.r.N;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.M;
import net.minecraft.client.w.j;
import net.q;

public class aD
extends ao {
    public aD() {
        super(net.minecraft.T.ao.class, "evocation_illager", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        N n2 = new N(a42);
        n2.i = j2;
        n2.a = f10;
        return n2;
    }

    @Override
    public j e() {
        return new M(0.0f, 0.0f, 64, 64);
    }
}

