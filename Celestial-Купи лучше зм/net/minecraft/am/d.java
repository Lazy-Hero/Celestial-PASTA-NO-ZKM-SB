/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.am;

import java.util.List;
import java.util.Random;
import net.minecraft.A.N;
import net.minecraft.J.p;
import net.minecraft.P.r;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.am.a;
import net.minecraft.am.g;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.P;
import net.minecraft.p.X;

final class d
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(A a10, g g10, List<p> list, int n2, n n3) {
        block12: {
            int n4;
            block13: {
                int n5;
                block14: {
                    boolean bl2;
                    block8: {
                        X x2;
                        block9: {
                            int n6;
                            block15: {
                                block16: {
                                    int n7;
                                    block11: {
                                        int n8;
                                        block10: {
                                            int n9 = 40;
                                            bl2 = r.b();
                                            int n10 = n2 % 40;
                                            if (bl2) {
                                                n10 = n10 == 0 ? 1 : 0;
                                            }
                                            n5 = n10;
                                            int n11 = n2 % 40;
                                            if (bl2) {
                                                n11 = n11 == 39 ? 1 : 0;
                                            }
                                            int n12 = n11;
                                            n8 = n5;
                                            if (!bl2) break block10;
                                            if (n8 != 0) break block11;
                                            n8 = n12;
                                        }
                                        if (n8 == 0) break block12;
                                    }
                                    X[] arrx = N.a(a10);
                                    n4 = n7 = n2 / 40;
                                    if (!bl2) break block13;
                                    if (n4 >= arrx.length) break block14;
                                    x2 = arrx[n7];
                                    n6 = n5;
                                    if (!bl2) break block15;
                                    if (n6 == 0) break block16;
                                    for (p object2 : list) {
                                        object2.b(new n(x2.c(), x2.b() + 1, x2.a()));
                                        if (bl2) {
                                            if (bl2) continue;
                                        }
                                        break block8;
                                    }
                                    if (bl2) break block8;
                                }
                                n6 = 10;
                            }
                            int n13 = n6;
                            for (o o2 : n.a(new n(x2.c() - 10, x2.b() - 10, x2.a() - 10), new n(x2.c() + 10, x2.b() + 10, x2.a() + 10))) {
                                a10.v(o2);
                                if (bl2) {
                                    if (bl2) continue;
                                }
                                break block9;
                            }
                            a10.a(null, (float)x2.c() + 0.5f, (double)x2.b(), (double)((float)x2.a() + 0.5f), 5.0f, true);
                        }
                        P p2 = new P();
                        p2.a(x2);
                        p2.a(true);
                        p2.a(new n(0, 128, 0));
                        p2.a((z)a10, new Random(), new n(x2.c(), 45, x2.a()));
                    }
                    if (bl2) break block12;
                }
                n4 = n5;
            }
            if (n4 != 0) {
                g10.a(SUMMONING_DRAGON);
            }
        }
    }
}

