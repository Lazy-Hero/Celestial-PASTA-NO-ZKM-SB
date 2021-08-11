/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.N.O;
import net.minecraft.N.y;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class T
extends a {
    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block27: {
            int n3;
            boolean bl3;
            block28: {
                int n4;
                int n5;
                block26: {
                    i i2 = z2.d(n2);
                    bl3 = a.d();
                    do {
                        i i3;
                        if (i2.o() != c.A) {
                            i3 = i2;
                            if (bl3) continue;
                            if (i3.o() != c.J) break;
                        }
                        n5 = n2.b();
                        n4 = 1;
                        if (bl3) break block26;
                        if (n5 <= n4) break;
                        n2 = n2.k();
                        i3 = i2 = z2.d(n2);
                    } while (!bl3);
                    n5 = n2.b();
                    if (bl3) break block28;
                    n4 = 1;
                }
                if (n5 < n4) {
                    return false;
                }
                n2 = n2.a();
                n5 = n3 = 0;
            }
            while (n3 < 4) {
                block29: {
                    block30: {
                        boolean bl4;
                        block40: {
                            block41: {
                                n n6;
                                block38: {
                                    block39: {
                                        n n7;
                                        block36: {
                                            block37: {
                                                n n8;
                                                block34: {
                                                    block35: {
                                                        n n9;
                                                        block33: {
                                                            y y2;
                                                            block32: {
                                                                y y3;
                                                                block31: {
                                                                    n9 = n2.a(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
                                                                    if (bl3) break block29;
                                                                    bl2 = z2.a(n9);
                                                                    if (bl3) break block27;
                                                                    if (!bl2) break block30;
                                                                    boolean bl5 = z2.d(n9.k()).d();
                                                                    if (bl3) break block31;
                                                                    if (!bl5) break block30;
                                                                    bl5 = z2.a(n9, g.cd.d(), 2);
                                                                }
                                                                y2 = y3 = z2.b(n9);
                                                                if (bl3) break block32;
                                                                if (!(y2 instanceof O)) break block33;
                                                                y2 = y3;
                                                            }
                                                            ((O)y2).a(j.e, random.nextLong());
                                                        }
                                                        n8 = n9.m();
                                                        n n10 = n9.b();
                                                        n7 = n9.i();
                                                        n6 = n9.j();
                                                        bl4 = z2.a(n10);
                                                        if (bl3) break block34;
                                                        if (!bl4) break block35;
                                                        bl4 = z2.d(n10.k()).d();
                                                        if (bl3) break block34;
                                                        if (bl4) {
                                                            z2.a(n10, g.h.d(), 2);
                                                        }
                                                    }
                                                    bl4 = z2.a(n8);
                                                }
                                                if (bl3) break block36;
                                                if (!bl4) break block37;
                                                bl4 = z2.d(n8.k()).d();
                                                if (bl3) break block36;
                                                if (bl4) {
                                                    z2.a(n8, g.h.d(), 2);
                                                }
                                            }
                                            bl4 = z2.a(n7);
                                        }
                                        if (bl3) break block38;
                                        if (!bl4) break block39;
                                        bl4 = z2.d(n7.k()).d();
                                        if (bl3) break block38;
                                        if (bl4) {
                                            z2.a(n7, g.h.d(), 2);
                                        }
                                    }
                                    bl4 = z2.a(n6);
                                }
                                if (bl3) break block40;
                                if (!bl4) break block41;
                                bl4 = z2.d(n6.k()).d();
                                if (bl3) break block40;
                                if (bl4) {
                                    z2.a(n6, g.h.d(), 2);
                                }
                            }
                            bl4 = true;
                        }
                        return bl4;
                    }
                    ++n3;
                }
                if (!bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

