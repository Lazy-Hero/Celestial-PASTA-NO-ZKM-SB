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

public class s
extends a {
    private final /* synthetic */ K a;
    private final /* synthetic */ int d;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block8: {
            boolean bl2 = net.minecraft.p.a.c();
            if (z2.d(n2).o() != c.L) {
                return false;
            }
            int n4 = random.nextInt(this.d - 2) + 2;
            boolean bl3 = true;
            int n5 = n2.e() - n4;
            block0: while (true) {
                int n6 = n5;
                int n7 = n2.e() + n4;
                block1: while (n6 <= n7) {
                    n3 = n2.a() - n4;
                    if (!bl2) break block8;
                    int n8 = n3;
                    while (n8 <= n2.a() + n4) {
                        block9: {
                            block10: {
                                int n9 = n5 - n2.e();
                                int n10 = n8 - n2.a();
                                if (!bl2) break block9;
                                n6 = n9 * n9 + n10 * n10;
                                n7 = n4 * n4;
                                if (!bl2) continue block1;
                                if (n6 > n7) break block10;
                                for (int i2 = n2.b() - 1; i2 <= n2.b() + 1; ++i2) {
                                    n n11;
                                    block12: {
                                        K k2;
                                        K k3;
                                        block11: {
                                            n11 = new n(n5, i2, n8);
                                            K k4 = z2.d(n11).b();
                                            if (!bl2) break block9;
                                            k3 = k4;
                                            k2 = g.bv;
                                            if (!bl2) break block11;
                                            if (k3 == k2) break block12;
                                            k3 = k4;
                                            k2 = g.d;
                                        }
                                        if (k3 != k2) continue;
                                    }
                                    z2.a(n11, this.a.d(), 2);
                                    if (bl2) continue;
                                }
                            }
                            ++n8;
                        }
                        if (bl2) continue;
                    }
                    ++n5;
                    if (bl2) continue block0;
                }
                break;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public s(int n2) {
        this.a = g.d;
        this.d = n2;
    }
}

