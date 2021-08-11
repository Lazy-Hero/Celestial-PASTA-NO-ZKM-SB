/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.u.h;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class J
extends k {
    @Override
    public bE b(d d10) {
        return bE.DRINK;
    }

    public J() {
        this.b(1);
        this.a(net.minecraft.ad.a.n);
    }

    @Override
    public d a(d d10, z z2, B b10) {
        d d11;
        block13: {
            boolean bl2;
            block12: {
                int n2;
                block10: {
                    block11: {
                        n2 = bl.g();
                        bl2 = b10 instanceof net.minecraft.i.k;
                        if (n2 != 0) {
                            if (bl2) {
                                net.minecraft.i.k k2 = (net.minecraft.i.k)b10;
                                a6.C.a(k2, d10);
                                k2.b(m.b(this));
                            }
                            bl2 = b10 instanceof j;
                        }
                        if (n2 == 0) break block10;
                        if (!bl2) break block11;
                        bl2 = ((j)b10).cw.g;
                        if (n2 == 0) break block10;
                        if (!bl2) {
                            d10.b(1);
                        }
                    }
                    bl2 = z2.C;
                }
                if (n2 == 0) break block12;
                if (!bl2) {
                    b10.au();
                }
                d11 = d10;
                if (n2 == 0) break block13;
                bl2 = d11.G();
            }
            d11 = bl2 ? new d(net.minecraft.u.h.P) : d10;
        }
        return d11;
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        j2.a(a32);
        return new t<d>(aX.SUCCESS, j2.c(a32));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int g(d d10) {
        return 32;
    }
}

