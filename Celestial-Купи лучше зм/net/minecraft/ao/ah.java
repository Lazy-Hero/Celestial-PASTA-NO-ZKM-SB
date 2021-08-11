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

public class ah
extends a2 {
    private /* synthetic */ K k;
    private /* synthetic */ K l;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("CA", K.h.c(this.l));
        r2.b("CB", K.h.c(this.k));
    }

    public static ah a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 7, 4, 9, aA2);
        return ah.a(b10) && u.a(list, b10) == null ? new ah(a42, n5, random, b10, aA2) : null;
    }

    public ah(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
        this.l = this.a(random);
        this.k = this.a(random);
    }

    public ah() {
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.l = K.b(r2.m("CA"));
        this.k = K.b(r2.m("CB"));
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
                ah ah2 = this;
                if (arrstring != null) {
                    if (ah2.i < 0) {
                        this.i = this.a(z2, b10);
                        ah ah3 = this;
                        if (arrstring != null) {
                            if (ah3.i < 0) {
                                return true;
                            }
                            ah3 = this;
                        }
                        ah3.e.a(0, this.i - this.e.b + 4 - 1, 0);
                    }
                    ah2 = this;
                }
                i i2 = ah2.a(g.bu.d());
                this.a(z2, b10, 0, 1, 0, 6, 4, 8, g.bf.d(), g.bf.d(), false);
                this.a(z2, b10, 1, 0, 1, 2, 0, 7, g.cU.d(), g.cU.d(), false);
                this.a(z2, b10, 4, 0, 1, 5, 0, 7, g.cU.d(), g.cU.d(), false);
                this.a(z2, b10, 0, 0, 0, 0, 0, 8, i2, i2, false);
                this.a(z2, b10, 6, 0, 0, 6, 0, 8, i2, i2, false);
                this.a(z2, b10, 1, 0, 0, 5, 0, 0, i2, i2, false);
                this.a(z2, b10, 1, 0, 8, 5, 0, 8, i2, i2, false);
                this.a(z2, b10, 3, 0, 1, 3, 0, 7, g.bQ.d(), g.bQ.d(), false);
                for (n4 = 1; n4 <= 7; ++n4) {
                    n3 = ((Z)this.l).b();
                    int n5 = n3 / 3;
                    this.a(z2, this.l.c(net.minecraft.k.h.a(random, n5, n3)), 1, 1, n4, b10);
                    this.a(z2, this.l.c(net.minecraft.k.h.a(random, n5, n3)), 2, 1, n4, b10);
                    int n6 = ((Z)this.k).b();
                    int n7 = n6 / 3;
                    this.a(z2, this.k.c(net.minecraft.k.h.a(random, n7, n6)), 4, 1, n4, b10);
                    this.a(z2, this.k.c(net.minecraft.k.h.a(random, n7, n6)), 5, 1, n4, b10);
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
                    for (n3 = v211888; n3 < 7; ++n3) {
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
}

