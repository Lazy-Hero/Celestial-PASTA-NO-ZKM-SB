/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.aX;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.as;
import net.minecraft.client.a.d;
import net.minecraft.client.a.v;
import net.minecraft.client.j.j;
import net.minecraft.client.r.U;
import net.minecraft.client.w.N;
import net.minecraft.u.g;

public class h
implements w<aX> {
    private final /* synthetic */ U a;

    @Override
    public void a(aX aX2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (aX2.e() != 0) {
            d d10 = Q.P().W();
            v.q();
            v.M();
            v.a(5.0f + 180.0f * ((N)this.a.b()).m.y / (float)Math.PI, 1.0f, 0.0f, 0.0f);
            v.a(90.0f, 1.0f, 0.0f, 0.0f);
            v.b(-0.9375f, -0.625f, -0.9375f);
            float f17 = 0.5f;
            v.d(0.5f, -0.5f, 0.5f);
            int n2 = aX2.aS();
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            as.a(as.p, n3, (float)n4);
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.b(j.x);
            d10.a(g.cj.d(), 1.0f);
            v.B();
            v.u();
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    public h(U u2) {
        this.a = u2;
    }
}

