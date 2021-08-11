/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

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

public class X
extends k {
    private static gP a(gP gP2) {
        return gP2;
    }

    public X() {
        this.a(net.minecraft.ad.a.n);
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block8: {
            d d10;
            block7: {
                n n3;
                z z3;
                block6: {
                    int n4 = bl.c();
                    if (n4 == 0) {
                        if (z2.C) {
                            return aX.SUCCESS;
                        }
                        n2 = n2.a(aA2);
                    }
                    if (!j2.a(n2, aA2, d10 = j2.c(a32))) {
                        return aX.FAIL;
                    }
                    z3 = z2;
                    n3 = n2;
                    if (n4 != 0) break block6;
                    if (z3.d(n3).o() != c.A) break block7;
                    z2.a(null, n2, E.U, ay.BLOCKS, 1.0f, (r.nextFloat() - r.nextFloat()) * 0.2f + 1.0f);
                    z3 = z2;
                    n3 = n2;
                }
                z3.a(n3, g.C.d());
            }
            if (j2.cw.g) break block8;
            d10.b(1);
        }
        return aX.SUCCESS;
    }
}

