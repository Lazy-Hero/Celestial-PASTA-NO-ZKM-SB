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

final class f
implements g {
    f() {
    }

    @Override
    public boolean a(j j2, int n2, B b10, n n3, List<u> list, Random random) {
        int n4;
        block14: {
            block11: {
                int n5;
                B b11;
                ae ae2;
                block12: {
                    int n6;
                    String[] arrstring;
                    block13: {
                        block9: {
                            block10: {
                                block8: {
                                    int n7;
                                    block7: {
                                        arrstring = u.b();
                                        n7 = n2;
                                        if (arrstring == null) break block7;
                                        if (n7 <= 8) break block8;
                                        n7 = 0;
                                    }
                                    return n7 != 0;
                                }
                                ae2 = b10.g.g();
                                b11 = t.b(list, t.b(j2, b10, n3, "base_floor", ae2, true));
                                n4 = n6 = random.nextInt(3);
                                if (arrstring == null) break block9;
                                if (n4 != 0) break block10;
                                t.b(list, t.b(j2, b11, new n(-1, 4, -1), "base_roof", ae2, true));
                                if (arrstring != null) break block11;
                            }
                            n4 = n6;
                        }
                        n5 = 1;
                        if (arrstring == null) break block12;
                        if (n4 != n5) break block13;
                        b11 = t.b(list, t.b(j2, b11, new n(-1, 0, -1), "second_floor_2", ae2, false));
                        b11 = t.b(list, t.b(j2, b11, new n(-1, 8, -1), "second_roof", ae2, false));
                        t.b(j2, t.i(), n2 + 1, b11, null, list, random);
                        if (arrstring != null) break block11;
                    }
                    n4 = n6;
                    if (arrstring == null) break block14;
                    n5 = 2;
                }
                if (n4 == n5) {
                    b11 = t.b(list, t.b(j2, b11, new n(-1, 0, -1), "second_floor_2", ae2, false));
                    b11 = t.b(list, t.b(j2, b11, new n(-1, 4, -1), "third_floor_c", ae2, false));
                    b11 = t.b(list, t.b(j2, b11, new n(-1, 8, -1), "third_roof", ae2, true));
                    t.b(j2, t.i(), n2 + 1, b11, null, list, random);
                }
            }
            n4 = 1;
        }
        return n4 != 0;
    }

    @Override
    public void a() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

