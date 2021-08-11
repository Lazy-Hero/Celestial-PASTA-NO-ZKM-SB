/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class r
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block4: {
            int n3 = 0;
            boolean bl3 = a.c();
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 < 10) {
                    n n5 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                    if (!bl3) continue block0;
                    bl2 = z2.a(n5);
                    if (!bl3) break block4;
                    if (bl2) {
                        int n6 = 1 + random.nextInt(random.nextInt(3) + 1);
                        for (int i2 = 0; i2 < n6; ++i2) {
                            n4 = g.aA.b(z2, n5) ? 1 : 0;
                            if (!bl3) continue block1;
                            if (!bl3 || n4 == 0) continue;
                            z2.a(n5.c(i2), g.aA.d(), 2);
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
}

