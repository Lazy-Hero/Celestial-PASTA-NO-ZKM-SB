/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aZ;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.J;

public class O
extends u<aZ> {
    private static final /* synthetic */ net.minecraft.ar.v z;
    private static final /* synthetic */ net.minecraft.ar.v A;

    protected net.minecraft.ar.v a(aZ aZ2) {
        return aZ2.b() ? z : A;
    }

    static {
        A = new net.minecraft.ar.v("textures/entity/ghast/ghast.png");
        z = new net.minecraft.ar.v("textures/entity/ghast/ghast_shooting.png");
    }

    public O(a4 a42) {
        super(a42, new J(), 0.5f);
    }

    protected void a(aZ aZ2, float f10) {
        float f11 = 1.0f;
        float f12 = 4.5f;
        float f13 = 4.5f;
        net.minecraft.client.a.v.d(4.5f, 4.5f, 4.5f);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

