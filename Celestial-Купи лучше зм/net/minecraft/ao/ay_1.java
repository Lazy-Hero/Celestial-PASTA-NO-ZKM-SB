/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.W.cG;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.ai;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class ay
extends aH {
    public ay() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block6: {
            String[] arrstring = u.b();
            ay ay2 = this;
            z z3 = z2;
            b b11 = b10;
            if (arrstring != null) {
                if (ay2.a(z3, b11)) {
                    return false;
                }
                ay2 = this;
                z3 = z2;
                b11 = b10;
            }
            ay2.a(z3, b11, 0, 0, 0, 4, 10, 7, true, random, b7.b());
            this.a(z2, random, b10, this.g, 1, 7, 0);
            this.a(z2, random, b10, ai.OPENING, 1, 1, 7);
            i i2 = net.minecraft.u.g.a0.d().a(cG.V, aA.SOUTH);
            int n3 = 0;
            while (n3 < 6) {
                this.a(z2, i2, 1, 6 - n3, 1 + n3, b10);
                this.a(z2, i2, 2, 6 - n3, 1 + n3, b10);
                this.a(z2, i2, 3, 6 - n3, 1 + n3, b10);
                if (arrstring != null) {
                    n2 = n3;
                    if (arrstring == null) break block6;
                    if (n2 < 5) {
                        this.a(z2, net.minecraft.u.g.ay.d(), 1, 5 - n3, 1 + n3, b10);
                        this.a(z2, net.minecraft.u.g.ay.d(), 2, 5 - n3, 1 + n3, b10);
                        this.a(z2, net.minecraft.u.g.ay.d(), 3, 5 - n3, 1 + n3, b10);
                    }
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public ay(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.a((aV)u2, list, random, 1, 1);
    }

    public static ay a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -7, 0, 5, 11, 8, aA2);
        return ay.a(b10) && u.a(list, b10) == null ? new ay(n5, random, b10, aA2) : null;
    }
}

