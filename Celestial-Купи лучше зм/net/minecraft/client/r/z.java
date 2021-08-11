/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aV;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.a_;
import net.minecraft.client.r.x;
import net.minecraft.client.w.s;

public class z
extends x<aV> {
    private static final /* synthetic */ net.minecraft.ar.v A;

    public z(a4 a42) {
        super(a42, new s(), 0.5f);
        this.a(new net.minecraft.client.C.z(this));
        this.a(new a_(this, this));
    }

    static {
        A = new net.minecraft.ar.v("textures/entity/skeleton/skeleton.png");
    }

    @Override
    protected net.minecraft.ar.v a(aV aV2) {
        return A;
    }

    @Override
    public void f() {
        net.minecraft.client.a.v.b(0.09375f, 0.1875f, 0.0f);
    }
}

