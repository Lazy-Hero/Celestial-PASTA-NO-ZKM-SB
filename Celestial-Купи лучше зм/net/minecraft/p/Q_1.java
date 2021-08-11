/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.aX;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class Q
extends a {
    private final /* synthetic */ i a;

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block8: {
            int n3;
            boolean bl3;
            block7: {
                int n4;
                i i2 = z2.d(n2);
                bl3 = net.minecraft.p.a.d();
                do {
                    i i3;
                    if (i2.o() != c.A) {
                        i3 = i2;
                        if (bl3) continue;
                        if (i3.o() != c.J) break;
                    }
                    n4 = n2.b();
                    if (bl3) break block7;
                    if (n4 <= 0) break;
                    n2 = n2.k();
                    i3 = i2 = z2.d(n2);
                } while (!bl3);
                n4 = n3 = 0;
            }
            while (n3 < 128) {
                n n5 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                if (!bl3) {
                    bl2 = z2.a(n5);
                    if (bl3) break block8;
                    if (bl2) {
                        boolean bl4 = g.dc.a(z2, n5, this.a);
                        if (!bl3 && bl4) {
                            bl4 = z2.a(n5, this.a, 2);
                        }
                    }
                    ++n3;
                }
                if (!bl3) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    public Q(e e10) {
        this.a = g.dc.d().a(aX.B, e10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

