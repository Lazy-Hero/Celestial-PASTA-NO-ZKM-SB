/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aS;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.x;
import net.minecraft.client.w.t;
import net.minecraft.k.m;

public class C
extends x<aS> {
    private static final /* synthetic */ net.minecraft.ar.v B;
    private /* synthetic */ int A;
    private static final /* synthetic */ net.minecraft.ar.v C;

    @Override
    protected net.minecraft.ar.v a(aS aS2) {
        return aS2.f() ? B : C;
    }

    static {
        C = new net.minecraft.ar.v("textures/entity/illager/vex.png");
        B = new net.minecraft.ar.v("textures/entity/illager/vex_charging.png");
    }

    @Override
    public void a(aS aS2, double d10, double d11, double d12, float f10, float f11) {
        int n2 = ((t)this.i).a();
        m[] arrm = b.b();
        if (arrm == null) {
            if (n2 != this.A) {
                this.i = new t();
                this.A = n2;
            }
            super.b(aS2, d10, d11, d12, f10, f11);
        }
    }

    public C(a4 a42) {
        super(a42, new t(), 0.3f);
        this.A = ((t)this.i).a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(aS aS2, float f10) {
        net.minecraft.client.a.v.d(0.4f, 0.4f, 0.4f);
    }
}

