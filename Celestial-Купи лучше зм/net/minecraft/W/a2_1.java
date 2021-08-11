/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a2
extends k {
    private final /* synthetic */ K t;
    private final /* synthetic */ K s;

    public a2(K k2, K k3) {
        this.t = k2;
        this.s = k3;
        this.a(net.minecraft.ad.a.m);
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block4: {
            block7: {
                boolean bl2;
                d d10;
                block6: {
                    n n3;
                    z z3;
                    int n4;
                    block5: {
                        d10 = j2.c(a32);
                        n4 = bl.g();
                        if (aA2 != aA.UP || !j2.a(n2.a(aA2), aA2, d10)) break block4;
                        z3 = z2;
                        n3 = n2;
                        if (n4 == 0) break block5;
                        if (z3.d(n3).b() != this.s) break block4;
                        z3 = z2;
                        n3 = n2.a();
                    }
                    bl2 = z3.a(n3);
                    if (n4 == 0) break block6;
                    if (!bl2) break block4;
                    z2.a(n2.a(), this.t.d());
                    if (n4 == 0) break block7;
                    bl2 = j2 instanceof net.minecraft.i.k;
                }
                if (bl2) {
                    a6.s.a((net.minecraft.i.k)j2, n2.a(), d10);
                }
                d10.b(1);
            }
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

