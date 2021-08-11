/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.aL;
import net.minecraft.W.bV;
import net.minecraft.W.bh;
import net.minecraft.W.c2;
import net.minecraft.W.cG;
import net.minecraft.W.cR;
import net.minecraft.W.cW;
import net.minecraft.W.co;
import net.minecraft.W.z;
import net.minecraft.Z.i;
import net.minecraft.ao.b;
import net.minecraft.ao.b9;
import net.minecraft.ao.u;
import net.minecraft.ao.v;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class y
extends v {
    private /* synthetic */ boolean o;
    private /* synthetic */ boolean k;
    private /* synthetic */ boolean m;
    private static final /* synthetic */ b9 n;
    private /* synthetic */ boolean l;

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("placedMainChest", this.k);
        r2.a("placedHiddenChest", this.l);
        r2.a("placedTrap1", this.m);
        r2.a("placedTrap2", this.o);
    }

    public y(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 12, 10, 15);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        n = new b9(null);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.f("placedMainChest");
        this.l = r2.f("placedHiddenChest");
        this.m = r2.f("placedTrap1");
        this.o = r2.f("placedTrap2");
    }

    @Override
    public boolean a(net.minecraft.ah.z z2, Random random, b b10) {
        y y2;
        String[] arrstring;
        block30: {
            boolean bl2;
            block29: {
                block28: {
                    int n2;
                    block27: {
                        block26: {
                            block24: {
                                int n3;
                                block23: {
                                    arrstring = u.b();
                                    int n4 = this.a(z2, b10, 0);
                                    if (arrstring != null) {
                                        if (n4 == 0) {
                                            return false;
                                        }
                                        this.a(z2, b10, 0, -4, 0, this.g - 1, 0, this.j - 1, false, random, n);
                                        this.a(z2, b10, 2, 1, 2, 9, 2, 2, false, random, n);
                                        this.a(z2, b10, 2, 1, 12, 9, 2, 12, false, random, n);
                                        this.a(z2, b10, 2, 1, 3, 2, 2, 11, false, random, n);
                                        this.a(z2, b10, 9, 1, 3, 9, 2, 11, false, random, n);
                                        this.a(z2, b10, 1, 3, 1, 10, 6, 1, false, random, n);
                                        this.a(z2, b10, 1, 3, 13, 10, 6, 13, false, random, n);
                                        this.a(z2, b10, 1, 3, 2, 1, 6, 12, false, random, n);
                                        this.a(z2, b10, 10, 3, 2, 10, 6, 12, false, random, n);
                                        this.a(z2, b10, 2, 3, 2, 9, 3, 12, false, random, n);
                                        this.a(z2, b10, 2, 6, 2, 9, 6, 12, false, random, n);
                                        this.a(z2, b10, 3, 7, 3, 8, 7, 11, false, random, n);
                                        this.a(z2, b10, 4, 8, 4, 7, 8, 10, false, random, n);
                                        this.a(z2, b10, 3, 1, 3, 8, 2, 11);
                                        this.a(z2, b10, 4, 3, 6, 7, 3, 9);
                                        this.a(z2, b10, 2, 4, 2, 9, 5, 12);
                                        this.a(z2, b10, 4, 6, 5, 7, 6, 9);
                                        this.a(z2, b10, 5, 7, 6, 6, 7, 8);
                                        this.a(z2, b10, 5, 1, 2, 6, 2, 2);
                                        this.a(z2, b10, 5, 2, 12, 6, 2, 12);
                                        this.a(z2, b10, 5, 5, 1, 6, 5, 1);
                                        this.a(z2, b10, 5, 5, 13, 6, 5, 13);
                                        this.a(z2, net.minecraft.u.g.bf.d(), 1, 5, 5, b10);
                                        this.a(z2, net.minecraft.u.g.bf.d(), 10, 5, 5, b10);
                                        this.a(z2, net.minecraft.u.g.bf.d(), 1, 5, 9, b10);
                                        this.a(z2, net.minecraft.u.g.bf.d(), 10, 5, 9, b10);
                                        n4 = n3 = 0;
                                    }
                                    while (n3 <= 14) {
                                        this.a(z2, b10, 2, 4, n3, 2, 5, n3, false, random, n);
                                        this.a(z2, b10, 4, 4, n3, 4, 5, n3, false, random, n);
                                        this.a(z2, b10, 7, 4, n3, 7, 5, n3, false, random, n);
                                        this.a(z2, b10, 9, 4, n3, 9, 5, n3, false, random, n);
                                        n3 += 14;
                                        if (arrstring != null) {
                                            if (arrstring != null) continue;
                                        }
                                        break block23;
                                    }
                                    this.a(z2, b10, 5, 6, 0, 6, 6, 0, false, random, n);
                                }
                                n3 = 0;
                                while (n3 <= 11) {
                                    block25: {
                                        if (arrstring == null) break block24;
                                        for (int i2 = 2; i2 <= 12; i2 += 2) {
                                            this.a(z2, b10, n3, 4, i2, n3, 5, i2, false, random, n);
                                            if (arrstring != null) {
                                                if (arrstring != null) continue;
                                            }
                                            break block25;
                                        }
                                        this.a(z2, b10, n3, 6, 5, n3, 6, 5, false, random, n);
                                        this.a(z2, b10, n3, 6, 9, n3, 6, 9, false, random, n);
                                        n3 += 11;
                                    }
                                    if (arrstring != null) continue;
                                }
                                this.a(z2, b10, 2, 7, 2, 2, 9, 2, false, random, n);
                                this.a(z2, b10, 9, 7, 2, 9, 9, 2, false, random, n);
                                this.a(z2, b10, 2, 7, 12, 2, 9, 12, false, random, n);
                                this.a(z2, b10, 9, 7, 12, 9, 9, 12, false, random, n);
                                this.a(z2, b10, 4, 9, 4, 4, 9, 4, false, random, n);
                                this.a(z2, b10, 7, 9, 4, 7, 9, 4, false, random, n);
                                this.a(z2, b10, 4, 9, 10, 4, 9, 10, false, random, n);
                                this.a(z2, b10, 7, 9, 10, 7, 9, 10, false, random, n);
                                this.a(z2, b10, 5, 9, 7, 6, 9, 7, false, random, n);
                            }
                            i i3 = net.minecraft.u.g.a0.d().a(cG.V, aA.EAST);
                            i i4 = net.minecraft.u.g.a0.d().a(cG.V, aA.WEST);
                            i i5 = net.minecraft.u.g.a0.d().a(cG.V, aA.SOUTH);
                            i i6 = net.minecraft.u.g.a0.d().a(cG.V, aA.NORTH);
                            this.a(z2, i6, 5, 9, 6, b10);
                            this.a(z2, i6, 6, 9, 6, b10);
                            this.a(z2, i5, 5, 9, 8, b10);
                            this.a(z2, i5, 6, 9, 8, b10);
                            this.a(z2, i6, 4, 0, 0, b10);
                            this.a(z2, i6, 5, 0, 0, b10);
                            this.a(z2, i6, 6, 0, 0, b10);
                            this.a(z2, i6, 7, 0, 0, b10);
                            this.a(z2, i6, 4, 1, 8, b10);
                            this.a(z2, i6, 4, 2, 9, b10);
                            this.a(z2, i6, 4, 3, 10, b10);
                            this.a(z2, i6, 7, 1, 8, b10);
                            this.a(z2, i6, 7, 2, 9, b10);
                            this.a(z2, i6, 7, 3, 10, b10);
                            this.a(z2, b10, 4, 1, 9, 4, 1, 9, false, random, n);
                            this.a(z2, b10, 7, 1, 9, 7, 1, 9, false, random, n);
                            this.a(z2, b10, 4, 1, 10, 7, 2, 10, false, random, n);
                            this.a(z2, b10, 5, 4, 5, 6, 4, 5, false, random, n);
                            this.a(z2, i3, 4, 4, 5, b10);
                            this.a(z2, i4, 7, 4, 5, b10);
                            for (n2 = 0; n2 < 4; ++n2) {
                                this.a(z2, i5, 5, 0 - n2, 6 + n2, b10);
                                this.a(z2, i5, 6, 0 - n2, 6 + n2, b10);
                                this.a(z2, b10, 5, 0 - n2, 7 + n2, 6, 0 - n2, 9 + n2);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block26;
                            }
                            this.a(z2, b10, 1, -3, 12, 10, -1, 13);
                            this.a(z2, b10, 1, -3, 1, 3, -1, 13);
                            this.a(z2, b10, 1, -3, 1, 9, -1, 5);
                        }
                        for (n2 = 1; n2 <= 13; n2 += 2) {
                            this.a(z2, b10, 1, -3, n2, 1, -2, n2, false, random, n);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block27;
                        }
                        n2 = 2;
                    }
                    while (n2 <= 12) {
                        this.a(z2, b10, 1, -1, n2, 3, -1, n2, false, random, n);
                        n2 += 2;
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block28;
                    }
                    this.a(z2, b10, 2, -2, 1, 5, -2, 1, false, random, n);
                    this.a(z2, b10, 7, -2, 1, 9, -2, 1, false, random, n);
                    this.a(z2, b10, 6, -3, 1, 6, -3, 1, false, random, n);
                    this.a(z2, b10, 6, -1, 1, 6, -1, 1, false, random, n);
                    this.a(z2, net.minecraft.u.g.b.d().a(cW.z, aA.EAST).a(cW.B, true), 1, -3, 8, b10);
                    this.a(z2, net.minecraft.u.g.b.d().a(cW.z, aA.WEST).a(cW.B, true), 4, -3, 8, b10);
                    this.a(z2, net.minecraft.u.g.cM.d().a(c2.H, true), 2, -3, 8, b10);
                    this.a(z2, net.minecraft.u.g.cM.d().a(c2.H, true), 3, -3, 8, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 7, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 6, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 5, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 4, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 3, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 2, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 5, -3, 1, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 4, -3, 1, b10);
                    this.a(z2, net.minecraft.u.g.x.d(), 3, -3, 1, b10);
                }
                bl2 = this.m;
                if (arrstring != null) {
                    if (!bl2) {
                        this.m = this.a(z2, b10, random, 3, -2, 1, aA.NORTH, net.minecraft.aj.j.ae);
                    }
                    this.a(z2, net.minecraft.u.g.aW.d().a(cR.E, true), 3, -2, 2, b10);
                    this.a(z2, net.minecraft.u.g.b.d().a(cW.z, aA.NORTH).a(cW.B, true), 7, -3, 1, b10);
                    this.a(z2, net.minecraft.u.g.b.d().a(cW.z, aA.SOUTH).a(cW.B, true), 7, -3, 5, b10);
                    this.a(z2, net.minecraft.u.g.cM.d().a(c2.H, true), 7, -3, 2, b10);
                    this.a(z2, net.minecraft.u.g.cM.d().a(c2.H, true), 7, -3, 3, b10);
                    this.a(z2, net.minecraft.u.g.cM.d().a(c2.H, true), 7, -3, 4, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 8, -3, 6, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 9, -3, 6, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 9, -3, 5, b10);
                    this.a(z2, net.minecraft.u.g.x.d(), 9, -3, 4, b10);
                    this.a(z2, net.minecraft.u.g.bK.d(), 9, -2, 4, b10);
                    bl2 = this.o;
                }
                if (arrstring == null) break block29;
                if (!bl2) {
                    this.o = this.a(z2, b10, random, 9, -2, 3, aA.WEST, net.minecraft.aj.j.ae);
                }
                this.a(z2, net.minecraft.u.g.aW.d().a(cR.C, true), 8, -1, 3, b10);
                this.a(z2, net.minecraft.u.g.aW.d().a(cR.C, true), 8, -2, 3, b10);
                y2 = this;
                if (arrstring == null) break block30;
                bl2 = y2.k;
            }
            if (!bl2) {
                this.k = this.a(z2, b10, random, 8, -3, 3, net.minecraft.aj.j.ap);
            }
            this.a(z2, net.minecraft.u.g.x.d(), 9, -3, 2, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 8, -3, 1, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 4, -3, 5, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 5, -2, 5, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 5, -1, 5, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 6, -3, 5, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 7, -2, 5, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 7, -1, 5, b10);
            this.a(z2, net.minecraft.u.g.x.d(), 8, -3, 5, b10);
            this.a(z2, b10, 9, -1, 1, 9, -1, 5, false, random, n);
            this.a(z2, b10, 8, -3, 8, 10, -1, 10);
            this.a(z2, net.minecraft.u.g.ay.c(co.z), 8, -2, 11, b10);
            this.a(z2, net.minecraft.u.g.ay.c(co.z), 9, -2, 11, b10);
            y2 = this;
        }
        y2.a(z2, net.minecraft.u.g.ay.c(co.z), 10, -2, 11, b10);
        i i7 = net.minecraft.u.g.ao.d().a(bh.C, z.NORTH);
        this.a(z2, i7, 8, -2, 12, b10);
        this.a(z2, i7, 9, -2, 12, b10);
        this.a(z2, i7, 10, -2, 12, b10);
        this.a(z2, b10, 8, -3, 8, 8, -3, 10, false, random, n);
        this.a(z2, b10, 10, -3, 8, 10, -3, 10, false, random, n);
        this.a(z2, net.minecraft.u.g.x.d(), 10, -2, 9, b10);
        this.a(z2, net.minecraft.u.g.bK.d(), 8, -2, 9, b10);
        this.a(z2, net.minecraft.u.g.bK.d(), 8, -2, 10, b10);
        this.a(z2, net.minecraft.u.g.bK.d(), 10, -1, 9, b10);
        this.a(z2, net.minecraft.u.g.M.d().a(aL.z, aA.UP), 9, -2, 8, b10);
        this.a(z2, net.minecraft.u.g.M.d().a(aL.z, aA.WEST), 10, -2, 8, b10);
        this.a(z2, net.minecraft.u.g.M.d().a(aL.z, aA.WEST), 10, -1, 8, b10);
        this.a(z2, net.minecraft.u.g.bB.d().a(bV.z, aA.NORTH), 10, -2, 10, b10);
        boolean bl3 = this.l;
        if (arrstring != null) {
            if (!bl3) {
                this.l = this.a(z2, b10, random, 9, -3, 10, net.minecraft.aj.j.ap);
            }
            bl3 = true;
        }
        return bl3;
    }

    public y() {
    }
}

