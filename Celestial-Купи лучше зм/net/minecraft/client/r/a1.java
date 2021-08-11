/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aH;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.Y;

public class a1
extends u<aH> {
    private static final /* synthetic */ net.minecraft.ar.v z;

    static {
        z = new net.minecraft.ar.v("textures/entity/bear/polarbear.png");
    }

    public a1(a4 a42) {
        super(a42, new Y(), 0.7f);
    }

    @Override
    public void a(aH aH2, double d10, double d11, double d12, float f10, float f11) {
        super.b(aH2, d10, d11, d12, f10, f11);
    }

    protected net.minecraft.ar.v a(aH aH2) {
        return z;
    }

    protected void a(aH aH2, float f10) {
        net.minecraft.client.a.v.d(1.2f, 1.2f, 1.2f);
        super.e(aH2, f10);
    }
}

