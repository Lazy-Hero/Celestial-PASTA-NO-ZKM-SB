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

final class e
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(A a10, g g10, List<p> list, int n2, n n3) {
        block5: {
            int n4;
            block10: {
                block11: {
                    boolean bl2;
                    block8: {
                        block9: {
                            int n5;
                            block6: {
                                block7: {
                                    bl2 = r.b();
                                    n4 = n2;
                                    n5 = 100;
                                    if (!bl2) break block6;
                                    if (n4 < n5) break block7;
                                    g10.a(END);
                                    g10.m();
                                    for (p p2 : list) {
                                        p2.b((n)null);
                                        a10.a(p2, p2.a, p2.aF, p2.ax, 6.0f, false);
                                        p2.a();
                                        if (bl2) {
                                            if (bl2) continue;
                                        }
                                        break block5;
                                    }
                                    if (bl2) break block5;
                                }
                                n4 = n2;
                                if (!bl2) break block8;
                                n5 = 80;
                            }
                            if (n4 < n5) break block9;
                            a10.b(3001, new n(0, 128, 0), 0);
                            if (bl2) break block5;
                        }
                        n4 = n2;
                    }
                    if (!bl2) break block10;
                    if (n4 != 0) break block11;
                    for (p p2 : list) {
                        p2.b(new n(0, 128, 0));
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block5;
                    }
                    if (bl2) break block5;
                }
                n4 = n2;
            }
            if (n4 < 5) {
                a10.b(3001, new n(0, 128, 0), 0);
            }
        }
    }
}

