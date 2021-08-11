/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class K
extends a {
    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block3: {
            int n3 = 0;
            boolean bl3 = a.c();
            while (n3 < 64) {
                block4: {
                    block5: {
                        n n4;
                        z z3;
                        block6: {
                            n n5 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                            if (!bl3) break block4;
                            bl2 = g.ae.a(z2, n5);
                            if (!bl3) break block3;
                            if (!bl2) break block5;
                            z3 = z2;
                            n4 = n5.k();
                            if (!bl3) break block6;
                            if (z3.d(n4).b() != g.aU) break block5;
                            z3 = z2;
                            n4 = n5;
                        }
                        z3.a(n4, g.ae.d(), 2);
                    }
                    ++n3;
                }
                if (bl3) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

