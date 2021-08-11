/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.P.r;
import net.minecraft.T.a_;
import net.minecraft.W.bi;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.b;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public abstract class Y
extends u {
    protected static final /* synthetic */ i j;
    protected static final /* synthetic */ int o;
    protected static final /* synthetic */ i k;
    protected static final /* synthetic */ i n;
    protected static final /* synthetic */ i l;
    protected static final /* synthetic */ int i;
    protected static final /* synthetic */ i m;
    protected /* synthetic */ s p;
    protected static final /* synthetic */ int h;
    protected static final /* synthetic */ i q;
    protected static final /* synthetic */ int g;

    static {
        l = net.minecraft.u.g.cz.c(bi.B);
        n = net.minecraft.u.g.cz.c(bi.z);
        k = net.minecraft.u.g.cz.c(bi.C);
        q = n;
        m = net.minecraft.u.g.af.d();
        j = net.minecraft.u.g.bQ.d();
        o = Y.a(2, 0, 0);
        g = Y.a(2, 2, 0);
        h = Y.a(0, 1, 0);
        i = Y.a(4, 1, 0);
    }

    protected static final int a(int n2, int n3, int n4) {
        return n3 * 25 + n4 * 5 + n2;
    }

    public Y(aA aA2, b b10) {
        super(1);
        this.a(aA2);
        this.e = b10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected void a(z z2, b b10, int n2, int n3, boolean bl2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = u.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.a(z2, b10, n2 + 0, 0, n3 + 0, n2 + 2, 0, n3 + 8 - 1, l, l, false);
                    this.a(z2, b10, n2 + 5, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, l, l, false);
                    this.a(z2, b10, n2 + 3, 0, n3 + 0, n2 + 4, 0, n3 + 2, l, l, false);
                    this.a(z2, b10, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 8 - 1, l, l, false);
                    this.a(z2, b10, n2 + 3, 0, n3 + 2, n2 + 4, 0, n3 + 2, n, n, false);
                    this.a(z2, b10, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 5, n, n, false);
                    this.a(z2, b10, n2 + 2, 0, n3 + 3, n2 + 2, 0, n3 + 4, n, n, false);
                    this.a(z2, b10, n2 + 5, 0, n3 + 3, n2 + 5, 0, n3 + 4, n, n, false);
                }
                if (arrstring != null) break block2;
            }
            this.a(z2, b10, n2 + 0, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, l, l, false);
        }
    }

    public Y(int n2) {
        super(n2);
    }

    protected boolean a(b b10, int n2, int n3, int n4, int n5) {
        int n6 = this.b(n2, n3);
        int n7 = this.a(n2, n3);
        int n8 = this.b(n4, n5);
        int n9 = this.a(n4, n5);
        return b10.a(Math.min(n6, n8), Math.min(n7, n9), Math.max(n6, n8), Math.max(n7, n9));
    }

    protected boolean a(z z2, b b10, int n2, int n3, int n4) {
        int n5 = this.b(n2, n4);
        String[] arrstring = u.b();
        int n6 = this.a(n3);
        int n7 = this.a(n2, n4);
        boolean bl2 = b10.a(new n(n5, n6, n7));
        if (arrstring != null) {
            if (bl2) {
                a_ a_2 = new a_(z2);
                a_2.i(a_2.H());
                a_2.c((double)n5 + 0.5, n6, (double)n7 + 0.5, 0.0f, 0.0f);
                a_2.a(z2.h(new n(a_2)), null);
                z2.f(a_2);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    protected void a(r r2) {
    }

    protected void a(z z2, b b10, int n2, int n3, int n4, int n5, int n6, int n7, i i2) {
        int n8 = n3;
        String[] arrstring = u.b();
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 <= n6) {
                int n10 = n2;
                while (n10 <= n5) {
                    block6: {
                        n9 = n4;
                        if (arrstring == null) continue block1;
                        for (int i3 = v479400; i3 <= n7; ++i3) {
                            if (arrstring != null) {
                                Y y2 = this;
                                z z3 = z2;
                                if (arrstring != null) {
                                    if (y2.b(z3, n10, n8, i3, b10) != j) continue;
                                    y2 = this;
                                    z3 = z2;
                                }
                                y2.a(z3, i2, n10, n8, i3, b10);
                                if (arrstring != null) continue;
                            }
                            break block6;
                        }
                        ++n10;
                    }
                    if (arrstring != null) continue;
                }
                ++n8;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }

    @Override
    protected void a(r r2, j j2) {
    }

    protected Y(int n2, aA aA2, s s2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        String[] arrstring;
        block9: {
            block8: {
                aA aA3;
                aA aA4;
                block7: {
                    super(n2);
                    String[] arrstring2 = u.b();
                    this.a(aA2);
                    this.p = s2;
                    arrstring = arrstring2;
                    int n9 = s2.d;
                    n8 = n9 % 5;
                    n7 = n9 / 5 % 5;
                    n6 = n9 / 25;
                    aA4 = aA2;
                    aA3 = aA.NORTH;
                    if (arrstring == null) break block7;
                    if (aA4 == aA3) break block8;
                    aA4 = aA2;
                    aA3 = aA.SOUTH;
                }
                if (aA4 == aA3) break block8;
                this.e = new b(0, 0, 0, n5 * 8 - 1, n4 * 4 - 1, n3 * 8 - 1);
                if (arrstring != null) break block9;
            }
            this.e = new b(0, 0, 0, n3 * 8 - 1, n4 * 4 - 1, n5 * 8 - 1);
        }
        switch (aA2) {
            case NORTH: {
                this.e.a(n8 * 8, n6 * 4, -(n7 + n5) * 8 + 1);
                if (arrstring != null) break;
            }
            case SOUTH: {
                this.e.a(n8 * 8, n6 * 4, n7 * 8);
                if (arrstring != null) break;
            }
            case WEST: {
                this.e.a(-(n7 + n5) * 8 + 1, n6 * 4, n8 * 8);
                if (arrstring != null) break;
            }
            default: {
                this.e.a(n7 * 8, n6 * 4, n8 * 8);
                break;
            }
        }
    }

    protected void a(z z2, b b10, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        int n8 = n3;
        String[] arrstring = u.b();
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 <= n6) {
                int n10 = n2;
                block2: while (true) {
                    int n11 = n10;
                    block3: while (n11 <= n5) {
                        n9 = n4;
                        if (arrstring == null) continue block1;
                        for (int i2 = v479574; i2 <= n7; ++i2) {
                            Y y2;
                            block14: {
                                int n12;
                                block13: {
                                    n11 = bl2 ? 1 : 0;
                                    if (arrstring == null) continue block3;
                                    if (arrstring == null) break block13;
                                    if (n11 != 0) {
                                        y2 = this;
                                        if (arrstring != null) {
                                            if (y2.b(z2, n10, n8, i2, b10).o() == net.minecraft.ac.c.A) continue;
                                        }
                                    } else {
                                        y2 = this;
                                    }
                                    if (arrstring == null) break block14;
                                    n12 = y2.a(n8);
                                }
                                if (n12 >= z2.y()) {
                                    this.a(z2, net.minecraft.u.g.bf.d(), n10, n8, i2, b10);
                                    if (arrstring != null) continue;
                                }
                                y2 = this;
                            }
                            y2.a(z2, j, n10, n8, i2, b10);
                            if (arrstring != null) continue;
                        }
                        ++n10;
                        if (arrstring != null) continue block2;
                    }
                    break;
                }
                ++n8;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }

    public Y() {
        super(0);
    }
}

