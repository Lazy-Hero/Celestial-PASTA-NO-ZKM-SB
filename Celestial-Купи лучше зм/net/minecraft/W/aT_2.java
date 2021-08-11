/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.K.k;
import net.minecraft.ab.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.w.ao;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class aT
extends ao {
    @Override
    public String h(d d10) {
        return net.minecraft.ab.a.a(k.d(d10).b("splash_potion.effect."));
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10 = j2.c(a32);
        int n2 = bl.c();
        d d11 = j2.cw.g ? d10.C() : d10.d(1);
        z2.a(null, j2.a, j2.aF, j2.ax, E.cU, ay.PLAYERS, 0.5f, 0.4f / (r.nextFloat() * 0.4f + 0.8f));
        if (n2 == 0) {
            if (!z2.C) {
                net.minecraft.z.t t2 = new net.minecraft.z.t(z2, j2, d11);
                t2.a(j2, j2.at, j2.e, -20.0f, 0.5f, 1.0f);
                z2.f(t2);
            }
            j2.b(m.b(this));
        }
        return new t<d>(aX.SUCCESS, d10);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

