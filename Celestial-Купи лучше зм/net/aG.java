/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aF;
import net.minecraft.ag.K;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.v;
import net.minecraft.client.w.j;
import net.q;

public class aG
extends aF {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        v v2 = new v(a42);
        v2.i = j2;
        v2.a = f10;
        return v2;
    }

    public aG() {
        super(K.class, "zombie_horse", 0.75f);
    }
}

