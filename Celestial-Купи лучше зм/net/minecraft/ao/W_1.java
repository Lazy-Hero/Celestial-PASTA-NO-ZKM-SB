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

public class W
extends I {
    public W() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block3: {
            this.a(z2, b10, 0, 3, 0, 4, 4, 18, g.dk.d(), g.dk.d(), false);
            String[] arrstring = u.b();
            this.a(z2, b10, 1, 5, 0, 3, 7, 18, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 0, 5, 0, 0, 5, 18, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 4, 5, 0, 4, 5, 18, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 4, 2, 5, g.dk.d(), g.dk.d(), false);
            String[] arrstring2 = arrstring;
            this.a(z2, b10, 0, 2, 13, 4, 2, 18, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 0, 0, 4, 1, 3, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 0, 15, 4, 1, 18, g.dk.d(), g.dk.d(), false);
            int n3 = 0;
            while (n3 <= 4) {
                block4: {
                    n2 = 0;
                    if (arrstring2 == null) break block3;
                    for (int i2 = v481523; i2 <= 2; ++i2) {
                        this.b(z2, g.dk.d(), n3, -1, i2, b10);
                        this.b(z2, g.dk.d(), n3, -1, 18 - i2, b10);
                        if (arrstring2 != null) {
                            if (arrstring2 != null) continue;
                        }
                        break block4;
                    }
                    ++n3;
                }
                if (arrstring2 != null) continue;
            }
            this.a(z2, b10, 0, 1, 1, 0, 4, 1, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 3, 4, 0, 4, 4, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 3, 14, 0, 4, 14, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 1, 17, 0, 4, 17, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 4, 1, 1, 4, 4, 1, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 4, 3, 4, 4, 4, 4, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 4, 3, 14, 4, 4, 14, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 4, 1, 17, 4, 4, 17, g.dn.d(), g.dn.d(), false);
            n2 = 1;
        }
        return n2 != 0;
    }

    public static W a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -3, 0, 5, 10, 19, aA2);
        return W.a(b10) && u.a(list, b10) == null ? new W(n5, random, b10, aA2) : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 1, 3, false);
    }

    public W(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }
}

