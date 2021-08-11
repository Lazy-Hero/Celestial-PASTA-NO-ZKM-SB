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
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.cL;
import net.minecraft.W.cg;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class aI
extends aQ {
    protected static final /* synthetic */ k I;
    protected static final /* synthetic */ k A;
    private final /* synthetic */ boolean E;
    public static final /* synthetic */ c B;
    protected static final /* synthetic */ k F;
    protected static final /* synthetic */ k H;
    protected static final /* synthetic */ k K;
    protected static final /* synthetic */ k G;
    protected static final /* synthetic */ k J;
    protected static final /* synthetic */ k M;
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k L;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k N;

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public boolean a(z z2, n n2, aA aA2) {
        return aI.b(z2, n2, aA2);
    }

    private void c(z z2, n n2, aA aA2) {
        z2.a(n2, (K)this, false);
        z2.a(n2.a(aA2.h()), (K)this, false);
    }

    @Override
    public i c(int n2) {
        aA aA2;
        boolean bl2 = cL.e();
        switch (n2 & 7) {
            case 0: {
                aA2 = aA.DOWN;
                if (bl2) break;
            }
            case 1: {
                aA2 = aA.EAST;
                if (bl2) break;
            }
            case 2: {
                aA2 = aA.WEST;
                if (bl2) break;
            }
            case 3: {
                aA2 = aA.SOUTH;
                if (bl2) break;
            }
            case 4: {
                aA2 = aA.NORTH;
                if (bl2) break;
            }
            default: {
                aA2 = aA.UP;
            }
        }
        i i2 = this.d().a(z, aA2);
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(B, bl3);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, B);
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        int n3 = i2.b(B).booleanValue();
        if (!bl2) {
            n3 = n3 != 0 ? 15 : 0;
        }
        return n3;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block3: {
            block5: {
                boolean bl2;
                block6: {
                    boolean bl3;
                    block4: {
                        block2: {
                            bl3 = cL.e();
                            bl2 = z2.C;
                            if (!bl3) break block2;
                            if (bl2) break block3;
                            bl2 = i2.b(B);
                        }
                        if (!bl3) break block4;
                        if (!bl2) break block3;
                        bl2 = this.E;
                    }
                    if (!bl3) break block5;
                    if (!bl2) break block6;
                    this.a(i2, z2, n2);
                    if (bl3) break block3;
                }
                bl2 = z2.a(n2, i2.a(B, false));
            }
            this.c(z2, n2, i2.b(z));
            this.a(z2, n2);
            z2.b(n2, n2);
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    protected aI(boolean bl2) {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(z, aA.NORTH).a(B, false));
        this.a(true);
        this.a(net.minecraft.ad.a.p);
        this.E = bl2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        aA aA2 = i2.b(z);
        boolean bl2 = cL.e();
        boolean bl3 = i2.b(B);
        int n3 = cg.a[aA2.ordinal()];
        if (bl2) {
            switch (n3) {
                case 1: {
                    return bl3 ? J : F;
                }
                case 2: {
                    return bl3 ? D : K;
                }
                case 3: {
                    return bl3 ? I : G;
                }
                default: {
                    return bl3 ? A : C;
                }
                case 5: {
                    return bl3 ? L : N;
                }
                case 6: 
            }
            n3 = (int)((bl3 ? true : false) ? true : false);
        }
        return n3 != 0 ? M : H;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int d(i var1_1) {
        var2_2 = cL.e();
        v0 = cg.a[var1_1.b(aI.z).ordinal()];
        if (!var2_2) ** GOTO lbl22
        switch (v0) {
            case 1: {
                var3_3 = 1;
                if (var2_2) break;
            }
            case 2: {
                var3_3 = 2;
                if (var2_2) break;
            }
            case 3: {
                var3_3 = 3;
                if (var2_2) break;
            }
            case 4: {
                var3_3 = 4;
                if (var2_2) break;
            }
            default: {
                var3_3 = 5;
                if (var2_2) break;
            }
            case 6: {
                v0 = 0;
lbl22:
                // 2 sources

                var3_3 = v0;
            }
        }
        v1 = var1_1.b(aI.B).booleanValue();
        if (var2_2 == false) return v1;
        if (v1 != 0) {
            var3_3 |= 8;
        }
        v1 = var3_3;
        return v1;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        block2: {
            boolean bl2;
            block3: {
                boolean bl3;
                block1: {
                    bl3 = cL.b();
                    bl2 = z2.C;
                    if (bl3) break block1;
                    if (bl2) break block2;
                    bl2 = this.E;
                }
                if (bl3) break block3;
                if (!bl2) break block2;
                bl2 = i2.b(B);
            }
            if (!bl2) {
                this.a(i2, z2, n2);
            }
        }
    }

    @Override
    public void a(z z2, n n2, i i2) {
        boolean bl2 = cL.b();
        if (!bl2) {
            if (i2.b(B).booleanValue()) {
                this.c(z2, n2, i2.b(z));
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return aI.b(z2, n2, aA2) ? this.d().a(z, aA2).a(B, false) : this.d().a(z, aA.DOWN).a(B, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(z z2, n n2, aA aA2) {
        n n3 = n2.a(aA2.h());
        i i2 = z2.d(n3);
        boolean bl2 = cL.b();
        boolean bl3 = i2.c(z2, n3, aA2) == d.SOLID;
        K k2 = i2.b();
        if (aA2 == aA.UP) {
            K k3 = k2;
            if (!bl2) {
                if (k3 == g.ac) return true;
                k3 = k2;
            }
            boolean bl4 = aI.c(k3);
            if (!bl2) {
                if (bl4) return false;
                bl4 = bl3;
            }
            if (bl2) return bl4;
            if (!bl4) return false;
            return true;
        }
        boolean bl5 = aI.a(k2);
        if (!bl2) {
            if (bl5) return false;
            bl5 = bl3;
        }
        if (bl2) return bl5;
        if (!bl5) return false;
        return true;
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        Object object = i2.b(B);
        if (!bl2) {
            if (!((Boolean)object).booleanValue()) {
                return 0;
            }
            object = i2.b(z);
        }
        return object == aA2 ? 15 : 0;
    }

    private boolean a(z z2, n n2, i i2) {
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

    private void a(i i2, z z2, n n2) {
        block13: {
            boolean bl2;
            block11: {
                boolean bl3;
                block12: {
                    boolean bl4;
                    boolean bl5;
                    block9: {
                        block10: {
                            List<f> list = z2.a(f.class, i2.f(z2, n2).a(n2));
                            bl5 = cL.e();
                            boolean bl6 = list.isEmpty();
                            if (bl5) {
                                bl6 = !bl6;
                            }
                            bl3 = bl6;
                            bl4 = i2.b(B);
                            bl2 = bl3;
                            if (!bl5) break block9;
                            if (!bl2) break block10;
                            bl2 = bl4;
                            if (!bl5) break block9;
                            if (!bl2) {
                                z2.a(n2, i2.a(B, true));
                                this.c(z2, n2, i2.b(z));
                                z2.b(n2, n2);
                                this.a((j)null, z2, n2);
                            }
                        }
                        bl2 = bl3;
                    }
                    if (!bl5) break block11;
                    if (bl2) break block12;
                    bl2 = bl4;
                    if (!bl5) break block11;
                    if (bl2) {
                        z2.a(n2, i2.a(B, false));
                        this.c(z2, n2, i2.b(z));
                        z2.b(n2, n2);
                        this.a(z2, n2);
                    }
                }
                bl2 = bl3;
            }
            if (!bl2) break block13;
            z2.a(new n(n2), (K)this, this.a(z2));
        }
    }

    protected abstract void a(j var1, z var2, n var3);

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a(z z2) {
        boolean bl2 = cL.b();
        int n2 = this.E;
        if (!bl2) {
            n2 = n2 != 0 ? 30 : 20;
        }
        return n2;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public void b(z z2, n n2, i i2, Random random) {
    }

    static {
        B = net.minecraft.ae.c.a("powered");
        H = new k(0.3125, 0.875, 0.375, 0.6875, 1.0, 0.625);
        N = new k(0.3125, 0.0, 0.375, 0.6875, 0.125, 0.625);
        C = new k(0.3125, 0.375, 0.875, 0.6875, 0.625, 1.0);
        G = new k(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.125);
        K = new k(0.875, 0.375, 0.3125, 1.0, 0.625, 0.6875);
        F = new k(0.0, 0.375, 0.3125, 0.125, 0.625, 0.6875);
        M = new k(0.3125, 0.9375, 0.375, 0.6875, 1.0, 0.625);
        L = new k(0.3125, 0.0, 0.375, 0.6875, 0.0625, 0.625);
        A = new k(0.3125, 0.375, 0.9375, 0.6875, 0.625, 1.0);
        I = new k(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.0625);
        D = new k(0.9375, 0.375, 0.3125, 1.0, 0.625, 0.6875);
        J = new k(0.0, 0.375, 0.3125, 0.0625, 0.625, 0.6875);
    }

    @Override
    public boolean a(z z2, n n2) {
        boolean bl2;
        block4: {
            aA[] arraA = aA.values();
            int n3 = arraA.length;
            int n4 = 0;
            boolean bl3 = cL.e();
            while (n4 < n3) {
                aA aA2 = arraA[n4];
                if (bl3) {
                    bl2 = aI.b(z2, n2, aA2);
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
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.b();
        boolean bl3 = i2.b(B);
        if (!bl2) {
            if (bl3) {
                return true;
            }
            z2.a(n2, i2.a(B, true), 3);
            z2.b(n2, n2);
            this.a(j2, z2, n2);
            this.c(z2, n2, i2.b(z));
            z2.a(n2, (K)this, this.a(z2));
            bl3 = true;
        }
        return bl3;
    }

    protected abstract void a(z var1, n var2);

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            boolean bl3;
            block4: {
                bl3 = cL.e();
                bl2 = this.a(z2, n2, i2);
                if (!bl3) break block4;
                if (!bl2) break block5;
                bl2 = aI.b(z2, n2, i2.b(z));
            }
            if (bl3 && !bl2) {
                this.a(z2, n2, i2, 0);
                bl2 = z2.v(n2);
            }
        }
    }
}

