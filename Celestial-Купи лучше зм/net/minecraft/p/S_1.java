/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class S
extends a {
    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block5: {
            int n3 = 0;
            boolean bl3 = a.c();
            while (n3 < 10) {
                int n4 = n2.e() + random.nextInt(8) - random.nextInt(8);
                int n5 = n2.b() + random.nextInt(4) - random.nextInt(4);
                int n6 = n2.a() + random.nextInt(8) - random.nextInt(8);
                if (bl3) {
                    bl2 = z2.a(new n(n4, n5, n6));
                    if (!bl3) break block5;
                    if (bl2) {
                        boolean bl4 = g.c_.a(z2, new n(n4, n5, n6));
                        if (bl3 && bl4) {
                            bl4 = z2.a(new n(n4, n5, n6), g.c_.d(), 2);
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

