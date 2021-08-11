/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.V;
import net.minecraft.W.cL;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class c4 {
    private final /* synthetic */ z h;
    private /* synthetic */ int e;
    private final /* synthetic */ aA b;
    private final /* synthetic */ Q g;
    private /* synthetic */ int c;
    private /* synthetic */ n a;
    private /* synthetic */ int d;
    private final /* synthetic */ aA f;

    static int a(c4 c42) {
        return c42.c;
    }

    static n e(c4 c42) {
        return c42.a;
    }

    static aA d(c4 c42) {
        return c42.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        boolean bl2 = cL.e();
        c4 c42 = this;
        if (bl2) {
            if (c42.a == null) return 0 != 0;
            c42 = this;
        }
        int n2 = c42.d;
        int n3 = 2;
        if (bl2) {
            if (n2 < n3) return 0 != 0;
            n2 = this.d;
            n3 = 21;
        }
        if (bl2) {
            if (n2 > n3) return 0 != 0;
            n2 = this.e;
            n3 = 3;
        }
        if (bl2) {
            if (n2 < n3) return 0 != 0;
            n2 = this.e;
            if (!bl2) return n2 != 0;
            n3 = 21;
        }
        if (n2 > n3) return 0 != 0;
        return 1 != 0;
    }

    public void c() {
        int n2 = 0;
        boolean bl2 = cL.b();
        while (n2 < this.d) {
            block3: {
                n n3 = this.a.a(this.f, n2);
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.h.a(n3.c(i2), net.minecraft.u.g.aN.d().a(V.C, this.g), 2);
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (!bl2) continue;
        }
    }

    static int b(c4 c42) {
        return c42.e;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int e() {
        return this.d;
    }

    public c4(z z2, n n2, Q q2) {
        block28: {
            block27: {
                c4 c42;
                boolean bl2;
                block26: {
                    block23: {
                        block24: {
                            c4 c43;
                            block25: {
                                int n3;
                                block22: {
                                    int n4;
                                    int n5;
                                    block18: {
                                        block21: {
                                            block19: {
                                                block20: {
                                                    boolean bl3 = cL.e();
                                                    bl2 = bl3;
                                                    this.h = z2;
                                                    this.g = q2;
                                                    if (!bl2) break block19;
                                                    if (q2 != Q.X) break block20;
                                                    this.b = aA.EAST;
                                                    this.f = aA.WEST;
                                                    if (bl2) break block21;
                                                }
                                                this.b = aA.NORTH;
                                            }
                                            this.f = aA.SOUTH;
                                        }
                                        n n6 = n2;
                                        while (n2.b() > n6.b() - 21) {
                                            n5 = n2.b();
                                            if (bl2 && bl2) {
                                                if (n5 <= 0) break;
                                                n5 = this.a(z2.d(n2.k()).b()) ? 1 : 0;
                                                if (bl2) {
                                                    if (n5 == 0) break;
                                                    n2 = n2.k();
                                                    if (bl2) continue;
                                                }
                                            }
                                            break block18;
                                        }
                                        n5 = this.a(n2, this.b) - 1;
                                    }
                                    n3 = n4 = n5;
                                    if (!bl2) break block22;
                                    if (n3 < 0) break block23;
                                    this.a = n2.a(this.b, n4);
                                    this.d = this.a(this.a, this.f);
                                    c43 = this;
                                    if (!bl2) break block24;
                                    n3 = c43.d;
                                }
                                if (n3 < 2) break block25;
                                c42 = this;
                                if (!bl2) break block26;
                                if (c42.d <= 21) break block23;
                            }
                            this.a = null;
                            c43 = this;
                        }
                        c43.d = 0;
                    }
                    c42 = this;
                }
                if (!bl2) break block27;
                if (c42.a == null) break block28;
                c42 = this;
            }
            c42.e = this.d();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected int d() {
        block16: {
            block15: {
                this.e = 0;
                var1_1 = cL.b();
                block0: while (true) {
                    v0 = this.e;
                    block1: while (v0 < 21) {
                        v1 = 0;
                        if (var1_1) break block15;
                        var2_2 = v1;
                        while (var2_2 < this.d) {
                            block19: {
                                block17: {
                                    block18: {
                                        var3_3 = this.a.a(this.f, var2_2).c(this.e);
                                        var4_4 = this.h.d(var3_3).b();
                                        v0 = this.a(var4_4) ? 1 : 0;
                                        if (var1_1) continue block1;
                                        if (v0 == 0 && !var1_1) break block0;
                                        if (var4_4 == net.minecraft.u.g.aN) {
                                            ++this.c;
                                        }
                                        v2 = var2_2;
                                        if (var1_1) break block17;
                                        if (v2 != 0) break block18;
                                        var4_4 = this.h.d(var3_3.a(this.b)).b();
                                        if (var1_1) break block19;
                                        if (var4_4 != net.minecraft.u.g.bP) {
                                            if (!var1_1) break block0;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    v2 = var2_2;
                                }
                                if (v2 == this.d - 1) {
                                    var4_4 = this.h.d(var3_3.a(this.f)).b();
                                    if (!var1_1) {
                                        if (var4_4 != net.minecraft.u.g.bP && !var1_1) break block0;
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    ++var2_2;
                                }
                            }
                            if (!var1_1) continue;
                        }
                        ++this.e;
                        if (!var1_1) continue block0;
                    }
                    break;
                }
                v1 = var2_2 = 0;
            }
            while (var2_2 < this.d) {
                block21: {
                    block20: {
                        v3 = this;
                        if (var1_1) break block16;
                        if (var1_1) break block20;
                        if (v3.h.d(this.a.a(this.f, var2_2).c(this.e)).b() == net.minecraft.u.g.bP) break block21;
                        v4 = this;
                    }
                    v4.e = 0;
                    if (!var1_1) break;
                }
                ++var2_2;
                if (!var1_1) continue;
            }
            v3 = this;
        }
        v5 = v3.e;
        if (var1_1 != false) return v5;
        if (v5 <= 21) {
            v5 = this.e;
            if (var1_1 != false) return v5;
            if (v5 >= 3) {
                return this.e;
            }
        }
        this.a = null;
        this.d = 0;
        this.e = 0;
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(K k2) {
        boolean bl2 = cL.e();
        K k3 = k2;
        if (bl2) {
            if (k3.y == net.minecraft.ac.c.A) return true;
            k3 = k2;
        }
        if (bl2) {
            if (k3 == net.minecraft.u.g.C) return true;
            k3 = k2;
        }
        if (k3 != net.minecraft.u.g.aN) return false;
        return true;
    }

    protected int a(n n2, aA aA2) {
        c4 c42;
        Object object;
        int n3;
        block2: {
            boolean bl2 = cL.b();
            for (n3 = 0; n3 < 22; ++n3) {
                object = n2.a(aA2, n3);
                c42 = this;
                if (!bl2 && !bl2) {
                    if (!c42.a(this.h.d((n)object).b()) || this.h.d(((n)object).k()).b() != net.minecraft.u.g.bP && !bl2) break;
                    if (!bl2) continue;
                }
                break block2;
            }
            c42 = this;
        }
        return (object = c42.h.d(n2.a(aA2, n3)).b()) == net.minecraft.u.g.bP ? n3 : 0;
    }

    static int c(c4 c42) {
        return c42.d;
    }

    public int a() {
        return this.e;
    }
}

