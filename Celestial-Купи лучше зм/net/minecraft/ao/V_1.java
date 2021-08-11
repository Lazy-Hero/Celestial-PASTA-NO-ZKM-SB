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

public class V
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    public static V a(List<u> list, Random random, int n2, int n3, int n4, int n5, aA aA2) {
        b b10 = b.a(n2, n3, n4, -2, 0, 0, 7, 11, 7, aA2);
        return V.a(b10) && u.a(list, b10) == null ? new V(n5, random, b10, aA2) : null;
    }

    public V(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block3: {
            this.a(z2, b10, 0, 0, 0, 6, 1, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 6, 10, 6, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 0, 2, 0, 1, 8, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 5, 2, 0, 6, 8, 0, g.dk.d(), g.dk.d(), false);
            String[] arrstring = u.b();
            this.a(z2, b10, 0, 2, 1, 0, 8, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 2, 1, 6, 8, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 2, 6, 5, 8, 6, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 3, 2, 0, 5, 4, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 6, 3, 2, 6, 5, 2, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 6, 3, 4, 6, 5, 4, g.dn.d(), g.dn.d(), false);
            this.a(z2, g.dk.d(), 5, 2, 5, b10);
            this.a(z2, b10, 4, 2, 5, 4, 3, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 3, 2, 5, 3, 4, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 2, 2, 5, 2, 5, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 2, 5, 1, 6, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 7, 1, 5, 7, 4, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 8, 2, 6, 8, 4, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 2, 6, 0, 4, 8, 0, g.dk.d(), g.dk.d(), false);
            String[] arrstring2 = arrstring;
            this.a(z2, b10, 2, 5, 0, 4, 5, 0, g.dn.d(), g.dn.d(), false);
            int n3 = 0;
            while (n3 <= 6) {
                block4: {
                    n2 = 0;
                    if (arrstring2 == null) break block3;
                    for (int i2 = v481254; i2 <= 6; ++i2) {
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

    public V() {
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.c((R)u2, list, random, 6, 2, false);
    }
}

