/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.client.Q;
import net.minecraft.client.r.D;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.j;
import net.minecraft.client.w.u;
import net.q;

public class U
extends M {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        D d10 = new D(a42);
        d10.i = j2;
        d10.a = f10;
        return d10;
    }

    public U() {
        super(net.minecraft.T.a4.class, "zombie", 0.5f);
    }

    @Override
    public j e() {
        return new u();
    }
}

