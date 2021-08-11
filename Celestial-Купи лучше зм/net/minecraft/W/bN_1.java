/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aL;
import net.minecraft.W.as;
import net.minecraft.W.b2;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bN
extends K {
    protected static final /* synthetic */ k[] C;
    public static final /* synthetic */ c E;
    public static final /* synthetic */ c A;
    public static final /* synthetic */ c z;
    private final /* synthetic */ boolean B;
    public static final /* synthetic */ c D;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(K k2) {
        K k3;
        boolean bl2;
        block16: {
            aL aL2;
            block15: {
                block14: {
                    K k4;
                    block13: {
                        bl2 = cL.e();
                        boolean bl3 = k2 instanceof as;
                        if (!bl2) return bl3;
                        if (bl3) return true;
                        bl3 = k2 instanceof b2;
                        if (!bl2) return bl3;
                        if (bl3) return true;
                        k3 = k2;
                        if (bl2) {
                            if (k3 == g.bX) return true;
                            k3 = k2;
                        }
                        k4 = g.aH;
                        if (bl2) {
                            if (k3 == k4) return true;
                            K k4 = k2;
                            k4 = g.W;
                        }
                        if (bl2) {
                            if (k3 == k4) return true;
                            K k4 = k2;
                            k4 = g.cF;
                        }
                        if (!bl2) break block13;
                        if (k3 == k4) return true;
                        k3 = k2;
                        if (!bl2) break block14;
                        k4 = g.af;
                    }
                    if (k3 == k4) return true;
                    k3 = k2;
                }
                aL2 = g.cr;
                if (!bl2) break block15;
                if (k3 == aL2) return true;
                k3 = k2;
                if (!bl2) break block16;
                aL2 = g.M;
            }
            if (k3 == aL2) return true;
            k3 = k2;
        }
        K k5 = g.bi;
        if (bl2) {
            if (k3 == k5) return true;
            K k5 = k2;
            k5 = g.ae;
        }
        if (bl2) {
            if (k3 == k5) return true;
            K k5 = k2;
            k5 = g.G;
        }
        if (bl2) {
            if (k3 == k5) return true;
            K k5 = k2;
            k5 = g.y;
        }
        if (bl2) {
            if (k3 == k5) return true;
            K k5 = k2;
            k5 = g.ah;
        }
        if (k3 != k5) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        net.minecraft.w.k k2;
        boolean bl2 = cL.e();
        bN bN2 = this;
        if (bl2) {
            if (!bN2.B) {
                k2 = net.minecraft.u.h.v;
                return k2;
            }
            bN2 = this;
        }
        k2 = super.a(i2, random, n2);
        return k2;
    }

    @Override
    public i a(i i2, ae ae2) {
        switch (ae2) {
            case CLOCKWISE_180: {
                return i2.a(z, i2.b(A)).a(E, i2.b(D)).a(A, i2.b(z)).a(D, i2.b(E));
            }
            case COUNTERCLOCKWISE_90: {
                return i2.a(z, i2.b(E)).a(E, i2.b(A)).a(A, i2.b(D)).a(D, i2.b(z));
            }
            case CLOCKWISE_90: {
                return i2.a(z, i2.b(D)).a(E, i2.b(z)).a(A, i2.b(E)).a(D, i2.b(A));
            }
        }
        return i2;
    }

    @Override
    protected boolean r() {
        return true;
    }

    static {
        z = net.minecraft.ae.c.a("north");
        E = net.minecraft.ae.c.a("east");
        A = net.minecraft.ae.c.a("south");
        D = net.minecraft.ae.c.a("west");
        C = new k[]{new k(0.4375, 0.0, 0.4375, 0.5625, 1.0, 0.5625), new k(0.4375, 0.0, 0.4375, 0.5625, 1.0, 1.0), new k(0.0, 0.0, 0.4375, 0.5625, 1.0, 0.5625), new k(0.0, 0.0, 0.4375, 0.5625, 1.0, 1.0), new k(0.4375, 0.0, 0.0, 0.5625, 1.0, 0.5625), new k(0.4375, 0.0, 0.0, 0.5625, 1.0, 1.0), new k(0.0, 0.0, 0.0, 0.5625, 1.0, 0.5625), new k(0.0, 0.0, 0.0, 0.5625, 1.0, 1.0), new k(0.4375, 0.0, 0.4375, 1.0, 1.0, 0.5625), new k(0.4375, 0.0, 0.4375, 1.0, 1.0, 1.0), new k(0.0, 0.0, 0.4375, 1.0, 1.0, 0.5625), new k(0.0, 0.0, 0.4375, 1.0, 1.0, 1.0), new k(0.4375, 0.0, 0.0, 1.0, 1.0, 0.5625), new k(0.4375, 0.0, 0.0, 1.0, 1.0, 1.0), new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.5625), new k(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    }

    @Override
    public aC p() {
        return aC.CUTOUT_MIPPED;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, E, D, A);
    }

    @Override
    public i e(i i2, t t2, n n2) {
        return i2.a(z, this.a(t2, t2.d(n2.i()), n2.i(), aA.SOUTH)).a(A, this.a(t2, t2.d(n2.j()), n2.j(), aA.NORTH)).a(D, this.a(t2, t2.d(n2.b()), n2.b(), aA.EAST)).a(E, this.a(t2, t2.d(n2.m()), n2.m(), aA.WEST));
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        block8: {
            boolean bl3 = cL.b();
            boolean bl4 = bl2;
            if (!bl3) {
                if (!bl4) {
                    i2 = this.e(i2, z2, n2);
                }
                bN.a(n2, k2, list, C[0]);
                bl4 = i2.b(z);
            }
            if (!bl3) {
                if (bl4) {
                    bN.a(n2, k2, list, C[bN.a(aA.NORTH)]);
                }
                bl4 = i2.b(A);
            }
            if (!bl3) {
                if (bl4) {
                    bN.a(n2, k2, list, C[bN.a(aA.SOUTH)]);
                }
                bl4 = i2.b(E);
            }
            if (!bl3) {
                if (bl4) {
                    bN.a(n2, k2, list, C[bN.a(aA.EAST)]);
                }
                bl4 = i2.b(D);
            }
            if (!bl4) break block8;
            bN.a(n2, k2, list, C[bN.a(aA.WEST)]);
        }
    }

    @Override
    public k a(i i2, t t2, n n2) {
        i2 = this.e(i2, t2, n2);
        return C[bN.a(i2)];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.e();
        if (t2.d(n2.a(aA2)).b() == this) return false;
        boolean bl3 = super.b(i2, t2, n2, aA2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public int d(i i2) {
        return 0;
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        switch (h2) {
            case LEFT_RIGHT: {
                return i2.a(z, i2.b(A)).a(A, i2.b(z));
            }
            case FRONT_BACK: {
                return i2.a(E, i2.b(D)).a(D, i2.b(E));
            }
        }
        return super.a(i2, h2);
    }

    protected bN(net.minecraft.ac.c c10, boolean bl2) {
        super(c10);
        this.h(this.e.a().a(z, false).a(E, false).a(A, false).a(D, false));
        this.B = bl2;
        this.a(net.minecraft.ad.a.j);
    }

    private static int a(aA aA2) {
        return 1 << aA2.k();
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        d d10;
        block5: {
            aA aA3;
            aA aA4;
            block4: {
                boolean bl2 = cL.b();
                aA4 = aA2;
                aA3 = aA.UP;
                if (bl2) break block4;
                if (aA4 == aA3) break block5;
                aA4 = aA2;
                aA3 = aA.DOWN;
            }
            if (aA4 != aA3) {
                d10 = d.MIDDLE_POLE_THIN;
                return d10;
            }
        }
        d10 = d.CENTER_SMALL;
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(t t2, i i2, n n2, aA aA2) {
        d d10;
        d d11;
        block3: {
            d d12;
            block2: {
                K k2 = i2.b();
                boolean bl2 = cL.e();
                d12 = i2.c(t2, n2, aA2);
                if (bN.b(k2)) break block2;
                d11 = d12;
                d10 = d.SOLID;
                if (!bl2) break block3;
                if (d11 == d10) return true;
            }
            d11 = d12;
            d10 = d.MIDDLE_POLE_THIN;
        }
        if (d11 != d10) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static int a(i i2) {
        int n2 = 0;
        boolean bl2 = cL.e();
        int n3 = i2.b(z).booleanValue();
        if (bl2) {
            if (n3 != 0) {
                n2 |= bN.a(aA.NORTH);
            }
            n3 = i2.b(E).booleanValue();
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= bN.a(aA.EAST);
            }
            n3 = i2.b(A).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= bN.a(aA.SOUTH);
            }
            n3 = i2.b(D).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= bN.a(aA.WEST);
            }
            n3 = n2;
        }
        return n3;
    }
}

