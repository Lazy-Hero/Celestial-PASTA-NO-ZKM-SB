/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.j.u;
import net.minecraft.client.u.av;
import net.minecraft.client.y.b;
import net.minecraft.k.n;

public class ay
extends av {
    private /* synthetic */ int P;
    private static final /* synthetic */ v O;
    private final /* synthetic */ int M;
    private final /* synthetic */ u N;

    static {
        O = new v("textures/particle/footprint.png");
    }

    protected ay(u u2, z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        this.N = u2;
        this.s = 0.0;
        this.n = 0.0;
        this.I = 0.0;
        this.M = 200;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int d() {
        return 3;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17 = ((float)this.P + f10) / (float)this.M;
        f17 *= f17;
        int[] arrn = av.e();
        float f18 = f16 = 2.0f - f17 * 2.0f;
        float f19 = 1.0f;
        if (arrn != null) {
            if (f18 > f19) {
                f16 = 1.0f;
            }
            f18 = f16;
            f19 = 0.2f;
        }
        f16 = f18 * f19;
        net.minecraft.client.a.v.y();
        float f20 = 0.125f;
        float f21 = (float)(this.b - j);
        float f22 = (float)(this.D - o);
        float f23 = (float)(this.z - w);
        float f24 = this.a.k(new n(this.b, this.D, this.z));
        this.N.b(O);
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA);
        i2.a(7, net.minecraft.client.y.b.t);
        i2.c((double)(f21 - 0.125f), (double)f22, (double)(f23 + 0.125f)).a(0.0, 1.0).a(f24, f24, f24, f16).d();
        i2.c((double)(f21 + 0.125f), (double)f22, (double)(f23 + 0.125f)).a(1.0, 1.0).a(f24, f24, f24, f16).d();
        i2.c((double)(f21 + 0.125f), (double)f22, (double)(f23 - 0.125f)).a(1.0, 0.0).a(f24, f24, f24, f16).d();
        i2.c((double)(f21 - 0.125f), (double)f22, (double)(f23 - 0.125f)).a(0.0, 0.0).a(f24, f24, f24, f16).d();
        W.c().a();
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.j();
    }

    @Override
    public void i() {
        block3: {
            ay ay2;
            block2: {
                ++this.P;
                int[] arrn = av.e();
                ay2 = this;
                if (arrn == null) break block2;
                if (ay2.P != this.M) break block3;
                ay2 = this;
            }
            ay2.c();
        }
    }
}

