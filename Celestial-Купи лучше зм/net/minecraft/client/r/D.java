/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ar.v;
import net.minecraft.client.r.a3;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.x;
import net.minecraft.client.w.u;

public class D
extends x<net.minecraft.T.a4> {
    private static final /* synthetic */ v A;

    static {
        A = new v("textures/entity/zombie/zombie.png");
    }

    @Override
    protected v a(net.minecraft.T.a4 a42) {
        return A;
    }

    public D(a4 a42) {
        super(a42, new u(), 0.5f);
        a3 a32 = new a3(this, this);
        this.a(a32);
    }
}

