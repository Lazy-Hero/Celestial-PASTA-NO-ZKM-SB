/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.U.e;
import net.minecraft.ag.A;
import net.minecraft.ag.a1;
import net.minecraft.ag.b;
import net.minecraft.ax.T;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.y.a;

class y
implements a1 {
    public /* synthetic */ b b;
    public /* synthetic */ d a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(e e10, a a10, Random random) {
        int n2;
        block3: {
            b b10;
            block2: {
                n2 = 1;
                String[] arrstring = A.b();
                b10 = this.b;
                if (arrstring == null) break block2;
                if (b10 == null) break block3;
                b10 = this.b;
            }
            n2 = b10.a(random);
        }
        d d10 = new d(h.aO, n2, 0);
        d d11 = T.a(random, new d(this.a.w(), 1, this.a.d()), 5 + random.nextInt(15), false);
        a10.add(new net.minecraft.y.b(d10, d11));
    }

    public y(k k2, b b10) {
        this.a = new d(k2);
        this.b = b10;
    }
}

