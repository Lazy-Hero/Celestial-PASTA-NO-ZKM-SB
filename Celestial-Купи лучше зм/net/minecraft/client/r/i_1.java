/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.p;
import net.minecraft.ar.v;
import net.minecraft.client.r.K;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.G;
import net.minecraft.client.w.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class i
extends b<p> {
    private final /* synthetic */ j i;
    private static final /* synthetic */ v j;
    private final /* synthetic */ j k;

    static {
        j = new v("textures/entity/endercrystal/endercrystal.png");
    }

    @Override
    public boolean a(p p2, net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        m[] arrm = b.b();
        boolean bl2 = super.a(p2, b10, d10, d11, d12);
        if (arrm == null) {
            bl2 = bl2 || p2.c() != null;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(p p2, double d10, double d11, double d12, float f10, float f11) {
        float f12;
        m[] arrm;
        block9: {
            float f13;
            block8: {
                m[] arrm2 = b.b();
                f13 = (float)p2.aK + f11;
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.b((float)d10, (float)d11, (float)d12);
                this.b(j);
                arrm = arrm2;
                f12 = net.minecraft.k.h.g(f13 * 0.2f) / 2.0f + 0.5f;
                f12 = f12 * f12 + f12;
                boolean bl2 = this.g;
                if (arrm == null) {
                    if (bl2) {
                        net.minecraft.client.a.v.r();
                        net.minecraft.client.a.v.m(this.a(p2));
                    }
                    bl2 = p2.b();
                }
                if (!bl2) break block8;
                this.k.b(p2, 0.0f, f13 * 3.0f, f12 * 0.2f, 0.0f, 0.0f, 0.0625f);
                if (arrm == null) break block9;
            }
            this.i.b(p2, 0.0f, f13 * 3.0f, f12 * 0.2f, 0.0f, 0.0f, 0.0625f);
        }
        if (this.g) {
            net.minecraft.client.a.v.s();
            net.minecraft.client.a.v.h();
        }
        net.minecraft.client.a.v.B();
        n n2 = p2.c();
        if (arrm == null) {
            if (n2 != null) {
                this.b(K.A);
                float f14 = (float)n2.e() + 0.5f;
                float f15 = (float)n2.b() + 0.5f;
                float f16 = (float)n2.a() + 0.5f;
                double d13 = (double)f14 - p2.a;
                double d14 = (double)f15 - p2.aF;
                double d15 = (double)f16 - p2.ax;
                K.a(d10 + d13, d11 - 0.3 + (double)(f12 * 0.4f) + d14, d12 + d15, f11, f14, f15, f16, p2.aK, p2.a, p2.aF, p2.ax);
            }
            super.d(p2, d10, d11, d12, f10, f11);
        }
    }

    public i(a4 a42) {
        super(a42);
        this.k = new G(0.0f, true);
        this.i = new G(0.0f, false);
        this.a = 0.5f;
    }

    protected v a(p p2) {
        return j;
    }
}

