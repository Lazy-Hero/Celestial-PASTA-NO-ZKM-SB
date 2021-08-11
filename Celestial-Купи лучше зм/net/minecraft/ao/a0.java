/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.cG;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.a2;
import net.minecraft.ao.a4;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class a0
extends a2 {
    private /* synthetic */ boolean k;

    public a0(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
    }

    public a0() {
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Chest", this.k);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.f("Chest");
    }

    @Override
    protected int c(int n2, int n3) {
        return 3;
    }

    public static a0 a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 10, 6, 7, aA2);
        return a0.a(b10) && u.a(list, b10) == null ? new a0(a42, n5, random, b10, aA2) : null;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block20: {
            z z3;
            a0 a02;
            block19: {
                int n3;
                i i2;
                i i3;
                String[] arrstring;
                block25: {
                    int n4;
                    block26: {
                        block23: {
                            a0 a03;
                            block24: {
                                int n5;
                                block22: {
                                    arrstring = u.b();
                                    n5 = this.i;
                                    if (arrstring == null) break block22;
                                    if (n5 >= 0) break block23;
                                    this.i = this.a(z2, b10);
                                    a03 = this;
                                    if (arrstring == null) break block24;
                                    n5 = a03.i;
                                }
                                if (n5 < 0) {
                                    return true;
                                }
                                a03 = this;
                            }
                            a03.e.a(0, this.i - this.e.b + 6 - 1, 0);
                        }
                        i3 = g.cW.d();
                        i i4 = this.a(g.aX.d().a(cG.V, aA.NORTH));
                        i i5 = this.a(g.aX.d().a(cG.V, aA.WEST));
                        i i6 = this.a(g.cB.d());
                        i2 = this.a(g.a0.d().a(cG.V, aA.NORTH));
                        i i7 = this.a(g.bu.d());
                        i i8 = this.a(g.bt.d());
                        this.a(z2, b10, 0, 1, 0, 9, 4, 6, g.bf.d(), g.bf.d(), false);
                        this.a(z2, b10, 0, 0, 0, 9, 0, 6, i3, i3, false);
                        this.a(z2, b10, 0, 4, 0, 9, 4, 6, i3, i3, false);
                        this.a(z2, b10, 0, 5, 0, 9, 5, 6, g.bO.d(), g.bO.d(), false);
                        this.a(z2, b10, 1, 5, 1, 8, 5, 5, g.bf.d(), g.bf.d(), false);
                        this.a(z2, b10, 1, 1, 0, 2, 3, 0, i6, i6, false);
                        this.a(z2, b10, 0, 1, 0, 0, 4, 0, i7, i7, false);
                        this.a(z2, b10, 3, 1, 0, 3, 4, 0, i7, i7, false);
                        this.a(z2, b10, 0, 1, 6, 0, 4, 6, i7, i7, false);
                        this.a(z2, i6, 3, 3, 1, b10);
                        this.a(z2, b10, 3, 1, 2, 3, 3, 2, i6, i6, false);
                        this.a(z2, b10, 4, 1, 3, 5, 3, 3, i6, i6, false);
                        this.a(z2, b10, 0, 1, 1, 0, 3, 5, i6, i6, false);
                        this.a(z2, b10, 1, 1, 6, 5, 3, 6, i6, i6, false);
                        this.a(z2, b10, 5, 1, 0, 5, 3, 0, i8, i8, false);
                        this.a(z2, b10, 9, 1, 0, 9, 3, 0, i8, i8, false);
                        this.a(z2, b10, 6, 1, 4, 9, 4, 6, i3, i3, false);
                        this.a(z2, g.ag.d(), 7, 1, 5, b10);
                        this.a(z2, g.ag.d(), 8, 1, 5, b10);
                        this.a(z2, g.dd.d(), 9, 2, 5, b10);
                        this.a(z2, g.dd.d(), 9, 2, 4, b10);
                        this.a(z2, b10, 7, 2, 4, 8, 2, 5, g.bf.d(), g.bf.d(), false);
                        this.a(z2, i3, 6, 1, 3, b10);
                        this.a(z2, g.bJ.d(), 6, 2, 3, b10);
                        this.a(z2, g.bJ.d(), 6, 3, 3, b10);
                        this.a(z2, g.H.d(), 8, 1, 1, b10);
                        this.a(z2, g.a6.d(), 0, 2, 2, b10);
                        this.a(z2, g.a6.d(), 0, 2, 4, b10);
                        this.a(z2, g.a6.d(), 2, 2, 6, b10);
                        this.a(z2, g.a6.d(), 4, 2, 6, b10);
                        this.a(z2, i8, 2, 1, 4, b10);
                        this.a(z2, g.bc.d(), 2, 2, 4, b10);
                        this.a(z2, i6, 1, 1, 5, b10);
                        this.a(z2, i4, 2, 1, 5, b10);
                        this.a(z2, i5, 1, 1, 4, b10);
                        n4 = this.k;
                        if (arrstring == null) break block25;
                        if (n4 != 0) break block26;
                        n4 = b10.a(new n(this.b(5, 5), this.a(1), this.a(5, 5))) ? 1 : 0;
                        if (arrstring == null) break block25;
                        if (n4 != 0) {
                            this.k = true;
                            this.a(z2, b10, random, 5, 1, 5, net.minecraft.aj.j.G);
                        }
                    }
                    n4 = n3 = 6;
                }
                while (n3 <= 8) {
                    block30: {
                        block28: {
                            i i9;
                            block29: {
                                c c10;
                                c c11;
                                block27: {
                                    a02 = this;
                                    z3 = z2;
                                    if (arrstring == null) break block19;
                                    c11 = a02.b(z3, n3, 0, -1, b10).o();
                                    c10 = net.minecraft.ac.c.A;
                                    if (arrstring == null) break block27;
                                    if (c11 != c10) break block28;
                                    i9 = this.b(z2, n3, -1, -1, b10);
                                    if (arrstring == null) break block29;
                                    c11 = i9.o();
                                    c10 = net.minecraft.ac.c.A;
                                }
                                if (c11 == c10) break block28;
                                this.a(z2, i2, n3, 0, -1, b10);
                                if (arrstring == null) break block30;
                                i9 = this.b(z2, n3, -1, -1, b10);
                            }
                            if (i9.b() == g.ci) {
                                this.a(z2, g.aU.d(), n3, -1, -1, b10);
                            }
                        }
                        ++n3;
                    }
                    if (arrstring != null) continue;
                }
                n3 = 0;
                while (n3 < 7) {
                    block21: {
                        n2 = 0;
                        if (arrstring == null) break block20;
                        for (int i10 = v177394; i10 < 10; ++i10) {
                            this.a(z2, i10, 6, n3, b10);
                            this.b(z2, i3, i10, -1, n3, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block21;
                        }
                        ++n3;
                    }
                    if (arrstring != null) continue;
                }
                a02 = this;
                z3 = z2;
            }
            a02.a(z3, b10, 7, 1, 1, 1);
            n2 = 1;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

