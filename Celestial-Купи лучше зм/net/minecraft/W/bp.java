/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.n;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ac.c;
import net.minecraft.ae.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.k.k;
import net.minecraft.u.g;

public abstract class bp
extends K {
    protected static final /* synthetic */ k B;
    protected final /* synthetic */ boolean A;
    protected static final /* synthetic */ k z;

    public abstract a<cL> a();

    protected bp(boolean bl2) {
        super(net.minecraft.ac.c.n);
        this.A = bl2;
        this.a(net.minecraft.ad.a.t);
    }

    @Override
    public boolean a(z z2, net.minecraft.k.n n2) {
        return z2.d(n2.k()).d();
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.NORMAL;
    }

    protected i a(z z2, net.minecraft.k.n n2, i i2, boolean bl2) {
        return z2.C ? i2 : new n(this, z2, n2, i2).a(z2.x(n2), bl2).d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public k a(i var1_1, t var2_2, net.minecraft.k.n var3_3) {
        block7: {
            block6: {
                var4_4 = cL.e();
                v0 = var1_1;
                if (!var4_4) ** GOTO lbl6
                if (v0.b() == this) {
                    v0 = var1_1;
lbl6:
                    // 2 sources

                    v1 = v0.b(this.a());
                } else {
                    v1 = null;
                }
                v2 = var5_5 = v1;
                if (!var4_4) break block6;
                if (v2 == null) break block7;
                v2 = var5_5;
            }
            if (v2.c()) {
                v3 = bp.z;
                return v3;
            }
        }
        v3 = bp.B;
        return v3;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void a(z z2, net.minecraft.k.n n2, i i2) {
        block2: {
            boolean bl2 = cL.e();
            super.a(z2, n2, i2);
            boolean bl3 = bl2;
            boolean bl4 = i2.b(this.a()).c();
            if (bl3) {
                if (bl4) {
                    z2.a(n2.a(), (K)this, false);
                }
                bl4 = this.A;
            }
            if (!bl4) break block2;
            z2.a(n2, (K)this, false);
            z2.a(n2.k(), (K)this, false);
        }
    }

    static {
        B = new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
        z = new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
    }

    @Override
    public d a(t t2, i i2, net.minecraft.k.n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, net.minecraft.k.n n2) {
        return a;
    }

    protected void a(i i2, z z2, net.minecraft.k.n n2, K k2) {
    }

    @Override
    public void b(z z2, net.minecraft.k.n n2, i i2) {
        block3: {
            i i3;
            block4: {
                boolean bl2;
                block2: {
                    boolean bl3 = cL.b();
                    bl2 = z2.C;
                    if (bl3) break block2;
                    if (bl2) break block3;
                    i3 = this.a(z2, n2, i2, true);
                    if (bl3) break block4;
                    i2 = i3;
                    bl2 = this.A;
                }
                if (!bl2) break block3;
                i3 = i2;
            }
            i3.a(z2, n2, this, n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(i i2) {
        K k2 = i2.b();
        boolean bl2 = cL.b();
        K k3 = k2;
        K k4 = g.bM;
        if (!bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.w;
        }
        if (!bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.aY;
        }
        if (!bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.az;
        }
        if (k3 != k4) return false;
        return true;
    }

    public static boolean b(z z2, net.minecraft.k.n n2) {
        return bp.a(z2.d(n2));
    }

    @Override
    public void a(i i2, z z2, net.minecraft.k.n n2, K k2, net.minecraft.k.n n3) {
        block5: {
            block18: {
                boolean bl2;
                block19: {
                    boolean bl3;
                    block17: {
                        block16: {
                            boolean bl4;
                            block9: {
                                cL cL2;
                                cL cL3;
                                block13: {
                                    cL cL4;
                                    block14: {
                                        block15: {
                                            block10: {
                                                block11: {
                                                    block12: {
                                                        block6: {
                                                            block7: {
                                                                block8: {
                                                                    bl2 = cL.b();
                                                                    if (z2.C) break block5;
                                                                    cL4 = i2.b(this.a());
                                                                    boolean bl5 = z2.d(n2.k()).d();
                                                                    if (!bl2) {
                                                                        bl5 = !bl5;
                                                                    }
                                                                    bl4 = bl5;
                                                                    cL3 = cL4;
                                                                    cL2 = cL.ASCENDING_EAST;
                                                                    if (bl2) break block6;
                                                                    if (cL3 != cL2) break block7;
                                                                    boolean bl6 = z2.d(n2.m()).d();
                                                                    if (bl2) break block8;
                                                                    if (bl6) break block7;
                                                                    bl6 = bl4 = true;
                                                                }
                                                                if (!bl2) break block9;
                                                            }
                                                            cL3 = cL4;
                                                            cL2 = cL.ASCENDING_WEST;
                                                        }
                                                        if (bl2) break block10;
                                                        if (cL3 != cL2) break block11;
                                                        boolean bl7 = z2.d(n2.b()).d();
                                                        if (bl2) break block12;
                                                        if (bl7) break block11;
                                                        bl7 = bl4 = true;
                                                    }
                                                    if (!bl2) break block9;
                                                }
                                                cL3 = cL4;
                                                cL2 = cL.ASCENDING_NORTH;
                                            }
                                            if (bl2) break block13;
                                            if (cL3 != cL2) break block14;
                                            boolean bl8 = z2.d(n2.i()).d();
                                            if (bl2) break block15;
                                            if (bl8) break block14;
                                            bl8 = bl4 = true;
                                        }
                                        if (!bl2) break block9;
                                    }
                                    cL3 = cL4;
                                    cL2 = cL.ASCENDING_SOUTH;
                                }
                                if (cL3 != cL2) break block9;
                                bl3 = z2.d(n2.j()).d();
                                if (bl2) break block16;
                                if (!bl3) {
                                    bl4 = true;
                                }
                            }
                            bl3 = bl4;
                        }
                        if (bl2) break block17;
                        if (!bl3) break block18;
                        bl3 = z2.a(n2);
                    }
                    if (bl2) break block19;
                    if (bl3) break block18;
                    this.a(z2, n2, i2, 0);
                    bl3 = z2.v(n2);
                }
                if (!bl2) break block5;
            }
            this.a(i2, z2, n2, k2);
        }
    }
}

