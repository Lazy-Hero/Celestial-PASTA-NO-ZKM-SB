/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.N;
import net.minecraft.ar.v;
import net.minecraft.client.C.D;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.V;

public class X
extends u<N> {
    private static final /* synthetic */ v z;

    static {
        z = new v("textures/entity/cow/mooshroom.png");
    }

    protected v a(N n2) {
        return z;
    }

    public X(a4 a42) {
        super(a42, new V(), 0.7f);
        this.a(new D(this));
    }

    public V a() {
        return (V)super.b();
    }
}

