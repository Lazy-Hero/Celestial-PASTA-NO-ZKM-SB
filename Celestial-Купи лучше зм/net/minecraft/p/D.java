/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class D
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2 = a.d();
        z z3 = z2;
        n n3 = n2;
        if (!bl2) {
            if (!z3.a(n3)) {
                return false;
            }
            z3 = z2;
            n3 = n2.a();
        }
        if (!bl2) {
            if (z3.d(n3).b() != g.j) {
                return false;
            }
            z3 = z2;
            n3 = n2;
        }
        z3.a(n3, g.W.d(), 2);
        int n4 = 0;
        while (n4 < 1500) {
            n n5 = n2.a(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
            if (!bl2) {
                i i2 = z2.d(n5);
                block1: while (i2.o() == c.A) {
                    int n6 = 0;
                    for (aA aA2 : aA.values()) {
                        i2 = z2.d(n5.a(aA2));
                        if (bl2) continue block1;
                        if (i2.b() == g.W) {
                            ++n6;
                        }
                        if (n6 > 1 && !bl2) break;
                        if (!bl2) continue;
                    }
                    int n7 = n6;
                    if (bl2 || n7 != true) break;
                    n7 = z2.a(n5, g.W.d(), 2);
                    break;
                }
                ++n4;
            }
            if (!bl2) continue;
        }
        return true;
    }
}

