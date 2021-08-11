/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.C;
import net.minecraft.W.K;
import net.minecraft.W.aE;
import net.minecraft.W.aX;
import net.minecraft.W.ax;
import net.minecraft.W.cL;
import net.minecraft.W.cs;
import net.minecraft.W.da;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aC;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public class bH
extends K
implements cs {
    public static final /* synthetic */ c z;

    private static gP a(gP gP2) {
        return gP2;
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

    @Override
    public k a(i i2, Random random, int n2) {
        return g.bv.a(g.bv.d().a(ax.A, da.DIRT), random, n2);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block10: {
            int n3;
            boolean bl2;
            block13: {
                int n4;
                int n5;
                block11: {
                    block12: {
                        block9: {
                            bl2 = cL.e();
                            n5 = z2.C;
                            if (!bl2) break block9;
                            if (n5 != 0) break block10;
                            n5 = z2.s(n2.a());
                        }
                        n4 = 4;
                        if (!bl2) break block11;
                        if (n5 >= n4) break block12;
                        n5 = z2.d(n2.a()).j();
                        n4 = 2;
                        if (!bl2) break block11;
                        if (n5 <= n4) break block12;
                        z2.a(n2, g.bv.d());
                        if (bl2) break block10;
                    }
                    n5 = z2.s(n2.a());
                    if (!bl2) break block13;
                    n4 = 9;
                }
                if (n5 < n4) break block10;
                n5 = n3 = 0;
            }
            while (n3 < 4) {
                block18: {
                    block19: {
                        int n6;
                        int n7;
                        n n8;
                        block20: {
                            n n9;
                            z z3;
                            block17: {
                                block15: {
                                    int n10;
                                    block16: {
                                        block14: {
                                            n8 = n2.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                                            n10 = n8.b();
                                            if (!bl2) break block14;
                                            if (n10 < 0) break block15;
                                            n10 = n8.b();
                                        }
                                        if (!bl2) break block16;
                                        if (n10 >= 256) break block15;
                                        z3 = z2;
                                        n9 = n8;
                                        if (!bl2) break block17;
                                        n10 = z3.n(n9) ? 1 : 0;
                                    }
                                    if (n10 == 0) {
                                        return;
                                    }
                                }
                                z3 = z2;
                                n9 = n8.a();
                            }
                            i i3 = z3.d(n9);
                            i i4 = z2.d(n8);
                            if (!bl2) break block18;
                            if (i4.b() != g.bv || i4.b(ax.A) != da.DIRT) break block19;
                            n7 = z2.s(n8.a());
                            n6 = 4;
                            if (!bl2) break block20;
                            if (n7 < n6) break block19;
                            n7 = i3.j();
                            if (!bl2) break block19;
                            n6 = 2;
                        }
                        if (n7 <= n6) {
                            n7 = z2.a(n8, g.aU.d()) ? 1 : 0;
                        }
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
        }
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        n n3 = n2.a();
        int n4 = 0;
        boolean bl2 = cL.e();
        while (n4 < 128) {
            block8: {
                n n5 = n3;
                int n6 = 0;
                do {
                    K k2;
                    if (n6 >= n4 / 16) {
                        k2 = z2.d(n5).b();
                        if (bl2) {
                            Object object;
                            if (k2.y != net.minecraft.ac.c.A) break;
                            if (random.nextInt(8) == 0) {
                                object = z2.c(n5).a(random, n5);
                                aE aE2 = ((C)object).a().a();
                                i i3 = aE2.d().a(aE2.a(), object);
                                boolean bl3 = aE2.a(z2, n5, i3);
                                if (bl2 && bl3) {
                                    bl3 = z2.a(n5, i3, 3);
                                }
                                if (bl2) break;
                            }
                            object = g.dc.d().a(aX.B, net.minecraft.W.e.GRASS);
                            boolean bl4 = g.dc.a(z2, n5, (i)object);
                            if (bl2 && bl4) {
                                bl4 = z2.a(n5, (i)object, 3);
                            }
                            if (bl2) break;
                        }
                    } else {
                        n5 = n5.a(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                        if (!bl2) break block8;
                        k2 = z2.d(n5.k()).b();
                    }
                    if (k2 != g.aU || z2.d(n5).r() && bl2) break;
                    ++n6;
                } while (bl2);
                ++n4;
            }
            if (bl2) continue;
        }
    }

    @Override
    public aC p() {
        return aC.CUTOUT_MIPPED;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        return true;
    }

    static {
        z = net.minecraft.ae.c.a("snowy");
    }

    protected bH() {
        super(net.minecraft.ac.c.K);
        this.h(this.e.a().a(z, false));
        this.a(true);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public int d(i i2) {
        return 0;
    }

    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        return true;
    }
}

