/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.u.C;
import net.minecraft.client.u.a3;
import net.minecraft.client.u.av;

public class ab
extends a3 {
    private /* synthetic */ boolean V;
    private /* synthetic */ float U;
    private /* synthetic */ boolean X;
    private /* synthetic */ float Y;
    private /* synthetic */ boolean aa;
    private final /* synthetic */ C W;
    private /* synthetic */ float Z;

    public ab(z z2, double d10, double d11, double d12, double d13, double d14, double d15, C c10) {
        super(z2, d10, d11, d12, 160, 8, -0.004f);
        this.s = d13;
        this.n = d14;
        this.I = d15;
        this.W = c10;
        this.E *= 0.75f;
        this.e = 48 + this.y.nextInt(12);
    }

    public void a(boolean bl2) {
        this.X = bl2;
    }

    @Override
    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            ab ab2;
            block2: {
                block3: {
                    int[] arrn = av.e();
                    ab2 = this;
                    if (arrn == null) break block2;
                    if (!ab2.X) break block3;
                    ab2 = this;
                    if (arrn == null) break block2;
                    if (ab2.K < this.e / 3) break block3;
                    ab2 = this;
                    if (arrn == null) break block2;
                    if ((ab2.K + this.e) / 3 % 2 != 0) break block4;
                }
                ab2 = this;
            }
            super.a(i2, x2, f10, f11, f12, f13, f14, f15);
        }
    }

    @Override
    public void i() {
        block6: {
            ab ab2;
            int[] arrn;
            block8: {
                int n2;
                int n3;
                block7: {
                    block5: {
                        int[] arrn2 = av.e();
                        super.i();
                        arrn = arrn2;
                        n3 = this.V;
                        if (arrn == null) break block5;
                        if (n3 == 0) break block6;
                        n3 = this.K;
                    }
                    n2 = this.e / 2;
                    if (arrn == null) break block7;
                    if (n3 >= n2) break block6;
                    ab2 = this;
                    if (arrn == null) break block8;
                    n3 = ab2.K + this.e;
                    n2 = 2;
                }
                if (n3 % n2 != 0) break block6;
                ab2 = new ab(this.a, this.b, this.D, this.z, 0.0, 0.0, 0.0, this.W);
            }
            ab ab3 = ab2;
            ab3.c(0.99f);
            ab3.a(this.B, this.C, this.p);
            ab3.K = ab3.e / 2;
            ab ab4 = this;
            if (arrn != null) {
                if (ab4.aa) {
                    ab3.aa = true;
                    ab3.Z = this.Z;
                    ab3.Y = this.Y;
                    ab3.U = this.U;
                }
                ab3.X = this.X;
                ab4 = this;
            }
            ab4.W.a(ab3);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a() {
        return true;
    }

    public void b(boolean bl2) {
        this.V = bl2;
    }
}

