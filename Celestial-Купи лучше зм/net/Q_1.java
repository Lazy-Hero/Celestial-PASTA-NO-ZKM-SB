/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.ay;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.z;
import net.minecraft.client.w.j;
import net.minecraft.client.w.s;
import net.q;

public class Q
extends M {
    public Q() {
        super(ay.class, "skeleton", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = net.minecraft.client.Q.P().aQ();
        z z2 = new z(a42);
        z2.i = j2;
        z2.a = f10;
        return z2;
    }

    @Override
    public j e() {
        return new s();
    }
}

