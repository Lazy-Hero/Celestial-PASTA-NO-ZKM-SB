/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.ao;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.a7;
import net.minecraft.client.w.M;
import net.minecraft.client.w.j;
import net.q;

public class aT
extends ao {
    @Override
    public j e() {
        return new M(0.0f, 0.0f, 64, 64);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        a7 a72 = new a7(a42);
        a72.i = j2;
        a72.a = f10;
        return a72;
    }

    public aT() {
        super(net.minecraft.T.aT.class, "vindication_illager", 0.5f);
    }
}

