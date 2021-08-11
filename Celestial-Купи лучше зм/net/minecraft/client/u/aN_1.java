/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.client.u.av;

public class aN
extends av {
    private /* synthetic */ int M;
    private static final /* synthetic */ Random N;

    @Override
    public void i() {
        block8: {
            block7: {
                aN aN2;
                int n2;
                block6: {
                    this.q = this.b;
                    this.t = this.D;
                    this.f = this.z;
                    int[] arrn = av.e();
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn != null) {
                        if (n2 >= this.e) {
                            this.c();
                        }
                        this.a(this.M + (7 - this.K * 8 / this.e));
                        this.n += 0.004;
                        this.a(this.s, this.n, this.I);
                        double d10 = this.D - this.t;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block6;
                    if (n2 == 0) {
                        this.s *= 1.1;
                        this.I *= 1.1;
                    }
                    this.s *= (double)0.96f;
                    this.n *= (double)0.96f;
                    this.I *= (double)0.96f;
                    aN2 = this;
                    if (arrn == null) break block7;
                    n2 = aN2.l ? 1 : 0;
                }
                if (n2 == 0) break block8;
                this.s *= (double)0.7f;
                aN2 = this;
            }
            aN2.I *= (double)0.7f;
        }
    }

    public void c(int n2) {
        this.M = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        N = new Random();
    }

    protected aN(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        int[] arrn = av.e();
        super(z2, d10, d11, d12, 0.5 - N.nextDouble(), d14, 0.5 - N.nextDouble());
        int[] arrn2 = arrn;
        this.M = 128;
        this.n *= (double)0.2f;
        if (arrn2 != null) {
            if (d13 == 0.0 && d15 == 0.0) {
                this.s *= (double)0.1f;
                this.I *= (double)0.1f;
            }
            this.E *= 0.75f;
            this.e = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        }
    }

    @Override
    public boolean a() {
        return true;
    }
}

