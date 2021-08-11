/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aF;
import net.minecraft.ag.J;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.v;
import net.minecraft.client.w.j;
import net.q;

public class at
extends aF {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        v v2 = new v(a42);
        v2.i = j2;
        v2.a = f10;
        return v2;
    }

    public at() {
        super(J.class, "skeleton_horse", 0.75f);
    }
}

