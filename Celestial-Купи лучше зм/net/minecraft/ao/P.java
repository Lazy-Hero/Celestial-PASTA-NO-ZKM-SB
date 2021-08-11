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

public class P
extends I {
    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 1, 0, true);
        this.a((R)u2, list, random, 0, 1, true);
        this.c((R)u2, list, random, 0, 1, true);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static P a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, aA2);
        return P.a(b10) && u.a(list, b10) == null ? new P(n5, random, b10, aA2) : null;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block3: {
            this.a(z2, b10, 0, 0, 0, 4, 1, 4, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 4, 5, 4, g.bf.d(), g.bf.d(), false);
            String[] arrstring = u.b();
            this.a(z2, b10, 0, 2, 0, 0, 5, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 4, 2, 0, 4, 5, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 4, 0, 5, 4, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 4, 2, 4, 4, 5, 4, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 6, 0, 4, 6, 4, g.dk.d(), g.dk.d(), false);
            String[] arrstring2 = arrstring;
            int n3 = 0;
            while (n3 <= 4) {
                block4: {
                    n2 = 0;
                    if (arrstring2 == null) break block3;
                    for (int i2 = v479055; i2 <= 4; ++i2) {
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

    public P() {
    }

    public P(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }
}

