/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.R;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.u.g;

public class Q
extends I {
    public Q(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block8: {
            int n3;
            int n4;
            String[] arrstring;
            block6: {
                int n5;
                String[] arrstring2 = u.b();
                this.a(z2, b10, 7, 3, 0, 11, 4, 18, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 0, 3, 7, 18, 4, 11, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 8, 5, 0, 10, 7, 18, g.bf.d(), g.bf.d(), false);
                this.a(z2, b10, 0, 5, 8, 18, 7, 10, g.bf.d(), g.bf.d(), false);
                this.a(z2, b10, 7, 5, 0, 7, 5, 7, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 7, 5, 11, 7, 5, 18, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 11, 5, 0, 11, 5, 7, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 11, 5, 11, 11, 5, 18, g.dk.d(), g.dk.d(), false);
                arrstring = arrstring2;
                this.a(z2, b10, 0, 5, 7, 7, 5, 7, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 11, 5, 7, 18, 5, 7, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 0, 5, 11, 7, 5, 11, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 11, 5, 11, 18, 5, 11, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 7, 2, 0, 11, 2, 5, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 7, 2, 13, 11, 2, 18, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 7, 0, 0, 11, 1, 3, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 7, 0, 15, 11, 1, 18, g.dk.d(), g.dk.d(), false);
                n4 = 7;
                while (n4 <= 11) {
                    block7: {
                        n5 = 0;
                        if (arrstring == null) break block6;
                        for (n3 = v476945; n3 <= 2; ++n3) {
                            this.b(z2, g.dk.d(), n4, -1, n3, b10);
                            this.b(z2, g.dk.d(), n4, -1, 18 - n3, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block7;
                        }
                        ++n4;
                    }
                    if (arrstring != null) continue;
                }
                this.a(z2, b10, 0, 2, 7, 5, 2, 11, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 13, 2, 7, 18, 2, 11, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 0, 0, 7, 3, 1, 11, g.dk.d(), g.dk.d(), false);
                this.a(z2, b10, 15, 0, 7, 18, 1, 11, g.dk.d(), g.dk.d(), false);
                n5 = n4 = 0;
            }
            while (n4 <= 2) {
                block9: {
                    n2 = 7;
                    if (arrstring == null) break block8;
                    for (n3 = v476973; n3 <= 11; ++n3) {
                        this.b(z2, g.dk.d(), n4, -1, n3, b10);
                        this.b(z2, g.dk.d(), 18 - n4, -1, n3, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block9;
                    }
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    protected Q(Random random, int n2, int n3) {
        block4: {
            block2: {
                Q q2;
                block3: {
                    String[] arrstring = u.b();
                    super(0);
                    this.a(av.HORIZONTAL.a(random));
                    String[] arrstring2 = arrstring;
                    q2 = this;
                    if (arrstring2 == null) break block2;
                    if (q2.e().g() != net.minecraft.ar.Q.Z) break block3;
                    this.e = new b(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
                    if (arrstring2 != null) break block4;
                }
                q2 = this;
            }
            q2.e = new b(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
        }
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public static Q a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -8, -3, 0, 19, 10, 19, aA2);
        return Q.a(b10) && u.a(list, b10) == null ? new Q(n5, random, b10, aA2) : null;
    }

    public Q() {
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.b((R)u2, list, random, 8, 3, false);
        this.a((R)u2, list, random, 3, 8, false);
        this.c((R)u2, list, random, 3, 8, false);
    }
}

