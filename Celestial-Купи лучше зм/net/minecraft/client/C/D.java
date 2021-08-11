/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ag.N;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.ad;
import net.minecraft.client.a.d;
import net.minecraft.client.a.v;
import net.minecraft.client.j.j;
import net.minecraft.client.r.X;
import net.minecraft.u.g;

public class D
implements w<N> {
    private final /* synthetic */ X a;

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(N n2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block5: {
            boolean bl2;
            block4: {
                boolean bl3 = m.d();
                bl2 = n2.Q();
                if (bl3) break block4;
                if (bl2) break block5;
                bl2 = n2.a3();
            }
            if (!bl2) {
                d d10 = Q.P().W();
                this.a.b(j.x);
                v.c();
                v.a(ad.FRONT);
                v.M();
                v.d(1.0f, -1.0f, 1.0f);
                v.b(0.2f, 0.35f, 0.5f);
                v.a(42.0f, 0.0f, 1.0f, 0.0f);
                v.M();
                v.b(-0.5f, -0.5f, 0.5f);
                d10.a(g.z.d(), 1.0f);
                v.B();
                v.M();
                v.b(0.1f, 0.0f, -0.6f);
                v.a(42.0f, 0.0f, 1.0f, 0.0f);
                v.b(-0.5f, -0.5f, 0.5f);
                d10.a(g.z.d(), 1.0f);
                v.B();
                v.B();
                v.M();
                this.a.a().o.a(0.0625f);
                v.d(1.0f, -1.0f, 1.0f);
                v.b(0.0f, 0.7f, -0.2f);
                v.a(12.0f, 0.0f, 1.0f, 0.0f);
                v.b(-0.5f, -0.5f, 0.5f);
                d10.a(g.z.d(), 1.0f);
                v.B();
                v.a(ad.BACK);
                v.E();
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public D(X x2) {
        this.a = x2;
    }
}

