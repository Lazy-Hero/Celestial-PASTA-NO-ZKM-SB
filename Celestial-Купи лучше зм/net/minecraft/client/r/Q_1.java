/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.a0;
import net.minecraft.U.B;
import net.minecraft.ar.v;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.K;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;

public class Q
extends u<a0> {
    private static final /* synthetic */ v z;
    private static final /* synthetic */ v A;

    public Q(a4 a42) {
        super(a42, new K(), 0.5f);
    }

    static {
        A = new v("textures/entity/guardian.png");
        z = new v("textures/entity/guardian_beam.png");
    }

    private l a(B b10, double d10, float f10) {
        double d11 = b10.am + (b10.a - b10.am) * (double)f10;
        double d12 = d10 + b10.af + (b10.aF - b10.af) * (double)f10;
        double d13 = b10.n + (b10.ax - b10.n) * (double)f10;
        return new l(d11, d12, d13);
    }

    @Override
    public void a(a0 a02, double d10, double d11, double d12, float f10, float f11) {
        m[] arrm = b.b();
        super.b(a02, d10, d11, d12, f10, f11);
        B b10 = a02.g();
        m[] arrm2 = arrm;
        if (b10 != null) {
            float f12 = a02.b(f11);
            W w2 = W.c();
            I i2 = w2.b();
            this.b(z);
            net.minecraft.client.a.v.c(3553, 10242, 10497);
            net.minecraft.client.a.v.c(3553, 10243, 10497);
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.E();
            net.minecraft.client.a.v.f();
            net.minecraft.client.a.v.a(true);
            float f13 = 240.0f;
            as.a(as.p, 240.0f, 240.0f);
            net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE, o.ONE, G.ZERO);
            float f14 = (float)a02.aG.r() + f11;
            float f15 = f14 * 0.5f % 1.0f;
            float f16 = a02.l();
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.b((float)d10, (float)d11 + f16, (float)d12);
            l l2 = this.a(b10, (double)b10.aD * 0.5, f11);
            l l3 = this.a(a02, (double)f16, f11);
            l l4 = l2.b(l3);
            double d13 = l4.a() + 1.0;
            l4 = l4.d();
            float f17 = (float)Math.acos(l4.d);
            float f18 = (float)Math.atan2(l4.b, l4.e);
            net.minecraft.client.a.v.a((1.5707964f + -f18) * 57.295776f, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.a(f17 * 57.295776f, 1.0f, 0.0f, 0.0f);
            boolean bl2 = true;
            double d14 = (double)f14 * 0.05 * -1.5;
            i2.a(7, net.minecraft.client.y.b.t);
            float f19 = f12 * f12;
            int n2 = 64 + (int)(f19 * 191.0f);
            int n3 = 32 + (int)(f19 * 191.0f);
            int n4 = 128 - (int)(f19 * 64.0f);
            double d15 = 0.2;
            double d16 = 0.282;
            double d17 = 0.0 + Math.cos(d14 + 2.356194490192345) * 0.282;
            double d18 = 0.0 + Math.sin(d14 + 2.356194490192345) * 0.282;
            double d19 = 0.0 + Math.cos(d14 + 0.7853981633974483) * 0.282;
            double d20 = 0.0 + Math.sin(d14 + 0.7853981633974483) * 0.282;
            double d21 = 0.0 + Math.cos(d14 + 3.9269908169872414) * 0.282;
            double d22 = 0.0 + Math.sin(d14 + 3.9269908169872414) * 0.282;
            double d23 = 0.0 + Math.cos(d14 + 5.497787143782138) * 0.282;
            double d24 = 0.0 + Math.sin(d14 + 5.497787143782138) * 0.282;
            double d25 = 0.0 + Math.cos(d14 + Math.PI) * 0.2;
            double d26 = 0.0 + Math.sin(d14 + Math.PI) * 0.2;
            double d27 = 0.0 + Math.cos(d14 + 0.0) * 0.2;
            double d28 = 0.0 + Math.sin(d14 + 0.0) * 0.2;
            double d29 = 0.0 + Math.cos(d14 + 1.5707963267948966) * 0.2;
            double d30 = 0.0 + Math.sin(d14 + 1.5707963267948966) * 0.2;
            double d31 = 0.0 + Math.cos(d14 + 4.71238898038469) * 0.2;
            double d32 = 0.0 + Math.sin(d14 + 4.71238898038469) * 0.2;
            double d33 = 0.0;
            double d34 = 0.4999;
            double d35 = -1.0f + f15;
            double d36 = d13 * 2.5 + d35;
            i2.c(d25, d13, d26).a(0.4999, d36).b(n2, n3, n4, 255).d();
            i2.c(d25, 0.0, d26).a(0.4999, d35).b(n2, n3, n4, 255).d();
            i2.c(d27, 0.0, d28).a(0.0, d35).b(n2, n3, n4, 255).d();
            i2.c(d27, d13, d28).a(0.0, d36).b(n2, n3, n4, 255).d();
            i2.c(d29, d13, d30).a(0.4999, d36).b(n2, n3, n4, 255).d();
            i2.c(d29, 0.0, d30).a(0.4999, d35).b(n2, n3, n4, 255).d();
            i2.c(d31, 0.0, d32).a(0.0, d35).b(n2, n3, n4, 255).d();
            i2.c(d31, d13, d32).a(0.0, d36).b(n2, n3, n4, 255).d();
            double d37 = 0.0;
            if (arrm2 == null) {
                if (a02.H % 2 == 0) {
                    d37 = 0.5;
                }
                i2.c(d17, d13, d18).a(0.5, d37 + 0.5).b(n2, n3, n4, 255).d();
                i2.c(d19, d13, d20).a(1.0, d37 + 0.5).b(n2, n3, n4, 255).d();
                i2.c(d23, d13, d24).a(1.0, d37).b(n2, n3, n4, 255).d();
                i2.c(d21, d13, d22).a(0.5, d37).b(n2, n3, n4, 255).d();
                w2.a();
            }
            net.minecraft.client.a.v.B();
        }
    }

    protected v a(a0 a02) {
        return A;
    }

    @Override
    public boolean a(a0 a02, net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        m[] arrm = b.b();
        boolean bl2 = super.a(a02, b10, d10, d11, d12);
        if (arrm == null) {
            if (bl2) {
                return true;
            }
            bl2 = a02.f();
        }
        if (arrm == null) {
            B b11;
            if (bl2 && (b11 = a02.g()) != null) {
                l l2 = this.a(b11, (double)b11.aD * 0.5, 1.0f);
                l l3 = this.a(a02, (double)a02.l(), 1.0f);
                return b10.a(new k(l3.e, l3.d, l3.b, l2.e, l2.d, l2.b));
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

