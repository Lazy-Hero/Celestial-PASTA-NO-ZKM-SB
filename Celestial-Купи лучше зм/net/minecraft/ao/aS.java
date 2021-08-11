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
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;
import net.minecraft.w.bl;

public class aS
extends a2 {
    public aS() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        String[] arrstring = u.b();
        aS aS2 = this;
        if (arrstring != null) {
            if (aS2.i < 0) {
                this.i = this.a(z2, b10);
                aS aS3 = this;
                if (arrstring != null) {
                    if (aS3.i < 0) {
                        return true;
                    }
                    aS3 = this;
                }
                aS3.e.a(0, this.i - this.e.b + 4 - 1, 0);
            }
            aS2 = this;
        }
        i i2 = aS2.a(g.bt.d());
        this.a(z2, b10, 0, 0, 0, 2, 3, 1, g.bf.d(), g.bf.d(), false);
        this.a(z2, i2, 1, 0, 0, b10);
        this.a(z2, i2, 1, 1, 0, b10);
        this.a(z2, i2, 1, 2, 0, b10);
        this.a(z2, g.s.c(bl.WHITE.a()), 1, 3, 0, b10);
        this.a(z2, aA.EAST, 2, 3, 0, b10);
        this.a(z2, aA.NORTH, 1, 3, 1, b10);
        this.a(z2, aA.WEST, 0, 3, 0, b10);
        this.a(z2, aA.SOUTH, 1, 3, -1, b10);
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static b a(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2) {
        b b10 = b.a(n2, n3, n4, 0, 0, 0, 3, 4, 2, aA2);
        return u.a(list, b10) != null ? null : b10;
    }

    public aS(a4 a42, int n2, Random random, b b10, aA aA2) {
        super(a42, n2);
        this.a(aA2);
        this.e = b10;
    }
}

