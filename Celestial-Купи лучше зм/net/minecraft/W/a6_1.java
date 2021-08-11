/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.aw;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class a6
extends aw {
    private final /* synthetic */ K z;
    private final /* synthetic */ K A;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block2: {
            d d10;
            block4: {
                n n3;
                z z3;
                int n4;
                block3: {
                    d10 = j2.c(a32);
                    n4 = bl.c();
                    if (aA2 != aA.UP || !j2.a(n2.a(aA2), aA2, d10)) break block2;
                    z3 = z2;
                    n3 = n2;
                    if (n4 != 0) break block3;
                    if (z3.d(n3).b() != this.z) break block2;
                    z3 = z2;
                    n3 = n2.a();
                }
                boolean bl2 = z3.a(n3);
                if (n4 != 0) break block4;
                if (!bl2) break block2;
                bl2 = z2.a(n2.a(), this.A.d(), 11);
            }
            d10.b(1);
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }

    public a6(int n2, float f10, K k2, K k3) {
        super(n2, f10, false);
        this.A = k2;
        this.z = k3;
    }
}

