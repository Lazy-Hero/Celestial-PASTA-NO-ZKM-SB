/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aq;
import net.minecraft.ag.G;
import net.minecraft.client.Q;
import net.minecraft.client.r.V;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.W;
import net.minecraft.client.w.j;
import net.q;

public class a0
extends aq {
    @Override
    public j e() {
        return new W(0.0f);
    }

    public a0() {
        super(G.class, "llama", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        V v2 = new V(a42);
        v2.i = j2;
        v2.a = f10;
        return v2;
    }
}

