/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.bk;
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

public class a3
extends a2 {
    private /* synthetic */ boolean k;

    public a3(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
        this.k = random.nextBoolean();
    }

    public a3() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block16: {
            int n3;
            z z3;
            a3 a32;
            i i2;
            i i3;
            String[] arrstring;
            block18: {
                block19: {
                    arrstring = u.b();
                    a3 a33 = this;
                    if (arrstring != null) {
                        if (a33.i < 0) {
                            this.i = this.a(z2, b10);
                            a3 a34 = this;
                            if (arrstring != null) {
                                if (a34.i < 0) {
                                    return true;
                                }
                                a34 = this;
                            }
                            a34.e.a(0, this.i - this.e.b + 6 - 1, 0);
                        }
                        a33 = this;
                    }
                    i3 = a33.a(g.cW.d());
                    i i4 = this.a(g.cB.d());
                    i i5 = this.a(g.a0.d().a(cG.V, aA.NORTH));
                    i i6 = this.a(g.bu.d());
                    i2 = this.a(g.bt.d());
                    this.a(z2, b10, 0, 0, 0, 4, 0, 4, i3, i3, false);
                    this.a(z2, b10, 0, 4, 0, 4, 4, 4, i6, i6, false);
                    this.a(z2, b10, 1, 4, 1, 3, 4, 3, i4, i4, false);
                    this.a(z2, i3, 0, 1, 0, b10);
                    this.a(z2, i3, 0, 2, 0, b10);
                    this.a(z2, i3, 0, 3, 0, b10);
                    this.a(z2, i3, 4, 1, 0, b10);
                    this.a(z2, i3, 4, 2, 0, b10);
                    this.a(z2, i3, 4, 3, 0, b10);
                    this.a(z2, i3, 0, 1, 4, b10);
                    this.a(z2, i3, 0, 2, 4, b10);
                    this.a(z2, i3, 0, 3, 4, b10);
                    this.a(z2, i3, 4, 1, 4, b10);
                    this.a(z2, i3, 4, 2, 4, b10);
                    this.a(z2, i3, 4, 3, 4, b10);
                    this.a(z2, b10, 0, 1, 1, 0, 3, 3, i4, i4, false);
                    this.a(z2, b10, 4, 1, 1, 4, 3, 3, i4, i4, false);
                    this.a(z2, b10, 1, 1, 4, 3, 3, 4, i4, i4, false);
                    this.a(z2, g.a6.d(), 0, 2, 2, b10);
                    this.a(z2, g.a6.d(), 2, 2, 4, b10);
                    this.a(z2, g.a6.d(), 4, 2, 2, b10);
                    this.a(z2, i4, 1, 1, 0, b10);
                    this.a(z2, i4, 1, 2, 0, b10);
                    this.a(z2, i4, 1, 3, 0, b10);
                    this.a(z2, i4, 2, 3, 0, b10);
                    this.a(z2, i4, 3, 3, 0, b10);
                    this.a(z2, i4, 3, 2, 0, b10);
                    this.a(z2, i4, 3, 1, 0, b10);
                    a32 = this;
                    z3 = z2;
                    if (arrstring == null) break block18;
                    if (a32.b(z3, 2, 0, -1, b10).o() != net.minecraft.ac.c.A) break block19;
                    a32 = this;
                    z3 = z2;
                    if (arrstring == null) break block18;
                    if (a32.b(z3, 2, -1, -1, b10).o() == net.minecraft.ac.c.A) break block19;
                    this.a(z2, i5, 2, 0, -1, b10);
                    a32 = this;
                    z3 = z2;
                    if (arrstring == null) break block18;
                    if (a32.b(z3, 2, -1, -1, b10).b() == g.ci) {
                        this.a(z2, g.aU.d(), 2, -1, -1, b10);
                    }
                }
                a32 = this;
                z3 = z2;
            }
            a32.a(z3, b10, 1, 1, 1, 3, 3, 3, g.bf.d(), g.bf.d(), false);
            int n4 = this.k;
            if (arrstring != null) {
                if (n4 != 0) {
                    this.a(z2, i2, 0, 5, 0, b10);
                    this.a(z2, i2, 1, 5, 0, b10);
                    this.a(z2, i2, 2, 5, 0, b10);
                    this.a(z2, i2, 3, 5, 0, b10);
                    this.a(z2, i2, 4, 5, 0, b10);
                    this.a(z2, i2, 0, 5, 4, b10);
                    this.a(z2, i2, 1, 5, 4, b10);
                    this.a(z2, i2, 2, 5, 4, b10);
                    this.a(z2, i2, 3, 5, 4, b10);
                    this.a(z2, i2, 4, 5, 4, b10);
                    this.a(z2, i2, 4, 5, 1, b10);
                    this.a(z2, i2, 4, 5, 2, b10);
                    this.a(z2, i2, 4, 5, 3, b10);
                    this.a(z2, i2, 0, 5, 1, b10);
                    this.a(z2, i2, 0, 5, 2, b10);
                    this.a(z2, i2, 0, 5, 3, b10);
                }
                n4 = this.k;
            }
            if (arrstring != null) {
                if (n4 != 0) {
                    i i7 = g.cD.d().a(bk.z, aA.SOUTH);
                    this.a(z2, i7, 3, 1, 3, b10);
                    this.a(z2, i7, 3, 2, 3, b10);
                    this.a(z2, i7, 3, 3, 3, b10);
                    this.a(z2, i7, 3, 4, 3, b10);
                }
                this.a(z2, aA.NORTH, 2, 3, 1, b10);
                n4 = n3 = 0;
            }
            while (n3 < 5) {
                block17: {
                    n2 = 0;
                    if (arrstring == null) break block16;
                    for (int i8 = v175504; i8 < 5; ++i8) {
                        this.a(z2, i8, 6, n3, b10);
                        this.b(z2, i3, i8, -1, n3, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block17;
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

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.f("Terrace");
    }

    public static a3 a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 5, 6, 5, aA2);
        return u.a(list, b10) != null ? null : new a3(a42, n5, random, b10, aA2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Terrace", this.k);
    }
}

