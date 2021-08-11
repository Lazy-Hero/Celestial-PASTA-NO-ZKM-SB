/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.a2;
import net.minecraft.ao.a4;
import net.minecraft.ao.b;
import net.minecraft.ao.h;
import net.minecraft.ao.u;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.u.g;

public class a5
extends a2 {
    @Override
    public void a(u u2, List<u> list, Random random) {
        net.minecraft.ao.h.a((a4)u2, list, random, this.e.c - 1, this.e.b - 4, this.e.f + 1, aA.WEST, this.d());
        net.minecraft.ao.h.a((a4)u2, list, random, this.e.a + 1, this.e.b - 4, this.e.f + 1, aA.EAST, this.d());
        net.minecraft.ao.h.a((a4)u2, list, random, this.e.c + 1, this.e.b - 4, this.e.f - 1, aA.NORTH, this.d());
        net.minecraft.ao.h.a((a4)u2, list, random, this.e.c + 1, this.e.b - 4, this.e.d + 1, aA.SOUTH, this.d());
    }

    public a5(a4 a42, int n2, Random random, int n3, int n4) {
        block4: {
            block2: {
                a5 a52;
                block3: {
                    String[] arrstring = u.b();
                    super(a42, n2);
                    String[] arrstring2 = arrstring;
                    this.a(av.HORIZONTAL.a(random));
                    a52 = this;
                    if (arrstring2 == null) break block2;
                    if (a52.e().g() != Q.Z) break block3;
                    this.e = new b(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
                    if (arrstring2 != null) break block4;
                }
                a52 = this;
            }
            a52.e = new b(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
        }
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        char n2;
        block10: {
            String[] arrstring = u.b();
            a5 a52 = this;
            if (arrstring != null) {
                if (a52.i < 0) {
                    this.i = this.a(z2, b10);
                    a5 a53 = this;
                    if (arrstring != null) {
                        if (a53.i < 0) {
                            return true;
                        }
                        a53 = this;
                    }
                    a53.e.a(0, this.i - this.e.b + 3, 0);
                }
                a52 = this;
            }
            i i2 = a52.a(g.cW.d());
            i i3 = this.a(g.bt.d());
            this.a(z2, b10, 1, 0, 1, 4, 12, 4, i2, g.cL.d(), false);
            this.a(z2, g.bf.d(), 2, 12, 2, b10);
            this.a(z2, g.bf.d(), 3, 12, 2, b10);
            this.a(z2, g.bf.d(), 2, 12, 3, b10);
            this.a(z2, g.bf.d(), 3, 12, 3, b10);
            this.a(z2, i3, 1, 13, 1, b10);
            this.a(z2, i3, 1, 14, 1, b10);
            this.a(z2, i3, 4, 13, 1, b10);
            this.a(z2, i3, 4, 14, 1, b10);
            this.a(z2, i3, 1, 13, 4, b10);
            this.a(z2, i3, 1, 14, 4, b10);
            this.a(z2, i3, 4, 13, 4, b10);
            this.a(z2, i3, 4, 14, 4, b10);
            this.a(z2, b10, 1, 15, 1, 4, 15, 4, i2, i2, false);
            char n3 = '\u0000';
            block0: while (true) {
                char n4 = n3;
                block1: while (n4 <= '\u0005') {
                    n2 = '\u0000';
                    if (arrstring == null) break block10;
                    for (char i4 = v126689; i4 <= '\u0005'; ++i4) {
                        block12: {
                            char n5;
                            block14: {
                                block13: {
                                    block11: {
                                        n4 = i4;
                                        if (arrstring == null) continue block1;
                                        if (arrstring == null) break block11;
                                        if (n4 == '\u0000') break block12;
                                        n5 = i4;
                                    }
                                    if (arrstring == null) break block13;
                                    if (n5 == 5) break block12;
                                    n5 = n3;
                                }
                                if (arrstring == null) break block14;
                                if (n5 == '\u0000') break block12;
                                n5 = n3;
                            }
                            if (n5 != 5) continue;
                        }
                        this.a(z2, i2, i4, 11, n3, b10);
                        this.a(z2, i4, 12, n3, b10);
                        if (arrstring != null) continue;
                    }
                    ++n3;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            n2 = '\u0001';
        }
        return n2 != '\u0000';
    }

    public a5() {
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

