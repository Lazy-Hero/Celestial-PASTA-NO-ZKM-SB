/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.v;
import net.minecraft.client.r.D;
import net.minecraft.client.r.a4;

public class E
extends D {
    private static final /* synthetic */ net.minecraft.ar.v B;

    protected void a(net.minecraft.T.a4 a42, float f10) {
        float f11 = 1.0625f;
        net.minecraft.client.a.v.d(1.0625f, 1.0625f, 1.0625f);
        super.e(a42, f10);
    }

    public E(a4 a42) {
        super(a42);
    }

    @Override
    protected net.minecraft.ar.v a(net.minecraft.T.a4 a42) {
        return B;
    }

    static {
        B = new net.minecraft.ar.v("textures/entity/zombie/husk.png");
    }
}

