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
import net.minecraft.u.g;

public class aO
extends a2 {
    private /* synthetic */ boolean l;
    private /* synthetic */ int k;

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.m("T");
        this.l = r2.f("C");
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block17: {
            i i2;
            String[] arrstring;
            block23: {
                z z3;
                aO aO2;
                block25: {
                    i i3;
                    block24: {
                        c c10;
                        c c11;
                        i i4;
                        block22: {
                            i i5;
                            i i6;
                            i i7;
                            block21: {
                                aO aO3;
                                block19: {
                                    block20: {
                                        arrstring = u.b();
                                        aO aO4 = this;
                                        if (arrstring != null) {
                                            if (aO4.i < 0) {
                                                this.i = this.a(z2, b10);
                                                aO aO5 = this;
                                                if (arrstring != null) {
                                                    if (aO5.i < 0) {
                                                        return true;
                                                    }
                                                    aO5 = this;
                                                }
                                                aO5.e.a(0, this.i - this.e.b + 6 - 1, 0);
                                            }
                                            aO4 = this;
                                        }
                                        i2 = aO4.a(g.cW.d());
                                        i7 = this.a(g.cB.d());
                                        i4 = this.a(g.a0.d().a(cG.V, aA.NORTH));
                                        i6 = this.a(g.bu.d());
                                        i5 = this.a(g.bt.d());
                                        this.a(z2, b10, 1, 1, 1, 3, 5, 4, g.bf.d(), g.bf.d(), false);
                                        this.a(z2, b10, 0, 0, 0, 3, 0, 4, i2, i2, false);
                                        this.a(z2, b10, 1, 0, 1, 2, 0, 3, g.bv.d(), g.bv.d(), false);
                                        aO3 = this;
                                        if (arrstring == null) break block19;
                                        if (!aO3.l) break block20;
                                        this.a(z2, b10, 1, 4, 1, 2, 4, 3, i6, i6, false);
                                        if (arrstring != null) break block21;
                                    }
                                    aO3 = this;
                                }
                                aO3.a(z2, b10, 1, 5, 1, 2, 5, 3, i6, i6, false);
                            }
                            this.a(z2, i6, 1, 4, 0, b10);
                            this.a(z2, i6, 2, 4, 0, b10);
                            this.a(z2, i6, 1, 4, 4, b10);
                            this.a(z2, i6, 2, 4, 4, b10);
                            this.a(z2, i6, 0, 4, 1, b10);
                            this.a(z2, i6, 0, 4, 2, b10);
                            this.a(z2, i6, 0, 4, 3, b10);
                            this.a(z2, i6, 3, 4, 1, b10);
                            this.a(z2, i6, 3, 4, 2, b10);
                            this.a(z2, i6, 3, 4, 3, b10);
                            this.a(z2, b10, 0, 1, 0, 0, 3, 0, i6, i6, false);
                            this.a(z2, b10, 3, 1, 0, 3, 3, 0, i6, i6, false);
                            this.a(z2, b10, 0, 1, 4, 0, 3, 4, i6, i6, false);
                            this.a(z2, b10, 3, 1, 4, 3, 3, 4, i6, i6, false);
                            this.a(z2, b10, 0, 1, 1, 0, 3, 3, i7, i7, false);
                            this.a(z2, b10, 3, 1, 1, 3, 3, 3, i7, i7, false);
                            this.a(z2, b10, 1, 1, 0, 2, 3, 0, i7, i7, false);
                            this.a(z2, b10, 1, 1, 4, 2, 3, 4, i7, i7, false);
                            this.a(z2, g.a6.d(), 0, 2, 2, b10);
                            this.a(z2, g.a6.d(), 3, 2, 2, b10);
                            aO aO6 = this;
                            if (arrstring != null) {
                                if (aO6.k > 0) {
                                    this.a(z2, i5, this.k, 1, 3, b10);
                                    this.a(z2, g.bc.d(), this.k, 2, 3, b10);
                                }
                                this.a(z2, g.bf.d(), 1, 1, 0, b10);
                                this.a(z2, g.bf.d(), 1, 2, 0, b10);
                                this.a(z2, b10, random, 1, 1, 0, aA.NORTH);
                                aO6 = this;
                            }
                            c11 = aO6.b(z2, 1, 0, -1, b10).o();
                            c10 = net.minecraft.ac.c.A;
                            if (arrstring == null) break block22;
                            if (c11 != c10) break block23;
                            i3 = this.b(z2, 1, -1, -1, b10);
                            if (arrstring == null) break block24;
                            c11 = i3.o();
                            c10 = net.minecraft.ac.c.A;
                        }
                        if (c11 == c10) break block23;
                        this.a(z2, i4, 1, 0, -1, b10);
                        aO2 = this;
                        z3 = z2;
                        if (arrstring == null) break block25;
                        i3 = aO2.b(z3, 1, -1, -1, b10);
                    }
                    if (i3.b() != g.ci) break block23;
                    aO2 = this;
                    z3 = z2;
                }
                aO2.a(z3, g.aU.d(), 1, -1, -1, b10);
            }
            int n3 = 0;
            while (n3 < 5) {
                block18: {
                    n2 = 0;
                    if (arrstring == null) break block17;
                    for (int i8 = v172084; i8 < 4; ++i8) {
                        this.a(z2, i8, 6, n3, b10);
                        this.b(z2, i2, i8, -1, n3, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block18;
                    }
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 1, 1, 2, 1);
            n2 = 1;
        }
        return n2 != 0;
    }

    public aO(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
        this.l = random.nextBoolean();
        this.k = random.nextInt(3);
    }

    public static aO a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 4, 6, 5, aA2);
        return aO.a(b10) && u.a(list, b10) == null ? new aO(a42, n5, random, b10, aA2) : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aO() {
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("T", this.k);
        r2.a("C", this.l);
    }
}

