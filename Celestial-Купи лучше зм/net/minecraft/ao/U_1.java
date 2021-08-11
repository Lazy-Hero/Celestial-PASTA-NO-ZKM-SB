/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.W.cG;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.R;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.k.m;
import net.minecraft.u.g;

public class U
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static U a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, aA2);
        return U.a(b10) && u.a(list, b10) == null ? new U(n5, random, b10, aA2) : null;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block30: {
            block25: {
                int n3;
                int n4;
                String[] arrstring;
                block23: {
                    int n5;
                    i i2;
                    block22: {
                        int n6;
                        block20: {
                            int n7;
                            int n8;
                            block19: {
                                this.a(z2, b10, 0, 3, 0, 12, 4, 12, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 0, 5, 0, 12, 13, 12, g.bf.d(), g.bf.d(), false);
                                this.a(z2, b10, 0, 5, 0, 1, 12, 12, g.dk.d(), g.dk.d(), false);
                                String[] arrstring2 = u.b();
                                this.a(z2, b10, 11, 5, 0, 12, 12, 12, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 2, 5, 11, 4, 12, 12, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 8, 5, 11, 10, 12, 12, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 5, 9, 11, 7, 12, 12, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 2, 5, 0, 4, 12, 1, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 8, 5, 0, 10, 12, 1, g.dk.d(), g.dk.d(), false);
                                this.a(z2, b10, 5, 9, 0, 7, 12, 1, g.dk.d(), g.dk.d(), false);
                                arrstring = arrstring2;
                                this.a(z2, b10, 2, 11, 2, 10, 12, 10, g.dk.d(), g.dk.d(), false);
                                for (n8 = 1; n8 <= 11; n8 += 2) {
                                    this.a(z2, b10, n8, 10, 0, n8, 11, 0, g.dn.d(), g.dn.d(), false);
                                    this.a(z2, b10, n8, 10, 12, n8, 11, 12, g.dn.d(), g.dn.d(), false);
                                    this.a(z2, b10, 0, 10, n8, 0, 11, n8, g.dn.d(), g.dn.d(), false);
                                    this.a(z2, b10, 12, 10, n8, 12, 11, n8, g.dn.d(), g.dn.d(), false);
                                    this.a(z2, g.dk.d(), n8, 13, 0, b10);
                                    this.a(z2, g.dk.d(), n8, 13, 12, b10);
                                    this.a(z2, g.dk.d(), 0, 13, n8, b10);
                                    this.a(z2, g.dk.d(), 12, 13, n8, b10);
                                    this.a(z2, g.dn.d(), n8 + 1, 13, 0, b10);
                                    this.a(z2, g.dn.d(), n8 + 1, 13, 12, b10);
                                    this.a(z2, g.dn.d(), 0, 13, n8 + 1, b10);
                                    this.a(z2, g.dn.d(), 12, 13, n8 + 1, b10);
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block19;
                                }
                                this.a(z2, g.dn.d(), 0, 13, 0, b10);
                                this.a(z2, g.dn.d(), 0, 13, 12, b10);
                                this.a(z2, g.dn.d(), 0, 13, 0, b10);
                                this.a(z2, g.dn.d(), 12, 13, 0, b10);
                            }
                            for (n8 = 3; n8 <= 9; n8 += 2) {
                                this.a(z2, b10, 1, 7, n8, 1, 8, n8, g.dn.d(), g.dn.d(), false);
                                this.a(z2, b10, 11, 7, n8, 11, 8, n8, g.dn.d(), g.dn.d(), false);
                                if (arrstring != null) continue;
                            }
                            i2 = g.aP.d().a(cG.V, aA.NORTH);
                            for (n6 = 0; n6 <= 6; ++n6) {
                                int n9;
                                int n10;
                                int n11;
                                block29: {
                                    block28: {
                                        block27: {
                                            block21: {
                                                n11 = n6 + 4;
                                                n7 = 5;
                                                if (arrstring == null) break block20;
                                                for (n4 = v480487; n4 <= 7; ++n4) {
                                                    this.a(z2, i2, n4, 5 + n6, n11, b10);
                                                    if (arrstring != null) {
                                                        if (arrstring != null) continue;
                                                    }
                                                    break block21;
                                                }
                                                n10 = n11;
                                                n9 = 5;
                                                if (arrstring == null) break block27;
                                                if (n10 < n9) break block21;
                                                n10 = n11;
                                                n9 = 8;
                                                if (arrstring == null) break block27;
                                                if (n10 > n9) break block21;
                                                this.a(z2, b10, 5, 5, n11, 7, n6 + 4, n11, g.dk.d(), g.dk.d(), false);
                                                if (arrstring != null) break block28;
                                            }
                                            n10 = n11;
                                            n9 = 9;
                                        }
                                        if (arrstring == null) break block29;
                                        if (n10 < n9) break block28;
                                        n10 = n11;
                                        n9 = 10;
                                        if (arrstring == null) break block29;
                                        if (n10 <= n9) {
                                            this.a(z2, b10, 5, 8, n11, 7, n6 + 4, n11, g.dk.d(), g.dk.d(), false);
                                        }
                                    }
                                    n10 = n6;
                                    n9 = 1;
                                }
                                if (n10 < n9) continue;
                                this.a(z2, b10, 5, 6 + n6, n11, 7, 9 + n6, n11, g.bf.d(), g.bf.d(), false);
                                if (arrstring != null) continue;
                            }
                            n7 = n6 = 5;
                        }
                        while (n6 <= 7) {
                            this.a(z2, i2, n6, 12, 11, b10);
                            ++n6;
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block22;
                        }
                        this.a(z2, b10, 5, 6, 7, 5, 7, 7, g.dn.d(), g.dn.d(), false);
                        this.a(z2, b10, 7, 6, 7, 7, 7, 7, g.dn.d(), g.dn.d(), false);
                        this.a(z2, b10, 5, 13, 12, 7, 13, 12, g.bf.d(), g.bf.d(), false);
                        this.a(z2, b10, 2, 5, 2, 3, 5, 3, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 2, 5, 9, 3, 5, 10, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 2, 5, 4, 2, 5, 8, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 9, 5, 2, 10, 5, 3, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 9, 5, 9, 10, 5, 10, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 10, 5, 4, 10, 5, 8, g.dk.d(), g.dk.d(), false);
                    }
                    i i3 = i2.a(cG.V, aA.EAST);
                    i i4 = i2.a(cG.V, aA.WEST);
                    this.a(z2, i4, 4, 5, 2, b10);
                    this.a(z2, i4, 4, 5, 3, b10);
                    this.a(z2, i4, 4, 5, 9, b10);
                    this.a(z2, i4, 4, 5, 10, b10);
                    this.a(z2, i3, 8, 5, 2, b10);
                    this.a(z2, i3, 8, 5, 3, b10);
                    this.a(z2, i3, 8, 5, 9, b10);
                    this.a(z2, i3, 8, 5, 10, b10);
                    this.a(z2, b10, 3, 4, 4, 4, 4, 8, g.br.d(), g.br.d(), false);
                    this.a(z2, b10, 8, 4, 4, 9, 4, 8, g.br.d(), g.br.d(), false);
                    this.a(z2, b10, 3, 5, 4, 4, 5, 8, g.cE.d(), g.cE.d(), false);
                    this.a(z2, b10, 8, 5, 4, 9, 5, 8, g.cE.d(), g.cE.d(), false);
                    this.a(z2, b10, 4, 2, 0, 8, 2, 12, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 0, 2, 4, 12, 2, 8, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 4, 0, 0, 8, 1, 3, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 4, 0, 9, 8, 1, 12, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 0, 0, 4, 3, 1, 8, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 9, 0, 4, 12, 1, 8, g.dk.d(), g.dk.d(), false);
                    n4 = 4;
                    while (n4 <= 8) {
                        block24: {
                            n5 = 0;
                            if (arrstring == null) break block23;
                            for (n3 = v480857; n3 <= 2; ++n3) {
                                this.b(z2, g.dk.d(), n4, -1, n3, b10);
                                this.b(z2, g.dk.d(), n4, -1, 12 - n3, b10);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block24;
                            }
                            ++n4;
                        }
                        if (arrstring != null) continue;
                    }
                    n5 = n4 = 0;
                }
                while (n4 <= 2) {
                    block26: {
                        n2 = 4;
                        if (arrstring == null) break block25;
                        for (n3 = v480885; n3 <= 8; ++n3) {
                            this.b(z2, g.dk.d(), n4, -1, n3, b10);
                            this.b(z2, g.dk.d(), 12 - n4, -1, n3, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block26;
                        }
                        ++n4;
                    }
                    if (arrstring != null) continue;
                }
                n2 = 1;
            }
            if (m.d()) break block30;
            u.b(new String[2]);
        }
        return n2 != 0;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 5, 3, true);
        this.b((R)u2, list, random, 5, 11, true);
    }

    public U() {
    }

    public U(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }
}

