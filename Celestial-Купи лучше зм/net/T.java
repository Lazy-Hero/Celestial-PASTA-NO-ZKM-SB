/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.M;
import net.minecraft.T.a2;
import net.minecraft.client.Q;
import net.minecraft.client.r.B;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.j;
import net.minecraft.client.w.s;
import net.q;

public class T
extends M {
    public T() {
        super(a2.class, "wither_skeleton", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        B b10 = new B(a42);
        b10.i = j2;
        b10.a = f10;
        return b10;
    }

    @Override
    public j e() {
        return new s();
    }
}

