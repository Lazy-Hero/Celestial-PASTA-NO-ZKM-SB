/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.ak;
import net.minecraft.client.Q;
import net.minecraft.client.r.A;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.j;
import net.minecraft.client.w.s;
import net.q;

public class R
extends M {
    @Override
    public j e() {
        return new s();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        A a10 = new A(a42);
        a10.i = j2;
        a10.a = f10;
        return a10;
    }

    public R() {
        super(ak.class, "stray", 0.7f);
    }
}

