/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.U.e;
import net.minecraft.ag.A;
import net.minecraft.ag.a1;
import net.minecraft.ag.b;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.y.a;

class i
implements a1 {
    public /* synthetic */ b b;
    public /* synthetic */ d a;

    public i(k k2, b b10) {
        this.a = new d(k2);
        this.b = b10;
    }

    public i(d d10, b b10) {
        this.a = d10;
        this.b = b10;
    }

    @Override
    public void a(e e10, a a10, Random random) {
        d d10;
        d d11;
        block7: {
            int n2;
            block6: {
                String[] arrstring;
                block5: {
                    b b10;
                    block4: {
                        n2 = 1;
                        arrstring = A.b();
                        b10 = this.b;
                        if (arrstring == null) break block4;
                        if (b10 == null) break block5;
                        b10 = this.b;
                    }
                    n2 = b10.a(random);
                }
                if (n2 >= 0) break block6;
                d11 = new d(h.aO);
                d10 = new d(this.a.w(), -n2, this.a.d());
                if (arrstring != null) break block7;
            }
            d11 = new d(h.aO, n2, 0);
            d10 = new d(this.a.w(), 1, this.a.d());
        }
        a10.add(new net.minecraft.y.b(d11, d10));
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

