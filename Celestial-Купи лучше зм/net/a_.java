/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aq;
import net.minecraft.ag.N;
import net.minecraft.client.Q;
import net.minecraft.client.r.X;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.V;
import net.minecraft.client.w.j;
import net.q;

public class a_
extends aq {
    public a_() {
        super(N.class, "mooshroom", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        X x2 = new X(a42);
        x2.i = j2;
        x2.a = f10;
        return x2;
    }

    @Override
    public j e() {
        return new V();
    }
}

