/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.R;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class T
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        String[] arrstring;
        block16: {
            int n2;
            int n3;
            block14: {
                int n4;
                block13: {
                    block12: {
                        this.a(z2, b10, 0, 3, 0, 12, 4, 12, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 0, 5, 0, 12, 13, 12, g.bf.d(), g.bf.d(), false);
                        this.a(z2, b10, 0, 5, 0, 1, 12, 12, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 11, 5, 0, 12, 12, 12, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 2, 5, 11, 4, 12, 12, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 8, 5, 11, 10, 12, 12, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 5, 9, 11, 7, 12, 12, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 2, 5, 0, 4, 12, 1, g.dk.d(), g.dk.d(), false);
                        String[] arrstring2 = u.b();
                        this.a(z2, b10, 8, 5, 0, 10, 12, 1, g.dk.d(), g.dk.d(), false);
                        arrstring = arrstring2;
                        this.a(z2, b10, 5, 9, 0, 7, 12, 1, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 2, 11, 2, 10, 12, 10, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 5, 8, 0, 7, 8, 0, g.dn.d(), g.dn.d(), false);
                        for (n3 = 1; n3 <= 11; n3 += 2) {
                            this.a(z2, b10, n3, 10, 0, n3, 11, 0, g.dn.d(), g.dn.d(), false);
                            this.a(z2, b10, n3, 10, 12, n3, 11, 12, g.dn.d(), g.dn.d(), false);
                            this.a(z2, b10, 0, 10, n3, 0, 11, n3, g.dn.d(), g.dn.d(), false);
                            this.a(z2, b10, 12, 10, n3, 12, 11, n3, g.dn.d(), g.dn.d(), false);
                            this.a(z2, g.dk.d(), n3, 13, 0, b10);
                            this.a(z2, g.dk.d(), n3, 13, 12, b10);
                            this.a(z2, g.dk.d(), 0, 13, n3, b10);
                            this.a(z2, g.dk.d(), 12, 13, n3, b10);
                            this.a(z2, g.dn.d(), n3 + 1, 13, 0, b10);
                            this.a(z2, g.dn.d(), n3 + 1, 13, 12, b10);
                            this.a(z2, g.dn.d(), 0, 13, n3 + 1, b10);
                            this.a(z2, g.dn.d(), 12, 13, n3 + 1, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block12;
                        }
                        this.a(z2, g.dn.d(), 0, 13, 0, b10);
                        this.a(z2, g.dn.d(), 0, 13, 12, b10);
                        this.a(z2, g.dn.d(), 0, 13, 0, b10);
                        this.a(z2, g.dn.d(), 12, 13, 0, b10);
                    }
                    for (n3 = 3; n3 <= 9; n3 += 2) {
                        this.a(z2, b10, 1, 7, n3, 1, 8, n3, g.dn.d(), g.dn.d(), false);
                        this.a(z2, b10, 11, 7, n3, 11, 8, n3, g.dn.d(), g.dn.d(), false);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block13;
                    }
                    this.a(z2, b10, 4, 2, 0, 8, 2, 12, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 0, 2, 4, 12, 2, 8, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 4, 0, 0, 8, 1, 3, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 4, 0, 9, 8, 1, 12, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 0, 0, 4, 3, 1, 8, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 9, 0, 4, 12, 1, 8, g.dk.d(), g.dk.d(), false);
                }
                n3 = 4;
                while (n3 <= 8) {
                    block15: {
                        n4 = 0;
                        if (arrstring == null) break block14;
                        for (n2 = v477797; n2 <= 2; ++n2) {
                            this.b(z2, g.dk.d(), n3, -1, n2, b10);
                            this.b(z2, g.dk.d(), n3, -1, 12 - n2, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block15;
                        }
                        ++n3;
                    }
                    if (arrstring != null) continue;
                }
                n4 = n3 = 0;
            }
            while (n3 <= 2) {
                block17: {
                    if (arrstring == null) break block16;
                    for (n2 = 4; n2 <= 8; ++n2) {
                        this.b(z2, g.dk.d(), n3, -1, n2, b10);
                        this.b(z2, g.dk.d(), 12 - n3, -1, n2, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block17;
                    }
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 5, 5, 5, 7, 5, 7, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 1, 6, 6, 4, 6, g.bf.d(), g.bf.d(), false);
            this.a(z2, g.dk.d(), 6, 0, 6, b10);
        }
        i i2 = g.ag.d();
        this.a(z2, i2, 6, 5, 6, b10);
        n n5 = new n(this.b(6, 6), this.a(5), this.a(6, 6));
        boolean bl2 = b10.a(n5);
        if (arrstring != null) {
            if (bl2) {
                z2.a(n5, i2, random);
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 5, 3, true);
    }

    public T(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    public static T a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, aA2);
        return T.a(b10) && u.a(list, b10) == null ? new T(n5, random, b10, aA2) : null;
    }

    public T() {
    }
}

