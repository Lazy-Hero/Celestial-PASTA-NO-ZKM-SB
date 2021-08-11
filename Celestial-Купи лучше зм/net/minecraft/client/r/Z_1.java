/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.U;
import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.T;
import net.minecraft.k.h;

public class Z
extends u<U> {
    public static final /* synthetic */ v[] z;

    @Override
    public float a(U u2, float f10) {
        return this.b(u2, f10);
    }

    protected v a(U u2) {
        return z[u2.d()];
    }

    public Z(a4 a42) {
        super(a42, new T(), 0.3f);
    }

    @Override
    private float b(U u2, float f10) {
        float f11 = u2.cR + (u2.cW - u2.cR) * f10;
        float f12 = u2.cS + (u2.cV - u2.cS) * f10;
        return (net.minecraft.k.h.g(f11) + 1.0f) * f12;
    }

    static {
        z = new v[]{new v("textures/entity/parrot/parrot_red_blue.png"), new v("textures/entity/parrot/parrot_blue.png"), new v("textures/entity/parrot/parrot_green.png"), new v("textures/entity/parrot/parrot_yellow_blue.png"), new v("textures/entity/parrot/parrot_grey.png")};
    }
}

