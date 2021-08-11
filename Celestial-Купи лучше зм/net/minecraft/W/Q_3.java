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
import net.minecraft.z.s;

public class Q
extends k {
    private static gP a(gP gP2) {
        return gP2;
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
                z2.a(null, j2.a, j2.aF, j2.ax, E.v, ay.PLAYERS, 0.5f, 0.4f / (r.nextFloat() * 0.4f + 0.8f));
                if (n2 == 0) break block6;
                bl2 = z2.C;
            }
            if (!bl2) {
                s s2 = new s(z2, j2);
                s2.a(j2, j2.at, j2.e, 0.0f, 1.5f, 1.0f);
                z2.f(s2);
            }
            j2.b(m.b(this));
        }
        return new t<d>(aX.SUCCESS, d10);
    }

    public Q() {
        this.f = 16;
        this.a(net.minecraft.ad.a.m);
    }
}

