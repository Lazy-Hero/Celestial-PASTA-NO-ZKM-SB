/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.V;
import net.minecraft.ar.v;
import net.minecraft.client.C.a;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.ae;
import net.minecraft.k.m;

public class an
extends u<V> {
    private static final /* synthetic */ v B;
    private static final /* synthetic */ v z;
    private static final /* synthetic */ v A;

    @Override
    protected float a(V v2, float f10) {
        return v2.c();
    }

    public an(a4 a42) {
        super(a42, new ae(), 0.5f);
        this.a(new a(this));
    }

    protected v a(V v2) {
        m[] arrm = b.b();
        boolean bl2 = v2.U();
        if (arrm == null) {
            if (bl2) {
                return A;
            }
            bl2 = v2.H();
        }
        return bl2 ? B : z;
    }

    @Override
    public void a(V v2, double d10, double d11, double d12, float f10, float f11) {
        m[] arrm = b.b();
        if (arrm == null) {
            if (v2.E()) {
                float f12 = v2.S() * v2.a(f11);
                net.minecraft.client.a.v.c(f12, f12, f12);
            }
            super.b(v2, d10, d11, d12, f10, f11);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        z = new v("textures/entity/wolf/wolf.png");
        A = new v("textures/entity/wolf/wolf_tame.png");
        B = new v("textures/entity/wolf/wolf_angry.png");
    }
}

