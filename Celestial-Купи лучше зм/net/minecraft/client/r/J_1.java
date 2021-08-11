/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aR;
import net.minecraft.ar.v;
import net.minecraft.client.C.x;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.C;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class J
extends u<aR> {
    private static final /* synthetic */ v z;

    protected v a(aR aR2) {
        return z;
    }

    public J(a4 a42) {
        super(a42, new C(), 0.5f);
        this.a(new x(this));
    }

    protected void a(aR aR2, float f10) {
        float f11 = aR2.a(f10);
        float f12 = 1.0f + net.minecraft.k.h.g(f11 * 100.0f) * f11 * 0.01f;
        f11 = net.minecraft.k.h.c(f11, 0.0f, 1.0f);
        f11 *= f11;
        f11 *= f11;
        float f13 = (1.0f + f11 * 0.4f) * f12;
        float f14 = (1.0f + f11 * 0.1f) / f12;
        net.minecraft.client.a.v.d(f13, f14, f13);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        z = new v("textures/entity/creeper/creeper.png");
    }

    @Override
    protected int a(aR aR2, float f10, float f11) {
        float f12 = aR2.a(f11);
        m[] arrm = b.b();
        int n2 = (int)(f12 * 10.0f) % 2;
        if (arrm == null) {
            if (n2 == 0) {
                return 0;
            }
            n2 = (int)(f12 * 0.2f * 255.0f);
        }
        int n3 = n2;
        n3 = net.minecraft.k.h.c(n3, 0, 255);
        return n3 << 24 | 0x30FFFFFF;
    }
}

