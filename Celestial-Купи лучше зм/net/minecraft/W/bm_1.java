/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.ax;
import net.minecraft.W.cL;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public class bm
extends K {
    public static final /* synthetic */ c z;

    protected bm() {
        super(net.minecraft.ac.c.K, net.minecraft.ac.a.ab);
        this.h(this.e.a().a(z, false));
        this.a(true);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public int d(i i2) {
        return 0;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i e(i i2, t t2, n n2) {
        boolean bl2;
        block5: {
            K k2;
            K k3;
            block4: {
                K k4 = t2.d(n2.a()).b();
                boolean bl3 = cL.e();
                k3 = k4;
                k2 = g.da;
                if (!bl3) break block4;
                if (k3 == k2) break block5;
                k3 = k4;
                k2 = g.o;
            }
            if (k3 != k2) {
                bl2 = false;
                return i2.a(z, bl2);
            }
        }
        bl2 = true;
        return i2.a(z, bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block0: {
            super.a(i2, z2, n2, random);
            if (random.nextInt(10) != 0) break block0;
            z2.a(aH.TOWN_AURA, (double)((float)n2.e() + random.nextFloat()), (double)((float)n2.b() + 1.1f), (double)((float)n2.a() + random.nextFloat()), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return g.bv.a(g.bv.d().a(ax.A, da.DIRT), random, n2);
    }

    static {
        z = net.minecraft.ae.c.a("snowy");
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block6: {
            int n3;
            boolean bl2;
            block9: {
                int n4;
                int n5;
                block7: {
                    block8: {
                        block5: {
                            bl2 = cL.e();
                            n5 = z2.C;
                            if (!bl2) break block5;
                            if (n5 != 0) break block6;
                            n5 = z2.s(n2.a());
                        }
                        n4 = 4;
                        if (!bl2) break block7;
                        if (n5 >= n4) break block8;
                        n5 = z2.d(n2.a()).j();
                        n4 = 2;
                        if (!bl2) break block7;
                        if (n5 <= n4) break block8;
                        z2.a(n2, g.bv.d().a(ax.A, da.DIRT));
                        if (bl2) break block6;
                    }
                    n5 = z2.s(n2.a());
                    if (!bl2) break block9;
                    n4 = 9;
                }
                if (n5 < n4) break block6;
                n5 = n3 = 0;
            }
            while (n3 < 4) {
                block10: {
                    block11: {
                        int n6;
                        int n7;
                        n n8;
                        block12: {
                            n8 = n2.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                            i i3 = z2.d(n8);
                            i i4 = z2.d(n8.a());
                            if (!bl2) break block10;
                            if (i3.b() != g.bv || i3.b(ax.A) != da.DIRT) break block11;
                            n7 = z2.s(n8.a());
                            n6 = 4;
                            if (!bl2) break block12;
                            if (n7 < n6) break block11;
                            n7 = i4.j();
                            if (!bl2) break block11;
                            n6 = 2;
                        }
                        if (n7 <= n6) {
                            n7 = z2.a(n8, this.d()) ? 1 : 0;
                        }
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
        }
    }
}

