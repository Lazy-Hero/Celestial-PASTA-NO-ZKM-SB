/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.W.bk;
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

public class aW
extends a2 {
    public aW(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
    }

    public aW() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static aW a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 5, 12, 9, aA2);
        return aW.a(b10) && u.a(list, b10) == null ? new aW(a42, n5, random, b10, aA2) : null;
    }

    @Override
    protected int c(int n2, int n3) {
        return 2;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block15: {
            int n3;
            i i2;
            String[] arrstring;
            block21: {
                z z3;
                aW aW2;
                block23: {
                    i i3;
                    block22: {
                        c c10;
                        c c11;
                        i i4;
                        block20: {
                            block14: {
                                block18: {
                                    aW aW3;
                                    block19: {
                                        int n4;
                                        block17: {
                                            arrstring = u.b();
                                            n4 = this.i;
                                            if (arrstring == null) break block17;
                                            if (n4 >= 0) break block18;
                                            this.i = this.a(z2, b10);
                                            aW3 = this;
                                            if (arrstring == null) break block19;
                                            n4 = aW3.i;
                                        }
                                        if (n4 < 0) {
                                            return true;
                                        }
                                        aW3 = this;
                                    }
                                    aW3.e.a(0, this.i - this.e.b + 12 - 1, 0);
                                }
                                i2 = g.cW.d();
                                i4 = this.a(g.a0.d().a(cG.V, aA.NORTH));
                                i i5 = this.a(g.a0.d().a(cG.V, aA.WEST));
                                i i6 = this.a(g.a0.d().a(cG.V, aA.EAST));
                                this.a(z2, b10, 1, 1, 1, 3, 3, 7, g.bf.d(), g.bf.d(), false);
                                this.a(z2, b10, 1, 5, 1, 3, 9, 3, g.bf.d(), g.bf.d(), false);
                                this.a(z2, b10, 1, 0, 0, 3, 0, 8, i2, i2, false);
                                this.a(z2, b10, 1, 1, 0, 3, 10, 0, i2, i2, false);
                                this.a(z2, b10, 0, 1, 1, 0, 10, 3, i2, i2, false);
                                this.a(z2, b10, 4, 1, 1, 4, 10, 3, i2, i2, false);
                                this.a(z2, b10, 0, 0, 4, 0, 4, 7, i2, i2, false);
                                this.a(z2, b10, 4, 0, 4, 4, 4, 7, i2, i2, false);
                                this.a(z2, b10, 1, 1, 8, 3, 4, 8, i2, i2, false);
                                this.a(z2, b10, 1, 5, 4, 3, 10, 4, i2, i2, false);
                                this.a(z2, b10, 1, 5, 5, 3, 5, 7, i2, i2, false);
                                this.a(z2, b10, 0, 9, 0, 4, 9, 4, i2, i2, false);
                                this.a(z2, b10, 0, 4, 0, 4, 4, 4, i2, i2, false);
                                this.a(z2, i2, 0, 11, 2, b10);
                                this.a(z2, i2, 4, 11, 2, b10);
                                this.a(z2, i2, 2, 11, 0, b10);
                                this.a(z2, i2, 2, 11, 4, b10);
                                this.a(z2, i2, 1, 1, 6, b10);
                                this.a(z2, i2, 1, 1, 7, b10);
                                this.a(z2, i2, 2, 1, 7, b10);
                                this.a(z2, i2, 3, 1, 6, b10);
                                this.a(z2, i2, 3, 1, 7, b10);
                                this.a(z2, i4, 1, 1, 5, b10);
                                this.a(z2, i4, 2, 1, 6, b10);
                                this.a(z2, i4, 3, 1, 5, b10);
                                this.a(z2, i5, 1, 2, 7, b10);
                                this.a(z2, i6, 3, 2, 7, b10);
                                this.a(z2, g.a6.d(), 0, 2, 2, b10);
                                this.a(z2, g.a6.d(), 0, 3, 2, b10);
                                this.a(z2, g.a6.d(), 4, 2, 2, b10);
                                this.a(z2, g.a6.d(), 4, 3, 2, b10);
                                this.a(z2, g.a6.d(), 0, 6, 2, b10);
                                this.a(z2, g.a6.d(), 0, 7, 2, b10);
                                this.a(z2, g.a6.d(), 4, 6, 2, b10);
                                this.a(z2, g.a6.d(), 4, 7, 2, b10);
                                this.a(z2, g.a6.d(), 2, 6, 0, b10);
                                this.a(z2, g.a6.d(), 2, 7, 0, b10);
                                this.a(z2, g.a6.d(), 2, 6, 4, b10);
                                this.a(z2, g.a6.d(), 2, 7, 4, b10);
                                this.a(z2, g.a6.d(), 0, 3, 6, b10);
                                this.a(z2, g.a6.d(), 4, 3, 6, b10);
                                this.a(z2, g.a6.d(), 2, 3, 8, b10);
                                this.a(z2, aA.SOUTH, 2, 4, 7, b10);
                                this.a(z2, aA.EAST, 1, 4, 6, b10);
                                this.a(z2, aA.WEST, 3, 4, 6, b10);
                                this.a(z2, aA.NORTH, 2, 4, 5, b10);
                                i i7 = g.cD.d().a(bk.z, aA.WEST);
                                for (n3 = 1; n3 <= 9; ++n3) {
                                    this.a(z2, i7, 3, n3, 3, b10);
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block14;
                                }
                                this.a(z2, g.bf.d(), 2, 1, 0, b10);
                                this.a(z2, g.bf.d(), 2, 2, 0, b10);
                                this.a(z2, b10, random, 2, 1, 0, aA.NORTH);
                            }
                            c11 = this.b(z2, 2, 0, -1, b10).o();
                            c10 = net.minecraft.ac.c.A;
                            if (arrstring == null) break block20;
                            if (c11 != c10) break block21;
                            i3 = this.b(z2, 2, -1, -1, b10);
                            if (arrstring == null) break block22;
                            c11 = i3.o();
                            c10 = net.minecraft.ac.c.A;
                        }
                        if (c11 == c10) break block21;
                        this.a(z2, i4, 2, 0, -1, b10);
                        aW2 = this;
                        z3 = z2;
                        if (arrstring == null) break block23;
                        i3 = aW2.b(z3, 2, -1, -1, b10);
                    }
                    if (i3.b() != g.ci) break block21;
                    aW2 = this;
                    z3 = z2;
                }
                aW2.a(z3, g.aU.d(), 2, -1, -1, b10);
            }
            n3 = 0;
            while (n3 < 9) {
                block16: {
                    n2 = 0;
                    if (arrstring == null) break block15;
                    for (int i8 = v187555; i8 < 5; ++i8) {
                        this.a(z2, i8, 12, n3, b10);
                        this.b(z2, i2, i8, -1, n3, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block16;
                    }
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 2, 1, 2, 1);
            n2 = 1;
        }
        return n2 != 0;
    }
}

