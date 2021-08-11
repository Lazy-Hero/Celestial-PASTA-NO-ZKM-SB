/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.aN;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.y;
import net.minecraft.client.w.j;
import net.minecraft.client.w.u;
import net.q;

public class P
extends M {
    @Override
    public j e() {
        return new u();
    }

    public P() {
        super(aN.class, "zombie_pigman", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        y y2 = new y(a42);
        y2.i = j2;
        y2.a = f10;
        return y2;
    }
}

