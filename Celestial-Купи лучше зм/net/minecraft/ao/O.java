/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.R;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class O
extends I {
    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 2, 0, false);
        this.a((R)u2, list, random, 0, 2, false);
        this.c((R)u2, list, random, 0, 2, false);
    }

    public O(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block3: {
            this.a(z2, b10, 0, 0, 0, 6, 1, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 6, 7, 6, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 0, 2, 0, 1, 6, 0, g.dk.d(), g.dk.d(), false);
            String[] arrstring = u.b();
            this.a(z2, b10, 0, 2, 6, 1, 6, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 5, 2, 0, 6, 6, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 5, 2, 6, 6, 6, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 0, 6, 1, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 5, 0, 6, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 2, 0, 6, 6, 1, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 2, 5, 6, 6, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 2, 6, 0, 4, 6, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 2, 5, 0, 4, 5, 0, g.dn.d(), g.dn.d(), false);
            String[] arrstring2 = arrstring;
            this.a(z2, b10, 2, 6, 6, 4, 6, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 2, 5, 6, 4, 5, 6, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 6, 2, 0, 6, 4, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 5, 2, 0, 5, 4, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 6, 6, 2, 6, 6, 4, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 5, 2, 6, 5, 4, g.dn.d(), g.dn.d(), false);
            int n3 = 0;
            while (n3 <= 6) {
                block4: {
                    n2 = 0;
                    if (arrstring2 == null) break block3;
                    for (int i2 = v478853; i2 <= 6; ++i2) {
                        this.b(z2, g.dk.d(), n3, -1, i2, b10);
                        if (arrstring2 != null) {
                            if (arrstring2 != null) continue;
                        }
                        break block4;
                    }
                    ++n3;
                }
                if (arrstring2 != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public O() {
    }

    public static O a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -2, 0, 0, 7, 9, 7, aA2);
        return O.a(b10) && u.a(list, b10) == null ? new O(n5, random, b10, aA2) : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

