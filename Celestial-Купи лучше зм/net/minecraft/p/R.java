/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.cR;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class R
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block8: {
            boolean bl3 = a.d();
            block0: while (true) {
                int n3 = n2.b();
                block1: while (n3 < 128) {
                    block10: {
                        block9: {
                            bl2 = z2.a(n2);
                            if (bl3) break block8;
                            if (!bl2) break block9;
                            aA[] arraA = av.HORIZONTAL.a();
                            int n4 = arraA.length;
                            int n5 = 0;
                            while (n5 < n4) {
                                aA aA2 = arraA[n5];
                                if (!bl3) {
                                    n3 = g.aW.a(z2, n2, aA2) ? 1 : 0;
                                    if (bl3) continue block1;
                                    if (n3 != 0) {
                                        i i2 = g.aW.d().a(cR.J, aA2 == aA.NORTH).a(cR.C, aA2 == aA.EAST).a(cR.E, aA2 == aA.SOUTH).a(cR.D, aA2 == aA.WEST);
                                        z2.a(n2, i2, 2);
                                        if (!bl3) break;
                                    }
                                    ++n5;
                                }
                                if (!bl3) continue;
                            }
                            if (!bl3) break block10;
                        }
                        n2 = n2.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
                    }
                    n2 = n2.a();
                    if (!bl3) continue block0;
                }
                break;
            }
            bl2 = true;
        }
        return bl2;
    }
}

