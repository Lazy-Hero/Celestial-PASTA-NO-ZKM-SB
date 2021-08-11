/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.T.a5;
import net.minecraft.W.D;
import net.minecraft.W.a;
import net.minecraft.W.aO;
import net.minecraft.W.cG;
import net.minecraft.Z.i;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ao.v;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class z
extends v {
    private /* synthetic */ boolean k;

    public z(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 7, 9);
    }

    @Override
    public boolean a(net.minecraft.ah.z z2, Random random, b b10) {
        int n2;
        block12: {
            block13: {
                int n3;
                int n4;
                String[] arrstring;
                block10: {
                    arrstring = u.b();
                    z z3 = this;
                    net.minecraft.ah.z z4 = z2;
                    b b11 = b10;
                    int n5 = 0;
                    if (arrstring != null) {
                        if (!z3.a(z4, b11, n5)) {
                            return false;
                        }
                        this.a(z2, b10, 1, 1, 1, 5, 1, 7, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 1, 4, 2, 5, 4, 7, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 2, 1, 0, 4, 1, 0, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 2, 2, 2, 3, 3, 2, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 1, 2, 3, 1, 3, 6, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 5, 2, 3, 5, 3, 6, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 2, 2, 7, 4, 3, 7, net.minecraft.u.g.cB.c(D.SPRUCE.b()), net.minecraft.u.g.cB.c(D.SPRUCE.b()), false);
                        this.a(z2, b10, 1, 0, 2, 1, 3, 2, net.minecraft.u.g.bu.d(), net.minecraft.u.g.bu.d(), false);
                        this.a(z2, b10, 5, 0, 2, 5, 3, 2, net.minecraft.u.g.bu.d(), net.minecraft.u.g.bu.d(), false);
                        this.a(z2, b10, 1, 0, 7, 1, 3, 7, net.minecraft.u.g.bu.d(), net.minecraft.u.g.bu.d(), false);
                        z3 = this;
                        z4 = z2;
                        b11 = b10;
                        n5 = 5;
                    }
                    z3.a(z4, b11, n5, 0, 7, 5, 3, 7, net.minecraft.u.g.bu.d(), net.minecraft.u.g.bu.d(), false);
                    this.a(z2, net.minecraft.u.g.bt.d(), 2, 3, 2, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 3, 3, 7, b10);
                    this.a(z2, net.minecraft.u.g.bf.d(), 1, 3, 4, b10);
                    this.a(z2, net.minecraft.u.g.bf.d(), 5, 3, 4, b10);
                    this.a(z2, net.minecraft.u.g.bf.d(), 5, 3, 5, b10);
                    this.a(z2, net.minecraft.u.g.cA.d().a(aO.A, a.MUSHROOM_RED), 1, 3, 5, b10);
                    this.a(z2, net.minecraft.u.g.aj.d(), 3, 2, 6, b10);
                    this.a(z2, net.minecraft.u.g.aH.d(), 4, 2, 6, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 1, 2, 1, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 5, 2, 1, b10);
                    i i2 = net.minecraft.u.g.aT.d().a(cG.V, aA.NORTH);
                    i i3 = net.minecraft.u.g.aT.d().a(cG.V, aA.EAST);
                    i i4 = net.minecraft.u.g.aT.d().a(cG.V, aA.WEST);
                    i i5 = net.minecraft.u.g.aT.d().a(cG.V, aA.SOUTH);
                    this.a(z2, b10, 0, 4, 1, 6, 4, 1, i2, i2, false);
                    this.a(z2, b10, 0, 4, 2, 0, 4, 7, i3, i3, false);
                    this.a(z2, b10, 6, 4, 2, 6, 4, 7, i4, i4, false);
                    this.a(z2, b10, 0, 4, 8, 6, 4, 8, i5, i5, false);
                    n4 = 2;
                    while (n4 <= 7) {
                        block11: {
                            n2 = 1;
                            if (arrstring == null) break block10;
                            for (n3 = v464078; n3 <= 5; n3 += 4) {
                                this.b(z2, net.minecraft.u.g.bu.d(), n3, -1, n4, b10);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block11;
                            }
                            n4 += 5;
                        }
                        if (arrstring != null) continue;
                    }
                    n2 = this.k;
                }
                if (arrstring == null) break block12;
                if (n2 != 0) break block13;
                n4 = this.b(2, 5);
                n3 = this.a(2);
                int n6 = this.a(2, 5);
                n2 = b10.a(new n(n4, n3, n6)) ? 1 : 0;
                if (arrstring == null) break block12;
                if (n2 != 0) {
                    this.k = true;
                    a5 a52 = new a5(z2);
                    a52.A();
                    a52.c((double)n4 + 0.5, n3, (double)n6 + 0.5, 0.0f, 0.0f);
                    a52.a(z2.h(new n(n4, n3, n6)), null);
                    z2.f(a52);
                }
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public z() {
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.f("Witch");
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Witch", this.k);
    }
}

