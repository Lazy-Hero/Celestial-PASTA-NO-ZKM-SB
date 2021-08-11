/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.U.e;
import net.minecraft.ag.A;
import net.minecraft.ag.a1;
import net.minecraft.ar.v;
import net.minecraft.ax.f;
import net.minecraft.ax.u;
import net.minecraft.k.h;
import net.minecraft.w.S;
import net.minecraft.w.d;
import net.minecraft.y.a;
import net.minecraft.y.b;

class g
implements a1 {
    @Override
    public void a(e e10, a a10, Random random) {
        u u2 = u.e.a((v)((Object)random));
        int n2 = h.a(random, u2.g(), u2.f());
        String[] arrstring = A.b();
        d d10 = S.a(new f(u2, n2));
        int n3 = 2 + random.nextInt(5 + n2 * 10) + 3 * n2;
        int n4 = u2.e();
        if (arrstring != null) {
            if (n4 != 0) {
                n3 *= 2;
            }
            n4 = n3;
        }
        if (arrstring != null) {
            if (n4 > 64) {
                n3 = 64;
            }
            n4 = a10.add(new b(new d(net.minecraft.u.h.b8), new d(net.minecraft.u.h.aO, n3), d10)) ? 1 : 0;
        }
    }

    g() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

