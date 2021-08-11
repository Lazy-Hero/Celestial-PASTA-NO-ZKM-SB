/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.bo;
import net.minecraft.ah.z;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class M
extends a {
    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block5: {
            int n3 = 0;
            boolean bl3 = a.c();
            while (n3 < 64) {
                block6: {
                    block7: {
                        K k2;
                        n n4;
                        block8: {
                            n4 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                            if (!bl3) break block6;
                            bl2 = z2.a(n4);
                            if (!bl3) break block5;
                            if (!bl2) break block7;
                            k2 = z2.d(n4.k()).b();
                            if (!bl3) break block8;
                            if (k2 != g.aU) break block7;
                            k2 = g.G;
                        }
                        boolean bl4 = k2.a(z2, n4);
                        if (bl3 && bl4) {
                            bl4 = z2.a(n4, g.G.d().a(bo.z, av.HORIZONTAL.a(random)), 2);
                        }
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

