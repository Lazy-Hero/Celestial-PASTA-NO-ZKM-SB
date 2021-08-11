/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.m;
import net.minecraft.u.h;

public class n
extends b<net.minecraft.z.j> {
    private final /* synthetic */ float i;

    public n(a4 a42, float f10) {
        super(a42);
        this.i = f10;
    }

    protected v a(net.minecraft.z.j j2) {
        return j.x;
    }

    public void a(net.minecraft.z.j j2, double d10, double d11, double d12, float f10, float f11) {
        n n2;
        block7: {
            boolean bl2;
            block6: {
                net.minecraft.client.a.v.M();
                this.c(j2);
                net.minecraft.client.a.v.b((float)d10, (float)d11, (float)d12);
                net.minecraft.client.a.v.q();
                net.minecraft.client.a.v.d(this.i, this.i, this.i);
                c c10 = Q.P().Y().b().a(net.minecraft.u.h.bL);
                W w2 = W.c();
                I i2 = w2.b();
                float f12 = c10.i();
                float f13 = c10.l();
                m[] arrm = b.b();
                float f14 = c10.u();
                float f15 = c10.m();
                float f16 = 1.0f;
                float f17 = 0.5f;
                float f18 = 0.25f;
                net.minecraft.client.a.v.a(180.0f - this.h.f, 0.0f, 1.0f, 0.0f);
                int n3 = this.h.q.L;
                if (arrm == null) {
                    n3 = n3 == 2 ? -1 : 1;
                }
                net.minecraft.client.a.v.a((float)n3 * -this.h.a, 1.0f, 0.0f, 0.0f);
                bl2 = this.g;
                if (arrm != null) break block6;
                if (bl2) {
                    net.minecraft.client.a.v.r();
                    net.minecraft.client.a.v.m(this.a(j2));
                }
                i2.a(7, net.minecraft.client.y.b.b);
                i2.c(-0.5, -0.25, 0.0).a(f12, f15).d(0.0f, 1.0f, 0.0f).d();
                i2.c(0.5, -0.25, 0.0).a(f13, f15).d(0.0f, 1.0f, 0.0f).d();
                i2.c(0.5, 0.75, 0.0).a(f13, f14).d(0.0f, 1.0f, 0.0f).d();
                i2.c(-0.5, 0.75, 0.0).a(f12, f14).d(0.0f, 1.0f, 0.0f).d();
                w2.a();
                n2 = this;
                if (arrm != null) break block7;
                bl2 = n2.g;
            }
            if (bl2) {
                net.minecraft.client.a.v.s();
                net.minecraft.client.a.v.h();
            }
            net.minecraft.client.a.v.u();
            net.minecraft.client.a.v.B();
            n2 = this;
        }
        super.d(j2, d10, d11, d12, f10, f11);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

