/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.Z;
import net.minecraft.W.cL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.h;

public class au
extends Z {
    public static final /* synthetic */ f D;
    private static final /* synthetic */ k[] C;

    @Override
    public k a(i i2, t t2, n n2) {
        return C[i2.b(this.a())];
    }

    static {
        D = f.a("age", 0, 3);
        C = new k[]{new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0)};
    }

    @Override
    protected int b(z z2) {
        return super.b(z2) / 3;
    }

    @Override
    protected net.minecraft.w.k c() {
        return net.minecraft.u.h.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    protected net.minecraft.w.k d() {
        return net.minecraft.u.h.bR;
    }

    @Override
    protected c f() {
        return new c((K)this, D);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block2: {
            block1: {
                boolean bl2;
                block0: {
                    bl2 = cL.e();
                    if (!bl2) break block0;
                    if (random.nextInt(3) != 0) break block1;
                    this.c(z2, n2, i2);
                }
                if (bl2) break block2;
            }
            super.a(z2, n2, i2, random);
        }
    }

    @Override
    protected f a() {
        return D;
    }
}

