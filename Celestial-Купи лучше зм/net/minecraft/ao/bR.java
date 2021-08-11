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

final class bR
implements g {
    @Override
    public boolean a(j j2, int n2, B b10, n n3, List<u> list, Random random) {
        boolean bl2;
        block15: {
            block17: {
                B b11;
                ae ae2;
                block19: {
                    int n4;
                    block18: {
                        int n5;
                        block14: {
                            String[] arrstring;
                            block16: {
                                ae2 = b10.g.g();
                                b11 = t.b(list, t.b(j2, b10, new n(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", ae2, true));
                                arrstring = u.b();
                                B b12 = t.b(list, t.b(j2, b11, new n(0, 7, 0), "tower_piece", ae2, true));
                                if (arrstring != null) {
                                    b11 = b12;
                                    b12 = random.nextInt(3) == 0 ? b11 : null;
                                }
                                B b13 = b12;
                                int n6 = 1 + random.nextInt(3);
                                int n7 = 0;
                                while (n7 < n6) {
                                    b11 = t.b(list, t.b(j2, b11, new n(0, 4, 0), "tower_piece", ae2, true));
                                    if (arrstring != null) {
                                        n4 = n7;
                                        n5 = n6 - 1;
                                        if (arrstring == null) break block14;
                                        if (n4 < n5 && random.nextBoolean()) {
                                            b13 = b11;
                                        }
                                        ++n7;
                                    }
                                    if (arrstring != null) continue;
                                }
                                if (b13 == null) break block16;
                                for (i i2 : t.h()) {
                                    bl2 = random.nextBoolean();
                                    if (arrstring != null) {
                                        if (bl2) {
                                            B b14 = t.b(list, t.b(j2, b13, (n)i2.b(), "bridge_end", ae2.a((ae)((Object)i2.a())), true));
                                            t.b(j2, t.g(), n2 + 1, b14, null, list, random);
                                        }
                                        if (arrstring != null) continue;
                                    }
                                    break block15;
                                }
                                t.b(list, t.b(j2, b11, new n(-1, 4, -1), "tower_top", ae2, true));
                                break block17;
                            }
                            n4 = n2;
                            if (arrstring == null) break block18;
                            n5 = 7;
                        }
                        if (n4 == n5) break block19;
                        n4 = t.b(j2, t.f(), n2 + 1, b11, null, list, random) ? 1 : 0;
                    }
                    return n4 != 0;
                }
                t.b(list, t.b(j2, b11, new n(-1, 4, -1), "tower_top", ae2, true));
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
    }

    bR() {
    }
}

