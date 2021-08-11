/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.ad;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.Q;

public class W
extends u<ad> {
    private static final /* synthetic */ net.minecraft.ar.v z;

    public W(a4 a42) {
        super(a42, new Q(), 0.25f);
    }

    protected void a(ad ad2, float f10) {
        int n2 = ad2.g();
        float f11 = (ad2.cr + (ad2.ct - ad2.cr) * f10) / ((float)n2 * 0.5f + 1.0f);
        float f12 = 1.0f / (f11 + 1.0f);
        net.minecraft.client.a.v.d(f12 * (float)n2, 1.0f / f12 * (float)n2, f12 * (float)n2);
    }

    protected net.minecraft.ar.v a(ad ad2) {
        return z;
    }

    static {
        z = new net.minecraft.ar.v("textures/entity/slime/magmacube.png");
    }
}

