/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.a5;
import net.minecraft.ar.v;
import net.minecraft.client.C.C;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.aF;
import net.minecraft.k.m;

public class aX
extends u<a5> {
    private static final /* synthetic */ v z;

    public aF a() {
        return (aF)super.b();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a5 a52, double d10, double d11, double d12, float f10, float f11) {
        m[] arrm = b.b();
        aF aF2 = (aF)this.i;
        boolean bl2 = a52.av().G();
        if (arrm == null) {
            bl2 = !bl2;
        }
        aF2.q = bl2;
        super.b(a52, d10, d11, d12, f10, f11);
    }

    static {
        z = new v("textures/entity/witch.png");
    }

    protected v a(a5 a52) {
        return z;
    }

    @Override
    public void f() {
        net.minecraft.client.a.v.b(0.0f, 0.1875f, 0.0f);
    }

    public aX(a4 a42) {
        super(a42, new aF(0.0f), 0.5f);
        this.a(new C(this));
    }

    protected void a(a5 a52, float f10) {
        float f11 = 0.9375f;
        net.minecraft.client.a.v.d(0.9375f, 0.9375f, 0.9375f);
    }
}

