/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.w;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.u.g;
import net.minecraft.w.a3;
import net.minecraft.w.a8;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class ab
extends a3 {
    private static final /* synthetic */ Set<K> x;

    @Override
    public boolean a(i i2) {
        int n2;
        block18: {
            block21: {
                block24: {
                    block27: {
                        block30: {
                            block33: {
                                K k2;
                                K k3;
                                block32: {
                                    K k4;
                                    block31: {
                                        block29: {
                                            block28: {
                                                block26: {
                                                    block25: {
                                                        block23: {
                                                            block22: {
                                                                block20: {
                                                                    block19: {
                                                                        block17: {
                                                                            k4 = i2.b();
                                                                            n2 = bl.c();
                                                                            K k2 = k4;
                                                                            k2 = g.bP;
                                                                            if (n2 == 0) {
                                                                                if (k3 == k2) {
                                                                                    int n3 = this.t.b();
                                                                                    if (n2 == 0) {
                                                                                        n3 = n3 == 3 ? 1 : 0;
                                                                                    }
                                                                                    return n3 != 0;
                                                                                }
                                                                                K k2 = k4;
                                                                                k2 = g.bF;
                                                                            }
                                                                            if (n2 != 0) break block17;
                                                                            if (k3 == k2) break block18;
                                                                            K k2 = k4;
                                                                            k2 = g.cO;
                                                                        }
                                                                        if (n2 != 0) break block19;
                                                                        if (k3 == k2) break block18;
                                                                        K k2 = k4;
                                                                        k2 = g.au;
                                                                    }
                                                                    if (n2 != 0) break block20;
                                                                    if (k3 == k2) break block21;
                                                                    K k2 = k4;
                                                                    k2 = g.cs;
                                                                }
                                                                if (n2 != 0) break block22;
                                                                if (k3 == k2) break block21;
                                                                K k2 = k4;
                                                                k2 = g.a7;
                                                            }
                                                            if (n2 != 0) break block23;
                                                            if (k3 == k2) break block24;
                                                            K k2 = k4;
                                                            k2 = g.aK;
                                                        }
                                                        if (n2 != 0) break block25;
                                                        if (k3 == k2) break block24;
                                                        K k2 = k4;
                                                        k2 = g.E;
                                                    }
                                                    if (n2 != 0) break block26;
                                                    if (k3 == k2) break block27;
                                                    K k2 = k4;
                                                    k2 = g.ak;
                                                }
                                                if (n2 != 0) break block28;
                                                if (k3 == k2) break block27;
                                                K k2 = k4;
                                                k2 = g.av;
                                            }
                                            if (n2 != 0) break block29;
                                            if (k3 == k2) break block30;
                                            K k2 = k4;
                                            k2 = g.aC;
                                        }
                                        if (n2 != 0) break block31;
                                        if (k3 == k2) break block30;
                                        K k2 = k4;
                                        k2 = g.cu;
                                    }
                                    if (n2 != 0) break block32;
                                    if (k3 == k2) break block33;
                                    K k2 = k4;
                                    k2 = g.cy;
                                }
                                if (k3 != k2) {
                                    c c10;
                                    c c12 = c10 = i2.o();
                                    c12 = c.H;
                                    if (n2 == 0) {
                                        if (c11 == c12) {
                                            return true;
                                        }
                                        c c12 = c10;
                                        c12 = c.D;
                                    }
                                    if (n2 == 0) {
                                        if (c11 == c12) {
                                            return true;
                                        }
                                        c c12 = c10;
                                        c12 = c.r;
                                    }
                                    return c11 == c12;
                                }
                            }
                            boolean bl2 = this.t.b();
                            if (n2 == 0) {
                                bl2 = bl2 >= BADBOOL 2;
                            }
                            return bl2;
                        }
                        boolean bl3 = this.t.b();
                        if (n2 == 0) {
                            bl3 = bl3 >= true;
                        }
                        return bl3;
                    }
                    boolean bl4 = this.t.b();
                    if (n2 == 0) {
                        bl4 = bl4 >= true;
                    }
                    return bl4;
                }
                boolean bl5 = this.t.b();
                if (n2 == 0) {
                    bl5 = bl5 >= BADBOOL 2;
                }
                return bl5;
            }
            boolean bl6 = this.t.b();
            if (n2 == 0) {
                bl6 = bl6 >= BADBOOL 2;
            }
            return bl6;
        }
        boolean bl7 = this.t.b();
        if (n2 == 0) {
            bl7 = bl7 >= BADBOOL 2;
        }
        return bl7;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public float a(d d10, i i2) {
        float f10;
        block5: {
            c c10;
            c c11;
            block6: {
                int n2;
                c c12;
                block4: {
                    c12 = i2.o();
                    n2 = bl.g();
                    c11 = c12;
                    c10 = c.D;
                    if (n2 == 0) break block4;
                    if (c11 == c10) break block5;
                    c11 = c12;
                    c10 = c.r;
                }
                if (n2 == 0) break block6;
                if (c11 == c10) break block5;
                c11 = c12;
                c10 = c.H;
            }
            if (c11 != c10) {
                f10 = super.a(d10, i2);
                return f10;
            }
        }
        f10 = this.v;
        return f10;
    }

    protected ab(a8 a82) {
        super(1.0f, -2.8f, a82, x);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        x = Sets.newHashSet((Object[])new K[]{g.az, g.l, g.cW, g.aY, g.bF, g.cO, g.H, g.w, g.a7, g.aK, g.cF, g.E, g.ak, g.av, g.aC, g.cy, g.x, g.j, g.cq, g.bM, g.cu, g.bC, g.aQ, g.bx, g.bO, g.aI, g.dl});
    }
}

