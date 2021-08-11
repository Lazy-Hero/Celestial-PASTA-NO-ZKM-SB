/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class O
extends a {
    private final /* synthetic */ int a;
    private final /* synthetic */ K d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public O(K k2, int n2) {
        this.d = k2;
        this.a = n2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block8: {
            boolean bl2 = net.minecraft.p.a.d();
            if (z2.d(n2).o() != c.L) {
                return false;
            }
            int n4 = random.nextInt(this.a - 2) + 2;
            int n5 = 2;
            int n6 = n2.e() - n4;
            block0: while (true) {
                int n7 = n6;
                int n8 = n2.e() + n4;
                block1: while (n7 <= n8) {
                    n3 = n2.a() - n4;
                    if (bl2) break block8;
                    int n9 = n3;
                    while (n9 <= n2.a() + n4) {
                        block9: {
                            block10: {
                                int n10 = n6 - n2.e();
                                int n11 = n9 - n2.a();
                                if (bl2) break block9;
                                n7 = n10 * n10 + n11 * n11;
                                n8 = n4 * n4;
                                if (bl2) continue block1;
                                if (n7 > n8) break block10;
                                for (int i2 = n2.b() - 2; i2 <= n2.b() + 2; ++i2) {
                                    n n12;
                                    block12: {
                                        K k2;
                                        block11: {
                                            n12 = new n(n6, i2, n9);
                                            K k3 = z2.d(n12).b();
                                            if (bl2) break block9;
                                            k2 = k3;
                                            if (bl2) break block11;
                                            if (k2 == g.bv) break block12;
                                            k2 = k3;
                                        }
                                        if (k2 != g.aU) continue;
                                    }
                                    z2.a(n12, this.d.d(), 2);
                                    if (!bl2) continue;
                                }
                            }
                            ++n9;
                        }
                        if (!bl2) continue;
                    }
                    ++n6;
                    if (!bl2) continue block0;
                }
                break;
            }
            n3 = 1;
        }
        return n3 != 0;
    }
}

