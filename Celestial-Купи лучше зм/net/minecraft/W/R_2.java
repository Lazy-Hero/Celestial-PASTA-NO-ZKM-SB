/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.B.X;
import net.minecraft.U.C;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.u.h;
import net.minecraft.w.ac;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.w.m;

public class R
extends k {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(d d10, d d11) {
        return d11.w() == net.minecraft.u.h.aQ;
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10;
        block3: {
            d d11;
            block2: {
                d d12;
                d10 = j2.c(a32);
                int n2 = bl.g();
                X x2 = C.a(d10);
                d11 = d12 = j2.b(x2);
                if (n2 == 0) break block2;
                if (!d11.G()) break block3;
                j2.a(x2, d10.C());
                d11 = d10;
            }
            d11.c(0);
            return new t<d>(aX.SUCCESS, d10);
        }
        return new t<d>(aX.FAIL, d10);
    }

    public static boolean a(d d10) {
        int n2 = bl.c();
        int n3 = d10.u();
        if (n2 == 0) {
            n3 = n3 < d10.E() - 1 ? 1 : 0;
        }
        return n3 != 0;
    }

    public R() {
        this.f = 1;
        this.d(432);
        this.a(net.minecraft.ad.a.t);
        this.a(new v("broken"), new ac(this));
        net.minecraft.W.a3.B.a(this, m.w);
    }
}

