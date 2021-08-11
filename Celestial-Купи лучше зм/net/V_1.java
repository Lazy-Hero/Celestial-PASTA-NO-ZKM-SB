/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.ag;
import net.minecraft.client.Q;
import net.minecraft.client.r.F;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.j;
import net.minecraft.client.w.v;
import net.q;

public class V
extends M {
    @Override
    public j e() {
        return new v();
    }

    public V() {
        super(ag.class, "zombie_villager", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        F f11 = new F(a42);
        f11.i = j2;
        f11.a = f10;
        return f11;
    }
}

