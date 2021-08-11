/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.c_;
import net.minecraft.W.dF;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class ck
extends K {
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k H;
    public static final /* synthetic */ e E;
    protected static final /* synthetic */ k B;
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k G;
    public static final /* synthetic */ c D;
    public static final /* synthetic */ d<dF> F;

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(E)));
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(E, ck.a(n2));
        boolean bl3 = n2 & 4;
        if (bl2) {
            bl3 = bl3;
        }
        return i2.a(D, bl3).a(F, (n2 & 8) == 0 ? dF.BOTTOM : dF.TOP);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        net.minecraft.Z.d d10;
        block9: {
            Object object;
            block6: {
                block7: {
                    boolean bl2;
                    block8: {
                        aA aA3;
                        block4: {
                            block5: {
                                bl2 = cL.e();
                                object = aA2;
                                aA3 = aA.UP;
                                if (!bl2) break block4;
                                if (object != aA3) break block5;
                                object = i2.b(F);
                                if (!bl2) break block6;
                                if (object == dF.TOP) break block7;
                            }
                            object = aA2;
                            if (!bl2) break block8;
                            aA3 = aA.DOWN;
                        }
                        if (object != aA3) break block9;
                        object = i2.b(F);
                    }
                    if (!bl2) break block6;
                    if (object != dF.BOTTOM) break block9;
                }
                object = i2.b(D);
            }
            if (!((Boolean)object).booleanValue()) {
                d10 = net.minecraft.Z.d.SOLID;
                return d10;
            }
        }
        d10 = net.minecraft.Z.d.UNDEFINED;
        return d10;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        i i2;
        block6: {
            block4: {
                block5: {
                    i2 = this.d();
                    boolean bl2 = cL.b();
                    if (bl2) break block4;
                    if (!aA2.g().d()) break block5;
                    i2 = i2.a(E, aA2).a(D, false);
                    i2 = i2.a(F, f11 > 0.5f ? dF.TOP : dF.BOTTOM);
                    if (!bl2) break block6;
                }
                i2 = i2.a(E, b10.K().h()).a(D, false);
            }
            i2 = i2.a(F, aA2 == aA.UP ? dF.BOTTOM : dF.TOP);
        }
        if (z2.x(n2)) {
            i2 = i2.a(D, true);
        }
        return i2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public k a(i i2, t t2, n n2) {
        k k2;
        boolean bl2 = cL.e();
        Object object = i2.b(D);
        if (bl2) {
            if (((Boolean)object).booleanValue()) {
                switch (i2.b(E)) {
                    default: {
                        k2 = z;
                        if (bl2) return k2;
                    }
                    case SOUTH: {
                        k2 = H;
                        if (bl2) return k2;
                    }
                    case WEST: {
                        k2 = G;
                        if (bl2) return k2;
                    }
                    case EAST: 
                }
                k2 = A;
                if (bl2) return k2;
            }
            object = i2.b(F);
        }
        if (object != dF.TOP) return C;
        k2 = B;
        if (bl2) return k2;
        return C;
    }

    protected void a(@Nullable j j2, z z2, n n2, boolean bl2) {
        block3: {
            int n3;
            block2: {
                boolean bl3 = cL.b();
                if (!bl2) break block2;
                n3 = this.y == net.minecraft.ac.c.D ? 1037 : 1007;
                z2.a(j2, n3, n2, 0);
                if (!bl3) break block3;
            }
            n3 = this.y == net.minecraft.ac.c.D ? 1036 : 1013;
            z2.a(j2, n3, n2, 0);
        }
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(E, ae2.a(i2.b(E)));
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    protected static aA a(int n2) {
        switch (n2 & 3) {
            case 0: {
                return aA.NORTH;
            }
            case 1: {
                return aA.SOUTH;
            }
            case 2: {
                return aA.WEST;
            }
        }
        return aA.EAST;
    }

    protected static int a(aA aA2) {
        boolean bl2 = cL.e();
        int n2 = c_.a[aA2.ordinal()];
        if (bl2) {
            switch (n2) {
                case 1: {
                    return 0;
                }
                case 2: {
                    return 1;
                }
                case 3: {
                    return 2;
                }
            }
            n2 = 3;
        }
        return n2;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, E, D, F);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            boolean bl2;
            block6: {
                boolean bl3;
                boolean bl4;
                boolean bl5;
                block4: {
                    block5: {
                        boolean bl6;
                        block2: {
                            bl5 = cL.e();
                            bl6 = z2.C;
                            if (!bl5) break block2;
                            if (bl6) break block3;
                            bl6 = z2.x(n2);
                        }
                        bl4 = bl2 = bl6;
                        if (!bl5) break block4;
                        if (bl4) break block5;
                        bl4 = k2.d().a();
                        if (!bl5) break block4;
                        if (!bl4) break block3;
                    }
                    bl4 = i2.b(D);
                }
                boolean bl7 = bl3 = bl4;
                if (!bl5) break block6;
                if (bl7 == bl2) break block3;
                bl7 = z2.a(n2, i2.a(D, bl2), 2);
            }
            this.a(null, z2, n2, bl2);
        }
    }

    @Override
    public boolean a(t t2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = t2.d(n2).b(D);
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    static {
        E = bF.z;
        D = net.minecraft.ae.c.a("open");
        F = d.a("half", dF.class);
        A = new k(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
        G = new k(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
        H = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
        z = new k(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
        C = new k(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0);
        B = new k(0.0, 0.8125, 0.0, 1.0, 1.0, 1.0);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public boolean a(z z2, n n2, aA aA2) {
        return true;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= ck.a(i2.b(E));
        boolean bl2 = cL.b();
        Object object = i2.b(D);
        if (!bl2) {
            if (((Boolean)object).booleanValue()) {
                n2 |= 4;
            }
            object = i2.b(F);
        }
        if (object == dF.TOP) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        ck ck2 = this;
        if (bl2) {
            if (ck2.y == net.minecraft.ac.c.D) {
                return false;
            }
            i2 = i2.a(D);
            z2.a(n2, i2, 2);
            ck2 = this;
        }
        ck2.a(j2, z2, n2, i2.b(D));
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected ck(net.minecraft.ac.c c10) {
        super(c10);
        this.h(this.e.a().a(E, aA.NORTH).a(D, false).a(F, dF.BOTTOM));
        this.a(net.minecraft.ad.a.p);
    }
}

