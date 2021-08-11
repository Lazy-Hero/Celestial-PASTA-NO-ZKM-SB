/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.z.u;

public class a0
extends k {
    public a0() {
        this.f = 16;
        this.a(net.minecraft.ad.a.n);
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10;
        block6: {
            boolean bl2;
            block5: {
                d10 = j2.c(a32);
                int n2 = bl.g();
                bl2 = j2.cw.g;
                if (n2 == 0) break block5;
                if (!bl2) {
                    d10.b(1);
                }
                z2.a(null, j2.a, j2.aF, j2.ax, E.hH, ay.NEUTRAL, 0.5f, 0.4f / (r.nextFloat() * 0.4f + 0.8f));
                if (n2 == 0) break block6;
                bl2 = z2.C;
            }
            if (!bl2) {
                u u2 = new u(z2, j2);
                u2.a(j2, j2.at, j2.e, 0.0f, 1.5f, 1.0f);
                z2.f(u2);
            }
            j2.b(m.b(this));
        }
        return new t<d>(aX.SUCCESS, d10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

