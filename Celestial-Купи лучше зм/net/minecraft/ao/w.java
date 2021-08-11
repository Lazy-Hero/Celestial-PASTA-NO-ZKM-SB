/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.H;
import net.minecraft.W.cG;
import net.minecraft.W.cZ;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ao.v;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.m;
import net.minecraft.u.g;
import net.minecraft.w.bl;

public class w
extends v {
    private final /* synthetic */ boolean[] k;

    public w(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 21, 15, 21);
        this.k = new boolean[4];
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("hasPlacedChest0", this.k[0]);
        r2.a("hasPlacedChest1", this.k[1]);
        r2.a("hasPlacedChest2", this.k[2]);
        r2.a("hasPlacedChest3", this.k[3]);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k[0] = r2.f("hasPlacedChest0");
        this.k[1] = r2.f("hasPlacedChest1");
        this.k[2] = r2.f("hasPlacedChest2");
        this.k[3] = r2.f("hasPlacedChest3");
    }

    public w() {
        this.k = new boolean[4];
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        block21: {
            String[] arrstring;
            block20: {
                int n2;
                int n3;
                block19: {
                    block18: {
                        int n4;
                        block16: {
                            this.a(z2, b10, 0, -4, 0, this.g - 1, 0, this.j - 1, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                            arrstring = u.b();
                            for (n4 = 1; n4 <= 9; ++n4) {
                                this.a(z2, b10, n4, n4, n4, this.g - 1 - n4, n4, this.j - 1 - n4, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                                this.a(z2, b10, n4 + 1, n4, n4 + 1, this.g - 2 - n4, n4, this.j - 2 - n4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                    m.b(!m.c());
                                    break;
                                }
                                break block16;
                            }
                            n4 = 0;
                        }
                        while (n4 < this.g) {
                            block17: {
                                for (int i2 = 0; i2 < this.j; ++i2) {
                                    int n5 = -5;
                                    this.b(z2, net.minecraft.u.g.bC.d(), n4, -5, i2, b10);
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block17;
                                }
                                ++n4;
                            }
                            if (arrstring != null) continue;
                        }
                        i i3 = net.minecraft.u.g.ch.d().a(cG.V, aA.NORTH);
                        i i4 = net.minecraft.u.g.ch.d().a(cG.V, aA.SOUTH);
                        i i5 = net.minecraft.u.g.ch.d().a(cG.V, aA.EAST);
                        i i6 = net.minecraft.u.g.ch.d().a(cG.V, aA.WEST);
                        n3 = ~bl.ORANGE.a() & 0xF;
                        int n6 = ~bl.BLUE.a() & 0xF;
                        this.a(z2, b10, 0, 0, 0, 4, 9, 4, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 1, 10, 1, 3, 10, 3, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, i3, 2, 10, 0, b10);
                        this.a(z2, i4, 2, 10, 4, b10);
                        this.a(z2, i5, 0, 10, 2, b10);
                        this.a(z2, i6, 4, 10, 2, b10);
                        this.a(z2, b10, this.g - 5, 0, 0, this.g - 1, 9, 4, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.g - 4, 10, 1, this.g - 2, 10, 3, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, i3, this.g - 3, 10, 0, b10);
                        this.a(z2, i4, this.g - 3, 10, 4, b10);
                        this.a(z2, i5, this.g - 5, 10, 2, b10);
                        this.a(z2, i6, this.g - 1, 10, 2, b10);
                        this.a(z2, b10, 8, 0, 0, 12, 4, 4, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 9, 1, 0, 11, 3, 4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 9, 1, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 9, 2, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 9, 3, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 10, 3, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 11, 3, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 11, 2, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 11, 1, 1, b10);
                        this.a(z2, b10, 4, 1, 1, 8, 3, 3, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 4, 1, 2, 8, 2, 2, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 12, 1, 1, 16, 3, 3, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 12, 1, 2, 16, 2, 2, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 5, 4, 5, this.g - 6, 4, this.j - 6, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, 9, 4, 9, 11, 4, 11, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, 8, 1, 8, 8, 3, 8, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                        this.a(z2, b10, 12, 1, 8, 12, 3, 8, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                        this.a(z2, b10, 8, 1, 12, 8, 3, 12, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                        this.a(z2, b10, 12, 1, 12, 12, 3, 12, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                        this.a(z2, b10, 1, 1, 5, 4, 4, 11, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, this.g - 5, 1, 5, this.g - 2, 4, 11, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, 6, 7, 9, 6, 7, 11, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, this.g - 7, 7, 9, this.g - 7, 7, 11, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, 5, 5, 9, 5, 7, 11, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                        this.a(z2, b10, this.g - 6, 5, 9, this.g - 6, 7, 11, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                        this.a(z2, net.minecraft.u.g.bf.d(), 5, 5, 10, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), 5, 6, 10, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), 6, 6, 10, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), this.g - 6, 5, 10, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), this.g - 6, 6, 10, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), this.g - 7, 6, 10, b10);
                        this.a(z2, b10, 2, 4, 4, 2, 6, 4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.g - 3, 4, 4, this.g - 3, 6, 4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, i3, 2, 4, 5, b10);
                        this.a(z2, i3, 2, 3, 4, b10);
                        this.a(z2, i3, this.g - 3, 4, 5, b10);
                        this.a(z2, i3, this.g - 3, 3, 4, b10);
                        this.a(z2, b10, 1, 1, 3, 2, 2, 3, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, this.g - 3, 1, 3, this.g - 2, 2, 3, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, net.minecraft.u.g.bC.d(), 1, 1, 2, b10);
                        this.a(z2, net.minecraft.u.g.bC.d(), this.g - 2, 1, 2, b10);
                        this.a(z2, net.minecraft.u.g.bO.c(cZ.SAND.b()), 1, 2, 2, b10);
                        this.a(z2, net.minecraft.u.g.bO.c(cZ.SAND.b()), this.g - 2, 2, 2, b10);
                        this.a(z2, i6, 2, 1, 2, b10);
                        this.a(z2, i5, this.g - 3, 1, 2, b10);
                        this.a(z2, b10, 4, 3, 5, 4, 3, 18, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, this.g - 5, 3, 5, this.g - 5, 3, 17, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                        this.a(z2, b10, 3, 1, 5, 4, 2, 16, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.g - 6, 1, 5, this.g - 5, 2, 16, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        for (n2 = 5; n2 <= 17; n2 += 2) {
                            this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 4, 1, n2, b10);
                            this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), 4, 2, n2, b10);
                            this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), this.g - 5, 1, n2, b10);
                            this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), this.g - 5, 2, n2, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block18;
                        }
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 10, 0, 7, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 10, 0, 8, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 9, 0, 9, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 11, 0, 9, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 8, 0, 10, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 12, 0, 10, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 7, 0, 10, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 13, 0, 10, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 9, 0, 11, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 11, 0, 11, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 10, 0, 12, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), 10, 0, 13, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n6), 10, 0, 10, b10);
                    }
                    for (n2 = 0; n2 <= this.g - 1; n2 += this.g - 1) {
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 2, 1, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 2, 2, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 2, 3, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 3, 1, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 3, 2, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 3, 3, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 4, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), n2, 4, 2, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 4, 3, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 5, 1, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 5, 2, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 5, 3, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 6, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), n2, 6, 2, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 6, 3, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 7, 1, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 7, 2, b10);
                        this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 7, 3, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 8, 1, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 8, 2, b10);
                        this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 8, 3, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block19;
                    }
                    n2 = 2;
                }
                while (n2 <= this.g - 3) {
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 - 1, 2, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 2, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 + 1, 2, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 - 1, 3, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 3, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 + 1, 3, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2 - 1, 4, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), n2, 4, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2 + 1, 4, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 - 1, 5, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 5, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 + 1, 5, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2 - 1, 6, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), n2, 6, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2 + 1, 6, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2 - 1, 7, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2, 7, 0, b10);
                    this.a(z2, net.minecraft.u.g.ck.c(n3), n2 + 1, 7, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 - 1, 8, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2, 8, 0, b10);
                    this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), n2 + 1, 8, 0, b10);
                    n2 += this.g - 3 - 2;
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block20;
                }
                this.a(z2, b10, 8, 4, 0, 12, 6, 0, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                this.a(z2, net.minecraft.u.g.bf.d(), 8, 6, 0, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 12, 6, 0, b10);
                this.a(z2, net.minecraft.u.g.ck.c(n3), 9, 5, 0, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), 10, 5, 0, b10);
                this.a(z2, net.minecraft.u.g.ck.c(n3), 11, 5, 0, b10);
                this.a(z2, b10, 8, -14, 8, 12, -11, 12, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                this.a(z2, b10, 8, -10, 8, 12, -10, 12, net.minecraft.u.g.bC.c(H.CHISELED.a()), net.minecraft.u.g.bC.c(H.CHISELED.a()), false);
                this.a(z2, b10, 8, -9, 8, 12, -9, 12, net.minecraft.u.g.bC.c(H.SMOOTH.a()), net.minecraft.u.g.bC.c(H.SMOOTH.a()), false);
                this.a(z2, b10, 8, -8, 8, 12, -1, 12, net.minecraft.u.g.bC.d(), net.minecraft.u.g.bC.d(), false);
                this.a(z2, b10, 9, -11, 9, 11, -1, 11, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                this.a(z2, net.minecraft.u.g.dl.d(), 10, -11, 10, b10);
                this.a(z2, b10, 9, -13, 9, 11, -13, 11, net.minecraft.u.g.cR.d(), net.minecraft.u.g.bf.d(), false);
                this.a(z2, net.minecraft.u.g.bf.d(), 8, -11, 10, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 8, -10, 10, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), 7, -10, 10, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 7, -11, 10, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 12, -11, 10, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 12, -10, 10, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), 13, -10, 10, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 13, -11, 10, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 10, -11, 8, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 10, -10, 8, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), 10, -10, 7, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 10, -11, 7, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 10, -11, 12, b10);
                this.a(z2, net.minecraft.u.g.bf.d(), 10, -10, 12, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.CHISELED.a()), 10, -10, 13, b10);
                this.a(z2, net.minecraft.u.g.bC.c(H.SMOOTH.a()), 10, -11, 13, b10);
            }
            for (aA aA2 : av.HORIZONTAL) {
                block23: {
                    int n7;
                    block22: {
                        bl2 = this.k[aA2.k()];
                        if (arrstring == null) break block21;
                        if (arrstring == null) break block22;
                        if (bl2) break block23;
                        n7 = aA2.r() * 2;
                    }
                    void var13_17 = n7;
                    int n8 = aA2.i() * 2;
                    this.k[aA2.k()] = this.a(z2, b10, random, 10 + var13_17, -11, 10 + n8, net.minecraft.aj.j.af);
                }
                if (arrstring != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }
}

