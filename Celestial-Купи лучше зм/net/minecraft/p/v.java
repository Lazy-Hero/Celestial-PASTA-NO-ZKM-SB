/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.d2;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class v
extends a {
    private /* synthetic */ d2 a;

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block3: {
            int n4 = 0;
            boolean bl2 = net.minecraft.p.a.c();
            int n5 = 0;
            while (n5 < 64) {
                block4: {
                    block5: {
                        int n6;
                        block8: {
                            n n7;
                            block6: {
                                block7: {
                                    n7 = n2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
                                    if (!bl2) break block4;
                                    n3 = z2.a(n7);
                                    if (!bl2) break block3;
                                    if (n3 == 0) break block5;
                                    n6 = z2.D.b();
                                    if (!bl2) break block6;
                                    if (n6 == 0) break block7;
                                    n6 = n7.b();
                                    if (!bl2) break block6;
                                    if (n6 >= 254) break block5;
                                }
                                n6 = g.bW.a(z2, n7) ? 1 : 0;
                            }
                            if (!bl2) break block8;
                            if (n6 == 0) break block5;
                            g.bW.a(z2, n7, this.a, 2);
                            n6 = 1;
                        }
                        n4 = n6;
                    }
                    ++n5;
                }
                if (bl2) continue;
            }
            n3 = n4;
        }
        return n3 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(d2 d22) {
        this.a = d22;
    }
}

