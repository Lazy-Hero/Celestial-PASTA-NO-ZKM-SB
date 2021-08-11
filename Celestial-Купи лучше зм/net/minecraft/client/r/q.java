/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.U.A;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.O;
import net.minecraft.k.m;

public class q
extends b<A> {
    private final /* synthetic */ O i;
    private static final /* synthetic */ net.minecraft.ar.v j;

    static {
        j = new net.minecraft.ar.v("textures/entity/lead_knot.png");
    }

    public void a(A a10, double d10, double d11, double d12, float f10, float f11) {
        q q2;
        block6: {
            boolean bl2;
            block5: {
                m[] arrm = b.b();
                v.M();
                m[] arrm2 = arrm;
                v.E();
                v.b((float)d10, (float)d11, (float)d12);
                float f12 = 0.0625f;
                v.q();
                v.d(-1.0f, -1.0f, 1.0f);
                v.e();
                this.c(a10);
                bl2 = this.g;
                if (arrm2 != null) break block5;
                if (bl2) {
                    v.r();
                    v.m(this.a(a10));
                }
                this.i.b(a10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                q2 = this;
                if (arrm2 != null) break block6;
                bl2 = q2.g;
            }
            if (bl2) {
                v.s();
                v.h();
            }
            v.B();
            q2 = this;
        }
        super.d(a10, d10, d11, d12, f10, f11);
    }

    protected net.minecraft.ar.v a(A a10) {
        return j;
    }

    public q(a4 a42) {
        super(a42);
        this.i = new O();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

