/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.a6;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a1
extends k {
    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        d d10;
        block6: {
            n n3;
            z z3;
            block5: {
                n2 = n2.a(aA2);
                int n4 = bl.g();
                d10 = j2.c(a32);
                if (!j2.a(n2, aA2, d10)) {
                    return aX.FAIL;
                }
                z3 = z2;
                n3 = n2;
                if (n4 == 0) break block5;
                if (z3.d(n3).o() != c.A) break block6;
                z2.a(j2, n2, E.fX, ay.BLOCKS, 1.0f, r.nextFloat() * 0.4f + 0.8f);
                z3 = z2;
                n3 = n2;
            }
            z3.a(n3, g.C.d(), 11);
        }
        if (j2 instanceof net.minecraft.i.k) {
            a6.s.a((net.minecraft.i.k)j2, n2, d10);
        }
        d10.a(1, (B)j2);
        return aX.SUCCESS;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a1() {
        this.f = 1;
        this.d(64);
        this.a(net.minecraft.ad.a.d);
    }
}

