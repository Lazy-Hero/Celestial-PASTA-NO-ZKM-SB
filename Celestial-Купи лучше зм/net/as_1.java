/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.ap;
import net.minecraft.T.ab;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aC;
import net.minecraft.client.w.j;
import net.q;

public class as
extends ap {
    public as() {
        super(ab.class, "cave_spider", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aC aC2 = new aC(a42);
        aC2.i = j2;
        aC2.a = f10;
        return aC2;
    }
}

