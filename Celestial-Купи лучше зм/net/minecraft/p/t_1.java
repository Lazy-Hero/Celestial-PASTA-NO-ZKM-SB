/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class t
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block8: {
            int n3;
            boolean bl3;
            block7: {
                int n4;
                i i2 = z2.d(n2);
                bl3 = a.d();
                do {
                    i i3;
                    if (i2.o() != c.A) {
                        i3 = i2;
                        if (bl3) continue;
                        if (i3.o() != c.J) break;
                    }
                    n4 = n2.b();
                    if (bl3) break block7;
                    if (n4 <= 0) break;
                    n2 = n2.k();
                    i3 = i2 = z2.d(n2);
                } while (!bl3);
                n4 = n3 = 0;
            }
            while (n3 < 4) {
                n n5 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                if (!bl3) {
                    bl2 = z2.a(n5);
                    if (bl3) break block8;
                    if (bl2) {
                        boolean bl4 = g.b9.a(z2, n5, g.b9.d());
                        if (!bl3 && bl4) {
                            bl4 = z2.a(n5, g.b9.d(), 2);
                        }
                    }
                    ++n3;
                }
                if (!bl3) continue;
            }
            bl2 = true;
        }
        return bl2;
    }
}

