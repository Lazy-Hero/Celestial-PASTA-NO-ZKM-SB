/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aV;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.z;

public class B
extends z {
    private static final /* synthetic */ net.minecraft.ar.v B;

    public B(a4 a42) {
        super(a42);
    }

    static {
        B = new net.minecraft.ar.v("textures/entity/skeleton/wither_skeleton.png");
    }

    @Override
    protected net.minecraft.ar.v a(aV aV2) {
        return B;
    }

    protected void a(aV aV2, float f10) {
        net.minecraft.client.a.v.d(1.2f, 1.2f, 1.2f);
    }
}

