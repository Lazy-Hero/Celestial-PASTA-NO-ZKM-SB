/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.u.av;

public class a2
extends av {
    private final /* synthetic */ float M;
    private final /* synthetic */ x R;
    private /* synthetic */ int O;
    private final /* synthetic */ a4 Q;
    private final /* synthetic */ int P;
    private final /* synthetic */ x N;

    public a2(z z2, x x2, x x3, float f10) {
        super(z2, x2.a, x2.aF, x2.ax, x2.aq, x2.G, x2.d);
        this.Q = net.minecraft.client.Q.P().aQ();
        this.N = x2;
        this.R = x3;
        this.P = 3;
        this.M = f10;
    }

    @Override
    public void i() {
        block3: {
            a2 a22;
            block2: {
                ++this.O;
                int[] arrn = av.e();
                a22 = this;
                if (arrn == null) break block2;
                if (a22.O != this.P) break block3;
                a22 = this;
            }
            a22.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block6: {
            int n2;
            block5: {
                int n3 = 0;
                int[] arrn = av.e();
                int n4 = fU.ag();
                if (arrn != null) {
                    if (n4 != 0) {
                        n3 = cS.bf;
                        cS.a(this.N);
                    }
                    n4 = this.O;
                }
                float f16 = ((float)n4 + f10) / (float)this.P;
                f16 *= f16;
                double d10 = this.N.a;
                double d11 = this.N.aF;
                double d12 = this.N.ax;
                double d13 = this.R.am + (this.R.a - this.R.am) * (double)f10;
                double d14 = this.R.af + (this.R.aF - this.R.af) * (double)f10 + (double)this.M;
                double d15 = this.R.n + (this.R.ax - this.R.n) * (double)f10;
                double d16 = d10 + (d13 - d10) * (double)f16;
                double d17 = d11 + (d14 - d11) * (double)f16;
                double d18 = d12 + (d15 - d12) * (double)f16;
                int n5 = this.a(f10);
                int n6 = n5 % 65536;
                int n7 = n5 / 65536;
                as.a(as.p, n6, (float)n7);
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                v.j();
                this.Q.a(this.N, d16 -= j, d17 -= o, d18 -= w, this.N.e, f10, false);
                n2 = fU.ag();
                if (arrn == null) break block5;
                if (n2 == 0) break block6;
                n2 = n3;
            }
            cS.a(n2);
        }
    }

    @Override
    public int d() {
        return 3;
    }
}

