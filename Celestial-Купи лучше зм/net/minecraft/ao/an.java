/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class an
extends aH {
    public static an a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -1, 0, 5, 5, 5, aA2);
        return an.a(b10) && u.a(list, b10) == null ? new an(n5, random, b10, aA2) : null;
    }

    public an(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        block4: {
            block3: {
                aA aA2;
                aA aA3;
                String[] arrstring;
                block2: {
                    aA aA4;
                    arrstring = u.b();
                    an an2 = this;
                    z z3 = z2;
                    b b11 = b10;
                    if (arrstring != null) {
                        if (an2.a(z3, b11)) {
                            return false;
                        }
                        an2 = this;
                        z3 = z2;
                        b11 = b10;
                    }
                    an2.a(z3, b11, 0, 0, 0, 4, 4, 4, true, random, b7.b());
                    this.a(z2, random, b10, this.g, 1, 1, 0);
                    aA3 = aA4 = this.e();
                    aA2 = aA.NORTH;
                    if (arrstring == null) break block2;
                    if (aA3 == aA2) break block3;
                    aA3 = aA4;
                    aA2 = aA.EAST;
                }
                if (aA3 == aA2) break block3;
                this.a(z2, b10, 4, 1, 1, 4, 3, 3, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                if (arrstring != null) break block4;
            }
            this.a(z2, b10, 0, 1, 1, 0, 3, 3, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
        }
        return true;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        block2: {
            block1: {
                aA aA2;
                aA aA3;
                String[] arrstring;
                block0: {
                    aA aA4 = this.e();
                    arrstring = u.b();
                    aA3 = aA4;
                    aA2 = aA.NORTH;
                    if (arrstring == null) break block0;
                    if (aA3 == aA2) break block1;
                    aA3 = aA4;
                    aA2 = aA.EAST;
                }
                if (aA3 == aA2) break block1;
                this.b((aV)u2, list, random, 1, 1);
                if (arrstring != null) break block2;
            }
            this.c((aV)u2, list, random, 1, 1);
        }
    }

    public an() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

