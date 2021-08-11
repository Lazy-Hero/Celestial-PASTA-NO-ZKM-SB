/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.L;
import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.B;
import net.minecraft.k.h;

public class H
extends u<L> {
    private static final /* synthetic */ v z;

    static {
        z = new v("textures/entity/chicken.png");
    }

    public H(a4 a42) {
        super(a42, new B(), 0.3f);
    }

    protected v a(L l2) {
        return z;
    }

    @Override
    protected float a(L l2, float f10) {
        float f11 = l2.cK + (l2.cO - l2.cK) * f10;
        float f12 = l2.cJ + (l2.cM - l2.cJ) * f10;
        return (net.minecraft.k.h.g(f11) + 1.0f) * f12;
    }
}

