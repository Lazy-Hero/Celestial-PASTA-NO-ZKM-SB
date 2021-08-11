/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.W.cG;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.a2;
import net.minecraft.ao.a4;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class aq
extends a2 {
    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block17: {
            int n3;
            int n4;
            i i2;
            String[] arrstring;
            block15: {
                z z3;
                aq aq2;
                int n5;
                block19: {
                    block20: {
                        arrstring = u.b();
                        aq aq3 = this;
                        if (arrstring != null) {
                            if (aq3.i < 0) {
                                this.i = this.a(z2, b10);
                                aq aq4 = this;
                                if (arrstring != null) {
                                    if (aq4.i < 0) {
                                        return true;
                                    }
                                    aq4 = this;
                                }
                                aq4.e.a(0, this.i - this.e.b + 7 - 1, 0);
                            }
                            aq3 = this;
                        }
                        i2 = aq3.a(g.cW.d());
                        i i3 = this.a(g.aX.d().a(cG.V, aA.NORTH));
                        i i4 = this.a(g.aX.d().a(cG.V, aA.SOUTH));
                        i i5 = this.a(g.aX.d().a(cG.V, aA.WEST));
                        i i6 = this.a(g.cB.d());
                        i i7 = this.a(g.bu.d());
                        i i8 = this.a(g.bt.d());
                        this.a(z2, b10, 1, 1, 1, 7, 4, 4, g.bf.d(), g.bf.d(), false);
                        this.a(z2, b10, 2, 1, 6, 8, 4, 10, g.bf.d(), g.bf.d(), false);
                        this.a(z2, b10, 2, 0, 6, 8, 0, 10, g.bv.d(), g.bv.d(), false);
                        this.a(z2, i2, 6, 0, 6, b10);
                        this.a(z2, b10, 2, 1, 6, 2, 1, 10, i8, i8, false);
                        this.a(z2, b10, 8, 1, 6, 8, 1, 10, i8, i8, false);
                        this.a(z2, b10, 3, 1, 10, 7, 1, 10, i8, i8, false);
                        this.a(z2, b10, 1, 0, 1, 7, 0, 4, i6, i6, false);
                        this.a(z2, b10, 0, 0, 0, 0, 3, 5, i2, i2, false);
                        this.a(z2, b10, 8, 0, 0, 8, 3, 5, i2, i2, false);
                        this.a(z2, b10, 1, 0, 0, 7, 1, 0, i2, i2, false);
                        this.a(z2, b10, 1, 0, 5, 7, 1, 5, i2, i2, false);
                        this.a(z2, b10, 1, 2, 0, 7, 3, 0, i6, i6, false);
                        this.a(z2, b10, 1, 2, 5, 7, 3, 5, i6, i6, false);
                        this.a(z2, b10, 0, 4, 1, 8, 4, 1, i6, i6, false);
                        this.a(z2, b10, 0, 4, 4, 8, 4, 4, i6, i6, false);
                        this.a(z2, b10, 0, 5, 2, 8, 5, 3, i6, i6, false);
                        this.a(z2, i6, 0, 4, 2, b10);
                        this.a(z2, i6, 0, 4, 3, b10);
                        this.a(z2, i6, 8, 4, 2, b10);
                        this.a(z2, i6, 8, 4, 3, b10);
                        i i9 = i3;
                        i i10 = i4;
                        n4 = -1;
                        while (n4 <= 2) {
                            block16: {
                                n5 = 0;
                                if (arrstring == null) break block15;
                                for (n3 = v232247; n3 <= 8; ++n3) {
                                    this.a(z2, i9, n3, 4 + n4, n4, b10);
                                    this.a(z2, i10, n3, 4 + n4, 5 - n4, b10);
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block16;
                                }
                                ++n4;
                            }
                            if (arrstring != null) continue;
                        }
                        this.a(z2, i7, 0, 2, 1, b10);
                        this.a(z2, i7, 0, 2, 4, b10);
                        this.a(z2, i7, 8, 2, 1, b10);
                        this.a(z2, i7, 8, 2, 4, b10);
                        this.a(z2, g.a6.d(), 0, 2, 2, b10);
                        this.a(z2, g.a6.d(), 0, 2, 3, b10);
                        this.a(z2, g.a6.d(), 8, 2, 2, b10);
                        this.a(z2, g.a6.d(), 8, 2, 3, b10);
                        this.a(z2, g.a6.d(), 2, 2, 5, b10);
                        this.a(z2, g.a6.d(), 3, 2, 5, b10);
                        this.a(z2, g.a6.d(), 5, 2, 0, b10);
                        this.a(z2, g.a6.d(), 6, 2, 5, b10);
                        this.a(z2, i8, 2, 1, 3, b10);
                        this.a(z2, g.bc.d(), 2, 2, 3, b10);
                        this.a(z2, i6, 1, 1, 4, b10);
                        this.a(z2, i9, 2, 1, 4, b10);
                        this.a(z2, i5, 1, 1, 3, b10);
                        this.a(z2, b10, 5, 0, 1, 7, 0, 3, g.H.d(), g.H.d(), false);
                        this.a(z2, g.H.d(), 6, 1, 1, b10);
                        this.a(z2, g.H.d(), 6, 1, 2, b10);
                        this.a(z2, g.bf.d(), 2, 1, 0, b10);
                        this.a(z2, g.bf.d(), 2, 2, 0, b10);
                        this.a(z2, aA.NORTH, 2, 3, 1, b10);
                        this.a(z2, b10, random, 2, 1, 0, aA.NORTH);
                        aq2 = this;
                        z3 = z2;
                        if (arrstring == null) break block19;
                        if (aq2.b(z3, 2, 0, -1, b10).o() != net.minecraft.ac.c.A) break block20;
                        aq2 = this;
                        z3 = z2;
                        if (arrstring == null) break block19;
                        if (aq2.b(z3, 2, -1, -1, b10).o() == net.minecraft.ac.c.A) break block20;
                        this.a(z2, i9, 2, 0, -1, b10);
                        aq2 = this;
                        z3 = z2;
                        if (arrstring == null) break block19;
                        if (aq2.b(z3, 2, -1, -1, b10).b() == g.ci) {
                            this.a(z2, g.aU.d(), 2, -1, -1, b10);
                        }
                    }
                    this.a(z2, g.bf.d(), 6, 1, 5, b10);
                    this.a(z2, g.bf.d(), 6, 2, 5, b10);
                    this.a(z2, aA.SOUTH, 6, 3, 4, b10);
                    aq2 = this;
                    z3 = z2;
                }
                aq2.a(z3, b10, random, 6, 1, 5, aA.SOUTH);
                n5 = n4 = 0;
            }
            while (n4 < 5) {
                block18: {
                    n2 = 0;
                    if (arrstring == null) break block17;
                    for (n3 = v232277; n3 < 9; ++n3) {
                        this.a(z2, n3, 7, n4, b10);
                        this.b(z2, i2, n3, -1, n4, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block18;
                    }
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 4, 1, 2, 2);
            n2 = 1;
        }
        return n2 != 0;
    }

    public aq() {
    }

    public static aq a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 9, 7, 11, aA2);
        return aq.a(b10) && u.a(list, b10) == null ? new aq(a42, n5, random, b10, aA2) : null;
    }

    @Override
    protected int c(int n2, int n3) {
        String[] arrstring = u.b();
        int n4 = n2;
        if (arrstring != null) {
            n4 = n4 == 0 ? 4 : super.c(n2, n3);
        }
        return n4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aq(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
    }
}

