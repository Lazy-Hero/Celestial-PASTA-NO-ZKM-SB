/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.aO;
import net.minecraft.client.Q;
import net.minecraft.client.r.E;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.j;
import net.minecraft.client.w.u;
import net.q;

public class O
extends M {
    public O() {
        super(aO.class, "husk", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        E e10 = new E(a42);
        e10.i = j2;
        e10.a = f10;
        return e10;
    }

    @Override
    public j e() {
        return new u();
    }
}

