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
import net.minecraft.W.aQ;
import net.minecraft.W.cL;
import net.minecraft.W.cU;
import net.minecraft.W.d_;
import net.minecraft.W.t;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class ac
extends aQ {
    protected static final /* synthetic */ k I;
    public static final /* synthetic */ c M;
    protected static final /* synthetic */ k H;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k P;
    protected static final /* synthetic */ k Q;
    protected static final /* synthetic */ k C;
    public static final /* synthetic */ d<cU> B;
    protected static final /* synthetic */ k N;
    protected static final /* synthetic */ k L;
    protected static final /* synthetic */ k T;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k O;
    protected static final /* synthetic */ k G;
    protected static final /* synthetic */ k R;
    protected static final /* synthetic */ k S;
    protected static final /* synthetic */ k F;
    protected static final /* synthetic */ k K;
    protected static final /* synthetic */ k J;

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        ac.a(n2, k2, list, i2.f(z2, n2));
        ac.a(n2, k2, list, this.a(i2));
    }

    private k a(i i2) {
        boolean bl2 = i2.b(M);
        boolean bl3 = cL.b();
        int n2 = net.minecraft.W.t.a[i2.b(z).ordinal()];
        if (!bl3) {
            switch (n2) {
                default: {
                    return bl2 ? T : N;
                }
                case 2: {
                    return bl2 ? G : F;
                }
                case 3: {
                    return bl2 ? L : O;
                }
                case 4: {
                    return bl2 ? D : K;
                }
                case 5: {
                    return bl2 ? R : H;
                }
                case 6: 
            }
            n2 = bl2 ? 1 : 0;
        }
        return n2 != 0 ? J : A;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.e();
        int n3 = n2 | i2.b(z).f();
        if (bl2) {
            n2 = n3;
            if (i2.b(B) == cU.STICKY) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    public ac() {
        super(net.minecraft.ac.c.y);
        this.h(this.e.a().a(z, aA.NORTH).a(B, cU.DEFAULT).a(M, false));
        this.a(d_.i);
        this.c(0.5f);
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public boolean b(i i2, net.minecraft.ah.t t2, n n2, aA aA2) {
        return true;
    }

    @Override
    public k a(i i2, net.minecraft.ah.t t2, n n2) {
        switch (i2.b(z)) {
            default: {
                return S;
            }
            case UP: {
                return C;
            }
            case NORTH: {
                return I;
            }
            case SOUTH: {
                return E;
            }
            case WEST: {
                return Q;
            }
            case EAST: 
        }
        return P;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(i2.b(B) == cU.STICKY ? g.M : g.cr);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, ac.a(n2)).a(B, (n2 & 8) > 0 ? cU.STICKY : cU.DEFAULT);
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block6: {
            i i3;
            i i4;
            boolean bl2;
            block4: {
                block5: {
                    super.a(z2, n2, i2);
                    aA aA2 = i2.b(z).h();
                    n2 = n2.a(aA2);
                    bl2 = cL.e();
                    i3 = i4 = z2.d(n2);
                    if (!bl2) break block4;
                    if (i3.b() == g.cr) break block5;
                    i3 = i4;
                    if (!bl2) break block4;
                    if (i3.b() != g.M) break block6;
                }
                i3 = i4;
            }
            boolean bl3 = i3.b(aL.A);
            if (bl2 && bl3) {
                i4.b().a(z2, n2, i4, 0);
                bl3 = z2.v(n2);
            }
        }
    }

    @Override
    public net.minecraft.Z.d a(net.minecraft.ah.t t2, i i2, n n2, aA aA2) {
        return aA2 == i2.b(z) ? net.minecraft.Z.d.SOLID : net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, B, M);
    }

    @Override
    public boolean a(z z2, n n2, aA aA2) {
        return false;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block4: {
            i i3;
            n n4;
            block2: {
                i i4;
                block3: {
                    aA aA2 = i2.b(z);
                    n4 = n2.a(aA2.h());
                    boolean bl2 = cL.b();
                    i3 = i4 = z2.d(n4);
                    if (bl2) break block2;
                    if (i3.b() == g.cr) break block3;
                    i3 = i4;
                    if (bl2) break block2;
                    if (i3.b() == g.M) break block3;
                    z2.v(n2);
                    if (!bl2) break block4;
                }
                i3 = i4;
            }
            i3.a(z2, n4, k2, n3);
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block2: {
            block3: {
                n n3;
                block5: {
                    aL aL2;
                    K k2;
                    block4: {
                        K k3;
                        boolean bl2 = cL.e();
                        if (!bl2) break block2;
                        if (!j2.cw.g) break block3;
                        n3 = n2.a(i2.b(z).h());
                        k2 = k3 = z2.d(n3).b();
                        aL2 = g.cr;
                        if (!bl2) break block4;
                        if (k2 == aL2) break block5;
                        k2 = k3;
                        aL2 = g.M;
                    }
                    if (k2 != aL2) break block3;
                }
                z2.v(n3);
            }
            super.a(z2, n2, i2, j2);
        }
    }

    static {
        B = d.a("type", cU.class);
        M = net.minecraft.ae.c.a("short");
        P = new k(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
        Q = new k(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
        E = new k(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
        I = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
        C = new k(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
        S = new k(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
        F = new k(0.375, -0.25, 0.375, 0.625, 0.75, 0.625);
        N = new k(0.375, 0.25, 0.375, 0.625, 1.25, 0.625);
        K = new k(0.375, 0.375, -0.25, 0.625, 0.625, 0.75);
        O = new k(0.375, 0.375, 0.25, 0.625, 0.625, 1.25);
        A = new k(-0.25, 0.375, 0.375, 0.75, 0.625, 0.625);
        H = new k(0.25, 0.375, 0.375, 1.25, 0.625, 0.625);
        G = new k(0.375, 0.0, 0.375, 0.625, 0.75, 0.625);
        T = new k(0.375, 0.25, 0.375, 0.625, 1.0, 0.625);
        D = new k(0.375, 0.375, 0.0, 0.625, 0.625, 0.75);
        L = new k(0.375, 0.375, 0.25, 0.625, 0.625, 1.0);
        J = new k(0.0, 0.375, 0.375, 0.75, 0.625, 0.625);
        R = new k(0.25, 0.375, 0.375, 1.0, 0.625, 0.625);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public boolean a(z z2, n n2) {
        return false;
    }

    @Override
    public boolean i(i i2) {
        return i2.b(z) == aA.UP;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static aA a(int n2) {
        int n3 = n2 & 7;
        boolean bl2 = cL.e();
        int n4 = n3;
        if (bl2) {
            if (n4 > 5) {
                return null;
            }
            n4 = n3;
        }
        aA aA2 = aA.a(n4);
        return aA2;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }
}

