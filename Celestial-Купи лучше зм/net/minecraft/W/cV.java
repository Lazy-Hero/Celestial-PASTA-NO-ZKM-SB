/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bA;
import net.minecraft.W.cL;
import net.minecraft.W.cr;
import net.minecraft.W.du;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cV
extends K {
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k B;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k A;
    public static final /* synthetic */ e z;
    protected static final /* synthetic */ k D;

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        this.a(z2, n2, i2);
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    private boolean b(z z2, n n2, aA aA2) {
        block11: {
            aA aA3;
            aA aA4;
            d d10;
            K k2;
            block10: {
                boolean bl2;
                block7: {
                    block8: {
                        boolean bl3;
                        block9: {
                            n n3 = n2.a(aA2.h());
                            i i2 = z2.d(n3);
                            bl2 = cL.e();
                            k2 = i2.b();
                            d10 = i2.c(z2, n3, aA2);
                            aA4 = aA2;
                            aA3 = aA.UP;
                            if (!bl2) break block7;
                            if (!aA4.equals(aA3)) break block8;
                            bl3 = this.b(z2, n3);
                            if (!bl2) break block9;
                            if (!bl3) break block8;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    aA4 = aA2;
                    aA3 = aA.UP;
                }
                if (!bl2) break block10;
                if (aA4 == aA3) break block11;
                aA4 = aA2;
                aA3 = aA.DOWN;
            }
            if (aA4 != aA3) {
                return !cV.a(k2) && d10 == d.SOLID;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i c(int var1_1) {
        var3_2 = this.d();
        var2_3 = cL.e();
        if (!var2_3) ** GOTO lbl7
        switch (var1_1) {
            case 1: {
                var3_2 = var3_2.a(cV.z, aA.EAST);
lbl7:
                // 2 sources

                if (var2_3 != false) return var3_2;
            }
            case 2: {
                var3_2 = var3_2.a(cV.z, aA.WEST);
                if (var2_3 != false) return var3_2;
            }
            case 3: {
                var3_2 = var3_2.a(cV.z, aA.SOUTH);
                if (var2_3 != false) return var3_2;
            }
            case 4: {
                var3_2 = var3_2.a(cV.z, aA.NORTH);
                if (var2_3 != false) return var3_2;
            }
        }
        return var3_2.a(cV.z, aA.UP);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    aA aA2 = i2.b(z);
                    d12 = (double)n2.e() + 0.5;
                    d11 = (double)n2.b() + 0.7;
                    d10 = (double)n2.a() + 0.5;
                    double d13 = 0.22;
                    boolean bl2 = cL.b();
                    double d14 = 0.27;
                    if (bl2) break block2;
                    if (!aA2.g().d()) break block3;
                    aA aA3 = aA2.h();
                    z2.a(aH.SMOKE_NORMAL, d12 + 0.27 * (double)aA3.r(), d11 + 0.22, d10 + 0.27 * (double)aA3.i(), 0.0, 0.0, 0.0, new int[0]);
                    z2.a(aH.FLAME, d12 + 0.27 * (double)aA3.r(), d11 + 0.22, d10 + 0.27 * (double)aA3.i(), 0.0, 0.0, 0.0, new int[0]);
                    if (!bl2) break block4;
                }
                z2.a(aH.SMOKE_NORMAL, d12, d11, d10, 0.0, 0.0, 0.0, new int[0]);
            }
            z2.a(aH.FLAME, d12, d11, d10, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.e();
        int n3 = du.a[i2.b(z).ordinal()];
        if (!bl2) return n3;
        switch (n3) {
            case 1: {
                n2 |= 1;
                if (bl2) return n2;
            }
            case 2: {
                n2 |= 2;
                if (bl2) return n2;
            }
            case 3: {
                n2 |= 3;
                if (bl2) return n2;
            }
            case 4: {
                n2 |= 4;
                if (bl2) return n2;
            }
            default: {
                n3 = n2 | 5;
                return n3;
            }
        }
    }

    static {
        z = net.minecraft.ae.e.a("facing", new cr());
        B = new k(0.4f, 0.0, 0.4f, 0.6f, 0.6f, 0.6f);
        C = new k(0.35f, 0.2f, 0.7f, 0.65f, 0.8f, 1.0);
        D = new k(0.35f, 0.2f, 0.0, 0.65f, 0.8f, 0.3f);
        E = new k(0.7f, 0.2f, 0.35f, 1.0, 0.8f, 0.65f);
        A = new k(0.0, 0.2f, 0.35f, 0.3f, 0.8f, 0.65f);
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    protected boolean a(z z2, n n2, i i2) {
        boolean bl2;
        boolean bl3;
        block14: {
            boolean bl4;
            block13: {
                n n3;
                block11: {
                    Q q2;
                    block12: {
                        block10: {
                            boolean bl5;
                            block9: {
                                bl3 = cL.e();
                                bl5 = this.b(z2, n2, i2);
                                if (!bl3) break block9;
                                if (bl5) break block10;
                                bl5 = true;
                            }
                            return bl5;
                        }
                        aA aA2 = i2.b(z);
                        q2 = aA2.g();
                        aA aA3 = aA2.h();
                        n3 = n2.a(aA3);
                        bl4 = false;
                        bl2 = q2.d();
                        if (!bl3) break block11;
                        if (!bl2 || z2.d(n3).c(z2, n3, aA2) == d.SOLID) break block12;
                        bl4 = true;
                        if (bl3) break block13;
                    }
                    bl2 = q2.b();
                }
                if (!bl3) break block14;
                if (!bl2) break block13;
                bl2 = this.b(z2, n3);
                if (!bl3) break block14;
                if (!bl2) {
                    bl4 = true;
                }
            }
            bl2 = bl4;
        }
        if (bl3) {
            if (bl2) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        this.b(z2, n2, i2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected boolean b(z var1_1, n var2_2, i var3_3) {
        block9: {
            block6: {
                block8: {
                    block7: {
                        var4_4 = cL.b();
                        v0 = var3_3.b();
                        v1 = this;
                        if (var4_4) break block6;
                        if (v0 != v1) break block7;
                        v0 = this;
                        if (!var4_4) {
                            if (super.b(var1_1, var2_2, var3_3.b(cV.z))) {
                                return true;
                            } else {
                                ** GOTO lbl11
                            }
                        }
                        break block8;
                    }
                    v2 = var1_1;
                    v3 = var2_2;
                    if (var4_4) break block9;
                    v0 = v2.d(v3).b();
                }
                v1 = this;
            }
            if (v0 != v1) return false;
            this.a(var1_1, var2_2, var3_3, 0);
            v2 = var1_1;
            v3 = var2_2;
        }
        v2.v(v3);
        return false;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        cV cV2;
        block5: {
            boolean bl2;
            block7: {
                cV cV3;
                block6: {
                    bl2 = cL.e();
                    cV3 = this;
                    if (!bl2) break block6;
                    if (!cV3.b(z2, n2, aA2)) break block7;
                    cV3 = this;
                }
                return cV3.d().a(z, aA2);
            }
            for (aA aA3 : av.HORIZONTAL) {
                block9: {
                    cV cV4;
                    block8: {
                        cV2 = this;
                        if (!bl2) break block5;
                        if (!bl2) break block8;
                        if (!cV2.b(z2, n2, aA3)) break block9;
                        cV4 = this;
                    }
                    return cV4.d().a(z, aA3);
                }
                if (bl2) continue;
            }
            cV2 = this;
        }
        return cV2.d();
    }

    protected cV() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(z, aA.UP));
        this.a(true);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(z)) {
            case EAST: {
                return A;
            }
            case WEST: {
                return E;
            }
            case SOUTH: {
                return D;
            }
            case NORTH: {
                return C;
            }
        }
        return B;
    }

    @Override
    public boolean a(z z2, n n2) {
        boolean bl2;
        block3: {
            Iterator iterator = z.a().iterator();
            boolean bl3 = cL.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl4;
                    block4: {
                        aA aA2 = (aA)iterator.next();
                        bl2 = this.b(z2, n2, aA2);
                        if (bl3) break block3;
                        if (bl3) break block4;
                        if (!bl2) break block5;
                        bl4 = true;
                    }
                    return bl4;
                }
                if (!bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean b(z var1_1, n var2_2) {
        block8: {
            block10: {
                block9: {
                    block7: {
                        var4_3 = var1_1.d(var2_2).b();
                        var3_4 = cL.e();
                        v0 = var4_3;
                        v1 = g.m;
                        if (!var3_4) break block7;
                        if (v0 == v1) ** GOTO lbl-1000
                        v0 = var4_3;
                        v1 = g.y;
                    }
                    if (v0 == v1) lbl-1000:
                    // 2 sources

                    {
                        v2 = true;
                    } else {
                        v2 = false;
                    }
                    var5_5 = v2;
                    v3 = var1_1.d(var2_2).d();
                    if (var3_4) {
                        if (v3) {
                            v4 = var5_5;
                            if (var3_4 == false) return v4;
                            if (v4 != false) return false;
                            return true;
                        }
                        v3 = var4_3 instanceof bA;
                    }
                    if (!var3_4) break block8;
                    if (v3) ** GOTO lbl-1000
                    v5 = var4_3;
                    v6 = g.a;
                    if (!var3_4) break block9;
                    if (v5 == v6) ** GOTO lbl-1000
                    v5 = var4_3;
                    if (!var3_4) break block10;
                    v6 = g.bl;
                }
                if (v5 == v6) ** GOTO lbl-1000
                v5 = var4_3;
            }
            if (v5 == g.a5) lbl-1000:
            // 4 sources

            {
                v3 = true;
            } else {
                v3 = false;
            }
        }
        v7 = var6_6 = v3;
        if (var3_4) {
            if (v7 == false) return false;
            v7 = var5_5;
        }
        if (var3_4 == false) return v7;
        if (v7 != false) return false;
        return true;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }
}

