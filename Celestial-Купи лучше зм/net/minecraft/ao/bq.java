/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ao.B;
import net.minecraft.ao.g;
import net.minecraft.ao.t;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.ae;
import net.minecraft.ar.i;
import net.minecraft.k.n;

final class bq
implements g {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(j j2, int n2, B b10, n n3, List<u> list, Random random) {
        boolean bl2;
        block4: {
            ae ae2 = b10.g.g();
            String[] arrstring = u.b();
            B b11 = t.b(list, t.b(j2, b10, new n(-3, 4, -3), "fat_tower_base", ae2, true));
            b11 = t.b(list, t.b(j2, b11, new n(0, 4, 0), "fat_tower_middle", ae2, true));
            int n4 = 0;
            block0: while (true) {
                int n5 = n4;
                block1: while (n5 < 2) {
                    bl2 = random.nextInt(3);
                    if (arrstring == null || arrstring == null) break block4;
                    if (!bl2) break block0;
                    b11 = t.b(list, t.b(j2, b11, new n(0, 8, 0), "fat_tower_middle", ae2, true));
                    for (i i2 : t.c()) {
                        n5 = random.nextBoolean() ? 1 : 0;
                        if (arrstring == null) continue block1;
                        if (n5 != 0) {
                            B b12 = t.b(list, t.b(j2, b11, (n)i2.b(), "bridge_end", ae2.a((ae)((Object)i2.a())), true));
                            t.b(j2, t.g(), n2 + 1, b12, null, list, random);
                        }
                        if (arrstring != null) continue;
                    }
                    ++n4;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            t.b(list, t.b(j2, b11, new n(-2, 8, -2), "fat_tower_top", ae2, true));
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a() {
    }

    bq() {
    }
}

