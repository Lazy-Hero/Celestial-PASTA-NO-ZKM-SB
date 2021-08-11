/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class ay
extends k {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block5: {
            block8: {
                boolean bl2;
                d d10;
                n n3;
                block7: {
                    int n4;
                    block6: {
                        block4: {
                            boolean bl3 = z2.d(n2).b().b((t)z2, n2);
                            n4 = bl.g();
                            n3 = bl3 ? n2 : n2.a(aA2);
                            d10 = j2.c(a32);
                            bl2 = j2.a(n3, aA2, d10);
                            if (n4 == 0) break block4;
                            if (!bl2) break block5;
                            bl2 = z2.a(z2.d(n3).b(), n3, false, aA2, null);
                        }
                        if (n4 == 0) break block6;
                        if (!bl2) break block5;
                        bl2 = g.bK.a(z2, n3);
                    }
                    if (n4 == 0) break block7;
                    if (!bl2) break block5;
                    z2.a(n3, g.bK.d());
                    if (n4 == 0) break block8;
                    bl2 = j2 instanceof net.minecraft.i.k;
                }
                if (bl2) {
                    a6.s.a((net.minecraft.i.k)j2, n3, d10);
                }
                d10.b(1);
            }
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }

    public ay() {
        this.a(net.minecraft.ad.a.p);
    }
}

