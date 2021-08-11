/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.ai;
import net.minecraft.client.C.k;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.aC;

public class a6
extends u<ai> {
    private static final /* synthetic */ net.minecraft.ar.v z;

    protected net.minecraft.ar.v a(ai ai2) {
        return z;
    }

    protected void a(ai ai2, float f10) {
        float f11 = 0.999f;
        net.minecraft.client.a.v.d(0.999f, 0.999f, 0.999f);
        float f12 = ai2.g();
        float f13 = (ai2.cr + (ai2.ct - ai2.cr) * f10) / (f12 * 0.5f + 1.0f);
        float f14 = 1.0f / (f13 + 1.0f);
        net.minecraft.client.a.v.d(f14 * f12, 1.0f / f14 * f12, f14 * f12);
    }

    @Override
    public void a(ai ai2, double d10, double d11, double d12, float f10, float f11) {
        this.a = 0.25f * (float)ai2.g();
        super.b(ai2, d10, d11, d12, f10, f11);
    }

    static {
        z = new net.minecraft.ar.v("textures/entity/slime/slime.png");
    }

    public a6(a4 a42) {
        super(a42, new aC(16), 0.25f);
        this.a(new k(this));
    }
}

