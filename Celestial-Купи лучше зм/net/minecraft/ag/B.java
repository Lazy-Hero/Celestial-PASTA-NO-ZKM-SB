/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.h;
import net.minecraft.ag.A;
import net.minecraft.ag.W;
import net.minecraft.ar.v;
import net.minecraft.av.c;
import net.minecraft.av.e;
import net.minecraft.av.g;

final class B
implements g {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public r a(c c10, r r2, int n2) {
        r r3;
        block7: {
            boolean bl2;
            String[] arrstring;
            block6: {
                arrstring = A.b();
                bl2 = h.a(W.class).equals(new v(r2.j("id")));
                if (arrstring == null) break block6;
                if (!bl2) break block7;
                r3 = r2;
                if (arrstring == null) return r3;
                bl2 = r3.a("Offers", 10);
            }
            if (bl2) {
                r r4;
                r3 = r4 = r2.h("Offers");
                if (arrstring == null) return r3;
                if (r3.a("Recipes", 9)) {
                    u u2 = r4.c("Recipes", 10);
                    for (int i2 = 0; i2 < u2.b(); ++i2) {
                        r r5 = u2.d(i2);
                        e.b(c10, r5, n2, "buy");
                        e.b(c10, r5, n2, "buyB");
                        r3 = e.b(c10, r5, n2, "sell");
                        if (arrstring == null) return r3;
                        u2.a(i2, r5);
                        if (arrstring != null) continue;
                    }
                }
            }
        }
        r3 = r2;
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    B() {
    }
}

