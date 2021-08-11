/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.Y;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;

public class q
extends a {
    private final /* synthetic */ Y a;

    public q(Y y2) {
        this.a = y2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block5: {
            int n3 = 0;
            boolean bl3 = net.minecraft.p.a.c();
            while (n3 < 64) {
                block6: {
                    block7: {
                        int n4;
                        n n5;
                        block8: {
                            block9: {
                                n5 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                                if (!bl3) break block6;
                                bl2 = z2.a(n5);
                                if (!bl3) break block5;
                                if (!bl2) break block7;
                                n4 = z2.D.b();
                                if (!bl3) break block8;
                                if (n4 == 0) break block9;
                                n4 = n5.b();
                                if (!bl3) break block8;
                                if (n4 >= 255) break block7;
                            }
                            n4 = this.a.a(z2, n5, this.a.d()) ? 1 : 0;
                        }
                        if (bl3 && n4 != 0) {
                            n4 = z2.a(n5, this.a.d(), 2) ? 1 : 0;
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

