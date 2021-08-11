/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class S
extends I {
    private /* synthetic */ int g;

    public S() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.g = r2.m("Seed");
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("Seed", this.g);
    }

    public S(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
        this.g = random.nextInt();
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block11: {
            int n3;
            int n4;
            String[] arrstring;
            Random random2;
            block10: {
                block8: {
                    int n5;
                    random2 = new Random(this.g);
                    arrstring = u.b();
                    int n6 = 0;
                    while (n6 <= 4) {
                        block9: {
                            n5 = 3;
                            if (arrstring == null) break block8;
                            for (n4 = v477231; n4 <= 4; ++n4) {
                                n3 = random2.nextInt(8);
                                this.a(z2, b10, n6, n4, 0, n6, n4, n3, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block9;
                            }
                            ++n6;
                        }
                        if (arrstring != null) continue;
                    }
                    n6 = random2.nextInt(8);
                    this.a(z2, b10, 0, 5, 0, 0, 5, n6, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    n6 = random2.nextInt(8);
                    this.a(z2, b10, 4, 5, 0, 4, 5, n6, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    n5 = n4 = 0;
                }
                while (n4 <= 4) {
                    n3 = random2.nextInt(5);
                    this.a(z2, b10, n4, 2, 0, n4, 2, n3, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    ++n4;
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block10;
                }
                n4 = 0;
            }
            while (n4 <= 4) {
                block12: {
                    n2 = 0;
                    if (arrstring == null) break block11;
                    for (n3 = v477280; n3 <= 1; ++n3) {
                        int n7 = random2.nextInt(3);
                        this.a(z2, b10, n4, n3, 0, n4, n3, n7, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block12;
                    }
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public static S a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -3, 0, 5, 10, 8, aA2);
        return S.a(b10) && u.a(list, b10) == null ? new S(n5, random, b10, aA2) : null;
    }
}

