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

public class az
extends a2 {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static az a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 9, 9, 6, aA2);
        return az.a(b10) && u.a(list, b10) == null ? new az(a42, n5, random, b10, aA2) : null;
    }

    public az() {
    }

    public az(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    protected int c(int n2, int n3) {
        return 1;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block16: {
            int n3;
            int n4;
            i i2;
            String[] arrstring;
            block14: {
                int n5;
                block19: {
                    z z3;
                    az az2;
                    block21: {
                        i i3;
                        block20: {
                            c c10;
                            c c11;
                            i i4;
                            block18: {
                                arrstring = u.b();
                                az az3 = this;
                                if (arrstring != null) {
                                    if (az3.i < 0) {
                                        this.i = this.a(z2, b10);
                                        az az4 = this;
                                        if (arrstring != null) {
                                            if (az4.i < 0) {
                                                return true;
                                            }
                                            az4 = this;
                                        }
                                        az4.e.a(0, this.i - this.e.b + 9 - 1, 0);
                                    }
                                    az3 = this;
                                }
                                i2 = az3.a(g.cW.d());
                                i i5 = this.a(g.aX.d().a(cG.V, aA.NORTH));
                                i i6 = this.a(g.aX.d().a(cG.V, aA.SOUTH));
                                i i7 = this.a(g.aX.d().a(cG.V, aA.EAST));
                                i i8 = this.a(g.cB.d());
                                i4 = this.a(g.a0.d().a(cG.V, aA.NORTH));
                                i i9 = this.a(g.bt.d());
                                this.a(z2, b10, 1, 1, 1, 7, 5, 4, g.bf.d(), g.bf.d(), false);
                                this.a(z2, b10, 0, 0, 0, 8, 0, 5, i2, i2, false);
                                this.a(z2, b10, 0, 5, 0, 8, 5, 5, i2, i2, false);
                                this.a(z2, b10, 0, 6, 1, 8, 6, 4, i2, i2, false);
                                this.a(z2, b10, 0, 7, 2, 8, 7, 3, i2, i2, false);
                                n4 = -1;
                                while (n4 <= 2) {
                                    block15: {
                                        n5 = 0;
                                        if (arrstring == null) break block14;
                                        for (n3 = v178079; n3 <= 8; ++n3) {
                                            this.a(z2, i5, n3, 6 + n4, n4, b10);
                                            this.a(z2, i6, n3, 6 + n4, 5 - n4, b10);
                                            if (arrstring != null) {
                                                if (arrstring != null) continue;
                                            }
                                            break block15;
                                        }
                                        ++n4;
                                    }
                                    if (arrstring != null) continue;
                                }
                                this.a(z2, b10, 0, 1, 0, 0, 1, 5, i2, i2, false);
                                this.a(z2, b10, 1, 1, 5, 8, 1, 5, i2, i2, false);
                                this.a(z2, b10, 8, 1, 0, 8, 1, 4, i2, i2, false);
                                this.a(z2, b10, 2, 1, 0, 7, 1, 0, i2, i2, false);
                                this.a(z2, b10, 0, 2, 0, 0, 4, 0, i2, i2, false);
                                this.a(z2, b10, 0, 2, 5, 0, 4, 5, i2, i2, false);
                                this.a(z2, b10, 8, 2, 5, 8, 4, 5, i2, i2, false);
                                this.a(z2, b10, 8, 2, 0, 8, 4, 0, i2, i2, false);
                                this.a(z2, b10, 0, 2, 1, 0, 4, 4, i8, i8, false);
                                this.a(z2, b10, 1, 2, 5, 7, 4, 5, i8, i8, false);
                                this.a(z2, b10, 8, 2, 1, 8, 4, 4, i8, i8, false);
                                this.a(z2, b10, 1, 2, 0, 7, 4, 0, i8, i8, false);
                                this.a(z2, g.a6.d(), 4, 2, 0, b10);
                                this.a(z2, g.a6.d(), 5, 2, 0, b10);
                                this.a(z2, g.a6.d(), 6, 2, 0, b10);
                                this.a(z2, g.a6.d(), 4, 3, 0, b10);
                                this.a(z2, g.a6.d(), 5, 3, 0, b10);
                                this.a(z2, g.a6.d(), 6, 3, 0, b10);
                                this.a(z2, g.a6.d(), 0, 2, 2, b10);
                                this.a(z2, g.a6.d(), 0, 2, 3, b10);
                                this.a(z2, g.a6.d(), 0, 3, 2, b10);
                                this.a(z2, g.a6.d(), 0, 3, 3, b10);
                                this.a(z2, g.a6.d(), 8, 2, 2, b10);
                                this.a(z2, g.a6.d(), 8, 2, 3, b10);
                                this.a(z2, g.a6.d(), 8, 3, 2, b10);
                                this.a(z2, g.a6.d(), 8, 3, 3, b10);
                                this.a(z2, g.a6.d(), 2, 2, 5, b10);
                                this.a(z2, g.a6.d(), 3, 2, 5, b10);
                                this.a(z2, g.a6.d(), 5, 2, 5, b10);
                                this.a(z2, g.a6.d(), 6, 2, 5, b10);
                                this.a(z2, b10, 1, 4, 1, 7, 4, 1, i8, i8, false);
                                this.a(z2, b10, 1, 4, 4, 7, 4, 4, i8, i8, false);
                                this.a(z2, b10, 1, 3, 4, 7, 3, 4, g.c8.d(), g.c8.d(), false);
                                this.a(z2, i8, 7, 1, 4, b10);
                                this.a(z2, i7, 7, 1, 3, b10);
                                this.a(z2, i5, 6, 1, 4, b10);
                                this.a(z2, i5, 5, 1, 4, b10);
                                this.a(z2, i5, 4, 1, 4, b10);
                                this.a(z2, i5, 3, 1, 4, b10);
                                this.a(z2, i9, 6, 1, 3, b10);
                                this.a(z2, g.bc.d(), 6, 2, 3, b10);
                                this.a(z2, i9, 4, 1, 3, b10);
                                this.a(z2, g.bc.d(), 4, 2, 3, b10);
                                this.a(z2, g.aj.d(), 7, 1, 1, b10);
                                this.a(z2, g.bf.d(), 1, 1, 0, b10);
                                this.a(z2, g.bf.d(), 1, 2, 0, b10);
                                this.a(z2, b10, random, 1, 1, 0, aA.NORTH);
                                c11 = this.b(z2, 1, 0, -1, b10).o();
                                c10 = net.minecraft.ac.c.A;
                                if (arrstring == null) break block18;
                                if (c11 != c10) break block19;
                                i3 = this.b(z2, 1, -1, -1, b10);
                                if (arrstring == null) break block20;
                                c11 = i3.o();
                                c10 = net.minecraft.ac.c.A;
                            }
                            if (c11 == c10) break block19;
                            this.a(z2, i4, 1, 0, -1, b10);
                            az2 = this;
                            z3 = z2;
                            if (arrstring == null) break block21;
                            i3 = az2.b(z3, 1, -1, -1, b10);
                        }
                        if (i3.b() != g.ci) break block19;
                        az2 = this;
                        z3 = z2;
                    }
                    az2.a(z3, g.aU.d(), 1, -1, -1, b10);
                }
                n5 = n4 = 0;
            }
            while (n4 < 6) {
                block17: {
                    n2 = 0;
                    if (arrstring == null) break block16;
                    for (n3 = v178109; n3 < 9; ++n3) {
                        this.a(z2, n3, 9, n4, b10);
                        this.b(z2, i2, n3, -1, n4, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block17;
                    }
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 2, 1, 2, 1);
            n2 = 1;
        }
        return n2 != 0;
    }
}

