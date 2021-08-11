/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class y
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block5: {
            float f10 = random.nextInt(3) + 4;
            boolean bl2 = a.d();
            int n4 = 0;
            block0: while (true) {
                float f11;
                float f12 = (f11 = f10 - 0.5f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                block1: while (f12 > 0) {
                    n3 = h.d(-f10);
                    if (bl2) break block5;
                    int n5 = n3;
                    block2: while (true) {
                        int n6 = n5;
                        block3: while (n6 <= h.f(f10)) {
                            f12 = h.d(-f10);
                            if (bl2) continue block1;
                            for (float f13 = v2076300; f13 <= h.f(f10); ++f13) {
                                float f14 = (float)(n5 * n5 + f13 * f13) - (f10 + 1.0f) * (f10 + 1.0f);
                                n6 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                if (bl2) continue block3;
                                if (n6 > 0) continue;
                                this.a(z2, n2.a(n5, n4, (int)f13), g.v.d());
                                if (!bl2) continue;
                            }
                            ++n5;
                            if (!bl2) continue block2;
                        }
                        break;
                    }
                    f10 = (float)((double)f10 - ((double)random.nextInt(2) + 0.5));
                    --n4;
                    if (!bl2) continue block0;
                }
                break;
            }
            n3 = 1;
        }
        return n3 != 0;
    }
}

