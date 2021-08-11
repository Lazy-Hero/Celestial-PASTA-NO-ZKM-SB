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
import net.minecraft.W.cL;
import net.minecraft.W.cW;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c2
extends K {
    public static final /* synthetic */ c D;
    public static final /* synthetic */ c G;
    protected static final /* synthetic */ k C;
    public static final /* synthetic */ c B;
    public static final /* synthetic */ c A;
    public static final /* synthetic */ c E;
    public static final /* synthetic */ c F;
    protected static final /* synthetic */ k z;
    public static final /* synthetic */ c H;

    static {
        E = net.minecraft.ae.c.a("powered");
        H = net.minecraft.ae.c.a("attached");
        B = net.minecraft.ae.c.a("disarmed");
        D = net.minecraft.ae.c.a("north");
        F = net.minecraft.ae.c.a("east");
        A = net.minecraft.ae.c.a("south");
        G = net.minecraft.ae.c.a("west");
        z = new k(0.0, 0.0625, 0.0, 1.0, 0.15625, 1.0);
        C = new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
    }

    @Override
    public i e(i i2, t t2, n n2) {
        return i2.a(D, c2.a(t2, n2, i2, aA.NORTH)).a(F, c2.a(t2, n2, i2, aA.EAST)).a(A, c2.a(t2, n2, i2, aA.SOUTH)).a(G, c2.a(t2, n2, i2, aA.WEST));
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        switch (h2) {
            case LEFT_RIGHT: {
                return i2.a(D, i2.b(A)).a(A, i2.b(D));
            }
            case FRONT_BACK: {
                return i2.a(F, i2.b(G)).a(G, i2.b(F));
            }
        }
        return super.a(i2, h2);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.e();
                bl2 = z2.C;
                if (!bl3) break block1;
                if (bl2) break block2;
                bl2 = i2.b(E);
            }
            if (!bl2) {
                this.a(z2, n2);
            }
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.b();
                bl2 = z2.C;
                if (bl3) break block1;
                if (bl2) break block2;
                bl2 = z2.d(n2).b(E);
            }
            if (bl2) {
                this.a(z2, n2);
            }
        }
    }

    @Override
    public void a(z z2, n n2, i i2) {
        this.c(z2, n2, i2.a(E, true));
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        z2.a(n2, i2, 3);
        this.c(z2, n2, i2);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, E, H, B, D, F, G, A);
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(net.minecraft.u.h.aC);
    }

    private void a(z z2, n n2) {
        block10: {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            i i2;
            block6: {
                block7: {
                    i2 = z2.d(n2);
                    bl5 = cL.b();
                    bl4 = i2.b(E);
                    bl3 = false;
                    List<x> list = z2.b(null, i2.f(z2, n2).a(n2));
                    bl2 = list.isEmpty();
                    if (bl5) break block6;
                    if (bl2) break block7;
                    for (x x2 : list) {
                        block9: {
                            block8: {
                                bl2 = x2.aC();
                                if (bl5) break block6;
                                if (bl5) break block8;
                                if (bl2) break block9;
                                boolean bl6 = bl3 = true;
                            }
                            if (!bl5) break;
                        }
                        if (!bl5) continue;
                    }
                }
                bl2 = bl3;
            }
            if (!bl5) {
                if (bl2 != bl4) {
                    i2 = i2.a(E, bl3);
                    z2.a(n2, i2, 3);
                    this.c(z2, n2, i2);
                }
                bl2 = bl3;
            }
            if (!bl2) break block10;
            z2.a(new n(n2), (K)this, this.a(z2));
        }
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public aC p() {
        return aC.TRANSLUCENT;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(z z2, n n2, i i2, Random random) {
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.aC;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return i2.b(H) == false ? C : z;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        int n3 = i2.b(E).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1;
            }
            n3 = i2.b(H).booleanValue() ? 1 : 0;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 4;
            }
            n3 = i2.b(B).booleanValue() ? 1 : 0;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    private void c(z z2, n n2, i i2) {
        aA[] arraA = new aA[]{aA.SOUTH, aA.WEST};
        int n3 = arraA.length;
        int n4 = 0;
        boolean bl2 = cL.e();
        while (n4 < n3) {
            block5: {
                aA aA2 = arraA[n4];
                for (int i3 = 1; i3 < 42; ++i3) {
                    n n5 = n2.a(aA2, i3);
                    i i4 = z2.d(n5);
                    if (bl2) {
                        K k2 = i4.b();
                        K k3 = g.b;
                        if (bl2) {
                            if (k2 == k3) {
                                if (i4.b(cW.z) != aA2.h()) break;
                                g.b.a(z2, n5, i4, false, true, i3, i2);
                                if (bl2) break;
                            }
                            k2 = i4.b();
                            k3 = g.cM;
                        }
                        if (k2 != k3 && bl2) break;
                        if (bl2) continue;
                    }
                    break block5;
                }
                ++n4;
            }
            if (bl2) continue;
        }
    }

    public static boolean a(t t2, n n2, i i2, aA aA2) {
        K k2;
        n n3 = n2.a(aA2);
        boolean bl2 = cL.e();
        i i3 = t2.d(n3);
        K k3 = k2 = i3.b();
        K k4 = g.b;
        if (bl2) {
            if (k3 == k4) {
                aA aA3 = aA2.h();
                return i3.b(cW.z) == aA3;
            }
            k3 = k2;
            k4 = g.cM;
        }
        return k3 == k4;
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block2: {
            d d10;
            block3: {
                boolean bl2;
                block1: {
                    boolean bl3 = cL.e();
                    bl2 = z2.C;
                    if (!bl3) break block1;
                    if (bl2) break block2;
                    d10 = j2.av();
                    if (!bl3) break block3;
                    bl2 = d10.G();
                }
                if (bl2) break block2;
                d10 = j2.av();
            }
            if (d10.w() == net.minecraft.u.h.aT) {
                z2.a(n2, i2.a(B, true), 4);
            }
        }
    }

    @Override
    public i a(i i2, ae ae2) {
        switch (ae2) {
            case CLOCKWISE_180: {
                return i2.a(D, i2.b(A)).a(F, i2.b(G)).a(A, i2.b(D)).a(G, i2.b(F));
            }
            case COUNTERCLOCKWISE_90: {
                return i2.a(D, i2.b(F)).a(F, i2.b(A)).a(A, i2.b(G)).a(G, i2.b(D));
            }
            case CLOCKWISE_90: {
                return i2.a(D, i2.b(G)).a(F, i2.b(D)).a(A, i2.b(F)).a(G, i2.b(A));
            }
        }
        return i2;
    }

    public c2() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(E, false).a(H, false).a(B, false).a(D, false).a(F, false).a(A, false).a(G, false));
        this.a(true);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d();
        boolean bl3 = n2 & 1;
        if (bl2) {
            bl3 = bl3 > false;
        }
        i i3 = i2.a(E, bl3);
        boolean bl4 = n2 & 4;
        if (bl2) {
            bl4 = bl4 > false;
        }
        i i4 = i3.a(H, bl4);
        boolean bl5 = n2 & 8;
        if (bl2) {
            bl5 = bl5 > false;
        }
        return i4.a(B, bl5);
    }
}

