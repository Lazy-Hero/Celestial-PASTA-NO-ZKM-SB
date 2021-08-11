/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aq;
import net.minecraft.ag.O;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.au;
import net.minecraft.client.w.X;
import net.minecraft.client.w.j;
import net.q;

public class a3
extends aq {
    @Override
    public j e() {
        return new X();
    }

    public a3() {
        super(O.class, "pig", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        au au2 = new au(a42);
        au2.i = j2;
        au2.a = f10;
        return au2;
    }
}

