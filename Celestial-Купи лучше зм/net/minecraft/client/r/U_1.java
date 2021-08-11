/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aX;
import net.minecraft.ar.v;
import net.minecraft.client.C.h;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.N;
import net.minecraft.k.m;

public class U
extends u<aX> {
    private static final /* synthetic */ v z;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(aX aX2, float f10, float f11, float f12) {
        block3: {
            float f13;
            block2: {
                m[] arrm = b.b();
                super.a(aX2, f10, f11, f12);
                m[] arrm2 = arrm;
                f13 = aX2.a3;
                if (arrm2 != null) break block2;
                if (!((double)f13 >= 0.01)) break block3;
                f13 = 13.0f;
            }
            float f14 = f13;
            float f15 = aX2.bK - aX2.a3 * (1.0f - f12) + 6.0f;
            float f16 = (Math.abs(f15 % 13.0f - 6.5f) - 3.25f) / 3.25f;
            net.minecraft.client.a.v.a(6.5f * f16, 0.0f, 0.0f, 1.0f);
        }
    }

    public U(a4 a42) {
        super(a42, new N(), 0.5f);
        this.a(new h(this));
    }

    static {
        z = new v("textures/entity/iron_golem.png");
    }

    protected v a(aX aX2) {
        return z;
    }
}

