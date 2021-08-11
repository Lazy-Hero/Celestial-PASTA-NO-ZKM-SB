/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.av;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a3
extends av {
    private /* synthetic */ boolean M;
    private /* synthetic */ float T;
    private final /* synthetic */ float N;
    private /* synthetic */ float P;
    private /* synthetic */ float R;
    private final /* synthetic */ int Q;
    private final /* synthetic */ int S;
    private /* synthetic */ float O;

    public a3(z z2, double d10, double d11, double d12, int n2, int n3, float f10) {
        super(z2, d10, d11, d12);
        this.R = 0.91f;
        this.S = n2;
        this.Q = n3;
        this.N = f10;
    }

    public void c(int n2) {
        this.P = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        this.T = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        this.O = (float)((n2 & 0xFF) >> 0) / 255.0f;
        this.M = true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected void a(float f10) {
        this.R = f10;
    }

    @Override
    public void i() {
        block9: {
            block8: {
                a3 a32;
                int n2;
                block6: {
                    int[] arrn;
                    block7: {
                        int n3;
                        block5: {
                            this.q = this.b;
                            this.t = this.D;
                            arrn = av.e();
                            this.f = this.z;
                            int n4 = this.K;
                            n2 = n4;
                            this.K = n4 + 1;
                            n3 = this.e;
                            if (arrn == null) break block5;
                            if (n2 >= n3) {
                                this.c();
                            }
                            n2 = this.K;
                            if (arrn == null) break block6;
                            n3 = this.e / 2;
                        }
                        if (n2 <= n3) break block7;
                        this.c(1.0f - ((float)this.K - (float)(this.e / 2)) / (float)this.e);
                        n2 = this.M ? 1 : 0;
                        if (arrn == null) break block6;
                        if (n2 != 0) {
                            this.B += (this.P - this.B) * 0.2f;
                            this.C += (this.T - this.C) * 0.2f;
                            this.p += (this.O - this.p) * 0.2f;
                        }
                    }
                    this.a(this.S + (this.Q - 1 - this.K * this.Q / this.e));
                    this.n += (double)this.N;
                    this.a(this.s, this.n, this.I);
                    this.s *= (double)this.R;
                    this.n *= (double)this.R;
                    this.I *= (double)this.R;
                    a32 = this;
                    if (arrn == null) break block8;
                    n2 = a32.l ? 1 : 0;
                }
                if (n2 == 0) break block9;
                this.s *= (double)0.7f;
                a32 = this;
            }
            a32.I *= (double)0.7f;
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    public void d(int n2) {
        float f10 = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        float f11 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        float f12 = (float)((n2 & 0xFF) >> 0) / 255.0f;
        float f13 = 1.0f;
        this.a(f10 * 1.0f, f11 * 1.0f, f12 * 1.0f);
    }

    @Override
    public int a(float f10) {
        return 0xF000F0;
    }
}

