/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aq;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.av;
import net.minecraft.client.w.au;
import net.minecraft.client.w.j;
import net.q;

public class ab
extends aq {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        av av2 = new av(a42);
        av2.i = j2;
        av2.a = f10;
        return av2;
    }

    @Override
    public j e() {
        return new au();
    }

    public ab() {
        super(net.minecraft.ag.Q.class, "sheep", 0.7f);
    }
}

