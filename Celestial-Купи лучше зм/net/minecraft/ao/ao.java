/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.W.G;
import net.minecraft.W.aB;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class ao
extends aH {
    @Override
    public void a(u u2, List<u> list, Random random) {
        this.a((aV)u2, list, random, 1, 1);
    }

    public ao() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static ao a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -1, 0, 9, 5, 11, aA2);
        return ao.a(b10) && u.a(list, b10) == null ? new ao(n5, random, b10, aA2) : null;
    }

    public ao(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        String[] arrstring = u.b();
        ao ao2 = this;
        z z3 = z2;
        b b11 = b10;
        if (arrstring != null) {
            if (ao2.a(z3, b11)) {
                return false;
            }
            this.a(z2, b10, 0, 0, 0, 8, 4, 10, true, random, b7.b());
            this.a(z2, random, b10, this.g, 1, 1, 0);
            this.a(z2, b10, 1, 1, 10, 3, 3, 10, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            this.a(z2, b10, 4, 1, 1, 4, 3, 1, false, random, b7.b());
            this.a(z2, b10, 4, 1, 3, 4, 3, 3, false, random, b7.b());
            this.a(z2, b10, 4, 1, 7, 4, 3, 7, false, random, b7.b());
            this.a(z2, b10, 4, 1, 9, 4, 3, 9, false, random, b7.b());
            this.a(z2, b10, 4, 1, 4, 4, 3, 6, net.minecraft.u.g.dd.d(), net.minecraft.u.g.dd.d(), false);
            ao2 = this;
            z3 = z2;
            b11 = b10;
        }
        ao2.a(z3, b11, 5, 1, 5, 7, 3, 5, net.minecraft.u.g.dd.d(), net.minecraft.u.g.dd.d(), false);
        this.a(z2, net.minecraft.u.g.dd.d(), 4, 3, 2, b10);
        this.a(z2, net.minecraft.u.g.dd.d(), 4, 3, 8, b10);
        i i2 = net.minecraft.u.g.bL.d().a(aB.z, aA.WEST);
        i i3 = net.minecraft.u.g.bL.d().a(aB.z, aA.WEST).a(aB.D, G.UPPER);
        this.a(z2, i2, 4, 1, 2, b10);
        this.a(z2, i3, 4, 2, 2, b10);
        this.a(z2, i2, 4, 1, 8, b10);
        this.a(z2, i3, 4, 2, 8, b10);
        return true;
    }
}

