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
import net.minecraft.k.n;

final class bW
implements g {
    public /* synthetic */ boolean a;

    bW() {
    }

    @Override
    public void a() {
        this.a = false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2, int n2, B b10, n n3, List<u> list, Random random) {
        int n4;
        B b11;
        ae ae2;
        block15: {
            int n5;
            String[] arrstring;
            block13: {
                block14: {
                    block10: {
                        ae2 = b10.g.g();
                        arrstring = u.b();
                        int n6 = random.nextInt(4) + 1;
                        b11 = t.b(list, t.b(j2, b10, new n(0, 0, -4), "bridge_piece", ae2, true));
                        b11.c = -1;
                        n4 = 0;
                        for (int i2 = 0; i2 < n6; ++i2) {
                            block12: {
                                block11: {
                                    boolean bl2;
                                    n5 = random.nextBoolean();
                                    if (arrstring == null) break block10;
                                    if (arrstring != null) {
                                        if (n5 != 0) {
                                            b11 = t.b(list, t.b(j2, b11, new n(0, n4, -4), "bridge_piece", ae2, true));
                                            n4 = 0;
                                            if (arrstring != null) continue;
                                        }
                                        bl2 = random.nextBoolean();
                                    }
                                    if (!bl2) break block11;
                                    b11 = t.b(list, t.b(j2, b11, new n(0, n4, -4), "bridge_steep_stairs", ae2, true));
                                    if (arrstring != null) break block12;
                                }
                                b11 = t.b(list, t.b(j2, b11, new n(0, n4, -8), "bridge_gentle_stairs", ae2, true));
                            }
                            n4 = 4;
                            if (arrstring != null) continue;
                        }
                        n5 = this.a;
                    }
                    if (arrstring == null) break block13;
                    if (n5 != 0) break block14;
                    n5 = random.nextInt(10 - n2);
                    if (arrstring == null) break block13;
                    if (n5 != 0) break block14;
                    t.b(list, t.b(j2, b11, new n(-8 + random.nextInt(8), n4, -70 + random.nextInt(10)), "ship", ae2, true));
                    this.a = true;
                    if (arrstring != null) break block15;
                }
                n5 = t.b(j2, t.e(), n2 + 1, b11, new n(-3, n4 + 1, -11), list, random) ? 1 : 0;
            }
            if (arrstring == null) return n5 != 0;
            if (n5 == 0) {
                return false;
            }
        }
        b11 = t.b(list, t.b(j2, b11, new n(4, n4, 0), "bridge_end", ae2.a(ae.CLOCKWISE_180), true));
        b11.c = -1;
        return 1 != 0;
    }
}

