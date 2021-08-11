/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public abstract class f
extends b {
    protected final /* synthetic */ i a;
    protected final /* synthetic */ i f;
    protected final /* synthetic */ int d;
    protected /* synthetic */ int e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(z z2, Random random, n n2, int n3) {
        boolean bl2 = net.minecraft.p.a.c();
        boolean bl3 = this.c(z2, n2, n3);
        if (bl2) {
            if (!bl3) return false;
            bl3 = this.a(n2, z2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(z z2, n n2, int n3) {
        int n4;
        block15: {
            block16: {
                int n5;
                block14: {
                    int n6 = 1;
                    boolean bl2 = net.minecraft.p.a.c();
                    n4 = n2.b();
                    if (!bl2) break block15;
                    if (n4 < 1) break block16;
                    n4 = n2.b() + n3 + 1;
                    if (!bl2) break block15;
                    if (n4 > 256) break block16;
                    int n7 = 0;
                    block0: while (true) {
                        int n8 = n7;
                        block1: while (n8 <= 1 + n3) {
                            int n9;
                            int n10;
                            block20: {
                                block19: {
                                    block17: {
                                        block18: {
                                            n10 = 2;
                                            n5 = n7;
                                            if (!bl2) break block14;
                                            if (!bl2) break block17;
                                            if (n5 != 0) break block18;
                                            n10 = 1;
                                            if (bl2) break block19;
                                        }
                                        n9 = n7;
                                    }
                                    if (!bl2) break block20;
                                    if (n9 >= 1 + n3 - 2) {
                                        n10 = 2;
                                    }
                                }
                                n9 = -n10;
                            }
                            int n11 = n9;
                            block2: while (true) {
                                int n12 = n11;
                                block3: while (n12 <= n10) {
                                    void var9_9;
                                    n8 = n6;
                                    if (!bl2) continue block1;
                                    if (bl2) {
                                        if (n8 == 0) break block2;
                                        int n13 = var9_9 = -n10;
                                    }
                                    while (var9_9 <= n10) {
                                        block23: {
                                            int n14;
                                            block21: {
                                                block22: {
                                                    n12 = n6;
                                                    if (!bl2) continue block3;
                                                    if (bl2) {
                                                        if (n12 == 0) break;
                                                        n14 = n2.b() + n7;
                                                    }
                                                    if (!bl2) break block21;
                                                    if (n14 < 0) break block22;
                                                    n14 = n2.b() + n7;
                                                    if (!bl2) break block21;
                                                    if (n14 >= 256) break block22;
                                                    n14 = this.a(z2.d(n2.a(n11, n7, (int)var9_9)).b()) ? 1 : 0;
                                                    if (!bl2) break block21;
                                                    if (n14 != 0) break block23;
                                                }
                                                n14 = 0;
                                            }
                                            n6 = n14;
                                        }
                                        ++var9_9;
                                        if (bl2) continue;
                                    }
                                    ++n11;
                                    if (bl2) continue block2;
                                }
                                break;
                            }
                            ++n7;
                            if (bl2) continue block0;
                        }
                        break;
                    }
                    n5 = n6;
                }
                return n5 != 0;
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    protected int a(Random random) {
        int n2 = random.nextInt(3) + this.d;
        boolean bl2 = net.minecraft.p.a.d();
        int n3 = this.e;
        if (!bl2) {
            if (n3 > 1) {
                n2 += random.nextInt(this.e);
            }
            n3 = n2;
        }
        return n3;
    }

    protected void a(z z2, n n2, int n3) {
        int n4 = n3 * n3;
        boolean bl2 = net.minecraft.p.a.c();
        int n5 = -n3;
        block0: while (true) {
            int n6 = n5;
            int n7 = n3 + 1;
            block1: while (n6 <= n7) {
                for (int i2 = -n3; i2 <= n3 + 1; ++i2) {
                    n n8;
                    block12: {
                        c c10;
                        c c11;
                        block11: {
                            c c12;
                            block8: {
                                int n9;
                                int n10;
                                block10: {
                                    int n11;
                                    block9: {
                                        int n12;
                                        block7: {
                                            n11 = n5 - 1;
                                            n12 = i2 - 1;
                                            n6 = n5 * n5 + i2 * i2;
                                            n7 = n4;
                                            if (!bl2) continue block1;
                                            if (!bl2) break block7;
                                            if (n6 <= n7) break block8;
                                            n10 = n11 * n11 + n12 * n12;
                                            n9 = n4;
                                        }
                                        if (!bl2) break block9;
                                        if (n10 <= n9) break block8;
                                        n10 = n5 * n5 + n12 * n12;
                                        n9 = n4;
                                    }
                                    if (!bl2) break block10;
                                    if (n10 <= n9) break block8;
                                    n10 = n11 * n11 + i2 * i2;
                                    n9 = n4;
                                }
                                if (n10 > n9) continue;
                            }
                            n8 = n2.a(n5, 0, i2);
                            c11 = c12 = z2.d(n8).o();
                            c10 = c.A;
                            if (!bl2) break block11;
                            if (c11 == c10) break block12;
                            c11 = c12;
                            c10 = c.J;
                        }
                        if (c11 != c10) continue;
                    }
                    this.a(z2, n8, this.f);
                    if (bl2) continue;
                }
                ++n5;
                if (bl2) continue block0;
            }
            break;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(n n2, z z2) {
        boolean bl2;
        n n3;
        block3: {
            K k2;
            K k3;
            block2: {
                K k4;
                n3 = n2.k();
                bl2 = net.minecraft.p.a.d();
                K k2 = k4 = z2.d(n3).b();
                k2 = g.aU;
                if (bl2) break block2;
                if (k3 == k2) break block3;
                K k2 = k4;
                k2 = g.bv;
            }
            if (k3 != k2) return 0 != 0;
        }
        int n4 = n2.b();
        if (bl2) return n4 != 0;
        if (n4 < 2) return 0 != 0;
        this.a(z2, n3);
        this.a(z2, n3.m());
        this.a(z2, n3.j());
        this.a(z2, n3.j().m());
        return true;
    }

    public f(boolean bl2, int n2, int n3, i i2, i i3) {
        super(bl2);
        this.d = n2;
        this.e = n3;
        this.a = i2;
        this.f = i3;
    }

    protected void b(z z2, n n2, int n3) {
        int n4 = n3 * n3;
        boolean bl2 = net.minecraft.p.a.c();
        int n5 = -n3;
        block0: while (true) {
            int n6 = n5;
            int n7 = n3;
            block1: while (n6 <= n7) {
                for (int i2 = -n3; i2 <= n3; ++i2) {
                    n n8;
                    block6: {
                        c c10;
                        c c11;
                        block5: {
                            c c12;
                            n6 = n5 * n5 + i2 * i2;
                            n7 = n4;
                            if (!bl2) continue block1;
                            if (n6 > n7) continue;
                            n8 = n2.a(n5, 0, i2);
                            c11 = c12 = z2.d(n8).o();
                            c10 = c.A;
                            if (!bl2) break block5;
                            if (c11 == c10) break block6;
                            c11 = c12;
                            c10 = c.J;
                        }
                        if (c11 != c10) continue;
                    }
                    this.a(z2, n8, this.f);
                    if (bl2) continue;
                }
                ++n5;
                if (bl2) continue block0;
            }
            break;
        }
    }
}

