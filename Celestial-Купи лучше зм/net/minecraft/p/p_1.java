/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class p
extends a {
    private final /* synthetic */ int d;
    private final /* synthetic */ K a;

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2 = net.minecraft.p.a.c();
        while (true) {
            block12: {
                int n3;
                block8: {
                    int n4;
                    block11: {
                        block9: {
                            K k2;
                            K k3;
                            block14: {
                                K k4;
                                block13: {
                                    n n5;
                                    z z3;
                                    block10: {
                                        if (n2.b() <= 3) break block9;
                                        z3 = z2;
                                        n5 = n2.k();
                                        if (!bl2) break block10;
                                        n4 = z3.a(n5) ? 1 : 0;
                                        if (!bl2) break block11;
                                        if (n4 != 0 && bl2) break block12;
                                        z3 = z2;
                                        n5 = n2.k();
                                    }
                                    k3 = k4 = z3.d(n5).b();
                                    k2 = g.aU;
                                    if (!bl2) break block13;
                                    if (k3 == k2) break block9;
                                    k3 = k4;
                                    k2 = g.bv;
                                }
                                if (!bl2) break block14;
                                if (k3 == k2) break block9;
                                k3 = k4;
                                k2 = g.bx;
                            }
                            if (k3 != k2 && bl2) break block12;
                        }
                        n4 = n2.b();
                    }
                    if (bl2) {
                        if (n4 <= 3) {
                            return false;
                        }
                        n4 = this.d;
                    }
                    int n6 = n4;
                    int n7 = 0;
                    block1: while (true) {
                        int n8 = n6;
                        block2: while (n8 >= 0) {
                            n3 = n7;
                            if (!bl2 || !bl2) break block8;
                            if (n3 >= 3) break block1;
                            int n9 = n6 + random.nextInt(2);
                            int n10 = n6 + random.nextInt(2);
                            int n11 = n6 + random.nextInt(2);
                            float f10 = (float)(n9 + n10 + n11) * 0.333f + 0.5f;
                            for (n n12 : n.b(n2.a(-n9, -n10, -n11), n2.a(n9, n10, n11))) {
                                double d10 = n12.b(n2) - (double)(f10 * f10);
                                n8 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                if (!bl2) continue block2;
                                if (bl2 && n8 <= 0) {
                                    z2.a(n12, this.a.d(), 4);
                                }
                                if (bl2) continue;
                            }
                            n2 = n2.a(-(n6 + 1) + random.nextInt(2 + n6 * 2), 0 - random.nextInt(2), -(n6 + 1) + random.nextInt(2 + n6 * 2));
                            ++n7;
                            if (bl2) continue block1;
                        }
                        break;
                    }
                    n3 = 1;
                }
                return n3 != 0;
            }
            n2 = n2.k();
        }
    }

    public p(K k2, int n2) {
        super(false);
        this.a = k2;
        this.d = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

