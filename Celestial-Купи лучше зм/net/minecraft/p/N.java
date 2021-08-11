/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class N
extends a {
    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block5: {
            int n3 = 0;
            boolean bl3 = a.c();
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 < 20) {
                    block6: {
                        n n5;
                        block8: {
                            c c10;
                            c c11;
                            block10: {
                                n n6;
                                block9: {
                                    block7: {
                                        n5 = n2.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
                                        if (!bl3) continue block0;
                                        bl2 = z2.a(n5);
                                        if (!bl3) break block5;
                                        if (!bl2) break block6;
                                        n6 = n5.k();
                                        c11 = z2.d(n6.b()).o();
                                        c10 = c.L;
                                        if (!bl3) break block7;
                                        if (c11 == c10) break block8;
                                        c11 = z2.d(n6.m()).o();
                                        c10 = c.L;
                                    }
                                    if (!bl3) break block9;
                                    if (c11 == c10) break block8;
                                    c11 = z2.d(n6.i()).o();
                                    c10 = c.L;
                                }
                                if (!bl3) break block10;
                                if (c11 == c10) break block8;
                                c11 = z2.d(n6.j()).o();
                                c10 = c.L;
                            }
                            if (c11 != c10) break block6;
                        }
                        int n7 = 2 + random.nextInt(random.nextInt(3) + 1);
                        for (int i2 = 0; i2 < n7; ++i2) {
                            n4 = g.aZ.b(z2, n5) ? 1 : 0;
                            if (!bl3) continue block1;
                            if (!bl3 || n4 == 0) continue;
                            z2.a(n5.c(i2), g.aZ.d(), 2);
                            if (bl3) continue;
                        }
                    }
                    ++n3;
                    if (bl3) continue block0;
                }
                break;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

