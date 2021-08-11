/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.w.aX;
import net.minecraft.w.an;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class aF
extends aX {
    protected aF() {
        this.a(net.minecraft.ad.a.n);
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        j j3;
        d d10;
        block6: {
            boolean bl2;
            d d11;
            block5: {
                d11 = an.a(z2, j2.a, j2.ax, (byte)0, true, false);
                d10 = j2.c(a32);
                int n2 = bl.c();
                d10.b(1);
                int n3 = n2;
                bl2 = d10.G();
                if (n3 != 0) break block5;
                if (bl2) {
                    return new t<d>(net.minecraft.ar.aX.SUCCESS, d11);
                }
                j3 = j2;
                if (n3 != 0) break block6;
                bl2 = j3.cB.b(d11.C());
            }
            if (!bl2) {
                j2.a(d11, false);
            }
            j3 = j2;
        }
        j3.b(m.b(this));
        return new t<d>(net.minecraft.ar.aX.SUCCESS, d10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

