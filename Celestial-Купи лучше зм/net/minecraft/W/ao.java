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
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.av;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;

public class ao
extends K {
    public static final /* synthetic */ c z;
    public static final /* synthetic */ c C;
    public static final /* synthetic */ c A;
    public static final /* synthetic */ c B;
    public static final /* synthetic */ c D;
    public static final /* synthetic */ c E;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(z z2, n n2) {
        K k2;
        Object object;
        boolean bl2;
        block8: {
            boolean bl3 = z2.a(n2.a());
            boolean bl4 = z2.a(n2.k());
            bl2 = cL.b();
            object = av.HORIZONTAL.iterator();
            while (object.hasNext()) {
                block9: {
                    K k3;
                    n n3;
                    block11: {
                        boolean bl5;
                        block10: {
                            K k4;
                            aA aA2 = object.next();
                            n3 = n2.a(aA2);
                            k2 = k4 = z2.d(n3).b();
                            if (bl2) break block8;
                            if (k2 != this) break block9;
                            bl5 = bl3;
                            if (bl2) break block10;
                            if (bl5) break block11;
                            bl5 = bl4;
                        }
                        if (bl2) return bl5;
                        if (!bl5) {
                            return false;
                        }
                    }
                    K k6 = k3 = z2.d(n3.k()).b();
                    k6 = this;
                    if (!bl2) {
                        if (k5 == k6) return true;
                        K k6 = k3;
                        k6 = g.v;
                    }
                    if (k5 == k6) {
                        return true;
                    }
                }
                if (!bl2) continue;
            }
            k2 = z2.d(n2.k()).b();
        }
        Object object2 = object = k2;
        K k7 = this;
        if (!bl2) {
            if (object2 == k7) return true;
            object2 = object;
            k7 = g.v;
        }
        if (object2 != k7) return false;
        return true;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        i2 = i2.c(t2, n2);
        float f10 = 0.1875f;
        float f11 = i2.b(E) != false ? 0.0f : 0.1875f;
        float f12 = i2.b(B) != false ? 0.0f : 0.1875f;
        float f13 = i2.b(A) != false ? 0.0f : 0.1875f;
        float f14 = i2.b(C) != false ? 1.0f : 0.8125f;
        float f15 = i2.b(z) != false ? 1.0f : 0.8125f;
        float f16 = i2.b(D) != false ? 1.0f : 0.8125f;
        return new k(f11, f12, f13, f14, f15, f16);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        block11: {
            boolean bl3 = cL.b();
            if (!bl2) {
                i2 = i2.c((t)z2, n2);
            }
            float f10 = 0.1875f;
            float f11 = 0.8125f;
            ao.a(n2, k2, list, new k(0.1875, 0.1875, 0.1875, 0.8125, 0.8125, 0.8125));
            boolean bl4 = i2.b(E);
            if (!bl3) {
                if (bl4) {
                    ao.a(n2, k2, list, new k(0.0, 0.1875, 0.1875, 0.1875, 0.8125, 0.8125));
                }
                bl4 = i2.b(C);
            }
            if (!bl3) {
                if (bl4) {
                    ao.a(n2, k2, list, new k(0.8125, 0.1875, 0.1875, 1.0, 0.8125, 0.8125));
                }
                bl4 = i2.b(z);
            }
            if (!bl3) {
                if (bl4) {
                    ao.a(n2, k2, list, new k(0.1875, 0.8125, 0.1875, 0.8125, 1.0, 0.8125));
                }
                bl4 = i2.b(B);
            }
            if (!bl3) {
                if (bl4) {
                    ao.a(n2, k2, list, new k(0.1875, 0.0, 0.1875, 0.8125, 0.1875, 0.8125));
                }
                bl4 = i2.b(A);
            }
            if (!bl3) {
                if (bl4) {
                    ao.a(n2, k2, list, new k(0.1875, 0.1875, 0.0, 0.8125, 0.8125, 0.1875));
                }
                bl4 = i2.b(D);
            }
            if (!bl4) break block11;
            ao.a(n2, k2, list, new k(0.1875, 0.1875, 0.8125, 0.8125, 0.8125, 1.0));
        }
    }

    @Override
    public int d(i i2) {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        K k2 = t2.d(n2.a(aA2)).b();
        boolean bl2 = cL.b();
        K k4 = k2;
        k4 = this;
        if (!bl2) {
            if (k3 == k4) return false;
            K k4 = k2;
            k4 = g.P;
        }
        if (k3 == k4) return false;
        if (aA2 != aA.DOWN) return true;
        if (k2 == g.v) return false;
        return true;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i e(i var1_1, t var2_2, n var3_3) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                block15: {
                                    block14: {
                                        var5_4 = var2_2.d(var3_3.k()).b();
                                        var6_5 = var2_2.d(var3_3.a()).b();
                                        var7_6 = var2_2.d(var3_3.i()).b();
                                        var8_7 = var2_2.d(var3_3.m()).b();
                                        var9_8 = var2_2.d(var3_3.j()).b();
                                        var4_9 = cL.e();
                                        var10_10 = var2_2.d(var3_3.b()).b();
                                        v0 = var5_4;
                                        v1 /* !! */  = this;
                                        if (!var4_9) break block14;
                                        if (v0 == v1 /* !! */ ) ** GOTO lbl-1000
                                        v0 = var5_4;
                                        v1 /* !! */  = g.P;
                                    }
                                    if (!var4_9) break block15;
                                    if (v0 == v1 /* !! */ ) ** GOTO lbl-1000
                                    v0 = var5_4;
                                    v1 /* !! */  = g.v;
                                }
                                if (v0 == v1 /* !! */ ) lbl-1000:
                                // 3 sources

                                {
                                    v2 = true;
                                } else {
                                    v2 = false;
                                }
                                v3 = var1_1.a(ao.B, v2);
                                v4 = var6_5;
                                v5 /* !! */  = this;
                                if (!var4_9) break block16;
                                if (v4 == v5 /* !! */ ) ** GOTO lbl-1000
                                v4 = var6_5;
                                v5 /* !! */  = g.P;
                            }
                            if (v4 == v5 /* !! */ ) lbl-1000:
                            // 2 sources

                            {
                                v6 = true;
                            } else {
                                v6 = false;
                            }
                            v7 = v3.a(ao.z, v6);
                            v8 = var7_6;
                            v9 /* !! */  = this;
                            if (!var4_9) break block17;
                            if (v8 == v9 /* !! */ ) ** GOTO lbl-1000
                            v8 = var7_6;
                            v9 /* !! */  = g.P;
                        }
                        if (v8 == v9 /* !! */ ) lbl-1000:
                        // 2 sources

                        {
                            v10 = true;
                        } else {
                            v10 = false;
                        }
                        v11 = v7.a(ao.A, v10);
                        v12 = var8_7;
                        v13 /* !! */  = this;
                        if (!var4_9) break block18;
                        if (v12 == v13 /* !! */ ) ** GOTO lbl-1000
                        v12 = var8_7;
                        v13 /* !! */  = g.P;
                    }
                    if (v12 == v13 /* !! */ ) lbl-1000:
                    // 2 sources

                    {
                        v14 = true;
                    } else {
                        v14 = false;
                    }
                    v15 = v11.a(ao.C, v14);
                    v16 = var9_8;
                    v17 /* !! */  = this;
                    if (!var4_9) break block19;
                    if (v16 == v17 /* !! */ ) ** GOTO lbl-1000
                    v16 = var9_8;
                    v17 /* !! */  = g.P;
                }
                if (v16 == v17 /* !! */ ) lbl-1000:
                // 2 sources

                {
                    v18 = true;
                } else {
                    v18 = false;
                }
                v19 = v15.a(ao.D, v18);
                v20 = var10_10;
                v21 /* !! */  = this;
                if (!var4_9) break block20;
                if (v20 == v21 /* !! */ ) break block21;
                v20 = var10_10;
                v21 /* !! */  = g.P;
            }
            if (v20 != v21 /* !! */ ) {
                v22 = false;
                return v19.a(ao.E, v22);
            }
        }
        v22 = true;
        return v19.a(ao.E, v22);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.au;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = super.a(z2, n2);
        if (bl2) {
            if (!bl3) return false;
            bl3 = this.b(z2, n2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        boolean bl2 = cL.e();
        boolean bl3 = this.b(z2, n2);
        if (bl2 && !bl3) {
            bl3 = z2.a(n2, true);
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A, C, D, E, z, B);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return random.nextInt(2);
    }

    @Override
    public boolean a(t t2, n n2) {
        return false;
    }

    static {
        A = net.minecraft.ae.c.a("north");
        C = net.minecraft.ae.c.a("east");
        D = net.minecraft.ae.c.a("south");
        E = net.minecraft.ae.c.a("west");
        z = net.minecraft.ae.c.a("up");
        B = net.minecraft.ae.c.a("down");
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block0: {
            if (this.b(z2, n2)) break block0;
            z2.a(n2, (K)this, 1);
        }
    }

    protected ao() {
        super(net.minecraft.ac.c.f, net.minecraft.ac.a.ab);
        this.a(net.minecraft.ad.a.j);
        this.h(this.e.a().a(A, false).a(C, false).a(D, false).a(E, false).a(z, false).a(B, false));
    }
}

