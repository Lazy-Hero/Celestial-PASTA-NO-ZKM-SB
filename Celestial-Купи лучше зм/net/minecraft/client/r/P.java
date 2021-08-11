/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.C.z;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.az;
import net.minecraft.client.r.u;

public class P
extends u<net.minecraft.T.az> {
    private static final /* synthetic */ net.minecraft.ar.v A;
    private final /* synthetic */ float z;

    public P(a4 a42, float f10) {
        super(a42, new net.minecraft.client.w.u(), 0.5f * f10);
        this.z = f10;
        this.a(new z(this));
        this.a(new az(this, this));
    }

    @Override
    public void f() {
        net.minecraft.client.a.v.b(0.0f, 0.1875f, 0.0f);
    }

    protected net.minecraft.ar.v a(net.minecraft.T.az az2) {
        return A;
    }

    static {
        A = new net.minecraft.ar.v("textures/entity/zombie/zombie.png");
    }

    protected void a(net.minecraft.T.az az2, float f10) {
        net.minecraft.client.a.v.d(this.z, this.z, this.z);
    }
}

