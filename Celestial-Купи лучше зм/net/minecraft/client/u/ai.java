/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.j.u;
import net.minecraft.client.u.av;
import net.minecraft.client.y.b;
import net.minecraft.client.y.e;

public class ai
extends av {
    private /* synthetic */ int R;
    private final /* synthetic */ float P;
    private final /* synthetic */ u N;
    private final /* synthetic */ int M;
    private static final /* synthetic */ v O;
    private static final /* synthetic */ e Q;

    protected ai(u u2, z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
        float f10;
        this.N = u2;
        this.M = 4;
        this.B = f10 = this.y.nextFloat() * 0.6f + 0.4f;
        this.C = f10;
        this.p = f10;
        this.P = 1.0f - (float)d13 * 0.5f;
    }

    @Override
    public int a(float f10) {
        return 61680;
    }

    static {
        O = new v("textures/entity/sweep.png");
        Q = new e().a(net.minecraft.client.y.b.d).a(net.minecraft.client.y.b.q).a(net.minecraft.client.y.b.l).a(net.minecraft.client.y.b.g).a(net.minecraft.client.y.b.o).a(net.minecraft.client.y.b.h);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block3: {
            int n2;
            int n3;
            int n4;
            block2: {
                n4 = (int)(((float)this.R + f10) * 3.0f / (float)this.M);
                int[] arrn = av.e();
                n3 = n4;
                n2 = 7;
                if (arrn == null) break block2;
                if (n3 > n2) break block3;
                this.N.b(O);
                n3 = n4;
                n2 = 4;
            }
            float f16 = (float)(n3 % n2) / 4.0f;
            float f17 = f16 + 0.24975f;
            float f18 = (float)(n4 / 2) / 2.0f;
            float f19 = f18 + 0.4995f;
            float f20 = 1.0f * this.P;
            float f21 = (float)(this.q + (this.b - this.q) * (double)f10 - j);
            float f22 = (float)(this.t + (this.D - this.t) * (double)f10 - o);
            float f23 = (float)(this.f + (this.z - this.f) * (double)f10 - w);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.y();
            a0.a();
            i2.a(7, Q);
            i2.c((double)(f21 - f11 * f20 - f14 * f20), (double)(f22 - f12 * f20 * 0.5f), (double)(f23 - f13 * f20 - f15 * f20)).a(f17, f19).a(this.B, this.C, this.p, 1.0f).a(0, 240).d(0.0f, 1.0f, 0.0f).d();
            i2.c((double)(f21 - f11 * f20 + f14 * f20), (double)(f22 + f12 * f20 * 0.5f), (double)(f23 - f13 * f20 + f15 * f20)).a(f17, f18).a(this.B, this.C, this.p, 1.0f).a(0, 240).d(0.0f, 1.0f, 0.0f).d();
            i2.c((double)(f21 + f11 * f20 + f14 * f20), (double)(f22 + f12 * f20 * 0.5f), (double)(f23 + f13 * f20 + f15 * f20)).a(f16, f18).a(this.B, this.C, this.p, 1.0f).a(0, 240).d(0.0f, 1.0f, 0.0f).d();
            i2.c((double)(f21 + f11 * f20 - f14 * f20), (double)(f22 - f12 * f20 * 0.5f), (double)(f23 + f13 * f20 - f15 * f20)).a(f16, f19).a(this.B, this.C, this.p, 1.0f).a(0, 240).d(0.0f, 1.0f, 0.0f).d();
            W.c().a();
            net.minecraft.client.a.v.j();
        }
    }

    @Override
    public int d() {
        return 3;
    }

    @Override
    public void i() {
        block3: {
            ai ai2;
            block2: {
                this.q = this.b;
                int[] arrn = av.e();
                this.t = this.D;
                this.f = this.z;
                ++this.R;
                ai2 = this;
                if (arrn == null) break block2;
                if (ai2.R != this.M) break block3;
                ai2 = this;
            }
            ai2.c();
        }
    }
}

