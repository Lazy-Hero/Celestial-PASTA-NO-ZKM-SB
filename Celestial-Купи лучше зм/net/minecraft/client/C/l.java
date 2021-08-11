/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.r.K;
import net.minecraft.h.d;

public class l
implements w<d> {
    private final /* synthetic */ K a;
    private static final /* synthetic */ v b;

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void a(d d10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean bl2 = m.c();
        this.a.b(b);
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.v();
        net.minecraft.client.a.v.a(o.ONE, G.ONE);
        boolean bl3 = bl2;
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.o(514);
        int n2 = 61680;
        int n3 = 61680;
        boolean bl4 = false;
        as.a(as.p, 61680.0f, 0.0f);
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        Q.P().Y.a(true);
        int n4 = fU.ag();
        if (bl3) {
            if (n4 != 0) {
                cS.ar();
            }
            fU.ao().aB = true;
            this.a.b().b(d10, f10, f11, f13, f14, f15, f16);
            fU.ao().aB = false;
            n4 = fU.ag() ? 1 : 0;
        }
        if (bl3) {
            if (n4 != 0) {
                cS.aT();
            }
            Q.P().Y.a(false);
            this.a.b(d10);
            net.minecraft.client.a.v.f();
            net.minecraft.client.a.v.e();
            n4 = 515;
        }
        net.minecraft.client.a.v.o(n4);
    }

    static {
        b = new v("textures/entity/enderdragon/dragon_eyes.png");
    }

    public l(K k2) {
        this.a = k2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

