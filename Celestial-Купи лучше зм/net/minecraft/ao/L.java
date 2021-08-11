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
import net.minecraft.u.g;

public class L
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static L a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -7, 0, 5, 14, 10, aA2);
        return L.a(b10) && u.a(list, b10) == null ? new L(n5, random, b10, aA2) : null;
    }

    public L() {
    }

    public L(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 1, 0, true);
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block7: {
            i i2 = g.aP.d().a(cG.V, aA.SOUTH);
            String[] arrstring = u.b();
            int n3 = 0;
            while (n3 <= 9) {
                block8: {
                    int n4;
                    int n5;
                    int n6 = Math.max(1, 7 - n3);
                    int n7 = Math.min(Math.max(n6 + 5, 14 - n3), 13);
                    int n8 = n3;
                    this.a(z2, b10, 0, 0, n3, 4, n6, n3, g.dk.d(), g.dk.d(), false);
                    this.a(z2, b10, 1, n6 + 1, n3, 3, n7 - 1, n3, g.bf.d(), g.bf.d(), false);
                    n2 = n3;
                    if (arrstring == null) break block7;
                    int n9 = 6;
                    if (arrstring != null) {
                        if (n2 <= n9) {
                            this.a(z2, i2, 1, n6 + 1, n3, b10);
                            this.a(z2, i2, 2, n6 + 1, n3, b10);
                            this.a(z2, i2, 3, n6 + 1, n3, b10);
                        }
                        this.a(z2, b10, 0, n7, n3, 4, n7, n3, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 0, n6 + 1, n3, 0, n7 - 1, n3, g.dk.d(), g.dk.d(), false);
                        this.a(z2, b10, 4, n6 + 1, n3, 4, n7 - 1, n3, g.dk.d(), g.dk.d(), false);
                        n5 = n3;
                        n9 = 1;
                    }
                    int n10 = n5 & n9;
                    if (arrstring != null) {
                        if (n10 == 0) {
                            this.a(z2, b10, 0, n6 + 2, n3, 0, n6 + 3, n3, g.dn.d(), g.dn.d(), false);
                            this.a(z2, b10, 4, n6 + 2, n3, 4, n6 + 3, n3, g.dn.d(), g.dn.d(), false);
                        }
                        n10 = n4 = 0;
                    }
                    while (n4 <= 4) {
                        this.b(z2, g.dk.d(), n4, -1, n8, b10);
                        ++n4;
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block8;
                    }
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }
}

