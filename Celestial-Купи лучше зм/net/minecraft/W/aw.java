/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.Z;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class aw
extends Z {
    private static final /* synthetic */ k[] C;

    static {
        C = new k[]{new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)};
    }

    @Override
    protected net.minecraft.w.k d() {
        return net.minecraft.u.h.f;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block3: {
            z z3;
            block5: {
                int n4;
                block4: {
                    boolean bl2;
                    block2: {
                        boolean bl3 = cL.e();
                        super.a(z2, n2, i2, f10, n3);
                        bl2 = bl3;
                        n4 = z2.C;
                        if (!bl2) break block2;
                        if (n4 != 0) break block3;
                        n4 = this.b(i2);
                    }
                    if (!bl2) break block4;
                    if (n4 == 0) break block3;
                    z3 = z2;
                    if (!bl2) break block5;
                    n4 = z3.J.nextInt(50);
                }
                if (n4 != 0) break block3;
                z3 = z2;
            }
            aw.a(z3, n2, new d(net.minecraft.u.h.bC));
        }
    }

    @Override
    protected net.minecraft.w.k c() {
        return net.minecraft.u.h.f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return C[i2.b(this.a())];
    }
}

