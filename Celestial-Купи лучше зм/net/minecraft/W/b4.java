/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class b4
extends K {
    @Override
    public d c(z z2, n n2, i i2) {
        return new d(this);
    }

    public b4() {
        this(net.minecraft.ac.c.H.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public k a(i i2, Random random, int n2) {
        k k2;
        b4 b42;
        block12: {
            K k3;
            block11: {
                boolean bl2 = cL.b();
                b42 = this;
                k3 = g.l;
                if (!bl2) {
                    if (b42 == k3) {
                        return net.minecraft.u.h.b4;
                    }
                    b42 = this;
                    k3 = g.cO;
                }
                if (!bl2) {
                    if (b42 == k3) {
                        return net.minecraft.u.h.ag;
                    }
                    b42 = this;
                    k3 = g.aC;
                }
                if (!bl2) {
                    if (b42 == k3) {
                        return net.minecraft.u.h.aL;
                    }
                    b42 = this;
                    k3 = g.au;
                }
                if (bl2) break block11;
                if (b42 == k3) {
                    return net.minecraft.u.h.aO;
                }
                b42 = this;
                if (bl2) break block12;
                k3 = g.u;
            }
            if (b42 == k3) {
                k2 = net.minecraft.u.h.J;
                return k2;
            }
            b42 = this;
        }
        k2 = net.minecraft.w.k.b(b42);
        return k2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int a(int var1_1, Random var2_2) {
        var3_3 = cL.e();
        v0 = var1_1;
        if (var3_3 == false) return v0;
        if (v0 > 0) {
            v1 = this;
            if (var3_3) {
                if (net.minecraft.w.k.b(v1) != this.a((i)this.i().f().iterator().next(), var2_2, var1_1)) {
                    v2 = var4_4 = var2_2.nextInt(var1_1 + 2) - 1;
                    if (var3_3 == false) return v2;
                    if (v2 < 0) {
                        var4_4 = 0;
                    }
                    v2 = this.a(var2_2) * (var4_4 + 1);
                    return v2;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = this;
        }
        v0 = v1.a(var2_2);
        return v0;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block4: {
            b4 b42;
            int n4;
            block14: {
                block7: {
                    K k2;
                    block12: {
                        boolean bl2;
                        block13: {
                            block10: {
                                block11: {
                                    block8: {
                                        block9: {
                                            block5: {
                                                block6: {
                                                    boolean bl3 = cL.b();
                                                    super.a(z2, n2, i2, f10, n3);
                                                    bl2 = bl3;
                                                    if (this.a(i2, z2.J, n3) == net.minecraft.w.k.b(this)) break block4;
                                                    n4 = 0;
                                                    b42 = this;
                                                    k2 = g.l;
                                                    if (bl2) break block5;
                                                    if (b42 != k2) break block6;
                                                    n4 = net.minecraft.k.h.a(z2.J, 0, 2);
                                                    if (!bl2) break block7;
                                                }
                                                b42 = this;
                                                k2 = g.cO;
                                            }
                                            if (bl2) break block8;
                                            if (b42 != k2) break block9;
                                            n4 = net.minecraft.k.h.a(z2.J, 3, 7);
                                            if (!bl2) break block7;
                                        }
                                        b42 = this;
                                        k2 = g.au;
                                    }
                                    if (bl2) break block10;
                                    if (b42 != k2) break block11;
                                    n4 = net.minecraft.k.h.a(z2.J, 3, 7);
                                    if (!bl2) break block7;
                                }
                                b42 = this;
                                k2 = g.aC;
                            }
                            if (bl2) break block12;
                            if (b42 != k2) break block13;
                            n4 = net.minecraft.k.h.a(z2.J, 2, 5);
                            if (!bl2) break block7;
                        }
                        b42 = this;
                        if (bl2) break block14;
                        k2 = g.u;
                    }
                    if (b42 == k2) {
                        n4 = net.minecraft.k.h.a(z2.J, 2, 5);
                    }
                }
                b42 = this;
            }
            b42.a(z2, n2, n4);
        }
    }

    public b4(net.minecraft.ac.a a10) {
        super(net.minecraft.ac.c.H, a10);
        this.a(net.minecraft.ad.a.r);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int g(i i2) {
        return this == g.aC ? bl.BLUE.a() : 0;
    }

    @Override
    public int a(Random random) {
        return this == g.aC ? 4 + random.nextInt(5) : 1;
    }
}

