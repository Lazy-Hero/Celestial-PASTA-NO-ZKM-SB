/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.ae;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.am;
import net.minecraft.client.r.u;
import net.minecraft.client.w.M;

public class N
extends u<ae> {
    private static final /* synthetic */ net.minecraft.ar.v z;

    static {
        z = new net.minecraft.ar.v("textures/entity/illager/evoker.png");
    }

    protected net.minecraft.ar.v a(ae ae2) {
        return z;
    }

    public N(a4 a42) {
        super(a42, new M(0.0f, 0.0f, 64, 64), 0.5f);
        this.a(new am(this, this));
    }

    protected void a(ae ae2, float f10) {
        float f11 = 0.9375f;
        net.minecraft.client.a.v.d(0.9375f, 0.9375f, 0.9375f);
    }
}

