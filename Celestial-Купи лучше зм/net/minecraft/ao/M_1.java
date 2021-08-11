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

public class M
extends I {
    public M(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    public static M a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -3, 0, 0, 9, 7, 9, aA2);
        return M.a(b10) && u.a(list, b10) == null ? new M(n5, random, b10, aA2) : null;
    }

    public M() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        String[] arrstring;
        int n2;
        block7: {
            block6: {
                aA aA2;
                aA aA3;
                block5: {
                    aA aA4;
                    n2 = 1;
                    arrstring = u.b();
                    aA aA2 = aA4 = this.e();
                    aA2 = aA.WEST;
                    if (arrstring == null) break block5;
                    if (aA3 == aA2) break block6;
                    aA aA2 = aA4;
                    aA2 = aA.NORTH;
                }
                if (aA3 != aA2) break block7;
            }
            n2 = 5;
        }
        R r2 = (R)u2;
        boolean bl2 = random.nextInt(8);
        if (arrstring != null) {
            bl2 = bl2 > false;
        }
        this.a(r2, list, random, 0, n2, bl2);
        R r3 = (R)u2;
        boolean bl3 = random.nextInt(8);
        if (arrstring != null) {
            bl3 = bl3 > false;
        }
        this.c(r3, list, random, 0, n2, bl3);
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block3: {
            this.a(z2, b10, 0, 0, 0, 8, 1, 8, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 8, 5, 8, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 0, 6, 0, 8, 6, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 0, 2, 0, 2, 5, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 2, 0, 8, 5, 0, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 3, 0, 1, 4, 0, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 7, 3, 0, 7, 4, 0, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 2, 4, 8, 2, 8, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 1, 4, 2, 2, 4, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 6, 1, 4, 7, 2, 4, g.bf.d(), g.bf.d(), false);
            this.a(z2, b10, 0, 3, 8, 8, 3, 8, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 3, 6, 0, 3, 7, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 8, 3, 6, 8, 3, 7, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 0, 3, 4, 0, 5, 5, g.dk.d(), g.dk.d(), false);
            String[] arrstring = u.b();
            this.a(z2, b10, 8, 3, 4, 8, 5, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 3, 5, 2, 5, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 6, 3, 5, 7, 5, 5, g.dk.d(), g.dk.d(), false);
            this.a(z2, b10, 1, 4, 5, 1, 5, 5, g.dn.d(), g.dn.d(), false);
            this.a(z2, b10, 7, 4, 5, 7, 5, 5, g.dn.d(), g.dn.d(), false);
            String[] arrstring2 = arrstring;
            int n3 = 0;
            while (n3 <= 5) {
                block4: {
                    n2 = 0;
                    if (arrstring2 == null) break block3;
                    for (int i2 = v478352; i2 <= 8; ++i2) {
                        this.b(z2, g.dk.d(), i2, -1, n3, b10);
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
}

