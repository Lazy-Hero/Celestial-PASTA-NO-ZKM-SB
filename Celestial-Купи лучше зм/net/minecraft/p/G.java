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

public class G
extends a {
    private final /* synthetic */ int a;
    private final /* synthetic */ K d;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block13: {
            int n4;
            int n5;
            boolean bl2;
            block12: {
                bl2 = net.minecraft.p.a.d();
                while (z2.a(n2)) {
                    n n6 = n2;
                    if (!bl2) {
                        n5 = n6.b();
                        n4 = 2;
                        if (bl2) break block12;
                        if (n5 <= n4) break;
                        n6 = n2 = n2.k();
                    }
                    if (!bl2) continue;
                }
                if (z2.d(n2).b() != g.da) {
                    return false;
                }
                n5 = random.nextInt(this.a - 2);
                n4 = 2;
            }
            int n7 = n5 + n4;
            boolean bl3 = true;
            int n8 = n2.e() - n7;
            block1: while (true) {
                int n9 = n8;
                int n10 = n2.e() + n7;
                block2: while (n9 <= n10) {
                    n3 = n2.a() - n7;
                    if (bl2) break block13;
                    int n11 = n3;
                    while (n11 <= n2.a() + n7) {
                        block14: {
                            block15: {
                                int n12 = n8 - n2.e();
                                int n13 = n11 - n2.a();
                                if (bl2) break block14;
                                n9 = n12 * n12 + n13 * n13;
                                n10 = n7 * n7;
                                if (bl2) continue block2;
                                if (n9 > n10) break block15;
                                for (int i2 = n2.b() - 1; i2 <= n2.b() + 1; ++i2) {
                                    n n14;
                                    block17: {
                                        K k2;
                                        K k3;
                                        block18: {
                                            K k4;
                                            block16: {
                                                n14 = new n(n8, i2, n11);
                                                k4 = z2.d(n14).b();
                                                if (bl2) break block14;
                                                k3 = k4;
                                                k2 = g.bv;
                                                if (bl2) break block16;
                                                if (k3 == k2) break block17;
                                                k3 = k4;
                                                k2 = g.da;
                                            }
                                            if (bl2) break block18;
                                            if (k3 == k2) break block17;
                                            k3 = k4;
                                            k2 = g.cF;
                                        }
                                        if (k3 != k2) continue;
                                    }
                                    z2.a(n14, this.d.d(), 2);
                                    if (!bl2) continue;
                                }
                            }
                            ++n11;
                        }
                        if (!bl2) continue;
                    }
                    ++n8;
                    if (!bl2) continue block1;
                }
                break;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public G(int n2) {
        this.d = g.cq;
        this.a = n2;
    }
}

