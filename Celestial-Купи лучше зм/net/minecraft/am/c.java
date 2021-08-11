/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.am;

import java.util.List;
import net.minecraft.J.p;
import net.minecraft.P.r;
import net.minecraft.ah.A;
import net.minecraft.am.a;
import net.minecraft.am.g;
import net.minecraft.k.n;

final class c
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(A a10, g g10, List<p> list, int n2, n n3) {
        block9: {
            block3: {
                boolean bl2;
                block5: {
                    int n4;
                    int n5;
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    block2: {
                                        bl2 = r.g();
                                        n5 = n2;
                                        if (bl2) break block2;
                                        if (n5 >= 100) break block3;
                                        n5 = n2;
                                    }
                                    if (bl2) break block4;
                                    if (n5 == 0) break block5;
                                    n5 = n2;
                                }
                                n4 = 50;
                                if (bl2) break block6;
                                if (n5 == n4) break block5;
                                n5 = n2;
                                n4 = 51;
                            }
                            if (bl2) break block7;
                            if (n5 == n4) break block5;
                            n5 = n2;
                            n4 = 52;
                        }
                        if (bl2) break block8;
                        if (n5 == n4) break block5;
                        n5 = n2;
                        n4 = 95;
                    }
                    if (n5 < n4) break block9;
                }
                a10.b(3001, new n(0, 128, 0), 0);
                if (!bl2) break block9;
            }
            g10.a(SUMMONING_PILLARS);
        }
    }
}

