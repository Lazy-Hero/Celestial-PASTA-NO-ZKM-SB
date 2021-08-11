/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.Z;
import net.minecraft.W.a7;
import net.minecraft.W.ax;
import net.minecraft.W.cL;
import net.minecraft.W.da;
import net.minecraft.W.dy;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

public class b9
extends K {
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ f z;
    protected static final /* synthetic */ k A;

    @Override
    public boolean w(i i2) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        boolean bl3 = dy.a[aA2.ordinal()];
        if (bl2) return bl3;
        switch (bl3) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                i i3 = t2.d(n2.a(aA2));
                K k2 = i3.b();
                if (i3.i()) return false;
                K k3 = k2;
                K k4 = g.cU;
                if (!bl2) {
                    if (k3 == k4) return false;
                    k3 = k2;
                    k4 = g.ci;
                }
                if (k3 == k4) return false;
                return true;
            }
        }
        bl3 = super.b(i2, t2, n2, aA2);
        return bl3;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block8: {
            int n3;
            boolean bl2;
            block4: {
                int n4;
                block5: {
                    int n5;
                    block6: {
                        block7: {
                            n4 = i2.b(z);
                            bl2 = cL.b();
                            n3 = this.b(z2, n2);
                            if (bl2) break block4;
                            if (n3 != 0) break block5;
                            n3 = z2.t(n2.a()) ? 1 : 0;
                            if (bl2) break block4;
                            if (n3 != 0) break block5;
                            n5 = n4;
                            if (bl2) break block6;
                            if (n5 <= 0) break block7;
                            z2.a(n2, i2.a(z, n4 - 1), 2);
                            if (!bl2) break block8;
                        }
                        n5 = this.d(z2, n2) ? 1 : 0;
                    }
                    if (n5 != 0) break block8;
                    b9.c(z2, n2);
                    if (!bl2) break block8;
                }
                n3 = n4;
            }
            if (!bl2 && n3 < 7) {
                n3 = z2.a(n2, i2.a(z, 7), 2) ? 1 : 0;
            }
        }
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return B;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d(z z2, n n2) {
        K k2 = z2.d(n2.a()).b();
        boolean bl2 = cL.b();
        boolean bl3 = k2 instanceof Z;
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = k2 instanceof a7;
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    static {
        z = f.a("moisture", 0, 7);
        B = new k(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);
        A = new k(0.0, 0.9375, 0.0, 1.0, 1.0, 1.0);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            n n4;
            z z3;
            block2: {
                boolean bl2 = cL.b();
                super.a(i2, z2, n2, k2, n3);
                boolean bl3 = bl2;
                z3 = z2;
                n4 = n2.a();
                if (bl3) break block2;
                if (!z3.d(n4).o().d()) break block3;
                z3 = z2;
                n4 = n2;
            }
            b9.c(z3, n4);
        }
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2 & 7);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected b9() {
        super(net.minecraft.ac.c.q);
        this.h(this.e.a().a(z, 0));
        this.a(true);
        this.d(255);
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return g.bv.a(g.bv.d().a(ax.A, da.DIRT), random, n2);
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? d.SOLID : d.UNDEFINED;
    }

    protected static void c(z z2, n n2) {
        boolean bl2 = cL.e();
        z2.a(n2, g.bv.d());
        boolean bl3 = bl2;
        k k2 = A.a(n2);
        for (x x2 : z2.b(null, k2)) {
            double d10 = Math.min(k2.a - k2.b, k2.a - x2.m().b);
            x2.c(x2.a, x2.aF + d10 + 0.001, x2.ax);
            if (bl3) continue;
        }
    }

    @Override
    public void a(z z2, n n2, x x2, float f10) {
        block4: {
            block5: {
                float f11;
                block8: {
                    float f12;
                    block9: {
                        boolean bl2;
                        block7: {
                            block6: {
                                bl2 = cL.b();
                                if (bl2) break block4;
                                if (z2.C) break block5;
                                float f13 = z2.J.nextFloat() - (f10 - 0.5f);
                                f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                if (bl2) break block6;
                                if (f11 >= 0) break block5;
                                f11 = (float)(x2 instanceof B);
                            }
                            if (bl2) break block7;
                            if (f11 == false) break block5;
                            f11 = (float)(x2 instanceof j);
                        }
                        if (bl2) break block8;
                        if (f11 != false) break block9;
                        f11 = (float)z2.M().c("mobGriefing");
                        if (bl2) break block8;
                        if (f11 == false) break block5;
                    }
                    f11 = (f12 = x2.ad * x2.ad * x2.aD - 0.512f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                if (f11 > 0) {
                    b9.c(z2, n2);
                }
            }
            super.a(z2, n2, x2, f10);
        }
    }

    private boolean b(z z2, n n2) {
        Iterator<o> iterator = net.minecraft.k.n.a(n2.a(-4, 0, -4), n2.a(4, 1, 4)).iterator();
        boolean bl2 = cL.e();
        while (iterator.hasNext()) {
            o o2 = iterator.next();
            if (z2.d(o2).o() == net.minecraft.ac.c.L) {
                return true;
            }
            if (bl2) continue;
        }
        return false;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block3: {
            n n3;
            z z3;
            block2: {
                boolean bl2 = cL.e();
                super.b(z2, n2, i2);
                boolean bl3 = bl2;
                z3 = z2;
                n3 = n2.a();
                if (!bl3) break block2;
                if (!z3.d(n3).o().d()) break block3;
                z3 = z2;
                n3 = n2;
            }
            b9.c(z3, n3);
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }
}

