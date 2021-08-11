/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.G;
import net.minecraft.ao.aQ;
import net.minecraft.ao.ac;
import net.minecraft.ao.u;

public class bw
extends ac {
    private /* synthetic */ aQ e;

    private static gP a(gP gP2) {
        return gP2;
    }

    public bw() {
    }

    public bw(z z2, Random random, int n2, int n3, aQ aQ2) {
        block6: {
            bw bw2;
            block7: {
                block8: {
                    super(n2, n3);
                    this.e = aQ2;
                    String[] arrstring = u.b();
                    G g10 = new G(0, random, (n2 << 4) + 2, (n3 << 4) + 2, this.e);
                    this.c.add(g10);
                    g10.a(g10, this.c, random);
                    bw2 = this;
                    if (arrstring == null) break block7;
                    bw2.c();
                    if (aQ2 != aQ.MESA) break block8;
                    int n4 = -5;
                    int n5 = z2.y() - this.b.b + this.b.c() / 2 - -5;
                    this.b.a(0, n5, 0);
                    for (u u2 : this.c) {
                        u2.a(0, n5, 0);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block6;
                    }
                    if (arrstring != null) break block6;
                }
                bw2 = this;
            }
            bw2.a(z2, random, 10);
        }
    }
}

