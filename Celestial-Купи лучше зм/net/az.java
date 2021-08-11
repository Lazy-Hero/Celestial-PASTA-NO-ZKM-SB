/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aq;
import net.minecraft.ag.M;
import net.minecraft.client.Q;
import net.minecraft.client.r.I;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.V;
import net.minecraft.client.w.j;
import net.q;

public class az
extends aq {
    public az() {
        super(M.class, "cow", 0.7f);
    }

    @Override
    public j e() {
        return new V();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        I i2 = new I(a42);
        i2.i = j2;
        i2.a = f10;
        return i2;
    }
}

