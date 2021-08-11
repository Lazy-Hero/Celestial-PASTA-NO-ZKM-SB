/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.au;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.a7;

public class aa
extends u<au> {
    private static final /* synthetic */ net.minecraft.ar.v z;

    @Override
    protected float a(au au2, float f10) {
        return au2.cB + (au2.cz - au2.cB) * f10;
    }

    @Override
    protected void a(au au2, float f10, float f11, float f12) {
        float f13 = au2.cr + (au2.cs - au2.cr) * f12;
        float f14 = au2.cA + (au2.cC - au2.cA) * f12;
        net.minecraft.client.a.v.b(0.0f, 0.5f, 0.0f);
        net.minecraft.client.a.v.a(180.0f - f11, 0.0f, 1.0f, 0.0f);
        net.minecraft.client.a.v.a(f13, 1.0f, 0.0f, 0.0f);
        net.minecraft.client.a.v.a(f14, 0.0f, 1.0f, 0.0f);
        net.minecraft.client.a.v.b(0.0f, -1.2f, 0.0f);
    }

    public aa(a4 a42) {
        super(a42, new a7(), 0.7f);
    }

    protected net.minecraft.ar.v a(au au2) {
        return z;
    }

    static {
        z = new net.minecraft.ar.v("textures/entity/squid.png");
    }
}

