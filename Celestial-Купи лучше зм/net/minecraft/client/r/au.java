/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.O;
import net.minecraft.ar.v;
import net.minecraft.client.C.s;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.X;

public class au
extends u<O> {
    private static final /* synthetic */ v z;

    static {
        z = new v("textures/entity/pig/pig.png");
    }

    public au(a4 a42) {
        super(a42, new X(), 0.7f);
        this.a(new s(this));
    }

    protected v a(O o2) {
        return z;
    }
}

