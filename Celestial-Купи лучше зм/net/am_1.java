/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.aq;
import net.minecraft.T.aH;
import net.minecraft.client.Q;
import net.minecraft.client.r.a1;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.Y;
import net.minecraft.client.w.j;
import net.q;

public class am
extends aq {
    public am() {
        super(aH.class, "polar_bear", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        a1 a12 = new a1(a42);
        a12.i = j2;
        a12.a = f10;
        return a12;
    }

    @Override
    public j e() {
        return new Y();
    }
}

