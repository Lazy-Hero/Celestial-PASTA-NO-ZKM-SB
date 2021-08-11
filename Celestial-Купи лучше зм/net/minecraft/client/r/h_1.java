/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.m;
import net.minecraft.z.k;

public class h
extends b<k> {
    private static final /* synthetic */ net.minecraft.ar.v i;

    static {
        i = new net.minecraft.ar.v("textures/entity/enderdragon/dragon_fireball.png");
    }

    public void a(k k2, double d10, double d11, double d12, float f10, float f11) {
        h h2;
        block7: {
            boolean bl2;
            block6: {
                v.M();
                m[] arrm = b.b();
                this.c(k2);
                v.b((float)d10, (float)d11, (float)d12);
                v.q();
                v.d(2.0f, 2.0f, 2.0f);
                m[] arrm2 = arrm;
                W w2 = W.c();
                I i2 = w2.b();
                float f12 = 1.0f;
                float f13 = 0.5f;
                float f14 = 0.25f;
                v.a(180.0f - this.h.f, 0.0f, 1.0f, 0.0f);
                int n2 = this.h.q.L;
                if (arrm2 == null) {
                    n2 = n2 == 2 ? -1 : 1;
                }
                v.a((float)n2 * -this.h.a, 1.0f, 0.0f, 0.0f);
                bl2 = this.g;
                if (arrm2 != null) break block6;
                if (bl2) {
                    v.r();
                    v.m(this.a(k2));
                }
                i2.a(7, net.minecraft.client.y.b.b);
                i2.c(-0.5, -0.25, 0.0).a(0.0, 1.0).d(0.0f, 1.0f, 0.0f).d();
                i2.c(0.5, -0.25, 0.0).a(1.0, 1.0).d(0.0f, 1.0f, 0.0f).d();
                i2.c(0.5, 0.75, 0.0).a(1.0, 0.0).d(0.0f, 1.0f, 0.0f).d();
                i2.c(-0.5, 0.75, 0.0).a(0.0, 0.0).d(0.0f, 1.0f, 0.0f).d();
                w2.a();
                h2 = this;
                if (arrm2 != null) break block7;
                bl2 = h2.g;
            }
            if (bl2) {
                v.s();
                v.h();
            }
            v.u();
            v.B();
            h2 = this;
        }
        super.d(k2, d10, d11, d12, f10, f11);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public h(a4 a42) {
        super(a42);
    }

    protected net.minecraft.ar.v a(k k2) {
        return i;
    }
}

