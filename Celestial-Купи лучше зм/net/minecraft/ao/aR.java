/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.K;
import net.minecraft.W.Z;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.a2;
import net.minecraft.ao.a4;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.h;
import net.minecraft.u.g;

public class aR
extends a2 {
    private /* synthetic */ K l;
    private /* synthetic */ K k;
    private /* synthetic */ K n;
    private /* synthetic */ K m;

    public static aR a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 13, 4, 9, aA2);
        return aR.a(b10) && u.a(list, b10) == null ? new aR(a42, n5, random, b10, aA2) : null;
    }

    public aR(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
        this.m = this.a(random);
        this.k = this.a(random);
        this.n = this.a(random);
        this.l = this.a(random);
    }

    public aR() {
    }

    private K a(Random random) {
        switch (random.nextInt(10)) {
            case 0: 
            case 1: {
                return g.b4;
            }
            case 2: 
            case 3: {
                return g.ca;
            }
            case 4: {
                return g.K;
            }
        }
        return g.c3;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block10: {
            int n3;
            int n4;
            String[] arrstring;
            block9: {
                arrstring = u.b();
                aR aR2 = this;
                if (arrstring != null) {
                    if (aR2.i < 0) {
                        this.i = this.a(z2, b10);
                        aR aR3 = this;
                        if (arrstring != null) {
                            if (aR3.i < 0) {
                                return true;
                            }
                            aR3 = this;
                        }
                        aR3.e.a(0, this.i - this.e.b + 4 - 1, 0);
                    }
                    aR2 = this;
                }
                i i2 = aR2.a(g.bu.d());
                this.a(z2, b10, 0, 1, 0, 12, 4, 8, g.bf.d(), g.bf.d(), false);
                this.a(z2, b10, 1, 0, 1, 2, 0, 7, g.cU.d(), g.cU.d(), false);
                this.a(z2, b10, 4, 0, 1, 5, 0, 7, g.cU.d(), g.cU.d(), false);
                this.a(z2, b10, 7, 0, 1, 8, 0, 7, g.cU.d(), g.cU.d(), false);
                this.a(z2, b10, 10, 0, 1, 11, 0, 7, g.cU.d(), g.cU.d(), false);
                this.a(z2, b10, 0, 0, 0, 0, 0, 8, i2, i2, false);
                this.a(z2, b10, 6, 0, 0, 6, 0, 8, i2, i2, false);
                this.a(z2, b10, 12, 0, 0, 12, 0, 8, i2, i2, false);
                this.a(z2, b10, 1, 0, 0, 11, 0, 0, i2, i2, false);
                this.a(z2, b10, 1, 0, 8, 11, 0, 8, i2, i2, false);
                this.a(z2, b10, 3, 0, 1, 3, 0, 7, g.bQ.d(), g.bQ.d(), false);
                this.a(z2, b10, 9, 0, 1, 9, 0, 7, g.bQ.d(), g.bQ.d(), false);
                for (n4 = 1; n4 <= 7; ++n4) {
                    n3 = ((Z)this.m).b();
                    int n5 = n3 / 3;
                    this.a(z2, this.m.c(net.minecraft.k.h.a(random, n5, n3)), 1, 1, n4, b10);
                    this.a(z2, this.m.c(net.minecraft.k.h.a(random, n5, n3)), 2, 1, n4, b10);
                    int n6 = ((Z)this.k).b();
                    int n7 = n6 / 3;
                    this.a(z2, this.k.c(net.minecraft.k.h.a(random, n7, n6)), 4, 1, n4, b10);
                    this.a(z2, this.k.c(net.minecraft.k.h.a(random, n7, n6)), 5, 1, n4, b10);
                    int n8 = ((Z)this.n).b();
                    int n9 = n8 / 3;
                    this.a(z2, this.n.c(net.minecraft.k.h.a(random, n9, n8)), 7, 1, n4, b10);
                    this.a(z2, this.n.c(net.minecraft.k.h.a(random, n9, n8)), 8, 1, n4, b10);
                    int n10 = ((Z)this.l).b();
                    int n11 = n10 / 3;
                    this.a(z2, this.l.c(net.minecraft.k.h.a(random, n11, n10)), 10, 1, n4, b10);
                    this.a(z2, this.l.c(net.minecraft.k.h.a(random, n11, n10)), 11, 1, n4, b10);
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block9;
                }
                n4 = 0;
            }
            while (n4 < 9) {
                block11: {
                    n2 = 0;
                    if (arrstring == null) break block10;
                    for (n3 = v170208; n3 < 13; ++n3) {
                        this.a(z2, n3, 4, n4, b10);
                        this.b(z2, g.bv.d(), n3, -1, n4, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block11;
                    }
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("CA", K.h.c(this.m));
        r2.b("CB", K.h.c(this.k));
        r2.b("CC", K.h.c(this.n));
        r2.b("CD", K.h.c(this.l));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2, j j2) {
        block10: {
            block9: {
                aR aR2;
                boolean bl2;
                block8: {
                    String[] arrstring = u.b();
                    super.a(r2, j2);
                    String[] arrstring2 = arrstring;
                    this.m = K.b(r2.m("CA"));
                    this.k = K.b(r2.m("CB"));
                    this.n = K.b(r2.m("CC"));
                    this.l = K.b(r2.m("CD"));
                    bl2 = this.m instanceof Z;
                    if (arrstring2 != null) {
                        if (!bl2) {
                            this.m = g.c3;
                        }
                        bl2 = this.k instanceof Z;
                    }
                    if (arrstring2 != null) {
                        if (!bl2) {
                            this.k = g.b4;
                        }
                        bl2 = this.n instanceof Z;
                    }
                    if (arrstring2 == null) break block8;
                    if (!bl2) {
                        this.n = g.ca;
                    }
                    aR2 = this;
                    if (arrstring2 == null) break block9;
                    bl2 = aR2.l instanceof Z;
                }
                if (bl2) break block10;
                aR2 = this;
            }
            aR2.l = g.K;
        }
    }
}

