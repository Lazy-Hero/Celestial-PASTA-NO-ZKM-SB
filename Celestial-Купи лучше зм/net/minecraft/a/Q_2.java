/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.M;
import net.minecraft.A.b;
import net.minecraft.A.h;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

public class Q
extends M {
    @Override
    public void a(z z2, Random random, h h2, n n2) {
        n n3 = z2.G();
        int n4 = 16;
        double d10 = n3.b(n2.a(8, n3.b(), 8));
        boolean bl2 = net.minecraft.A.b.c();
        if (d10 <= 1024.0) {
            n n5 = new n(n3.e() - 16, n3.b() - 1, n3.a() - 16);
            n n6 = new n(n3.e() + 16, n3.b() - 1, n3.a() + 16);
            o o2 = new o(n5);
            int n7 = n2.a();
            block0: while (true) {
                int n8 = n7;
                int n9 = n2.a() + 16;
                block1: while (n8 < n9) {
                    for (int i2 = n2.e(); i2 < n2.e() + 16; ++i2) {
                        int n10;
                        int n11;
                        n8 = n7;
                        n9 = n5.a();
                        if (!bl2) continue block1;
                        if (bl2) {
                            if (n8 < n9) continue;
                            n11 = n7;
                            n10 = n6.a();
                        }
                        if (bl2) {
                            if (n11 > n10) continue;
                            n11 = i2;
                            n10 = n5.e();
                        }
                        if (bl2) {
                            if (n11 < n10) continue;
                            n11 = i2;
                            n10 = n6.e();
                        }
                        if (bl2) {
                            if (n11 > n10) continue;
                            o2.a(i2, o2.b(), n7);
                            n11 = n3.e();
                            if (!bl2) continue;
                            n10 = i2;
                        }
                        if (n11 == n10) {
                            n11 = n3.a();
                            if (!bl2) continue;
                            if (n11 == n7) {
                                z2.a((n)o2, net.minecraft.u.g.cW.d(), 2);
                                if (bl2) continue;
                            }
                        }
                        n11 = z2.a((n)o2, net.minecraft.u.g.bx.d(), 2) ? 1 : 0;
                        if (bl2) continue;
                    }
                    ++n7;
                    if (bl2) continue block0;
                }
                break;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

