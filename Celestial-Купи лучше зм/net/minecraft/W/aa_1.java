/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class aa
extends Y {
    public static final /* synthetic */ f A;
    private static final /* synthetic */ k[] B;

    @Override
    public k a(i i2, t t2, n n2) {
        return B[i2.b(A)];
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block6: {
            int n4;
            int n5;
            boolean bl2;
            block7: {
                int n6;
                block8: {
                    int n7;
                    block5: {
                        bl2 = cL.e();
                        n7 = z2.C;
                        if (!bl2) break block5;
                        if (n7 != 0) break block6;
                        n7 = 1;
                    }
                    n5 = n7;
                    n6 = i2.b(A);
                    if (!bl2) break block7;
                    if (n6 < 3) break block8;
                    n5 = 2 + z2.J.nextInt(3);
                    n6 = n3;
                    if (!bl2) break block7;
                    if (n6 > 0) {
                        n5 += z2.J.nextInt(n3 + 1);
                    }
                }
                n6 = n4 = 0;
            }
            while (n4 < n5) {
                aa.a(z2, n2, new d(net.minecraft.u.h.cl));
                ++n4;
                if (bl2) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(net.minecraft.u.h.cl);
    }

    protected aa() {
        super(net.minecraft.ac.c.f, net.minecraft.ac.a.W);
        this.h(this.e.a().a(A, 0));
        this.a(true);
        this.a((a)null);
    }

    @Override
    protected boolean a(i i2) {
        return i2.b() == g.br;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        int n3 = i2.b(A);
        boolean bl2 = cL.e();
        if (bl2) {
            if (n3 < 3) {
                int n4 = random.nextInt(10);
                if (bl2 && n4 == 0) {
                    i2 = i2.a(A, n3 + 1);
                    n4 = z2.a(n2, i2, 2) ? 1 : 0;
                }
            }
            super.a(z2, n2, i2, random);
        }
    }

    @Override
    public boolean a(z z2, n n2, i i2) {
        return this.a(z2.d(n2.k()));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public int d(i i2) {
        return i2.b(A);
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, n2);
    }

    static {
        A = f.a("age", 0, 3);
        B = new k[]{new k(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.6875, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.875, 1.0)};
    }
}

