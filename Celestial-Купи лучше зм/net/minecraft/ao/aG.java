/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.bk;
import net.minecraft.W.cV;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class aG
extends aH {
    private /* synthetic */ boolean h;

    public aG() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static aG a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10;
        block5: {
            boolean bl2;
            block4: {
                b10 = b.a(n2, n3, n4, -4, -1, 0, 14, 11, 15, aA2);
                String[] arrstring = u.b();
                bl2 = aG.a(b10);
                if (arrstring == null) break block4;
                if (bl2 && u.a(list, b10) == null) break block5;
                b10 = b.a(n2, n3, n4, -4, -1, 0, 14, 6, 15, aA2);
                bl2 = aG.a(b10);
            }
            if (!bl2 || u.a(list, b10) != null) {
                return null;
            }
        }
        return new aG(n5, random, b10, aA2);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.f("Tall");
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        String[] arrstring;
        block25: {
            block20: {
                int n2;
                block19: {
                    int n3;
                    arrstring = u.b();
                    int n4 = this.a(z2, b10);
                    if (arrstring != null) {
                        if (n4 != 0) {
                            return false;
                        }
                        n4 = 11;
                    }
                    int n5 = n4;
                    boolean bl3 = this.h;
                    if (arrstring != null) {
                        if (!bl3) {
                            n5 = 6;
                        }
                        this.a(z2, b10, 0, 0, 0, 13, n5 - 1, 14, true, random, b7.b());
                        this.a(z2, random, b10, this.g, 4, 1, 0);
                        this.a(z2, b10, random, 0.07f, 2, 1, 1, 11, 4, 13, net.minecraft.u.g.dh.d(), net.minecraft.u.g.dh.d(), false, 0);
                        bl3 = true;
                    }
                    boolean bl4 = bl3;
                    int n6 = 12;
                    n2 = 1;
                    while (n2 <= 13) {
                        block23: {
                            block24: {
                                boolean bl5;
                                block21: {
                                    block22: {
                                        n3 = (n2 - 1) % 4;
                                        if (arrstring == null) break block19;
                                        if (arrstring == null) break block21;
                                        if (n3 != 0) break block22;
                                        this.a(z2, b10, 1, 1, n2, 1, 4, n2, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                                        this.a(z2, b10, 12, 1, n2, 12, 4, n2, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                                        this.a(z2, net.minecraft.u.g.h.d().a(cV.z, aA.EAST), 2, 3, n2, b10);
                                        this.a(z2, net.minecraft.u.g.h.d().a(cV.z, aA.WEST), 11, 3, n2, b10);
                                        if (arrstring == null) break block23;
                                        if (!this.h) break block24;
                                        this.a(z2, b10, 1, 6, n2, 1, 9, n2, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                                        this.a(z2, b10, 12, 6, n2, 12, 9, n2, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                                        if (arrstring != null) break block24;
                                    }
                                    this.a(z2, b10, 1, 1, n2, 1, 4, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                                    this.a(z2, b10, 12, 1, n2, 12, 4, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                                    if (arrstring == null) break block23;
                                    bl5 = this.h;
                                }
                                if (bl5) {
                                    this.a(z2, b10, 1, 6, n2, 1, 9, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                                    this.a(z2, b10, 12, 6, n2, 12, 9, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                                }
                            }
                            ++n2;
                        }
                        if (arrstring != null) continue;
                    }
                    n3 = n2 = 3;
                }
                while (n2 < 12) {
                    this.a(z2, b10, 3, 1, n2, 4, 3, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                    this.a(z2, b10, 6, 1, n2, 7, 3, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                    this.a(z2, b10, 9, 1, n2, 10, 3, n2, net.minecraft.u.g.c8.d(), net.minecraft.u.g.c8.d(), false);
                    n2 += 2;
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block20;
                }
                bl2 = this.h;
                if (arrstring == null) break block25;
                if (bl2) {
                    this.a(z2, b10, 1, 5, 1, 3, 5, 13, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                    this.a(z2, b10, 10, 5, 1, 12, 5, 13, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                    this.a(z2, b10, 4, 5, 1, 9, 5, 2, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                    this.a(z2, b10, 4, 5, 12, 9, 5, 13, net.minecraft.u.g.cB.d(), net.minecraft.u.g.cB.d(), false);
                    this.a(z2, net.minecraft.u.g.cB.d(), 9, 5, 11, b10);
                    this.a(z2, net.minecraft.u.g.cB.d(), 8, 5, 11, b10);
                    this.a(z2, net.minecraft.u.g.cB.d(), 9, 5, 10, b10);
                    this.a(z2, b10, 3, 6, 2, 3, 6, 12, net.minecraft.u.g.bt.d(), net.minecraft.u.g.bt.d(), false);
                    this.a(z2, b10, 10, 6, 2, 10, 6, 10, net.minecraft.u.g.bt.d(), net.minecraft.u.g.bt.d(), false);
                    this.a(z2, b10, 4, 6, 2, 9, 6, 2, net.minecraft.u.g.bt.d(), net.minecraft.u.g.bt.d(), false);
                    this.a(z2, b10, 4, 6, 12, 8, 6, 12, net.minecraft.u.g.bt.d(), net.minecraft.u.g.bt.d(), false);
                    this.a(z2, net.minecraft.u.g.bt.d(), 9, 6, 11, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 8, 6, 11, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 9, 6, 10, b10);
                    i i2 = net.minecraft.u.g.cD.d().a(bk.z, aA.SOUTH);
                    this.a(z2, i2, 10, 1, 13, b10);
                    this.a(z2, i2, 10, 2, 13, b10);
                    this.a(z2, i2, 10, 3, 13, b10);
                    this.a(z2, i2, 10, 4, 13, b10);
                    this.a(z2, i2, 10, 5, 13, b10);
                    this.a(z2, i2, 10, 6, 13, b10);
                    this.a(z2, i2, 10, 7, 13, b10);
                    int n7 = 7;
                    int n8 = 7;
                    this.a(z2, net.minecraft.u.g.bt.d(), 6, 9, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 7, 9, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 6, 8, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 7, 8, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 6, 7, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 7, 7, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 5, 7, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 8, 7, 7, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 6, 7, 6, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 6, 7, 8, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 7, 7, 6, b10);
                    this.a(z2, net.minecraft.u.g.bt.d(), 7, 7, 8, b10);
                    i i3 = net.minecraft.u.g.h.d().a(cV.z, aA.UP);
                    this.a(z2, i3, 5, 8, 7, b10);
                    this.a(z2, i3, 8, 8, 7, b10);
                    this.a(z2, i3, 6, 8, 6, b10);
                    this.a(z2, i3, 6, 8, 8, b10);
                    this.a(z2, i3, 7, 8, 6, b10);
                    this.a(z2, i3, 7, 8, 8, b10);
                }
                this.a(z2, b10, random, 3, 3, 5, net.minecraft.aj.j.aw);
            }
            bl2 = this.h;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, net.minecraft.u.g.bf.d(), 12, 9, 1, b10);
                this.a(z2, b10, random, 12, 8, 1, net.minecraft.aj.j.aw);
            }
            bl2 = true;
        }
        return bl2;
    }

    public aG(int n2, Random random, b b10, aA aA2) {
        String[] arrstring = u.b();
        super(n2);
        this.a(aA2);
        String[] arrstring2 = arrstring;
        this.g = this.a(random);
        this.e = b10;
        int n3 = b10.c();
        if (arrstring2 != null) {
            n3 = n3 > 6 ? 1 : 0;
        }
        this.h = n3;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Tall", this.h);
    }
}

