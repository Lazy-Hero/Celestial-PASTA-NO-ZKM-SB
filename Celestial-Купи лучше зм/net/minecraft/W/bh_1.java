/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.I;
import net.minecraft.W.K;
import net.minecraft.W.aI;
import net.minecraft.W.cL;
import net.minecraft.W.z;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.ar.ay;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bh
extends K {
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ c z;
    protected static final /* synthetic */ k F;
    public static final /* synthetic */ d<z> C;
    protected static final /* synthetic */ k G;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k A;

    protected bh() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(C, net.minecraft.W.z.NORTH).a(z, false));
        this.a(net.minecraft.ad.a.p);
    }

    protected static boolean b(net.minecraft.ah.z z2, n n2, aA aA2) {
        return aI.b(z2, n2, aA2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(net.minecraft.ah.z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        if (bl2) {
            if (i2.b(z).booleanValue()) {
                z2.a(n2, (K)this, false);
                aA aA2 = i2.b(C).b();
                z2.a(n2.a(aA2.h()), (K)this, false);
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = I.b[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = I.c[var1_1.b(bh.C).ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(bh.C, net.minecraft.W.z.WEST);
                    }
                    case 2: {
                        return var1_1.a(bh.C, net.minecraft.W.z.EAST);
                    }
                    case 3: {
                        return var1_1.a(bh.C, net.minecraft.W.z.NORTH);
                    }
                    case 4: {
                        return var1_1.a(bh.C, net.minecraft.W.z.SOUTH);
                    }
                }
                return var1_1;
            }
            case 2: {
                v1 = I.c[var1_1.b(bh.C).ordinal()];
                if (var3_3) ** GOTO lbl39
                switch (v1) {
                    case 1: {
                        return var1_1.a(bh.C, net.minecraft.W.z.NORTH);
                    }
                    case 2: {
                        return var1_1.a(bh.C, net.minecraft.W.z.SOUTH);
                    }
                    case 3: {
                        return var1_1.a(bh.C, net.minecraft.W.z.EAST);
                    }
                    case 4: {
                        return var1_1.a(bh.C, net.minecraft.W.z.WEST);
                    }
                    case 5: {
                        return var1_1.a(bh.C, net.minecraft.W.z.UP_X);
                    }
                    case 6: {
                        return var1_1.a(bh.C, net.minecraft.W.z.UP_Z);
                    }
                    case 7: {
                        return var1_1.a(bh.C, net.minecraft.W.z.DOWN_Z);
                    }
                    case 8: {
                        return var1_1.a(bh.C, net.minecraft.W.z.DOWN_X);
                    }
                }
            }
            case 3: {
                v1 = I.c[var1_1.b(bh.C).ordinal()];
lbl39:
                // 2 sources

                switch (v1) {
                    case 1: {
                        return var1_1.a(bh.C, net.minecraft.W.z.SOUTH);
                    }
                    case 2: {
                        return var1_1.a(bh.C, net.minecraft.W.z.NORTH);
                    }
                    case 3: {
                        return var1_1.a(bh.C, net.minecraft.W.z.WEST);
                    }
                    case 4: {
                        return var1_1.a(bh.C, net.minecraft.W.z.EAST);
                    }
                    case 5: {
                        return var1_1.a(bh.C, net.minecraft.W.z.UP_X);
                    }
                    case 6: {
                        return var1_1.a(bh.C, net.minecraft.W.z.UP_Z);
                    }
                    case 7: {
                        return var1_1.a(bh.C, net.minecraft.W.z.DOWN_Z);
                    }
                    case 8: {
                        return var1_1.a(bh.C, net.minecraft.W.z.DOWN_X);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        Object object = i2.b(z);
        if (!bl2) {
            if (!((Boolean)object).booleanValue()) {
                return 0;
            }
            object = i2.b(C);
        }
        return ((z)object).b() == aA2 ? 15 : 0;
    }

    static {
        C = d.a("facing", z.class);
        z = net.minecraft.ae.c.a("powered");
        A = new k(0.3125, 0.2f, 0.625, 0.6875, 0.8f, 1.0);
        D = new k(0.3125, 0.2f, 0.0, 0.6875, 0.8f, 0.375);
        G = new k(0.625, 0.2f, 0.3125, 1.0, 0.8f, 0.6875);
        F = new k(0.0, 0.2f, 0.3125, 0.375, 0.8f, 0.6875);
        B = new k(0.25, 0.0, 0.25, 0.75, 0.6f, 0.75);
        E = new k(0.25, 0.4f, 0.25, 0.75, 1.0, 0.75);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public i a(net.minecraft.ah.z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        i i2;
        i i3;
        block5: {
            i3 = this.d().a(z, false);
            boolean bl2 = cL.e();
            if (bh.b(z2, n2, aA2)) {
                return i3.a(C, net.minecraft.W.z.a(aA2, b10.K()));
            }
            for (aA aA3 : av.HORIZONTAL) {
                if (bl2) {
                    if (aA3 != aA2 && bh.b(z2, n2, aA3)) {
                        return i3.a(C, net.minecraft.W.z.a(aA3, b10.K()));
                    }
                    if (bl2) continue;
                }
                break block5;
            }
            i2 = z2.d(n2.k());
            if (!bl2) return i2;
            if (i2.d()) {
                return i3.a(C, net.minecraft.W.z.a(aA.UP, b10.K()));
            }
        }
        i2 = i3;
        return i2;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        n2 |= i2.b(C).a();
        int n3 = i2.b(z).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public boolean a(net.minecraft.ah.z z2, n n2, aA aA2) {
        return bh.b(z2, n2, aA2);
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(C).b()));
    }

    @Override
    public void a(i i2, net.minecraft.ah.z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            boolean bl3;
            block4: {
                bl3 = cL.e();
                bl2 = this.a(z2, n2, i2);
                if (!bl3) break block4;
                if (!bl2) break block5;
                bl2 = bh.b(z2, n2, i2.b(C).b());
            }
            if (bl3 && !bl2) {
                this.a(z2, n2, i2, 0);
                bl2 = z2.v(n2);
            }
        }
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.e();
        int n3 = i2.b(z).booleanValue();
        if (bl2) {
            n3 = n3 != 0 ? 15 : 0;
        }
        return n3;
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public boolean a(net.minecraft.ah.z z2, n n2) {
        boolean bl2;
        block4: {
            aA[] arraA = aA.values();
            int n3 = arraA.length;
            boolean bl3 = cL.e();
            int n4 = 0;
            while (n4 < n3) {
                aA aA2 = arraA[n4];
                if (bl3) {
                    bl2 = bh.b(z2, n2, aA2);
                    if (!bl3) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n4;
                }
                if (bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(C, net.minecraft.W.z.a(n2 & 7));
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(z, bl3);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C, z);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public boolean a(net.minecraft.ah.z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.C;
        if (!bl2) {
            if (bl3) {
                return true;
            }
            i2 = i2.a(z);
            z2.a(n2, i2, 3);
            bl3 = i2.b(z);
        }
        float f13 = bl3 ? 0.6f : 0.5f;
        z2.a(null, n2, net.minecraft.u.E.b3, ay.BLOCKS, 0.3f, f13);
        z2.a(n2, (K)this, false);
        aA aA3 = i2.b(C).b();
        z2.a(n2.a(aA3.h()), (K)this, false);
        return true;
    }

    private boolean a(net.minecraft.ah.z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.a(z2, n2);
        if (bl2) {
            if (bl3) {
                return true;
            }
            this.a(z2, n2, i2, 0);
            z2.v(n2);
            bl3 = false;
        }
        return bl3;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(C)) {
            default: {
                return F;
            }
            case WEST: {
                return G;
            }
            case SOUTH: {
                return D;
            }
            case NORTH: {
                return A;
            }
            case UP_Z: 
            case UP_X: {
                return B;
            }
            case DOWN_X: 
            case DOWN_Z: 
        }
        return E;
    }
}

