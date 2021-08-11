/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.Q;
import net.minecraft.ar.v;
import net.minecraft.client.C.q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.au;

public class av
extends u<Q> {
    private static final /* synthetic */ v z;

    static {
        z = new v("textures/entity/sheep/sheep.png");
    }

    protected v a(Q q2) {
        return z;
    }

    public av(a4 a42) {
        super(a42, new au(), 0.7f);
        this.a(new q(this));
    }
}

